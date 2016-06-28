import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class lrt
  implements hsa
{
  public final String a()
  {
    return "synclet";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.delete("synclet_status", null, null);
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE synclet_status (synclet_name TEXT PRIMARY KEY, last_sync INT NOT NULL);");
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
    return new String[] { "synclet_status" };
  }
  
  public final String[] d()
  {
    return new String[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lrt
 * JD-Core Version:    0.7.0.1
 */