import android.content.Context;
import android.net.Uri;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;

public final class aru
  implements iox
{
  public final Uri a(Context paramContext, String paramString, ipm paramipm)
  {
    return GooglePhotosImageProvider.a(paramContext, paramString, paramipm);
  }
  
  public final String a(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    return GooglePhotosImageProvider.b(paramUri);
  }
  
  public final boolean b(Uri paramUri)
  {
    return GooglePhotosImageProvider.a(paramUri);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aru
 * JD-Core Version:    0.7.0.1
 */