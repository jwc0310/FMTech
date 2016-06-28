import android.content.Context;
import android.os.Bundle;

public final class mad
  extends gzf
{
  private final int a;
  private final int b;
  
  public mad(int paramInt1, int paramInt2)
  {
    super("SetUxrrPromoPrefTask");
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  protected final hae a(Context paramContext)
  {
    mac localmac = new mac(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localmac.a.i();
    localmac.a.c("SetUxrrPromoPrefOp");
    hae localhae = new hae(localmac.a.o, localmac.a.q, null);
    localhae.a().putInt("dismissed_version", this.b);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mad
 * JD-Core Version:    0.7.0.1
 */