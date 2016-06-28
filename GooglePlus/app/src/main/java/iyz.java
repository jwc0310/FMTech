import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.google.android.libraries.social.networkqueue.impl.NetworkQueueService;

final class iyz
  implements iyl
{
  final Context a;
  final SparseArray<ize> b = new SparseArray();
  private final iyt c;
  private final boolean d;
  
  public iyz(Context paramContext, boolean paramBoolean)
  {
    this.a = paramContext.getApplicationContext();
    this.d = true;
    this.c = new iyt(paramContext);
  }
  
  public final void a()
  {
    Intent localIntent = new Intent(this.a, NetworkQueueService.class);
    localIntent.putExtra("network_queue_scheduler", 4);
    this.a.startService(localIntent);
  }
  
  public final void b(int paramInt)
  {
    Intent localIntent = new Intent(this.a, NetworkQueueService.class);
    localIntent.putExtra("network_queue_scheduler", 1);
    localIntent.putExtra("account_id", paramInt);
    this.a.startService(localIntent);
  }
  
  /* Error */
  public final ize c(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 42	iyz:c	Liyt;
    //   6: iload_1
    //   7: invokevirtual 69	iyt:a	(I)Z
    //   10: istore_3
    //   11: iload_3
    //   12: ifne +11 -> 23
    //   15: aconst_null
    //   16: astore 4
    //   18: aload_0
    //   19: monitorexit
    //   20: aload 4
    //   22: areturn
    //   23: aload_0
    //   24: getfield 25	iyz:b	Landroid/util/SparseArray;
    //   27: iload_1
    //   28: invokevirtual 73	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   31: checkcast 75	ize
    //   34: astore 4
    //   36: aload 4
    //   38: ifnonnull +31 -> 69
    //   41: new 75	ize
    //   44: dup
    //   45: aload_0
    //   46: getfield 33	iyz:a	Landroid/content/Context;
    //   49: iload_1
    //   50: aload_0
    //   51: getfield 35	iyz:d	Z
    //   54: invokespecial 78	ize:<init>	(Landroid/content/Context;IZ)V
    //   57: astore 4
    //   59: aload_0
    //   60: getfield 25	iyz:b	Landroid/util/SparseArray;
    //   63: iload_1
    //   64: aload 4
    //   66: invokevirtual 82	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   69: aload 4
    //   71: invokevirtual 85	ize:f	()V
    //   74: goto -56 -> 18
    //   77: astore_2
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_2
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	iyz
    //   0	82	1	paramInt	int
    //   77	4	2	localObject	Object
    //   10	2	3	bool	boolean
    //   16	54	4	localize	ize
    // Exception table:
    //   from	to	target	type
    //   2	11	77	finally
    //   23	36	77	finally
    //   41	69	77	finally
    //   69	74	77	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iyz
 * JD-Core Version:    0.7.0.1
 */