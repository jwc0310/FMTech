final class btq
  extends btw
{
  private final boolean a;
  private final String b;
  
  public btq(btl parambtl, int paramInt1, int paramInt2, int paramInt3, String paramString, boolean paramBoolean)
  {
    super(parambtl, paramInt1, -1, 0);
    this.b = paramString;
    this.a = paramBoolean;
  }
  
  protected final String a()
  {
    return "(SELECT image_url as highlights_image_url, view_order as highlights_view_order FROM all_tiles WHERE view_id = ? AND type = ? AND media_attr & 512 == 0 LIMIT ? OFFSET ?) INNER JOIN media_cache ON (highlights_image_url = media_cache.image_url)";
  }
  
  protected final String[] a(int paramInt)
  {
    if (this.a)
    {
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = Integer.toString(paramInt);
      return arrayOfString2;
    }
    String str = this.c.a.a(this.c.k.a).b("gaia_id");
    String[] arrayOfString1 = new String[3];
    arrayOfString1[0] = Integer.toString(paramInt);
    arrayOfString1[1] = jrf.a(0, new String[] { str });
    arrayOfString1[2] = Integer.toString(4);
    return arrayOfString1;
  }
  
  protected final String b()
  {
    if (this.a) {
      return "http_status = 200 AND representation_type & ? != 0";
    }
    return "http_status = 200 AND representation_type & ? != 0 AND highlights_image_url NOT IN (SELECT image_url FROM all_tiles WHERE view_id = ? AND type = ? AND media_attr & 512 == 0)";
  }
  
  protected final String[] c()
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = this.b;
    arrayOfString[1] = Integer.toString(4);
    return arrayOfString;
  }
  
  protected final String d()
  {
    return "highlights_view_order ASC";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btq
 * JD-Core Version:    0.7.0.1
 */