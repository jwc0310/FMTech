import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.social.picasalegacy.FingerprintEntry;

public final class jsh
  extends SQLiteOpenHelper
{
  private Context a;
  
  jsh(Context paramContext)
  {
    super(paramContext.getApplicationContext(), "fingerprint.db", null, 2);
    this.a = paramContext;
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
        this.a.deleteDatabase("fingerprint.db");
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
        this.a.deleteDatabase("fingerprint.db");
        SQLiteDatabase localSQLiteDatabase1 = super.getWritableDatabase();
        Object localObject2 = localSQLiteDatabase1;
      }
    }
    finally {}
    return localObject2;
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    FingerprintEntry.a.a(paramSQLiteDatabase);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 2)
    {
      paramSQLiteDatabase.execSQL("ALTER TABLE fingerprints ADD COLUMN image_url TEXT");
      paramInt1 = 2;
    }
    if (paramInt1 != paramInt2)
    {
      FingerprintEntry.a.b(paramSQLiteDatabase);
      onCreate(paramSQLiteDatabase);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsh
 * JD-Core Version:    0.7.0.1
 */