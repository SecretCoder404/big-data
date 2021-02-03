/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.b.p
 *  java.io.IOException
 *  java.lang.String
 */
package com.google.b;

import com.google.b.p;
import java.io.IOException;

public class m
extends IOException {
    private p a = null;

    public m(String string) {
        super(string);
    }

    static m a() {
        return new m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static m b() {
        return new m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static m c() {
        return new m("CodedInputStream encountered a malformed varint.");
    }

    static m d() {
        return new m("Protocol message contained an invalid tag (zero).");
    }

    static m e() {
        return new m("Protocol message end-group tag did not match expected tag.");
    }

    static m f() {
        return new m("Protocol message tag had invalid wire type.");
    }

    static m g() {
        return new m("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static m h() {
        return new m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static m i() {
        return new m("Protocol message had invalid UTF-8.");
    }

    public m a(p p2) {
        this.a = p2;
        return this;
    }
}

