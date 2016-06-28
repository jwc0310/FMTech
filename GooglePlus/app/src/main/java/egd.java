import java.lang.ref.WeakReference;

final class egd
  implements efh
{
  private final WeakReference<efw> a;
  private final eew<?> b;
  private final int c;
  
  public egd(efw paramefw, eew<?> parameew, int paramInt)
  {
    this.a = new WeakReference(paramefw);
    this.b = parameew;
    this.c = paramInt;
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 26	egd:a	Ljava/lang/ref/WeakReference;
    //   6: invokevirtual 35	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   9: checkcast 37	efw
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +4 -> 18
    //   17: return
    //   18: invokestatic 43	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   21: aload_3
    //   22: getfield 46	efw:a	Legl;
    //   25: getfield 52	egl:e	Landroid/os/Looper;
    //   28: if_acmpne +44 -> 72
    //   31: iload_2
    //   32: istore 4
    //   34: iload 4
    //   36: ldc 54
    //   38: invokestatic 59	efj:a	(ZLjava/lang/Object;)V
    //   41: aload_3
    //   42: getfield 62	efw:b	Ljava/util/concurrent/locks/Lock;
    //   45: invokeinterface 67 1 0
    //   50: aload_3
    //   51: iconst_0
    //   52: invokevirtual 70	efw:b	(I)Z
    //   55: istore 6
    //   57: iload 6
    //   59: ifne +19 -> 78
    //   62: aload_3
    //   63: getfield 62	efw:b	Ljava/util/concurrent/locks/Lock;
    //   66: invokeinterface 73 1 0
    //   71: return
    //   72: iconst_0
    //   73: istore 4
    //   75: goto -41 -> 34
    //   78: aload_1
    //   79: getfield 76	com/google/android/gms/common/ConnectionResult:c	I
    //   82: ifne +41 -> 123
    //   85: iload_2
    //   86: ifne +16 -> 102
    //   89: aload_3
    //   90: aload_1
    //   91: aload_0
    //   92: getfield 28	egd:b	Leew;
    //   95: aload_0
    //   96: getfield 30	egd:c	I
    //   99: invokevirtual 79	efw:b	(Lcom/google/android/gms/common/ConnectionResult;Leew;I)V
    //   102: aload_3
    //   103: invokevirtual 82	efw:e	()Z
    //   106: ifeq +7 -> 113
    //   109: aload_3
    //   110: invokevirtual 85	efw:f	()V
    //   113: aload_3
    //   114: getfield 62	efw:b	Ljava/util/concurrent/locks/Lock;
    //   117: invokeinterface 73 1 0
    //   122: return
    //   123: iconst_0
    //   124: istore_2
    //   125: goto -40 -> 85
    //   128: astore 5
    //   130: aload_3
    //   131: getfield 62	efw:b	Ljava/util/concurrent/locks/Lock;
    //   134: invokeinterface 73 1 0
    //   139: aload 5
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	egd
    //   0	142	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    //   1	124	2	bool1	boolean
    //   12	119	3	localefw	efw
    //   32	42	4	bool2	boolean
    //   128	12	5	localObject	Object
    //   55	3	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   50	57	128	finally
    //   78	85	128	finally
    //   89	102	128	finally
    //   102	113	128	finally
  }
  
  /* Error */
  public final void b(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 26	egd:a	Ljava/lang/ref/WeakReference;
    //   6: invokevirtual 35	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   9: checkcast 37	efw
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +4 -> 18
    //   17: return
    //   18: invokestatic 43	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   21: aload_3
    //   22: getfield 46	efw:a	Legl;
    //   25: getfield 52	egl:e	Landroid/os/Looper;
    //   28: if_acmpne +44 -> 72
    //   31: iload_2
    //   32: istore 4
    //   34: iload 4
    //   36: ldc 87
    //   38: invokestatic 59	efj:a	(ZLjava/lang/Object;)V
    //   41: aload_3
    //   42: getfield 62	efw:b	Ljava/util/concurrent/locks/Lock;
    //   45: invokeinterface 67 1 0
    //   50: aload_3
    //   51: iconst_1
    //   52: invokevirtual 70	efw:b	(I)Z
    //   55: istore 6
    //   57: iload 6
    //   59: ifne +19 -> 78
    //   62: aload_3
    //   63: getfield 62	efw:b	Ljava/util/concurrent/locks/Lock;
    //   66: invokeinterface 73 1 0
    //   71: return
    //   72: iconst_0
    //   73: istore 4
    //   75: goto -41 -> 34
    //   78: aload_1
    //   79: getfield 76	com/google/android/gms/common/ConnectionResult:c	I
    //   82: ifne +41 -> 123
    //   85: iload_2
    //   86: ifne +16 -> 102
    //   89: aload_3
    //   90: aload_1
    //   91: aload_0
    //   92: getfield 28	egd:b	Leew;
    //   95: aload_0
    //   96: getfield 30	egd:c	I
    //   99: invokevirtual 79	efw:b	(Lcom/google/android/gms/common/ConnectionResult;Leew;I)V
    //   102: aload_3
    //   103: invokevirtual 82	efw:e	()Z
    //   106: ifeq +7 -> 113
    //   109: aload_3
    //   110: invokevirtual 90	efw:g	()V
    //   113: aload_3
    //   114: getfield 62	efw:b	Ljava/util/concurrent/locks/Lock;
    //   117: invokeinterface 73 1 0
    //   122: return
    //   123: iconst_0
    //   124: istore_2
    //   125: goto -40 -> 85
    //   128: astore 5
    //   130: aload_3
    //   131: getfield 62	efw:b	Ljava/util/concurrent/locks/Lock;
    //   134: invokeinterface 73 1 0
    //   139: aload 5
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	egd
    //   0	142	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    //   1	124	2	bool1	boolean
    //   12	119	3	localefw	efw
    //   32	42	4	bool2	boolean
    //   128	12	5	localObject	Object
    //   55	3	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   50	57	128	finally
    //   78	85	128	finally
    //   89	102	128	finally
    //   102	113	128	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egd
 * JD-Core Version:    0.7.0.1
 */