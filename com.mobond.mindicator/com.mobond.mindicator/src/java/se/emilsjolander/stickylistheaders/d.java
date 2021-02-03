/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.SectionIndexer
 *  java.lang.Object
 */
package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.widget.SectionIndexer;
import se.emilsjolander.stickylistheaders.a;
import se.emilsjolander.stickylistheaders.e;

class d
extends a
implements SectionIndexer {
    SectionIndexer b;

    d(Context context, e e2) {
        super(context, e2);
        this.b = (SectionIndexer)e2;
    }

    public int getPositionForSection(int n2) {
        return this.b.getPositionForSection(n2);
    }

    public int getSectionForPosition(int n2) {
        return this.b.getSectionForPosition(n2);
    }

    public Object[] getSections() {
        return this.b.getSections();
    }
}

