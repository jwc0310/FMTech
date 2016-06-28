import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public final class hme
  implements hsa
{
  public final String a()
  {
    return "collexions";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.beginTransaction();
    try
    {
      paramSQLiteDatabase.delete("cxns", null, null);
      paramSQLiteDatabase.delete("cxnsfromcircles", null, null);
      paramSQLiteDatabase.delete("fcxns", null, null);
      paramSQLiteDatabase.delete("ufcxns", null, null);
      paramSQLiteDatabase.delete("srchcxns", null, null);
      paramSQLiteDatabase.delete("srchcxnsqry", null, null);
      paramSQLiteDatabase.delete("cnxs_continuation_tokens", null, null);
      paramSQLiteDatabase.delete("cnxs_sync_timestamps", null, null);
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
    paramSQLiteDatabase.execSQL("CREATE TABLE cnxs_continuation_tokens (_id INTEGER PRIMARY KEY,owner_gaia_id TEXT NOT NULL, continuation_token TEXT,type INTEGER NOT NULL, UNIQUE(owner_gaia_id,type));");
    paramSQLiteDatabase.execSQL("CREATE TABLE cxns (_id INTEGER PRIMARY KEY,cxn_id TEXT UNIQUE NOT NULL,cxn_name TEXT,owner_gaia_id TEXT,owner_display_name TEXT,owner_photo_url TEXT,follow_state INTEGER,sync_timestamp INTEGER,color INTEGER,follow_count INTEGER,post_count INTEGER,visibility_type INTEGER,last_used_timestamp INTEGER,followers_sync_timestamp INTEGER,followers_continuation_token TEXT,nickname TEXT,sharing_target_group_type INTEGER,subscribe_state INTEGER,cover_photo_url TEXT,abuse_info BLOB,auto_follow_state INTEGER,domain_name TEXT,sharing_roster BLOB,tagline TEXT);");
    paramSQLiteDatabase.execSQL("CREATE TABLE cxns_followers (_id INTEGER PRIMARY KEY,cxn_id TEXT NOT NULL,name TEXT,gaia_id TEXT,photo_url TEXT,UNIQUE (cxn_id, gaia_id), FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE cxnsfromcircles (_id INTEGER PRIMARY KEY,cxn_id TEXT NOT NULL,circles_owner_gaia_id TEXT NOT NULL,UNIQUE (circles_owner_gaia_id , cxn_id))");
    paramSQLiteDatabase.execSQL("CREATE TABLE fcxns (_id INTEGER PRIMARY KEY,cxn_id TEXT UNIQUE NOT NULL,suggestion_id TEXT)");
    paramSQLiteDatabase.execSQL("CREATE TABLE cnxs_sync_timestamps (_id INTEGER PRIMARY KEY,owner_gaia_id TEXT NOT NULL, sync_timestamp INTEGER,type INTEGER NOT NULL, UNIQUE(owner_gaia_id,type));");
    paramSQLiteDatabase.execSQL("CREATE TABLE ufcxns (_id INTEGER PRIMARY KEY,cxn_id TEXT NOT NULL,follower_gaia_id TEXT NOT NULL,UNIQUE(cxn_id,follower_gaia_id))");
    paramSQLiteDatabase.execSQL("CREATE TABLE srchcxns (_id INTEGER PRIMARY KEY,cxn_id TEXT NOT NULL,cxn_payload BLOB NOT NULL)");
    paramSQLiteDatabase.execSQL("CREATE TABLE srchcxnsqry (_id INTEGER PRIMARY KEY,cxn_srch_query TEXT NOT NULL,cxn_srch_token TEXT,cxn_srch_query_timestamp INTEGER)");
    paramSQLiteDatabase.execSQL("CREATE TABLE mvcxns (_id INTEGER PRIMARY KEY,cxn_id TEXT UNIQUE NOT NULL, FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE mvcxns_hp (_id INTEGER PRIMARY KEY,cxn_id TEXT UNIQUE NOT NULL, FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE uvcxns (_id INTEGER PRIMARY KEY,gaia_id TEXT NOT NULL, cxn_id TEXT NOT NULL, UNIQUE (gaia_id, cxn_id), FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE uvcxns_hp (_id INTEGER PRIMARY KEY,gaia_id TEXT NOT NULL, cxn_id TEXT NOT NULL, UNIQUE (gaia_id, cxn_id), FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("CollexionsDatabase", 4)) {
      new StringBuilder(45).append("Upgrade database: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    if (paramInt1 < 39) {
      return false;
    }
    if (paramInt1 == 39) {
      paramSQLiteDatabase.execSQL("ALTER TABLE cxns ADD COLUMN sharing_roster BLOB");
    }
    for (int i = 40;; i = paramInt1)
    {
      if (i == 40)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE cxns ADD COLUMN tagline TEXT");
        i = 41;
      }
      if (i == 41)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE srchcxns (_id INTEGER PRIMARY KEY,cxn_id TEXT NOT NULL,cxn_payload BLOB NOT NULL)");
        i = 42;
      }
      if (i == 42)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE srchcxnsqry (_id INTEGER PRIMARY KEY,cxn_srch_query TEXT NOT NULL,cxn_srch_token TEXT,cxn_srch_query_timestamp INTEGER)");
        i = 43;
      }
      if (i == 43)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE mvcxns (_id INTEGER PRIMARY KEY,cxn_id TEXT UNIQUE NOT NULL, FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
        i = 44;
      }
      if (i == 44)
      {
        paramSQLiteDatabase.execSQL("CREATE VIEW mvcxns_view AS SELECT cxns.*, mvcxns._id as sort_index FROM mvcxns INNER JOIN cxns ON mvcxns.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
        paramSQLiteDatabase.execSQL("CREATE TABLE mvcxns_hp (_id INTEGER PRIMARY KEY,cxn_id TEXT UNIQUE NOT NULL, FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("CREATE VIEW mvcxns_hp_view AS SELECT cxns.*, mvcxns_hp._id as sort_index FROM mvcxns_hp INNER JOIN cxns ON mvcxns_hp.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
        paramSQLiteDatabase.execSQL("CREATE TABLE uvcxns (_id INTEGER PRIMARY KEY,gaia_id TEXT NOT NULL, cxn_id TEXT NOT NULL, UNIQUE (gaia_id, cxn_id), FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("CREATE VIEW uvcxns_view AS SELECT cxns.*, gaia_id, uvcxns._id as sort_index FROM uvcxns INNER JOIN cxns ON uvcxns.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
        paramSQLiteDatabase.execSQL("CREATE TABLE uvcxns_hp (_id INTEGER PRIMARY KEY,gaia_id TEXT NOT NULL, cxn_id TEXT NOT NULL, UNIQUE (gaia_id, cxn_id), FOREIGN KEY (cxn_id) REFERENCES cxns(cxn_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("CREATE VIEW uvcxns_hp_view AS SELECT cxns.*, gaia_id, uvcxns_hp._id as sort_index FROM uvcxns_hp INNER JOIN cxns ON uvcxns_hp.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
        i = 45;
      }
      if (i == 45)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE srchcxnsqry");
        paramSQLiteDatabase.execSQL("CREATE TABLE srchcxnsqry (_id INTEGER PRIMARY KEY,cxn_srch_query TEXT NOT NULL,cxn_srch_token TEXT,cxn_srch_query_timestamp INTEGER)");
        i = 46;
      }
      if (i != paramInt2) {
        break;
      }
      return true;
    }
  }
  
  public final int b()
  {
    return 46;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE VIEW cxnsfromcirclesview AS SELECT cxns.*, circles_owner_gaia_id, cxnsfromcircles._id as sort_index FROM cxnsfromcircles INNER JOIN cxns ON cxnsfromcircles.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW fcxnsview AS SELECT cxns.*,fcxns.suggestion_id FROM fcxns INNER JOIN cxns ON fcxns.cxn_id=cxns.cxn_id");
    paramSQLiteDatabase.execSQL("CREATE VIEW ufcxnsview AS SELECT cxns.*, ufcxns._id as sort_index, ufcxns.follower_gaia_id FROM ufcxns INNER JOIN cxns ON ufcxns.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW mvcxns_view AS SELECT cxns.*, mvcxns._id as sort_index FROM mvcxns INNER JOIN cxns ON mvcxns.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW mvcxns_hp_view AS SELECT cxns.*, mvcxns_hp._id as sort_index FROM mvcxns_hp INNER JOIN cxns ON mvcxns_hp.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW uvcxns_view AS SELECT cxns.*, gaia_id, uvcxns._id as sort_index FROM uvcxns INNER JOIN cxns ON uvcxns.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
    paramSQLiteDatabase.execSQL("CREATE VIEW uvcxns_hp_view AS SELECT cxns.*, gaia_id, uvcxns_hp._id as sort_index FROM uvcxns_hp INNER JOIN cxns ON uvcxns_hp.cxn_id=cxns.cxn_id ORDER BY sort_index ASC");
  }
  
  public final String[] c()
  {
    return new String[] { "cnxs_continuation_tokens", "cxns", "cxns_followers", "cxnsfromcircles", "fcxns", "cnxs_sync_timestamps", "ufcxns", "srchcxns", "srchcxnsqry", "mvcxns", "mvcxns_hp", "uvcxns", "uvcxns_hp" };
  }
  
  public final String[] d()
  {
    return new String[] { "cxnsfromcirclesview", "fcxnsview", "ufcxnsview", "mvcxns_view", "mvcxns_hp_view", "uvcxns_view", "uvcxns_hp_view" };
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hme
 * JD-Core Version:    0.7.0.1
 */