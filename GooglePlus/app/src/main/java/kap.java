import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public final class kap
  implements hsa
{
  public final String a()
  {
    return "profile";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.beginTransaction();
    try
    {
      paramSQLiteDatabase.delete("profile_header", null, null);
      paramSQLiteDatabase.delete("restricted_profile", null, null);
      paramSQLiteDatabase.delete("blocked_profile", null, null);
      paramSQLiteDatabase.delete("muted_profile", null, null);
      paramSQLiteDatabase.delete("profile_flairs_page_sync_timestamp", null, null);
      paramSQLiteDatabase.delete("profile_mixed_flairs_sync_timestamp", null, null);
      paramSQLiteDatabase.delete("flairs_preference", null, null);
      paramSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramSQLiteDatabase.endTransaction();
    }
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE profile_header (_id INTEGER PRIMARY KEY,gaia_id TEXT UNIQUE NOT NULL,name BLOB,name_is_verified BLOB,photo BLOB,cover_photo BLOB,tagline BLOB,owner_stats BLOB,vanity_id BLOB,domain BLOB,fingerprint BLOB,local_page BLOB,gender BLOB,is_plus_page BLOB,can_edit_profile BLOB,sync_timestamp INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE restricted_profile (_id INTEGER PRIMARY KEY,gaia_id TEXT UNIQUE NOT NULL,is_restricted INTEGER NOT NULL,sync_timestamp INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE blocked_profile (_id INTEGER PRIMARY KEY,gaia_id TEXT UNIQUE NOT NULL,is_blocked INTEGER NOT NULL,sync_timestamp INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE muted_profile (_id INTEGER PRIMARY KEY,gaia_id TEXT UNIQUE NOT NULL,is_muted INTEGER NOT NULL,sync_timestamp INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE profile_flairs_page_sync_timestamp (_id INTEGER PRIMARY KEY,gaia_id TEXT UNIQUE NOT NULL,sync_timestamp INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE profile_mixed_flairs_sync_timestamp (_id INTEGER PRIMARY KEY,gaia_id TEXT UNIQUE NOT NULL,has_more_items INTEGER NOT NULL,sync_timestamp INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE flairs_preference (_id INTEGER PRIMARY KEY,squares_flairs_visibility INTEGER,followed_collexions_flairs_visibility INTEGER);");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("ProfileDatabase", 4)) {
      new StringBuilder(45).append("Upgrade database: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    return false;
  }
  
  public final int b()
  {
    return 17;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase) {}
  
  public final String[] c()
  {
    return new String[] { "profile_header", "restricted_profile", "blocked_profile", "muted_profile", "profile_flairs_page_sync_timestamp", "profile_mixed_flairs_sync_timestamp", "flairs_preference" };
  }
  
  public final String[] d()
  {
    return new String[0];
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kap
 * JD-Core Version:    0.7.0.1
 */