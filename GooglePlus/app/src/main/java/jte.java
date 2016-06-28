import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;

final class jte
  implements Runnable
{
  public File a;
  public RandomAccessFile b;
  public long c = 0L;
  public int d = 1;
  public long e;
  public int f;
  private String h;
  
  public jte(jtc paramjtc, String paramString)
  {
    this.h = paramString;
  }
  
  private final void a(int paramInt)
  {
    this.d = paramInt;
    this.g.a.remove(this.h);
    this.g.notifyAll();
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 24	jte:g	Ljtc;
    //   6: astore_2
    //   7: aload_2
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 31	jte:d	I
    //   13: iload_1
    //   14: if_icmpne +747 -> 761
    //   17: iload_1
    //   18: invokestatic 56	iaw:a	(Z)V
    //   21: aload_0
    //   22: getfield 58	jte:f	I
    //   25: ifne +12 -> 37
    //   28: aload_0
    //   29: bipush 16
    //   31: invokespecial 60	jte:a	(I)V
    //   34: aload_2
    //   35: monitorexit
    //   36: return
    //   37: aload_0
    //   38: iconst_2
    //   39: putfield 31	jte:d	I
    //   42: aload_2
    //   43: monitorexit
    //   44: aload_0
    //   45: getfield 33	jte:h	Ljava/lang/String;
    //   48: invokestatic 63	iaw:b	(Ljava/lang/Object;)Ljava/lang/String;
    //   51: invokestatic 68	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   54: astore 4
    //   56: aload 4
    //   58: invokevirtual 72	java/lang/String:length	()I
    //   61: ifeq +248 -> 309
    //   64: ldc 74
    //   66: aload 4
    //   68: invokevirtual 78	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   71: astore 5
    //   73: aload 5
    //   75: invokestatic 83	jsm:a	(Ljava/lang/String;)I
    //   78: istore 6
    //   80: aload_0
    //   81: aload_0
    //   82: getfield 24	jte:g	Ljtc;
    //   85: getfield 86	jtc:c	Ljtd;
    //   88: invokeinterface 91 1 0
    //   93: putfield 93	jte:a	Ljava/io/File;
    //   96: aload_0
    //   97: new 95	java/io/RandomAccessFile
    //   100: dup
    //   101: aload_0
    //   102: getfield 93	jte:a	Ljava/io/File;
    //   105: ldc 97
    //   107: invokespecial 100	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   110: putfield 102	jte:b	Ljava/io/RandomAccessFile;
    //   113: aload_0
    //   114: getfield 33	jte:h	Ljava/lang/String;
    //   117: invokestatic 107	jsi:a	(Ljava/lang/String;)Ljava/io/InputStream;
    //   120: astore 19
    //   122: aload 19
    //   124: astore 10
    //   126: sipush 2048
    //   129: newarray byte
    //   131: astore 21
    //   133: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   136: lstore 22
    //   138: aload 10
    //   140: aload 21
    //   142: invokevirtual 119	java/io/InputStream:read	([B)I
    //   145: istore 25
    //   147: iload 25
    //   149: ifle +340 -> 489
    //   152: aload_0
    //   153: monitorenter
    //   154: aload_0
    //   155: getfield 102	jte:b	Ljava/io/RandomAccessFile;
    //   158: aload_0
    //   159: getfield 29	jte:c	J
    //   162: invokevirtual 123	java/io/RandomAccessFile:seek	(J)V
    //   165: aload_0
    //   166: getfield 102	jte:b	Ljava/io/RandomAccessFile;
    //   169: aload 21
    //   171: iconst_0
    //   172: iload 25
    //   174: invokevirtual 127	java/io/RandomAccessFile:write	([BII)V
    //   177: aload_0
    //   178: monitorexit
    //   179: aload_0
    //   180: getfield 24	jte:g	Ljtc;
    //   183: astore 27
    //   185: aload 27
    //   187: monitorenter
    //   188: aload_0
    //   189: getfield 58	jte:f	I
    //   192: ifne +251 -> 443
    //   195: aload_0
    //   196: getfield 24	jte:g	Ljtc;
    //   199: getfield 130	jtc:b	Ljava/util/concurrent/LinkedBlockingQueue;
    //   202: invokevirtual 136	java/util/concurrent/LinkedBlockingQueue:isEmpty	()Z
    //   205: ifeq +14 -> 219
    //   208: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   211: aload_0
    //   212: getfield 138	jte:e	J
    //   215: lcmp
    //   216: ifle +227 -> 443
    //   219: aload_0
    //   220: bipush 16
    //   222: invokespecial 60	jte:a	(I)V
    //   225: aload 27
    //   227: monitorexit
    //   228: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   231: lload 22
    //   233: lsub
    //   234: invokestatic 140	jsm:a	(J)V
    //   237: aload_0
    //   238: getfield 31	jte:d	I
    //   241: iconst_4
    //   242: if_icmpeq +8 -> 250
    //   245: aload 10
    //   247: invokestatic 143	jsi:a	(Ljava/io/InputStream;)V
    //   250: aload 10
    //   252: invokestatic 146	iaw:a	(Ljava/io/Closeable;)V
    //   255: aload_0
    //   256: getfield 24	jte:g	Ljtc;
    //   259: astore 30
    //   261: aload 30
    //   263: monitorenter
    //   264: aload_0
    //   265: getfield 58	jte:f	I
    //   268: ifne +25 -> 293
    //   271: aload_0
    //   272: getfield 102	jte:b	Ljava/io/RandomAccessFile;
    //   275: invokestatic 146	iaw:a	(Ljava/io/Closeable;)V
    //   278: aload_0
    //   279: getfield 31	jte:d	I
    //   282: iconst_4
    //   283: if_icmpeq +10 -> 293
    //   286: aload_0
    //   287: getfield 93	jte:a	Ljava/io/File;
    //   290: invokestatic 149	jtc:a	(Ljava/io/File;)V
    //   293: aload 30
    //   295: monitorexit
    //   296: iload 6
    //   298: ldc 151
    //   300: invokestatic 154	jsm:a	(ILjava/lang/String;)V
    //   303: return
    //   304: astore_3
    //   305: aload_2
    //   306: monitorexit
    //   307: aload_3
    //   308: athrow
    //   309: new 65	java/lang/String
    //   312: dup
    //   313: ldc 74
    //   315: invokespecial 157	java/lang/String:<init>	(Ljava/lang/String;)V
    //   318: astore 5
    //   320: goto -247 -> 73
    //   323: astore 26
    //   325: aload_0
    //   326: monitorexit
    //   327: aload 26
    //   329: athrow
    //   330: astore 24
    //   332: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   335: lload 22
    //   337: lsub
    //   338: invokestatic 140	jsm:a	(J)V
    //   341: aload 24
    //   343: athrow
    //   344: astore 20
    //   346: aload 10
    //   348: astore 8
    //   350: aload_0
    //   351: getfield 24	jte:g	Ljtc;
    //   354: astore 14
    //   356: aload 14
    //   358: monitorenter
    //   359: aload_0
    //   360: bipush 8
    //   362: invokespecial 60	jte:a	(I)V
    //   365: aload 14
    //   367: monitorexit
    //   368: aload_0
    //   369: getfield 31	jte:d	I
    //   372: iconst_4
    //   373: if_icmpeq +8 -> 381
    //   376: aload 8
    //   378: invokestatic 143	jsi:a	(Ljava/io/InputStream;)V
    //   381: aload 8
    //   383: invokestatic 146	iaw:a	(Ljava/io/Closeable;)V
    //   386: aload_0
    //   387: getfield 24	jte:g	Ljtc;
    //   390: astore 16
    //   392: aload 16
    //   394: monitorenter
    //   395: aload_0
    //   396: getfield 58	jte:f	I
    //   399: ifne +25 -> 424
    //   402: aload_0
    //   403: getfield 102	jte:b	Ljava/io/RandomAccessFile;
    //   406: invokestatic 146	iaw:a	(Ljava/io/Closeable;)V
    //   409: aload_0
    //   410: getfield 31	jte:d	I
    //   413: iconst_4
    //   414: if_icmpeq +10 -> 424
    //   417: aload_0
    //   418: getfield 93	jte:a	Ljava/io/File;
    //   421: invokestatic 149	jtc:a	(Ljava/io/File;)V
    //   424: aload 16
    //   426: monitorexit
    //   427: iload 6
    //   429: ldc 151
    //   431: invokestatic 154	jsm:a	(ILjava/lang/String;)V
    //   434: return
    //   435: astore 31
    //   437: aload 30
    //   439: monitorexit
    //   440: aload 31
    //   442: athrow
    //   443: aload_0
    //   444: aload_0
    //   445: getfield 29	jte:c	J
    //   448: iload 25
    //   450: i2l
    //   451: ladd
    //   452: putfield 29	jte:c	J
    //   455: aload_0
    //   456: getfield 24	jte:g	Ljtc;
    //   459: invokevirtual 48	java/lang/Object:notifyAll	()V
    //   462: aload 27
    //   464: monitorexit
    //   465: aload 10
    //   467: aload 21
    //   469: invokevirtual 119	java/io/InputStream:read	([B)I
    //   472: istore 29
    //   474: iload 29
    //   476: istore 25
    //   478: goto -331 -> 147
    //   481: astore 28
    //   483: aload 27
    //   485: monitorexit
    //   486: aload 28
    //   488: athrow
    //   489: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   492: lload 22
    //   494: lsub
    //   495: invokestatic 140	jsm:a	(J)V
    //   498: aload_0
    //   499: getfield 102	jte:b	Ljava/io/RandomAccessFile;
    //   502: invokevirtual 161	java/io/RandomAccessFile:getFD	()Ljava/io/FileDescriptor;
    //   505: invokevirtual 166	java/io/FileDescriptor:sync	()V
    //   508: aload_0
    //   509: getfield 24	jte:g	Ljtc;
    //   512: getfield 86	jtc:c	Ljtd;
    //   515: aload_0
    //   516: getfield 33	jte:h	Ljava/lang/String;
    //   519: aload_0
    //   520: getfield 93	jte:a	Ljava/io/File;
    //   523: invokeinterface 169 3 0
    //   528: aload_0
    //   529: getfield 24	jte:g	Ljtc;
    //   532: astore 33
    //   534: aload 33
    //   536: monitorenter
    //   537: aload_0
    //   538: iconst_4
    //   539: invokespecial 60	jte:a	(I)V
    //   542: aload 33
    //   544: monitorexit
    //   545: aload_0
    //   546: getfield 31	jte:d	I
    //   549: iconst_4
    //   550: if_icmpeq +8 -> 558
    //   553: aload 10
    //   555: invokestatic 143	jsi:a	(Ljava/io/InputStream;)V
    //   558: aload 10
    //   560: invokestatic 146	iaw:a	(Ljava/io/Closeable;)V
    //   563: aload_0
    //   564: getfield 24	jte:g	Ljtc;
    //   567: astore 35
    //   569: aload 35
    //   571: monitorenter
    //   572: aload_0
    //   573: getfield 58	jte:f	I
    //   576: ifne +25 -> 601
    //   579: aload_0
    //   580: getfield 102	jte:b	Ljava/io/RandomAccessFile;
    //   583: invokestatic 146	iaw:a	(Ljava/io/Closeable;)V
    //   586: aload_0
    //   587: getfield 31	jte:d	I
    //   590: iconst_4
    //   591: if_icmpeq +10 -> 601
    //   594: aload_0
    //   595: getfield 93	jte:a	Ljava/io/File;
    //   598: invokestatic 149	jtc:a	(Ljava/io/File;)V
    //   601: aload 35
    //   603: monitorexit
    //   604: iload 6
    //   606: ldc 151
    //   608: invokestatic 154	jsm:a	(ILjava/lang/String;)V
    //   611: return
    //   612: astore 34
    //   614: aload 33
    //   616: monitorexit
    //   617: aload 34
    //   619: athrow
    //   620: astore 11
    //   622: aload_0
    //   623: getfield 31	jte:d	I
    //   626: iconst_4
    //   627: if_icmpeq +8 -> 635
    //   630: aload 10
    //   632: invokestatic 143	jsi:a	(Ljava/io/InputStream;)V
    //   635: aload 10
    //   637: invokestatic 146	iaw:a	(Ljava/io/Closeable;)V
    //   640: aload_0
    //   641: getfield 24	jte:g	Ljtc;
    //   644: astore 12
    //   646: aload 12
    //   648: monitorenter
    //   649: aload_0
    //   650: getfield 58	jte:f	I
    //   653: ifne +25 -> 678
    //   656: aload_0
    //   657: getfield 102	jte:b	Ljava/io/RandomAccessFile;
    //   660: invokestatic 146	iaw:a	(Ljava/io/Closeable;)V
    //   663: aload_0
    //   664: getfield 31	jte:d	I
    //   667: iconst_4
    //   668: if_icmpeq +10 -> 678
    //   671: aload_0
    //   672: getfield 93	jte:a	Ljava/io/File;
    //   675: invokestatic 149	jtc:a	(Ljava/io/File;)V
    //   678: aload 12
    //   680: monitorexit
    //   681: iload 6
    //   683: ldc 151
    //   685: invokestatic 154	jsm:a	(ILjava/lang/String;)V
    //   688: aload 11
    //   690: athrow
    //   691: astore 36
    //   693: aload 35
    //   695: monitorexit
    //   696: aload 36
    //   698: athrow
    //   699: astore 15
    //   701: aload 14
    //   703: monitorexit
    //   704: aload 15
    //   706: athrow
    //   707: astore 9
    //   709: aload 8
    //   711: astore 10
    //   713: aload 9
    //   715: astore 11
    //   717: goto -95 -> 622
    //   720: astore 17
    //   722: aload 16
    //   724: monitorexit
    //   725: aload 17
    //   727: athrow
    //   728: astore 13
    //   730: aload 12
    //   732: monitorexit
    //   733: aload 13
    //   735: athrow
    //   736: astore 18
    //   738: aload 18
    //   740: astore 11
    //   742: aconst_null
    //   743: astore 10
    //   745: goto -123 -> 622
    //   748: astore 7
    //   750: aconst_null
    //   751: astore 8
    //   753: goto -403 -> 350
    //   756: astore 32
    //   758: goto -230 -> 528
    //   761: iconst_0
    //   762: istore_1
    //   763: goto -746 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	766	0	this	jte
    //   1	17	1	i	int
    //   762	1	1	j	int
    //   6	300	2	localjtc1	jtc
    //   304	4	3	localObject1	Object
    //   54	13	4	str1	String
    //   71	248	5	str2	String
    //   78	604	6	k	int
    //   748	1	7	localThrowable1	java.lang.Throwable
    //   348	404	8	localObject2	Object
    //   707	7	9	localObject3	Object
    //   124	620	10	localObject4	Object
    //   620	69	11	localObject5	Object
    //   715	26	11	localObject6	Object
    //   728	6	13	localObject7	Object
    //   699	6	15	localObject8	Object
    //   720	6	17	localObject9	Object
    //   736	3	18	localObject10	Object
    //   120	3	19	localInputStream	java.io.InputStream
    //   344	1	20	localThrowable2	java.lang.Throwable
    //   131	337	21	arrayOfByte	byte[]
    //   136	357	22	l	long
    //   330	12	24	localObject11	Object
    //   145	332	25	m	int
    //   323	5	26	localObject12	Object
    //   183	301	27	localjtc5	jtc
    //   481	6	28	localObject13	Object
    //   472	3	29	n	int
    //   259	179	30	localjtc6	jtc
    //   435	6	31	localObject14	Object
    //   756	1	32	localThrowable3	java.lang.Throwable
    //   612	6	34	localObject15	Object
    //   691	6	36	localObject16	Object
    // Exception table:
    //   from	to	target	type
    //   9	17	304	finally
    //   17	36	304	finally
    //   37	44	304	finally
    //   305	307	304	finally
    //   154	179	323	finally
    //   325	327	323	finally
    //   138	147	330	finally
    //   152	154	330	finally
    //   179	188	330	finally
    //   327	330	330	finally
    //   465	474	330	finally
    //   486	489	330	finally
    //   126	138	344	java/lang/Throwable
    //   228	237	344	java/lang/Throwable
    //   332	344	344	java/lang/Throwable
    //   489	498	344	java/lang/Throwable
    //   528	537	344	java/lang/Throwable
    //   617	620	344	java/lang/Throwable
    //   264	293	435	finally
    //   293	296	435	finally
    //   437	440	435	finally
    //   188	219	481	finally
    //   219	228	481	finally
    //   443	465	481	finally
    //   483	486	481	finally
    //   537	545	612	finally
    //   614	617	612	finally
    //   126	138	620	finally
    //   228	237	620	finally
    //   332	344	620	finally
    //   489	498	620	finally
    //   498	528	620	finally
    //   528	537	620	finally
    //   617	620	620	finally
    //   572	601	691	finally
    //   601	604	691	finally
    //   693	696	691	finally
    //   359	368	699	finally
    //   701	704	699	finally
    //   350	359	707	finally
    //   704	707	707	finally
    //   395	424	720	finally
    //   424	427	720	finally
    //   722	725	720	finally
    //   649	678	728	finally
    //   678	681	728	finally
    //   730	733	728	finally
    //   80	122	736	finally
    //   80	122	748	java/lang/Throwable
    //   498	528	756	java/lang/Throwable
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jte
 * JD-Core Version:    0.7.0.1
 */