import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.android.libraries.social.networkqueue.impl.ConnectivityReceiver;
import com.google.android.libraries.social.networkqueue.impl.NetworkQueueAlarmReceiver;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class izi
  implements Runnable
{
  private static final Object a = new Object();
  private static final long b = TimeUnit.SECONDS.toMillis(5L);
  private static final long c = TimeUnit.MILLISECONDS.toMillis(50L);
  private static final long[] d;
  private static PowerManager.WakeLock e;
  private final Context f;
  private final iyk g;
  private final ixf h;
  private final izj i;
  private final ComponentName j;
  private final Random k;
  private final iyp l;
  private Handler m;
  private HandlerThread n;
  private volatile boolean o;
  private boolean p;
  private int q;
  
  static
  {
    long[] arrayOfLong = new long[5];
    arrayOfLong[0] = TimeUnit.SECONDS.toMillis(30L);
    arrayOfLong[1] = TimeUnit.MINUTES.toMillis(2L);
    arrayOfLong[2] = TimeUnit.MINUTES.toMillis(4L);
    arrayOfLong[3] = TimeUnit.MINUTES.toMillis(10L);
    arrayOfLong[4] = TimeUnit.MINUTES.toMillis(20L);
    d = arrayOfLong;
  }
  
  public izi(Context paramContext, iyk paramiyk, izj paramizj)
  {
    if (paramContext == null) {
      throw new NullPointerException();
    }
    if (paramiyk == null) {
      throw new NullPointerException();
    }
    if (paramizj == null) {
      throw new NullPointerException();
    }
    this.f = paramContext.getApplicationContext();
    this.i = paramizj;
    this.g = paramiyk;
    this.h = ((ixf)mbb.a(paramContext, ixf.class));
    this.l = new iyp();
    this.k = new Random();
    this.j = new ComponentName(paramContext, ConnectivityReceiver.class);
    this.p = true;
    synchronized (a)
    {
      if (e == null) {
        e = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "network_queue_process_wakelock");
      }
      return;
    }
  }
  
  private final void a(long paramLong)
  {
    this.o = true;
    if (paramLong < 1L)
    {
      this.o = true;
      this.m.post(this);
      return;
    }
    if (paramLong < b) {
      paramLong = b;
    }
    if (Log.isLoggable("NetworkQueueProcessJob", 4)) {
      new StringBuilder(40).append("Setting alarm for ").append(paramLong).append("ms");
    }
    NetworkQueueAlarmReceiver.a(this.f, this.g.b(), paramLong);
  }
  
  /* Error */
  private final boolean b()
  {
    // Byte code:
    //   0: getstatic 66	izi:c	J
    //   3: invokestatic 196	java/lang/Thread:sleep	(J)V
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield 146	izi:o	Z
    //   12: ifne +28 -> 40
    //   15: aload_0
    //   16: getfield 148	izi:m	Landroid/os/Handler;
    //   19: ifnull +21 -> 40
    //   22: aload_0
    //   23: getfield 198	izi:n	Landroid/os/HandlerThread;
    //   26: invokevirtual 203	android/os/HandlerThread:quit	()Z
    //   29: pop
    //   30: aload_0
    //   31: aconst_null
    //   32: putfield 198	izi:n	Landroid/os/HandlerThread;
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 148	izi:m	Landroid/os/Handler;
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_0
    //   43: getfield 95	izi:i	Lizj;
    //   46: aload_0
    //   47: aload_0
    //   48: getfield 97	izi:g	Liyk;
    //   51: invokevirtual 208	izj:a	(Lizi;Liyk;)V
    //   54: aload_0
    //   55: getfield 146	izi:o	Z
    //   58: ifne +128 -> 186
    //   61: iconst_1
    //   62: ireturn
    //   63: astore 7
    //   65: aload_0
    //   66: monitorexit
    //   67: aload 7
    //   69: athrow
    //   70: astore 4
    //   72: aload_0
    //   73: monitorenter
    //   74: aload_0
    //   75: getfield 146	izi:o	Z
    //   78: ifne +28 -> 106
    //   81: aload_0
    //   82: getfield 148	izi:m	Landroid/os/Handler;
    //   85: ifnull +21 -> 106
    //   88: aload_0
    //   89: getfield 198	izi:n	Landroid/os/HandlerThread;
    //   92: invokevirtual 203	android/os/HandlerThread:quit	()Z
    //   95: pop
    //   96: aload_0
    //   97: aconst_null
    //   98: putfield 198	izi:n	Landroid/os/HandlerThread;
    //   101: aload_0
    //   102: aconst_null
    //   103: putfield 148	izi:m	Landroid/os/Handler;
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_0
    //   109: getfield 95	izi:i	Lizj;
    //   112: aload_0
    //   113: aload_0
    //   114: getfield 97	izi:g	Liyk;
    //   117: invokevirtual 208	izj:a	(Lizi;Liyk;)V
    //   120: goto -66 -> 54
    //   123: astore 5
    //   125: aload_0
    //   126: monitorexit
    //   127: aload 5
    //   129: athrow
    //   130: astore_1
    //   131: aload_0
    //   132: monitorenter
    //   133: aload_0
    //   134: getfield 146	izi:o	Z
    //   137: ifne +28 -> 165
    //   140: aload_0
    //   141: getfield 148	izi:m	Landroid/os/Handler;
    //   144: ifnull +21 -> 165
    //   147: aload_0
    //   148: getfield 198	izi:n	Landroid/os/HandlerThread;
    //   151: invokevirtual 203	android/os/HandlerThread:quit	()Z
    //   154: pop
    //   155: aload_0
    //   156: aconst_null
    //   157: putfield 198	izi:n	Landroid/os/HandlerThread;
    //   160: aload_0
    //   161: aconst_null
    //   162: putfield 148	izi:m	Landroid/os/Handler;
    //   165: aload_0
    //   166: monitorexit
    //   167: aload_0
    //   168: getfield 95	izi:i	Lizj;
    //   171: aload_0
    //   172: aload_0
    //   173: getfield 97	izi:g	Liyk;
    //   176: invokevirtual 208	izj:a	(Lizi;Liyk;)V
    //   179: aload_1
    //   180: athrow
    //   181: astore_2
    //   182: aload_0
    //   183: monitorexit
    //   184: aload_2
    //   185: athrow
    //   186: iconst_0
    //   187: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	this	izi
    //   130	50	1	localObject1	Object
    //   181	4	2	localObject2	Object
    //   70	1	4	localInterruptedException	java.lang.InterruptedException
    //   123	5	5	localObject3	Object
    //   63	5	7	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   8	40	63	finally
    //   40	42	63	finally
    //   65	67	63	finally
    //   0	6	70	java/lang/InterruptedException
    //   74	106	123	finally
    //   106	108	123	finally
    //   125	127	123	finally
    //   0	6	130	finally
    //   133	165	181	finally
    //   165	167	181	finally
    //   182	184	181	finally
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    try
    {
      if (Log.isLoggable("NetworkQueueProcessJob", 4))
      {
        long l1 = paramLong / 1000L;
        new StringBuilder(43).append("Scheduling in ").append(l1).append(" seconds.");
        new StringBuilder(28).append("Retry on IOExceptions: ").append(paramBoolean);
      }
      if (this.m == null)
      {
        this.n = new HandlerThread("NetworkQueueProcessor", 10);
        this.n.start();
        this.m = new Handler(this.n.getLooper());
      }
      a(this.f);
      this.p = paramBoolean;
      a(paramLong);
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 146	izi:o	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifne +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 146	izi:o	Z
    //   19: aload_1
    //   20: invokevirtual 244	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   23: aload_0
    //   24: getfield 125	izi:j	Landroid/content/ComponentName;
    //   27: iconst_2
    //   28: iconst_1
    //   29: invokevirtual 250	android/content/pm/PackageManager:setComponentEnabledSetting	(Landroid/content/ComponentName;II)V
    //   32: aload_1
    //   33: aload_0
    //   34: getfield 97	izi:g	Liyk;
    //   37: invokeinterface 183 1 0
    //   42: invokestatic 253	com/google/android/libraries/social/networkqueue/impl/NetworkQueueAlarmReceiver:a	(Landroid/content/Context;I)V
    //   45: aload_0
    //   46: getfield 148	izi:m	Landroid/os/Handler;
    //   49: aload_0
    //   50: invokevirtual 257	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   53: goto -42 -> 11
    //   56: astore_2
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_2
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	izi
    //   0	61	1	paramContext	Context
    //   56	4	2	localObject	Object
    //   6	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	56	finally
    //   14	53	56	finally
  }
  
  public final boolean a()
  {
    return this.g.a() > 0;
  }
  
  public final void run()
  {
    int i1 = 1;
    for (;;)
    {
      try
      {
        e.acquire();
        if (this.h.a())
        {
          this.o = false;
          this.g.a(this.l);
          if (this.l.a != 0)
          {
            if ((i1 != 0) && (this.p))
            {
              this.q = (1 + this.q);
              int i2 = Math.min(-1 + this.q, -1 + d.length);
              long l2 = d[i2];
              int i3 = this.k.nextInt(15);
              l1 = l2 + TimeUnit.MILLISECONDS.convert(i3, TimeUnit.SECONDS);
              if (Log.isLoggable("NetworkQueueProcessJob", 4)) {
                new StringBuilder(69).append("Process had an IOException.  Retrying again in ").append(l1).append("ms");
              }
              if (l1 > 0L) {
                a(l1);
              }
            }
          }
          else
          {
            i1 = 0;
            continue;
          }
          if (b()) {
            this.f.getPackageManager().setComponentEnabledSetting(this.j, 2, 1);
          }
        }
        else
        {
          b();
          this.f.getPackageManager().setComponentEnabledSetting(this.j, 1, 1);
          l1 = 0L;
          continue;
        }
        long l1 = 0L;
      }
      finally
      {
        e.release();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izi
 * JD-Core Version:    0.7.0.1
 */