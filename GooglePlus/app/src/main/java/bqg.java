import android.app.WallpaperManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.util.SparseIntArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.TimeZone;

final class bqg
  extends AsyncTask<Void, Void, Boolean>
{
  private Bundle a;
  private ipf b;
  private Uri c;
  private int d;
  private Bitmap.CompressFormat e;
  private String f;
  private boolean g;
  private ByteArrayOutputStream h;
  private Bitmap i;
  private Bitmap j;
  private final bvx k;
  
  public bqg(bpz parambpz, bvx parambvx, ipf paramipf)
  {
    this.k = parambvx;
    this.b = paramipf;
    Intent localIntent = parambpz.d;
    if (localIntent != null) {}
    for (Bundle localBundle = localIntent.getExtras();; localBundle = null)
    {
      this.a = localBundle;
      this.j = this.k.a;
      return;
    }
  }
  
  private static int a(File paramFile, String paramString)
  {
    String str = paramFile.getAbsolutePath();
    int m = Math.min(str.length(), paramString.length());
    for (int n = 0; n < m; n++) {
      if (str.charAt(n) != paramString.charAt(n)) {
        return n;
      }
    }
    return m;
  }
  
  private final File a(Uri paramUri)
  {
    String str1;
    int m;
    if (mfq.b(paramUri))
    {
      str1 = mfq.a(this.l.a.getContentResolver(), paramUri);
      m = str1.lastIndexOf('.');
      if (m == -1) {
        break label79;
      }
    }
    label79:
    for (String str2 = str1.substring(0, m);; str2 = str1)
    {
      File localFile1 = a(str2);
      if (!a(localFile1)) {
        break label85;
      }
      return localFile1;
      if (mfq.a(paramUri))
      {
        str1 = paramUri.getPath();
        break;
      }
      return null;
    }
    label85:
    Object localObject1 = this.l.a.getFilesDir();
    int n = a((File)localObject1, str1);
    Context localContext = this.l.a;
    String str3 = Environment.DIRECTORY_PICTURES;
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= 19) {}
    int i6;
    Object localObject4;
    label211:
    for (File[] arrayOfFile = localContext.getExternalFilesDirs(str3);; arrayOfFile = new File[] { localObject2 })
    {
      int i3 = arrayOfFile.length;
      int i4 = 0;
      while (i4 < i3)
      {
        File localFile3 = arrayOfFile[i4];
        i6 = a(localFile3, str1);
        if (i6 <= n) {
          break label440;
        }
        localObject4 = localFile3;
        i4++;
        localObject1 = localObject4;
        n = i6;
      }
      if (i1 < 8) {
        break;
      }
      localObject2 = localContext.getExternalFilesDir(str3);
    }
    Object localObject2 = Environment.getExternalStorageDirectory();
    String[] arrayOfString = new String[5];
    arrayOfString[0] = "Android";
    arrayOfString[1] = "data";
    arrayOfString[2] = localContext.getPackageName();
    arrayOfString[3] = "files";
    arrayOfString[4] = str3;
    int i2 = 0;
    label272:
    String str4;
    Object localObject3;
    if (i2 < 5)
    {
      str4 = arrayOfString[i2];
      if (localObject2 != null) {
        break label311;
      }
      localObject3 = new File(str4);
    }
    for (;;)
    {
      i2++;
      localObject2 = localObject3;
      break label272;
      break label211;
      label311:
      if (str4 != null)
      {
        localObject3 = new File((File)localObject2, str4);
        continue;
        File localFile2 = new File(str1);
        String str5 = String.valueOf(((File)localObject1).getAbsolutePath());
        String str6 = 1 + String.valueOf(str5).length() + str5 + "/";
        String str7 = localFile2.getName();
        int i5 = str7.lastIndexOf('.');
        if (i5 != -1) {}
        for (String str8 = str6.concat(str7.substring(0, i5));; str8 = str6.concat(str7)) {
          return a(str8);
        }
        label440:
        i6 = n;
        localObject4 = localObject1;
        break;
      }
      localObject3 = localObject2;
    }
  }
  
  private final File a(String paramString)
  {
    int m = 2;
    int n = paramString.lastIndexOf('~');
    String str2;
    if (n != -1) {
      str2 = paramString.substring(n);
    }
    for (;;)
    {
      try
      {
        m = 1 + Integer.parseInt(str2);
        String str3 = paramString.substring(0, n);
        paramString = str3;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        String str1;
        File localFile;
        continue;
      }
      str1 = this.f;
      localFile = new File(13 + String.valueOf(paramString).length() + String.valueOf(str1).length() + paramString + "~" + m + "." + str1);
      if (!localFile.exists()) {
        continue;
      }
      m++;
    }
    return localFile;
  }
  
  private Boolean a()
  {
    int m = this.j.getWidth();
    int n = this.j.getHeight();
    Bundle localBundle = this.l.d.getExtras();
    int i3;
    int i4;
    int i5;
    label99:
    int i6;
    label103:
    int i7;
    if ((localBundle != null) && (localBundle.containsKey("outputX")) && (localBundle.containsKey("outputY")))
    {
      i3 = localBundle.getInt("outputX");
      i4 = localBundle.getInt("outputY");
      if ((!localBundle.getBoolean("scale", true)) || (!localBundle.getBoolean("scaleUpIfNeeded", false))) {
        break label681;
      }
      i5 = 1;
      if (i3 <= m) {
        break label693;
      }
      if (i5 == 0) {
        break label687;
      }
      i6 = i3;
      if (i4 <= n) {
        break label706;
      }
      if (i5 == 0) {
        break label700;
      }
      i7 = i4;
    }
    for (;;)
    {
      if ((i6 < this.j.getWidth()) && (i7 < this.j.getHeight())) {
        this.j = Bitmap.createScaledBitmap(this.j, i6, i7, true);
      }
      if (localBundle != null) {}
      Bitmap localBitmap1;
      for (;;)
      {
        String str;
        try
        {
          if (localBundle.getBoolean("return-data"))
          {
            localBitmap2 = this.j;
            if ((localBitmap2 != null) && (localBitmap2.getWidth() != 0) && (localBitmap2.getHeight() != 0))
            {
              int i1 = localBitmap2.getRowBytes() * localBitmap2.getHeight();
              i2 = 0;
              if (i1 > 750000)
              {
                i2++;
                i1 /= 4;
                continue;
              }
            }
            else
            {
              throw new IllegalArgumentException("Bad argument to getDownsampledBitmap()");
            }
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          Bitmap localBitmap2;
          int i2;
          return Boolean.valueOf(false);
          Bitmap localBitmap3 = Bitmap.createScaledBitmap(localBitmap2, localBitmap2.getWidth() >> i2, localBitmap2.getHeight() >> i2, true);
          if (localBitmap3 == null)
          {
            localBitmap3 = null;
            this.i = localBitmap3;
            if (this.i == null) {
              return Boolean.valueOf(false);
            }
          }
          else
          {
            if (localBitmap3.getRowBytes() * localBitmap3.getHeight() <= 750000) {
              continue;
            }
            localBitmap3 = Bitmap.createScaledBitmap(localBitmap3, localBitmap3.getWidth() >> 1, localBitmap3.getHeight() >> 1, true);
            continue;
          }
          localBitmap1 = this.j;
          if ((this.a == null) || (!this.a.containsKey("outputFormat"))) {
            break label515;
          }
          str = this.a.getString("outputFormat").toLowerCase();
          if ("png".equals(str))
          {
            this.e = Bitmap.CompressFormat.PNG;
            this.f = str;
            if ((this.a == null) || (!this.a.containsKey("output"))) {
              break label623;
            }
            this.c = ((Uri)this.a.getParcelable("output"));
            if (this.c != null) {
              break;
            }
            throw new IllegalArgumentException("No output Uri provided!");
          }
        }
        catch (Exception localException)
        {
          return Boolean.valueOf(false);
        }
        if ("webp".equals(str))
        {
          this.e = Bitmap.CompressFormat.WEBP;
          this.f = str;
        }
        else
        {
          this.e = Bitmap.CompressFormat.JPEG;
          this.f = "jpg";
          continue;
          label515:
          this.e = Bitmap.CompressFormat.JPEG;
          this.f = "jpg";
        }
      }
      a(localBitmap1);
      for (;;)
      {
        WallpaperManager localWallpaperManager;
        if (this.g)
        {
          if (this.h == null)
          {
            this.h = new ByteArrayOutputStream(2048);
            localBitmap1.compress(this.e, 90, this.h);
          }
          localWallpaperManager = WallpaperManager.getInstance(this.l.a);
          if (localWallpaperManager == null) {}
        }
        try
        {
          localWallpaperManager.setStream(new ByteArrayInputStream(this.h.toByteArray()));
          label618:
          return Boolean.valueOf(true);
          label623:
          if (!this.g)
          {
            Uri localUri = this.b.d;
            File localFile = a(localUri);
            if (localFile == null) {
              throw new IllegalArgumentException("Source files specified with content URI must also specify an output URI via the \"output\" extra.");
            }
            a(localUri, localFile, localBitmap1);
          }
        }
        catch (IOException localIOException)
        {
          break label618;
        }
      }
      label681:
      i5 = 0;
      break;
      label687:
      i3 = m;
      break label99;
      label693:
      i6 = i3;
      break label103;
      label700:
      i7 = n;
      continue;
      label706:
      i7 = i4;
    }
  }
  
  /* Error */
  private final void a(Bitmap paramBitmap)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 32	bqg:l	Lbpz;
    //   6: getfield 90	bpz:a	Landroid/content/Context;
    //   9: invokevirtual 96	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   12: astore_3
    //   13: aload_0
    //   14: getfield 291	bqg:e	Landroid/graphics/Bitmap$CompressFormat;
    //   17: getstatic 309	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   20: if_acmpne +127 -> 147
    //   23: aload_0
    //   24: getfield 39	bqg:b	Lipf;
    //   27: getfield 348	ipf:d	Landroid/net/Uri;
    //   30: astore 11
    //   32: aload_3
    //   33: aload 11
    //   35: invokevirtual 361	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   38: astore 14
    //   40: aload 14
    //   42: astore 13
    //   44: aload_3
    //   45: aload_0
    //   46: getfield 299	bqg:c	Landroid/net/Uri;
    //   49: invokevirtual 365	android/content/ContentResolver:openOutputStream	(Landroid/net/Uri;)Ljava/io/OutputStream;
    //   52: astore_2
    //   53: aload_0
    //   54: getfield 316	bqg:g	Z
    //   57: ifeq +57 -> 114
    //   60: aload_0
    //   61: new 320	java/io/ByteArrayOutputStream
    //   64: dup
    //   65: sipush 2048
    //   68: invokespecial 321	java/io/ByteArrayOutputStream:<init>	(I)V
    //   71: putfield 318	bqg:h	Ljava/io/ByteArrayOutputStream;
    //   74: aload 13
    //   76: aload_0
    //   77: getfield 318	bqg:h	Ljava/io/ByteArrayOutputStream;
    //   80: aload_1
    //   81: invokestatic 368	bqg:a	(Ljava/io/InputStream;Ljava/io/OutputStream;Landroid/graphics/Bitmap;)V
    //   84: aload_2
    //   85: aload_0
    //   86: getfield 318	bqg:h	Ljava/io/ByteArrayOutputStream;
    //   89: invokevirtual 337	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   92: invokevirtual 373	java/io/OutputStream:write	([B)V
    //   95: aload 13
    //   97: ifnull +8 -> 105
    //   100: aload 13
    //   102: invokevirtual 378	java/io/InputStream:close	()V
    //   105: aload_2
    //   106: ifnull +7 -> 113
    //   109: aload_2
    //   110: invokevirtual 379	java/io/OutputStream:close	()V
    //   113: return
    //   114: aload 13
    //   116: aload_2
    //   117: aload_1
    //   118: invokestatic 368	bqg:a	(Ljava/io/InputStream;Ljava/io/OutputStream;Landroid/graphics/Bitmap;)V
    //   121: goto -26 -> 95
    //   124: astore 12
    //   126: aload 13
    //   128: ifnull +8 -> 136
    //   131: aload 13
    //   133: invokevirtual 378	java/io/InputStream:close	()V
    //   136: aload_2
    //   137: ifnull +7 -> 144
    //   140: aload_2
    //   141: invokevirtual 379	java/io/OutputStream:close	()V
    //   144: aload 12
    //   146: athrow
    //   147: ldc_w 381
    //   150: iconst_4
    //   151: invokestatic 387	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   154: ifeq +38 -> 192
    //   157: aload_0
    //   158: getfield 299	bqg:c	Landroid/net/Uri;
    //   161: invokevirtual 388	android/net/Uri:toString	()Ljava/lang/String;
    //   164: invokestatic 165	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   167: astore 7
    //   169: aload 7
    //   171: invokevirtual 71	java/lang/String:length	()I
    //   174: istore 8
    //   176: aconst_null
    //   177: astore_2
    //   178: iload 8
    //   180: ifeq +77 -> 257
    //   183: ldc_w 390
    //   186: aload 7
    //   188: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   191: pop
    //   192: aload_3
    //   193: aload_0
    //   194: getfield 299	bqg:c	Landroid/net/Uri;
    //   197: invokevirtual 365	android/content/ContentResolver:openOutputStream	(Landroid/net/Uri;)Ljava/io/OutputStream;
    //   200: astore_2
    //   201: aload_0
    //   202: getfield 316	bqg:g	Z
    //   205: ifeq +79 -> 284
    //   208: aload_0
    //   209: new 320	java/io/ByteArrayOutputStream
    //   212: dup
    //   213: sipush 2048
    //   216: invokespecial 321	java/io/ByteArrayOutputStream:<init>	(I)V
    //   219: putfield 318	bqg:h	Ljava/io/ByteArrayOutputStream;
    //   222: aload_1
    //   223: aload_0
    //   224: getfield 291	bqg:e	Landroid/graphics/Bitmap$CompressFormat;
    //   227: bipush 90
    //   229: aload_0
    //   230: getfield 318	bqg:h	Ljava/io/ByteArrayOutputStream;
    //   233: invokevirtual 325	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   236: pop
    //   237: aload_2
    //   238: aload_0
    //   239: getfield 318	bqg:h	Ljava/io/ByteArrayOutputStream;
    //   242: invokevirtual 337	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   245: invokevirtual 373	java/io/OutputStream:write	([B)V
    //   248: aload_2
    //   249: ifnull -136 -> 113
    //   252: aload_2
    //   253: invokevirtual 379	java/io/OutputStream:close	()V
    //   256: return
    //   257: new 67	java/lang/String
    //   260: dup
    //   261: ldc_w 390
    //   264: invokespecial 391	java/lang/String:<init>	(Ljava/lang/String;)V
    //   267: pop
    //   268: goto -76 -> 192
    //   271: astore 4
    //   273: aload_2
    //   274: ifnull +7 -> 281
    //   277: aload_2
    //   278: invokevirtual 379	java/io/OutputStream:close	()V
    //   281: aload 4
    //   283: athrow
    //   284: aload_1
    //   285: aload_0
    //   286: getfield 291	bqg:e	Landroid/graphics/Bitmap$CompressFormat;
    //   289: bipush 90
    //   291: aload_2
    //   292: invokevirtual 325	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   295: pop
    //   296: goto -48 -> 248
    //   299: astore 12
    //   301: aconst_null
    //   302: astore_2
    //   303: aconst_null
    //   304: astore 13
    //   306: goto -180 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	this	bqg
    //   0	309	1	paramBitmap	Bitmap
    //   1	302	2	localOutputStream	OutputStream
    //   12	181	3	localContentResolver	ContentResolver
    //   271	11	4	localObject1	Object
    //   167	20	7	str	String
    //   174	5	8	m	int
    //   30	4	11	localUri	Uri
    //   124	21	12	localObject2	Object
    //   299	1	12	localObject3	Object
    //   42	263	13	localInputStream1	InputStream
    //   38	3	14	localInputStream2	InputStream
    // Exception table:
    //   from	to	target	type
    //   44	95	124	finally
    //   114	121	124	finally
    //   147	176	271	finally
    //   183	192	271	finally
    //   192	248	271	finally
    //   257	268	271	finally
    //   284	296	271	finally
    //   32	40	299	finally
  }
  
  private final void a(Uri paramUri, File paramFile, Bitmap paramBitmap)
  {
    this.c = Uri.fromFile(paramFile);
    a(paramBitmap);
    ContentResolver localContentResolver = this.l.a.getContentResolver();
    Uri localUri1 = Uri.fromFile(paramFile);
    hxp localhxp = new hxp();
    try
    {
      localhxp.a(localContentResolver.openInputStream(localUri1));
      label52:
      int m = hxp.f;
      hya localhya = localhxp.a(m, localhxp.d(m));
      int[] arrayOfInt1;
      Integer localInteger;
      label160:
      short s;
      label168:
      int n;
      double[] arrayOfDouble;
      ContentValues localContentValues;
      String str3;
      if ((localhya != null) && (localhya.g != null) && ((localhya.g instanceof long[])))
      {
        long[] arrayOfLong = (long[])localhya.g;
        int[] arrayOfInt2 = new int[arrayOfLong.length];
        for (int i3 = 0; i3 < arrayOfLong.length; i3++) {
          arrayOfInt2[i3] = ((int)arrayOfLong[i3]);
        }
        arrayOfInt1 = arrayOfInt2;
        if ((arrayOfInt1 != null) && (arrayOfInt1.length > 0)) {
          break label486;
        }
        localInteger = null;
        if (localInteger != null) {
          break label498;
        }
        s = 0;
        n = hxp.a(s);
        long l1 = efj.a(localContentResolver, paramUri);
        String str1 = paramFile.getName();
        String str2 = paramFile.getName();
        int i1 = str2.lastIndexOf('.');
        if (i1 != -1) {
          str2 = str2.substring(0, i1);
        }
        arrayOfDouble = localhxp.a();
        localContentValues = new ContentValues(5);
        localContentValues.put("title", str2);
        localContentValues.put("_display_name", str1);
        localContentValues.put("datetaken", Long.valueOf(l1 + 5L));
        localContentValues.put("date_modified", Long.valueOf(System.currentTimeMillis() / 1000L));
        str3 = String.valueOf(this.e.name().toLowerCase());
        if (str3.length() == 0) {
          break label508;
        }
      }
      label486:
      label498:
      label508:
      for (String str4 = "image/".concat(str3);; str4 = new String("image/"))
      {
        localContentValues.put("mime_type", str4);
        localContentValues.put("orientation", Integer.valueOf(n));
        if (arrayOfDouble != null)
        {
          localContentValues.put("latitude", Double.valueOf(arrayOfDouble[0]));
          localContentValues.put("longitude", Double.valueOf(arrayOfDouble[1]));
        }
        localContentValues.put("_data", paramFile.getAbsolutePath());
        this.c = efj.a(localContentResolver, localContentValues, false);
        Cursor localCursor = localContentResolver.query(this.c, new String[] { "bucket_id" }, null, null, null);
        if ((localCursor != null) && (localCursor.moveToFirst())) {
          this.d = localCursor.getInt(0);
        }
        localCursor.close();
        if (this.c != null) {
          break label523;
        }
        throw new FileNotFoundException();
        arrayOfInt1 = null;
        break;
        localInteger = Integer.valueOf(arrayOfInt1[0]);
        break label160;
        s = localInteger.shortValue();
        break label168;
      }
      label523:
      Context localContext;
      Uri localUri2;
      int i2;
      Bitmap localBitmap1;
      Object localObject;
      if (efj.c(this.c))
      {
        localContext = this.l.a;
        localUri2 = this.c;
        if (efj.PX == 0) {
          efj.PX = localContext.getResources().getDimensionPixelSize(efj.PY);
        }
        i2 = efj.PX;
        localBitmap1 = efj.a(localContext, localUri2, null);
        if (localBitmap1 != null) {
          break label602;
        }
        localObject = null;
      }
      for (;;)
      {
        if (localObject != null) {
          ((Bitmap)localObject).recycle();
        }
        return;
        label602:
        localObject = efj.a(localContext.getContentResolver(), localUri2, localBitmap1);
        if ((((Bitmap)localObject).getWidth() != i2) || (((Bitmap)localObject).getHeight() != i2))
        {
          Bitmap localBitmap2 = mfo.a((Bitmap)localObject, i2, i2, null);
          if (localBitmap2 != localObject)
          {
            ((Bitmap)localObject).recycle();
            localObject = localBitmap2;
          }
        }
      }
    }
    catch (IOException localIOException)
    {
      break label52;
    }
  }
  
  private static void a(InputStream paramInputStream, OutputStream paramOutputStream, Bitmap paramBitmap)
  {
    hxp localhxp = new hxp();
    try
    {
      localhxp.a(paramInputStream);
      localhxp.v.b = null;
      int m = hxp.a;
      localInteger1 = Integer.valueOf(paramBitmap.getWidth());
      localhya1 = localhxp.a(m, localhxp.d(m));
      if (localhya1 == null)
      {
        int n = hxp.b;
        localInteger2 = Integer.valueOf(paramBitmap.getHeight());
        localhya2 = localhxp.a(n, localhxp.d(n));
        if (localhya2 != null) {
          break label261;
        }
        i1 = hxp.i;
        long l1 = System.currentTimeMillis();
        TimeZone localTimeZone = TimeZone.getDefault();
        if ((i1 == hxp.i) || (i1 == hxp.p) || (i1 == hxp.o))
        {
          localhxp.x.setTimeZone(localTimeZone);
          str = localhxp.x.format(Long.valueOf(l1));
          i2 = hxp.b(i1);
          i3 = localhxp.b().get(i1);
          if ((i3 != 0) && (str != null)) {
            break label272;
          }
          localhya3 = null;
          if (localhya3 != null) {
            break label354;
          }
        }
        int i4 = hxp.f;
        localShort = Short.valueOf((short)1);
        localhya4 = localhxp.a(i4, localhxp.d(i4));
        if (localhya4 != null) {
          break label367;
        }
        localhxp.a(paramBitmap, paramOutputStream);
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Integer localInteger1;
        hya localhya1;
        Integer localInteger2;
        hya localhya2;
        int i1;
        String str;
        int i2;
        int i3;
        hya localhya3;
        Short localShort;
        hya localhya4;
        if (Log.isLoggable("DefaultEditorProvider", 6))
        {
          Log.e("DefaultEditorProvider", "Failed to read Exif data.", localIOException);
          continue;
          localhya1.a(localInteger1);
          continue;
          label261:
          localhya2.a(localInteger2);
          continue;
          label272:
          short s = hxp.f(i3);
          int i5 = hxp.g(i3);
          if (i5 != 0) {}
          for (boolean bool = true;; bool = false)
          {
            if (hxp.c(i3, i2)) {
              break label316;
            }
            localhya3 = null;
            break;
          }
          label316:
          localhya3 = new hya(hxp.a(i1), s, i5, i2, bool);
          if (!localhya3.a(str))
          {
            localhya3 = null;
            continue;
            label354:
            localhxp.v.a(localhya3);
            continue;
            label367:
            localhya4.a(localShort);
          }
        }
      }
    }
  }
  
  /* Error */
  private final boolean a(File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 395	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 32	bqg:l	Lbpz;
    //   9: getfield 90	bpz:a	Landroid/content/Context;
    //   12: invokevirtual 96	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   15: astore_3
    //   16: aload_3
    //   17: aload_2
    //   18: invokevirtual 365	android/content/ContentResolver:openOutputStream	(Landroid/net/Uri;)Ljava/io/OutputStream;
    //   21: astore 8
    //   23: aload 8
    //   25: ifnull +8 -> 33
    //   28: aload 8
    //   30: invokevirtual 379	java/io/OutputStream:close	()V
    //   33: aload_1
    //   34: invokevirtual 210	java/io/File:exists	()Z
    //   37: ifeq +8 -> 45
    //   40: aload_1
    //   41: invokevirtual 628	java/io/File:delete	()Z
    //   44: pop
    //   45: iconst_1
    //   46: ireturn
    //   47: astore 6
    //   49: aload_1
    //   50: invokevirtual 210	java/io/File:exists	()Z
    //   53: ifeq +8 -> 61
    //   56: aload_1
    //   57: invokevirtual 628	java/io/File:delete	()Z
    //   60: pop
    //   61: iconst_0
    //   62: ireturn
    //   63: astore 4
    //   65: aload_1
    //   66: invokevirtual 210	java/io/File:exists	()Z
    //   69: ifeq +8 -> 77
    //   72: aload_1
    //   73: invokevirtual 628	java/io/File:delete	()Z
    //   76: pop
    //   77: aload 4
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	bqg
    //   0	80	1	paramFile	File
    //   4	14	2	localUri	Uri
    //   15	2	3	localContentResolver	ContentResolver
    //   63	15	4	localObject	Object
    //   47	1	6	localFileNotFoundException	FileNotFoundException
    //   21	8	8	localOutputStream	OutputStream
    // Exception table:
    //   from	to	target	type
    //   16	23	47	java/io/FileNotFoundException
    //   16	23	63	finally
  }
  
  protected final void onPreExecute()
  {
    Bundle localBundle = this.l.d.getExtras();
    if (localBundle != null) {}
    for (boolean bool = localBundle.getBoolean("set-as-wallpaper");; bool = false)
    {
      this.g = bool;
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqg
 * JD-Core Version:    0.7.0.1
 */