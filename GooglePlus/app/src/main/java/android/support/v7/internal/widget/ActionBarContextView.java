package android.support.v7.internal.widget;

import aab;
import aau;
import aci;
import acl;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import efj;
import wb;
import xl;
import yg;
import yk;
import zw;

public class ActionBarContextView
  extends yg
{
  public CharSequence f;
  public CharSequence g;
  public View h;
  public View i;
  public boolean j;
  private LinearLayout k;
  private TextView l;
  private TextView m;
  private int n;
  private int o;
  private int p;
  
  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, aau.B);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zw localzw = zw.a(paramContext, paramAttributeSet, wb.x, paramInt, 0);
    setBackgroundDrawable(localzw.a(wb.y));
    int i1 = wb.C;
    this.n = localzw.a.getResourceId(i1, 0);
    int i2 = wb.B;
    this.o = localzw.a.getResourceId(i2, 0);
    int i3 = wb.A;
    this.d = localzw.a.getLayoutDimension(i3, 0);
    int i4 = wb.z;
    int i5 = efj.aR;
    this.p = localzw.a.getResourceId(i4, i5);
    localzw.a.recycle();
  }
  
  public final void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public final void a(aci paramaci)
  {
    if (this.h == null)
    {
      this.h = LayoutInflater.from(getContext()).inflate(this.p, this, false);
      addView(this.h);
    }
    for (;;)
    {
      this.h.findViewById(efj.aj).setOnClickListener(new yk(this, paramaci));
      xl localxl = (xl)paramaci.b();
      if (this.c != null)
      {
        acl localacl2 = this.c;
        (localacl2.e() | localacl2.f());
      }
      this.c = new acl(getContext());
      acl localacl1 = this.c;
      localacl1.h = true;
      localacl1.i = true;
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
      localxl.a(this.c, this.a);
      this.b = ((ActionMenuView)this.c.a(this));
      this.b.setBackgroundDrawable(null);
      addView(this.b, localLayoutParams);
      return;
      if (this.h.getParent() == null) {
        addView(this.h);
      }
    }
  }
  
  public final void a(View paramView)
  {
    if (this.i != null) {
      removeView(this.i);
    }
    this.i = paramView;
    if ((paramView != null) && (this.k != null))
    {
      removeView(this.k);
      this.k = null;
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean != this.j) {
      requestLayout();
    }
    this.j = paramBoolean;
  }
  
  public final boolean a()
  {
    if (this.c != null) {
      return this.c.d();
    }
    return false;
  }
  
  public final void b()
  {
    int i1 = 8;
    int i2 = 1;
    if (this.k == null)
    {
      LayoutInflater.from(getContext()).inflate(efj.aO, this);
      this.k = ((LinearLayout)getChildAt(-1 + getChildCount()));
      this.l = ((TextView)this.k.findViewById(efj.af));
      this.m = ((TextView)this.k.findViewById(efj.ae));
      if (this.n != 0) {
        this.l.setTextAppearance(getContext(), this.n);
      }
      if (this.o != 0) {
        this.m.setTextAppearance(getContext(), this.o);
      }
    }
    this.l.setText(this.f);
    this.m.setText(this.g);
    int i3;
    label166:
    TextView localTextView;
    if (!TextUtils.isEmpty(this.f))
    {
      i3 = i2;
      if (TextUtils.isEmpty(this.g)) {
        break label232;
      }
      localTextView = this.m;
      if (i2 == 0) {
        break label237;
      }
    }
    label232:
    label237:
    for (int i4 = 0;; i4 = i1)
    {
      localTextView.setVisibility(i4);
      LinearLayout localLinearLayout = this.k;
      if ((i3 != 0) || (i2 != 0)) {
        i1 = 0;
      }
      localLinearLayout.setVisibility(i1);
      if (this.k.getParent() == null) {
        addView(this.k);
      }
      return;
      i3 = 0;
      break;
      i2 = 0;
      break label166;
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null)
    {
      this.c.e();
      this.c.f();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(this.f);
      }
    }
    else {
      return;
    }
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = aab.a(this);
    int i1;
    int i2;
    int i3;
    ViewGroup.MarginLayoutParams localMarginLayoutParams;
    int i5;
    label87:
    int i6;
    label99:
    int i7;
    label111:
    int i8;
    int i9;
    label143:
    int i4;
    label227:
    ActionMenuView localActionMenuView;
    if (bool1)
    {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
      i2 = getPaddingTop();
      i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      if ((this.h != null) && (this.h.getVisibility() != 8))
      {
        localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.h.getLayoutParams();
        if (!bool1) {
          break label272;
        }
        i5 = localMarginLayoutParams.rightMargin;
        if (!bool1) {
          break label282;
        }
        i6 = localMarginLayoutParams.leftMargin;
        if (!bool1) {
          break label292;
        }
        i7 = i1 - i5;
        i8 = i7 + a(this.h, i7, i2, i3, bool1);
        if (!bool1) {
          break label302;
        }
        i9 = i8 - i6;
        i1 = i9;
      }
      if ((this.k != null) && (this.i == null) && (this.k.getVisibility() != 8)) {
        i1 += a(this.k, i1, i2, i3, bool1);
      }
      if (this.i != null) {
        a(this.i, i1, i2, i3, bool1);
      }
      if (!bool1) {
        break label312;
      }
      i4 = getPaddingLeft();
      if (this.b != null)
      {
        localActionMenuView = this.b;
        if (bool1) {
          break label326;
        }
      }
    }
    label272:
    label282:
    label292:
    label302:
    label312:
    label326:
    for (boolean bool2 = true;; bool2 = false)
    {
      a(localActionMenuView, i4, i2, i3, bool2);
      return;
      i1 = getPaddingLeft();
      break;
      i5 = localMarginLayoutParams.leftMargin;
      break label87;
      i6 = localMarginLayoutParams.rightMargin;
      break label99;
      i7 = i1 + i5;
      break label111;
      i9 = i8 + i6;
      break label143;
      i4 = paramInt3 - paramInt1 - getPaddingRight();
      break label227;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    int i2 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != i1) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    }
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4;
    int i6;
    int i7;
    int i8;
    int i16;
    label290:
    int i17;
    label316:
    label323:
    int i12;
    label352:
    label382:
    int i13;
    label402:
    int i10;
    label438:
    int i11;
    if (this.d > 0)
    {
      i4 = this.d;
      int i5 = getPaddingTop() + getPaddingBottom();
      i6 = i3 - getPaddingLeft() - getPaddingRight();
      i7 = i4 - i5;
      i8 = View.MeasureSpec.makeMeasureSpec(i7, -2147483648);
      if (this.h != null)
      {
        int i18 = a(this.h, i6, i8, 0);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.h.getLayoutParams();
        i6 = i18 - (localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin);
      }
      if ((this.b != null) && (this.b.getParent() == this)) {
        i6 = a(this.b, i6, i8, 0);
      }
      if ((this.k != null) && (this.i == null))
      {
        if (!this.j) {
          break label498;
        }
        int i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.k.measure(i14, i8);
        int i15 = this.k.getMeasuredWidth();
        if (i15 > i6) {
          break label485;
        }
        i16 = 1;
        if (i16 != 0) {
          i6 -= i15;
        }
        LinearLayout localLinearLayout = this.k;
        if (i16 == 0) {
          break label491;
        }
        i17 = 0;
        localLinearLayout.setVisibility(i17);
      }
      if (this.i != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.i.getLayoutParams();
        if (localLayoutParams.width == -2) {
          break label515;
        }
        i12 = i1;
        if (localLayoutParams.width >= 0) {
          i6 = Math.min(localLayoutParams.width, i6);
        }
        if (localLayoutParams.height == -2) {
          break label523;
        }
        if (localLayoutParams.height < 0) {
          break label530;
        }
        i13 = Math.min(localLayoutParams.height, i7);
        this.i.measure(View.MeasureSpec.makeMeasureSpec(i6, i12), View.MeasureSpec.makeMeasureSpec(i13, i1));
      }
      if (this.d > 0) {
        break label546;
      }
      int i9 = getChildCount();
      i10 = 0;
      if (i2 >= i9) {
        break label537;
      }
      i11 = i5 + getChildAt(i2).getMeasuredHeight();
      if (i11 <= i10) {
        break label555;
      }
    }
    for (;;)
    {
      i2++;
      i10 = i11;
      break label438;
      i4 = View.MeasureSpec.getSize(paramInt2);
      break;
      label485:
      i16 = 0;
      break label290;
      label491:
      i17 = 8;
      break label316;
      label498:
      i6 = a(this.k, i6, i8, 0);
      break label323;
      label515:
      i12 = -2147483648;
      break label352;
      label523:
      i1 = -2147483648;
      break label382;
      label530:
      i13 = i7;
      break label402;
      label537:
      setMeasuredDimension(i3, i10);
      return;
      label546:
      setMeasuredDimension(i3, i4);
      return;
      label555:
      i11 = i10;
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContextView
 * JD-Core Version:    0.7.0.1
 */