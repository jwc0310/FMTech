package com.google.android.apps.plus.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class PackagesMediaMonitor$AsyncService
  extends IntentService
{
  private PowerManager.WakeLock a;
  
  public PackagesMediaMonitor$AsyncService()
  {
    super("GPlusPackageMediaMonitor");
    setIntentRedelivery(true);
  }
  
  /* Error */
  protected void onHandleIntent(Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 24	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:a	(Landroid/content/Context;)Lcom/google/android/libraries/social/picasalegacy/PicasaStoreFacade;
    //   4: astore_3
    //   5: aload_1
    //   6: invokevirtual 30	android/content/Intent:getData	()Landroid/net/Uri;
    //   9: invokevirtual 36	android/net/Uri:getSchemeSpecificPart	()Ljava/lang/String;
    //   12: pop
    //   13: aload_1
    //   14: invokevirtual 39	android/content/Intent:getAction	()Ljava/lang/String;
    //   17: astore 5
    //   19: ldc 41
    //   21: aload 5
    //   23: invokevirtual 47	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   26: ifeq +16 -> 42
    //   29: aload_3
    //   30: iconst_0
    //   31: invokevirtual 49	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:a	(Z)V
    //   34: aload_0
    //   35: getfield 51	com/google/android/apps/plus/service/PackagesMediaMonitor$AsyncService:a	Landroid/os/PowerManager$WakeLock;
    //   38: invokevirtual 56	android/os/PowerManager$WakeLock:release	()V
    //   41: return
    //   42: ldc 58
    //   44: aload 5
    //   46: invokevirtual 47	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   49: ifeq -15 -> 34
    //   52: aload_3
    //   53: iconst_0
    //   54: invokevirtual 49	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:a	(Z)V
    //   57: goto -23 -> 34
    //   60: astore_2
    //   61: aload_0
    //   62: getfield 51	com/google/android/apps/plus/service/PackagesMediaMonitor$AsyncService:a	Landroid/os/PowerManager$WakeLock;
    //   65: invokevirtual 56	android/os/PowerManager$WakeLock:release	()V
    //   68: aload_2
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	AsyncService
    //   0	70	1	paramIntent	Intent
    //   60	9	2	localObject	java.lang.Object
    //   4	49	3	localPicasaStoreFacade	com.google.android.libraries.social.picasalegacy.PicasaStoreFacade
    //   17	28	5	str	java.lang.String
    // Exception table:
    //   from	to	target	type
    //   0	34	60	finally
    //   42	57	60	finally
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    if (this.a == null) {
      this.a = ((PowerManager)getSystemService("power")).newWakeLock(1, "AsyncService");
    }
    this.a.acquire();
    super.onStart(paramIntent, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.PackagesMediaMonitor.AsyncService
 * JD-Core Version:    0.7.0.1
 */