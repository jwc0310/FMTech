import android.content.Context;
import android.database.DatabaseUtils;

public final class deb
  extends jqw
{
  private static String[] r = { "_id", "tile_id", "image_url", "view_order", "media_attr", "photo_id", "title", "content_url" };
  
  public deb(Context paramContext, int paramInt, String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramContext, paramInt, paramString, r, a(paramArrayOfString), 3, null, paramBoolean, false);
  }
  
  private static String a(String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder("type == 4");
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      localStringBuilder.append(" AND photo_id").append(" IN (");
      for (int i = 0; i < paramArrayOfString.length; i++)
      {
        if (i > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(DatabaseUtils.sqlEscapeString(paramArrayOfString[i]));
      }
      localStringBuilder.append(")");
    }
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     deb
 * JD-Core Version:    0.7.0.1
 */