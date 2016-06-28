import com.google.android.apps.plus.service.EsService;

final class ccb
  implements Runnable
{
  ccb(cbs paramcbs, gnb paramgnb) {}
  
  public final void run()
  {
    cbs localcbs = this.b;
    gnb localgnb = this.a;
    if ((localcbs.f() == null) || (localcbs.b == null)) {
      return;
    }
    localcbs.d(aau.gw);
    bp localbp = localcbs.f();
    int i = localcbs.a.c();
    String str1 = localcbs.b;
    String str2 = localcbs.ab;
    if (localcbs.d != null) {}
    for (String str3 = localcbs.d.c();; str3 = null)
    {
      localcbs.ah = Integer.valueOf(EsService.a(localbp, i, str1, str2, str3, localgnb));
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccb
 * JD-Core Version:    0.7.0.1
 */