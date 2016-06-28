import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class aa
  implements Handler.Callback
{
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    case 0: 
      Snackbar localSnackbar2 = (Snackbar)paramMessage.obj;
      if (null.getParent() == null)
      {
        ViewGroup.LayoutParams localLayoutParams2 = null.getLayoutParams();
        if ((localLayoutParams2 instanceof s))
        {
          af localaf = new af(localSnackbar2);
          localaf.e = Math.min(Math.max(0.0F, 0.1F), 1.0F);
          localaf.f = Math.min(Math.max(0.0F, 0.6F), 1.0F);
          localaf.c = 0;
          localaf.b = new agf(localSnackbar2);
          ((s)localLayoutParams2).a(localaf);
        }
        null.addView(null);
      }
      if (nj.a.y(null)) {
        localSnackbar2.a();
      }
      for (;;)
      {
        return true;
        null.c = new aau(localSnackbar2);
      }
    }
    Snackbar localSnackbar1 = (Snackbar)paramMessage.obj;
    int i = paramMessage.arg1;
    int k;
    if (null.getVisibility() == 0)
    {
      ViewGroup.LayoutParams localLayoutParams1 = null.getLayoutParams();
      boolean bool1 = localLayoutParams1 instanceof s;
      int j = 0;
      if (bool1)
      {
        aau localaau = ((s)localLayoutParams1).a;
        boolean bool2 = localaau instanceof ah;
        j = 0;
        if (bool2)
        {
          ah localah = (ah)localaau;
          if (localah.a == null) {
            break label290;
          }
          k = localah.a.a;
          j = 0;
          if (k != 0) {
            j = 1;
          }
        }
      }
      if (j == 0) {
        break label296;
      }
    }
    else
    {
      null.removeView(null);
      dbi.a().a(null);
    }
    for (;;)
    {
      return true;
      label290:
      k = 0;
      break;
      label296:
      if (Build.VERSION.SDK_INT >= 14)
      {
        nj.a.j(null).c(null.getHeight()).a(p.a).a(250L).a(new ad(localSnackbar1, i)).b();
      }
      else
      {
        Animation localAnimation = AnimationUtils.loadAnimation(null.getContext(), 2131034131);
        localAnimation.setInterpolator(p.a);
        localAnimation.setDuration(250L);
        localAnimation.setAnimationListener(new ae(localSnackbar1, i));
        null.startAnimation(localAnimation);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aa
 * JD-Core Version:    0.7.0.1
 */