import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.apps.plus.views.PhotosHomeTabContainer;
import com.google.android.apps.plus.views.PhotosHomeTabStrip;

public final class dyx
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public dyx(PhotosHomeTabContainer paramPhotosHomeTabContainer) {}
  
  public final void onGlobalLayout()
  {
    this.a.a(this.a.b.d, 0);
    this.a.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyx
 * JD-Core Version:    0.7.0.1
 */