import android.content.Context;
import android.os.Bundle;
import java.util.Set;

public final class bez
  implements mbo, mew, mez, mfd
{
  private final bfg a;
  private final aip b;
  private bfd c;
  
  public bez(bk parambk, mek parammek, aip paramaip, bfg parambfg)
  {
    this.b = paramaip;
    this.a = parambfg;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((bfd)parammbb.a(bfd.class));
    bfd localbfd = this.c;
    aip localaip = this.b;
    localbfd.d.add(localaip);
  }
  
  public final void b()
  {
    this.c.a(this.b, this.a);
  }
  
  public final void c()
  {
    this.c.b(this.b, this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bez
 * JD-Core Version:    0.7.0.1
 */