/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.b;

import com.google.b.a;
import com.google.b.e;
import com.google.b.f;
import com.google.b.i;
import com.google.b.m;
import com.google.b.p;
import com.google.b.s;
import com.google.b.w;

public abstract class b<MessageType extends p>
implements s<MessageType> {
    private static final i a = i.b();

    private w a(MessageType MessageType) {
        if (MessageType instanceof a) {
            return ((a)MessageType).j();
        }
        return new w((p)MessageType);
    }

    private MessageType b(MessageType MessageType) {
        if (MessageType != null) {
            if (MessageType.o()) {
                return MessageType;
            }
            throw this.a(MessageType).a().a((p)MessageType);
        }
        return MessageType;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public MessageType a(e e2, i i2) {
        f f2 = e2.c();
        p p2 = (p)this.b(f2, i2);
        {
            catch (m m2) {
                throw m2;
            }
        }
        try {
            f2.a(0);
        }
        catch (m m3) {
            throw m3.a(p2);
        }
        return (MessageType)p2;
    }

    public MessageType b(e e2, i i2) {
        return this.b(this.a(e2, i2));
    }

    @Override
    public /* synthetic */ Object c(e e2, i i2) {
        return this.b(e2, i2);
    }
}

