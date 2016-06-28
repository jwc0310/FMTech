import android.os.ConditionVariable;

public final class lmw
{
  public static final lmw a = new lmw();
  public boolean b;
  public final ConditionVariable c = new ConditionVariable(true);
  private String d;
  private int e = -1;
  private lmx f;
  
  public final lmx a(int paramInt, String paramString)
  {
    try
    {
      lmx locallmx = b(paramInt, paramString);
      a(true);
      return locallmx;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a()
  {
    try
    {
      this.f = null;
      this.d = null;
      this.e = -1;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(int paramInt, String paramString, lmx paramlmx)
  {
    try
    {
      if (!this.b)
      {
        this.e = paramInt;
        this.d = paramString;
        this.f = paramlmx;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      this.b = paramBoolean;
      if (this.b) {
        a();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final long b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	lmw:f	Llmx;
    //   6: ifnull +22 -> 28
    //   9: aload_0
    //   10: getfield 40	lmw:f	Llmx;
    //   13: getfield 53	lmx:b	Ljava/lang/Long;
    //   16: invokevirtual 58	java/lang/Long:longValue	()J
    //   19: lstore 4
    //   21: lload 4
    //   23: lstore_2
    //   24: aload_0
    //   25: monitorexit
    //   26: lload_2
    //   27: lreturn
    //   28: lconst_0
    //   29: lstore_2
    //   30: goto -6 -> 24
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	lmw
    //   33	4	1	localObject	Object
    //   23	7	2	l1	long
    //   19	3	4	l2	long
    // Exception table:
    //   from	to	target	type
    //   2	21	33	finally
  }
  
  /* Error */
  public final lmx b(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: aload_0
    //   4: getfield 26	lmw:e	I
    //   7: if_icmpne +25 -> 32
    //   10: aload_2
    //   11: aload_0
    //   12: getfield 42	lmw:d	Ljava/lang/String;
    //   15: invokestatic 64	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   18: ifeq +14 -> 32
    //   21: aload_0
    //   22: getfield 40	lmw:f	Llmx;
    //   25: astore 4
    //   27: aload_0
    //   28: monitorexit
    //   29: aload 4
    //   31: areturn
    //   32: aconst_null
    //   33: astore 4
    //   35: goto -8 -> 27
    //   38: astore_3
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_3
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	lmw
    //   0	43	1	paramInt	int
    //   0	43	2	paramString	String
    //   38	4	3	localObject	Object
    //   25	9	4	locallmx	lmx
    // Exception table:
    //   from	to	target	type
    //   2	27	38	finally
  }
  
  public final void c()
  {
    try
    {
      this.c.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmw
 * JD-Core Version:    0.7.0.1
 */