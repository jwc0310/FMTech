import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public final class lar
  implements hsa
{
  public final String a()
  {
    return "squares";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.delete("squares", "is_member=0 AND membership_status NOT IN (4,5)", null);
    paramSQLiteDatabase.delete("square_member_status", null, null);
    paramSQLiteDatabase.delete("square_contact", null, null);
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("last_members_sync", Integer.valueOf(-1));
    paramSQLiteDatabase.update("squares", localContentValues, null, null);
    paramSQLiteDatabase.delete("user_visible_squares", null, null);
    paramSQLiteDatabase.delete("user_visible_squares_on_home_page", null, null);
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE squares (_id INTEGER PRIMARY KEY,square_id TEXT UNIQUE NOT NULL,square_name TEXT,tagline TEXT,photo_url TEXT,about_text TEXT,joinability INT NOT NULL DEFAULT(0),member_count INT NOT NULL DEFAULT(0),membership_status INT NOT NULL DEFAULT(0),is_member INT NOT NULL DEFAULT(0),list_category INT NOT NULL DEFAULT(0),post_visibility INT NOT NULL DEFAULT(-1),can_see_members INT NOT NULL DEFAULT(0),can_see_posts INT NOT NULL DEFAULT(0),can_join INT NOT NULL DEFAULT(0),can_request_to_join INT NOT NULL DEFAULT(0),can_share INT NOT NULL DEFAULT(0),can_invite INT NOT NULL DEFAULT(0),notifications_enabled INT NOT NULL DEFAULT(0),square_streams BLOB,inviter_gaia_id TEXT,inviter_name TEXT,inviter_photo_url TEXT,sort_index INT NOT NULL DEFAULT(0),last_sync INT DEFAULT(-1),last_members_sync INT DEFAULT(-1),invitation_dismissed INT NOT NULL DEFAULT(0),auto_subscribe INT NOT NULL DEFAULT(0),disable_subscription INT NOT NULL DEFAULT(0),unread_count INT NOT NULL DEFAULT(0),volume INT,suggestion_id TEXT,last_volume_sync INT NOT NULL DEFAULT(-1),restricted_domain TEXT,related_links BLOB,location BLOB,facepile BLOB);");
    paramSQLiteDatabase.execSQL("CREATE TABLE square_contact (link_square_id TEXT NOT NULL,qualified_id TEXT NOT NULL,name TEXT,avatar TEXT,membership_status INT NOT NULL DEFAULT(0),UNIQUE (link_square_id, qualified_id), FOREIGN KEY (link_square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE square_member_status (square_id TEXT NOT NULL,membership_status INT NOT NULL,member_count INT NOT NULL DEFAULT(0),token TEXT,UNIQUE (square_id, membership_status), FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE squares_metadata (last_squares_sync_time INT NOT NULL DEFAULT(-1),last_suggestions_sync_time INT NOT NULL DEFAULT(-1),profile_squares_list BLOB,profile_squares_visibility BLOB);");
    paramSQLiteDatabase.execSQL("CREATE TABLE my_visible_squares (_id INTEGER PRIMARY KEY,square_id TEXT UNIQUE NOT NULL, FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE my_visible_squares_on_home_page (_id INTEGER PRIMARY KEY,square_id TEXT UNIQUE NOT NULL, FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE user_visible_squares (_id INTEGER PRIMARY KEY,gaia_id TEXT NOT NULL, square_id TEXT NOT NULL, UNIQUE (gaia_id, square_id), FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE user_visible_squares_on_home_page (_id INTEGER PRIMARY KEY,gaia_id TEXT NOT NULL, square_id TEXT NOT NULL, UNIQUE (gaia_id, square_id), FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("SquaresDatabase", 4)) {
      new StringBuilder(45).append("Upgrade database: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    if (paramInt1 < 5) {
      return false;
    }
    if (paramInt1 < 6) {
      paramSQLiteDatabase.execSQL("ALTER TABLE squares ADD COLUMN facepile BLOB");
    }
    for (int i = 6;; i = paramInt1)
    {
      if (i == 6)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE my_visible_squares (_id INTEGER PRIMARY KEY,square_id TEXT UNIQUE NOT NULL, FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
        i = 7;
      }
      if (i == 7)
      {
        paramSQLiteDatabase.execSQL("CREATE VIEW my_visible_squares_view AS SELECT squares.*, my_visible_squares._id as sort_index FROM my_visible_squares INNER JOIN squares ON my_visible_squares.square_id=squares.square_id ORDER BY sort_index ASC");
        paramSQLiteDatabase.execSQL("CREATE TABLE my_visible_squares_on_home_page (_id INTEGER PRIMARY KEY,square_id TEXT UNIQUE NOT NULL, FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("CREATE VIEW my_visible_squares_on_home_page_view AS SELECT squares.*, my_visible_squares_on_home_page._id as sort_index FROM my_visible_squares_on_home_page INNER JOIN squares ON my_visible_squares_on_home_page.square_id=squares.square_id ORDER BY sort_index ASC");
        paramSQLiteDatabase.execSQL("CREATE TABLE user_visible_squares (_id INTEGER PRIMARY KEY,gaia_id TEXT NOT NULL, square_id TEXT NOT NULL, UNIQUE (gaia_id, square_id), FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("CREATE VIEW user_visible_squares_view AS SELECT squares.*, gaia_id, user_visible_squares._id as sort_index FROM user_visible_squares INNER JOIN squares ON user_visible_squares.square_id=squares.square_id ORDER BY sort_index ASC");
        paramSQLiteDatabase.execSQL("CREATE TABLE user_visible_squares_on_home_page (_id INTEGER PRIMARY KEY,gaia_id TEXT NOT NULL, square_id TEXT NOT NULL, UNIQUE (gaia_id, square_id), FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("CREATE VIEW user_visible_squares_on_home_page_view AS SELECT squares.*, gaia_id, user_visible_squares_on_home_page._id as sort_index FROM user_visible_squares_on_home_page INNER JOIN squares ON user_visible_squares_on_home_page.square_id=squares.square_id ORDER BY sort_index ASC");
        i = 8;
      }
      if (i == 8)
      {
        paramSQLiteDatabase.execSQL("CREATE VIEW my_joined_or_moderated_squares_view AS SELECT squares.square_id, squares.square_name, squares.photo_url, squares.post_visibility, squares.member_count, squares.membership_status, squares.restricted_domain, squares.facepile, my_visible_squares._id as sort_index, my_visible_squares.square_id as is_visible FROM squares LEFT OUTER JOIN my_visible_squares ON squares.square_id=my_visible_squares.square_id WHERE(membership_status=1 OR membership_status=2 OR membership_status=3) ORDER BY sort_index ASC");
        i = 9;
      }
      if (i != paramInt2) {
        break;
      }
      return true;
    }
  }
  
  public final int b()
  {
    return 9;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE VIEW my_visible_squares_view AS SELECT squares.*, my_visible_squares._id as sort_index FROM my_visible_squares INNER JOIN squares ON my_visible_squares.square_id=squares.square_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW my_visible_squares_on_home_page_view AS SELECT squares.*, my_visible_squares_on_home_page._id as sort_index FROM my_visible_squares_on_home_page INNER JOIN squares ON my_visible_squares_on_home_page.square_id=squares.square_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW user_visible_squares_view AS SELECT squares.*, gaia_id, user_visible_squares._id as sort_index FROM user_visible_squares INNER JOIN squares ON user_visible_squares.square_id=squares.square_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW user_visible_squares_on_home_page_view AS SELECT squares.*, gaia_id, user_visible_squares_on_home_page._id as sort_index FROM user_visible_squares_on_home_page INNER JOIN squares ON user_visible_squares_on_home_page.square_id=squares.square_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW my_joined_or_moderated_squares_view AS SELECT squares.square_id, squares.square_name, squares.photo_url, squares.post_visibility, squares.member_count, squares.membership_status, squares.restricted_domain, squares.facepile, my_visible_squares._id as sort_index, my_visible_squares.square_id as is_visible FROM squares LEFT OUTER JOIN my_visible_squares ON squares.square_id=my_visible_squares.square_id WHERE(membership_status=1 OR membership_status=2 OR membership_status=3) ORDER BY sort_index ASC");
  }
  
  public final String[] c()
  {
    return new String[] { "squares", "square_contact", "square_member_status", "squares_metadata", "my_visible_squares", "my_visible_squares_on_home_page", "user_visible_squares", "user_visible_squares_on_home_page" };
  }
  
  public final String[] d()
  {
    return new String[] { "my_visible_squares_view", "my_visible_squares_on_home_page_view", "user_visible_squares_view", "user_visible_squares_on_home_page_view", "my_joined_or_moderated_squares_view" };
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lar
 * JD-Core Version:    0.7.0.1
 */