/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.Checkable
 */
package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import se.emilsjolander.stickylistheaders.f;

class b
extends f
implements Checkable {
    public b(Context context) {
        super(context);
    }

    public boolean isChecked() {
        return ((Checkable)this.a).isChecked();
    }

    public void setChecked(boolean bl) {
        ((Checkable)this.a).setChecked(bl);
    }

    public void toggle() {
        this.setChecked(true ^ this.isChecked());
    }
}

