public enum dun
{
  private static final mcq r = new mcq("debug.plus.dogfood");
  private final String s;
  private final String t;
  private final int u;
  
  static
  {
    d = new dun("IS_MONKEY_BUILD", 4, "debug.plus.testing.monkey", "FALSE", duo.c);
    m = new dun("ENABLE_NATIVE_NETWORKING", 5, "debug.plus.native.http", "true", duo.c);
    n = new dun("ENABLE_DEBUG_STREAM", 6, "debug.plus.stream", "false", duo.c);
    e = new dun("GUNS_DEBUG_MODE", 7, "debug.plus.guns_debug_mode", "", duo.c);
    o = new dun("ENABLE_AUTO_SIGNIN", 8, "debug.plus.autosignin", "false", duo.c);
    p = new dun("ENABLE_ADAPTIVE_IMAGE_DOWNLOADS", 9, "debug.plus.adaptive.down", "false", duo.c);
    q = new dun("ENABLE_NEW_FACE_TAGS", 10, "debug.plus.new_face_tags", "false", duo.c);
    f = new dun("ENABLE_PHOTOS_SYNC_ON_REFRESH", 11, "debug.plus.photo_refresh_syncs", "true", duo.c);
    g = new dun("ENABLE_ANDROID_CONTACTS_SYNC", 12, "debug.plus.synctocp2", "true", duo.c);
    h = new dun("SHOW_PHOTO_TILE_DEBUG_INFO", 13, "debug.plus.debug_overlay", "false");
    i = new dun("ENABLE_ALBUM_VISIBILITY", 14, "debug.plus.album_visibility", "false", duo.c);
    j = new dun("MOVIEMAKER_FORCE_ENABLE", 15, "debug.plus.moviemaker_force", "false");
    k = new dun("SWIPE_TO_DISMISS_AB_STATUS_BAR", 16, "debug.photos.dismiss_ab_bar", "false");
    dun[] arrayOfdun = new dun[17];
    arrayOfdun[0] = a;
    arrayOfdun[1] = b;
    arrayOfdun[2] = c;
    arrayOfdun[3] = l;
    arrayOfdun[4] = d;
    arrayOfdun[5] = m;
    arrayOfdun[6] = n;
    arrayOfdun[7] = e;
    arrayOfdun[8] = o;
    arrayOfdun[9] = p;
    arrayOfdun[10] = q;
    arrayOfdun[11] = f;
    arrayOfdun[12] = g;
    arrayOfdun[13] = h;
    arrayOfdun[14] = i;
    arrayOfdun[15] = j;
    arrayOfdun[16] = k;
    v = arrayOfdun;
  }
  
  private dun(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, duo.b);
  }
  
  private dun(String paramString1, String paramString2, Integer paramInteger)
  {
    this.s = paramString1;
    this.t = paramString2;
    this.u = paramInteger;
  }
  
  public static boolean b()
  {
    return false;
  }
  
  public final String a()
  {
    String str = this.t;
    int i1 = this.u;
    if (i1 != duo.b) {
      if (i1 != duo.c) {}
    }
    for (int i2 = 0;; i2 = 1)
    {
      if (i2 != 0) {
        str = mga.a(this.s, this.t);
      }
      return str;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dun
 * JD-Core Version:    0.7.0.1
 */