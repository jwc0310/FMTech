public final class jso
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
  private jso j;
  
  /* Error */
  public static jso a(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 27	jsm:a	Ljso;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +28 -> 36
    //   11: new 2	jso
    //   14: dup
    //   15: invokespecial 28	jso:<init>	()V
    //   18: astore_2
    //   19: aload_2
    //   20: aload_0
    //   21: putfield 30	jso:a	Ljava/lang/String;
    //   24: aload_2
    //   25: invokestatic 36	android/os/SystemClock:elapsedRealtime	()J
    //   28: putfield 38	jso:f	J
    //   31: ldc 2
    //   33: monitorexit
    //   34: aload_2
    //   35: areturn
    //   36: aload_2
    //   37: getfield 40	jso:j	Ljso;
    //   40: putstatic 27	jsm:a	Ljso;
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
    //   6	31	2	localjso	jso
    // Exception table:
    //   from	to	target	type
    //   3	7	46	finally
    //   11	19	46	finally
    //   19	31	46	finally
    //   36	43	46	finally
  }
  
  private static void b(jso paramjso)
  {
    try
    {
      paramjso.j = jsm.a;
      jsm.a = paramjso;
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
  
  public final void a(jso paramjso)
  {
    this.b += paramjso.b;
    this.c += paramjso.c;
    this.d += paramjso.d;
    this.e += paramjso.e;
    this.h += paramjso.h;
    this.i += paramjso.i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jso
 * JD-Core Version:    0.7.0.1
 */