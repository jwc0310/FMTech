package com.google.android.libraries.social.location;

import android.accounts.Account;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.social.gcm.GcmBroadcastReceiver;
import frs;
import fsb;
import fsc;
import fsd;
import fsg;
import fsk;
import fvx;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import giz;
import gjb;
import gxw;
import gxx;
import gxz;
import gya;
import ijm;
import ijn;
import ijo;
import java.util.concurrent.TimeUnit;
import mbb;

public final class GcmLocationService
  extends IntentService
{
  private fsc a;
  private fwv b;
  private ijm c;
  
  public GcmLocationService()
  {
    super("GcmLocationService");
  }
  
  public final void onCreate()
  {
    super.onCreate();
    this.c = ((ijm)mbb.a(this, ijm.class));
    this.b = ((fwv)mbb.a(this, fwv.class));
    this.a = ((fsd)mbb.a(this, fsd.class)).a((fsb)mbb.a(this, fww.class)).a((fsb)mbb.a(this, fvx.class)).a();
  }
  
  protected final void onHandleIntent(Intent paramIntent)
  {
    frs localfrs;
    if ((paramIntent != null) && (paramIntent.hasExtra("gaia_id")))
    {
      localfrs = this.a.a(10L, TimeUnit.SECONDS);
      if (!localfrs.a()) {
        break label580;
      }
    }
    for (;;)
    {
      try
      {
        if (this.a != null)
        {
          boolean bool1 = this.a.d();
          if (bool1) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        String str1;
        giz localgiz;
        int j;
        Account localAccount;
        fwx localfwx;
        String str2;
        ijo localijo;
        String str3;
        ijn localijn;
        boolean bool3;
        fwz localfwz;
        fwy localfwy;
        int i1;
        gxx localgxx;
        gxw localgxw;
        if (!Log.isLoggable("GcmLocationService", 6)) {
          continue;
        }
        Log.e("GcmLocationService", "Error attempting to get and upload location", localException);
        this.a.c();
        continue;
        int k = 0;
        continue;
        boolean bool2 = Boolean.parseBoolean(str2);
        continue;
        int m = Integer.parseInt(str3);
        int n = m;
        continue;
      }
      finally
      {
        this.a.c();
      }
      if (paramIntent != null) {
        GcmBroadcastReceiver.a(paramIntent);
      }
      return;
      str1 = paramIntent.getStringExtra("gaia_id");
      localgiz = (giz)mbb.a(this, giz.class);
      j = localgiz.b(str1);
      if (j != -1)
      {
        localAccount = new Account(localgiz.a(j).b("account_name"), "com.google");
        localfwx = (fwx)this.b.b(this.a, localAccount).a(10L, TimeUnit.SECONDS);
        if ((localfwx != null) && (localfwx.a()) && (localfwx.b()))
        {
          k = 1;
          if ((k == 0) && (Log.isLoggable("GcmLocationService", 4)) && (localfwx != null) && (localfwx.a())) {
            localfwx.b();
          }
          if (k == 0) {
            continue;
          }
          str2 = paramIntent.getStringExtra("enable_location_fix");
          if (str2 != null) {
            continue;
          }
          bool2 = false;
          if (bool2)
          {
            localijo = new ijo((byte)0).a(1).b(30).c(100);
            str3 = paramIntent.getStringExtra("num_location_updates");
            if (str3 != null) {
              continue;
            }
            n = 1;
            localijn = localijo.a(n).a();
            bool3 = this.c.a(this, this.a, localijn);
            if (Log.isLoggable("GcmLocationService", 4)) {
              new StringBuilder(37).append("Attempted location fix success? ").append(bool3);
            }
          }
          localfwz = ((fxa)mbb.a(this, fxa.class)).a(localAccount, "one-shot update for oven fresh", 0L, 0);
          localfwy = (fwy)this.b.a(this.a, localfwz).a(10L, TimeUnit.SECONDS);
          if (Log.isLoggable("GcmLocationService", 4))
          {
            i1 = localfwy.aN_().b();
            new StringBuilder(39).append("one-shot upload: ResultCode ").append(i1);
          }
          localgxx = (gxx)mbb.a(this, gxx.class);
          localgxw = new gxw(this);
          localgxw.b = j;
          localgxw.c = gxz.cq;
          localgxw.d = gya.M;
          localgxx.a(localgxw);
        }
        label580:
        if (Log.isLoggable("GcmLocationService", 6))
        {
          int i = localfrs.b();
          Log.e("GcmLocationService", 57 + "Unable to connect to Play Services; errorCode:" + i);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.location.GcmLocationService
 * JD-Core Version:    0.7.0.1
 */