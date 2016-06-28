import android.content.Context;
import java.util.List;

public final class dee
  extends jqw
{
  private static final String[] r = { "_id", "tile_id", "image_url", "plusone_count", "comment_count", "view_order", "type", "media_attr", "user_actions", "timestamp", "content_url" };
  
  public dee(Context paramContext, int paramInt, String paramString, List<ipf> paramList)
  {
    this(paramContext, paramInt, paramString, null, true);
  }
  
  private dee(Context paramContext, int paramInt, String paramString, List<ipf> paramList, boolean paramBoolean)
  {
    super(paramContext, paramInt, paramString, r, a("( type == 4 OR type == 100 )", paramList), 5, null, false, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dee
 * JD-Core Version:    0.7.0.1
 */