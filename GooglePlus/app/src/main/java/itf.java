import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;

public final class itf
{
  public static final Uri a = MediaStore.Video.Media.getContentUri("phoneStorage");
  public static final Uri b = MediaStore.Images.Media.getContentUri("phoneStorage");
  public static final Uri[] c;
  
  static
  {
    Uri[] arrayOfUri = new Uri[4];
    arrayOfUri[0] = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[1] = b;
    arrayOfUri[2] = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[3] = a;
    c = arrayOfUri;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     itf
 * JD-Core Version:    0.7.0.1
 */