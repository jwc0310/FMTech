import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Map;

public final class aoc
  implements gzi, mbo, mew, mez, mfd
{
  private final bp a;
  private final boolean b;
  private aud c;
  private gzj d;
  private git e;
  private Context f;
  
  public aoc(Activity paramActivity, mek parammek, boolean paramBoolean)
  {
    this.a = ((bp)paramActivity);
    this.b = paramBoolean;
    parammek.a(this);
  }
  
  public final void a()
  {
    int i = 1;
    isq localisq = this.c.b;
    int j;
    label30:
    int i1;
    if (localisq.f > 0)
    {
      j = i;
      if ((j == 0) || (!localisq.b())) {
        break label159;
      }
      if (!this.b) {
        break label184;
      }
      if (i == 0) {
        break label164;
      }
      i1 = efj.xZ;
    }
    gxz localgxz;
    int m;
    ArrayList localArrayList2;
    for (;;)
    {
      localgxz = gxz.dS;
      m = i1;
      gxx localgxx = (gxx)mbb.a(this.a, gxx.class);
      gxw localgxw = new gxw(this.f);
      localgxw.c = localgxz;
      localgxx.a(localgxw);
      ArrayList localArrayList1 = localisq.a(bvj.class);
      localArrayList2 = new ArrayList();
      for (int n = -1 + localArrayList1.size(); n >= 0; n--) {
        localArrayList2.add(((bvj)localArrayList1.get(n)).a);
      }
      j = 0;
      break;
      label159:
      i = 0;
      break label30;
      label164:
      if (j != 0) {
        i1 = efj.yb;
      } else {
        i1 = efj.ya;
      }
    }
    label184:
    int k;
    if (i != 0) {
      k = efj.xI;
    }
    for (;;)
    {
      localgxz = gxz.dU;
      m = k;
      break;
      if (j != 0) {
        k = efj.xO;
      } else {
        k = efj.xL;
      }
    }
    boc localboc = new boc(this.a, this.e.c(), localArrayList2, this.b);
    String str = this.a.getResources().getQuantityString(m, localArrayList2.size());
    new hai(this.a, this.a.b.a.d).a(str, null, localboc.f, false);
    this.d.b(localboc);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.f = paramContext;
    this.c = ((aud)parammbb.a(aud.class));
    this.d = ((gzj)parammbb.a(gzj.class));
    this.e = ((git)parammbb.a(git.class));
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (paramString == null) || (this.a.isFinishing())) {}
    boolean bool1;
    boolean bool2;
    do
    {
      do
      {
        return;
        bool1 = hae.a(paramhae);
      } while (!TextUtils.equals(paramString, "RemovePhotosFromTrashTask"));
      bool2 = paramhae.a().getBoolean("restore");
    } while (this.b != bool2);
    if (bool1)
    {
      bp localbp = this.a;
      if (bool2) {}
      for (int i = aau.sB;; i = aau.mE)
      {
        Toast.makeText(localbp, i, 0).show();
        return;
      }
    }
    aud localaud = this.c;
    isq localisq = localaud.b;
    localisq.a.clear();
    localisq.b = 0;
    localisq.c = 0;
    localisq.d = 0;
    localisq.g = 0;
    localisq.h = 0;
    localisq.e = 0;
    localisq.i = 0;
    localisq.j = 0;
    localisq.k = 0;
    localaud.c();
  }
  
  public final void b()
  {
    this.d.a.add(this);
  }
  
  public final void c()
  {
    this.d.a.remove(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aoc
 * JD-Core Version:    0.7.0.1
 */