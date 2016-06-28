package android.support.v7.widget;

import aab;
import acl;
import acu;
import acv;
import acw;
import acx;
import acy;
import aeu;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import xl;
import xm;
import xn;
import xp;
import ya;
import yb;

public class ActionMenuView
  extends aeu
  implements xn, yb
{
  public xl a;
  public boolean b;
  public acl c;
  ya d;
  public xm e;
  public acy f;
  private Context j;
  private int k;
  private boolean l;
  private int m;
  private int n;
  private int o;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.g = false;
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.n = ((int)(56.0F * f1));
    this.o = ((int)(f1 * 4.0F));
    this.j = paramContext;
    this.k = 0;
  }
  
  public static acw a()
  {
    acw localacw = new acw(-2, -2);
    localacw.h = 16;
    return localacw;
  }
  
  private boolean c(int paramInt)
  {
    if (paramInt == 0) {
      return false;
    }
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    int i = getChildCount();
    boolean bool1 = false;
    if (paramInt < i)
    {
      boolean bool2 = localView1 instanceof acu;
      bool1 = false;
      if (bool2) {
        bool1 = false | ((acu)localView1).d();
      }
    }
    if ((paramInt > 0) && ((localView2 instanceof acu))) {
      return bool1 | ((acu)localView2).c();
    }
    return bool1;
  }
  
  public final acw a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      if ((paramLayoutParams instanceof acw)) {}
      for (acw localacw = new acw((acw)paramLayoutParams);; localacw = new acw(paramLayoutParams))
      {
        if (localacw.h <= 0) {
          localacw.h = 16;
        }
        return localacw;
      }
    }
    return a();
  }
  
  public final void a(int paramInt)
  {
    if (this.k != paramInt)
    {
      this.k = paramInt;
      if (paramInt == 0) {
        this.j = getContext();
      }
    }
    else
    {
      return;
    }
    this.j = new ContextThemeWrapper(getContext(), paramInt);
  }
  
  public final void a(xl paramxl)
  {
    this.a = paramxl;
  }
  
  public final boolean a(xp paramxp)
  {
    return this.a.a(paramxp, null, 0);
  }
  
  public final Menu b()
  {
    acl localacl2;
    if (this.a == null)
    {
      Context localContext = getContext();
      this.a = new xl(localContext);
      this.a.a(new acx(this));
      this.c = new acl(localContext);
      acl localacl1 = this.c;
      localacl1.h = true;
      localacl1.i = true;
      localacl2 = this.c;
      if (this.d == null) {
        break label118;
      }
    }
    label118:
    for (Object localObject = this.d;; localObject = new acv(this))
    {
      localacl2.d = ((ya)localObject);
      this.a.a(this.c, this.j);
      this.c.a(this);
      return this.a;
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (paramLayoutParams != null) && ((paramLayoutParams instanceof acw));
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    if (this.c != null)
    {
      this.c.a(false);
      if (this.c.g())
      {
        this.c.e();
        this.c.d();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null)
    {
      acl localacl = this.c;
      (localacl.e() | localacl.f());
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.l)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i = getChildCount();
    int i1 = (paramInt4 - paramInt2) / 2;
    int i2 = this.i;
    int i3 = 0;
    int i4 = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    int i5 = 0;
    boolean bool = aab.a(this);
    int i6 = 0;
    label70:
    View localView4;
    acw localacw3;
    int i34;
    int i37;
    int i36;
    label167:
    int i31;
    int i29;
    int i30;
    if (i6 < i)
    {
      localView4 = getChildAt(i6);
      if (localView4.getVisibility() == 8) {
        break label706;
      }
      localacw3 = (acw)localView4.getLayoutParams();
      if (localacw3.a)
      {
        i34 = localView4.getMeasuredWidth();
        if (c(i6)) {
          i34 += i2;
        }
        int i35 = localView4.getMeasuredHeight();
        if (bool)
        {
          i37 = getPaddingLeft() + localacw3.leftMargin;
          i36 = i37 + i34;
          int i38 = i1 - i35 / 2;
          localView4.layout(i37, i38, i36, i35 + i38);
          i31 = i4 - i34;
          i29 = 1;
          i30 = i3;
        }
      }
    }
    for (;;)
    {
      i6++;
      i3 = i30;
      i4 = i31;
      i5 = i29;
      break label70;
      i36 = getWidth() - getPaddingRight() - localacw3.rightMargin;
      i37 = i36 - i34;
      break label167;
      int i32 = i4 - (localView4.getMeasuredWidth() + localacw3.leftMargin + localacw3.rightMargin);
      c(i6);
      i30 = i3 + 1;
      int i33 = i5;
      i31 = i32;
      i29 = i33;
      continue;
      if ((i == 1) && (i5 == 0))
      {
        View localView3 = getChildAt(0);
        int i25 = localView3.getMeasuredWidth();
        int i26 = localView3.getMeasuredHeight();
        int i27 = (paramInt3 - paramInt1) / 2 - i25 / 2;
        int i28 = i1 - i26 / 2;
        localView3.layout(i27, i28, i25 + i27, i26 + i28);
        return;
      }
      int i7;
      label383:
      int i9;
      label402:
      int i10;
      int i18;
      int i19;
      label429:
      acw localacw2;
      int i21;
      int i22;
      if (i5 != 0)
      {
        i7 = 0;
        int i8 = i3 - i7;
        if (i8 <= 0) {
          break label556;
        }
        i9 = i4 / i8;
        i10 = Math.max(0, i9);
        if (!bool) {
          break label562;
        }
        i18 = getWidth() - getPaddingRight();
        i19 = 0;
        if (i19 < i)
        {
          View localView2 = getChildAt(i19);
          localacw2 = (acw)localView2.getLayoutParams();
          if ((localView2.getVisibility() == 8) || (localacw2.a)) {
            break label699;
          }
          i21 = i18 - localacw2.rightMargin;
          i22 = localView2.getMeasuredWidth();
          int i23 = localView2.getMeasuredHeight();
          int i24 = i1 - i23 / 2;
          localView2.layout(i21 - i22, i24, i21, i23 + i24);
        }
      }
      label556:
      label562:
      label692:
      label699:
      for (int i20 = i21 - (i10 + (i22 + localacw2.leftMargin));; i20 = i18)
      {
        i19++;
        i18 = i20;
        break label429;
        break;
        i7 = 1;
        break label383;
        i9 = 0;
        break label402;
        int i11 = getPaddingLeft();
        int i12 = 0;
        label571:
        acw localacw1;
        int i14;
        int i15;
        if (i12 < i)
        {
          View localView1 = getChildAt(i12);
          localacw1 = (acw)localView1.getLayoutParams();
          if ((localView1.getVisibility() == 8) || (localacw1.a)) {
            break label692;
          }
          i14 = i11 + localacw1.leftMargin;
          i15 = localView1.getMeasuredWidth();
          int i16 = localView1.getMeasuredHeight();
          int i17 = i1 - i16 / 2;
          localView1.layout(i14, i17, i14 + i15, i16 + i17);
        }
        for (int i13 = i14 + (i10 + (i15 + localacw1.rightMargin));; i13 = i11)
        {
          i12++;
          i11 = i13;
          break label571;
          break;
        }
      }
      label706:
      i29 = i5;
      i30 = i3;
      i31 = i4;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = this.l;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {}
    int i1;
    int i3;
    int i5;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    for (boolean bool2 = true;; bool2 = false)
    {
      this.l = bool2;
      if (bool1 != this.l) {
        this.m = 0;
      }
      int i = View.MeasureSpec.getSize(paramInt1);
      if ((this.l) && (this.a != null) && (i != this.m))
      {
        this.m = i;
        this.a.b(true);
      }
      i1 = getChildCount();
      if ((!this.l) || (i1 <= 0)) {
        break label1533;
      }
      i3 = View.MeasureSpec.getMode(paramInt2);
      int i4 = View.MeasureSpec.getSize(paramInt1);
      i5 = View.MeasureSpec.getSize(paramInt2);
      int i6 = getPaddingLeft() + getPaddingRight();
      i7 = getPaddingTop() + getPaddingBottom();
      i8 = getChildMeasureSpec(paramInt2, i7, -2);
      i9 = i4 - i6;
      i10 = i9 / this.n;
      i11 = i9 % this.n;
      if (i10 != 0) {
        break;
      }
      setMeasuredDimension(i9, 0);
      return;
    }
    int i12 = this.n + i11 / i10;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    int i17 = 0;
    long l1 = 0L;
    int i18 = getChildCount();
    int i19 = 0;
    int i42;
    int i55;
    label357:
    boolean bool4;
    label365:
    int i43;
    label383:
    ActionMenuItemView localActionMenuItemView;
    label426:
    int i54;
    label445:
    int i45;
    label453:
    boolean bool5;
    label548:
    int i47;
    int i48;
    label603:
    int i49;
    label614:
    int i50;
    int i52;
    int i39;
    int i40;
    int i41;
    long l6;
    if (i19 < i18)
    {
      View localView4 = getChildAt(i19);
      if (localView4.getVisibility() == 8) {
        break label1659;
      }
      boolean bool3 = localView4 instanceof ActionMenuItemView;
      i42 = i16 + 1;
      if (bool3) {
        localView4.setPadding(this.o, 0, this.o, 0);
      }
      acw localacw6 = (acw)localView4.getLayoutParams();
      localacw6.f = false;
      localacw6.c = 0;
      localacw6.b = 0;
      localacw6.d = false;
      localacw6.leftMargin = 0;
      localacw6.rightMargin = 0;
      if (bool3) {
        if (!TextUtils.isEmpty(((ActionMenuItemView)localView4).getText()))
        {
          i55 = 1;
          if (i55 == 0) {
            break label709;
          }
          bool4 = true;
          localacw6.e = bool4;
          if (!localacw6.a) {
            break label715;
          }
          i43 = 1;
          acw localacw7 = (acw)localView4.getLayoutParams();
          int i44 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8) - i7, View.MeasureSpec.getMode(i8));
          if (!(localView4 instanceof ActionMenuItemView)) {
            break label722;
          }
          localActionMenuItemView = (ActionMenuItemView)localView4;
          if (localActionMenuItemView == null) {
            break label734;
          }
          if (TextUtils.isEmpty(localActionMenuItemView.getText())) {
            break label728;
          }
          i54 = 1;
          if (i54 == 0) {
            break label734;
          }
          i45 = 1;
          int i46 = 0;
          if (i43 > 0) {
            if (i45 != 0)
            {
              i46 = 0;
              if (i43 < 2) {}
            }
            else
            {
              localView4.measure(View.MeasureSpec.makeMeasureSpec(i12 * i43, -2147483648), i44);
              int i53 = localView4.getMeasuredWidth();
              i46 = i53 / i12;
              if (i53 % i12 != 0) {
                i46++;
              }
              if ((i45 != 0) && (i46 < 2)) {
                i46 = 2;
              }
            }
          }
          if ((localacw7.a) || (i45 == 0)) {
            break label740;
          }
          bool5 = true;
          localacw7.d = bool5;
          localacw7.b = i46;
          localView4.measure(View.MeasureSpec.makeMeasureSpec(i46 * i12, 1073741824), i44);
          i47 = Math.max(i14, i46);
          if (!localacw6.d) {
            break label1652;
          }
          i48 = i15 + 1;
          if (!localacw6.a) {
            break label1645;
          }
          i49 = 1;
          i50 = i10 - i46;
          int i51 = localView4.getMeasuredHeight();
          i52 = Math.max(i13, i51);
          if (i46 != 1) {
            break label1614;
          }
          long l7 = l1 | 1 << i19;
          i17 = i49;
          i39 = i42;
          i40 = i47;
          i41 = i52;
          i10 = i50;
          i15 = i48;
          l6 = l7;
        }
      }
    }
    for (;;)
    {
      i19++;
      i14 = i40;
      i13 = i41;
      l1 = l6;
      i16 = i39;
      break;
      i55 = 0;
      break label357;
      label709:
      bool4 = false;
      break label365;
      label715:
      i43 = i10;
      break label383;
      label722:
      localActionMenuItemView = null;
      break label426;
      label728:
      i54 = 0;
      break label445;
      label734:
      i45 = 0;
      break label453;
      label740:
      bool5 = false;
      break label548;
      int i20;
      long l2;
      int i21;
      int i22;
      int i30;
      long l4;
      int i31;
      int i32;
      label795:
      acw localacw5;
      int i38;
      int i37;
      if ((i17 != 0) && (i16 == 2))
      {
        i20 = 1;
        l2 = l1;
        i21 = i10;
        i22 = 0;
        if ((i15 <= 0) || (i21 <= 0)) {
          break label1085;
        }
        i30 = 2147483647;
        l4 = 0L;
        i31 = 0;
        i32 = 0;
        if (i32 >= i18) {
          break label904;
        }
        localacw5 = (acw)getChildAt(i32).getLayoutParams();
        if (!localacw5.d) {
          break label1603;
        }
        if (localacw5.b >= i30) {
          break label871;
        }
        i38 = localacw5.b;
        l4 = 1 << i32;
        i37 = 1;
      }
      label904:
      label935:
      label1085:
      label1248:
      for (;;)
      {
        i32++;
        i30 = i38;
        i31 = i37;
        break label795;
        i20 = 0;
        break;
        label871:
        if (localacw5.b == i30)
        {
          l4 |= 1 << i32;
          i37 = i31 + 1;
          i38 = i30;
          continue;
          l2 |= l4;
          long l5;
          int i34;
          int i35;
          View localView3;
          acw localacw4;
          int i36;
          if (i31 <= i21)
          {
            int i33 = i30 + 1;
            l5 = l2;
            i34 = i21;
            i35 = 0;
            if (i35 < i18)
            {
              localView3 = getChildAt(i35);
              localacw4 = (acw)localView3.getLayoutParams();
              if ((l4 & 1 << i35) == 0L)
              {
                if (localacw4.b != i33) {
                  break label1596;
                }
                l5 |= 1 << i35;
                i36 = i34;
              }
            }
          }
          for (;;)
          {
            i35++;
            i34 = i36;
            break label935;
            if ((i20 != 0) && (localacw4.e) && (i34 == 1)) {
              localView3.setPadding(i12 + this.o, 0, this.o, 0);
            }
            localacw4.b = (1 + localacw4.b);
            localacw4.f = true;
            i36 = i34 - 1;
            continue;
            l2 = l5;
            i21 = i34;
            i22 = 1;
            break;
            long l3 = l2;
            int i23;
            float f1;
            if ((i17 == 0) && (i16 == 1))
            {
              i23 = 1;
              if ((i21 <= 0) || (l3 == 0L)) {
                break label1438;
              }
              int i26 = i16 - 1;
              if ((i21 >= i26) && (i23 == 0) && (i14 <= 1)) {
                break label1438;
              }
              f1 = Long.bitCount(l3);
              if (i23 != 0) {
                break label1589;
              }
              if (((1L & l3) != 0L) && (!((acw)getChildAt(0).getLayoutParams()).e)) {
                f1 -= 0.5F;
              }
              if (((l3 & 1 << i18 - 1) == 0L) || (((acw)getChildAt(i18 - 1).getLayoutParams()).e)) {
                break label1589;
              }
            }
            for (float f2 = f1 - 0.5F;; f2 = f1)
            {
              int i27;
              int i28;
              label1255:
              acw localacw3;
              int i29;
              if (f2 > 0.0F)
              {
                i27 = (int)(i21 * i12 / f2);
                i28 = 0;
                i24 = i22;
                if (i28 >= i18) {
                  break label1442;
                }
                if ((l3 & 1 << i28) == 0L) {
                  break label1431;
                }
                View localView2 = getChildAt(i28);
                localacw3 = (acw)localView2.getLayoutParams();
                if (!(localView2 instanceof ActionMenuItemView)) {
                  break label1362;
                }
                localacw3.c = i27;
                localacw3.f = true;
                if ((i28 == 0) && (!localacw3.e)) {
                  localacw3.leftMargin = (-i27 / 2);
                }
                i29 = 1;
              }
              for (;;)
              {
                i28++;
                i24 = i29;
                break label1255;
                i23 = 0;
                break;
                i27 = 0;
                break label1248;
                if (localacw3.a)
                {
                  localacw3.c = i27;
                  localacw3.f = true;
                  localacw3.rightMargin = (-i27 / 2);
                  i29 = 1;
                }
                else
                {
                  if (i28 != 0) {
                    localacw3.leftMargin = (i27 / 2);
                  }
                  if (i28 != i18 - 1) {
                    localacw3.rightMargin = (i27 / 2);
                  }
                  i29 = i24;
                }
              }
              int i24 = i22;
              if (i24 != 0) {
                for (int i25 = 0; i25 < i18; i25++)
                {
                  View localView1 = getChildAt(i25);
                  acw localacw2 = (acw)localView1.getLayoutParams();
                  if (localacw2.f) {
                    localView1.measure(View.MeasureSpec.makeMeasureSpec(i12 * localacw2.b + localacw2.c, 1073741824), i8);
                  }
                }
              }
              if (i3 != 1073741824) {}
              for (;;)
              {
                setMeasuredDimension(i9, i13);
                return;
                label1533:
                for (int i2 = 0; i2 < i1; i2++)
                {
                  acw localacw1 = (acw)getChildAt(i2).getLayoutParams();
                  localacw1.rightMargin = 0;
                  localacw1.leftMargin = 0;
                }
                super.onMeasure(paramInt1, paramInt2);
                return;
                i13 = i5;
              }
            }
            i36 = i34;
          }
        }
        else
        {
          i37 = i31;
          i38 = i30;
        }
      }
      label1362:
      i17 = i49;
      label1431:
      label1438:
      label1442:
      label1589:
      label1596:
      label1603:
      label1614:
      i39 = i42;
      i40 = i47;
      i41 = i52;
      i10 = i50;
      i15 = i48;
      l6 = l1;
      continue;
      label1645:
      i49 = i17;
      break label614;
      label1652:
      i48 = i15;
      break label603;
      label1659:
      i39 = i16;
      i40 = i14;
      i41 = i13;
      l6 = l1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActionMenuView
 * JD-Core Version:    0.7.0.1
 */