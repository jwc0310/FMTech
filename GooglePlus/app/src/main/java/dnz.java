import android.content.Intent;
import com.google.android.apps.plus.service.EsService;

final class dnz
  implements kex
{
  dnz(dny paramdny) {}
  
  public final boolean a(ket paramket, Object paramObject)
  {
    boolean bool = ((Boolean)paramObject).booleanValue();
    int i = this.a.a.c();
    bgp.e(this.a.bn, i, bool);
    mbf localmbf = this.a.bn;
    Intent localIntent = EsService.e.a(localmbf, EsService.class);
    localIntent.putExtra("op", 2400);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("timestamp", -1L);
    EsService.a(localmbf, localIntent);
    efj.a(this.a.bn, i, bool, gya.n);
    if (bool) {
      EsService.f(this.a.bn, i);
    }
    for (;;)
    {
      return true;
      EsService.e(this.a.bn, i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnz
 * JD-Core Version:    0.7.0.1
 */