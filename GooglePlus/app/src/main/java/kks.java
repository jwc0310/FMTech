import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.os.Bundle;
import java.util.Locale;

public final class kks
  extends jqw
{
  private static final String[] r = { "_id", "tile_id", "image_url", "view_order", "media_attr", "user_actions", "content_url" };
  private String w;
  
  public kks(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, paramInt, paramString, r, "( type == 4 )", 3, null, false, false);
    this.w = String.format(Locale.US, "SELECT title FROM all_tiles WHERE view_id = '%s' AND type = 2", new Object[] { paramString });
  }
  
  public final Cursor o()
  {
    Cursor localCursor = super.o();
    if (localCursor == null) {
      return null;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.l, this.t);
    try
    {
      String str2 = DatabaseUtils.stringForQuery(localSQLiteDatabase, this.w, null);
      str1 = str2;
    }
    catch (SQLiteDoneException localSQLiteDoneException)
    {
      for (;;)
      {
        hqd localhqd;
        Bundle localBundle;
        String str1 = null;
      }
    }
    if ((localCursor instanceof hqd))
    {
      localhqd = (hqd)localCursor;
      localBundle = localhqd.getExtras();
      if ((localBundle == Bundle.EMPTY) || (localBundle == null)) {
        localBundle = new Bundle();
      }
      localBundle.putString("album_name", str1);
      localhqd.setExtras(localBundle);
    }
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kks
 * JD-Core Version:    0.7.0.1
 */