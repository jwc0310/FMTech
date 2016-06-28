import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

public final class cwz
  extends hqj
{
  private Context r;
  private int s;
  private boolean t;
  
  public cwz(Context paramContext, int paramInt, boolean paramBoolean)
  {
    super(paramContext, Uri.parse("content://com.google.android.apps.plus.people/followers"));
    this.r = paramContext;
    this.s = paramInt;
    this.t = paramBoolean;
  }
  
  public final Cursor o()
  {
    if (this.t)
    {
      hsb.a(this.r, this.s).delete("followers", null, null);
      this.t = false;
      return null;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.r, this.s);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("followers");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, jin.a, null, null, null, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwz
 * JD-Core Version:    0.7.0.1
 */