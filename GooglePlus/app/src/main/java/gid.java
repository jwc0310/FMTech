import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

public class gid
{
  final ContentResolver a;
  final Uri b;
  
  public gid(ContentResolver paramContentResolver, Uri paramUri)
  {
    this.a = paramContentResolver;
    this.b = paramUri;
  }
  
  public InputStream a()
  {
    return this.a.openInputStream(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gid
 * JD-Core Version:    0.7.0.1
 */