import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public class hue
  implements meu, mfb, mfc, mfd
{
  private final List<huh> a = new ArrayList();
  private boolean b;
  private boolean c;
  
  public hue(mek parammek)
  {
    parammek.a(this);
  }
  
  public final hug a(Runnable paramRunnable)
  {
    try
    {
      hug localhug = a(paramRunnable, 0L);
      return localhug;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final hug a(Runnable paramRunnable, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 39	hue:c	Z
    //   6: istore 5
    //   8: iload 5
    //   10: ifeq +11 -> 21
    //   13: aconst_null
    //   14: astore 8
    //   16: aload_0
    //   17: monitorexit
    //   18: aload 8
    //   20: areturn
    //   21: new 41	huh
    //   24: dup
    //   25: aload_0
    //   26: aload_1
    //   27: lload_2
    //   28: invokespecial 44	huh:<init>	(Lhue;Ljava/lang/Runnable;J)V
    //   31: astore 6
    //   33: aload_0
    //   34: getfield 28	hue:a	Ljava/util/List;
    //   37: aload 6
    //   39: invokeinterface 50 2 0
    //   44: pop
    //   45: aload_0
    //   46: getfield 52	hue:b	Z
    //   49: ifeq +42 -> 91
    //   52: aload 6
    //   54: new 54	pdz
    //   57: dup
    //   58: getstatic 59	pea:b	Ljava/lang/ThreadLocal;
    //   61: invokevirtual 65	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   64: checkcast 67	pdd
    //   67: invokespecial 70	pdz:<init>	(Lpdd;)V
    //   70: putfield 73	huh:c	Lpdz;
    //   73: aload 6
    //   75: getfield 76	huh:b	J
    //   78: lstore 9
    //   80: invokestatic 82	efj:m	()Landroid/os/Handler;
    //   83: aload 6
    //   85: lload 9
    //   87: invokevirtual 88	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   90: pop
    //   91: aload 6
    //   93: astore 8
    //   95: goto -79 -> 16
    //   98: astore 4
    //   100: aload_0
    //   101: monitorexit
    //   102: aload 4
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	hue
    //   0	105	1	paramRunnable	Runnable
    //   0	105	2	paramLong	long
    //   98	5	4	localObject1	Object
    //   6	3	5	bool	boolean
    //   31	61	6	localhuh	huh
    //   14	80	8	localObject2	Object
    //   78	8	9	l	long
    // Exception table:
    //   from	to	target	type
    //   2	8	98	finally
    //   21	91	98	finally
  }
  
  public final void a()
  {
    try
    {
      this.b = true;
      for (int i = 0; i < this.a.size(); i++)
      {
        huh localhuh = (huh)this.a.get(i);
        localhuh.c = new pdz((pdd)pea.b.get());
        long l = localhuh.b;
        efj.m().postDelayed(localhuh, l);
      }
      return;
    }
    finally {}
  }
  
  public final void a(hug paramhug)
  {
    if (paramhug != null) {}
    try
    {
      paramhug.a();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void a(huh paramhuh)
  {
    try
    {
      this.a.remove(paramhuh);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void aK_()
  {
    try
    {
      this.b = false;
      for (int i = 0; i < this.a.size(); i++)
      {
        huh localhuh = (huh)this.a.get(i);
        efj.m().removeCallbacks(localhuh);
      }
      return;
    }
    finally {}
  }
  
  final void b(huh paramhuh)
  {
    try
    {
      this.a.remove(paramhuh);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void m_()
  {
    try
    {
      this.c = true;
      for (int i = 0; i < this.a.size(); i++)
      {
        huh localhuh = (huh)this.a.get(i);
        efj.m().removeCallbacks(localhuh);
        localhuh.d.b(localhuh);
      }
      this.a.clear();
      return;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hue
 * JD-Core Version:    0.7.0.1
 */