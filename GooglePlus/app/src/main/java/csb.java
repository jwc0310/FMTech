import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.PowerManager;

public final class csb
  implements mbo, mdi, mdo, mdr, mds, mes, mew, mez, mfa, mfd
{
  private static final String a = efj.B("ActivityInstrumentationMixin");
  private final Activity b;
  private final gxv c;
  private gxx d;
  private boolean e;
  private boolean f;
  private boolean g;
  
  public csb(Activity paramActivity, mek parammek, gxv paramgxv)
  {
    this.b = paramActivity;
    this.c = paramgxv;
    parammek.a(this);
  }
  
  private final Intent c(Intent paramIntent)
  {
    try
    {
      gya localgya = this.c.r_();
      if (localgya != null)
      {
        paramIntent.putExtra("com.google.plus.analytics.intent.extra.START_VIEW", localgya.ordinal());
        paramIntent.putExtra("com.google.plus.analytics.intent.extra.START_TIME", System.currentTimeMillis());
        Bundle localBundle = new Bundle();
        this.c.b(localBundle);
        if (!localBundle.isEmpty()) {
          paramIntent.putExtras(localBundle);
        }
      }
      return paramIntent;
    }
    catch (BadParcelableException localBadParcelableException) {}
    return paramIntent;
  }
  
  public final void a()
  {
    if (!this.g)
    {
      gxx localgxx = this.d;
      gxw localgxw = new gxw(this.b);
      localgxw.c = gxz.b;
      localgxx.a(localgxw);
      this.f = true;
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = ((gxx)parammbb.a(gxx.class));
  }
  
  public final void a(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("com.google.plus.analytics.intent.extra.START_VIEW", -1);
    gya[] arrayOfgya = gya.values();
    if ((arrayOfgya != null) && (i >= 0) && (i < arrayOfgya.length)) {}
    for (gya localgya1 = arrayOfgya[i];; localgya1 = gya.J)
    {
      Bundle localBundle1 = paramIntent.getBundleExtra("com.google.plus.analytics.intent.extra.EXTRA_START_VIEW_EXTRAS");
      gya localgya2 = this.c.r_();
      Bundle localBundle2 = new Bundle();
      this.c.b(localBundle2);
      gxx localgxx = this.d;
      gxw localgxw = new gxw(this.b);
      localgxw.d = localgya1;
      localgxw.e = localgya2;
      localgxx.a(localgxw.a(localBundle1).b(localBundle2));
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.e = paramBundle.getBoolean("analytics:recorded");
      this.f = paramBundle.getBoolean("analytics:exited");
      return;
    }
    this.f = true;
  }
  
  public final void b()
  {
    if ((this.f) && (this.b.isTaskRoot()))
    {
      gxx localgxx2 = this.d;
      gxw localgxw2 = new gxw(this.b);
      localgxw2.c = gxz.a;
      localgxx2.a(localgxw2);
      this.f = false;
    }
    gya localgya1;
    Intent localIntent;
    int i;
    gya[] arrayOfgya;
    if (!this.e)
    {
      this.e = true;
      localgya1 = this.c.r_();
      localIntent = this.b.getIntent();
      i = localIntent.getIntExtra("com.google.plus.analytics.intent.extra.START_VIEW", -1);
      arrayOfgya = gya.values();
      if ((arrayOfgya == null) || (i < 0) || (i >= arrayOfgya.length)) {
        break label199;
      }
    }
    label199:
    for (gya localgya2 = arrayOfgya[i];; localgya2 = gya.J)
    {
      Bundle localBundle = localIntent.getBundleExtra("com.google.plus.analytics.intent.extra.EXTRA_START_VIEW_EXTRAS");
      long l = localIntent.getLongExtra("com.google.plus.analytics.intent.extra.START_TIME", System.currentTimeMillis());
      gxx localgxx1 = this.d;
      gxw localgxw1 = new gxw(this.b);
      localgxw1.d = localgya2;
      localgxw1.e = localgya1;
      localgxw1.f = Long.valueOf(l);
      localgxx1.a(localgxw1.a(localBundle));
      return;
    }
  }
  
  public final void b(Intent paramIntent)
  {
    c(paramIntent);
    this.g = true;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("analytics:recorded", this.e);
    paramBundle.putBoolean("analytics:exited", this.f);
  }
  
  public final void c()
  {
    this.g = false;
    KeyguardManager localKeyguardManager = (KeyguardManager)this.b.getSystemService("keyguard");
    PowerManager localPowerManager = (PowerManager)this.b.getSystemService("power");
    if ((localKeyguardManager.inKeyguardRestrictedInputMode()) || (!localPowerManager.isScreenOn())) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        gxx localgxx = this.d;
        gxw localgxw = new gxw(this.b);
        localgxw.c = gxz.b;
        localgxx.a(localgxw);
        this.f = true;
      }
      return;
    }
  }
  
  public final void d()
  {
    if ((!this.b.isFinishing()) && (!this.g))
    {
      if (this.b.isTaskRoot())
      {
        gxx localgxx2 = this.d;
        gxw localgxw2 = new gxw(this.b);
        localgxw2.c = gxz.b;
        localgxx2.a(localgxw2);
      }
    }
    else {
      return;
    }
    Intent localIntent = this.b.getIntent();
    gya localgya1 = this.c.r_();
    Bundle localBundle1 = new Bundle();
    this.c.b(localBundle1);
    int i = localIntent.getIntExtra("com.google.plus.analytics.intent.extra.START_VIEW", -1);
    gya[] arrayOfgya = gya.values();
    if ((arrayOfgya != null) && (i >= 0) && (i < arrayOfgya.length)) {}
    for (gya localgya2 = arrayOfgya[i];; localgya2 = gya.J)
    {
      Bundle localBundle2 = localIntent.getBundleExtra("com.google.plus.analytics.intent.extra.EXTRA_START_VIEW_EXTRAS");
      if (localgya2 == null) {
        break;
      }
      gxx localgxx1 = this.d;
      gxw localgxw1 = new gxw(this.b);
      localgxw1.d = localgya1;
      localgxw1.e = localgya2;
      localgxx1.a(localgxw1.a(localBundle1).b(localBundle2));
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csb
 * JD-Core Version:    0.7.0.1
 */