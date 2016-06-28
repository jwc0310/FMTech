import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public final class gwk
  implements hsa
{
  public final String a()
  {
    return "album_upload";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase) {}
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE album_upload_batch (_id INTEGER PRIMARY KEY AUTOINCREMENT, album_id TEXT NOT NULL, created_time INTEGER NOT NULL)");
    paramSQLiteDatabase.execSQL(gwh.a);
    paramSQLiteDatabase.execSQL("CREATE INDEX album_upload_batch_album_idx ON album_upload_batch (album_id)");
    paramSQLiteDatabase.execSQL("CREATE INDEX album_upload_media_batch_idx ON album_upload_media (batch_id,status)");
    paramSQLiteDatabase.execSQL("CREATE INDEX album_upload_media_status_idx ON album_upload_media (status)");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("AlbumUploadDatabase", 4)) {
      new StringBuilder(45).append("Upgrade database: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    if (paramInt1 < 3) {
      return false;
    }
    if (paramInt1 == 3) {
      paramSQLiteDatabase.execSQL("ALTER TABLE album_upload_media ADD COLUMN media_key TEXT NOT NULL DEFAULT ''");
    }
    return true;
  }
  
  public final int b()
  {
    return 4;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase) {}
  
  public final String[] c()
  {
    return new String[] { "album_upload_batch", "album_upload_media" };
  }
  
  public final String[] d()
  {
    return new String[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwk
 * JD-Core Version:    0.7.0.1
 */