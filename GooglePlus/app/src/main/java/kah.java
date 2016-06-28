import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

public final class kah
  implements jyy
{
  private final Context a;
  
  public kah(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Cursor a(int paramInt, String paramString)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("profile_header");
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, kaq.a, "gaia_id = ? ", new String[] { paramString }, null, null, null);
    if (localCursor.moveToFirst())
    {
      long l = localCursor.getLong(localCursor.getColumnIndexOrThrow("sync_timestamp"));
      localCursor.moveToPrevious();
      if (System.currentTimeMillis() - l > 900000L) {
        jzy.a(this.a, paramInt, paramString);
      }
      return localCursor;
    }
    jzy.a(this.a, paramInt, paramString);
    return localCursor;
  }
  
  public final fp a(Context paramContext, int paramInt, String paramString)
  {
    return new kai(paramContext, paramInt, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kah
 * JD-Core Version:    0.7.0.1
 */