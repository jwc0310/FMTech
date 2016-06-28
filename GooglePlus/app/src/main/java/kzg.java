import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class kzg
  extends gzf
{
  private final int a;
  private final String b;
  private final kcg c;
  private final kyn d;
  private final boolean l;
  
  public kzg(Context paramContext, int paramInt, String paramString)
  {
    this(paramContext, paramInt, paramString, false);
  }
  
  public kzg(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    super("GetSquareTask");
    this.a = paramInt;
    this.b = paramString;
    this.c = new kch().a(paramContext, this.a).a();
    this.d = ((kyn)mbb.a(paramContext, kyn.class));
    this.l = paramBoolean;
  }
  
  private final hae f(Context paramContext)
  {
    kzf localkzf = new kzf(paramContext, this.c, this.b);
    localkzf.a();
    kyf localkyf = localkzf.b();
    if (!localkzf.a.n()) {}
    try
    {
      this.d.a(this.a, localkyf);
      return new hae(localkzf.a.o, localkzf.a.q, null);
    }
    catch (IOException localIOException)
    {
      return new hae(0, localIOException, null);
    }
  }
  
  private final hae g(Context paramContext)
  {
    kcp localkcp = kdg.a(paramContext, this.c);
    kzk localkzk = new kzk(paramContext, this.c, this.b);
    localkcp.a(localkzk);
    kze localkze1;
    if (this.l)
    {
      localkze1 = new kze(paramContext, this.c, this.b);
      localkcp.a(localkze1);
    }
    for (kze localkze2 = localkze1;; localkze2 = null)
    {
      localkcp.i();
      Exception localException = localkzk.q;
      if (kdd.a(localException, "notFound")) {
        return new hae(localkzk.o, localException, null);
      }
      qat localqat1;
      kyf localkyf;
      qat localqat2;
      label161:
      odt localodt;
      if (!localkcp.n())
      {
        if (!localkzk.x) {
          break label218;
        }
        localqat1 = localkzk.w;
        localkyf = new kyf(((mvm)localqat1).a.a);
        if (localkze2 != null)
        {
          if (!localkze2.x) {
            break label224;
          }
          localqat2 = localkze2.w;
          localodt = ((mtq)localqat2).a.a;
          if (localodt != null) {
            break label230;
          }
          localkyf.C = null;
        }
      }
      for (;;)
      {
        try
        {
          this.d.a(this.a, localkyf);
          return new hae(localkcp.o, localkcp.q, null);
        }
        catch (IOException localIOException)
        {
          label218:
          label224:
          label230:
          int i;
          int j;
          return new hae(0, localIOException, null);
        }
        localqat1 = null;
        break;
        localqat2 = null;
        break label161;
        i = Math.min(localodt.a.d.length, 5);
        localkyf.C = new ArrayList(i);
        j = 0;
        if (j < i)
        {
          localkyf.C.add(localodt.a.d[j].b);
          j++;
        }
      }
    }
  }
  
  protected final hae a(Context paramContext)
  {
    if (kyo.a(paramContext, this.a)) {
      return f(paramContext);
    }
    return g(paramContext);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzg
 * JD-Core Version:    0.7.0.1
 */