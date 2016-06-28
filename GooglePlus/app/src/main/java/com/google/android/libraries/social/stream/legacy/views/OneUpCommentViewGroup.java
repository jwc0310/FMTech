package com.google.android.libraries.social.stream.legacy.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import aw;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import da;
import do;
import efj;
import ehr;
import gvj;
import gxn;
import gxq;
import gxs;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import jr;
import kaz;
import kb;
import kbb;
import kuv;
import loy;
import lwj;
import lwo;
import lwu;
import lww;
import lxi;
import lxj;
import mbb;
import mfx;
import mfz;
import pka;
import pkh;

public final class OneUpCommentViewGroup
  extends ViewGroup
  implements View.OnClickListener, gxs, kbb, lxj
{
  private static int A;
  private static Drawable B;
  private static float C;
  private static int D;
  private static int E;
  private static Paint F;
  private static Drawable G;
  private static boolean r;
  private static int s;
  private static int t;
  private static int u;
  private static int v;
  private static Paint w;
  private static int x;
  private static Paint y;
  private static Drawable z;
  private Set<lwu> H = new HashSet();
  private lwu I;
  private Rect J;
  private Point K;
  private final lwj L;
  public String a;
  public String b;
  public String c;
  public String d;
  public Spanned e;
  public String f;
  public int g;
  public boolean h;
  public boolean i;
  public boolean j;
  public AvatarView k;
  public lxi l;
  public lxi m;
  public lxi n;
  public lww o;
  public boolean p = true;
  public loy q;
  
  public OneUpCommentViewGroup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public OneUpCommentViewGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public OneUpCommentViewGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setClickable(true);
    setFocusable(true);
    setOnClickListener(new gxn(this));
    setWillNotDraw(false);
    Resources localResources = getResources();
    if (!r)
    {
      t = localResources.getDimensionPixelOffset(ehr.fe);
      s = localResources.getDimensionPixelOffset(ehr.fg);
      u = localResources.getDimensionPixelOffset(ehr.ff);
      v = localResources.getDimensionPixelOffset(ehr.fd);
      Paint localPaint1 = new Paint();
      w = localPaint1;
      localPaint1.setColor(localResources.getColor(da.aA));
      x = localResources.getDimensionPixelOffset(ehr.fb);
      Paint localPaint2 = new Paint();
      y = localPaint2;
      localPaint2.setColor(localResources.getColor(da.aM));
      z = localResources.getDrawable(ehr.gf);
      A = localResources.getDimensionPixelOffset(ehr.fc);
      B = localResources.getDrawable(ehr.fQ);
      C = localResources.getDimension(ehr.fh);
      D = localResources.getColor(da.aP);
      E = localResources.getColor(da.aN);
      Paint localPaint3 = new Paint();
      F = localPaint3;
      localPaint3.setColor(localResources.getColor(da.aK));
      F.setStyle(Paint.Style.STROKE);
      F.setStrokeWidth(localResources.getDimension(ehr.eW));
      G = localResources.getDrawable(da.aX);
      r = true;
    }
    this.L = ((lwj)mbb.a(paramContext, lwj.class));
    this.K = new Point(0, 0);
    this.k = new AvatarView(paramContext);
    this.k.a(0);
    this.k.e = 1;
    efj.a(this.k, new gxq(pka.x));
    this.k.setOnClickListener(new gxn(this));
    addView(this.k);
  }
  
  public final void D_()
  {
    if (this.k != null) {
      this.k.ap_();
    }
    this.l = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.k.ap_();
    this.J = null;
    this.K.set(0, 0);
    this.H.clear();
    this.I = null;
    this.h = false;
    this.g = 0;
    this.q = null;
    this.k.a();
    this.a = null;
    this.b = null;
    this.c = null;
    this.j = false;
    this.d = null;
    this.e = null;
    this.f = null;
  }
  
  public final void a(kaz paramkaz)
  {
    invalidate();
  }
  
  public final void ap_()
  {
    if (this.k != null) {
      this.k.ap_();
    }
  }
  
  public final void b()
  {
    if ((lwo.a(this)) && (this.k != null)) {
      this.k.b();
    }
  }
  
  @ViewDebug.ExportedProperty(category="accessibility")
  public final CharSequence getContentDescription()
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    if (localmfz.b == 1)
    {
      localStringBuilder = localmfz.a;
      if (this.b != null) {
        localStringBuilder.append(this.b).append('\n');
      }
      if (!this.i) {
        break label126;
      }
      Resources localResources = getResources();
      localStringBuilder.append(localResources.getString(do.aq)).append('.').append(localResources.getString(do.ao)).append(localResources.getString(do.ap));
    }
    for (;;)
    {
      return mfx.b(localStringBuilder);
      localStringBuilder = new StringBuilder(256);
      break;
      label126:
      if (this.e != null) {
        localStringBuilder.append(this.e).append('\n');
      }
      if (this.f != null) {
        localStringBuilder.append(this.f).append('\n');
      }
      if (this.g > 0) {
        localStringBuilder.append('+').append(this.g);
      }
    }
  }
  
  public final void invalidate()
  {
    super.invalidate();
    if (this.p)
    {
      efj.i(this);
      this.p = false;
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.k)
    {
      ((gvj)mbb.a(getContext(), gvj.class)).a(paramView);
      this.q.a(this.a);
    }
    while (this.q == null) {
      return;
    }
    this.q.a(this);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.k != null) {
      this.k.ap_();
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = getWidth();
    int i2 = getHeight();
    paramCanvas.drawRect(0.0F, 0.0F, i1, i2, w);
    if (this.i) {
      if (this.l != null)
      {
        paramCanvas.drawRect(this.J, y);
        Drawable localDrawable1 = B;
        int i12 = (this.J.width() - localDrawable1.getIntrinsicWidth()) / 2;
        int i13 = (this.J.height() - localDrawable1.getIntrinsicHeight()) / 2;
        localDrawable1.setBounds(i12 + this.J.left, i13 + this.J.top, this.J.right - i12, this.J.bottom - i13);
        localDrawable1.draw(paramCanvas);
        int i14 = this.l.a.left;
        int i15 = this.l.a.top;
        paramCanvas.translate(i14, i15);
        this.l.draw(paramCanvas);
        paramCanvas.translate(-i14, -i15);
        int i16 = this.o.a.left;
        int i17 = this.o.a.top;
        paramCanvas.translate(i16, i17);
        this.o.draw(paramCanvas);
        paramCanvas.translate(-i16, -i17);
        Drawable localDrawable2 = z;
        localDrawable2.setBounds(this.K.x - localDrawable2.getIntrinsicWidth(), this.K.y, this.K.x, this.K.y + localDrawable2.getIntrinsicHeight());
        localDrawable2.draw(paramCanvas);
      }
    }
    for (;;)
    {
      int i9 = (int)F.getStrokeWidth();
      if ((isPressed()) || (isFocused()))
      {
        G.setBounds(0, 0, i1, i2 - i9);
        G.draw(paramCanvas);
      }
      paramCanvas.drawLine(t, i2 - i9, i1 - u, i2 - i9, F);
      return;
      if (this.l != null)
      {
        int i3 = this.l.a.left;
        int i4 = this.l.a.top;
        paramCanvas.translate(i3, i4);
        this.l.draw(paramCanvas);
        paramCanvas.translate(-i3, -i4);
        if (this.j)
        {
          int i10 = this.m.a.left;
          int i11 = this.m.a.top;
          paramCanvas.translate(i10, i11);
          this.m.draw(paramCanvas);
          paramCanvas.translate(-i10, -i11);
        }
        int i5 = this.n.a.left;
        int i6 = this.n.a.top;
        paramCanvas.translate(i5, i6);
        this.n.draw(paramCanvas);
        paramCanvas.translate(-i5, -i6);
        int i7 = this.o.a.left;
        int i8 = this.o.a.top;
        paramCanvas.translate(i7, i8);
        this.o.draw(paramCanvas);
        paramCanvas.translate(-i7, -i8);
      }
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getPaddingLeft() + t;
    int i2 = getPaddingTop() + s;
    int i3 = this.k.c;
    this.k.layout(i1, i2, i1 + i3, i3 + i2);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.k.measure(paramInt1, paramInt2);
    int i1 = getPaddingLeft() + t;
    int i2 = getPaddingTop() + s;
    int i3 = getMeasuredWidth();
    int i4 = i3 - i1 - getPaddingRight() - u;
    this.H.clear();
    this.I = null;
    int i21;
    if (this.i)
    {
      ap_();
      Resources localResources = getResources();
      int i24 = this.k.c;
      this.J = new Rect(i1, i2, i1 + i24, i2 + i24);
      int i25 = i1 + (i24 + x);
      Drawable localDrawable = z;
      int i26 = localDrawable.getIntrinsicWidth() + A;
      this.K.set(i1 + i4, i2 + (i24 - localDrawable.getIntrinsicHeight()) / 2);
      TextPaint localTextPaint3 = efj.B(getContext(), aw.ef);
      int i27 = i4 - i24 - x - i26;
      this.l = new lxi(lwj.b(localResources.getString(do.aq), localTextPaint3, i27, TextUtils.TruncateAt.END, null), localTextPaint3, i27, Layout.Alignment.ALIGN_NORMAL, C, 0.0F, false);
      this.l.a(i25, i2);
      int i28 = i4 - i24 - x;
      int i29 = i1 + i24 + x;
      int i30 = i2 + this.l.getHeight();
      this.H.remove(this.o);
      this.o = new lww(localResources.getString(do.ao), efj.B(getContext(), aw.ee), i28, Layout.Alignment.ALIGN_NORMAL, C, 0.0F, false, this.q);
      this.o.a(i29, i30);
      this.H.add(this.o);
      b();
      i21 = Math.max(i2 + this.J.height(), i30 + this.o.getHeight());
      setMeasuredDimension(i3, i21 + v + (int)F.getStrokeWidth() + getPaddingBottom());
      return;
    }
    ap_();
    Context localContext = getContext();
    int i5 = i1 + (this.k.c + x);
    TextPaint localTextPaint1 = efj.B(localContext, aw.el);
    int i6 = lwj.a(localTextPaint1, this.f);
    this.n = new lxi(this.f, localTextPaint1, i6, Layout.Alignment.ALIGN_NORMAL, C, 0.0F, false);
    String str1 = localContext.getString(do.aS);
    int i7;
    label521:
    int i14;
    int i15;
    int i16;
    SpannableStringBuilder localSpannableStringBuilder;
    StringBuilder localStringBuilder;
    label884:
    int i17;
    if (this.j)
    {
      i7 = lwj.a(localTextPaint1, str1);
      if (this.j) {
        this.m = new lxi(str1, localTextPaint1, i7, Layout.Alignment.ALIGN_NORMAL, C, 0.0F, false);
      }
      int i8 = this.k.c;
      int i9 = x;
      TextPaint localTextPaint2 = efj.B(localContext, aw.ef);
      int i10 = i4 - i8 - i9 - i6 - i7;
      CharSequence localCharSequence = lwj.b(this.b, localTextPaint2, i10, TextUtils.TruncateAt.END, null);
      this.l = new lxi(localCharSequence, localTextPaint2, Math.min(i10, lwj.a(localTextPaint2, localCharSequence.toString())), Layout.Alignment.ALIGN_NORMAL, C, 0.0F, false);
      this.l.a(i5, i2);
      int i11 = i5 + this.l.getWidth();
      int i12 = i2 + (localTextPaint1.getFontMetricsInt().ascent - localTextPaint2.getFontMetricsInt().ascent);
      if (this.j)
      {
        this.m.a(i11, i12);
        i11 += this.m.getWidth();
      }
      int i13 = i11 + i9;
      this.n.a(i13, i12);
      i14 = i4 - i8 - i9;
      i15 = i9 + (i1 + i8);
      i16 = i2 + this.l.getHeight();
      if (this.g <= 0) {
        break label1279;
      }
      localSpannableStringBuilder = new SpannableStringBuilder(this.e);
      jr localjr1 = jr.a();
      String str2 = this.e.toString();
      boolean bool = localjr1.e.a(str2, 0, str2.length());
      String str3 = this.e.toString();
      mfz localmfz = (mfz)mfx.a.get();
      localmfz.b = (1 + localmfz.b);
      if (localmfz.b != 1) {
        break label1248;
      }
      localStringBuilder = localmfz.a;
      localStringBuilder.append(str3);
      localStringBuilder.reverse();
      jr localjr2 = jr.a();
      String str4 = mfx.b(localStringBuilder);
      if (bool != localjr2.e.a(str4, 0, str4.length()))
      {
        if (!bool) {
          break label1263;
        }
        int i22 = 8207;
        label941:
        localSpannableStringBuilder.append(i22);
      }
      localSpannableStringBuilder.append("  ");
      String str5 = String.valueOf("‭+");
      String str6 = String.valueOf(NumberFormat.getInstance().format(this.g));
      localSpannableStringBuilder.append(1 + String.valueOf(str5).length() + String.valueOf(str6).length() + str5 + str6 + '‬');
      TextAppearanceSpan localTextAppearanceSpan = new TextAppearanceSpan(null, 1, localContext.getResources().getDimensionPixelSize(ehr.fv), null, null);
      if (!this.h) {
        break label1271;
      }
      i17 = E;
      label1069:
      ForegroundColorSpan localForegroundColorSpan = new ForegroundColorSpan(i17);
      int i18 = 1 + this.e.length();
      int i19 = localSpannableStringBuilder.length();
      localSpannableStringBuilder.setSpan(localTextAppearanceSpan, i18, i19, 33);
      localSpannableStringBuilder.setSpan(localForegroundColorSpan, i18, i19, 33);
    }
    label1248:
    label1263:
    label1271:
    label1279:
    for (Object localObject = localSpannableStringBuilder;; localObject = this.e)
    {
      this.H.remove(this.o);
      this.o = new lww((CharSequence)localObject, efj.B(getContext(), aw.ee), i14, Layout.Alignment.ALIGN_NORMAL, C, 0.0F, false, this.q);
      this.o.a(i15, i16);
      this.H.add(this.o);
      int i20 = i16 + this.o.getHeight();
      b();
      i21 = Math.max(i2 + this.k.getMeasuredHeight(), i20);
      break;
      i7 = 0;
      break label521;
      localStringBuilder = new StringBuilder(256);
      break label884;
      int i23 = 8206;
      break label941;
      i17 = D;
      break label1069;
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      Iterator localIterator2 = this.H.iterator();
      lwu locallwu;
      do
      {
        if (!localIterator2.hasNext()) {
          break;
        }
        locallwu = (lwu)localIterator2.next();
      } while (!locallwu.a(i1, i2, 0));
      this.I = locallwu;
      invalidate();
      return true;
      this.I = null;
      Iterator localIterator1 = this.H.iterator();
      while (localIterator1.hasNext()) {
        ((lwu)localIterator1.next()).a(i1, i2, 1);
      }
      invalidate();
      continue;
      if (this.I != null)
      {
        this.I.a(i1, i2, 3);
        this.I = null;
        invalidate();
      }
    }
  }
  
  public final void setPressed(boolean paramBoolean)
  {
    boolean bool = isPressed();
    super.setPressed(paramBoolean);
    if (bool != paramBoolean) {
      invalidate();
    }
  }
  
  public final gxq v()
  {
    return new kuv(pkh.k, this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.stream.legacy.views.OneUpCommentViewGroup
 * JD-Core Version:    0.7.0.1
 */