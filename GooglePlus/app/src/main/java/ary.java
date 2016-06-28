import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;
import java.util.Map;

final class ary
  implements ViewTreeObserver.OnPreDrawListener
{
  ary(arv paramarv, ViewTreeObserver paramViewTreeObserver, ListView paramListView) {}
  
  public final boolean onPreDraw()
  {
    this.b.removeOnPreDrawListener(this);
    int i = this.c.getFirstVisiblePosition();
    int j = 0;
    int k = 1;
    if (j < this.c.getChildCount())
    {
      View localView = this.c.getChildAt(j);
      int m = i + j;
      long l = this.a.e.getItemId(m);
      Integer localInteger = (Integer)this.a.c.get(Long.valueOf(l));
      int n = localView.getTop();
      int i3;
      label115:
      arz localarz;
      label154:
      arv localarv;
      float f;
      int i2;
      if (localInteger == null)
      {
        i3 = localView.getHeight() + this.c.getDividerHeight();
        if (j > 0) {
          localInteger = Integer.valueOf(i3 + n);
        }
      }
      else
      {
        int i1 = localInteger.intValue() - n;
        if (i1 != 0)
        {
          if (k == 0) {
            break label314;
          }
          localarz = new arz(this);
          localarv = this.a;
          f = i1;
          if (Build.VERSION.SDK_INT < 11) {
            break label320;
          }
          i2 = 1;
          label176:
          if (i2 == 0) {
            break label326;
          }
          localView.animate().setDuration(150L);
          if (0.0F != 0.0F)
          {
            ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(localView, View.TRANSLATION_X, new float[] { 0.0F, 0.0F });
            localObjectAnimator2.setDuration(150L);
            localObjectAnimator2.start();
            localarv.a(localObjectAnimator2, localarz);
            localarz = null;
          }
          if (f == 0.0F) {
            break label379;
          }
          ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localView, View.TRANSLATION_Y, new float[] { f, 0.0F });
          localObjectAnimator1.setDuration(150L);
          localObjectAnimator1.start();
          localarv.a(localObjectAnimator1, localarz);
        }
      }
      label314:
      label320:
      label326:
      label379:
      for (k = 0;; k = 0)
      {
        j++;
        break;
        i3 = -i3;
        break label115;
        localarz = null;
        break label154;
        i2 = 0;
        break label176;
        TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, f, 0.0F);
        localTranslateAnimation.setDuration(150L);
        localView.startAnimation(localTranslateAnimation);
        if (localarz != null) {
          localView.getAnimation().setAnimationListener(new asa(localarv, localarz));
        }
      }
    }
    this.a.c.clear();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ary
 * JD-Core Version:    0.7.0.1
 */