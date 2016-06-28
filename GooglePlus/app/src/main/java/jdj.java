import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class jdj
{
  private static final String a = jdr.a(jdj.class);
  
  private static String a(izx paramizx)
  {
    switch (jdk.a[paramizx.ordinal()])
    {
    default: 
      String str1 = a;
      String str2 = String.valueOf(paramizx);
      jdr.c(str1, 24 + String.valueOf(str2).length() + "Unknown fetch category: " + str2);
      return null;
    case 1: 
      return "important_fetch_paging_token";
    }
    return "low_fetch_paging_token";
  }
  
  private static void a(ContentValues paramContentValues, SQLiteDatabase paramSQLiteDatabase)
  {
    if (paramSQLiteDatabase.update("user_data", paramContentValues, null, null) <= 0) {
      paramSQLiteDatabase.insert("user_data", null, paramContentValues);
    }
  }
  
  public static void a(Context paramContext, int paramInt, long paramLong)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null)
    {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("viewed_sync_version", Long.valueOf(paramLong));
    SQLiteDatabase localSQLiteDatabase = localjdc.getWritableDatabase();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Long.toString(paramLong);
    localSQLiteDatabase.update("user_data", localContentValues, "viewed_sync_version < ? ", arrayOfString);
  }
  
  public static void a(Context paramContext, int paramInt, izx paramizx)
  {
    for (;;)
    {
      try
      {
        jdc localjdc = jdd.a(paramContext).a(paramInt);
        if (localjdc == null)
        {
          jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
          return;
        }
        String str;
        if (paramizx == izx.a)
        {
          str = "priority IN (3,4)";
          localjdc.getWritableDatabase().delete("notifications", str, null);
        }
        else
        {
          str = "priority = 2";
        }
      }
      finally {}
    }
  }
  
  public static void a(Context paramContext, int paramInt, izx paramizx, jan paramjan, qqt paramqqt)
  {
    try
    {
      jcg.a(paramContext, paramInt, paramqqt.b, paramjan);
      mjd[] arrayOfmjd = jcg.a(paramqqt.b);
      String str = a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(arrayOfmjd.length);
      jdr.a(str, String.format("Have [%d] notifications after filtering ack notifications.", arrayOfObject));
      a(paramContext, paramInt, arrayOfmjd, a(paramjan));
      a(paramContext, paramInt, paramizx, paramqqt.d);
      b(paramContext, paramInt, paramizx, paramqqt.c);
      if ((paramqqt.a != null) && (paramqqt.a.longValue() != 0L)) {
        b(paramContext, paramInt, paramqqt.a.longValue());
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static void a(Context paramContext, int paramInt, izx paramizx, jan paramjan, qqz paramqqz)
  {
    try
    {
      jcg.a(paramContext, paramInt, paramqqz.b, paramjan);
      mjd[] arrayOfmjd = jcg.a(paramqqz.b);
      String str = a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(arrayOfmjd.length);
      jdr.a(str, String.format("Have [%d] notifications after filtering ack notifications.", arrayOfObject));
      a(paramContext, paramInt, arrayOfmjd, a(paramjan));
      b(paramContext, paramInt, paramizx, paramqqz.c);
      if ((paramqqz.a != null) && (paramqqz.a.longValue() != 0L)) {
        b(paramContext, paramInt, paramqqz.a.longValue());
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private static void a(Context paramContext, int paramInt, izx paramizx, byte[] paramArrayOfByte)
  {
    String str1 = a(paramizx);
    if (str1 == null)
    {
      String str2 = a;
      String str3 = String.valueOf(paramizx);
      jdr.c(str2, 48 + String.valueOf(str3).length() + "Cannot store paging token for unknown category: " + str3);
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(str1, paramArrayOfByte);
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null)
    {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      return;
    }
    a(localContentValues, localjdc.getWritableDatabase());
  }
  
  private static void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    paramContext.getContentResolver().notifyChange(jda.a, null);
    if ((paramBoolean) && (paramInt != -1)) {
      ((izy)mbb.a(paramContext, izy.class)).a(paramInt, false);
    }
  }
  
  public static void a(Context paramContext, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null)
    {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      return;
    }
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("push_enabled", Boolean.valueOf(false));
    String str = efj.b("key", paramArrayOfString.length);
    localjdc.getWritableDatabase().update("notifications", localContentValues, str, paramArrayOfString);
    a(paramContext, paramInt, true);
  }
  
  public static void a(Context paramContext, int paramInt, mjd[] paramArrayOfmjd, boolean paramBoolean)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null) {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
    }
    while (paramInt == -1) {
      return;
    }
    SQLiteDatabase localSQLiteDatabase = localjdc.getWritableDatabase();
    int i = paramArrayOfmjd.length;
    int j = 0;
    mjd localmjd;
    jdb localjdb;
    for (;;)
    {
      if (j >= i) {
        break label331;
      }
      localmjd = paramArrayOfmjd[j];
      if (a(paramContext, paramInt, localmjd))
      {
        if (!paramBoolean) {
          localmjd.h = Boolean.valueOf(true);
        }
        localjdb = null;
      }
      try
      {
        localSQLiteDatabase.beginTransaction();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = localmjd.a;
        localjdb = efj.a(paramContext, paramInt, arrayOfString);
        int k = localjdb.getCount();
        if (k > 1)
        {
          String str1 = a;
          String str2 = String.valueOf(localmjd.a);
          if (str2.length() != 0) {}
          for (String str3 = "More than one row for a single key: ".concat(str2);; str3 = new String("More than one row for a single key: "))
          {
            jdr.c(str1, str3);
            localSQLiteDatabase.setTransactionSuccessful();
            if (localjdb != null) {
              localjdb.close();
            }
            localSQLiteDatabase.endTransaction();
            j++;
            break;
          }
        }
        if (k != 1) {
          break label320;
        }
      }
      finally
      {
        if (localjdb != null) {
          localjdb.close();
        }
        localSQLiteDatabase.endTransaction();
      }
    }
    localjdb.moveToFirst();
    long l = localjdb.a();
    if ((localmjd.f == null) || (localmjd.f.longValue() > l)) {
      a(localmjd, localjdb.b(), localSQLiteDatabase);
    }
    for (;;)
    {
      localSQLiteDatabase.setTransactionSuccessful();
      if (localjdb != null) {
        localjdb.close();
      }
      localSQLiteDatabase.endTransaction();
      break;
      label320:
      a(localmjd, 0L, localSQLiteDatabase);
    }
    label331:
    a(paramContext, paramInt, true);
  }
  
  private static void a(mjd parammjd, long paramLong, SQLiteDatabase paramSQLiteDatabase)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("key", parammjd.a);
    localContentValues.put("priority", Integer.valueOf(parammjd.e));
    localContentValues.put("read_state", Integer.valueOf(parammjd.d));
    localContentValues.put("sort_version", parammjd.g);
    long l;
    if (parammjd.f == null)
    {
      l = 0L;
      localContentValues.put("last_modified_version", Long.valueOf(l));
      localContentValues.put("system_tray_version", Long.valueOf(paramLong));
      if ((parammjd.h != null) && (parammjd.h.booleanValue())) {
        break label311;
      }
    }
    label311:
    for (boolean bool = true;; bool = false)
    {
      localContentValues.put("push_enabled", Boolean.valueOf(bool));
      localContentValues.put("sync_behavior", Integer.valueOf(parammjd.k));
      if (parammjd.j != null) {
        localContentValues.put("analytics_data", qat.a(parammjd.j));
      }
      if (parammjd.c != null)
      {
        mks localmks = parammjd.c;
        if (localmks.d != null) {
          localContentValues.put("payload", qat.a(localmks.d));
        }
        if (localmks.a != null) {
          localContentValues.put("collapsed_info", qat.a(localmks.a));
        }
        if (localmks.b != null) {
          localContentValues.put("expanded_info", qat.a(localmks.b));
        }
        if (localmks.c != null)
        {
          mkc localmkc = localmks.c.a;
          if (localmkc != null) {
            localContentValues.put("android_render_info", qat.a(localmkc));
          }
        }
      }
      paramSQLiteDatabase.insertWithOnConflict("notifications", null, localContentValues, 5);
      return;
      l = parammjd.f.longValue();
      break;
    }
  }
  
  /* Error */
  public static boolean a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 2
    //   4: monitorenter
    //   5: aload_0
    //   6: invokestatic 81	jdd:a	(Landroid/content/Context;)Ljdd;
    //   9: iload_1
    //   10: invokevirtual 84	jdd:a	(I)Ljdc;
    //   13: astore 4
    //   15: aload 4
    //   17: ifnonnull +35 -> 52
    //   20: getstatic 15	jdj:a	Ljava/lang/String;
    //   23: new 38	java/lang/StringBuilder
    //   26: dup
    //   27: bipush 52
    //   29: invokespecial 44	java/lang/StringBuilder:<init>	(I)V
    //   32: ldc 86
    //   34: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: iload_1
    //   38: invokevirtual 89	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   41: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokestatic 58	jdr:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: ldc 2
    //   49: monitorexit
    //   50: iload_2
    //   51: ireturn
    //   52: aload_0
    //   53: ldc 217
    //   55: invokestatic 222	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   58: checkcast 217	izy
    //   61: iload_1
    //   62: invokeinterface 379 2 0
    //   67: aload 4
    //   69: invokevirtual 109	jdc:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   72: astore 5
    //   74: aload 5
    //   76: ldc_w 381
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: ldc 122
    //   87: aastore
    //   88: invokestatic 154	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   91: invokevirtual 384	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   94: aload 5
    //   96: ldc_w 381
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: ldc 65
    //   107: aastore
    //   108: invokestatic 154	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   111: invokevirtual 384	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   114: aload_0
    //   115: iload_1
    //   116: iconst_0
    //   117: invokestatic 246	jdj:a	(Landroid/content/Context;IZ)V
    //   120: iconst_1
    //   121: istore_2
    //   122: goto -75 -> 47
    //   125: astore_3
    //   126: ldc 2
    //   128: monitorexit
    //   129: aload_3
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	paramContext	Context
    //   0	131	1	paramInt	int
    //   1	121	2	bool	boolean
    //   125	5	3	localObject	Object
    //   13	55	4	localjdc	jdc
    //   72	23	5	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   5	15	125	finally
    //   20	47	125	finally
    //   52	120	125	finally
  }
  
  private static boolean a(Context paramContext, int paramInt, mjd parammjd)
  {
    Iterator localIterator = mbb.c(paramContext, jav.class).iterator();
    while (localIterator.hasNext()) {
      if (((jav)localIterator.next()).a(paramInt, parammjd) == jaw.a) {
        return false;
      }
    }
    return (parammjd.a != null) && (parammjd.a.length() != 0);
  }
  
  public static boolean a(Context paramContext, int paramInt1, String[] paramArrayOfString, int paramInt2)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt1);
    if (localjdc == null) {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt1);
    }
    ContentValues localContentValues;
    String str3;
    do
    {
      return false;
      localContentValues = new ContentValues(1);
      localContentValues.put("read_state", Integer.valueOf(paramInt2));
      String str1 = String.valueOf(efj.b("key", paramArrayOfString.length));
      String str2 = String.valueOf("read_state");
      str3 = 20 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " and " + str2 + " != " + paramInt2;
    } while (localjdc.getWritableDatabase().update("notifications", localContentValues, str3, paramArrayOfString) <= 0);
    a(paramContext, paramInt1, true);
    return true;
  }
  
  private static boolean a(jan paramjan)
  {
    return (paramjan == jan.b) || (paramjan == jan.c) || (paramjan == jan.e);
  }
  
  public static mkr[] a(Context paramContext, int paramInt, String paramString)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    jdb localjdb = efj.a(paramContext, paramInt, new String[] { paramString });
    try
    {
      if (localjdb.moveToFirst())
      {
        mkf[] arrayOfmkf = localjdb.c().b;
        int i = arrayOfmkf.length;
        for (int j = 0; j < i; j++) {
          for (mkr localmkr : arrayOfmkf[j].a.b) {
            if ((!TextUtils.isEmpty(localmkr.b)) && (!localLinkedHashMap.containsKey(localmkr.b))) {
              localLinkedHashMap.put(localmkr.b, localmkr);
            }
          }
        }
      }
      return (mkr[])localLinkedHashMap.values().toArray(new mkr[localLinkedHashMap.size()]);
    }
    finally
    {
      localjdb.close();
    }
  }
  
  public static qrc[] a(Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    localArrayList = new ArrayList();
    jdb localjdb = efj.a(paramContext, paramInt, paramArrayOfString);
    try
    {
      if (localjdb.moveToNext())
      {
        qrc localqrc = new qrc();
        localqrc.a = localjdb.getString(localjdb.getColumnIndex("key"));
        localqrc.b = Long.valueOf(localjdb.a());
        localArrayList.add(localqrc);
      }
      return (qrc[])localArrayList.toArray(new qrc[localArrayList.size()]);
    }
    finally
    {
      localjdb.close();
    }
  }
  
  public static Long b(Context paramContext, int paramInt)
  {
    try
    {
      localjdc = jdd.a(paramContext).a(paramInt);
      if (localjdc != null) {
        break label52;
      }
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      localObject2 = null;
    }
    finally
    {
      try
      {
        for (;;)
        {
          jdc localjdc;
          Object localObject2;
          label52:
          int i = localCursor.getCount();
          if (i == 0)
          {
            localCursor.close();
            localObject2 = null;
          }
          else
          {
            localCursor.moveToFirst();
            Long localLong = Long.valueOf(localCursor.getLong(localCursor.getColumnIndex("sync_version")));
            localObject2 = localLong;
            localCursor.close();
          }
        }
      }
      finally
      {
        Cursor localCursor;
        localCursor.close();
      }
      localObject1 = finally;
    }
    return localObject2;
    localCursor = localjdc.getReadableDatabase().query("user_data", new String[] { "sync_version" }, null, null, null, null, null, null);
  }
  
  private static String b(izx paramizx)
  {
    switch (jdk.a[paramizx.ordinal()])
    {
    default: 
      String str1 = a;
      String str2 = String.valueOf(paramizx);
      jdr.c(str1, 24 + String.valueOf(str2).length() + "Unknown fetch category: " + str2);
      return null;
    case 1: 
      return "important_sync_token";
    }
    return "low_sync_token";
  }
  
  private static void b(Context paramContext, int paramInt, long paramLong)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null)
    {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("sync_version", Long.valueOf(paramLong));
    a(localContentValues, localjdc.getWritableDatabase());
  }
  
  public static void b(Context paramContext, int paramInt, izx paramizx, jan paramjan, qqt paramqqt)
  {
    try
    {
      jcg.a(paramContext, paramInt, paramqqt.b, paramjan);
      mjd[] arrayOfmjd = jcg.a(paramqqt.b);
      String str = a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(arrayOfmjd.length);
      jdr.a(str, String.format("Have [%d] notifications after filtering ack notifications.", arrayOfObject));
      a(paramContext, paramInt, arrayOfmjd, false);
      a(paramContext, paramInt, paramizx, paramqqt.d);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private static void b(Context paramContext, int paramInt, izx paramizx, byte[] paramArrayOfByte)
  {
    String str1 = b(paramizx);
    if (str1 == null)
    {
      String str2 = a;
      String str3 = String.valueOf(paramizx);
      jdr.c(str2, 48 + String.valueOf(str3).length() + "Cannot store paging token for unknown category: " + str3);
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(str1, paramArrayOfByte);
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null)
    {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      return;
    }
    a(localContentValues, localjdc.getWritableDatabase());
  }
  
  /* Error */
  public static byte[] b(Context paramContext, int paramInt, izx paramizx)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_2
    //   4: invokestatic 190	jdj:a	(Lizx;)Ljava/lang/String;
    //   7: astore 4
    //   9: aload 4
    //   11: ifnonnull +60 -> 71
    //   14: getstatic 15	jdj:a	Ljava/lang/String;
    //   17: astore 5
    //   19: aload_2
    //   20: invokestatic 36	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   23: astore 6
    //   25: aload 5
    //   27: new 38	java/lang/StringBuilder
    //   30: dup
    //   31: bipush 51
    //   33: aload 6
    //   35: invokestatic 36	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   38: invokevirtual 41	java/lang/String:length	()I
    //   41: iadd
    //   42: invokespecial 44	java/lang/StringBuilder:<init>	(I)V
    //   45: ldc_w 535
    //   48: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload 6
    //   53: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: invokestatic 58	jdr:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   62: aconst_null
    //   63: astore 7
    //   65: ldc 2
    //   67: monitorexit
    //   68: aload 7
    //   70: areturn
    //   71: aload_0
    //   72: iload_1
    //   73: aload 4
    //   75: invokestatic 538	jdj:b	(Landroid/content/Context;ILjava/lang/String;)[B
    //   78: astore 8
    //   80: aload 8
    //   82: astore 7
    //   84: goto -19 -> 65
    //   87: astore_3
    //   88: ldc 2
    //   90: monitorexit
    //   91: aload_3
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	paramContext	Context
    //   0	93	1	paramInt	int
    //   0	93	2	paramizx	izx
    //   87	5	3	localObject1	Object
    //   7	67	4	str1	String
    //   17	9	5	str2	String
    //   23	29	6	str3	String
    //   63	20	7	localObject2	Object
    //   78	3	8	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   3	9	87	finally
    //   14	62	87	finally
    //   71	80	87	finally
  }
  
  private static byte[] b(Context paramContext, int paramInt, String paramString)
  {
    try
    {
      localjdc = jdd.a(paramContext).a(paramInt);
      if (localjdc != null) {
        break label54;
      }
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      localObject2 = null;
    }
    finally
    {
      try
      {
        for (;;)
        {
          jdc localjdc;
          Object localObject2;
          label54:
          int i = localCursor.getCount();
          if (i == 0)
          {
            localCursor.close();
            localObject2 = null;
          }
          else
          {
            localCursor.moveToFirst();
            byte[] arrayOfByte = localCursor.getBlob(localCursor.getColumnIndexOrThrow(paramString));
            localObject2 = arrayOfByte;
            localCursor.close();
          }
        }
      }
      finally
      {
        Cursor localCursor;
        localCursor.close();
      }
      localObject1 = finally;
    }
    return localObject2;
    localCursor = localjdc.getReadableDatabase().query("user_data", new String[] { paramString }, null, null, null, null, null, null);
  }
  
  public static jah[] b(Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    jdb localjdb = efj.a(paramContext, paramInt, paramArrayOfString);
    jah[] arrayOfjah;
    try
    {
      arrayOfjah = new jah[localjdb.getCount()];
      while (localjdb.moveToNext())
      {
        int i = localjdb.getPosition();
        jai localjai = new jai();
        localjai.a = localjdb.getString(localjdb.getColumnIndex("key"));
        localjai.b = localjdb.i();
        localjai.c = localjdb.g();
        localjai.d = localjdb.h();
        arrayOfjah[i] = localjai.a();
      }
    }
    finally
    {
      localjdb.close();
    }
    return arrayOfjah;
  }
  
  public static void c(Context paramContext, int paramInt)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null)
    {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      return;
    }
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("read_state", Integer.valueOf(2));
    localjdc.getWritableDatabase().update("notifications", localContentValues, "read_state IN (1,4)", null);
    a(paramContext, paramInt, true);
  }
  
  /* Error */
  public static byte[] c(Context paramContext, int paramInt, izx paramizx)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_2
    //   4: invokestatic 532	jdj:b	(Lizx;)Ljava/lang/String;
    //   7: astore 4
    //   9: aload 4
    //   11: ifnonnull +60 -> 71
    //   14: getstatic 15	jdj:a	Ljava/lang/String;
    //   17: astore 5
    //   19: aload_2
    //   20: invokestatic 36	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   23: astore 6
    //   25: aload 5
    //   27: new 38	java/lang/StringBuilder
    //   30: dup
    //   31: bipush 49
    //   33: aload 6
    //   35: invokestatic 36	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   38: invokevirtual 41	java/lang/String:length	()I
    //   41: iadd
    //   42: invokespecial 44	java/lang/StringBuilder:<init>	(I)V
    //   45: ldc_w 577
    //   48: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload 6
    //   53: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 54	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: invokestatic 58	jdr:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   62: aconst_null
    //   63: astore 7
    //   65: ldc 2
    //   67: monitorexit
    //   68: aload 7
    //   70: areturn
    //   71: aload_0
    //   72: iload_1
    //   73: aload 4
    //   75: invokestatic 538	jdj:b	(Landroid/content/Context;ILjava/lang/String;)[B
    //   78: astore 8
    //   80: aload 8
    //   82: astore 7
    //   84: goto -19 -> 65
    //   87: astore_3
    //   88: ldc 2
    //   90: monitorexit
    //   91: aload_3
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	paramContext	Context
    //   0	93	1	paramInt	int
    //   0	93	2	paramizx	izx
    //   87	5	3	localObject1	Object
    //   7	67	4	str1	String
    //   17	9	5	str2	String
    //   23	29	6	str3	String
    //   63	20	7	localObject2	Object
    //   78	3	8	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   3	9	87	finally
    //   14	62	87	finally
    //   71	80	87	finally
  }
  
  public static void d(Context paramContext, int paramInt)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null)
    {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      return;
    }
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("read_state", Integer.valueOf(4));
    localjdc.getWritableDatabase().update("notifications", localContentValues, "priority IN (3,4) and read_state = 1", null);
    a(paramContext, paramInt, true);
  }
  
  public static int e(Context paramContext, int paramInt)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null)
    {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
      return 0;
    }
    Cursor localCursor = localjdc.getReadableDatabase().rawQuery("SELECT COUNT(*) FROM notifications", null);
    try
    {
      localCursor.moveToFirst();
      int i = localCursor.getInt(0);
      return i;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static Cursor f(Context paramContext, int paramInt)
  {
    jdc localjdc = jdd.a(paramContext).a(paramInt);
    if (localjdc == null) {
      jdr.c(a, 52 + "Cannot find database helper for account: " + paramInt);
    }
    Cursor localCursor;
    do
    {
      return null;
      localCursor = localjdc.getReadableDatabase().query("user_data", null, null, null, null, null, null);
    } while (localCursor.getCount() == 0);
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdj
 * JD-Core Version:    0.7.0.1
 */