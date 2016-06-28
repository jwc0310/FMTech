import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.libraries.social.gallery3d.common.FileCache;
import com.google.android.libraries.social.gallery3d.common.FileCache.FileEntry;
import com.google.android.libraries.social.picasalegacy.PicasaStoreFacade;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public final class jss
  implements jtd
{
  private final Context a;
  private File b;
  private iaj c;
  private FileCache d;
  private boolean e = false;
  private jti f;
  private final WeakHashMap<ParcelFileDescriptor, Socket> g = new WeakHashMap();
  private final ServerSocket h;
  private final Method i;
  private final BroadcastReceiver j;
  private final jtc k;
  private final ibm l = new ibm();
  private jta<jsy> m = new jsu(this);
  private jta<byte[]> n = new jsv(this);
  
  public jss(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    this.k = new jtc(this);
    try
    {
      this.h = new ServerSocket();
      this.h.bind(null, 5);
    }
    catch (IOException localIOException)
    {
      Method localMethod2;
      label112:
      IntentFilter localIntentFilter;
      throw new RuntimeException("cannot create server socket", localIOException);
    }
    try
    {
      localMethod2 = ParcelFileDescriptor.class.getMethod("createPipe", new Class[0]);
      localMethod1 = localMethod2;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localMethod1 = null;
      break label112;
    }
    this.i = localMethod1;
    this.j = new jst(this);
    localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
    localIntentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
    localIntentFilter.addDataScheme("file");
    this.a.registerReceiver(this.j, localIntentFilter);
  }
  
  public static long a(Uri paramUri)
  {
    try
    {
      long l1 = Long.parseLong((String)paramUri.getPathSegments().get(1));
      return l1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str = String.valueOf(paramUri);
      new StringBuilder(20 + String.valueOf(str).length()).append("cannot get id from: ").append(str);
    }
    return -1L;
  }
  
  private final <T> ParcelFileDescriptor a(T paramT, jta<T> paramjta, boolean paramBoolean)
  {
    try
    {
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor = g();
      ibn localibn = new ibn(this, paramBoolean, paramjta, arrayOfParcelFileDescriptor, paramT);
      ibm localibm = this.l;
      ibr localibr = new ibr(localibm, localibn, null);
      localibm.c.execute(localibr);
      ParcelFileDescriptor localParcelFileDescriptor = arrayOfParcelFileDescriptor[0];
      return localParcelFileDescriptor;
    }
    catch (IOException localIOException)
    {
      throw new FileNotFoundException("failure making pipe");
    }
  }
  
  public static String a(String paramString, int paramInt, boolean paramBoolean)
  {
    if (jrx.b(paramString))
    {
      String str = jrx.a(paramString);
      boolean bool1 = str.contains("I");
      boolean bool2 = str.contains("k");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append('s').append(paramInt);
      localStringBuilder.append("-no");
      if (paramBoolean) {
        localStringBuilder.append("-c");
      }
      if (bool1) {
        localStringBuilder.append("-I");
      }
      if (bool2) {
        localStringBuilder.append("-k");
      }
      return jrx.a(localStringBuilder.toString(), paramString).toString();
    }
    return jsl.a(paramInt, paramString);
  }
  
  private final jsy a(long paramLong, int paramInt, String paramString)
  {
    return a(a(paramLong, paramInt), a(paramString));
  }
  
  private final jsy a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    for (;;)
    {
      try
      {
        iaj localiaj = d();
        if (localiaj == null) {
          return null;
        }
        long l1 = iaw.a(paramArrayOfByte1);
        byte[] arrayOfByte;
        try
        {
          localiaj.g.a = l1;
          localiaj.g.b = null;
          if (localiaj.a(localiaj.g))
          {
            arrayOfByte = localiaj.g.b;
            if (arrayOfByte == null) {
              continue;
            }
            if (paramArrayOfByte2 != null) {
              continue;
            }
            int i21 = arrayOfByte.length;
            int i22 = paramArrayOfByte1.length;
            i3 = 0;
            if (i21 < i22)
            {
              if (i3 == 0) {
                continue;
              }
              jsy localjsy = new jsy((0xFF & arrayOfByte[paramArrayOfByte1.length]) + ((0xFF & arrayOfByte[(1 + paramArrayOfByte1.length)]) << 8), 0xFF & arrayOfByte[(2 + paramArrayOfByte1.length)], arrayOfByte);
              return localjsy;
            }
          }
          else
          {
            arrayOfByte = null;
            continue;
          }
          i23 = paramArrayOfByte1.length;
        }
        finally {}
        int i23;
        int i24 = 0;
        if (i24 < i23)
        {
          int i25 = paramArrayOfByte1[i24];
          int i26 = arrayOfByte[i24];
          i3 = 0;
          if (i25 != i26) {
            continue;
          }
          i24++;
          continue;
          int i1 = 3 + (paramArrayOfByte1.length + paramArrayOfByte2.length);
          int i2 = arrayOfByte.length;
          i3 = 0;
          if (i2 < i1) {
            continue;
          }
          if (i1 <= 32767) {
            break label418;
          }
          i4 = 1;
          i3 = 0;
          if (i4 != 0) {
            continue;
          }
          int i5 = paramArrayOfByte1.length;
          int i6 = 0;
          if (i6 < i5)
          {
            int i7 = paramArrayOfByte1[i6];
            int i8 = arrayOfByte[i6];
            i3 = 0;
            if (i7 != i8) {
              continue;
            }
            i6++;
            continue;
          }
          int i9 = paramArrayOfByte1.length;
          int i10 = i9 + 1;
          int i11 = arrayOfByte[i9];
          int i12 = (byte)i1;
          i3 = 0;
          if (i11 != i12) {
            continue;
          }
          int i13 = i10 + 1;
          int i14 = arrayOfByte[i10];
          int i15 = (byte)(i1 >>> 8);
          i3 = 0;
          if (i14 != i15) {
            continue;
          }
          int i16 = i13 + 1;
          int i17 = paramArrayOfByte2.length;
          int i18 = 0;
          if (i18 < i17)
          {
            int i19 = paramArrayOfByte2[i18];
            int i20 = arrayOfByte[(i18 + i16)];
            i3 = 0;
            if (i19 != i20) {
              continue;
            }
            i18++;
            continue;
          }
        }
        int i3 = 1;
        continue;
        return null;
      }
      catch (Throwable localThrowable)
      {
        return null;
      }
      label418:
      int i4 = 0;
    }
  }
  
  private final void a(long paramLong, int paramInt1, String paramString, int paramInt2, byte[] paramArrayOfByte)
  {
    a(a(paramLong, paramInt1), a(paramString), 0, paramArrayOfByte);
  }
  
  private final boolean a(String paramString, int paramInt)
  {
    if (this.f == null)
    {
      String str1 = String.valueOf(c());
      String str2 = String.valueOf("cache_versions.info");
      this.f = new jti(1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "/" + str2);
    }
    Integer localInteger = (Integer)this.f.a.get(paramString);
    int i1;
    jti localjti;
    if (localInteger == null)
    {
      i1 = 0;
      if (i1 == paramInt) {
        break label164;
      }
      localjti = this.f;
      if (paramInt == 0) {
        break label158;
      }
    }
    label158:
    for (boolean bool = true;; bool = false)
    {
      iaw.a(bool);
      localjti.a.put(paramString, Integer.valueOf(paramInt));
      this.f.a();
      return true;
      i1 = localInteger.intValue();
      break;
    }
    label164:
    return false;
  }
  
  private static byte[] a(long paramLong, int paramInt)
  {
    byte[] arrayOfByte = new byte[9];
    for (int i1 = 0; i1 < 8; i1++) {
      arrayOfByte[i1] = ((byte)(int)(paramLong >>> (i1 << 3)));
    }
    arrayOfByte[8] = ((byte)paramInt);
    return arrayOfByte;
  }
  
  static byte[] a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.startsWith("https://")) {
      paramString = paramString.substring(8);
    }
    for (;;)
    {
      return paramString.getBytes();
      if (paramString.startsWith("http://")) {
        paramString = paramString.substring(7);
      }
    }
  }
  
  /* Error */
  private File c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 355	jss:b	Ljava/io/File;
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: getfield 355	jss:b	Ljava/io/File;
    //   13: astore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_2
    //   17: areturn
    //   18: aload_0
    //   19: invokestatic 359	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:b	()Ljava/io/File;
    //   22: putfield 355	jss:b	Ljava/io/File;
    //   25: aload_0
    //   26: iconst_0
    //   27: putfield 47	jss:e	Z
    //   30: aload_0
    //   31: getfield 355	jss:b	Ljava/io/File;
    //   34: ifnonnull +110 -> 144
    //   37: aload_0
    //   38: aload_0
    //   39: getfield 77	jss:a	Landroid/content/Context;
    //   42: invokevirtual 362	android/content/Context:getCacheDir	()Ljava/io/File;
    //   45: putfield 355	jss:b	Ljava/io/File;
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield 47	jss:e	Z
    //   53: new 364	java/io/File
    //   56: dup
    //   57: aload_0
    //   58: getfield 355	jss:b	Ljava/io/File;
    //   61: ldc_w 366
    //   64: invokespecial 369	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   67: astore_3
    //   68: aload_3
    //   69: invokevirtual 373	java/io/File:exists	()Z
    //   72: ifne +8 -> 80
    //   75: aload_3
    //   76: invokevirtual 376	java/io/File:createNewFile	()Z
    //   79: pop
    //   80: aload_0
    //   81: getfield 355	jss:b	Ljava/io/File;
    //   84: ifnonnull +60 -> 144
    //   87: new 378	java/lang/NullPointerException
    //   90: dup
    //   91: invokespecial 379	java/lang/NullPointerException:<init>	()V
    //   94: athrow
    //   95: astore_1
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_1
    //   99: athrow
    //   100: astore 4
    //   102: aload_0
    //   103: getfield 355	jss:b	Ljava/io/File;
    //   106: invokestatic 164	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   109: astore 5
    //   111: new 166	java/lang/StringBuilder
    //   114: dup
    //   115: bipush 29
    //   117: aload 5
    //   119: invokestatic 164	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   122: invokevirtual 170	java/lang/String:length	()I
    //   125: iadd
    //   126: invokespecial 173	java/lang/StringBuilder:<init>	(I)V
    //   129: ldc_w 381
    //   132: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: aload 5
    //   137: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: goto -61 -> 80
    //   144: aload_0
    //   145: getfield 355	jss:b	Ljava/io/File;
    //   148: astore_2
    //   149: goto -135 -> 14
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	this	jss
    //   95	4	1	localObject	Object
    //   13	136	2	localFile1	File
    //   67	9	3	localFile2	File
    //   100	1	4	localIOException	IOException
    //   109	27	5	str	String
    // Exception table:
    //   from	to	target	type
    //   2	14	95	finally
    //   18	53	95	finally
    //   53	80	95	finally
    //   80	95	95	finally
    //   102	141	95	finally
    //   144	149	95	finally
    //   53	80	100	java/io/IOException
  }
  
  private final iaj d()
  {
    for (;;)
    {
      try
      {
        File localFile;
        if (this.c == null) {
          localFile = c();
        }
        try
        {
          String str1 = String.valueOf(localFile.getAbsolutePath());
          String str2 = String.valueOf("picasa-cache");
          str3 = 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "/" + str2;
          if (a("picasa-image-cache-version", 5))
          {
            iaj.a(String.valueOf(str3).concat(".idx"));
            iaj.a(String.valueOf(str3).concat(".0"));
            iaj.a(String.valueOf(str3).concat(".1"));
          }
          if (!this.e) {
            continue;
          }
          this.c = new iaj(str3, 1250, 52428800, false, 5);
        }
        catch (Throwable localThrowable)
        {
          String str3;
          iaj localiaj;
          continue;
        }
        localiaj = this.c;
        return localiaj;
      }
      finally {}
      this.c = new iaj(str3, 5000, 209715200, false, 5);
    }
  }
  
  private final FileCache e()
  {
    for (;;)
    {
      try
      {
        FileCache localFileCache1 = this.d;
        if (localFileCache1 == null) {}
        try
        {
          localFile = new File(c(), "download-cache");
          if (a("picasa-download-cache-version", 1)) {
            FileCache.a(this.a, localFile, "picasa-downloads");
          }
          if (this.e) {
            continue;
          }
          this.d = new FileCache(this.a, localFile, "picasa-downloads", 104857600L);
        }
        catch (Throwable localThrowable)
        {
          File localFile;
          FileCache localFileCache2;
          continue;
        }
        localFileCache2 = this.d;
        return localFileCache2;
      }
      finally {}
      this.d = new FileCache(this.a, localFile, "picasa-downloads", 20971520L);
    }
  }
  
  private final ParcelFileDescriptor[] f()
  {
    Socket[] arrayOfSocket = new Socket[2];
    try
    {
      arrayOfSocket[0] = new Socket(this.h.getInetAddress(), this.h.getLocalPort());
      arrayOfSocket[1] = this.h.accept();
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor = new ParcelFileDescriptor[2];
      arrayOfParcelFileDescriptor[0] = ParcelFileDescriptor.fromSocket(arrayOfSocket[0]);
      arrayOfParcelFileDescriptor[1] = ParcelFileDescriptor.fromSocket(arrayOfSocket[1]);
      this.g.put(arrayOfParcelFileDescriptor[0], arrayOfSocket[0]);
      this.g.put(arrayOfParcelFileDescriptor[1], arrayOfSocket[1]);
      return arrayOfParcelFileDescriptor;
    }
    finally {}
  }
  
  private final ParcelFileDescriptor[] g()
  {
    if (this.i == null) {
      return f();
    }
    try
    {
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor = (ParcelFileDescriptor[])this.i.invoke(null, new Object[0]);
      return arrayOfParcelFileDescriptor;
    }
    catch (Throwable localThrowable)
    {
      Log.e("gp.PicasaStore", "fail to create pipe", localThrowable);
      if ((localThrowable instanceof IOException)) {
        throw ((IOException)localThrowable);
      }
      throw new IOException(localThrowable.getMessage());
    }
  }
  
  public final ParcelFileDescriptor a(long paramLong, String paramString, boolean paramBoolean)
  {
    try
    {
      File localFile = PicasaStoreFacade.a(paramLong, ".full");
      if (localFile != null)
      {
        ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(localFile, 268435456);
        return localParcelFileDescriptor;
      }
    }
    catch (Throwable localThrowable)
    {
      if (paramString == null) {
        throw new FileNotFoundException();
      }
    }
    return b(paramLong, paramString, paramBoolean);
  }
  
  public final ParcelFileDescriptor a(Uri paramUri, String paramString)
  {
    if (paramString.contains("w"))
    {
      String str6 = String.valueOf(paramString);
      if (str6.length() != 0) {}
      for (String str7 = "invalid mode: ".concat(str6);; str7 = new String("invalid mode: ")) {
        throw new FileNotFoundException(str7);
      }
    }
    long l1 = a(paramUri);
    String str1 = paramUri.getQueryParameter("content_url");
    jsy localjsy = a(l1, 2, str1);
    if (localjsy != null) {
      return a(localjsy, this.m, false);
    }
    if (str1 == null) {
      throw new FileNotFoundException(iaw.b(paramUri.toString()));
    }
    File localFile1 = PicasaStoreFacade.b();
    File localFile2;
    if (localFile1 == null) {
      localFile2 = null;
    }
    for (;;)
    {
      label141:
      byte[] arrayOfByte;
      FileInputStream localFileInputStream;
      if (localFile2.isFile())
      {
        if (localFile2 == null) {
          break label479;
        }
        if (localFile2.length() < 524288L)
        {
          arrayOfByte = new byte[(int)localFile2.length()];
          localFileInputStream = new FileInputStream(localFile2);
        }
      }
      else
      {
        try
        {
          int i1 = localFileInputStream.read(arrayOfByte, 0, arrayOfByte.length);
          int i2 = 0;
          for (;;)
          {
            if ((i1 >= 0) && (i2 < arrayOfByte.length))
            {
              i2 += i1;
              int i3 = localFileInputStream.read(arrayOfByte, i2, arrayOfByte.length - i2);
              i1 = i3;
              continue;
              String str2 = String.valueOf("picasa_covers/");
              String str3 = String.valueOf(l1 + '_' + iaw.a(str1));
              localFile2 = new File(localFile1, 0 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(".thumb").length() + str2 + str3 + ".thumb");
              break;
              localFile2 = null;
              break label141;
            }
          }
          a(l1, 2, str1, 0, arrayOfByte);
          ParcelFileDescriptor localParcelFileDescriptor2 = a(arrayOfByte, this.n, false);
          return localParcelFileDescriptor2;
        }
        catch (IOException localIOException)
        {
          String str4 = String.valueOf(iaw.b(paramUri.toString()));
          String str5 = String.valueOf(localIOException);
          throw new FileNotFoundException(1 + String.valueOf(str4).length() + String.valueOf(str5).length() + str4 + ":" + str5);
        }
        finally
        {
          iaw.a(localFileInputStream);
        }
      }
    }
    return ParcelFileDescriptor.open(localFile2, 268435456);
    try
    {
      label479:
      ParcelFileDescriptor localParcelFileDescriptor1 = a(null, new jsx(this, l1, a(str1, jrw.b, true), new jsw(this, l1, 2, 0, str1)), true);
      return localParcelFileDescriptor1;
    }
    catch (Throwable localThrowable)
    {
      throw new FileNotFoundException();
    }
  }
  
  final void a()
  {
    try
    {
      this.b = null;
      if (this.c != null)
      {
        iaw.a(this.c);
        this.c = null;
      }
      if (this.d != null)
      {
        iaw.a(this.d);
        this.d = null;
      }
      this.f = null;
      return;
    }
    finally {}
  }
  
  public final void a(String paramString, File paramFile)
  {
    FileCache localFileCache;
    FileCache.FileEntry localFileEntry1;
    try
    {
      localFileCache = e();
      if (localFileCache == null) {
        break label259;
      }
      if (!localFileCache.c) {
        localFileCache.a();
      }
      iaw.a(localFileCache.a(paramFile));
      localFileEntry1 = new FileCache.FileEntry();
      localFileEntry1.hashCode = iaw.a(paramString);
      localFileEntry1.contentUrl = paramString;
      localFileEntry1.filename = paramFile.getName();
      localFileEntry1.size = paramFile.length();
      localFileEntry1.lastAccess = System.currentTimeMillis();
      if (localFileEntry1.size >= localFileCache.b)
      {
        paramFile.delete();
        long l1 = localFileEntry1.size;
        throw new IllegalArgumentException(36 + "file too large: " + l1);
      }
    }
    finally {}
    label259:
    for (;;)
    {
      try
      {
        FileCache.FileEntry localFileEntry2 = localFileCache.b(paramString);
        if (localFileEntry2 != null)
        {
          paramFile.delete();
          localFileEntry1.filename = localFileEntry2.filename;
          localFileEntry1.size = localFileEntry2.size;
          FileCache.FileEntry.a.a(localFileCache.e.getWritableDatabase(), localFileEntry1);
          if (localFileCache.d > localFileCache.b) {
            localFileCache.a(16);
          }
          return;
        }
        localFileCache.d += localFileEntry1.size;
        continue;
        paramFile.delete();
      }
      finally {}
    }
  }
  
  final void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3)
  {
    int i1;
    int i2;
    if (paramArrayOfByte2 == null)
    {
      i1 = 0;
      i2 = 3 + (i1 + paramArrayOfByte1.length);
      int i3 = 0;
      if (i2 > 32767) {
        i3 = 1;
      }
      if (i3 == 0) {
        break label43;
      }
    }
    label43:
    iaj localiaj;
    byte[] arrayOfByte;
    long l1;
    for (;;)
    {
      return;
      i1 = paramArrayOfByte2.length;
      break;
      try
      {
        localiaj = d();
        if (localiaj != null)
        {
          arrayOfByte = new byte[i2 + paramArrayOfByte3.length];
          System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramArrayOfByte1.length);
          arrayOfByte[paramArrayOfByte1.length] = ((byte)i2);
          arrayOfByte[(1 + paramArrayOfByte1.length)] = ((byte)(i2 >>> 8));
          arrayOfByte[(2 + paramArrayOfByte1.length)] = ((byte)paramInt);
          if (i1 > 0) {
            System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, 3 + paramArrayOfByte1.length, i1);
          }
          System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, i2, paramArrayOfByte3.length);
          l1 = iaw.a(paramArrayOfByte1);
          try
          {
            if (24 + arrayOfByte.length > localiaj.b) {
              throw new RuntimeException("blob is too large!");
            }
          }
          finally {}
          if (20 + localiaj.d + arrayOfByte.length > localiaj.b) {
            break label215;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        return;
      }
    }
    if (localiaj.c << 1 >= localiaj.a) {
      label215:
      localiaj.a();
    }
    if (!localiaj.a(l1, localiaj.e))
    {
      localiaj.c = (1 + localiaj.c);
      iaj.a(localiaj.f, 16, localiaj.c);
    }
    localiaj.a(l1, arrayOfByte, arrayOfByte.length);
    localiaj.b();
  }
  
  public final ParcelFileDescriptor b(long paramLong, String paramString, boolean paramBoolean)
  {
    try
    {
      FileCache localFileCache = e();
      if (localFileCache == null) {
        break label50;
      }
      iaq localiaq = localFileCache.a(paramString);
      if (localiaq == null) {
        break label50;
      }
      ParcelFileDescriptor localParcelFileDescriptor2 = ParcelFileDescriptor.open(localiaq.b, 268435456);
      localObject2 = localParcelFileDescriptor2;
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        label50:
        Object localObject2 = null;
        if (paramBoolean) {
          continue;
        }
        try
        {
          ParcelFileDescriptor localParcelFileDescriptor1 = a(null, new jsz(this, paramLong, this.k.a(paramString)), true);
          localObject2 = localParcelFileDescriptor1;
        }
        catch (Throwable localThrowable2)
        {
          throw new FileNotFoundException();
        }
      }
    }
    finally {}
    return localObject2;
  }
  
  public final File b()
  {
    try
    {
      FileCache localFileCache = e();
      if (localFileCache == null) {
        return null;
      }
      File localFile = File.createTempFile("download", ".tmp", localFileCache.a);
      return localFile;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
  }
  
  public final ParcelFileDescriptor c(long paramLong, String paramString, boolean paramBoolean)
  {
    jsy localjsy = a(paramLong, 0, paramString);
    ParcelFileDescriptor localParcelFileDescriptor1;
    if (localjsy != null) {
      localParcelFileDescriptor1 = a(localjsy, this.m, false);
    }
    do
    {
      return localParcelFileDescriptor1;
      try
      {
        File localFile = PicasaStoreFacade.a(paramLong, ".screen");
        if (localFile != null)
        {
          ParcelFileDescriptor localParcelFileDescriptor3 = ParcelFileDescriptor.open(localFile, 268435456);
          return localParcelFileDescriptor3;
        }
      }
      catch (Throwable localThrowable1)
      {
        localParcelFileDescriptor1 = null;
      }
    } while (paramBoolean);
    if (paramString == null) {
      throw new FileNotFoundException();
    }
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor2 = a(null, new jsx(this, paramLong, paramString, new jsw(this, paramLong, 0, 0, paramString)), true);
      return localParcelFileDescriptor2;
    }
    catch (Throwable localThrowable2)
    {
      throw new FileNotFoundException();
    }
  }
  
  public final ParcelFileDescriptor d(long paramLong, String paramString, boolean paramBoolean)
  {
    jsy localjsy1 = a(paramLong, 1, paramString);
    if ((localjsy1 != null) && ((0x1 & localjsy1.b) == 0)) {
      return a(localjsy1, this.m, false);
    }
    try
    {
      File localFile = PicasaStoreFacade.a(paramLong, ".screen");
      if (localFile != null)
      {
        String str = localFile.getAbsolutePath();
        BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
        localOptions2.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, localOptions2);
        localOptions2.inSampleSize = efj.b(jrw.b / Math.min(localOptions2.outWidth, localOptions2.outHeight));
        localOptions2.inJustDecodeBounds = false;
        Bitmap localBitmap2 = BitmapFactory.decodeFile(str, localOptions2);
        if (localBitmap2 != null)
        {
          byte[] arrayOfByte2 = efj.c(efj.a(localBitmap2, jrw.b, true), 95);
          a(paramLong, 1, paramString, 0, arrayOfByte2);
          return a(arrayOfByte2, this.n, false);
        }
        long l1 = localFile.length();
        Log.e("gp.PicasaStore", 53 + String.valueOf(str).length() + "invalid prefetch file: " + str + ", length: " + l1);
        localFile.delete();
      }
    }
    catch (Throwable localThrowable1)
    {
      label228:
      jsy localjsy2;
      BitmapFactory.Options localOptions1;
      Bitmap localBitmap1;
      byte[] arrayOfByte1;
      break label228;
    }
    localjsy2 = a(paramLong, 0, paramString);
    if (localjsy2 != null)
    {
      localOptions1 = new BitmapFactory.Options();
      localOptions1.inJustDecodeBounds = true;
      BitmapFactory.decodeByteArray(localjsy2.c, localjsy2.a, localjsy2.c.length - localjsy2.a);
      localOptions1.inSampleSize = efj.b(jrw.b / Math.min(localOptions1.outWidth, localOptions1.outHeight));
      localOptions1.inJustDecodeBounds = false;
      localBitmap1 = BitmapFactory.decodeByteArray(localjsy2.c, localjsy2.a, localjsy2.c.length - localjsy2.a);
      if (localBitmap1 != null)
      {
        arrayOfByte1 = efj.c(efj.a(localBitmap1, jrw.b, true), 95);
        a(paramLong, 1, paramString, 0, arrayOfByte1);
        return a(arrayOfByte1, this.n, false);
      }
    }
    if (localjsy1 != null) {
      return a(localjsy1, this.m, false);
    }
    if (paramBoolean) {
      return null;
    }
    if (paramString == null) {
      throw new FileNotFoundException();
    }
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = a(null, new jsx(this, paramLong, paramString, new jsw(this, paramLong, 1, 1, paramString)), true);
      return localParcelFileDescriptor;
    }
    catch (Throwable localThrowable2)
    {
      throw new FileNotFoundException();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jss
 * JD-Core Version:    0.7.0.1
 */