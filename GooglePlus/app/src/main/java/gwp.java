import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;

public class gwp
{
  public final Context a;
  public final giz b;
  public final gwq c = new gwq(this);
  private final ContentResolver d;
  private itz e;
  
  public gwp(Context paramContext)
  {
    this(paramContext, paramContext.getContentResolver());
  }
  
  private gwp(Context paramContext, ContentResolver paramContentResolver)
  {
    this.a = paramContext;
    this.d = paramContentResolver;
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  /* Error */
  public final gwr a(int paramInt, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 59	gwp:e	Litz;
    //   6: ifnull +16 -> 22
    //   9: getstatic 64	gws:b	I
    //   12: invokestatic 69	gwr:a	(I)Lgwr;
    //   15: astore 29
    //   17: aload_0
    //   18: monitorexit
    //   19: aload 29
    //   21: areturn
    //   22: aload_0
    //   23: new 71	iub
    //   26: dup
    //   27: aload_0
    //   28: getfield 37	gwp:a	Landroid/content/Context;
    //   31: invokespecial 73	iub:<init>	(Landroid/content/Context;)V
    //   34: iload_1
    //   35: invokevirtual 76	iub:a	(I)Liub;
    //   38: invokevirtual 79	iub:a	()Litz;
    //   41: putfield 59	gwp:e	Litz;
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_0
    //   47: getfield 35	gwp:c	Lgwq;
    //   50: getfield 82	gwq:a	Z
    //   53: ifeq +45 -> 98
    //   56: getstatic 84	gws:e	I
    //   59: invokestatic 69	gwr:a	(I)Lgwr;
    //   62: astore 27
    //   64: aload_0
    //   65: monitorenter
    //   66: aload_0
    //   67: aconst_null
    //   68: putfield 59	gwp:e	Litz;
    //   71: aload_0
    //   72: getfield 35	gwp:c	Lgwq;
    //   75: iconst_0
    //   76: putfield 82	gwq:a	Z
    //   79: aload_0
    //   80: monitorexit
    //   81: aload 27
    //   83: areturn
    //   84: astore 28
    //   86: aload_0
    //   87: monitorexit
    //   88: aload 28
    //   90: athrow
    //   91: astore 4
    //   93: aload_0
    //   94: monitorexit
    //   95: aload 4
    //   97: athrow
    //   98: aload_0
    //   99: getfield 59	gwp:e	Litz;
    //   102: astore 22
    //   104: new 86	iup
    //   107: dup
    //   108: invokespecial 87	iup:<init>	()V
    //   111: astore 23
    //   113: aload 23
    //   115: aload_3
    //   116: invokestatic 93	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   119: putfield 96	iup:a	Landroid/net/Uri;
    //   122: aload 23
    //   124: aload_2
    //   125: putfield 99	iup:d	Ljava/lang/String;
    //   128: aload 23
    //   130: iconst_1
    //   131: putfield 102	iup:f	Z
    //   134: aload 23
    //   136: iconst_0
    //   137: putfield 105	iup:h	Z
    //   140: aload 22
    //   142: aload 23
    //   144: invokevirtual 108	iup:a	()Liuo;
    //   147: invokevirtual 113	itz:a	(Liuo;)Lity;
    //   150: astore 24
    //   152: aload 24
    //   154: getfield 116	ity:d	Ljava/lang/String;
    //   157: aload 24
    //   159: getfield 118	ity:f	Ljava/lang/String;
    //   162: invokestatic 121	gwr:a	(Ljava/lang/String;Ljava/lang/String;)Lgwr;
    //   165: astore 25
    //   167: aload_0
    //   168: monitorenter
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield 59	gwp:e	Litz;
    //   174: aload_0
    //   175: getfield 35	gwp:c	Lgwq;
    //   178: iconst_0
    //   179: putfield 82	gwq:a	Z
    //   182: aload_0
    //   183: monitorexit
    //   184: aload 25
    //   186: areturn
    //   187: astore 26
    //   189: aload_0
    //   190: monitorexit
    //   191: aload 26
    //   193: athrow
    //   194: astore 19
    //   196: getstatic 84	gws:e	I
    //   199: invokestatic 69	gwr:a	(I)Lgwr;
    //   202: astore 20
    //   204: aload_0
    //   205: monitorenter
    //   206: aload_0
    //   207: aconst_null
    //   208: putfield 59	gwp:e	Litz;
    //   211: aload_0
    //   212: getfield 35	gwp:c	Lgwq;
    //   215: iconst_0
    //   216: putfield 82	gwq:a	Z
    //   219: aload_0
    //   220: monitorexit
    //   221: aload 20
    //   223: areturn
    //   224: astore 21
    //   226: aload_0
    //   227: monitorexit
    //   228: aload 21
    //   230: athrow
    //   231: astore 15
    //   233: ldc 123
    //   235: bipush 6
    //   237: invokestatic 129	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   240: ifeq +13 -> 253
    //   243: ldc 123
    //   245: ldc 131
    //   247: aload 15
    //   249: invokestatic 134	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   252: pop
    //   253: getstatic 64	gws:b	I
    //   256: invokestatic 69	gwr:a	(I)Lgwr;
    //   259: astore 16
    //   261: aload_0
    //   262: monitorenter
    //   263: aload_0
    //   264: aconst_null
    //   265: putfield 59	gwp:e	Litz;
    //   268: aload_0
    //   269: getfield 35	gwp:c	Lgwq;
    //   272: iconst_0
    //   273: putfield 82	gwq:a	Z
    //   276: aload_0
    //   277: monitorexit
    //   278: aload 16
    //   280: areturn
    //   281: astore 17
    //   283: aload_0
    //   284: monitorexit
    //   285: aload 17
    //   287: athrow
    //   288: astore 11
    //   290: ldc 123
    //   292: bipush 6
    //   294: invokestatic 129	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   297: ifeq +13 -> 310
    //   300: ldc 123
    //   302: ldc 136
    //   304: aload 11
    //   306: invokestatic 134	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   309: pop
    //   310: getstatic 138	gws:d	I
    //   313: invokestatic 69	gwr:a	(I)Lgwr;
    //   316: astore 12
    //   318: aload_0
    //   319: monitorenter
    //   320: aload_0
    //   321: aconst_null
    //   322: putfield 59	gwp:e	Litz;
    //   325: aload_0
    //   326: getfield 35	gwp:c	Lgwq;
    //   329: iconst_0
    //   330: putfield 82	gwq:a	Z
    //   333: aload_0
    //   334: monitorexit
    //   335: aload 12
    //   337: areturn
    //   338: astore 13
    //   340: aload_0
    //   341: monitorexit
    //   342: aload 13
    //   344: athrow
    //   345: astore 7
    //   347: ldc 123
    //   349: bipush 6
    //   351: invokestatic 129	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   354: ifeq +13 -> 367
    //   357: ldc 123
    //   359: ldc 140
    //   361: aload 7
    //   363: invokestatic 134	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   366: pop
    //   367: getstatic 142	gws:c	I
    //   370: invokestatic 69	gwr:a	(I)Lgwr;
    //   373: astore 8
    //   375: aload_0
    //   376: monitorenter
    //   377: aload_0
    //   378: aconst_null
    //   379: putfield 59	gwp:e	Litz;
    //   382: aload_0
    //   383: getfield 35	gwp:c	Lgwq;
    //   386: iconst_0
    //   387: putfield 82	gwq:a	Z
    //   390: aload_0
    //   391: monitorexit
    //   392: aload 8
    //   394: areturn
    //   395: astore 9
    //   397: aload_0
    //   398: monitorexit
    //   399: aload 9
    //   401: athrow
    //   402: astore 5
    //   404: aload_0
    //   405: monitorenter
    //   406: aload_0
    //   407: aconst_null
    //   408: putfield 59	gwp:e	Litz;
    //   411: aload_0
    //   412: getfield 35	gwp:c	Lgwq;
    //   415: iconst_0
    //   416: putfield 82	gwq:a	Z
    //   419: aload_0
    //   420: monitorexit
    //   421: aload 5
    //   423: athrow
    //   424: astore 6
    //   426: aload_0
    //   427: monitorexit
    //   428: aload 6
    //   430: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	431	0	this	gwp
    //   0	431	1	paramInt	int
    //   0	431	2	paramString1	String
    //   0	431	3	paramString2	String
    //   91	5	4	localObject1	Object
    //   402	20	5	localObject2	Object
    //   424	5	6	localObject3	Object
    //   345	17	7	localException	Exception
    //   373	20	8	localgwr1	gwr
    //   395	5	9	localObject4	Object
    //   288	17	11	localitq	itq
    //   316	20	12	localgwr2	gwr
    //   338	5	13	localObject5	Object
    //   231	17	15	localitt	itt
    //   259	20	16	localgwr3	gwr
    //   281	5	17	localObject6	Object
    //   194	1	19	localitn	itn
    //   202	20	20	localgwr4	gwr
    //   224	5	21	localObject7	Object
    //   102	39	22	localitz	itz
    //   111	32	23	localiup	iup
    //   150	8	24	locality	ity
    //   165	20	25	localgwr5	gwr
    //   187	5	26	localObject8	Object
    //   62	20	27	localgwr6	gwr
    //   84	5	28	localObject9	Object
    //   15	5	29	localgwr7	gwr
    // Exception table:
    //   from	to	target	type
    //   66	81	84	finally
    //   86	88	84	finally
    //   2	19	91	finally
    //   22	46	91	finally
    //   93	95	91	finally
    //   169	184	187	finally
    //   189	191	187	finally
    //   46	64	194	itn
    //   98	167	194	itn
    //   206	221	224	finally
    //   226	228	224	finally
    //   46	64	231	itt
    //   98	167	231	itt
    //   263	278	281	finally
    //   283	285	281	finally
    //   46	64	288	itq
    //   98	167	288	itq
    //   320	335	338	finally
    //   340	342	338	finally
    //   46	64	345	java/lang/Exception
    //   98	167	345	java/lang/Exception
    //   377	392	395	finally
    //   397	399	395	finally
    //   46	64	402	finally
    //   98	167	402	finally
    //   196	204	402	finally
    //   233	253	402	finally
    //   253	261	402	finally
    //   290	310	402	finally
    //   310	318	402	finally
    //   347	367	402	finally
    //   367	375	402	finally
    //   406	421	424	finally
    //   426	428	424	finally
  }
  
  public final String a(String paramString)
  {
    String str1;
    try
    {
      String str3 = irc.a(this.d.openInputStream(Uri.parse(paramString)));
      return str3;
    }
    catch (Exception localException)
    {
      str1 = String.valueOf(paramString);
      if (str1.length() == 0) {}
    }
    for (String str2 = "cannot compute fingerprint for: ".concat(str1);; str2 = new String("cannot compute fingerprint for: "))
    {
      Log.e("UploadRpcExecutor", str2, localException);
      return null;
    }
  }
  
  public final void a()
  {
    try
    {
      if (this.e != null) {
        this.e.a();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwp
 * JD-Core Version:    0.7.0.1
 */