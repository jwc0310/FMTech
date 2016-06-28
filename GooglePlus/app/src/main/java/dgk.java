import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;

public final class dgk
  extends hqj
{
  private static final String[] v = { "_id", "fingerprint", "local_path", "remote_url", "media_attr" };
  private int r;
  private String s;
  private boolean t;
  private final fv u = new fv(this);
  
  public dgk(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext);
    this.r = paramInt;
    this.s = null;
  }
  
  protected final void g()
  {
    super.g();
    if (!this.t)
    {
      this.l.getContentResolver().registerContentObserver(bvf.a, false, this.u);
      this.t = true;
    }
  }
  
  protected final void l()
  {
    super.l();
    if (this.t)
    {
      this.l.getContentResolver().unregisterContentObserver(this.u);
      this.t = false;
    }
  }
  
  public final Cursor o()
  {
    SQLiteDatabase localSQLiteDatabase = bvd.a(this.l).getReadableDatabase();
    String[] arrayOfString1 = v;
    String str1;
    String[] arrayOfString2;
    if (this.r != -1)
    {
      str1 = "account_id = -1 OR account_id = ?";
      if (this.r == -1) {
        break label145;
      }
      arrayOfString2 = new String[1];
      arrayOfString2[0] = Integer.toString(this.r);
    }
    for (;;)
    {
      hqh localhqh = new hqh(localSQLiteDatabase.query("photos", arrayOfString1, str1, arrayOfString2, null, null, null));
      if (this.s != null) {
        while (localhqh.moveToNext())
        {
          String str2 = localhqh.getString(1);
          if (TextUtils.equals(this.s, str2))
          {
            Bundle localBundle = new Bundle();
            localBundle.putInt("start_position", localhqh.getPosition());
            localhqh.setExtras(localBundle);
          }
        }
      }
      return localhqh;
      str1 = "account_id = -1";
      break;
      label145:
      arrayOfString2 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgk
 * JD-Core Version:    0.7.0.1
 */