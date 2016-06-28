import android.graphics.Bitmap;
import android.os.AsyncTask;

final class bqb
  extends AsyncTask<Void, Void, Void>
{
  bqb(bpz parambpz, Bitmap paramBitmap) {}
  
  /* Error */
  private Void a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 13	bqb:b	Lbpz;
    //   6: astore_2
    //   7: aload_2
    //   8: getfield 28	bpz:a	Landroid/content/Context;
    //   11: invokevirtual 34	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   14: astore_3
    //   15: aload_2
    //   16: invokevirtual 38	bpz:i	()Lipf;
    //   19: getfield 44	ipf:d	Landroid/net/Uri;
    //   22: ifnull +407 -> 429
    //   25: iconst_1
    //   26: istore 4
    //   28: iload 4
    //   30: ifeq +242 -> 272
    //   33: aload_2
    //   34: invokevirtual 38	bpz:i	()Lipf;
    //   37: getfield 44	ipf:d	Landroid/net/Uri;
    //   40: astore 5
    //   42: aload_3
    //   43: aload 5
    //   45: invokevirtual 50	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   48: astore 14
    //   50: aload 14
    //   52: astore 7
    //   54: new 52	hxp
    //   57: dup
    //   58: invokespecial 53	hxp:<init>	()V
    //   61: astore 15
    //   63: aload 15
    //   65: aload 7
    //   67: invokevirtual 56	hxp:a	(Ljava/io/InputStream;)V
    //   70: getstatic 60	hxp:n	I
    //   73: istore 20
    //   75: aload 15
    //   77: iload 20
    //   79: aload 15
    //   81: iload 20
    //   83: invokevirtual 63	hxp:d	(I)I
    //   86: invokevirtual 66	hxp:a	(II)Lhya;
    //   89: astore 21
    //   91: aload 21
    //   93: ifnull +181 -> 274
    //   96: aload 21
    //   98: getfield 72	hya:g	Ljava/lang/Object;
    //   101: ifnull +173 -> 274
    //   104: aload 21
    //   106: getfield 72	hya:g	Ljava/lang/Object;
    //   109: instanceof 74
    //   112: ifeq +162 -> 274
    //   115: aload 21
    //   117: getfield 72	hya:g	Ljava/lang/Object;
    //   120: checkcast 74	[J
    //   123: astore 31
    //   125: aload 31
    //   127: arraylength
    //   128: newarray int
    //   130: astore 32
    //   132: iload_1
    //   133: aload 31
    //   135: arraylength
    //   136: if_icmpge +299 -> 435
    //   139: aload 32
    //   141: iload_1
    //   142: aload 31
    //   144: iload_1
    //   145: laload
    //   146: l2i
    //   147: iastore
    //   148: iinc 1 1
    //   151: goto -19 -> 132
    //   154: aload 22
    //   156: ifnull +286 -> 442
    //   159: aload 22
    //   161: arraylength
    //   162: ifgt +118 -> 280
    //   165: goto +277 -> 442
    //   168: aload 23
    //   170: ifnull +12 -> 182
    //   173: aload_2
    //   174: aload 23
    //   176: invokevirtual 80	java/lang/Integer:intValue	()I
    //   179: putfield 82	bpz:g	I
    //   182: getstatic 85	hxp:c	I
    //   185: istore 24
    //   187: aload 15
    //   189: iload 24
    //   191: aload 15
    //   193: iload 24
    //   195: invokevirtual 63	hxp:d	(I)I
    //   198: invokevirtual 66	hxp:a	(II)Lhya;
    //   201: astore 25
    //   203: aload 25
    //   205: ifnonnull +87 -> 292
    //   208: aconst_null
    //   209: astore 26
    //   211: aload 26
    //   213: ifnull +9 -> 222
    //   216: aload_2
    //   217: aload 26
    //   219: putfield 89	bpz:h	Ljava/lang/String;
    //   222: getstatic 91	hxp:d	I
    //   225: istore 27
    //   227: aload 15
    //   229: iload 27
    //   231: aload 15
    //   233: iload 27
    //   235: invokevirtual 63	hxp:d	(I)I
    //   238: invokevirtual 66	hxp:a	(II)Lhya;
    //   241: astore 28
    //   243: aload 28
    //   245: ifnonnull +57 -> 302
    //   248: aconst_null
    //   249: astore 30
    //   251: aload 30
    //   253: ifnull +9 -> 262
    //   256: aload_2
    //   257: aload 30
    //   259: putfield 93	bpz:i	Ljava/lang/String;
    //   262: aload 7
    //   264: ifnull +8 -> 272
    //   267: aload 7
    //   269: invokevirtual 98	java/io/InputStream:close	()V
    //   272: aconst_null
    //   273: areturn
    //   274: aconst_null
    //   275: astore 22
    //   277: goto -123 -> 154
    //   280: aload 22
    //   282: iconst_0
    //   283: iaload
    //   284: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   287: astore 23
    //   289: goto -121 -> 168
    //   292: aload 25
    //   294: invokevirtual 105	hya:a	()Ljava/lang/String;
    //   297: astore 26
    //   299: goto -88 -> 211
    //   302: aload 28
    //   304: invokevirtual 105	hya:a	()Ljava/lang/String;
    //   307: astore 29
    //   309: aload 29
    //   311: astore 30
    //   313: goto -62 -> 251
    //   316: astore 16
    //   318: ldc 107
    //   320: ldc 109
    //   322: aload 16
    //   324: invokestatic 115	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   327: pop
    //   328: goto -66 -> 262
    //   331: astore 6
    //   333: ldc 107
    //   335: ldc 117
    //   337: aload 6
    //   339: invokestatic 115	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   342: pop
    //   343: aload 7
    //   345: ifnull -73 -> 272
    //   348: aload 7
    //   350: invokevirtual 98	java/io/InputStream:close	()V
    //   353: aconst_null
    //   354: areturn
    //   355: astore 12
    //   357: ldc 107
    //   359: ldc 119
    //   361: aload 12
    //   363: invokestatic 115	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   366: pop
    //   367: aconst_null
    //   368: areturn
    //   369: astore 18
    //   371: ldc 107
    //   373: ldc 119
    //   375: aload 18
    //   377: invokestatic 115	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   380: pop
    //   381: aconst_null
    //   382: areturn
    //   383: astore 8
    //   385: aconst_null
    //   386: astore 7
    //   388: aload 7
    //   390: ifnull +8 -> 398
    //   393: aload 7
    //   395: invokevirtual 98	java/io/InputStream:close	()V
    //   398: aload 8
    //   400: athrow
    //   401: astore 9
    //   403: ldc 107
    //   405: ldc 119
    //   407: aload 9
    //   409: invokestatic 115	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   412: pop
    //   413: goto -15 -> 398
    //   416: astore 8
    //   418: goto -30 -> 388
    //   421: astore 6
    //   423: aconst_null
    //   424: astore 7
    //   426: goto -93 -> 333
    //   429: iconst_0
    //   430: istore 4
    //   432: goto -404 -> 28
    //   435: aload 32
    //   437: astore 22
    //   439: goto -285 -> 154
    //   442: aconst_null
    //   443: astore 23
    //   445: goto -277 -> 168
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	448	0	this	bqb
    //   1	148	1	i	int
    //   6	251	2	localbpz	bpz
    //   14	29	3	localContentResolver	android.content.ContentResolver
    //   26	405	4	j	int
    //   40	4	5	localUri	android.net.Uri
    //   331	7	6	localFileNotFoundException1	java.io.FileNotFoundException
    //   421	1	6	localFileNotFoundException2	java.io.FileNotFoundException
    //   52	373	7	localInputStream1	java.io.InputStream
    //   383	16	8	localObject1	java.lang.Object
    //   416	1	8	localObject2	java.lang.Object
    //   401	7	9	localIOException1	java.io.IOException
    //   355	7	12	localIOException2	java.io.IOException
    //   48	3	14	localInputStream2	java.io.InputStream
    //   61	171	15	localhxp	hxp
    //   316	7	16	localIOException3	java.io.IOException
    //   369	7	18	localIOException4	java.io.IOException
    //   73	9	20	k	int
    //   89	27	21	localhya1	hya
    //   154	284	22	arrayOfInt1	int[]
    //   168	276	23	localInteger	java.lang.Integer
    //   185	9	24	m	int
    //   201	92	25	localhya2	hya
    //   209	89	26	str1	java.lang.String
    //   225	9	27	n	int
    //   241	62	28	localhya3	hya
    //   307	3	29	str2	java.lang.String
    //   249	63	30	localObject3	java.lang.Object
    //   123	20	31	arrayOfLong	long[]
    //   130	306	32	arrayOfInt2	int[]
    // Exception table:
    //   from	to	target	type
    //   63	91	316	java/io/IOException
    //   96	132	316	java/io/IOException
    //   132	148	316	java/io/IOException
    //   159	165	316	java/io/IOException
    //   173	182	316	java/io/IOException
    //   182	203	316	java/io/IOException
    //   216	222	316	java/io/IOException
    //   222	243	316	java/io/IOException
    //   256	262	316	java/io/IOException
    //   280	289	316	java/io/IOException
    //   292	299	316	java/io/IOException
    //   302	309	316	java/io/IOException
    //   54	63	331	java/io/FileNotFoundException
    //   63	91	331	java/io/FileNotFoundException
    //   96	132	331	java/io/FileNotFoundException
    //   132	148	331	java/io/FileNotFoundException
    //   159	165	331	java/io/FileNotFoundException
    //   173	182	331	java/io/FileNotFoundException
    //   182	203	331	java/io/FileNotFoundException
    //   216	222	331	java/io/FileNotFoundException
    //   222	243	331	java/io/FileNotFoundException
    //   256	262	331	java/io/FileNotFoundException
    //   280	289	331	java/io/FileNotFoundException
    //   292	299	331	java/io/FileNotFoundException
    //   302	309	331	java/io/FileNotFoundException
    //   318	328	331	java/io/FileNotFoundException
    //   348	353	355	java/io/IOException
    //   267	272	369	java/io/IOException
    //   42	50	383	finally
    //   393	398	401	java/io/IOException
    //   54	63	416	finally
    //   63	91	416	finally
    //   96	132	416	finally
    //   132	148	416	finally
    //   159	165	416	finally
    //   173	182	416	finally
    //   182	203	416	finally
    //   216	222	416	finally
    //   222	243	416	finally
    //   256	262	416	finally
    //   280	289	416	finally
    //   292	299	416	finally
    //   302	309	416	finally
    //   318	328	416	finally
    //   333	343	416	finally
    //   42	50	421	java/io/FileNotFoundException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqb
 * JD-Core Version:    0.7.0.1
 */