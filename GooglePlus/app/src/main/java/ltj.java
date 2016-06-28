import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public final class ltj
{
  private int a = 1000;
  private final ltk b;
  private SQLiteDatabase c;
  private boolean d = false;
  
  public ltj(int paramInt, String paramString, Context paramContext)
  {
    this.b = new ltk(paramContext.getApplicationContext(), paramString);
  }
  
  private final void c()
  {
    efj.d(true, "Trying to access queue after cleanUp()");
    if ((this.c == null) || (!this.c.isOpen())) {}
    try
    {
      this.c = this.b.getWritableDatabase();
      d();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      throw new IllegalArgumentException("Error opening database");
    }
  }
  
  private final void d()
  {
    SQLiteDatabase localSQLiteDatabase = this.c;
    String str = String.valueOf("DELETE FROM queue WHERE item_id <= (SELECT item_id FROM queue ORDER BY item_id DESC LIMIT 1 OFFSET ");
    int i = this.a;
    localSQLiteDatabase.execSQL(13 + String.valueOf(str).length() + str + i + ");");
  }
  
  private ltl e()
  {
    localObject1 = null;
    try
    {
      localCursor = this.c.query("queue", new String[] { "item_id", "item_content", "item_time" }, null, null, null, null, "item_id ASC", "1");
      ltd localltd;
      if (localObject1 == null) {
        break label135;
      }
    }
    finally
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          localltd = new ltd(localCursor.getLong(localCursor.getColumnIndexOrThrow("item_id")), localCursor.getString(localCursor.getColumnIndexOrThrow("item_content")), localCursor.getLong(localCursor.getColumnIndexOrThrow("item_time")));
          if (localCursor != null) {
            localCursor.close();
          }
          return localltd;
        }
        if (localCursor != null) {
          localCursor.close();
        }
        return null;
      }
      finally
      {
        Cursor localCursor;
        localObject1 = localCursor;
      }
      localObject2 = finally;
    }
    localObject1.close();
    label135:
    throw localObject2;
  }
  
  /* Error */
  private final Long f()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 45	ltj:c	Landroid/database/sqlite/SQLiteDatabase;
    //   6: ldc 101
    //   8: iconst_1
    //   9: anewarray 68	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: ldc 107
    //   16: aastore
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: aconst_null
    //   21: ldc 144
    //   23: ldc 111
    //   25: invokevirtual 115	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface 120 1 0
    //   35: ifeq +35 -> 70
    //   38: aload_3
    //   39: aload_3
    //   40: ldc 107
    //   42: invokeinterface 126 2 0
    //   47: invokeinterface 130 2 0
    //   52: invokestatic 149	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   55: astore 4
    //   57: aload_3
    //   58: ifnull +9 -> 67
    //   61: aload_3
    //   62: invokeinterface 140 1 0
    //   67: aload 4
    //   69: areturn
    //   70: aload_3
    //   71: ifnull +9 -> 80
    //   74: aload_3
    //   75: invokeinterface 140 1 0
    //   80: aconst_null
    //   81: areturn
    //   82: astore_2
    //   83: aload_1
    //   84: ifnull +9 -> 93
    //   87: aload_1
    //   88: invokeinterface 140 1 0
    //   93: aload_2
    //   94: athrow
    //   95: astore_2
    //   96: aload_3
    //   97: astore_1
    //   98: goto -15 -> 83
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	ltj
    //   1	97	1	localObject1	Object
    //   82	12	2	localObject2	Object
    //   95	1	2	localObject3	Object
    //   28	69	3	localCursor	Cursor
    //   55	13	4	localLong	Long
    // Exception table:
    //   from	to	target	type
    //   2	29	82	finally
    //   29	57	95	finally
  }
  
  /* Error */
  public final String a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 151	ltj:c	()V
    //   6: aload_0
    //   7: invokespecial 153	ltj:e	()Lltl;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnonnull +11 -> 23
    //   15: aconst_null
    //   16: astore 7
    //   18: aload_0
    //   19: monitorexit
    //   20: aload 7
    //   22: areturn
    //   23: aload_0
    //   24: getfield 45	ltj:c	Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore_3
    //   28: iconst_1
    //   29: anewarray 68	java/lang/String
    //   32: astore 4
    //   34: aload 4
    //   36: iconst_0
    //   37: aload_2
    //   38: invokevirtual 158	ltl:a	()J
    //   41: invokestatic 161	java/lang/Long:toString	(J)Ljava/lang/String;
    //   44: aastore
    //   45: aload_3
    //   46: ldc 101
    //   48: ldc 163
    //   50: aload 4
    //   52: invokevirtual 167	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   55: pop
    //   56: aload_2
    //   57: invokevirtual 169	ltl:b	()Ljava/lang/String;
    //   60: astore 6
    //   62: aload 6
    //   64: astore 7
    //   66: goto -48 -> 18
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	ltj
    //   69	4	1	localObject1	Object
    //   10	47	2	localltl	ltl
    //   27	19	3	localSQLiteDatabase	SQLiteDatabase
    //   32	19	4	arrayOfString	String[]
    //   60	3	6	str	String
    //   16	49	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	69	finally
    //   23	62	69	finally
  }
  
  public final void a(String paramString)
  {
    if (paramString == null) {
      try
      {
        throw new NullPointerException();
      }
      finally {}
    }
    c();
    long l1 = System.currentTimeMillis();
    Long localLong = f();
    if ((localLong != null) && (localLong.longValue() > l1))
    {
      long l2 = localLong.longValue() - l1;
      SQLiteDatabase localSQLiteDatabase = this.c;
      String str = String.valueOf("UPDATE queue SET item_time = MAX(item_time - ");
      localSQLiteDatabase.execSQL(25 + String.valueOf(str).length() + str + l2 + ", 0);");
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("item_time", Long.valueOf(l1));
    localContentValues.put("item_content", paramString);
    this.c.insertOrThrow("queue", null, localContentValues);
    d();
  }
  
  /* Error */
  public final int b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: invokespecial 151	ltj:c	()V
    //   8: aload_0
    //   9: getfield 45	ltj:c	Landroid/database/sqlite/SQLiteDatabase;
    //   12: ldc 205
    //   14: aconst_null
    //   15: invokevirtual 209	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   18: astore_1
    //   19: aload_1
    //   20: invokeinterface 120 1 0
    //   25: pop
    //   26: aload_1
    //   27: aload_1
    //   28: ldc 211
    //   30: invokeinterface 126 2 0
    //   35: invokeinterface 215 2 0
    //   40: istore 5
    //   42: aload_1
    //   43: ifnull +9 -> 52
    //   46: aload_1
    //   47: invokeinterface 140 1 0
    //   52: aload_0
    //   53: monitorexit
    //   54: iload 5
    //   56: ireturn
    //   57: astore_3
    //   58: aload_1
    //   59: ifnull +9 -> 68
    //   62: aload_1
    //   63: invokeinterface 140 1 0
    //   68: aload_3
    //   69: athrow
    //   70: astore_2
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	ltj
    //   1	62	1	localCursor	Cursor
    //   70	4	2	localObject1	Object
    //   57	12	3	localObject2	Object
    //   40	15	5	i	int
    // Exception table:
    //   from	to	target	type
    //   8	42	57	finally
    //   4	8	70	finally
    //   46	52	70	finally
    //   62	68	70	finally
    //   68	70	70	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltj
 * JD-Core Version:    0.7.0.1
 */