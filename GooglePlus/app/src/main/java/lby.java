import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;

public final class lby
  extends gzf
{
  int a;
  private final odp b;
  private final Context c;
  private final kcg d;
  private final int l;
  private final String m;
  private final kyn n;
  
  public lby(Context paramContext, int paramInt, String paramString, odp paramodp)
  {
    super("EditSquareTask");
    this.m = paramString;
    this.l = paramInt;
    this.c = paramContext;
    this.d = new kch().a(paramContext, this.l).a();
    this.b = paramodp;
    this.n = ((kyn)mbb.a(paramContext, kyn.class));
    this.a = -1;
  }
  
  private final String a(boolean paramBoolean)
  {
    Resources localResources = this.c.getResources();
    if (paramBoolean) {
      return localResources.getString(ev.d);
    }
    return null;
  }
  
  private final void a(Context paramContext, kbu paramkbu)
  {
    kzk localkzk = new kzk(paramContext, this.d, this.m);
    paramkbu.a(localkzk);
    if (!localkzk.n()) {}
    try
    {
      kyn localkyn = this.n;
      int i = this.l;
      if (localkzk.x) {}
      for (qat localqat = localkzk.w;; localqat = null)
      {
        localkyn.a(i, new kyf(((mvm)localqat).a.a));
        return;
      }
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("EditSquareTaskLog", localIOException.getMessage());
    }
  }
  
  private final void f(Context paramContext)
  {
    kzf localkzf = new kzf(paramContext, this.d, this.m);
    localkzf.a();
    kyf localkyf = localkzf.b();
    if (!localkzf.a.n()) {}
    try
    {
      this.n.a(this.l, localkyf);
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("EditSquareTaskLog", localIOException.getMessage());
    }
  }
  
  protected final hae a(Context paramContext)
  {
    int i = 0;
    if (kyo.a(paramContext, this.l))
    {
      int k;
      lbr locallbr;
      odr localodr;
      qxs localqxs;
      switch (this.a)
      {
      default: 
        k = 0;
        locallbr = new lbr(this.c, this.d, this.m);
        String str2 = this.b.a;
        if (str2 != null) {
          locallbr.b.c = str2;
        }
        String str3 = this.b.b;
        if (str3 != null) {
          locallbr.b.d = str3;
        }
        String str4 = this.b.e;
        if (str4 != null) {
          locallbr.b.e = str4;
        }
        if (k != 0) {
          locallbr.b.f = k;
        }
        localodr = this.b.f;
        if (localodr == null) {
          localqxs = null;
        }
        break;
      }
      for (;;)
      {
        if (localqxs != null) {
          locallbr.b.g = localqxs;
        }
        locallbr.a.i();
        locallbr.a.c("EditSquareOperation");
        if (!locallbr.a.n()) {
          break label383;
        }
        return new hae(locallbr.a.o, locallbr.a.q, a(locallbr.a.n()));
        k = 1;
        break;
        k = 4;
        break;
        k = 2;
        break;
        localqxs = new qxs();
        localqxs.a = new qxr[localodr.a.length];
        while (i < localodr.a.length)
        {
          localqxs.a[i] = new qxr();
          localqxs.a[i].a = localodr.a[i].a;
          localqxs.a[i].b = localodr.a[i].b;
          localqxs.a[i].c = localodr.a[i].c;
          i++;
        }
      }
      label383:
      f(paramContext);
      return new hae(locallbr.a.o, locallbr.a.q, null);
    }
    kbu localkbu = (kbu)mbb.a(this.c, kbu.class);
    lbs locallbs = new lbs(paramContext, this.d, this.m, this.b);
    if (this.a != -1)
    {
      lbn locallbn = new lbn(paramContext, this.d, this.m, this.a);
      kcp localkcp = kdg.a(this.c, this.d);
      localkcp.a(locallbs);
      localkcp.a(locallbn);
      localkbu.a(localkcp);
      if (locallbs.n()) {
        return new hae(locallbs.o, locallbs.q, a(locallbs.n()));
      }
      if (locallbn.n())
      {
        int j = locallbs.o;
        Exception localException = locallbs.q;
        if (locallbs.n()) {}
        for (String str1 = paramContext.getString(ev.d);; str1 = null) {
          return new hae(j, localException, str1);
        }
      }
    }
    else
    {
      localkbu.a(locallbs);
      if (locallbs.n()) {
        return new hae(locallbs.o, locallbs.q, a(locallbs.n()));
      }
    }
    a(paramContext, localkbu);
    return new hae(locallbs.o, locallbs.q, null);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getResources().getString(ev.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lby
 * JD-Core Version:    0.7.0.1
 */