import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class gzp
{
  final List<gzq> a = new LinkedList();
  private final int b;
  private final File c;
  private int d;
  private int e;
  
  public gzp(Context paramContext, String paramString)
  {
    this.b = (31 * (31 + Build.VERSION.RELEASE.hashCode()) + a(paramContext));
    String str = String.valueOf(paramContext.getDir(null, 0).getAbsolutePath());
    this.c = new File(1 + String.valueOf(str).length() + String.valueOf(paramString).length() + str + "/" + paramString);
    d();
    a();
  }
  
  private static int a(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("BackgroundTask", "Failed to get application version", localNameNotFoundException);
    }
    return 0;
  }
  
  static int a(hae paramhae)
  {
    paramhae.b();
    byte[] arrayOfByte = paramhae.g;
    if (arrayOfByte != null) {}
    for (int i = arrayOfByte.length;; i = 0) {
      return i + 200;
    }
  }
  
  private final void a(Iterator<gzq> paramIterator, gzq paramgzq)
  {
    paramIterator.remove();
    this.e -= a(paramgzq.c);
  }
  
  /* Error */
  private final void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 78	gzp:c	Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: invokestatic 145	android/os/StrictMode:allowThreadDiskWrites	()Landroid/os/StrictMode$ThreadPolicy;
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 78	gzp:c	Ljava/io/File;
    //   15: invokevirtual 149	java/io/File:exists	()Z
    //   18: istore 12
    //   20: iload 12
    //   22: ifne +33 -> 55
    //   25: aload_0
    //   26: getfield 78	gzp:c	Ljava/io/File;
    //   29: invokevirtual 149	java/io/File:exists	()Z
    //   32: ifeq +11 -> 43
    //   35: aload_0
    //   36: getfield 78	gzp:c	Ljava/io/File;
    //   39: invokevirtual 152	java/io/File:delete	()Z
    //   42: pop
    //   43: aload_0
    //   44: iconst_0
    //   45: putfield 154	gzp:d	I
    //   48: aload_3
    //   49: invokestatic 158	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   52: aload_1
    //   53: monitorexit
    //   54: return
    //   55: new 160	java/io/DataInputStream
    //   58: dup
    //   59: new 162	java/io/BufferedInputStream
    //   62: dup
    //   63: new 164	java/io/FileInputStream
    //   66: dup
    //   67: aload_0
    //   68: getfield 78	gzp:c	Ljava/io/File;
    //   71: invokespecial 167	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   74: invokespecial 170	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   77: invokespecial 171	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   80: astore 5
    //   82: aload 5
    //   84: invokevirtual 174	java/io/DataInputStream:readInt	()I
    //   87: istore 13
    //   89: aload_0
    //   90: getfield 40	gzp:b	I
    //   93: istore 14
    //   95: iload 13
    //   97: iload 14
    //   99: if_icmpeq +43 -> 142
    //   102: aload 5
    //   104: invokevirtual 177	java/io/DataInputStream:close	()V
    //   107: aload_0
    //   108: getfield 78	gzp:c	Ljava/io/File;
    //   111: invokevirtual 149	java/io/File:exists	()Z
    //   114: ifeq +11 -> 125
    //   117: aload_0
    //   118: getfield 78	gzp:c	Ljava/io/File;
    //   121: invokevirtual 152	java/io/File:delete	()Z
    //   124: pop
    //   125: aload_0
    //   126: iconst_0
    //   127: putfield 154	gzp:d	I
    //   130: aload_3
    //   131: invokestatic 158	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   134: aload_1
    //   135: monitorexit
    //   136: return
    //   137: astore_2
    //   138: aload_1
    //   139: monitorexit
    //   140: aload_2
    //   141: athrow
    //   142: aload 5
    //   144: invokevirtual 174	java/io/DataInputStream:readInt	()I
    //   147: istore 15
    //   149: iconst_0
    //   150: istore 16
    //   152: iload 16
    //   154: iload 15
    //   156: if_icmpge +42 -> 198
    //   159: aload 5
    //   161: invokevirtual 174	java/io/DataInputStream:readInt	()I
    //   164: newarray byte
    //   166: astore 17
    //   168: aload 5
    //   170: aload 17
    //   172: invokevirtual 181	java/io/DataInputStream:readFully	([B)V
    //   175: aload_0
    //   176: aload 17
    //   178: ldc 130
    //   180: invokevirtual 187	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   183: invokestatic 192	efj:a	([BLjava/lang/ClassLoader;)Landroid/os/Parcelable;
    //   186: checkcast 130	gzq
    //   189: invokevirtual 195	gzp:a	(Lgzq;)V
    //   192: iinc 16 1
    //   195: goto -43 -> 152
    //   198: ldc 104
    //   200: iconst_4
    //   201: invokestatic 199	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   204: ifeq +34 -> 238
    //   207: aload_0
    //   208: getfield 23	gzp:a	Ljava/util/List;
    //   211: invokeinterface 204 1 0
    //   216: istore 20
    //   218: new 58	java/lang/StringBuilder
    //   221: dup
    //   222: bipush 34
    //   224: invokespecial 64	java/lang/StringBuilder:<init>	(I)V
    //   227: ldc 206
    //   229: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: iload 20
    //   234: invokevirtual 209	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload 5
    //   240: invokevirtual 177	java/io/DataInputStream:close	()V
    //   243: aload_0
    //   244: getfield 78	gzp:c	Ljava/io/File;
    //   247: invokevirtual 149	java/io/File:exists	()Z
    //   250: ifeq +11 -> 261
    //   253: aload_0
    //   254: getfield 78	gzp:c	Ljava/io/File;
    //   257: invokevirtual 152	java/io/File:delete	()Z
    //   260: pop
    //   261: aload_0
    //   262: iconst_0
    //   263: putfield 154	gzp:d	I
    //   266: aload_3
    //   267: invokestatic 158	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   270: aload_1
    //   271: monitorexit
    //   272: return
    //   273: astore 8
    //   275: aconst_null
    //   276: astore 5
    //   278: ldc 104
    //   280: ldc 211
    //   282: aload 8
    //   284: invokestatic 111	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   287: pop
    //   288: aload 5
    //   290: ifnull +8 -> 298
    //   293: aload 5
    //   295: invokevirtual 177	java/io/DataInputStream:close	()V
    //   298: aload_0
    //   299: getfield 78	gzp:c	Ljava/io/File;
    //   302: invokevirtual 149	java/io/File:exists	()Z
    //   305: ifeq +11 -> 316
    //   308: aload_0
    //   309: getfield 78	gzp:c	Ljava/io/File;
    //   312: invokevirtual 152	java/io/File:delete	()Z
    //   315: pop
    //   316: aload_0
    //   317: iconst_0
    //   318: putfield 154	gzp:d	I
    //   321: aload_3
    //   322: invokestatic 158	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   325: goto -55 -> 270
    //   328: astore 4
    //   330: aconst_null
    //   331: astore 5
    //   333: aload 5
    //   335: ifnull +8 -> 343
    //   338: aload 5
    //   340: invokevirtual 177	java/io/DataInputStream:close	()V
    //   343: aload_0
    //   344: getfield 78	gzp:c	Ljava/io/File;
    //   347: invokevirtual 149	java/io/File:exists	()Z
    //   350: ifeq +11 -> 361
    //   353: aload_0
    //   354: getfield 78	gzp:c	Ljava/io/File;
    //   357: invokevirtual 152	java/io/File:delete	()Z
    //   360: pop
    //   361: aload_0
    //   362: iconst_0
    //   363: putfield 154	gzp:d	I
    //   366: aload_3
    //   367: invokestatic 158	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   370: aload 4
    //   372: athrow
    //   373: astore 22
    //   375: goto -268 -> 107
    //   378: astore 18
    //   380: goto -137 -> 243
    //   383: astore 11
    //   385: goto -87 -> 298
    //   388: astore 7
    //   390: goto -47 -> 343
    //   393: astore 4
    //   395: goto -62 -> 333
    //   398: astore 8
    //   400: goto -122 -> 278
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	403	0	this	gzp
    //   4	267	1	localFile	File
    //   137	4	2	localObject1	Object
    //   10	357	3	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   328	43	4	localObject2	Object
    //   393	1	4	localObject3	Object
    //   80	259	5	localDataInputStream	java.io.DataInputStream
    //   388	1	7	localIOException1	java.io.IOException
    //   273	10	8	localException1	java.lang.Exception
    //   398	1	8	localException2	java.lang.Exception
    //   383	1	11	localIOException2	java.io.IOException
    //   18	3	12	bool	boolean
    //   87	13	13	i	int
    //   93	7	14	j	int
    //   147	10	15	k	int
    //   150	43	16	m	int
    //   166	11	17	arrayOfByte	byte[]
    //   378	1	18	localIOException3	java.io.IOException
    //   216	17	20	n	int
    //   373	1	22	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   7	11	137	finally
    //   25	43	137	finally
    //   43	54	137	finally
    //   102	107	137	finally
    //   107	125	137	finally
    //   125	136	137	finally
    //   138	140	137	finally
    //   238	243	137	finally
    //   243	261	137	finally
    //   261	270	137	finally
    //   270	272	137	finally
    //   293	298	137	finally
    //   298	316	137	finally
    //   316	325	137	finally
    //   338	343	137	finally
    //   343	361	137	finally
    //   361	373	137	finally
    //   11	20	273	java/lang/Exception
    //   55	82	273	java/lang/Exception
    //   11	20	328	finally
    //   55	82	328	finally
    //   102	107	373	java/io/IOException
    //   238	243	378	java/io/IOException
    //   293	298	383	java/io/IOException
    //   338	343	388	java/io/IOException
    //   82	95	393	finally
    //   142	149	393	finally
    //   159	192	393	finally
    //   198	238	393	finally
    //   278	288	393	finally
    //   82	95	398	java/lang/Exception
    //   142	149	398	java/lang/Exception
    //   159	192	398	java/lang/Exception
    //   198	238	398	java/lang/Exception
  }
  
  public final int a(int paramInt)
  {
    List localList = this.a;
    int j;
    for (int i = 0;; i = j)
    {
      try
      {
        Iterator localIterator = this.a.iterator();
        if (localIterator.hasNext())
        {
          gzq localgzq = (gzq)localIterator.next();
          if (localgzq.a == paramInt)
          {
            a(localIterator, localgzq);
            j = i + 1;
            continue;
          }
        }
        else
        {
          return i;
        }
      }
      finally {}
      j = i;
    }
  }
  
  public final hae a(int paramInt, String paramString)
  {
    synchronized (this.a)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        gzq localgzq = (gzq)localIterator.next();
        if ((localgzq.a == paramInt) && (TextUtils.equals(localgzq.b, paramString)))
        {
          a(localIterator, localgzq);
          hae localhae = localgzq.c;
          return localhae;
        }
      }
      return null;
    }
  }
  
  final void a()
  {
    Iterator localIterator = this.a.iterator();
    label142:
    while (localIterator.hasNext())
    {
      gzq localgzq = (gzq)localIterator.next();
      hae localhae = localgzq.c;
      if (System.currentTimeMillis() - localhae.e > hae.a) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label142;
        }
        if (Log.isLoggable("BackgroundTask", 4))
        {
          String str1 = String.valueOf(localgzq.c);
          String str2 = localgzq.b;
          new StringBuilder(32 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Dropping expired result: ").append(str1).append(", tag: ").append(str2);
        }
        a(localIterator, localgzq);
        break;
      }
    }
  }
  
  final void a(gzq paramgzq)
  {
    this.a.add(paramgzq);
    this.e += a(paramgzq.c);
  }
  
  final void b()
  {
    Iterator localIterator = this.a.iterator();
    while ((this.e > 512000) && (localIterator.hasNext()))
    {
      gzq localgzq = (gzq)localIterator.next();
      if (Log.isLoggable("BackgroundTask", 4))
      {
        String str1 = String.valueOf(localgzq.c);
        String str2 = localgzq.b;
        new StringBuilder(37 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Dropping result to make room: ").append(str1).append(", tag: ").append(str2);
      }
      a(localIterator, localgzq);
    }
  }
  
  /* Error */
  public final int c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	gzp:a	Ljava/util/List;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: new 260	java/util/ArrayList
    //   10: dup
    //   11: aload_0
    //   12: getfield 23	gzp:a	Ljava/util/List;
    //   15: invokeinterface 204 1 0
    //   20: invokespecial 261	java/util/ArrayList:<init>	(I)V
    //   23: astore_2
    //   24: aload_0
    //   25: getfield 23	gzp:a	Ljava/util/List;
    //   28: invokeinterface 216 1 0
    //   33: astore 4
    //   35: aload 4
    //   37: invokeinterface 219 1 0
    //   42: ifeq +46 -> 88
    //   45: aload 4
    //   47: invokeinterface 223 1 0
    //   52: checkcast 130	gzq
    //   55: astore 20
    //   57: aload 20
    //   59: getfield 133	gzq:c	Lhae;
    //   62: getfield 264	hae:f	I
    //   65: getstatic 267	haf:b	I
    //   68: if_icmpne -33 -> 35
    //   71: aload_2
    //   72: aload 20
    //   74: invokeinterface 255 2 0
    //   79: pop
    //   80: goto -45 -> 35
    //   83: astore_3
    //   84: aload_1
    //   85: monitorexit
    //   86: aload_3
    //   87: athrow
    //   88: aload_1
    //   89: monitorexit
    //   90: aload_0
    //   91: getfield 78	gzp:c	Ljava/io/File;
    //   94: astore 5
    //   96: aload 5
    //   98: monitorenter
    //   99: aload_2
    //   100: invokeinterface 268 1 0
    //   105: istore 7
    //   107: iload 7
    //   109: aload_0
    //   110: getfield 154	gzp:d	I
    //   113: if_icmpne +8 -> 121
    //   116: aload 5
    //   118: monitorexit
    //   119: iconst_0
    //   120: ireturn
    //   121: new 270	java/io/DataOutputStream
    //   124: dup
    //   125: new 272	java/io/BufferedOutputStream
    //   128: dup
    //   129: new 274	java/io/FileOutputStream
    //   132: dup
    //   133: aload_0
    //   134: getfield 78	gzp:c	Ljava/io/File;
    //   137: invokespecial 275	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   140: invokespecial 278	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   143: invokespecial 279	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   146: astore 8
    //   148: aload 8
    //   150: aload_0
    //   151: getfield 40	gzp:b	I
    //   154: invokevirtual 282	java/io/DataOutputStream:writeInt	(I)V
    //   157: aload 8
    //   159: aload_2
    //   160: invokeinterface 204 1 0
    //   165: invokevirtual 282	java/io/DataOutputStream:writeInt	(I)V
    //   168: aload_2
    //   169: invokeinterface 216 1 0
    //   174: astore 14
    //   176: aload 14
    //   178: invokeinterface 219 1 0
    //   183: ifeq +64 -> 247
    //   186: aload 14
    //   188: invokeinterface 223 1 0
    //   193: checkcast 130	gzq
    //   196: invokestatic 285	efj:a	(Landroid/os/Parcelable;)[B
    //   199: astore 19
    //   201: aload 8
    //   203: aload 19
    //   205: arraylength
    //   206: invokevirtual 282	java/io/DataOutputStream:writeInt	(I)V
    //   209: aload 8
    //   211: aload 19
    //   213: invokevirtual 288	java/io/DataOutputStream:write	([B)V
    //   216: goto -40 -> 176
    //   219: astore 11
    //   221: ldc 104
    //   223: ldc_w 290
    //   226: aload 11
    //   228: invokestatic 111	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   231: pop
    //   232: aload 8
    //   234: ifnull +8 -> 242
    //   237: aload 8
    //   239: invokevirtual 291	java/io/DataOutputStream:close	()V
    //   242: aload 5
    //   244: monitorexit
    //   245: iconst_m1
    //   246: ireturn
    //   247: aload_0
    //   248: iload 7
    //   250: putfield 154	gzp:d	I
    //   253: ldc 104
    //   255: iconst_4
    //   256: invokestatic 199	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   259: ifeq +32 -> 291
    //   262: aload_2
    //   263: invokeinterface 204 1 0
    //   268: istore 17
    //   270: new 58	java/lang/StringBuilder
    //   273: dup
    //   274: bipush 38
    //   276: invokespecial 64	java/lang/StringBuilder:<init>	(I)V
    //   279: ldc_w 293
    //   282: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: iload 17
    //   287: invokevirtual 209	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: aload_2
    //   292: invokeinterface 204 1 0
    //   297: istore 15
    //   299: aload 8
    //   301: invokevirtual 291	java/io/DataOutputStream:close	()V
    //   304: aload 5
    //   306: monitorexit
    //   307: iload 15
    //   309: ireturn
    //   310: astore 6
    //   312: aload 5
    //   314: monitorexit
    //   315: aload 6
    //   317: athrow
    //   318: astore 9
    //   320: aconst_null
    //   321: astore 8
    //   323: aload 8
    //   325: ifnull +8 -> 333
    //   328: aload 8
    //   330: invokevirtual 291	java/io/DataOutputStream:close	()V
    //   333: aload 9
    //   335: athrow
    //   336: astore 16
    //   338: goto -34 -> 304
    //   341: astore 13
    //   343: goto -101 -> 242
    //   346: astore 10
    //   348: goto -15 -> 333
    //   351: astore 9
    //   353: goto -30 -> 323
    //   356: astore 11
    //   358: aconst_null
    //   359: astore 8
    //   361: goto -140 -> 221
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	364	0	this	gzp
    //   4	85	1	localList	List
    //   23	269	2	localArrayList	java.util.ArrayList
    //   83	4	3	localObject1	Object
    //   33	13	4	localIterator1	Iterator
    //   94	219	5	localFile	File
    //   310	6	6	localObject2	Object
    //   105	144	7	i	int
    //   146	214	8	localDataOutputStream	java.io.DataOutputStream
    //   318	16	9	localObject3	Object
    //   351	1	9	localObject4	Object
    //   346	1	10	localIOException1	java.io.IOException
    //   219	8	11	localException1	java.lang.Exception
    //   356	1	11	localException2	java.lang.Exception
    //   341	1	13	localIOException2	java.io.IOException
    //   174	13	14	localIterator2	Iterator
    //   297	11	15	j	int
    //   336	1	16	localIOException3	java.io.IOException
    //   268	18	17	k	int
    //   199	13	19	arrayOfByte	byte[]
    //   55	18	20	localgzq	gzq
    // Exception table:
    //   from	to	target	type
    //   7	35	83	finally
    //   35	80	83	finally
    //   84	86	83	finally
    //   88	90	83	finally
    //   148	176	219	java/lang/Exception
    //   176	216	219	java/lang/Exception
    //   247	291	219	java/lang/Exception
    //   291	299	219	java/lang/Exception
    //   99	119	310	finally
    //   237	242	310	finally
    //   242	245	310	finally
    //   299	304	310	finally
    //   304	307	310	finally
    //   312	315	310	finally
    //   328	333	310	finally
    //   333	336	310	finally
    //   121	148	318	finally
    //   299	304	336	java/io/IOException
    //   237	242	341	java/io/IOException
    //   328	333	346	java/io/IOException
    //   148	176	351	finally
    //   176	216	351	finally
    //   221	232	351	finally
    //   247	291	351	finally
    //   291	299	351	finally
    //   121	148	356	java/lang/Exception
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzp
 * JD-Core Version:    0.7.0.1
 */