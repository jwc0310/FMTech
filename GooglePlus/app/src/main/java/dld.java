import com.google.android.apps.plus.service.EsService;
import java.util.Map;

public final class dld
  implements Runnable
{
  public dld(EsService paramEsService) {}
  
  public final void run()
  {
    if (EsService.b.size() == 0) {
      this.a.stopSelf();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dld
 * JD-Core Version:    0.7.0.1
 */