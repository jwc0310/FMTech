import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class fdl
{
  public static final long a = TimeUnit.SECONDS.toMillis(1L);
  private static final String g = fdl.class.getSimpleName();
  private static fdl h;
  public final Handler b;
  public final Runnable c = new fdm(this);
  public final Object d = new Object();
  public ArrayList<String> e = null;
  public ArrayList<String> f = null;
  private final Context i;
  
  private fdl(Context paramContext)
  {
    this((Context)efj.a(paramContext), new Handler(Looper.getMainLooper()));
  }
  
  private fdl(Context paramContext, Handler paramHandler)
  {
    this.i = paramContext;
    this.b = paramHandler;
  }
  
  /* Error */
  public static fdl a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 51	efj:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   7: pop
    //   8: getstatic 93	android/os/Build$VERSION:SDK_INT	I
    //   11: istore_3
    //   12: iload_3
    //   13: bipush 14
    //   15: if_icmpge +12 -> 27
    //   18: aconst_null
    //   19: astore 4
    //   21: ldc 2
    //   23: monitorexit
    //   24: aload 4
    //   26: areturn
    //   27: getstatic 95	fdl:h	Lfdl;
    //   30: ifnonnull +17 -> 47
    //   33: new 2	fdl
    //   36: dup
    //   37: aload_0
    //   38: invokevirtual 99	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   41: invokespecial 101	fdl:<init>	(Landroid/content/Context;)V
    //   44: putstatic 95	fdl:h	Lfdl;
    //   47: getstatic 95	fdl:h	Lfdl;
    //   50: astore 4
    //   52: goto -31 -> 21
    //   55: astore_1
    //   56: ldc 2
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	paramContext	Context
    //   55	5	1	localObject	Object
    //   11	5	3	j	int
    //   19	32	4	localfdl	fdl
    // Exception table:
    //   from	to	target	type
    //   3	12	55	finally
    //   27	47	55	finally
    //   47	52	55	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdl
 * JD-Core Version:    0.7.0.1
 */