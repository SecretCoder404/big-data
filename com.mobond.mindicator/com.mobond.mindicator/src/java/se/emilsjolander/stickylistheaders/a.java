/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.Checkable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedList
 *  java.util.List
 */
package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import java.util.LinkedList;
import java.util.List;
import se.emilsjolander.stickylistheaders.a;
import se.emilsjolander.stickylistheaders.b;
import se.emilsjolander.stickylistheaders.e;
import se.emilsjolander.stickylistheaders.f;

class a
extends BaseAdapter
implements e {
    e a;
    private final List<View> b = new LinkedList();
    private final Context c;
    private Drawable d;
    private int e;
    private a f;
    private DataSetObserver g = new DataSetObserver(this){
        final /* synthetic */ a a;
        {
            this.a = a2;
        }

        public void onChanged() {
            a.c(this.a);
        }

        public void onInvalidated() {
            a.a(this.a).clear();
            a.b(this.a);
        }
    };

    a(Context context, e e2) {
        this.c = context;
        this.a = e2;
        e2.registerDataSetObserver(this.g);
    }

    private View a() {
        if (this.b.size() > 0) {
            return (View)this.b.remove(0);
        }
        return null;
    }

    private View a(f f2, int n2) {
        View view = f2.d == null ? this.a() : f2.d;
        View view2 = this.a.a(n2, view, f2);
        if (view2 != null) {
            view2.setClickable(true);
            view2.setOnClickListener(new View.OnClickListener(this, n2){
                final /* synthetic */ int a;
                final /* synthetic */ a b;
                {
                    this.b = a2;
                    this.a = n2;
                }

                public void onClick(View view) {
                    if (a.d(this.b) != null) {
                        long l2 = this.b.a.b(this.a);
                        a.d(this.b).a(view, this.a, l2);
                    }
                }
            });
            return view2;
        }
        throw new NullPointerException("Header view must not be null.");
    }

    static /* synthetic */ List a(a a2) {
        return a2.b;
    }

    private void a(f f2) {
        View view = f2.d;
        if (view != null) {
            view.setVisibility(0);
            this.b.add((Object)view);
        }
    }

    private boolean a(int n2) {
        return n2 != 0 && this.a.b(n2) == this.a.b(n2 - 1);
    }

    static /* synthetic */ void b(a a2) {
        super.notifyDataSetInvalidated();
    }

    static /* synthetic */ void c(a a2) {
        super.notifyDataSetChanged();
    }

    static /* synthetic */ a d(a a2) {
        return a2.f;
    }

    @Override
    public View a(int n2, View view, ViewGroup viewGroup) {
        return this.a.a(n2, view, viewGroup);
    }

    void a(Drawable drawable, int n2) {
        this.d = drawable;
        this.e = n2;
        this.notifyDataSetChanged();
    }

    public void a(a a2) {
        this.f = a2;
    }

    public boolean areAllItemsEnabled() {
        return this.a.areAllItemsEnabled();
    }

    @Override
    public long b(int n2) {
        return this.a.b(n2);
    }

    public f b(int n2, View view, ViewGroup viewGroup) {
        View view2;
        f f2 = view == null ? new f(this.c) : (f)view;
        View view3 = this.a.getView(n2, f2.a, viewGroup);
        if (this.a(n2)) {
            this.a(f2);
            view2 = null;
        } else {
            view2 = this.a(f2, n2);
        }
        boolean bl = view3 instanceof Checkable;
        if (bl && !(f2 instanceof b)) {
            f2 = new b(this.c);
        } else if (!bl && f2 instanceof b) {
            f2 = new f(this.c);
        }
        f2.a(view3, view2, this.d, this.e);
        return f2;
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public int getCount() {
        return this.a.getCount();
    }

    public View getDropDownView(int n2, View view, ViewGroup viewGroup) {
        return ((BaseAdapter)this.a).getDropDownView(n2, view, viewGroup);
    }

    public Object getItem(int n2) {
        return this.a.getItem(n2);
    }

    public long getItemId(int n2) {
        return this.a.getItemId(n2);
    }

    public int getItemViewType(int n2) {
        return this.a.getItemViewType(n2);
    }

    public /* synthetic */ View getView(int n2, View view, ViewGroup viewGroup) {
        return this.b(n2, view, viewGroup);
    }

    public int getViewTypeCount() {
        return this.a.getViewTypeCount();
    }

    public boolean hasStableIds() {
        return this.a.hasStableIds();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public boolean isEnabled(int n2) {
        return this.a.isEnabled(n2);
    }

    public void notifyDataSetChanged() {
        ((BaseAdapter)this.a).notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated() {
        ((BaseAdapter)this.a).notifyDataSetInvalidated();
    }

    public String toString() {
        return this.a.toString();
    }

}

