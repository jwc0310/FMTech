import android.content.Context;

public class bnh
  extends gzf
{
  private static bmb a;
  private final int b;
  private final ijs c;
  private final lmg d;
  
  public bnh(Context paramContext, int paramInt, ijs paramijs, lmg paramlmg)
  {
    super(paramContext, "GetNearbyLocationsTask");
    this.b = paramInt;
    this.c = paramijs;
    this.d = null;
  }
  
  /* Error */
  protected final hae a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 28	bnh:a	Lbmb;
    //   6: ifnull +18 -> 24
    //   9: getstatic 28	bnh:a	Lbmb;
    //   12: getfield 34	kbw:u	Z
    //   15: ifne +9 -> 24
    //   18: getstatic 28	bnh:a	Lbmb;
    //   21: invokevirtual 40	bmb:j	()V
    //   24: aload_0
    //   25: getfield 44	gzf:e	Landroid/content/Context;
    //   28: ldc 46
    //   30: invokestatic 51	efj:e	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   33: pop
    //   34: new 36	bmb
    //   37: dup
    //   38: aload_0
    //   39: getfield 44	gzf:e	Landroid/content/Context;
    //   42: aload_0
    //   43: getfield 21	bnh:b	I
    //   46: aload_0
    //   47: getfield 23	bnh:c	Lijs;
    //   50: aload_0
    //   51: getfield 25	bnh:d	Llmg;
    //   54: iconst_1
    //   55: invokespecial 54	bmb:<init>	(Landroid/content/Context;ILijs;Llmg;Z)V
    //   58: astore_3
    //   59: aload_3
    //   60: putstatic 28	bnh:a	Lbmb;
    //   63: ldc 2
    //   65: monitorexit
    //   66: aload_3
    //   67: invokevirtual 57	kbw:i	()V
    //   70: ldc 2
    //   72: monitorenter
    //   73: aconst_null
    //   74: putstatic 28	bnh:a	Lbmb;
    //   77: ldc 2
    //   79: monitorexit
    //   80: aload_3
    //   81: getfield 34	kbw:u	Z
    //   84: ifeq +30 -> 114
    //   87: new 59	hae
    //   90: dup
    //   91: sipush 200
    //   94: aconst_null
    //   95: aconst_null
    //   96: invokespecial 62	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   99: areturn
    //   100: astore_1
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: astore 4
    //   108: ldc 2
    //   110: monitorexit
    //   111: aload 4
    //   113: athrow
    //   114: aload_3
    //   115: getfield 65	kbw:o	I
    //   118: istore 5
    //   120: aload_3
    //   121: getfield 69	kbw:q	Ljava/lang/Exception;
    //   124: astore 6
    //   126: aload_3
    //   127: invokevirtual 73	kbw:n	()Z
    //   130: ifeq +39 -> 169
    //   133: aload_0
    //   134: getfield 44	gzf:e	Landroid/content/Context;
    //   137: ldc 46
    //   139: invokestatic 51	efj:e	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   142: pop
    //   143: aload_0
    //   144: getfield 44	gzf:e	Landroid/content/Context;
    //   147: getstatic 78	aau:dt	I
    //   150: invokevirtual 84	android/content/Context:getString	(I)Ljava/lang/String;
    //   153: astore 7
    //   155: new 59	hae
    //   158: dup
    //   159: iload 5
    //   161: aload 6
    //   163: aload 7
    //   165: invokespecial 62	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   168: areturn
    //   169: aconst_null
    //   170: astore 7
    //   172: goto -17 -> 155
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	bnh
    //   100	5	1	localObject1	java.lang.Object
    //   58	69	3	localbmb	bmb
    //   106	6	4	localObject2	java.lang.Object
    //   118	42	5	i	int
    //   124	38	6	localException	java.lang.Exception
    //   153	18	7	str	java.lang.String
    // Exception table:
    //   from	to	target	type
    //   3	24	100	finally
    //   24	66	100	finally
    //   101	104	100	finally
    //   73	80	106	finally
    //   108	111	106	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnh
 * JD-Core Version:    0.7.0.1
 */