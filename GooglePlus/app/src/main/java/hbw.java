import android.util.SparseArray;

public final class hbw
{
  static final ojl a;
  private final SparseArray<hbx> b = new SparseArray();
  
  static
  {
    ojl localojl = new ojl();
    a = localojl;
    localojl.c = Boolean.valueOf(true);
  }
  
  final void a(int paramInt)
  {
    try
    {
      this.b.remove(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  @android.annotation.TargetApi(11)
  public final void a(android.content.Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 34	hbw:b	Landroid/util/SparseArray;
    //   6: iload_2
    //   7: invokevirtual 46	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   10: ifnonnull +47 -> 57
    //   13: new 48	hbx
    //   16: dup
    //   17: aload_0
    //   18: aload_1
    //   19: iload_2
    //   20: invokespecial 51	hbx:<init>	(Lhbw;Landroid/content/Context;I)V
    //   23: astore 4
    //   25: aload_0
    //   26: getfield 34	hbw:b	Landroid/util/SparseArray;
    //   29: iload_2
    //   30: aload 4
    //   32: invokevirtual 55	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   35: getstatic 61	android/os/Build$VERSION:SDK_INT	I
    //   38: bipush 11
    //   40: if_icmpge +20 -> 60
    //   43: aload 4
    //   45: iconst_1
    //   46: anewarray 63	java/lang/Void
    //   49: dup
    //   50: iconst_0
    //   51: aconst_null
    //   52: aastore
    //   53: invokevirtual 67	hbx:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   56: pop
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: aload 4
    //   62: getstatic 73	android/os/AsyncTask:THREAD_POOL_EXECUTOR	Ljava/util/concurrent/Executor;
    //   65: iconst_1
    //   66: anewarray 63	java/lang/Void
    //   69: dup
    //   70: iconst_0
    //   71: aconst_null
    //   72: aastore
    //   73: invokevirtual 77	hbx:executeOnExecutor	(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   76: pop
    //   77: goto -20 -> 57
    //   80: astore_3
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_3
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	hbw
    //   0	85	1	paramContext	android.content.Context
    //   0	85	2	paramInt	int
    //   80	4	3	localObject	Object
    //   23	38	4	localhbx	hbx
    // Exception table:
    //   from	to	target	type
    //   2	57	80	finally
    //   60	77	80	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbw
 * JD-Core Version:    0.7.0.1
 */