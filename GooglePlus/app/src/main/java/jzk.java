import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import java.util.concurrent.TimeUnit;

public final class jzk
  implements jyw
{
  private static final long a = TimeUnit.MINUTES.toMillis(15L);
  private final Context b;
  
  public jzk(Context paramContext)
  {
    this.b = paramContext;
  }
  
  private final boolean a(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.b, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("profile_flairs_page_sync_timestamp");
    Cursor localCursor1;
    try
    {
      Cursor localCursor2 = localSQLiteQueryBuilder.query(localSQLiteDatabase, kaq.d, "gaia_id = ? ", new String[] { paramString }, null, null, null);
      localCursor1 = localCursor2;
      long l1;
      long l2;
      long l3;
      if (localCursor1 == null) {
        break label161;
      }
    }
    finally
    {
      try
      {
        if (localCursor1.moveToFirst())
        {
          l1 = localCursor1.getLong(localCursor1.getColumnIndexOrThrow("sync_timestamp"));
          l2 = ((hgs)mbb.a(this.b, hgs.class)).a() - l1;
          l3 = a;
          if (l2 <= l3)
          {
            if (localCursor1 != null) {
              localCursor1.close();
            }
            return false;
          }
        }
        if (localCursor1 != null) {
          localCursor1.close();
        }
        return true;
      }
      finally {}
      localObject1 = finally;
      localCursor1 = null;
    }
    localCursor1.close();
    label161:
    throw localObject1;
  }
  
  public final Cursor a(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.b, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("flairs_preference");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, kaq.f, null, null, null, null, null);
  }
  
  public final String a()
  {
    return "GetFlairItemsTask";
  }
  
  public final void a(int paramInt, String paramString, boolean paramBoolean)
  {
    
    if (a(paramInt, paramString)) {
      jzh.a(this.b, null, paramInt, paramString, paramBoolean);
    }
  }
  
  public final gzf b(int paramInt, String paramString, boolean paramBoolean)
  {
    return new jzh(paramInt, paramString, paramBoolean);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzk
 * JD-Core Version:    0.7.0.1
 */