import android.os.Bundle;
import com.google.android.apps.plus.service.EsService;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ayk
  extends mca
{
  private static final bfc c = new bfc(aaw.fg);
  private final ayn Z = new ayn(this);
  bdk a;
  Integer b;
  private bfd d;
  
  public ayk()
  {
    new bez(this, this.bp, c, new aym(this));
    new jeq(this.bp, new ayl(this), '\000');
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = ((bfd)this.bo.a(bfd.class));
    this.a = ((bdk)this.bo.a(bdk.class));
    bfd localbfd = this.d;
    bfc localbfc = c;
    localbfd.d.add(localbfc);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.Z);
    if (this.b != null)
    {
      int i = this.b.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.b.intValue());
        this.Z.a(this.b.intValue(), localdmx);
      }
    }
    v();
  }
  
  public final void n()
  {
    super.n();
    ayn localayn = this.Z;
    EsService.d.remove(localayn);
  }
  
  final void v()
  {
    this.d.a(c, this.a.b.v());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayk
 * JD-Core Version:    0.7.0.1
 */