import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class lkg
{
  final otk a;
  final pie b;
  final lje c;
  final rgq<ljc> d;
  final oxb e;
  private final Set<Integer> f;
  
  lkg(otk paramotk, pie parampie, oxb paramoxb, lje paramlje, rgq<ljc> paramrgq)
  {
    this.a = paramotk;
    this.b = parampie;
    this.e = paramoxb;
    this.c = paramlje;
    this.d = paramrgq;
    this.f = new HashSet();
  }
  
  public final owp<pfk<lke>, String> a(int paramInt1, llf paramllf, List<rac> paramList, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return new lkh(this, paramInt1, paramInt2, paramInt3, true, paramllf, paramList);
  }
  
  public final owp<pfk<lke>, String> a(llf paramllf, List<rac> paramList)
  {
    return new lkp(this, paramllf.a(), paramllf, paramList);
  }
  
  /* Error */
  final boolean a(Integer paramInteger)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	lkg:f	Ljava/util/Set;
    //   6: aload_1
    //   7: invokeinterface 74 2 0
    //   12: istore_3
    //   13: iload_3
    //   14: ifeq +11 -> 25
    //   17: iconst_1
    //   18: istore 5
    //   20: aload_0
    //   21: monitorexit
    //   22: iload 5
    //   24: ireturn
    //   25: aload_0
    //   26: getfield 38	lkg:f	Ljava/util/Set;
    //   29: aload_1
    //   30: invokeinterface 77 2 0
    //   35: pop
    //   36: iconst_0
    //   37: istore 5
    //   39: goto -19 -> 20
    //   42: astore_2
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_2
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	lkg
    //   0	47	1	paramInteger	Integer
    //   42	4	2	localObject	Object
    //   12	2	3	bool1	boolean
    //   18	20	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	13	42	finally
    //   25	36	42	finally
  }
  
  final void b(Integer paramInteger)
  {
    try
    {
      this.f.remove(paramInteger);
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
 * Qualified Name:     lkg
 * JD-Core Version:    0.7.0.1
 */