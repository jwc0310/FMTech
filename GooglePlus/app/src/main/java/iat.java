import java.lang.ref.ReferenceQueue;
import java.util.HashMap;

public final class iat<K, V>
{
  private final HashMap<K, V> a = new iau(this, 16, 0.75F, true, 4);
  private final HashMap<K, iav<K, V>> b = new HashMap();
  private ReferenceQueue<V> c = new ReferenceQueue();
  
  public iat(int paramInt) {}
  
  private final void a()
  {
    for (iav localiav = (iav)this.c.poll(); localiav != null; localiav = (iav)this.c.poll()) {
      this.b.remove(localiav.a);
    }
  }
  
  /* Error */
  public final V a(K paramK, V paramV)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 52	iat:a	()V
    //   6: aload_0
    //   7: getfield 36	iat:a	Ljava/util/HashMap;
    //   10: aload_1
    //   11: aload_2
    //   12: invokevirtual 55	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   15: pop
    //   16: aload_0
    //   17: getfield 23	iat:b	Ljava/util/HashMap;
    //   20: aload_1
    //   21: new 42	iav
    //   24: dup
    //   25: aload_1
    //   26: aload_2
    //   27: aload_0
    //   28: getfield 28	iat:c	Ljava/lang/ref/ReferenceQueue;
    //   31: invokespecial 58	iav:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V
    //   34: invokevirtual 55	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   37: checkcast 42	iav
    //   40: astore 5
    //   42: aload 5
    //   44: ifnonnull +11 -> 55
    //   47: aconst_null
    //   48: astore 7
    //   50: aload_0
    //   51: monitorexit
    //   52: aload 7
    //   54: areturn
    //   55: aload 5
    //   57: invokevirtual 62	iav:get	()Ljava/lang/Object;
    //   60: astore 6
    //   62: aload 6
    //   64: astore 7
    //   66: goto -16 -> 50
    //   69: astore_3
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_3
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	iat
    //   0	74	1	paramK	K
    //   0	74	2	paramV	V
    //   69	4	3	localObject1	Object
    //   40	16	5	localiav	iav
    //   60	3	6	localObject2	Object
    //   48	17	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   2	42	69	finally
    //   55	62	69	finally
  }
  
  public final boolean a(K paramK)
  {
    try
    {
      a();
      boolean bool = this.b.containsKey(paramK);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final V b(K paramK)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 52	iat:a	()V
    //   6: aload_0
    //   7: getfield 36	iat:a	Ljava/util/HashMap;
    //   10: aload_1
    //   11: invokevirtual 68	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   14: astore_3
    //   15: aload_3
    //   16: astore 4
    //   18: aload 4
    //   20: ifnull +8 -> 28
    //   23: aload_0
    //   24: monitorexit
    //   25: aload 4
    //   27: areturn
    //   28: aload_0
    //   29: getfield 23	iat:b	Ljava/util/HashMap;
    //   32: aload_1
    //   33: invokevirtual 68	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast 42	iav
    //   39: astore 5
    //   41: aload 5
    //   43: ifnonnull +9 -> 52
    //   46: aconst_null
    //   47: astore 4
    //   49: goto -26 -> 23
    //   52: aload 5
    //   54: invokevirtual 62	iav:get	()Ljava/lang/Object;
    //   57: astore 6
    //   59: aload 6
    //   61: astore 4
    //   63: goto -40 -> 23
    //   66: astore_2
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_2
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	iat
    //   0	71	1	paramK	K
    //   66	4	2	localObject1	Object
    //   14	2	3	localObject2	Object
    //   16	46	4	localObject3	Object
    //   39	14	5	localiav	iav
    //   57	3	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	15	66	finally
    //   28	41	66	finally
    //   52	59	66	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iat
 * JD-Core Version:    0.7.0.1
 */