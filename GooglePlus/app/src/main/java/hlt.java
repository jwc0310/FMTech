import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class hlt
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final String d;
  private final int l;
  
  public hlt(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    super("UpdateCollexionTask");
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.l = paramInt2;
  }
  
  protected final hae a(Context paramContext)
  {
    hks localhks = new hks(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c, this.d, this.l);
    localhks.i();
    if (localhks.n()) {
      return new hae(localhks.o, localhks.q, null);
    }
    nei localnei = localhks.a;
    if (localnei == null) {
      return new hae(0, null, null);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    localSQLiteDatabase.beginTransaction();
    try
    {
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = this.b;
      Cursor localCursor = localSQLiteDatabase.query("cxns", null, "cxn_id = ? ", arrayOfString1, null, null, null);
      if ((localCursor != null) && (!localCursor.moveToFirst())) {
        localCursor = null;
      }
      ContentValues localContentValues = efj.a(localnei, localCursor);
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.b;
      localSQLiteDatabase.update("cxns", localContentValues, "cxn_id = ?", arrayOfString2);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      paramContext.getContentResolver().notifyChange(((hho)mbb.a(paramContext, hho.class)).a(), null);
      return new hae(localhks.o, localhks.q, null);
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.Is);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlt
 * JD-Core Version:    0.7.0.1
 */