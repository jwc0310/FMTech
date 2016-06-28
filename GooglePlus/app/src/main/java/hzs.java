import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

final class hzs
  implements fsf
{
  hzs(Activity paramActivity, hzw paramhzw, fsc paramfsc, String paramString) {}
  
  public final void a()
  {
    Bundle localBundle = new Bundle();
    try
    {
      i = this.a.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
      localBundle.putString("GmsVersion", String.valueOf(i));
      if (this.b != hzw.a) {
        localBundle.putString("Subproduct", this.b.toString());
      }
      fti localfti = ((ftj)mbb.a(this.a, ftj.class)).a(this.c);
      localObject1 = localfti.a();
      git localgit = (git)mbb.b(this.a, git.class);
      if (localgit != null) {}
      try
      {
        gjb localgjb = localgit.f();
        if (!localgjb.a("logged_in", false)) {
          break label483;
        }
        String str = localgjb.a("account_name", (String)localObject1);
        localObject3 = str;
        localObject1 = localObject3;
      }
      catch (gjd localgjd)
      {
        label150:
        Activity localActivity;
        ActivityManager.MemoryInfo localMemoryInfo;
        int j;
        Object localObject2;
        ftm localftm;
        hzx localhzx;
        iaa localiaa;
        break label150;
      }
      localActivity = this.a;
      localMemoryInfo = new ActivityManager.MemoryInfo();
      ((ActivityManager)localActivity.getSystemService("activity")).getMemoryInfo(localMemoryInfo);
      j = (int)Math.min(Math.max(localMemoryInfo.availMem - localMemoryInfo.threshold, 0L) / 2L, 2621161L);
      if (j <= 0)
      {
        localObject2 = null;
        localftm = ((ftm)mbb.a(this.a, ftm.class)).a((Bitmap)localObject2).a(localBundle).a((String)localObject1).c(this.d);
        localhzx = (hzx)mbb.b(this.a, hzx.class);
        localiaa = null;
        if (localhzx != null) {
          break label460;
        }
      }
      for (;;)
      {
        if (localiaa != null)
        {
          fun localfun = new fun();
          localfun.b = localiaa.b;
          localfun.a = localiaa.a;
          localftm.a(localfun);
        }
        localfti.b(localftm.a()).a(new hzu(this.c, this.a));
        return;
        View localView = localActivity.getWindow().getDecorView().getRootView();
        float f = (float)(1.0D / Math.ceil(Math.sqrt(4 * localView.getWidth() * localView.getHeight() / j)));
        Bitmap localBitmap = Bitmap.createBitmap((int)(f * localView.getWidth()), (int)(f * localView.getHeight()), Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap);
        localCanvas.scale(f, f);
        localView.draw(localCanvas);
        localObject2 = localBitmap;
        break;
        label460:
        localiaa = localhzx.c();
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        int i = 0;
        continue;
        label483:
        Object localObject3 = localObject1;
      }
    }
  }
  
  public final void b() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzs
 * JD-Core Version:    0.7.0.1
 */