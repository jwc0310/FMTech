import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

public final class lfp
  extends gzf
{
  public String a;
  private final int b;
  private final kcg c;
  private final String d;
  private final int l;
  private final kyn m;
  
  public lfp(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    super("EditSquareMembershipTask");
    this.b = paramInt1;
    this.d = paramString;
    this.l = paramInt2;
    this.c = new kch().a(paramContext, this.b).a();
    this.m = ((kyn)mbb.a(paramContext, kyn.class));
  }
  
  @Deprecated
  public lfp(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    super("EditSquareMembershipTask");
    this.b = paramInt1;
    this.d = paramString1;
    String str1;
    String str2;
    if ((paramString2 != null) && (!paramString2.contains(":")))
    {
      str1 = String.valueOf("g:");
      str2 = String.valueOf(paramString2);
      if (str2.length() == 0) {
        break label114;
      }
    }
    label114:
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      paramString2 = str3;
      this.a = paramString2;
      this.l = 7;
      this.c = new kch().a(paramContext, this.b).a();
      this.m = ((kyn)mbb.a(paramContext, kyn.class));
      return;
    }
  }
  
  private String a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i;
      switch (this.l)
      {
      case 11: 
      case 15: 
      case 16: 
      case 17: 
      case 18: 
      case 19: 
      default: 
        i = fa.b;
      }
      for (;;)
      {
        return paramContext.getString(i);
        i = fa.A;
        continue;
        i = fa.G;
        continue;
        i = fa.p;
        continue;
        i = fa.u;
        continue;
        i = fa.E;
        continue;
        i = fa.E;
        continue;
        i = fa.v;
        continue;
        i = fa.v;
        continue;
        i = fa.v;
        continue;
        i = fa.F;
        continue;
        i = fa.m;
        continue;
        i = fa.I;
        continue;
        i = fa.l;
        continue;
        i = fa.z;
        continue;
        i = fa.o;
        continue;
        i = fa.C;
      }
    }
    return null;
  }
  
  private final hae f(Context paramContext)
  {
    int i = 1;
    kcg localkcg = this.c;
    String str = this.d;
    lfn locallfn;
    kyf localkyf;
    switch (this.l)
    {
    case 11: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    default: 
      i = 0;
    case 1: 
    case 3: 
      locallfn = new lfn(paramContext, localkcg, str, i, efj.t(this.a));
      locallfn.a.i();
      locallfn.a.c("EditSquareMembershipOperation");
      if (!locallfn.a.n())
      {
        if (this.a != null) {
          break label444;
        }
        if (!locallfn.a.n()) {
          break label355;
        }
        localkyf = null;
        label197:
        if (localkyf == null) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        this.m.a(this.b, localkyf);
        hae localhae = new hae(locallfn.a.o, locallfn.a.q, a(paramContext, locallfn.a.n()));
        localhae.a().putString("square_id", this.d);
        return localhae;
        i = 4;
        break;
        i = 2;
        break;
        i = 3;
        break;
        i = 5;
        break;
        i = 6;
        break;
        i = 6;
        break;
        i = 7;
        break;
        i = 10;
        break;
        i = 9;
        break;
        i = 8;
        break;
        i = 3;
        break;
        i = 4;
        break;
        i = 5;
        break;
        i = 2;
        break;
        i = 11;
        break;
        label355:
        if (locallfn.b)
        {
          localkyf = new kyf(((qye)locallfn.a.a(qye.a)).b);
          break label197;
        }
        localkyf = new kyf(((qyk)locallfn.a.a(qyk.a)).b);
      }
      catch (IOException localIOException)
      {
        if (!Log.isLoggable("EditSquareMembershipTask", 6)) {
          continue;
        }
        Log.e("EditSquareMembershipTask", "Caught an IOException from EditSquareMembershipOperation.");
        continue;
      }
      label444:
      this.m.a(this.b, this.d, this.a, this.l);
    }
  }
  
  private final hae g(Context paramContext)
  {
    lfo locallfo = new lfo(paramContext, this.c, this.d, this.l);
    String str3;
    label77:
    qat localqat;
    label108:
    kyf localkyf;
    if (this.a != null)
    {
      String str1 = efj.t(this.a);
      String str2 = this.a;
      if ((str2 != null) && (str2.startsWith("t:")))
      {
        str3 = str2.substring(2);
        if (str1 == null) {
          break label232;
        }
        locallfo.a = str1;
      }
    }
    else
    {
      locallfo.i();
      if (!locallfo.n())
      {
        if (this.a != null) {
          break label252;
        }
        if (!locallfo.x) {
          break label246;
        }
        localqat = locallfo.w;
        oed localoed = ((mrq)localqat).a.a;
        localObject = null;
        if (localoed != null) {
          localkyf = new kyf(localoed);
        }
      }
    }
    try
    {
      this.m.a(this.b, localkyf);
      localObject = localkyf;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        label232:
        label246:
        label252:
        localObject = null;
      }
    }
    if (localObject == null) {
      this.m.a(this.b, this.d, this.l);
    }
    for (;;)
    {
      hae localhae = new hae(locallfo.o, locallfo.q, a(paramContext, locallfo.n()));
      localhae.a().putString("square_id", this.d);
      return localhae;
      str3 = null;
      break;
      if (str3 == null) {
        break label77;
      }
      locallfo.b = str3;
      break label77;
      localqat = null;
      break label108;
      this.m.a(this.b, this.d, this.a, this.l);
    }
  }
  
  protected final hae a(Context paramContext)
  {
    if (kyo.a(paramContext, this.b)) {
      return f(paramContext);
    }
    return g(paramContext);
  }
  
  public final String b(Context paramContext)
  {
    int i;
    switch (this.l)
    {
    default: 
      i = fa.c;
    }
    for (;;)
    {
      return paramContext.getString(i);
      i = fa.B;
      continue;
      i = fa.H;
      continue;
      i = fa.q;
      continue;
      i = fa.D;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfp
 * JD-Core Version:    0.7.0.1
 */