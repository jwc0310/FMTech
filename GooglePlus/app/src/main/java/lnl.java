import android.content.ContentResolver;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public final class lnl
  implements hsa
{
  public final String a()
  {
    return "stream";
  }
  
  public final void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    if (((lln)mbb.a(paramContext, lln.class)).d(paramInt)) {
      return;
    }
    long l = System.currentTimeMillis() - 86400000L;
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder1 = localmfz.a;; localStringBuilder1 = new StringBuilder(256))
    {
      localStringBuilder1.append("stream_fetch_timestamp < ").append(l);
      int i = paramSQLiteDatabase.delete("activity_streams", mfx.b(localStringBuilder1), null);
      if (Log.isLoggable("StreamDatabase", 3)) {
        new StringBuilder(44).append("deleteStaleStreams deleted ").append(i).append(" items");
      }
      paramContext.getContentResolver().notifyChange(lnf.a, null);
      String str = efj.a(null, null, false, null, null, 1, null);
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("stream_key NOT IN(");
      localStringBuilder2.append(DatabaseUtils.sqlEscapeString(str));
      localStringBuilder2.append(')');
      int j = paramSQLiteDatabase.delete("activity_streams", localStringBuilder2.toString(), null);
      if (Log.isLoggable("StreamDatabase", 3)) {
        new StringBuilder(54).append("deleteNonEssentialStreams deleted streams: ").append(j);
      }
      paramContext.getContentResolver().notifyChange(lnf.a, null);
      int k = paramSQLiteDatabase.delete("activities", "unique_activity_id NOT IN (SELECT unique_activity_id FROM activity_streams)", null);
      if (Log.isLoggable("StreamDatabase", 3)) {
        new StringBuilder(56).append("cleanupData deleted unreferenced activities: ").append(k);
      }
      if (((hsp)mbb.a(paramContext, hsp.class)).a() >= 16000000L) {
        break;
      }
      int m = paramSQLiteDatabase.delete("activities", "unique_activity_id IN (SELECT unique_activity_id FROM activity_streams WHERE sort_index > 50)", null);
      if (!Log.isLoggable("StreamDatabase", 3)) {
        break;
      }
      new StringBuilder(57).append("cleanupData deleted \"all circles\" activities: ").append(m);
      return;
    }
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_streams (stream_key TEXT NOT NULL,unique_activity_id TEXT NOT NULL,sort_index INT NOT NULL,last_activity INT,token TEXT,context_specific_data BLOB,stream_token TEXT,stream_fetch_timestamp INT NOT NULL,server_timestamp INT,next_prefetch_time INT,i_data BLOB,PRIMARY KEY (stream_key,unique_activity_id));");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY, unique_activity_id TEXT UNIQUE NOT NULL, activity_id TEXT NOT NULL, data_state INT NOT NULL DEFAULT (0), author_id TEXT NOT NULL, author_gender TEXT, source_id TEXT, source_name TEXT, total_comment_count INT NOT NULL, plus_one_data BLOB, acl_display TEXT, loc BLOB, created INT NOT NULL, modified INT NOT NULL, content_flags INT NOT NULL DEFAULT(0), activity_flags INT NOT NULL DEFAULT(0), annotation BLOB, title BLOB, original_author_id TEXT, original_author_name TEXT, original_author_avatar_url TEXT, original_comment_count INT NOT NULL DEFAULT(0), original_collexion_name TEXT, comment BLOB, permalink TEXT, event_id TEXT, square_update BLOB, square_reshare_update BLOB, relateds BLOB, num_reshares INT NOT NULL DEFAULT(0), embed BLOB, embed_deep_link BLOB, embed_appinvite BLOB, payload BLOB, domain TEXT, birthday BLOB, author_annotation BLOB, original_activity_id TEXT, promoted_post_data BLOB, youtube_permalink_url TEXT);");
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_contacts (gaia_id TEXT PRIMARY KEY,avatar_url TEXT,name TEXT,blocked INT NOT NULL DEFAULT(0));");
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_comments (_id INTEGER PRIMARY KEY,activity_id TEXT NOT NULL,comment_id TEXT UNIQUE NOT NULL,author_id TEXT NOT NULL,content BLOB,created INT NOT NULL,plus_one_data BLOB,comment_flags INT NOT NULL DEFAULT(0));");
    paramSQLiteDatabase.execSQL("CREATE TABLE search (search_key TEXT NOT NULL,continuation_token TEXT,PRIMARY KEY (search_key));");
    paramSQLiteDatabase.execSQL("CREATE TABLE deep_link_installs(_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp INT DEFAULT(0), package_name TEXT UNIQUE NOT NULL, launch_source TEXT NOT NULL, activity_id TEXT NOT NULL, author_id TEXT NOT NULL);");
    paramSQLiteDatabase.execSQL("CREATE INDEX activity_streams_activity_id ON activity_streams(unique_activity_id)");
  }
  
  public final boolean a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("StreamDatabase", 4)) {
      new StringBuilder(45).append("Upgrade database: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    return paramInt1 >= 42;
  }
  
  public final int b()
  {
    return 42;
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE VIEW activities_stream_view AS SELECT activity_streams.stream_key as stream_key,activity_streams.sort_index as sort_index,activity_streams.last_activity as last_activity,activity_streams.token as token,activity_streams.stream_token as stream_token,activity_streams.server_timestamp as server_timestamp,activity_streams.next_prefetch_time as next_prefetch_time,activity_streams.context_specific_data as context_specific_data,activities._id as _id,activities.activity_id as activity_id,activities.author_id as author_id,activities.author_gender as author_gender,activities.source_id as source_id,activities.source_name as source_name,activities.total_comment_count as total_comment_count,activities.plus_one_data as plus_one_data,activities.acl_display as acl_display,activities.loc as loc,activities.created as created,activities.modified as modified,activities.data_state as data_state,activities.event_id as event_id,activities.content_flags as content_flags,activities.activity_flags as activity_flags,activities.annotation as annotation,activities.title as title,activities.original_author_id as original_author_id,activities.original_author_name as original_author_name,activities.original_author_avatar_url as original_author_avatar_url,activities.original_comment_count as original_comment_count,activities.original_collexion_name as original_collexion_name,activities.comment as comment,activities.permalink as permalink,activities.square_update as square_update,activities.square_reshare_update as square_reshare_update,activities.relateds as relateds,activities.num_reshares as num_reshares,activities.embed as embed,activities.embed_deep_link as embed_deep_link,activities.embed_appinvite as embed_appinvite,activities.payload as payload,activities.domain as domain,activities.birthday as birthday,activities.author_annotation as author_annotation,activities.original_activity_id as original_activity_id,activities.promoted_post_data as promoted_post_data,activities.unique_activity_id as unique_activity_id,activity_contacts.name as name,activity_contacts.avatar_url as avatar_url,activity_streams.i_data as i_data,activities.youtube_permalink_url as youtube_permalink_url FROM activity_streams INNER JOIN activities ON activity_streams.unique_activity_id=activities.unique_activity_id LEFT OUTER JOIN activity_contacts ON activities.author_id=activity_contacts.gaia_id WHERE data_state    IN (1, 0)");
    paramSQLiteDatabase.execSQL("CREATE VIEW activity_view AS SELECT activities._id as _id,activities.activity_id as activity_id,activities.author_id as author_id,activities.source_id as source_id,activities.source_name as source_name,activities.total_comment_count as total_comment_count,activities.plus_one_data as plus_one_data,activities.acl_display as acl_display,activities.loc as loc,activities.created as created,activities.modified as modified,activities.data_state as data_state,activity_contacts.name as name,activity_contacts.avatar_url as avatar_url,activities.author_gender as author_gender,activities.content_flags as content_flags,activities.activity_flags as activity_flags,activities.annotation as annotation,activities.title as title,activities.original_author_id as original_author_id,activities.original_author_name as original_author_name,activities.original_author_avatar_url as original_author_avatar_url,activities.original_comment_count as original_comment_count,activities.original_collexion_name as original_collexion_name,activities.comment as comment,activities.permalink as permalink,activities.square_update as square_update,activities.square_reshare_update as square_reshare_update,activities.relateds as relateds,activities.num_reshares as num_reshares,activities.embed as embed,activities.embed_deep_link as embed_deep_link,activities.embed_appinvite as embed_appinvite,activities.payload as payload,activities.domain as domain,activities.birthday as birthday,activities.author_annotation as author_annotation,activities.original_activity_id as original_activity_id,activities.promoted_post_data as promoted_post_data,activities.unique_activity_id as unique_activity_id,activity_streams.context_specific_data as context_specific_data,activities.youtube_permalink_url as youtube_permalink_url FROM activities JOIN activity_contacts ON activities.author_id=activity_contacts.gaia_id LEFT OUTER JOIN activity_streams ON activities.unique_activity_id=activity_streams.unique_activity_id");
    paramSQLiteDatabase.execSQL("CREATE VIEW comments_view AS SELECT activity_comments._id as _id,activity_comments.activity_id as activity_id,activity_comments.comment_id as comment_id,activity_comments.author_id as author_id,activity_comments.content as content,activity_comments.created as created,activity_comments.plus_one_data as plus_one_data,activity_comments.comment_flags as comment_flags,activity_contacts.name as name,activity_contacts.avatar_url as avatar_url,activity_contacts.blocked as blocked FROM activity_comments JOIN activity_contacts ON activity_comments.author_id=activity_contacts.gaia_id");
    paramSQLiteDatabase.execSQL("CREATE VIEW deep_link_installs_view AS SELECT deep_link_installs._id as _id,deep_link_installs.timestamp as timestamp,deep_link_installs.package_name as package_name,deep_link_installs.launch_source as launch_source,activity_contacts.name as name,activities.source_name as source_name,activities.embed_deep_link as embed_deep_link,activities.embed_appinvite as embed_appinvite FROM deep_link_installs INNER JOIN activities ON deep_link_installs.activity_id=activities.activity_id INNER JOIN activity_contacts ON deep_link_installs.author_id=activity_contacts.gaia_id;");
  }
  
  public final String[] c()
  {
    return new String[] { "activity_streams", "activities", "activity_contacts", "activity_comments", "search", "deep_link_installs" };
  }
  
  public final String[] d()
  {
    return new String[] { "activities_stream_view", "activity_view", "comments_view", "deep_link_installs_view" };
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnl
 * JD-Core Version:    0.7.0.1
 */