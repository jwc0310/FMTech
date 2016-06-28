import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public final class lhy
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final int d;
  private final gxx l;
  private final Context m;
  
  public lhy(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    super(paramContext, "EditModerationStateTask");
    this.m = paramContext;
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInt2;
    this.l = ((gxx)mbb.a(paramContext, gxx.class));
  }
  
  protected final hae a()
  {
    lhx locallhx = new lhx(g(), new kcg(g(), this.a), this.b, this.c, this.d);
    locallhx.i();
    int i;
    Exception localException;
    int j;
    if (!locallhx.n())
    {
      if (this.d == 2) {
        lmp.a(g(), this.a, this.c);
      }
    }
    else
    {
      i = locallhx.o;
      localException = locallhx.q;
      if (!locallhx.n()) {
        break label219;
      }
      switch (this.d)
      {
      default: 
        j = efj.Yy;
      }
    }
    label121:
    for (String str = g().getString(j);; str = null)
    {
      hae localhae = new hae(i, localException, str);
      localhae.a().putString("activity_id", this.c);
      localhae.a().putInt("moderation_state", this.d);
      return localhae;
      if (this.d != 1) {
        break;
      }
      lmp.c(g(), this.a, this.c, false);
      break;
      j = efj.YB;
      break label121;
      j = efj.YA;
      break label121;
    }
  }
  
  protected final void a_(hae paramhae)
  {
    switch (this.d)
    {
    default: 
      return;
    }
    for (gxz localgxz = gxz.ac;; localgxz = gxz.ac)
    {
      Bundle localBundle = gxy.a("extra_activity_id", this.c);
      if (!TextUtils.isEmpty(this.b)) {
        localBundle.putString("extra_square_id", this.b);
      }
      gxx localgxx = this.l;
      gxw localgxw = new gxw(this.m, this.a);
      localgxw.c = localgxz;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      return;
    }
  }
  
  public final String b()
  {
    return g().getString(efj.Yz);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhy
 * JD-Core Version:    0.7.0.1
 */