import com.google.android.apps.plus.service.SkyjamPlaybackService;
import java.util.ArrayList;
import java.util.Iterator;

public final class dnh
  implements Runnable
{
  public dnh(SkyjamPlaybackService paramSkyjamPlaybackService, String paramString1, boolean paramBoolean, String paramString2) {}
  
  public final void run()
  {
    Iterator localIterator = SkyjamPlaybackService.a.iterator();
    while (localIterator.hasNext()) {
      ((dni)localIterator.next()).a(this.a, this.b, this.c);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnh
 * JD-Core Version:    0.7.0.1
 */