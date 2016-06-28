import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

final class gyb
  implements hsa
{
  public final String a()
  {
    return "analytics_legacy";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase) {}
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE analytics_events (event_data BLOB NOT NULL)");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("AnalyticsLegacyDatabase", 4)) {
      new StringBuilder(45).append("Upgrade database: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    return true;
  }
  
  public final int b()
  {
    return 1;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase) {}
  
  public final String[] c()
  {
    return new String[] { "analytics_events" };
  }
  
  public final String[] d()
  {
    return new String[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyb
 * JD-Core Version:    0.7.0.1
 */