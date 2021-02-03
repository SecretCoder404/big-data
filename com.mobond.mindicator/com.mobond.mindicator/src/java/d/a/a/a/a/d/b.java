/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.TreeSet
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package d.a.a.a.a.d;

import android.content.Context;
import d.a.a.a.a.b.i;
import d.a.a.a.a.b.k;
import d.a.a.a.a.d.c;
import d.a.a.a.a.d.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    protected final Context context;
    protected final k currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    protected final c eventStorage;
    protected volatile long lastRollOverTime;
    protected final List<d> rollOverListeners = new CopyOnWriteArrayList();
    protected final d.a.a.a.a.d.a<T> transform;

    public b(Context context, d.a.a.a.a.d.a<T> a2, k k2, c c2, int n2) {
        this.context = context.getApplicationContext();
        this.transform = a2;
        this.eventStorage = c2;
        this.currentTimeProvider = k2;
        this.lastRollOverTime = this.currentTimeProvider.a();
        this.defaultMaxFilesToKeep = n2;
    }

    private void rollFileOverIfNeeded(int n2) {
        if (!this.eventStorage.a(n2, this.getMaxByteSizePerFile())) {
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{this.eventStorage.a(), n2, this.getMaxByteSizePerFile()};
            String string = String.format((Locale)locale, (String)"session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", (Object[])arrobject);
            i.a(this.context, 4, "Fabric", string);
            this.rollFileOver();
        }
    }

    private void triggerRollOverOnListeners(String string) {
        for (d d2 : this.rollOverListeners) {
            try {
                d2.onRollOver(string);
            }
            catch (Exception exception) {
                i.a(this.context, "One of the roll over listeners threw an exception", exception);
            }
        }
    }

    public void deleteAllEventsFiles() {
        c c2 = this.eventStorage;
        c2.a(c2.c());
        this.eventStorage.d();
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> list = this.eventStorage.c();
        int n2 = this.getMaxFilesToKeep();
        if (list.size() <= n2) {
            return;
        }
        int n3 = list.size() - n2;
        Context context = this.context;
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{list.size(), n2, n3};
        i.a(context, String.format((Locale)locale, (String)"Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", (Object[])arrobject));
        TreeSet treeSet = new TreeSet((Comparator)new Comparator<a>(){

            public int a(a a2, a a3) {
                return (int)(a2.b - a3.b);
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((a)object, (a)object2);
            }
        });
        for (File file : list) {
            treeSet.add((Object)new a(file, this.parseCreationTimestampFromFileName(file.getName())));
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((a)iterator.next()).a);
            if (arrayList.size() != n3) continue;
        }
        this.eventStorage.a((List<File>)arrayList);
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.a(list);
    }

    protected abstract String generateUniqueRollOverFileName();

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.a(1);
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    protected int getMaxByteSizePerFile() {
        return 8000;
    }

    protected int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long parseCreationTimestampFromFileName(String string) {
        String[] arrstring = string.split("_");
        if (arrstring.length != 3) {
            return 0L;
        }
        try {
            long l2 = Long.valueOf((String)arrstring[2]);
            return l2;
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    public void registerRollOverListener(d d2) {
        if (d2 != null) {
            this.rollOverListeners.add((Object)d2);
        }
    }

    public boolean rollFileOver() {
        String string;
        boolean bl = this.eventStorage.b();
        int n2 = 1;
        if (!bl) {
            string = this.generateUniqueRollOverFileName();
            this.eventStorage.a(string);
            Context context = this.context;
            Locale locale = Locale.US;
            Object[] arrobject = new Object[n2];
            arrobject[0] = string;
            i.a(context, 4, "Fabric", String.format((Locale)locale, (String)"generated new file %s", (Object[])arrobject));
            this.lastRollOverTime = this.currentTimeProvider.a();
        } else {
            string = null;
            n2 = 0;
        }
        this.triggerRollOverOnListeners(string);
        return (boolean)n2;
    }

    public void writeEvent(T t2) {
        byte[] arrby = this.transform.toBytes(t2);
        this.rollFileOverIfNeeded(arrby.length);
        this.eventStorage.a(arrby);
    }

    static class a {
        final File a;
        final long b;

        public a(File file, long l2) {
            this.a = file;
            this.b = l2;
        }
    }

}

