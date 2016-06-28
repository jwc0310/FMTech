import android.media.MediaPlayer;
import android.os.Handler;
import com.google.android.apps.plus.service.SkyjamPlaybackService;

public final class dne
  implements Runnable
{
  public dne(SkyjamPlaybackService paramSkyjamPlaybackService) {}
  
  public final void run()
  {
    SkyjamPlaybackService localSkyjamPlaybackService;
    int i;
    Object[] arrayOfObject;
    if ((this.a.c != null) && (this.a.c.isPlaying()) && (this.a.c.getCurrentPosition() < SkyjamPlaybackService.j))
    {
      SkyjamPlaybackService.i = this.a.c.getCurrentPosition();
      localSkyjamPlaybackService = this.a;
      i = aau.tK;
      arrayOfObject = new Object[2];
      arrayOfObject[0] = this.a.a(SkyjamPlaybackService.i);
      arrayOfObject[1] = this.a.a(SkyjamPlaybackService.j);
    }
    for (SkyjamPlaybackService.h = localSkyjamPlaybackService.getString(i, arrayOfObject);; SkyjamPlaybackService.h = this.a.getString(aau.tL))
    {
      this.a.c();
      this.a.b.postDelayed(this, 1000L);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dne
 * JD-Core Version:    0.7.0.1
 */