class bts
  extends btv
{
  public bts(btl parambtl, int paramInt)
  {
    super(parambtl, paramInt);
  }
  
  public bts(btl parambtl, int paramInt1, int paramInt2)
  {
    super(parambtl, paramInt1, 50);
  }
  
  protected final String a()
  {
    return "all_tiles LEFT OUTER JOIN media_cache ON (all_tiles.image_url=media_cache.image_url)";
  }
  
  protected final String[] b()
  {
    return btl.c;
  }
  
  protected final String c()
  {
    return "view_id = ? AND type = ? AND media_attr & 512 == 0";
  }
  
  protected String[] d()
  {
    String str = this.d.a.a(this.d.k.a).b("gaia_id");
    String[] arrayOfString = new String[2];
    arrayOfString[0] = jrf.a(0, new String[] { str });
    arrayOfString[1] = Integer.toString(4);
    return arrayOfString;
  }
  
  protected final String e()
  {
    return "all_tiles.image_url";
  }
  
  protected final String f()
  {
    return "view_order ASC";
  }
  
  protected final int g()
  {
    return btz.a;
  }
  
  protected String h()
  {
    return "Highlights";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bts
 * JD-Core Version:    0.7.0.1
 */