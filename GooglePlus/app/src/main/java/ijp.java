import android.location.Location;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

final class ijp
  implements fvq, ijm
{
  private CountDownLatch a;
  
  private static void a(String paramString, Object... paramVarArgs)
  {
    if (Log.isLoggable("LocationFixer", 4)) {
      String.format(Locale.US, paramString, paramVarArgs);
    }
  }
  
  public final void a(fvp paramfvp)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramfvp.a());
    a("Is location available? %s", arrayOfObject);
  }
  
  public final void a(fvw paramfvw)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Float.valueOf(paramfvw.a().getAccuracy());
    a("Received location update with accuracy %f", arrayOfObject);
    this.a.countDown();
  }
  
  /* Error */
  public final boolean a(android.content.Context paramContext, fsc paramfsc, ijn paramijn)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 82
    //   3: invokestatic 87	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   6: checkcast 82	fvv
    //   9: invokeinterface 90 1 0
    //   14: ldc2_w 91
    //   17: invokevirtual 97	fvu:a	(J)Lfvu;
    //   20: ldc2_w 98
    //   23: invokevirtual 102	fvu:b	(J)Lfvu;
    //   26: aload_3
    //   27: invokevirtual 107	ijn:a	()I
    //   30: invokevirtual 110	fvu:b	(I)Lfvu;
    //   33: aload_3
    //   34: invokevirtual 113	ijn:c	()I
    //   37: invokevirtual 115	fvu:a	(I)Lfvu;
    //   40: astore 4
    //   42: aload_1
    //   43: ldc 117
    //   45: invokestatic 87	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   48: checkcast 117	fvo
    //   51: astore 5
    //   53: new 119	android/os/HandlerThread
    //   56: dup
    //   57: ldc 121
    //   59: invokespecial 124	android/os/HandlerThread:<init>	(Ljava/lang/String;)V
    //   62: astore 6
    //   64: aload 6
    //   66: invokevirtual 127	android/os/HandlerThread:start	()V
    //   69: aload 6
    //   71: invokevirtual 131	android/os/HandlerThread:getLooper	()Landroid/os/Looper;
    //   74: astore 7
    //   76: aload_0
    //   77: new 74	java/util/concurrent/CountDownLatch
    //   80: dup
    //   81: aload_3
    //   82: invokevirtual 107	ijn:a	()I
    //   85: invokespecial 134	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   88: putfield 72	ijp:a	Ljava/util/concurrent/CountDownLatch;
    //   91: aload 5
    //   93: aload_2
    //   94: aload 4
    //   96: aload_0
    //   97: aload 7
    //   99: invokeinterface 137 5 0
    //   104: pop
    //   105: iconst_1
    //   106: anewarray 4	java/lang/Object
    //   109: astore 9
    //   111: aload 9
    //   113: iconst_0
    //   114: sipush 1000
    //   117: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   120: aastore
    //   121: ldc 144
    //   123: aload 9
    //   125: invokestatic 51	ijp:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   128: aload_0
    //   129: getfield 72	ijp:a	Ljava/util/concurrent/CountDownLatch;
    //   132: aload_3
    //   133: invokevirtual 146	ijn:b	()I
    //   136: i2l
    //   137: getstatic 152	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   140: invokevirtual 156	java/util/concurrent/CountDownLatch:await	(JLjava/util/concurrent/TimeUnit;)Z
    //   143: istore 14
    //   145: aload 5
    //   147: aload_2
    //   148: aload_0
    //   149: invokeinterface 159 3 0
    //   154: pop
    //   155: aload 7
    //   157: invokevirtual 164	android/os/Looper:quit	()V
    //   160: iload 14
    //   162: ireturn
    //   163: astore 12
    //   165: aload 5
    //   167: aload_2
    //   168: aload_0
    //   169: invokeinterface 159 3 0
    //   174: pop
    //   175: aload 7
    //   177: invokevirtual 164	android/os/Looper:quit	()V
    //   180: iconst_0
    //   181: ireturn
    //   182: astore 10
    //   184: aload 5
    //   186: aload_2
    //   187: aload_0
    //   188: invokeinterface 159 3 0
    //   193: pop
    //   194: aload 7
    //   196: invokevirtual 164	android/os/Looper:quit	()V
    //   199: aload 10
    //   201: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	ijp
    //   0	202	1	paramContext	android.content.Context
    //   0	202	2	paramfsc	fsc
    //   0	202	3	paramijn	ijn
    //   40	55	4	localfvu	fvu
    //   51	134	5	localfvo	fvo
    //   62	8	6	localHandlerThread	android.os.HandlerThread
    //   74	121	7	localLooper	android.os.Looper
    //   109	15	9	arrayOfObject	Object[]
    //   182	18	10	localObject	Object
    //   163	1	12	localInterruptedException	java.lang.InterruptedException
    //   143	18	14	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   128	145	163	java/lang/InterruptedException
    //   128	145	182	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ijp
 * JD-Core Version:    0.7.0.1
 */