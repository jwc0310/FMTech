import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.media.ui.MediaView;

public final class iqt
  implements lpw
{
  private final void b(View paramView)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      for (int i = -1 + localViewGroup.getChildCount(); i >= 0; i--) {
        b(localViewGroup.getChildAt(i));
      }
    }
    if ((paramView instanceof lxj)) {
      ((lxj)paramView).D_();
    }
    if ((paramView instanceof MediaView))
    {
      MediaView localMediaView = (MediaView)paramView;
      localMediaView.setTag(null);
      localMediaView.setOnClickListener(null);
      localMediaView.setOnLongClickListener(null);
      localMediaView.setClickable(false);
    }
  }
  
  public final void a(View paramView)
  {
    b(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqt
 * JD-Core Version:    0.7.0.1
 */