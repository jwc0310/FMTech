import android.content.Context;
import android.util.SparseArray;

public final class bqf
  implements bwa
{
  private final Context a;
  private final SparseArray<bvz> b = new SparseArray();
  
  public bqf(Context paramContext)
  {
    this.a = paramContext;
  }
  
  /* Error */
  public final bvz a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	bqf:b	Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual 28	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   10: checkcast 30	bvz
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull +7 -> 22
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_3
    //   21: areturn
    //   22: new 32	bpz
    //   25: dup
    //   26: aload_0
    //   27: getfield 23	bqf:a	Landroid/content/Context;
    //   30: invokespecial 34	bpz:<init>	(Landroid/content/Context;)V
    //   33: astore_3
    //   34: aload_0
    //   35: getfield 21	bqf:b	Landroid/util/SparseArray;
    //   38: iload_1
    //   39: aload_3
    //   40: invokevirtual 38	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   43: goto -25 -> 18
    //   46: astore_2
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_2
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	bqf
    //   0	51	1	paramInt	int
    //   46	4	2	localObject1	Object
    //   13	27	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	46	finally
    //   22	43	46	finally
  }
  
  public final bvz b(int paramInt)
  {
    return (bvz)this.b.get(paramInt);
  }
  
  public final void c(int paramInt)
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
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqf
 * JD-Core Version:    0.7.0.1
 */