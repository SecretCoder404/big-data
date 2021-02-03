/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package a.a.a.a;

import a.a.a.a.c;
import java.io.IOException;
import java.util.Iterator;

public class a
implements Iterator<String[]> {
    private c a;
    private String[] b;

    public a(c c2) {
        this.a = c2;
        this.b = c2.a();
    }

    public String[] a() {
        String[] arrstring = this.b;
        try {
            this.b = this.a.a();
            return arrstring;
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
    }

    public boolean hasNext() {
        return this.b != null;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    public void remove() {
        throw new UnsupportedOperationException("This is a read only iterator.");
    }
}

