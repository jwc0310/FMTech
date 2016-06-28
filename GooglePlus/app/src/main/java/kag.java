import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class kag
  extends gzf
{
  private final int a;
  private final String b;
  private final boolean c;
  
  public kag(int paramInt, String paramString, boolean paramBoolean)
  {
    super("muteProfileTask");
    this.a = paramInt;
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  protected final hae a(Context paramContext)
  {
    kaf localkaf = new kaf(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c);
    localkaf.a.i();
    localkaf.a.c("muteProfileOp");
    if (localkaf.a.n()) {
      return new hae(localkaf.a.o, localkaf.a.q, null);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    ContentValues localContentValues = new ContentValues(3);
    localContentValues.put("gaia_id", this.b);
    localContentValues.put("is_muted", Boolean.valueOf(this.c));
    localContentValues.put("sync_timestamp", Long.valueOf(System.currentTimeMillis()));
    localSQLiteDatabase.insertWithOnConflict("muted_profile", null, localContentValues, 5);
    paramContext.getContentResolver().notifyChange(((jyx)mbb.a(paramContext, jyx.class)).b(), null);
    return new hae(true);
  }
  
  public final String b(Context paramContext)
  {
    if (this.c) {}
    for (int i = efj.Uf;; i = efj.Uh) {
      return paramContext.getString(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kag
 * JD-Core Version:    0.7.0.1
 */