import com.google.android.apps.plus.service.EsService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

final class dga
  implements Runnable
{
  dga(dfz paramdfz) {}
  
  public final void run()
  {
    this.a.au = false;
    EsService.a(this.a.aM, this.a.ar, this.a.as.f().values());
    this.a.at.clear();
    if (!this.a.aG.isEmpty())
    {
      bol localbol = new bol(this.a.aM, this.a.ar, this.a.aG);
      gzj.a(this.a.aM, localbol);
      this.a.aG.clear();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dga
 * JD-Core Version:    0.7.0.1
 */