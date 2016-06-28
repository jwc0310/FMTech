import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class hbq
  implements Runnable
{
  hbq(hbo paramhbo, String paramString) {}
  
  public final void run()
  {
    synchronized (this.b.e)
    {
      SQLiteDatabase localSQLiteDatabase = this.b.d.getWritableDatabase();
      localSQLiteDatabase.beginTransaction();
      try
      {
        ContentValues localContentValues = new ContentValues(1);
        localContentValues.put("bucket_id", this.a);
        localSQLiteDatabase.insert("exclude_bucket", null, localContentValues);
        hbm.a(localSQLiteDatabase, this.a);
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        return;
      }
      finally
      {
        localObject3 = finally;
        localSQLiteDatabase.endTransaction();
        throw localObject3;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbq
 * JD-Core Version:    0.7.0.1
 */