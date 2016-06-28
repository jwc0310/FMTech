import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import java.util.concurrent.TimeUnit;

public final class jzq
  implements jza
{
  private static final long a = TimeUnit.MINUTES.toMillis(15L);
  private final Context b;
  private final hhh c;
  private final kyn d;
  
  public jzq(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((hhh)mbb.a(paramContext, hhh.class));
    this.d = ((kyn)mbb.a(paramContext, kyn.class));
  }
  
  private final jzr a(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.b, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("profile_mixed_flairs_sync_timestamp");
    jzr localjzr = new jzr(this);
    try
    {
      Cursor localCursor2 = localSQLiteQueryBuilder.query(localSQLiteDatabase, kaq.e, "gaia_id = ? ", new String[] { paramString }, null, null, null);
      localCursor1 = localCursor2;
      long l;
      boolean bool;
      if (localCursor1 == null) {
        break label192;
      }
    }
    finally
    {
      try
      {
        if (localCursor1.moveToFirst())
        {
          l = localCursor1.getLong(localCursor1.getColumnIndexOrThrow("sync_timestamp"));
          if (System.currentTimeMillis() - l <= a) {
            localjzr.a = false;
          }
          if (localCursor1.getInt(localCursor1.getColumnIndexOrThrow("has_more_items")) != 0) {}
          for (bool = true;; bool = false)
          {
            localjzr.b = bool;
            if (localCursor1 != null) {
              localCursor1.close();
            }
            return localjzr;
          }
        }
        if (localCursor1 != null) {
          localCursor1.close();
        }
        return localjzr;
      }
      finally
      {
        Cursor localCursor1;
        break label180;
      }
      localObject1 = finally;
      localCursor1 = null;
    }
    label180:
    localCursor1.close();
    label192:
    throw localObject1;
  }
  
  public final jyz a(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    efj.l();
    jyz localjyz = new jyz();
    jzr localjzr = a(paramInt1, paramString);
    if (localjzr.a)
    {
      jzj.a(this.b, null, paramInt1, paramString, paramBoolean, paramInt2);
      return localjyz;
    }
    if (paramBoolean)
    {
      localjyz.a = this.c.k(paramInt1);
      localjyz.b = this.d.c(paramInt1);
      if (localjyz.a.getCount() + localjyz.b.getCount() != 0) {
        break label150;
      }
    }
    label150:
    for (boolean bool = false;; bool = localjzr.b)
    {
      localjyz.c = bool;
      return localjyz;
      localjyz.a = this.c.k(paramInt1, paramString);
      localjyz.b = this.d.i(paramInt1, paramString);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzq
 * JD-Core Version:    0.7.0.1
 */