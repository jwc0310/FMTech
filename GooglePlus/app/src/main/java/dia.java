import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

final class dia
{
  private static final Uri a = Uri.parse("market://details?id=com.google.android.apps.vega");
  private final bp b;
  
  dia(bp parambp)
  {
    this.b = parambp;
  }
  
  final void a()
  {
    Intent localIntent1 = this.b.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.vega");
    Bundle localBundle = ((gvj)mbb.a(this.b, gvj.class)).a();
    if (localIntent1 != null)
    {
      ay.a(this.b, localIntent1, localBundle);
      return;
    }
    Intent localIntent2 = new Intent("android.intent.action.VIEW");
    localIntent2.setData(a);
    ay.a(this.b, localIntent2, localBundle);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dia
 * JD-Core Version:    0.7.0.1
 */