import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.os.AsyncTask;

public final class dtx
  extends AsyncTask<Void, Void, Boolean>
{
  private final dty a;
  private final Context b;
  private final int c;
  private final String d;
  private final long e;
  
  public dtx(Context paramContext, int paramInt, dty paramdty, String paramString, long paramLong)
  {
    this.b = paramContext.getApplicationContext();
    this.c = paramInt;
    this.a = paramdty;
    this.d = paramString;
    if (l > 0L) {}
    for (;;)
    {
      this.e = l;
      return;
      l = 10000L;
    }
  }
  
  private Boolean a()
  {
    bqj localbqj = bqj.a(this.b, this.c);
    long l1 = System.currentTimeMillis();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.d;
    long l2 = 0L;
    try
    {
      long l3 = DatabaseUtils.longForQuery(localbqj.getReadableDatabase(), "SELECT last_refresh_time FROM tile_requests WHERE view_id = ?", arrayOfString);
      l2 = l3;
    }
    catch (SQLiteDoneException localSQLiteDoneException)
    {
      label50:
      boolean bool;
      break label50;
    }
    if (l2 < l1 - this.e) {}
    for (bool = true;; bool = false)
    {
      if (bool)
      {
        ContentValues localContentValues = new ContentValues(1);
        localContentValues.put("last_refresh_time", Long.valueOf(l1));
        localbqj.getWritableDatabase().update("tile_requests", localContentValues, "view_id = ?", arrayOfString);
      }
      return Boolean.valueOf(bool);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtx
 * JD-Core Version:    0.7.0.1
 */