import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class jbm
  implements jac
{
  private Context a;
  
  static
  {
    jdr.a(jbm.class);
  }
  
  public jbm(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private final void a(int paramInt1, int paramInt2, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase;
    if (paramInt1 != -1)
    {
      localSQLiteDatabase = jdd.a(this.a).a(paramInt1).getWritableDatabase();
      localSQLiteDatabase.beginTransaction();
    }
    try
    {
      ContentValues localContentValues = new ContentValues(3);
      localContentValues.put("time", Long.valueOf(System.currentTimeMillis()));
      localContentValues.put("log", Integer.valueOf(paramInt2));
      localContentValues.put("comment", paramString);
      localSQLiteDatabase.insert("statistics", null, localContentValues);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Integer.toString(paramInt2);
      Cursor localCursor = localSQLiteDatabase.query("statistics", null, "log =? ", arrayOfString, null, null, "time ASC");
      int i = -10 + localCursor.getCount();
      for (int j = 0; j < i; j++)
      {
        localCursor.moveToNext();
        localSQLiteDatabase.delete("statistics", "_id =? ", new String[] { localCursor.getString(localCursor.getColumnIndex("_id")) });
      }
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      this.a.getContentResolver().notifyChange(jda.b, null);
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public final Cursor a(int paramInt1, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = jdd.a(this.a).a(paramInt1).getReadableDatabase();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Integer.toString(paramInt2);
    return localSQLiteDatabase.query("statistics", null, "log =? ", arrayOfString, null, null, "time DESC");
  }
  
  public final void a(int paramInt)
  {
    a(paramInt, 2, null);
  }
  
  public final void a(int paramInt, String paramString)
  {
    if (paramString != null) {
      a(paramInt, 1, paramString);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbm
 * JD-Core Version:    0.7.0.1
 */