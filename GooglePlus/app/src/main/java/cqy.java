import com.google.android.apps.plus.service.EsService;
import java.util.concurrent.ConcurrentHashMap;

final class cqy
  implements Runnable
{
  cqy(cqv paramcqv) {}
  
  public final void run()
  {
    if (!this.a.a(brl.g))
    {
      cqv localcqv = this.a;
      brl localbrl = brl.g;
      Integer localInteger = EsService.a(this.a.bn, this.a.aa.c(), 2, 4, null, false);
      if (localInteger != null) {
        localcqv.ac.put(localbrl, localInteger);
      }
      this.a.x();
      EsService.a(this.a.bn, this.a.aa.c());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqy
 * JD-Core Version:    0.7.0.1
 */