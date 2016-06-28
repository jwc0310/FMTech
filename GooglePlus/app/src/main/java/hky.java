import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public final class hky
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final int d;
  private final boolean l;
  private final boolean m;
  private final gnb n;
  
  public hky(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, gnb paramgnb)
  {
    super("CreateCollexionTask");
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInt2;
    this.l = paramBoolean1;
    this.m = paramBoolean2;
    this.n = paramgnb;
  }
  
  protected final hae a(Context paramContext)
  {
    hjy localhjy = new hjy(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c, this.d, this.l, this.m, this.n);
    localhjy.i();
    if (localhjy.n()) {
      return new hae(localhjy.o, localhjy.q, null);
    }
    ndy localndy = localhjy.a;
    if (localndy == null) {
      return new hae(0, null, null);
    }
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    String str1 = localgiz.a(this.a).b("gaia_id");
    String str2 = localgiz.a(this.a).b("display_name");
    String str3 = localgiz.a(this.a).b("profile_photo_url");
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, this.a);
    localSQLiteDatabase.beginTransaction();
    try
    {
      long l1 = System.currentTimeMillis();
      ContentValues localContentValues = efj.a(localndy, null, str1, str2, str3);
      localContentValues.put("last_used_timestamp", Long.valueOf(l1));
      localContentValues.put("visibility_type", Integer.valueOf(this.d));
      localSQLiteDatabase.insertWithOnConflict("cxns", null, localContentValues, 5);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      paramContext.getContentResolver().notifyChange(((hho)mbb.a(paramContext, hho.class)).a(), null);
      hae localhae = new hae(localhjy.o, localhjy.q, null);
      Bundle localBundle = localhae.a();
      localBundle.putString("clx_name", localndy.b);
      if (localndy.a != null) {
        localBundle.putString("clx_id", localndy.a.a);
      }
      int i = efj.a(localndy);
      if (i != -1) {
        localBundle.putInt("clx_acl", i);
      }
      return localhae;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.Il);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hky
 * JD-Core Version:    0.7.0.1
 */