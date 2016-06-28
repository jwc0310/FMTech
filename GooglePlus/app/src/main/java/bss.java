import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class bss
{
  static final String[] a = { "all_tiles.media_attr", "all_tiles.title", "all_tiles.image_url", "all_tiles.data" };
  
  public static Cursor a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    return paramSQLiteDatabase.query(true, "all_tiles,all_photos", bsv.a, "all_tiles.image_url = all_photos.image_url AND local_content_uri NOT NULL AND (view_id = ? AND type = 4 AND all_tiles.media_attr & 16384)", new String[] { paramString }, null, null, "view_order", null);
  }
  
  public static Cursor b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    return paramSQLiteDatabase.query(true, "all_tiles,media_cache", bsu.a, "all_tiles.image_url = media_cache.image_url AND representation_type IN(2, 8) AND (view_id = ? AND type = 4 AND all_tiles.media_attr & 16384)", new String[] { paramString }, null, null, "view_order", null);
  }
  
  public static Cursor c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    return paramSQLiteDatabase.query(true, "all_tiles", bst.a, "view_id = ? AND type = 4 AND all_tiles.media_attr & 16384", new String[] { paramString }, null, null, "view_order", null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bss
 * JD-Core Version:    0.7.0.1
 */