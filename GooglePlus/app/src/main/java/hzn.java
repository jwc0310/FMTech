import android.util.Log;
import java.util.Set;

final class hzn
{
  private Set<String> a = new fpi();
  
  public final void a(String paramString)
  {
    try
    {
      if (this.a.contains(paramString)) {
        throw new IllegalArgumentException("Experiment fetch already in progress");
      }
    }
    finally {}
    this.a.add(paramString);
  }
  
  /* Error */
  public final boolean a(android.content.Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	hzn:a	Ljava/util/Set;
    //   6: aload_2
    //   7: invokeinterface 23 2 0
    //   12: istore 4
    //   14: iload 4
    //   16: ifeq +11 -> 27
    //   19: iconst_0
    //   20: istore 11
    //   22: aload_0
    //   23: monitorexit
    //   24: iload 11
    //   26: ireturn
    //   27: new 35	hzb
    //   30: dup
    //   31: aload_1
    //   32: invokespecial 38	hzb:<init>	(Landroid/content/Context;)V
    //   35: aload_2
    //   36: invokevirtual 42	hzb:c	(Ljava/lang/String;)J
    //   39: lstore 5
    //   41: aload_1
    //   42: ldc 44
    //   44: invokestatic 49	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   47: checkcast 44	hgs
    //   50: invokeinterface 52 1 0
    //   55: lstore 7
    //   57: aload_1
    //   58: ldc 54
    //   60: invokestatic 49	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   63: checkcast 54	hyi
    //   66: getstatic 60	hyl:b	Lhyf;
    //   69: aload_2
    //   70: invokeinterface 63 3 0
    //   75: invokevirtual 68	java/lang/Long:longValue	()J
    //   78: lstore 9
    //   80: lload 7
    //   82: lload 5
    //   84: lsub
    //   85: lload 9
    //   87: lcmp
    //   88: iflt +9 -> 97
    //   91: iconst_1
    //   92: istore 11
    //   94: goto -72 -> 22
    //   97: iconst_0
    //   98: istore 11
    //   100: goto -78 -> 22
    //   103: astore_3
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_3
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	hzn
    //   0	108	1	paramContext	android.content.Context
    //   0	108	2	paramString	String
    //   103	4	3	localObject	Object
    //   12	3	4	bool1	boolean
    //   39	44	5	l1	long
    //   55	26	7	l2	long
    //   78	8	9	l3	long
    //   20	79	11	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	14	103	finally
    //   27	80	103	finally
  }
  
  public final void b(String paramString)
  {
    try
    {
      if (!this.a.remove(paramString)) {
        Log.e("ExpPreprocessor", "Trying to complete a sync that was not started.");
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void c(String paramString)
  {
    try
    {
      this.a.remove(paramString);
      Log.e("ExpPreprocessor", "Sync failed due to network error.");
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
 * Qualified Name:     hzn
 * JD-Core Version:    0.7.0.1
 */