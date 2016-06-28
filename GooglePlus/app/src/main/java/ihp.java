import android.annotation.TargetApi;
import android.mtp.MtpDevice;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@TargetApi(12)
public final class ihp
{
  public static final Set<Integer> a;
  public static final Set<Integer> b;
  public static final ihp f = new ihp(ihs.a);
  public MtpDevice c;
  long d;
  public volatile ihv e;
  private ihq g;
  private final iht h;
  
  static
  {
    Integer[] arrayOfInteger1 = new Integer[5];
    arrayOfInteger1[0] = Integer.valueOf(14344);
    arrayOfInteger1[1] = Integer.valueOf(14337);
    arrayOfInteger1[2] = Integer.valueOf(14347);
    arrayOfInteger1[3] = Integer.valueOf(14343);
    arrayOfInteger1[4] = Integer.valueOf(14340);
    a = Collections.unmodifiableSet(new HashSet(Arrays.asList(arrayOfInteger1)));
    Integer[] arrayOfInteger2 = new Integer[4];
    arrayOfInteger2[0] = Integer.valueOf(47492);
    arrayOfInteger2[1] = Integer.valueOf(12298);
    arrayOfInteger2[2] = Integer.valueOf(47490);
    arrayOfInteger2[3] = Integer.valueOf(12299);
    b = Collections.unmodifiableSet(new HashSet(Arrays.asList(arrayOfInteger2)));
  }
  
  private ihp(iht paramiht)
  {
    this.h = paramiht;
  }
  
  public final MtpDevice a()
  {
    try
    {
      MtpDevice localMtpDevice = this.c;
      return localMtpDevice;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final void a(MtpDevice paramMtpDevice)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 71	ihp:c	Landroid/mtp/MtpDevice;
    //   6: astore_3
    //   7: aload_1
    //   8: aload_3
    //   9: if_acmpne +6 -> 15
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: aload_0
    //   16: aload_1
    //   17: putfield 71	ihp:c	Landroid/mtp/MtpDevice;
    //   20: aload_0
    //   21: lconst_1
    //   22: aload_0
    //   23: getfield 74	ihp:d	J
    //   26: ladd
    //   27: putfield 74	ihp:d	J
    //   30: aload_0
    //   31: aconst_null
    //   32: putfield 76	ihp:e	Lihv;
    //   35: goto -23 -> 12
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	ihp
    //   0	43	1	paramMtpDevice	MtpDevice
    //   38	4	2	localObject	Object
    //   6	3	3	localMtpDevice	MtpDevice
    // Exception table:
    //   from	to	target	type
    //   2	7	38	finally
    //   15	35	38	finally
  }
  
  protected final void a(ihk paramihk, int paramInt)
  {
    try
    {
      if (this.g != null) {
        this.g.a(paramihk, paramInt);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(ihq paramihq)
  {
    try
    {
      this.g = paramihq;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected final void a(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    try
    {
      this.d = (1L + this.d);
      this.e = null;
      if (this.g != null) {
        this.g.h();
      }
      return;
    }
    finally {}
  }
  
  protected final boolean a(MtpDevice paramMtpDevice, long paramLong)
  {
    return (this.d == paramLong) && (this.c == paramMtpDevice);
  }
  
  /* Error */
  protected final boolean a(MtpDevice paramMtpDevice, long paramLong, ihv paramihv)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: aload_1
    //   7: lload_2
    //   8: invokevirtual 91	ihp:a	(Landroid/mtp/MtpDevice;J)Z
    //   11: istore 7
    //   13: iload 7
    //   15: ifne +11 -> 26
    //   18: iconst_0
    //   19: istore 5
    //   21: aload_0
    //   22: monitorexit
    //   23: iload 5
    //   25: ireturn
    //   26: aload_0
    //   27: aload 4
    //   29: putfield 76	ihp:e	Lihv;
    //   32: aload_0
    //   33: iconst_1
    //   34: invokevirtual 93	ihp:a	(Z)V
    //   37: goto -16 -> 21
    //   40: astore 6
    //   42: aload_0
    //   43: monitorexit
    //   44: aload 6
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	ihp
    //   0	47	1	paramMtpDevice	MtpDevice
    //   0	47	2	paramLong	long
    //   0	47	4	paramihv	ihv
    //   1	23	5	bool1	boolean
    //   40	5	6	localObject	Object
    //   11	3	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   5	13	40	finally
    //   26	37	40	finally
  }
  
  public final void b(ihq paramihq)
  {
    try
    {
      if (this.g == paramihq) {
        this.g = null;
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
  public final boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 71	ihp:c	Landroid/mtp/MtpDevice;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_3
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_3
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	ihp
    //   22	4	1	localObject	Object
    //   6	2	2	localMtpDevice	MtpDevice
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  /* Error */
  public final java.lang.Runnable c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 97	ihp:b	()Z
    //   6: ifeq +12 -> 18
    //   9: aload_0
    //   10: getfield 76	ihp:e	Lihv;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull +9 -> 24
    //   18: aconst_null
    //   19: astore_2
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_2
    //   23: areturn
    //   24: new 57	ihs
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 100	ihs:<init>	(Lihp;)V
    //   32: astore_2
    //   33: goto -13 -> 20
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	ihp
    //   36	4	1	localObject1	Object
    //   19	14	2	localObject2	Object
    //   13	2	3	localihv	ihv
    // Exception table:
    //   from	to	target	type
    //   2	14	36	finally
    //   24	33	36	finally
  }
  
  /* Error */
  public final boolean d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 76	ihp:e	Lihv;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_3
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_3
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	ihp
    //   22	4	1	localObject	Object
    //   6	2	2	localihv	ihv
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  protected final void e()
  {
    try
    {
      if (this.g != null) {
        this.g.g();
      }
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
 * Qualified Name:     ihp
 * JD-Core Version:    0.7.0.1
 */