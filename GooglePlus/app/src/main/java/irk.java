import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;

public final class irk
  extends gzf
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;
  private final ipf l;
  private int m;
  private int n;
  
  public irk(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, ipf paramipf)
  {
    super("CropAndSavePhotoTask");
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    this.l = paramipf;
    this.m = 0;
    this.n = 0;
  }
  
  public irk(RectF paramRectF, ipf paramipf)
  {
    super("CropAndSavePhotoTask");
    this.a = paramRectF.left;
    this.b = paramRectF.top;
    this.c = paramRectF.right;
    this.d = paramRectF.bottom;
    this.l = paramipf;
    this.m = 0;
    this.n = 0;
  }
  
  private static Uri a(Context paramContext, Bitmap paramBitmap)
  {
    FileOutputStream localFileOutputStream;
    try
    {
      File localFile = File.createTempFile("CropperOutput", ".jpg", paramContext.getCacheDir());
      localFileOutputStream = new FileOutputStream(localFile);
      if (localFileOutputStream == null) {
        break label63;
      }
    }
    finally
    {
      try
      {
        paramBitmap.compress(Bitmap.CompressFormat.JPEG, 90, localFileOutputStream);
        localFileOutputStream.flush();
        localFileOutputStream.close();
        return Uri.fromFile(localFile);
      }
      finally {}
      localObject1 = finally;
      localFileOutputStream = null;
    }
    localFileOutputStream.flush();
    localFileOutputStream.close();
    label63:
    throw localObject1;
  }
  
  /* Error */
  private final Uri f(Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 31	irk:l	Lipf;
    //   6: getfield 106	ipf:d	Landroid/net/Uri;
    //   9: ifnull +255 -> 264
    //   12: iload_2
    //   13: ifeq +550 -> 563
    //   16: aload_0
    //   17: getfield 31	irk:l	Lipf;
    //   20: getfield 106	ipf:d	Landroid/net/Uri;
    //   23: astore 11
    //   25: aload 11
    //   27: invokevirtual 110	android/net/Uri:getScheme	()Ljava/lang/String;
    //   30: astore 12
    //   32: ldc 18
    //   34: iconst_4
    //   35: invokestatic 116	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   38: ifeq +26 -> 64
    //   41: aload 12
    //   43: invokestatic 122	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   46: astore 30
    //   48: aload 30
    //   50: invokevirtual 126	java/lang/String:length	()I
    //   53: ifeq +216 -> 269
    //   56: ldc 128
    //   58: aload 30
    //   60: invokevirtual 132	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   63: pop
    //   64: aload_1
    //   65: invokevirtual 136	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   68: aload 11
    //   70: invokevirtual 142	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   73: astore 13
    //   75: aload 13
    //   77: astore 5
    //   79: aload 5
    //   81: iconst_0
    //   82: invokestatic 148	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   85: astore 14
    //   87: aload 14
    //   89: astore 4
    //   91: aload 4
    //   93: invokevirtual 151	android/graphics/BitmapRegionDecoder:getWidth	()I
    //   96: istore 15
    //   98: aload 4
    //   100: invokevirtual 154	android/graphics/BitmapRegionDecoder:getHeight	()I
    //   103: istore 16
    //   105: ldc 18
    //   107: iconst_4
    //   108: invokestatic 116	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   111: ifeq +35 -> 146
    //   114: iconst_2
    //   115: anewarray 156	java/lang/Object
    //   118: astore 28
    //   120: aload 28
    //   122: iconst_0
    //   123: iload 15
    //   125: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   128: aastore
    //   129: aload 28
    //   131: iconst_1
    //   132: iload 16
    //   134: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: aastore
    //   138: ldc 163
    //   140: aload 28
    //   142: invokestatic 167	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   145: pop
    //   146: aload_1
    //   147: ldc 169
    //   149: invokestatic 174	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   152: checkcast 169	ipb
    //   155: aload_0
    //   156: getfield 31	irk:l	Lipf;
    //   159: iconst_5
    //   160: iload 15
    //   162: iload 16
    //   164: iconst_0
    //   165: invokevirtual 177	ipb:a	(Lipf;IIII)Ljava/lang/Object;
    //   168: checkcast 80	android/graphics/Bitmap
    //   171: astore 17
    //   173: aload 17
    //   175: ifnonnull +118 -> 293
    //   178: new 101	java/lang/Exception
    //   181: dup
    //   182: ldc 179
    //   184: invokespecial 180	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   187: athrow
    //   188: astore 6
    //   190: aload 4
    //   192: astore 7
    //   194: aload 5
    //   196: astore 8
    //   198: ldc 18
    //   200: iconst_4
    //   201: invokestatic 116	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   204: ifeq +26 -> 230
    //   207: iconst_1
    //   208: anewarray 156	java/lang/Object
    //   211: astore 9
    //   213: aload 9
    //   215: iconst_0
    //   216: aload 6
    //   218: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   221: aastore
    //   222: ldc 185
    //   224: aload 9
    //   226: invokestatic 167	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   229: pop
    //   230: aload 6
    //   232: athrow
    //   233: astore_3
    //   234: aload 7
    //   236: astore 4
    //   238: aload 8
    //   240: astore 5
    //   242: aload 5
    //   244: ifnull +8 -> 252
    //   247: aload 5
    //   249: invokevirtual 188	java/io/InputStream:close	()V
    //   252: aload 4
    //   254: ifnull +8 -> 262
    //   257: aload 4
    //   259: invokevirtual 191	android/graphics/BitmapRegionDecoder:recycle	()V
    //   262: aload_3
    //   263: athrow
    //   264: iconst_0
    //   265: istore_2
    //   266: goto -254 -> 12
    //   269: new 118	java/lang/String
    //   272: dup
    //   273: ldc 128
    //   275: invokespecial 192	java/lang/String:<init>	(Ljava/lang/String;)V
    //   278: pop
    //   279: goto -215 -> 64
    //   282: astore 6
    //   284: aconst_null
    //   285: astore 7
    //   287: aconst_null
    //   288: astore 8
    //   290: goto -92 -> 198
    //   293: aload 17
    //   295: invokevirtual 193	android/graphics/Bitmap:getWidth	()I
    //   298: istore 18
    //   300: aload 17
    //   302: invokevirtual 194	android/graphics/Bitmap:getHeight	()I
    //   305: istore 19
    //   307: aload_0
    //   308: getfield 23	irk:a	F
    //   311: iload 18
    //   313: i2f
    //   314: fmul
    //   315: f2i
    //   316: iload 18
    //   318: invokestatic 200	java/lang/Math:min	(II)I
    //   321: istore 20
    //   323: aload_0
    //   324: getfield 25	irk:b	F
    //   327: iload 19
    //   329: i2f
    //   330: fmul
    //   331: f2i
    //   332: iload 19
    //   334: invokestatic 200	java/lang/Math:min	(II)I
    //   337: istore 21
    //   339: aload_0
    //   340: getfield 27	irk:c	F
    //   343: iload 18
    //   345: i2f
    //   346: fmul
    //   347: f2i
    //   348: iload 18
    //   350: invokestatic 200	java/lang/Math:min	(II)I
    //   353: istore 22
    //   355: aload_0
    //   356: getfield 29	irk:d	F
    //   359: iload 19
    //   361: i2f
    //   362: fmul
    //   363: f2i
    //   364: iload 19
    //   366: invokestatic 200	java/lang/Math:min	(II)I
    //   369: istore 23
    //   371: ldc 18
    //   373: iconst_4
    //   374: invokestatic 116	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   377: ifeq +72 -> 449
    //   380: bipush 6
    //   382: anewarray 156	java/lang/Object
    //   385: astore 26
    //   387: aload 26
    //   389: iconst_0
    //   390: iload 18
    //   392: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   395: aastore
    //   396: aload 26
    //   398: iconst_1
    //   399: iload 19
    //   401: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   404: aastore
    //   405: aload 26
    //   407: iconst_2
    //   408: iload 20
    //   410: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   413: aastore
    //   414: aload 26
    //   416: iconst_3
    //   417: iload 21
    //   419: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   422: aastore
    //   423: aload 26
    //   425: iconst_4
    //   426: iload 22
    //   428: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   431: aastore
    //   432: aload 26
    //   434: iconst_5
    //   435: iload 23
    //   437: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   440: aastore
    //   441: ldc 202
    //   443: aload 26
    //   445: invokestatic 167	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   448: pop
    //   449: aload 17
    //   451: iload 20
    //   453: iload 21
    //   455: iload 22
    //   457: iload 20
    //   459: isub
    //   460: iload 23
    //   462: iload 21
    //   464: isub
    //   465: invokestatic 206	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   468: astore 24
    //   470: aload 24
    //   472: ifnonnull +13 -> 485
    //   475: new 101	java/lang/Exception
    //   478: dup
    //   479: ldc 208
    //   481: invokespecial 180	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   484: athrow
    //   485: aload_0
    //   486: aload 24
    //   488: invokevirtual 193	android/graphics/Bitmap:getWidth	()I
    //   491: putfield 33	irk:m	I
    //   494: aload_0
    //   495: aload 24
    //   497: invokevirtual 194	android/graphics/Bitmap:getHeight	()I
    //   500: putfield 35	irk:n	I
    //   503: aload_1
    //   504: aload 24
    //   506: invokestatic 210	irk:a	(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/net/Uri;
    //   509: astore 25
    //   511: aload 5
    //   513: ifnull +8 -> 521
    //   516: aload 5
    //   518: invokevirtual 188	java/io/InputStream:close	()V
    //   521: aload 4
    //   523: ifnull +8 -> 531
    //   526: aload 4
    //   528: invokevirtual 191	android/graphics/BitmapRegionDecoder:recycle	()V
    //   531: aload 25
    //   533: areturn
    //   534: astore_3
    //   535: aconst_null
    //   536: astore 4
    //   538: aconst_null
    //   539: astore 5
    //   541: goto -299 -> 242
    //   544: astore_3
    //   545: aconst_null
    //   546: astore 4
    //   548: goto -306 -> 242
    //   551: astore 6
    //   553: aload 5
    //   555: astore 8
    //   557: aconst_null
    //   558: astore 7
    //   560: goto -362 -> 198
    //   563: aconst_null
    //   564: astore 5
    //   566: goto -487 -> 79
    //   569: astore_3
    //   570: goto -328 -> 242
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	573	0	this	irk
    //   0	573	1	paramContext	Context
    //   1	265	2	i	int
    //   233	30	3	localObject1	Object
    //   534	1	3	localObject2	Object
    //   544	1	3	localObject3	Object
    //   569	1	3	localObject4	Object
    //   89	458	4	localObject5	Object
    //   77	488	5	localObject6	Object
    //   188	43	6	localException1	Exception
    //   282	1	6	localException2	Exception
    //   551	1	6	localException3	Exception
    //   192	367	7	localObject7	Object
    //   196	360	8	localObject8	Object
    //   211	14	9	arrayOfObject1	Object[]
    //   23	46	11	localUri1	Uri
    //   30	12	12	str1	String
    //   73	3	13	localInputStream	java.io.InputStream
    //   85	3	14	localBitmapRegionDecoder	android.graphics.BitmapRegionDecoder
    //   96	65	15	j	int
    //   103	60	16	k	int
    //   171	279	17	localBitmap1	Bitmap
    //   298	93	18	i1	int
    //   305	95	19	i2	int
    //   321	139	20	i3	int
    //   337	128	21	i4	int
    //   353	107	22	i5	int
    //   369	96	23	i6	int
    //   468	37	24	localBitmap2	Bitmap
    //   509	23	25	localUri2	Uri
    //   385	59	26	arrayOfObject2	Object[]
    //   118	23	28	arrayOfObject3	Object[]
    //   46	13	30	str2	String
    // Exception table:
    //   from	to	target	type
    //   91	146	188	java/lang/Exception
    //   146	173	188	java/lang/Exception
    //   178	188	188	java/lang/Exception
    //   293	449	188	java/lang/Exception
    //   449	470	188	java/lang/Exception
    //   475	485	188	java/lang/Exception
    //   485	511	188	java/lang/Exception
    //   198	230	233	finally
    //   230	233	233	finally
    //   2	12	282	java/lang/Exception
    //   16	64	282	java/lang/Exception
    //   64	75	282	java/lang/Exception
    //   269	279	282	java/lang/Exception
    //   2	12	534	finally
    //   16	64	534	finally
    //   64	75	534	finally
    //   269	279	534	finally
    //   79	87	544	finally
    //   79	87	551	java/lang/Exception
    //   91	146	569	finally
    //   146	173	569	finally
    //   178	188	569	finally
    //   293	449	569	finally
    //   449	470	569	finally
    //   475	485	569	finally
    //   485	511	569	finally
  }
  
  protected final hae a(Context paramContext)
  {
    try
    {
      Uri localUri = f(paramContext);
      hae localhae = new hae(200, null, null);
      localhae.a().putParcelable("image_uri", localUri);
      localhae.a().putInt("image_cropped_width", this.m);
      localhae.a().putInt("image_Cropped_height", this.n);
      return localhae;
    }
    catch (Exception localException)
    {
      if (Log.isLoggable("CropAndSavePhotoTask", 4))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        String.format("CropAndSavePhotoTask failed : %s", arrayOfObject);
      }
      return new hae(0, localException, null);
    }
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(da.n);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irk
 * JD-Core Version:    0.7.0.1
 */