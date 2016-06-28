final class bto
  extends btw
{
  public bto(btl parambtl, int paramInt1, int paramInt2, int paramInt3)
  {
    super(parambtl, paramInt1, paramInt2, paramInt3);
  }
  
  protected final String a()
  {
    return "(SELECT image_url as all_photos_image_url, timestamp as all_photos_timestamp FROM all_photos WHERE all_photos_image_url IS NOT NULL AND is_primary = 1 AND (has_edit_list = 1 OR local_content_uri IS NULL) LIMIT ? OFFSET ?) INNER JOIN media_cache ON (all_photos_image_url = media_cache.image_url)";
  }
  
  protected final String[] a(int paramInt)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramInt);
    return arrayOfString;
  }
  
  protected final String b()
  {
    return "http_status = 200 AND representation_type & ? != 0";
  }
  
  protected final String[] c()
  {
    return new String[0];
  }
  
  protected final String d()
  {
    return "all_photos_timestamp DESC";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bto
 * JD-Core Version:    0.7.0.1
 */