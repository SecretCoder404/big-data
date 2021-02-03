/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package com.amazon.device.ads;

import com.amazon.device.ads.by;
import com.amazon.device.ads.bz;
import com.amazon.device.ads.ca;
import java.io.File;

class bp
implements by {
    bp() {
    }

    @Override
    public bz a(File file, String string) {
        bz bz2 = new bz();
        bz2.a(file, string);
        return bz2;
    }

    @Override
    public ca a(String string) {
        ca ca2 = new ca();
        ca2.a(string);
        return ca2;
    }

    @Override
    public ca b(File file, String string) {
        ca ca2 = new ca();
        ca2.a(file, string);
        return ca2;
    }
}

