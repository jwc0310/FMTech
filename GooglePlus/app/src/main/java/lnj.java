import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public final class lnj
{
  private static final String[] a = { "package_name", "name", "source_name", "embed_deep_link", "launch_source", "embed_appinvite" };
  
  public static lnk a(Context paramContext, int paramInt, String paramString)
  {
    Cursor localCursor = hsb.a(paramContext, paramInt).query("deep_link_installs_view", a, "package_name=?", new String[] { paramString }, null, null, null, null);
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          String str2 = localCursor.getString(localCursor.getColumnIndex("launch_source"));
          if ("stream_install".equals(str2))
          {
            localObject2 = localCursor.getBlob(localCursor.getColumnIndex("embed_deep_link"));
            if (localObject2 == null) {
              break label265;
            }
            str3 = llu.a((byte[])localObject2).b;
            lnk locallnk = new lnk(localCursor.getString(localCursor.getColumnIndex("name")), localCursor.getString(localCursor.getColumnIndex("source_name")), localCursor.getString(localCursor.getColumnIndex("package_name")), str2, str3);
            return locallnk;
          }
          boolean bool = "stream_install_interactive_post".equals(str2);
          Object localObject2 = null;
          if (!bool) {
            continue;
          }
          byte[] arrayOfByte = localCursor.getBlob(localCursor.getColumnIndex("embed_appinvite"));
          localObject2 = arrayOfByte;
          continue;
        }
        localCursor.close();
        if (Log.isLoggable("DeepLinking", 5))
        {
          String str1 = String.valueOf(paramString);
          if (str1.length() != 0) {
            "no deep link install data found for ".concat(str1);
          }
        }
        else
        {
          return null;
        }
      }
      finally
      {
        localCursor.close();
      }
      new String("no deep link install data found for ");
      continue;
      label265:
      String str3 = "";
    }
  }
  
  private static void a(Context paramContext, int paramInt)
  {
    if (paramInt == -1) {
      return;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    localSQLiteDatabase.beginTransaction();
    try
    {
      long l = System.currentTimeMillis() - 3600000L;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(l);
      int i = localSQLiteDatabase.delete("deep_link_installs", "timestamp<?", arrayOfString);
      if ((i > 0) && (Log.isLoggable("DeepLinking", 3))) {
        new StringBuilder(50).append(i).append(" stale deep link install row(s) deleted");
      }
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
    localContentValues.put("package_name", paramString1);
    localContentValues.put("launch_source", paramString4);
    localContentValues.put("activity_id", paramString2);
    localContentValues.put("author_id", paramString3);
    if ((localSQLiteDatabase.replace("deep_link_installs", null, localContentValues) <= 0L) && (Log.isLoggable("DeepLinking", 5)))
    {
      String str = String.valueOf(paramString1);
      if (str.length() == 0) {
        break label115;
      }
      "failed to add deep link install data for ".concat(str);
    }
    for (;;)
    {
      a(paramContext, paramInt);
      return;
      label115:
      new String("failed to add deep link install data for ");
    }
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = paramSQLiteDatabase.delete("deep_link_installs", null, null);
    if (Log.isLoggable("DeepLinking", 3)) {
      new StringBuilder(51).append("cleanupData deleted deep link installs: ").append(i);
    }
  }
  
  /* Error */
  public static void b(Context paramContext, int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokestatic 30	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   5: astore_3
    //   6: aload_3
    //   7: invokevirtual 115	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   10: aload_3
    //   11: ldc 131
    //   13: ldc 34
    //   15: iconst_1
    //   16: anewarray 10	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: aload_2
    //   22: aastore
    //   23: invokevirtual 137	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   26: ifgt +34 -> 60
    //   29: ldc 86
    //   31: iconst_5
    //   32: invokestatic 92	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   35: ifeq +25 -> 60
    //   38: aload_2
    //   39: invokestatic 96	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   42: astore 5
    //   44: aload 5
    //   46: invokevirtual 100	java/lang/String:length	()I
    //   49: ifeq +25 -> 74
    //   52: ldc 192
    //   54: aload 5
    //   56: invokevirtual 106	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   59: pop
    //   60: aload_3
    //   61: invokevirtual 154	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   64: aload_3
    //   65: invokevirtual 157	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   68: aload_0
    //   69: iload_1
    //   70: invokestatic 186	lnj:a	(Landroid/content/Context;I)V
    //   73: return
    //   74: new 10	java/lang/String
    //   77: dup
    //   78: ldc 192
    //   80: invokespecial 109	java/lang/String:<init>	(Ljava/lang/String;)V
    //   83: pop
    //   84: goto -24 -> 60
    //   87: astore 4
    //   89: aload_3
    //   90: invokevirtual 157	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   93: aload 4
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	paramContext	Context
    //   0	96	1	paramInt	int
    //   0	96	2	paramString	String
    //   5	85	3	localSQLiteDatabase	SQLiteDatabase
    //   87	7	4	localObject	Object
    //   42	13	5	str	String
    // Exception table:
    //   from	to	target	type
    //   10	60	87	finally
    //   60	64	87	finally
    //   74	84	87	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnj
 * JD-Core Version:    0.7.0.1
 */