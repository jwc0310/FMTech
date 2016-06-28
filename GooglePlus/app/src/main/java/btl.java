import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SyncResult;
import android.content.SyncStats;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class btl
{
  static final String[] c = { "all_tiles.image_url", "sum(representation_type)", "media_attr", "data", "title" };
  static final String[] d = { "all_photos.image_url", "sum(representation_type)", "media_attr", "data", "NULL as title" };
  static final String[] e = { "media_cache.image_url", "filename", "size", "representation_type" };
  private static final String[] l = { "size" };
  private static btl m;
  final giz a;
  final ixf b;
  final Context f;
  final long g;
  final long h;
  long i;
  long j;
  bty k;
  private final ipb n;
  private int o;
  private int p;
  
  private btl(Context paramContext)
  {
    this.f = paramContext;
    this.n = ((ipb)mbb.a(paramContext, ipb.class));
    this.a = ((giz)mbb.a(paramContext, giz.class));
    this.b = ((ixf)mbb.a(this.f, ixf.class));
    ifj localifj = (ifj)mbb.a(paramContext, ifj.class);
    this.g = localifj.l();
    this.h = localifj.k();
    b(0);
    c(0);
  }
  
  /* Error */
  private final int a(int paramInt, Set<String> paramSet1, Set<String> paramSet2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 69	btl:f	Landroid/content/Context;
    //   4: iload_1
    //   5: invokestatic 108	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   8: invokevirtual 112	bqj:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore 4
    //   13: aload 4
    //   15: ldc 114
    //   17: iconst_3
    //   18: anewarray 33	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: ldc 116
    //   25: aastore
    //   26: dup
    //   27: iconst_1
    //   28: ldc 55
    //   30: aastore
    //   31: dup
    //   32: iconst_2
    //   33: ldc 57
    //   35: aastore
    //   36: ldc 118
    //   38: aconst_null
    //   39: aconst_null
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: invokevirtual 124	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore 5
    //   48: iconst_0
    //   49: istore 6
    //   51: aload 5
    //   53: invokeinterface 130 1 0
    //   58: ifeq +189 -> 247
    //   61: aload 5
    //   63: iconst_0
    //   64: invokeinterface 134 2 0
    //   69: astore 8
    //   71: aload 5
    //   73: iconst_1
    //   74: invokeinterface 134 2 0
    //   79: astore 9
    //   81: aload 9
    //   83: ldc 136
    //   85: invokevirtual 140	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   88: ifne -37 -> 51
    //   91: aload_3
    //   92: aload 9
    //   94: invokeinterface 146 2 0
    //   99: pop
    //   100: aload_2
    //   101: aload 8
    //   103: invokeinterface 149 2 0
    //   108: ifne -57 -> 51
    //   111: aload_0
    //   112: aload 4
    //   114: aload 9
    //   116: aload 5
    //   118: iconst_2
    //   119: invokeinterface 153 2 0
    //   124: i2l
    //   125: invokespecial 156	btl:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;J)Z
    //   128: ifne +68 -> 196
    //   131: ldc 158
    //   133: iconst_3
    //   134: invokestatic 164	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   137: ifeq +26 -> 163
    //   140: aload 9
    //   142: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   145: astore 14
    //   147: aload 14
    //   149: invokevirtual 172	java/lang/String:length	()I
    //   152: ifeq +31 -> 183
    //   155: ldc 174
    //   157: aload 14
    //   159: invokevirtual 178	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   162: pop
    //   163: new 180	btu
    //   166: dup
    //   167: invokespecial 181	btu:<init>	()V
    //   170: athrow
    //   171: astore 7
    //   173: aload 5
    //   175: invokeinterface 184 1 0
    //   180: aload 7
    //   182: athrow
    //   183: new 33	java/lang/String
    //   186: dup
    //   187: ldc 174
    //   189: invokespecial 187	java/lang/String:<init>	(Ljava/lang/String;)V
    //   192: pop
    //   193: goto -30 -> 163
    //   196: iinc 6 1
    //   199: ldc 158
    //   201: iconst_3
    //   202: invokestatic 164	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   205: ifeq -154 -> 51
    //   208: aload 8
    //   210: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   213: astore 11
    //   215: aload 11
    //   217: invokevirtual 172	java/lang/String:length	()I
    //   220: ifeq +14 -> 234
    //   223: ldc 189
    //   225: aload 11
    //   227: invokevirtual 178	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   230: pop
    //   231: goto -180 -> 51
    //   234: new 33	java/lang/String
    //   237: dup
    //   238: ldc 189
    //   240: invokespecial 187	java/lang/String:<init>	(Ljava/lang/String;)V
    //   243: pop
    //   244: goto -193 -> 51
    //   247: aload 5
    //   249: invokeinterface 184 1 0
    //   254: iload 6
    //   256: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	this	btl
    //   0	257	1	paramInt	int
    //   0	257	2	paramSet1	Set<String>
    //   0	257	3	paramSet2	Set<String>
    //   11	102	4	localSQLiteDatabase	SQLiteDatabase
    //   46	202	5	localCursor	Cursor
    //   49	206	6	i1	int
    //   171	10	7	localObject	Object
    //   69	140	8	str1	String
    //   79	62	9	str2	String
    //   213	13	11	str3	String
    //   145	13	14	str4	String
    // Exception table:
    //   from	to	target	type
    //   51	163	171	finally
    //   163	171	171	finally
    //   183	193	171	finally
    //   199	231	171	finally
    //   234	244	171	finally
  }
  
  static long a(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "-1";
    arrayOfString[1] = "0";
    arrayOfString[2] = Integer.toString(paramInt);
    return DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT COUNT(*) FROM (SELECT image_url as all_photos_image_url, timestamp as all_photos_timestamp FROM all_photos WHERE all_photos_image_url IS NOT NULL AND is_primary = 1 AND (has_edit_list = 1 OR local_content_uri IS NULL) LIMIT ? OFFSET ?) INNER JOIN media_cache ON (all_photos_image_url = media_cache.image_url) WHERE representation_type & ? != 0", arrayOfString);
  }
  
  private final btg a(int paramInt, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(this.f, paramInt).getReadableDatabase();
    boolean bool;
    btg localbtg;
    if (this.k.a == paramInt)
    {
      bool = true;
      if (!bool)
      {
        long l1 = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT SUM(size) FROM media_cache", null);
        paramLong = Math.min(paramLong, l1 - this.k.e);
        if (Log.isLoggable("MediaSyncManager", 4))
        {
          String str = String.valueOf(iaw.b(this.a.a(paramInt).b("account_name")));
          new StringBuilder(36 + String.valueOf(str).length()).append("Space used by ").append(str).append(": ").append(l1);
        }
      }
      localbtg = new btg(paramInt, paramLong, bool);
      if (!localbtg.h) {
        break label162;
      }
    }
    label162:
    do
    {
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        return localbtg;
        bool = false;
        break;
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(new bto(this, 1, 50, 0));
        localArrayList.add(new btt(this, 1, 50, 0));
        localArrayList.add(new bto(this, 10, 50, 0));
        localArrayList.add(new btt(this, 10, 50, 0));
        localArrayList.add(new bto(this, 1, -1, 50));
        localArrayList.add(new btt(this, 1, -1, 50));
        localArrayList.add(new bto(this, 10, -1, 0));
        localArrayList.addAll(a(localSQLiteDatabase, 1, false));
        localArrayList.addAll(a(localSQLiteDatabase, 10, true));
        Collections.reverse(localArrayList);
        localIterator = localArrayList.iterator();
      }
      btw localbtw = (btw)localIterator.next();
      localbtw.a(localSQLiteDatabase, localbtg, localbtw.a(), localbtw.b(), localbtw.d());
    } while (!localbtg.h);
    return localbtg;
  }
  
  public static btl a(Context paramContext)
  {
    try
    {
      if (m == null) {
        m = new btl(paramContext.getApplicationContext());
      }
      btl localbtl = m;
      return localbtl;
    }
    finally {}
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      return "Unknown";
    case 0: 
      return "None";
    case 1: 
      return "Thumbnail";
    case 2: 
      return "Large";
    }
    return "Video";
  }
  
  private String a(int paramInt, String paramString)
  {
    String str = jqx.a(this.f, paramString, paramInt);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    if (Log.isLoggable("MediaSyncManager", 2)) {
      new StringBuilder(40 + String.valueOf(paramString).length() + String.valueOf(str).length()).append("insertLocalVideo thumbnailUrl=").append(paramString).append(" localUri=").append(str);
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("image_url", paramString);
    localContentValues.put("filename", str);
    localContentValues.put("size", Integer.valueOf(0));
    localContentValues.put("http_status", Integer.valueOf(200));
    localContentValues.put("representation_type", Integer.valueOf(8));
    bqj.a(this.f, paramInt).getWritableDatabase().replace("media_cache", "filename", localContentValues);
    return str;
  }
  
  private final String a(SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, btx parambtx, int paramInt)
  {
    String str1 = parambtx.d();
    int i1 = parambtx.h();
    long l1 = parambtx.f().longValue();
    int i2 = parambtx.c();
    int i3;
    if (((0x20 & l1) != 0L) && (i2 != 1)) {
      i3 = 1;
    }
    String str2;
    boolean bool;
    String str8;
    Cursor localCursor;
    for (;;)
    {
      str2 = parambtx.e();
      bool = this.k.f;
      if (i3 == 0) {
        break label1229;
      }
      str8 = a(this.k.a, str1);
      if (str8 == null) {
        break label211;
      }
      String[] arrayOfString = new String[2];
      arrayOfString[0] = str1;
      arrayOfString[1] = Integer.toString(8);
      localCursor = paramSQLiteDatabase.query("media_cache", new String[] { "filename", "size" }, "http_status = 200 AND image_url = ? AND representation_type & ? != 0", arrayOfString, null, null, null);
      try
      {
        while (localCursor.moveToNext()) {
          a(paramSQLiteDatabase, localCursor.getString(0), localCursor.getLong(1));
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    return str8;
    label211:
    if (!parambtx.i()) {
      return null;
    }
    i2 = 8;
    String str9 = parambtx.b();
    int i4;
    String str3;
    label259:
    ipf localipf;
    int i6;
    int i7;
    if (bua.a(this.f, str2, parambtx.g()))
    {
      i4 = 0;
      str3 = str9;
      if ((i1 & i2) != 0)
      {
        if (Log.isLoggable("MediaSyncManager", 2))
        {
          String str7 = String.valueOf(a(i2));
          new StringBuilder(21 + String.valueOf(str7).length() + String.valueOf(str1).length()).append("Already cached ").append(str7).append(" for: ").append(str1);
        }
        if (this.k.i != null)
        {
          bth localbth = this.k.i.a(str1, i2);
          if (localbth != null)
          {
            bty localbty4 = this.k;
            localbty4.l -= localbth.e;
          }
        }
      }
      for (int i5 = 1; i5 != 0; i5 = 0) {
        return null;
      }
      if (str3 == null)
      {
        a(paramSQLiteDatabase, paramContentValues, str1, 0);
        return null;
      }
      localipf = ipf.a(this.f, str3, jrf.a(l1));
      i6 = 17410;
      if (i4 != 0) {
        i6 = 25602;
      }
      switch (i2)
      {
      default: 
        throw new IllegalArgumentException(40 + "Invalid representation type: " + i2);
      case 1: 
        i7 = 2;
        i6 |= 0x10000;
        label530:
        if (Log.isLoggable("MediaSyncManager", 3))
        {
          String str6 = String.valueOf(a(i2));
          long l3 = this.k.k;
          long l4 = this.k.l;
          new StringBuilder(84 + String.valueOf(str6).length() + String.valueOf(str1).length()).append("Downloading ").append(str6).append(": ").append(str1).append(" total downloaded=").append(l3).append(" total left=").append(l4);
        }
        break;
      }
    }
    for (;;)
    {
      long l2;
      bty localbty3;
      int i8;
      try
      {
        localFile = (File)new ipc(this.n, null, localipf, i7, 0, 0, i6).a();
        if (!localFile.exists()) {
          continue;
        }
        l2 = localFile.length();
        a(paramSQLiteDatabase, paramContentValues, str1, localFile.getName(), l2, i2);
        bty localbty1 = this.k;
        localbty1.k = (l2 + localbty1.k);
        bty localbty2 = this.k;
        localbty2.l -= l2;
        localbty3 = this.k;
        switch (i2)
        {
        }
      }
      catch (kbm localkbm)
      {
        File localFile;
        if (!Log.isLoggable("MediaSyncManager", 3)) {
          continue;
        }
        str4 = String.valueOf(str1);
        if (str4.length() == 0) {
          break label1135;
        }
        "Could not download media: ".concat(str4);
        a(paramSQLiteDatabase, paramContentValues, str1, localkbm.b);
        if ((localkbm.a != 4) && (localkbm.a != 5)) {
          break label1216;
        }
        i8 = localkbm.b;
        if (i8 != 0) {
          break label1149;
        }
        localSyncStats3 = this.k.c.stats;
        localSyncStats3.numIoExceptions = (1L + localSyncStats3.numIoExceptions);
        throw new btr("Unable to connect");
        localbty3.m = (1 + localbty3.m);
        continue;
      }
      catch (kbc localkbc)
      {
        localSyncStats1 = this.k.c.stats;
        localSyncStats1.numIoExceptions = (1L + localSyncStats1.numIoExceptions);
        throw new btr("Canceled");
      }
      if (paramInt == btz.b) {}
      switch (i2)
      {
      default: 
        if (this.k.l > 0L) {
          e();
        }
        return localFile.getAbsolutePath();
        if (Log.isLoggable("MediaSyncManager", 3))
        {
          String str5 = String.valueOf(str1);
          if (str5.length() != 0)
          {
            "Cache file not found after downloading: ".concat(str5);
          }
          else
          {
            new String("Cache file not found after downloading: ");
            break label1260;
            String str4;
            SyncStats localSyncStats3;
            SyncStats localSyncStats1;
            localbty3.n = (1 + localbty3.n);
            continue;
            localbty3.o = (1 + localbty3.o);
          }
        }
        break;
      case 1: 
        localbty3.h = (1L + localbty3.h);
        break;
      case 2: 
        localbty3.g = (1L + localbty3.g);
        break;
      case 8: 
        localbty3.g = (1L + localbty3.g);
        continue;
        label1135:
        new String("Could not download media: ");
        continue;
        label1149:
        if ((i8 == 500) || (i8 == 502) || (i8 == 503) || (i8 == 504))
        {
          SyncStats localSyncStats2 = this.k.c.stats;
          localSyncStats2.numIoExceptions = (1L + localSyncStats2.numIoExceptions);
          throw new btr("Throttled by server");
        }
        label1216:
        return null;
        i4 = bool;
        str3 = str9;
        break label259;
        label1229:
        i4 = bool;
        str3 = str1;
        break label259;
        i7 = 3;
        break label530;
        i7 = 4;
        i6 |= 0x800;
        break label530;
        label1260:
        l2 = 0L;
      }
    }
  }
  
  private final List<btw> a(SQLiteDatabase paramSQLiteDatabase, int paramInt, boolean paramBoolean)
  {
    List localList = a(paramSQLiteDatabase, true);
    ArrayList localArrayList = new ArrayList(localList.size());
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(new btq(this, paramInt, -1, 0, (String)localIterator.next(), paramBoolean));
    }
    return localArrayList;
  }
  
  private List<String> a(SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean)
  {
    String str1 = this.a.a(this.k.a).b("gaia_id");
    String[] arrayOfString1 = { "cluster_id" };
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = jrf.a(0, new String[] { str1 });
    arrayOfString2[1] = Integer.toString(2);
    String str2 = String.valueOf("view_order");
    String str3;
    String str4;
    if (paramBoolean)
    {
      str3 = " DESC";
      str4 = String.valueOf(str3);
      if (str4.length() == 0) {
        break label193;
      }
    }
    Cursor localCursor;
    ArrayList localArrayList;
    label193:
    for (String str5 = str2.concat(str4);; str5 = new String(str2)) {
      for (;;)
      {
        localCursor = paramSQLiteDatabase.query("all_tiles", arrayOfString1, "view_id = ? AND type = ? AND media_attr & 512 == 0", arrayOfString2, null, null, str5);
        localArrayList = new ArrayList(localCursor.getCount());
        try
        {
          while (localCursor.moveToNext()) {
            localArrayList.add(localCursor.getString(0));
          }
        }
        finally
        {
          localCursor.close();
        }
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  static ojf a(byte[] paramArrayOfByte)
  {
    try
    {
      ojf localojf = (ojf)qat.b(new ojf(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localojf;
    }
    catch (qas localqas) {}
    return null;
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString, int paramInt)
  {
    if (Log.isLoggable("MediaSyncManager", 4)) {
      new StringBuilder(33 + String.valueOf(paramString).length()).append("HTTP error: ").append(paramInt).append(" imageUrl=").append(paramString);
    }
    paramContentValues.clear();
    paramContentValues.put("image_url", paramString);
    paramContentValues.put("size", Integer.valueOf(0));
    paramContentValues.put("http_status", Integer.valueOf(paramInt));
    paramContentValues.put("representation_type", Integer.valueOf(0));
    paramContentValues.put("filename", paramString);
    paramSQLiteDatabase.insertWithOnConflict("media_cache", "image_url", paramContentValues, 4);
  }
  
  private final void a(SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString1, String paramString2, int paramInt)
  {
    File localFile = ((ifj)mbb.a(this.f, ifj.class)).f().a(paramString2);
    if (localFile != null) {
      a(paramSQLiteDatabase, paramContentValues, paramString1, paramString2, localFile.length(), paramInt);
    }
  }
  
  /* Error */
  private final void a(SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString1, String paramString2, long paramLong, int paramInt)
  {
    // Byte code:
    //   0: ldc 158
    //   2: iconst_2
    //   3: invokestatic 164	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   6: ifeq +92 -> 98
    //   9: iload 7
    //   11: invokestatic 430	btl:a	(I)Ljava/lang/String;
    //   14: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   17: astore 18
    //   19: new 264	java/lang/StringBuilder
    //   22: dup
    //   23: bipush 68
    //   25: aload_3
    //   26: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: invokevirtual 172	java/lang/String:length	()I
    //   32: iadd
    //   33: aload 4
    //   35: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   38: invokevirtual 172	java/lang/String:length	()I
    //   41: iadd
    //   42: aload 18
    //   44: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   47: invokevirtual 172	java/lang/String:length	()I
    //   50: iadd
    //   51: invokespecial 266	java/lang/StringBuilder:<init>	(I)V
    //   54: ldc_w 620
    //   57: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_3
    //   61: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: ldc_w 622
    //   67: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload 4
    //   72: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc_w 624
    //   78: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: lload 5
    //   83: invokevirtual 277	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   86: ldc_w 626
    //   89: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload 18
    //   94: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_2
    //   99: invokevirtual 605	android/content/ContentValues:clear	()V
    //   102: aload_2
    //   103: ldc 116
    //   105: aload_3
    //   106: invokevirtual 368	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: aload_2
    //   110: ldc 55
    //   112: aload 4
    //   114: invokevirtual 368	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: aload_2
    //   118: ldc 57
    //   120: lload 5
    //   122: invokestatic 629	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   125: invokevirtual 632	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   128: aload_2
    //   129: ldc_w 376
    //   132: sipush 200
    //   135: invokestatic 371	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   138: invokevirtual 374	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   141: aload_2
    //   142: ldc 59
    //   144: iload 7
    //   146: invokestatic 371	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   149: invokevirtual 374	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   152: iconst_1
    //   153: anewarray 33	java/lang/String
    //   156: dup
    //   157: iconst_0
    //   158: aload 4
    //   160: aastore
    //   161: astore 8
    //   163: aload_1
    //   164: ldc 114
    //   166: getstatic 63	btl:l	[Ljava/lang/String;
    //   169: ldc_w 634
    //   172: aload 8
    //   174: aconst_null
    //   175: aconst_null
    //   176: aconst_null
    //   177: invokevirtual 413	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   180: astore 9
    //   182: aload 9
    //   184: invokeinterface 637 1 0
    //   189: ifeq +56 -> 245
    //   192: aload 9
    //   194: iconst_0
    //   195: invokeinterface 417 2 0
    //   200: lstore 14
    //   202: aload_1
    //   203: ldc 114
    //   205: aload_2
    //   206: ldc_w 634
    //   209: aload 8
    //   211: invokevirtual 641	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   214: pop
    //   215: aload_0
    //   216: getfield 237	btl:k	Lbty;
    //   219: astore 17
    //   221: aload 17
    //   223: aload 17
    //   225: getfield 643	bty:j	J
    //   228: lload 5
    //   230: lload 14
    //   232: lsub
    //   233: ladd
    //   234: putfield 643	bty:j	J
    //   237: aload 9
    //   239: invokeinterface 184 1 0
    //   244: return
    //   245: aload_1
    //   246: ldc 114
    //   248: ldc 55
    //   250: aload_2
    //   251: invokevirtual 646	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   254: pop2
    //   255: aload_0
    //   256: getfield 237	btl:k	Lbty;
    //   259: astore 13
    //   261: aload 13
    //   263: lload 5
    //   265: aload 13
    //   267: getfield 643	bty:j	J
    //   270: ladd
    //   271: putfield 643	bty:j	J
    //   274: goto -37 -> 237
    //   277: astore 10
    //   279: aload 9
    //   281: invokeinterface 184 1 0
    //   286: aload 10
    //   288: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	289	0	this	btl
    //   0	289	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	289	2	paramContentValues	ContentValues
    //   0	289	3	paramString1	String
    //   0	289	4	paramString2	String
    //   0	289	5	paramLong	long
    //   0	289	7	paramInt	int
    //   161	49	8	arrayOfString	String[]
    //   180	100	9	localCursor	Cursor
    //   277	10	10	localObject	Object
    //   259	7	13	localbty1	bty
    //   200	31	14	l1	long
    //   219	5	17	localbty2	bty
    //   17	76	18	str	String
    // Exception table:
    //   from	to	target	type
    //   182	237	277	finally
    //   245	274	277	finally
  }
  
  private final void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2)
  {
    ContentValues localContentValues = new ContentValues();
    Cursor localCursor = paramSQLiteDatabase.query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, null, null, null);
    for (;;)
    {
      try
      {
        if (!localCursor.moveToNext()) {
          break;
        }
        String str1 = localCursor.getString(0);
        ipm localipm = jrf.a(localCursor.getLong(1));
        ipf localipf1 = ipf.a(this.f, str1, localipm);
        a(paramSQLiteDatabase, localContentValues, str1, this.n.a(localipf1, 2, 17410), 1);
        if (localipm == ipm.b)
        {
          String str2 = mar.a(a(localCursor.getBlob(2)));
          if ((str2 != null) && (a(this.k.a, str1) == null))
          {
            ipf localipf2 = ipf.a(this.f, str2, localipm);
            a(paramSQLiteDatabase, localContentValues, str1, this.n.a(localipf2, 4, 17410), 8);
            ipb localipb = this.n;
            ipk localipk = localipb.a(localipf2, 4, 0, 0, -1, null, null, 17410);
            a(paramSQLiteDatabase, localContentValues, str1, new iph(localipb.a, localipk).e(), 8);
          }
        }
        else
        {
          a(paramSQLiteDatabase, localContentValues, str1, this.n.a(localipf1, 3, 17410), 2);
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, Set<String> paramSet, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
  {
    Cursor localCursor = paramSQLiteDatabase.query(paramString1, new String[] { paramString2 }, paramString3, paramArrayOfString, null, null, null);
    try
    {
      if (localCursor.moveToNext()) {
        paramSet.add(localCursor.getString(0));
      }
      return;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private final void a(Set<String> paramSet)
  {
    int i1 = 0;
    iab localiab = ((ifj)mbb.a(this.f, ifj.class)).f();
    Iterator localIterator = paramSet.iterator();
    int i2 = 0;
    while (localIterator.hasNext()) {
      if (new File(localiab.b((String)localIterator.next())).delete()) {
        i2++;
      } else {
        i1++;
      }
    }
    if (Log.isLoggable("MediaSyncManager", 4)) {
      new StringBuilder(58).append("[Delete Unknown] deleted: ").append(i2).append(", failed: ").append(i1);
    }
  }
  
  private final boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong)
  {
    if (paramString.startsWith("content")) {
      return false;
    }
    if (!new File(((ifj)mbb.a(this.f, ifj.class)).f().b(paramString)).delete()) {
      return false;
    }
    bty localbty = this.k;
    localbty.j -= paramLong;
    paramSQLiteDatabase.delete("media_cache", "filename = ?", new String[] { paramString });
    return true;
  }
  
  private final List<btv> b(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    List localList = a(paramSQLiteDatabase, false);
    ArrayList localArrayList = new ArrayList(localList.size());
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(new btp(this, paramInt, (String)localIterator.next()));
    }
    return localArrayList;
  }
  
  private final void b()
  {
    if (this.k.b.b()) {}
    do
    {
      do
      {
        int i3;
        do
        {
          do
          {
            return;
            int i1 = this.k.a;
            SQLiteDatabase localSQLiteDatabase1 = bqj.a(this.f, i1).getWritableDatabase();
            if (DatabaseUtils.longForQuery(localSQLiteDatabase1, "SELECT count(*) FROM media_cache", null) == 0L)
            {
              a(localSQLiteDatabase1, "all_photos", new String[] { "image_url", "media_attr", "data" }, "all_photos.image_url IS NOT NULL AND is_primary = 1 AND (has_edit_list = 1 OR local_content_uri IS NULL)", null);
              String str4 = this.a.a(this.k.a).b("gaia_id");
              String[] arrayOfString2 = { "image_url", "media_attr", "data" };
              String str5 = jrf.a(0, new String[] { str4 });
              String[] arrayOfString3 = new String[4];
              arrayOfString3[0] = Integer.toString(4);
              arrayOfString3[1] = str5;
              arrayOfString3[2] = str5;
              arrayOfString3[3] = Integer.toString(2);
              a(localSQLiteDatabase1, "all_tiles", arrayOfString2, "type = ? AND (view_id = ? OR view_id IN (SELECT cluster_id FROM all_tiles WHERE view_id = ? AND type = ? AND media_attr & 512 == 0))", arrayOfString3);
            }
            long l1 = System.currentTimeMillis();
            HashSet localHashSet1 = new HashSet();
            Iterator localIterator1 = a().iterator();
            while (localIterator1.hasNext())
            {
              int i4 = ((Integer)localIterator1.next()).intValue();
              SQLiteDatabase localSQLiteDatabase2 = bqj.a(this.f, i4).getReadableDatabase();
              String str3 = jrf.a(0, new String[] { this.a.a(this.k.a).b("gaia_id") });
              String[] arrayOfString1 = new String[4];
              arrayOfString1[0] = Integer.toString(4);
              arrayOfString1[1] = str3;
              arrayOfString1[2] = str3;
              arrayOfString1[3] = Integer.toString(2);
              a(localSQLiteDatabase2, localHashSet1, "all_tiles", "image_url", "type = ? AND (view_id = ? OR view_id IN (SELECT cluster_id FROM all_tiles WHERE view_id = ? AND type = ? AND media_attr & 512 == 0))", arrayOfString1);
              a(localSQLiteDatabase2, localHashSet1, "all_photos", "image_url", "all_photos.image_url IS NOT NULL AND is_primary = 1 AND (has_edit_list = 1 OR local_content_uri IS NULL)", null);
            }
            iab localiab = ((ifj)mbb.a(this.f, ifj.class)).f();
            ArrayList localArrayList = new ArrayList();
            if (localiab.a().exists()) {
              localiab.a(localiab.a(), localArrayList);
            }
            HashSet localHashSet2 = new HashSet(localArrayList.size());
            Iterator localIterator2 = localArrayList.iterator();
            while (localIterator2.hasNext()) {
              localHashSet2.add(((File)localIterator2.next()).getName());
            }
            Iterator localIterator3 = a().iterator();
            int i2 = 0;
            while (localIterator3.hasNext()) {
              i2 += a(((Integer)localIterator3.next()).intValue(), localHashSet1, localHashSet2);
            }
            a(localHashSet2);
            if (Log.isLoggable("MediaSyncManager", 4))
            {
              String str2 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
              new StringBuilder(54 + String.valueOf(str2).length()).append("[Delete Unreferenced] deleted: ").append(i2).append(", duration: ").append(str2);
            }
          } while (this.k.b.b());
          f();
          long l2 = Environment.getDataDirectory().getFreeSpace();
          long l3 = ((ifj)mbb.a(this.f, ifj.class)).f().e();
          long l4 = ((hyi)mbb.a(this.f, hyi.class)).c(aup.b, this.k.a).longValue();
          boolean bool = l2 + l3 < l4;
          i3 = 0;
          if (bool) {
            i3 = 1;
          }
        } while (i3 != 0);
        this.k.i = c();
      } while (this.k.b.b());
      try
      {
        d();
        return;
      }
      catch (btr localbtr) {}
    } while (!Log.isLoggable("MediaSyncManager", 4));
    String str1 = String.valueOf(localbtr.getMessage());
    if (str1.length() != 0)
    {
      "Ending Media Sync: ".concat(str1);
      return;
    }
    new String("Ending Media Sync: ");
  }
  
  private final void b(int paramInt)
  {
    PreferenceManager.getDefaultSharedPreferences(this.f).edit().putInt("one_off_download_count", paramInt).apply();
  }
  
  private final btf c()
  {
    long l1 = System.currentTimeMillis();
    long l2 = this.k.d - this.k.j;
    long l3 = this.k.l + this.k.b() - l2;
    if (Log.isLoggable("MediaSyncManager", 4))
    {
      long l4 = this.k.j;
      long l5 = Math.max(0L, l3);
      new StringBuilder(94).append("usedSpace: ").append(l4).append(", available: ").append(l2).append(", needed: ").append(l5);
    }
    if (l3 <= 0L) {
      return null;
    }
    btf localbtf = new btf();
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      btg localbtg = a(((Integer)localIterator.next()).intValue(), l3);
      localbtf.a.add(localbtg);
    }
    localbtf.a(l3);
    localbtf.a();
    if (Log.isLoggable("MediaSyncManager", 4))
    {
      String str1 = String.valueOf(localbtf.toString());
      String str2 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
      new StringBuilder(41 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("[Create cache eviction plan] ").append(str1).append(", duration: ").append(str2);
    }
    return localbtf;
  }
  
  private final void c(int paramInt)
  {
    PreferenceManager.getDefaultSharedPreferences(this.f).edit().putInt("sync_download_count", paramInt).apply();
  }
  
  private final void d()
  {
    long l1 = System.currentTimeMillis();
    int i1 = this.k.a;
    SQLiteDatabase localSQLiteDatabase = bqj.a(this.f, i1).getWritableDatabase();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new btn(this, 1, 50));
    localArrayList.add(new bts(this, 1, 50));
    localArrayList.add(new btn(this, 2, 50));
    localArrayList.add(new bts(this, 2, 50));
    localArrayList.add(new btn(this, 1));
    localArrayList.add(new bts(this, 1));
    localArrayList.add(new btn(this, 2));
    localArrayList.addAll(b(localSQLiteDatabase, 1));
    localArrayList.addAll(b(localSQLiteDatabase, 2));
    Iterator localIterator = localArrayList.iterator();
    btv localbtv;
    String str2;
    String[] arrayOfString1;
    String str3;
    String[] arrayOfString2;
    String str4;
    String str5;
    if (localIterator.hasNext())
    {
      localbtv = (btv)localIterator.next();
      if (!localbtv.c.k.a(localbtv.g(), localbtv.a))
      {
        str2 = localbtv.a();
        arrayOfString1 = localbtv.b();
        str3 = localbtv.c();
        arrayOfString2 = localbtv.d();
        str4 = localbtv.e();
        str5 = localbtv.f();
        if (localbtv.b != -1) {
          break label370;
        }
      }
    }
    label370:
    for (String str6 = null;; str6 = Integer.toString(localbtv.b))
    {
      localbtv.a(localSQLiteDatabase, localSQLiteDatabase.query(true, str2, arrayOfString1, str3, arrayOfString2, str4, null, str5, str6), localbtv.a, localbtv.i());
      if (!this.k.a()) {
        break;
      }
      if (Log.isLoggable("MediaSyncManager", 4))
      {
        String str1 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
        if (str1.length() == 0) {
          break label383;
        }
        "[downloadMedia] duration: ".concat(str1);
      }
      return;
    }
    label383:
    new String("[downloadMedia] duration: ");
  }
  
  private final void e()
  {
    long l1 = this.k.d - this.k.j;
    long l2 = this.k.b() - l1;
    while (l2 > 0L)
    {
      if (this.k.i == null) {
        throw new btu();
      }
      bth localbth = this.k.i.b();
      if (localbth == null) {
        throw new btr("Out of storage");
      }
      int i1 = localbth.a;
      if (a(bqj.a(this.f, i1).getWritableDatabase(), localbth.d, localbth.e))
      {
        l2 -= localbth.e;
        bty localbty1 = this.k;
        localbty1.p = (1 + localbty1.p);
        bty localbty2 = this.k;
        localbty2.q += localbth.e;
      }
    }
  }
  
  private final void f()
  {
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      int i1 = ((Integer)localIterator.next()).intValue();
      SQLiteDatabase localSQLiteDatabase = bqj.a(this.f, i1).getReadableDatabase();
      iab localiab = ((ifj)mbb.a(this.f, ifj.class)).f();
      String[] arrayOfString = { "filename" };
      ContentResolver localContentResolver = this.f.getContentResolver();
      Cursor localCursor = localSQLiteDatabase.query("media_cache", arrayOfString, "http_status = 200", null, null, null, null);
      try
      {
        String str;
        do
        {
          for (;;)
          {
            if (!localCursor.moveToNext()) {
              break label194;
            }
            str = localCursor.getString(0);
            if (!str.startsWith("content")) {
              break;
            }
            if (mfq.a(localContentResolver, Uri.parse(str)) == null) {
              localSQLiteDatabase.delete("media_cache", "filename = ?", new String[] { str });
            }
          }
        } while (localiab.a(str) != null);
      }
      finally
      {
        localCursor.close();
      }
      throw new btu();
      label194:
      localCursor.close();
    }
  }
  
  private final void g()
  {
    long l1 = System.currentTimeMillis();
    this.k.j = 0L;
    Iterator localIterator = a().iterator();
    while (localIterator.hasNext())
    {
      int i1 = ((Integer)localIterator.next()).intValue();
      SQLiteDatabase localSQLiteDatabase = bqj.a(this.f, i1).getWritableDatabase();
      localSQLiteDatabase.delete("media_cache", null, null);
      a(localSQLiteDatabase, "all_photos", new String[] { "image_url", "media_attr", "data" }, "all_photos.image_url IS NOT NULL AND is_primary = 1 AND (has_edit_list = 1 OR local_content_uri IS NULL)", null);
      String str2 = this.a.a(this.k.a).b("gaia_id");
      String[] arrayOfString1 = { "image_url", "media_attr", "data" };
      String str3 = jrf.a(0, new String[] { str2 });
      String[] arrayOfString2 = new String[4];
      arrayOfString2[0] = Integer.toString(4);
      arrayOfString2[1] = str3;
      arrayOfString2[2] = str3;
      arrayOfString2[3] = Integer.toString(2);
      a(localSQLiteDatabase, "all_tiles", arrayOfString1, "type = ? AND (view_id = ? OR view_id IN (SELECT cluster_id FROM all_tiles WHERE view_id = ? AND type = ? AND media_attr & 512 == 0))", arrayOfString2);
    }
    if (Log.isLoggable("MediaSyncManager", 4))
    {
      String str1 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
      if (str1.length() != 0) {
        "[Rebuild media sync tables] duration: ".concat(str1);
      }
    }
    else
    {
      return;
    }
    new String("[Rebuild media sync tables] duration: ");
  }
  
  /* Error */
  public final String a(btx parambtx)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: new 239	bty
    //   6: dup
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 69	btl:f	Landroid/content/Context;
    //   12: aload_1
    //   13: invokeinterface 915 1 0
    //   18: new 707	bup
    //   21: dup
    //   22: invokespecial 916	bup:<init>	()V
    //   25: new 519	android/content/SyncResult
    //   28: dup
    //   29: invokespecial 917	android/content/SyncResult:<init>	()V
    //   32: aconst_null
    //   33: lconst_0
    //   34: invokespecial 920	bty:<init>	(Lbtl;Landroid/content/Context;ILbup;Landroid/content/SyncResult;Lois;J)V
    //   37: putfield 237	btl:k	Lbty;
    //   40: aload_0
    //   41: getfield 69	btl:f	Landroid/content/Context;
    //   44: aload_1
    //   45: invokeinterface 915 1 0
    //   50: invokestatic 108	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   53: invokevirtual 112	bqj:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   56: astore_3
    //   57: iconst_1
    //   58: aload_0
    //   59: getfield 921	btl:o	I
    //   62: iadd
    //   63: istore 8
    //   65: aload_0
    //   66: iload 8
    //   68: putfield 921	btl:o	I
    //   71: aload_0
    //   72: iload 8
    //   74: invokespecial 100	btl:b	(I)V
    //   77: aload_0
    //   78: aload_3
    //   79: new 363	android/content/ContentValues
    //   82: dup
    //   83: invokespecial 364	android/content/ContentValues:<init>	()V
    //   86: aload_1
    //   87: getstatic 923	btz:c	I
    //   90: invokespecial 555	btl:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/content/ContentValues;Lbtx;I)Ljava/lang/String;
    //   93: astore 9
    //   95: aload 9
    //   97: astore 6
    //   99: aload_0
    //   100: aconst_null
    //   101: putfield 237	btl:k	Lbty;
    //   104: aload_0
    //   105: monitorexit
    //   106: aload 6
    //   108: areturn
    //   109: astore 7
    //   111: aload_0
    //   112: invokespecial 925	btl:g	()V
    //   115: aload_0
    //   116: aconst_null
    //   117: putfield 237	btl:k	Lbty;
    //   120: aconst_null
    //   121: astore 6
    //   123: goto -19 -> 104
    //   126: astore_2
    //   127: aload_0
    //   128: monitorexit
    //   129: aload_2
    //   130: athrow
    //   131: astore 5
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield 237	btl:k	Lbty;
    //   138: aconst_null
    //   139: astore 6
    //   141: goto -37 -> 104
    //   144: astore 4
    //   146: aload_0
    //   147: aconst_null
    //   148: putfield 237	btl:k	Lbty;
    //   151: aload 4
    //   153: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	this	btl
    //   0	154	1	parambtx	btx
    //   126	4	2	localObject1	Object
    //   56	23	3	localSQLiteDatabase	SQLiteDatabase
    //   144	8	4	localObject2	Object
    //   131	1	5	localbtr	btr
    //   97	43	6	str1	String
    //   109	1	7	localbtu	btu
    //   63	10	8	i1	int
    //   93	3	9	str2	String
    // Exception table:
    //   from	to	target	type
    //   57	95	109	btu
    //   2	57	126	finally
    //   99	104	126	finally
    //   115	120	126	finally
    //   133	138	126	finally
    //   146	154	126	finally
    //   57	95	131	btr
    //   57	95	144	finally
    //   111	115	144	finally
  }
  
  final List<Integer> a()
  {
    return this.a.a(new String[] { "logged_in" });
  }
  
  /* Error */
  public final void a(int paramInt, bup parambup, SyncResult paramSyncResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 69	btl:f	Landroid/content/Context;
    //   6: invokestatic 787	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   9: astore 5
    //   11: aload 5
    //   13: ldc_w 933
    //   16: lconst_0
    //   17: invokeinterface 936 4 0
    //   22: lstore 6
    //   24: aload_0
    //   25: getfield 69	btl:f	Landroid/content/Context;
    //   28: iload_1
    //   29: invokestatic 941	aum:a	(Landroid/content/Context;I)Lois;
    //   32: astore 8
    //   34: aload_0
    //   35: new 239	bty
    //   38: dup
    //   39: aload_0
    //   40: aload_0
    //   41: getfield 69	btl:f	Landroid/content/Context;
    //   44: iload_1
    //   45: aload_2
    //   46: aload_3
    //   47: aload 8
    //   49: lload 6
    //   51: invokespecial 920	bty:<init>	(Lbtl;Landroid/content/Context;ILbup;Landroid/content/SyncResult;Lois;J)V
    //   54: putfield 237	btl:k	Lbty;
    //   57: aload_0
    //   58: invokespecial 943	btl:b	()V
    //   61: ldc 158
    //   63: iconst_4
    //   64: invokestatic 164	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   67: ifeq +42 -> 109
    //   70: aload_0
    //   71: getfield 237	btl:k	Lbty;
    //   74: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   77: astore 32
    //   79: new 264	java/lang/StringBuilder
    //   82: dup
    //   83: bipush 22
    //   85: aload 32
    //   87: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   90: invokevirtual 172	java/lang/String:length	()I
    //   93: iadd
    //   94: invokespecial 266	java/lang/StringBuilder:<init>	(I)V
    //   97: ldc_w 945
    //   100: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload 32
    //   105: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload_0
    //   110: getfield 237	btl:k	Lbty;
    //   113: getfield 473	bty:k	J
    //   116: lconst_0
    //   117: lcmp
    //   118: ifle +27 -> 145
    //   121: aload 5
    //   123: invokeinterface 793 1 0
    //   128: ldc_w 933
    //   131: invokestatic 724	java/lang/System:currentTimeMillis	()J
    //   134: invokeinterface 949 4 0
    //   139: invokeinterface 952 1 0
    //   144: pop
    //   145: aload_0
    //   146: getfield 237	btl:k	Lbty;
    //   149: getfield 705	bty:b	Lbup;
    //   152: astore 27
    //   154: aload 27
    //   156: aload_0
    //   157: getfield 237	btl:k	Lbty;
    //   160: getfield 539	bty:n	I
    //   163: aload 27
    //   165: getfield 953	bup:b	I
    //   168: iadd
    //   169: putfield 953	bup:b	I
    //   172: aload_0
    //   173: getfield 237	btl:k	Lbty;
    //   176: getfield 705	bty:b	Lbup;
    //   179: astore 28
    //   181: aload 28
    //   183: aload_0
    //   184: getfield 237	btl:k	Lbty;
    //   187: getfield 541	bty:o	I
    //   190: aload 28
    //   192: getfield 954	bup:a	I
    //   195: iadd
    //   196: putfield 954	bup:a	I
    //   199: aload_0
    //   200: getfield 237	btl:k	Lbty;
    //   203: getfield 705	bty:b	Lbup;
    //   206: astore 29
    //   208: aload 29
    //   210: aload_0
    //   211: getfield 237	btl:k	Lbty;
    //   214: getfield 535	bty:m	I
    //   217: aload 29
    //   219: getfield 955	bup:c	I
    //   222: iadd
    //   223: putfield 955	bup:c	I
    //   226: aload_0
    //   227: getfield 237	btl:k	Lbty;
    //   230: getfield 705	bty:b	Lbup;
    //   233: aload_0
    //   234: getfield 237	btl:k	Lbty;
    //   237: getfield 473	bty:k	J
    //   240: invokevirtual 956	bup:a	(J)V
    //   243: aload_0
    //   244: getfield 237	btl:k	Lbty;
    //   247: getfield 705	bty:b	Lbup;
    //   250: astore 30
    //   252: aload 30
    //   254: aload_0
    //   255: getfield 237	btl:k	Lbty;
    //   258: getfield 892	bty:p	I
    //   261: aload 30
    //   263: getfield 958	bup:k	I
    //   266: iadd
    //   267: putfield 958	bup:k	I
    //   270: aload_0
    //   271: aconst_null
    //   272: putfield 237	btl:k	Lbty;
    //   275: aload_0
    //   276: monitorexit
    //   277: return
    //   278: astore 17
    //   280: aload_0
    //   281: invokespecial 925	btl:g	()V
    //   284: aload_0
    //   285: invokespecial 943	btl:b	()V
    //   288: ldc 158
    //   290: iconst_4
    //   291: invokestatic 164	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   294: ifeq +42 -> 336
    //   297: aload_0
    //   298: getfield 237	btl:k	Lbty;
    //   301: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   304: astore 25
    //   306: new 264	java/lang/StringBuilder
    //   309: dup
    //   310: bipush 22
    //   312: aload 25
    //   314: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   317: invokevirtual 172	java/lang/String:length	()I
    //   320: iadd
    //   321: invokespecial 266	java/lang/StringBuilder:<init>	(I)V
    //   324: ldc_w 945
    //   327: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: aload 25
    //   332: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: pop
    //   336: aload_0
    //   337: getfield 237	btl:k	Lbty;
    //   340: getfield 473	bty:k	J
    //   343: lconst_0
    //   344: lcmp
    //   345: ifle +27 -> 372
    //   348: aload 5
    //   350: invokeinterface 793 1 0
    //   355: ldc_w 933
    //   358: invokestatic 724	java/lang/System:currentTimeMillis	()J
    //   361: invokeinterface 949 4 0
    //   366: invokeinterface 952 1 0
    //   371: pop
    //   372: aload_0
    //   373: getfield 237	btl:k	Lbty;
    //   376: getfield 705	bty:b	Lbup;
    //   379: astore 20
    //   381: aload 20
    //   383: aload_0
    //   384: getfield 237	btl:k	Lbty;
    //   387: getfield 539	bty:n	I
    //   390: aload 20
    //   392: getfield 953	bup:b	I
    //   395: iadd
    //   396: putfield 953	bup:b	I
    //   399: aload_0
    //   400: getfield 237	btl:k	Lbty;
    //   403: getfield 705	bty:b	Lbup;
    //   406: astore 21
    //   408: aload 21
    //   410: aload_0
    //   411: getfield 237	btl:k	Lbty;
    //   414: getfield 541	bty:o	I
    //   417: aload 21
    //   419: getfield 954	bup:a	I
    //   422: iadd
    //   423: putfield 954	bup:a	I
    //   426: aload_0
    //   427: getfield 237	btl:k	Lbty;
    //   430: getfield 705	bty:b	Lbup;
    //   433: astore 22
    //   435: aload 22
    //   437: aload_0
    //   438: getfield 237	btl:k	Lbty;
    //   441: getfield 535	bty:m	I
    //   444: aload 22
    //   446: getfield 955	bup:c	I
    //   449: iadd
    //   450: putfield 955	bup:c	I
    //   453: aload_0
    //   454: getfield 237	btl:k	Lbty;
    //   457: getfield 705	bty:b	Lbup;
    //   460: aload_0
    //   461: getfield 237	btl:k	Lbty;
    //   464: getfield 473	bty:k	J
    //   467: invokevirtual 956	bup:a	(J)V
    //   470: aload_0
    //   471: getfield 237	btl:k	Lbty;
    //   474: getfield 705	bty:b	Lbup;
    //   477: astore 23
    //   479: aload 23
    //   481: aload_0
    //   482: getfield 237	btl:k	Lbty;
    //   485: getfield 892	bty:p	I
    //   488: aload 23
    //   490: getfield 958	bup:k	I
    //   493: iadd
    //   494: putfield 958	bup:k	I
    //   497: aload_0
    //   498: aconst_null
    //   499: putfield 237	btl:k	Lbty;
    //   502: goto -227 -> 275
    //   505: astore 4
    //   507: aload_0
    //   508: monitorexit
    //   509: aload 4
    //   511: athrow
    //   512: astore 18
    //   514: ldc 158
    //   516: ldc_w 960
    //   519: invokestatic 963	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   522: pop
    //   523: goto -235 -> 288
    //   526: astore 9
    //   528: ldc 158
    //   530: iconst_4
    //   531: invokestatic 164	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   534: ifeq +42 -> 576
    //   537: aload_0
    //   538: getfield 237	btl:k	Lbty;
    //   541: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   544: astore 15
    //   546: new 264	java/lang/StringBuilder
    //   549: dup
    //   550: bipush 22
    //   552: aload 15
    //   554: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   557: invokevirtual 172	java/lang/String:length	()I
    //   560: iadd
    //   561: invokespecial 266	java/lang/StringBuilder:<init>	(I)V
    //   564: ldc_w 945
    //   567: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   570: aload 15
    //   572: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   575: pop
    //   576: aload_0
    //   577: getfield 237	btl:k	Lbty;
    //   580: getfield 473	bty:k	J
    //   583: lconst_0
    //   584: lcmp
    //   585: ifle +27 -> 612
    //   588: aload 5
    //   590: invokeinterface 793 1 0
    //   595: ldc_w 933
    //   598: invokestatic 724	java/lang/System:currentTimeMillis	()J
    //   601: invokeinterface 949 4 0
    //   606: invokeinterface 952 1 0
    //   611: pop
    //   612: aload_0
    //   613: getfield 237	btl:k	Lbty;
    //   616: getfield 705	bty:b	Lbup;
    //   619: astore 10
    //   621: aload 10
    //   623: aload_0
    //   624: getfield 237	btl:k	Lbty;
    //   627: getfield 539	bty:n	I
    //   630: aload 10
    //   632: getfield 953	bup:b	I
    //   635: iadd
    //   636: putfield 953	bup:b	I
    //   639: aload_0
    //   640: getfield 237	btl:k	Lbty;
    //   643: getfield 705	bty:b	Lbup;
    //   646: astore 11
    //   648: aload 11
    //   650: aload_0
    //   651: getfield 237	btl:k	Lbty;
    //   654: getfield 541	bty:o	I
    //   657: aload 11
    //   659: getfield 954	bup:a	I
    //   662: iadd
    //   663: putfield 954	bup:a	I
    //   666: aload_0
    //   667: getfield 237	btl:k	Lbty;
    //   670: getfield 705	bty:b	Lbup;
    //   673: astore 12
    //   675: aload 12
    //   677: aload_0
    //   678: getfield 237	btl:k	Lbty;
    //   681: getfield 535	bty:m	I
    //   684: aload 12
    //   686: getfield 955	bup:c	I
    //   689: iadd
    //   690: putfield 955	bup:c	I
    //   693: aload_0
    //   694: getfield 237	btl:k	Lbty;
    //   697: getfield 705	bty:b	Lbup;
    //   700: aload_0
    //   701: getfield 237	btl:k	Lbty;
    //   704: getfield 473	bty:k	J
    //   707: invokevirtual 956	bup:a	(J)V
    //   710: aload_0
    //   711: getfield 237	btl:k	Lbty;
    //   714: getfield 705	bty:b	Lbup;
    //   717: astore 13
    //   719: aload 13
    //   721: aload_0
    //   722: getfield 237	btl:k	Lbty;
    //   725: getfield 892	bty:p	I
    //   728: aload 13
    //   730: getfield 958	bup:k	I
    //   733: iadd
    //   734: putfield 958	bup:k	I
    //   737: aload_0
    //   738: aconst_null
    //   739: putfield 237	btl:k	Lbty;
    //   742: aload 9
    //   744: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	745	0	this	btl
    //   0	745	1	paramInt	int
    //   0	745	2	parambup	bup
    //   0	745	3	paramSyncResult	SyncResult
    //   505	5	4	localObject1	Object
    //   9	580	5	localSharedPreferences	SharedPreferences
    //   22	28	6	l1	long
    //   32	16	8	localois	ois
    //   526	217	9	localObject2	Object
    //   619	12	10	localbup1	bup
    //   646	12	11	localbup2	bup
    //   673	12	12	localbup3	bup
    //   717	12	13	localbup4	bup
    //   544	27	15	str1	String
    //   278	1	17	localbtu1	btu
    //   512	1	18	localbtu2	btu
    //   379	12	20	localbup5	bup
    //   406	12	21	localbup6	bup
    //   433	12	22	localbup7	bup
    //   477	12	23	localbup8	bup
    //   304	27	25	str2	String
    //   152	12	27	localbup9	bup
    //   179	12	28	localbup10	bup
    //   206	12	29	localbup11	bup
    //   250	12	30	localbup12	bup
    //   77	27	32	str3	String
    // Exception table:
    //   from	to	target	type
    //   57	61	278	btu
    //   2	57	505	finally
    //   61	109	505	finally
    //   109	145	505	finally
    //   145	275	505	finally
    //   288	336	505	finally
    //   336	372	505	finally
    //   372	502	505	finally
    //   528	576	505	finally
    //   576	612	505	finally
    //   612	745	505	finally
    //   284	288	512	btu
    //   57	61	526	finally
    //   280	284	526	finally
    //   284	288	526	finally
    //   514	523	526	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btl
 * JD-Core Version:    0.7.0.1
 */