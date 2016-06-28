import android.animation.Animator.AnimatorListener;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class lol
  implements lxj
{
  List<lxc> a;
  public boolean b;
  private final loj c;
  private ViewGroup d;
  private Object e;
  private Rect f;
  private float g;
  private View h;
  private float i;
  private float j;
  private boolean k;
  private int l;
  private int m;
  private int[] n;
  private int[] o;
  private ArrayList<String> p;
  private boolean q = false;
  private final int r;
  
  public lol(lor paramlor)
  {
    this(paramlor, do.aD);
  }
  
  public lol(lor paramlor, int paramInt)
  {
    this.d = ((ViewGroup)paramlor);
    this.c = loj.a(this.d.getContext());
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 0;
    if (i1 >= 14) {
      i2 = 1;
    }
    if (i2 != 0) {}
    for (this.e = new lom(this);; this.e = new lon(this))
    {
      this.f = new Rect();
      this.g = ViewConfiguration.get(this.d.getContext()).getScaledTouchSlop();
      this.r = paramInt;
      return;
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    if (this.k != paramBoolean)
    {
      if (this.d != null)
      {
        ViewParent localViewParent = this.d.getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
        }
        this.d.requestLayout();
      }
      this.k = paramBoolean;
      c();
    }
  }
  
  private final void b()
  {
    System.arraycopy(this.n, 0, this.o, 0, this.m);
    Arrays.fill(this.n, -1);
    int i1 = 0;
    int i2 = this.a.size();
    int i3 = 0;
    int i16;
    label96:
    int i17;
    label127:
    int i15;
    if (i3 < i2)
    {
      lxc locallxc = (lxc)this.a.get(i3);
      if ((locallxc.a()) || ((this.p != null) && (this.p.contains(locallxc.b())))) {
        break label769;
      }
      i16 = 0;
      if (i16 >= this.m) {
        break label763;
      }
      if (this.o[i16] == i3)
      {
        this.n[i16] = i3;
        i17 = 1;
        if (i17 == 0)
        {
          if (i3 >= this.m) {
            break label176;
          }
          this.n[i3] = i3;
        }
        label147:
        i15 = i1 + 1;
        if (i15 >= this.m) {
          break label216;
        }
      }
    }
    for (;;)
    {
      i3++;
      i1 = i15;
      break;
      i16++;
      break label96;
      label176:
      for (int i18 = 0;; i18++)
      {
        if (i18 >= this.m) {
          break label214;
        }
        if (this.n[i18] == -1)
        {
          this.n[i18] = i3;
          break;
        }
      }
      label214:
      break label147;
      label216:
      i1 = i15;
      int i4 = -1;
      if (!this.b) {}
      for (int i14 = 0;; i14++) {
        if (i14 < this.m)
        {
          if (this.n[i14] == -1) {
            i4 = i14;
          }
        }
        else
        {
          if ((!this.b) || (i1 <= 0)) {
            break;
          }
          for (int i13 = 0; i13 < -1 + this.m; i13++) {
            if (this.n[i13] == -1)
            {
              this.n[i13] = this.n[(i13 + 1)];
              this.n[(i13 + 1)] = -1;
            }
          }
        }
      }
      lwo.e(this.d);
      this.d.removeAllViews();
      int i5 = 1;
      lor locallor = (lor)this.d;
      locallor.f();
      int i6 = locallor.h();
      int i7 = locallor.i();
      int i8 = 0;
      Object localObject1 = null;
      if (i8 < i6)
      {
        int i11 = this.n[i8];
        boolean bool2;
        label428:
        Object localObject2;
        int i12;
        if (i11 == -1) {
          if (this.b) {
            if ((i1 == 0) && (i8 == 0))
            {
              bool2 = true;
              localObject2 = new lqb(this.d.getContext(), i7, bool2, this.r);
              if (this.q)
              {
                if ((this.n[i8] == -1) || (this.n[i8] == this.o[i8])) {
                  break label578;
                }
                i12 = 1;
                label490:
                if (i12 != 0)
                {
                  if (localObject1 != null) {
                    break label584;
                  }
                  localObject1 = localObject2;
                }
              }
            }
          }
        }
        for (;;)
        {
          this.d.addView((View)localObject2);
          i8++;
          break;
          bool2 = false;
          break label428;
          if (i8 == i4)
          {
            bool2 = true;
            break label428;
          }
          bool2 = false;
          break label428;
          if (i8 == i6 - 1) {}
          for (boolean bool1 = true;; bool1 = false)
          {
            localObject2 = locallor.a(i11, bool1);
            break;
          }
          label578:
          i12 = 0;
          break label490;
          label584:
          i5 = 0;
        }
      }
      int i9;
      int i10;
      if ((i5 != 0) && (localObject1 != null))
      {
        if (Build.VERSION.SDK_INT < 14) {
          break label698;
        }
        i9 = 1;
        if (i9 == 0) {
          break label710;
        }
        localObject1.setAlpha(0.0F);
        ViewPropertyAnimator localViewPropertyAnimator = localObject1.animate().alpha(1.0F).setDuration(300L).setInterpolator(this.c.b);
        if (Build.VERSION.SDK_INT < 16) {
          break label704;
        }
        i10 = 1;
        label660:
        if (i10 != 0) {
          localViewPropertyAnimator.withLayer();
        }
        localViewPropertyAnimator.start();
      }
      for (;;)
      {
        locallor.g();
        this.d.requestLayout();
        this.d.invalidate();
        return;
        label698:
        i9 = 0;
        break;
        label704:
        i10 = 0;
        break label660;
        label710:
        AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
        localAlphaAnimation.setDuration(300L);
        localAlphaAnimation.setInterpolator(this.c.b);
        localAlphaAnimation.setFillAfter(true);
        localAlphaAnimation.setFillEnabled(true);
        localObject1.startAnimation(localAlphaAnimation);
      }
      label763:
      i17 = 0;
      break label127;
      label769:
      i15 = i1;
    }
  }
  
  private final void c()
  {
    if (this.h == null) {
      return;
    }
    int i1 = this.h.getWidth();
    float f1 = this.j - this.i;
    if (this.k) {}
    float f3;
    for (float f2 = f1;; f2 = 0.0F)
    {
      f3 = Math.abs(f2) / i1;
      if (!this.k) {
        break label181;
      }
      int i4 = Build.VERSION.SDK_INT;
      int i5 = 0;
      if (i4 >= 14) {
        i5 = 1;
      }
      if (i5 == 0) {
        break;
      }
      this.h.setTranslationX(f2);
      this.h.setAlpha(1.0F - f3);
      return;
    }
    TranslateAnimation localTranslateAnimation2 = new TranslateAnimation(f2, f2, 0.0F, 0.0F);
    AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(1.0F - f3, 1.0F - f3);
    AnimationSet localAnimationSet2 = new AnimationSet(true);
    localAnimationSet2.addAnimation(localTranslateAnimation2);
    localAnimationSet2.addAnimation(localAlphaAnimation2);
    localAnimationSet2.setAnimationListener(null);
    localAnimationSet2.setFillAfter(true);
    localAnimationSet2.setFillEnabled(true);
    this.h.startAnimation(localAnimationSet2);
    return;
    label181:
    float f7;
    float f5;
    float f4;
    label217:
    float f6;
    int i2;
    label234:
    ViewPropertyAnimator localViewPropertyAnimator;
    if (Math.abs(f1) / i1 >= 0.25F) {
      if (f1 > 0.0F)
      {
        f7 = i1;
        this.l = 2;
        f5 = f7;
        f4 = 0.0F;
        f6 = 1.0F - f3;
        if (Build.VERSION.SDK_INT < 14) {
          break label334;
        }
        i2 = 1;
        if (i2 == 0) {
          break label346;
        }
        localViewPropertyAnimator = this.h.animate().translationX(f5).alpha(f4).setInterpolator(this.c.b).setDuration(150L).setListener((Animator.AnimatorListener)this.e);
        if (Build.VERSION.SDK_INT < 16) {
          break label340;
        }
      }
    }
    label334:
    label340:
    for (int i3 = 1;; i3 = 0)
    {
      if (i3 != 0) {
        localViewPropertyAnimator.withLayer();
      }
      localViewPropertyAnimator.start();
      return;
      f7 = -i1;
      break;
      this.l = 1;
      f4 = 1.0F;
      f5 = 0.0F;
      break label217;
      i2 = 0;
      break label234;
    }
    label346:
    TranslateAnimation localTranslateAnimation1 = new TranslateAnimation(f1, f5, 0.0F, 0.0F);
    AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(f6, f4);
    AnimationSet localAnimationSet1 = new AnimationSet(true);
    localAnimationSet1.addAnimation(localTranslateAnimation1);
    localAnimationSet1.addAnimation(localAlphaAnimation1);
    localAnimationSet1.setInterpolator(this.c.b);
    localAnimationSet1.setDuration(150L);
    localAnimationSet1.setFillAfter(true);
    localAnimationSet1.setFillEnabled(true);
    localAnimationSet1.setAnimationListener((Animation.AnimationListener)this.e);
    this.h.startAnimation(localAnimationSet1);
  }
  
  public final void D_()
  {
    a(false);
    this.h = null;
    this.i = 0.0F;
    this.j = 0.0F;
    this.k = false;
    this.l = 0;
    this.a = null;
    this.m = 0;
    this.n = null;
    this.o = null;
    this.p = null;
    this.q = false;
  }
  
  public final void a(String paramString, ArrayList<String> paramArrayList)
  {
    int i1 = this.d.getChildCount();
    int i2 = 0;
    loq localloq;
    if (i2 < i1)
    {
      View localView = this.d.getChildAt(i2);
      if ((localView instanceof loq))
      {
        localloq = (loq)localView;
        if (!localloq.g().b().equals(paramString)) {}
      }
    }
    for (;;)
    {
      if (localloq == null)
      {
        a(paramArrayList);
        return;
        i2++;
        break;
      }
      int i3;
      ViewPropertyAnimator localViewPropertyAnimator;
      if (Build.VERSION.SDK_INT >= 14)
      {
        i3 = 1;
        if (i3 == 0) {
          break label182;
        }
        localViewPropertyAnimator = ((View)localloq).animate().alpha(0.0F).setDuration(300L).setInterpolator(this.c.c);
        if (Build.VERSION.SDK_INT < 16) {
          break label176;
        }
      }
      label176:
      for (int i4 = 1;; i4 = 0)
      {
        if (i4 != 0) {
          localViewPropertyAnimator.withLayer();
        }
        localViewPropertyAnimator.setListener(new loo(this, localViewPropertyAnimator, paramArrayList));
        localViewPropertyAnimator.start();
        return;
        i3 = 0;
        break;
      }
      label182:
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation.setDuration(300L);
      localAlphaAnimation.setInterpolator(this.c.c);
      localAlphaAnimation.setFillAfter(true);
      localAlphaAnimation.setFillEnabled(true);
      localAlphaAnimation.setAnimationListener(new lop(this, localAlphaAnimation, paramArrayList));
      ((View)localloq).startAnimation(localAlphaAnimation);
      return;
      localloq = null;
    }
  }
  
  public final void a(ArrayList<String> paramArrayList)
  {
    this.p = paramArrayList;
    if ((paramArrayList != null) && (!paramArrayList.isEmpty())) {}
    for (boolean bool = true;; bool = false)
    {
      this.q = bool;
      b();
      return;
    }
  }
  
  public final void a(List<? extends lxc> paramList, int paramInt)
  {
    this.a = paramList;
    this.m = paramInt;
    this.n = new int[this.m];
    this.o = new int[this.m];
    Arrays.fill(this.n, -1);
    Arrays.fill(this.o, -1);
    b();
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    this.j = paramMotionEvent.getX();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return this.k;
      if (this.k)
      {
        c();
        continue;
        boolean bool = this.k;
        a(false);
        if ((!bool) && (this.h != null) && (this.h.isClickable()))
        {
          this.h.performClick();
          if (this.l == 0) {
            this.h = null;
          }
          return true;
        }
        if (this.l == 0)
        {
          this.h = null;
          continue;
          a(false);
          this.h = null;
        }
      }
    }
  }
  
  public final boolean b(MotionEvent paramMotionEvent)
  {
    if (this.l != 0) {
      return false;
    }
    this.j = paramMotionEvent.getX();
    int i1;
    float f1;
    if (Build.VERSION.SDK_INT >= 14)
    {
      i1 = 1;
      if (i1 != 0) {
        this.j += this.d.getTranslationX();
      }
      f1 = paramMotionEvent.getY();
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      return false;
      i1 = 0;
      break;
      this.i = this.j;
      continue;
      if ((!this.k) && (Math.abs(this.i - this.j) >= this.g)) {
        for (int i2 = -1 + this.d.getChildCount(); i2 >= 0; i2--)
        {
          View localView = this.d.getChildAt(i2);
          if (((localView instanceof loq)) && (((loq)localView).e()))
          {
            localView.getHitRect(this.f);
            if ((this.f.top <= f1) && (this.f.bottom > f1))
            {
              this.h = localView;
              a(true);
              return true;
            }
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lol
 * JD-Core Version:    0.7.0.1
 */