final class btt
  extends btw
{
  public btt(btl parambtl, int paramInt1, int paramInt2, int paramInt3)
  {
    super(parambtl, paramInt1, paramInt2, paramInt3);
  }
  
  protected final String a()
  {
    return "(SELECT image_url as highlights_image_url, view_order as highlights_view_order FROM all_tiles WHERE view_id = ? AND type = ? AND media_attr & 512 == 0 LIMIT ? OFFSET ?) INNER JOIN media_cache ON (highlights_image_url = media_cache.image_url)";
  }
  
  protected final String[] a(int paramInt)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Integer.toString(paramInt);
    return arrayOfString;
  }
  
  protected final String b()
  {
    return "http_status = 200 AND representation_type & ? != 0";
  }
  
  protected final String[] c()
  {
    String str = this.a.a.a(this.a.k.a).b("gaia_id");
    String[] arrayOfString = new String[2];
    arrayOfString[0] = jrf.a(0, new String[] { str });
    arrayOfString[1] = Integer.toString(4);
    return arrayOfString;
  }
  
  protected final String d()
  {
    return "highlights_view_order ASC";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btt
 * JD-Core Version:    0.7.0.1
 */