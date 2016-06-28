package com.google.android.libraries.social.autobackup;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import efj;
import hbn;
import mbb;

public final class FolderAutoBackupReceiver
  extends BroadcastReceiver
{
  public static int a;
  public static int b;
  
  public static PendingIntent a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, FolderAutoBackupReceiver.class);
    localIntent.setAction(paramString1);
    localIntent.putExtra("extra_bucket_id", paramString2);
    return PendingIntent.getBroadcast(paramContext, paramInt, localIntent, 268435456);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("extra_bucket_id");
    if (TextUtils.equals(paramIntent.getAction(), "com.google.android.libraries.social.autobackup.ACTION_ENABLE_FOLDER_BACKUP")) {
      if (str1 != null)
      {
        ((hbn)mbb.a(paramContext, hbn.class)).a(str1);
        if (Log.isLoggable("FolderABReceiver", 3))
        {
          String str4 = String.valueOf(str1);
          if (str4.length() == 0) {
            break label85;
          }
          "enabling auto back up of folder with bucketId ".concat(str4);
        }
      }
    }
    for (;;)
    {
      ((NotificationManager)paramContext.getSystemService("notification")).cancel(efj.Fm);
      return;
      label85:
      new String("enabling auto back up of folder with bucketId ");
      continue;
      if (Log.isLoggable("FolderABReceiver", 3))
      {
        String str3 = String.valueOf(paramIntent.getAction());
        new StringBuilder(35 + String.valueOf(str3).length()).append("received intent ").append(str3).append(" with null bucketId");
        continue;
        if ((TextUtils.equals(paramIntent.getAction(), "com.google.android.libraries.social.autobackup.ACTION_SKIP_FOLDER_BACKUP")) && (Log.isLoggable("FolderABReceiver", 3)))
        {
          String str2 = String.valueOf(str1);
          if (str2.length() != 0) {
            "skipping auto back up of folder with bucketId ".concat(str2);
          } else {
            new String("skipping auto back up of folder with bucketId ");
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.FolderAutoBackupReceiver
 * JD-Core Version:    0.7.0.1
 */