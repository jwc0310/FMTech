import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class knb
  implements hsa
{
  public final String a()
  {
    return "DraftsDatabasePartition";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase) {}
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE drafts (_id INTEGER PRIMARY KEY AUTOINCREMENT, draft_message_snippet TEXT, draft_last_update_timestamp INTEGER NOT NULL, draft_count INTEGER, draft_audience TEXT, draft_thumbnail TEXT, reshare_activity_id TEXT, draft_data BLOB NOT NULL);");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS drafts");
    paramSQLiteDatabase.execSQL("CREATE TABLE drafts (_id INTEGER PRIMARY KEY AUTOINCREMENT, draft_message_snippet TEXT, draft_last_update_timestamp INTEGER NOT NULL, draft_count INTEGER, draft_audience TEXT, draft_thumbnail TEXT, reshare_activity_id TEXT, draft_data BLOB NOT NULL);");
    return true;
  }
  
  public final int b()
  {
    return 1;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase) {}
  
  public final String[] c()
  {
    return new String[] { "drafts" };
  }
  
  public final String[] d()
  {
    return new String[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knb
 * JD-Core Version:    0.7.0.1
 */