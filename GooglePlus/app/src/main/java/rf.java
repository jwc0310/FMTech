import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class rf
  extends ViewGroup
  implements rt
{
  private static ri G;
  static final int[] a;
  static final boolean b;
  private static final boolean i;
  private boolean A;
  private Drawable B = null;
  private Drawable C = null;
  private Drawable D = null;
  private Drawable E = null;
  private final ArrayList<View> F;
  final tl c;
  final tl d;
  int e;
  boolean f;
  public rl g;
  public Drawable h;
  private final rh j = new rh(this);
  private float k;
  private int l;
  private int m = -1728053248;
  private float n;
  private Paint o = new Paint();
  private final rp p;
  private final rp q;
  private boolean r;
  private boolean s = true;
  private int t;
  private int u;
  private float v;
  private float w;
  private Drawable x;
  private Drawable y;
  private Object z;
  
  static
  {
    boolean bool1 = true;
    int[] arrayOfInt = new int[bool1];
    arrayOfInt[0] = 16842931;
    a = arrayOfInt;
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool2 = bool1;
      b = bool2;
      if (Build.VERSION.SDK_INT < 21) {
        break label65;
      }
    }
    for (;;)
    {
      i = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label70;
      }
      G = new rj();
      return;
      bool2 = false;
      break;
      label65:
      bool1 = false;
    }
    label70:
    G = new rk();
  }
  
  public rf(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public rf(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public rf(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.l = ((int)(0.5F + 64.0F * f1));
    float f2 = 400.0F * f1;
    this.p = new rp(this, 3);
    this.q = new rp(this, 5);
    this.c = tl.a(this, 1.0F, this.p);
    this.c.j = 1;
    this.c.h = f2;
    this.p.b = this.c;
    this.d = tl.a(this, 1.0F, this.q);
    this.d.j = 2;
    this.d.h = f2;
    this.q.b = this.d;
    setFocusableInTouchMode(true);
    nj.a.c(this, 1);
    rg localrg = new rg(this);
    nj.a.a(this, localrg);
    nz.a.a(this, false);
    if (nj.a.r(this))
    {
      G.a(this);
      this.h = G.a(paramContext);
    }
    this.k = (f1 * 10.0F);
    this.F = new ArrayList();
  }
  
  private void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool = false;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      rm localrm = (rm)localView.getLayoutParams();
      if ((d(localView)) && ((!paramBoolean) || (localrm.c)))
      {
        int i3 = localView.getWidth();
        if (!a(localView, 3)) {
          break label103;
        }
        bool |= this.c.a(localView, -i3, localView.getTop());
      }
      for (;;)
      {
        localrm.c = false;
        i2++;
        break;
        label103:
        bool |= this.d.a(localView, getWidth(), localView.getTop());
      }
    }
    rp localrp1 = this.p;
    localrp1.d.removeCallbacks(localrp1.c);
    rp localrp2 = this.q;
    localrp2.d.removeCallbacks(localrp2.c);
    if (bool) {
      invalidate();
    }
  }
  
  static float b(View paramView)
  {
    return ((rm)paramView.getLayoutParams()).b;
  }
  
  private View b()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (((rm)localView.getLayoutParams()).d) {
        return localView;
      }
    }
    return null;
  }
  
  public static boolean d(View paramView)
  {
    int i1 = ((rm)paramView.getLayoutParams()).a;
    int i2 = nj.a.t(paramView);
    return (0x7 & lt.a.a(i1, i2)) != 0;
  }
  
  private static String e(int paramInt)
  {
    if ((paramInt & 0x3) == 3) {
      return "LEFT";
    }
    if ((paramInt & 0x5) == 5) {
      return "RIGHT";
    }
    return Integer.toHexString(paramInt);
  }
  
  private static boolean j(View paramView)
  {
    return ((rm)paramView.getLayoutParams()).a == 0;
  }
  
  public final int a(View paramView)
  {
    int i1 = c(paramView);
    if (i1 == 3) {
      return this.t;
    }
    if (i1 == 5) {
      return this.u;
    }
    return 0;
  }
  
  final View a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if ((d(localView)) && (h(localView))) {
        return localView;
      }
    }
    return null;
  }
  
  public final View a(int paramInt)
  {
    int i1 = nj.a.t(this);
    int i2 = 0x7 & lt.a.a(paramInt, i1);
    int i3 = getChildCount();
    for (int i4 = 0; i4 < i3; i4++)
    {
      View localView = getChildAt(i4);
      if ((0x7 & c(localView)) == i2) {
        return localView;
      }
    }
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i1 = nj.a.t(this);
    int i2 = lt.a.a(paramInt2, i1);
    tl localtl;
    if (i2 == 3)
    {
      this.t = paramInt1;
      if (paramInt1 != 0)
      {
        if (i2 != 3) {
          break label91;
        }
        localtl = this.c;
        label47:
        localtl.a();
      }
      switch (paramInt1)
      {
      }
    }
    label91:
    View localView1;
    do
    {
      View localView2;
      do
      {
        return;
        if (i2 != 5) {
          break;
        }
        this.u = paramInt1;
        break;
        localtl = this.d;
        break label47;
        localView2 = a(i2);
      } while (localView2 == null);
      e(localView2);
      return;
      localView1 = a(i2);
    } while (localView1 == null);
    f(localView1);
  }
  
  final void a(View paramView, float paramFloat)
  {
    rm localrm = (rm)paramView.getLayoutParams();
    if (paramFloat == localrm.b) {}
    do
    {
      return;
      localrm.b = paramFloat;
    } while (this.g == null);
    this.g.a(paramView, paramFloat);
  }
  
  final void a(View paramView, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      if (((!paramBoolean) && (!d(localView))) || ((paramBoolean) && (localView == paramView))) {
        nj.a.c(localView, 1);
      }
      for (;;)
      {
        i2++;
        break;
        nj.a.c(localView, 4);
      }
    }
  }
  
  public final void a(Object paramObject, boolean paramBoolean)
  {
    this.z = paramObject;
    this.A = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      requestLayout();
      return;
    }
  }
  
  final boolean a(View paramView, int paramInt)
  {
    return (paramInt & c(paramView)) == paramInt;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (getDescendantFocusability() == 393216) {
      return;
    }
    int i2 = getChildCount();
    int i3 = 0;
    int i4 = 0;
    if (i3 < i2)
    {
      View localView2 = getChildAt(i3);
      if (d(localView2)) {
        if (g(localView2))
        {
          i4 = 1;
          localView2.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
      for (;;)
      {
        i3++;
        break;
        this.F.add(localView2);
      }
    }
    if (i4 == 0)
    {
      int i5 = this.F.size();
      while (i1 < i5)
      {
        View localView1 = (View)this.F.get(i1);
        if (localView1.getVisibility() == 0) {
          localView1.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
        i1++;
      }
    }
    this.F.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((b() != null) || (d(paramView))) {
      nj.a.c(paramView, 4);
    }
    for (;;)
    {
      if (!b)
      {
        rh localrh = this.j;
        nj.a.a(paramView, localrh);
      }
      return;
      nj.a.c(paramView, 1);
    }
  }
  
  public final void b(int paramInt)
  {
    View localView = a(8388611);
    if (localView == null) {
      throw new IllegalArgumentException("No drawer view found with gravity " + e(8388611));
    }
    e(localView);
  }
  
  final int c(View paramView)
  {
    int i1 = ((rm)paramView.getLayoutParams()).a;
    int i2 = nj.a.t(this);
    return lt.a.a(i1, i2);
  }
  
  public final void c(int paramInt)
  {
    View localView = a(8388611);
    if (localView == null) {
      throw new IllegalArgumentException("No drawer view found with gravity " + e(8388611));
    }
    f(localView);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof rm)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    int i1 = getChildCount();
    float f1 = 0.0F;
    for (int i2 = 0; i2 < i1; i2++) {
      f1 = Math.max(f1, ((rm)getChildAt(i2).getLayoutParams()).b);
    }
    this.n = f1;
    if ((this.c.a(true) | this.d.a(true))) {
      nj.a.l(this);
    }
  }
  
  public final boolean d(int paramInt)
  {
    View localView = a(paramInt);
    if (localView != null) {
      return g(localView);
    }
    return false;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = j(paramView);
    int i2 = getWidth();
    int i3 = paramCanvas.save();
    int i4 = 0;
    int i15;
    View localView;
    int i17;
    label94:
    int i18;
    if (bool1)
    {
      int i14 = getChildCount();
      i15 = 0;
      if (i15 < i14)
      {
        localView = getChildAt(i15);
        if ((localView != paramView) && (localView.getVisibility() == 0))
        {
          Drawable localDrawable = localView.getBackground();
          if (localDrawable != null) {
            if (localDrawable.getOpacity() == -1)
            {
              i17 = 1;
              if ((i17 == 0) || (!d(localView)) || (localView.getHeight() < i1)) {
                break label185;
              }
              if (!a(localView, 3)) {
                break label171;
              }
              i18 = localView.getRight();
              if (i18 <= i4) {
                break label520;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      i4 = i18;
      int i16 = i2;
      for (;;)
      {
        i15++;
        i2 = i16;
        break;
        i17 = 0;
        break label94;
        i17 = 0;
        break label94;
        label171:
        i16 = localView.getLeft();
        if (i16 >= i2) {
          label185:
          i16 = i2;
        }
      }
      paramCanvas.clipRect(i4, 0, i2, getHeight());
      int i5 = i2;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i3);
      if ((this.n > 0.0F) && (bool1))
      {
        int i13 = (int)(((0xFF000000 & this.m) >>> 24) * this.n) << 24 | 0xFFFFFF & this.m;
        this.o.setColor(i13);
        paramCanvas.drawRect(i4, 0.0F, i5, getHeight(), this.o);
      }
      do
      {
        return bool2;
        if ((this.x != null) && (a(paramView, 3)))
        {
          int i10 = this.x.getIntrinsicWidth();
          int i11 = paramView.getRight();
          int i12 = this.c.i;
          float f2 = Math.max(0.0F, Math.min(i11 / i12, 1.0F));
          this.x.setBounds(i11, paramView.getTop(), i10 + i11, paramView.getBottom());
          this.x.setAlpha((int)(255.0F * f2));
          this.x.draw(paramCanvas);
          return bool2;
        }
      } while ((this.y == null) || (!a(paramView, 5)));
      int i6 = this.y.getIntrinsicWidth();
      int i7 = paramView.getLeft();
      int i8 = getWidth() - i7;
      int i9 = this.d.i;
      float f1 = Math.max(0.0F, Math.min(i8 / i9, 1.0F));
      this.y.setBounds(i7 - i6, paramView.getTop(), i7, paramView.getBottom());
      this.y.setAlpha((int)(255.0F * f1));
      this.y.draw(paramCanvas);
      return bool2;
      label520:
      i18 = i4;
    }
  }
  
  public final void e(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    if (this.s)
    {
      rm localrm = (rm)paramView.getLayoutParams();
      localrm.b = 1.0F;
      localrm.d = true;
      a(paramView, true);
    }
    for (;;)
    {
      invalidate();
      return;
      if (a(paramView, 3)) {
        this.c.a(paramView, 0, paramView.getTop());
      } else {
        this.d.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
      }
    }
  }
  
  public final void f(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    if (this.s)
    {
      rm localrm = (rm)paramView.getLayoutParams();
      localrm.b = 0.0F;
      localrm.d = false;
    }
    for (;;)
    {
      invalidate();
      return;
      if (a(paramView, 3)) {
        this.c.a(paramView, -paramView.getWidth(), paramView.getTop());
      } else {
        this.d.a(paramView, getWidth(), paramView.getTop());
      }
    }
  }
  
  public final boolean g(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return ((rm)paramView.getLayoutParams()).d;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new rm(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new rm(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof rm)) {
      return new rm((rm)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new rm((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new rm(paramLayoutParams);
  }
  
  public final boolean h(View paramView)
  {
    if (!d(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return ((rm)paramView.getLayoutParams()).b > 0.0F;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.s = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.s = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.A) && (this.h != null))
    {
      int i1 = G.a(this.z);
      if (i1 > 0)
      {
        this.h.setBounds(0, 0, getWidth(), i1);
        this.h.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ms.a(paramMotionEvent);
    boolean bool1 = this.c.a(paramMotionEvent) | this.d.a(paramMotionEvent);
    label59:
    int i4;
    label77:
    int i5;
    switch (i1)
    {
    default: 
      i2 = 0;
      if ((!bool1) && (i2 == 0))
      {
        int i3 = getChildCount();
        i4 = 0;
        if (i4 >= i3) {
          break label423;
        }
        if (!((rm)getChildAt(i4).getLayoutParams()).c) {
          break;
        }
        i5 = 1;
        if (i5 == 0)
        {
          boolean bool3 = this.f;
          bool2 = false;
          if (!bool3) {
            break label127;
          }
        }
      }
      boolean bool2 = true;
      return bool2;
    case 0: 
      label105:
      label127:
      float f3 = paramMotionEvent.getX();
      float f4 = paramMotionEvent.getY();
      this.v = f3;
      this.w = f4;
      if (this.n > 0.0F)
      {
        View localView = this.c.b((int)f3, (int)f4);
        if ((localView == null) || (!j(localView))) {}
      }
      break;
    }
    for (int i2 = 1;; i2 = 0)
    {
      this.f = false;
      break label59;
      tl localtl = this.c;
      int i6 = localtl.c.length;
      int i7 = 0;
      label219:
      int i9;
      label242:
      int i10;
      if (i7 < i6) {
        if ((localtl.g & 1 << i7) != 0)
        {
          i9 = 1;
          if (i9 == 0) {
            break label386;
          }
          float f1 = localtl.e[i7] - localtl.c[i7];
          float f2 = localtl.f[i7] - localtl.d[i7];
          if (f1 * f1 + f2 * f2 <= localtl.b * localtl.b) {
            break label380;
          }
          i10 = 1;
          label315:
          if (i10 == 0) {
            break label392;
          }
        }
      }
      for (int i8 = 1; i8 != 0; i8 = 0)
      {
        rp localrp1 = this.p;
        localrp1.d.removeCallbacks(localrp1.c);
        rp localrp2 = this.q;
        localrp2.d.removeCallbacks(localrp2.c);
        i2 = 0;
        break label59;
        i9 = 0;
        break label242;
        label380:
        i10 = 0;
        break label315;
        label386:
        i10 = 0;
        break label315;
        label392:
        i7++;
        break label219;
      }
      a(true);
      this.f = false;
      break;
      i4++;
      break label77;
      label423:
      i5 = 0;
      break label105;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (a() != null) {}
      for (int i1 = 1; i1 != 0; i1 = 0)
      {
        lx.a.a(paramKeyEvent);
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      View localView = a();
      if ((localView != null) && (a(localView) == 0)) {
        a(false);
      }
      boolean bool = false;
      if (localView != null) {
        bool = true;
      }
      return bool;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.r = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    int i3 = 0;
    while (i3 < i2)
    {
      View localView = getChildAt(i3);
      rm localrm;
      if (localView.getVisibility() != 8)
      {
        localrm = (rm)localView.getLayoutParams();
        if (j(localView)) {
          localView.layout(localrm.leftMargin, localrm.topMargin, localrm.leftMargin + localView.getMeasuredWidth(), localrm.topMargin + localView.getMeasuredHeight());
        }
      }
      else
      {
        i3++;
        continue;
      }
      int i4 = localView.getMeasuredWidth();
      int i5 = localView.getMeasuredHeight();
      int i6;
      float f1;
      label158:
      int i7;
      if (a(localView, 3))
      {
        i6 = -i4 + (int)(i4 * localrm.b);
        f1 = (i4 + i6) / i4;
        if (f1 == localrm.b) {
          break label309;
        }
        i7 = 1;
        label172:
        switch (0x70 & localrm.a)
        {
        default: 
          localView.layout(i6, localrm.topMargin, i4 + i6, i5 + localrm.topMargin);
          label233:
          if (i7 != 0) {
            a(localView, f1);
          }
          if (localrm.b <= 0.0F) {
            break;
          }
        }
      }
      for (int i10 = 0; localView.getVisibility() != i10; i10 = 4)
      {
        localView.setVisibility(i10);
        break;
        i6 = i1 - (int)(i4 * localrm.b);
        f1 = (i1 - i6) / i4;
        break label158;
        label309:
        i7 = 0;
        break label172;
        int i11 = paramInt4 - paramInt2;
        localView.layout(i6, i11 - localrm.bottomMargin - localView.getMeasuredHeight(), i4 + i6, i11 - localrm.bottomMargin);
        break label233;
        int i8 = paramInt4 - paramInt2;
        int i9 = (i8 - i5) / 2;
        if (i9 < localrm.topMargin) {
          i9 = localrm.topMargin;
        }
        for (;;)
        {
          localView.layout(i6, i9, i4 + i6, i5 + i9);
          break;
          if (i9 + i5 > i8 - localrm.bottomMargin) {
            i9 = i8 - localrm.bottomMargin - i5;
          }
        }
      }
    }
    this.r = false;
    this.s = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 300;
    int i2 = 0;
    int i3 = View.MeasureSpec.getMode(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i5 = View.MeasureSpec.getSize(paramInt1);
    int i6 = View.MeasureSpec.getSize(paramInt2);
    if ((i3 != 1073741824) || (i4 != 1073741824)) {
      if (isInEditMode())
      {
        if ((i3 != -2147483648) && (i3 == 0)) {
          i5 = i1;
        }
        if ((i4 == -2147483648) || (i4 != 0)) {
          break label509;
        }
      }
    }
    for (;;)
    {
      setMeasuredDimension(i5, i1);
      int i7;
      label125:
      View localView;
      rm localrm;
      int i12;
      if ((this.z != null) && (nj.a.r(this)))
      {
        i7 = 1;
        int i8 = nj.a.t(this);
        int i9 = getChildCount();
        if (i2 >= i9) {
          break label508;
        }
        localView = getChildAt(i2);
        if (localView.getVisibility() != 8)
        {
          localrm = (rm)localView.getLayoutParams();
          if (i7 != 0)
          {
            int i11 = localrm.a;
            i12 = lt.a.a(i11, i8);
            if (!nj.a.r(localView)) {
              break label288;
            }
            G.a(localView, this.z, i12);
          }
          label213:
          if (!j(localView)) {
            break label307;
          }
          localView.measure(View.MeasureSpec.makeMeasureSpec(i5 - localrm.leftMargin - localrm.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - localrm.topMargin - localrm.bottomMargin, 1073741824));
        }
      }
      for (;;)
      {
        i2++;
        break label125;
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        i7 = 0;
        break;
        label288:
        G.a(localrm, this.z, i12);
        break label213;
        label307:
        if (!d(localView)) {
          break label465;
        }
        if ((i) && (nj.a.A(localView) != this.k))
        {
          float f1 = this.k;
          nj.a.f(localView, f1);
        }
        int i10 = 0x7 & c(localView);
        if ((i10 & 0x0) != 0) {
          throw new IllegalStateException("Child drawer has absolute gravity " + e(i10) + " but this DrawerLayout" + " already has a drawer view along that edge");
        }
        localView.measure(getChildMeasureSpec(paramInt1, this.l + localrm.leftMargin + localrm.rightMargin, localrm.width), getChildMeasureSpec(paramInt2, localrm.topMargin + localrm.bottomMargin, localrm.height));
      }
      label465:
      throw new IllegalStateException("Child " + localView + " at index " + i2 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
      label508:
      return;
      label509:
      i1 = i6;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    rn localrn = (rn)paramParcelable;
    super.onRestoreInstanceState(localrn.getSuperState());
    if (localrn.a != 0)
    {
      View localView = a(localrn.a);
      if (localView != null) {
        e(localView);
      }
    }
    a(localrn.b, 3);
    a(localrn.c, 5);
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    if (!i)
    {
      nj.a.t(this);
      this.x = null;
      nj.a.t(this);
      this.y = null;
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    rn localrn = new rn(super.onSaveInstanceState());
    View localView = b();
    if (localView != null) {
      localrn.a = ((rm)localView.getLayoutParams()).a;
    }
    localrn.b = this.t;
    localrn.c = this.u;
    return localrn;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.c.b(paramMotionEvent);
    this.d.b(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 2: 
    default: 
      return true;
    case 0: 
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.v = f5;
      this.w = f6;
      this.f = false;
      return true;
    case 1: 
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      View localView1 = this.c.b((int)f1, (int)f2);
      if ((localView1 != null) && (j(localView1)))
      {
        float f3 = f1 - this.v;
        float f4 = f2 - this.w;
        int i1 = this.c.b;
        if (f3 * f3 + f4 * f4 < i1 * i1)
        {
          View localView2 = b();
          if (localView2 != null)
          {
            int i2 = a(localView2);
            bool = false;
            if (i2 != 2) {
              break;
            }
          }
        }
      }
      break;
    }
    for (boolean bool = true;; bool = true)
    {
      a(bool);
      return true;
      a(true);
      this.f = false;
      return true;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean) {
      a(true);
    }
  }
  
  public void requestLayout()
  {
    if (!this.r) {
      super.requestLayout();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rf
 * JD-Core Version:    0.7.0.1
 */