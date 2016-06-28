import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class dcw
  extends hqj
{
  static final int[] r = { 9, 5, 8 };
  private final jjm<jgw> A = new dcx(this);
  private final jjm<jgw> B = new dcy(this);
  final int s;
  final boolean t;
  private final int u;
  private final Context v;
  private final boolean w;
  private final jiw x;
  private HashMap<String, jgs> y;
  private final HashMap<String, hps> z;
  
  public dcw(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext);
    this.v = paramContext;
    this.u = paramInt1;
    this.s = 5;
    this.t = paramBoolean1;
    this.w = paramBoolean2;
    this.y = new HashMap();
    this.z = new HashMap();
    this.x = ((jiw)mbb.a(paramContext, jiw.class));
  }
  
  static boolean a(int paramInt, String paramString)
  {
    return (paramInt == 9) || (paramInt == 5) || ((paramInt == 8) && (!TextUtils.isEmpty(paramString)));
  }
  
  static boolean a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if ((paramBoolean) && (paramInt1 == 9)) {}
    do
    {
      do
      {
        return false;
        switch (paramInt2)
        {
        default: 
          return true;
        }
      } while ((paramInt1 == 9) || (paramInt1 == 8));
      return true;
    } while ((paramInt1 != 1) && (paramInt1 != 5));
    return true;
  }
  
  private final hqr p()
  {
    hqr localhqr = new hqr(dcz.a);
    Object[] arrayOfObject = new Object[dcz.a.length];
    Arrays.fill(arrayOfObject, null);
    arrayOfObject[1] = Integer.valueOf(2);
    arrayOfObject[3] = this.v.getResources().getString(aau.kX);
    localhqr.a(arrayOfObject);
    Arrays.fill(arrayOfObject, null);
    arrayOfObject[1] = Integer.valueOf(1);
    arrayOfObject[3] = this.v.getResources().getString(aau.kW);
    localhqr.a(arrayOfObject);
    gjb localgjb = ((giz)mbb.a(this.v, giz.class)).a(this.u);
    int i;
    if (localgjb.c("is_child")) {
      i = 5;
    }
    while ((i != 9) || (this.w))
    {
      ArrayList localArrayList = new ArrayList();
      List localList = this.x.a(this.u, this.B);
      int j = localList.size();
      int k = 0;
      for (;;)
      {
        if (k < j)
        {
          jgw localjgw = (jgw)localList.get(k);
          String str1 = localjgw.b();
          String str2 = localjgw.c();
          localArrayList.add(new jgs(str1, localjgw.e(), str2, localjgw.f()));
          k++;
          continue;
          if (localgjb.c("is_default_restricted"))
          {
            i = 8;
            break;
          }
          i = 9;
          break;
        }
      }
      Iterator localIterator1 = localArrayList.iterator();
      while (localIterator1.hasNext())
      {
        jgs localjgs = (jgs)localIterator1.next();
        int m = localjgs.c;
        if (m == i)
        {
          Arrays.fill(arrayOfObject, null);
          try
          {
            gnb localgnb = new gnb(localjgs);
            arrayOfObject[0] = Integer.valueOf(0);
            arrayOfObject[1] = Integer.valueOf(0);
            arrayOfObject[2] = Integer.valueOf(m);
            arrayOfObject[3] = localjgs.b;
            arrayOfObject[4] = gnl.a(localgnb);
            localhqr.a(arrayOfObject);
          }
          catch (IOException localIOException) {}
        }
      }
    }
    Iterator localIterator2 = mbb.c(this.v, gnm.class).iterator();
    while (localIterator2.hasNext())
    {
      gnm localgnm = (gnm)localIterator2.next();
      Arrays.fill(arrayOfObject, null);
      arrayOfObject[0] = Integer.valueOf(0);
      arrayOfObject[1] = Integer.valueOf(localgnm.a());
      arrayOfObject[3] = this.v.getResources().getString(localgnm.b());
      localhqr.a(arrayOfObject);
    }
    return localhqr;
  }
  
  private final void q()
  {
    this.z.clear();
    Cursor localCursor = ((hhh)mbb.a(this.v, hhh.class)).a(this.u);
    if (localCursor != null)
    {
      localCursor.moveToPosition(-1);
      int i = localCursor.getColumnIndexOrThrow("cxn_id");
      int j = localCursor.getColumnIndexOrThrow("cxn_name");
      if (localCursor.moveToNext())
      {
        String str1 = localCursor.getString(i);
        String str2 = localCursor.getString(j);
        if (localCursor.getInt(localCursor.getColumnIndexOrThrow("sharing_target_group_type")) == 2) {}
        for (boolean bool = true;; bool = false)
        {
          hps localhps = new hps(str1, str2, bool);
          this.z.put(str1, localhps);
          break;
        }
      }
    }
  }
  
  /* Error */
  private final Cursor r()
  {
    // Byte code:
    //   0: new 58	java/util/HashMap
    //   3: dup
    //   4: invokespecial 60	java/util/HashMap:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 74	dcw:x	Ljiw;
    //   12: aload_0
    //   13: getfield 50	dcw:u	I
    //   16: aload_0
    //   17: getfield 41	dcw:A	Ljjm;
    //   20: invokeinterface 152 3 0
    //   25: astore_2
    //   26: aload_2
    //   27: invokeinterface 158 1 0
    //   32: istore_3
    //   33: iconst_0
    //   34: istore 4
    //   36: iload 4
    //   38: iload_3
    //   39: if_icmpge +69 -> 108
    //   42: aload_2
    //   43: iload 4
    //   45: invokeinterface 162 2 0
    //   50: checkcast 164	jgw
    //   53: astore 29
    //   55: aload_1
    //   56: aload 29
    //   58: invokeinterface 168 1 0
    //   63: new 172	jgs
    //   66: dup
    //   67: aload 29
    //   69: invokeinterface 168 1 0
    //   74: aload 29
    //   76: invokeinterface 175 1 0
    //   81: aload 29
    //   83: invokeinterface 170 1 0
    //   88: aload 29
    //   90: invokeinterface 178 1 0
    //   95: invokespecial 181	jgs:<init>	(Ljava/lang/String;ILjava/lang/String;I)V
    //   98: invokevirtual 268	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   101: pop
    //   102: iinc 4 1
    //   105: goto -69 -> 36
    //   108: aload_0
    //   109: aload_1
    //   110: putfield 62	dcw:y	Ljava/util/HashMap;
    //   113: aload_0
    //   114: invokespecial 271	dcw:q	()V
    //   117: aload_0
    //   118: getfield 48	dcw:v	Landroid/content/Context;
    //   121: invokevirtual 275	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   124: aload_0
    //   125: getfield 48	dcw:v	Landroid/content/Context;
    //   128: invokestatic 280	com/google/android/apps/plus/content/EsProvider:c	(Landroid/content/Context;)Landroid/net/Uri;
    //   131: aload_0
    //   132: getfield 50	dcw:u	I
    //   135: invokestatic 283	com/google/android/apps/plus/content/EsProvider:a	(Landroid/net/Uri;I)Landroid/net/Uri;
    //   138: iconst_1
    //   139: anewarray 285	java/lang/String
    //   142: dup
    //   143: iconst_0
    //   144: ldc_w 287
    //   147: aastore
    //   148: aconst_null
    //   149: aconst_null
    //   150: aconst_null
    //   151: invokevirtual 293	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   154: astore 5
    //   156: new 88	hqr
    //   159: dup
    //   160: getstatic 296	dda:a	[Ljava/lang/String;
    //   163: invokespecial 96	hqr:<init>	([Ljava/lang/String;)V
    //   166: astore 6
    //   168: aload 5
    //   170: ifnull +425 -> 595
    //   173: aload 5
    //   175: invokeinterface 299 1 0
    //   180: ifeq +415 -> 595
    //   183: aload 5
    //   185: iconst_0
    //   186: invokeinterface 302 2 0
    //   191: ifne +404 -> 595
    //   194: aload 5
    //   196: iconst_0
    //   197: invokeinterface 306 2 0
    //   202: invokestatic 309	gnl:b	([B)Ljava/util/ArrayList;
    //   205: astore 8
    //   207: aload 8
    //   209: invokevirtual 310	java/util/ArrayList:size	()I
    //   212: iconst_5
    //   213: invokestatic 316	java/lang/Math:min	(II)I
    //   216: istore 9
    //   218: iconst_0
    //   219: istore 10
    //   221: iload 10
    //   223: iload 9
    //   225: if_icmpge +370 -> 595
    //   228: aload 8
    //   230: iload 10
    //   232: invokevirtual 317	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   235: checkcast 205	gnb
    //   238: astore 11
    //   240: aload 11
    //   242: getfield 320	gnb:c	[Ljgs;
    //   245: astore 12
    //   247: aload 11
    //   249: getfield 323	gnb:e	[Lhps;
    //   252: astore 13
    //   254: new 148	java/util/ArrayList
    //   257: dup
    //   258: invokespecial 149	java/util/ArrayList:<init>	()V
    //   261: astore 14
    //   263: new 148	java/util/ArrayList
    //   266: dup
    //   267: invokespecial 149	java/util/ArrayList:<init>	()V
    //   270: astore 15
    //   272: iconst_0
    //   273: istore 16
    //   275: aload 12
    //   277: arraylength
    //   278: ifle +9 -> 287
    //   281: aload 13
    //   283: arraylength
    //   284: ifgt +305 -> 589
    //   287: aload 12
    //   289: arraylength
    //   290: istore 17
    //   292: iconst_0
    //   293: istore 18
    //   295: iload 18
    //   297: iload 17
    //   299: if_icmpge +121 -> 420
    //   302: aload 12
    //   304: iload 18
    //   306: aaload
    //   307: getfield 325	jgs:a	Ljava/lang/String;
    //   310: astore 19
    //   312: aload_0
    //   313: getfield 62	dcw:y	Ljava/util/HashMap;
    //   316: aload 19
    //   318: invokevirtual 328	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   321: ifeq +311 -> 632
    //   324: aload_0
    //   325: getfield 62	dcw:y	Ljava/util/HashMap;
    //   328: aload 19
    //   330: invokevirtual 331	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   333: checkcast 172	jgs
    //   336: getfield 203	jgs:c	I
    //   339: aload_0
    //   340: getfield 54	dcw:t	Z
    //   343: aload_0
    //   344: getfield 52	dcw:s	I
    //   347: invokestatic 333	dcw:a	(IZI)Z
    //   350: ifeq +282 -> 632
    //   353: aload_0
    //   354: getfield 62	dcw:y	Ljava/util/HashMap;
    //   357: aload 19
    //   359: invokevirtual 331	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   362: checkcast 172	jgs
    //   365: getfield 203	jgs:c	I
    //   368: aload_0
    //   369: getfield 62	dcw:y	Ljava/util/HashMap;
    //   372: aload 19
    //   374: invokevirtual 331	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   377: checkcast 172	jgs
    //   380: getfield 211	jgs:b	Ljava/lang/String;
    //   383: invokestatic 335	dcw:a	(ILjava/lang/String;)Z
    //   386: ifne +246 -> 632
    //   389: iconst_1
    //   390: istore 16
    //   392: iload 16
    //   394: ifeq +26 -> 420
    //   397: aload 14
    //   399: aload_0
    //   400: getfield 62	dcw:y	Ljava/util/HashMap;
    //   403: aload 19
    //   405: invokevirtual 331	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   408: invokeinterface 336 2 0
    //   413: pop
    //   414: iinc 18 1
    //   417: goto -122 -> 295
    //   420: aload 13
    //   422: arraylength
    //   423: istore 21
    //   425: iload 16
    //   427: istore 22
    //   429: iconst_0
    //   430: istore 23
    //   432: iload 23
    //   434: iload 21
    //   436: if_icmpge +84 -> 520
    //   439: aload 13
    //   441: iload 23
    //   443: aaload
    //   444: getfield 337	hps:a	Ljava/lang/String;
    //   447: astore 24
    //   449: aload_0
    //   450: getfield 64	dcw:z	Ljava/util/HashMap;
    //   453: aload 24
    //   455: invokevirtual 328	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   458: ifeq +56 -> 514
    //   461: aload_0
    //   462: getfield 64	dcw:z	Ljava/util/HashMap;
    //   465: aload 24
    //   467: invokevirtual 331	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   470: checkcast 261	hps
    //   473: getfield 339	hps:c	Z
    //   476: aload_0
    //   477: getfield 54	dcw:t	Z
    //   480: if_icmpne +34 -> 514
    //   483: iconst_1
    //   484: istore 22
    //   486: iload 22
    //   488: ifeq +32 -> 520
    //   491: aload 15
    //   493: aload_0
    //   494: getfield 64	dcw:z	Ljava/util/HashMap;
    //   497: aload 24
    //   499: invokevirtual 331	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   502: invokeinterface 336 2 0
    //   507: pop
    //   508: iinc 23 1
    //   511: goto -79 -> 432
    //   514: iconst_0
    //   515: istore 22
    //   517: goto -31 -> 486
    //   520: iload 22
    //   522: ifeq +67 -> 589
    //   525: new 205	gnb
    //   528: dup
    //   529: aload 11
    //   531: getfield 342	gnb:b	[Ljjd;
    //   534: invokestatic 346	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   537: aload 14
    //   539: aload 11
    //   541: getfield 350	gnb:d	[Llhp;
    //   544: invokestatic 346	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   547: aload 15
    //   549: aload 11
    //   551: getfield 352	gnb:a	I
    //   554: invokespecial 355	gnb:<init>	(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V
    //   557: astore 26
    //   559: iconst_2
    //   560: anewarray 98	java/lang/Object
    //   563: astore 28
    //   565: aload 28
    //   567: iconst_0
    //   568: iconst_1
    //   569: invokestatic 110	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   572: aastore
    //   573: aload 28
    //   575: iconst_1
    //   576: aload 26
    //   578: invokestatic 216	gnl:a	(Lgnb;)[B
    //   581: aastore
    //   582: aload 6
    //   584: aload 28
    //   586: invokevirtual 130	hqr:a	([Ljava/lang/Object;)V
    //   589: iinc 10 1
    //   592: goto -371 -> 221
    //   595: aload 5
    //   597: ifnull +10 -> 607
    //   600: aload 5
    //   602: invokeinterface 358 1 0
    //   607: aload 6
    //   609: areturn
    //   610: astore 7
    //   612: aload 5
    //   614: ifnull +10 -> 624
    //   617: aload 5
    //   619: invokeinterface 358 1 0
    //   624: aload 7
    //   626: athrow
    //   627: astore 27
    //   629: goto -40 -> 589
    //   632: iconst_0
    //   633: istore 16
    //   635: goto -243 -> 392
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	638	0	this	dcw
    //   7	103	1	localHashMap	HashMap
    //   25	18	2	localList	List
    //   32	8	3	i	int
    //   34	69	4	j	int
    //   154	464	5	localCursor	Cursor
    //   166	442	6	localhqr	hqr
    //   610	15	7	localObject	Object
    //   205	24	8	localArrayList1	ArrayList
    //   216	10	9	k	int
    //   219	371	10	m	int
    //   238	312	11	localgnb1	gnb
    //   245	58	12	arrayOfjgs	jgs[]
    //   252	188	13	arrayOfhps	hps[]
    //   261	277	14	localArrayList2	ArrayList
    //   270	278	15	localArrayList3	ArrayList
    //   273	361	16	n	int
    //   290	10	17	i1	int
    //   293	122	18	i2	int
    //   310	94	19	str1	String
    //   423	14	21	i3	int
    //   427	94	22	i4	int
    //   430	79	23	i5	int
    //   447	51	24	str2	String
    //   557	20	26	localgnb2	gnb
    //   627	1	27	localIOException	IOException
    //   563	22	28	arrayOfObject	Object[]
    //   53	36	29	localjgw	jgw
    // Exception table:
    //   from	to	target	type
    //   156	168	610	finally
    //   173	218	610	finally
    //   228	272	610	finally
    //   275	287	610	finally
    //   287	292	610	finally
    //   302	389	610	finally
    //   397	414	610	finally
    //   420	425	610	finally
    //   439	483	610	finally
    //   491	508	610	finally
    //   525	589	610	finally
    //   525	589	627	java/io/IOException
  }
  
  public final Cursor o()
  {
    Cursor[] arrayOfCursor = new Cursor[2];
    arrayOfCursor[0] = p();
    arrayOfCursor[1] = r();
    return new MergeCursor(arrayOfCursor);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcw
 * JD-Core Version:    0.7.0.1
 */