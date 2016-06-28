public final class ibr<T>
  implements aip, ibo, Runnable
{
  private ibn<T> a;
  private x b;
  private volatile boolean c;
  private int d;
  
  public ibr(ibn<T> paramibn, x paramx)
  {
    this.a = paramx;
    Object localObject;
    this.b = localObject;
  }
  
  /* Error */
  private final boolean a(ibq paramibq)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	ibr:c	Z
    //   6: pop
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: monitorenter
    //   11: aload_1
    //   12: getfield 42	ibq:a	I
    //   15: ifle +26 -> 41
    //   18: aload_1
    //   19: iconst_m1
    //   20: aload_1
    //   21: getfield 42	ibq:a	I
    //   24: iadd
    //   25: putfield 42	ibq:a	I
    //   28: aload_1
    //   29: monitorexit
    //   30: aload_0
    //   31: monitorenter
    //   32: aload_0
    //   33: monitorexit
    //   34: iconst_1
    //   35: ireturn
    //   36: astore_2
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_2
    //   40: athrow
    //   41: aload_1
    //   42: invokevirtual 45	java/lang/Object:wait	()V
    //   45: aload_1
    //   46: monitorexit
    //   47: goto -47 -> 0
    //   50: astore 4
    //   52: aload_1
    //   53: monitorexit
    //   54: aload 4
    //   56: athrow
    //   57: astore 6
    //   59: aload_0
    //   60: monitorexit
    //   61: aload 6
    //   63: athrow
    //   64: astore 5
    //   66: goto -21 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	ibr
    //   0	69	1	paramibq	ibq
    //   36	4	2	localObject1	Object
    //   50	5	4	localObject2	Object
    //   64	1	5	localInterruptedException	java.lang.InterruptedException
    //   57	5	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	36	finally
    //   37	39	36	finally
    //   11	30	50	finally
    //   41	45	50	finally
    //   45	47	50	finally
    //   52	54	50	finally
    //   32	34	57	finally
    //   59	61	57	finally
    //   41	45	64	java/lang/InterruptedException
  }
  
  private final ibq b(int paramInt)
  {
    if (paramInt == 1) {
      return this.e.a;
    }
    if (paramInt == 2) {
      return this.e.b;
    }
    return null;
  }
  
  public final boolean a(int paramInt)
  {
    ibq localibq1 = b(this.d);
    if (localibq1 != null) {}
    try
    {
      localibq1.a = (1 + localibq1.a);
      localibq1.notifyAll();
      this.d = 0;
      ibq localibq2 = b(paramInt);
      if (localibq2 == null) {
        break label68;
      }
      if (!a(localibq2)) {
        return false;
      }
    }
    finally {}
    this.d = paramInt;
    label68:
    return true;
  }
  
  public final void run()
  {
    if (a(1)) {}
    try
    {
      this.a.a(this);
      try
      {
        label17:
        a(0);
        notifyAll();
        return;
      }
      finally {}
    }
    catch (Throwable localThrowable)
    {
      break label17;
    }
  }
}
// INTERNAL ERROR //

/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibr
 * JD-Core Version:    0.7.0.1
 */