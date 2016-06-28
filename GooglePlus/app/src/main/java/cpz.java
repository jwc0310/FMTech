import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;

final class cpz
  extends AsyncTask<Void, Void, Void>
{
  private Context a;
  
  cpz(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private Void a()
  {
    ContentResolver localContentResolver = this.a.getContentResolver();
    Cursor localCursor = localContentResolver.query(hbu.a(this.a), hcf.a, hcf.b, null, null);
    if (localCursor == null) {
      return null;
    }
    try
    {
      ContentValues localContentValues = new ContentValues(5);
      while (localCursor.moveToNext())
      {
        localContentValues.put("upload_account_id", Integer.valueOf(localCursor.getInt(5)));
        localContentValues.put("media_id", Long.valueOf(localCursor.getLong(1)));
        localContentValues.put("media_url", localCursor.getString(2));
        localContentValues.put("upload_reason", Integer.valueOf(10));
        localContentValues.put("upload_state", Integer.valueOf(100));
        localContentResolver.insert(hbu.e(this.a), localContentValues);
        localContentValues.clear();
      }
    }
    finally
    {
      localCursor.close();
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpz
 * JD-Core Version:    0.7.0.1
 */