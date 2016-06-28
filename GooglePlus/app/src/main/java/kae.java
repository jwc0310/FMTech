import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class kae
  extends gzf
{
  private final int a;
  private final String b;
  
  private kae(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    this.a = paramInt;
    this.b = paramString2;
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    gzj.a(paramContext, new kae("restrictedStatusTask", paramInt, paramString));
  }
  
  protected final hae a(Context paramContext)
  {
    kad localkad = new kad(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localkad.a.i();
    localkad.a.c("restrictedStatusOp");
    if (localkad.a.n()) {
      return new hae(localkad.a.o, localkad.a.q, null);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    ContentValues localContentValues = new ContentValues(3);
    localContentValues.put("gaia_id", this.b);
    if (localkad.a()) {}
    for (int i = 1;; i = 0)
    {
      localContentValues.put("is_restricted", Integer.valueOf(i));
      localContentValues.put("sync_timestamp", Long.valueOf(System.currentTimeMillis()));
      localSQLiteDatabase.insertWithOnConflict("restricted_profile", null, localContentValues, 5);
      paramContext.getContentResolver().notifyChange(((jyx)mbb.a(paramContext, jyx.class)).c(), null);
      return new hae(true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kae
 * JD-Core Version:    0.7.0.1
 */