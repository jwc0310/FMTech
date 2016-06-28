import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.service.SkyjamPlaybackService;

final class brb
  implements Runnable
{
  brb(bra parambra) {}
  
  public final void run()
  {
    Context localContext = this.a.a;
    if (SkyjamPlaybackService.d != null)
    {
      Intent localIntent = new Intent(localContext, SkyjamPlaybackService.class);
      localIntent.setAction("com.google.android.apps.plus.service.SkyjamPlaybackService.STOP");
      localIntent.putExtra("account_id", SkyjamPlaybackService.f);
      localIntent.putExtra("music_url", SkyjamPlaybackService.d);
      localIntent.putExtra("song", SkyjamPlaybackService.e);
      localIntent.putExtra("activity_id", SkyjamPlaybackService.g);
      localContext.startService(localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brb
 * JD-Core Version:    0.7.0.1
 */