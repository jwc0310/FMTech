import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public final class bvd
  extends SQLiteOpenHelper
{
  private static bvd a;
  private Context b;
  
  private bvd(Context paramContext)
  {
    super(paramContext.getApplicationContext(), "trash.db", null, 10);
    this.b = paramContext;
  }
  
  public static bvd a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new bvd(paramContext);
      }
      bvd localbvd = a;
      return localbvd;
    }
    finally {}
  }
  
  public final SQLiteDatabase getReadableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = super.getReadableDatabase();
      localObject2 = localSQLiteDatabase2;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        this.b.deleteDatabase("trash.db");
        SQLiteDatabase localSQLiteDatabase1 = super.getReadableDatabase();
        Object localObject2 = localSQLiteDatabase1;
      }
    }
    finally {}
    return localObject2;
  }
  
  public final SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = super.getWritableDatabase();
      localObject2 = localSQLiteDatabase2;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        this.b.deleteDatabase("trash.db");
        SQLiteDatabase localSQLiteDatabase1 = super.getWritableDatabase();
        Object localObject2 = localSQLiteDatabase1;
      }
    }
    finally {}
    return localObject2;
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    bvf.a(paramSQLiteDatabase);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    int i = 7;
    int j = 5;
    int k = 3;
    int m = 2;
    if (Log.isLoggable("TrashDatabaseHelper", 4)) {
      new StringBuilder(45).append("Upgrade database: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    bve localbve = new bve(this.b, paramSQLiteDatabase);
    if (paramInt1 < m)
    {
      SQLiteDatabase localSQLiteDatabase4 = localbve.a;
      localSQLiteDatabase4.execSQL("DROP TABLE photos");
      localSQLiteDatabase4.execSQL("CREATE TABLE photos (_ID INTEGER PRIMARY KEY AUTOINCREMENT,fingerprint TEXT NOT NULL, local_path TEXT, account_name TEXT, );");
    }
    for (;;)
    {
      if (m < k)
      {
        SQLiteDatabase localSQLiteDatabase3 = localbve.a;
        localSQLiteDatabase3.execSQL("ALTER TABLE photos ADD COLUMN remote_url TEXT");
        localSQLiteDatabase3.execSQL("ALTER TABLE photos ADD COLUMN photo_ids BLOB");
      }
      for (;;)
      {
        if (k < j)
        {
          SQLiteDatabase localSQLiteDatabase2 = localbve.a;
          localSQLiteDatabase2.execSQL("DROP TABLE photos");
          localSQLiteDatabase2.execSQL("CREATE TABLE photos (_ID INTEGER PRIMARY KEY AUTOINCREMENT,fingerprint TEXT NOT NULL, local_path TEXT, account_name TEXT, remote_url TEXT, photo_ids BLOB);");
        }
        for (;;)
        {
          if (j < 6)
          {
            SQLiteDatabase localSQLiteDatabase1 = localbve.a;
            localSQLiteDatabase1.execSQL("DROP TABLE photos");
            localSQLiteDatabase1.execSQL("CREATE TABLE photos (_id INTEGER PRIMARY KEY AUTOINCREMENT,fingerprint TEXT NOT NULL, local_path TEXT, account_name TEXT, remote_url TEXT, photo_ids BLOB);");
            j = 6;
          }
          if (j < i) {
            localbve.a.execSQL("ALTER TABLE photos ADD COLUMN media_attr INTEGER NOT NULL DEFAULT '0'");
          }
          for (;;)
          {
            if (i < 8)
            {
              localbve.a.execSQL("ALTER TABLE photos ADD COLUMN cleanup_time INTEGER NOT NULL DEFAULT CURRENT_TIMESTAMP");
              i = 8;
            }
            if (i < 9)
            {
              localbve.a.execSQL("ALTER TABLE photos ADD COLUMN restore_rows BLOB");
              i = 9;
            }
            if (i < 10)
            {
              localbve.a(localbve.a);
              i = 10;
            }
            if (i != paramInt2)
            {
              new kpx(null, "trash.db", paramInt1, paramInt2, paramInt1).b(this.b);
              if (Log.isLoggable("TrashDatabaseHelper", 6)) {
                Log.e("TrashDatabaseHelper", "Upgrade failed, dropping all tables");
              }
              hsb.b(paramSQLiteDatabase);
              hsb.c(paramSQLiteDatabase);
              onCreate(paramSQLiteDatabase);
            }
            return;
            i = j;
          }
          j = k;
        }
        k = m;
      }
      m = paramInt1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvd
 * JD-Core Version:    0.7.0.1
 */