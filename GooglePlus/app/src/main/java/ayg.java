import android.os.Bundle;
import com.google.android.apps.plus.service.EsService;
import java.util.HashSet;
import java.util.Map;

public class ayg
  extends mca
{
  private final ayj Z = new ayj(this);
  beu a;
  bfd b;
  bdk c;
  Integer d;
  
  public ayg()
  {
    new bez(this, this.bp, bfi.b, new ayh(this));
    new jeq(this.bp, new ayi(this), '\000');
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle == null) {}
    while (!paramBundle.containsKey("plusone_request_id")) {
      return;
    }
    this.d = Integer.valueOf(paramBundle.getInt("plusone_request_id"));
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((beu)this.bo.a(beu.class));
    this.b = ((bfd)this.bo.a(bfd.class));
    this.c = ((bdk)this.bo.a(bdk.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.d != null) {
      paramBundle.putInt("plusone_request_id", this.d.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.Z);
    if (this.d != null)
    {
      int i = this.d.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        EsService.a(this.d.intValue());
        this.d = null;
      }
    }
  }
  
  public final void n()
  {
    super.n();
    ayj localayj = this.Z;
    EsService.d.remove(localayj);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayg
 * JD-Core Version:    0.7.0.1
 */