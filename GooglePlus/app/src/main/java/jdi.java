import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class jdi
{
  private static Map<String, jdb> a(Context paramContext, int paramInt, jdb paramjdb)
  {
    HashMap localHashMap1 = new HashMap();
    mkc localmkc;
    if (paramjdb.moveToFirst())
    {
      localmkc = paramjdb.m();
      if ((localmkc == null) || (TextUtils.isEmpty(localmkc.e))) {
        break label182;
      }
    }
    HashMap localHashMap2;
    label182:
    for (String str2 = localmkc.e;; str2 = "gns_notifications_group")
    {
      String str3 = paramjdb.getString(paramjdb.getColumnIndex("key"));
      if (!localHashMap1.containsKey(str2)) {
        localHashMap1.put(str2, new HashSet());
      }
      ((Set)localHashMap1.get(str2)).add(str3);
      if (paramjdb.moveToNext()) {
        break;
      }
      localHashMap2 = new HashMap();
      Iterator localIterator = localHashMap1.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        localHashMap2.put(str1, efj.a(paramContext, paramInt, (Collection)localHashMap1.get(str1)));
      }
    }
    return localHashMap2;
  }
  
  /* Error */
  public static void a(Context paramContext, int paramInt, String... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 104	jdd:a	(Landroid/content/Context;)Ljdd;
    //   4: iload_1
    //   5: invokevirtual 107	jdd:a	(I)Ljdc;
    //   8: invokevirtual 113	jdc:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual 118	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   16: aload_3
    //   17: ldc 120
    //   19: invokevirtual 124	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: arraylength
    //   24: ifle +46 -> 70
    //   27: ldc 126
    //   29: invokestatic 130	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   32: astore 5
    //   34: ldc 37
    //   36: aload_2
    //   37: arraylength
    //   38: invokestatic 134	efj:b	(Ljava/lang/String;I)Ljava/lang/String;
    //   41: invokestatic 130	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   44: astore 6
    //   46: aload 6
    //   48: invokevirtual 138	java/lang/String:length	()I
    //   51: ifeq +28 -> 79
    //   54: aload 5
    //   56: aload 6
    //   58: invokevirtual 142	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   61: astore 7
    //   63: aload_3
    //   64: aload 7
    //   66: aload_2
    //   67: invokevirtual 145	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: aload_3
    //   71: invokevirtual 148	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   74: aload_3
    //   75: invokevirtual 151	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   78: return
    //   79: new 89	java/lang/String
    //   82: dup
    //   83: aload 5
    //   85: invokespecial 153	java/lang/String:<init>	(Ljava/lang/String;)V
    //   88: astore 7
    //   90: goto -27 -> 63
    //   93: astore 4
    //   95: aload_3
    //   96: invokevirtual 151	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   99: aload 4
    //   101: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	paramContext	Context
    //   0	102	1	paramInt	int
    //   0	102	2	paramVarArgs	String[]
    //   11	85	3	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   93	7	4	localObject	Object
    //   32	52	5	str1	String
    //   44	13	6	str2	String
    //   61	28	7	str3	String
    // Exception table:
    //   from	to	target	type
    //   12	63	93	finally
    //   63	70	93	finally
    //   70	74	93	finally
    //   79	90	93	finally
  }
  
  public final Map<String, jdb> a(Context paramContext, int paramInt)
  {
    jdb localjdb = efj.a(paramContext, paramInt, "priority IN (3,4) AND read_state = 1 AND push_enabled != 0", null);
    try
    {
      Map localMap = a(paramContext, paramInt, localjdb);
      return localMap;
    }
    finally
    {
      localjdb.close();
    }
  }
  
  public final Map<String, jdb> b(Context paramContext, int paramInt)
  {
    jdb localjdb = efj.a(paramContext, paramInt, "system_tray_version > 0", null);
    try
    {
      Map localMap = a(paramContext, paramInt, localjdb);
      return localMap;
    }
    finally
    {
      localjdb.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdi
 * JD-Core Version:    0.7.0.1
 */