package com.google.android.libraries.social.stream.legacy.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.Scroller;
import efj;
import java.util.ArrayList;
import java.util.Arrays;
import lb;
import loi;
import lpp;
import lpq;
import lpr;
import lps;
import lpt;
import lpu;
import lpv;
import lpx;
import lpy;
import lvh;
import lwo;
import lxs;
import ms;
import mw;
import nf;
import ni;
import nj;
import ns;
import ru;
import rx;

public final class StreamGridView
  extends ViewGroup
  implements loi
{
  private float A;
  private float B;
  private int C;
  private final VelocityTracker D = VelocityTracker.obtain();
  private ru E;
  private ru F;
  private boolean G;
  private lpp[] H;
  private final lpy I = new lpy(this);
  private lpx J;
  public lpr a;
  public ListAdapter b;
  public lvh c;
  public lxs d;
  public boolean e;
  public boolean f;
  public int g;
  public int h;
  public int i;
  public int[] j;
  public int[] k;
  public int l;
  public int m;
  public int n = 0;
  public int o = 0;
  public FrameLayout p;
  public boolean q;
  public Runnable r = new lpq(this);
  public final lpv s = new lpv(this);
  public final lb<lpu> t = new lb();
  private boolean u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public StreamGridView(Context paramContext)
  {
    super(paramContext, null, 0);
    a(paramContext, null, 0);
  }
  
  public StreamGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public StreamGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    setMotionEventSplittingEnabled(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.w = localViewConfiguration.getScaledTouchSlop();
    this.x = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.y = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.d = lxs.a(paramContext);
    this.E = new ru(paramContext);
    this.F = new ru(paramContext);
    setWillNotDraw(false);
    setClipToPadding(false);
    this.p = new FrameLayout(paramContext, paramAttributeSet, paramInt);
    this.p.setId(efj.YO);
    lpt locallpt = new lpt(-2);
    this.p.setLayoutParams(locallpt);
    ProgressBar localProgressBar = new ProgressBar(paramContext, paramAttributeSet, 16842871);
    localProgressBar.setId(efj.YP);
    localProgressBar.setIndeterminate(true);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 17;
    localProgressBar.setLayoutParams(localLayoutParams);
    this.p.addView(localProgressBar);
    this.p.setVisibility(8);
  }
  
  private final void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (Log.isLoggable("StreamGridView", 4))
      {
        int i3;
        for (int i1 = 0;; i1++)
        {
          int i2 = this.i;
          i3 = 0;
          if (i1 >= i2) {
            break;
          }
          lpu locallpu = (lpu)this.t.a(i1);
          if (locallpu != null)
          {
            String str = String.valueOf(locallpu);
            new StringBuilder(16 + String.valueOf(str).length()).append(" -> ").append(i1).append(" ").append(str);
          }
        }
        while (i3 < this.a.a)
        {
          int i4 = this.j[i3];
          new StringBuilder(35).append(" mItemTops[").append(i3).append("]=").append(i4);
          i3++;
        }
        k();
      }
      throw new lps();
    }
  }
  
  private final boolean a(int paramInt, boolean paramBoolean)
  {
    boolean bool1 = e();
    int i1 = Math.abs(paramInt);
    int i3;
    label164:
    label693:
    int i2;
    if (!bool1)
    {
      this.e = true;
      int i6;
      int i7;
      if (paramInt > 0)
      {
        i6 = b(-1 + this.g, i1);
        i7 = 1;
        i3 = Math.min(i6, i1);
        if (i3 == 0) {
          break label693;
        }
        if (i7 == 0) {
          break label164;
        }
      }
      for (;;)
      {
        int i8 = getChildCount();
        for (int i9 = 0; i9 < i8; i9++)
        {
          View localView4 = getChildAt(i9);
          localView4.layout(localView4.getLeft(), i3 + localView4.getTop(), localView4.getRight(), i3 + localView4.getBottom());
        }
        int i5 = c(this.g + getChildCount(), i1) + this.a.c;
        if (i5 < 0) {
          i5 = 0;
        }
        i6 = i5;
        i7 = 0;
        break;
        i3 = -i3;
      }
      int i10 = this.a.a;
      for (int i11 = 0; i11 < i10; i11++)
      {
        int[] arrayOfInt1 = this.j;
        arrayOfInt1[i11] = (i3 + arrayOfInt1[i11]);
        int[] arrayOfInt2 = this.k;
        arrayOfInt2[i11] = (i3 + arrayOfInt2[i11]);
      }
      int i12 = -this.a.c;
      int i13 = getHeight() + this.a.c;
      int i14 = -1 + getChildCount();
      if (i14 >= 0)
      {
        View localView3 = getChildAt(i14);
        lpt locallpt2 = (lpt)localView3.getLayoutParams();
        if (localView3.getTop() - this.a.c - locallpt2.topMargin > i13)
        {
          if (this.G) {
            removeViewsInLayout(i14, 1);
          }
          for (;;)
          {
            this.s.a(localView3);
            i14--;
            break;
            removeViewAt(i14);
          }
        }
      }
      if (getChildCount() > 0)
      {
        View localView2 = getChildAt(0);
        if (localView2.getBottom() < i12)
        {
          if (this.G) {
            removeViewsInLayout(0, 1);
          }
          for (;;)
          {
            this.s.a(localView2);
            this.g = (1 + this.g);
            break;
            removeViewAt(0);
          }
        }
      }
      int i15 = getChildCount();
      if (i15 > 0)
      {
        Arrays.fill(this.j, 2147483647);
        Arrays.fill(this.k, -2147483648);
        for (int i16 = 0; i16 < i15; i16++)
        {
          View localView1 = getChildAt(i16);
          lpt locallpt1 = (lpt)localView1.getLayoutParams();
          int i19 = localView1.getTop() - this.a.c - locallpt1.topMargin;
          int i20 = localView1.getBottom();
          lpu locallpu = (lpu)this.t.a(i16 + this.g);
          if (locallpu != null) {}
          for (boolean bool2 = true;; bool2 = false)
          {
            a(bool2);
            int i21 = locallpu.c;
            for (int i22 = 0; i22 < i21; i22++)
            {
              int i23 = i22 + locallpu.a;
              this.j[i23] = Math.min(this.j[i23], i19 - locallpu.d[i23]);
              this.k[i23] = Math.max(this.k[i23], i20);
            }
          }
        }
        for (int i17 = 0; i17 < this.a.a; i17++) {
          if (this.j[i17] == 2147483647)
          {
            int i18 = getPaddingTop();
            this.j[i17] = i18;
            this.k[i17] = i18;
          }
        }
      }
      b();
      this.e = false;
      i2 = i1 - i6;
      if (paramBoolean)
      {
        int i4 = nj.a.a(this);
        if (((i4 == 0) || ((i4 == 1) && (!bool1))) && (i2 > 0)) {
          if (paramInt <= 0) {
            break label816;
          }
        }
      }
    }
    label816:
    for (ru localru = this.E;; localru = this.F)
    {
      float f1 = Math.abs(paramInt) / getHeight();
      ru.b.a(localru.a, f1);
      nj.a.l(this);
      if (i3 != 0) {
        a(i3);
      }
      if ((paramInt != 0) && (i3 == 0)) {
        break label825;
      }
      return true;
      i2 = i1;
      i3 = 0;
      break;
    }
    label825:
    return false;
  }
  
  private final int b(int paramInt1, int paramInt2)
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    int i3 = this.a.c;
    int i4 = this.a.a;
    int i5 = (getWidth() - i1 - i2 - i3 * (i4 - 1)) / i4;
    int i6 = getPaddingTop();
    int i7 = -paramInt2;
    label159:
    label298:
    label304:
    int i22;
    for (int i8 = g(); (i8 >= 0) && (this.j[i8] > i7) && (paramInt1 >= 0); i8 = i22)
    {
      View localView = c(paramInt1);
      if (localView == null) {
        return 0;
      }
      lpt locallpt = (lpt)localView.getLayoutParams();
      lpu locallpu;
      boolean bool;
      int i11;
      int i12;
      if (localView.getParent() != this)
      {
        if (this.G) {
          addViewInLayout(localView, 0, locallpt);
        }
      }
      else
      {
        locallpu = (lpu)this.t.a(paramInt1);
        if (locallpu == null) {
          break label298;
        }
        bool = true;
        a(bool);
        i11 = Math.min(i4, locallpu.c);
        i12 = View.MeasureSpec.makeMeasureSpec(i5 * i11 + i3 * (i11 - 1) - (locallpt.leftMargin + locallpt.rightMargin), 1073741824);
        if (locallpt.height != -2) {
          break label304;
        }
      }
      int i14;
      for (int i13 = View.MeasureSpec.makeMeasureSpec(0, 0);; i13 = View.MeasureSpec.makeMeasureSpec(locallpt.height, 1073741824))
      {
        localView.measure(i12, i13);
        i14 = 2147483647;
        for (int i15 = 0; i15 < i11; i15++)
        {
          int i25 = i15 + locallpu.a;
          if (this.j[i25] < i14) {
            i14 = this.j[i25];
          }
        }
        addView(localView, 0);
        break;
        bool = false;
        break label159;
      }
      for (int i16 = 0; i16 < i11; i16++) {
        this.j[(i16 + locallpu.a)] = i14;
      }
      int i17 = this.j[locallpu.a] - locallpt.bottomMargin;
      int i18 = i17 - localView.getMeasuredHeight();
      int i19 = i1 + locallpu.a * (i5 + i3) + locallpt.leftMargin;
      localView.layout(i19, i18, i19 + localView.getMeasuredWidth(), i17);
      int i20 = this.h;
      if (paramInt1 == i20) {
        this.l = i18;
      }
      for (int i21 = 0; i21 < i11; i21++)
      {
        int i24 = i21 + locallpu.a;
        this.j[i24] = (i18 - i3 - locallpt.topMargin - locallpu.d[i24]);
      }
      i22 = g();
      int i23 = paramInt1 - 1;
      this.g = paramInt1;
      paramInt1 = i23;
    }
    int i9 = getHeight();
    for (int i10 = 0; i10 < i4; i10++) {
      if (this.j[i10] < i9) {
        i9 = this.j[i10];
      }
    }
    return i6 - i9;
  }
  
  private final void b(int paramInt)
  {
    if (paramInt != this.v)
    {
      this.v = paramInt;
      if (this.c != null) {
        this.c.a(this, paramInt);
      }
    }
  }
  
  private final int c(int paramInt1, int paramInt2)
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    int i3 = this.a.c;
    int i4 = this.a.a;
    int i5 = (getWidth() - i1 - i2 - i3 * (i4 - 1)) / i4;
    int i6 = getHeight() - getPaddingBottom();
    int i7 = i6 + paramInt2;
    int i8 = j();
    View localView;
    lpt locallpt;
    int i12;
    int i13;
    int i14;
    lpu locallpu;
    int i15;
    int i16;
    label255:
    int i28;
    if ((i8 >= 0) && (this.k[i8] < i7))
    {
      int i11 = this.i;
      if (paramInt1 < i11)
      {
        localView = c(paramInt1);
        if (localView == null) {
          return 0;
        }
        locallpt = (lpt)localView.getLayoutParams();
        if (localView.getParent() != this)
        {
          if (this.G) {
            addViewInLayout(localView, -1, locallpt);
          }
        }
        else
        {
          i12 = Math.min(i4, locallpt.a);
          i13 = View.MeasureSpec.makeMeasureSpec(i5 * i12 + i3 * (i12 - 1) - (locallpt.leftMargin + locallpt.rightMargin), 1073741824);
          i14 = 0;
          locallpu = (lpu)this.t.a(paramInt1);
          if (locallpu != null) {
            break label320;
          }
          locallpu = new lpu(i4);
          this.t.a(paramInt1, locallpu);
        }
        for (;;)
        {
          locallpu.c = i12;
          i15 = 2147483647;
          i16 = 0;
          if (i16 > i4 - i12) {
            break label367;
          }
          i28 = -2147483648;
          for (int i29 = i16; i29 < i16 + i12; i29++) {
            if (this.k[i29] > i28) {
              i28 = this.k[i29];
            }
          }
          addView(localView);
          break;
          label320:
          int i30 = locallpu.c;
          i14 = 0;
          if (i30 != i12) {
            i14 = 1;
          }
        }
        if (i28 >= i15) {
          break label804;
        }
        locallpu.a = i16;
      }
    }
    for (;;)
    {
      i16++;
      i15 = i28;
      break label255;
      label367:
      if (locallpt.height == -2) {}
      int i18;
      int i19;
      for (int i17 = View.MeasureSpec.makeMeasureSpec(0, 0);; i17 = View.MeasureSpec.makeMeasureSpec(locallpt.height, 1073741824))
      {
        localView.measure(i13, i17);
        i18 = localView.getMeasuredHeight();
        if ((i14 == 0) && ((i18 == locallpu.b) || (locallpu.b <= 0))) {
          break label538;
        }
        if (Log.isLoggable("StreamGridView", 4))
        {
          new StringBuilder(54).append("invalidating layout records after position=").append(paramInt1);
          new Exception();
        }
        for (i19 = -1 + this.t.b(); (i19 >= 0) && (this.t.d(i19) > paramInt1); i19--) {}
      }
      int i20 = i19 + 1;
      this.t.a(i20 + 1, this.t.b() - i20);
      label538:
      locallpu.b = i18;
      Arrays.fill(locallpu.d, 0);
      for (int i21 = 0; i21 < i12; i21++)
      {
        int i27 = i21 + locallpu.a;
        locallpu.d[i27] = (i15 - this.k[i27]);
        int[] arrayOfInt = this.k;
        arrayOfInt[i27] += locallpu.d[i27];
      }
      int i22 = i3 + this.k[locallpu.a] + locallpt.topMargin;
      int i23 = i18 + i22;
      int i24 = i1 + locallpu.a * (i5 + i3) + locallpt.leftMargin;
      localView.layout(i24, i22, i24 + localView.getMeasuredWidth(), i23);
      int i25 = this.h;
      if (paramInt1 == i25) {
        this.l = i22;
      }
      for (int i26 = 0; i26 < i12; i26++) {
        this.k[(i26 + locallpu.a)] = (i23 + locallpt.bottomMargin);
      }
      i8 = j();
      paramInt1++;
      break;
      int i9 = 0;
      for (int i10 = 0; i10 < i4; i10++) {
        if (this.k[i10] > i9) {
          i9 = this.k[i10];
        }
      }
      return i9 - i6;
      label804:
      i28 = i15;
    }
  }
  
  private View c(int paramInt)
  {
    int i1 = 0;
    if (paramInt >= this.b.getCount())
    {
      if (paramInt == -1 + this.i)
      {
        Runnable localRunnable = this.r;
        efj.m().postDelayed(localRunnable, 500L);
        return this.p;
      }
      int i4 = paramInt - this.b.getCount();
      int i5 = this.a.a;
      if (i4 < this.H.length) {}
      int i6;
      int i7;
      for (boolean bool = true;; bool = false)
      {
        a(bool);
        i6 = (getWidth() - getPaddingLeft() - getPaddingRight() - this.a.c * (i5 - 1)) / i5;
        i7 = -2147483648;
        while (i1 < i5)
        {
          if (i7 < this.k[i1]) {
            i7 = this.k[i1];
          }
          i1++;
        }
      }
      lpp locallpp = this.H[i4];
      int i8 = i7 - this.k[i4];
      locallpp.a = i6;
      locallpp.b = i8;
      lpt locallpt2 = new lpt(i8);
      locallpt2.a = 1;
      locallpp.setLayoutParams(locallpt2);
      return this.H[i4];
    }
    for (;;)
    {
      try
      {
        int i2 = this.b.getItemViewType(paramInt);
        lpv locallpv = this.s;
        View localView1;
        if (i2 == -1)
        {
          localView1 = null;
          View localView2 = this.b.getView(paramInt, localView1, this);
          if ((localView2 != localView1) && (localView1 != null)) {
            this.s.a(localView1);
          }
          localObject = localView2.getLayoutParams();
          if (localView2.getParent() != this)
          {
            if (localObject == null)
            {
              localObject = generateDefaultLayoutParams();
              localView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
            }
          }
          else
          {
            lpt locallpt1 = (lpt)localView2.getLayoutParams();
            locallpt1.b = paramInt;
            locallpt1.c = this.b.getItemViewType(paramInt);
            locallpt1.d = this.b.getItemId(paramInt);
            return localView2;
          }
        }
        else
        {
          ArrayList localArrayList = locallpv.b[i2];
          if (localArrayList.isEmpty())
          {
            localView1 = null;
            continue;
          }
          int i3 = -1 + localArrayList.size();
          localView1 = (View)localArrayList.get(i3);
          localArrayList.remove(i3);
          continue;
        }
        String str1;
        String str2;
        String str3;
        if (checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
          continue;
        }
      }
      catch (Exception localException)
      {
        str1 = String.valueOf(this);
        str2 = String.valueOf(getContext());
        str3 = String.valueOf(this.b.getClass());
        Log.e("StreamGridView", 94 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + "Exception while trying to obtain a view at position " + paramInt + " in view: " + str1 + " activity: " + str2 + " adapter: " + str3, localException);
        return null;
      }
      ViewGroup.LayoutParams localLayoutParams = generateLayoutParams((ViewGroup.LayoutParams)localObject);
      Object localObject = localLayoutParams;
    }
  }
  
  private final boolean e()
  {
    if ((this.g != 0) || (this.i != getChildCount())) {
      return false;
    }
    int i1 = getPaddingTop();
    int i2 = getHeight() - getPaddingBottom();
    for (int i3 = 0;; i3++)
    {
      if (i3 >= this.a.a) {
        break label74;
      }
      if ((this.j[i3] < i1) || (this.k[i3] > i2)) {
        break;
      }
    }
    label74:
    return true;
  }
  
  private final void f()
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    int i3 = this.a.c;
    int i4 = this.a.a;
    int i5 = (getWidth() - i1 - i2 - i3 * (i4 - 1)) / i4;
    int i6 = getChildCount();
    for (int i7 = 0; i7 < i6; i7++)
    {
      View localView = getChildAt(i7);
      lpt locallpt = (lpt)localView.getLayoutParams();
      int i8 = i7 + this.g;
      lpu locallpu = (lpu)this.t.a(i8);
      int i9 = Math.min(i4, locallpt.a);
      int i10 = -2147483648;
      for (int i11 = 0; i11 < i9; i11++)
      {
        int i20 = i11 + locallpu.a;
        if (this.k[i20] > i10) {
          i10 = this.k[i20];
        }
      }
      int i18;
      if (localView.isLayoutRequested())
      {
        i18 = View.MeasureSpec.makeMeasureSpec(i5 * i9 + i3 * (i9 - 1) - (locallpt.leftMargin + locallpt.rightMargin), 1073741824);
        if (locallpt.height != -2) {
          break label322;
        }
      }
      label322:
      for (int i19 = View.MeasureSpec.makeMeasureSpec(0, 0);; i19 = View.MeasureSpec.makeMeasureSpec(locallpt.height, 1073741824))
      {
        localView.measure(i18, i19);
        locallpu.b = localView.getMeasuredHeight();
        Arrays.fill(locallpu.d, 0);
        for (int i12 = 0; i12 < i9; i12++)
        {
          int i17 = i12 + locallpu.a;
          locallpu.d[i17] = (i10 - this.k[i17]);
          int[] arrayOfInt = this.k;
          arrayOfInt[i17] += locallpu.d[i17];
        }
      }
      int i13 = i3 + this.k[locallpu.a] + locallpt.topMargin;
      int i14 = i13 + locallpu.b;
      int i15 = i1 + locallpu.a * (i5 + i3) + locallpt.leftMargin;
      localView.layout(i15, i13, i15 + localView.getMeasuredWidth(), i14);
      if (i8 == this.h) {
        this.l = i13;
      }
      for (int i16 = 0; i16 < i9; i16++) {
        this.k[(i16 + locallpu.a)] = (i14 + locallpt.bottomMargin);
      }
    }
  }
  
  private final int g()
  {
    int i1 = -2147483648;
    int i2 = -1;
    for (int i3 = 0; i3 < this.a.a; i3++) {
      if (this.j[i3] > i1)
      {
        i1 = this.j[i3];
        i2 = i3;
      }
    }
    return i2;
  }
  
  private final int j()
  {
    int i1 = 2147483647;
    int i2 = -1;
    for (int i3 = 0; i3 < this.a.a; i3++) {
      if (this.k[i3] < i1)
      {
        i1 = this.k[i3];
        i2 = i3;
      }
    }
    return i2;
  }
  
  private final void k()
  {
    int i1 = 0;
    int i2 = getChildCount();
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      int i3 = i1 + this.g;
      int i4 = localView.getLeft();
      int i5 = localView.getTop();
      int i6 = localView.getRight();
      int i7 = localView.getBottom();
      new StringBuilder(74).append(" -> ").append(i3).append(" l=").append(i4).append(", t=").append(i5).append(", r=").append(i6).append(", b=").append(i7);
      i1++;
    }
  }
  
  private final int l()
  {
    if (getChildCount() == 0) {}
    while (this.g != 0) {
      return 0;
    }
    int i1 = getPaddingTop();
    View localView = getChildAt(0);
    lpt locallpt = (lpt)localView.getLayoutParams();
    return localView.getTop() - (i1 + this.a.c + locallpt.topMargin);
  }
  
  private final void m()
  {
    ru localru1 = this.E;
    boolean bool = false;
    if (localru1 != null)
    {
      ru localru3 = this.E;
      bool = ru.b.c(localru3.a);
    }
    if (this.F != null)
    {
      ru localru2 = this.F;
      bool |= ru.b.c(localru2.a);
    }
    if (bool) {
      nj.a.l(this);
    }
  }
  
  public final void a()
  {
    if ((getWidth() == 0) || (getHeight() == 0)) {
      return;
    }
    int i1 = this.a.a;
    for (int i2 = 0; i2 < i1; i2++) {
      this.k[i2] = this.j[i2];
    }
    this.e = true;
    if (this.f) {
      c();
    }
    for (;;)
    {
      c(this.g + getChildCount(), 0);
      b(-1 + this.g, getPaddingTop());
      this.e = false;
      this.f = false;
      a(0);
      return;
      f();
    }
  }
  
  public final void a(int paramInt)
  {
    lvh locallvh;
    int i1;
    if (this.c != null)
    {
      locallvh = this.c;
      i1 = this.g;
      if (this.g != 0) {
        break label107;
      }
    }
    label107:
    for (int i2 = l();; i2 = 0)
    {
      locallvh.a(this, i1, paramInt, i2);
      onScrollChanged(0, 0, 0, 0);
      if (this.J == null) {
        this.J = new lpx(this);
      }
      if (!this.J.a)
      {
        this.J.a = true;
        lpx locallpx = this.J;
        efj.m().postDelayed(locallpx, 100L);
      }
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.g = paramInt1;
    c();
    b();
    this.t.c();
    int i1 = this.a.c;
    int i2 = this.a.a;
    int i3 = (getWidth() - getPaddingLeft() - getPaddingRight() - i1 * (i2 - 1)) / i2;
    int i4 = 0;
    View localView;
    lpt locallpt;
    lpu locallpu;
    int i8;
    int i9;
    int i10;
    label147:
    int i15;
    if (i4 < this.g)
    {
      localView = c(i4);
      if (localView != null)
      {
        locallpt = (lpt)localView.getLayoutParams();
        locallpu = new lpu(i2);
        this.t.a(i4, locallpu);
        i8 = Math.min(i2, locallpt.a);
        locallpu.c = i8;
        i9 = 2147483647;
        i10 = 0;
        if (i10 <= i2 - i8)
        {
          i15 = -2147483648;
          for (int i16 = i10; i16 < i10 + i8; i16++) {
            if (this.k[i16] > i15) {
              i15 = this.k[i16];
            }
          }
          if (i15 >= i9) {
            break label514;
          }
          locallpu.a = i10;
        }
      }
    }
    for (;;)
    {
      i10++;
      i9 = i15;
      break label147;
      int i11 = View.MeasureSpec.makeMeasureSpec(i3 * i8 + i1 * (i8 - 1) - (locallpt.leftMargin + locallpt.rightMargin), 1073741824);
      if (locallpt.height == -2) {}
      for (int i12 = View.MeasureSpec.makeMeasureSpec(0, 0);; i12 = View.MeasureSpec.makeMeasureSpec(locallpt.height, 1073741824))
      {
        localView.measure(i11, i12);
        locallpu.b = localView.getMeasuredHeight();
        Arrays.fill(locallpu.d, 0);
        for (int i13 = 0; i13 < i8; i13++)
        {
          int i14 = i13 + locallpu.a;
          locallpu.d[i14] = (i9 - this.k[i14]);
          int[] arrayOfInt = this.k;
          arrayOfInt[i14] += i1 + (locallpu.d[i14] + locallpu.b) + locallpt.bottomMargin;
        }
      }
      this.s.a(localView);
      i4++;
      break;
      int i5 = 2147483647;
      for (int i6 = 0; i6 < i2; i6++) {
        if (this.k[i6] < i5) {
          i5 = this.k[i6];
        }
      }
      for (int i7 = 0; i7 < i2; i7++)
      {
        this.k[i7] = (paramInt2 + (this.k[i7] - i5));
        this.j[i7] = this.k[i7];
      }
      requestLayout();
      return;
      label514:
      i15 = i9;
    }
  }
  
  public final void a(ListAdapter paramListAdapter)
  {
    int i1 = 0;
    if (this.b != null) {
      this.b.unregisterDataSetObserver(this.I);
    }
    this.t.c();
    c();
    b();
    this.g = 0;
    lpv locallpv1 = this.s;
    int i2 = locallpv1.c;
    for (int i3 = 0; i3 < i2; i3++) {
      locallpv1.b[i3].clear();
    }
    this.A = 0.0F;
    this.b = paramListAdapter;
    this.f = true;
    if (paramListAdapter != null) {}
    lpv locallpv2;
    int i5;
    for (int i4 = paramListAdapter.getCount();; i4 = 0)
    {
      this.i = i4;
      if (this.i > 0) {
        this.i += this.a.a;
      }
      this.i = (1 + this.i);
      if (paramListAdapter == null) {
        return;
      }
      paramListAdapter.registerDataSetObserver(this.I);
      locallpv2 = this.s;
      i5 = paramListAdapter.getViewTypeCount();
      if (i5 > 0) {
        break;
      }
      throw new IllegalArgumentException(61 + "Must have at least one view type (" + i5 + " types reported)");
    }
    if (i5 != locallpv2.c)
    {
      ArrayList[] arrayOfArrayList = new ArrayList[i5];
      while (i1 < i5)
      {
        arrayOfArrayList[i1] = new ArrayList();
        i1++;
      }
      locallpv2.c = i5;
      locallpv2.b = arrayOfArrayList;
    }
  }
  
  public final void aw_()
  {
    this.u = true;
  }
  
  public final void ax_()
  {
    this.u = false;
    b(0);
  }
  
  public final void b()
  {
    int i1 = this.a.a;
    if ((this.j == null) || (this.k == null) || (this.j.length != i1) || (this.k.length != i1))
    {
      this.j = new int[this.a.a];
      this.k = new int[this.a.a];
    }
    int i2 = getPaddingTop();
    Arrays.fill(this.j, i2);
    Arrays.fill(this.k, i2);
  }
  
  public final void c()
  {
    int i1 = 0;
    for (int i2 = 0; i2 < getChildCount(); i2++) {
      this.s.a(getChildAt(i2));
    }
    if (this.G) {
      removeAllViewsInLayout();
    }
    while ((this.H == null) || (this.H.length != this.a.a))
    {
      Context localContext = getContext();
      this.H = new lpp[this.a.a];
      while (i1 < this.a.a)
      {
        this.H[i1] = new lpp(localContext);
        i1++;
      }
      removeAllViews();
    }
    ((lpt)this.p.getLayoutParams()).a = this.a.a;
  }
  
  public final boolean canScrollVertically(int paramInt)
  {
    if (paramInt < 0)
    {
      if ((this.g == 0) && (l() >= 0)) {}
      for (int i1 = 1; i1 == 0; i1 = 0) {
        return true;
      }
      return false;
    }
    return super.canScrollVertically(paramInt);
  }
  
  public final void computeScroll()
  {
    for (;;)
    {
      try
      {
        if (!this.d.a.computeScrollOffset()) {
          break;
        }
        int i1 = this.d.a.getCurrY();
        int i2 = (int)(i1 - this.A);
        this.A = i1;
        boolean bool = a(i2, false);
        int i3 = 0;
        if (!bool) {
          i3 = 1;
        }
        if ((i3 == 0) && (!this.d.a.isFinished()))
        {
          nj.a.l(this);
          return;
        }
        if (i3 != 0)
        {
          if (nj.a.a(this) != 2)
          {
            if (i2 > 0)
            {
              localru = this.E;
              int i4 = Math.abs((int)this.d.a());
              ru.b.a(localru.a, i4);
              nj.a.l(this);
            }
          }
          else {
            this.d.a.abortAnimation();
          }
        }
        else
        {
          b(0);
          return;
        }
      }
      catch (lps locallps)
      {
        Log.e("StreamGridView", "StreamGridView state got corrupted in computeScroll, resetting to top of stream", locallps);
        a(this.b);
        return;
      }
      ru localru = this.F;
    }
  }
  
  public final void d()
  {
    if ((this.i > 0) && (this.H != null))
    {
      int i1 = 0;
      if (i1 < this.H.length)
      {
        if (this.G) {
          removeViewInLayout(this.H[i1]);
        }
        for (;;)
        {
          this.t.b(i1 + (this.i - this.H.length));
          i1++;
          break;
          removeView(this.H[i1]);
        }
      }
    }
    if (this.G)
    {
      removeViewInLayout(this.p);
      return;
    }
    removeView(this.p);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    super.draw(paramCanvas);
    int i2;
    if (this.E != null)
    {
      ru localru1 = this.E;
      boolean bool = ru.b.a(localru1.a);
      i2 = 0;
      if (!bool)
      {
        ru localru4 = this.E;
        ru.b.a(localru4.a, paramCanvas);
        i2 = i1;
      }
      ru localru2 = this.F;
      if (ru.b.a(localru2.a)) {
        break label162;
      }
      int i3 = paramCanvas.save();
      int i4 = getWidth();
      paramCanvas.translate(-i4, getHeight());
      paramCanvas.rotate(180.0F, i4, 0.0F);
      ru localru3 = this.F;
      ru.b.a(localru3.a, paramCanvas);
      paramCanvas.restoreToCount(i3);
    }
    for (;;)
    {
      if (i1 != 0) {
        nj.a.l(this);
      }
      return;
      label162:
      i1 = i2;
    }
  }
  
  @TargetApi(12)
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (!this.u) {
      return true;
    }
    if ((Build.VERSION.SDK_INT >= 12) && (!e()) && ((0x2 & paramMotionEvent.getSource()) != 0)) {
      switch (paramMotionEvent.getAction())
      {
      }
    }
    label130:
    for (;;)
    {
      return super.onGenericMotionEvent(paramMotionEvent);
      if ((0x1 & paramMotionEvent.getMetaState()) != 0) {}
      for (float f1 = 0.0F;; f1 = paramMotionEvent.getAxisValue(9))
      {
        if (f1 == 0.0F) {
          break label130;
        }
        if (this.z == 0) {
          this.z = lwo.a(getContext());
        }
        if (a((int)(f1 * this.z), true)) {
          break;
        }
        this.D.clear();
        return true;
      }
    }
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      paramAccessibilityEvent.setScrollable(true);
      paramAccessibilityEvent.setItemCount(this.i);
      paramAccessibilityEvent.setFromIndex(this.g);
    }
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(StreamGridView.class.getCanonicalName());
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.u) {
      return false;
    }
    this.D.addMovement(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 1: 
    default: 
    case 0: 
      do
      {
        return false;
        this.D.clear();
        this.d.a.abortAnimation();
        this.A = paramMotionEvent.getY();
        this.C = ms.a.b(paramMotionEvent, 0);
        this.B = 0.0F;
      } while (this.v != 2);
      b(1);
      return true;
    }
    int i1 = this.C;
    int i2 = ms.a.a(paramMotionEvent, i1);
    if (i2 < 0)
    {
      int i4 = this.C;
      Log.e("StreamGridView", 123 + "onInterceptTouchEvent could not find pointer with id " + i4 + " - did StreamGridView receive an inconsistent event stream?");
      return false;
    }
    float f1 = ms.a.d(paramMotionEvent, i2) - this.A + this.B;
    int i3;
    label209:
    float f3;
    if (Math.abs(f1) > this.w)
    {
      i3 = 1;
      if (i3 == 0) {
        break label270;
      }
      if (f1 <= 0.0F) {
        break label260;
      }
      f3 = -this.w;
    }
    label229:
    for (float f2 = f3 + f1;; f2 = f1)
    {
      this.B = (f2 - (int)f2);
      if (i3 == 0) {
        break;
      }
      return true;
      i3 = 0;
      break label209;
      f3 = this.w;
      break label229;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.G = true;
    a();
    this.G = false;
    int i1 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    ru localru1 = this.E;
    ru.b.a(localru1.a, i1, i2);
    ru localru2 = this.F;
    ru.b.a(localru2.a, i1, i2);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      if (!this.u) {
        return true;
      }
      this.D.addMovement(paramMotionEvent);
      switch (0xFF & paramMotionEvent.getAction())
      {
      case 0: 
        this.D.clear();
        this.d.a.abortAnimation();
        this.A = paramMotionEvent.getY();
        this.C = ms.a.b(paramMotionEvent, 0);
        this.B = 0.0F;
      }
    }
    catch (lps locallps)
    {
      Log.e("StreamGridView", "StreamGridView state got corrupted in onTouchEvent, resetting to top of stream", locallps);
      a(this.b);
    }
    int i2 = this.C;
    int i3 = ms.a.a(paramMotionEvent, i2);
    if (i3 < 0)
    {
      int i4 = this.C;
      Log.e("StreamGridView", 114 + "onTouchEvent could not find pointer with id " + i4 + " - did StreamGridView receive an inconsistent event stream?");
      return false;
    }
    float f2 = ms.a.d(paramMotionEvent, i3);
    float f3 = f2 - this.A + this.B;
    if ((this.v == 0) && (Math.abs(f3) > this.w)) {
      if (f3 <= 0.0F) {
        break label310;
      }
    }
    label310:
    for (float f4 = -this.w;; f4 = this.w)
    {
      f3 += f4;
      b(1);
      int i5 = (int)f3;
      this.B = (f3 - i5);
      if (this.v != 1) {
        break;
      }
      this.A = f2;
      if (a(i5, true)) {
        break;
      }
      this.D.clear();
      break;
    }
    b(0);
    m();
    break label440;
    this.D.computeCurrentVelocity(1000, this.x);
    VelocityTracker localVelocityTracker = this.D;
    int i1 = this.C;
    float f1 = nf.a.b(localVelocityTracker, i1);
    if (Math.abs(f1) > this.y)
    {
      b(2);
      this.d.a(0, 0, 0, (int)f1, 0, 0, -2147483648, 2147483647);
      this.A = 0.0F;
      nj.a.l(this);
    }
    for (;;)
    {
      m();
      break;
      b(0);
    }
    label440:
    return true;
  }
  
  public final void requestLayout()
  {
    if (!this.e) {
      super.requestLayout();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.stream.legacy.views.StreamGridView
 * JD-Core Version:    0.7.0.1
 */