import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.text.TextUtils;
import java.util.List;

public class dch
  extends hqj
  implements dfx<Cursor>
{
  private static final mcq r = new mcq("debug_invalid_uris");
  private static final String[] s = { "corrected_date_taken", "_id" };
  private static final String[] t = { "corrected_added_modified", "_id" };
  private static Uri[] u;
  private static final boolean[] v;
  private static Uri[] w;
  private static final boolean[] x;
  private static Uri[] y;
  private static final boolean[] z = { 1, 1 };
  private boolean A;
  private final fv B = new fv(this);
  private ipf C;
  private final Uri[] D;
  private final boolean[] E;
  private final String[] F;
  private final String G;
  private final boolean H;
  
  static
  {
    Uri[] arrayOfUri1 = new Uri[4];
    arrayOfUri1[0] = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri1[1] = itf.b;
    arrayOfUri1[2] = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri1[3] = itf.a;
    u = arrayOfUri1;
    v = new boolean[] { 0, 0, 1, 1 };
    Uri[] arrayOfUri2 = new Uri[2];
    arrayOfUri2[0] = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri2[1] = itf.b;
    w = arrayOfUri2;
    x = new boolean[] { 0, 0 };
    Uri[] arrayOfUri3 = new Uri[2];
    arrayOfUri3[0] = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri3[1] = itf.a;
    y = arrayOfUri3;
  }
  
  public dch(Context paramContext, List<jpx> paramList, int paramInt, ipf paramipf, String paramString, Uri paramUri)
  {
    super(paramContext, null);
    if ((paramInt & 0x1) != 0)
    {
      this.D = w;
      this.E = x;
    }
    int i;
    for (;;)
    {
      this.F = new String[this.D.length];
      i = this.F.length;
      for (int j = 0; j < i; j++) {
        this.F[j] = null;
      }
      if ((paramInt & 0x2) != 0)
      {
        this.D = y;
        this.E = z;
      }
      else
      {
        this.D = u;
        this.E = v;
      }
    }
    boolean bool;
    label154:
    String str1;
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.C = paramipf;
      if (TextUtils.equals(paramString, jrf.b())) {
        break label461;
      }
      bool = true;
      this.H = bool;
      if ((!this.H) || (paramString == null) || (!jrf.m(paramString))) {
        break label473;
      }
      str1 = jrf.h(jrf.d(paramString));
      if (TextUtils.isEmpty(str1)) {
        break label467;
      }
    }
    for (;;)
    {
      this.G = str1;
      return;
      int k = paramList.size();
      StringBuilder[] arrayOfStringBuilder = new StringBuilder[i];
      String[] arrayOfString = new String[i];
      for (int m = 0; m < i; m++) {
        arrayOfString[m] = this.D[m].toString();
      }
      int n = 0;
      if (n < k)
      {
        ipf localipf = ((jpx)paramList.get(n)).e();
        int i2;
        label302:
        Uri localUri;
        String str2;
        if (localipf != null)
        {
          if (localipf.d == null) {
            break label391;
          }
          i2 = 1;
          if (i2 != 0)
          {
            localUri = localipf.d;
            str2 = localUri.toString();
          }
        }
        for (int i3 = 0;; i3++)
        {
          if (i3 < i)
          {
            if (!str2.startsWith(arrayOfString[i3])) {
              continue;
            }
            if (arrayOfStringBuilder[i3] != null) {
              break label397;
            }
            arrayOfStringBuilder[i3] = new StringBuilder("_data LIKE '%/DCIM/%' AND ").append("_id NOT IN (");
          }
          for (;;)
          {
            arrayOfStringBuilder[i3].append(ContentUris.parseId(localUri));
            n++;
            break;
            label391:
            i2 = 0;
            break label302;
            label397:
            arrayOfStringBuilder[i3].append(',');
          }
        }
      }
      for (int i1 = 0; i1 < i; i1++) {
        if (arrayOfStringBuilder[i1] != null) {
          this.F[i1] = ')';
        }
      }
      break;
      label461:
      bool = false;
      break label154;
      label467:
      str1 = null;
    }
    label473:
    this.G = null;
  }
  
  public static ipf a(Context paramContext, Cursor paramCursor)
  {
    hra localhra = (hra)paramCursor;
    Uri[] arrayOfUri = (Uri[])localhra.getExtras().getParcelableArray("media_uris");
    boolean[] arrayOfBoolean = localhra.getExtras().getBooleanArray("media_is_video");
    int i = localhra.b;
    Uri localUri = ContentUris.withAppendedId(arrayOfUri[i], paramCursor.getLong(0));
    String str1 = paramCursor.getString(5);
    int j;
    String str2;
    if (paramCursor.isNull(6))
    {
      j = 0;
      str2 = efj.a(str1, j, paramCursor.getLong(2));
      if (arrayOfBoolean[i] == 0) {
        break label127;
      }
    }
    label127:
    for (ipm localipm = ipm.b;; localipm = ipm.a)
    {
      return ipf.a(paramContext, localUri, localipm, str2);
      j = paramCursor.getInt(6);
      break;
    }
  }
  
  public final void a(ipf paramipf)
  {
    this.C = paramipf;
  }
  
  protected final void g()
  {
    super.g();
    if (!this.A)
    {
      for (int i = -1 + this.D.length; i >= 0; i--)
      {
        Uri localUri = this.D[i];
        this.l.getContentResolver().registerContentObserver(localUri, false, this.B);
      }
      this.A = true;
    }
  }
  
  protected final void l()
  {
    if (this.A)
    {
      this.l.getContentResolver().unregisterContentObserver(this.B);
      this.A = false;
    }
  }
  
  /* Error */
  public Cursor o()
  {
    // Byte code:
    //   0: ldc_w 292
    //   3: iconst_2
    //   4: invokestatic 298	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   7: ifeq +837 -> 844
    //   10: new 300	dup
    //   13: dup
    //   14: invokespecial 302	dup:<init>	()V
    //   17: astore_1
    //   18: aload_1
    //   19: invokestatic 308	java/lang/System:nanoTime	()J
    //   22: putfield 311	dup:a	J
    //   25: aload_1
    //   26: iconst_1
    //   27: putfield 313	dup:b	Z
    //   30: invokestatic 319	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   33: invokevirtual 322	java/lang/Thread:getName	()Ljava/lang/String;
    //   36: invokestatic 326	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 329	java/lang/String:length	()I
    //   44: ifeq +309 -> 353
    //   47: ldc_w 331
    //   50: aload_2
    //   51: invokevirtual 334	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   54: pop
    //   55: aload_1
    //   56: astore 4
    //   58: aload_0
    //   59: getfield 102	dch:D	[Landroid/net/Uri;
    //   62: arraylength
    //   63: istore 5
    //   65: iload 5
    //   67: anewarray 215	android/database/Cursor
    //   70: astore 6
    //   72: aload_0
    //   73: getfield 144	dch:G	Ljava/lang/String;
    //   76: ifnonnull +294 -> 370
    //   79: aload_0
    //   80: getfield 261	fu:l	Landroid/content/Context;
    //   83: getstatic 339	aau:ph	I
    //   86: invokevirtual 340	android/content/Context:getString	(I)Ljava/lang/String;
    //   89: astore 11
    //   91: goto +759 -> 850
    //   94: iload 13
    //   96: iload 5
    //   98: if_icmpge +407 -> 505
    //   101: aload_0
    //   102: aload_0
    //   103: getfield 102	dch:D	[Landroid/net/Uri;
    //   106: iload 13
    //   108: aaload
    //   109: putfield 343	fp:d	Landroid/net/Uri;
    //   112: aload_0
    //   113: getfield 104	dch:E	[Z
    //   116: iload 13
    //   118: baload
    //   119: ifeq +257 -> 376
    //   122: getstatic 347	dci:b	[Ljava/lang/String;
    //   125: astore 14
    //   127: aload_0
    //   128: aload 14
    //   130: putfield 349	fp:e	[Ljava/lang/String;
    //   133: aload_0
    //   134: getfield 144	dch:G	Ljava/lang/String;
    //   137: ifnull +723 -> 860
    //   140: ldc_w 351
    //   143: astore 15
    //   145: aload_0
    //   146: aload 15
    //   148: putfield 353	fp:h	Ljava/lang/String;
    //   151: aload_0
    //   152: getfield 127	dch:H	Z
    //   155: ifeq +57 -> 212
    //   158: aload_0
    //   159: getfield 144	dch:G	Ljava/lang/String;
    //   162: ifnull +256 -> 418
    //   165: aload_0
    //   166: getfield 104	dch:E	[Z
    //   169: iload 13
    //   171: baload
    //   172: ifeq +212 -> 384
    //   175: getstatic 359	java/util/Locale:US	Ljava/util/Locale;
    //   178: astore 27
    //   180: iconst_1
    //   181: anewarray 361	java/lang/Object
    //   184: astore 28
    //   186: aload 28
    //   188: iconst_0
    //   189: aload_0
    //   190: getfield 144	dch:G	Ljava/lang/String;
    //   193: aastore
    //   194: aload 27
    //   196: ldc_w 363
    //   199: aload 28
    //   201: invokestatic 367	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   204: astore 24
    //   206: aload_0
    //   207: aload 24
    //   209: putfield 370	fp:f	Ljava/lang/String;
    //   212: aload 6
    //   214: iload 13
    //   216: aload_0
    //   217: invokespecial 372	hqj:o	()Landroid/database/Cursor;
    //   220: aastore
    //   221: aload 6
    //   223: iload 13
    //   225: aaload
    //   226: ifnull +14 -> 240
    //   229: aload 6
    //   231: iload 13
    //   233: aaload
    //   234: invokeinterface 376 1 0
    //   239: pop
    //   240: aload_0
    //   241: getfield 144	dch:G	Ljava/lang/String;
    //   244: ifnull +593 -> 837
    //   247: aload 12
    //   249: ifnonnull +588 -> 837
    //   252: aload_0
    //   253: getfield 261	fu:l	Landroid/content/Context;
    //   256: invokevirtual 274	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   259: astore 16
    //   261: aload_0
    //   262: getfield 104	dch:E	[Z
    //   265: iload 13
    //   267: baload
    //   268: ifeq +172 -> 440
    //   271: getstatic 378	dci:d	[Ljava/lang/String;
    //   274: astore 17
    //   276: aload 16
    //   278: aload_0
    //   279: getfield 102	dch:D	[Landroid/net/Uri;
    //   282: iload 13
    //   284: aaload
    //   285: aload 17
    //   287: aload_0
    //   288: getfield 370	fp:f	Ljava/lang/String;
    //   291: aconst_null
    //   292: aconst_null
    //   293: invokevirtual 382	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   296: astore 20
    //   298: aload 20
    //   300: astore 19
    //   302: aload 19
    //   304: ifnull +526 -> 830
    //   307: aload 19
    //   309: invokeinterface 376 1 0
    //   314: ifeq +516 -> 830
    //   317: aload 19
    //   319: iconst_0
    //   320: invokeinterface 227 2 0
    //   325: astore 22
    //   327: aload 22
    //   329: astore 21
    //   331: aload 19
    //   333: ifnull +10 -> 343
    //   336: aload 19
    //   338: invokeinterface 385 1 0
    //   343: iinc 13 1
    //   346: aload 21
    //   348: astore 12
    //   350: goto -256 -> 94
    //   353: new 46	java/lang/String
    //   356: dup
    //   357: ldc_w 331
    //   360: invokespecial 386	java/lang/String:<init>	(Ljava/lang/String;)V
    //   363: pop
    //   364: aload_1
    //   365: astore 4
    //   367: goto -309 -> 58
    //   370: aconst_null
    //   371: astore 11
    //   373: goto +477 -> 850
    //   376: getstatic 388	dci:a	[Ljava/lang/String;
    //   379: astore 14
    //   381: goto -254 -> 127
    //   384: getstatic 359	java/util/Locale:US	Ljava/util/Locale;
    //   387: astore 25
    //   389: iconst_1
    //   390: anewarray 361	java/lang/Object
    //   393: astore 26
    //   395: aload 26
    //   397: iconst_0
    //   398: aload_0
    //   399: getfield 144	dch:G	Ljava/lang/String;
    //   402: aastore
    //   403: aload 25
    //   405: ldc_w 363
    //   408: aload 26
    //   410: invokestatic 367	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   413: astore 24
    //   415: goto -209 -> 206
    //   418: aload_0
    //   419: getfield 106	dch:F	[Ljava/lang/String;
    //   422: iload 13
    //   424: aaload
    //   425: ifnull +443 -> 868
    //   428: aload_0
    //   429: getfield 106	dch:F	[Ljava/lang/String;
    //   432: iload 13
    //   434: aaload
    //   435: astore 24
    //   437: goto -231 -> 206
    //   440: getstatic 391	dci:c	[Ljava/lang/String;
    //   443: astore 17
    //   445: goto -169 -> 276
    //   448: aload 19
    //   450: ifnull +10 -> 460
    //   453: aload 19
    //   455: invokeinterface 385 1 0
    //   460: aload 18
    //   462: athrow
    //   463: astore 7
    //   465: aload 6
    //   467: arraylength
    //   468: istore 8
    //   470: iconst_0
    //   471: istore 9
    //   473: iload 9
    //   475: iload 8
    //   477: if_icmpge +345 -> 822
    //   480: aload 6
    //   482: iload 9
    //   484: aaload
    //   485: astore 10
    //   487: aload 10
    //   489: ifnull +10 -> 499
    //   492: aload 10
    //   494: invokeinterface 385 1 0
    //   499: iinc 9 1
    //   502: goto -29 -> 473
    //   505: aload_0
    //   506: getfield 144	dch:G	Ljava/lang/String;
    //   509: ifnull +277 -> 786
    //   512: getstatic 56	dch:t	[Ljava/lang/String;
    //   515: astore 29
    //   517: new 191	hra
    //   520: dup
    //   521: aload 6
    //   523: aload 29
    //   525: iconst_0
    //   526: invokespecial 394	hra:<init>	([Landroid/database/Cursor;[Ljava/lang/String;I)V
    //   529: astore 30
    //   531: aload 30
    //   533: invokevirtual 195	hra:getExtras	()Landroid/os/Bundle;
    //   536: astore 31
    //   538: aload 31
    //   540: ldc 206
    //   542: aload_0
    //   543: getfield 104	dch:E	[Z
    //   546: invokevirtual 398	android/os/Bundle:putBooleanArray	(Ljava/lang/String;[Z)V
    //   549: aload 31
    //   551: ldc 197
    //   553: aload_0
    //   554: getfield 102	dch:D	[Landroid/net/Uri;
    //   557: invokevirtual 402	android/os/Bundle:putParcelableArray	(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //   560: aload 31
    //   562: ldc_w 404
    //   565: aload 12
    //   567: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   570: aload_0
    //   571: getfield 114	dch:C	Lipf;
    //   574: astore 32
    //   576: aload 32
    //   578: ifnull +98 -> 676
    //   581: aload_0
    //   582: getfield 114	dch:C	Lipf;
    //   585: getfield 163	ipf:d	Landroid/net/Uri;
    //   588: invokestatic 181	android/content/ContentUris:parseId	(Landroid/net/Uri;)J
    //   591: lstore 49
    //   593: lload 49
    //   595: lstore 43
    //   597: lload 43
    //   599: ldc2_w 409
    //   602: lcmp
    //   603: ifeq +73 -> 676
    //   606: aload_0
    //   607: getfield 114	dch:C	Lipf;
    //   610: getfield 412	ipf:e	Lipm;
    //   613: getstatic 241	ipm:b	Lipm;
    //   616: if_acmpne +281 -> 897
    //   619: iconst_1
    //   620: istore 45
    //   622: iconst_0
    //   623: istore 46
    //   625: aload 30
    //   627: invokevirtual 413	hra:moveToFirst	()Z
    //   630: pop
    //   631: aload 30
    //   633: invokevirtual 416	hra:isAfterLast	()Z
    //   636: ifne +40 -> 676
    //   639: aload_0
    //   640: getfield 104	dch:E	[Z
    //   643: aload 30
    //   645: getfield 213	hra:b	I
    //   648: baload
    //   649: iload 45
    //   651: if_icmpne +143 -> 794
    //   654: aload 30
    //   656: iconst_0
    //   657: invokevirtual 417	hra:getLong	(I)J
    //   660: lload 43
    //   662: lcmp
    //   663: ifne +131 -> 794
    //   666: aload 31
    //   668: ldc_w 419
    //   671: iload 46
    //   673: invokevirtual 423	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   676: ldc_w 292
    //   679: iconst_2
    //   680: invokestatic 298	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   683: ifeq +201 -> 884
    //   686: aload 30
    //   688: invokevirtual 426	hra:getCount	()I
    //   691: istore 33
    //   693: aload 4
    //   695: getfield 313	dup:b	Z
    //   698: ifeq +108 -> 806
    //   701: invokestatic 308	java/lang/System:nanoTime	()J
    //   704: aload 4
    //   706: getfield 311	dup:a	J
    //   709: lsub
    //   710: lstore 36
    //   712: lload 36
    //   714: ldc2_w 427
    //   717: ldiv
    //   718: lstore 38
    //   720: invokestatic 319	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   723: invokevirtual 322	java/lang/Thread:getName	()Ljava/lang/String;
    //   726: invokestatic 326	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   729: astore 40
    //   731: new 146	java/lang/StringBuilder
    //   734: dup
    //   735: bipush 81
    //   737: aload 40
    //   739: invokestatic 326	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   742: invokevirtual 329	java/lang/String:length	()I
    //   745: iadd
    //   746: invokespecial 431	java/lang/StringBuilder:<init>	(I)V
    //   749: ldc_w 433
    //   752: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   755: iload 33
    //   757: invokevirtual 436	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   760: ldc_w 438
    //   763: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   766: lload 38
    //   768: invokevirtual 184	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   771: ldc_w 440
    //   774: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: aload 40
    //   779: invokevirtual 175	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   782: pop
    //   783: aload 30
    //   785: areturn
    //   786: getstatic 52	dch:s	[Ljava/lang/String;
    //   789: astore 29
    //   791: goto -274 -> 517
    //   794: iinc 46 1
    //   797: aload 30
    //   799: invokevirtual 443	hra:moveToNext	()Z
    //   802: pop
    //   803: goto -172 -> 631
    //   806: aload 4
    //   808: getfield 311	dup:a	J
    //   811: lstore 34
    //   813: lconst_0
    //   814: lload 34
    //   816: lsub
    //   817: lstore 36
    //   819: goto -107 -> 712
    //   822: aload 7
    //   824: athrow
    //   825: astore 18
    //   827: goto -379 -> 448
    //   830: aload 12
    //   832: astore 21
    //   834: goto -503 -> 331
    //   837: aload 12
    //   839: astore 21
    //   841: goto -498 -> 343
    //   844: aconst_null
    //   845: astore 4
    //   847: goto -789 -> 58
    //   850: aload 11
    //   852: astore 12
    //   854: iconst_0
    //   855: istore 13
    //   857: goto -763 -> 94
    //   860: ldc_w 445
    //   863: astore 15
    //   865: goto -720 -> 145
    //   868: ldc_w 447
    //   871: astore 24
    //   873: goto -667 -> 206
    //   876: astore 18
    //   878: aconst_null
    //   879: astore 19
    //   881: goto -433 -> 448
    //   884: aload 30
    //   886: areturn
    //   887: astore 42
    //   889: ldc2_w 409
    //   892: lstore 43
    //   894: goto -297 -> 597
    //   897: iconst_0
    //   898: istore 45
    //   900: goto -278 -> 622
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	903	0	this	dch
    //   17	348	1	localdup1	dup
    //   39	12	2	str1	String
    //   56	790	4	localdup2	dup
    //   63	36	5	i	int
    //   70	452	6	arrayOfCursor	Cursor[]
    //   463	360	7	localRuntimeException	java.lang.RuntimeException
    //   468	10	8	j	int
    //   471	29	9	k	int
    //   485	8	10	localCursor1	Cursor
    //   89	762	11	str2	String
    //   247	606	12	localObject1	java.lang.Object
    //   94	762	13	m	int
    //   125	255	14	arrayOfString1	String[]
    //   143	721	15	str3	String
    //   259	18	16	localContentResolver	ContentResolver
    //   274	170	17	arrayOfString2	String[]
    //   460	1	18	localObject2	java.lang.Object
    //   825	1	18	localObject3	java.lang.Object
    //   876	1	18	localObject4	java.lang.Object
    //   300	580	19	localCursor2	Cursor
    //   296	3	20	localCursor3	Cursor
    //   329	511	21	localObject5	java.lang.Object
    //   325	3	22	str4	String
    //   204	668	24	str5	String
    //   387	17	25	localLocale1	java.util.Locale
    //   393	16	26	arrayOfObject1	java.lang.Object[]
    //   178	17	27	localLocale2	java.util.Locale
    //   184	16	28	arrayOfObject2	java.lang.Object[]
    //   515	275	29	arrayOfString3	String[]
    //   529	356	30	localhra	hra
    //   536	131	31	localBundle	Bundle
    //   574	3	32	localipf	ipf
    //   691	65	33	n	int
    //   811	4	34	l1	long
    //   710	108	36	l2	long
    //   718	49	38	l3	long
    //   729	49	40	str6	String
    //   887	1	42	localNumberFormatException	java.lang.NumberFormatException
    //   595	298	43	l4	long
    //   620	279	45	i1	int
    //   623	172	46	i2	int
    //   591	3	49	l5	long
    // Exception table:
    //   from	to	target	type
    //   72	91	463	java/lang/RuntimeException
    //   101	127	463	java/lang/RuntimeException
    //   127	140	463	java/lang/RuntimeException
    //   145	206	463	java/lang/RuntimeException
    //   206	212	463	java/lang/RuntimeException
    //   212	240	463	java/lang/RuntimeException
    //   240	247	463	java/lang/RuntimeException
    //   252	276	463	java/lang/RuntimeException
    //   336	343	463	java/lang/RuntimeException
    //   376	381	463	java/lang/RuntimeException
    //   384	415	463	java/lang/RuntimeException
    //   418	437	463	java/lang/RuntimeException
    //   440	445	463	java/lang/RuntimeException
    //   453	460	463	java/lang/RuntimeException
    //   460	463	463	java/lang/RuntimeException
    //   505	517	463	java/lang/RuntimeException
    //   517	576	463	java/lang/RuntimeException
    //   581	593	463	java/lang/RuntimeException
    //   606	619	463	java/lang/RuntimeException
    //   625	631	463	java/lang/RuntimeException
    //   631	676	463	java/lang/RuntimeException
    //   676	712	463	java/lang/RuntimeException
    //   712	783	463	java/lang/RuntimeException
    //   786	791	463	java/lang/RuntimeException
    //   797	803	463	java/lang/RuntimeException
    //   806	813	463	java/lang/RuntimeException
    //   307	327	825	finally
    //   276	298	876	finally
    //   581	593	887	java/lang/NumberFormatException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dch
 * JD-Core Version:    0.7.0.1
 */