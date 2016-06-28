import android.content.Context;
import android.os.Bundle;

public final class lap
  extends gzf
{
  private final String a;
  private final int b;
  private final int c;
  private final kcg d;
  
  public lap(Context paramContext, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    super("CreateSquareTask");
    this.a = paramString;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = new kch().a(paramContext, paramInt1).a();
  }
  
  protected final hae a(Context paramContext)
  {
    lan locallan = new lan(paramContext, this.d, this.a, this.b, this.c);
    locallan.a.i();
    locallan.a.c("CreateSquareOp");
    int i = locallan.a.o;
    Exception localException = locallan.a.q;
    String str;
    hae localhae;
    Bundle localBundle;
    if (locallan.a.n())
    {
      str = paramContext.getString(efj.WF);
      localhae = new hae(i, localException, str);
      if (!locallan.a.n())
      {
        localBundle = localhae.a();
        if (locallan.a.n()) {
          break label160;
        }
      }
    }
    label160:
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Response contains error.");
      localBundle.putString("square_id", ((qxj)locallan.a.a(qxj.a)).b);
      return localhae;
      str = null;
      break;
    }
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.WG);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lap
 * JD-Core Version:    0.7.0.1
 */