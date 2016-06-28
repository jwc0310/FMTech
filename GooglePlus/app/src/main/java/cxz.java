import android.content.Context;

public final class cxz
  extends jqw
{
  private static final String[] r = { "_id", "tile_id", "cluster_id", "title", "subtitle", "image_url", "cluster_count", "view_order", "acl", "media_attr", "content_url" };
  
  public cxz(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, paramInt1, jrf.a(paramContext, paramInt1), r, "type = 2 AND view_order > 50100 AND (NOT media_attr & 4194304) AND media_attr & 1048576 != 0", 7, null, false, false, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxz
 * JD-Core Version:    0.7.0.1
 */