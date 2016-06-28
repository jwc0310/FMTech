import android.os.Handler;
import android.os.Process;
import com.google.android.apps.plus.service.SkyjamPlaybackService;

public final class dnf
  implements Runnable
{
  public dnf(SkyjamPlaybackService paramSkyjamPlaybackService) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    SkyjamPlaybackService localSkyjamPlaybackService = this.a;
    bma localbma = new bma(localSkyjamPlaybackService, new kcg(localSkyjamPlaybackService, SkyjamPlaybackService.f), SkyjamPlaybackService.d);
    localbma.i();
    localSkyjamPlaybackService.b.post(new dng(localSkyjamPlaybackService, localbma));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnf
 * JD-Core Version:    0.7.0.1
 */