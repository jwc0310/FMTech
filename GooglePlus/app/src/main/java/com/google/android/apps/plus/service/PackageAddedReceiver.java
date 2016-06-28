package com.google.android.apps.plus.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import bgp;
import duk;

public class PackageAddedReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (Log.isLoggable("DeepLinking", 3))
    {
      String str3 = String.valueOf(paramIntent);
      new StringBuilder(33 + String.valueOf(str3).length()).append("PackageAddedReceiver.onReceive() ").append(str3);
    }
    String str1 = paramIntent.getDataString();
    if (str1 != null)
    {
      String str2 = str1.substring(8);
      if (duk.a(paramContext.getPackageManager(), str2))
      {
        int i = bgp.a(paramContext);
        if (i != -1) {
          EsService.c(paramContext, i, str2);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.PackageAddedReceiver
 * JD-Core Version:    0.7.0.1
 */