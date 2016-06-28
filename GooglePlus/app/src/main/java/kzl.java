import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;

public final class kzl
{
  private final Context a;
  private final String b;
  
  public kzl(Context paramContext, String paramString)
  {
    this.b = paramString;
    this.a = paramContext;
  }
  
  private final boolean a(int paramInt, ContentValues paramContentValues)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt);
    localSQLiteDatabase.beginTransaction();
    try
    {
      if ((localSQLiteDatabase.update(this.b, paramContentValues, null, null) == 0) && (DatabaseUtils.queryNumEntries(localSQLiteDatabase, this.b) == 0L))
      {
        long l = localSQLiteDatabase.insert(this.b, null, paramContentValues);
        if (l == -1L) {
          return false;
        }
      }
      localSQLiteDatabase.setTransactionSuccessful();
      return true;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final void a(int paramInt, String paramString, long paramLong)
  {
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put(paramString, Long.valueOf(paramLong));
    a(paramInt, localContentValues);
  }
  
  public final long b(int paramInt, String paramString, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    try
    {
      String str = this.b;
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, 13 + String.valueOf(paramString).length() + String.valueOf(str).length() + "SELECT " + paramString + " FROM " + str, null);
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      return -1L;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzl
 * JD-Core Version:    0.7.0.1
 */