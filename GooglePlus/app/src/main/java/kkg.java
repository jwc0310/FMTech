import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

final class kkg
  implements iyq
{
  final Context a;
  final int b;
  final koj c;
  int d;
  int e;
  int f;
  long g;
  final kkk h = new kkk();
  private final giz i;
  private int j;
  private final kkj k;
  private final List<String> l = new ArrayList();
  private final List<String> m = new ArrayList();
  private final String n;
  private final String o;
  
  public kkg(Context paramContext, int paramInt, koj paramkoj)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramkoj;
    this.i = ((giz)mbb.a(paramContext, giz.class));
    this.k = new kkj(this);
    this.n = paramContext.getCacheDir().getPath();
    File localFile = efj.u(paramContext);
    if (localFile != null)
    {
      this.o = localFile.getPath();
      return;
    }
    this.o = null;
  }
  
  public kkg(Context paramContext, int paramInt, myt parammyt, Date paramDate, String paramString, List<ipf> paramList)
  {
    this(paramContext, paramInt, a(parammyt, paramDate, paramString, paramList));
  }
  
  private static koj a(myt parammyt, Date paramDate, String paramString, List<ipf> paramList)
  {
    koj localkoj = new koj();
    localkoj.a = parammyt;
    localkoj.b = Long.valueOf(paramDate.getTime());
    localkoj.c = paramString;
    int i1;
    ArrayList localArrayList;
    int i2;
    label59:
    ipf localipf;
    if (paramList != null)
    {
      i1 = paramList.size();
      localArrayList = new ArrayList(i1);
      i2 = 0;
      if (i2 >= i1) {
        break label169;
      }
      localipf = (ipf)paramList.get(i2);
      if (!localipf.a()) {
        if (localipf.d == null) {
          break label163;
        }
      }
    }
    label163:
    for (int i3 = 1;; i3 = 0)
    {
      if (i3 != 0)
      {
        kok localkok = new kok();
        localkok.a = Integer.valueOf(localipf.e.e);
        localkok.b = localipf.d.toString();
        localArrayList.add(localkok);
      }
      i2++;
      break label59;
      i1 = 0;
      break;
    }
    label169:
    localkoj.e = ((kok[])localArrayList.toArray(new kok[localArrayList.size()]));
    return localkoj;
  }
  
  /* Error */
  private final void f()
  {
    // Byte code:
    //   0: new 183	kkr
    //   3: dup
    //   4: aload_0
    //   5: getfield 50	kkg:a	Landroid/content/Context;
    //   8: aload_0
    //   9: getfield 52	kkg:b	I
    //   12: aload_0
    //   13: getfield 54	kkg:c	Lkoj;
    //   16: getfield 104	koj:a	Lmyt;
    //   19: aconst_null
    //   20: invokespecial 186	kkr:<init>	(Landroid/content/Context;ILmyt;Lkbo;)V
    //   23: astore_1
    //   24: aload_1
    //   25: invokevirtual 188	kkr:i	()V
    //   28: aload_1
    //   29: ldc 190
    //   31: invokevirtual 193	kkr:d	(Ljava/lang/String;)V
    //   34: aload_1
    //   35: getfield 199	kct:x	Z
    //   38: ifeq +157 -> 195
    //   41: aload_1
    //   42: getfield 203	kct:w	Lqat;
    //   45: astore_3
    //   46: aload_3
    //   47: checkcast 205	myu
    //   50: getfield 208	myu:a	Lolr;
    //   53: astore 4
    //   55: aload 4
    //   57: getfield 213	olr:a	Lope;
    //   60: getfield 218	ope:a	[Lopo;
    //   63: astore 5
    //   65: aload_0
    //   66: getfield 43	kkg:m	Ljava/util/List;
    //   69: invokeinterface 127 1 0
    //   74: ifle +180 -> 254
    //   77: iconst_0
    //   78: istore 11
    //   80: iload 11
    //   82: aload 5
    //   84: arraylength
    //   85: if_icmpge +169 -> 254
    //   88: aload 5
    //   90: iload 11
    //   92: aaload
    //   93: astore 12
    //   95: ldc 220
    //   97: astore 13
    //   99: aload_0
    //   100: getfield 54	kkg:c	Lkoj;
    //   103: getfield 222	koj:d	Ljava/lang/String;
    //   106: ifnull +10 -> 116
    //   109: aload 12
    //   111: getfield 227	opo:p	Ljava/lang/String;
    //   114: astore 13
    //   116: aload 13
    //   118: ifnull +11 -> 129
    //   121: aload 13
    //   123: invokevirtual 232	java/lang/String:isEmpty	()Z
    //   126: ifeq +74 -> 200
    //   129: ldc 190
    //   131: ldc 234
    //   133: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   136: pop
    //   137: aload_0
    //   138: aload_0
    //   139: getfield 43	kkg:m	Ljava/util/List;
    //   142: invokeinterface 127 1 0
    //   147: putfield 241	kkg:d	I
    //   150: aload_0
    //   151: getfield 43	kkg:m	Ljava/util/List;
    //   154: invokeinterface 244 1 0
    //   159: iinc 11 1
    //   162: goto -82 -> 80
    //   165: astore 20
    //   167: aload 20
    //   169: astore_2
    //   170: aconst_null
    //   171: astore_1
    //   172: aload_2
    //   173: invokevirtual 248	java/io/IOException:getCause	()Ljava/lang/Throwable;
    //   176: instanceof 250
    //   179: ifeq +14 -> 193
    //   182: aload_2
    //   183: ldc 252
    //   185: invokestatic 255	kdd:a	(Ljava/lang/Exception;Ljava/lang/String;)Z
    //   188: ifne -154 -> 34
    //   191: aload_2
    //   192: athrow
    //   193: aload_2
    //   194: athrow
    //   195: aconst_null
    //   196: astore_3
    //   197: goto -151 -> 46
    //   200: aload_0
    //   201: getfield 70	kkg:k	Lkkj;
    //   204: astore 15
    //   206: aload_0
    //   207: getfield 52	kkg:b	I
    //   210: istore 16
    //   212: aload_0
    //   213: getfield 43	kkg:m	Ljava/util/List;
    //   216: astore 17
    //   218: aload 15
    //   220: getfield 258	kkj:a	Lgwa;
    //   223: iload 16
    //   225: aload 13
    //   227: aload 17
    //   229: aconst_null
    //   230: invokeinterface 263 5 0
    //   235: pop2
    //   236: aload 15
    //   238: getfield 266	kkj:b	Lkkg;
    //   241: aload 17
    //   243: invokeinterface 127 1 0
    //   248: putfield 241	kkg:d	I
    //   251: goto -114 -> 137
    //   254: aload_0
    //   255: getfield 50	kkg:a	Landroid/content/Context;
    //   258: aload_0
    //   259: getfield 52	kkg:b	I
    //   262: invokestatic 270	efj:z	(Landroid/content/Context;I)Z
    //   265: ifeq +100 -> 365
    //   268: new 272	kiy
    //   271: dup
    //   272: aload_0
    //   273: getfield 50	kkg:a	Landroid/content/Context;
    //   276: new 274	kcg
    //   279: dup
    //   280: aload_0
    //   281: getfield 50	kkg:a	Landroid/content/Context;
    //   284: aload_0
    //   285: getfield 52	kkg:b	I
    //   288: invokespecial 277	kcg:<init>	(Landroid/content/Context;I)V
    //   291: invokespecial 280	kiy:<init>	(Landroid/content/Context;Lkcg;)V
    //   294: astore 6
    //   296: aload 6
    //   298: invokevirtual 282	kiy:a	()V
    //   301: aload 6
    //   303: getfield 285	kiy:a	Lkcx;
    //   306: invokevirtual 289	kcx:n	()Z
    //   309: ifne +24 -> 333
    //   312: aload_0
    //   313: getfield 50	kkg:a	Landroid/content/Context;
    //   316: aload_0
    //   317: getfield 52	kkg:b	I
    //   320: aload 6
    //   322: invokevirtual 292	kiy:b	()Lqwq;
    //   325: getfield 297	qwq:b	[Lqwr;
    //   328: invokestatic 300	efj:b	(Landroid/content/Context;I[Lqwr;)Z
    //   331: pop
    //   332: return
    //   333: aload 6
    //   335: getfield 285	kiy:a	Lkcx;
    //   338: getfield 306	kbw:q	Ljava/lang/Exception;
    //   341: astore 7
    //   343: ldc 190
    //   345: bipush 6
    //   347: invokestatic 310	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   350: ifeq -18 -> 332
    //   353: ldc 190
    //   355: ldc_w 312
    //   358: aload 7
    //   360: invokestatic 315	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   363: pop
    //   364: return
    //   365: aload_0
    //   366: getfield 50	kkg:a	Landroid/content/Context;
    //   369: ldc_w 317
    //   372: invokestatic 61	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   375: checkcast 317	kmf
    //   378: astore 10
    //   380: aload 4
    //   382: getfield 320	olr:b	Loow;
    //   385: ifnull -53 -> 332
    //   388: aload 10
    //   390: aload_0
    //   391: getfield 52	kkg:b	I
    //   394: aload 4
    //   396: getfield 320	olr:b	Loow;
    //   399: getfield 325	oow:a	Lome;
    //   402: invokevirtual 328	kmf:a	(ILome;)V
    //   405: return
    //   406: astore_2
    //   407: goto -235 -> 172
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	410	0	this	kkg
    //   23	149	1	localkkr	kkr
    //   169	25	2	localIOException1	IOException
    //   406	1	2	localIOException2	IOException
    //   45	152	3	localqat	qat
    //   53	342	4	localolr	olr
    //   63	26	5	arrayOfopo	opo[]
    //   294	40	6	localkiy	kiy
    //   341	18	7	localException	java.lang.Exception
    //   378	11	10	localkmf	kmf
    //   78	82	11	i1	int
    //   93	17	12	localopo	opo
    //   97	129	13	str	String
    //   204	33	15	localkkj	kkj
    //   210	14	16	i2	int
    //   216	26	17	localList	List
    //   165	3	20	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   0	24	165	java/io/IOException
    //   24	34	406	java/io/IOException
  }
  
  public final int a(iys paramiys, iyr paramiyr)
  {
    int i1 = 1;
    Object localObject = null;
    boolean bool = false;
    int i2 = 1;
    while (i1 != 0) {
      switch (this.h.a)
      {
      case 1: 
      default: 
        Log.e("NetworkQueueRequest", "Unknown state");
        i2 = 5;
        i1 = 0;
      }
    }
    for (;;)
    {
      int i5;
      for (;;)
      {
        try
        {
          int i3 = this.c.e.length;
          if (i3 > 0)
          {
            ArrayList localArrayList = new ArrayList();
            i4 = 0;
            if (i4 < i3)
            {
              String str1 = this.c.e[i4].b;
              localArrayList.add(hco.a(this.a).a(str1, false));
              if (ipm.a(this.c.e[i4].a.intValue()) == ipm.b)
              {
                this.e = (1 + this.e);
                continue;
              }
              this.j = (1 + this.j);
              continue;
            }
            str2 = this.i.a(this.b).b("gaia_id");
            localjrv = new jrv(this.a, this.b, str2, localArrayList);
            localjrv.i();
            i5 = 0;
            if (i5 < i3) {
              str3 = (String)localArrayList.get(i5);
            }
          }
        }
        catch (IOException localIOException2)
        {
          int i4;
          String str2;
          jrv localjrv;
          String str3;
          long l2;
          oof localoof;
          ooe localooe;
          kok localkok;
          String str4;
          kki localkki;
          ntf localntf;
          kkj localkkj;
          int i6;
          String str5;
          List localList;
          bool = true;
          i2 = 4;
          i1 = 0;
        }
        try
        {
          l2 = localjrv.b(str3);
          l1 = l2;
        }
        catch (NullPointerException localNullPointerException)
        {
          l1 = 0L;
          continue;
          localqat = null;
          continue;
        }
        if (l1 != 0L)
        {
          localoof = new oof();
          localoof.a = str2;
          localoof.b = Long.toString(l1);
          localooe = this.c.a.a.g.b[i5];
          localooe.a = localoof;
          localooe.c = null;
          localooe.d = 0;
          break label766;
        }
        localkok = this.c.e[i5];
        str4 = this.c.e[i5].b;
        if (ipm.a(localkok.a.intValue()) == ipm.b)
        {
          this.l.add(str4);
          break label766;
        }
        this.m.add(str4);
        break label766;
        if (!this.l.isEmpty())
        {
          if (TextUtils.isEmpty(this.c.d))
          {
            localkki = new kki(this.a, this.b);
            localkki.i();
            localkki.d("NetworkQueueRequest");
            if (!localkki.x) {
              break label780;
            }
            localqat = localkki.w;
            localntf = ((mqq)localqat).a;
            this.c.d = localntf.a.c;
          }
          localkkj = this.k;
          i6 = this.b;
          str5 = this.c.d;
          localList = this.l;
          localkkj.b.h.a = 1;
          localkkj.a.a(i6, str5, localList, localkkj);
          localkkj.b.f = localList.size();
          this.l.clear();
          i2 = 3;
          i1 = 0;
          break;
        }
        this.h.a = 4;
        i1 = 1;
        break;
        this.h.a = 4;
        i1 = 1;
        break;
        i2 = 5;
        i1 = 0;
        break;
        try
        {
          f();
          i2 = 1;
          i1 = 0;
        }
        catch (IOException localIOException1)
        {
          if ((localIOException1.getCause() instanceof kdd))
          {
            localObject = localIOException1;
            i2 = 5;
            i1 = 0;
            break;
          }
          localObject = localIOException1;
          bool = true;
          i2 = 4;
          i1 = 0;
        }
      }
      break;
      paramiys.c = this.j;
      paramiys.d = this.d;
      paramiys.a = this.e;
      paramiys.b = this.f;
      paramiyr.a = localObject;
      paramiyr.b = bool;
      return i2;
      i4++;
      continue;
      break;
      label766:
      i5++;
    }
  }
  
  public final String a()
  {
    return "network_post_request_handle";
  }
  
  final void a(String paramString)
  {
    if ((paramString.contains(this.n)) || ((!TextUtils.isEmpty(this.o)) && (paramString.contains(this.o)))) {
      efj.l(paramString);
    }
  }
  
  public final String b()
  {
    Resources localResources = this.a.getResources();
    int i1 = efj.UU;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(1);
    return localResources.getQuantityString(i1, 1, arrayOfObject);
  }
  
  public final String c()
  {
    return this.c.c;
  }
  
  public final void d()
  {
    int i1 = 0;
    int i2 = this.c.e.length;
    while (i1 < i2)
    {
      a(this.c.e[i1].b);
      i1++;
    }
    kkj localkkj = this.k;
    if (localkkj.b.c.d != null)
    {
      gvq localgvq = gvq.a(localkkj.b.b, localkkj.b.c.d);
      if (localkkj.a.b(localgvq).b == gvy.b) {
        localkkj.a.a(localgvq);
      }
    }
  }
  
  public final boolean e()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkg
 * JD-Core Version:    0.7.0.1
 */