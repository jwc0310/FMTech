import android.content.Context;

final class jke
  extends gzf
{
  private final jkg a;
  private final fyq b;
  
  jke(Context paramContext, jkg paramjkg, fyq paramfyq)
  {
    super(paramContext, "UpdateCirclesTask");
    this.a = paramjkg;
    this.b = paramfyq;
  }
  
  /* Error */
  protected final hae a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 17	jke:a	Ljkg;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 19	jke:b	Lfyq;
    //   11: astore_3
    //   12: invokestatic 25	jid:a	()Z
    //   15: ifeq +133 -> 148
    //   18: iconst_2
    //   19: anewarray 27	java/lang/Object
    //   22: astore 15
    //   24: aload 15
    //   26: iconst_0
    //   27: aload_3
    //   28: invokeinterface 33 1 0
    //   33: invokeinterface 36 1 0
    //   38: invokestatic 42	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   41: aastore
    //   42: aload_3
    //   43: invokeinterface 45 1 0
    //   48: astore 16
    //   50: new 47	java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial 50	java/lang/StringBuilder:<init>	()V
    //   57: astore 17
    //   59: iconst_0
    //   60: istore 18
    //   62: aload 16
    //   64: ifnull +63 -> 127
    //   67: iload 18
    //   69: aload 16
    //   71: invokeinterface 55 1 0
    //   76: if_icmpge +51 -> 127
    //   79: aload 16
    //   81: iload 18
    //   83: invokeinterface 58 2 0
    //   88: checkcast 60	fzk
    //   91: astore 19
    //   93: iconst_1
    //   94: anewarray 27	java/lang/Object
    //   97: astore 20
    //   99: aload 20
    //   101: iconst_0
    //   102: aload 19
    //   104: invokevirtual 63	fzk:b	()Ljava/lang/String;
    //   107: aastore
    //   108: aload 17
    //   110: ldc 65
    //   112: aload 20
    //   114: invokestatic 71	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   117: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: iinc 18 1
    //   124: goto -62 -> 62
    //   127: aload 15
    //   129: iconst_1
    //   130: aload 17
    //   132: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: aastore
    //   136: ldc 80
    //   138: ldc 82
    //   140: aload 15
    //   142: invokestatic 71	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   145: invokestatic 85	jid:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: aload_3
    //   149: invokeinterface 33 1 0
    //   154: invokeinterface 36 1 0
    //   159: ifeq +57 -> 216
    //   162: aload_3
    //   163: invokeinterface 45 1 0
    //   168: astore 4
    //   170: aload 4
    //   172: ifnull +44 -> 216
    //   175: aload 4
    //   177: invokestatic 90	jkg:a	(Lfzl;)J
    //   180: lstore 6
    //   182: lload 6
    //   184: aload_2
    //   185: getfield 94	jkg:g	J
    //   188: lcmp
    //   189: ifne +36 -> 225
    //   192: invokestatic 25	jid:a	()Z
    //   195: ifeq +10 -> 205
    //   198: ldc 80
    //   200: ldc 96
    //   202: invokestatic 85	jid:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   205: aload_2
    //   206: invokevirtual 99	jkg:e	()V
    //   209: aload 4
    //   211: invokeinterface 101 1 0
    //   216: new 103	hae
    //   219: dup
    //   220: iconst_1
    //   221: invokespecial 106	hae:<init>	(Z)V
    //   224: areturn
    //   225: aload 4
    //   227: invokeinterface 55 1 0
    //   232: istore 8
    //   234: new 108	java/util/ArrayList
    //   237: dup
    //   238: iload 8
    //   240: invokespecial 111	java/util/ArrayList:<init>	(I)V
    //   243: astore 9
    //   245: new 113	kl
    //   248: dup
    //   249: iload 8
    //   251: invokespecial 114	kl:<init>	(I)V
    //   254: astore 10
    //   256: iload_1
    //   257: iload 8
    //   259: if_icmpge +52 -> 311
    //   262: new 116	jkp
    //   265: dup
    //   266: aload 4
    //   268: iload_1
    //   269: invokeinterface 58 2 0
    //   274: checkcast 60	fzk
    //   277: invokespecial 119	jkp:<init>	(Lfzk;)V
    //   280: astore 11
    //   282: aload 9
    //   284: aload 11
    //   286: invokevirtual 123	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   289: pop
    //   290: aload 10
    //   292: aload 11
    //   294: invokeinterface 126 1 0
    //   299: aload 11
    //   301: invokevirtual 130	kl:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   304: pop
    //   305: iinc 1 1
    //   308: goto -52 -> 256
    //   311: aload_2
    //   312: monitorenter
    //   313: aload_2
    //   314: aload 9
    //   316: putfield 133	jkg:a	Ljava/util/ArrayList;
    //   319: aload_2
    //   320: aload 10
    //   322: putfield 136	jkg:b	Lkl;
    //   325: aload_2
    //   326: lload 6
    //   328: putfield 94	jkg:g	J
    //   331: aload_2
    //   332: monitorexit
    //   333: aload 4
    //   335: invokeinterface 101 1 0
    //   340: aload_2
    //   341: invokevirtual 99	jkg:e	()V
    //   344: aload_2
    //   345: iconst_2
    //   346: invokevirtual 138	jkg:a	(I)V
    //   349: goto -133 -> 216
    //   352: astore 14
    //   354: aload_2
    //   355: monitorexit
    //   356: aload 14
    //   358: athrow
    //   359: astore 5
    //   361: aload 4
    //   363: invokeinterface 101 1 0
    //   368: aload 5
    //   370: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	371	0	this	jke
    //   1	305	1	i	int
    //   6	349	2	localjkg	jkg
    //   11	152	3	localfyq	fyq
    //   168	194	4	localfzl1	fzl
    //   359	10	5	localObject1	java.lang.Object
    //   180	147	6	l	long
    //   232	28	8	j	int
    //   243	72	9	localArrayList	java.util.ArrayList
    //   254	67	10	localkl	kl
    //   280	20	11	localjkp	jkp
    //   352	5	14	localObject2	java.lang.Object
    //   22	119	15	arrayOfObject1	java.lang.Object[]
    //   48	32	16	localfzl2	fzl
    //   57	74	17	localStringBuilder	java.lang.StringBuilder
    //   60	62	18	k	int
    //   91	12	19	localfzk	fzk
    //   97	16	20	arrayOfObject2	java.lang.Object[]
    // Exception table:
    //   from	to	target	type
    //   313	333	352	finally
    //   354	356	352	finally
    //   175	205	359	finally
    //   205	209	359	finally
    //   225	256	359	finally
    //   262	305	359	finally
    //   311	313	359	finally
    //   356	359	359	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jke
 * JD-Core Version:    0.7.0.1
 */