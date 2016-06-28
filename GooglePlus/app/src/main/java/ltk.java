import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

final class ltk
  extends SQLiteOpenHelper
{
  public ltk(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE queue (item_id INTEGER PRIMARY KEY AUTOINCREMENT,item_content TEXT NOT NULL,item_time INTEGER NOT NULL);");
    paramSQLiteDatabase.execSQL("CREATE INDEX item_time_index on queue(item_time);");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("PersistentSqliteQueue", 3))
    {
      String str1 = String.valueOf(Integer.toString(paramInt1));
      String str2 = String.valueOf(Integer.toString(paramInt2));
      new StringBuilder(13 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("onUpgrade").append(str1).append(" -> ").append(str2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltk
 * JD-Core Version:    0.7.0.1
 */