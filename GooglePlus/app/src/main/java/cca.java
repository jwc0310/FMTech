import com.google.android.apps.plus.service.EsService;

final class cca
  implements Runnable
{
  cca(cbs paramcbs) {}
  
  public final void run()
  {
    if (this.a.s)
    {
      cbs localcbs = this.a;
      localcbs.ad = false;
      localcbs.ag = Integer.valueOf(EsService.a(localcbs.f(), localcbs.a.c(), localcbs.b, localcbs.ae, localcbs.af, null, localcbs.ab, localcbs.ad));
      localcbs.v();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cca
 * JD-Core Version:    0.7.0.1
 */