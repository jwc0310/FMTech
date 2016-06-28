import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

@TargetApi(21)
public final class iqv
  extends ViewOutlineProvider
{
  public final void getOutline(View paramView, Outline paramOutline)
  {
    paramOutline.setOval(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqv
 * JD-Core Version:    0.7.0.1
 */