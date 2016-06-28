import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

final class hwy
  implements luu
{
  hwy(bw parambw, Context paramContext) {}
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle, String paramString)
  {
    hwx.a = false;
    bk localbk = this.a.a("app_upgrade");
    String str1 = String.valueOf(this.b.getApplicationContext().getPackageName());
    if (str1.length() != 0) {}
    for (String str2 = "market://details?id=".concat(str1);; str2 = new String("market://details?id="))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
      localIntent.addFlags(268435456);
      localbk.a(localIntent);
      return;
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void c(Bundle paramBundle, String paramString)
  {
    hwx.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwy
 * JD-Core Version:    0.7.0.1
 */