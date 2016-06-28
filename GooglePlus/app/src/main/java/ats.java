import android.content.Context;
import android.os.Bundle;

public final class ats
  implements jer<atu>, mbo, mew, mez, mfd
{
  private final bk a;
  private final att b;
  private atu c;
  private gxx d;
  private Context e;
  
  public ats(bk parambk, mek parammek, att paramatt)
  {
    this.a = parambk;
    this.b = paramatt;
    parammek.a(this);
  }
  
  private final void a(gxz paramgxz)
  {
    int i = this.a.m.getInt("account_id", -1);
    if (i == -1) {
      return;
    }
    gxx localgxx = this.d;
    gxw localgxw = new gxw(this.e, i);
    localgxw.c = paramgxz;
    localgxx.a(localgxw);
  }
  
  public final void a(int paramInt)
  {
    boolean bool1 = this.c.c();
    this.c.a(paramInt);
    boolean bool2 = this.c.c();
    if ((!bool1) && (bool2)) {
      a(gxz.dr);
    }
    for (;;)
    {
      this.b.d();
      return;
      if ((bool1) && (!bool2)) {
        a(gxz.ds);
      }
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = paramContext;
    this.c = ((atu)parammbb.a(atu.class));
    this.d = ((gxx)parammbb.a(gxx.class));
  }
  
  public final void b()
  {
    this.c.a.a(this, false);
  }
  
  public final void c()
  {
    this.c.a.a(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ats
 * JD-Core Version:    0.7.0.1
 */