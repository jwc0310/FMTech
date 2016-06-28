import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

final class egb
  extends egq
{
  egb(ega paramega, egu paramegu, efw paramefw, ResolveAccountResponse paramResolveAccountResponse)
  {
    super(paramegu);
  }
  
  public final void a()
  {
    efw localefw = this.b;
    ResolveAccountResponse localResolveAccountResponse = this.c;
    ConnectionResult localConnectionResult;
    if (localefw.b(0))
    {
      localConnectionResult = localResolveAccountResponse.c;
      int i = localConnectionResult.c;
      int j = 0;
      if (i == 0) {
        j = 1;
      }
      if (j != 0)
      {
        localefw.g = eht.a(localResolveAccountResponse.b);
        localefw.f = true;
        localefw.h = localResolveAccountResponse.d;
        localefw.i = localResolveAccountResponse.e;
        localefw.f();
      }
    }
    else
    {
      return;
    }
    if (localefw.a(localConnectionResult))
    {
      localefw.i();
      localefw.f();
      return;
    }
    localefw.b(localConnectionResult);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egb
 * JD-Core Version:    0.7.0.1
 */