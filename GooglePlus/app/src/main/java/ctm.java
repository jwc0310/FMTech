import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;

final class ctm
  implements gmc
{
  private final Context a;
  private final SparseArray<qtt> b = new SparseArray();
  
  ctm(Context paramContext)
  {
    this.a = paramContext;
    Uri localUri = ((jyx)mbb.a(paramContext, jyx.class)).a();
    paramContext.getContentResolver().registerContentObserver(localUri, false, new ctn(this));
  }
  
  /* Error */
  private final String b(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	ctm:b	Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual 64	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   10: checkcast 66	qtt
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull +14 -> 29
    //   18: aload_3
    //   19: getfield 69	qtt:b	Ljava/lang/String;
    //   22: astore 4
    //   24: aload_0
    //   25: monitorexit
    //   26: aload 4
    //   28: areturn
    //   29: ldc 71
    //   31: astore 4
    //   33: goto -9 -> 24
    //   36: astore_2
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_2
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	ctm
    //   0	41	1	paramInt	int
    //   36	4	2	localObject	Object
    //   13	6	3	localqtt	qtt
    //   22	10	4	str	String
    // Exception table:
    //   from	to	target	type
    //   2	14	36	finally
    //   18	24	36	finally
  }
  
  public final String a(int paramInt)
  {
    giz localgiz = (giz)mbb.a(this.a, giz.class);
    if ((paramInt == -1) || (!localgiz.c(paramInt))) {
      return "https://lh6.googleusercontent.com/-5vG8ole8nAI/UYFKqb0Y7YI/AAAAAAAABiA/YQzKopOzN1g/w0-h0/default_cover_1_c07bbaef481e775be41b71cecbb5cd60.jpg";
    }
    String str = localgiz.a(paramInt).b("gaia_id");
    if (str == null) {
      return "https://lh6.googleusercontent.com/-5vG8ole8nAI/UYFKqb0Y7YI/AAAAAAAABiA/YQzKopOzN1g/w0-h0/default_cover_1_c07bbaef481e775be41b71cecbb5cd60.jpg";
    }
    gzj.a(this.a, new cto(this, paramInt, str));
    return b(paramInt);
  }
  
  /* Error */
  final boolean a(int paramInt, qtt paramqtt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	ctm:b	Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual 64	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   10: checkcast 66	qtt
    //   13: astore 4
    //   15: aload 4
    //   17: ifnull +30 -> 47
    //   20: aload 4
    //   22: getfield 69	qtt:b	Ljava/lang/String;
    //   25: aload_2
    //   26: getfield 69	qtt:b	Ljava/lang/String;
    //   29: invokevirtual 106	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +11 -> 47
    //   39: iconst_0
    //   40: istore 6
    //   42: aload_0
    //   43: monitorexit
    //   44: iload 6
    //   46: ireturn
    //   47: aload_0
    //   48: getfield 21	ctm:b	Landroid/util/SparseArray;
    //   51: iload_1
    //   52: aload_2
    //   53: invokevirtual 110	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   56: iconst_1
    //   57: istore 6
    //   59: goto -17 -> 42
    //   62: astore_3
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_3
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	ctm
    //   0	67	1	paramInt	int
    //   0	67	2	paramqtt	qtt
    //   62	4	3	localObject	Object
    //   13	8	4	localqtt	qtt
    //   32	3	5	bool1	boolean
    //   40	18	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	15	62	finally
    //   20	34	62	finally
    //   47	56	62	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctm
 * JD-Core Version:    0.7.0.1
 */