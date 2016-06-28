import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

final class hwb
  implements gzi, ica, mbo, mfd
{
  Activity a;
  gzj b;
  private ibw c;
  
  public final void a()
  {
    int i;
    if (!hvu.b(this.a)) {
      i = 1;
    }
    while (i != 0)
    {
      Activity localActivity = this.a;
      ConnectivityManager localConnectivityManager = (ConnectivityManager)localActivity.getSystemService("connectivity");
      if (!efj.J(localActivity))
      {
        b();
        return;
        i = 0;
      }
      else
      {
        if (iv.a.a(localConnectivityManager))
        {
          hwc localhwc = new hwc(this);
          AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
          localBuilder.setMessage(efj.Lm);
          localBuilder.setCancelable(false);
          localBuilder.setPositiveButton(efj.Ll, localhwc);
          localBuilder.setNegativeButton(efj.Lq, localhwc);
          localBuilder.create().show();
          return;
        }
        this.b.c(new hwd(this.a, "DownloadResourcesTask"));
        return;
      }
    }
    b();
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.a = paramActivity;
    this.c = paramibw;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((gzj)parammbb.a(gzj.class));
    this.b.a.add(this);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (TextUtils.equals(paramString, "DownloadResourcesTask")) {
      b();
    }
  }
  
  final void b()
  {
    Intent localIntent = this.a.getIntent();
    localIntent.setClassName(this.a, hwg.b);
    this.c.a(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwb
 * JD-Core Version:    0.7.0.1
 */