import android.os.Build.VERSION;
import android.view.ViewPropertyAnimator;
import com.google.android.libraries.social.stream.legacy.views.StreamTooltipView;

public final class lqc
  implements Runnable
{
  public lqc(StreamTooltipView paramStreamTooltipView) {}
  
  public final void run()
  {
    int i = 1;
    StreamTooltipView localStreamTooltipView = this.a;
    localStreamTooltipView.setClickable(false);
    localStreamTooltipView.invalidate();
    int j;
    ViewPropertyAnimator localViewPropertyAnimator;
    if (Build.VERSION.SDK_INT >= 14)
    {
      j = i;
      if (j == 0) {
        break label89;
      }
      localViewPropertyAnimator = localStreamTooltipView.animate().alpha(0.0F).setDuration(200L);
      if (Build.VERSION.SDK_INT < 16) {
        break label84;
      }
    }
    for (;;)
    {
      if (i != 0) {
        localViewPropertyAnimator.withLayer();
      }
      localViewPropertyAnimator.setListener(new lqd(localStreamTooltipView));
      return;
      j = 0;
      break;
      label84:
      i = 0;
    }
    label89:
    localStreamTooltipView.setVisibility(8);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqc
 * JD-Core Version:    0.7.0.1
 */