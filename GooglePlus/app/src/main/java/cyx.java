import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;

public final class cyx
  implements heh
{
  private final Context a;
  
  public cyx(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(ipf paramipf, String paramString1, String paramString2, boolean paramBoolean)
  {
    a(paramipf, paramString1, paramString2, paramBoolean, null);
  }
  
  public final void a(ipf paramipf, String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    ipb localipb = (ipb)mbb.a(this.a, ipb.class);
    Context localContext = localipb.a.r();
    DisplayMetrics localDisplayMetrics = efj.K(localContext);
    int i;
    int j;
    if (localContext.getResources().getConfiguration().orientation == 2)
    {
      i = 1;
      if (i == 0) {
        break label299;
      }
      j = 0;
      label59:
      if (i == 0) {
        break label309;
      }
    }
    label299:
    label309:
    for (int k = localDisplayMetrics.heightPixels;; k = 0)
    {
      localipb.a(localipb.a(paramipf, 0, j, k, 3, null, null, 576));
      int m = ((git)mbb.a(this.a, git.class)).c();
      bdo localbdo = new bdo(this.a, m);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = jrf.a(null, paramString2, paramString1, "ALBUM");
      String str = jrf.a(3, arrayOfString);
      localbdo.d = Long.toString(paramipf.b.a);
      localbdo.e = str;
      localbdo.o = paramString3;
      localbdo.n = Boolean.valueOf(paramBoolean);
      localbdo.k = Boolean.valueOf(true);
      localbdo.v = Boolean.valueOf(true);
      Bundle localBundle = gxy.a("extra_gaia_id", paramString2);
      gxx localgxx = (gxx)mbb.a(this.a, gxx.class);
      gxw localgxw = new gxw(this.a, m);
      localgxw.c = gxz.aa;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      this.a.startActivity(localbdo.a());
      return;
      i = 0;
      break;
      j = localDisplayMetrics.widthPixels;
      break label59;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyx
 * JD-Core Version:    0.7.0.1
 */