import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

final class egr
  extends BroadcastReceiver
{
  private WeakReference<egl> a;
  
  egr(egl paramegl)
  {
    this.a = new WeakReference(paramegl);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    Uri localUri = paramIntent.getData();
    String str = null;
    if (localUri != null) {
      str = localUri.getSchemeSpecificPart();
    }
    if ((str == null) || (!str.equals("com.google.android.gms"))) {}
    egl localegl;
    do
    {
      return;
      localegl = (egl)this.a.get();
    } while (localegl == null);
    egl.a(localegl);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egr
 * JD-Core Version:    0.7.0.1
 */