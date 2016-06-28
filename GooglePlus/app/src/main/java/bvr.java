import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public final class bvr
  implements bvn, mdp, mfd
{
  static final gxq a = new gxq(pkh.r);
  static final gxq b = new gxq(pkh.s);
  private static final Uri d = Uri.parse("android-app://com.google.android.apps.plus/https/plus.url.google.com/mobileapp");
  Activity c;
  private bvo e;
  private boolean f;
  
  bvr(mek parammek, Activity paramActivity, bvo parambvo)
  {
    this.c = paramActivity;
    this.e = parambvo;
    parammek.a(this);
  }
  
  public final boolean a()
  {
    return this.f;
  }
  
  public final boolean a(String paramString, int paramInt, Uri paramUri)
  {
    if (!this.f) {
      return false;
    }
    ih localih = this.e.a(this.c, new bvu(this));
    Resources localResources = this.c.getResources();
    localih.a(true).a(localResources.getColor(efj.zF)).a(BitmapFactory.decodeResource(localResources, aaw.mU)).a(this.c, efj.zE, efj.zD);
    Bitmap localBitmap;
    String str1;
    Activity localActivity;
    Intent localIntent1;
    koo localkoo;
    pye localpye;
    if (paramString != null)
    {
      localBitmap = BitmapFactory.decodeResource(localResources, aaw.mV);
      str1 = localResources.getString(efj.zG);
      localActivity = this.c;
      String str2 = paramUri.toString();
      localIntent1 = efj.k(this.c, paramInt);
      localIntent1.setAction("com.google.android.apps.plus.GOOGLE_PLUS_SHARE");
      localIntent1.putExtra("com.google.android.apps.plus.CONTENT_URL", str2);
      if (!((hyi)mbb.a(this.c, hyi.class)).b(kmj.f, paramInt)) {
        break label432;
      }
      localkoo = new koo(this.c);
      gxr localgxr = new gxr();
      gxq localgxq = a;
      localgxr.b.add(localgxq);
      localkoo.a.putExtra(gxr.a, localgxr);
      localkoo.a.putExtra("ReshareChooserActivityPeer-RESHARE", localIntent1);
      localpye = (pye)((pyg)koz.g.l()).a(paramInt).e(str2).g(paramString).c(false).e();
      if (!localpye.ao_()) {
        throw new pzr();
      }
    }
    label432:
    for (Intent localIntent2 = localkoo.a((koz)localpye).a;; localIntent2 = localIntent1)
    {
      localih.a(localBitmap, str1, PendingIntent.getActivity(localActivity, 0, localIntent2, 134217728));
      efj localefj = localih.a();
      localefj.abh.setPackage(this.e.a());
      Bundle localBundle = new Bundle();
      localBundle.putString("Referer", "http://plus.url.google.com/mobileapp");
      localefj.abh.putExtra("com.android.browser.headers", localBundle);
      localefj.abh.putExtra("android.intent.extra.REFERRER", d);
      localefj.abh.putExtra("com.android.browser.application_id", this.c.getPackageName());
      localefj.a(this.c, paramUri);
      return true;
    }
  }
  
  public final void b_(Bundle paramBundle)
  {
    int i;
    boolean bool2;
    if (this.e.a() != null)
    {
      i = ((git)mbb.a(this.c, git.class)).c();
      if (i == -1)
      {
        bool2 = false;
        if (!bool2) {
          break label78;
        }
      }
    }
    label78:
    for (boolean bool1 = true;; bool1 = false)
    {
      this.f = bool1;
      return;
      bool2 = ((hyi)mbb.a(this.c, hyi.class)).b(bvw.a, i);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvr
 * JD-Core Version:    0.7.0.1
 */