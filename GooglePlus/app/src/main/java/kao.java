import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import java.util.concurrent.TimeUnit;

final class kao
  implements jzc
{
  private static final long a = TimeUnit.MINUTES.toMillis(15L);
  private final Context b;
  
  kao(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public final Cursor a(int paramInt, String paramString)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.b, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("restricted_profile");
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, kaq.b, "gaia_id = ? ", new String[] { paramString }, null, null, null);
    if (localCursor.moveToFirst())
    {
      long l = localCursor.getLong(localCursor.getColumnIndexOrThrow("sync_timestamp"));
      localCursor.moveToPrevious();
      if (System.currentTimeMillis() - l > a) {
        kae.a(this.b, paramInt, paramString);
      }
      return localCursor;
    }
    kae.a(this.b, paramInt, paramString);
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kao
 * JD-Core Version:    0.7.0.1
 */