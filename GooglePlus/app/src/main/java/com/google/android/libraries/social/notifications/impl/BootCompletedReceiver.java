package com.google.android.libraries.social.notifications.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;
import gk;
import jdr;

public final class BootCompletedReceiver
  extends gk
{
  private static final String a = jdr.a(BootCompletedReceiver.class);
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.BOOT_COMPLETED".equals(paramIntent.getAction()))
    {
      jdr.a(a, "Boot completed received.");
      Intent localIntent = new Intent(paramContext, GunsService.class);
      localIntent.setAction("com.google.android.libraries.social.notifications.impl.REDRAW_NOTIFICATIONS");
      localIntent.putExtra("force_redraw", false);
      a(paramContext, localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.notifications.impl.BootCompletedReceiver
 * JD-Core Version:    0.7.0.1
 */