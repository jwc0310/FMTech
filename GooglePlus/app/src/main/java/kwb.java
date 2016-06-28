import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.social.socialcast.impl.CastService;

public final class kwb
  extends aap
{
  public kwb(CastService paramCastService) {}
  
  public final void a(aao paramaao, aay paramaay)
  {
    if ((this.a.C == null) && (this.a.F != null) && (paramaay.c.equals(this.a.F)))
    {
      this.a.a(paramaay);
      this.a.d();
    }
  }
  
  public final void c(aao paramaao, aay paramaay)
  {
    if (Log.isLoggable("CastService", 3))
    {
      String str = String.valueOf(paramaay);
      new StringBuilder(17 + String.valueOf(str).length()).append("onRouteSelected: ").append(str);
    }
    if (paramaay.c.equals(this.a.F)) {
      return;
    }
    this.a.d();
    this.a.startService(new Intent(this.a, CastService.class));
  }
  
  public final void d(aao paramaao, aay paramaay)
  {
    if (Log.isLoggable("CastService", 3))
    {
      String str = String.valueOf(paramaay);
      new StringBuilder(19 + String.valueOf(str).length()).append("onRouteUnselected: ").append(str);
    }
    CastService.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwb
 * JD-Core Version:    0.7.0.1
 */