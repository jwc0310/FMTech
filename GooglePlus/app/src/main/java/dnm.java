import android.net.Uri;
import android.provider.BaseColumns;

public final class dnm
  implements BaseColumns
{
  public static final Uri a = Uri.parse("content://subscribedfeeds/feeds");
  
  static
  {
    Uri.parse("content://subscribedfeeds/deleted_feeds");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnm
 * JD-Core Version:    0.7.0.1
 */