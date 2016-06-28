package com.google.android.libraries.social.autobackup;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import hbe;
import mbb;

public final class FingerprintScannerIntentService
  extends IntentService
{
  private static PowerManager.WakeLock a;
  private PowerManager.WakeLock b;
  
  public FingerprintScannerIntentService()
  {
    super("Fingerprint Scanner");
  }
  
  public static void a(Context paramContext)
  {
    c(paramContext).acquire();
    paramContext.startService(new Intent(paramContext, FingerprintScannerIntentService.class));
  }
  
  private static void b(Context paramContext)
  {
    try
    {
      PowerManager.WakeLock localWakeLock = c(paramContext);
      if (localWakeLock.isHeld()) {
        localWakeLock.release();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private static PowerManager.WakeLock c(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "fingerprint_scanner_static");
      }
      PowerManager.WakeLock localWakeLock = a;
      return localWakeLock;
    }
    finally {}
  }
  
  public final void onCreate()
  {
    super.onCreate();
    this.b = ((PowerManager)getSystemService("power")).newWakeLock(1, "fingerprint_scanner_local");
  }
  
  protected final void onHandleIntent(Intent paramIntent)
  {
    try
    {
      ((hbe)mbb.a(this, hbe.class)).a();
      return;
    }
    catch (SecurityException localSecurityException)
    {
      if (Log.isLoggable("iu.UploadsManager", 6)) {
        Log.e("iu.UploadsManager", "Insufficient permissions to process media", localSecurityException);
      }
      return;
    }
    finally
    {
      this.b.release();
    }
  }
  
  public final void onStart(Intent paramIntent, int paramInt)
  {
    this.b.acquire();
    super.onStart(paramIntent, paramInt);
    b(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.FingerprintScannerIntentService
 * JD-Core Version:    0.7.0.1
 */