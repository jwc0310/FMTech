import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import java.io.IOException;

public final class bbz
  extends hqe<Point>
{
  private final Uri d;
  
  public bbz(Context paramContext, Uri paramUri)
  {
    super(paramContext);
    this.d = paramUri;
  }
  
  private Point r()
  {
    ContentResolver localContentResolver = this.l.getContentResolver();
    try
    {
      Point localPoint = efj.b(localContentResolver, this.d);
      return localPoint;
    }
    catch (IOException localIOException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbz
 * JD-Core Version:    0.7.0.1
 */