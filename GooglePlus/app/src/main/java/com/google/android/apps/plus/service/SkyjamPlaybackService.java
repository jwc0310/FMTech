package com.google.android.apps.plus.service;

import aau;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import dmy;
import dnb;
import dne;
import dnf;
import dnh;
import dni;
import efj;
import java.util.ArrayList;

public class SkyjamPlaybackService
  extends Service
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, dnb
{
  public static ArrayList<dni> a = new ArrayList();
  public static String d;
  public static String e;
  public static int f = -1;
  public static String g;
  public static String h;
  public static int i;
  public static int j;
  public Handler b;
  public MediaPlayer c;
  private dmy k;
  private NotificationManager l;
  private final Runnable m = new dne(this);
  
  public static boolean a(String paramString)
  {
    return (d != null) && (d.equals(paramString));
  }
  
  public final String a(int paramInt)
  {
    int n = paramInt / 1000;
    int i1 = n / 60;
    int i2 = n % 60;
    int i3 = aau.tM;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i1);
    arrayOfObject[1] = Integer.valueOf(i2);
    return getString(i3, arrayOfObject);
  }
  
  public final void a()
  {
    b();
  }
  
  public final void a(Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    if (str1 == null) {}
    String str2;
    do
    {
      do
      {
        String str3;
        do
        {
          return;
          if (!str1.equals("com.google.android.apps.plus.service.SkyjamPlaybackService.PLAY")) {
            break;
          }
          str3 = paramIntent.getStringExtra("music_url");
        } while ((str3 == null) || (str3.equals(d)));
        if (d != null) {
          b();
        }
        f = paramIntent.getIntExtra("account_id", -1);
        d = paramIntent.getStringExtra("music_url");
        e = paramIntent.getStringExtra("song");
        g = paramIntent.getStringExtra("activity_id");
        this.c = new MediaPlayer();
        this.c.setOnBufferingUpdateListener(this);
        this.c.setOnCompletionListener(this);
        this.c.setOnErrorListener(this);
        this.c.setOnPreparedListener(this);
        h = getString(aau.tJ);
        c();
        new Thread(new dnf(this)).start();
        return;
      } while (!str1.equals("com.google.android.apps.plus.service.SkyjamPlaybackService.STOP"));
      str2 = paramIntent.getStringExtra("music_url");
    } while ((str2 == null) || (!str2.equals(d)));
    b();
    stopSelf();
  }
  
  public final void b()
  {
    this.b.removeCallbacks(this.m);
    if (this.c != null)
    {
      if (this.c.isPlaying()) {
        this.c.stop();
      }
      this.c.release();
      this.c = null;
    }
    h = getString(aau.tL);
    c();
    d = null;
    e = null;
    f = -1;
    g = null;
    i = 0;
    j = 0;
    this.l.cancel(27312);
  }
  
  public final void c()
  {
    String str1 = d;
    if ((str1 != null) && (this.c != null)) {}
    for (boolean bool = true;; bool = false)
    {
      String str2 = h;
      this.b.post(new dnh(this, str1, bool, str2));
      return;
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    if (Log.isLoggable("SkyjamPlaybackService", 3)) {
      new StringBuilder(23).append("buffering: ").append(paramInt).append("%");
    }
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    b();
    stopSelf();
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.l = ((NotificationManager)getSystemService("notification"));
    h = getString(aau.tL);
    this.b = new Handler(Looper.getMainLooper());
    this.k = new dmy(this.b, "SkyjamServiceThread", this);
    this.k.start();
  }
  
  public void onDestroy()
  {
    if (this.k != null)
    {
      this.k.a();
      this.k = null;
    }
    super.onDestroy();
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("SkyjamPlaybackService", 3)) {
      new StringBuilder(42).append("error: what=").append(paramInt1).append(", extra=").append(paramInt2);
    }
    b();
    stopSelf();
    return true;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    if (paramMediaPlayer == this.c)
    {
      this.c.start();
      int n = aau.tK;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = a(i);
      arrayOfObject1[1] = a(j);
      h = getString(n, arrayOfObject1);
      c();
      this.b.postDelayed(this.m, 1000L);
      int i1 = aau.tF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = e;
      String str1 = getString(i1, arrayOfObject2);
      String str2 = getString(aau.tH);
      int i2 = aau.tG;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = e;
      String str3 = getString(i2, arrayOfObject3);
      PendingIntent localPendingIntent = PendingIntent.getActivity(this, 0, efj.b(this, f, g), 134217728);
      Notification localNotification = new Notification.Builder(this).setSmallIcon(efj.wX).setContentTitle(str2).setContentText(str3).setTicker(str1).setWhen(System.currentTimeMillis()).setContentIntent(localPendingIntent).setOngoing(true).getNotification();
      this.l.notify(27312, localNotification);
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent != null) {
      this.k.a(paramIntent);
    }
    return 1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.SkyjamPlaybackService
 * JD-Core Version:    0.7.0.1
 */