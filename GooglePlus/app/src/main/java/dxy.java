import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.google.android.apps.plus.views.PhotoAlbumView;

public final class dxy
  implements Animation.AnimationListener
{
  public dxy(PhotoAlbumView paramPhotoAlbumView) {}
  
  public final void onAnimationEnd(Animation paramAnimation) {}
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation)
  {
    null.setVisibility(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxy
 * JD-Core Version:    0.7.0.1
 */