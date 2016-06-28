import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public final class aur
  implements auy
{
  private static final String[] a = { "media_store_token" };
  private final Context b;
  
  public aur(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public final String a(int paramInt, Uri paramUri)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(this.b, paramInt).getReadableDatabase();
    String[] arrayOfString1 = a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = paramUri.toString();
    Cursor localCursor = localSQLiteDatabase.query("all_photos_local_sync", arrayOfString1, "media_store_uri = ?", arrayOfString2, null, null, null);
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        String str = localCursor.getString(0);
        localObject2 = str;
      }
      return localObject2;
    }
    finally
    {
      localCursor.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aur
 * JD-Core Version:    0.7.0.1
 */