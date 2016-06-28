package android.support.design.widget;

import aa;
import ab;
import ac;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import nj;
import ns;
import ov;
import p;

public final class Snackbar
{
  static
  {
    new Handler(Looper.getMainLooper(), new aa());
  }
  
  public final void a()
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      float f = null.getHeight();
      nj.a.b(null, f);
      nj.a.j(null).c(0.0F).a(p.a).a(250L).a(new ab(this)).b();
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(null.getContext(), 2131034130);
    localAnimation.setInterpolator(p.a);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new ac(this));
    null.startAnimation(localAnimation);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.design.widget.Snackbar
 * JD-Core Version:    0.7.0.1
 */