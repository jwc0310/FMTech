import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

class fm
{
  public Cursor a(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, jb paramjb)
  {
    if ((paramjb != null) && (paramjb.a())) {
      throw new jc();
    }
    return paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fm
 * JD-Core Version:    0.7.0.1
 */