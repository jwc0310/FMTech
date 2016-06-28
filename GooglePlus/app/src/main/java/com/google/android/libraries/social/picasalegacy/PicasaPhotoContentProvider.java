package com.google.android.libraries.social.picasalegacy;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import ias;
import iaw;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import jrw;
import jsg;
import jsm;
import jso;
import jsp;
import jsq;
import jsr;
import jss;

public final class PicasaPhotoContentProvider
  extends ContentProvider
{
  private static final Uri a = Uri.parse("content://media/external/fs_id");
  private String b;
  private final UriMatcher c = new UriMatcher(-1);
  private jsg d;
  private int e;
  private boolean f = false;
  private SharedPreferences g;
  
  private static int a(Context paramContext)
  {
    Cursor localCursor = paramContext.getContentResolver().query(a, null, null, null, null);
    if (localCursor != null) {}
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        return i;
      }
      return -1;
    }
    finally
    {
      iaw.a(localCursor);
    }
  }
  
  private final Cursor a(Uri paramUri, String[] paramArrayOfString)
  {
    boolean bool = "1".equals(paramUri.getQueryParameter("force_recalculate"));
    int i;
    jsp localjsp;
    jsg localjsg;
    Object[] arrayOfObject1;
    int i6;
    label68:
    ias localias2;
    if ((!bool) && ("1".equals(paramUri.getQueryParameter("cache_only"))))
    {
      i = 1;
      localjsp = new jsp(paramArrayOfString);
      localjsg = this.d;
      arrayOfObject1 = new Object[paramArrayOfString.length];
      if (i == 0) {
        break label124;
      }
      int i5 = paramArrayOfString.length;
      i6 = 0;
      if (i6 >= i5) {
        break label182;
      }
      localias2 = localjsg.a(paramArrayOfString[i6], null);
      if (localias2 != null) {
        break label114;
      }
    }
    label114:
    for (byte[] arrayOfByte2 = null;; arrayOfByte2 = localias2.a)
    {
      arrayOfObject1[i6] = arrayOfByte2;
      i6++;
      break label68;
      i = 0;
      break;
    }
    label124:
    int j = paramArrayOfString.length;
    int k = 0;
    if (k < j)
    {
      ias localias1 = localjsg.a(paramArrayOfString[k], null, bool);
      if (localias1 == null) {}
      for (byte[] arrayOfByte1 = null;; arrayOfByte1 = localias1.a)
      {
        arrayOfObject1[k] = arrayOfByte1;
        k++;
        break;
      }
    }
    label182:
    if (arrayOfObject1.length != localjsp.c)
    {
      int i3 = localjsp.c;
      int i4 = arrayOfObject1.length;
      throw new IllegalArgumentException(67 + "columnNames.length = " + i3 + ", columnValues.length = " + i4);
    }
    int m = localjsp.b;
    localjsp.b = (m + 1);
    int n = m * localjsp.c;
    int i1 = n + localjsp.c;
    Object[] arrayOfObject2;
    int i2;
    if (i1 > localjsp.a.length)
    {
      arrayOfObject2 = localjsp.a;
      i2 = localjsp.a.length << 1;
      if (i2 >= i1) {
        break label362;
      }
    }
    for (;;)
    {
      localjsp.a = new Object[i1];
      System.arraycopy(arrayOfObject2, 0, localjsp.a, 0, arrayOfObject2.length);
      System.arraycopy(arrayOfObject1, 0, localjsp.a, n, localjsp.c);
      return localjsp;
      label362:
      i1 = i2;
    }
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: invokestatic 152	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   7: astore_3
    //   8: aload_3
    //   9: ldc 154
    //   11: invokevirtual 85	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   14: ifne +16 -> 30
    //   17: aload_3
    //   18: ldc 156
    //   20: invokevirtual 85	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   23: istore 15
    //   25: iload 15
    //   27: ifeq +14 -> 41
    //   30: iload_1
    //   31: istore 4
    //   33: iload 4
    //   35: ifne +12 -> 47
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: iconst_0
    //   42: istore 4
    //   44: goto -11 -> 33
    //   47: aload_0
    //   48: invokevirtual 160	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:getContext	()Landroid/content/Context;
    //   51: astore 5
    //   53: aload 5
    //   55: invokestatic 162	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:a	(Landroid/content/Context;)I
    //   58: istore 7
    //   60: aload_0
    //   61: getfield 42	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:f	Z
    //   64: ifne +66 -> 130
    //   67: new 115	java/lang/StringBuilder
    //   70: dup
    //   71: bipush 31
    //   73: invokespecial 116	java/lang/StringBuilder:<init>	(I)V
    //   76: ldc 164
    //   78: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: iload 7
    //   83: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_0
    //   88: iconst_1
    //   89: putfield 42	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:f	Z
    //   92: aload_0
    //   93: iload 7
    //   95: putfield 166	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:e	I
    //   98: aload_0
    //   99: getfield 168	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:g	Landroid/content/SharedPreferences;
    //   102: invokeinterface 174 1 0
    //   107: ldc 176
    //   109: iload 7
    //   111: invokeinterface 182 3 0
    //   116: invokeinterface 185 1 0
    //   121: pop
    //   122: goto -84 -> 38
    //   125: astore_2
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_2
    //   129: athrow
    //   130: aload_0
    //   131: getfield 166	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:e	I
    //   134: iload 7
    //   136: if_icmpeq -98 -> 38
    //   139: aload_0
    //   140: getfield 166	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:e	I
    //   143: istore 8
    //   145: new 115	java/lang/StringBuilder
    //   148: dup
    //   149: bipush 40
    //   151: invokespecial 116	java/lang/StringBuilder:<init>	(I)V
    //   154: ldc 187
    //   156: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: iload 8
    //   161: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   164: ldc 189
    //   166: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: iload 7
    //   171: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload_0
    //   176: iload 7
    //   178: putfield 166	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:e	I
    //   181: aload_0
    //   182: getfield 168	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:g	Landroid/content/SharedPreferences;
    //   185: invokeinterface 174 1 0
    //   190: ldc 176
    //   192: iload 7
    //   194: invokeinterface 182 3 0
    //   199: invokeinterface 185 1 0
    //   204: pop
    //   205: aload 5
    //   207: invokestatic 194	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:a	(Landroid/content/Context;)Lcom/google/android/libraries/social/picasalegacy/PicasaStoreFacade;
    //   210: astore 11
    //   212: aload 11
    //   214: getfield 197	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:c	Ljtb;
    //   217: aload 11
    //   219: getfield 199	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:d	Ljtb;
    //   222: if_acmpne +32 -> 254
    //   225: iload_1
    //   226: ifeq -188 -> 38
    //   229: aload_0
    //   230: getfield 94	com/google/android/libraries/social/picasalegacy/PicasaPhotoContentProvider:d	Ljsg;
    //   233: getfield 202	jsg:a	Ljsh;
    //   236: invokevirtual 208	jsh:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   239: getstatic 213	com/google/android/libraries/social/picasalegacy/FingerprintEntry:a	Liao;
    //   242: getfield 217	iao:a	Ljava/lang/String;
    //   245: aconst_null
    //   246: aconst_null
    //   247: invokevirtual 223	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   250: pop
    //   251: goto -213 -> 38
    //   254: iconst_0
    //   255: istore_1
    //   256: goto -31 -> 225
    //   259: astore 6
    //   261: goto -223 -> 38
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	this	PicasaPhotoContentProvider
    //   1	255	1	i	int
    //   125	4	2	localObject	Object
    //   7	11	3	str	String
    //   31	12	4	j	int
    //   51	155	5	localContext	Context
    //   259	1	6	localSecurityException	java.lang.SecurityException
    //   58	135	7	k	int
    //   143	17	8	m	int
    //   210	8	11	localPicasaStoreFacade	PicasaStoreFacade
    //   23	3	15	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	25	125	finally
    //   47	53	125	finally
    //   53	60	125	finally
    //   60	122	125	finally
    //   130	225	125	finally
    //   229	251	125	finally
    //   53	60	259	java/lang/SecurityException
  }
  
  public final void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    super.attachInfo(paramContext, paramProviderInfo);
    this.b = paramProviderInfo.authority;
    this.c.addURI(this.b, "photos", 1);
    this.c.addURI(this.b, "fingerprint", 3);
    this.c.addURI(this.b, "photos/#", 2);
    this.c.addURI(this.b, "albumcovers/#", 4);
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    switch (this.c.match(paramUri))
    {
    default: 
      String str = String.valueOf(paramUri);
      throw new IllegalArgumentException(16 + String.valueOf(str).length() + "unsupported uri:" + str);
    }
    return this.d.a(paramArrayOfString);
  }
  
  public final String getType(Uri paramUri)
  {
    switch (this.c.match(paramUri))
    {
    case 3: 
    default: 
      String str = String.valueOf(paramUri);
      throw new IllegalArgumentException(13 + String.valueOf(str).length() + "Invalid URI: " + str);
    case 1: 
      return "vnd.android.cursor.dir/vnd.google.android.picasasync.item";
    case 2: 
      return "vnd.android.cursor.item/vnd.google.android.picasasync.item";
    }
    return "vnd.android.cursor.item/vnd.google.android.picasasync.album_cover";
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    String str1 = String.valueOf(paramUri);
    int i = jsm.a(7 + String.valueOf(str1).length() + "INSERT " + str1);
    try
    {
      this.c.match(paramUri);
      String str2 = String.valueOf(paramUri);
      throw new IllegalArgumentException(16 + String.valueOf(str2).length() + "unsupported uri:" + str2);
    }
    finally
    {
      jsm.a(i);
    }
  }
  
  public final boolean onCreate()
  {
    Context localContext = getContext();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    int i = Math.max(localDisplayMetrics.heightPixels, localDisplayMetrics.widthPixels);
    if (i > 0)
    {
      jrw.a = i / 2;
      jrw.b = i / 5;
    }
    this.d = jsg.a(localContext);
    this.g = PreferenceManager.getDefaultSharedPreferences(localContext);
    HandlerThread localHandlerThread = new HandlerThread("picasa-photo-provider", 10);
    localHandlerThread.start();
    jsr localjsr = new jsr(this, localHandlerThread.getLooper());
    localContext.getContentResolver().registerContentObserver(a, false, new jsq(this, localjsr));
    Message.obtain(localjsr, 1).sendToTarget();
    return true;
  }
  
  public final ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    String str1 = String.valueOf(paramUri.toString());
    if (str1.length() != 0) {}
    int i;
    for (String str2 = "OPEN ".concat(str1);; str2 = new String("OPEN "))
    {
      i = jsm.a(str2);
      try
      {
        switch (this.c.match(paramUri))
        {
        case 3: 
        default: 
          String str7 = String.valueOf(paramUri);
          throw new IllegalArgumentException(17 + String.valueOf(str7).length() + "unsupported uri: " + str7);
        }
      }
      finally
      {
        jsm.a(i);
      }
    }
    jss localjss = PicasaStoreFacade.a(getContext()).a();
    if (paramString.contains("w"))
    {
      String str5 = String.valueOf(paramString);
      if (str5.length() != 0) {}
      for (String str6 = "invalid mode: ".concat(str5);; str6 = new String("invalid mode: ")) {
        throw new FileNotFoundException(str6);
      }
    }
    String str3 = paramUri.getQueryParameter("type");
    boolean bool = "1".equals(paramUri.getQueryParameter("cache_only"));
    long l = jss.a(paramUri);
    String str4 = paramUri.getQueryParameter("content_url");
    ParcelFileDescriptor localParcelFileDescriptor2;
    if (l != 0L)
    {
      if ("screennail".equals(str3))
      {
        ParcelFileDescriptor localParcelFileDescriptor3 = localjss.c(l, jss.a(str4, jrw.a, false), bool);
        localParcelFileDescriptor2 = localParcelFileDescriptor3;
      }
      for (;;)
      {
        jsm.a(i);
        return localParcelFileDescriptor2;
        if ("thumbnail".equals(str3)) {
          localParcelFileDescriptor2 = localjss.d(l, jss.a(str4, jrw.b, true), bool);
        } else {
          localParcelFileDescriptor2 = localjss.a(l, str4, bool);
        }
      }
    }
    if (str4 != null)
    {
      if ("thumbnail".equals(str3)) {
        str4 = jss.a(str4, jrw.b, true);
      }
      for (;;)
      {
        localParcelFileDescriptor2 = localjss.b(-1L, str4, bool);
        break;
        if ("screennail".equals(str3)) {
          str4 = jss.a(str4, jrw.a, false);
        }
      }
    }
    throw new FileNotFoundException(paramUri.toString());
    ParcelFileDescriptor localParcelFileDescriptor1 = PicasaStoreFacade.a(getContext()).a().a(paramUri, paramString);
    jsm.a(i);
    return localParcelFileDescriptor1;
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    String str1 = String.valueOf(paramUri.toString());
    if (str1.length() != 0) {}
    int i;
    for (String str2 = "QUERY ".concat(str1);; str2 = new String("QUERY "))
    {
      i = jsm.a(str2);
      try
      {
        switch (this.c.match(paramUri))
        {
        default: 
          String str3 = String.valueOf(paramUri);
          throw new IllegalArgumentException(13 + String.valueOf(str3).length() + "Invalid URI: " + str3);
        }
      }
      finally
      {
        jsm.a(i);
      }
    }
    Cursor localCursor = a(paramUri, paramArrayOfString1);
    int j = localCursor.getCount();
    ArrayList localArrayList = (ArrayList)jsm.b.get();
    int k = localArrayList.size();
    if (k > 0)
    {
      jso localjso = (jso)localArrayList.get(k - 1);
      localjso.b = (j + localjso.b);
    }
    jsm.a(i);
    return localCursor;
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    this.c.match(paramUri);
    String str = String.valueOf(paramUri);
    throw new IllegalArgumentException(16 + String.valueOf(str).length() + "unsupported uri:" + str);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.picasalegacy.PicasaPhotoContentProvider
 * JD-Core Version:    0.7.0.1
 */