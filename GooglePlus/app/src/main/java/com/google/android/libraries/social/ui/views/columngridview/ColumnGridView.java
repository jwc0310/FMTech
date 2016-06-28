package com.google.android.libraries.social.ui.views.columngridview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Arrays;
import lb;
import lya;
import lyb;
import lyc;
import lyd;
import lye;
import lyg;
import lyh;
import lyi;
import ms;
import mw;
import nf;
import ni;
import nj;
import ns;
import ru;
import rx;

public final class ColumnGridView
  extends ViewGroup
{
  private int A;
  private float B;
  private float C;
  private final int D;
  private final int E;
  private final int F;
  private final VelocityTracker G = VelocityTracker.obtain();
  private final Scroller H;
  private final ru I;
  private final ru J;
  private float K = 1.0F;
  private final Point L = new Point();
  private final Point M = new Point(-1, -1);
  private Drawable N;
  private boolean O;
  private int[] P = new int[2];
  private Runnable Q = new lya(this);
  public boolean a;
  public int b = 2;
  public boolean c;
  public final lb<lyd> d = new lb();
  public final lyh e = new lyh();
  public boolean f;
  public int[] g;
  public int[] h;
  public int i;
  public int j;
  public int k;
  public ListAdapter l;
  public boolean m;
  public boolean n;
  public int o;
  public boolean p;
  public final SparseBooleanArray q = new SparseBooleanArray();
  public boolean r;
  public lye s;
  private int t = 2;
  private int u = 0;
  private int v;
  private boolean w;
  private final lyb x = new lyb(this);
  private int y;
  private int z;
  
  public ColumnGridView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ColumnGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ColumnGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.D = localViewConfiguration.getScaledTouchSlop();
    this.E = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.F = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.H = new Scroller(paramContext);
    this.I = new ru(paramContext);
    this.J = new ru(paramContext);
    setWillNotDraw(false);
    setClipToPadding(false);
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    label37:
    int i6;
    boolean bool;
    View localView;
    lyc locallyc;
    label134:
    int i10;
    int i11;
    lyd locallyd2;
    label213:
    int i30;
    int i31;
    int i32;
    label229:
    int i35;
    int i36;
    label242:
    int i38;
    if (this.a)
    {
      i1 = getPaddingTop();
      i2 = this.v;
      i3 = b();
      if (!this.a) {
        break label286;
      }
      i4 = getPaddingLeft();
      int i5 = i4 - paramInt2;
      i6 = g();
      bool = true;
      if ((i6 < 0) || ((this.g[i6] <= i5) && (bool)) || (paramInt1 < 0)) {
        break label1162;
      }
      int i9 = this.o;
      if (paramInt1 >= i9) {
        break label1162;
      }
      localView = a(paramInt1, null);
      locallyc = (lyc)localView.getLayoutParams();
      if (localView.getParent() != this)
      {
        if (!this.f) {
          break label295;
        }
        addViewInLayout(localView, 0, locallyc);
      }
      i10 = Math.min(this.b, locallyc.b);
      i11 = i3 * i10 + i2 * (i10 - 1);
      if (i10 <= 1) {
        break label707;
      }
      locallyd2 = (lyd)this.d.a(paramInt1);
      if (locallyd2 != null) {
        break label305;
      }
      locallyd2 = new lyd();
      locallyd2.d = i10;
      this.d.a(paramInt1, locallyd2);
      i30 = -1;
      i31 = -2147483648;
      i32 = this.b - i10;
      if (i32 < 0) {
        break label396;
      }
      i35 = 2147483647;
      i36 = i32;
      if (i36 >= i32 + i10) {
        break label371;
      }
      i38 = this.g[i36];
      if (i38 >= i35) {
        break label1231;
      }
    }
    for (;;)
    {
      i36++;
      i35 = i38;
      break label242;
      i1 = getPaddingLeft();
      break;
      label286:
      i4 = getPaddingTop();
      break label37;
      label295:
      addView(localView, 0);
      break label134;
      label305:
      if (locallyd2.d == i10) {
        break label213;
      }
      int i39 = locallyd2.d;
      throw new IllegalStateException(112 + "Invalid LayoutRecord! Record had span=" + i39 + " but caller requested span=" + i10 + " for position=" + paramInt1);
      label371:
      if (i35 > i31) {}
      for (int i37 = i32;; i37 = i30)
      {
        i32--;
        i31 = i35;
        i30 = i37;
        break label229;
        label396:
        locallyd2.a = i30;
        for (int i33 = 0; i33 < i10; i33++)
        {
          int i34 = this.g[(i33 + i30)] - i31;
          if ((locallyd2.e != null) || (i34 != 0))
          {
            locallyd2.a();
            locallyd2.e[(1 + (i33 << 1))] = i34;
          }
        }
        i6 = locallyd2.a;
        lyd locallyd1 = locallyd2;
        label477:
        int i12 = 0;
        label518:
        int i14;
        int i13;
        label592:
        int i15;
        label615:
        int i16;
        int i28;
        label671:
        int i29;
        if (locallyd1 == null)
        {
          locallyd1 = new lyd();
          this.d.a(paramInt1, locallyd1);
          locallyd1.a = i6;
          locallyd1.d = i10;
          if (this.m)
          {
            long l1 = this.l.getItemId(paramInt1);
            locallyd1.b = l1;
            locallyc.f = l1;
          }
          locallyc.e = i6;
          if (!this.a) {
            break label828;
          }
          i14 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
          if (locallyc.width != -2) {
            break label766;
          }
          i13 = View.MeasureSpec.makeMeasureSpec(0, 0);
          localView.measure(i13, i14);
          if (!this.a) {
            break label920;
          }
          i15 = localView.getMeasuredWidth();
          if ((i12 != 0) || ((i15 != locallyd1.c) && (locallyd1.c > 0))) {
            f(paramInt1);
          }
          locallyd1.c = i15;
          if (i10 <= 1) {
            break label930;
          }
          i16 = this.g[i6];
          i28 = i6 + 1;
          if (i28 >= i6 + i10) {
            break label939;
          }
          i29 = this.g[i28];
          if (i29 >= i16) {
            break label1213;
          }
        }
        for (;;)
        {
          i28++;
          i16 = i29;
          break label671;
          label707:
          locallyd1 = (lyd)this.d.a(paramInt1);
          break label477;
          if (i10 != locallyd1.d)
          {
            locallyd1.d = i10;
            locallyd1.a = i6;
            i12 = 1;
            break label518;
          }
          i6 = locallyd1.a;
          i12 = 0;
          break label518;
          label766:
          if (locallyc.width == -1)
          {
            i13 = View.MeasureSpec.makeMeasureSpec(i2 * (-1 + locallyc.a) + (int)(i3 * locallyc.a * this.K), 1073741824);
            break label592;
          }
          i13 = View.MeasureSpec.makeMeasureSpec(locallyc.width, 1073741824);
          break label592;
          label828:
          i13 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
          if (locallyc.height == -2)
          {
            i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
            break label592;
          }
          if (locallyc.height == -1)
          {
            i14 = View.MeasureSpec.makeMeasureSpec(i2 * (-1 + locallyc.a) + (int)(i3 * locallyc.a * this.K), 1073741824);
            break label592;
          }
          i14 = View.MeasureSpec.makeMeasureSpec(locallyc.height, 1073741824);
          break label592;
          label920:
          i15 = localView.getMeasuredHeight();
          break label615;
          label930:
          i16 = this.g[i6];
          label939:
          int i23;
          int i21;
          int i22;
          int i20;
          if (this.a)
          {
            i23 = i16 - i15;
            i21 = i1 + i6 * (i3 + i2);
            i22 = i21 + localView.getMeasuredHeight();
            i20 = i23;
          }
          for (;;)
          {
            localView.layout(i23, i21, i16, i22);
            for (int i24 = i6; i24 < i6 + i10; i24++) {
              this.g[i24] = (i20 - locallyd1.a(i24 - i6) - i2);
            }
            int i17 = i16 - i15;
            int i18 = i1 + i6 * (i3 + i2);
            int i19 = i18 + localView.getMeasuredWidth();
            i20 = i17;
            i21 = i17;
            i22 = i16;
            i16 = i19;
            i23 = i18;
          }
          bool = locallyc.g;
          int i25 = this.g[0];
          for (int i26 = 1; (i26 < this.b) && (bool); i26++) {
            if (this.g[i26] != i25) {
              bool = false;
            }
          }
          i6 = g();
          int i27 = paramInt1 - 1;
          this.i = paramInt1;
          paramInt1 = i27;
          break;
          label1162:
          int i7 = getHeight();
          for (int i8 = 0; i8 < this.b; i8++) {
            if (this.g[i8] < i7) {
              i7 = this.g[i8];
            }
          }
          return i4 - i7;
          label1213:
          i29 = i16;
        }
        i35 = i31;
      }
      label1231:
      i38 = i35;
    }
  }
  
  private int a(int[] paramArrayOfInt)
  {
    int i1 = -1;
    int i2 = 2147483647;
    int i3 = this.b;
    int i4 = 0;
    int i5;
    if (i4 < i3)
    {
      i5 = paramArrayOfInt[i4];
      if (i5 >= i2) {
        break label51;
      }
    }
    for (int i6 = i4;; i6 = i1)
    {
      i4++;
      i1 = i6;
      i2 = i5;
      break;
      return i1;
      label51:
      i5 = i2;
    }
  }
  
  private View a(int paramInt, View paramView)
  {
    lyh locallyh1 = this.e;
    View localView1;
    if (locallyh1.d == null) {
      localView1 = null;
    }
    while (localView1 != null)
    {
      return localView1;
      localView1 = (View)locallyh1.d.get(paramInt);
      if (localView1 != null) {
        locallyh1.d.remove(paramInt);
      }
    }
    int i1;
    int i2;
    label87:
    View localView2;
    Object localObject;
    if (paramView != null)
    {
      i1 = ((lyc)paramView.getLayoutParams()).d;
      i2 = this.l.getItemViewType(paramInt);
      if (i1 != i2) {
        break label221;
      }
      localView2 = this.l.getView(paramInt, paramView, this);
      if ((localView2 != paramView) && (paramView != null)) {
        this.e.a(paramView, getChildCount());
      }
      localObject = localView2.getLayoutParams();
      if (localView2.getParent() != this)
      {
        if (localObject != null) {
          break label295;
        }
        Log.e("ColumnGridView", 90 + "view at position " + paramInt + " doesn't have layout parameters;using default layout paramters");
        localObject = h();
      }
    }
    for (;;)
    {
      localView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
      lyc locallyc = (lyc)localObject;
      locallyc.c = paramInt;
      locallyc.d = i2;
      return localView2;
      i1 = -1;
      break;
      label221:
      lyh locallyh2 = this.e;
      if (i2 < 0)
      {
        paramView = null;
        break label87;
      }
      ArrayList localArrayList = locallyh2.a[i2];
      if (localArrayList.isEmpty())
      {
        paramView = null;
        break label87;
      }
      int i3 = -1 + localArrayList.size();
      View localView3 = (View)localArrayList.get(i3);
      localArrayList.remove(i3);
      paramView = localView3;
      break label87;
      label295:
      if (!checkLayoutParams((ViewGroup.LayoutParams)localObject))
      {
        Log.e("ColumnGridView", 116 + "view at position " + paramInt + " doesn't have layout parameters of type ColumnGridView.LayoutParams; wrapping parameters");
        localObject = a((ViewGroup.LayoutParams)localObject);
      }
    }
  }
  
  private lyc a(ViewGroup.LayoutParams paramLayoutParams)
  {
    lyc locallyc = new lyc(paramLayoutParams);
    if (this.a) {}
    for (int i1 = 1;; i1 = 2)
    {
      locallyc.h = i1;
      return locallyc;
    }
  }
  
  private lyd a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    lyd locallyd = (lyd)this.d.a(paramInt1);
    int i1;
    int i2;
    int i4;
    int i7;
    int i8;
    label76:
    int i10;
    if (locallyd == null)
    {
      locallyd = new lyd();
      locallyd.d = paramInt2;
      this.d.a(paramInt1, locallyd);
      i1 = -1;
      i2 = 2147483647;
      int i3 = this.b;
      i4 = 0;
      if (i4 > i3 - paramInt2) {
        break label197;
      }
      i7 = -2147483648;
      i8 = i4;
      if (i8 >= i4 + paramInt2) {
        break label172;
      }
      i10 = paramArrayOfInt[i8];
      if (i10 <= i7) {
        break label275;
      }
    }
    for (;;)
    {
      i8++;
      i7 = i10;
      break label76;
      if (locallyd.d == paramInt2) {
        break;
      }
      int i11 = locallyd.d;
      throw new IllegalStateException(112 + "Invalid LayoutRecord! Record had span=" + i11 + " but caller requested span=" + paramInt2 + " for position=" + paramInt1);
      label172:
      if (i7 < i2) {}
      for (int i9 = i4;; i9 = i1)
      {
        i4++;
        i2 = i7;
        i1 = i9;
        break;
        label197:
        locallyd.a = i1;
        for (int i5 = 0; i5 < paramInt2; i5++)
        {
          int i6 = i2 - paramArrayOfInt[(i5 + i1)];
          if ((locallyd.e != null) || (i6 != 0))
          {
            locallyd.a();
            locallyd.e[(i5 << 1)] = i6;
          }
        }
        return locallyd;
        i7 = i2;
      }
      label275:
      i10 = i7;
    }
  }
  
  private final boolean a(int paramInt, boolean paramBoolean)
  {
    int i1;
    int i2;
    int i15;
    int i14;
    label60:
    int i4;
    int i16;
    label78:
    int i17;
    if ((this.i != 0) || (getChildCount() != this.o))
    {
      i1 = 0;
      i2 = Math.abs(paramInt);
      if (i1 != 0) {
        break label1474;
      }
      this.w = true;
      if (paramInt <= 0) {
        break label307;
      }
      int i50 = a(-1 + this.i, i2);
      i15 = 1;
      i14 = i50;
      i4 = Math.min(i14, i2);
      if (i15 == 0) {
        break label335;
      }
      i16 = i4;
      if (!this.a) {
        break label343;
      }
      i17 = i16;
      label89:
      if (!this.a) {
        break label349;
      }
    }
    label302:
    label307:
    label335:
    label343:
    label349:
    for (int i18 = 0;; i18 = i16)
    {
      int i19 = getChildCount();
      for (int i20 = 0; i20 < i19; i20++)
      {
        View localView7 = getChildAt(i20);
        localView7.layout(i17 + localView7.getLeft(), i18 + localView7.getTop(), i17 + localView7.getRight(), i18 + localView7.getBottom());
      }
      int i51 = 2147483647;
      int i52 = -2147483648;
      for (int i53 = 0; i53 < this.b; i53++)
      {
        if (this.g[i53] < i51) {
          i51 = this.g[i53];
        }
        if (this.h[i53] > i52) {
          i52 = this.h[i53];
        }
      }
      int i54;
      int i55;
      if (this.a)
      {
        i54 = getPaddingLeft();
        i55 = getPaddingRight();
      }
      for (int i56 = getWidth();; i56 = getHeight())
      {
        if ((i51 < i54) || (i52 > i56 - i55)) {
          break label302;
        }
        i1 = 1;
        break;
        i54 = getPaddingTop();
        i55 = getPaddingBottom();
      }
      i1 = 0;
      break;
      i14 = b(this.i + getChildCount(), i2) + this.v;
      i15 = 0;
      break label60;
      i16 = -i4;
      break label78;
      i17 = 0;
      break label89;
    }
    int i21 = this.b;
    for (int i22 = 0; i22 < i21; i22++)
    {
      int[] arrayOfInt1 = this.g;
      arrayOfInt1[i22] = (i16 + arrayOfInt1[i22]);
      int[] arrayOfInt2 = this.h;
      arrayOfInt2[i22] = (i16 + arrayOfInt2[i22]);
    }
    int i23;
    int i26;
    int i28;
    int i29;
    int i30;
    label488:
    View localView6;
    int i46;
    label515:
    int i47;
    label529:
    int i49;
    label578:
    int i48;
    if (this.a)
    {
      i23 = getWidth();
      int i24 = this.v;
      int i25 = (int)(b() * this.K) + i24 * this.b;
      i26 = -i24;
      int i27 = i23 + i24;
      i28 = -i25;
      i29 = i23 + i25;
      i30 = -1 + getChildCount();
      if (i30 < 0) {
        break label659;
      }
      localView6 = getChildAt(i30);
      if (!this.a) {
        break label608;
      }
      i46 = localView6.getRight();
      if (!this.a) {
        break label618;
      }
      i47 = localView6.getLeft();
      if (((i47 > i26) && (i46 < i27)) || (i46 < i28) || (i47 > i29) || (i46 >= i26)) {
        break label1560;
      }
      if (!this.a) {
        break label628;
      }
      i49 = localView6.getWidth();
      if (i49 <= i25) {
        break label638;
      }
      i48 = i26;
    }
    label608:
    label618:
    label628:
    label1524:
    label1530:
    for (;;)
    {
      i30--;
      i28 = i48;
      break label488;
      i23 = getHeight();
      break;
      i46 = localView6.getBottom();
      break label515;
      i47 = localView6.getTop();
      break label529;
      i49 = localView6.getHeight();
      break label578;
      label638:
      if (!((lyc)localView6.getLayoutParams()).g)
      {
        i48 = i26;
        continue;
        int i31 = -1 + getChildCount();
        if (i31 >= 0)
        {
          View localView5 = getChildAt(i31);
          int i45;
          if (this.a)
          {
            i45 = localView5.getLeft();
            if (i45 <= i29) {
              break label753;
            }
            if (!this.f) {
              break label744;
            }
            removeViewsInLayout(i31, 1);
          }
          for (;;)
          {
            this.e.a(localView5, getChildCount());
            i31--;
            break;
            i45 = localView5.getTop();
            break label694;
            removeViewAt(i31);
          }
        }
        this.j = 0;
        View localView4;
        int i44;
        int i32;
        if (getChildCount() > 0)
        {
          localView4 = getChildAt(0);
          if (this.a)
          {
            i44 = localView4.getRight();
            if (i44 < i28) {
              break label1038;
            }
            f();
          }
        }
        else
        {
          i32 = getChildCount();
          if (i32 <= 0) {
            break label1212;
          }
          Arrays.fill(this.g, 2147483647);
          Arrays.fill(this.h, -2147483648);
        }
        for (int i33 = 0;; i33++)
        {
          if (i33 >= i32) {
            break label1111;
          }
          View localView3 = getChildAt(i33);
          lyc locallyc = (lyc)localView3.getLayoutParams();
          int i37;
          int i38;
          if (this.a)
          {
            i37 = localView3.getLeft();
            i38 = i37 - this.v;
            if (!this.a) {
              break label1095;
            }
          }
          for (int i39 = localView3.getRight();; i39 = localView3.getBottom())
          {
            lyd locallyd = (lyd)this.d.a(i33 + this.i);
            int i40 = locallyc.e + Math.min(this.b, locallyc.b);
            for (int i41 = locallyc.e; i41 < i40; i41++)
            {
              int i42 = i38 - locallyd.a(i41 - locallyc.e);
              int i43 = i39 + locallyd.b(i41 - locallyc.e);
              if (i42 < this.g[i41]) {
                this.g[i41] = i42;
              }
              if (i43 > this.h[i41]) {
                this.h[i41] = i43;
              }
            }
            i44 = localView4.getBottom();
            break label786;
            if (this.f) {
              removeViewsInLayout(0, 1);
            }
            for (;;)
            {
              this.e.a(localView4, getChildCount());
              this.i = (1 + this.i);
              break;
              removeViewAt(0);
            }
            i37 = localView3.getTop();
            break label868;
          }
        }
        int i34 = 2147483647;
        for (int i35 = 0; i35 < this.b; i35++) {
          if (this.g[i35] < i34) {
            i34 = this.g[i35];
          }
        }
        if (i34 == 2147483647) {
          i34 = 0;
        }
        for (int i36 = 0; i36 < this.b; i36++) {
          if (this.g[i36] == 2147483647)
          {
            this.g[i36] = i34;
            this.h[i36] = i34;
          }
        }
        this.w = false;
        int i3 = i2 - i14;
        ru localru;
        int i13;
        if (paramBoolean)
        {
          int i12 = nj.a.a(this);
          if (((i12 == 0) || ((i12 == 1) && (i1 == 0))) && (i3 > 0))
          {
            if (paramInt <= 0) {
              break label1484;
            }
            localru = this.I;
            if (!this.a) {
              break label1493;
            }
            i13 = getWidth();
            float f1 = Math.abs(paramInt) / i13;
            ru.b.a(localru.a, f1);
            nj.a.l(this);
          }
        }
        int i5 = getChildCount();
        View localView2;
        int i10;
        int i11;
        View localView1;
        int i7;
        int i8;
        int i9;
        if (i5 > 0)
        {
          i6 = 1;
          if ((i6 != 0) && (this.i == 0))
          {
            localView2 = getChildAt(0);
            if (!this.a) {
              break label1508;
            }
            i10 = localView2.getLeft();
            i11 = getPaddingLeft();
            if ((i10 >= i11) && (paramInt >= 0)) {
              break label1524;
            }
            i6 = 1;
          }
          if ((i6 != 0) && (i5 + this.i == this.o))
          {
            localView1 = getChildAt(i5 - 1);
            if (!this.a) {
              break label1530;
            }
            i7 = localView1.getRight();
            i8 = getPaddingRight();
            i9 = getWidth();
            if ((i7 <= i9 - i8) && (paramInt <= 0)) {
              break label1552;
            }
          }
        }
        for (int i6 = 1;; i6 = 0)
        {
          if (i6 != 0) {
            c(paramInt);
          }
          if ((paramInt != 0) && (i4 == 0)) {
            break label1558;
          }
          return true;
          i3 = i2;
          i4 = 0;
          break;
          localru = this.J;
          break label1267;
          i13 = getHeight();
          break label1280;
          i6 = 0;
          break label1328;
          i10 = localView2.getTop();
          i11 = getPaddingTop();
          break label1367;
          i6 = 0;
          break label1381;
          i7 = localView1.getBottom();
          i8 = getPaddingBottom();
          i9 = getHeight();
          break label1436;
        }
        return false;
      }
      else
      {
        i48 = i28;
      }
    }
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    label42:
    int i6;
    label58:
    View localView;
    lyc locallyc;
    label131:
    int i10;
    int i11;
    lyd locallyd;
    label190:
    int i12;
    label231:
    int i27;
    int i13;
    int i14;
    label309:
    int i15;
    label332:
    int i16;
    int i25;
    label388:
    int i26;
    if (this.a)
    {
      i1 = getPaddingTop();
      i2 = this.v;
      i3 = b();
      if (!this.a) {
        break label432;
      }
      i4 = getWidth() - getPaddingRight();
      int i5 = i4 + paramInt2;
      i6 = a(this.h);
      if ((i6 < 0) || (this.h[i6] >= i5)) {
        break label862;
      }
      int i9 = this.o;
      if (paramInt1 >= i9) {
        break label862;
      }
      localView = a(paramInt1, null);
      locallyc = (lyc)localView.getLayoutParams();
      if (localView.getParent() != this)
      {
        if (!this.f) {
          break label446;
        }
        addViewInLayout(localView, -1, locallyc);
      }
      i10 = Math.min(this.b, locallyc.b);
      i11 = i3 * i10 + i2 * (i10 - 1);
      if (i10 <= 1) {
        break label455;
      }
      int[] arrayOfInt = this.h;
      locallyd = a(paramInt1, i10, arrayOfInt);
      i6 = locallyd.a;
      i12 = 0;
      if (locallyd != null) {
        break label471;
      }
      locallyd = new lyd();
      this.d.a(paramInt1, locallyd);
      locallyd.a = i6;
      locallyd.d = i10;
      if (this.m)
      {
        long l1 = this.l.getItemId(paramInt1);
        locallyd.b = l1;
        locallyc.f = l1;
      }
      locallyc.e = i6;
      if (!this.a) {
        break label584;
      }
      i27 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
      if (locallyc.width != -2) {
        break label514;
      }
      i13 = View.MeasureSpec.makeMeasureSpec(0, 0);
      i14 = i27;
      localView.measure(i13, i14);
      if (!this.a) {
        break label676;
      }
      i15 = localView.getMeasuredWidth();
      if ((i12 != 0) || ((i15 != locallyd.c) && (locallyd.c > 0))) {
        g(paramInt1);
      }
      locallyd.c = i15;
      if (i10 <= 1) {
        break label686;
      }
      i16 = this.h[i6];
      i25 = i6 + 1;
      if (i25 >= i6 + i10) {
        break label695;
      }
      i26 = this.h[i25];
      if (i26 <= i16) {
        break label910;
      }
    }
    for (;;)
    {
      i25++;
      i16 = i26;
      break label388;
      i1 = getPaddingLeft();
      break;
      label432:
      i4 = getHeight() - getPaddingBottom();
      break label42;
      label446:
      addView(localView);
      break label131;
      label455:
      locallyd = (lyd)this.d.a(paramInt1);
      break label190;
      label471:
      if (i10 != locallyd.d)
      {
        locallyd.d = i10;
        locallyd.a = i6;
        i12 = 1;
        break label231;
      }
      i6 = locallyd.a;
      i12 = 0;
      break label231;
      label514:
      if (locallyc.width == -1)
      {
        i13 = View.MeasureSpec.makeMeasureSpec(i2 * (-1 + locallyc.a) + (int)(i3 * locallyc.a * this.K), 1073741824);
        i14 = i27;
        break label309;
      }
      i13 = View.MeasureSpec.makeMeasureSpec(locallyc.width, 1073741824);
      i14 = i27;
      break label309;
      label584:
      i13 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
      if (locallyc.height == -2)
      {
        i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label309;
      }
      if (locallyc.height == -1)
      {
        i14 = View.MeasureSpec.makeMeasureSpec(i2 * (-1 + locallyc.a) + (int)(i3 * locallyc.a * this.K), 1073741824);
        break label309;
      }
      i14 = View.MeasureSpec.makeMeasureSpec(locallyc.height, 1073741824);
      break label309;
      label676:
      i15 = localView.getMeasuredHeight();
      break label332;
      label686:
      i16 = this.h[i6];
      label695:
      int i22;
      int i18;
      int i23;
      int i20;
      int i21;
      if (this.a)
      {
        i22 = i16 + i2;
        i18 = i22 + i15;
        i23 = i1 + i6 * (i3 + i2);
        i20 = i23 + localView.getMeasuredHeight();
        i21 = i18;
      }
      for (;;)
      {
        localView.layout(i22, i23, i18, i20);
        for (int i24 = i6; i24 < i6 + i10; i24++) {
          this.h[i24] = (i21 + locallyd.b(i24 - i6));
        }
        int i17 = i1 + i6 * (i3 + i2);
        i18 = i17 + localView.getMeasuredWidth();
        int i19 = i16 + i2;
        i20 = i15 + i19;
        i21 = i20;
        i22 = i17;
        i23 = i19;
      }
      i6 = a(this.h);
      paramInt1++;
      break label58;
      label862:
      int i7 = 0;
      for (int i8 = 0; i8 < this.b; i8++) {
        if (this.h[i8] > i7) {
          i7 = this.h[i8];
        }
      }
      return i7 - i4;
      label910:
      i26 = i16;
    }
  }
  
  private final void c(int paramInt1, int paramInt2)
  {
    if (!this.O) {}
    int i5;
    label176:
    do
    {
      int i1;
      int i2;
      do
      {
        return;
        i1 = this.L.x - paramInt1;
        i2 = this.L.y - paramInt2;
      } while (i1 * i1 + i2 * i2 >= this.D * this.D);
      int i3 = this.i;
      int i4 = -1 + getChildCount();
      i5 = 0;
      if (i4 >= 0)
      {
        View localView = getChildAt(i4);
        localView.getLocationOnScreen(this.P);
        int i6;
        if ((paramInt1 >= this.P[0]) && (paramInt1 <= this.P[0] + localView.getWidth()) && (paramInt2 >= this.P[1]) && (paramInt2 <= this.P[1] + localView.getHeight()))
        {
          i6 = i4 + i3;
          if (!this.q.get(i6, false)) {
            break label176;
          }
          e(i6);
        }
        for (;;)
        {
          i5 = 1;
          i4--;
          break;
          if ((this.O) && (!this.q.get(i6)))
          {
            this.q.put(i6, true);
            getChildAt(i6 - this.i);
          }
        }
      }
    } while (i5 == 0);
    invalidate();
  }
  
  private final void f()
  {
    int i1 = -this.v;
    this.j = 0;
    int i2 = getChildCount();
    int i3 = 0;
    if (i3 < i2)
    {
      View localView = getChildAt(i3);
      if (this.a) {}
      for (int i4 = localView.getRight();; i4 = localView.getBottom())
      {
        if (i4 >= i1) {
          return;
        }
        this.j = (1 + this.j);
        i3++;
        break;
      }
    }
  }
  
  private void f(int paramInt)
  {
    for (int i1 = 0;; i1++)
    {
      lb locallb = this.d;
      if (locallb.b) {
        locallb.a();
      }
      if ((i1 >= locallb.e) || (this.d.d(i1) >= paramInt)) {
        break;
      }
    }
    this.d.a(0, i1);
  }
  
  private int g()
  {
    int i1 = -1;
    int i2 = -2147483648;
    int i3 = -1 + this.b;
    int i4;
    if (i3 >= 0)
    {
      i4 = this.g[i3];
      if (i4 <= i2) {
        break label47;
      }
    }
    for (int i5 = i3;; i5 = i1)
    {
      i3--;
      i1 = i5;
      i2 = i4;
      break;
      return i1;
      label47:
      i4 = i2;
    }
  }
  
  private void g(int paramInt)
  {
    lb locallb1 = this.d;
    if (locallb1.b) {
      locallb1.a();
    }
    for (int i1 = -1 + locallb1.e; (i1 >= 0) && (this.d.d(i1) > paramInt); i1--) {}
    int i2 = i1 + 1;
    lb locallb2 = this.d;
    int i3 = i2 + 1;
    lb locallb3 = this.d;
    if (locallb3.b) {
      locallb3.a();
    }
    locallb2.a(i3, locallb3.e - i2);
  }
  
  private lyc h()
  {
    if (this.a) {}
    for (int i1 = 1;; i1 = 2) {
      return new lyc(i1, -2, 1, 1);
    }
  }
  
  private final void h(int paramInt)
  {
    if (paramInt != this.z)
    {
      this.z = paramInt;
      if (this.s != null) {
        this.s.a(this, paramInt);
      }
    }
  }
  
  private final void i()
  {
    ru localru1 = this.I;
    boolean bool = false;
    if (localru1 != null)
    {
      ru localru3 = this.I;
      bool = ru.b.c(localru3.a);
    }
    if (this.J != null)
    {
      ru localru2 = this.J;
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
    int i56;
    if (this.b == -1)
    {
      if (!this.a) {
        break label499;
      }
      i56 = getHeight() / 0;
      if (i56 != this.b) {
        this.b = i56;
      }
    }
    int i1 = this.b;
    int i2;
    label100:
    int i4;
    label141:
    label170:
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    View localView3;
    lyc locallyc3;
    int i35;
    int i36;
    int i37;
    label263:
    View localView4;
    if ((this.g == null) || (this.g.length != i1))
    {
      this.g = new int[i1];
      this.h = new int[i1];
      if (this.a)
      {
        i2 = getPaddingLeft();
        int i3 = i2 + this.k;
        Arrays.fill(this.g, i3);
        Arrays.fill(this.h, i3);
        this.d.c();
        if (!this.f) {
          break label518;
        }
        removeAllViewsInLayout();
        this.k = 0;
      }
    }
    else
    {
      this.w = true;
      boolean bool = this.n;
      if (!this.a) {
        break label525;
      }
      i4 = getPaddingTop();
      i5 = this.v;
      i6 = b();
      i7 = -1;
      i8 = -1;
      Arrays.fill(this.h, -2147483648);
      i9 = getChildCount();
      i10 = 0;
      if (i10 >= i9) {
        break label952;
      }
      localView3 = getChildAt(i10);
      locallyc3 = (lyc)localView3.getLayoutParams();
      i35 = locallyc3.e;
      i36 = i10 + this.i;
      if ((!bool) && (!localView3.isLayoutRequested())) {
        break label534;
      }
      i37 = 1;
      if (!bool) {
        break label1945;
      }
      localView4 = a(i36, localView3);
      if (localView4 == localView3) {
        break label1938;
      }
      removeViewAt(i10);
      addView(localView4, i10);
      label299:
      int i55 = locallyc3.b;
      locallyc3 = (lyc)localView4.getLayoutParams();
      if (locallyc3.b != i55) {
        Log.e("ColumnGridView", "Span changed!");
      }
      locallyc3.e = i35;
    }
    for (;;)
    {
      int i38 = Math.min(this.b, locallyc3.b);
      int i39 = i6 * i38 + i5 * (i38 - 1);
      int i54;
      int i52;
      int i53;
      label415:
      int i40;
      label448:
      int i50;
      label460:
      int i51;
      if (i37 != 0)
      {
        if (!this.a) {
          break label610;
        }
        i54 = View.MeasureSpec.makeMeasureSpec(i39, 1073741824);
        if (locallyc3.width == -2)
        {
          i52 = View.MeasureSpec.makeMeasureSpec(0, 0);
          i53 = i54;
          localView4.measure(i52, i53);
        }
      }
      else
      {
        if (this.h[i35] <= -2147483648) {
          break label702;
        }
        i40 = i5 + this.h[i35];
        if (i38 <= 1) {
          break label729;
        }
        i50 = i35 + 1;
        if (i50 >= i35 + i38) {
          break label729;
        }
        i51 = i5 + this.h[i50];
        if (i51 <= i40) {
          break label1931;
        }
      }
      for (;;)
      {
        i50++;
        i40 = i51;
        break label460;
        label499:
        i56 = getWidth() / 0;
        break;
        i2 = getPaddingTop();
        break label100;
        label518:
        removeAllViews();
        break label141;
        label525:
        i4 = getPaddingLeft();
        break label170;
        label534:
        i37 = 0;
        break label263;
        if (locallyc3.width == -1)
        {
          i52 = View.MeasureSpec.makeMeasureSpec(i5 * (-1 + locallyc3.a) + (int)(i6 * locallyc3.a * this.K), 1073741824);
          i53 = i54;
          break label415;
        }
        i52 = View.MeasureSpec.makeMeasureSpec(locallyc3.width, 1073741824);
        i53 = i54;
        break label415;
        label610:
        i52 = View.MeasureSpec.makeMeasureSpec(i39, 1073741824);
        if (locallyc3.height == -2)
        {
          i53 = View.MeasureSpec.makeMeasureSpec(0, 0);
          break label415;
        }
        if (locallyc3.height == -1)
        {
          i53 = View.MeasureSpec.makeMeasureSpec(i5 * (-1 + locallyc3.a) + (int)(i6 * locallyc3.a * this.K), 1073741824);
          break label415;
        }
        i53 = View.MeasureSpec.makeMeasureSpec(locallyc3.height, 1073741824);
        break label415;
        label702:
        if (this.a)
        {
          i40 = localView4.getLeft();
          break label448;
        }
        i40 = localView4.getTop();
        break label448;
        label729:
        int i41;
        label743:
        int i43;
        int i47;
        int i44;
        int i45;
        label784:
        lyd locallyd3;
        if (this.a)
        {
          i41 = localView4.getMeasuredWidth();
          if (!this.a) {
            break label903;
          }
          i43 = i40 + i41;
          i47 = i4 + i35 * (i6 + i5);
          i44 = i47 + localView4.getMeasuredHeight();
          i45 = i43;
          localView4.layout(i40, i47, i43, i44);
          Arrays.fill(this.h, i35, i35 + i38, i45);
          locallyd3 = (lyd)this.d.a(i36);
          if ((locallyd3 == null) || (locallyd3.c == i41)) {
            break label1924;
          }
          locallyd3.c = i41;
        }
        label1795:
        label1924:
        for (int i48 = i36;; i48 = i7)
        {
          if ((locallyd3 != null) && (locallyd3.d != i38)) {
            locallyd3.d = i38;
          }
          for (int i49 = i36;; i49 = i8)
          {
            i10++;
            i8 = i49;
            i7 = i48;
            break;
            i41 = localView4.getMeasuredHeight();
            break label743;
            label903:
            int i42 = i4 + i35 * (i6 + i5);
            i43 = i42 + localView4.getMeasuredWidth();
            i44 = i40 + i41;
            i45 = i44;
            int i46 = i40;
            i40 = i42;
            i47 = i46;
            break label784;
            label952:
            for (int i11 = 0; i11 < this.b; i11++) {
              if (this.h[i11] == -2147483648) {
                this.h[i11] = this.g[i11];
              }
            }
            if ((i7 >= 0) || (i8 >= 0))
            {
              if (i7 >= 0) {
                f(i7);
              }
              if (i8 >= 0) {
                g(i8);
              }
              int i12 = 0;
              if (i12 < i9)
              {
                int i33 = i12 + this.i;
                View localView2 = getChildAt(i12);
                lyc locallyc2 = (lyc)localView2.getLayoutParams();
                lyd locallyd2 = (lyd)this.d.a(i33);
                if (locallyd2 == null)
                {
                  locallyd2 = new lyd();
                  this.d.a(i33, locallyd2);
                }
                locallyd2.a = locallyc2.e;
                if (this.a) {}
                for (int i34 = localView2.getWidth();; i34 = localView2.getHeight())
                {
                  locallyd2.c = i34;
                  locallyd2.b = locallyc2.f;
                  locallyd2.d = Math.min(this.b, locallyc2.b);
                  i12++;
                  break;
                }
              }
            }
            int i13 = this.i;
            int[] arrayOfInt;
            int i14;
            int i15;
            int i17;
            int i18;
            View localView1;
            lyc locallyc1;
            int i19;
            int i20;
            Object localObject;
            int i21;
            label1315:
            int i22;
            label1357:
            int i32;
            int i23;
            int i24;
            label1436:
            int i25;
            label1459:
            int i26;
            int i30;
            label1514:
            int i31;
            if (this.f)
            {
              arrayOfInt = new int[this.b];
              i14 = this.v;
              i15 = b();
              int i16 = a(arrayOfInt);
              i17 = 0;
              i18 = i16;
              if ((i17 < i13) && (i17 < this.o))
              {
                localView1 = a(i17, null);
                locallyc1 = (lyc)localView1.getLayoutParams();
                i19 = Math.min(this.b, locallyc1.b);
                i20 = i15 * i19 + i14 * (i19 - 1);
                if (i19 > 1)
                {
                  localObject = a(i17, i19, arrayOfInt);
                  i21 = ((lyd)localObject).a;
                  i22 = 0;
                  if (localObject != null) {
                    break label1573;
                  }
                  localObject = new lyd();
                  this.d.a(i17, localObject);
                  ((lyd)localObject).a = i21;
                  ((lyd)localObject).d = i19;
                  if (this.m)
                  {
                    long l1 = this.l.getItemId(i17);
                    ((lyd)localObject).b = l1;
                    locallyc1.f = l1;
                  }
                  locallyc1.e = i21;
                  if (!this.a) {
                    break label1686;
                  }
                  i32 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                  if (locallyc1.width != -2) {
                    break label1616;
                  }
                  i23 = View.MeasureSpec.makeMeasureSpec(0, 0);
                  i24 = i32;
                  localView1.measure(i23, i24);
                  if (!this.a) {
                    break label1778;
                  }
                  i25 = localView1.getMeasuredWidth();
                  if ((i22 != 0) || ((i25 != ((lyd)localObject).c) && (((lyd)localObject).c > 0))) {
                    g(i17);
                  }
                  ((lyd)localObject).c = i25;
                  if (i19 <= 1) {
                    break label1788;
                  }
                  i26 = arrayOfInt[i21];
                  i30 = i21 + 1;
                  if (i30 >= i21 + i19) {
                    break label1795;
                  }
                  i31 = arrayOfInt[i30];
                  if (i31 <= i26) {
                    break label1910;
                  }
                }
              }
            }
            for (;;)
            {
              i30++;
              i26 = i31;
              break label1514;
              lyd locallyd1 = (lyd)this.d.a(i17);
              i21 = i18;
              localObject = locallyd1;
              break label1315;
              label1573:
              if (i19 != ((lyd)localObject).d)
              {
                ((lyd)localObject).d = i19;
                ((lyd)localObject).a = i21;
                i22 = 1;
                break label1357;
              }
              i21 = ((lyd)localObject).a;
              i22 = 0;
              break label1357;
              label1616:
              if (locallyc1.width == -1)
              {
                i23 = View.MeasureSpec.makeMeasureSpec(i14 * (-1 + locallyc1.a) + (int)(i15 * locallyc1.a * this.K), 1073741824);
                i24 = i32;
                break label1436;
              }
              i23 = View.MeasureSpec.makeMeasureSpec(locallyc1.width, 1073741824);
              i24 = i32;
              break label1436;
              label1686:
              i23 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
              if (locallyc1.height == -2)
              {
                i24 = View.MeasureSpec.makeMeasureSpec(0, 0);
                break label1436;
              }
              if (locallyc1.height == -1)
              {
                i24 = View.MeasureSpec.makeMeasureSpec(i14 * (-1 + locallyc1.a) + (int)(i15 * locallyc1.a * this.K), 1073741824);
                break label1436;
              }
              i24 = View.MeasureSpec.makeMeasureSpec(locallyc1.height, 1073741824);
              break label1436;
              label1778:
              i25 = localView1.getMeasuredHeight();
              break label1459;
              label1788:
              i26 = arrayOfInt[i21];
              int i27 = i14 + (i26 + i25);
              for (int i28 = i21; i28 < i21 + i19; i28++) {
                arrayOfInt[i28] = (i27 + ((lyd)localObject).b(i28 - i21));
              }
              int i29 = a(arrayOfInt);
              i17++;
              i18 = i29;
              break;
              b(this.i + getChildCount(), 0);
              a(-1 + this.i, Math.max(this.k, 0));
              f();
              this.w = false;
              this.n = false;
              return;
              label1910:
              i31 = i26;
            }
          }
        }
        label1931:
        i51 = i40;
      }
      label1938:
      localView4 = localView3;
      break label299;
      label1945:
      localView4 = localView3;
    }
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt <= 0) && (paramInt != -1)) {
      throw new IllegalArgumentException(50 + "colCount must be at least 1 - received " + paramInt);
    }
    if (paramInt != this.b) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.t = paramInt;
      this.b = paramInt;
      if (i1 != 0) {
        a();
      }
      return;
    }
  }
  
  public final void a(ListAdapter paramListAdapter)
  {
    if (this.l != null)
    {
      this.l.unregisterDataSetObserver(this.x);
      c();
    }
    this.l = paramListAdapter;
    this.n = true;
    if (paramListAdapter != null) {}
    lyh locallyh;
    int i2;
    for (int i1 = paramListAdapter.getCount();; i1 = 0)
    {
      this.o = i1;
      if (paramListAdapter == null) {
        break label215;
      }
      paramListAdapter.registerDataSetObserver(this.x);
      locallyh = this.e;
      i2 = paramListAdapter.getViewTypeCount();
      if (i2 > 0) {
        break;
      }
      throw new IllegalArgumentException(61 + "Must have at least one view type (" + i2 + " types reported)");
    }
    if (i2 != locallyh.b)
    {
      ArrayList[] arrayOfArrayList = new ArrayList[i2];
      for (int i3 = 0; i3 < i2; i3++) {
        arrayOfArrayList[i3] = new ArrayList();
      }
      locallyh.b = i2;
      locallyh.a = arrayOfArrayList;
    }
    this.m = paramListAdapter.hasStableIds();
    while (this.O) {
      if (!this.O)
      {
        throw new IllegalStateException("Not in selection mode!");
        label215:
        this.m = false;
      }
      else
      {
        this.O = false;
        if (this.q.size() > 0) {
          invalidate();
        }
        this.q.clear();
      }
    }
    a();
  }
  
  public final int b()
  {
    int i1 = 1;
    int i2;
    int i3;
    label26:
    int i4;
    label39:
    int i7;
    label83:
    int i8;
    if (this.a)
    {
      i2 = getPaddingTop();
      if (!this.a) {
        break label113;
      }
      i3 = getPaddingBottom();
      if (!this.a) {
        break label121;
      }
      i4 = getHeight();
      int i5 = i4 - i2 - i3;
      int i6 = this.v * (-1 + this.b);
      if ((!this.c) || ((i5 - i6) % this.b == 0)) {
        break label130;
      }
      i7 = i1;
      i8 = (i5 - i6) / this.b;
      if (i7 == 0) {
        break label136;
      }
    }
    for (;;)
    {
      return i8 + i1;
      i2 = getPaddingLeft();
      break;
      label113:
      i3 = getPaddingRight();
      break label26;
      label121:
      i4 = getWidth();
      break label39;
      label130:
      i7 = 0;
      break label83;
      label136:
      i1 = 0;
    }
  }
  
  public final void b(int paramInt)
  {
    if (paramInt != this.v) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.v = paramInt;
      if (i1 != 0) {
        a();
      }
      return;
    }
  }
  
  public final void c()
  {
    this.d.c();
    removeAllViews();
    d();
    lyh locallyh = this.e;
    int i1 = locallyh.b;
    for (int i2 = 0; i2 < i1; i2++) {
      locallyh.a[i2].clear();
    }
    if (locallyh.d != null) {
      locallyh.d.clear();
    }
  }
  
  public final void c(int paramInt)
  {
    if (this.s != null)
    {
      lye locallye = this.s;
      int i1 = this.i;
      int i2 = this.j;
      getChildCount();
      locallye.a(this, i1, i2, paramInt);
    }
    onScrollChanged(0, 0, 0, 0);
  }
  
  public final boolean canScrollVertically(int paramInt)
  {
    if (paramInt < 0)
    {
      int i1;
      if (getChildCount() == 0) {
        i1 = 1;
      }
      while (i1 == 0)
      {
        return true;
        if (this.i + this.j == 0)
        {
          int i2 = getPaddingTop();
          if (getChildAt(0).getTop() >= i2 + this.v)
          {
            i1 = 1;
            continue;
          }
        }
        i1 = 0;
      }
      return false;
    }
    return super.canScrollVertically(paramInt);
  }
  
  protected final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof lyc;
  }
  
  @TargetApi(14)
  public final void computeScroll()
  {
    int i1;
    int i2;
    if (this.H.computeScrollOffset())
    {
      if (!this.a) {
        break label81;
      }
      i1 = this.H.getCurrX();
      i2 = (int)(i1 - this.B);
      this.B = i1;
      if (a(i2, false)) {
        break label92;
      }
    }
    label81:
    label92:
    for (int i3 = 1;; i3 = 0)
    {
      if ((i3 != 0) || (this.H.isFinished())) {
        break label97;
      }
      nj.a.l(this);
      h(this.y);
      return;
      i1 = this.H.getCurrY();
      break;
    }
    label97:
    ru localru;
    if (i3 != 0) {
      if (nj.a.a(this) != 2)
      {
        if (i2 <= 0) {
          break label185;
        }
        localru = this.I;
        label122:
        if (Build.VERSION.SDK_INT < 14) {
          break label194;
        }
      }
    }
    label185:
    label194:
    for (int i4 = (int)this.H.getCurrVelocity();; i4 = 0)
    {
      int i5 = Math.abs(i4);
      ru.b.a(localru.a, i5);
      nj.a.l(this);
      this.H.abortAnimation();
      this.y = 0;
      break;
      localru = this.J;
      break label122;
    }
  }
  
  public final void d()
  {
    int i1 = this.b;
    if (i1 != -1)
    {
      if ((this.g == null) || (this.g.length != i1))
      {
        this.g = new int[i1];
        this.h = new int[i1];
      }
      int i2 = getPaddingTop();
      Arrays.fill(this.g, i2);
      Arrays.fill(this.h, i2);
    }
    this.H.setFinalX(0);
    this.H.setFinalY(0);
    this.H.abortAnimation();
    scrollTo(0, 0);
    this.i = 0;
    this.j = 0;
    this.k = 0;
  }
  
  public final void d(int paramInt)
  {
    if (paramInt == 0)
    {
      this.N = null;
      return;
    }
    this.N = getResources().getDrawable(paramInt);
  }
  
  public final void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    if (this.N == null) {}
    for (;;)
    {
      return;
      int i1 = getPaddingLeft();
      int i2 = getRight() - getPaddingRight();
      int i3 = getPaddingTop();
      int i4 = getBottom() - getPaddingBottom();
      for (int i5 = -1 + getChildCount(); i5 >= 0; i5--)
      {
        View localView = getChildAt(i5);
        int i6 = i5 + this.i;
        if (!this.q.get(i6, false))
        {
          if ((this.r) && (this.M.x >= 0) && (this.M.y >= 0) && ((!(localView instanceof lyg)) || (((lyg)localView).d())))
          {
            localView.getLocationOnScreen(this.P);
            if ((this.M.x < this.P[0]) || (this.M.x > this.P[0] + localView.getWidth()) || (this.M.y < this.P[1]) || (this.M.y > this.P[1] + localView.getHeight())) {}
          }
        }
        else
        {
          int i7 = localView.getLeft();
          int i8 = localView.getRight();
          int i9 = localView.getTop();
          int i10 = localView.getBottom();
          if ((i7 <= i2) && (i8 >= i1) && (i9 <= i4) && (i10 >= i3))
          {
            this.N.setBounds(i7, i9, i8, i10);
            this.N.draw(paramCanvas);
          }
        }
      }
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    super.draw(paramCanvas);
    int i2;
    if (this.I != null)
    {
      ru localru1 = this.I;
      boolean bool = ru.b.a(localru1.a);
      i2 = 0;
      if (!bool)
      {
        if (!this.a) {
          break label194;
        }
        int i6 = paramCanvas.save();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-getHeight(), 0.0F);
        ru localru6 = this.I;
        ru.b.a(localru6.a, paramCanvas);
        paramCanvas.restoreToCount(i6);
        i2 = i1;
      }
      ru localru2 = this.J;
      if (ru.b.a(localru2.a)) {
        break label284;
      }
      if (!this.a) {
        break label218;
      }
      int i5 = paramCanvas.save();
      paramCanvas.rotate(90.0F);
      paramCanvas.translate(0.0F, -getWidth());
      ru localru4 = this.J;
      ru.b.a(localru4.a, paramCanvas);
      paramCanvas.restoreToCount(i5);
    }
    for (;;)
    {
      if (i1 != 0) {
        nj.a.l(this);
      }
      return;
      label194:
      ru localru5 = this.I;
      ru.b.a(localru5.a, paramCanvas);
      break;
      label218:
      int i3 = paramCanvas.save();
      int i4 = getWidth();
      paramCanvas.translate(-i4, getHeight());
      paramCanvas.rotate(180.0F, i4, 0.0F);
      ru localru3 = this.J;
      ru.b.a(localru3.a, paramCanvas);
      paramCanvas.restoreToCount(i3);
      continue;
      label284:
      i1 = i2;
    }
  }
  
  public final void e()
  {
    if (this.r) {
      invalidate();
    }
    this.r = false;
    removeCallbacks(this.Q);
  }
  
  public final void e(int paramInt)
  {
    if ((this.O) && (this.q.get(paramInt)))
    {
      this.q.put(paramInt, false);
      getChildAt(paramInt - this.i);
    }
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new lyc(getContext(), paramAttributeSet);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.Q);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.G.addMovement(paramMotionEvent);
    int i2;
    float f1;
    label240:
    float f2;
    int i3;
    label271:
    float f4;
    switch (0xFF & paramMotionEvent.getAction())
    {
    default: 
    case 0: 
      do
      {
        return false;
        this.M.set((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY());
        postDelayed(this.Q, ViewConfiguration.getTapTimeout());
        this.G.clear();
        this.H.abortAnimation();
        if (this.a) {}
        for (this.B = paramMotionEvent.getX();; this.B = paramMotionEvent.getY())
        {
          this.A = ms.a.b(paramMotionEvent, 0);
          this.C = 0.0F;
          if (this.y != 2) {
            break;
          }
          this.y = 1;
          return true;
        }
      } while (!this.O);
      return true;
    case 2: 
      int i1 = this.A;
      i2 = ms.a.a(paramMotionEvent, i1);
      if (i2 < 0)
      {
        int i4 = this.A;
        Log.e("ColumnGridView", 111 + "onInterceptTouchEvent could not find pointer with id " + i4 + " - did we receive an inconsistent event stream?");
        return false;
      }
      if (this.a)
      {
        f1 = ms.a.c(paramMotionEvent, i2);
        f2 = f1 - this.B + this.C;
        if (Math.abs(f2) <= this.D) {
          break label348;
        }
        i3 = 1;
        if (i3 == 0) {
          break label380;
        }
        if (f2 <= 0.0F) {
          break label354;
        }
        f4 = -this.D;
      }
      break;
    }
    label291:
    label348:
    label354:
    label380:
    for (float f3 = f4 + f2;; f3 = f2)
    {
      this.C = (f3 - (int)f3);
      if (i3 == 0) {
        break;
      }
      ViewParent localViewParent = getParent();
      if (localViewParent != null) {
        localViewParent.requestDisallowInterceptTouchEvent(true);
      }
      return true;
      f1 = ms.a.d(paramMotionEvent, i2);
      break label240;
      i3 = 0;
      break label271;
      f4 = this.D;
      break label291;
      this.M.set(-1, -1);
      e();
      break;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f = true;
    a();
    this.f = false;
    int i1 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    if (this.a)
    {
      ru localru3 = this.I;
      ru.b.a(localru3.a, i2, i1);
      ru localru4 = this.J;
      ru.b.a(localru4.a, i2, i1);
    }
    for (;;)
    {
      c(0);
      return;
      ru localru1 = this.I;
      ru.b.a(localru1.a, i1, i2);
      ru localru2 = this.J;
      ru.b.a(localru2.a, i1, i2);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    if ((i1 != getMeasuredWidth()) || (i2 != getMeasuredHeight())) {}
    for (int i3 = 1;; i3 = 0)
    {
      setMeasuredDimension(i1, i2);
      if (i3 == 0) {
        break;
      }
      for (int i5 = -1 + getChildCount(); i5 >= 0; i5--)
      {
        View localView = getChildAt(i5);
        if (localView != null) {
          localView.requestLayout();
        }
      }
    }
    if ((this.t == -1) && (i2 > 0) && (i1 > 0)) {
      if (!this.a) {
        break label123;
      }
    }
    label123:
    for (int i4 = i2 / 0;; i4 = i1 / 0)
    {
      this.b = i4;
      return;
    }
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    lyi locallyi = (lyi)paramParcelable;
    super.onRestoreInstanceState(locallyi.getSuperState());
    this.n = true;
    this.j = locallyi.c;
    this.k = locallyi.d;
    this.q.clear();
    this.O = locallyi.f;
    this.p = locallyi.g;
    if (this.b == 0) {
      this.i = locallyi.b;
    }
    for (;;)
    {
      for (int i1 = -1 + locallyi.e.size(); i1 >= 0; i1--) {
        this.q.put(locallyi.e.keyAt(i1), locallyi.e.valueAt(i1));
      }
      if ((this.p) && (locallyi.b > 0)) {
        this.i = (1 + (-1 + locallyi.b) / this.b * this.b);
      } else {
        this.i = (locallyi.b / this.b * this.b);
      }
    }
    requestLayout();
  }
  
  public final Parcelable onSaveInstanceState()
  {
    lyi locallyi = new lyi(super.onSaveInstanceState());
    int i1 = this.i;
    int i2 = this.j;
    locallyi.b = i1;
    locallyi.c = i2;
    if ((i1 >= 0) && (this.l != null) && (i1 < this.l.getCount())) {
      locallyi.a = this.l.getItemId(i1);
    }
    int i3 = this.q.size();
    SparseBooleanArray localSparseBooleanArray = new SparseBooleanArray(i3);
    for (int i4 = i3 - 1; i4 >= 0; i4--) {
      localSparseBooleanArray.put(this.q.keyAt(i4), this.q.valueAt(i4));
    }
    locallyi.e = localSparseBooleanArray;
    locallyi.f = this.O;
    locallyi.g = this.p;
    int i5 = getChildCount();
    for (int i6 = 0;; i6++)
    {
      View localView;
      int i7;
      if (i6 < i5)
      {
        localView = getChildAt(i6);
        if (!((lyc)localView.getLayoutParams()).g) {
          continue;
        }
        if (!this.a) {
          break label286;
        }
        i7 = getPaddingLeft();
      }
      for (int i8 = localView.getLeft();; i8 = localView.getTop())
      {
        locallyi.d = (i8 - this.v - i7);
        if (i6 != 0)
        {
          locallyi.b = (i1 + i6);
          if ((locallyi.b >= 0) && (this.l != null) && (locallyi.b < this.l.getCount())) {
            locallyi.a = this.l.getItemId(locallyi.b);
          }
        }
        return locallyi;
        label286:
        i7 = getPaddingTop();
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.G.addMovement(paramMotionEvent);
    int i6;
    float f2;
    label299:
    float f3;
    float f5;
    label368:
    float f4;
    switch (0xFF & paramMotionEvent.getAction())
    {
    default: 
      h(this.y);
      return true;
    case 0: 
      this.M.set((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY());
      this.L.set((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY());
      postDelayed(this.Q, ViewConfiguration.getTapTimeout());
      if (!this.H.isFinished())
      {
        ViewParent localViewParent2 = getParent();
        if (localViewParent2 != null) {
          localViewParent2.requestDisallowInterceptTouchEvent(true);
        }
      }
      this.G.clear();
      this.H.abortAnimation();
      if (this.a) {}
      for (this.B = paramMotionEvent.getX();; this.B = paramMotionEvent.getY())
      {
        this.A = ms.a.b(paramMotionEvent, 0);
        this.C = 0.0F;
        break;
      }
    case 2: 
      this.M.set((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY());
      e();
      int i5 = this.A;
      i6 = ms.a.a(paramMotionEvent, i5);
      if (i6 < 0)
      {
        int i8 = this.A;
        Log.e("ColumnGridView", 111 + "onInterceptTouchEvent could not find pointer with id " + i8 + " - did we receive an inconsistent event stream?");
        return false;
      }
      if (this.a)
      {
        f2 = ms.a.c(paramMotionEvent, i6);
        f3 = f2 - this.B + this.C;
        if ((this.y != 0) || (Math.abs(f3) <= this.D)) {
          break label681;
        }
        ViewParent localViewParent1 = getParent();
        if (localViewParent1 != null) {
          localViewParent1.requestDisallowInterceptTouchEvent(true);
        }
        if (f3 <= 0.0F) {
          break label443;
        }
        f5 = -this.D;
        f4 = f5 + f3;
        this.y = 1;
      }
      break;
    }
    for (;;)
    {
      int i7 = (int)f4;
      this.C = (f4 - i7);
      if (this.y != 1) {
        break;
      }
      this.B = f2;
      if (a(i7, true)) {
        break;
      }
      this.G.clear();
      break;
      f2 = ms.a.d(paramMotionEvent, i6);
      break label299;
      label443:
      f5 = this.D;
      break label368;
      this.M.set(-1, -1);
      e();
      this.y = 0;
      i();
      break;
      this.M.set(-1, -1);
      e();
      this.G.computeCurrentVelocity(1000, this.E);
      float f1;
      label539:
      int i2;
      label570:
      int i3;
      if (this.a)
      {
        VelocityTracker localVelocityTracker2 = this.G;
        int i4 = this.A;
        f1 = nf.a.a(localVelocityTracker2, i4);
        if (Math.abs(f1) <= this.F) {
          break label673;
        }
        this.y = 2;
        if (!this.a) {
          break label659;
        }
        i2 = (int)f1;
        if (!this.a) {
          break label665;
        }
        i3 = 0;
        label580:
        this.H.fling(0, 0, i2, i3, -2147483648, 2147483647, -2147483648, 2147483647);
        this.B = 0.0F;
        nj.a.l(this);
      }
      for (;;)
      {
        c((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY());
        i();
        break;
        VelocityTracker localVelocityTracker1 = this.G;
        int i1 = this.A;
        f1 = nf.a.b(localVelocityTracker1, i1);
        break label539;
        label659:
        i2 = 0;
        break label570;
        label665:
        i3 = (int)f1;
        break label580;
        label673:
        this.y = 0;
      }
      label681:
      f4 = f3;
    }
  }
  
  public final void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.M.set(-1, -1);
      e();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public final void requestLayout()
  {
    if (!this.w) {
      super.requestLayout();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.columngridview.ColumnGridView
 * JD-Core Version:    0.7.0.1
 */