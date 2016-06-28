final class cto
  extends gzf
{
  private final int a;
  private final String b;
  
  public cto(ctm paramctm, int paramInt, String paramString)
  {
    super("ReadProfileHeaderTask");
    this.a = paramInt;
    this.b = paramString;
  }
  
  /* Error */
  protected final hae a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 28
    //   3: invokestatic 33	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   6: checkcast 28	jyy
    //   9: aload_0
    //   10: getfield 21	cto:a	I
    //   13: aload_0
    //   14: getfield 23	cto:b	Ljava/lang/String;
    //   17: invokeinterface 36 3 0
    //   22: astore_2
    //   23: aload_2
    //   24: invokeinterface 42 1 0
    //   29: ifeq +63 -> 92
    //   32: new 44	qtt
    //   35: dup
    //   36: invokespecial 47	qtt:<init>	()V
    //   39: astore 4
    //   41: aload_2
    //   42: aload_2
    //   43: ldc 49
    //   45: invokeinterface 53 2 0
    //   50: invokeinterface 57 2 0
    //   55: astore 5
    //   57: aload 4
    //   59: aload 5
    //   61: iconst_0
    //   62: aload 5
    //   64: arraylength
    //   65: invokestatic 62	qat:b	(Lqat;[BII)Lqat;
    //   68: pop
    //   69: aload_0
    //   70: getfield 14	cto:c	Lctm;
    //   73: aload_0
    //   74: getfield 21	cto:a	I
    //   77: aload 4
    //   79: invokevirtual 67	ctm:a	(ILqtt;)Z
    //   82: ifeq +10 -> 92
    //   85: aload_0
    //   86: getfield 14	cto:c	Lctm;
    //   89: invokestatic 70	ctm:a	(Lctm;)V
    //   92: new 72	hae
    //   95: dup
    //   96: iconst_1
    //   97: invokespecial 75	hae:<init>	(Z)V
    //   100: astore 9
    //   102: aload_2
    //   103: invokeinterface 78 1 0
    //   108: aload 9
    //   110: areturn
    //   111: astore 6
    //   113: new 72	hae
    //   116: dup
    //   117: iconst_0
    //   118: aload 6
    //   120: ldc 80
    //   122: invokespecial 83	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   125: astore 7
    //   127: aload_2
    //   128: invokeinterface 78 1 0
    //   133: aload 7
    //   135: areturn
    //   136: astore_3
    //   137: aload_2
    //   138: invokeinterface 78 1 0
    //   143: aload_3
    //   144: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	cto
    //   0	145	1	paramContext	android.content.Context
    //   22	116	2	localCursor	android.database.Cursor
    //   136	8	3	localObject	java.lang.Object
    //   39	39	4	localqtt	qtt
    //   55	8	5	arrayOfByte	byte[]
    //   111	8	6	localqas	qas
    //   125	9	7	localhae1	hae
    //   100	9	9	localhae2	hae
    // Exception table:
    //   from	to	target	type
    //   57	69	111	qas
    //   23	57	136	finally
    //   57	69	136	finally
    //   69	92	136	finally
    //   92	102	136	finally
    //   113	127	136	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cto
 * JD-Core Version:    0.7.0.1
 */