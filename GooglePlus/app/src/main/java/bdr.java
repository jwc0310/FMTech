import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class bdr
  implements Runnable
{
  bdr(bdp parambdp) {}
  
  @TargetApi(14)
  public final void run()
  {
    this.a.u_();
    View localView = this.a.N;
    if (localView != null)
    {
      localView.setAlpha(0.0F);
      localView.animate().alpha(1.0F).setDuration(250L).start();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdr
 * JD-Core Version:    0.7.0.1
 */