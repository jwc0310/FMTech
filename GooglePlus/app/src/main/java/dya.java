import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.apps.plus.views.PhotoView;

public class dya
{
  public dya(chp paramchp) {}
  
  public void a(Rect paramRect)
  {
    PhotoView localPhotoView = this.a.c;
    if (paramRect == null) {
      localPhotoView.t = false;
    }
    localPhotoView.t = true;
    localPhotoView.s.set(paramRect);
    localPhotoView.e(true);
    localPhotoView.requestLayout();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dya
 * JD-Core Version:    0.7.0.1
 */