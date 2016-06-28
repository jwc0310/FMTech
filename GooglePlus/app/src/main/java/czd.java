import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.List;

public final class czd
  implements hen
{
  private final Context a;
  private final bk b;
  private final ill c;
  private final int d;
  private final boolean e;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  
  public czd(Context paramContext, bk parambk)
  {
    this.a = paramContext;
    this.b = parambk;
    this.d = ((git)mbb.a(paramContext, git.class)).c();
    ill localill = new ill(paramContext, this.d);
    localill.a.add(ine.class);
    this.c = localill;
    this.e = ((hyi)mbb.a(paramContext, hyi.class)).b(kmj.f, this.d);
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfByte, String paramString3, String paramString4, Bundle paramBundle, View paramView)
  {
    giz localgiz = (giz)mbb.a(this.a, giz.class);
    int i;
    boolean bool;
    label68:
    Intent localIntent1;
    gxr localgxr;
    if ((this.d != -1) && (TextUtils.equals(localgiz.a(this.d).b("gaia_id"), paramString2)))
    {
      i = 1;
      this.h = paramBoolean2;
      if ((!paramBoolean1) || (i != 0)) {
        break label339;
      }
      bool = true;
      this.f = bool;
      this.g = this.f;
      dgs localdgs1 = new dgs(this.a);
      int j = this.d;
      localdgs1.a.putExtra("account_id", j);
      localdgs1.a.putExtra("activity_id", paramString1);
      dgs localdgs2 = localdgs1.b(this.g).a(this.h);
      localdgs2.a.putExtra("promoted_post_data", paramArrayOfByte);
      localdgs2.a.putExtra("auto_post", false);
      localdgs2.a.putExtra("disable_location", true);
      localIntent1 = localdgs2.a;
      if (!this.e) {
        break label560;
      }
      localgxr = new gxr();
      if (paramView == null) {
        break label345;
      }
      localgxr.a(paramView);
    }
    koo localkoo;
    pye localpye;
    for (;;)
    {
      localkoo = new koo(this.a);
      localkoo.a.putExtra("ReshareChooserActivityPeer-RESHARE", localIntent1);
      localkoo.a.putExtra(gxr.a, localgxr);
      localpye = (pye)((pyg)koz.g.l()).a(this.d).e(paramString3).f(paramString4).g(paramString1).b(this.g).d(paramBoolean1).a(this.h).c(false).e();
      if (localpye.ao_()) {
        break label358;
      }
      throw new pzr();
      i = 0;
      break;
      label339:
      bool = false;
      break label68;
      label345:
      localgxr.a(this.a);
    }
    label358:
    for (Intent localIntent2 = localkoo.a((koz)localpye).a;; localIntent2 = localIntent1)
    {
      if (this.f)
      {
        Bundle localBundle = gxy.a("extra_activity_id", paramString1);
        gxx localgxx = (gxx)mbb.a(this.a, gxx.class);
        gxw localgxw = new gxw(this.a, this.d);
        localgxw.c = gxz.W;
        if (localBundle != null) {
          localgxw.h.putAll(localBundle);
        }
        localgxx.a(localgxw);
        byy.a(this.a.getString(aau.sz), this.a.getString(aau.sx), this.a.getString(aau.sy), localIntent2, paramBundle).a(this.b.x, "reshare_activity");
        return;
      }
      if (!this.c.a())
      {
        this.a.startActivity(this.c.b());
        return;
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        this.a.startActivity(localIntent2, paramBundle);
        return;
      }
      this.a.startActivity(localIntent2);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czd
 * JD-Core Version:    0.7.0.1
 */