import android.content.Context;
import android.content.Intent;

final class fdm
  implements Runnable
{
  fdm(fdl paramfdl) {}
  
  public final void run()
  {
    synchronized (fdl.a(this.a))
    {
      Intent localIntent = new Intent("com.google.android.location.places.METHOD_CALL");
      localIntent.setPackage("com.google.android.gms");
      localIntent.putStringArrayListExtra("PLACE_IDS", fdl.b(this.a));
      localIntent.putStringArrayListExtra("METHOD_NAMES", fdl.c(this.a));
      localIntent.putExtra("PACKAGE_NAME", fdl.d(this.a).getPackageName());
      localIntent.putExtra("CLIENT_VERSION", eeo.a);
      fdl.d(this.a).sendBroadcast(localIntent);
      fdl.a(this.a, null);
      fdl.b(this.a, null);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdm
 * JD-Core Version:    0.7.0.1
 */