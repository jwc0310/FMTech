import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.social.picasalegacy.FingerprintEntry;

public final class jsg
{
  private static final String b = FingerprintEntry.a.a;
  private static final String[] c = { "fingerprint" };
  private static jsg d;
  public final jsh a;
  private final Context e;
  
  private jsg(Context paramContext)
  {
    this.e = paramContext.getApplicationContext();
    this.a = new jsh(this.e);
  }
  
  public static jsg a(Context paramContext)
  {
    try
    {
      if (d == null) {
        d = new jsg(paramContext);
      }
      jsg localjsg = d;
      return localjsg;
    }
    finally {}
  }
  
  public final int a(String[] paramArrayOfString)
  {
    try
    {
      int i = this.a.getWritableDatabase().delete(b, "content_uri=?", paramArrayOfString);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final ias a(String paramString1, String paramString2)
  {
    String str;
    String[] arrayOfString;
    if (paramString1 == null)
    {
      if (paramString2 == null) {
        throw new IllegalArgumentException("Either contentUri or imageUrl must be provided");
      }
      str = "image_url=?";
      arrayOfString = new String[] { paramString2 };
    }
    for (;;)
    {
      Cursor localCursor = this.a.getReadableDatabase().query(b, c, str, arrayOfString, null, null, null);
      if (localCursor != null) {}
      try
      {
        if ((localCursor.moveToNext()) && (!localCursor.isNull(0)))
        {
          ias localias = new ias(localCursor.getBlob(0));
          return localias;
          str = "content_uri=?";
          arrayOfString = new String[] { paramString1 };
          continue;
        }
        return null;
      }
      catch (Throwable localThrowable)
      {
        new StringBuilder(42 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append("Cannot get fingerprint from cache for: (").append(paramString1).append(",").append(paramString2).append(")");
        return null;
      }
      finally
      {
        iaw.a(localCursor);
      }
    }
  }
  
  /* Error */
  public final ias a(String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: aconst_null
    //   5: invokevirtual 137	jsg:a	(Ljava/lang/String;Ljava/lang/String;)Lias;
    //   8: astore 5
    //   10: aload 5
    //   12: astore 6
    //   14: iload_3
    //   15: ifne +13 -> 28
    //   18: aload 6
    //   20: ifnull +8 -> 28
    //   23: aload_0
    //   24: monitorexit
    //   25: aload 6
    //   27: areturn
    //   28: aload_1
    //   29: invokestatic 143	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   32: astore 11
    //   34: aload_0
    //   35: getfield 45	jsg:e	Landroid/content/Context;
    //   38: invokevirtual 147	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   41: aload 11
    //   43: invokevirtual 153	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   46: invokestatic 156	ias:a	(Ljava/io/InputStream;)Lias;
    //   49: astore 12
    //   51: aload 6
    //   53: ifnull +13 -> 66
    //   56: aload 6
    //   58: aload 12
    //   60: invokevirtual 160	ias:equals	(Ljava/lang/Object;)Z
    //   63: ifne +28 -> 91
    //   66: getstatic 21	com/google/android/libraries/social/picasalegacy/FingerprintEntry:a	Liao;
    //   69: aload_0
    //   70: getfield 51	jsg:a	Ljsh;
    //   73: invokevirtual 60	jsh:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   76: new 18	com/google/android/libraries/social/picasalegacy/FingerprintEntry
    //   79: dup
    //   80: aload_1
    //   81: aconst_null
    //   82: aload 12
    //   84: invokespecial 163	com/google/android/libraries/social/picasalegacy/FingerprintEntry:<init>	(Ljava/lang/String;Ljava/lang/String;Lias;)V
    //   87: invokevirtual 166	iao:a	(Landroid/database/sqlite/SQLiteDatabase;Lial;)J
    //   90: pop2
    //   91: aload 12
    //   93: astore 6
    //   95: goto -72 -> 23
    //   98: astore 7
    //   100: aload_1
    //   101: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   104: astore 8
    //   106: aload 8
    //   108: invokevirtual 121	java/lang/String:length	()I
    //   111: ifeq +28 -> 139
    //   114: ldc 168
    //   116: aload 8
    //   118: invokevirtual 172	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 9
    //   123: ldc 174
    //   125: aload 9
    //   127: aload 7
    //   129: invokestatic 179	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   132: pop
    //   133: aconst_null
    //   134: astore 6
    //   136: goto -113 -> 23
    //   139: new 29	java/lang/String
    //   142: dup
    //   143: ldc 168
    //   145: invokespecial 180	java/lang/String:<init>	(Ljava/lang/String;)V
    //   148: astore 9
    //   150: goto -27 -> 123
    //   153: astore 4
    //   155: aload_0
    //   156: monitorexit
    //   157: aload 4
    //   159: athrow
    //   160: astore 13
    //   162: aload_1
    //   163: invokestatic 117	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   166: astore 14
    //   168: aload 14
    //   170: invokevirtual 121	java/lang/String:length	()I
    //   173: ifeq +14 -> 187
    //   176: ldc 182
    //   178: aload 14
    //   180: invokevirtual 172	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   183: pop
    //   184: goto -93 -> 91
    //   187: new 29	java/lang/String
    //   190: dup
    //   191: ldc 182
    //   193: invokespecial 180	java/lang/String:<init>	(Ljava/lang/String;)V
    //   196: pop
    //   197: goto -106 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	this	jsg
    //   0	200	1	paramString1	String
    //   0	200	2	paramString2	String
    //   0	200	3	paramBoolean	boolean
    //   153	5	4	localObject1	Object
    //   8	3	5	localias1	ias
    //   12	123	6	localObject2	Object
    //   98	30	7	localThrowable1	Throwable
    //   104	13	8	str1	String
    //   121	28	9	str2	String
    //   32	10	11	localUri	android.net.Uri
    //   49	43	12	localias2	ias
    //   160	1	13	localThrowable2	Throwable
    //   166	13	14	str3	String
    // Exception table:
    //   from	to	target	type
    //   28	51	98	java/lang/Throwable
    //   2	10	153	finally
    //   28	51	153	finally
    //   56	66	153	finally
    //   66	91	153	finally
    //   100	123	153	finally
    //   123	133	153	finally
    //   139	150	153	finally
    //   162	184	153	finally
    //   187	197	153	finally
    //   56	66	160	java/lang/Throwable
    //   66	91	160	java/lang/Throwable
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsg
 * JD-Core Version:    0.7.0.1
 */