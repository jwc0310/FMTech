import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;
import java.util.HashMap;
import java.util.Map;

public final class arv<T>
  implements View.OnTouchListener
{
  boolean a;
  boolean b;
  Map<Long, Integer> c = new HashMap();
  final ListView d;
  final ase<T> e;
  private float f;
  private int g;
  private float h;
  private float i = 1.0F;
  private final View[] j;
  
  public arv(Context paramContext, ListView paramListView, View[] paramArrayOfView, ase<T> paramase)
  {
    this.d = paramListView;
    this.e = paramase;
    this.j = paramArrayOfView;
    this.g = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  @SuppressLint({"NewApi"})
  private final void a(View paramView, float paramFloat)
  {
    float f1 = Math.abs(paramFloat) / paramView.getWidth();
    if (Build.VERSION.SDK_INT >= 11) {}
    for (int k = 1; k != 0; k = 0)
    {
      paramView.setTranslationX(paramFloat);
      paramView.setAlpha(1.0F - f1);
      return;
    }
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(paramFloat, paramFloat, 0.0F, 0.0F);
    this.h = paramFloat;
    this.i = (1.0F - f1);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(this.i, this.i);
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.addAnimation(localTranslateAnimation);
    localAnimationSet.addAnimation(localAlphaAnimation);
    localAnimationSet.setFillAfter(true);
    localAnimationSet.setFillEnabled(true);
    paramView.startAnimation(localAnimationSet);
  }
  
  @SuppressLint({"NewApi"})
  final void a(Animator paramAnimator, Runnable paramRunnable)
  {
    if (paramRunnable != null) {
      paramAnimator.addListener(new asb(this, paramRunnable));
    }
  }
  
  @SuppressLint({"NewApi"})
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int k = 0;
    boolean bool1 = true;
    switch (paramMotionEvent.getAction())
    {
    default: 
      bool1 = false;
    }
    do
    {
      float f12;
      do
      {
        do
        {
          do
          {
            return bool1;
          } while (this.a);
          this.f = paramMotionEvent.getX();
          return bool1;
          a(paramView, 0.0F);
          this.b = false;
          return bool1;
        } while (this.a);
        float f11 = paramMotionEvent.getX();
        if (Build.VERSION.SDK_INT >= 11) {}
        for (boolean bool5 = bool1;; bool5 = false)
        {
          if (bool5) {
            f11 += paramView.getTranslationX();
          }
          f12 = f11 - this.f;
          float f13 = Math.abs(f12);
          if ((this.b) || (f13 <= this.g)) {
            break;
          }
          this.b = bool1;
          this.d.requestDisallowInterceptTouchEvent(bool1);
          View[] arrayOfView2 = this.j;
          int n = arrayOfView2.length;
          for (int i1 = 0; i1 < n; i1++) {
            arrayOfView2[i1].setEnabled(false);
          }
        }
      } while (!this.b);
      a(paramView, f12);
      return bool1;
    } while (this.a);
    boolean bool2;
    label257:
    float f3;
    float f10;
    label325:
    float f4;
    float f5;
    boolean bool3;
    label337:
    long l;
    boolean bool4;
    label374:
    ViewPropertyAnimator localViewPropertyAnimator;
    float f8;
    if (this.b)
    {
      float f1 = paramMotionEvent.getX();
      if (Build.VERSION.SDK_INT < 11) {
        break label457;
      }
      bool2 = bool1;
      if (bool2) {
        f1 += paramView.getTranslationX();
      }
      float f2 = f1 - this.f;
      f3 = Math.abs(f2);
      if (f3 <= paramView.getWidth() / 4) {
        break label473;
      }
      float f9 = f3 / paramView.getWidth();
      if (f2 >= 0.0F) {
        break label463;
      }
      f10 = -paramView.getWidth();
      f4 = f9;
      f5 = f10;
      bool3 = bool1;
      l = (int)(250.0F * (1.0F - f4));
      this.a = bool1;
      this.d.setEnabled(false);
      if (Build.VERSION.SDK_INT < 11) {
        break label494;
      }
      bool4 = bool1;
      if (!bool4) {
        break label506;
      }
      localViewPropertyAnimator = paramView.animate().setDuration(l);
      f8 = 0.0F;
      if (!bool3) {
        break label500;
      }
    }
    for (;;)
    {
      localViewPropertyAnimator.alpha(f8).translationX(f5).setListener(new arw(this, paramView, bool3));
      View[] arrayOfView1 = this.j;
      int m = arrayOfView1.length;
      while (k < m)
      {
        arrayOfView1[k].setEnabled(bool1);
        k++;
      }
      break;
      label457:
      bool2 = false;
      break label257;
      label463:
      f10 = paramView.getWidth();
      break label325;
      label473:
      f4 = 1.0F - f3 / paramView.getWidth();
      bool3 = false;
      f5 = 0.0F;
      break label337;
      label494:
      bool4 = false;
      break label374;
      label500:
      f8 = 1.0F;
    }
    label506:
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(this.h, f5, 0.0F, 0.0F);
    float f6 = this.i;
    float f7 = 0.0F;
    if (bool3) {}
    for (;;)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(f6, f7);
      AnimationSet localAnimationSet = new AnimationSet(bool1);
      localAnimationSet.addAnimation(localTranslateAnimation);
      localAnimationSet.addAnimation(localAlphaAnimation);
      localAnimationSet.setDuration(l);
      paramView.startAnimation(localAnimationSet);
      localAnimationSet.setAnimationListener(new asc(this, new arx(this, bool3, paramView)));
      break;
      f7 = 1.0F;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     arv
 * JD-Core Version:    0.7.0.1
 */