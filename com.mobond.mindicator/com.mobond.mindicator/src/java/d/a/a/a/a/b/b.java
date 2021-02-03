/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package d.a.a.a.a.b;

class b {
    public final String a;
    public final boolean b;

    b(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            b b2 = (b)object;
            if (this.b != b2.b) {
                return false;
            }
            String string = this.a;
            return !(string != null ? !string.equals((Object)b2.a) : b2.a != null);
        }
        return false;
    }

    public int hashCode() {
        String string = this.a;
        int n2 = string != null ? string.hashCode() : 0;
        return n2 * 31 + this.b;
    }
}

