import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import java.util.Locale;

final class mgb
  implements mbo, mew, mez, mfc, mfd
{
  private Activity a;
  private volatile boolean b;
  private mgh c;
  
  public mgb(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((mgh)parammbb.a(mgh.class));
  }
  
  public final void aK_()
  {
    if (this.b)
    {
      this.c.a(this.a);
      this.b = false;
    }
  }
  
  public final void b()
  {
    if (!this.b)
    {
      mgh localmgh = this.c;
      Activity localActivity = this.a;
      localmgh.a("visible");
      if (!localmgh.c)
      {
        localmgh.a = (1 + localmgh.a);
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(localmgh.a);
        localmgh.b(String.format(localLocale, "count=%d", arrayOfObject));
        localmgh.b(localActivity);
      }
      localmgh.c = localmgh.a();
      localmgh.b();
      this.b = true;
    }
  }
  
  public final void c()
  {
    if (this.b)
    {
      PowerManager localPowerManager = (PowerManager)this.a.getSystemService("power");
      if (((Build.VERSION.SDK_INT < 20) || (localPowerManager.isInteractive())) && ((Build.VERSION.SDK_INT >= 20) || (localPowerManager.isScreenOn()))) {
        break label73;
      }
    }
    label73:
    for (boolean bool = true;; bool = ((KeyguardManager)this.a.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
    {
      if (bool)
      {
        this.c.a(this.a);
        this.b = false;
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgb
 * JD-Core Version:    0.7.0.1
 */