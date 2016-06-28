import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import java.util.concurrent.TimeUnit;

final class kam
  implements jzb
{
  private static final long a = TimeUnit.MINUTES.toMillis(15L);
  private final Context b;
  
  kam(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public final Cursor a(int paramInt, String paramString)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.b, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("muted_profile");
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, kaq.c, "gaia_id = ? ", new String[] { paramString }, null, null, null);
    if (localCursor.moveToFirst())
    {
      long l = localCursor.getLong(localCursor.getColumnIndexOrThrow("sync_timestamp"));
      localCursor.moveToPrevious();
      if (System.currentTimeMillis() - l > a) {
        kaa.a(this.b, paramInt, paramString);
      }
      return localCursor;
    }
    kaa.a(this.b, paramInt, paramString);
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kam
 * JD-Core Version:    0.7.0.1
 */