import android.os.Bundle;
import com.google.android.apps.plus.service.EsService;
import java.util.HashSet;
import java.util.Map;

public final class bca
  extends bch
{
  private bcd Z = new bcd(this);
  Integer a;
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("refresh_request_id"))) {
      this.a = Integer.valueOf(paramBundle.getInt("refresh_request_id"));
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.a != null) {
      paramBundle.putInt("refresh_request_id", this.a.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.Z);
    if (this.a != null)
    {
      int i = this.a.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        this.m.getInt("account_id", -1);
        dmx localdmx = EsService.a(this.a.intValue());
        this.Z.f(this.a.intValue(), localdmx);
      }
    }
  }
  
  public final void n()
  {
    super.n();
    bcd localbcd = this.Z;
    EsService.d.remove(localbcd);
  }
  
  public final boolean v()
  {
    k().b(0, this.m, new bcc(this));
    return true;
  }
  
  protected final void w()
  {
    super.w();
    int i = this.m.getInt("account_id", -1);
    this.a = Integer.valueOf(EsService.a(f(), i, this.b.b.j(), this.b.b.o()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bca
 * JD-Core Version:    0.7.0.1
 */