import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;

public final class irj
{
  public static final Uri[] a;
  private static Uri b = MediaStore.Images.Media.getContentUri("phoneStorage");
  private static Uri c = MediaStore.Video.Media.getContentUri("phoneStorage");
  
  static
  {
    Uri[] arrayOfUri = new Uri[4];
    arrayOfUri[0] = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[1] = b;
    arrayOfUri[2] = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[3] = c;
    a = arrayOfUri;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irj
 * JD-Core Version:    0.7.0.1
 */