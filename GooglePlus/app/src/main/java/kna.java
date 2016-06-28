import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public final class kna
{
  final Context a;
  private final kmw b;
  
  public kna(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((kmw)mbb.a(paramContext, kmw.class));
  }
  
  private final ContentValues a(kmu paramkmu)
  {
    byte[] arrayOfByte = this.b.a(paramkmu.c);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("draft_data", arrayOfByte);
    localContentValues.put("draft_message_snippet", paramkmu.a);
    localContentValues.put("draft_last_update_timestamp", Long.valueOf(paramkmu.b));
    localContentValues.put("draft_audience", paramkmu.d);
    localContentValues.put("draft_count", Integer.valueOf(paramkmu.e));
    localContentValues.put("draft_thumbnail", paramkmu.f);
    localContentValues.put("reshare_activity_id", paramkmu.g);
    return localContentValues;
  }
  
  final long a(kmu paramkmu, long paramLong, int paramInt1, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt2);
    localSQLiteDatabase.beginTransaction();
    long l;
    switch (paramInt1)
    {
    default: 
      try
      {
        throw new IllegalArgumentException(56 + "The supplied transaction type of " + paramInt1 + " is invalid.");
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    case 0: 
      l = localSQLiteDatabase.insert("drafts", null, a(paramkmu));
    }
    for (;;)
    {
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      if ((l == -1L) && (Log.isLoggable("DraftsDatabase", 6))) {
        Log.e("DraftsDatabase", 62 + "Draft database operation of type " + paramInt1 + " was unsuccessful.");
      }
      return l;
      ContentValues localContentValues = a(paramkmu);
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = Long.toString(paramLong);
      l = localSQLiteDatabase.update("drafts", localContentValues, "_id=?", arrayOfString2);
      continue;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = Long.toString(paramLong);
      l = localSQLiteDatabase.delete("drafts", "_id=?", arrayOfString1);
      continue;
      int i = localSQLiteDatabase.delete("drafts", null, null);
      l = i;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kna
 * JD-Core Version:    0.7.0.1
 */