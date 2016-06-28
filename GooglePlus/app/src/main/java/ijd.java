import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

public final class ijd
  implements fry, fsf, ijw
{
  public final BroadcastReceiver a = new ije(this);
  public final Context b;
  final Executor c;
  public final Account d;
  public final bw e;
  public final fsc f;
  public fwx g;
  Intent h;
  public boolean i;
  private final boolean j;
  private final fwv k;
  private final fpw l;
  private ijk m;
  private int n = 0;
  
  public ijd(Context paramContext, String paramString, bw parambw, ijk paramijk)
  {
    this(paramContext, paramString, parambw, paramijk, false);
  }
  
  private ijd(Context paramContext, String paramString, bw parambw, ijk paramijk, boolean paramBoolean)
  {
    this(paramContext, paramString, parambw, paramijk, false, AsyncTask.SERIAL_EXECUTOR);
  }
  
  private ijd(Context paramContext, String paramString, bw parambw, ijk paramijk, boolean paramBoolean, Executor paramExecutor)
  {
    this.b = paramContext;
    this.c = paramExecutor;
    this.d = new Account(paramString, "com.google");
    this.e = parambw;
    this.m = paramijk;
    this.j = paramBoolean;
    this.k = ((fwv)mbb.a(paramContext, fwv.class));
    this.f = ((fsd)mbb.a(paramContext, fsd.class)).a((fsb)mbb.a(paramContext, fww.class)).a(this).a(this).a();
    this.l = ((fpw)mbb.a(paramContext, fpw.class));
    this.f.b();
    c("enable_location_reporting_auto");
    c("enable_location_reporting_manual ");
    c("enable_location_reporting_error");
  }
  
  private final void c(String paramString)
  {
    iju localiju = (iju)this.e.a(paramString);
    if (localiju != null) {
      localiju.Z = this;
    }
  }
  
  public final void a()
  {
    a(true);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
    if (!this.i)
    {
      this.b.registerReceiver(this.a, localIntentFilter);
      this.i = true;
    }
  }
  
  public final void a(frs paramfrs)
  {
    this.n = paramfrs.b();
    if (Log.isLoggable("GmsLocationReporting", 6))
    {
      int i1 = this.n;
      Log.e("GmsLocationReporting", 41 + "onConnectionFailed: errorCode=" + i1);
    }
    k();
  }
  
  final void a(boolean paramBoolean)
  {
    if (!c()) {
      return;
    }
    this.k.b(this.f, this.d).a(new ijh(this, paramBoolean));
  }
  
  public final boolean a(String paramString)
  {
    return this.e.a(paramString) != null;
  }
  
  public final void b()
  {
    this.g = null;
    k();
  }
  
  public final void b(String paramString)
  {
    if ("enable_location_reporting_auto".equals(paramString)) {
      h();
    }
    do
    {
      do
      {
        return;
      } while (((!"enable_location_reporting_manual ".equals(paramString)) && (!"enable_location_reporting_error".equals(paramString))) || (!g()));
      if (this.g.a())
      {
        ((fxb)mbb.a(this.b, fxb.class)).a(this.b);
        return;
      }
    } while (this.h == null);
    this.b.startActivity(this.h);
  }
  
  public final boolean c()
  {
    return (this.f.d()) && (this.n == 0);
  }
  
  public final boolean d()
  {
    if ((!c()) || (this.g == null)) {
      return false;
    }
    if ((this.g.a()) && (this.g.b())) {}
    for (boolean bool = true;; bool = false)
    {
      if (!this.j) {
        return bool;
      }
      if ((!bool) || (!this.g.c())) {
        break;
      }
      return true;
    }
    return bool;
  }
  
  @TargetApi(19)
  public final boolean e()
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    boolean bool2;
    for (int i1 = 1; i1 != 0; i1 = 0) {
      try
      {
        int i3 = Settings.Secure.getInt(this.b.getContentResolver(), "location_mode");
        bool2 = false;
        if (i3 != 0) {
          bool2 = true;
        }
        return bool2;
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        localSettingNotFoundException.getMessage();
        return false;
      }
    }
    List localList = ((LocationManager)this.b.getSystemService("location")).getProviders(true);
    int i2;
    if (localList.size() == 0)
    {
      i2 = 1;
      label87:
      if (localList.size() != 1) {
        break label137;
      }
    }
    label137:
    for (boolean bool1 = ((String)localList.get(0)).equals("passive");; bool1 = false)
    {
      bool2 = false;
      if (i2 != 0) {
        break;
      }
      bool2 = false;
      if (bool1) {
        break;
      }
      return true;
      i2 = 0;
      break label87;
    }
  }
  
  public final boolean f()
  {
    if ((!c()) || (this.g == null)) {}
    while ((!this.g.a()) || (d())) {
      return false;
    }
    return true;
  }
  
  public final boolean g()
  {
    if ((!c()) || (this.g == null)) {}
    while ((!this.g.a()) && (this.h == null)) {
      return false;
    }
    return true;
  }
  
  public final void h()
  {
    if ((!c()) || (!e()))
    {
      j();
      return;
    }
    this.k.a(this.f, this.d).a(new ijf(this));
  }
  
  public final void i()
  {
    if ((!c()) || (this.g == null)) {}
    while (!d()) {
      return;
    }
    fwz localfwz = ((fxa)mbb.a(this.b, fxa.class)).a(this.d, "one-shot update for location tab", 0L, 0);
    this.k.a(this.f, localfwz).a(new ijg(this));
  }
  
  final void j()
  {
    Context localContext1 = this.b;
    int i1 = efj.Og;
    Context localContext2 = this.b;
    int i2 = efj.Of;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.d.name;
    iju localiju = iju.a(localContext1, i1, localContext2.getString(i2, arrayOfObject), efj.Os);
    localiju.Z = this;
    localiju.a(this.e, "enable_location_reporting_error");
  }
  
  final void k()
  {
    if (this.m != null) {
      this.m.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ijd
 * JD-Core Version:    0.7.0.1
 */