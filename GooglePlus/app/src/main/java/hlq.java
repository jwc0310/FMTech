import android.content.Context;
import android.os.Bundle;

public final class hlq
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final int d;
  
  public hlq(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    super("SetCollexionPostPinnedStateTask");
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInt2;
  }
  
  protected final hae a(Context paramContext)
  {
    hkp localhkp = new hkp(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c, this.d);
    localhkp.a.i();
    localhkp.a.c("PinCollexionOp");
    int i = localhkp.a.o;
    Exception localException = localhkp.a.q;
    String str;
    if (localhkp.a.n())
    {
      switch (this.d)
      {
      default: 
        int n = this.d;
        throw new IllegalArgumentException(41 + "Unknown CollexionPinnedState: " + n);
      }
      for (int m = efj.Ih;; m = efj.Ix)
      {
        str = paramContext.getString(m);
        hae localhae = new hae(i, localException, str);
        localhae.a().putInt("clx_pinned_state", this.d);
        return localhae;
      }
    }
    switch (this.d)
    {
    default: 
      int k = this.d;
      throw new IllegalArgumentException(41 + "Unknown CollexionPinnedState: " + k);
    }
    for (int j = efj.Ij;; j = efj.Ik)
    {
      str = paramContext.getString(j);
      break;
    }
  }
  
  public final String b(Context paramContext)
  {
    switch (this.d)
    {
    default: 
      int j = this.d;
      throw new IllegalArgumentException(41 + "Unknown CollexionPinnedState: " + j);
    }
    for (int i = efj.Ii;; i = efj.Iy) {
      return paramContext.getString(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlq
 * JD-Core Version:    0.7.0.1
 */