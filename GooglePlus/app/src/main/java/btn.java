final class btn
  extends btv
{
  public btn(btl parambtl, int paramInt)
  {
    super(parambtl, paramInt);
  }
  
  public btn(btl parambtl, int paramInt1, int paramInt2)
  {
    super(parambtl, paramInt1, 50);
  }
  
  protected final String a()
  {
    return "all_photos LEFT OUTER JOIN media_cache ON (all_photos.image_url=media_cache.image_url)";
  }
  
  protected final String[] b()
  {
    return btl.d;
  }
  
  protected final String c()
  {
    return "all_photos.image_url IS NOT NULL AND is_primary = 1 AND (has_edit_list = 1 OR local_content_uri IS NULL)";
  }
  
  protected final String[] d()
  {
    return null;
  }
  
  protected final String e()
  {
    return "all_photos.image_url";
  }
  
  protected final String f()
  {
    return "timestamp DESC";
  }
  
  protected final int g()
  {
    return btz.b;
  }
  
  protected final String h()
  {
    return "AllPhotos";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btn
 * JD-Core Version:    0.7.0.1
 */