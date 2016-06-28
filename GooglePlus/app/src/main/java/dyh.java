import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class dyh
  implements View.OnClickListener
{
  public dyh(PhotoTileView paramPhotoTileView) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.a != null)
    {
      if (!this.a.H) {
        break label92;
      }
      aud localaud = this.a.g;
      isp localisp = this.a.a;
      if (localaud.b.b(localisp)) {
        this.a.h.a(this.a.a);
      }
    }
    else
    {
      return;
    }
    this.a.h.b(this.a.a);
    return;
    label92:
    cpa localcpa = this.a.f;
    localcpa.a_(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyh
 * JD-Core Version:    0.7.0.1
 */