import android.content.Context;
import java.util.ArrayList;

public final class bnk
  extends gzf
{
  private final Context a;
  private final int b;
  private final int c;
  private final ArrayList<bkc> d;
  private final ArrayList<String> l;
  private final ArrayList<String> m;
  private final hgg n;
  
  public bnk(Context paramContext, int paramInt1, ArrayList<bkc> paramArrayList, int paramInt2, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    super(paramContext, "GroupModifyCircleMembershipsTask");
    this.a = paramContext;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramArrayList;
    this.l = paramArrayList1;
    this.m = paramArrayList2;
    this.n = ((hgg)mbb.a(paramContext, hgg.class));
  }
  
  private final void a(otb paramotb)
  {
    if (paramotb.a == null) {}
    for (;;)
    {
      return;
      for (int i = 0; i < paramotb.a.length; i++)
      {
        ors localors = paramotb.a[i];
        String str = efj.a(localors.a);
        if ((localors != null) && (localors.c == null))
        {
          localors.c = new osf[this.l.size()];
          for (int j = 0; j < this.l.size(); j++)
          {
            osf localosf = new osf();
            localosf.a = efj.r((String)this.l.get(j));
            localors.c[j] = localosf;
          }
        }
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        brn.a(this.e, this.b, str, localors, this.l, this.m);
      }
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    int i = this.d.size();
    for (int j = 0; j < i; j++)
    {
      bkc localbkc = (bkc)this.d.get(j);
      hgg localhgg = this.n;
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      localhgg.a(this.e, this.b, localbkc.a, localbkc.b, paramBoolean);
    }
  }
  
  /* Error */
  @java.lang.Deprecated
  private final hae d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 32	bnk:d	Ljava/util/ArrayList;
    //   4: invokevirtual 70	java/util/ArrayList:size	()I
    //   7: istore_3
    //   8: iconst_0
    //   9: istore 4
    //   11: iload 4
    //   13: iload_3
    //   14: if_icmpge +60 -> 74
    //   17: aload_0
    //   18: getfield 32	bnk:d	Ljava/util/ArrayList;
    //   21: iload 4
    //   23: invokevirtual 79	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   26: checkcast 104	bkc
    //   29: astore 5
    //   31: aload_0
    //   32: getfield 45	bnk:n	Lhgg;
    //   35: astore 6
    //   37: aload_0
    //   38: getfield 91	gzf:e	Landroid/content/Context;
    //   41: ldc 93
    //   43: invokestatic 96	efj:e	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   46: pop
    //   47: aload 6
    //   49: aload_0
    //   50: getfield 91	gzf:e	Landroid/content/Context;
    //   53: aload_0
    //   54: getfield 28	bnk:b	I
    //   57: aload 5
    //   59: getfield 107	bkc:a	Ljava/lang/String;
    //   62: iconst_0
    //   63: invokeinterface 117 5 0
    //   68: iinc 4 1
    //   71: goto -60 -> 11
    //   74: new 119	bkb
    //   77: dup
    //   78: aload_0
    //   79: getfield 26	bnk:a	Landroid/content/Context;
    //   82: new 121	kcg
    //   85: dup
    //   86: aload_0
    //   87: getfield 26	bnk:a	Landroid/content/Context;
    //   90: aload_0
    //   91: getfield 28	bnk:b	I
    //   94: invokespecial 124	kcg:<init>	(Landroid/content/Context;I)V
    //   97: aload_0
    //   98: getfield 28	bnk:b	I
    //   101: aload_0
    //   102: getfield 32	bnk:d	Ljava/util/ArrayList;
    //   105: aload_0
    //   106: getfield 34	bnk:l	Ljava/util/ArrayList;
    //   109: aload_0
    //   110: getfield 36	bnk:m	Ljava/util/ArrayList;
    //   113: iconst_0
    //   114: aload_0
    //   115: getfield 30	bnk:c	I
    //   118: invokespecial 127	bkb:<init>	(Landroid/content/Context;Lkcg;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ZI)V
    //   121: astore 8
    //   123: aload 8
    //   125: invokevirtual 130	bkb:i	()V
    //   128: aload 8
    //   130: invokevirtual 133	bkb:n	()Z
    //   133: ifeq +112 -> 245
    //   136: aload_0
    //   137: getfield 91	gzf:e	Landroid/content/Context;
    //   140: ldc 93
    //   142: invokestatic 96	efj:e	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   145: pop
    //   146: aload_0
    //   147: getfield 91	gzf:e	Landroid/content/Context;
    //   150: getstatic 138	aau:uV	I
    //   153: invokevirtual 144	android/content/Context:getString	(I)Ljava/lang/String;
    //   156: astore 14
    //   158: ldc 146
    //   160: iconst_3
    //   161: invokestatic 152	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   164: ifeq +177 -> 341
    //   167: ldc 154
    //   169: invokestatic 158	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   172: astore 15
    //   174: aload 8
    //   176: getfield 163	kbw:o	I
    //   179: istore 16
    //   181: new 165	java/lang/StringBuilder
    //   184: dup
    //   185: bipush 11
    //   187: aload 15
    //   189: invokestatic 158	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokevirtual 168	java/lang/String:length	()I
    //   195: iadd
    //   196: invokespecial 171	java/lang/StringBuilder:<init>	(I)V
    //   199: aload 15
    //   201: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: iload 16
    //   206: invokevirtual 178	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: aload 14
    //   212: astore 11
    //   214: iconst_0
    //   215: istore_2
    //   216: new 180	hae
    //   219: dup
    //   220: aload 8
    //   222: getfield 163	kbw:o	I
    //   225: aload 8
    //   227: getfield 184	kbw:q	Ljava/lang/Exception;
    //   230: aload 11
    //   232: invokespecial 187	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   235: astore 12
    //   237: aload_0
    //   238: iload_2
    //   239: invokespecial 189	bnk:a	(Z)V
    //   242: aload 12
    //   244: areturn
    //   245: aload 8
    //   247: getfield 195	kct:x	Z
    //   250: ifeq +100 -> 350
    //   253: aload 8
    //   255: getfield 199	kct:w	Lqat;
    //   258: astore 9
    //   260: aload 9
    //   262: checkcast 201	mwu
    //   265: getfield 204	mwu:a	Lotb;
    //   268: astore 10
    //   270: aload 10
    //   272: getfield 51	otb:a	[Lors;
    //   275: ifnull +38 -> 313
    //   278: aload_0
    //   279: getfield 34	bnk:l	Ljava/util/ArrayList;
    //   282: ifnull +27 -> 309
    //   285: aload_0
    //   286: getfield 34	bnk:l	Ljava/util/ArrayList;
    //   289: invokevirtual 70	java/util/ArrayList:size	()I
    //   292: ifle +17 -> 309
    //   295: aload_0
    //   296: aload 10
    //   298: invokespecial 206	bnk:a	(Lotb;)V
    //   301: iconst_1
    //   302: istore_2
    //   303: aconst_null
    //   304: astore 11
    //   306: goto -90 -> 216
    //   309: aload_0
    //   310: invokespecial 208	bnk:e	()V
    //   313: iconst_1
    //   314: istore_2
    //   315: aconst_null
    //   316: astore 11
    //   318: goto -102 -> 216
    //   321: astore_1
    //   322: iconst_0
    //   323: istore_2
    //   324: aload_0
    //   325: iload_2
    //   326: invokespecial 189	bnk:a	(Z)V
    //   329: aload_1
    //   330: athrow
    //   331: astore_1
    //   332: iconst_1
    //   333: istore_2
    //   334: goto -10 -> 324
    //   337: astore_1
    //   338: goto -14 -> 324
    //   341: aload 14
    //   343: astore 11
    //   345: iconst_0
    //   346: istore_2
    //   347: goto -131 -> 216
    //   350: aconst_null
    //   351: astore 9
    //   353: goto -93 -> 260
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	356	0	this	bnk
    //   321	9	1	localObject1	java.lang.Object
    //   331	1	1	localObject2	java.lang.Object
    //   337	1	1	localObject3	java.lang.Object
    //   215	132	2	bool	boolean
    //   7	8	3	i	int
    //   9	60	4	j	int
    //   29	29	5	localbkc	bkc
    //   35	13	6	localhgg	hgg
    //   121	133	8	localbkb	bkb
    //   258	94	9	localqat	qat
    //   268	29	10	localotb	otb
    //   212	132	11	str1	String
    //   235	8	12	localhae	hae
    //   156	186	14	str2	String
    //   172	28	15	str3	String
    //   179	26	16	k	int
    // Exception table:
    //   from	to	target	type
    //   0	8	321	finally
    //   17	68	321	finally
    //   74	210	321	finally
    //   245	260	331	finally
    //   260	301	331	finally
    //   309	313	331	finally
    //   216	237	337	finally
  }
  
  private final void e()
  {
    int i = this.d.size();
    for (int j = 0; j < i; j++)
    {
      String str = ((bkc)this.d.get(j)).a;
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      brn.a(this.e, this.b, str, null, this.l, this.m);
    }
  }
  
  protected final hae a()
  {
    return d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnk
 * JD-Core Version:    0.7.0.1
 */