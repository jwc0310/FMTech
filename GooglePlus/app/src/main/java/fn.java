import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

final class fn
  extends fm
{
  public final Cursor a(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, jb paramjb)
  {
    if (paramjb != null) {}
    for (;;)
    {
      try
      {
        localObject = paramjb.b();
        Cursor localCursor = paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, (CancellationSignal)localObject);
        return localCursor;
      }
      catch (Exception localException)
      {
        Object localObject;
        if (!(localException instanceof OperationCanceledException)) {
          continue;
        }
        throw new jc();
        throw localException;
      }
      localObject = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fn
 * JD-Core Version:    0.7.0.1
 */