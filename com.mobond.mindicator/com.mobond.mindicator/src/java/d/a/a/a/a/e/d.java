/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.a.a.a.e.d$1
 *  java.io.BufferedInputStream
 *  java.io.BufferedOutputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.Closeable
 *  java.io.File
 *  java.io.Flushable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.InetSocketAddress
 *  java.net.MalformedURLException
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  java.net.SocketAddress
 *  java.net.URI
 *  java.net.URISyntaxException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.nio.ByteBuffer
 *  java.nio.CharBuffer
 *  java.nio.charset.Charset
 *  java.nio.charset.CharsetEncoder
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Callable
 *  java.util.zip.GZIPInputStream
 */
package d.a.a.a.a.e;

import d.a.a.a.a.e.d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public class d {
    private static final String[] b = new String[0];
    private static b c = b.a;
    public final URL a;
    private HttpURLConnection d = null;
    private final String e;
    private e f;
    private boolean g;
    private boolean h = true;
    private boolean i = false;
    private int j = 8192;
    private String k;
    private int l;

    public d(CharSequence charSequence, String string) {
        try {
            this.a = new URL(charSequence.toString());
        }
        catch (MalformedURLException malformedURLException) {
            throw new c((IOException)((Object)malformedURLException));
        }
        this.e = string;
    }

    static /* synthetic */ int a(d d2) {
        return d2.j;
    }

    public static d a(CharSequence charSequence, Map<?, ?> map, boolean bl) {
        String string = d.a(charSequence, map);
        if (bl) {
            string = d.a(string);
        }
        return d.b(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(CharSequence charSequence) {
        String string2;
        URL uRL;
        try {
            uRL = new URL(charSequence.toString());
        }
        catch (IOException iOException) {
            throw new c(iOException);
        }
        String string3 = uRL.getHost();
        int n3 = uRL.getPort();
        if (n3 != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append(':');
            stringBuilder.append(Integer.toString((int)n3));
            string2 = stringBuilder.toString();
        } else {
            string2 = string3;
        }
        try {
            URI uRI = new URI(uRL.getProtocol(), string2, uRL.getPath(), uRL.getQuery(), null);
            String string = uRI.toASCIIString();
            int n2 = string.indexOf(63);
            if (n2 <= 0) return string;
            int n4 = n2 + 1;
            if (n4 >= string.length()) return string;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.substring(0, n4));
            stringBuilder.append(string.substring(n4).replace((CharSequence)"+", (CharSequence)"%2B"));
            return stringBuilder.toString();
        }
        catch (URISyntaxException uRISyntaxException) {
            iOException = new IOException("Parsing URI failed");
            iOException.initCause((Throwable)uRISyntaxException);
            throw new c(iOException);
        }
    }

    public static String a(CharSequence charSequence, Map<?, ?> map) {
        String string = charSequence.toString();
        if (map != null) {
            if (map.isEmpty()) {
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder(string);
            d.a(string, stringBuilder);
            d.b(string, stringBuilder);
            Iterator iterator = map.entrySet().iterator();
            Map.Entry entry = (Map.Entry)iterator.next();
            stringBuilder.append(entry.getKey().toString());
            stringBuilder.append('=');
            Object object = entry.getValue();
            if (object != null) {
                stringBuilder.append(object);
            }
            while (iterator.hasNext()) {
                stringBuilder.append('&');
                Map.Entry entry2 = (Map.Entry)iterator.next();
                stringBuilder.append(entry2.getKey().toString());
                stringBuilder.append('=');
                Object object2 = entry2.getValue();
                if (object2 == null) continue;
                stringBuilder.append(object2);
            }
            return stringBuilder.toString();
        }
        return string;
    }

    private static StringBuilder a(String string, StringBuilder stringBuilder) {
        if (2 + string.indexOf(58) == string.lastIndexOf(47)) {
            stringBuilder.append('/');
        }
        return stringBuilder;
    }

    public static d b(CharSequence charSequence) {
        return new d(charSequence, "GET");
    }

    public static d b(CharSequence charSequence, Map<?, ?> map, boolean bl) {
        String string = d.a(charSequence, map);
        if (bl) {
            string = d.a(string);
        }
        return d.c(string);
    }

    private static StringBuilder b(String string, StringBuilder stringBuilder) {
        int n2 = string.indexOf(63);
        int n3 = -1 + stringBuilder.length();
        if (n2 == -1) {
            stringBuilder.append('?');
            return stringBuilder;
        }
        if (n2 < n3 && string.charAt(n3) != '&') {
            stringBuilder.append('&');
        }
        return stringBuilder;
    }

    public static d c(CharSequence charSequence) {
        return new d(charSequence, "POST");
    }

    public static d d(CharSequence charSequence) {
        return new d(charSequence, "PUT");
    }

    public static d e(CharSequence charSequence) {
        return new d(charSequence, "DELETE");
    }

    private static String f(String string) {
        if (string != null && string.length() > 0) {
            return string;
        }
        return "UTF-8";
    }

    private Proxy p() {
        return new Proxy(Proxy.Type.HTTP, (SocketAddress)new InetSocketAddress(this.k, this.l));
    }

    private HttpURLConnection q() {
        try {
            HttpURLConnection httpURLConnection = this.k != null ? c.a(this.a, this.p()) : c.a(this.a);
            httpURLConnection.setRequestMethod(this.e);
            return httpURLConnection;
        }
        catch (IOException iOException) {
            throw new c(iOException);
        }
    }

    public int a(String string, int n2) {
        this.k();
        return this.a().getHeaderFieldInt(string, n2);
    }

    public d a(int n2) {
        this.a().setConnectTimeout(n2);
        return this;
    }

    protected d a(InputStream inputStream, OutputStream outputStream) {
        1 var3_3 = new 1(this, (Closeable)inputStream, this.h, inputStream, outputStream);
        return (d)var3_3.call();
    }

    public d a(String string, Number number) {
        return this.a(string, null, number);
    }

    public d a(String string, String string2) {
        this.a().setRequestProperty(string, string2);
        return this;
    }

    public d a(String string, String string2, Number number) {
        String string3 = number != null ? number.toString() : null;
        return this.b(string, string2, string3);
    }

    protected d a(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("form-data; name=\"");
        stringBuilder.append(string);
        if (string2 != null) {
            stringBuilder.append("\"; filename=\"");
            stringBuilder.append(string2);
        }
        stringBuilder.append('\"');
        this.f("Content-Disposition", stringBuilder.toString());
        if (string3 != null) {
            this.f("Content-Type", string3);
        }
        return this.f("\r\n");
    }

    /*
     * Exception decompiling
     */
    public d a(String var1, String var2, String var3, File var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public d a(String string, String string2, String string3, InputStream inputStream) {
        try {
            this.m();
            this.a(string, string2, string3);
            this.a(inputStream, (OutputStream)this.f);
            return this;
        }
        catch (IOException iOException) {
            throw new c(iOException);
        }
    }

    public d a(String string, String string2, String string3, String string4) {
        try {
            this.m();
            this.a(string, string2, string3);
            this.f.a(string4);
            return this;
        }
        catch (IOException iOException) {
            throw new c(iOException);
        }
    }

    public d a(Map.Entry<String, String> entry) {
        return this.a((String)entry.getKey(), (String)entry.getValue());
    }

    public d a(boolean bl) {
        this.a().setUseCaches(bl);
        return this;
    }

    public String a(String string) {
        ByteArrayOutputStream byteArrayOutputStream = this.c();
        try {
            this.a((InputStream)this.e(), (OutputStream)byteArrayOutputStream);
            String string2 = byteArrayOutputStream.toString(d.f(string));
            return string2;
        }
        catch (IOException iOException) {
            throw new c(iOException);
        }
    }

    public HttpURLConnection a() {
        if (this.d == null) {
            this.d = this.q();
        }
        return this.d;
    }

    public int b() {
        try {
            this.j();
            int n2 = this.a().getResponseCode();
            return n2;
        }
        catch (IOException iOException) {
            throw new c(iOException);
        }
    }

    public d b(String string, String string2, String string3) {
        return this.a(string, string2, null, string3);
    }

    public String b(String string) {
        this.k();
        return this.a().getHeaderField(string);
    }

    public String b(String string, String string2) {
        return this.c(this.b(string), string2);
    }

    public int c(String string) {
        return this.a(string, -1);
    }

    protected ByteArrayOutputStream c() {
        int n2 = this.i();
        if (n2 > 0) {
            return new ByteArrayOutputStream(n2);
        }
        return new ByteArrayOutputStream();
    }

    protected String c(String string, String string2) {
        if (string != null) {
            if (string.length() == 0) {
                return null;
            }
            int n2 = string.length();
            int n3 = 1 + string.indexOf(59);
            if (n3 != 0) {
                if (n3 == n2) {
                    return null;
                }
                int n4 = string.indexOf(59, n3);
                if (n4 == -1) {
                    n4 = n2;
                }
                while (n3 < n4) {
                    String string3;
                    int n5;
                    int n6 = string.indexOf(61, n3);
                    if (n6 != -1 && n6 < n4 && string2.equals((Object)string.substring(n3, n6).trim()) && (n5 = (string3 = string.substring(n6 + 1, n4).trim()).length()) != 0) {
                        int n7;
                        if (n5 > 2 && '\"' == string3.charAt(0) && '\"' == string3.charAt(n7 = n5 - 1)) {
                            return string3.substring(1, n7);
                        }
                        return string3;
                    }
                    n3 = n4 + 1;
                    n4 = string.indexOf(59, n3);
                    if (n4 != -1) continue;
                    n4 = n2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public d d(String string) {
        return this.d(string, null);
    }

    public d d(String string, String string2) {
        if (string2 != null && string2.length() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("; charset=");
            stringBuilder.append(string2);
            return this.a("Content-Type", stringBuilder.toString());
        }
        return this.a("Content-Type", string);
    }

    public String d() {
        return this.a(this.g());
    }

    public d e(String string, String string2) {
        return this.b(string, null, string2);
    }

    public BufferedInputStream e() {
        return new BufferedInputStream(this.f(), this.j);
    }

    public d f(CharSequence charSequence) {
        try {
            this.l();
            this.f.a(charSequence.toString());
            return this;
        }
        catch (IOException iOException) {
            throw new c(iOException);
        }
    }

    public d f(String string, String string2) {
        return this.f(string).f(": ").f(string2).f("\r\n");
    }

    public InputStream f() {
        InputStream inputStream;
        if (this.b() < 400) {
            try {
                inputStream = this.a().getInputStream();
            }
            catch (IOException iOException) {
                throw new c(iOException);
            }
        }
        inputStream = this.a().getErrorStream();
        if (inputStream == null) {
            try {
                inputStream = this.a().getInputStream();
            }
            catch (IOException iOException) {
                throw new c(iOException);
            }
        }
        if (this.i) {
            if (!"gzip".equals((Object)this.h())) {
                return inputStream;
            }
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
                return gZIPInputStream;
            }
            catch (IOException iOException) {
                throw new c(iOException);
            }
        }
        return inputStream;
    }

    public String g() {
        return this.b("Content-Type", "charset");
    }

    public String h() {
        return this.b("Content-Encoding");
    }

    public int i() {
        return this.c("Content-Length");
    }

    /*
     * Exception decompiling
     */
    protected d j() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    protected d k() {
        try {
            d d2 = this.j();
            return d2;
        }
        catch (IOException iOException) {
            throw new c(iOException);
        }
    }

    protected d l() {
        if (this.f != null) {
            return this;
        }
        this.a().setDoOutput(true);
        String string = this.c(this.a().getRequestProperty("Content-Type"), "charset");
        this.f = new e(this.a().getOutputStream(), string, this.j);
        return this;
    }

    protected d m() {
        if (!this.g) {
            this.g = true;
            this.d("multipart/form-data; boundary=00content0boundary00").l();
            this.f.a("--00content0boundary00\r\n");
            return this;
        }
        this.f.a("\r\n--00content0boundary00\r\n");
        return this;
    }

    public URL n() {
        return this.a().getURL();
    }

    public String o() {
        return this.a().getRequestMethod();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o());
        stringBuilder.append(' ');
        stringBuilder.append((Object)this.n());
        return stringBuilder.toString();
    }

    protected static abstract class a<V>
    extends d<V> {
        private final Closeable a;
        private final boolean b;

        protected a(Closeable closeable, boolean bl) {
            this.a = closeable;
            this.b = bl;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        protected void c() {
            Closeable closeable = this.a;
            if (closeable instanceof Flushable) {
                ((Flushable)closeable).flush();
            }
            if (!this.b) {
                this.a.close();
                return;
            }
            try {
                this.a.close();
                return;
            }
            catch (IOException iOException) {}
        }
    }

    public static interface b {
        public static final b a = new b(){

            @Override
            public HttpURLConnection a(URL uRL) {
                return (HttpURLConnection)uRL.openConnection();
            }

            @Override
            public HttpURLConnection a(URL uRL, Proxy proxy) {
                return (HttpURLConnection)uRL.openConnection(proxy);
            }
        };

        public HttpURLConnection a(URL var1);

        public HttpURLConnection a(URL var1, Proxy var2);

    }

    public static class c
    extends RuntimeException {
        protected c(IOException iOException) {
            super((Throwable)iOException);
        }

        public IOException a() {
            return (IOException)super.getCause();
        }

        public /* synthetic */ Throwable getCause() {
            return this.a();
        }
    }

    protected static abstract class d<V>
    implements Callable<V> {
        protected d() {
        }

        protected abstract V b();

        protected abstract void c();

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public V call() {
            Throwable throwable;
            boolean bl = true;
            V v2 = this.b();
            try {
                this.c();
            }
            catch (IOException iOException) {
                throw new c(iOException);
            }
            return v2;
            catch (Throwable throwable2) {
                throwable = throwable2;
                bl = false;
            }
            catch (IOException iOException) {
                try {
                    throw new c(iOException);
                    catch (c c2) {
                        throw c2;
                    }
                }
                catch (Throwable throwable3) {
                    // empty catch block
                }
            }
            try {
                this.c();
                throw throwable;
            }
            catch (IOException iOException) {
                if (bl) throw throwable;
                throw new c(iOException);
            }
        }
    }

    public static class e
    extends BufferedOutputStream {
        private final CharsetEncoder a;

        public e(OutputStream outputStream, String string, int n2) {
            super(outputStream, n2);
            this.a = Charset.forName((String)d.f(string)).newEncoder();
        }

        public e a(String string) {
            ByteBuffer byteBuffer = this.a.encode(CharBuffer.wrap((CharSequence)string));
            super.write(byteBuffer.array(), 0, byteBuffer.limit());
            return this;
        }
    }

}

