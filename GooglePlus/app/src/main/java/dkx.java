import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.plus.service.DreamSettingsActivity;

public final class dkx
  extends hqj
{
  private final int r;
  private final String s;
  private final String[] t;
  
  public dkx(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.r = paramInt;
    if (this.r != -1)
    {
      this.s = ((giz)mbb.a(paramContext, giz.class)).a(this.r).b("gaia_id");
      String[] arrayOfString1 = new String[1];
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.s;
      arrayOfString1[0] = jrf.a(2, arrayOfString2);
      this.t = arrayOfString1;
      return;
    }
    this.s = null;
    this.t = null;
  }
  
  public final Cursor o()
  {
    if (this.r == -1) {
      return null;
    }
    Cursor localCursor = DreamSettingsActivity.a(this.l, aau.iH);
    SQLiteDatabase localSQLiteDatabase = bqj.a(this.l, this.r).getReadableDatabase();
    MatrixCursor localMatrixCursor = new MatrixCursor(DreamSettingsActivity.e);
    if (DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT count(*) FROM all_photos WHERE is_primary = 1 AND media_attr & 32 = 0 AND media_attr & 128 = 0 AND media_attr & 64 = 0", null) > 0L)
    {
      Object[] arrayOfObject2 = new Object[4];
      arrayOfObject2[0] = Integer.valueOf(0);
      arrayOfObject2[1] = null;
      arrayOfObject2[2] = this.l.getString(aau.fr);
      arrayOfObject2[3] = Integer.valueOf(3);
      localMatrixCursor.addRow(arrayOfObject2);
    }
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.s;
    String str = jrf.a(0, arrayOfString);
    if (DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT count(*) FROM all_tiles WHERE view_id = ? AND media_attr & 512 == 0 AND type == 4 AND media_attr & 32 = 0 AND media_attr & 128 = 0 AND media_attr & 64 = 0", new String[] { str }) > 0L)
    {
      Object[] arrayOfObject1 = new Object[4];
      arrayOfObject1[0] = Integer.valueOf(0);
      arrayOfObject1[1] = str;
      arrayOfObject1[2] = this.l.getString(aau.fs);
      arrayOfObject1[3] = Integer.valueOf(2);
      localMatrixCursor.addRow(arrayOfObject1);
    }
    if (DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT count(*) FROM all_tiles WHERE view_id = ?", this.t) == 0L) {
      new bmt(this.l, this.r, this.s, null, false).i();
    }
    return new MergeCursor(new Cursor[] { localCursor, localMatrixCursor, localSQLiteDatabase.query("all_tiles", DreamSettingsActivity.e, "view_id = ?", this.t, null, null, null) });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkx
 * JD-Core Version:    0.7.0.1
 */