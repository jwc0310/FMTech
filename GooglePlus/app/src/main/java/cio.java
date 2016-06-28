import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.net.Uri.Builder;

public final class cio
  extends hqj
{
  private static final String[] r = { "parent_id" };
  private final int s;
  private final String t;
  private final String u;
  
  public cio(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, jrf.b.buildUpon().appendEncodedPath(paramString2).build());
    this.s = paramInt;
    this.t = paramString1;
    this.u = paramString2;
  }
  
  public final Cursor o()
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(this.l, this.s).getReadableDatabase();
    String[] arrayOfString1 = r;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = this.t;
    arrayOfString2[1] = this.u;
    return localSQLiteDatabase.query("all_tiles", arrayOfString1, "view_id = ? AND tile_id = ?", arrayOfString2, null, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cio
 * JD-Core Version:    0.7.0.1
 */