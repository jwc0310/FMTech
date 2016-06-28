import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.preference.PreferenceManager;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class hbj
{
  private static final long a = TimeUnit.DAYS.toMillis(1L);
  private static final String[] b = { "gms_disabled_auto_backup" };
  private static final String[] c = { "upload_full_resolution", "full_size_disabled", "quota_limit", "quota_used" };
  
  static
  {
    new String[] { "auto_upload_enabled", "sync_on_wifi_only", "video_upload_wifi_only" };
  }
  
  private static Set<Integer> a(Context paramContext, Integer paramInteger)
  {
    HashSet localHashSet = new HashSet(((giz)mbb.a(paramContext, giz.class)).a());
    Cursor localCursor = ((hci)mbb.a(paramContext, hci.class)).getReadableDatabase().query(true, MediaRecordEntry.a.a, new String[] { "upload_account_id" }, null, null, null, null, null, null);
    try
    {
      while (localCursor.moveToNext()) {
        localHashSet.add(Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("upload_account_id"))));
      }
      if (paramInteger == null) {
        return localHashSet;
      }
    }
    finally
    {
      localCursor.close();
    }
    localHashSet.remove(paramInteger);
    return localHashSet;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    Iterator localIterator = a(paramContext, Integer.valueOf(paramInt)).iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      try
      {
        b(paramContext, localInteger.intValue(), false);
      }
      catch (gjd localgjd) {}
    }
    hba localhba = (hba)mbb.a(paramContext, hba.class);
    localhba.d(paramInt);
    long l = System.currentTimeMillis();
    localhba.b(paramInt).b("auto_backup_last_turned_on_at", l).d();
    hcw.a(paramContext);
    ((iri)mbb.a(paramContext, iri.class)).a();
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = new iuk(paramInt2, paramInt3, paramBoolean1, paramBoolean2).a();
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    if (!paramBoolean2)
    {
      localSharedPreferences.edit().putBoolean("iu.received_low_quota", false).putBoolean("iu.received_no_quota", false).commit();
      hcw.a(paramContext, paramInt1);
    }
    do
    {
      return;
      if (!bool1) {
        break;
      }
    } while (localSharedPreferences.getBoolean("iu.received_no_quota", false));
    label84:
    Uri localUri = hbu.b(paramContext).buildUpon().appendQueryParameter("account_id", Integer.toString(paramInt1)).build();
    Cursor localCursor = paramContext.getContentResolver().query(localUri, c, null, null, null);
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          int i = localCursor.getInt(0);
          if (i == 1) {}
        }
        else
        {
          return;
          if (!localSharedPreferences.getBoolean("iu.received_low_quota", false)) {
            break label84;
          }
          if (!localSharedPreferences.contains("iu.received_no_quota")) {
            break;
          }
          localSharedPreferences.edit().putBoolean("iu.received_no_quota", false).commit();
          return;
        }
        if (localCursor != null) {
          localCursor.close();
        }
        boolean bool2 = localSharedPreferences.contains("iu.first_time_full_size_shown");
        if (!bool2) {
          localSharedPreferences.edit().putBoolean("iu.first_time_full_size_shown", true).commit();
        }
        if (bool1)
        {
          localSharedPreferences.edit().putBoolean("iu.received_no_quota", true).commit();
          a(paramContext, paramInt1, false);
          if (!bool2) {
            break;
          }
          hcw.a(paramContext, paramInt1, paramInt3, paramInt2, bool1);
          return;
        }
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
      localSharedPreferences.edit().putBoolean("iu.received_low_quota", true).commit();
    }
  }
  
  private static void a(Context paramContext, int paramInt, Uri paramUri)
  {
    ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    Uri localUri = paramUri.buildUpon().appendQueryParameter("account_id", Integer.toString(paramInt)).build();
    paramContext.getContentResolver().delete(localUri, null, null);
  }
  
  /* Error */
  public static void a(Context paramContext, int paramInt, List<Uri> paramList, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +12 -> 13
    //   4: aload_2
    //   5: invokeinterface 283 1 0
    //   10: ifeq +4 -> 14
    //   13: return
    //   14: aload_0
    //   15: invokevirtual 248	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   18: astore 5
    //   20: new 285	android/content/ContentValues
    //   23: dup
    //   24: bipush 6
    //   26: invokespecial 287	android/content/ContentValues:<init>	(I)V
    //   29: astore 6
    //   31: aload_0
    //   32: ldc 50
    //   34: invokestatic 55	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   37: checkcast 50	giz
    //   40: iload_1
    //   41: invokeinterface 271 2 0
    //   46: pop
    //   47: aload 6
    //   49: ldc 80
    //   51: iload_1
    //   52: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   55: invokevirtual 291	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   58: aload 6
    //   60: ldc_w 293
    //   63: iconst_1
    //   64: invokestatic 298	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   67: invokevirtual 301	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   70: aload_0
    //   71: ldc 145
    //   73: invokestatic 55	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   76: checkcast 145	hba
    //   79: invokevirtual 304	hba:e	()Ljava/util/List;
    //   82: iload_1
    //   83: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: invokeinterface 306 2 0
    //   91: ifne +28 -> 119
    //   94: ldc_w 308
    //   97: aload_3
    //   98: invokevirtual 311	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   101: ifne +18 -> 119
    //   104: aload 6
    //   106: ldc_w 313
    //   109: aload_3
    //   110: invokestatic 319	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   113: invokestatic 322	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   116: invokevirtual 325	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   119: aload_2
    //   120: invokeinterface 326 1 0
    //   125: astore 8
    //   127: aload 8
    //   129: invokeinterface 132 1 0
    //   134: ifeq -121 -> 13
    //   137: aload 8
    //   139: invokeinterface 136 1 0
    //   144: checkcast 222	android/net/Uri
    //   147: astore 9
    //   149: aload 5
    //   151: aload 9
    //   153: invokestatic 331	hcx:a	(Landroid/content/ContentResolver;Landroid/net/Uri;)J
    //   156: lstore 10
    //   158: lload 10
    //   160: lconst_0
    //   161: lcmp
    //   162: iflt +16 -> 178
    //   165: aload 6
    //   167: ldc_w 333
    //   170: lload 10
    //   172: invokestatic 322	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   175: invokevirtual 325	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   178: aload 6
    //   180: ldc_w 335
    //   183: aload 9
    //   185: invokevirtual 338	android/net/Uri:toString	()Ljava/lang/String;
    //   188: invokevirtual 341	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: aload 5
    //   193: aload_0
    //   194: invokestatic 343	hbu:e	(Landroid/content/Context;)Landroid/net/Uri;
    //   197: aload 6
    //   199: invokevirtual 347	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   202: pop
    //   203: goto -76 -> 127
    //   206: astore 13
    //   208: new 349	java/lang/IllegalArgumentException
    //   211: dup
    //   212: ldc_w 351
    //   215: invokespecial 354	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   218: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	paramContext	Context
    //   0	219	1	paramInt	int
    //   0	219	2	paramList	List<Uri>
    //   0	219	3	paramString	String
    //   0	219	4	paramBoolean	boolean
    //   18	174	5	localContentResolver	ContentResolver
    //   29	169	6	localContentValues	ContentValues
    //   125	13	8	localIterator	Iterator
    //   147	37	9	localUri	Uri
    //   156	15	10	l	long
    //   206	1	13	localNumberFormatException	java.lang.NumberFormatException
    // Exception table:
    //   from	to	target	type
    //   104	119	206	java/lang/NumberFormatException
  }
  
  public static void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      ContentValues localContentValues = new ContentValues();
      Uri localUri = hbu.b(paramContext).buildUpon().appendQueryParameter("account_id", Integer.toString(paramInt)).build();
      localContentValues.put("upload_full_resolution", Integer.valueOf(i));
      localContentResolver.update(localUri, localContentValues, null, null);
      return;
    }
  }
  
  public static void a(Context paramContext, long paramLong)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("max_mobile_upload_size", Long.valueOf(paramLong));
    localContentResolver.update(hbu.b(paramContext), localContentValues, null, null);
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("sync_on_wifi_only", Integer.valueOf(i));
      localContentResolver.update(hbu.b(paramContext), localContentValues, null, null);
      return;
    }
  }
  
  public static boolean a()
  {
    return ContentResolver.getMasterSyncAutomatically();
  }
  
  public static boolean a(Context paramContext)
  {
    if (mbb.b(paramContext, hau.class) == null) {}
    boolean bool;
    for (int i = 1; i != 0; i = 0)
    {
      bool = true;
      return bool;
    }
    Cursor localCursor = paramContext.getContentResolver().query(hbu.b(paramContext), b, null, null, null);
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          int k = localCursor.getInt(0);
          j = k;
          localCursor.close();
          bool = false;
          if (j == 0) {
            break;
          }
          return true;
        }
      }
      finally
      {
        localCursor.close();
      }
      int j = 0;
      continue;
      j = 0;
    }
  }
  
  public static boolean a(Context paramContext, int paramInt, long paramLong)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = ((hci)mbb.a(paramContext, hci.class)).getReadableDatabase();
    if (localSQLiteDatabase == null) {
      throw new hbk();
    }
    String str1 = MediaRecordEntry.a.a;
    String str2 = String.valueOf("upload_reason");
    String str3 = String.valueOf("upload_state");
    String str4 = String.valueOf("bucket_id");
    String str5 = String.valueOf("media_time");
    String str6 = String.valueOf("media_time");
    String str7 = 106 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + "SELECT media_url FROM " + str1 + " WHERE " + str2 + " = 0" + " AND " + str3 + " = 500" + " AND " + str4 + " IS NULL AND " + str5 + " < ? ORDER BY " + str6 + " ASC LIMIT 1";
    try
    {
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = Long.toString(1400544000000L);
      String str14 = DatabaseUtils.stringForQuery(localSQLiteDatabase, str7, arrayOfString2);
      str8 = str14;
    }
    catch (SQLiteDoneException localSQLiteDoneException)
    {
      for (;;)
      {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String[] arrayOfString1;
        String str8 = null;
      }
    }
    if (str8 == null) {
      return false;
    }
    str9 = String.valueOf("upload_reason");
    str10 = String.valueOf("upload_reason");
    str11 = String.valueOf("media_url");
    str12 = String.valueOf("upload_account_id");
    str13 = 80 + String.valueOf(str1).length() + String.valueOf(str9).length() + String.valueOf(str10).length() + String.valueOf(str11).length() + String.valueOf(str12).length() + "SELECT count(*) FROM " + str1 + " WHERE (" + str9 + " = 30" + " OR " + str10 + " = 40" + ") AND " + str11 + " = ? AND " + str12 + " = ?";
    arrayOfString1 = new String[2];
    arrayOfString1[0] = str7;
    arrayOfString1[1] = Integer.toString(paramInt);
    return DatabaseUtils.longForQuery(localSQLiteDatabase, str13, arrayOfString1) == 0L;
  }
  
  public static void b()
  {
    ContentResolver.setMasterSyncAutomatically(true);
  }
  
  public static void b(Context paramContext, int paramInt)
  {
    hcw.b(paramContext);
    d(paramContext, paramInt);
    ((iri)mbb.a(paramContext, iri.class)).a();
  }
  
  public static void b(Context paramContext, int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean) {
      ((hba)mbb.a(paramContext, hba.class)).a(paramInt, false);
    }
    hcw.b(paramContext);
    d(paramContext, paramInt);
    ((iri)mbb.a(paramContext, iri.class)).a();
  }
  
  public static void b(Context paramContext, boolean paramBoolean)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("video_upload_wifi_only", Integer.valueOf(i));
      localContentResolver.update(hbu.b(paramContext), localContentValues, null, null);
      return;
    }
  }
  
  public static boolean b(Context paramContext)
  {
    return mbb.b(paramContext, hau.class) == null;
  }
  
  public static void c(Context paramContext)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("iu.video_connection_notify_threshold", System.currentTimeMillis() + a).apply();
  }
  
  public static void c(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, hbu.d(paramContext));
  }
  
  public static void c(Context paramContext, boolean paramBoolean)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("sync_on_roaming", Integer.valueOf(i));
      localContentResolver.update(hbu.b(paramContext), localContentValues, null, null);
      return;
    }
  }
  
  public static void d(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, hbu.d(paramContext));
    a(paramContext, paramInt, hbu.e(paramContext));
  }
  
  public static void d(Context paramContext, boolean paramBoolean)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("sync_on_battery", Integer.valueOf(i));
      localContentResolver.update(hbu.b(paramContext), localContentValues, null, null);
      return;
    }
  }
  
  public static boolean d(Context paramContext)
  {
    return hbm.a(paramContext);
  }
  
  public static void e(Context paramContext, boolean paramBoolean)
  {
    int i = 0;
    hbn localhbn = (hbn)mbb.a(paramContext, hbn.class);
    isv[] arrayOfisv = efj.c(paramContext, 0, 2);
    int j = arrayOfisv.length;
    if (i < j)
    {
      isv localisv = arrayOfisv[i];
      String str;
      if (localisv.a != null)
      {
        str = String.valueOf(localisv.a);
        if (!paramBoolean) {
          break label74;
        }
        localhbn.a(str);
      }
      for (;;)
      {
        i++;
        break;
        label74:
        localhbn.b(str);
      }
    }
  }
  
  public static boolean e(Context paramContext)
  {
    Iterator localIterator = ((hba)mbb.a(paramContext, hba.class)).e().iterator();
    while (localIterator.hasNext()) {
      if (g(paramContext, ((Integer)localIterator.next()).intValue()) > 0) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean e(Context paramContext, int paramInt)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    String str2 = hbu.f(paramContext);
    return ContentResolver.getSyncAutomatically(new Account(str1, "com.google"), str2);
  }
  
  public static void f(Context paramContext, int paramInt)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    String str2 = hbu.f(paramContext);
    Account localAccount = new Account(str1, "com.google");
    ContentResolver.setIsSyncable(localAccount, str2, 1);
    ContentResolver.setSyncAutomatically(localAccount, str2, true);
  }
  
  /* Error */
  public static int g(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: invokevirtual 248	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   8: astore 4
    //   10: iload_1
    //   11: iconst_m1
    //   12: if_icmpeq +83 -> 95
    //   15: iload_1
    //   16: invokestatic 232	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   19: astore 5
    //   21: aload_0
    //   22: invokestatic 534	hbu:c	(Landroid/content/Context;)Landroid/net/Uri;
    //   25: invokevirtual 226	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   28: ldc 228
    //   30: aload 5
    //   32: invokevirtual 238	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   35: invokevirtual 242	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   38: astore 6
    //   40: aload 4
    //   42: aload 6
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: invokevirtual 253	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   51: astore 9
    //   53: aload 9
    //   55: astore 8
    //   57: aload 8
    //   59: ifnull +197 -> 256
    //   62: iconst_0
    //   63: istore 15
    //   65: aload 8
    //   67: invokeinterface 92 1 0
    //   72: ifeq +31 -> 103
    //   75: aload 8
    //   77: iconst_0
    //   78: invokeinterface 100 2 0
    //   83: istore 16
    //   85: iload 15
    //   87: iload 16
    //   89: iadd
    //   90: istore 15
    //   92: goto -27 -> 65
    //   95: getstatic 535	hbu:a	Ljava/lang/String;
    //   98: astore 5
    //   100: goto -79 -> 21
    //   103: iload 15
    //   105: istore 10
    //   107: aload 8
    //   109: ifnull +10 -> 119
    //   112: aload 8
    //   114: invokeinterface 115 1 0
    //   119: aload_0
    //   120: invokestatic 474	hbu:d	(Landroid/content/Context;)Landroid/net/Uri;
    //   123: invokevirtual 226	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   126: ldc 228
    //   128: aload 5
    //   130: invokevirtual 238	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   133: invokevirtual 242	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   136: astore 11
    //   138: aload 4
    //   140: aload 11
    //   142: aconst_null
    //   143: aconst_null
    //   144: aconst_null
    //   145: aconst_null
    //   146: invokevirtual 253	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   149: astore_3
    //   150: aload_3
    //   151: ifnull +64 -> 215
    //   154: iconst_0
    //   155: istore 13
    //   157: aload_3
    //   158: invokeinterface 92 1 0
    //   163: ifeq +55 -> 218
    //   166: iload_2
    //   167: aload_3
    //   168: iconst_1
    //   169: invokeinterface 100 2 0
    //   174: iadd
    //   175: istore_2
    //   176: aload_3
    //   177: iconst_2
    //   178: invokeinterface 100 2 0
    //   183: istore 14
    //   185: iload 13
    //   187: iload 14
    //   189: iadd
    //   190: istore 13
    //   192: goto -35 -> 157
    //   195: astore 7
    //   197: aconst_null
    //   198: astore 8
    //   200: aload 8
    //   202: ifnull +10 -> 212
    //   205: aload 8
    //   207: invokeinterface 115 1 0
    //   212: aload 7
    //   214: athrow
    //   215: iconst_0
    //   216: istore 13
    //   218: aload_3
    //   219: ifnull +9 -> 228
    //   222: aload_3
    //   223: invokeinterface 115 1 0
    //   228: iload 10
    //   230: iload 13
    //   232: iload_2
    //   233: isub
    //   234: iadd
    //   235: ireturn
    //   236: astore 12
    //   238: aload_3
    //   239: ifnull +9 -> 248
    //   242: aload_3
    //   243: invokeinterface 115 1 0
    //   248: aload 12
    //   250: athrow
    //   251: astore 7
    //   253: goto -53 -> 200
    //   256: iconst_0
    //   257: istore 10
    //   259: goto -152 -> 107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	paramContext	Context
    //   0	262	1	paramInt	int
    //   1	233	2	i	int
    //   3	240	3	localCursor1	Cursor
    //   8	131	4	localContentResolver	ContentResolver
    //   19	110	5	str	String
    //   38	5	6	localUri1	Uri
    //   195	18	7	localObject1	Object
    //   251	1	7	localObject2	Object
    //   55	151	8	localCursor2	Cursor
    //   51	3	9	localCursor3	Cursor
    //   105	153	10	j	int
    //   136	5	11	localUri2	Uri
    //   236	13	12	localObject3	Object
    //   155	79	13	k	int
    //   183	7	14	m	int
    //   63	41	15	n	int
    //   83	7	16	i1	int
    // Exception table:
    //   from	to	target	type
    //   40	53	195	finally
    //   138	150	236	finally
    //   157	185	236	finally
    //   65	85	251	finally
  }
  
  public static int h(Context paramContext, int paramInt)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = ((hci)mbb.a(paramContext, hci.class)).getReadableDatabase();
    if (localSQLiteDatabase == null) {
      return 0;
    }
    String str1 = MediaRecordEntry.a.a;
    String str2 = String.valueOf("(SELECT max(_id) as max_id FROM ");
    String str3 = String.valueOf("media_url");
    String str4 = 11 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + str2 + str1 + " GROUP BY " + str3 + ")";
    String str5 = String.valueOf("_id");
    String str6 = String.valueOf("upload_account_id");
    String str7 = String.valueOf("upload_state");
    String str8 = String.valueOf("upload_state");
    String str9 = 117 + String.valueOf(str1).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + "SELECT COUNT(*) FROM " + str1 + " AS mr INNER JOIN " + str4 + " ss on mr." + str5 + " = ss.max_id WHERE " + str6 + " = ? AND (" + "mr." + str7 + " = 100" + " OR " + "mr." + str8 + " = 200" + ")";
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Integer.toString(paramInt);
    return (int)DatabaseUtils.longForQuery(localSQLiteDatabase, str9, arrayOfString);
  }
  
  public static int i(Context paramContext, int paramInt)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = ((hci)mbb.a(paramContext, hci.class)).getReadableDatabase();
    if (localSQLiteDatabase == null) {
      return 0;
    }
    String str1 = MediaRecordEntry.a.a;
    String str2 = String.valueOf("SELECT media_url FROM ");
    String str3 = String.valueOf("upload_account_id");
    String str4 = String.valueOf("upload_state");
    String str5 = String.valueOf("bucket_id");
    String str6 = String.valueOf("bucket_id");
    String str7 = String.valueOf("exclude_bucket");
    String str8 = String.valueOf("media_url");
    String str9 = 68 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + str2 + str1 + " WHERE " + str3 + " = ? AND " + str4 + " = 400" + " AND " + str5 + " NOT IN (SELECT " + str6 + " FROM " + str7 + ") GROUP BY " + str8;
    String str10 = String.valueOf("SELECT media_url FROM ");
    String str11 = String.valueOf("upload_state");
    String str12 = String.valueOf("upload_account_id");
    String str13 = String.valueOf("bucket_id");
    String str14 = String.valueOf("bucket_id");
    String str15 = String.valueOf("exclude_bucket");
    String str16 = String.valueOf("media_url");
    String str17 = 69 + String.valueOf(str10).length() + String.valueOf(str1).length() + String.valueOf(str11).length() + String.valueOf(str12).length() + String.valueOf(str13).length() + String.valueOf(str14).length() + String.valueOf(str15).length() + String.valueOf(str16).length() + str10 + str1 + " WHERE " + str11 + " = 500" + " AND " + str12 + " = -1 AND " + str13 + " NOT IN (SELECT " + str14 + " FROM " + str15 + ") GROUP BY " + str16;
    String str18 = String.valueOf("SELECT COUNT(*) FROM (");
    String str19 = 9 + String.valueOf(str18).length() + String.valueOf(str17).length() + String.valueOf(str9).length() + str18 + str17 + " EXCEPT " + str9 + ")";
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Integer.toString(paramInt);
    return (int)DatabaseUtils.longForQuery(localSQLiteDatabase, str19, arrayOfString);
  }
  
  public static long j(Context paramContext, int paramInt)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = ((hci)mbb.a(paramContext, hci.class)).getReadableDatabase();
    if (localSQLiteDatabase == null) {
      return 0L;
    }
    String str1 = MediaRecordEntry.a.a;
    String str2 = String.valueOf("SELECT min(upload_finish_time) FROM ");
    String str3 = String.valueOf("upload_account_id");
    String str4 = 11 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + str2 + str1 + " WHERE " + str3 + " = ?";
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Integer.toString(paramInt);
    return (int)DatabaseUtils.longForQuery(localSQLiteDatabase, str4, arrayOfString);
  }
  
  public static boolean k(Context paramContext, int paramInt)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = ((hci)mbb.a(paramContext, hci.class)).getReadableDatabase();
    if (localSQLiteDatabase == null) {
      throw new hbk();
    }
    String str1 = MediaRecordEntry.a.a;
    String str2 = String.valueOf("upload_reason");
    String str3 = String.valueOf("upload_reason");
    String str4 = String.valueOf("bucket_id");
    String str5 = String.valueOf("upload_account_id");
    String str6 = 84 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + "SELECT count(*) FROM " + str1 + " WHERE (" + str2 + " = 30" + " OR " + str3 + " = 40" + ") AND " + str4 + " IS NULL AND " + str5 + " = ?";
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Integer.toString(paramInt);
    return DatabaseUtils.longForQuery(localSQLiteDatabase, str6, arrayOfString) != 0L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbj
 * JD-Core Version:    0.7.0.1
 */