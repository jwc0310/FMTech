import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class lto
  implements hsa
{
  public final String a()
  {
    return "TimingBreakdownDb";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    try
    {
      paramSQLiteDatabase.delete("timing_breakdown_stats", null, null);
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE timing_breakdown_stats(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,categories INT,start_timestamp INT,end_timestamp INT,splits BLOB, split_timestamps BLOB);");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public final int b()
  {
    return 2;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase) {}
  
  public final String[] c()
  {
    return new String[] { "timing_breakdown_stats" };
  }
  
  public final String[] d()
  {
    return new String[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lto
 * JD-Core Version:    0.7.0.1
 */