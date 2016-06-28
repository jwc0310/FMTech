import android.content.Context;
import android.os.Bundle;
import java.util.EnumMap;

public final class bda
  extends bcw
{
  public String a;
  public int b;
  public int c;
  
  public final bcp a()
  {
    this.v = true;
    this.w = true;
    this.x = true;
    this.y = false;
    ipf localipf = (ipf)this.f.get(bcx.a);
    if ((localipf != null) && (mfq.b(localipf.d))) {}
    for (long l = 26306674688L;; l = 17716740096L)
    {
      this.A = l;
      return new bcy(this);
    }
  }
  
  public final bcw a(Context paramContext, Bundle paramBundle)
  {
    super.a(paramContext, paramBundle);
    this.a = paramBundle.getString("selection_cluster_id");
    return this;
  }
  
  public final bcw a(bcp parambcp)
  {
    super.a(parambcp);
    if ((parambcp instanceof bcy))
    {
      bcy localbcy = (bcy)parambcp;
      this.a = localbcy.a;
      this.b = localbcy.b;
      this.c = localbcy.c;
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bda
 * JD-Core Version:    0.7.0.1
 */