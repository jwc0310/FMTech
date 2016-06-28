import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public final class jud
  implements iud
{
  final Context a;
  itz b;
  int c;
  String d;
  gzj e;
  final ArrayList<ipf> f = new ArrayList();
  final Map<ipf, jub> g = new kl();
  String h;
  
  public jud(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private final String a(Context paramContext)
  {
    jua localjua;
    if (this.h == null)
    {
      localjua = new jua(paramContext, this.c);
      localjua.i();
    }
    try
    {
      localjua.d("MediaUploadManagerImpl");
      boolean bool = localjua.x;
      qat localqat = null;
      if (bool) {
        localqat = localjua.w;
      }
      this.h = ((mqq)localqat).a.a.c;
      return this.h;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  private jub a(Context paramContext, ipf paramipf, int paramInt)
  {
    try
    {
      String str = a(paramContext);
      if (str == null) {
        return null;
      }
      itz localitz = this.b;
      iup localiup = new iup();
      localiup.a = paramipf.d;
      localiup.d = str;
      localiup.f = false;
      ity locality = localitz.a(localiup.a());
      jub localjub = new jub(locality.d, locality.b);
      return localjub;
    }
    catch (itm localitm)
    {
      Log.e("MediaUploadManagerImpl", "Call to MediaUploader.upload failed", localitm);
      return null;
    }
    catch (itt localitt)
    {
      for (;;)
      {
        Log.e("MediaUploadManagerImpl", "Call to MediaUploader.upload failed", localitt);
        if (paramInt >= 2) {
          break;
        }
        a(paramipf, "Retrying upload.");
        paramInt++;
      }
    }
    return null;
  }
  
  private final void a(ipf paramipf, String paramString)
  {
    if (Log.isLoggable("MediaUploadManagerImpl", 4)) {}
    for (;;)
    {
      synchronized (this.g)
      {
        jub localjub = (jub)this.g.get(paramipf);
        StringBuilder localStringBuilder = new StringBuilder(paramString);
        if (paramipf != null)
        {
          if (paramipf.d == null) {
            break label133;
          }
          i = 1;
          if (i != 0) {
            localStringBuilder.append("\n  ").append(paramipf.d);
          }
        }
        if (localjub != null)
        {
          localStringBuilder.append(':').append(localjub.a);
          if (!TextUtils.isEmpty(localjub.b)) {
            localStringBuilder.append("\n  ").append(localjub.b);
          }
        }
        return;
      }
      label133:
      int i = 0;
    }
  }
  
  private final Long c(ipf paramipf)
  {
    if (paramipf == null) {
      return Long.valueOf(0L);
    }
    if (paramipf.b.a != 0L)
    {
      a(paramipf, "Photo already has photoId");
      return Long.valueOf(paramipf.b.a);
    }
    if (paramipf.d == null)
    {
      a(paramipf, "No local Uri to upload");
      return Long.valueOf(0L);
    }
    synchronized (this.g)
    {
      jub localjub = (jub)this.g.get(paramipf);
      if (localjub != null)
      {
        a(paramipf, "Photo already uploaded");
        Long localLong = Long.valueOf(Long.parseLong(localjub.a));
        return localLong;
      }
    }
    return Long.valueOf(0L);
  }
  
  /* Error */
  private final String d(ipf paramipf)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	jud:a	Landroid/content/Context;
    //   4: invokevirtual 206	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   7: astore_2
    //   8: aload_1
    //   9: getfield 208	ipf:g	Ljava/lang/String;
    //   12: invokestatic 172	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   15: ifne +12 -> 27
    //   18: aload_1
    //   19: getfield 208	ipf:g	Ljava/lang/String;
    //   22: astore 11
    //   24: aload 11
    //   26: areturn
    //   27: aload_1
    //   28: getfield 101	ipf:d	Landroid/net/Uri;
    //   31: astore_3
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual 214	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   37: astore 18
    //   39: aload 18
    //   41: astore 5
    //   43: aload 5
    //   45: invokestatic 219	irc:b	(Ljava/io/InputStream;)Lirc;
    //   48: invokevirtual 222	irc:a	()Ljava/lang/String;
    //   51: astore 19
    //   53: aload 19
    //   55: astore 11
    //   57: aload 5
    //   59: ifnull -35 -> 24
    //   62: aload 5
    //   64: invokevirtual 227	java/io/InputStream:close	()V
    //   67: aload 11
    //   69: areturn
    //   70: astore 20
    //   72: ldc 57
    //   74: ldc 229
    //   76: aload 20
    //   78: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   81: pop
    //   82: aload 11
    //   84: areturn
    //   85: astore 14
    //   87: aconst_null
    //   88: astore 5
    //   90: ldc 57
    //   92: ldc 231
    //   94: aload 14
    //   96: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   99: pop
    //   100: aconst_null
    //   101: astore 11
    //   103: aload 5
    //   105: ifnull -81 -> 24
    //   108: aload 5
    //   110: invokevirtual 227	java/io/InputStream:close	()V
    //   113: aconst_null
    //   114: areturn
    //   115: astore 16
    //   117: ldc 57
    //   119: ldc 229
    //   121: aload 16
    //   123: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   126: pop
    //   127: aconst_null
    //   128: areturn
    //   129: astore 9
    //   131: aconst_null
    //   132: astore 5
    //   134: ldc 57
    //   136: ldc 233
    //   138: aload 9
    //   140: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   143: pop
    //   144: aconst_null
    //   145: astore 11
    //   147: aload 5
    //   149: ifnull -125 -> 24
    //   152: aload 5
    //   154: invokevirtual 227	java/io/InputStream:close	()V
    //   157: aconst_null
    //   158: areturn
    //   159: astore 12
    //   161: ldc 57
    //   163: ldc 229
    //   165: aload 12
    //   167: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   170: pop
    //   171: aconst_null
    //   172: areturn
    //   173: astore 4
    //   175: aconst_null
    //   176: astore 5
    //   178: aload 4
    //   180: astore 6
    //   182: aload 5
    //   184: ifnull +8 -> 192
    //   187: aload 5
    //   189: invokevirtual 227	java/io/InputStream:close	()V
    //   192: aload 6
    //   194: athrow
    //   195: astore 7
    //   197: ldc 57
    //   199: ldc 229
    //   201: aload 7
    //   203: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   206: pop
    //   207: goto -15 -> 192
    //   210: astore 6
    //   212: goto -30 -> 182
    //   215: astore 9
    //   217: goto -83 -> 134
    //   220: astore 14
    //   222: goto -132 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	jud
    //   0	225	1	paramipf	ipf
    //   7	26	2	localContentResolver	android.content.ContentResolver
    //   31	3	3	localUri	Uri
    //   173	6	4	localObject1	Object
    //   41	147	5	localInputStream1	java.io.InputStream
    //   180	13	6	localObject2	Object
    //   210	1	6	localObject3	Object
    //   195	7	7	localIOException1	IOException
    //   129	10	9	localIOException2	IOException
    //   215	1	9	localIOException3	IOException
    //   22	124	11	localObject4	Object
    //   159	7	12	localIOException4	IOException
    //   85	10	14	localFileNotFoundException1	java.io.FileNotFoundException
    //   220	1	14	localFileNotFoundException2	java.io.FileNotFoundException
    //   115	7	16	localIOException5	IOException
    //   37	3	18	localInputStream2	java.io.InputStream
    //   51	3	19	str	String
    //   70	7	20	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   62	67	70	java/io/IOException
    //   32	39	85	java/io/FileNotFoundException
    //   108	113	115	java/io/IOException
    //   32	39	129	java/io/IOException
    //   152	157	159	java/io/IOException
    //   32	39	173	finally
    //   187	192	195	java/io/IOException
    //   43	53	210	finally
    //   90	100	210	finally
    //   134	144	210	finally
    //   43	53	215	java/io/IOException
    //   43	53	220	java/io/FileNotFoundException
  }
  
  final jub a(Context paramContext, ipf paramipf)
  {
    Long[] arrayOfLong = a(paramContext, new ipf[] { paramipf });
    if (arrayOfLong[0].longValue() != 0L)
    {
      a(paramipf, "uploadInternal skipped - checkExistingPhotosOp.");
      return new jub(arrayOfLong[0], paramipf.c);
    }
    return a(paramContext, paramipf, 0);
  }
  
  public final void a(Uri paramUri, long paramLong1, long paramLong2)
  {
    if (Log.isLoggable("MediaUploadManagerImpl", 4))
    {
      String str = String.valueOf(paramUri);
      new StringBuilder(67 + String.valueOf(str).length()).append("  Uploading ").append(str).append(" upload:").append(paramLong1).append(" total:").append(paramLong2);
    }
  }
  
  public final void a(ipf paramipf)
  {
    if (!efj.J(this.a.getApplicationContext())) {
      return;
    }
    synchronized (this.f)
    {
      if (this.f.contains(paramipf))
      {
        a(paramipf, "asyncUpload skipped, image already pending.");
        return;
      }
    }
    synchronized (this.g)
    {
      if ((jub)this.g.get(paramipf) != null)
      {
        a(paramipf, "asyncUpload skipped, image already uploaded.");
        return;
      }
    }
    a(paramipf, "asyncUpload started.");
    jue localjue = new jue(this, paramipf);
    efj.m().post(localjue);
  }
  
  public final Long[] a(Context paramContext, ipf[] paramArrayOfipf)
  {
    Long[] arrayOfLong = new Long[paramArrayOfipf.length];
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    if (i < paramArrayOfipf.length)
    {
      ipf localipf2 = paramArrayOfipf[i];
      Long localLong = c(localipf2);
      arrayOfLong[i] = localLong;
      if ((localipf2 != null) && (localipf2.d != null) && (localLong.longValue() == 0L)) {}
      for (int n = 1;; n = 0)
      {
        if (n != 0)
        {
          localArrayList1.add(d(localipf2));
          localArrayList2.add(Integer.valueOf(i));
        }
        i++;
        break;
      }
    }
    if (localArrayList1.isEmpty()) {
      return arrayOfLong;
    }
    jrv localjrv = new jrv(paramContext, this.c, this.d, localArrayList1);
    localjrv.i();
    if (localjrv.n())
    {
      int m = localjrv.o;
      Log.e("MediaUploadManagerImpl", 47 + "CheckPhotosExistenceOperation error " + m);
      return arrayOfLong;
    }
    int j = 0;
    for (;;)
    {
      if (j < localArrayList1.size())
      {
        String str = (String)localArrayList1.get(j);
        for (;;)
        {
          try
          {
            l = localjrv.b(str);
            k = ((Integer)localArrayList2.get(j)).intValue();
            localipf1 = paramArrayOfipf[k];
          }
          catch (NullPointerException localNullPointerException)
          {
            long l;
            int k;
            ipf localipf1;
            continue;
          }
          synchronized (this.g)
          {
            this.g.put(localipf1, new jub(Long.valueOf(l), localipf1.c));
            a(localipf1, "CheckPhotosExistenceOperation found PhotoID.");
            arrayOfLong[k] = Long.valueOf(l);
            j++;
          }
        }
      }
    }
    return arrayOfLong;
  }
  
  public final jub b(ipf paramipf)
  {
    if (!efj.J(this.a.getApplicationContext())) {
      return null;
    }
    a(paramipf);
    for (;;)
    {
      synchronized (this.g)
      {
        jub localjub = (jub)this.g.get(paramipf);
        if (localjub != null)
        {
          a(paramipf, "blockingUpload finished.");
          return localjub;
        }
      }
      try
      {
        this.g.wait();
      }
      catch (InterruptedException localInterruptedException)
      {
        Log.e("MediaUploadManagerImpl", "Interrupted while waiting for blocking upload.", localInterruptedException);
      }
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jud
 * JD-Core Version:    0.7.0.1
 */