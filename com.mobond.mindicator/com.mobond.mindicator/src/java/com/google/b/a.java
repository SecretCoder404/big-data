/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.b;

import com.google.b.e;
import com.google.b.g;
import com.google.b.p;
import com.google.b.w;
import java.io.IOException;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
implements p {
    protected int a = 0;

    private String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Serializing ");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(" to a ");
        stringBuilder.append(string);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    @Override
    public e i() {
        try {
            e.e e2 = e.b(this.e());
            this.a(e2.b());
            e e3 = e2.a();
            return e3;
        }
        catch (IOException iOException) {
            throw new RuntimeException(this.a("ByteString"), (Throwable)iOException);
        }
    }

    w j() {
        return new w(this);
    }

    public static abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    implements p.a {
        protected static w b(p p2) {
            return new w(p2);
        }

        public abstract BuilderType a();

        protected abstract BuilderType a(MessageType var1);

        public BuilderType a(p p2) {
            if (this.s().getClass().isInstance((Object)p2)) {
                return this.a((MessageType)((a)p2));
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override
        public /* synthetic */ p.a c(p p2) {
            return this.a(p2);
        }

        public /* synthetic */ Object clone() {
            return this.a();
        }
    }

}

