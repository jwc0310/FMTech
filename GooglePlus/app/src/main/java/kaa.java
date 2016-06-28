import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class kaa
  extends gzf
{
  private final int a;
  private final String b;
  
  private kaa(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    this.a = paramInt;
    this.b = paramString2;
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    gzj.a(paramContext, new kaa(" mutedStatusTask", paramInt, paramString));
  }
  
  protected final hae a(Context paramContext)
  {
    jzz localjzz = new jzz(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localjzz.a.i();
    localjzz.a.c("mutedStatusOp");
    if (localjzz.a.n()) {
      return new hae(localjzz.a.o, localjzz.a.q, null);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    ContentValues localContentValues = new ContentValues(3);
    localContentValues.put("gaia_id", this.b);
    if (localjzz.a()) {}
    for (int i = 1;; i = 0)
    {
      localContentValues.put("is_muted", Integer.valueOf(i));
      localContentValues.put("sync_timestamp", Long.valueOf(System.currentTimeMillis()));
      localSQLiteDatabase.insertWithOnConflict("muted_profile", null, localContentValues, 5);
      paramContext.getContentResolver().notifyChange(((jyx)mbb.a(paramContext, jyx.class)).b(), null);
      return new hae(true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kaa
 * JD-Core Version:    0.7.0.1
 */