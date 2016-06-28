package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.DataSetObservable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lx;
import ma;
import ms;
import mw;
import nc;
import nf;
import ni;
import nj;
import ns;
import nu;
import ny;
import od;
import oe;
import of;
import og;
import oh;
import oi;
import oj;
import ok;
import ol;
import om;
import on;
import oq;
import ru;
import rx;

public class ViewPager
  extends ViewGroup
{
  public static final int[] a = { 16842931 };
  private static final oq ac = new oq();
  private static final Comparator<oh> q = new od();
  private static final Interpolator r = new oe();
  private int A;
  private int B;
  private boolean C;
  private boolean D;
  private int E = 1;
  private boolean F;
  private boolean G;
  private int H;
  private int I;
  private int J;
  private float K;
  private float L;
  private int M;
  private int N;
  private int O;
  private ru P;
  private ru Q;
  private boolean R = true;
  private boolean S;
  private int T;
  private List<ok> U;
  private ol V;
  private Method W;
  private int aa;
  private ArrayList<View> ab;
  private final Runnable ad = new of(this);
  private int ae = 0;
  public final ArrayList<oh> b = new ArrayList();
  public nc c;
  public int d;
  public float e = -3.402824E+038F;
  public float f = 3.4028235E+38F;
  public boolean g;
  public float h;
  public float i;
  public int j = -1;
  public VelocityTracker k;
  public int l;
  public boolean m;
  public long n;
  public ok o;
  private int p;
  private final oh s = new oh();
  private final Rect t = new Rect();
  private int u = -1;
  private Parcelable v = null;
  private ClassLoader w = null;
  private Scroller x;
  private om y;
  private int z;
  
  public ViewPager(Context paramContext)
  {
    super(paramContext);
    e();
  }
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    e();
  }
  
  private final Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null) {}
    for (Rect localRect = new Rect();; localRect = paramRect)
    {
      if (paramView == null)
      {
        localRect.set(0, 0, 0, 0);
        return localRect;
      }
      localRect.left = paramView.getLeft();
      localRect.right = paramView.getRight();
      localRect.top = paramView.getTop();
      localRect.bottom = paramView.getBottom();
      ViewGroup localViewGroup;
      for (ViewParent localViewParent = paramView.getParent(); ((localViewParent instanceof ViewGroup)) && (localViewParent != this); localViewParent = localViewGroup.getParent())
      {
        localViewGroup = (ViewGroup)localViewParent;
        localRect.left += localViewGroup.getLeft();
        localRect.right += localViewGroup.getRight();
        localRect.top += localViewGroup.getTop();
        localRect.bottom += localViewGroup.getBottom();
      }
      return localRect;
    }
  }
  
  private oh a(int paramInt1, int paramInt2)
  {
    oh localoh = new oh();
    localoh.b = paramInt1;
    localoh.a = this.c.a(this, paramInt1);
    localoh.d = 1.0F;
    if ((paramInt2 < 0) || (paramInt2 >= this.b.size()))
    {
      this.b.add(localoh);
      return localoh;
    }
    this.b.add(paramInt2, localoh);
    return localoh;
  }
  
  private oh a(View paramView)
  {
    for (int i1 = 0; i1 < this.b.size(); i1++)
    {
      oh localoh = (oh)this.b.get(i1);
      if (this.c.a(paramView, localoh.a)) {
        return localoh;
      }
    }
    return null;
  }
  
  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i7;
    int i8;
    int i9;
    int i11;
    View localView2;
    int i16;
    int i13;
    int i14;
    if (this.T > 0)
    {
      int i6 = getScrollX();
      i7 = getPaddingLeft();
      i8 = getPaddingRight();
      i9 = getWidth();
      int i10 = getChildCount();
      i11 = 0;
      if (i11 < i10)
      {
        localView2 = getChildAt(i11);
        oi localoi = (oi)localView2.getLayoutParams();
        if (!localoi.a) {
          break label457;
        }
        switch (0x7 & localoi.b)
        {
        case 2: 
        case 4: 
        default: 
          i16 = i7;
          int i22 = i8;
          i13 = i7;
          i14 = i22;
          label132:
          int i18 = i16 + i6 - localView2.getLeft();
          if (i18 != 0) {
            localView2.offsetLeftAndRight(i18);
          }
          break;
        }
      }
    }
    for (;;)
    {
      i11++;
      int i15 = i14;
      i7 = i13;
      i8 = i15;
      break;
      int i20 = i7 + localView2.getWidth();
      int i21 = i7;
      i14 = i8;
      i13 = i20;
      i16 = i21;
      break label132;
      i16 = Math.max((i9 - localView2.getMeasuredWidth()) / 2, i7);
      int i19 = i8;
      i13 = i7;
      i14 = i19;
      break label132;
      i16 = i9 - i8 - localView2.getMeasuredWidth();
      int i17 = i8 + localView2.getMeasuredWidth();
      i13 = i7;
      i14 = i17;
      break label132;
      if (this.o != null) {
        this.o.a(paramInt1, paramFloat, paramInt2);
      }
      if (this.U != null)
      {
        int i4 = this.U.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          ok localok = (ok)this.U.get(i5);
          if (localok != null) {
            localok.a(paramInt1, paramFloat, paramInt2);
          }
        }
      }
      if (this.V != null)
      {
        int i1 = getScrollX();
        int i2 = getChildCount();
        for (int i3 = 0; i3 < i2; i3++)
        {
          View localView1 = getChildAt(i3);
          if (!((oi)localView1.getLayoutParams()).a)
          {
            float f1 = (localView1.getLeft() - i1) / (getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            this.V.a(localView1, f1);
          }
        }
      }
      this.S = true;
      return;
      label457:
      int i12 = i8;
      i13 = i7;
      i14 = i12;
    }
  }
  
  private final void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    oh localoh = f(paramInt1);
    int i1 = 0;
    if (localoh != null) {
      i1 = (int)((getMeasuredWidth() - getPaddingLeft() - getPaddingRight()) * Math.max(this.e, Math.min(localoh.e, this.f)));
    }
    if (paramBoolean1)
    {
      if (getChildCount() == 0) {
        if (this.D) {
          this.D = false;
        }
      }
      int i2;
      int i3;
      int i4;
      int i5;
      for (;;)
      {
        if (paramBoolean2) {
          g(paramInt1);
        }
        return;
        i2 = getScrollX();
        i3 = getScrollY();
        i4 = i1 - i2;
        i5 = 0 - i3;
        if ((i4 != 0) || (i5 != 0)) {
          break;
        }
        a(false);
        d(this.d);
        a(0);
      }
      if (this.D != true) {
        this.D = true;
      }
      a(2);
      int i6 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      int i7 = i6 / 2;
      float f1 = Math.min(1.0F, 1.0F * Math.abs(i4) / i6);
      float f2 = i7 + i7 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
      int i8 = Math.abs(paramInt2);
      if (i8 > 0) {}
      float f3;
      for (int i9 = 4 * Math.round(1000.0F * Math.abs(f2 / i8));; i9 = (int)(100.0F * (1.0F + Math.abs(i4) / (f3 + 0.0F))))
      {
        int i10 = Math.min(i9, 600);
        this.x.startScroll(i2, i3, i4, i5, i10);
        nj.a.l(this);
        break;
        f3 = i6;
      }
    }
    if (paramBoolean2) {
      g(paramInt1);
    }
    a(false);
    scrollTo(i1, 0);
    e(i1);
  }
  
  private final void a(MotionEvent paramMotionEvent)
  {
    int i1 = ms.b(paramMotionEvent);
    if (ms.a.b(paramMotionEvent, i1) == this.j) {
      if (i1 != 0) {
        break label65;
      }
    }
    label65:
    for (int i2 = 1;; i2 = 0)
    {
      this.h = ms.a.c(paramMotionEvent, i2);
      this.j = ms.a.b(paramMotionEvent, i2);
      if (this.k != null) {
        this.k.clear();
      }
      return;
    }
  }
  
  private final void a(oh paramoh1, int paramInt, oh paramoh2)
  {
    int i1 = this.c.b();
    int i2 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    if (i2 > 0) {}
    int i10;
    float f12;
    int i20;
    oh localoh4;
    for (float f1 = 0.0F / i2;; f1 = 0.0F)
    {
      if (paramoh2 == null) {
        break label411;
      }
      i10 = paramoh2.b;
      if (i10 >= paramoh1.b) {
        break;
      }
      float f11 = f1 + (paramoh2.e + paramoh2.d);
      int i18 = i10 + 1;
      int i19 = 0;
      f12 = f11;
      i20 = i18;
      if ((i20 > paramoh1.b) || (i19 >= this.b.size())) {
        break label411;
      }
      for (localoh4 = (oh)this.b.get(i19); (i20 > localoh4.b) && (i19 < -1 + this.b.size()); localoh4 = (oh)this.b.get(i19)) {
        i19++;
      }
    }
    for (;;)
    {
      int i22;
      float f13;
      if (i22 < localoh4.b)
      {
        Object localObject2;
        float f15 = localObject2 + (f1 + 1.0F);
        i22++;
        f13 = f15;
      }
      else
      {
        localoh4.e = f13;
        float f14 = f13 + (f1 + localoh4.d);
        int i23 = i22 + 1;
        f12 = f14;
        i20 = i23;
        break;
        float f7;
        int i14;
        oh localoh3;
        if (i10 > paramoh1.b)
        {
          int i11 = -1 + this.b.size();
          float f6 = paramoh2.e;
          int i12 = i10 - 1;
          int i13 = i11;
          f7 = f6;
          i14 = i12;
          if ((i14 >= paramoh1.b) && (i13 >= 0)) {
            for (localoh3 = (oh)this.b.get(i13); (i14 < localoh3.b) && (i13 > 0); localoh3 = (oh)this.b.get(i13)) {
              i13--;
            }
          }
        }
        for (;;)
        {
          int i16;
          float f8;
          if (i16 > localoh3.b)
          {
            Object localObject1;
            float f10 = localObject1 - (f1 + 1.0F);
            i16--;
            f8 = f10;
          }
          else
          {
            float f9 = f8 - (f1 + localoh3.d);
            localoh3.e = f9;
            int i17 = i16 - 1;
            f7 = f9;
            i14 = i17;
            break;
            label411:
            int i3 = this.b.size();
            float f2 = paramoh1.e;
            int i4 = -1 + paramoh1.b;
            float f3;
            float f4;
            if (paramoh1.b == 0)
            {
              f3 = paramoh1.e;
              this.e = f3;
              if (paramoh1.b != i1 - 1) {
                break label539;
              }
              f4 = paramoh1.e + paramoh1.d - 1.0F;
              label477:
              this.f = f4;
            }
            label539:
            int i9;
            for (int i5 = paramInt - 1;; i5 = i9)
            {
              if (i5 < 0) {
                break label596;
              }
              oh localoh2 = (oh)this.b.get(i5);
              for (;;)
              {
                if (i4 > localoh2.b)
                {
                  i4--;
                  f2 -= f1 + 1.0F;
                  continue;
                  f3 = -3.402824E+038F;
                  break;
                  f4 = 3.4028235E+38F;
                  break label477;
                }
              }
              f2 -= f1 + localoh2.d;
              localoh2.e = f2;
              if (localoh2.b == 0) {
                this.e = f2;
              }
              i9 = i5 - 1;
              i4--;
            }
            label596:
            float f5 = f1 + (paramoh1.e + paramoh1.d);
            int i6 = 1 + paramoh1.b;
            int i8;
            for (int i7 = paramInt + 1; i7 < i3; i7 = i8)
            {
              oh localoh1 = (oh)this.b.get(i7);
              while (i6 < localoh1.b)
              {
                i6++;
                f5 += f1 + 1.0F;
              }
              if (localoh1.b == i1 - 1) {
                this.f = (f5 + localoh1.d - 1.0F);
              }
              localoh1.e = f5;
              f5 += f1 + localoh1.d;
              i8 = i7 + 1;
              i6++;
            }
            return;
            int i15 = i14;
            f8 = f7;
            i16 = i15;
          }
        }
        int i21 = i20;
        f13 = f12;
        i22 = i21;
      }
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    if (this.ae == 2) {}
    int i3;
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        if (this.D) {
          this.D = false;
        }
        this.x.abortAnimation();
        int i4 = getScrollX();
        int i5 = getScrollY();
        int i6 = this.x.getCurrX();
        int i7 = this.x.getCurrY();
        if ((i4 != i6) || (i5 != i7))
        {
          scrollTo(i6, i7);
          if (i6 != i4) {
            e(i6);
          }
        }
      }
      this.g = false;
      int i2 = 0;
      i3 = i1;
      while (i2 < this.b.size())
      {
        oh localoh = (oh)this.b.get(i2);
        if (localoh.c)
        {
          localoh.c = false;
          i3 = 1;
        }
        i2++;
      }
    }
    if (i3 != 0)
    {
      if (paramBoolean)
      {
        Runnable localRunnable = this.ad;
        nj.a.a(this, localRunnable);
      }
    }
    else {
      return;
    }
    this.ad.run();
  }
  
  private final boolean a(float paramFloat)
  {
    int i1 = 1;
    float f1 = this.h - paramFloat;
    this.h = paramFloat;
    float f2 = f1 + getScrollX();
    int i2 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    float f3 = i2 * this.e;
    float f4 = i2 * this.f;
    oh localoh1 = (oh)this.b.get(0);
    oh localoh2 = (oh)this.b.get(-1 + this.b.size());
    if (localoh1.b != 0) {
      f3 = localoh1.e * i2;
    }
    for (int i3 = 0;; i3 = i1)
    {
      float f5;
      if (localoh2.b != -1 + this.c.b())
      {
        f5 = localoh2.e * i2;
        i1 = 0;
      }
      for (;;)
      {
        boolean bool;
        if (f2 < f3)
        {
          bool = false;
          if (i3 != 0)
          {
            float f6 = f3 - f2;
            ru localru1 = this.P;
            float f7 = Math.abs(f6) / i2;
            bool = ru.b.a(localru1.a, f7);
          }
        }
        for (;;)
        {
          this.h += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          e((int)f3);
          return bool;
          if (f2 > f5)
          {
            bool = false;
            if (i1 != 0)
            {
              float f8 = f2 - f5;
              ru localru2 = this.Q;
              float f9 = Math.abs(f8) / i2;
              bool = ru.b.a(localru2.a, f9);
            }
            f3 = f5;
          }
          else
          {
            f3 = f2;
            bool = false;
          }
        }
        f5 = f4;
      }
    }
  }
  
  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i4;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i2 = paramView.getScrollX();
      int i3 = paramView.getScrollY();
      i4 = -1 + localViewGroup.getChildCount();
      if (i4 >= 0)
      {
        View localView = localViewGroup.getChildAt(i4);
        if ((paramInt2 + i2 < localView.getLeft()) || (paramInt2 + i2 >= localView.getRight()) || (paramInt3 + i3 < localView.getTop()) || (paramInt3 + i3 >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i2 - localView.getLeft(), paramInt3 + i3 - localView.getTop()))) {}
      }
    }
    int i1;
    do
    {
      return true;
      i4--;
      break;
      if (!paramBoolean) {
        break label161;
      }
      i1 = -paramInt1;
    } while (nj.a.a(paramView, i1));
    label161:
    return false;
  }
  
  private oh b(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View))) {
        return null;
      }
      paramView = (View)localViewParent;
    }
    return a(paramView);
  }
  
  private final void b(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(true);
    }
  }
  
  private void e()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.x = new Scroller(localContext, r);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    this.J = nu.a.a(localViewConfiguration);
    this.M = ((int)(400.0F * f1));
    this.l = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.P = new ru(localContext);
    this.Q = new ru(localContext);
    this.N = ((int)(25.0F * f1));
    this.O = ((int)(2.0F * f1));
    this.H = ((int)(16.0F * f1));
    oj localoj = new oj(this);
    nj.a.a(this, localoj);
    if (nj.a.m(this) == 0) {
      nj.a.c(this, 1);
    }
  }
  
  private oh f(int paramInt)
  {
    for (int i1 = 0; i1 < this.b.size(); i1++)
    {
      oh localoh = (oh)this.b.get(i1);
      if (localoh.b == paramInt) {
        return localoh;
      }
    }
    return null;
  }
  
  private final void f()
  {
    if (this.aa != 0)
    {
      if (this.ab == null) {
        this.ab = new ArrayList();
      }
      for (;;)
      {
        int i1 = getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          View localView = getChildAt(i2);
          this.ab.add(localView);
        }
        this.ab.clear();
      }
      Collections.sort(this.ab, ac);
    }
  }
  
  private final void g(int paramInt)
  {
    if (this.o != null) {
      this.o.a(paramInt);
    }
    if (this.U != null)
    {
      int i1 = this.U.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        ok localok = (ok)this.U.get(i2);
        if (localok != null) {
          localok.a(paramInt);
        }
      }
    }
  }
  
  private boolean g()
  {
    if (this.d > 0)
    {
      a(-1 + this.d, true);
      return true;
    }
    return false;
  }
  
  private boolean h()
  {
    if ((this.c != null) && (this.d < -1 + this.c.b()))
    {
      a(1 + this.d, true);
      return true;
    }
    return false;
  }
  
  private boolean h(int paramInt)
  {
    View localView1 = findFocus();
    View localView2;
    View localView3;
    boolean bool;
    label86:
    ViewParent localViewParent1;
    if (localView1 == this)
    {
      localView2 = null;
      localView3 = FocusFinder.getInstance().findNextFocus(this, localView2, paramInt);
      if ((localView3 == null) || (localView3 == localView2)) {
        break label322;
      }
      if (paramInt != 17) {
        break label257;
      }
      int i3 = a(this.t, localView3).left;
      int i4 = a(this.t, localView2).left;
      if ((localView2 != null) && (i3 >= i4))
      {
        bool = g();
        if (bool) {
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        }
        return bool;
      }
    }
    else
    {
      if (localView1 == null) {
        break label368;
      }
      localViewParent1 = localView1.getParent();
      if (!(localViewParent1 instanceof ViewGroup)) {
        break label373;
      }
      if (localViewParent1 != this) {}
    }
    label257:
    label322:
    label368:
    label373:
    for (int i5 = 1;; i5 = 0)
    {
      if (i5 == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView1.getClass().getSimpleName());
        ViewParent localViewParent2 = localView1.getParent();
        for (;;)
        {
          if ((localViewParent2 instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localViewParent2.getClass().getSimpleName());
            localViewParent2 = localViewParent2.getParent();
            continue;
            localViewParent1 = localViewParent1.getParent();
            break;
          }
        }
        Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + localStringBuilder.toString());
        localView2 = null;
        break;
        bool = localView3.requestFocus();
        break label86;
        if (paramInt == 66)
        {
          int i1 = a(this.t, localView3).left;
          int i2 = a(this.t, localView2).left;
          if ((localView2 != null) && (i1 <= i2))
          {
            bool = h();
            break label86;
          }
          bool = localView3.requestFocus();
          break label86;
          if ((paramInt == 17) || (paramInt == 1))
          {
            bool = g();
            break label86;
          }
          if ((paramInt == 66) || (paramInt == 2))
          {
            bool = h();
            break label86;
          }
        }
        bool = false;
        break label86;
      }
      localView2 = localView1;
      break;
    }
  }
  
  public final int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > this.N) && (Math.abs(paramInt2) > this.M))
    {
      if (paramInt2 > 0) {}
      for (;;)
      {
        if (this.b.size() > 0)
        {
          oh localoh1 = (oh)this.b.get(0);
          oh localoh2 = (oh)this.b.get(-1 + this.b.size());
          paramInt1 = Math.max(localoh1.b, Math.min(paramInt1, localoh2.b));
        }
        return paramInt1;
        paramInt1++;
      }
    }
    if (paramInt1 >= this.d) {}
    for (float f1 = 0.4F;; f1 = 0.6F)
    {
      paramInt1 = (int)(f1 + (paramFloat + paramInt1));
      break;
    }
  }
  
  public final void a()
  {
    int i1 = this.c.b();
    this.p = i1;
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    label61:
    oh localoh;
    int i10;
    int i16;
    int i11;
    int i12;
    int i13;
    int i14;
    if ((this.b.size() < 1 + (this.E << 1)) && (this.b.size() < i1))
    {
      i2 = 1;
      int i3 = this.d;
      i4 = 0;
      i5 = i3;
      i6 = i2;
      i7 = 0;
      if (i7 >= this.b.size()) {
        break label280;
      }
      localoh = (oh)this.b.get(i7);
      i10 = this.c.a(localoh.a);
      if (i10 == -1) {
        break label372;
      }
      if (i10 != -2) {
        break label229;
      }
      this.b.remove(i7);
      i16 = i7 - 1;
      if (i4 == 0) {
        i4 = 1;
      }
      this.c.a(this, localoh.b, localoh.a);
      if (this.d != localoh.b) {
        break label391;
      }
      int i17 = Math.max(0, Math.min(this.d, i1 - 1));
      i11 = i16;
      i12 = i4;
      i13 = i17;
      i14 = 1;
    }
    label280:
    for (;;)
    {
      int i15 = i11 + 1;
      i6 = i14;
      i5 = i13;
      i4 = i12;
      i7 = i15;
      break label61;
      i2 = 0;
      break;
      label229:
      if (localoh.b != i10)
      {
        if (localoh.b == this.d) {
          i5 = i10;
        }
        localoh.b = i10;
        i11 = i7;
        i12 = i4;
        i13 = i5;
        i14 = 1;
        continue;
        if (i4 != 0) {
          this.c.a(this);
        }
        Collections.sort(this.b, q);
        if (i6 != 0)
        {
          int i8 = getChildCount();
          for (int i9 = 0; i9 < i8; i9++)
          {
            oi localoi = (oi)getChildAt(i9).getLayoutParams();
            if (!localoi.a) {
              localoi.c = 0.0F;
            }
          }
          a(i5, false, true, 0);
          requestLayout();
        }
      }
      else
      {
        label372:
        i11 = i7;
        i12 = i4;
        i13 = i5;
        i14 = i6;
        continue;
        i11 = i16;
        i12 = i4;
        i13 = i5;
        i14 = 1;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    int i1 = 0;
    if (this.ae == paramInt) {}
    for (;;)
    {
      return;
      this.ae = paramInt;
      if (this.V != null)
      {
        int i3;
        int i5;
        if (paramInt != 0)
        {
          i3 = 1;
          int i4 = getChildCount();
          i5 = 0;
          label39:
          if (i5 >= i4) {
            break label91;
          }
          if (i3 == 0) {
            break label85;
          }
        }
        label85:
        for (int i6 = 2;; i6 = 0)
        {
          View localView = getChildAt(i5);
          nj.a.a(localView, i6, null);
          i5++;
          break label39;
          i3 = 0;
          break;
        }
      }
      label91:
      if (this.o != null) {
        this.o.b(paramInt);
      }
      if (this.U != null)
      {
        int i2 = this.U.size();
        while (i1 < i2)
        {
          ok localok = (ok)this.U.get(i1);
          if (localok != null) {
            localok.b(paramInt);
          }
          i1++;
        }
      }
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    this.g = false;
    a(paramInt, paramBoolean, false, 0);
  }
  
  public final void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    if ((this.c == null) || (this.c.b() <= 0)) {
      if (this.D) {
        this.D = false;
      }
    }
    do
    {
      return;
      if ((paramBoolean2) || (this.d != paramInt1) || (this.b.size() == 0)) {
        break;
      }
    } while (!this.D);
    this.D = false;
    return;
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    for (;;)
    {
      int i1 = this.E;
      if ((paramInt1 <= i1 + this.d) && (paramInt1 >= this.d - i1)) {
        break;
      }
      for (int i2 = 0; i2 < this.b.size(); i2++) {
        ((oh)this.b.get(i2)).c = true;
      }
      if (paramInt1 >= this.c.b()) {
        paramInt1 = -1 + this.c.b();
      }
    }
    int i3 = this.d;
    boolean bool = false;
    if (i3 != paramInt1) {
      bool = true;
    }
    if (this.R)
    {
      this.d = paramInt1;
      if (bool) {
        g(paramInt1);
      }
      requestLayout();
      return;
    }
    d(paramInt1);
    a(paramInt1, paramBoolean1, paramInt2, bool);
  }
  
  public final void a(nc paramnc)
  {
    if (this.c != null)
    {
      nc localnc2 = this.c;
      om localom2 = this.y;
      localnc2.a.unregisterObserver(localom2);
      for (int i1 = 0; i1 < this.b.size(); i1++)
      {
        oh localoh = (oh)this.b.get(i1);
        this.c.a(this, localoh.b, localoh.a);
      }
      this.c.a(this);
      this.b.clear();
      for (int i2 = 0; i2 < getChildCount(); i2++) {
        if (!((oi)getChildAt(i2).getLayoutParams()).a)
        {
          removeViewAt(i2);
          i2--;
        }
      }
      this.d = 0;
      scrollTo(0, 0);
    }
    this.c = paramnc;
    this.p = 0;
    boolean bool;
    if (this.c != null)
    {
      if (this.y == null) {
        this.y = new om(this);
      }
      nc localnc1 = this.c;
      om localom1 = this.y;
      localnc1.a.registerObserver(localom1);
      this.g = false;
      bool = this.R;
      this.R = true;
      this.p = this.c.b();
      if (this.u >= 0)
      {
        this.c.a();
        a(this.u, false, true, 0);
        this.u = -1;
        this.v = null;
        this.w = null;
      }
    }
    else
    {
      return;
    }
    if (!bool)
    {
      d(this.d);
      return;
    }
    requestLayout();
  }
  
  public final void a(ok paramok)
  {
    if (this.U == null) {
      this.U = new ArrayList();
    }
    this.U.add(paramok);
  }
  
  public final void a(boolean paramBoolean, ol paramol)
  {
    int i1 = 1;
    int i2;
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (this.V == null) {
        break label120;
      }
      i2 = i1;
    }
    for (;;)
    {
      if (i1 != i2)
      {
        label26:
        this.V = paramol;
        if ((Build.VERSION.SDK_INT >= 7) && (this.W != null)) {}
      }
      try
      {
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Boolean.TYPE;
        this.W = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", arrayOfClass);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        try
        {
          for (;;)
          {
            Method localMethod = this.W;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Boolean.valueOf(true);
            localMethod.invoke(this, arrayOfObject);
            this.aa = 2;
            if (i1 != 0) {
              d(this.d);
            }
            return;
            label120:
            i2 = 0;
            break;
            i1 = 0;
            break label26;
            localNoSuchMethodException = localNoSuchMethodException;
            Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", localNoSuchMethodException);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            Log.e("ViewPager", "Error changing children drawing order", localException);
          }
        }
      }
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayList.size();
    int i2 = getDescendantFocusability();
    if (i2 != 393216) {
      for (int i3 = 0; i3 < getChildCount(); i3++)
      {
        View localView = getChildAt(i3);
        if (localView.getVisibility() == 0)
        {
          oh localoh = a(localView);
          if ((localoh != null) && (localoh.b == this.d)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
      }
    }
    if (((i2 == 262144) && (i1 != paramArrayList.size())) || (!isFocusable())) {}
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null)) {
      return;
    }
    paramArrayList.add(this);
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        oh localoh = a(localView);
        if ((localoh != null) && (localoh.b == this.d)) {
          localView.addTouchables(paramArrayList);
        }
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams)) {}
    for (ViewGroup.LayoutParams localLayoutParams = generateLayoutParams(paramLayoutParams);; localLayoutParams = paramLayoutParams)
    {
      oi localoi = (oi)localLayoutParams;
      localoi.a |= paramView instanceof og;
      if (this.C)
      {
        if ((localoi != null) && (localoi.a)) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localoi.d = true;
        addViewInLayout(paramView, paramInt, localLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, localLayoutParams);
      return;
    }
  }
  
  public final oh b()
  {
    int i1 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    float f1;
    float f2;
    label37:
    float f3;
    float f4;
    int i2;
    int i3;
    int i4;
    Object localObject;
    label55:
    oh localoh1;
    oh localoh3;
    int i5;
    if (i1 > 0)
    {
      f1 = getScrollX() / i1;
      if (i1 <= 0) {
        break label205;
      }
      f2 = 0.0F / i1;
      f3 = 0.0F;
      f4 = 0.0F;
      i2 = -1;
      i3 = 0;
      i4 = 1;
      localObject = null;
      if (i3 < this.b.size())
      {
        localoh1 = (oh)this.b.get(i3);
        if ((i4 != 0) || (localoh1.b == i2 + 1)) {
          break label256;
        }
        localoh3 = this.s;
        localoh3.e = (f2 + (f3 + f4));
        localoh3.b = (i2 + 1);
        localoh3.d = 1.0F;
        i5 = i3 - 1;
      }
    }
    for (oh localoh2 = localoh3;; localoh2 = localoh1)
    {
      float f5 = localoh2.e;
      float f6 = f2 + (f5 + localoh2.d);
      if ((i4 != 0) || (f1 >= f5))
      {
        if ((f1 < f6) || (i5 == -1 + this.b.size())) {
          localObject = localoh2;
        }
      }
      else
      {
        return localObject;
        f1 = 0.0F;
        break;
        label205:
        f2 = 0.0F;
        break label37;
      }
      int i6 = localoh2.b;
      float f7 = localoh2.d;
      int i7 = i5 + 1;
      f4 = f5;
      i2 = i6;
      f3 = f7;
      localObject = localoh2;
      i3 = i7;
      i4 = 0;
      break label55;
      label256:
      i5 = i3;
    }
  }
  
  public final void b(int paramInt)
  {
    this.g = false;
    if (!this.R) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool, false, 0);
      return;
    }
  }
  
  public final void c(int paramInt)
  {
    if (paramInt <= 0)
    {
      new StringBuilder("Requested offscreen page limit ").append(paramInt).append(" too small; defaulting to 1");
      paramInt = 1;
    }
    if (paramInt != this.E)
    {
      this.E = paramInt;
      d(this.d);
    }
  }
  
  public final boolean c()
  {
    if (this.F) {
      return false;
    }
    this.m = true;
    a(1);
    this.h = 0.0F;
    this.i = 0.0F;
    if (this.k == null) {
      this.k = VelocityTracker.obtain();
    }
    for (;;)
    {
      long l1 = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 0, 0.0F, 0.0F, 0);
      this.k.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      this.n = l1;
      return true;
      this.k.clear();
    }
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    if (this.c == null) {}
    int i1;
    int i2;
    do
    {
      do
      {
        return false;
        i1 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
        i2 = getScrollX();
        if (paramInt >= 0) {
          break;
        }
      } while (i2 <= (int)(i1 * this.e));
      return true;
    } while ((paramInt <= 0) || (i2 >= (int)(i1 * this.f)));
    return true;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof oi)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    if ((!this.x.isFinished()) && (this.x.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.x.getCurrX();
      int i4 = this.x.getCurrY();
      if ((i1 != i3) || (i2 != i4))
      {
        scrollTo(i3, i4);
        if (!e(i3))
        {
          this.x.abortAnimation();
          scrollTo(0, i4);
        }
      }
      nj.a.l(this);
      return;
    }
    a(true);
  }
  
  public final void d()
  {
    this.F = false;
    this.G = false;
    if (this.k != null)
    {
      this.k.recycle();
      this.k = null;
    }
  }
  
  public final void d(int paramInt)
  {
    int i21;
    oh localoh1;
    int i1;
    if (this.d != paramInt) {
      if (this.d < paramInt)
      {
        i21 = 66;
        oh localoh13 = f(this.d);
        this.d = paramInt;
        localoh1 = localoh13;
        i1 = i21;
      }
    }
    for (;;)
    {
      if (this.c == null) {
        f();
      }
      do
      {
        return;
        i21 = 17;
        break;
        if (this.g)
        {
          f();
          return;
        }
      } while (getWindowToken() == null);
      int i2 = this.E;
      int i3 = Math.max(0, this.d - i2);
      int i4 = this.c.b();
      int i5 = Math.min(i4 - 1, i2 + this.d);
      if (i4 != this.p)
      {
        try
        {
          String str2 = getResources().getResourceName(getId());
          str1 = str2;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          for (;;)
          {
            String str1 = Integer.toHexString(getId());
          }
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.p + ", found: " + i4 + " Pager id: " + str1 + " Pager class: " + getClass() + " Problematic adapter: " + this.c.getClass());
      }
      int i6 = 0;
      oh localoh2;
      if (i6 < this.b.size())
      {
        localoh2 = (oh)this.b.get(i6);
        if (localoh2.b >= this.d) {
          if (localoh2.b != this.d) {
            break label1293;
          }
        }
      }
      for (;;)
      {
        if ((localoh2 == null) && (i4 > 0)) {}
        for (oh localoh3 = a(this.d, i6);; localoh3 = localoh2)
        {
          label347:
          int i12;
          label371:
          int i15;
          label394:
          label505:
          label638:
          float f3;
          label527:
          label533:
          oh localoh8;
          label684:
          float f4;
          label692:
          Object localObject2;
          int i19;
          int i20;
          label712:
          oh localoh12;
          label808:
          Object localObject3;
          float f6;
          if (localoh3 != null)
          {
            int i11 = i6 - 1;
            oh localoh7;
            float f1;
            float f2;
            int i14;
            int i16;
            if (i11 >= 0)
            {
              localoh7 = (oh)this.b.get(i11);
              i12 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
              if (i12 > 0) {
                break label505;
              }
              f1 = 0.0F;
              int i13 = -1 + this.d;
              f2 = 0.0F;
              i14 = i13;
              i15 = i6;
              i16 = i11;
              if (i14 < 0) {
                break label638;
              }
              if ((f2 < f1) || (i14 >= i3)) {
                break label533;
              }
              if (localoh7 == null) {
                break label638;
              }
              if ((i14 == localoh7.b) && (!localoh7.c))
              {
                this.b.remove(i16);
                this.c.a(this, i14, localoh7.a);
                i16--;
                i15--;
                if (i16 < 0) {
                  break label527;
                }
                localoh7 = (oh)this.b.get(i16);
              }
            }
            for (;;)
            {
              i14--;
              break label394;
              i6++;
              break;
              localoh7 = null;
              break label347;
              f1 = 2.0F - localoh3.d + getPaddingLeft() / i12;
              break label371;
              localoh7 = null;
              continue;
              if ((localoh7 != null) && (i14 == localoh7.b))
              {
                f2 += localoh7.d;
                i16--;
                if (i16 >= 0) {
                  localoh7 = (oh)this.b.get(i16);
                } else {
                  localoh7 = null;
                }
              }
              else
              {
                f2 += a(i14, i16 + 1).d;
                i15++;
                if (i16 >= 0) {
                  localoh7 = (oh)this.b.get(i16);
                } else {
                  localoh7 = null;
                }
              }
            }
            f3 = localoh3.d;
            int i17 = i15 + 1;
            if (f3 < 2.0F) {
              if (i17 < this.b.size())
              {
                localoh8 = (oh)this.b.get(i17);
                if (i12 > 0) {
                  break label844;
                }
                f4 = 0.0F;
                int i18 = 1 + this.d;
                localObject2 = localoh8;
                i19 = i17;
                i20 = i18;
                if (i20 >= i4) {
                  break label1003;
                }
                if ((f3 < f4) || (i20 <= i5)) {
                  break label866;
                }
                if (localObject2 == null) {
                  break label1003;
                }
                if ((i20 != ((oh)localObject2).b) || (((oh)localObject2).c)) {
                  break label1271;
                }
                this.b.remove(i19);
                this.c.a(this, i20, ((oh)localObject2).a);
                if (i19 >= this.b.size()) {
                  break label860;
                }
                localoh12 = (oh)this.b.get(i19);
                float f10 = f3;
                localObject3 = localoh12;
                f6 = f10;
              }
            }
          }
          for (;;)
          {
            i20++;
            float f7 = f6;
            localObject2 = localObject3;
            f3 = f7;
            break label712;
            localoh8 = null;
            break label684;
            label844:
            f4 = 2.0F + getPaddingRight() / i12;
            break label692;
            label860:
            localoh12 = null;
            break label808;
            label866:
            if ((localObject2 != null) && (i20 == ((oh)localObject2).b))
            {
              float f8 = f3 + ((oh)localObject2).d;
              i19++;
              if (i19 < this.b.size()) {}
              for (oh localoh11 = (oh)this.b.get(i19);; localoh11 = null)
              {
                localObject3 = localoh11;
                f6 = f8;
                break;
              }
            }
            oh localoh9 = a(i20, i19);
            i19++;
            float f5 = f3 + localoh9.d;
            if (i19 < this.b.size()) {}
            for (oh localoh10 = (oh)this.b.get(i19);; localoh10 = null)
            {
              localObject3 = localoh10;
              f6 = f5;
              break;
            }
            label1003:
            a(localoh3, i15, localoh1);
            nc localnc = this.c;
            int i7 = this.d;
            if (localoh3 != null) {}
            for (Object localObject1 = localoh3.a;; localObject1 = null)
            {
              localnc.b(this, i7, localObject1);
              this.c.a(this);
              int i8 = getChildCount();
              for (int i9 = 0; i9 < i8; i9++)
              {
                View localView3 = getChildAt(i9);
                oi localoi = (oi)localView3.getLayoutParams();
                localoi.f = i9;
                if ((!localoi.a) && (localoi.c == 0.0F))
                {
                  oh localoh6 = a(localView3);
                  if (localoh6 != null)
                  {
                    localoi.c = localoh6.d;
                    localoi.e = localoh6.b;
                  }
                }
              }
            }
            f();
            if (!hasFocus()) {
              break;
            }
            View localView1 = findFocus();
            if (localView1 != null) {}
            for (oh localoh4 = b(localView1);; localoh4 = null)
            {
              if ((localoh4 != null) && (localoh4.b == this.d)) {
                break label1269;
              }
              for (int i10 = 0;; i10++)
              {
                if (i10 >= getChildCount()) {
                  break label1263;
                }
                View localView2 = getChildAt(i10);
                oh localoh5 = a(localView2);
                if ((localoh5 != null) && (localoh5.b == this.d) && (localView2.requestFocus(i1))) {
                  break;
                }
              }
              label1263:
              break;
            }
            label1269:
            break;
            label1271:
            float f9 = f3;
            localObject3 = localObject2;
            f6 = f9;
          }
        }
        label1293:
        localoh2 = null;
      }
      i1 = 2;
      localoh1 = null;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool2;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0) {}
      switch (paramKeyEvent.getKeyCode())
      {
      default: 
        bool2 = false;
      }
    }
    for (;;)
    {
      boolean bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      return bool1;
      bool2 = h(17);
      continue;
      bool2 = h(66);
      continue;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      if (lx.a.b(paramKeyEvent.getMetaState()))
      {
        bool2 = h(2);
      }
      else
      {
        if (!lx.a.a(paramKeyEvent.getMetaState(), 1)) {
          break;
        }
        bool2 = h(1);
      }
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool;
    }
    int i1 = getChildCount();
    for (int i2 = 0;; i2++)
    {
      bool = false;
      if (i2 >= i1) {
        break;
      }
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 0)
      {
        oh localoh = a(localView);
        if ((localoh != null) && (localoh.b == this.d) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
          return true;
        }
      }
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = nj.a.a(this);
    boolean bool2;
    if ((i1 == 0) || ((i1 == 1) && (this.c != null) && (this.c.b() > 1)))
    {
      ru localru1 = this.P;
      boolean bool1 = ru.b.a(localru1.a);
      bool2 = false;
      if (!bool1)
      {
        int i5 = paramCanvas.save();
        int i6 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i7 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i6 + getPaddingTop(), this.e * i7);
        ru localru5 = this.P;
        ru.b.a(localru5.a, i6, i7);
        ru localru6 = this.P;
        bool2 = false | ru.b.a(localru6.a, paramCanvas);
        paramCanvas.restoreToCount(i5);
      }
      ru localru2 = this.Q;
      if (!ru.b.a(localru2.a))
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(1.0F + this.f) * i3);
        ru localru3 = this.Q;
        ru.b.a(localru3.a, i4, i3);
        ru localru4 = this.Q;
        bool2 |= ru.b.a(localru4.a, paramCanvas);
        paramCanvas.restoreToCount(i2);
      }
    }
    for (;;)
    {
      if (bool2) {
        nj.a.l(this);
      }
      return;
      ru localru7 = this.P;
      ru.b.b(localru7.a);
      ru localru8 = this.Q;
      ru.b.b(localru8.a);
      bool2 = false;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
  }
  
  public final boolean e(int paramInt)
  {
    boolean bool1;
    if (this.b.size() == 0)
    {
      this.S = false;
      a(0, 0.0F, 0);
      boolean bool2 = this.S;
      bool1 = false;
      if (!bool2) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
    }
    else
    {
      oh localoh = b();
      int i1 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      float f1 = 0.0F / i1;
      int i2 = localoh.b;
      float f2 = (paramInt / i1 - localoh.e) / (f1 + localoh.d);
      int i3 = (int)(f2 * i1);
      this.S = false;
      a(i2, f2, i3);
      if (!this.S) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
      bool1 = true;
    }
    return bool1;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new oi();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new oi(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.aa == 2) {
      paramInt2 = paramInt1 - 1 - paramInt2;
    }
    return ((oi)((View)this.ab.get(paramInt2)).getLayoutParams()).f;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.R = true;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.ad);
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0xFF & paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1))
    {
      this.F = false;
      this.G = false;
      this.j = -1;
      if (this.k != null)
      {
        this.k.recycle();
        this.k = null;
      }
    }
    do
    {
      return false;
      if (i1 == 0) {
        break;
      }
      if (this.F) {
        return true;
      }
    } while (this.G);
    switch (i1)
    {
    }
    for (;;)
    {
      if (this.k == null) {
        this.k = VelocityTracker.obtain();
      }
      this.k.addMovement(paramMotionEvent);
      return this.F;
      int i2 = this.j;
      if (i2 != -1)
      {
        int i3 = ms.a.a(paramMotionEvent, i2);
        float f3 = ms.a.c(paramMotionEvent, i3);
        float f4 = f3 - this.h;
        float f5 = Math.abs(f4);
        float f6 = ms.a.d(paramMotionEvent, i3);
        float f7 = Math.abs(f6 - this.L);
        if (f4 != 0.0F)
        {
          float f9 = this.h;
          if (((f9 < this.I) && (f4 > 0.0F)) || ((f9 > getWidth() - this.I) && (f4 < 0.0F))) {}
          for (int i4 = 1; (i4 == 0) && (a(this, false, (int)f4, (int)f3, (int)f6)); i4 = 0)
          {
            this.h = f3;
            this.K = f6;
            this.G = true;
            return false;
          }
        }
        float f8;
        if ((f5 > this.J) && (0.5F * f5 > f7))
        {
          this.F = true;
          b(true);
          a(1);
          if (f4 > 0.0F)
          {
            f8 = this.i + this.J;
            label374:
            this.h = f8;
            this.K = f6;
            if (this.D != true) {
              this.D = true;
            }
          }
        }
        while ((this.F) && (a(f3)))
        {
          nj.a.l(this);
          break;
          f8 = this.i - this.J;
          break label374;
          if (f7 > this.J) {
            this.G = true;
          }
        }
        float f1 = paramMotionEvent.getX();
        this.i = f1;
        this.h = f1;
        float f2 = paramMotionEvent.getY();
        this.L = f2;
        this.K = f2;
        this.j = ms.a.b(paramMotionEvent, 0);
        this.G = false;
        this.x.computeScrollOffset();
        if ((this.ae == 2) && (Math.abs(this.x.getFinalX() - this.x.getCurrX()) > this.O))
        {
          this.x.abortAnimation();
          this.g = false;
          d(this.d);
          this.F = true;
          b(true);
          a(1);
        }
        else
        {
          a(false);
          this.F = false;
          continue;
          a(paramMotionEvent);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i6 = getPaddingRight();
    int i7 = getPaddingBottom();
    int i8 = getScrollX();
    int i9 = 0;
    int i10 = 0;
    View localView2;
    int i21;
    label156:
    int i22;
    int i24;
    int i25;
    label208:
    int i14;
    int i15;
    int i16;
    if (i10 < i1)
    {
      localView2 = getChildAt(i10);
      if (localView2.getVisibility() == 8) {
        break label659;
      }
      oi localoi2 = (oi)localView2.getLayoutParams();
      if (!localoi2.a) {
        break label659;
      }
      int i18 = 0x7 & localoi2.b;
      int i19 = 0x70 & localoi2.b;
      switch (i18)
      {
      case 2: 
      case 4: 
      default: 
        i21 = i4;
        switch (i19)
        {
        default: 
          i22 = i5;
          int i30 = i7;
          i24 = i5;
          i25 = i30;
          int i26 = i21 + i8;
          localView2.layout(i26, i22, i26 + localView2.getMeasuredWidth(), i22 + localView2.getMeasuredHeight());
          i14 = i9 + 1;
          i15 = i24;
          i7 = i25;
          i16 = i6;
        }
        break;
      }
    }
    for (int i17 = i4;; i17 = i4)
    {
      i10++;
      i4 = i17;
      i6 = i16;
      i5 = i15;
      i9 = i14;
      break;
      int i31 = i4 + localView2.getMeasuredWidth();
      i21 = i4;
      i4 = i31;
      break label156;
      i21 = Math.max((i2 - localView2.getMeasuredWidth()) / 2, i4);
      break label156;
      int i20 = i2 - i6 - localView2.getMeasuredWidth();
      i6 += localView2.getMeasuredWidth();
      i21 = i20;
      break label156;
      int i28 = i5 + localView2.getMeasuredHeight();
      int i29 = i5;
      i25 = i7;
      i24 = i28;
      i22 = i29;
      break label208;
      i22 = Math.max((i3 - localView2.getMeasuredHeight()) / 2, i5);
      int i27 = i7;
      i24 = i5;
      i25 = i27;
      break label208;
      i22 = i3 - i7 - localView2.getMeasuredHeight();
      int i23 = i7 + localView2.getMeasuredHeight();
      i24 = i5;
      i25 = i23;
      break label208;
      int i11 = i2 - i4 - i6;
      for (int i12 = 0; i12 < i1; i12++)
      {
        View localView1 = getChildAt(i12);
        if (localView1.getVisibility() != 8)
        {
          oi localoi1 = (oi)localView1.getLayoutParams();
          if (!localoi1.a)
          {
            oh localoh = a(localView1);
            if (localoh != null)
            {
              int i13 = i4 + (int)(i11 * localoh.e);
              if (localoi1.d)
              {
                localoi1.d = false;
                localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i11 * localoi1.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - i5 - i7, 1073741824));
              }
              localView1.layout(i13, i5, i13 + localView1.getMeasuredWidth(), i5 + localView1.getMeasuredHeight());
            }
          }
        }
      }
      this.z = i5;
      this.A = (i3 - i7);
      this.T = i9;
      if (this.R) {
        a(this.d, false, 0, false);
      }
      this.R = false;
      return;
      label659:
      i14 = i9;
      i15 = i5;
      i16 = i6;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    int i1 = getMeasuredWidth();
    this.I = Math.min(i1 / 10, this.H);
    int i2 = i1 - getPaddingLeft() - getPaddingRight();
    int i3 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int i5 = 0;
    View localView2;
    oi localoi2;
    int i10;
    int i11;
    int i12;
    label167:
    int i13;
    label182:
    label192:
    int i14;
    int i15;
    if (i5 < i4)
    {
      localView2 = getChildAt(i5);
      if (localView2.getVisibility() != 8)
      {
        localoi2 = (oi)localView2.getLayoutParams();
        if ((localoi2 != null) && (localoi2.a))
        {
          int i8 = 0x7 & localoi2.b;
          int i9 = 0x70 & localoi2.b;
          i10 = -2147483648;
          i11 = -2147483648;
          if ((i9 != 48) && (i9 != 80)) {
            break label294;
          }
          i12 = 1;
          if ((i8 != 3) && (i8 != 5)) {
            break label300;
          }
          i13 = 1;
          if (i12 == 0) {
            break label306;
          }
          i10 = 1073741824;
          if (localoi2.width == -2) {
            break label479;
          }
          i14 = 1073741824;
          if (localoi2.width == -1) {
            break label472;
          }
          i15 = localoi2.width;
        }
      }
    }
    for (;;)
    {
      if (localoi2.height != -2)
      {
        i11 = 1073741824;
        if (localoi2.height == -1) {}
      }
      for (int i16 = localoi2.height;; i16 = i3)
      {
        localView2.measure(View.MeasureSpec.makeMeasureSpec(i15, i14), View.MeasureSpec.makeMeasureSpec(i16, i11));
        if (i12 != 0) {
          i3 -= localView2.getMeasuredHeight();
        }
        for (;;)
        {
          i5++;
          break;
          label294:
          i12 = 0;
          break label167;
          label300:
          i13 = 0;
          break label182;
          label306:
          if (i13 == 0) {
            break label192;
          }
          i11 = 1073741824;
          break label192;
          if (i13 != 0) {
            i2 -= localView2.getMeasuredWidth();
          }
        }
        View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        this.B = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.C = true;
        d(this.d);
        this.C = false;
        int i6 = getChildCount();
        for (int i7 = 0; i7 < i6; i7++)
        {
          View localView1 = getChildAt(i7);
          if (localView1.getVisibility() != 8)
          {
            oi localoi1 = (oi)localView1.getLayoutParams();
            if ((localoi1 == null) || (!localoi1.a)) {
              localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i2 * localoi1.c), 1073741824), this.B);
            }
          }
        }
        return;
      }
      label472:
      i15 = i2;
      continue;
      label479:
      i14 = i10;
      i15 = i2;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1 = -1;
    int i2 = getChildCount();
    int i3;
    if ((paramInt & 0x2) != 0)
    {
      i1 = 1;
      i3 = 0;
    }
    while (i3 != i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 0)
      {
        oh localoh = a(localView);
        if ((localoh != null) && (localoh.b == this.d) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          i3 = i2 - 1;
          i2 = i1;
          continue;
        }
      }
      i3 += i1;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof on))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    on localon = (on)paramParcelable;
    super.onRestoreInstanceState(localon.getSuperState());
    if (this.c != null)
    {
      nc localnc = this.c;
      localnc.a();
      a(localon.a, false, true, 0);
      return;
    }
    this.u = localon.a;
    this.v = localon.b;
    this.w = localon.c;
  }
  
  public Parcelable onSaveInstanceState()
  {
    on localon = new on(super.onSaveInstanceState());
    localon.a = this.d;
    if (this.c != null) {
      localon.b = null;
    }
    return localon;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      if ((paramInt3 <= 0) || (this.b.isEmpty())) {
        break label144;
      }
      int i2 = 0 + (paramInt1 - getPaddingLeft() - getPaddingRight());
      int i3 = 0 + (paramInt3 - getPaddingLeft() - getPaddingRight());
      int i4 = (int)(getScrollX() / i3 * i2);
      scrollTo(i4, getScrollY());
      if (!this.x.isFinished())
      {
        int i5 = this.x.getDuration() - this.x.timePassed();
        oh localoh2 = f(this.d);
        this.x.startScroll(i4, 0, (int)(localoh2.e * paramInt1), 0, i5);
      }
    }
    return;
    label144:
    oh localoh1 = f(this.d);
    if (localoh1 != null) {}
    for (float f1 = Math.min(localoh1.e, this.f);; f1 = 0.0F)
    {
      int i1 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (i1 == getScrollX()) {
        break;
      }
      a(false);
      scrollTo(i1, getScrollY());
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.m) {
      return true;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    if ((this.c == null) || (this.c.b() == 0)) {
      return false;
    }
    if (this.k == null) {
      this.k = VelocityTracker.obtain();
    }
    this.k.addMovement(paramMotionEvent);
    int i1 = 0xFF & paramMotionEvent.getAction();
    boolean bool1 = false;
    switch (i1)
    {
    }
    for (;;)
    {
      if (bool1) {
        nj.a.l(this);
      }
      return true;
      this.x.abortAnimation();
      this.g = false;
      d(this.d);
      float f7 = paramMotionEvent.getX();
      this.i = f7;
      this.h = f7;
      float f8 = paramMotionEvent.getY();
      this.L = f8;
      this.K = f8;
      this.j = ms.a.b(paramMotionEvent, 0);
      bool1 = false;
      continue;
      float f4;
      if (!this.F)
      {
        int i14 = this.j;
        int i15 = ms.a.a(paramMotionEvent, i14);
        float f2 = ms.a.c(paramMotionEvent, i15);
        float f3 = Math.abs(f2 - this.h);
        f4 = ms.a.d(paramMotionEvent, i15);
        float f5 = Math.abs(f4 - this.K);
        if ((f3 > this.J) && (f3 > f5))
        {
          this.F = true;
          b(true);
          if (f2 - this.i <= 0.0F) {
            break label427;
          }
        }
      }
      label427:
      for (float f6 = this.i + this.J;; f6 = this.i - this.J)
      {
        this.h = f6;
        this.K = f4;
        a(1);
        if (this.D != true) {
          this.D = true;
        }
        ViewParent localViewParent = getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(true);
        }
        boolean bool6 = this.F;
        bool1 = false;
        if (!bool6) {
          break;
        }
        int i12 = this.j;
        int i13 = ms.a.a(paramMotionEvent, i12);
        bool1 = false | a(ms.a.c(paramMotionEvent, i13));
        break;
      }
      boolean bool4 = this.F;
      bool1 = false;
      if (bool4)
      {
        VelocityTracker localVelocityTracker = this.k;
        localVelocityTracker.computeCurrentVelocity(1000, this.l);
        int i5 = this.j;
        int i6 = (int)nf.a.a(localVelocityTracker, i5);
        this.g = true;
        int i7 = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
        int i8 = getScrollX();
        oh localoh = b();
        int i9 = localoh.b;
        float f1 = (i8 / i7 - localoh.e) / localoh.d;
        int i10 = this.j;
        int i11 = ms.a.a(paramMotionEvent, i10);
        a(a(i9, f1, i6, (int)(ms.a.c(paramMotionEvent, i11) - this.i)), true, true, i6);
        this.j = -1;
        d();
        ru localru3 = this.P;
        boolean bool5 = ru.b.c(localru3.a);
        ru localru4 = this.Q;
        bool1 = bool5 | ru.b.c(localru4.a);
        continue;
        boolean bool2 = this.F;
        bool1 = false;
        if (bool2)
        {
          a(this.d, true, 0, false);
          this.j = -1;
          d();
          ru localru1 = this.P;
          boolean bool3 = ru.b.c(localru1.a);
          ru localru2 = this.Q;
          bool1 = bool3 | ru.b.c(localru2.a);
          continue;
          int i4 = ms.b(paramMotionEvent);
          this.h = ms.a.c(paramMotionEvent, i4);
          this.j = ms.a.b(paramMotionEvent, i4);
          bool1 = false;
          continue;
          a(paramMotionEvent);
          int i2 = this.j;
          int i3 = ms.a.a(paramMotionEvent, i2);
          this.h = ms.a.c(paramMotionEvent, i3);
          bool1 = false;
        }
      }
    }
  }
  
  public void removeView(View paramView)
  {
    if (this.C)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.7.0.1
 */