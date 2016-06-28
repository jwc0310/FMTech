import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public abstract class mbw<T extends mbu>
  implements mbk, mbo, mfa, mfd
{
  private mek a;
  private Set<String> b = new HashSet();
  private final Class c;
  private mbv<T> d;
  
  public mbw(mek parammek, Class paramClass)
  {
    this.a = parammek;
    this.c = paramClass;
    parammek.a(this);
  }
  
  public abstract mbv<T> a(Context paramContext);
  
  /* Error */
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 37	mbw:c	Ljava/lang/Class;
    //   6: astore 5
    //   8: aload_2
    //   9: aload 5
    //   11: if_acmpne +6 -> 17
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield 46	mbw:d	Lmbv;
    //   21: ifnonnull +12 -> 33
    //   24: aload_0
    //   25: aload_0
    //   26: aload_1
    //   27: invokevirtual 48	mbw:a	(Landroid/content/Context;)Lmbv;
    //   30: putfield 46	mbw:d	Lmbv;
    //   33: aload_2
    //   34: invokevirtual 54	java/lang/Class:getName	()Ljava/lang/String;
    //   37: astore 6
    //   39: aload_0
    //   40: getfield 46	mbw:d	Lmbv;
    //   43: aload_2
    //   44: invokevirtual 59	mbv:a	(Ljava/lang/Class;)Ljava/util/List;
    //   47: astore 7
    //   49: aload 7
    //   51: ifnull -37 -> 14
    //   54: aload_0
    //   55: getfield 33	mbw:b	Ljava/util/Set;
    //   58: aload 6
    //   60: invokeinterface 65 2 0
    //   65: pop
    //   66: aload 7
    //   68: invokeinterface 71 1 0
    //   73: astore 9
    //   75: aload 9
    //   77: invokeinterface 77 1 0
    //   82: ifeq -68 -> 14
    //   85: aload_0
    //   86: aload 9
    //   88: invokeinterface 81 1 0
    //   93: checkcast 83	mbu
    //   96: aload_0
    //   97: getfield 35	mbw:a	Lmek;
    //   100: aload_3
    //   101: invokevirtual 86	mbw:a	(Lmbu;Lmek;Lmbb;)V
    //   104: goto -29 -> 75
    //   107: astore 4
    //   109: aload_0
    //   110: monitorexit
    //   111: aload 4
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	mbw
    //   0	114	1	paramContext	Context
    //   0	114	2	paramClass	Class<?>
    //   0	114	3	parammbb	mbb
    //   107	5	4	localObject	Object
    //   6	4	5	localClass	Class
    //   37	22	6	str	String
    //   47	20	7	localList	java.util.List
    //   73	14	9	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   2	8	107	finally
    //   17	33	107	finally
    //   33	49	107	finally
    //   54	75	107	finally
    //   75	104	107	finally
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      String[] arrayOfString = paramBundle.getStringArray("extra_auto_bound_objects");
      int i = arrayOfString.length;
      int j = 0;
      for (;;)
      {
        if (j < i)
        {
          String str = arrayOfString[j];
          try
          {
            parammbb.a(Class.forName(str));
            j++;
          }
          catch (ClassNotFoundException localClassNotFoundException)
          {
            for (;;)
            {
              Log.e("BaseAutoBinderModule", "Autobound class not found upon reconstruction", localClassNotFoundException);
            }
          }
        }
      }
    }
  }
  
  public abstract void a(T paramT, mek parammek, mbb parammbb);
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putStringArray("extra_auto_bound_objects", (String[])this.b.toArray(new String[this.b.size()]));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbw
 * JD-Core Version:    0.7.0.1
 */