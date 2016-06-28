import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.util.Map;

public final class exv
  extends Service
{
  static String a = "CMD";
  private static String b = "google.com/iid";
  private static String c = "gcm.googleapis.com/refresh";
  private int d;
  private int e;
  
  private void a()
  {
    try
    {
      this.d = (-1 + this.d);
      if (this.d == 0) {
        stopSelf(this.e);
      }
      if (Log.isLoggable("InstanceID", 3)) {
        new StringBuilder("Stop ").append(this.d).append(" ").append(this.e);
      }
      return;
    }
    finally {}
  }
  
  static void a(Context paramContext, eyc parameyc)
  {
    parameyc.a();
    Intent localIntent = new Intent("com.google.android.gms.iid.InstanceID");
    localIntent.putExtra(a, "RST");
    localIntent.setPackage(paramContext.getPackageName());
    paramContext.startService(localIntent);
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    IBinder localIBinder = null;
    if (paramIntent != null)
    {
      boolean bool = "com.google.android.gms.iid.InstanceID".equals(paramIntent.getAction());
      localIBinder = null;
      if (bool) {
        localIBinder = null.a();
      }
    }
    return localIBinder;
  }
  
  public final void onCreate()
  {
    IntentFilter localIntentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
    localIntentFilter.addCategory(getPackageName());
    registerReceiver(null, localIntentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
  }
  
  public final void onDestroy()
  {
    unregisterReceiver(null);
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    try
    {
      this.d = (1 + this.d);
      if (paramInt2 > this.e) {
        this.e = paramInt2;
      }
      if (paramIntent == null)
      {
        a();
        return 2;
      }
    }
    finally {}
    for (;;)
    {
      String str1;
      exu localexu;
      String str2;
      try
      {
        if ("com.google.android.gms.iid.InstanceID".equals(paramIntent.getAction()))
        {
          if (Build.VERSION.SDK_INT <= 18)
          {
            Intent localIntent = (Intent)paramIntent.getParcelableExtra("GSF");
            if (localIntent != null)
            {
              startService(localIntent);
              return 1;
            }
          }
          str1 = paramIntent.getStringExtra("subtype");
          if (str1 == null)
          {
            localexu = exu.b(this);
            str2 = paramIntent.getStringExtra(a);
            if ((paramIntent.getStringExtra("error") == null) && (paramIntent.getStringExtra("registration_id") == null)) {
              continue;
            }
            if (Log.isLoggable("InstanceID", 3)) {
              new StringBuilder("Register result in service ").append(str1);
            }
            exu.b.b(paramIntent);
          }
        }
        else
        {
          a();
          if (paramIntent.getStringExtra("from") != null) {
            evq.a(paramIntent);
          }
          return 2;
        }
        Bundle localBundle = new Bundle();
        localBundle.putString("subtype", str1);
        localexu = exu.a(this, localBundle);
        continue;
        if (Log.isLoggable("InstanceID", 3)) {
          new StringBuilder("Service command ").append(str1).append(" ").append(str2).append(" ").append(paramIntent.getExtras());
        }
        if (paramIntent.getStringExtra("unregistered") != null)
        {
          eyc localeyc = exu.a;
          if (str1 == null) {
            str1 = "";
          }
          localeyc.c(str1);
          exu.b.b(paramIntent);
          continue;
        }
        if (!c.equals(paramIntent.getStringExtra("from"))) {
          break label340;
        }
      }
      finally
      {
        a();
      }
      exu.a.c(str1);
      continue;
      label340:
      if ("RST".equals(str2))
      {
        localexu.b();
      }
      else if ("RST_FULL".equals(str2))
      {
        if (!exu.a.a.getAll().isEmpty()) {
          exu.a.a();
        }
      }
      else if ("SYNC".equals(str2))
      {
        exu.a.c(str1);
      }
      else
      {
        boolean bool = "PING".equals(str2);
        if (bool) {
          try
          {
            evr.a(this).a(b, exx.a(), 0L, paramIntent.getExtras());
          }
          catch (IOException localIOException) {}
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exv
 * JD-Core Version:    0.7.0.1
 */