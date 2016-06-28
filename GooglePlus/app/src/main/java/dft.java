import android.content.Context;

public final class dft
  extends jqw
{
  public static final String[] r = { "_id", "tile_id", "type", "cluster_id", "title", "subtitle", "image_url", "cluster_count", "plusone_count", "comment_count", "view_order", "acl", "user_actions", "media_attr", "CASE type WHEN 2 THEN data ELSE NULL END", "NULL AS filename", "content_url" };
  
  public dft(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, paramInt, paramString, r, null, 10, null, false, false);
  }
  
  public dft(Context paramContext, int paramInt1, String paramString1, String paramString2, String[] paramArrayOfString, int paramInt2)
  {
    super(paramContext, paramInt1, paramString1, paramArrayOfString, paramString2, 10, null, false, true, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dft
 * JD-Core Version:    0.7.0.1
 */