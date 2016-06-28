import android.os.Handler;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.widget.MediaController;

final class cqe
  implements View.OnSystemUiVisibilityChangeListener
{
  cqe(cqc paramcqc) {}
  
  public final void onSystemUiVisibilityChange(int paramInt)
  {
    cqc localcqc = this.a;
    if ((paramInt & 0x2) == 0) {}
    try
    {
      localcqc.d.show();
      Runnable localRunnable = localcqc.ac;
      efj.m().postDelayed(localRunnable, 3000L);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        localcqc.aa = false;
        localcqc.ab = true;
        View localView = localcqc.N;
        if (localView != null)
        {
          cqc.a(localView, aau.vB);
          localcqc.e(localView);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqe
 * JD-Core Version:    0.7.0.1
 */