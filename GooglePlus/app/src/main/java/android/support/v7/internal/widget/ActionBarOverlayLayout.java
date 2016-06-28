package android.support.v7.internal.widget;

import aab;
import aau;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import efj;
import mz;
import na;
import nj;
import ns;
import ov;
import pg;
import sp;
import sq;
import ya;
import yl;
import ym;
import yn;
import yo;
import yp;
import zd;
import ze;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements mz, zd
{
  private static int[] z;
  private final na A;
  public int a = 0;
  public ActionBarContainer b;
  public boolean c;
  public boolean d;
  public boolean e;
  public int f;
  public yo g;
  public ov h;
  public final pg i = new yl(this);
  private int j;
  private ContentFrameLayout k;
  private ze l;
  private Drawable m;
  private boolean n;
  private boolean o;
  private int p;
  private final Rect q = new Rect();
  private final Rect r = new Rect();
  private final Rect s = new Rect();
  private final Rect t = new Rect();
  private final Rect u = new Rect();
  private final Rect v = new Rect();
  private sp w;
  private final Runnable x = new ym(this);
  private final Runnable y = new yn(this);
  
  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = aau.r;
    arrayOfInt[1] = 16842841;
    z = arrayOfInt;
  }
  
  public ActionBarOverlayLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    this.A = new na(this);
  }
  
  public static void a() {}
  
  private final void a(Context paramContext)
  {
    int i1 = 1;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(z);
    this.j = localTypedArray.getDimensionPixelSize(0, 0);
    this.m = localTypedArray.getDrawable(i1);
    if (this.m == null)
    {
      int i2 = i1;
      setWillNotDraw(i2);
      localTypedArray.recycle();
      if (paramContext.getApplicationInfo().targetSdkVersion >= 19) {
        break label92;
      }
    }
    for (;;)
    {
      this.n = i1;
      this.w = new sp(paramContext, null);
      return;
      int i3 = 0;
      break;
      label92:
      i1 = 0;
    }
  }
  
  private static boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    yp localyp = (yp)paramView.getLayoutParams();
    int i1 = localyp.leftMargin;
    int i2 = paramRect.left;
    boolean bool = false;
    if (i1 != i2)
    {
      localyp.leftMargin = paramRect.left;
      bool = true;
    }
    if (localyp.topMargin != paramRect.top)
    {
      localyp.topMargin = paramRect.top;
      bool = true;
    }
    if (localyp.rightMargin != paramRect.right)
    {
      localyp.rightMargin = paramRect.right;
      bool = true;
    }
    if ((paramBoolean3) && (localyp.bottomMargin != paramRect.bottom))
    {
      localyp.bottomMargin = paramRect.bottom;
      return true;
    }
    return bool;
  }
  
  private void b(int paramInt)
  {
    c();
    int i1 = Math.max(0, Math.min(paramInt, this.b.getHeight()));
    ActionBarContainer localActionBarContainer = this.b;
    float f1 = -i1;
    nj.a.b(localActionBarContainer, f1);
  }
  
  private void k()
  {
    View localView;
    if (this.k == null)
    {
      this.k = ((ContentFrameLayout)findViewById(efj.ac));
      this.b = ((ActionBarContainer)findViewById(efj.ad));
      localView = findViewById(efj.ab);
      if (!(localView instanceof ze)) {
        break label61;
      }
    }
    for (ze localze = (ze)localView;; localze = ((Toolbar)localView).h())
    {
      this.l = localze;
      return;
      label61:
      if (!(localView instanceof Toolbar)) {
        break;
      }
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + localView.getClass().getSimpleName());
  }
  
  public final void a(int paramInt)
  {
    boolean bool = true;
    k();
    switch (paramInt)
    {
    case 2: 
    case 5: 
    default: 
      return;
    }
    this.c = bool;
    if (getContext().getApplicationInfo().targetSdkVersion < 19) {}
    for (;;)
    {
      this.n = bool;
      return;
      bool = false;
    }
  }
  
  public final void a(Menu paramMenu, ya paramya)
  {
    k();
    this.l.a(paramMenu, paramya);
  }
  
  public final void a(Window.Callback paramCallback)
  {
    k();
    this.l.a(paramCallback);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    k();
    this.l.a(paramCharSequence);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean != this.o)
    {
      this.o = paramBoolean;
      if (!paramBoolean)
      {
        c();
        b(0);
      }
    }
  }
  
  public final int b()
  {
    if (this.b != null)
    {
      ActionBarContainer localActionBarContainer = this.b;
      return -(int)nj.a.f(localActionBarContainer);
    }
    return 0;
  }
  
  public final void c()
  {
    removeCallbacks(this.x);
    removeCallbacks(this.y);
    if (this.h != null) {
      this.h.a();
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof yp;
  }
  
  public final boolean d()
  {
    k();
    return this.l.e();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    float f1;
    ActionBarContainer localActionBarContainer;
    if ((this.m != null) && (!this.n))
    {
      if (this.b.getVisibility() != 0) {
        break label91;
      }
      f1 = this.b.getBottom();
      localActionBarContainer = this.b;
    }
    label91:
    for (int i1 = (int)(0.5F + (f1 + nj.a.f(localActionBarContainer)));; i1 = 0)
    {
      this.m.setBounds(0, i1, getWidth(), i1 + this.m.getIntrinsicHeight());
      this.m.draw(paramCanvas);
      return;
    }
  }
  
  public final boolean e()
  {
    k();
    return this.l.f();
  }
  
  public final boolean f()
  {
    k();
    return this.l.g();
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    k();
    nj.a.w(this);
    boolean bool = a(this.b, paramRect, true, true, false, true);
    this.t.set(paramRect);
    aab.a(this, this.t, this.q);
    if (!this.r.equals(this.q))
    {
      this.r.set(this.q);
      bool = true;
    }
    if (bool) {
      requestLayout();
    }
    return true;
  }
  
  public final boolean g()
  {
    k();
    return this.l.h();
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new yp(paramLayoutParams);
  }
  
  public int getNestedScrollAxes()
  {
    return this.A.a;
  }
  
  public final boolean h()
  {
    k();
    return this.l.i();
  }
  
  public final void i()
  {
    k();
    this.l.j();
  }
  
  public final void j()
  {
    k();
    this.l.k();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    a(getContext());
    nj.a.q(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    c();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = getPaddingLeft();
    getPaddingRight();
    int i3 = getPaddingTop();
    getPaddingBottom();
    for (int i4 = 0; i4 < i1; i4++)
    {
      View localView = getChildAt(i4);
      if (localView.getVisibility() != 8)
      {
        yp localyp = (yp)localView.getLayoutParams();
        int i5 = localView.getMeasuredWidth();
        int i6 = localView.getMeasuredHeight();
        int i7 = i2 + localyp.leftMargin;
        int i8 = i3 + localyp.topMargin;
        localView.layout(i7, i8, i5 + i7, i6 + i8);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    k();
    measureChildWithMargins(this.b, paramInt1, 0, paramInt2, 0);
    yp localyp1 = (yp)this.b.getLayoutParams();
    int i1 = Math.max(0, this.b.getMeasuredWidth() + localyp1.leftMargin + localyp1.rightMargin);
    int i2 = Math.max(0, this.b.getMeasuredHeight() + localyp1.topMargin + localyp1.bottomMargin);
    ActionBarContainer localActionBarContainer = this.b;
    int i3 = aab.a(0, nj.a.d(localActionBarContainer));
    int i4;
    int i5;
    if ((0x100 & nj.a.w(this)) != 0)
    {
      i4 = 1;
      if (i4 == 0) {
        break label455;
      }
      i5 = this.j;
      if ((this.d) && (this.b.a != null)) {
        i5 += this.j;
      }
    }
    for (;;)
    {
      label147:
      this.s.set(this.q);
      this.u.set(this.t);
      Rect localRect4;
      if ((!this.c) && (i4 == 0))
      {
        Rect localRect3 = this.s;
        localRect3.top = (i5 + localRect3.top);
        localRect4 = this.s;
      }
      label455:
      Rect localRect2;
      for (localRect4.bottom = localRect4.bottom;; localRect2.bottom = localRect2.bottom)
      {
        a(this.k, this.s, true, true, true, true);
        if (!this.v.equals(this.u))
        {
          this.v.set(this.u);
          this.k.a(this.u);
        }
        measureChildWithMargins(this.k, paramInt1, 0, paramInt2, 0);
        yp localyp2 = (yp)this.k.getLayoutParams();
        int i6 = Math.max(i1, this.k.getMeasuredWidth() + localyp2.leftMargin + localyp2.rightMargin);
        int i7 = Math.max(i2, this.k.getMeasuredHeight() + localyp2.topMargin + localyp2.bottomMargin);
        ContentFrameLayout localContentFrameLayout = this.k;
        int i8 = aab.a(i3, nj.a.d(localContentFrameLayout));
        int i9 = i6 + (getPaddingLeft() + getPaddingRight());
        int i10 = Math.max(i7 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        int i11 = Math.max(i9, getSuggestedMinimumWidth());
        int i12 = nj.a.a(i11, paramInt1, i8);
        int i13 = i8 << 16;
        setMeasuredDimension(i12, nj.a.a(i10, paramInt2, i13));
        return;
        i4 = 0;
        break;
        if (this.b.getVisibility() == 8) {
          break label517;
        }
        i5 = this.b.getMeasuredHeight();
        break label147;
        Rect localRect1 = this.u;
        localRect1.top = (i5 + localRect1.top);
        localRect2 = this.u;
      }
      label517:
      i5 = 0;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((!this.o) || (!paramBoolean)) {
      return false;
    }
    this.w.a(0, 0, 0, (int)paramFloat2, 0, 0, -2147483648, 2147483647);
    sp localsp = this.w;
    int i1 = localsp.b.h(localsp.a);
    int i2 = this.b.getHeight();
    int i3 = 0;
    if (i1 > i2) {
      i3 = 1;
    }
    if (i3 != 0)
    {
      c();
      this.y.run();
    }
    for (;;)
    {
      this.e = true;
      return true;
      c();
      this.x.run();
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.p = (paramInt2 + this.p);
    b(this.p);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.A.a = paramInt;
    this.p = b();
    c();
    if (this.g != null) {
      this.g.l();
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (this.b.getVisibility() != 0)) {
      return false;
    }
    return this.o;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    if ((this.o) && (!this.e))
    {
      if (this.p <= this.b.getHeight())
      {
        c();
        postDelayed(this.x, 600L);
      }
    }
    else {
      return;
    }
    c();
    postDelayed(this.y, 600L);
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool1 = true;
    if (Build.VERSION.SDK_INT >= 16) {
      super.onWindowSystemUiVisibilityChanged(paramInt);
    }
    k();
    int i1 = paramInt ^ this.f;
    this.f = paramInt;
    boolean bool2;
    boolean bool3;
    if ((paramInt & 0x4) == 0)
    {
      bool2 = bool1;
      if ((paramInt & 0x100) == 0) {
        break label125;
      }
      bool3 = bool1;
      label51:
      if (this.g != null)
      {
        yo localyo = this.g;
        if (bool3) {
          break label131;
        }
        label69:
        localyo.i(bool1);
        if ((!bool2) && (bool3)) {
          break label136;
        }
        this.g.j();
      }
    }
    for (;;)
    {
      if (((i1 & 0x100) != 0) && (this.g != null)) {
        nj.a.q(this);
      }
      return;
      bool2 = false;
      break;
      label125:
      bool3 = false;
      break label51;
      label131:
      bool1 = false;
      break label69;
      label136:
      this.g.k();
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.a = paramInt;
    if (this.g != null) {
      this.g.f(paramInt);
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarOverlayLayout
 * JD-Core Version:    0.7.0.1
 */