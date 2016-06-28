final class itc
  implements itb
{
  private final itd a;
  
  public itc(itd paramitd)
  {
    this.a = paramitd;
  }
  
  /* Error */
  public final java.util.ArrayList<ita> a(android.content.Context paramContext, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: new 18	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 19	java/util/ArrayList:<init>	()V
    //   7: astore 6
    //   9: aload_1
    //   10: invokevirtual 25	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   13: astore 7
    //   15: aload_0
    //   16: getfield 15	itc:a	Litd;
    //   19: invokeinterface 31 1 0
    //   24: astore 10
    //   26: aload_0
    //   27: getfield 15	itc:a	Litd;
    //   30: invokeinterface 35 1 0
    //   35: astore 11
    //   37: aload_0
    //   38: getfield 15	itc:a	Litd;
    //   41: invokeinterface 39 1 0
    //   46: astore 12
    //   48: iconst_1
    //   49: anewarray 41	java/lang/String
    //   52: astore 13
    //   54: aload 13
    //   56: iconst_0
    //   57: iload_2
    //   58: invokestatic 45	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   61: aastore
    //   62: getstatic 51	java/util/Locale:US	Ljava/util/Locale;
    //   65: astore 14
    //   67: iconst_2
    //   68: anewarray 4	java/lang/Object
    //   71: astore 15
    //   73: iload_3
    //   74: ifeq +197 -> 271
    //   77: ldc 53
    //   79: astore 16
    //   81: aload 15
    //   83: iconst_0
    //   84: aload 16
    //   86: aastore
    //   87: aload 15
    //   89: iconst_1
    //   90: iload 5
    //   92: invokestatic 58	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   95: aastore
    //   96: aload 7
    //   98: aload 10
    //   100: aload 11
    //   102: aload 12
    //   104: aload 13
    //   106: aload 14
    //   108: ldc 60
    //   110: aload 15
    //   112: invokestatic 64	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   115: invokevirtual 70	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   118: astore 17
    //   120: aload 17
    //   122: astore 9
    //   124: aload 9
    //   126: ifnull +130 -> 256
    //   129: aload 9
    //   131: invokeinterface 76 1 0
    //   136: ifeq +120 -> 256
    //   139: new 78	ita
    //   142: dup
    //   143: invokespecial 79	ita:<init>	()V
    //   146: astore 18
    //   148: aload 18
    //   150: aload 9
    //   152: iconst_0
    //   153: invokeinterface 83 2 0
    //   158: i2l
    //   159: putfield 86	ita:b	J
    //   162: iload_3
    //   163: ifeq +115 -> 278
    //   166: aload 9
    //   168: iconst_1
    //   169: invokeinterface 90 2 0
    //   174: lstore 19
    //   176: aload 18
    //   178: lload 19
    //   180: putfield 93	ita:c	J
    //   183: aload 18
    //   185: iload 4
    //   187: putfield 96	ita:a	I
    //   190: aload 9
    //   192: iconst_3
    //   193: invokeinterface 99 2 0
    //   198: astore 21
    //   200: aload 9
    //   202: iconst_4
    //   203: invokeinterface 103 2 0
    //   208: ifeq +83 -> 291
    //   211: iconst_0
    //   212: istore 22
    //   214: aload 18
    //   216: aload 21
    //   218: iload 22
    //   220: aload 9
    //   222: iconst_2
    //   223: invokeinterface 90 2 0
    //   228: invokestatic 108	efj:a	(Ljava/lang/String;IJ)Ljava/lang/String;
    //   231: putfield 112	ita:d	Ljava/lang/String;
    //   234: aload 6
    //   236: aload 18
    //   238: invokevirtual 116	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   241: pop
    //   242: aload 9
    //   244: invokeinterface 119 1 0
    //   249: istore 24
    //   251: iload 24
    //   253: ifne -114 -> 139
    //   256: aload 9
    //   258: ifnull +10 -> 268
    //   261: aload 9
    //   263: invokeinterface 122 1 0
    //   268: aload 6
    //   270: areturn
    //   271: ldc 124
    //   273: astore 16
    //   275: goto -194 -> 81
    //   278: aload 9
    //   280: iconst_2
    //   281: invokeinterface 90 2 0
    //   286: lstore 19
    //   288: goto -112 -> 176
    //   291: aload 9
    //   293: iconst_4
    //   294: invokeinterface 83 2 0
    //   299: istore 25
    //   301: iload 25
    //   303: istore 22
    //   305: goto -91 -> 214
    //   308: astore 8
    //   310: aconst_null
    //   311: astore 9
    //   313: aload 9
    //   315: ifnull +10 -> 325
    //   318: aload 9
    //   320: invokeinterface 122 1 0
    //   325: aload 8
    //   327: athrow
    //   328: astore 8
    //   330: goto -17 -> 313
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	333	0	this	itc
    //   0	333	1	paramContext	android.content.Context
    //   0	333	2	paramInt1	int
    //   0	333	3	paramBoolean	boolean
    //   0	333	4	paramInt2	int
    //   0	333	5	paramInt3	int
    //   7	262	6	localArrayList	java.util.ArrayList
    //   13	84	7	localContentResolver	android.content.ContentResolver
    //   308	18	8	localObject1	Object
    //   328	1	8	localObject2	Object
    //   122	197	9	localCursor1	android.database.Cursor
    //   24	75	10	localUri	android.net.Uri
    //   35	66	11	arrayOfString1	java.lang.String[]
    //   46	57	12	str1	java.lang.String
    //   52	53	13	arrayOfString2	java.lang.String[]
    //   65	42	14	localLocale	java.util.Locale
    //   71	40	15	arrayOfObject	Object[]
    //   79	195	16	str2	java.lang.String
    //   118	3	17	localCursor2	android.database.Cursor
    //   146	91	18	localita	ita
    //   174	113	19	l	long
    //   198	19	21	str3	java.lang.String
    //   212	92	22	i	int
    //   249	3	24	bool	boolean
    //   299	3	25	j	int
    // Exception table:
    //   from	to	target	type
    //   15	73	308	finally
    //   81	120	308	finally
    //   129	139	328	finally
    //   139	162	328	finally
    //   166	176	328	finally
    //   176	211	328	finally
    //   214	251	328	finally
    //   278	288	328	finally
    //   291	301	328	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     itc
 * JD-Core Version:    0.7.0.1
 */