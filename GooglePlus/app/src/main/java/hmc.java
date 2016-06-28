import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class hmc
  extends hqe<hhf>
{
  private static final long d = TimeUnit.HOURS.toMillis(1L);
  private final fv e = new fv(this);
  private final hhh f;
  private final int h;
  private final String r;
  private final String s;
  private final String t;
  private boolean u;
  
  public hmc(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext);
    this.h = paramInt;
    this.s = paramString1;
    this.t = paramString2;
    this.r = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    this.f = ((hhh)mbb.a(paramContext, hhh.class));
  }
  
  private final void a(rck paramrck, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.l, this.h);
    localSQLiteDatabase.beginTransaction();
    try
    {
      if (TextUtils.equals(this.t, paramString)) {
        paramString = null;
      }
      efj.a(localSQLiteDatabase, this.r, 2, paramString);
      if (paramrck != null)
      {
        rcj[] arrayOfrcj = paramrck.a;
        if (arrayOfrcj != null) {}
      }
      else
      {
        return;
      }
      int i = 0;
      int j = paramrck.a.length;
      while (i < j)
      {
        localSQLiteDatabase.insertWithOnConflict("srchcxns", null, efj.a(paramrck.a[i]), 5);
        i++;
      }
      ContentValues localContentValues = new ContentValues(3);
      localContentValues.put("cxn_srch_query", this.s);
      localContentValues.put("cxn_srch_query_timestamp", Long.valueOf(System.currentTimeMillis()));
      localContentValues.put("_id", Integer.valueOf(1));
      localContentValues.put("cxn_srch_token", this.t);
      localSQLiteDatabase.insertWithOnConflict("srchcxnsqry", null, localContentValues, 5);
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  private final hhf r()
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.l, this.h);
    String str = this.f.d(this.h);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("srchcxns");
    return new hhf(localSQLiteQueryBuilder.query(localSQLiteDatabase, hog.a, null, null, null, null, "_id ASC"), str);
  }
  
  protected final void g()
  {
    if ((!this.u) || (m())) {
      super.g();
    }
  }
  
  protected final boolean o()
  {
    Context localContext = this.l;
    super.o();
    localContext.getContentResolver().registerContentObserver(((hho)mbb.a(localContext, hho.class)).c(), false, this.e);
    return true;
  }
  
  protected final boolean p()
  {
    super.p();
    this.l.getContentResolver().unregisterContentObserver(this.e);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmc
 * JD-Core Version:    0.7.0.1
 */