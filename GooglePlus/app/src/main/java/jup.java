import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import com.google.android.libraries.social.media.ui.MediaView;

final class jup
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  jup(juo paramjuo) {}
  
  public final void onGlobalLayout()
  {
    if (this.a.N != null) {}
    for (int i = this.a.N.getMeasuredWidth();; i = 0)
    {
      juo localjuo;
      ViewGroup.LayoutParams localLayoutParams;
      if (i > 0)
      {
        if (this.a.N.getViewTreeObserver().isAlive()) {
          this.a.N.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        localjuo = this.a;
        int j = (int)(i / 2.0D);
        int k = (int)(1.25D * j);
        localjuo.d.getLayoutParams().width = j;
        localjuo.d.getLayoutParams().height = k;
        localjuo.d.b(j, k);
        localjuo.Z.getLayoutParams().width = j;
        localjuo.Z.getLayoutParams().height = k;
        localjuo.Z.b(j, k);
        localjuo.ag = ((int)(0.5625D * i));
        localjuo.b.getLayoutParams().height = localjuo.ag;
        localjuo.b.b(i, localjuo.ag);
        localjuo.c.getLayoutParams().height = localjuo.ag;
        localjuo.aa.getLayoutParams().width = i;
        localjuo.aa.getLayoutParams().height = localjuo.ag;
        localjuo.aa.b(i, localjuo.ag);
        if (!localjuo.ac.l())
        {
          localLayoutParams = localjuo.ab.getLayoutParams();
          if (localjuo.ac.a(0).a() != null) {
            break label289;
          }
        }
      }
      label289:
      for (int m = juo.af;; m = localjuo.ag)
      {
        localLayoutParams.height = m;
        localjuo.v();
        this.a.ae = true;
        return;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jup
 * JD-Core Version:    0.7.0.1
 */