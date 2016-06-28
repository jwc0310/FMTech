import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class lbh
  extends gzf
{
  private final qxt a;
  private final kcg b;
  private final String c;
  private final int d;
  
  public lbh(Context paramContext, int paramInt1, String paramString, qxt paramqxt, int paramInt2)
  {
    super("EditSquareStreamTask");
    this.c = paramString;
    this.a = paramqxt;
    this.d = paramInt2;
    this.b = new kch().a(paramContext, paramInt1).a();
  }
  
  protected final hae a(Context paramContext)
  {
    lbg locallbg = new lbg(paramContext, this.b, this.c, this.a, this.d);
    locallbg.a.i();
    locallbg.a.c("EditSquareCategoryOp");
    if (locallbg.a.n())
    {
      int i = locallbg.a.o;
      Exception localException = locallbg.a.q;
      boolean bool = locallbg.a.n();
      Resources localResources = paramContext.getResources();
      if (bool) {}
      for (String str = localResources.getString(ev.u);; str = null) {
        return new hae(i, localException, str);
      }
    }
    hae localhae = new hae(locallbg.a.o, locallbg.a.q, null);
    if (this.d == 0) {
      localhae.a().putString("stream_id", ((qyb)locallbg.b.a(qyb.a)).b.a);
    }
    return localhae;
  }
  
  public final String b(Context paramContext)
  {
    switch (this.d)
    {
    default: 
      return super.b(paramContext);
    case 2: 
      return paramContext.getString(ev.n);
    case 1: 
      return paramContext.getString(ev.o);
    }
    return paramContext.getString(ev.m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbh
 * JD-Core Version:    0.7.0.1
 */