import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;
import java.io.IOException;

public final class hbm
{
  private static final String a = MediaRecordEntry.a.a;
  private static final String b;
  private static final String c;
  private static final String d;
  private static final String e;
  
  static
  {
    String str1 = String.valueOf("upload_account_id = -1 AND _id > ? AND media_url NOT IN ( SELECT media_url FROM ");
    String str2 = a;
    String str3 = String.valueOf("upload_account_id");
    String str4 = String.valueOf("bucket_id");
    String str5 = String.valueOf("bucket_id");
    String str6 = String.valueOf("bucket_id");
    String str7 = String.valueOf("exclude_bucket");
    b = 57 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + str1 + str2 + " WHERE " + str3 + " = ? )" + " AND (" + str4 + " IS NULL OR " + str5 + " NOT IN ( SELECT " + str6 + " FROM " + str7 + " ))";
    String str8 = String.valueOf(MediaRecordEntry.a.a);
    String str9 = String.valueOf("upload_account_id = ? AND upload_state = 100");
    c = 28 + String.valueOf(str8).length() + String.valueOf(str9).length() + "SELECT count(*) FROM " + str8 + " WHERE " + str9;
    String str10 = a;
    String str11 = String.valueOf("upload_account_id = ? AND ( upload_state = 100 OR upload_state = 200 ) AND upload_reason = ?");
    d = 28 + String.valueOf(str10).length() + String.valueOf(str11).length() + "SELECT COUNT(*) FROM " + str10 + " WHERE " + str11;
    String str12 = String.valueOf("upload_account_id = -1 AND bucket_id = ? AND media_url NOT IN ( SELECT media_url FROM ");
    String str13 = a;
    String str14 = String.valueOf("upload_account_id");
    e = 13 + String.valueOf(str12).length() + String.valueOf(str13).length() + String.valueOf(str14).length() + str12 + str13 + " WHERE " + str14 + " = ? )";
  }
  
  private static int a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    Cursor localCursor = a(paramSQLiteDatabase, paramInt1, -1L, 500);
    int i = 0;
    try
    {
      while (localCursor.moveToNext())
      {
        MediaRecordEntry localMediaRecordEntry = MediaRecordEntry.a(localCursor);
        localMediaRecordEntry.id = 0L;
        localMediaRecordEntry.mUploadAccountId = paramInt1;
        localMediaRecordEntry.mUploadReason = paramInt2;
        localMediaRecordEntry.mUploadState = 100;
        MediaRecordEntry.a.a(paramSQLiteDatabase, localMediaRecordEntry);
        i++;
      }
      return i;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  static Cursor a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, long paramLong, int paramInt2)
  {
    String str1 = a;
    String[] arrayOfString1 = MediaRecordEntry.a.b;
    String str2 = b;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = Long.toString(paramLong);
    arrayOfString2[1] = Integer.toString(paramInt1);
    return paramSQLiteDatabase.query(true, str1, arrayOfString1, str2, arrayOfString2, null, null, "_id ASC", Integer.toString(paramInt2));
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, int paramInt, String paramString)
  {
    if (paramInt == -1) {}
    int i;
    do
    {
      return;
      i = 0;
      int j;
      do
      {
        j = b(paramSQLiteDatabase, paramInt, paramString);
        if (Log.isLoggable("iu.UploadsManager", 4)) {
          new StringBuilder(56).append("ADD; medias added in batch: ").append(j).append("; iu: ").append(paramInt);
        }
        i += j;
      } while (j > 0);
    } while (!Log.isLoggable("iu.UploadsManager", 4));
    new StringBuilder(60).append("ADD; complete; total scheduled: ").append(i).append("; iu: ").append(paramInt);
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    paramSQLiteDatabase.delete(a, "upload_account_id != -1 AND bucket_id = ? AND upload_state != 400", new String[] { paramString });
  }
  
  public static void a(hci paramhci, int paramInt)
  {
    if (paramInt == -1) {
      return;
    }
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Integer.toString(paramInt);
    paramhci.getWritableDatabase().delete(a, "upload_account_id = ? AND upload_state = 100", arrayOfString);
  }
  
  static void a(hci paramhci, int paramInt1, int paramInt2)
  {
    if ((paramInt2 != 40) && (paramInt2 != 30)) {
      throw new IllegalArgumentException("only REASON_UPLOAD_ALL and REASON_INSTANT_UPLOAD supported");
    }
    SQLiteDatabase localSQLiteDatabase = paramhci.getWritableDatabase();
    String str = a;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = Integer.toString(paramInt1);
    arrayOfString[1] = Integer.toString(paramInt2);
    localSQLiteDatabase.delete(str, "upload_account_id = ? AND ( upload_state = 100 OR upload_state = 200 ) AND upload_reason = ?", arrayOfString);
  }
  
  static boolean a(ContentResolver paramContentResolver, Uri paramUri)
  {
    String str1 = efj.a(paramContentResolver, paramUri, "_data");
    if (str1 != null)
    {
      int i = str1.lastIndexOf('.');
      if (i >= 0) {}
      for (String str2 = str1.substring(i + 1); (!"jpg".equalsIgnoreCase(str2)) && (!"jpeg".equalsIgnoreCase(str2)); str2 = "") {
        return false;
      }
      for (;;)
      {
        try
        {
          hxp localhxp = new hxp();
          try
          {
            localhxp.a(str1);
            int j = hxp.h;
            localhya = localhxp.a(j, localhxp.d(j));
            if (localhya != null) {
              continue;
            }
            localObject = null;
            if ((localObject == null) || (!((String)localObject).contains("Google"))) {
              break label290;
            }
            if (!Log.isLoggable("iu.UploadsManager", 4)) {
              break label292;
            }
            String str4 = String.valueOf(localObject);
            if (str4.length() == 0) {
              continue;
            }
            "*** Found Google EXIF tag; value: ".concat(str4);
          }
          catch (IOException localIOException)
          {
            if (!Log.isLoggable("iu.UploadsManager", 4)) {
              break label294;
            }
          }
          new StringBuilder(37 + String.valueOf(str1).length()).append("INFO: ").append(str1).append(" does not contain any EXIF data");
        }
        catch (Throwable localThrowable)
        {
          hya localhya;
          Object localObject;
          if (!Log.isLoggable("iu.UploadsManager", 4)) {
            continue;
          }
          String str3 = String.valueOf(localThrowable);
          new StringBuilder(27 + String.valueOf(str1).length() + String.valueOf(str3).length()).append("INFO: ").append(str1).append(" error getting EXIF; ").append(str3);
          return false;
        }
        localObject = localhya.a();
      }
      new String("*** Found Google EXIF tag; value: ");
    }
    else
    {
      label290:
      return false;
    }
    label292:
    return true;
    label294:
    return false;
  }
  
  static boolean a(Context paramContext)
  {
    Cursor localCursor = ((hci)mbb.a(paramContext, hci.class)).getReadableDatabase().query(true, a, MediaRecordEntry.a.b, "upload_reason = 30 AND upload_state = 400", null, null, null, null, "1");
    try
    {
      boolean bool = localCursor.moveToFirst();
      return bool;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static boolean a(Context paramContext, int paramInt1, int paramInt2)
  {
    hci localhci = (hci)mbb.a(paramContext, hci.class);
    String str1;
    String[] arrayOfString;
    if (paramInt1 == -1)
    {
      str1 = "upload_account_id != -1 AND upload_state = 200";
      arrayOfString = null;
    }
    for (;;)
    {
      if (Log.isLoggable("iu.UploadsManager", 4))
      {
        String str2 = a;
        String str3 = 28 + String.valueOf(str2).length() + String.valueOf(str1).length() + "SELECT COUNT(*) FROM " + str2 + " WHERE " + str1;
        long l = DatabaseUtils.longForQuery(localhci.getReadableDatabase(), str3, arrayOfString);
        new StringBuilder(40).append("num queued entries: ").append(l);
      }
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("upload_state", Integer.valueOf(100));
      int i = localhci.getWritableDatabase().update(a, localContentValues, str1, arrayOfString);
      if (Log.isLoggable("iu.UploadsManager", 4)) {
        new StringBuilder(32).append("num updated entries: ").append(i);
      }
      if (i <= 0) {
        break;
      }
      return true;
      str1 = "upload_account_id = ? AND upload_state = 200";
      arrayOfString = new String[1];
      arrayOfString[0] = Integer.toString(paramInt1);
    }
    return false;
  }
  
  public static boolean a(Context paramContext, ContentResolver paramContentResolver, SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString, long paramLong, Uri paramUri, boolean paramBoolean1, boolean paramBoolean2)
  {
    hba localhba = (hba)mbb.a(paramContext, hba.class);
    String str1 = paramUri.toString();
    paramContentValues.clear();
    paramContentValues.putNull("album_id");
    paramContentValues.putNull("event_id");
    paramContentValues.put("upload_account_id", Integer.valueOf(-1));
    paramContentValues.put("bucket_id", paramString);
    paramContentValues.put("is_image", Boolean.valueOf(paramBoolean1));
    paramContentValues.put("media_id", Long.valueOf(paramLong));
    paramContentValues.put("media_time", Long.valueOf(efj.a(paramContentResolver, paramUri)));
    String str2 = efj.a(paramContentResolver, paramUri, "_data");
    if (str2 == null) {
      str2 = str1;
    }
    paramContentValues.put("media_hash", Integer.valueOf(str2.hashCode()));
    paramContentValues.put("media_url", str1);
    paramContentValues.put("upload_reason", Integer.valueOf(0));
    paramContentValues.put("upload_state", Integer.valueOf(500));
    MediaRecordEntry.a.a(paramSQLiteDatabase, MediaRecordEntry.a(paramContentValues));
    if ((!paramBoolean2) || (a(paramContentResolver, paramUri))) {
      return false;
    }
    int i = localhba.d();
    paramContentValues.putNull("event_id");
    if (!hbj.a(paramContext))
    {
      paramContentValues.put("upload_account_id", Integer.valueOf(i));
      paramContentValues.put("upload_reason", Integer.valueOf(30));
      paramContentValues.put("upload_state", Integer.valueOf(100));
      MediaRecordEntry.a.a(paramSQLiteDatabase, MediaRecordEntry.a(paramContentValues));
      if (Log.isLoggable("iu.UploadsManager", 4)) {
        new StringBuilder(59).append("NEW; upload media id: ").append(paramLong).append("; iu: ").append(i);
      }
    }
    if (Log.isLoggable("iu.UploadsManager", 4)) {
      new StringBuilder(39).append("NEW; add media id: ").append(paramLong);
    }
    return true;
  }
  
  /* Error */
  private static int b(SQLiteDatabase paramSQLiteDatabase, int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 370	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   4: getstatic 22	hbm:a	Ljava/lang/String;
    //   7: astore 4
    //   9: getstatic 17	com/google/android/libraries/social/autobackup/MediaRecordEntry:a	Liao;
    //   12: getfield 124	iao:b	[Ljava/lang/String;
    //   15: astore 5
    //   17: getstatic 86	hbm:e	Ljava/lang/String;
    //   20: astore 6
    //   22: iconst_2
    //   23: anewarray 26	java/lang/String
    //   26: astore 7
    //   28: aload 7
    //   30: iconst_0
    //   31: aload_2
    //   32: aastore
    //   33: aload 7
    //   35: iconst_1
    //   36: iload_1
    //   37: invokestatic 134	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   40: aastore
    //   41: aload_0
    //   42: aload 4
    //   44: aload 5
    //   46: aload 6
    //   48: aload 7
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: sipush 500
    //   56: invokestatic 134	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   59: invokevirtual 373	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   62: astore 8
    //   64: iconst_0
    //   65: istore 9
    //   67: aload 8
    //   69: invokeinterface 98 1 0
    //   74: ifeq +52 -> 126
    //   77: aload 8
    //   79: invokestatic 101	com/google/android/libraries/social/autobackup/MediaRecordEntry:a	(Landroid/database/Cursor;)Lcom/google/android/libraries/social/autobackup/MediaRecordEntry;
    //   82: astore 11
    //   84: aload 11
    //   86: lconst_0
    //   87: putfield 105	com/google/android/libraries/social/autobackup/MediaRecordEntry:id	J
    //   90: aload 11
    //   92: iload_1
    //   93: putfield 109	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadAccountId	I
    //   96: aload 11
    //   98: bipush 30
    //   100: putfield 112	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadReason	I
    //   103: aload 11
    //   105: bipush 100
    //   107: putfield 115	com/google/android/libraries/social/autobackup/MediaRecordEntry:mUploadState	I
    //   110: getstatic 17	com/google/android/libraries/social/autobackup/MediaRecordEntry:a	Liao;
    //   113: aload_0
    //   114: aload 11
    //   116: invokevirtual 118	iao:a	(Landroid/database/sqlite/SQLiteDatabase;Lial;)J
    //   119: pop2
    //   120: iinc 9 1
    //   123: goto -56 -> 67
    //   126: aload_0
    //   127: invokevirtual 376	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   130: aload 8
    //   132: invokeinterface 121 1 0
    //   137: aload_0
    //   138: invokevirtual 379	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   141: iload 9
    //   143: ireturn
    //   144: astore 10
    //   146: aload 8
    //   148: invokeinterface 121 1 0
    //   153: aload 10
    //   155: athrow
    //   156: astore_3
    //   157: aload_0
    //   158: invokevirtual 379	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   161: aload_3
    //   162: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	163	1	paramInt	int
    //   0	163	2	paramString	String
    //   156	6	3	localObject1	Object
    //   7	36	4	str1	String
    //   15	30	5	arrayOfString1	String[]
    //   20	27	6	str2	String
    //   26	23	7	arrayOfString2	String[]
    //   62	85	8	localCursor	Cursor
    //   65	77	9	i	int
    //   144	10	10	localObject2	Object
    //   82	33	11	localMediaRecordEntry	MediaRecordEntry
    // Exception table:
    //   from	to	target	type
    //   67	120	144	finally
    //   126	130	144	finally
    //   4	64	156	finally
    //   130	137	156	finally
    //   146	156	156	finally
  }
  
  static int b(hci paramhci, int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1) {
      return 0;
    }
    SQLiteDatabase localSQLiteDatabase = paramhci.getReadableDatabase();
    String str = d;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = Integer.toString(paramInt1);
    arrayOfString[1] = Integer.toString(paramInt2);
    return (int)DatabaseUtils.longForQuery(localSQLiteDatabase, str, arrayOfString);
  }
  
  public static MediaRecordEntry b(hci paramhci, int paramInt)
  {
    String str;
    String[] arrayOfString;
    if (paramInt == -1)
    {
      str = "upload_account_id != -1 AND upload_state = 100";
      arrayOfString = null;
    }
    for (;;)
    {
      Cursor localCursor = paramhci.getReadableDatabase().query(a, MediaRecordEntry.a.b, str, arrayOfString, null, null, "upload_reason ASC, upload_state ASC, upload_status ASC, is_image DESC, retry_end_time ASC LIMIT 1");
      try
      {
        if (localCursor.moveToNext())
        {
          MediaRecordEntry localMediaRecordEntry = MediaRecordEntry.a(localCursor);
          return localMediaRecordEntry;
          str = "upload_account_id = ? AND upload_state = 100";
          arrayOfString = new String[1];
          arrayOfString[0] = Integer.toString(paramInt);
          continue;
        }
        return null;
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  public static int c(hci paramhci, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = paramhci.getReadableDatabase();
    String str = c;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Integer.toString(paramInt);
    return (int)DatabaseUtils.longForQuery(localSQLiteDatabase, str, arrayOfString);
  }
  
  static void c(hci paramhci, int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1) {
      throw new IllegalStateException(52 + "can't enable upload for invalid account: " + paramInt1);
    }
    SQLiteDatabase localSQLiteDatabase1 = paramhci.getWritableDatabase();
    int i = 0;
    for (;;)
    {
      localSQLiteDatabase1.beginTransaction();
      try
      {
        int j = a(localSQLiteDatabase1, paramInt1, 40);
        localSQLiteDatabase1.setTransactionSuccessful();
        localSQLiteDatabase1.endTransaction();
        i += j;
        if (j <= 0)
        {
          if (Log.isLoggable("iu.UploadsManager", 4)) {
            new StringBuilder(35).append("START; scheduled ").append(i).append(" photos");
          }
          SQLiteDatabase localSQLiteDatabase2 = paramhci.getReadableDatabase();
          String str = a;
          String[] arrayOfString1 = MediaRecordEntry.a.b;
          String[] arrayOfString2 = new String[1];
          arrayOfString2[0] = Integer.toString(paramInt1);
          Cursor localCursor = localSQLiteDatabase2.query(true, str, arrayOfString1, "upload_account_id = ? AND upload_state = 300", arrayOfString2, null, null, null, null);
          MediaRecordEntry localMediaRecordEntry;
          localCursor.close();
        }
      }
      finally {}
    }
  }
  
  /* Error */
  static int d(hci paramhci, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 260	hci:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: iconst_1
    //   5: getstatic 22	hbm:a	Ljava/lang/String;
    //   8: iconst_1
    //   9: anewarray 26	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: ldc_w 404
    //   17: aastore
    //   18: ldc_w 406
    //   21: aconst_null
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: invokevirtual 142	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_2
    //   30: aload_2
    //   31: invokeinterface 98 1 0
    //   36: ifeq +25 -> 61
    //   39: aload_2
    //   40: iconst_0
    //   41: invokeinterface 409 2 0
    //   46: istore 5
    //   48: iload 5
    //   50: istore 4
    //   52: aload_2
    //   53: invokeinterface 121 1 0
    //   58: iload 4
    //   60: ireturn
    //   61: iconst_0
    //   62: istore 4
    //   64: goto -12 -> 52
    //   67: astore_3
    //   68: aload_2
    //   69: invokeinterface 121 1 0
    //   74: aload_3
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	paramhci	hci
    //   0	76	1	paramInt	int
    //   29	40	2	localCursor	Cursor
    //   67	8	3	localObject	Object
    //   50	13	4	i	int
    //   46	3	5	j	int
    // Exception table:
    //   from	to	target	type
    //   30	48	67	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbm
 * JD-Core Version:    0.7.0.1
 */