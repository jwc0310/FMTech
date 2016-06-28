import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class ltn
  implements lsz
{
  private static final mcq a = new mcq("debug.plus.timing_breakdown");
  private Context b;
  
  public ltn(Context paramContext)
  {
    this.b = paramContext;
  }
  
  /* Error */
  public final void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	ltn:b	Landroid/content/Context;
    //   4: iload_1
    //   5: invokestatic 37	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   8: astore_3
    //   9: aload_3
    //   10: invokevirtual 42	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   13: aload_3
    //   14: ldc 44
    //   16: aconst_null
    //   17: aconst_null
    //   18: invokevirtual 48	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   21: pop
    //   22: aload_3
    //   23: invokevirtual 51	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   26: aload_3
    //   27: invokevirtual 54	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   30: return
    //   31: astore 5
    //   33: aload_3
    //   34: invokevirtual 54	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   37: return
    //   38: astore 4
    //   40: aload_3
    //   41: invokevirtual 54	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   44: aload 4
    //   46: athrow
    //   47: astore_2
    //   48: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	ltn
    //   0	49	1	paramInt	int
    //   47	1	2	localIllegalArgumentException	IllegalArgumentException
    //   8	33	3	localSQLiteDatabase	SQLiteDatabase
    //   38	7	4	localObject	Object
    //   31	1	5	localException	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   13	26	31	java/lang/Exception
    //   13	26	38	finally
    //   0	9	47	java/lang/IllegalArgumentException
  }
  
  public final void a(int paramInt, ltb paramltb) {}
  
  public final Cursor b(int paramInt)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = hsb.b(this.b, paramInt);
      return localSQLiteDatabase.query("timing_breakdown_stats", ltp.a, null, null, null, null, String.valueOf(ltp.b).concat(" DESC"));
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltn
 * JD-Core Version:    0.7.0.1
 */