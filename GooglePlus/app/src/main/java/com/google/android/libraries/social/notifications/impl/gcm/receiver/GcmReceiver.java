package com.google.android.libraries.social.notifications.impl.gcm.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.social.notifications.service.GunsService;
import ftz;
import gk;
import java.util.Iterator;
import java.util.Set;
import jdr;
import mbb;

public final class GcmReceiver
  extends gk
{
  private static final String a = jdr.a(GcmReceiver.class);
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    ftz localftz;
    if ("com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction()))
    {
      String str1 = a;
      String str2 = String.valueOf(paramIntent);
      if (paramIntent == null) {}
      StringBuilder localStringBuilder;
      for (Bundle localBundle = null;; localBundle = paramIntent.getExtras())
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Extras: [\n");
        if (localBundle == null) {
          break;
        }
        Iterator localIterator = localBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str4 = (String)localIterator.next();
          localStringBuilder.append(str4);
          localStringBuilder.append(" : ");
          localStringBuilder.append(localBundle.get(str4));
          localStringBuilder.append("\n");
        }
      }
      localStringBuilder.append("]");
      String str3 = String.valueOf(localStringBuilder.toString());
      jdr.b(str1, 12 + String.valueOf(str2).length() + String.valueOf(str3).length() + "onReceive: " + str2 + "\n" + str3);
      localftz = (ftz)mbb.a(paramContext, ftz.class);
      if ((!localftz.d(paramIntent)) && (!localftz.a(paramIntent))) {
        break label297;
      }
      if (!TextUtils.isEmpty(paramIntent.getStringExtra("ht")))
      {
        Intent localIntent = new Intent(paramContext, GunsService.class);
        localIntent.setAction("com.google.android.libraries.social.notifications.impl.GCM_MESSAGE_RECEIVED");
        localIntent.putExtras(paramIntent.getExtras());
        a(paramContext, localIntent);
      }
      jdr.b(a, "Received a GCM message.");
    }
    label297:
    do
    {
      return;
      if (localftz.b(paramIntent))
      {
        jdr.b(a, "GCM Send error message.");
        return;
      }
    } while (!localftz.c(paramIntent));
    jdr.b(a, "Deleted messages on server.");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.notifications.impl.gcm.receiver.GcmReceiver
 * JD-Core Version:    0.7.0.1
 */