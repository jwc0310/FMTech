import android.database.Cursor;
import android.os.Handler;
import com.google.android.apps.plus.views.DreamViewFlipper;
import com.google.android.libraries.social.media.ui.MediaView;

public final class dvx
  implements Runnable
{
  public dvx(DreamViewFlipper paramDreamViewFlipper) {}
  
  public final void run()
  {
    if (!this.a.l) {
      return;
    }
    MediaView localMediaView = this.a.d;
    this.a.d = this.a.e;
    this.a.e = localMediaView;
    if (this.a.h.moveToNext())
    {
      DreamViewFlipper.a(this.a, this.a.h, this.a.e);
      this.a.i.postDelayed(this.a.m, 4000L);
      return;
    }
    this.a.i.postDelayed(this.a.n, 4000L);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvx
 * JD-Core Version:    0.7.0.1
 */