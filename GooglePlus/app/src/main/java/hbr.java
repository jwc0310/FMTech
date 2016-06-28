import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.text.TextUtils;

final class hbr
{
  private static final hbs f = new hbs(-1L, null, null, null);
  private static final String[] g = { "MAX(_id)" };
  public final String a;
  public final String b;
  public final Uri c;
  final String[] d = new String[1];
  final String[] e;
  
  public hbr(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
    if ("photo".equals(paramString1))
    {
      if ("external".equals(paramString2)) {}
      for (this.c = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;; this.c = itf.b)
      {
        this.e = hbo.b;
        return;
        if (!"phoneStorage".equals(paramString2)) {
          break;
        }
      }
      throw new IllegalArgumentException("Invalid volume name; must be one of the defined volumes");
    }
    if ("video".equals(paramString1))
    {
      if ("external".equals(paramString2)) {}
      for (this.c = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;; this.c = itf.a)
      {
        this.e = hbo.a;
        return;
        if (!"phoneStorage".equals(paramString2)) {
          break;
        }
      }
      throw new IllegalArgumentException("Invalid volume name; must be one of the defined volumes");
    }
    throw new IllegalArgumentException("Invalid media type; must be one of the defined types");
  }
  
  static hbs a(Cursor paramCursor)
  {
    if (paramCursor != null) {}
    for (;;)
    {
      boolean bool;
      Object localObject2;
      try
      {
        if (paramCursor.moveToFirst())
        {
          bool = paramCursor.getString(2).contains("/DCIM/");
          String str1;
          if (bool)
          {
            str1 = null;
            break label132;
            String str2 = efj.a(paramCursor.getString(4), paramCursor.getInt(5), paramCursor.getLong(3));
            hbs localhbs = new hbs(paramCursor.getLong(0), str1, (String)localObject2, str2);
            return localhbs;
          }
          else
          {
            str1 = paramCursor.getString(1);
            break label132;
            String str3 = paramCursor.getString(6);
            localObject2 = str3;
            continue;
          }
        }
        else
        {
          return f;
        }
      }
      finally
      {
        iaw.a(paramCursor);
      }
      label132:
      if (bool) {
        localObject2 = null;
      }
    }
  }
  
  /* Error */
  public final boolean a(android.content.ContentResolver paramContentResolver)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: aload_0
    //   4: getfield 57	hbr:c	Landroid/net/Uri;
    //   7: getstatic 33	hbr:g	[Ljava/lang/String;
    //   10: aconst_null
    //   11: aconst_null
    //   12: aconst_null
    //   13: invokevirtual 131	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   16: astore 9
    //   18: aload 9
    //   20: ifnull +47 -> 67
    //   23: aload 9
    //   25: invokeinterface 94 1 0
    //   30: ifeq +31 -> 61
    //   33: aload 9
    //   35: iconst_0
    //   36: invokeinterface 112 2 0
    //   41: lstore 12
    //   43: lload 12
    //   45: lconst_0
    //   46: lcmp
    //   47: iflt +14 -> 61
    //   50: iconst_1
    //   51: istore 11
    //   53: aload 9
    //   55: invokestatic 122	iaw:a	(Landroid/database/Cursor;)V
    //   58: iload 11
    //   60: ireturn
    //   61: iconst_0
    //   62: istore 11
    //   64: goto -11 -> 53
    //   67: aload 9
    //   69: invokestatic 122	iaw:a	(Landroid/database/Cursor;)V
    //   72: iconst_0
    //   73: ireturn
    //   74: astore 4
    //   76: aconst_null
    //   77: astore 5
    //   79: ldc 133
    //   81: iconst_5
    //   82: invokestatic 139	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   85: ifeq +38 -> 123
    //   88: aload_0
    //   89: invokestatic 143	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   92: astore 7
    //   94: new 145	java/lang/StringBuilder
    //   97: dup
    //   98: bipush 26
    //   100: aload 7
    //   102: invokestatic 143	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   105: invokevirtual 149	java/lang/String:length	()I
    //   108: iadd
    //   109: invokespecial 152	java/lang/StringBuilder:<init>	(I)V
    //   112: ldc 154
    //   114: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: aload 7
    //   119: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aload 5
    //   125: invokestatic 122	iaw:a	(Landroid/database/Cursor;)V
    //   128: goto -56 -> 72
    //   131: astore_3
    //   132: aload_2
    //   133: invokestatic 122	iaw:a	(Landroid/database/Cursor;)V
    //   136: aload_3
    //   137: athrow
    //   138: astore_3
    //   139: aload 9
    //   141: astore_2
    //   142: goto -10 -> 132
    //   145: astore 6
    //   147: aload 5
    //   149: astore_2
    //   150: aload 6
    //   152: astore_3
    //   153: goto -21 -> 132
    //   156: astore 10
    //   158: aload 9
    //   160: astore 5
    //   162: goto -83 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	hbr
    //   0	165	1	paramContentResolver	android.content.ContentResolver
    //   1	149	2	localObject1	Object
    //   131	6	3	localObject2	Object
    //   138	1	3	localObject3	Object
    //   152	1	3	localObject4	Object
    //   74	1	4	localException1	java.lang.Exception
    //   77	84	5	localCursor1	Cursor
    //   145	6	6	localObject5	Object
    //   92	26	7	str	String
    //   16	143	9	localCursor2	Cursor
    //   156	1	10	localException2	java.lang.Exception
    //   51	12	11	bool	boolean
    //   41	3	12	l	long
    // Exception table:
    //   from	to	target	type
    //   2	18	74	java/lang/Exception
    //   2	18	131	finally
    //   23	43	138	finally
    //   79	123	145	finally
    //   23	43	156	java/lang/Exception
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof hbr)) {}
    hbr localhbr;
    do
    {
      return false;
      localhbr = (hbr)paramObject;
    } while ((!TextUtils.equals(localhbr.a, this.a)) || (!TextUtils.equals(localhbr.b, this.b)));
    return true;
  }
  
  public final int hashCode()
  {
    return 31 * (527 + this.a.hashCode()) + this.b.hashCode();
  }
  
  public final String toString()
  {
    String str1 = this.a;
    String str2 = this.b;
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "-" + str2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbr
 * JD-Core Version:    0.7.0.1
 */