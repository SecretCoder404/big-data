/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.Spanned
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 *  androidx.appcompat.widget.y
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.mobond.mindicator.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.y;
import com.mobond.mindicator.util.EllipsizingTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EllipsizingTextView
extends y {
    private static final CharSequence a = "\u2026";
    private static final Pattern b = Pattern.compile((String)"[\\.!?,;:\u2026]*$", (int)32);
    private final List<b> c = new ArrayList();
    private f e;
    private boolean f;
    private boolean g;
    private boolean h;
    private CharSequence i;
    private int j;
    private float k = 1.0f;
    private float l = 0.0f;
    private Pattern m;

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, new int[]{16843091}, n2, 0);
        this.setMaxLines(typedArray.getInt(0, Integer.MAX_VALUE));
        typedArray.recycle();
        this.setEndPunctuationPattern(b);
    }

    private void c() {
        boolean bl;
        int n2 = this.getMaxLines();
        CharSequence charSequence = this.i;
        if (n2 != -1) {
            if (this.e == null) {
                this.setEllipsize(null);
            }
            charSequence = this.e.c(this.i);
            bl = true ^ this.e.d(this.i);
        } else {
            bl = false;
        }
        if (!charSequence.equals((Object)this.getText())) {
            this.h = true;
            try {
                this.setText(charSequence);
            }
            finally {
                this.h = false;
            }
        }
        this.g = false;
        if (bl != this.f) {
            this.f = bl;
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                (iterator.next()).a(bl);
            }
        }
    }

    public boolean a() {
        return this.j == Integer.MAX_VALUE;
    }

    @SuppressLint(value={"Override"})
    public int getMaxLines() {
        return this.j;
    }

    protected void onDraw(Canvas canvas) {
        if (this.g) {
            this.c();
        }
        super.onDraw(canvas);
    }

    protected void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        if (this.a()) {
            this.g = true;
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            this.e = new f(){

                @Override
                protected CharSequence a(CharSequence charSequence) {
                    return charSequence;
                }
            };
            return;
        }
        switch (1.a[truncateAt.ordinal()]) {
            default: {
                break;
            }
            case 4: {
                super.setEllipsize(truncateAt);
                this.g = false;
                break;
            }
            case 3: {
                this.e = new f(){

                    @Override
                    protected CharSequence a(CharSequence charSequence) {
                        SpannableStringBuilder spannableStringBuilder;
                        int n2 = this.e(charSequence).getLineEnd(EllipsizingTextView.this.j - 1);
                        int n3 = charSequence.length();
                        int n4 = n3 - n2;
                        if (n4 < a.length()) {
                            n4 = a.length();
                        }
                        int n5 = n4 + n2 % 2;
                        int n6 = n3 / 2;
                        int n7 = n5 / 2;
                        String string = TextUtils.substring((CharSequence)charSequence, (int)0, (int)(n6 - n7)).trim();
                        String string2 = TextUtils.substring((CharSequence)charSequence, (int)(n6 + n7), (int)n3).trim();
                        do {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(string);
                            stringBuilder.append((Object)a);
                            stringBuilder.append(string2);
                            if (this.d(stringBuilder.toString())) break;
                            int n8 = string.lastIndexOf(32);
                            int n9 = string2.indexOf(32);
                            if (n8 == -1 || n9 == -1) break;
                            string = string.substring(0, n8).trim();
                            string2 = string2.substring(n9, string2.length()).trim();
                        } while (true);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder((CharSequence)string);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder((CharSequence)string2);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned)charSequence;
                            TextUtils.copySpansFrom((Spanned)spanned, (int)0, (int)string.length(), null, (Spannable)spannableStringBuilder2, (int)0);
                            int n10 = n3 - string2.length();
                            spannableStringBuilder = spannableStringBuilder3;
                            TextUtils.copySpansFrom((Spanned)spanned, (int)n10, (int)n3, null, (Spannable)spannableStringBuilder3, (int)0);
                        } else {
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        CharSequence[] arrcharSequence = new CharSequence[]{spannableStringBuilder2, a, spannableStringBuilder};
                        return TextUtils.concat((CharSequence[])arrcharSequence);
                    }
                };
                return;
            }
            case 2: {
                this.e = new f(){

                    @Override
                    protected CharSequence a(CharSequence charSequence) {
                        int n2 = this.e(charSequence).getLineEnd(-1 + EllipsizingTextView.this.j);
                        int n3 = charSequence.length();
                        int n4 = n3 - n2;
                        if (n4 < a.length()) {
                            n4 = a.length();
                        }
                        String string = TextUtils.substring((CharSequence)charSequence, (int)n4, (int)n3).trim();
                        do {
                            int n5;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((Object)a);
                            stringBuilder.append(string);
                            if (this.d(stringBuilder.toString()) || (n5 = string.indexOf(32)) == -1) break;
                            string = string.substring(n5, string.length()).trim();
                        } while (true);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((Object)a);
                        stringBuilder.append(string);
                        String string2 = stringBuilder.toString();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)string2);
                        if (charSequence instanceof Spanned) {
                            TextUtils.copySpansFrom((Spanned)((Spanned)charSequence), (int)(n3 - string2.length()), (int)n3, null, (Spannable)spannableStringBuilder, (int)0);
                        }
                        return spannableStringBuilder;
                    }
                };
                return;
            }
            case 1: {
                this.e = new f(){

                    @Override
                    protected CharSequence a(CharSequence charSequence) {
                        int n2 = this.e(charSequence).getLineEnd(-1 + EllipsizingTextView.this.j);
                        int n3 = charSequence.length();
                        int n4 = n3 - n2;
                        if (n4 < a.length()) {
                            n4 = a.length();
                        }
                        String string = TextUtils.substring((CharSequence)charSequence, (int)0, (int)(n3 - n4)).trim();
                        String string2 = this.b(string);
                        do {
                            int n5;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(string2);
                            stringBuilder.append((Object)a);
                            if (this.d(stringBuilder.toString()) || (n5 = string.lastIndexOf(32)) == -1) break;
                            string = string.substring(0, n5).trim();
                            string2 = this.b(string);
                        } while (true);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string2);
                        stringBuilder.append((Object)a);
                        String string3 = stringBuilder.toString();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)string3);
                        if (charSequence instanceof Spanned) {
                            TextUtils.copySpansFrom((Spanned)((Spanned)charSequence), (int)0, (int)string3.length(), null, (Spannable)spannableStringBuilder, (int)0);
                        }
                        return spannableStringBuilder;
                    }

                    public String b(CharSequence charSequence) {
                        return EllipsizingTextView.this.m.matcher(charSequence).replaceFirst("");
                    }
                };
                return;
            }
        }
        this.e = new /* invalid duplicate definition of identical inner class */;
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.m = pattern;
    }

    public void setLineSpacing(float f2, float f3) {
        this.l = f2;
        this.k = f3;
        super.setLineSpacing(f2, f3);
    }

    public void setMaxLines(int n2) {
        super.setMaxLines(n2);
        this.j = n2;
        this.g = true;
    }

    public void setPadding(int n2, int n3, int n4, int n5) {
        super.setPadding(n2, n3, n4, n5);
        if (this.a()) {
            this.g = true;
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.h) {
            this.i = charSequence;
            this.g = true;
        }
        super.setText(charSequence, bufferType);
    }

}

