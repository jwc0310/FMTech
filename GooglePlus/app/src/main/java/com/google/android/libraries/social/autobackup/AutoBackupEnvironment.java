package com.google.android.libraries.social.autobackup;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import hau;
import ixf;
import mbb;

public class AutoBackupEnvironment
{
  public boolean a;
  public boolean b;
  public boolean c;
  public boolean d;
  private final hau e;
  
  public AutoBackupEnvironment(Context paramContext)
  {
    this.e = ((hau)mbb.a(paramContext, hau.class));
    a(paramContext);
  }
  
  public static boolean a()
  {
    String str = Environment.getExternalStorageState();
    return ("mounted".equals(str)) || ("mounted_ro".equals(str));
  }
  
  static boolean a(AutoBackupEnvironment paramAutoBackupEnvironment, Context paramContext)
  {
    label279:
    for (;;)
    {
      boolean bool3;
      boolean bool4;
      boolean bool5;
      boolean bool6;
      boolean bool7;
      try
      {
        ixf localixf = (ixf)mbb.a(paramContext, ixf.class);
        boolean bool1 = paramAutoBackupEnvironment.b;
        boolean bool2 = localixf.e();
        bool3 = false;
        if (bool2 != bool1)
        {
          paramAutoBackupEnvironment.b = bool2;
          bool3 = true;
        }
        bool4 = paramAutoBackupEnvironment.c;
        bool5 = localixf.f();
        if (bool5 != bool4)
        {
          paramAutoBackupEnvironment.c = bool5;
          bool3 = true;
        }
        bool6 = paramAutoBackupEnvironment.d;
        bool7 = localixf.g();
        if (bool7 == bool6) {
          break label242;
        }
        paramAutoBackupEnvironment.d = bool7;
        bool8 = true;
        if ((bool8) && (Log.isLoggable("iu.Environment", 4)))
        {
          if (bool1 != bool2)
          {
            str = "*";
            break label249;
            new StringBuilder(100 + String.valueOf(str).length() + String.valueOf(localObject2).length() + String.valueOf(localObject3).length()).append("update connectivity state; isNetworkMetered? ").append(bool2).append(str).append(", isRoaming? ").append(bool5).append((String)localObject2).append(", isBackgroundDataAllowed? ").append(bool7).append((String)localObject3);
          }
        }
        else {
          return bool8;
        }
        String str = "";
      }
      finally {}
      Object localObject3 = "";
      continue;
      label242:
      boolean bool8 = bool3;
      continue;
      label249:
      if (bool4 != bool5) {}
      for (Object localObject2 = "*";; localObject2 = "")
      {
        if (bool6 == bool7) {
          break label279;
        }
        localObject3 = "*";
        break;
      }
    }
  }
  
  static boolean a(AutoBackupEnvironment paramAutoBackupEnvironment, Context paramContext, Intent paramIntent)
  {
    bool1 = true;
    boolean bool2;
    IntentFilter localIntentFilter;
    Intent localIntent2;
    label39:
    try
    {
      bool2 = paramAutoBackupEnvironment.a;
      if (paramIntent == null) {
        localIntentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
      }
    }
    finally {}
    try
    {
      localIntent2 = paramContext.registerReceiver(null, localIntentFilter);
      localIntent1 = localIntent2;
    }
    catch (ReceiverCallNotAllowedException localReceiverCallNotAllowedException)
    {
      label133:
      label158:
      label289:
      localIntent1 = null;
      break label39;
      bool1 = false;
      break label158;
      str2 = "BATTERY_PLUGGED_USB";
      break label133;
      str2 = "BATTERY_PLUGGED_WIRELESS";
      break label133;
      bool1 = false;
      break label158;
    }
    if (localIntent1 != null)
    {
      int i = localIntent1.getIntExtra("plugged", -1);
      if (i > 0)
      {
        paramAutoBackupEnvironment.a = bool1;
        if (!Log.isLoggable("iu.Environment", 3)) {}
      }
      else
      {
        boolean bool3;
        switch (i)
        {
        case 3: 
        default: 
          str2 = 21 + "UNKNOWN (" + i + ")";
          String str3 = String.valueOf(str2);
          if (str3.length() != 0)
          {
            "starting battery state: ".concat(str3);
            bool1 = false;
            if ((bool1) && (Log.isLoggable("iu.Environment", 4)))
            {
              bool3 = paramAutoBackupEnvironment.a;
              if (bool2 == paramAutoBackupEnvironment.a) {
                break label289;
              }
            }
          }
        case 1: 
          for (String str1 = "*";; str1 = "")
          {
            new StringBuilder(38 + String.valueOf(str1).length()).append("update battery state; isPlugged? ").append(bool3).append(str1);
            return bool1;
            bool1 = false;
            break;
            str2 = "BATTERY_PLUGGED_AC";
            break label133;
            new String("starting battery state: ");
            break label323;
            boolean bool4 = "android.intent.action.ACTION_POWER_CONNECTED".equals(paramIntent.getAction());
            if (bool4 == bool2) {
              break label304;
            }
            paramAutoBackupEnvironment.a = bool4;
            break label158;
          }
        }
      }
    }
  }
  
  public final void a(Context paramContext)
  {
    if ((a(this, paramContext, null) | a(this, paramContext))) {
      this.e.c.sendEmptyMessageDelayed(1, 0L);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.AutoBackupEnvironment
 * JD-Core Version:    0.7.0.1
 */