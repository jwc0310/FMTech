import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public abstract class lvp
{
  private static final List<String> a = Arrays.asList(new String[] { "com.google.android.apps.plus.gunslegacy.NotificationsDismissHelper", "com.google.android.apps.plus.notifications.ui.NotificationsDismissHelper", "com.google.android.libraries.social.cardkit.plus.LinearSwipeToDismissHelper", "com.google.android.libraries.social.discovery.views.PeopleListDismissHelper", "com.google.android.libraries.social.notifications.ui.NotificationsDismissHelper" });
  static int b = -1;
  private static final mcq h = new mcq("debug.swipe.check_subclassing");
  public ViewGroup c;
  public boolean d = false;
  public boolean e = false;
  lvw f;
  public View.OnTouchListener g = new lvq(this);
  private float i = 0.0F;
  private float j = 1.0F;
  private final Context k;
  
  public lvp(Context paramContext, ViewGroup paramViewGroup, lvw paramlvw)
  {
    this.k = paramContext;
    this.c = paramViewGroup;
    this.f = paramlvw;
    if (b < 0) {
      b = ViewConfiguration.get(this.k).getScaledTouchSlop();
    }
  }
  
  @TargetApi(11)
  private final void a(Animator paramAnimator, Runnable paramRunnable)
  {
    if (paramRunnable != null) {
      paramAnimator.addListener(new lvu(this, paramRunnable));
    }
  }
  
  private final void a(Animation paramAnimation, Runnable paramRunnable)
  {
    if (paramRunnable != null) {
      paramAnimation.setAnimationListener(new lvv(this, paramRunnable));
    }
  }
  
  @TargetApi(11)
  public static float c(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int m = 1; m != 0; m = 0) {
      return paramView.getY();
    }
    return paramView.getTop();
  }
  
  public static void d(View paramView)
  {
    if (paramView != null) {
      if (Build.VERSION.SDK_INT < 14) {
        break label33;
      }
    }
    label33:
    for (int m = 1; m != 0; m = 0)
    {
      lwo.h(paramView);
      paramView.setAlpha(1.0F);
      paramView.setTranslationX(0.0F);
      return;
    }
    paramView.clearAnimation();
  }
  
  public abstract Float a(ListView paramListView, int paramInt, HashMap<Object, Float> paramHashMap);
  
  public final void a()
  {
    this.c.setTag(efj.ZV, null);
    this.e = false;
    this.d = false;
  }
  
  public final void a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Runnable paramRunnable)
  {
    int m;
    if (Build.VERSION.SDK_INT >= 14)
    {
      m = 1;
      if (m == 0) {
        break label147;
      }
      paramView.animate().setDuration(150L);
      if (paramFloat1 != paramFloat2)
      {
        ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(paramView, View.TRANSLATION_X, new float[] { paramFloat1, paramFloat2 });
        localObjectAnimator2.setDuration(150L);
        localObjectAnimator2.start();
        a(localObjectAnimator2, paramRunnable);
        paramRunnable = null;
      }
      if (paramFloat3 != paramFloat4)
      {
        ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(paramView, View.TRANSLATION_Y, new float[] { paramFloat3, paramFloat4 });
        localObjectAnimator1.setDuration(150L);
        localObjectAnimator1.start();
        a(localObjectAnimator1, paramRunnable);
      }
    }
    for (;;)
    {
      this.d = false;
      this.e = false;
      return;
      m = 0;
      break;
      label147:
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      localTranslateAnimation.setDuration(150L);
      paramView.startAnimation(localTranslateAnimation);
      if (paramRunnable != null) {
        a(paramView.getAnimation(), paramRunnable);
      }
    }
  }
  
  public final void a(View paramView, float paramFloat, long paramLong, boolean paramBoolean)
  {
    this.e = true;
    int m;
    ViewPropertyAnimator localViewPropertyAnimator;
    float f3;
    if (Build.VERSION.SDK_INT >= 14)
    {
      m = 1;
      if (m == 0) {
        break label78;
      }
      localViewPropertyAnimator = paramView.animate().setDuration(paramLong);
      f3 = 0.0F;
      if (!paramBoolean) {
        break label72;
      }
    }
    for (;;)
    {
      localViewPropertyAnimator.alpha(f3).translationX(paramFloat).setListener(new lvr(this, paramBoolean, paramView));
      return;
      m = 0;
      break;
      label72:
      f3 = 1.0F;
    }
    label78:
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(this.i, paramFloat, 0.0F, 0.0F);
    float f1 = this.j;
    float f2 = 0.0F;
    if (paramBoolean) {}
    for (;;)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(f1, f2);
      AnimationSet localAnimationSet = new AnimationSet(true);
      localAnimationSet.addAnimation(localTranslateAnimation);
      localAnimationSet.addAnimation(localAlphaAnimation);
      localAnimationSet.setDuration(paramLong);
      localAnimationSet.setFillAfter(true);
      localAnimationSet.setFillEnabled(true);
      paramView.startAnimation(localAnimationSet);
      a(localAnimationSet, new lvs(this, paramBoolean, paramView));
      return;
      f2 = 1.0F;
    }
  }
  
  public abstract void a(View paramView, boolean paramBoolean);
  
  public abstract void a(ViewGroup paramViewGroup);
  
  public final void a(ListView paramListView, HashMap<Object, Float> paramHashMap, boolean paramBoolean)
  {
    if (paramHashMap.isEmpty())
    {
      this.e = false;
      this.d = false;
    }
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return;
      localViewTreeObserver = paramListView.getViewTreeObserver();
    } while (localViewTreeObserver == null);
    localViewTreeObserver.addOnPreDrawListener(new lvt(this, localViewTreeObserver, paramListView, paramBoolean, paramHashMap));
  }
  
  public abstract boolean a(float paramFloat);
  
  public abstract boolean b(View paramView);
  
  final boolean e(View paramView)
  {
    ViewGroup localViewGroup = this.c;
    boolean bool = false;
    if (localViewGroup != null)
    {
      Object localObject = this.c.getTag(efj.ZV);
      bool = false;
      if (localObject == paramView) {
        bool = true;
      }
    }
    return bool;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvp
 * JD-Core Version:    0.7.0.1
 */