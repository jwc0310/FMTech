import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public final class aqb
  extends hqe<apz>
  implements dfx<apz>
{
  private static final String[] y = { "_id", "timestamp" };
  private static final String[] z = { "_id" };
  private final int d;
  private Uri e;
  private Long f;
  private int h;
  private final int r;
  private final dka s;
  private final int t;
  private final String u;
  private final String v;
  private boolean w;
  private ContentObserver x = new fv(this);
  
  public aqb(Context paramContext, int paramInt1, Uri paramUri, Long paramLong, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramContext);
    this.d = paramInt1;
    this.s = ((dka)mbb.a(paramContext, dka.class));
    this.e = paramUri;
    this.f = paramLong;
    this.h = paramInt2;
    this.r = 10000;
    this.t = paramInt4;
    this.u = String.valueOf(efj.m(paramInt4));
    this.v = String.valueOf(efj.l(paramInt4));
  }
  
  private final Long r()
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(this.l, this.d).getReadableDatabase();
    boolean bool = efj.n(this.t);
    String[] arrayOfString1 = z;
    String[] arrayOfString2 = new String[4];
    arrayOfString2[0] = this.u;
    int i = 0;
    if (bool) {
      i = 1;
    }
    arrayOfString2[1] = String.valueOf(i);
    arrayOfString2[2] = this.v;
    arrayOfString2[3] = this.e.toString();
    Cursor localCursor = localSQLiteDatabase.query("all_photos", arrayOfString1, "is_primary = 1 AND (media_attr & ? != 0 OR ?) AND media_attr & ? == 0 AND local_content_uri = ?", arrayOfString2, null, null, null, "1");
    try
    {
      if (localCursor.moveToFirst())
      {
        Long localLong = Long.valueOf(localCursor.getLong(0));
        return localLong;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private final boolean s()
  {
    return (this.d != -1) && (this.s.d(this.d));
  }
  
  public final void a(ipf paramipf)
  {
    if (paramipf.d != null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.e = paramipf.d;
        this.f = null;
      }
      return;
    }
  }
  
  protected final void g()
  {
    super.g();
    if (!this.w)
    {
      this.l.getContentResolver().registerContentObserver(jqx.a(this.d), false, this.x);
      this.w = true;
    }
  }
  
  protected final void l()
  {
    super.l();
    if (this.w)
    {
      this.l.getContentResolver().unregisterContentObserver(this.x);
      this.w = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aqb
 * JD-Core Version:    0.7.0.1
 */