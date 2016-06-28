import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.net.Uri.Builder;

public final class jmc
  extends hqj
{
  private static String[] r = { "volume", "notifications_enabled" };
  private final Context s;
  private final int t;
  private final String u;
  private final int v;
  private final giz w;
  private final hrz x;
  
  public jmc(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    super(paramContext);
    this.s = paramContext;
    this.t = paramInt1;
    if (paramInt2 == 1) {}
    for (;;)
    {
      this.u = paramString;
      this.v = paramInt2;
      this.w = ((giz)mbb.a(paramContext, giz.class));
      this.x = ((hrz)mbb.a(paramContext, hrz.class));
      return;
      paramString = "v.whatshot";
    }
  }
  
  private final long a(Context paramContext, int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.x.b(paramContext, paramInt).getReadableDatabase();
    try
    {
      String str1 = String.valueOf("SELECT last_volume_sync  FROM circles WHERE     circle_id = ");
      String str2 = String.valueOf(DatabaseUtils.sqlEscapeString(paramString));
      if (str2.length() != 0) {}
      for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
        return DatabaseUtils.longForQuery(localSQLiteDatabase, str3, null);
      }
      return -1L;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
  }
  
  public final Cursor o()
  {
    long l = a(this.s, this.t, this.u);
    if ((l == -1L) || (System.currentTimeMillis() - l > 900000L))
    {
      kcg localkcg = new kcg(this.w.a(this.t).b("account_name"), null);
      new jhz(this.s, localkcg, this.t, Integer.valueOf(this.v), this.u).i();
    }
    String str1 = String.valueOf("circle_id = ");
    String str2 = String.valueOf(DatabaseUtils.sqlEscapeString(this.u));
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      Uri.Builder localBuilder = efj.w(this.s).buildUpon().appendQueryParameter("account", String.valueOf(this.t));
      return this.s.getContentResolver().query(localBuilder.build(), r, str3, null, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jmc
 * JD-Core Version:    0.7.0.1
 */