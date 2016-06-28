import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public final class bnd
  extends gzf
{
  final int a;
  private final int b;
  private final String c;
  private final String d;
  private final String l;
  private final String m;
  private final byte[] n;
  private final String[] o;
  private final String[] p;
  private final boolean q;
  private final boolean r;
  private final boolean s;
  private final long t;
  private final String[] u;
  private final Boolean v;
  private final lmw w;
  
  public bnd(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong, String[] paramArrayOfString3, boolean paramBoolean4)
  {
    super(paramContext, "GetActivityStreamTask");
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString1;
    this.d = paramString2;
    this.l = paramString3;
    this.m = paramString4;
    this.n = paramArrayOfByte;
    this.o = paramArrayOfString1;
    this.q = paramBoolean1;
    this.r = paramBoolean2;
    this.p = paramArrayOfString2;
    this.s = paramBoolean3;
    this.t = paramLong;
    this.u = paramArrayOfString3;
    this.v = Boolean.valueOf(paramBoolean4);
    this.w = lmw.a;
  }
  
  public static bnd a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean1, boolean paramBoolean2, long paramLong, String[] paramArrayOfString3)
  {
    return new bnd(paramContext, paramInt1, paramInt2, paramString1, paramString2, paramString3, paramString4, paramArrayOfByte, paramArrayOfString1, paramArrayOfString2, false, paramBoolean2, false, paramLong, null, false);
  }
  
  public static bnd a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString1, String[] paramArrayOfString2, long paramLong, String[] paramArrayOfString3)
  {
    lmw.a.a(false);
    return new bnd(paramContext, paramInt1, paramInt2, paramString1, paramString2, paramString3, null, null, paramArrayOfString1, paramArrayOfString2, false, false, true, paramLong, paramArrayOfString3, false);
  }
  
  private final lmx d()
  {
    String str1 = this.m;
    Object localObject = null;
    lmx locallmx;
    olr localolr2;
    ArrayList localArrayList;
    if (str1 == null)
    {
      byte[] arrayOfByte = this.n;
      localObject = null;
      if (arrayOfByte == null)
      {
        String str2 = lmp.a(this.b, this.d, this.l, this.c, this.q);
        this.w.c.block();
        locallmx = this.w.a(this.a, str2);
        localObject = null;
        if (locallmx != null)
        {
          olr localolr1 = locallmx.a;
          localObject = null;
          if (localolr1 != null)
          {
            localolr2 = locallmx.a;
            localArrayList = new ArrayList();
            efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
            lln locallln = (lln)mbb.a(this.e, lln.class);
            for (int i = 0; i < localolr2.a.b.length; i++)
            {
              oqw localoqw = localolr2.a.b[i];
              String str3 = locallln.a(localoqw.a, this.a).a(this.a, localoqw);
              if (str3 != null) {
                localArrayList.add(str3);
              }
            }
            if (localolr2.c == null) {
              break label262;
            }
          }
        }
      }
    }
    label262:
    for (long l1 = localolr2.c.a.longValue();; l1 = 0L)
    {
      bne localbne = new bne(this, l1, localArrayList);
      efj.m().post(localbne);
      localObject = locallmx;
      return localObject;
    }
  }
  
  /* Error */
  protected final hae a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 115	gzf:e	Landroid/content/Context;
    //   4: ldc 117
    //   6: invokestatic 122	efj:e	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_0
    //   11: getfield 115	gzf:e	Landroid/content/Context;
    //   14: astore_2
    //   15: new 189	kck
    //   18: dup
    //   19: invokespecial 190	kck:<init>	()V
    //   22: astore_3
    //   23: aload_3
    //   24: aload_0
    //   25: getfield 53	bnd:q	Z
    //   28: putfield 192	kck:n	Z
    //   31: aload_0
    //   32: getfield 41	bnd:c	Ljava/lang/String;
    //   35: astore 4
    //   37: aload_0
    //   38: getfield 43	bnd:d	Ljava/lang/String;
    //   41: astore 5
    //   43: aload_0
    //   44: getfield 39	bnd:b	I
    //   47: istore 6
    //   49: aload_3
    //   50: new 194	java/lang/StringBuilder
    //   53: dup
    //   54: bipush 56
    //   56: aload 4
    //   58: invokestatic 199	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   61: invokevirtual 203	java/lang/String:length	()I
    //   64: iadd
    //   65: aload 5
    //   67: invokestatic 199	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   70: invokevirtual 203	java/lang/String:length	()I
    //   73: iadd
    //   74: invokespecial 206	java/lang/StringBuilder:<init>	(I)V
    //   77: ldc 208
    //   79: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: aload 4
    //   84: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: ldc 214
    //   89: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload 5
    //   94: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc 216
    //   99: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: iload 6
    //   104: invokevirtual 219	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   107: invokevirtual 223	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokevirtual 226	kck:a	(Ljava/lang/String;)V
    //   113: aload_3
    //   114: ldc 228
    //   116: invokevirtual 230	kck:b	(Ljava/lang/String;)V
    //   119: aload_0
    //   120: getfield 115	gzf:e	Landroid/content/Context;
    //   123: ldc 117
    //   125: invokestatic 122	efj:e	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: aload_0
    //   130: getfield 115	gzf:e	Landroid/content/Context;
    //   133: ldc 124
    //   135: invokestatic 129	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   138: checkcast 124	lln
    //   141: astore 8
    //   143: aload_0
    //   144: getfield 53	bnd:q	Z
    //   147: ifeq +175 -> 322
    //   150: bipush 20
    //   152: istore 9
    //   154: new 232	hae
    //   157: dup
    //   158: iconst_1
    //   159: invokespecial 234	hae:<init>	(Z)V
    //   162: astore 10
    //   164: aload 10
    //   166: invokevirtual 237	hae:a	()Landroid/os/Bundle;
    //   169: astore 11
    //   171: aload_0
    //   172: getfield 59	bnd:s	Z
    //   175: ifeq +383 -> 558
    //   178: aload_0
    //   179: getfield 39	bnd:b	I
    //   182: aload_0
    //   183: getfield 43	bnd:d	Ljava/lang/String;
    //   186: aload_0
    //   187: getfield 45	bnd:l	Ljava/lang/String;
    //   190: aload_0
    //   191: getfield 41	bnd:c	Ljava/lang/String;
    //   194: aload_0
    //   195: getfield 53	bnd:q	Z
    //   198: invokestatic 90	lmp:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    //   201: astore 18
    //   203: aload_0
    //   204: getfield 71	bnd:v	Ljava/lang/Boolean;
    //   207: invokevirtual 241	java/lang/Boolean:booleanValue	()Z
    //   210: istore 19
    //   212: iload 19
    //   214: ifeq +199 -> 413
    //   217: aload_0
    //   218: getfield 77	bnd:w	Llmw;
    //   221: invokevirtual 243	lmw:c	()V
    //   224: aload_0
    //   225: getfield 77	bnd:w	Llmw;
    //   228: aload_0
    //   229: getfield 37	bnd:a	I
    //   232: aload 18
    //   234: new 104	lmx
    //   237: dup
    //   238: aconst_null
    //   239: invokespecial 246	lmx:<init>	(Lolr;)V
    //   242: invokevirtual 249	lmw:a	(ILjava/lang/String;Llmx;)V
    //   245: aload_2
    //   246: aload_0
    //   247: getfield 37	bnd:a	I
    //   250: aload_0
    //   251: getfield 39	bnd:b	I
    //   254: aload_0
    //   255: getfield 41	bnd:c	Ljava/lang/String;
    //   258: aload_0
    //   259: getfield 43	bnd:d	Ljava/lang/String;
    //   262: aload_0
    //   263: getfield 45	bnd:l	Ljava/lang/String;
    //   266: aload_0
    //   267: getfield 53	bnd:q	Z
    //   270: aload_0
    //   271: getfield 47	bnd:m	Ljava/lang/String;
    //   274: aload_0
    //   275: getfield 49	bnd:n	[B
    //   278: iload 9
    //   280: aload_0
    //   281: getfield 51	bnd:o	[Ljava/lang/String;
    //   284: aload_0
    //   285: getfield 57	bnd:p	[Ljava/lang/String;
    //   288: aload_3
    //   289: aload_0
    //   290: getfield 61	bnd:t	J
    //   293: aload_0
    //   294: getfield 63	bnd:u	[Ljava/lang/String;
    //   297: invokestatic 252	lmp:a	(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;[BI[Ljava/lang/String;[Ljava/lang/String;Lkck;J[Ljava/lang/String;)Z
    //   300: pop
    //   301: aload_0
    //   302: getfield 77	bnd:w	Llmw;
    //   305: getfield 93	lmw:c	Landroid/os/ConditionVariable;
    //   308: invokevirtual 255	android/os/ConditionVariable:open	()V
    //   311: aload_3
    //   312: invokevirtual 257	kck:d	()V
    //   315: aload_3
    //   316: invokevirtual 259	kck:e	()V
    //   319: aload 10
    //   321: areturn
    //   322: aload_0
    //   323: getfield 47	bnd:m	Ljava/lang/String;
    //   326: ifnonnull +19 -> 345
    //   329: aload 8
    //   331: aload_0
    //   332: getfield 37	bnd:a	I
    //   335: invokeinterface 262 2 0
    //   340: istore 9
    //   342: goto -188 -> 154
    //   345: aload 8
    //   347: aload_0
    //   348: getfield 37	bnd:a	I
    //   351: invokeinterface 265 2 0
    //   356: istore 9
    //   358: goto -204 -> 154
    //   361: astore 22
    //   363: aload_0
    //   364: getfield 77	bnd:w	Llmw;
    //   367: getfield 93	lmw:c	Landroid/os/ConditionVariable;
    //   370: invokevirtual 255	android/os/ConditionVariable:open	()V
    //   373: aload 22
    //   375: athrow
    //   376: astore 13
    //   378: ldc 32
    //   380: ldc_w 267
    //   383: aload 13
    //   385: invokestatic 272	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   388: pop
    //   389: new 232	hae
    //   392: dup
    //   393: iconst_0
    //   394: aload 13
    //   396: aconst_null
    //   397: invokespecial 275	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   400: astore 15
    //   402: aload_3
    //   403: invokevirtual 257	kck:d	()V
    //   406: aload_3
    //   407: invokevirtual 259	kck:e	()V
    //   410: aload 15
    //   412: areturn
    //   413: aload_0
    //   414: getfield 77	bnd:w	Llmw;
    //   417: getfield 93	lmw:c	Landroid/os/ConditionVariable;
    //   420: invokevirtual 99	android/os/ConditionVariable:block	()V
    //   423: aload_0
    //   424: getfield 77	bnd:w	Llmw;
    //   427: aload_0
    //   428: getfield 37	bnd:a	I
    //   431: aload 18
    //   433: invokevirtual 277	lmw:b	(ILjava/lang/String;)Llmx;
    //   436: astore 20
    //   438: aload 20
    //   440: ifnull +58 -> 498
    //   443: aload 20
    //   445: getfield 107	lmx:a	Lolr;
    //   448: ifnull +44 -> 492
    //   451: iconst_1
    //   452: istore 21
    //   454: iload 21
    //   456: ifne +10 -> 466
    //   459: aload_0
    //   460: getfield 77	bnd:w	Llmw;
    //   463: invokevirtual 279	lmw:a	()V
    //   466: aload 11
    //   468: ldc_w 281
    //   471: iload 21
    //   473: invokevirtual 287	android/os/Bundle:putBoolean	(Ljava/lang/String;Z)V
    //   476: goto -165 -> 311
    //   479: astore 12
    //   481: aload_3
    //   482: invokevirtual 257	kck:d	()V
    //   485: aload_3
    //   486: invokevirtual 259	kck:e	()V
    //   489: aload 12
    //   491: athrow
    //   492: iconst_0
    //   493: istore 21
    //   495: goto -41 -> 454
    //   498: aload_2
    //   499: aload_0
    //   500: getfield 37	bnd:a	I
    //   503: aload_0
    //   504: getfield 39	bnd:b	I
    //   507: aload_0
    //   508: getfield 41	bnd:c	Ljava/lang/String;
    //   511: aload_0
    //   512: getfield 43	bnd:d	Ljava/lang/String;
    //   515: aload_0
    //   516: getfield 45	bnd:l	Ljava/lang/String;
    //   519: aload_0
    //   520: getfield 53	bnd:q	Z
    //   523: aload_0
    //   524: getfield 47	bnd:m	Ljava/lang/String;
    //   527: aload_0
    //   528: getfield 49	bnd:n	[B
    //   531: iload 9
    //   533: aload_0
    //   534: getfield 51	bnd:o	[Ljava/lang/String;
    //   537: aload_0
    //   538: getfield 57	bnd:p	[Ljava/lang/String;
    //   541: aload_3
    //   542: aload_0
    //   543: getfield 61	bnd:t	J
    //   546: aload_0
    //   547: getfield 63	bnd:u	[Ljava/lang/String;
    //   550: invokestatic 252	lmp:a	(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;[BI[Ljava/lang/String;[Ljava/lang/String;Lkck;J[Ljava/lang/String;)Z
    //   553: istore 21
    //   555: goto -89 -> 466
    //   558: aload_0
    //   559: invokespecial 289	bnd:d	()Llmx;
    //   562: astore 16
    //   564: aload_2
    //   565: aload_0
    //   566: getfield 37	bnd:a	I
    //   569: aload_0
    //   570: getfield 39	bnd:b	I
    //   573: aload_0
    //   574: getfield 41	bnd:c	Ljava/lang/String;
    //   577: aload_0
    //   578: getfield 43	bnd:d	Ljava/lang/String;
    //   581: aload_0
    //   582: getfield 45	bnd:l	Ljava/lang/String;
    //   585: aload_0
    //   586: getfield 53	bnd:q	Z
    //   589: aload_0
    //   590: getfield 47	bnd:m	Ljava/lang/String;
    //   593: aload_0
    //   594: getfield 49	bnd:n	[B
    //   597: iload 9
    //   599: aload_0
    //   600: getfield 51	bnd:o	[Ljava/lang/String;
    //   603: aload_0
    //   604: getfield 57	bnd:p	[Ljava/lang/String;
    //   607: aload_3
    //   608: aload_0
    //   609: getfield 55	bnd:r	Z
    //   612: aload 16
    //   614: aload_0
    //   615: getfield 61	bnd:t	J
    //   618: aload_0
    //   619: getfield 63	bnd:u	[Ljava/lang/String;
    //   622: invokestatic 292	lmp:a	(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;[BI[Ljava/lang/String;[Ljava/lang/String;Lkck;ZLlmx;J[Ljava/lang/String;)Llmu;
    //   625: astore 17
    //   627: aload 11
    //   629: ldc_w 294
    //   632: aload 17
    //   634: getfield 298	lmu:a	Ljava/lang/String;
    //   637: invokevirtual 302	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   640: aload 11
    //   642: ldc_w 304
    //   645: aload 17
    //   647: getfield 306	lmu:b	[B
    //   650: invokevirtual 310	android/os/Bundle:putByteArray	(Ljava/lang/String;[B)V
    //   653: aload 11
    //   655: ldc_w 312
    //   658: aload 17
    //   660: getfield 314	lmu:c	J
    //   663: invokevirtual 318	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   666: goto -355 -> 311
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	669	0	this	bnd
    //   14	551	2	localContext	Context
    //   22	586	3	localkck	kck
    //   35	48	4	str1	String
    //   41	52	5	str2	String
    //   47	56	6	i	int
    //   141	205	8	locallln	lln
    //   152	446	9	j	int
    //   162	158	10	localhae1	hae
    //   169	485	11	localBundle	android.os.Bundle
    //   479	11	12	localObject1	Object
    //   376	19	13	localException	java.lang.Exception
    //   400	11	15	localhae2	hae
    //   562	51	16	locallmx1	lmx
    //   625	34	17	locallmu	lmu
    //   201	231	18	str3	String
    //   210	3	19	bool1	boolean
    //   436	8	20	locallmx2	lmx
    //   452	102	21	bool2	boolean
    //   361	13	22	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   217	301	361	finally
    //   171	212	376	java/lang/Exception
    //   301	311	376	java/lang/Exception
    //   363	376	376	java/lang/Exception
    //   413	438	376	java/lang/Exception
    //   443	451	376	java/lang/Exception
    //   459	466	376	java/lang/Exception
    //   466	476	376	java/lang/Exception
    //   498	555	376	java/lang/Exception
    //   558	666	376	java/lang/Exception
    //   171	212	479	finally
    //   301	311	479	finally
    //   363	376	479	finally
    //   378	402	479	finally
    //   413	438	479	finally
    //   443	451	479	finally
    //   459	466	479	finally
    //   466	476	479	finally
    //   498	555	479	finally
    //   558	666	479	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnd
 * JD-Core Version:    0.7.0.1
 */