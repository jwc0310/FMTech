package com.google.android.libraries.social.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import ftz;
import gk;
import icc;
import java.util.Iterator;
import java.util.List;
import mbb;

public final class GcmBroadcastReceiver
  extends gk
{
  private static String b(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (Bundle localBundle = null; localBundle == null; localBundle = paramIntent.getExtras()) {
      return null;
    }
    return localBundle.toString();
  }
  
  private static boolean b(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getExtras().getString("type");
    boolean bool1;
    if (!TextUtils.isEmpty(str))
    {
      Iterator localIterator = mbb.c(paramContext, icc.class).iterator();
      bool1 = false;
      if (!localIterator.hasNext()) {
        break label88;
      }
      icc localicc = (icc)localIterator.next();
      if (!TextUtils.equals(str, localicc.a())) {
        break label90;
      }
      localicc.a(paramContext, paramIntent);
    }
    label88:
    label90:
    for (boolean bool2 = true;; bool2 = bool1)
    {
      bool1 = bool2;
      break;
      bool1 = false;
      return bool1;
    }
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (Log.isLoggable("GcmBroadcastReceiver", 3))
    {
      String str4 = String.valueOf(paramIntent);
      String str5 = String.valueOf(b(paramIntent));
      new StringBuilder(20 + String.valueOf(str4).length() + String.valueOf(str5).length()).append("onReceive: ").append(str4).append(" extras: ").append(str5);
    }
    ftz localftz = (ftz)mbb.a(paramContext.getApplicationContext(), ftz.class);
    if ((localftz.d(paramIntent)) || (localftz.a(paramIntent)))
    {
      b(paramContext, paramIntent);
      if (Log.isLoggable("GcmBroadcastReceiver", 3))
      {
        String str1 = String.valueOf(b(paramIntent));
        if (str1.length() == 0) {
          break label146;
        }
        "GCM message: ".concat(str1);
      }
    }
    label146:
    do
    {
      do
      {
        return;
        new String("GCM message: ");
        return;
        if (!localftz.b(paramIntent)) {
          break;
        }
      } while (!Log.isLoggable("GcmBroadcastReceiver", 3));
      String str3 = String.valueOf(b(paramIntent));
      if (str3.length() != 0)
      {
        "Send error: ".concat(str3);
        return;
      }
      new String("Send error: ");
      return;
    } while ((!localftz.c(paramIntent)) || (!Log.isLoggable("GcmBroadcastReceiver", 3)));
    String str2 = String.valueOf(b(paramIntent));
    if (str2.length() != 0)
    {
      "Deleted messages on server: ".concat(str2);
      return;
    }
    new String("Deleted messages on server: ");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.gcm.GcmBroadcastReceiver
 * JD-Core Version:    0.7.0.1
 */