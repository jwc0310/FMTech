package android.support.v7.widget;

import aab;
import aau;
import acl;
import acy;
import aic;
import aie;
import aif;
import aig;
import aih;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import lt;
import lu;
import mi;
import mj;
import mm;
import ms;
import nj;
import ns;
import tq;
import wb;
import xl;
import xm;
import xp;
import ya;
import ze;
import zk;
import zv;
import zw;
import zx;

public class Toolbar
  extends ViewGroup
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int E = 8388627;
  private int F;
  private int G;
  private boolean H;
  private boolean I;
  private final ArrayList<View> J = new ArrayList();
  private final int[] K = new int[2];
  private final acy L = new acy(this);
  private zx M;
  private final Runnable N = new aic(this);
  public ActionMenuView a;
  public TextView b;
  public TextView c;
  public ImageButton d;
  public Drawable e;
  public CharSequence f;
  public ImageButton g;
  public View h;
  public Context i;
  public int j;
  public int k;
  public int l;
  public int m;
  public final zk n = new zk();
  public CharSequence o;
  public CharSequence p;
  public final ArrayList<View> q = new ArrayList();
  public aig r;
  public acl s;
  public aie t;
  public ya u;
  public xm v;
  public boolean w;
  public final zv x;
  private ImageView y;
  private int z;
  
  public Toolbar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, aau.af);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zw localzw = zw.a(getContext(), paramAttributeSet, wb.bK, paramInt, 0);
    int i1 = wb.ch;
    this.k = localzw.a.getResourceId(i1, 0);
    int i2 = wb.bZ;
    this.l = localzw.a.getResourceId(i2, 0);
    int i3 = wb.bL;
    int i4 = this.E;
    this.E = localzw.a.getInteger(i3, i4);
    this.m = 48;
    int i5 = wb.cg;
    int i6 = localzw.a.getDimensionPixelOffset(i5, 0);
    this.D = i6;
    this.C = i6;
    this.B = i6;
    this.A = i6;
    int i7 = wb.ce;
    int i8 = localzw.a.getDimensionPixelOffset(i7, -1);
    if (i8 >= 0) {
      this.A = i8;
    }
    int i9 = wb.cd;
    int i10 = localzw.a.getDimensionPixelOffset(i9, -1);
    if (i10 >= 0) {
      this.B = i10;
    }
    int i11 = wb.cf;
    int i12 = localzw.a.getDimensionPixelOffset(i11, -1);
    if (i12 >= 0) {
      this.C = i12;
    }
    int i13 = wb.cc;
    int i14 = localzw.a.getDimensionPixelOffset(i13, -1);
    if (i14 >= 0) {
      this.D = i14;
    }
    int i15 = wb.bU;
    this.z = localzw.a.getDimensionPixelSize(i15, -1);
    int i16 = wb.bR;
    int i17 = localzw.a.getDimensionPixelOffset(i16, -2147483648);
    int i18 = wb.bO;
    int i19 = localzw.a.getDimensionPixelOffset(i18, -2147483648);
    int i20 = wb.bP;
    int i21 = localzw.a.getDimensionPixelSize(i20, 0);
    int i22 = wb.bQ;
    int i23 = localzw.a.getDimensionPixelSize(i22, 0);
    zk localzk = this.n;
    localzk.h = false;
    if (i21 != -2147483648)
    {
      localzk.e = i21;
      localzk.a = i21;
    }
    if (i23 != -2147483648)
    {
      localzk.f = i23;
      localzk.b = i23;
    }
    if ((i17 != -2147483648) || (i19 != -2147483648)) {
      this.n.a(i17, i19);
    }
    this.e = localzw.a(wb.bN);
    int i24 = wb.bM;
    this.f = localzw.a.getText(i24);
    int i25 = wb.cb;
    CharSequence localCharSequence1 = localzw.a.getText(i25);
    if (!TextUtils.isEmpty(localCharSequence1)) {
      a(localCharSequence1);
    }
    int i26 = wb.bY;
    CharSequence localCharSequence2 = localzw.a.getText(i26);
    if (!TextUtils.isEmpty(localCharSequence2)) {
      b(localCharSequence2);
    }
    this.i = getContext();
    int i27 = wb.bX;
    a(localzw.a.getResourceId(i27, 0));
    Drawable localDrawable1 = localzw.a(wb.bW);
    if (localDrawable1 != null) {
      b(localDrawable1);
    }
    int i28 = wb.bV;
    CharSequence localCharSequence3 = localzw.a.getText(i28);
    if (!TextUtils.isEmpty(localCharSequence3)) {
      c(localCharSequence3);
    }
    Drawable localDrawable2 = localzw.a(wb.bS);
    if (localDrawable2 != null) {
      a(localDrawable2);
    }
    int i29 = wb.bT;
    CharSequence localCharSequence4 = localzw.a.getText(i29);
    if (!TextUtils.isEmpty(localCharSequence4))
    {
      if (!TextUtils.isEmpty(localCharSequence4)) {
        j();
      }
      if (this.y != null) {
        this.y.setContentDescription(localCharSequence4);
      }
    }
    int i30 = wb.ci;
    if (localzw.a.hasValue(i30))
    {
      int i34 = wb.ci;
      int i35 = localzw.a.getColor(i34, -1);
      this.F = i35;
      if (this.b != null) {
        this.b.setTextColor(i35);
      }
    }
    int i31 = wb.ca;
    if (localzw.a.hasValue(i31))
    {
      int i32 = wb.ca;
      int i33 = localzw.a.getColor(i32, -1);
      this.G = i33;
      if (this.c != null) {
        this.c.setTextColor(i33);
      }
    }
    localzw.a.recycle();
    this.x = localzw.a();
  }
  
  private final int a(View paramView, int paramInt)
  {
    aif localaif = (aif)paramView.getLayoutParams();
    int i1 = paramView.getMeasuredHeight();
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    int i9;
    if (paramInt > 0)
    {
      i2 = (i1 - paramInt) / 2;
      int i3 = 0x70 & localaif.a;
      switch (i3)
      {
      default: 
        i3 = 0x70 & this.E;
      }
      switch (i3)
      {
      default: 
        i4 = getPaddingTop();
        i5 = getPaddingBottom();
        i6 = getHeight();
        i7 = (i6 - i4 - i5 - i1) / 2;
        if (i7 < localaif.topMargin) {
          i9 = localaif.topMargin;
        }
        break;
      }
    }
    for (;;)
    {
      return i9 + i4;
      i2 = 0;
      break;
      return getPaddingTop() - i2;
      return getHeight() - getPaddingBottom() - i1 - localaif.bottomMargin - i2;
      int i8 = i6 - i5 - i1 - i7 - i4;
      if (i8 < localaif.bottomMargin) {
        i9 = Math.max(0, i7 - (localaif.bottomMargin - i8));
      } else {
        i9 = i7;
      }
    }
  }
  
  private final int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int i2 = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int i3 = Math.max(0, i1) + Math.max(0, i2);
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramArrayOfInt[1] = Math.max(0, -i2);
    paramView.measure(getChildMeasureSpec(paramInt1, paramInt2 + (i3 + (getPaddingLeft() + getPaddingRight())), localMarginLayoutParams.width), getChildMeasureSpec(paramInt3, paramInt4 + (getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin), localMarginLayoutParams.height));
    return i3 + paramView.getMeasuredWidth();
  }
  
  private final int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    aif localaif = (aif)paramView.getLayoutParams();
    int i1 = localaif.leftMargin - paramArrayOfInt[0];
    int i2 = paramInt1 + Math.max(0, i1);
    paramArrayOfInt[0] = Math.max(0, -i1);
    int i3 = a(paramView, paramInt2);
    int i4 = paramView.getMeasuredWidth();
    paramView.layout(i2, i3, i2 + i4, i3 + paramView.getMeasuredHeight());
    return i2 + (i4 + localaif.rightMargin);
  }
  
  private static aif a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof aif)) {
      return new aif((aif)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof tq)) {
      return new aif((tq)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new aif((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new aif(paramLayoutParams);
  }
  
  private final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = getChildMeasureSpec(paramInt1, paramInt2 + (getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin), localMarginLayoutParams.width);
    int i2 = getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin, localMarginLayoutParams.height);
    int i3 = View.MeasureSpec.getMode(i2);
    if ((i3 != 1073741824) && (paramInt5 >= 0))
    {
      if (i3 != 0) {
        paramInt5 = Math.min(View.MeasureSpec.getSize(i2), paramInt5);
      }
      i2 = View.MeasureSpec.makeMeasureSpec(paramInt5, 1073741824);
    }
    paramView.measure(i1, i2);
  }
  
  private final void a(View paramView, boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    aif localaif;
    if (localLayoutParams == null) {
      localaif = new aif(-2, -2);
    }
    for (;;)
    {
      localaif.b = 1;
      if ((!paramBoolean) || (this.h == null)) {
        break;
      }
      paramView.setLayoutParams(localaif);
      this.q.add(paramView);
      return;
      if (!checkLayoutParams(localLayoutParams)) {
        localaif = a(localLayoutParams);
      } else {
        localaif = (aif)localLayoutParams;
      }
    }
    addView(paramView, localaif);
  }
  
  private final void a(List<View> paramList, int paramInt)
  {
    int i1 = 1;
    if (nj.a.t(this) == i1) {}
    int i2;
    int i4;
    int i5;
    for (;;)
    {
      i2 = getChildCount();
      int i3 = nj.a.t(this);
      i4 = lt.a.a(paramInt, i3);
      paramList.clear();
      i5 = 0;
      if (i1 == 0) {
        break;
      }
      for (int i6 = i2 - 1; i6 >= 0; i6--)
      {
        View localView2 = getChildAt(i6);
        aif localaif2 = (aif)localView2.getLayoutParams();
        if ((localaif2.b == 0) && (a(localView2)) && (c(localaif2.a) == i4)) {
          paramList.add(localView2);
        }
      }
      i1 = 0;
    }
    while (i5 < i2)
    {
      View localView1 = getChildAt(i5);
      aif localaif1 = (aif)localView1.getLayoutParams();
      if ((localaif1.b == 0) && (a(localView1)) && (c(localaif1.a) == i4)) {
        paramList.add(localView1);
      }
      i5++;
    }
  }
  
  private final boolean a(View paramView)
  {
    return (paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8);
  }
  
  private static int b(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return mi.a.a(localMarginLayoutParams) + mi.a.b(localMarginLayoutParams);
  }
  
  private final int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    aif localaif = (aif)paramView.getLayoutParams();
    int i1 = localaif.rightMargin - paramArrayOfInt[1];
    int i2 = paramInt1 - Math.max(0, i1);
    paramArrayOfInt[1] = Math.max(0, -i1);
    int i3 = a(paramView, paramInt2);
    int i4 = paramView.getMeasuredWidth();
    paramView.layout(i2 - i4, i3, i2, i3 + paramView.getMeasuredHeight());
    return i2 - (i4 + localaif.leftMargin);
  }
  
  private final int c(int paramInt)
  {
    int i1 = nj.a.t(this);
    int i2 = 0x7 & lt.a.a(paramInt, i1);
    switch (i2)
    {
    case 2: 
    case 4: 
    default: 
      if (i1 == 1) {
        i2 = 5;
      }
      break;
    case 1: 
    case 3: 
    case 5: 
      return i2;
    }
    return 3;
  }
  
  private static int c(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin;
  }
  
  private final boolean d(View paramView)
  {
    return (paramView.getParent() == this) || (this.q.contains(paramView));
  }
  
  private final void j()
  {
    if (this.y == null) {
      this.y = new ImageView(getContext());
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.j != paramInt)
    {
      this.j = paramInt;
      if (paramInt == 0) {
        this.i = getContext();
      }
    }
    else
    {
      return;
    }
    this.i = new ContextThemeWrapper(getContext(), paramInt);
  }
  
  public final void a(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      j();
      if (!d(this.y)) {
        a(this.y, true);
      }
    }
    for (;;)
    {
      if (this.y != null) {
        this.y.setImageDrawable(paramDrawable);
      }
      return;
      if ((this.y != null) && (d(this.y)))
      {
        removeView(this.y);
        this.q.remove(this.y);
      }
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.b == null)
      {
        Context localContext = getContext();
        this.b = new TextView(localContext);
        this.b.setSingleLine();
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        if (this.k != 0) {
          this.b.setTextAppearance(localContext, this.k);
        }
        if (this.F != 0) {
          this.b.setTextColor(this.F);
        }
      }
      if (!d(this.b)) {
        a(this.b, true);
      }
    }
    for (;;)
    {
      if (this.b != null) {
        this.b.setText(paramCharSequence);
      }
      this.o = paramCharSequence;
      return;
      if ((this.b != null) && (d(this.b)))
      {
        removeView(this.b);
        this.q.remove(this.b);
      }
    }
  }
  
  public final boolean a()
  {
    if (this.a != null)
    {
      ActionMenuView localActionMenuView = this.a;
      if ((localActionMenuView.c != null) && (localActionMenuView.c.g())) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final void b(int paramInt)
  {
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = getContext().getText(paramInt);; localCharSequence = null)
    {
      c(localCharSequence);
      return;
    }
  }
  
  public final void b(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      g();
      if (!d(this.d)) {
        a(this.d, true);
      }
    }
    for (;;)
    {
      if (this.d != null) {
        this.d.setImageDrawable(paramDrawable);
      }
      return;
      if ((this.d != null) && (d(this.d)))
      {
        removeView(this.d);
        this.q.remove(this.d);
      }
    }
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.c == null)
      {
        Context localContext = getContext();
        this.c = new TextView(localContext);
        this.c.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        if (this.l != 0) {
          this.c.setTextAppearance(localContext, this.l);
        }
        if (this.G != 0) {
          this.c.setTextColor(this.G);
        }
      }
      if (!d(this.c)) {
        a(this.c, true);
      }
    }
    for (;;)
    {
      if (this.c != null) {
        this.c.setText(paramCharSequence);
      }
      this.p = paramCharSequence;
      return;
      if ((this.c != null) && (d(this.c)))
      {
        removeView(this.c);
        this.q.remove(this.c);
      }
    }
  }
  
  public final boolean b()
  {
    if (this.a != null)
    {
      ActionMenuView localActionMenuView = this.a;
      if ((localActionMenuView.c != null) && (localActionMenuView.c.d())) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final void c()
  {
    if (this.t == null) {}
    for (xp localxp = null;; localxp = this.t.a)
    {
      if (localxp != null) {
        localxp.collapseActionView();
      }
      return;
    }
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      g();
    }
    if (this.d != null) {
      this.d.setContentDescription(paramCharSequence);
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof aif));
  }
  
  public final CharSequence d()
  {
    if (this.d != null) {
      return this.d.getContentDescription();
    }
    return null;
  }
  
  public final Drawable e()
  {
    if (this.d != null) {
      return this.d.getDrawable();
    }
    return null;
  }
  
  public final void f()
  {
    if (this.a == null)
    {
      this.a = new ActionMenuView(getContext());
      this.a.a(this.j);
      this.a.f = this.L;
      ActionMenuView localActionMenuView = this.a;
      ya localya = this.u;
      xm localxm = this.v;
      localActionMenuView.d = localya;
      localActionMenuView.e = localxm;
      aif localaif = new aif(-2, -2);
      localaif.a = (0x800005 | 0x70 & this.m);
      this.a.setLayoutParams(localaif);
      a(this.a, false);
    }
  }
  
  public final void g()
  {
    if (this.d == null)
    {
      this.d = new ImageButton(getContext(), null, aau.ae);
      aif localaif = new aif(-2, -2);
      localaif.a = (0x800003 | 0x70 & this.m);
      this.d.setLayoutParams(localaif);
    }
  }
  
  public final ze h()
  {
    if (this.M == null) {
      this.M = new zx(this, true);
    }
    return this.M;
  }
  
  public final void i()
  {
    for (int i1 = -1 + getChildCount(); i1 >= 0; i1--)
    {
      View localView = getChildAt(i1);
      if ((((aif)localView.getLayoutParams()).b != 2) && (localView != this.a))
      {
        removeViewAt(i1);
        this.q.add(localView);
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.N);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ms.a(paramMotionEvent);
    if (i1 == 9) {
      this.I = false;
    }
    if (!this.I)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i1 == 9) && (!bool)) {
        this.I = true;
      }
    }
    if ((i1 == 10) || (i1 == 3)) {
      this.I = false;
    }
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int[] arrayOfInt;
    int i9;
    int i10;
    if (nj.a.t(this) == 1)
    {
      i1 = 1;
      i2 = getWidth();
      i3 = getHeight();
      i4 = getPaddingLeft();
      i5 = getPaddingRight();
      i6 = getPaddingTop();
      i7 = getPaddingBottom();
      i8 = i2 - i5;
      arrayOfInt = this.K;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      i9 = nj.a.p(this);
      if (!a(this.d)) {
        break label1770;
      }
      if (i1 == 0) {
        break label894;
      }
      i8 = b(this.d, i8, arrayOfInt, i9);
      i10 = i4;
    }
    for (;;)
    {
      label118:
      int i11;
      label150:
      label182:
      int i12;
      label290:
      int i13;
      int i14;
      if (a(this.g))
      {
        if (i1 != 0) {
          i8 = b(this.g, i8, arrayOfInt, i9);
        }
      }
      else
      {
        if (a(this.a))
        {
          if (i1 == 0) {
            break label932;
          }
          i10 = a(this.a, i10, arrayOfInt, i9);
        }
        arrayOfInt[0] = Math.max(0, this.n.a - i10);
        arrayOfInt[1] = Math.max(0, this.n.b - (i2 - i5 - i8));
        i11 = Math.max(i10, this.n.a);
        i12 = Math.min(i8, i2 - i5 - this.n.b);
        if (a(this.h))
        {
          if (i1 == 0) {
            break label951;
          }
          i12 = b(this.h, i12, arrayOfInt, i9);
        }
        if (!a(this.y)) {
          break label1759;
        }
        if (i1 == 0) {
          break label970;
        }
        i13 = b(this.y, i12, arrayOfInt, i9);
        i14 = i11;
      }
      for (;;)
      {
        label326:
        boolean bool1 = a(this.b);
        boolean bool2 = a(this.c);
        int i15 = 0;
        if (bool1)
        {
          aif localaif9 = (aif)this.b.getLayoutParams();
          i15 = 0 + (localaif9.topMargin + this.b.getMeasuredHeight() + localaif9.bottomMargin);
        }
        aif localaif8;
        if (bool2) {
          localaif8 = (aif)this.c.getLayoutParams();
        }
        for (int i16 = i15 + (localaif8.topMargin + this.c.getMeasuredHeight() + localaif8.bottomMargin);; i16 = i15)
        {
          TextView localTextView1;
          label451:
          TextView localTextView2;
          label462:
          aif localaif1;
          aif localaif2;
          int i17;
          label515:
          int i69;
          int i71;
          if ((bool1) || (bool2))
          {
            if (!bool1) {
              break label997;
            }
            localTextView1 = this.b;
            if (!bool2) {
              break label1006;
            }
            localTextView2 = this.c;
            localaif1 = (aif)localTextView1.getLayoutParams();
            localaif2 = (aif)localTextView2.getLayoutParams();
            if (((!bool1) || (this.b.getMeasuredWidth() <= 0)) && ((!bool2) || (this.c.getMeasuredWidth() <= 0))) {
              break label1015;
            }
            i17 = 1;
            switch (0x70 & this.E)
            {
            default: 
              i69 = (i3 - i6 - i7 - i16) / 2;
              if (i69 < localaif1.topMargin + this.C) {
                i71 = localaif1.topMargin + this.C;
              }
              break;
            }
          }
          for (;;)
          {
            label590:
            int i18 = i6 + i71;
            label597:
            int i56;
            label613:
            int i58;
            int i68;
            if (i1 != 0) {
              if (i17 != 0)
              {
                i56 = this.A;
                int i57 = i56 - arrayOfInt[1];
                i58 = i13 - Math.max(0, i57);
                arrayOfInt[1] = Math.max(0, -i57);
                if (!bool1) {
                  break label1738;
                }
                aif localaif7 = (aif)this.b.getLayoutParams();
                int i66 = i58 - this.b.getMeasuredWidth();
                int i67 = i18 + this.b.getMeasuredHeight();
                this.b.layout(i66, i18, i58, i67);
                i68 = i66 - this.B;
                i18 = i67 + localaif7.bottomMargin;
              }
            }
            label932:
            label951:
            label970:
            label1738:
            for (int i59 = i68;; i59 = i58)
            {
              aif localaif6;
              int i65;
              if (bool2)
              {
                localaif6 = (aif)this.c.getLayoutParams();
                int i62 = i18 + localaif6.topMargin;
                int i63 = i58 - this.c.getMeasuredWidth();
                int i64 = i62 + this.c.getMeasuredHeight();
                this.c.layout(i63, i62, i58, i64);
                i65 = i58 - this.B;
              }
              for (int i60 = i65;; i60 = i58)
              {
                if (i17 != 0) {}
                for (int i61 = Math.min(i59, i60);; i61 = i58)
                {
                  i13 = i61;
                  a(this.J, 3);
                  int i24 = this.J.size();
                  int i25 = 0;
                  int i26 = i14;
                  label894:
                  int i19;
                  label997:
                  label1006:
                  label1015:
                  int i55;
                  label1138:
                  int i21;
                  for (;;)
                  {
                    if (i25 < i24)
                    {
                      i26 = a((View)this.J.get(i25), i26, arrayOfInt, i9);
                      i25++;
                      continue;
                      i1 = 0;
                      break;
                      i10 = a(this.d, i4, arrayOfInt, i9);
                      break label118;
                      i10 = a(this.g, i10, arrayOfInt, i9);
                      break label150;
                      i8 = b(this.a, i8, arrayOfInt, i9);
                      break label182;
                      i11 = a(this.h, i11, arrayOfInt, i9);
                      break label290;
                      int i72 = a(this.y, i11, arrayOfInt, i9);
                      i13 = i12;
                      i14 = i72;
                      break label326;
                      localTextView1 = this.c;
                      break label451;
                      localTextView2 = this.b;
                      break label462;
                      i17 = 0;
                      break label515;
                      i18 = getPaddingTop() + localaif1.topMargin + this.C;
                      break label597;
                      int i70 = i3 - i7 - i16 - i69 - i6;
                      if (i70 >= localaif1.bottomMargin + this.D) {
                        break label1745;
                      }
                      i71 = Math.max(0, i69 - (localaif2.bottomMargin + this.D - i70));
                      break label590;
                      i18 = i3 - i7 - localaif2.bottomMargin - this.D - i16;
                      break label597;
                      i56 = 0;
                      break label613;
                      if (i17 != 0)
                      {
                        i19 = this.A;
                        int i20 = i19 - arrayOfInt[0];
                        i14 += Math.max(0, i20);
                        arrayOfInt[0] = Math.max(0, -i20);
                        if (!bool1) {
                          break label1713;
                        }
                        aif localaif5 = (aif)this.b.getLayoutParams();
                        int i52 = i14 + this.b.getMeasuredWidth();
                        int i53 = i18 + this.b.getMeasuredHeight();
                        this.b.layout(i14, i18, i52, i53);
                        int i54 = i52 + this.B;
                        i55 = i53 + localaif5.bottomMargin;
                        i21 = i54;
                      }
                    }
                  }
                  for (int i22 = i55;; i22 = i18)
                  {
                    aif localaif4;
                    int i51;
                    if (bool2)
                    {
                      localaif4 = (aif)this.c.getLayoutParams();
                      int i48 = i22 + localaif4.topMargin;
                      int i49 = i14 + this.c.getMeasuredWidth();
                      int i50 = i48 + this.c.getMeasuredHeight();
                      this.c.layout(i14, i48, i49, i50);
                      i51 = i49 + this.B;
                    }
                    for (int i23 = i51;; i23 = i14)
                    {
                      if (i17 == 0) {
                        break label1711;
                      }
                      i14 = Math.max(i21, i23);
                      break;
                      i19 = 0;
                      break label1138;
                      a(this.J, 5);
                      int i27 = this.J.size();
                      int i28 = 0;
                      int i47;
                      for (int i29 = i13; i28 < i27; i29 = i47)
                      {
                        i47 = b((View)this.J.get(i28), i29, arrayOfInt, i9);
                        i28++;
                      }
                      a(this.J, 1);
                      ArrayList localArrayList = this.J;
                      int i30 = arrayOfInt[0];
                      int i31 = arrayOfInt[1];
                      int i32 = localArrayList.size();
                      int i33 = i31;
                      int i34 = i30;
                      int i35 = 0;
                      int i46;
                      for (int i36 = 0; i35 < i32; i36 = i46)
                      {
                        View localView = (View)localArrayList.get(i35);
                        aif localaif3 = (aif)localView.getLayoutParams();
                        int i42 = localaif3.leftMargin - i34;
                        int i43 = localaif3.rightMargin - i33;
                        int i44 = Math.max(0, i42);
                        int i45 = Math.max(0, i43);
                        i34 = Math.max(0, -i42);
                        i33 = Math.max(0, -i43);
                        i46 = i36 + (i45 + (i44 + localView.getMeasuredWidth()));
                        i35++;
                      }
                      int i37 = i4 + (i2 - i4 - i5) / 2 - i36 / 2;
                      int i38 = i37 + i36;
                      if (i37 < i26) {
                        i37 = i26;
                      }
                      for (;;)
                      {
                        int i39 = this.J.size();
                        int i40 = 0;
                        int i41 = i37;
                        while (i40 < i39)
                        {
                          i41 = a((View)this.J.get(i40), i41, arrayOfInt, i9);
                          i40++;
                        }
                        if (i38 > i29) {
                          i37 -= i38 - i29;
                        }
                      }
                      this.J.clear();
                      return;
                    }
                    break;
                    i21 = i14;
                  }
                }
              }
            }
            label1711:
            label1713:
            label1745:
            i71 = i69;
          }
        }
        label1759:
        i13 = i12;
        i14 = i11;
      }
      label1770:
      i10 = i4;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.K;
    int i1;
    int i2;
    int i3;
    int i35;
    int i4;
    if (aab.a(this))
    {
      i1 = 0;
      i2 = 1;
      if (!a(this.d)) {
        break label1087;
      }
      a(this.d, paramInt1, 0, paramInt2, 0, this.z);
      i3 = this.d.getMeasuredWidth() + b(this.d);
      i35 = Math.max(0, this.d.getMeasuredHeight() + c(this.d));
      ImageButton localImageButton2 = this.d;
      i4 = aab.a(0, nj.a.d(localImageButton2));
    }
    for (int i5 = i35;; i5 = 0)
    {
      if (a(this.g))
      {
        a(this.g, paramInt1, 0, paramInt2, 0, this.z);
        i3 = this.g.getMeasuredWidth() + b(this.g);
        i5 = Math.max(i5, this.g.getMeasuredHeight() + c(this.g));
        ImageButton localImageButton1 = this.g;
        i4 = aab.a(i4, nj.a.d(localImageButton1));
      }
      zk localzk1 = this.n;
      int i6;
      label215:
      zk localzk2;
      int i9;
      label355:
      int i10;
      int i12;
      int i13;
      int i14;
      label543:
      int i34;
      int i32;
      if (localzk1.g)
      {
        i6 = localzk1.b;
        int i7 = 0 + Math.max(i6, i3);
        arrayOfInt[i2] = Math.max(0, i6 - i3);
        boolean bool1 = a(this.a);
        int i8 = 0;
        if (bool1)
        {
          a(this.a, paramInt1, i7, paramInt2, 0, this.z);
          i8 = this.a.getMeasuredWidth() + b(this.a);
          i5 = Math.max(i5, this.a.getMeasuredHeight() + c(this.a));
          ActionMenuView localActionMenuView = this.a;
          i4 = aab.a(i4, nj.a.d(localActionMenuView));
        }
        localzk2 = this.n;
        if (!localzk2.g) {
          break label668;
        }
        i9 = localzk2.a;
        i10 = i7 + Math.max(i9, i8);
        arrayOfInt[i1] = Math.max(0, i9 - i8);
        if (a(this.h))
        {
          i10 += a(this.h, paramInt1, i10, paramInt2, 0, arrayOfInt);
          i5 = Math.max(i5, this.h.getMeasuredHeight() + c(this.h));
          View localView3 = this.h;
          i4 = aab.a(i4, nj.a.d(localView3));
        }
        if (a(this.y))
        {
          i10 += a(this.y, paramInt1, i10, paramInt2, 0, arrayOfInt);
          i5 = Math.max(i5, this.y.getMeasuredHeight() + c(this.y));
          ImageView localImageView = this.y;
          i4 = aab.a(i4, nj.a.d(localImageView));
        }
        int i11 = getChildCount();
        i12 = 0;
        i13 = i5;
        i14 = i4;
        if (i12 >= i11) {
          break label678;
        }
        View localView2 = getChildAt(i12);
        if ((((aif)localView2.getLayoutParams()).b != 0) || (!a(localView2))) {
          break label1076;
        }
        i10 += a(localView2, paramInt1, i10, paramInt2, 0, arrayOfInt);
        i34 = Math.max(i13, localView2.getMeasuredHeight() + c(localView2));
        i32 = aab.a(i14, nj.a.d(localView2));
      }
      for (int i33 = i34;; i33 = i13)
      {
        i12++;
        i14 = i32;
        i13 = i33;
        break label543;
        i1 = 1;
        i2 = 0;
        break;
        i6 = localzk1.a;
        break label215;
        label668:
        i9 = localzk2.b;
        break label355;
        label678:
        int i15 = this.C + this.D;
        int i16 = this.A + this.B;
        boolean bool2 = a(this.b);
        int i17 = 0;
        int i18 = 0;
        if (bool2)
        {
          a(this.b, paramInt1, i10 + i16, paramInt2, i15, arrayOfInt);
          i18 = this.b.getMeasuredWidth() + b(this.b);
          i17 = this.b.getMeasuredHeight() + c(this.b);
          TextView localTextView2 = this.b;
          i14 = aab.a(i14, nj.a.d(localTextView2));
        }
        if (a(this.c))
        {
          i18 = Math.max(i18, a(this.c, paramInt1, i10 + i16, paramInt2, i15 + i17, arrayOfInt));
          i17 += this.c.getMeasuredHeight() + c(this.c);
          TextView localTextView1 = this.c;
          i14 = aab.a(i14, nj.a.d(localTextView1));
        }
        int i19 = i18 + i10;
        int i20 = Math.max(i13, i17);
        int i21 = i19 + (getPaddingLeft() + getPaddingRight());
        int i22 = i20 + (getPaddingTop() + getPaddingBottom());
        int i23 = Math.max(i21, getSuggestedMinimumWidth());
        int i24 = 0xFF000000 & i14;
        int i25 = nj.a.a(i23, paramInt1, i24);
        int i26 = Math.max(i22, getSuggestedMinimumHeight());
        int i27 = i14 << 16;
        int i28 = nj.a.a(i26, paramInt2, i27);
        int i31;
        if (!this.w) {
          i31 = 0;
        }
        for (;;)
        {
          if (i31 != 0) {
            i28 = 0;
          }
          setMeasuredDimension(i25, i28);
          return;
          int i29 = getChildCount();
          for (int i30 = 0;; i30++)
          {
            if (i30 >= i29) {
              break label1070;
            }
            View localView1 = getChildAt(i30);
            if ((a(localView1)) && (localView1.getMeasuredWidth() > 0) && (localView1.getMeasuredHeight() > 0))
            {
              i31 = 0;
              break;
            }
          }
          label1070:
          i31 = 1;
        }
        label1076:
        i32 = i14;
      }
      label1087:
      i3 = 0;
      i4 = 0;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    aih localaih = (aih)paramParcelable;
    super.onRestoreInstanceState(localaih.getSuperState());
    if (this.a != null) {}
    for (xl localxl = this.a.a;; localxl = null)
    {
      if ((localaih.a != 0) && (this.t != null) && (localxl != null))
      {
        MenuItem localMenuItem = localxl.findItem(localaih.a);
        if (localMenuItem != null) {
          mm.c(localMenuItem);
        }
      }
      if (localaih.b)
      {
        removeCallbacks(this.N);
        post(this.N);
      }
      return;
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    int i1 = 1;
    if (Build.VERSION.SDK_INT >= 17) {
      super.onRtlPropertiesChanged(paramInt);
    }
    zk localzk = this.n;
    int i4;
    if (paramInt == i1) {
      if (i1 != localzk.g)
      {
        localzk.g = i1;
        if (!localzk.h) {
          break label176;
        }
        if (i1 == 0) {
          break label115;
        }
        if (localzk.d == -2147483648) {
          break label97;
        }
        i4 = localzk.d;
        label64:
        localzk.a = i4;
        if (localzk.c == -2147483648) {
          break label106;
        }
      }
    }
    label97:
    label106:
    for (int i5 = localzk.c;; i5 = localzk.f)
    {
      localzk.b = i5;
      return;
      i1 = 0;
      break;
      i4 = localzk.e;
      break label64;
    }
    label115:
    int i2;
    if (localzk.c != -2147483648)
    {
      i2 = localzk.c;
      localzk.a = i2;
      if (localzk.d == -2147483648) {
        break label167;
      }
    }
    label167:
    for (int i3 = localzk.d;; i3 = localzk.f)
    {
      localzk.b = i3;
      return;
      i2 = localzk.e;
      break;
    }
    label176:
    localzk.a = localzk.e;
    localzk.b = localzk.f;
  }
  
  protected Parcelable onSaveInstanceState()
  {
    aih localaih = new aih(super.onSaveInstanceState());
    if ((this.t != null) && (this.t.a != null)) {
      localaih.a = this.t.a.getItemId();
    }
    localaih.b = a();
    return localaih;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ms.a(paramMotionEvent);
    if (i1 == 0) {
      this.H = false;
    }
    if (!this.H)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i1 == 0) && (!bool)) {
        this.H = true;
      }
    }
    if ((i1 == 1) || (i1 == 3)) {
      this.H = false;
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.Toolbar
 * JD-Core Version:    0.7.0.1
 */