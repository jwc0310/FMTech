import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.HttpUrlRequest;

public final class itz
{
  static final long a;
  static final iud d = new iua();
  private static final Bundle e;
  private static final Set<String> f;
  private static final Pattern g;
  public String b;
  final iud c;
  private iuq h;
  private boolean i;
  private final Context j;
  private final kcq k;
  private final String l;
  private final String m;
  private final String n;
  private final boolean o;
  private final iun p;
  private final itg q;
  private final iue r;
  
  static
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("uploadType", "resumable");
    e = localBundle;
    a = 10L * mfr.c.d;
    HashSet localHashSet = new HashSet(2);
    localHashSet.addAll(Arrays.asList(new String[] { "application/placeholder-image", "application/stitching-preview" }));
    f = Collections.unmodifiableSet(localHashSet);
    g = Pattern.compile("bytes=(\\d+)-(\\d+)");
  }
  
  itz(iub paramiub)
  {
    this.j = paramiub.a;
    this.l = paramiub.b;
    this.m = paramiub.c;
    this.n = paramiub.d;
    this.c = paramiub.e;
    this.o = paramiub.f;
    this.p = paramiub.g;
    this.r = ((iue)mbb.b(this.j, iue.class));
    this.q = paramiub.h;
    this.k = new kcq(this.j, paramiub.b, "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
  }
  
  private static ity a(iuf paramiuf, iur paramiur)
  {
    if (paramiuf == null) {
      throw new itv("null HttpEntity in response");
    }
    if (Log.isLoggable("MediaUploader", 3))
    {
      int i1 = (int)paramiuf.e;
      new StringBuilder(32).append("parseResult: length: ").append(i1);
    }
    byte[] arrayOfByte = paramiuf.f;
    qak localqak = new qak(arrayOfByte, 0, arrayOfByte.length);
    ncs localncs = new ncs();
    ((ncs)localncs.a(localqak));
    nqv localnqv = localncs.a;
    if (localnqv == null) {
      throw new itv("Unable to parse UploadMediaResponse");
    }
    iuk localiuk;
    ojf localojf;
    String str3;
    if ((localnqv == null) || (localnqv.b == null))
    {
      localiuk = null;
      if (localnqv.a == null) {
        break label245;
      }
      localojf = localnqv.a;
      if (localojf.a == null) {
        break label233;
      }
      str3 = localojf.a.a;
      label157:
      if (localojf.k == null) {
        break label239;
      }
    }
    label233:
    label239:
    for (String str4 = localojf.k.c;; str4 = null)
    {
      String str5 = localojf.e;
      return new ity(localiuk, str3, (1000.0D * efj.a(localojf.m)), localojf.d, paramiur.k, str4, str5);
      localiuk = iuk.a(localnqv.b);
      break;
      str3 = null;
      break label157;
    }
    label245:
    String str2;
    String str1;
    if (localnqv.c != null)
    {
      pss localpss = localnqv.c;
      if (localpss.b == null) {
        break label340;
      }
      str2 = localpss.b.a;
      if (localpss.b.b == null) {
        break label334;
      }
      str1 = localpss.b.b.b;
    }
    for (;;)
    {
      return new ity(localiuk, null, 0L, str1, paramiur.k, null, str2);
      throw new itv("Unsupported UploadMediaResponse type");
      label334:
      str1 = null;
      continue;
      label340:
      str1 = null;
      str2 = null;
    }
  }
  
  /* Error */
  private final ity a(String paramString1, iur paramiur, String paramString2, boolean paramBoolean, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 134	itz:c	Liud;
    //   4: aload_2
    //   5: getfield 290	iur:l	Landroid/net/Uri;
    //   8: lload 5
    //   10: aload_2
    //   11: getfield 257	iur:k	J
    //   14: invokeinterface 295 6 0
    //   19: ldc 174
    //   21: iconst_4
    //   22: invokestatic 180	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   25: ifeq +30 -> 55
    //   28: aload_2
    //   29: invokevirtual 299	java/lang/Object:hashCode	()I
    //   32: istore 30
    //   34: new 186	java/lang/StringBuilder
    //   37: dup
    //   38: bipush 28
    //   40: invokespecial 187	java/lang/StringBuilder:<init>	(I)V
    //   43: ldc_w 301
    //   46: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: iload 30
    //   51: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: ldc 174
    //   57: iconst_2
    //   58: invokestatic 180	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   61: ifeq +75 -> 136
    //   64: ldc_w 303
    //   67: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   70: astore 28
    //   72: new 186	java/lang/StringBuilder
    //   75: dup
    //   76: bipush 50
    //   78: aload 28
    //   80: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   83: invokevirtual 310	java/lang/String:length	()I
    //   86: iadd
    //   87: aload_3
    //   88: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   91: invokevirtual 310	java/lang/String:length	()I
    //   94: iadd
    //   95: invokespecial 187	java/lang/StringBuilder:<init>	(I)V
    //   98: aload 28
    //   100: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload_3
    //   104: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: ldc_w 312
    //   110: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: iload 4
    //   115: invokevirtual 315	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   118: ldc_w 317
    //   121: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: lload 5
    //   126: invokevirtual 320	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   129: ldc_w 322
    //   132: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: new 324	java/io/BufferedInputStream
    //   139: dup
    //   140: aload_2
    //   141: getfield 326	iur:b	Landroid/content/Context;
    //   144: invokevirtual 332	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   147: aload_2
    //   148: getfield 334	iur:m	Landroid/net/Uri;
    //   151: invokevirtual 340	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   154: invokespecial 343	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   157: astore 7
    //   159: lload 5
    //   161: lconst_0
    //   162: lcmp
    //   163: ifle +11 -> 174
    //   166: aload 7
    //   168: lload 5
    //   170: invokevirtual 347	java/io/BufferedInputStream:skip	(J)J
    //   173: pop2
    //   174: aload_3
    //   175: ifnull +83 -> 258
    //   178: aload_2
    //   179: getfield 350	iur:c	Lirc;
    //   182: invokevirtual 355	irc:a	()Ljava/lang/String;
    //   185: astore 25
    //   187: aload 25
    //   189: ifnull +12 -> 201
    //   192: aload 25
    //   194: aload_3
    //   195: invokevirtual 359	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   198: ifne +60 -> 258
    //   201: new 361	itr
    //   204: dup
    //   205: ldc_w 363
    //   208: invokespecial 364	itr:<init>	(Ljava/lang/String;)V
    //   211: athrow
    //   212: astore 14
    //   214: new 366	itt
    //   217: dup
    //   218: aload 14
    //   220: invokevirtual 369	java/io/IOException:toString	()Ljava/lang/String;
    //   223: aload_2
    //   224: aload_1
    //   225: invokestatic 374	iul:a	(Liur;Ljava/lang/String;)Ljava/lang/String;
    //   228: invokespecial 376	itt:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   231: athrow
    //   232: astore 11
    //   234: aload_0
    //   235: monitorenter
    //   236: aload_0
    //   237: aconst_null
    //   238: putfield 378	itz:h	Liuq;
    //   241: aload_0
    //   242: monitorexit
    //   243: aload 7
    //   245: ifnull +10 -> 255
    //   248: aload 7
    //   250: invokeinterface 383 1 0
    //   255: aload 11
    //   257: athrow
    //   258: new 385	iuc
    //   261: dup
    //   262: aload_0
    //   263: aload_2
    //   264: getfield 290	iur:l	Landroid/net/Uri;
    //   267: aload_2
    //   268: getfield 257	iur:k	J
    //   271: lload 5
    //   273: invokespecial 388	iuc:<init>	(Litz;Landroid/net/Uri;JJ)V
    //   276: astore 8
    //   278: new 390	iuq
    //   281: dup
    //   282: aload_0
    //   283: getfield 118	itz:j	Landroid/content/Context;
    //   286: aload_0
    //   287: getfield 164	itz:k	Lkcq;
    //   290: aload_1
    //   291: aload_2
    //   292: getfield 391	iur:a	Ljava/lang/String;
    //   295: lload 5
    //   297: aload_2
    //   298: getfield 257	iur:k	J
    //   301: aload 7
    //   303: iload 4
    //   305: aload 8
    //   307: invokespecial 394	iuq:<init>	(Landroid/content/Context;Lkcb;Ljava/lang/String;Ljava/lang/String;JJLjava/io/InputStream;ZLiwy;)V
    //   310: astore 9
    //   312: aload_0
    //   313: monitorenter
    //   314: aload_0
    //   315: getfield 396	itz:i	Z
    //   318: ifeq +19 -> 337
    //   321: new 398	itn
    //   324: dup
    //   325: aconst_null
    //   326: invokespecial 401	itn:<init>	(Ljava/lang/Throwable;)V
    //   329: athrow
    //   330: astore 10
    //   332: aload_0
    //   333: monitorexit
    //   334: aload 10
    //   336: athrow
    //   337: aload_0
    //   338: aload 9
    //   340: putfield 378	itz:h	Liuq;
    //   343: aload_0
    //   344: monitorexit
    //   345: aload_0
    //   346: aload 9
    //   348: invokespecial 404	itz:a	(Liuf;)Liuf;
    //   351: pop
    //   352: aload 9
    //   354: getfield 407	iuf:d	I
    //   357: istore 16
    //   359: iload 16
    //   361: invokestatic 410	itz:a	(I)Z
    //   364: ifeq +106 -> 470
    //   367: aload 8
    //   369: aload_2
    //   370: getfield 257	iur:k	J
    //   373: aload_2
    //   374: getfield 257	iur:k	J
    //   377: invokevirtual 413	iuc:a	(JJ)V
    //   380: aload 9
    //   382: aload_2
    //   383: invokestatic 415	itz:a	(Liuf;Liur;)Lity;
    //   386: astore 19
    //   388: getstatic 420	iuh:b	Ljava/lang/ThreadLocal;
    //   391: invokevirtual 426	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   394: checkcast 428	java/util/ArrayList
    //   397: astore 20
    //   399: aload 20
    //   401: invokevirtual 431	java/util/ArrayList:size	()I
    //   404: istore 21
    //   406: iload 21
    //   408: ifle +31 -> 439
    //   411: aload 20
    //   413: iload 21
    //   415: iconst_1
    //   416: isub
    //   417: invokevirtual 434	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   420: checkcast 436	iuj
    //   423: astore 22
    //   425: aload 22
    //   427: lconst_1
    //   428: aload 22
    //   430: getfield 438	iuj:i	I
    //   433: i2l
    //   434: ladd
    //   435: l2i
    //   436: putfield 438	iuj:i	I
    //   439: aload_0
    //   440: monitorenter
    //   441: aload_0
    //   442: aconst_null
    //   443: putfield 378	itz:h	Liuq;
    //   446: aload_0
    //   447: monitorexit
    //   448: aload 7
    //   450: ifnull +10 -> 460
    //   453: aload 7
    //   455: invokeinterface 383 1 0
    //   460: aload 19
    //   462: areturn
    //   463: astore 23
    //   465: aload_0
    //   466: monitorexit
    //   467: aload 23
    //   469: athrow
    //   470: iload 16
    //   472: sipush 308
    //   475: if_icmpne +217 -> 692
    //   478: iconst_1
    //   479: istore 17
    //   481: iload 17
    //   483: ifeq +14 -> 497
    //   486: new 167	itv
    //   489: dup
    //   490: ldc_w 440
    //   493: invokespecial 172	itv:<init>	(Ljava/lang/String;)V
    //   496: athrow
    //   497: iload 16
    //   499: sipush 400
    //   502: if_icmpne +34 -> 536
    //   505: new 167	itv
    //   508: dup
    //   509: new 186	java/lang/StringBuilder
    //   512: dup
    //   513: bipush 55
    //   515: invokespecial 187	java/lang/StringBuilder:<init>	(I)V
    //   518: ldc_w 442
    //   521: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: iload 16
    //   526: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   529: invokevirtual 443	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   532: invokespecial 172	itv:<init>	(Ljava/lang/String;)V
    //   535: athrow
    //   536: iload 16
    //   538: sipush 500
    //   541: if_icmplt +47 -> 588
    //   544: iload 16
    //   546: sipush 600
    //   549: if_icmpge +39 -> 588
    //   552: new 366	itt
    //   555: dup
    //   556: new 186	java/lang/StringBuilder
    //   559: dup
    //   560: bipush 33
    //   562: invokespecial 187	java/lang/StringBuilder:<init>	(I)V
    //   565: ldc_w 445
    //   568: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: iload 16
    //   573: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   576: invokevirtual 443	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   579: aload_2
    //   580: aload_1
    //   581: invokestatic 374	iul:a	(Liur;Ljava/lang/String;)Ljava/lang/String;
    //   584: invokespecial 376	itt:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   587: athrow
    //   588: aload 8
    //   590: getfield 448	iuc:a	Lito;
    //   593: ifnull +105 -> 698
    //   596: iconst_1
    //   597: istore 18
    //   599: iload 18
    //   601: ifeq +9 -> 610
    //   604: aload 8
    //   606: getfield 448	iuc:a	Lito;
    //   609: athrow
    //   610: aload 9
    //   612: getfield 450	iuf:h	Z
    //   615: ifeq +21 -> 636
    //   618: new 398	itn
    //   621: dup
    //   622: aload 9
    //   624: getfield 453	iuf:g	Ljava/io/IOException;
    //   627: aload_2
    //   628: aload_1
    //   629: invokestatic 374	iul:a	(Liur;Ljava/lang/String;)Ljava/lang/String;
    //   632: invokespecial 456	itn:<init>	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   635: athrow
    //   636: aload 9
    //   638: getfield 453	iuf:g	Ljava/io/IOException;
    //   641: ifnull +21 -> 662
    //   644: new 366	itt
    //   647: dup
    //   648: aload 9
    //   650: getfield 453	iuf:g	Ljava/io/IOException;
    //   653: aload_2
    //   654: aload_1
    //   655: invokestatic 374	iul:a	(Liur;Ljava/lang/String;)Ljava/lang/String;
    //   658: invokespecial 459	itt:<init>	(Ljava/lang/Exception;Ljava/lang/String;)V
    //   661: athrow
    //   662: new 167	itv
    //   665: dup
    //   666: iload 16
    //   668: invokestatic 464	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   671: invokespecial 172	itv:<init>	(Ljava/lang/String;)V
    //   674: athrow
    //   675: astore 12
    //   677: aload_0
    //   678: monitorexit
    //   679: aload 12
    //   681: athrow
    //   682: astore 24
    //   684: aload 19
    //   686: areturn
    //   687: astore 13
    //   689: goto -434 -> 255
    //   692: iconst_0
    //   693: istore 17
    //   695: goto -214 -> 481
    //   698: iconst_0
    //   699: istore 18
    //   701: goto -102 -> 599
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	704	0	this	itz
    //   0	704	1	paramString1	String
    //   0	704	2	paramiur	iur
    //   0	704	3	paramString2	String
    //   0	704	4	paramBoolean	boolean
    //   0	704	5	paramLong	long
    //   157	297	7	localBufferedInputStream	java.io.BufferedInputStream
    //   276	329	8	localiuc	iuc
    //   310	339	9	localiuq	iuq
    //   330	5	10	localObject1	Object
    //   232	24	11	localObject2	Object
    //   675	5	12	localObject3	Object
    //   687	1	13	localIOException1	IOException
    //   212	7	14	localIOException2	IOException
    //   357	310	16	i1	int
    //   479	215	17	i2	int
    //   597	103	18	i3	int
    //   386	299	19	locality	ity
    //   397	15	20	localArrayList	java.util.ArrayList
    //   404	13	21	i4	int
    //   423	6	22	localiuj	iuj
    //   463	5	23	localObject4	Object
    //   682	1	24	localIOException3	IOException
    //   185	8	25	str1	String
    //   70	29	28	str2	String
    //   32	18	30	i5	int
    // Exception table:
    //   from	to	target	type
    //   178	187	212	java/io/IOException
    //   192	201	212	java/io/IOException
    //   201	212	212	java/io/IOException
    //   258	314	212	java/io/IOException
    //   334	337	212	java/io/IOException
    //   345	406	212	java/io/IOException
    //   411	439	212	java/io/IOException
    //   486	497	212	java/io/IOException
    //   505	536	212	java/io/IOException
    //   552	588	212	java/io/IOException
    //   588	596	212	java/io/IOException
    //   604	610	212	java/io/IOException
    //   610	636	212	java/io/IOException
    //   636	662	212	java/io/IOException
    //   662	675	212	java/io/IOException
    //   178	187	232	finally
    //   192	201	232	finally
    //   201	212	232	finally
    //   214	232	232	finally
    //   258	314	232	finally
    //   334	337	232	finally
    //   345	406	232	finally
    //   411	439	232	finally
    //   486	497	232	finally
    //   505	536	232	finally
    //   552	588	232	finally
    //   588	596	232	finally
    //   604	610	232	finally
    //   610	636	232	finally
    //   636	662	232	finally
    //   662	675	232	finally
    //   314	330	330	finally
    //   332	334	330	finally
    //   337	345	330	finally
    //   441	448	463	finally
    //   465	467	463	finally
    //   236	243	675	finally
    //   677	679	675	finally
    //   453	460	682	java/io/IOException
    //   248	255	687	java/io/IOException
  }
  
  private final iuf a(iuf paramiuf)
  {
    paramiuf.a();
    b();
    long l1 = SystemClock.elapsedRealtime();
    paramiuf.c();
    iuh.a(SystemClock.elapsedRealtime() - l1);
    int i1 = paramiuf.d;
    if ((i1 == 401) || (i1 == 403)) {}
    try
    {
      paramiuf.c.a();
      paramiuf.a();
      b();
      long l2 = SystemClock.elapsedRealtime();
      paramiuf.c();
      iuh.a(SystemClock.elapsedRealtime() - l2);
      return paramiuf;
    }
    catch (IOException localIOException)
    {
      throw new itu(localIOException);
    }
  }
  
  private static boolean a(int paramInt)
  {
    return (paramInt == 200) || (paramInt == 201);
  }
  
  /* Error */
  public final ity a(android.net.Uri paramUri, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 493	org/json/JSONObject
    //   3: dup
    //   4: aload_3
    //   5: invokespecial 494	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   8: astore 4
    //   10: new 371	iul
    //   13: dup
    //   14: aload 4
    //   16: ldc_w 496
    //   19: invokevirtual 500	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   22: aload 4
    //   24: ldc_w 502
    //   27: invokevirtual 500	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   30: aload 4
    //   32: ldc_w 504
    //   35: invokevirtual 508	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   38: aload 4
    //   40: ldc_w 510
    //   43: invokevirtual 500	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   46: invokespecial 513	iul:<init>	(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    //   49: astore 5
    //   51: new 255	iur
    //   54: dup
    //   55: aload_0
    //   56: getfield 118	itz:j	Landroid/content/Context;
    //   59: aload_1
    //   60: aload_2
    //   61: aload 5
    //   63: getfield 514	iul:d	Ljava/lang/String;
    //   66: aconst_null
    //   67: aconst_null
    //   68: aconst_null
    //   69: invokespecial 517	iur:<init>	(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lply;Lqmg;Lnrz;)V
    //   72: astore 6
    //   74: aload 5
    //   76: getfield 519	iul:c	Z
    //   79: ifeq +8 -> 87
    //   82: aload 6
    //   84: invokevirtual 520	iur:a	()V
    //   87: new 522	ium
    //   90: dup
    //   91: aload_0
    //   92: getfield 118	itz:j	Landroid/content/Context;
    //   95: aload_0
    //   96: getfield 164	itz:k	Lkcq;
    //   99: aload 5
    //   101: getfield 523	iul:a	Ljava/lang/String;
    //   104: invokespecial 526	ium:<init>	(Landroid/content/Context;Lkcb;Ljava/lang/String;)V
    //   107: astore 7
    //   109: aload_0
    //   110: aload 7
    //   112: invokespecial 404	itz:a	(Liuf;)Liuf;
    //   115: pop
    //   116: aload 7
    //   118: getfield 407	iuf:d	I
    //   121: istore 11
    //   123: iload 11
    //   125: invokestatic 410	itz:a	(I)Z
    //   128: ifeq +68 -> 196
    //   131: aload 7
    //   133: aload 6
    //   135: invokestatic 415	itz:a	(Liuf;Liur;)Lity;
    //   138: astore 21
    //   140: aload_0
    //   141: iconst_0
    //   142: putfield 396	itz:i	Z
    //   145: aload 21
    //   147: areturn
    //   148: astore 22
    //   150: aload_1
    //   151: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   154: astore 23
    //   156: new 366	itt
    //   159: dup
    //   160: new 186	java/lang/StringBuilder
    //   163: dup
    //   164: bipush 30
    //   166: aload 23
    //   168: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   171: invokevirtual 310	java/lang/String:length	()I
    //   174: iadd
    //   175: invokespecial 187	java/lang/StringBuilder:<init>	(I)V
    //   178: ldc_w 528
    //   181: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: aload 23
    //   186: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: invokevirtual 443	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: invokespecial 529	itt:<init>	(Ljava/lang/String;)V
    //   195: athrow
    //   196: iload 11
    //   198: sipush 308
    //   201: if_icmpne +127 -> 328
    //   204: iconst_1
    //   205: istore 12
    //   207: iload 12
    //   209: ifeq +177 -> 386
    //   212: aload 7
    //   214: getfield 530	ium:a	Ljava/lang/String;
    //   217: ifnull +169 -> 386
    //   220: aload 7
    //   222: getfield 530	ium:a	Ljava/lang/String;
    //   225: astore 14
    //   227: aload 14
    //   229: ifnull +105 -> 334
    //   232: getstatic 105	itz:g	Ljava/util/regex/Pattern;
    //   235: aload 14
    //   237: invokevirtual 534	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   240: astore 15
    //   242: aload 15
    //   244: invokevirtual 540	java/util/regex/Matcher:find	()Z
    //   247: ifeq +87 -> 334
    //   250: lconst_1
    //   251: aload 15
    //   253: iconst_2
    //   254: invokevirtual 543	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   257: invokestatic 549	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   260: ladd
    //   261: lstore 16
    //   263: lload 16
    //   265: lconst_0
    //   266: lcmp
    //   267: ifge +90 -> 357
    //   270: aload 14
    //   272: invokestatic 307	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   275: astore 18
    //   277: aload 18
    //   279: invokevirtual 310	java/lang/String:length	()I
    //   282: ifeq +60 -> 342
    //   285: ldc_w 551
    //   288: aload 18
    //   290: invokevirtual 554	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   293: astore 19
    //   295: new 366	itt
    //   298: dup
    //   299: aload 19
    //   301: invokespecial 529	itt:<init>	(Ljava/lang/String;)V
    //   304: athrow
    //   305: astore 9
    //   307: new 366	itt
    //   310: dup
    //   311: aload 9
    //   313: aload_3
    //   314: invokespecial 459	itt:<init>	(Ljava/lang/Exception;Ljava/lang/String;)V
    //   317: athrow
    //   318: astore 8
    //   320: aload_0
    //   321: iconst_0
    //   322: putfield 396	itz:i	Z
    //   325: aload 8
    //   327: athrow
    //   328: iconst_0
    //   329: istore 12
    //   331: goto -124 -> 207
    //   334: ldc2_w 555
    //   337: lstore 16
    //   339: goto -76 -> 263
    //   342: new 71	java/lang/String
    //   345: dup
    //   346: ldc_w 551
    //   349: invokespecial 557	java/lang/String:<init>	(Ljava/lang/String;)V
    //   352: astore 19
    //   354: goto -59 -> 295
    //   357: aload_0
    //   358: aload 5
    //   360: getfield 523	iul:a	Ljava/lang/String;
    //   363: aload 6
    //   365: aload 5
    //   367: getfield 558	iul:b	Ljava/lang/String;
    //   370: iconst_0
    //   371: lload 16
    //   373: invokespecial 560	itz:a	(Ljava/lang/String;Liur;Ljava/lang/String;ZJ)Lity;
    //   376: astore 20
    //   378: aload_0
    //   379: iconst_0
    //   380: putfield 396	itz:i	Z
    //   383: aload 20
    //   385: areturn
    //   386: iload 11
    //   388: sipush 401
    //   391: if_icmpne +17 -> 408
    //   394: new 487	itu
    //   397: dup
    //   398: sipush 401
    //   401: invokestatic 464	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   404: invokespecial 561	itu:<init>	(Ljava/lang/String;)V
    //   407: athrow
    //   408: aload 7
    //   410: getfield 407	iuf:d	I
    //   413: istore 13
    //   415: new 366	itt
    //   418: dup
    //   419: new 186	java/lang/StringBuilder
    //   422: dup
    //   423: bipush 32
    //   425: invokespecial 187	java/lang/StringBuilder:<init>	(I)V
    //   428: ldc_w 563
    //   431: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: iload 13
    //   436: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   439: invokevirtual 443	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   442: invokespecial 529	itt:<init>	(Ljava/lang/String;)V
    //   445: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	446	0	this	itz
    //   0	446	1	paramUri	android.net.Uri
    //   0	446	2	paramString1	String
    //   0	446	3	paramString2	String
    //   8	31	4	localJSONObject	org.json.JSONObject
    //   49	317	5	localiul	iul
    //   72	292	6	localiur	iur
    //   107	302	7	localium	ium
    //   318	8	8	localObject	Object
    //   305	7	9	localIOException	IOException
    //   121	271	11	i1	int
    //   205	125	12	i2	int
    //   413	22	13	i3	int
    //   225	46	14	str1	String
    //   240	12	15	localMatcher	java.util.regex.Matcher
    //   261	111	16	l1	long
    //   275	14	18	str2	String
    //   293	60	19	str3	String
    //   376	8	20	locality1	ity
    //   138	8	21	locality2	ity
    //   148	1	22	localJSONException	org.json.JSONException
    //   154	31	23	str4	String
    // Exception table:
    //   from	to	target	type
    //   0	51	148	org/json/JSONException
    //   109	140	305	java/io/IOException
    //   212	227	305	java/io/IOException
    //   232	263	305	java/io/IOException
    //   270	295	305	java/io/IOException
    //   295	305	305	java/io/IOException
    //   342	354	305	java/io/IOException
    //   357	378	305	java/io/IOException
    //   394	408	305	java/io/IOException
    //   408	446	305	java/io/IOException
    //   109	140	318	finally
    //   212	227	318	finally
    //   232	263	318	finally
    //   270	295	318	finally
    //   295	305	318	finally
    //   307	318	318	finally
    //   342	354	318	finally
    //   357	378	318	finally
    //   394	408	318	finally
    //   408	446	318	finally
  }
  
  /* Error */
  public final ity a(iuo paramiuo)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 255	iur
    //   5: dup
    //   6: aload_0
    //   7: getfield 118	itz:j	Landroid/content/Context;
    //   10: aload_1
    //   11: getfield 572	iuo:a	Landroid/net/Uri;
    //   14: aload_1
    //   15: getfield 573	iuo:b	Ljava/lang/String;
    //   18: aload_1
    //   19: getfield 574	iuo:d	Ljava/lang/String;
    //   22: aload_1
    //   23: getfield 577	iuo:m	Lply;
    //   26: aload_1
    //   27: getfield 580	iuo:n	Lqmg;
    //   30: aload_1
    //   31: getfield 583	iuo:o	Lnrz;
    //   34: invokespecial 517	iur:<init>	(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lply;Lqmg;Lnrz;)V
    //   37: astore_3
    //   38: aload_1
    //   39: getfield 585	iuo:j	Z
    //   42: ifne +21 -> 63
    //   45: aload_0
    //   46: getfield 118	itz:j	Landroid/content/Context;
    //   49: aload_1
    //   50: getfield 572	iuo:a	Landroid/net/Uri;
    //   53: invokestatic 588	efj:d	(Landroid/content/Context;Landroid/net/Uri;)Z
    //   56: ifeq +7 -> 63
    //   59: aload_3
    //   60: invokevirtual 520	iur:a	()V
    //   63: aload_1
    //   64: getfield 589	iuo:c	Ljava/lang/String;
    //   67: invokestatic 595	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   70: ifne +11 -> 81
    //   73: aload_3
    //   74: aload_1
    //   75: getfield 589	iuo:c	Ljava/lang/String;
    //   78: putfield 597	iur:i	Ljava/lang/String;
    //   81: aload_1
    //   82: getfield 599	iuo:i	J
    //   85: lconst_0
    //   86: lcmp
    //   87: ifle +11 -> 98
    //   90: aload_3
    //   91: aload_1
    //   92: getfield 599	iuo:i	J
    //   95: putfield 601	iur:h	J
    //   98: aload_3
    //   99: getfield 391	iur:a	Ljava/lang/String;
    //   102: astore 13
    //   104: getstatic 95	itz:f	Ljava/util/Set;
    //   107: aload 13
    //   109: invokeinterface 604 2 0
    //   114: ifeq +75 -> 189
    //   117: new 606	itp
    //   120: dup
    //   121: aload 13
    //   123: iconst_0
    //   124: invokespecial 609	itp:<init>	(Ljava/lang/String;Z)V
    //   127: athrow
    //   128: astore 10
    //   130: aload_3
    //   131: astore 11
    //   133: aload 10
    //   135: astore 12
    //   137: new 611	itq
    //   140: dup
    //   141: aload 12
    //   143: invokespecial 612	itq:<init>	(Ljava/lang/Throwable;)V
    //   146: athrow
    //   147: astore 5
    //   149: aload 11
    //   151: astore_2
    //   152: aload_2
    //   153: ifnull +28 -> 181
    //   156: aload_2
    //   157: getfield 613	iur:j	Z
    //   160: ifeq +21 -> 181
    //   163: new 615	java/io/File
    //   166: dup
    //   167: aload_2
    //   168: getfield 334	iur:m	Landroid/net/Uri;
    //   171: invokevirtual 620	android/net/Uri:getPath	()Ljava/lang/String;
    //   174: invokespecial 621	java/io/File:<init>	(Ljava/lang/String;)V
    //   177: invokevirtual 624	java/io/File:delete	()Z
    //   180: pop
    //   181: aload_0
    //   182: iconst_0
    //   183: putfield 396	itz:i	Z
    //   186: aload 5
    //   188: athrow
    //   189: aload 13
    //   191: ifnull +79 -> 270
    //   194: aload 13
    //   196: ldc_w 626
    //   199: invokevirtual 629	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   202: ifne +444 -> 646
    //   205: aload 13
    //   207: ldc_w 631
    //   210: invokevirtual 629	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   213: ifne +433 -> 646
    //   216: aload 13
    //   218: ldc_w 633
    //   221: invokevirtual 629	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   224: ifeq +46 -> 270
    //   227: goto +419 -> 646
    //   230: iload 14
    //   232: ifne +44 -> 276
    //   235: new 606	itp
    //   238: dup
    //   239: aload 13
    //   241: iconst_1
    //   242: invokespecial 609	itp:<init>	(Ljava/lang/String;Z)V
    //   245: athrow
    //   246: astore 8
    //   248: aload_3
    //   249: astore_2
    //   250: aload 8
    //   252: astore 9
    //   254: new 366	itt
    //   257: dup
    //   258: aload 9
    //   260: aconst_null
    //   261: invokespecial 459	itt:<init>	(Ljava/lang/Exception;Ljava/lang/String;)V
    //   264: athrow
    //   265: astore 5
    //   267: goto -115 -> 152
    //   270: iconst_0
    //   271: istore 14
    //   273: goto -43 -> 230
    //   276: aload_1
    //   277: getfield 635	iuo:l	Z
    //   280: istore 15
    //   282: aload_0
    //   283: getfield 138	itz:o	Z
    //   286: ifeq +132 -> 418
    //   289: ldc_w 637
    //   292: astore 16
    //   294: aload_0
    //   295: getfield 118	itz:j	Landroid/content/Context;
    //   298: ldc_w 639
    //   301: aload 16
    //   303: iconst_0
    //   304: iconst_1
    //   305: getstatic 53	itz:e	Landroid/os/Bundle;
    //   308: invokestatic 642	efj:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZLandroid/os/Bundle;)Ljava/lang/String;
    //   311: astore 17
    //   313: aload_0
    //   314: getfield 118	itz:j	Landroid/content/Context;
    //   317: astore 18
    //   319: aload_0
    //   320: getfield 164	itz:k	Lkcq;
    //   323: astore 19
    //   325: aload_0
    //   326: getfield 130	itz:n	Ljava/lang/String;
    //   329: astore 20
    //   331: aload_0
    //   332: getfield 126	itz:m	Ljava/lang/String;
    //   335: astore 21
    //   337: aload_0
    //   338: getfield 151	itz:r	Liue;
    //   341: ifnonnull +93 -> 434
    //   344: aload_0
    //   345: getfield 142	itz:p	Liun;
    //   348: astore 22
    //   350: new 644	itj
    //   353: dup
    //   354: aload 18
    //   356: aload 19
    //   358: aload 17
    //   360: aload_1
    //   361: aload_3
    //   362: aload 20
    //   364: aload 21
    //   366: aload 22
    //   368: invokespecial 647	itj:<init>	(Landroid/content/Context;Lkcb;Ljava/lang/String;Liuo;Liur;Ljava/lang/String;Ljava/lang/String;Liun;)V
    //   371: astore 23
    //   373: aload_0
    //   374: aload 23
    //   376: invokespecial 404	itz:a	(Liuf;)Liuf;
    //   379: pop
    //   380: aload 23
    //   382: getfield 407	iuf:d	I
    //   385: istore 25
    //   387: iload 25
    //   389: invokestatic 410	itz:a	(I)Z
    //   392: ifeq +104 -> 496
    //   395: aload 23
    //   397: getfield 648	itj:a	Ljava/lang/String;
    //   400: astore 26
    //   402: aload 26
    //   404: ifnonnull +44 -> 448
    //   407: new 167	itv
    //   410: dup
    //   411: ldc_w 650
    //   414: invokespecial 172	itv:<init>	(Ljava/lang/String;)V
    //   417: athrow
    //   418: aload_0
    //   419: getfield 651	itz:b	Ljava/lang/String;
    //   422: ifnull +241 -> 663
    //   425: aload_0
    //   426: getfield 651	itz:b	Ljava/lang/String;
    //   429: astore 16
    //   431: goto -137 -> 294
    //   434: aload_0
    //   435: getfield 151	itz:r	Liue;
    //   438: invokeinterface 654 1 0
    //   443: astore 22
    //   445: goto -95 -> 350
    //   448: aload_0
    //   449: aload 26
    //   451: aload_3
    //   452: aconst_null
    //   453: aload_1
    //   454: getfield 635	iuo:l	Z
    //   457: lconst_0
    //   458: invokespecial 560	itz:a	(Ljava/lang/String;Liur;Ljava/lang/String;ZJ)Lity;
    //   461: astore 27
    //   463: aload_3
    //   464: getfield 613	iur:j	Z
    //   467: ifeq +21 -> 488
    //   470: new 615	java/io/File
    //   473: dup
    //   474: aload_3
    //   475: getfield 334	iur:m	Landroid/net/Uri;
    //   478: invokevirtual 620	android/net/Uri:getPath	()Ljava/lang/String;
    //   481: invokespecial 621	java/io/File:<init>	(Ljava/lang/String;)V
    //   484: invokevirtual 624	java/io/File:delete	()Z
    //   487: pop
    //   488: aload_0
    //   489: iconst_0
    //   490: putfield 396	itz:i	Z
    //   493: aload 27
    //   495: areturn
    //   496: iload 25
    //   498: sipush 400
    //   501: if_icmpne +34 -> 535
    //   504: new 167	itv
    //   507: dup
    //   508: new 186	java/lang/StringBuilder
    //   511: dup
    //   512: bipush 55
    //   514: invokespecial 187	java/lang/StringBuilder:<init>	(I)V
    //   517: ldc_w 442
    //   520: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: iload 25
    //   525: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   528: invokevirtual 443	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   531: invokespecial 172	itv:<init>	(Ljava/lang/String;)V
    //   534: athrow
    //   535: iload 25
    //   537: sipush 401
    //   540: if_icmpne +17 -> 557
    //   543: new 487	itu
    //   546: dup
    //   547: sipush 401
    //   550: invokestatic 464	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   553: invokespecial 561	itu:<init>	(Ljava/lang/String;)V
    //   556: athrow
    //   557: iload 25
    //   559: sipush 503
    //   562: if_icmpne +122 -> 684
    //   565: new 366	itt
    //   568: dup
    //   569: ldc_w 656
    //   572: iconst_1
    //   573: invokespecial 657	itt:<init>	(Ljava/lang/String;Z)V
    //   576: athrow
    //   577: new 366	itt
    //   580: dup
    //   581: new 186	java/lang/StringBuilder
    //   584: dup
    //   585: bipush 34
    //   587: invokespecial 187	java/lang/StringBuilder:<init>	(I)V
    //   590: ldc_w 659
    //   593: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   596: iload 25
    //   598: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   601: invokevirtual 443	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   604: invokespecial 529	itt:<init>	(Ljava/lang/String;)V
    //   607: athrow
    //   608: new 167	itv
    //   611: dup
    //   612: iload 25
    //   614: invokestatic 464	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   617: invokespecial 172	itv:<init>	(Ljava/lang/String;)V
    //   620: athrow
    //   621: astore 6
    //   623: goto -442 -> 181
    //   626: astore 9
    //   628: aconst_null
    //   629: astore_2
    //   630: goto -376 -> 254
    //   633: astore 12
    //   635: aconst_null
    //   636: astore 11
    //   638: goto -501 -> 137
    //   641: astore 28
    //   643: goto -155 -> 488
    //   646: iconst_1
    //   647: istore 14
    //   649: goto -419 -> 230
    //   652: astore 4
    //   654: aload_3
    //   655: astore_2
    //   656: aload 4
    //   658: astore 5
    //   660: goto -508 -> 152
    //   663: iload 15
    //   665: ifeq +11 -> 676
    //   668: ldc_w 661
    //   671: astore 16
    //   673: goto -379 -> 294
    //   676: ldc_w 663
    //   679: astore 16
    //   681: goto -387 -> 294
    //   684: iload 25
    //   686: ifeq -109 -> 577
    //   689: iload 25
    //   691: sipush 500
    //   694: if_icmplt -86 -> 608
    //   697: iload 25
    //   699: sipush 600
    //   702: if_icmpge -94 -> 608
    //   705: goto -128 -> 577
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	708	0	this	itz
    //   0	708	1	paramiuo	iuo
    //   1	655	2	localObject1	Object
    //   37	618	3	localiur1	iur
    //   652	5	4	localObject2	Object
    //   147	40	5	localObject3	Object
    //   265	1	5	localObject4	Object
    //   658	1	5	localObject5	Object
    //   621	1	6	localException1	java.lang.Exception
    //   246	5	8	localIOException1	IOException
    //   252	7	9	localIOException2	IOException
    //   626	1	9	localIOException3	IOException
    //   128	6	10	localFileNotFoundException1	java.io.FileNotFoundException
    //   131	506	11	localiur2	iur
    //   135	7	12	localFileNotFoundException2	java.io.FileNotFoundException
    //   633	1	12	localFileNotFoundException3	java.io.FileNotFoundException
    //   102	138	13	str1	String
    //   230	418	14	i1	int
    //   280	384	15	bool	boolean
    //   292	388	16	str2	String
    //   311	48	17	str3	String
    //   317	38	18	localContext	Context
    //   323	34	19	localkcq	kcq
    //   329	34	20	str4	String
    //   335	30	21	str5	String
    //   348	96	22	localiun	iun
    //   371	25	23	localitj	itj
    //   385	318	25	i2	int
    //   400	50	26	str6	String
    //   461	33	27	locality	ity
    //   641	1	28	localException2	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   38	63	128	java/io/FileNotFoundException
    //   63	81	128	java/io/FileNotFoundException
    //   81	98	128	java/io/FileNotFoundException
    //   98	128	128	java/io/FileNotFoundException
    //   194	227	128	java/io/FileNotFoundException
    //   235	246	128	java/io/FileNotFoundException
    //   276	289	128	java/io/FileNotFoundException
    //   294	350	128	java/io/FileNotFoundException
    //   350	402	128	java/io/FileNotFoundException
    //   407	418	128	java/io/FileNotFoundException
    //   418	431	128	java/io/FileNotFoundException
    //   434	445	128	java/io/FileNotFoundException
    //   448	463	128	java/io/FileNotFoundException
    //   504	535	128	java/io/FileNotFoundException
    //   543	557	128	java/io/FileNotFoundException
    //   565	577	128	java/io/FileNotFoundException
    //   577	608	128	java/io/FileNotFoundException
    //   608	621	128	java/io/FileNotFoundException
    //   137	147	147	finally
    //   38	63	246	java/io/IOException
    //   63	81	246	java/io/IOException
    //   81	98	246	java/io/IOException
    //   98	128	246	java/io/IOException
    //   194	227	246	java/io/IOException
    //   235	246	246	java/io/IOException
    //   276	289	246	java/io/IOException
    //   294	350	246	java/io/IOException
    //   350	402	246	java/io/IOException
    //   407	418	246	java/io/IOException
    //   418	431	246	java/io/IOException
    //   434	445	246	java/io/IOException
    //   448	463	246	java/io/IOException
    //   504	535	246	java/io/IOException
    //   543	557	246	java/io/IOException
    //   565	577	246	java/io/IOException
    //   577	608	246	java/io/IOException
    //   608	621	246	java/io/IOException
    //   2	38	265	finally
    //   254	265	265	finally
    //   156	181	621	java/lang/Exception
    //   2	38	626	java/io/IOException
    //   2	38	633	java/io/FileNotFoundException
    //   463	488	641	java/lang/Exception
    //   38	63	652	finally
    //   63	81	652	finally
    //   81	98	652	finally
    //   98	128	652	finally
    //   194	227	652	finally
    //   235	246	652	finally
    //   276	289	652	finally
    //   294	350	652	finally
    //   350	402	652	finally
    //   407	418	652	finally
    //   418	431	652	finally
    //   434	445	652	finally
    //   448	463	652	finally
    //   504	535	652	finally
    //   543	557	652	finally
    //   565	577	652	finally
    //   577	608	652	finally
    //   608	621	652	finally
  }
  
  public final void a()
  {
    try
    {
      this.i = true;
      if (this.h != null)
      {
        this.h.a.g();
        this.h = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void b()
  {
    itg localitg = this.q;
    if (localitg != itg.a)
    {
      if (localitg.b == null) {
        throw new IllegalStateException("must supply network capability to validate constraints");
      }
      if ((localitg.b.e()) && (!localitg.c)) {
        throw new ito("metered network not allowed");
      }
      if ((localitg.b.f()) && (!localitg.d)) {
        throw new ito("roaming not allowed");
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     itz
 * JD-Core Version:    0.7.0.1
 */