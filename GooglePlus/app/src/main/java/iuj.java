public final class iuj
{
  public String a;
  public int b;
  public int c;
  public long d;
  public long e;
  public long f;
  public long g;
  public long h;
  public int i;
  private iuj j;
  
  /* Error */
  public static iuj a(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 27	iuh:a	Liuj;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +28 -> 36
    //   11: new 2	iuj
    //   14: dup
    //   15: invokespecial 28	iuj:<init>	()V
    //   18: astore_2
    //   19: aload_2
    //   20: aload_0
    //   21: putfield 30	iuj:a	Ljava/lang/String;
    //   24: aload_2
    //   25: invokestatic 36	android/os/SystemClock:elapsedRealtime	()J
    //   28: putfield 38	iuj:f	J
    //   31: ldc 2
    //   33: monitorexit
    //   34: aload_2
    //   35: areturn
    //   36: aload_2
    //   37: getfield 40	iuj:j	Liuj;
    //   40: putstatic 27	iuh:a	Liuj;
    //   43: goto -24 -> 19
    //   46: astore_1
    //   47: ldc 2
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	paramString	String
    //   46	5	1	localObject	Object
    //   6	31	2	localiuj	iuj
    // Exception table:
    //   from	to	target	type
    //   3	7	46	finally
    //   11	19	46	finally
    //   19	31	46	finally
    //   36	43	46	finally
  }
  
  private static void b(iuj paramiuj)
  {
    try
    {
      paramiuj.j = iuh.a;
      iuh.a = paramiuj;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a()
  {
    this.a = null;
    this.b = 0;
    this.c = 0;
    this.d = 0L;
    this.e = 0L;
    this.h = 0L;
    this.i = 0;
    b(this);
  }
  
  public final void a(iuj paramiuj)
  {
    this.b += paramiuj.b;
    this.c += paramiuj.c;
    this.d += paramiuj.d;
    this.e += paramiuj.e;
    this.h += paramiuj.h;
    this.i += paramiuj.i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iuj
 * JD-Core Version:    0.7.0.1
 */