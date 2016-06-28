import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.util.Log;

public final class bhr
  extends cun<mpt, mpu>
{
  private final String a;
  
  public bhr(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, paramInt, "allphotosview", new mpt(), new mpu());
    this.a = paramString;
  }
  
  private static String a(Context paramContext)
  {
    Uri[] arrayOfUri = new Uri[4];
    arrayOfUri[0] = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[1] = itf.b;
    arrayOfUri[2] = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[3] = itf.a;
    String[] arrayOfString = { "_id" };
    ContentResolver localContentResolver = paramContext.getContentResolver();
    int i = 0;
    for (;;)
    {
      Object localObject1 = null;
      Cursor localCursor;
      if (i < 4)
      {
        localCursor = localContentResolver.query(arrayOfUri[i], arrayOfString, "_data LIKE '%/DCIM/%'", null, "_id DESC LIMIT 1");
        if (localCursor == null) {
          break label130;
        }
      }
      try
      {
        if (localCursor.moveToNext())
        {
          long l = localCursor.getLong(0);
          String str = ContentUris.withAppendedId(arrayOfUri[i], l).toString();
          localObject1 = str;
          return localObject1;
        }
        label130:
        if (localCursor != null) {
          localCursor.close();
        }
        i++;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          Log.e("allphotosview", "Could not load camera photo", localSQLiteException);
          if (localCursor != null) {
            localCursor.close();
          }
        }
      }
      finally
      {
        if (localCursor == null) {
          break;
        }
        localCursor.close();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bhr
 * JD-Core Version:    0.7.0.1
 */