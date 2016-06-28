import android.media.MediaPlayer;
import com.google.android.apps.plus.service.SkyjamPlaybackService;
import java.io.IOException;

public final class dng
  implements Runnable
{
  dng(SkyjamPlaybackService paramSkyjamPlaybackService, bma parambma) {}
  
  public final void run()
  {
    SkyjamPlaybackService localSkyjamPlaybackService;
    String str;
    if ((!this.a.n()) && (this.b.c != null))
    {
      SkyjamPlaybackService.j = this.a.a;
      localSkyjamPlaybackService = this.b;
      str = this.a.b;
    }
    try
    {
      localSkyjamPlaybackService.c.setAudioStreamType(3);
      localSkyjamPlaybackService.c.setLooping(false);
      localSkyjamPlaybackService.c.setDataSource(str);
      localSkyjamPlaybackService.c.prepareAsync();
      SkyjamPlaybackService.h = localSkyjamPlaybackService.getString(aau.tI);
      localSkyjamPlaybackService.c();
      return;
    }
    catch (IOException localIOException)
    {
      localSkyjamPlaybackService.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dng
 * JD-Core Version:    0.7.0.1
 */