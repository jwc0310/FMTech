import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.apps.plus.content.EsProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Deprecated
public final class bgp
  implements gjg
{
  public static int a(Context paramContext)
  {
    try
    {
      int i = ((giz)mbb.a(paramContext, giz.class)).c("active-plus-account");
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public static long a(Context paramContext, int paramInt, dnn paramdnn)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokestatic 32	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   5: invokevirtual 36	bqj:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   8: astore_3
    //   9: iconst_1
    //   10: anewarray 38	java/lang/String
    //   13: dup
    //   14: iconst_0
    //   15: ldc 40
    //   17: aastore
    //   18: astore 4
    //   20: iconst_1
    //   21: anewarray 38	java/lang/String
    //   24: astore 5
    //   26: aload 5
    //   28: iconst_0
    //   29: aload_2
    //   30: getfield 46	dnn:e	I
    //   33: invokestatic 50	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   36: aastore
    //   37: aload_3
    //   38: ldc 52
    //   40: aload 4
    //   42: ldc 54
    //   44: aload 5
    //   46: aconst_null
    //   47: aconst_null
    //   48: aconst_null
    //   49: invokevirtual 60	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   52: astore 6
    //   54: aload 6
    //   56: invokeinterface 66 1 0
    //   61: ifeq +27 -> 88
    //   64: aload 6
    //   66: iconst_0
    //   67: invokeinterface 70 2 0
    //   72: lstore 10
    //   74: lload 10
    //   76: lstore 8
    //   78: aload 6
    //   80: invokeinterface 73 1 0
    //   85: lload 8
    //   87: lreturn
    //   88: lconst_0
    //   89: lstore 8
    //   91: goto -13 -> 78
    //   94: astore 7
    //   96: aload 6
    //   98: invokeinterface 73 1 0
    //   103: aload 7
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	paramContext	Context
    //   0	106	1	paramInt	int
    //   0	106	2	paramdnn	dnn
    //   8	30	3	localSQLiteDatabase	SQLiteDatabase
    //   18	23	4	arrayOfString1	String[]
    //   24	21	5	arrayOfString2	String[]
    //   52	45	6	localCursor	Cursor
    //   94	10	7	localObject	Object
    //   76	14	8	l1	long
    //   72	3	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   54	74	94	finally
  }
  
  public static bux a(Context paramContext, int paramInt, coq paramcoq)
  {
    return new bux(((giz)mbb.a(paramContext, giz.class)).a(paramInt).d("promo_stats").a(Integer.toString(paramcoq.h), ""));
  }
  
  /* Error */
  public static ArrayList<String> a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +42 -> 43
    //   4: invokestatic 114	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_1
    //   8: aload_1
    //   9: aload_0
    //   10: iconst_0
    //   11: aload_0
    //   12: arraylength
    //   13: invokevirtual 118	android/os/Parcel:unmarshall	([BII)V
    //   16: aload_1
    //   17: iconst_0
    //   18: invokevirtual 122	android/os/Parcel:setDataPosition	(I)V
    //   21: aload_1
    //   22: invokevirtual 126	android/os/Parcel:createStringArrayList	()Ljava/util/ArrayList;
    //   25: astore 4
    //   27: aload 4
    //   29: ifnull +10 -> 39
    //   32: aload_1
    //   33: invokevirtual 129	android/os/Parcel:recycle	()V
    //   36: aload 4
    //   38: areturn
    //   39: aload_1
    //   40: invokevirtual 129	android/os/Parcel:recycle	()V
    //   43: new 131	java/util/ArrayList
    //   46: dup
    //   47: iconst_0
    //   48: invokespecial 133	java/util/ArrayList:<init>	(I)V
    //   51: areturn
    //   52: astore_3
    //   53: aload_1
    //   54: invokevirtual 129	android/os/Parcel:recycle	()V
    //   57: goto -14 -> 43
    //   60: astore_2
    //   61: aload_1
    //   62: invokevirtual 129	android/os/Parcel:recycle	()V
    //   65: aload_2
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	paramArrayOfByte	byte[]
    //   7	55	1	localParcel	Parcel
    //   60	6	2	localObject	Object
    //   52	1	3	localThrowable	java.lang.Throwable
    //   25	12	4	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   8	27	52	java/lang/Throwable
    //   8	27	60	finally
  }
  
  public static void a(Context paramContext, int paramInt, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("last_contacted_time", Long.valueOf(paramLong));
    localSQLiteDatabase.update("account_status", localContentValues, null, null);
    paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
  }
  
  public static void a(Context paramContext, int paramInt, dnn paramdnn, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("sync_data_kind", Integer.valueOf(paramdnn.e));
    localContentValues.put("last_sync", Long.valueOf(paramLong));
    localSQLiteDatabase.insertWithOnConflict("sync_status", null, localContentValues, 5);
  }
  
  public static void a(Context paramContext, int paramInt, List<String> paramList, long paramLong, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues(3);
    localContentValues.put("people_view_notification_count", Integer.valueOf(paramList.size()));
    localContentValues.put("people_view_suggestions", b(paramList));
    if (paramLong > 0L) {
      localContentValues.put("people_view_notification_poll_interval", Long.valueOf(paramLong));
    }
    localSQLiteDatabase.update("account_status", localContentValues, null, null);
    if (paramBoolean) {
      ((hgg)mbb.a(paramContext, hgg.class)).a(paramList);
    }
    a(paramContext, paramInt, dnn.c, System.currentTimeMillis());
    paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
  }
  
  public static void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    if (((giz)mbb.a(paramContext, giz.class)).c("active-plus-account") != paramInt) {
      return;
    }
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("seen_plus_one_promo", paramBoolean).d();
  }
  
  public static void a(Context paramContext, int paramInt, odg[] paramArrayOfodg, boolean paramBoolean)
  {
    int i = 0;
    if (paramArrayOfodg != null) {}
    ArrayList localArrayList;
    for (int j = paramArrayOfodg.length;; j = 0)
    {
      localArrayList = new ArrayList(j);
      while (i < j)
      {
        if ((paramArrayOfodg[i].a != null) && (paramArrayOfodg[i].a.a != null) && (!TextUtils.isEmpty(paramArrayOfodg[i].a.a.c)) && ((!paramBoolean) || (paramArrayOfodg[i].g.booleanValue()))) {
          localArrayList.add(paramArrayOfodg[i].a.a.c);
        }
        i++;
      }
    }
    a(paramContext, paramInt, localArrayList, -1L, true);
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("accounts", 0).edit();
    localEditor.putBoolean("contacts_clean", paramBoolean);
    localEditor.apply();
  }
  
  public static boolean a(Context paramContext, int paramInt)
  {
    return ((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("gplus_no_mobile_tos");
  }
  
  public static int b(Context paramContext)
  {
    try
    {
      int i = ((giz)mbb.a(paramContext, giz.class)).c("active-photos-account");
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static void b(Context paramContext, int paramInt, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      localContentValues.put("wipeout_stats", Integer.valueOf(i));
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      return;
    }
  }
  
  public static void b(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("accounts", 0).edit();
    localEditor.putBoolean("contacts_stats_clean", paramBoolean);
    localEditor.apply();
  }
  
  public static boolean b(Context paramContext, int paramInt)
  {
    if (((giz)mbb.a(paramContext, giz.class)).c("active-plus-account") != paramInt) {
      return false;
    }
    return ((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("seen_plus_one_promo");
  }
  
  private static byte[] b(List<String> paramList)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeStringList(paramList);
      byte[] arrayOfByte = localParcel.marshall();
      return arrayOfByte;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public static long c(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT last_stats_sync_time  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  public static void c(Context paramContext, int paramInt, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("push_notifications", Boolean.valueOf(paramBoolean));
    localSQLiteDatabase.update("account_status", localContentValues, null, null);
  }
  
  public static boolean c(Context paramContext)
  {
    return paramContext.getSharedPreferences("accounts", 0).getBoolean("contacts_clean", false);
  }
  
  public static long d(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT last_contacted_time  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  public static void d(Context paramContext)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("accounts", 0).edit();
    localEditor.putBoolean("arkham_warm_welcome_shown", true);
    localEditor.apply();
  }
  
  public static void d(Context paramContext, int paramInt, boolean paramBoolean)
  {
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("contacts_sync", paramBoolean).d();
  }
  
  public static void e(Context paramContext, int paramInt, boolean paramBoolean)
  {
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("contacts_stats_sync", paramBoolean).d();
  }
  
  public static boolean e(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT wipeout_stats  FROM account_status", null);
      boolean bool1 = l < 1L;
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      return bool2;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return false;
  }
  
  public static void f(Context paramContext, int paramInt, boolean paramBoolean)
  {
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("ab_status_bar_dismissed", paramBoolean).d();
  }
  
  public static boolean f(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT push_notifications FROM account_status", null);
      return (int)l == 1;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return false;
  }
  
  public static boolean g(Context paramContext, int paramInt)
  {
    gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    return (!localgjb.c("is_managed_account")) && (localgjb.c("contacts_sync"));
  }
  
  public static boolean h(Context paramContext, int paramInt)
  {
    gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    return (!localgjb.c("is_managed_account")) && (localgjb.c("contacts_stats_sync"));
  }
  
  public static ArrayList<String> i(Context paramContext, int paramInt)
  {
    String[] arrayOfString = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("stream_views").split(",");
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = arrayOfString[j];
      if (!TextUtils.isEmpty(str)) {
        localArrayList.add(str);
      }
    }
    if (localArrayList.isEmpty())
    {
      localArrayList.add("v.whatshot");
      localArrayList.add("v.all.circles");
    }
    return localArrayList;
  }
  
  public static HashSet<String> j(Context paramContext, int paramInt)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("friend_location_circles");
    Object localObject;
    if (str1 == null) {
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      String[] arrayOfString = str1.split(",");
      localObject = new HashSet();
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str2 = arrayOfString[j];
        if (!TextUtils.isEmpty(str2)) {
          ((HashSet)localObject).add(str2);
        }
      }
    }
  }
  
  public static int k(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    try
    {
      Cursor localCursor2 = localSQLiteDatabase.query("account_status", new String[] { "people_view_notification_count" }, null, null, null, null, null);
      Cursor localCursor1 = localCursor2;
      int i;
      if ((localCursor1 == null) || (localCursor1 != null)) {
        localCursor1.close();
      }
    }
    finally
    {
      try
      {
        if (localCursor1.moveToNext())
        {
          i = localCursor1.getInt(0);
          if (localCursor1 != null) {
            localCursor1.close();
          }
          return i;
        }
        if (localCursor1 != null) {
          localCursor1.close();
        }
        return 0;
      }
      finally {}
      localObject1 = finally;
      localCursor1 = null;
    }
    throw localObject1;
  }
  
  public static void l(Context paramContext, int paramInt)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("accounts", 0).edit();
    localEditor.putInt("profile_action_status", 2);
    localEditor.apply();
  }
  
  public static long m(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT people_view_notification_poll_interval  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  public final void a(Context paramContext, gje paramgje) {}
  
  public final void a(List<gji> paramList)
  {
    paramList.add(new bgr(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bgp
 * JD-Core Version:    0.7.0.1
 */