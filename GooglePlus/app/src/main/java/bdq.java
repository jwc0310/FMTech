import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Scroller;
import com.google.android.apps.plus.views.PhotoViewPager;

final class bdq
  extends BroadcastReceiver
{
  bdq(bdp parambdp) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((!this.a.i()) || (!paramIntent.getAction().equals("com.google.android.apps.photos.SLIDESHOW_STATE"))) {
      return;
    }
    if (paramIntent.getBooleanExtra("slideshow_playing", false))
    {
      this.a.ac = true;
      bdp localbdp = this.a;
      if (!((jqb)this.a.bo.a(jqb.class)).b()) {}
      int i;
      for (boolean bool = true;; bool = false)
      {
        localbdp.ad = bool;
        if (!this.a.aa.a()) {
          this.a.a(true);
        }
        i = paramIntent.getIntExtra("slideshow_position", -1);
        if (i != 1 + this.a.d) {
          break;
        }
        PhotoViewPager localPhotoViewPager = this.a.c;
        localPhotoViewPager.e();
        localPhotoViewPager.c();
        localPhotoViewPager.r = new Scroller(localPhotoViewPager.getContext(), new AccelerateDecelerateInterpolator());
        localPhotoViewPager.r.startScroll(0, 0, localPhotoViewPager.getWidth(), 0, 600);
        localPhotoViewPager.post(localPhotoViewPager.s);
        return;
      }
      this.a.c.b(i);
      return;
    }
    this.a.ac = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdq
 * JD-Core Version:    0.7.0.1
 */