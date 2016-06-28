import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class iza
  implements hsa
{
  public final String a()
  {
    return "NetworkQueueDb";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    try
    {
      paramSQLiteDatabase.delete("networkqueue_items", null, null);
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE networkqueue_items(_id INTEGER PRIMARY KEY AUTOINCREMENT,handle TEXT NOT NULL,item_creation_timestamp INT,item_state INT,item_data BLOB);");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    return true;
  }
  
  public final int b()
  {
    return 1;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase) {}
  
  public final String[] c()
  {
    return new String[] { "networkqueue_items" };
  }
  
  public final String[] d()
  {
    return new String[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iza
 * JD-Core Version:    0.7.0.1
 */