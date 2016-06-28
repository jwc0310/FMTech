import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.photos.content.GooglePhotoDownsyncProvider;
import com.google.android.apps.plus.content.EsProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bqj
  extends hsj
{
  public static long a;
  private static final String[] f = { "local_media_inserted", "fetched_all_remote_photos", "have_fingerprints_been_generated", "received_tickle_since_last_sync", "synced_initial_max", "synced_server_max", "initial_sync_complete", "pressed_load_more" };
  private static final Uri[] g;
  private final Context b;
  private final giz c;
  private final kpb d;
  private int e;
  
  static
  {
    Uri[] arrayOfUri = new Uri[4];
    arrayOfUri[0] = Uri.parse("content://media/external/images/media");
    arrayOfUri[1] = Uri.parse("content://media/phoneStorage/images/media");
    arrayOfUri[2] = Uri.parse("content://media/external/video/media");
    arrayOfUri[3] = Uri.parse("content://media/phoneStorage/video/media");
    g = arrayOfUri;
  }
  
  protected bqj(Context paramContext, int paramInt)
  {
    this(paramContext, "es", paramInt);
  }
  
  private bqj(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, paramString, paramInt, null, 1716);
    if (paramContext == null) {
      throw new NullPointerException("Context is null");
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException(31 + "Invalid account id: " + paramInt);
    }
    this.b = paramContext;
    this.e = paramInt;
    this.c = ((giz)mbb.a(paramContext, giz.class));
    this.d = ((kpb)mbb.a(paramContext, kpb.class));
    bqk localbqk = new bqk(this, paramContext, paramInt);
    efj.m().post(localbqk);
  }
  
  private static void A(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN next_notifications_fetch_param BLOB");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET last_viewed_notification_version=0");
    paramSQLiteDatabase.execSQL("DELETE FROM guns");
  }
  
  private static void B(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS guns;");
    paramSQLiteDatabase.execSQL("CREATE TABLE guns ( _id INTEGER, key TEXT UNIQUE NOT NULL, creation_time INT NOT NULL, collapsed_description TEXT, collapsed_destination TEXT, collapsed_heading TEXT, collapsed_annotation TEXT, collapsed_icon TEXT, entity_reference TEXT, entity_reference_type TEXT, priority TEXT, read_state INT NOT NULL DEFAULT(0), type INT NOT NULL DEFAULT(0), category INT NOT NULL DEFAULT(0), seen INT NOT NULL DEFAULT(0), actors BLOB, activity_id TEXT, event_id TEXT, album_id TEXT, community_id TEXT, display_index INT NOT NULL DEFAULT(0), updated_version INT NOT NULL DEFAULT(0), push_enabled INT NOT NULL DEFAULT(0), expanded_info BLOB );");
  }
  
  private static void C(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET last_notification_sync_version=0, unviewed_notifications_count=0, has_unread_notifications=0, last_viewed_notification_version=0, next_notifications_fetch_param=NULL");
  }
  
  private static void D(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN photos BLOB");
  }
  
  private static void E(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY, activity_id TEXT UNIQUE NOT NULL, data_state INT NOT NULL DEFAULT (0), author_id TEXT NOT NULL, source_id TEXT, source_name TEXT, total_comment_count INT NOT NULL, plus_one_data BLOB, acl_display TEXT, loc BLOB, created INT NOT NULL, modified INT NOT NULL, whats_hot BLOB, social_friends_plus_oned BLOB, content_flags INT NOT NULL DEFAULT(0), activity_flags INT NOT NULL DEFAULT(0), annotation TEXT, annotation_plaintext TEXT, title TEXT, title_plaintext TEXT, original_author_id TEXT, original_author_name TEXT, original_author_avatar_url TEXT, comment BLOB, permalink TEXT, event_id TEXT, photo_collection BLOB, square_update BLOB, square_reshare_update BLOB, relateds BLOB, num_reshares INT NOT NULL DEFAULT(0), embed_deep_link BLOB, album_id TEXT, embed_media BLOB, embed_photo_album BLOB, embed_checkin BLOB, embed_place BLOB, embed_place_review BLOB, embed_skyjam BLOB, embed_appinvite BLOB, embed_hangout BLOB, embed_square BLOB, embed_emotishare BLOB, embed_google_offer_v2 BLOB, promo BLOB);");
  }
  
  private static void F(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY, activity_id TEXT UNIQUE NOT NULL, data_state INT NOT NULL DEFAULT (0), author_id TEXT NOT NULL, source_id TEXT, source_name TEXT, total_comment_count INT NOT NULL, plus_one_data BLOB, acl_display TEXT, loc BLOB, created INT NOT NULL, modified INT NOT NULL, whats_hot BLOB, social_friends_plus_oned BLOB, content_flags INT NOT NULL DEFAULT(0), activity_flags INT NOT NULL DEFAULT(0), annotation TEXT, annotation_plaintext TEXT, title TEXT, title_plaintext TEXT, original_author_id TEXT, original_author_name TEXT, original_author_avatar_url TEXT, comment BLOB, permalink TEXT, event_id TEXT, photo_collection BLOB, album_id TEXT, square_update BLOB, square_reshare_update BLOB, relateds BLOB, num_reshares INT NOT NULL DEFAULT(0), embed BLOB, embed_deep_link BLOB, embed_appinvite BLOB, promo BLOB);");
  }
  
  private static void G(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN domain TEXT");
  }
  
  private static void H(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void I(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE circles ADD COLUMN for_sharing INT DEFAULT(0)");
    paramSQLiteDatabase.execSQL("UPDATE circles SET for_sharing=1 WHERE semantic_hints & 64 != 0");
  }
  
  private static void J(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN circle_settings_sync_time INT DEFAULT(-1)");
  }
  
  private static void K(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void L(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM network_data_transactions");
    paramSQLiteDatabase.execSQL("ALTER TABLE network_data_transactions ADD COLUMN log_file TEXT");
  }
  
  private static void M(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN pending_read INT");
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN pending_display_index INT");
  }
  
  private static void N(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET people_sync_time=-1");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET circle_sync_time=-1");
    paramSQLiteDatabase.execSQL("ALTER TABLE contacts ADD COLUMN in_same_visibility_group INT DEFAULT(0)");
  }
  
  private static void O(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS realtimechat_metadata");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversations");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS participants");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversation_participants");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS messenger_suggestions");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS hangout_suggestions");
  }
  
  private static void P(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
  }
  
  private static void Q(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET audience_data=NULL");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET audience_history=NULL");
  }
  
  private static void R(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
    paramSQLiteDatabase.execSQL("ALTER TABLE profiles ADD COLUMN videos_data_proto BLOB");
    paramSQLiteDatabase.execSQL("ALTER TABLE profiles ADD COLUMN reviews_data_proto BLOB");
  }
  
  private static void S(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN circle_fingerprint INT DEFAULT(-1)");
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN people_fingerprint INT DEFAULT(-1)");
  }
  
  private static void T(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS notifications");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS circle_action");
    paramSQLiteDatabase.execSQL("CREATE TABLE circled_me_users (gaia_id TEXT NOT NULL,notification_key INT NOT NULL, UNIQUE (gaia_id, notification_key), FOREIGN KEY (notification_key) REFERENCES guns (key) ON DELETE CASCADE);");
  }
  
  private static void U(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE guns SET pending_read=0 WHERE pending_read IS NULL");
  }
  
  private static void V(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN creator_gaia_id INT");
  }
  
  private static void W(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN cover_photo_spec BLOB");
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
  }
  
  private static void X(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
  }
  
  private static void Y(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
  }
  
  private static void Z(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE sync_status (sync_data_kind INTEGER PRIMARY KEY, last_sync INT NOT NULL);");
  }
  
  /* Error */
  static long a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: anewarray 22	java/lang/String
    //   6: dup
    //   7: iconst_0
    //   8: ldc_w 263
    //   11: aastore
    //   12: aconst_null
    //   13: aconst_null
    //   14: aconst_null
    //   15: aconst_null
    //   16: aconst_null
    //   17: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   20: astore 4
    //   22: aload 4
    //   24: invokeinterface 273 1 0
    //   29: ifeq +27 -> 56
    //   32: aload 4
    //   34: iconst_0
    //   35: invokeinterface 277 2 0
    //   40: lstore 8
    //   42: lload 8
    //   44: lstore 6
    //   46: aload 4
    //   48: invokeinterface 280 1 0
    //   53: lload 6
    //   55: lreturn
    //   56: lconst_0
    //   57: lstore 6
    //   59: goto -13 -> 46
    //   62: astore 5
    //   64: aload 4
    //   66: invokeinterface 280 1 0
    //   71: aload 5
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	74	1	paramString1	String
    //   0	74	2	paramString2	String
    //   0	74	3	paramArrayOfString	String[]
    //   20	45	4	localCursor	Cursor
    //   62	10	5	localObject	Object
    //   44	14	6	l1	long
    //   40	3	8	l2	long
    // Exception table:
    //   from	to	target	type
    //   22	42	62	finally
  }
  
  @Deprecated
  public static bqj a(Context paramContext, int paramInt)
  {
    return (bqj)((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt);
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    int i = 0;
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("partition_name", paramString);
    int j = paramArrayOfString1.length;
    for (int k = 0; k < j; k++)
    {
      localContentValues.put("table_name", paramArrayOfString1[k]);
      paramSQLiteDatabase.replace("partition_tables", null, localContentValues);
    }
    if (paramArrayOfString2 != null)
    {
      localContentValues.clear();
      localContentValues.put("partition_name", paramString);
      int m = paramArrayOfString2.length;
      while (i < m)
      {
        localContentValues.put("view_name", paramArrayOfString2[i]);
        paramSQLiteDatabase.replace("partition_views", null, localContentValues);
        i++;
      }
    }
    localContentValues.clear();
    localContentValues.put("partition_name", paramString);
    localContentValues.put("version", Integer.valueOf(1));
    paramSQLiteDatabase.replace("partition_versions", null, localContentValues);
    if (Log.isLoggable("EsDatabaseHelper", 2))
    {
      String str1 = String.valueOf(Arrays.asList(paramArrayOfString1));
      List localList = null;
      if (paramArrayOfString2 != null) {
        localList = Arrays.asList(paramArrayOfString2);
      }
      String str2 = String.valueOf(localList);
      new StringBuilder(57 + String.valueOf(paramString).length() + String.valueOf(str1).length() + String.valueOf(str2).length()).append("insertPartition ").append(paramString).append(", version: 1").append(", tables: ").append(str1).append(", views: ").append(str2);
    }
  }
  
  private static void aA(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void aB(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET people_sync_time=-1, people_last_update_token=null");
    paramSQLiteDatabase.execSQL("UPDATE contacts SET last_updated_time=-1");
  }
  
  private static void aC(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestion_events");
    paramSQLiteDatabase.execSQL("CREATE TABLE suggestion_events (action_type INT, person_id BLOB, suggestion_id BLOB, suggestion_ui INT, timestamp INT)");
  }
  
  private static void aD(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void aE(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET people_sync_time=-1, people_last_update_token=null");
    paramSQLiteDatabase.execSQL("UPDATE contacts SET last_updated_time=-1");
  }
  
  private static void aF(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET people_sync_time=-1, people_last_update_token=null");
    paramSQLiteDatabase.execSQL("UPDATE contacts SET last_updated_time=-1");
  }
  
  private static void aG(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void aH(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
    paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions, media_attr, timestamp, last_refresh_time, parent_id );");
  }
  
  private static void aI(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void aJ(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN author_annotation BLOB");
  }
  
  private static void aK(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void aL(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE activity_comments ADD COLUMN flagged BOOLEAN NOT NULL DEFAULT(0)");
    paramSQLiteDatabase.execSQL("ALTER TABLE photo_comments ADD COLUMN flagged BOOLEAN NOT NULL DEFAULT(0)");
  }
  
  private static void aM(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE circles ADD COLUMN last_volume_sync INT NOT NULL DEFAULT(-1)");
    paramSQLiteDatabase.execSQL("ALTER TABLE squares ADD COLUMN last_volume_sync INT NOT NULL DEFAULT(-1)");
  }
  
  private static void aN(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void aO(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS guns;");
    paramSQLiteDatabase.execSQL("CREATE TABLE guns ( _id INTEGER, key TEXT UNIQUE NOT NULL, creation_time INT NOT NULL, collapsed_description TEXT, collapsed_destination TEXT, collapsed_heading TEXT, collapsed_annotation TEXT, collapsed_icon TEXT, entity_reference TEXT, entity_reference_type TEXT, priority TEXT, read_state INT NOT NULL DEFAULT(0), type INT NOT NULL DEFAULT(0), category INT NOT NULL DEFAULT(0), seen INT NOT NULL DEFAULT(0), actors BLOB, activity_id TEXT, event_id TEXT, album_id TEXT, community_id TEXT, updated_version INT NOT NULL DEFAULT(0), push_enabled INT NOT NULL DEFAULT(0), expanded_info BLOB,photos BLOB,pending_read INT NOT NULL DEFAULT(0));");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET last_notification_sync_version=0, unviewed_notifications_count=0, has_unread_notifications=0, last_viewed_notification_version=0, next_notifications_fetch_param=NULL");
  }
  
  private static void aP(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM analytics_events");
  }
  
  private static void aQ(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY,activity_id TEXT UNIQUE NOT NULL,data_state INT NOT NULL DEFAULT (0),author_id TEXT NOT NULL,source_id TEXT,source_name TEXT,total_comment_count INT NOT NULL,plus_one_data BLOB,acl_display TEXT,loc BLOB,created INT NOT NULL,modified INT NOT NULL,whats_hot BLOB,social_friends_plus_oned BLOB,content_flags INT NOT NULL DEFAULT(0),activity_flags INT NOT NULL DEFAULT(0),annotation BLOB,annotation_plaintext TEXT,title BLOB,title_plaintext TEXT,original_author_id TEXT,original_author_name TEXT,original_author_avatar_url TEXT,comment BLOB,permalink TEXT,event_id TEXT,album_id TEXT,square_update BLOB,square_reshare_update BLOB,relateds BLOB,num_reshares INT NOT NULL DEFAULT(0),embed BLOB,embed_deep_link BLOB,embed_appinvite BLOB,promo BLOB,domain TEXT,explanation_activity_id TEXT,birthday BLOB,author_annotation BLOB);");
  }
  
  private static void aR(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY,activity_id TEXT UNIQUE NOT NULL,data_state INT NOT NULL DEFAULT (0),author_id TEXT NOT NULL,source_id TEXT,source_name TEXT,total_comment_count INT NOT NULL,plus_one_data BLOB,acl_display TEXT,loc BLOB,created INT NOT NULL,modified INT NOT NULL,whats_hot BLOB,social_friends_plus_oned BLOB,content_flags INT NOT NULL DEFAULT(0),activity_flags INT NOT NULL DEFAULT(0),annotation BLOB,title BLOB,original_author_id TEXT,original_author_name TEXT,original_author_avatar_url TEXT,comment BLOB,permalink TEXT,event_id TEXT,album_id TEXT,square_update BLOB,square_reshare_update BLOB,relateds BLOB,num_reshares INT NOT NULL DEFAULT(0),embed BLOB,embed_deep_link BLOB,embed_appinvite BLOB,promo BLOB,domain TEXT,explanation_activity_id TEXT,birthday BLOB,author_annotation BLOB);");
  }
  
  private static void aS(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN original_activity_url TEXT");
  }
  
  private static void aT(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void aU(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS emotishare_data");
    paramSQLiteDatabase.execSQL("CREATE TABLE emotishare_data (_id INTEGER PRIMARY KEY AUTOINCREMENT,type INTEGER UNIQUE ON CONFLICT REPLACE,data BLOB,generation INT DEFAULT(-1));");
  }
  
  private static void aV(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.beginTransaction();
    try
    {
      paramSQLiteDatabase.execSQL("ALTER TABLE account_status RENAME TO tmp_table");
      paramSQLiteDatabase.execSQL("CREATE TABLE account_status(user_id TEXT,last_sync_time INT DEFAULT(-1),last_stats_sync_time INT DEFAULT(-1),last_contacted_time INT DEFAULT(-1),wipeout_stats INT DEFAULT(0),circle_sync_time INT DEFAULT(-1),circle_fingerprint INT DEFAULT(-1),circle_settings_sync_time INT DEFAULT(-1),people_sync_time INT DEFAULT(-1),people_fingerprint INT DEFAULT(-1),people_last_update_token TEXT,suggested_people_sync_time INT DEFAULT(-1),blocked_people_sync_time INT DEFAULT(-1),event_list_sync_time INT DEFAULT(-1),event_themes_sync_time INT DEFAULT(-1),cover_photo_spec BLOB,audience_data BLOB,audience_history BLOB,contacts_sync_version INT DEFAULT(0),push_notifications INT DEFAULT(0),last_analytics_sync_time INT DEFAULT(-1),last_settings_sync_time INT DEFAULT(-1),last_squares_sync_time INT DEFAULT(-1),last_emotishare_sync_time INT DEFAULT(-1),last_notification_sync_version INT DEFAULT(0), unviewed_notifications_count INT DEFAULT(0), has_unread_notifications INT DEFAULT(0), last_viewed_notification_version INT DEFAULT(0), next_read_notifications_fetch_param BLOB, next_unread_notifications_fetch_param BLOB, last_read_notifications_sync_time INT DEFAULT(-1));");
      paramSQLiteDatabase.execSQL(53 + String.valueOf("user_id,last_sync_time,last_stats_sync_time,last_contacted_time,wipeout_stats,circle_sync_time,circle_fingerprint,circle_settings_sync_time,people_sync_time,people_fingerprint,people_last_update_token,suggested_people_sync_time,blocked_people_sync_time,event_list_sync_time,event_themes_sync_time,cover_photo_spec,audience_data,audience_history,contacts_sync_version,push_notifications,last_analytics_sync_time,last_settings_sync_time,last_squares_sync_time,last_emotishare_sync_time,last_notification_sync_version, unviewed_notifications_count, has_unread_notifications, last_viewed_notification_version").length() + String.valueOf("user_id,last_sync_time,last_stats_sync_time,last_contacted_time,wipeout_stats,circle_sync_time,circle_fingerprint,circle_settings_sync_time,people_sync_time,people_fingerprint,people_last_update_token,suggested_people_sync_time,blocked_people_sync_time,event_list_sync_time,event_themes_sync_time,cover_photo_spec,audience_data,audience_history,contacts_sync_version,push_notifications,last_analytics_sync_time,last_settings_sync_time,last_squares_sync_time,last_emotishare_sync_time,last_notification_sync_version, unviewed_notifications_count, has_unread_notifications, last_viewed_notification_version").length() + "INSERT INTO account_status (" + "user_id,last_sync_time,last_stats_sync_time,last_contacted_time,wipeout_stats,circle_sync_time,circle_fingerprint,circle_settings_sync_time,people_sync_time,people_fingerprint,people_last_update_token,suggested_people_sync_time,blocked_people_sync_time,event_list_sync_time,event_themes_sync_time,cover_photo_spec,audience_data,audience_history,contacts_sync_version,push_notifications,last_analytics_sync_time,last_settings_sync_time,last_squares_sync_time,last_emotishare_sync_time,last_notification_sync_version, unviewed_notifications_count, has_unread_notifications, last_viewed_notification_version" + ") SELECT " + "user_id,last_sync_time,last_stats_sync_time,last_contacted_time,wipeout_stats,circle_sync_time,circle_fingerprint,circle_settings_sync_time,people_sync_time,people_fingerprint,people_last_update_token,suggested_people_sync_time,blocked_people_sync_time,event_list_sync_time,event_themes_sync_time,cover_photo_spec,audience_data,audience_history,contacts_sync_version,push_notifications,last_analytics_sync_time,last_settings_sync_time,last_squares_sync_time,last_emotishare_sync_time,last_notification_sync_version, unviewed_notifications_count, has_unread_notifications, last_viewed_notification_version" + " FROM tmp_table;");
      paramSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramSQLiteDatabase.endTransaction();
    }
  }
  
  private static void aW(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS squares");
    paramSQLiteDatabase.execSQL("CREATE TABLE squares (_id INTEGER PRIMARY KEY,square_id TEXT UNIQUE NOT NULL,square_name TEXT,tagline TEXT,photo_url TEXT,about_text TEXT,joinability INT NOT NULL DEFAULT(0),member_count INT NOT NULL DEFAULT(0),membership_status INT NOT NULL DEFAULT(0),is_member INT NOT NULL DEFAULT(0),list_category INT NOT NULL DEFAULT(0),post_visibility INT NOT NULL DEFAULT(-1),can_see_members INT NOT NULL DEFAULT(0),can_see_posts INT NOT NULL DEFAULT(0),can_join INT NOT NULL DEFAULT(0),can_request_to_join INT NOT NULL DEFAULT(0),can_share INT NOT NULL DEFAULT(0),can_invite INT NOT NULL DEFAULT(0),notifications_enabled INT NOT NULL DEFAULT(0),square_streams BLOB,inviter_gaia_id TEXT,sort_index INT NOT NULL DEFAULT(0),last_sync INT DEFAULT(-1),last_members_sync INT DEFAULT(-1),invitation_dismissed INT NOT NULL DEFAULT(0),auto_subscribe INT NOT NULL DEFAULT(0),disable_subscription INT NOT NULL DEFAULT(0),unread_count INT NOT NULL DEFAULT(0),volume INT,suggestion_id TEXT,last_volume_sync INT NOT NULL DEFAULT(-1),restricted_domain TEXT  );");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET last_squares_sync_time=-1");
  }
  
  private static void aX(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN pending_delete INT NOT NULL DEFAULT(0)");
  }
  
  private static void aY(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN notification_poll_interval INT DEFAULT(-1)");
  }
  
  private static void aZ(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN equivalence_token TEXT");
  }
  
  private static void aa(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE shared_collections (_id TEXT UNIQUE NOT NULL);");
  }
  
  private static void ab(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
  }
  
  private static void ac(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, event_id TEXT UNIQUE NOT NULL, activity_id TEXT UNIQUE, name TEXT, source INT, creator_gaia_id TEXT, update_timestamp INT, refresh_timestamp INT, activity_refresh_timestamp INT, invitee_roster_timestamp INT, fingerprint INT NOT NULL DEFAULT(0), start_time INT NOT NULL, end_time INT NOT NULL, instant_share_end_time INT, can_invite_people INT DEFAULT (0), can_post_photos INT DEFAULT (0), can_comment INT DEFAULT(0) NOT NULL, mine INT DEFAULT (0) NOT NULL, polling_token TEXT,resume_token TEXT,display_time INT DEFAULT (0),event_data BLOB, plus_one_data BLOB, invitee_roster BLOB, deleted INT DEFAULT (0) );");
  }
  
  private static void ad(SQLiteDatabase paramSQLiteDatabase)
  {
    try
    {
      paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN circle_sync_time INT DEFAULT(-1)");
    }
    catch (SQLiteException localSQLiteException1)
    {
      for (;;)
      {
        try
        {
          paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN people_sync_time INT DEFAULT(-1)");
          return;
        }
        catch (SQLiteException localSQLiteException2)
        {
          Log.e("EsDatabaseHelper", "Failed to add people_sync_time column to account_status table.", localSQLiteException2);
        }
        localSQLiteException1 = localSQLiteException1;
        Log.e("EsDatabaseHelper", "Failed to add circle_sync_time column to account_status table.", localSQLiteException1);
      }
    }
  }
  
  private static void ae(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE contacts ADD COLUMN verified INT DEFAULT(0)");
  }
  
  private static void af(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void ag(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET people_sync_time=-1, people_last_update_token=null");
    paramSQLiteDatabase.execSQL("UPDATE contacts SET last_updated_time=-1");
  }
  
  private static void ah(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
  }
  
  /* Error */
  private final void ai(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 483
    //   4: iconst_2
    //   5: anewarray 22	java/lang/String
    //   8: dup
    //   9: iconst_0
    //   10: ldc_w 485
    //   13: aastore
    //   14: dup
    //   15: iconst_1
    //   16: ldc_w 487
    //   19: aastore
    //   20: ldc_w 489
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore 6
    //   32: aload 6
    //   34: astore_3
    //   35: aload_3
    //   36: ifnull +82 -> 118
    //   39: aload_3
    //   40: invokeinterface 492 1 0
    //   45: ifeq +73 -> 118
    //   48: aload_3
    //   49: iconst_0
    //   50: invokeinterface 496 2 0
    //   55: astore 7
    //   57: aload_3
    //   58: iconst_1
    //   59: invokeinterface 500 2 0
    //   64: invokestatic 505	bpw:a	([B)Ljava/util/List;
    //   67: astore 8
    //   69: aload 8
    //   71: ifnull -32 -> 39
    //   74: aload 8
    //   76: invokeinterface 510 1 0
    //   81: ifne -42 -> 39
    //   84: aload_1
    //   85: aload 7
    //   87: aload 8
    //   89: invokestatic 515	brn:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/util/List;)V
    //   92: goto -53 -> 39
    //   95: astore_2
    //   96: ldc_w 327
    //   99: ldc_w 517
    //   102: aload_2
    //   103: invokestatic 470	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   106: pop
    //   107: aload_3
    //   108: ifnull +9 -> 117
    //   111: aload_3
    //   112: invokeinterface 280 1 0
    //   117: return
    //   118: aload_3
    //   119: ifnull -2 -> 117
    //   122: aload_3
    //   123: invokeinterface 280 1 0
    //   128: return
    //   129: astore 4
    //   131: aconst_null
    //   132: astore_3
    //   133: aload_3
    //   134: ifnull +9 -> 143
    //   137: aload_3
    //   138: invokeinterface 280 1 0
    //   143: aload 4
    //   145: athrow
    //   146: astore 4
    //   148: goto -15 -> 133
    //   151: astore_2
    //   152: aconst_null
    //   153: astore_3
    //   154: goto -58 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	this	bqj
    //   0	157	1	paramSQLiteDatabase	SQLiteDatabase
    //   95	8	2	localThrowable1	Throwable
    //   151	1	2	localThrowable2	Throwable
    //   34	120	3	localCursor1	Cursor
    //   129	15	4	localObject1	Object
    //   146	1	4	localObject2	Object
    //   30	3	6	localCursor2	Cursor
    //   55	31	7	str	String
    //   67	21	8	localList	List
    // Exception table:
    //   from	to	target	type
    //   39	69	95	java/lang/Throwable
    //   74	92	95	java/lang/Throwable
    //   0	32	129	finally
    //   39	69	146	finally
    //   74	92	146	finally
    //   96	107	146	finally
    //   0	32	151	java/lang/Throwable
  }
  
  private static void aj(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void ak(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET last_squares_sync_time=-1");
    paramSQLiteDatabase.execSQL("DELETE FROM squares");
    paramSQLiteDatabase.execSQL("ALTER TABLE squares ADD COLUMN is_restricted BOOLEAN DEFAULT '0'");
  }
  
  private static void al(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN explanation_activity_id TEXT");
  }
  
  private static void am(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET audience_data=null");
  }
  
  private static void an(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void ao(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void ap(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET last_squares_sync_time=-1");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS squares");
    paramSQLiteDatabase.execSQL("CREATE TABLE squares (_id INTEGER PRIMARY KEY,square_id TEXT UNIQUE NOT NULL,square_name TEXT,tagline TEXT,photo_url TEXT,about_text TEXT,joinability INT NOT NULL DEFAULT(0),member_count INT NOT NULL DEFAULT(0),membership_status INT NOT NULL DEFAULT(0),is_member INT NOT NULL DEFAULT(0),list_category INT NOT NULL DEFAULT(0),post_visibility INT NOT NULL DEFAULT(-1),can_see_members INT NOT NULL DEFAULT(0),can_see_posts INT NOT NULL DEFAULT(0),can_join INT NOT NULL DEFAULT(0),can_request_to_join INT NOT NULL DEFAULT(0),can_share INT NOT NULL DEFAULT(0),can_invite INT NOT NULL DEFAULT(0),notifications_enabled INT NOT NULL DEFAULT(0),square_streams BLOB,inviter_gaia_id TEXT,sort_index INT NOT NULL DEFAULT(0),last_sync INT DEFAULT(-1),last_members_sync INT DEFAULT(-1),invitation_dismissed INT NOT NULL DEFAULT(0),auto_subscribe INT NOT NULL DEFAULT(0),disable_subscription INT NOT NULL DEFAULT(0),unread_count INT NOT NULL DEFAULT(0),volume INT,is_restricted BOOLEAN DEFAULT '0');");
  }
  
  private static void aq(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET audience_history=null");
  }
  
  private static void ar(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE people_suggestion_events RENAME TO suggestion_events");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void as(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE squares ADD COLUMN suggestion_id TEXT");
  }
  
  private static void at(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN birthday BLOB");
  }
  
  private static void au(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void av(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void aw(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM guns");
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET people_sync_time=-1, people_last_update_token=null");
    paramSQLiteDatabase.execSQL("UPDATE contacts SET last_updated_time=-1");
  }
  
  private static void ax(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void ay(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void az(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET people_sync_time=-1, people_last_update_token=null");
    paramSQLiteDatabase.execSQL("UPDATE contacts SET last_updated_time=-1");
  }
  
  private static void bA(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN last_notification_heavy_tickle_version INT DEFAULT(0)");
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN gcm_push_notifications INT DEFAULT(0)");
  }
  
  /* Error */
  private final void bB(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 562
    //   4: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   7: aload_1
    //   8: ldc_w 372
    //   11: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc_w 564
    //   18: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ldc_w 566
    //   25: iconst_2
    //   26: anewarray 22	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: ldc_w 568
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: ldc_w 570
    //   40: aastore
    //   41: ldc_w 572
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   51: astore_2
    //   52: new 290	android/content/ContentValues
    //   55: dup
    //   56: invokespecial 574	android/content/ContentValues:<init>	()V
    //   59: astore_3
    //   60: aload_2
    //   61: invokeinterface 492 1 0
    //   66: ifeq +147 -> 213
    //   69: aload_2
    //   70: iconst_0
    //   71: invokeinterface 277 2 0
    //   76: lstore 6
    //   78: new 576	ojf
    //   81: dup
    //   82: invokespecial 577	ojf:<init>	()V
    //   85: astore 8
    //   87: aload_2
    //   88: iconst_1
    //   89: invokeinterface 500 2 0
    //   94: astore 9
    //   96: aload 8
    //   98: aload 9
    //   100: iconst_0
    //   101: aload 9
    //   103: arraylength
    //   104: invokestatic 582	qat:b	(Lqat;[BII)Lqat;
    //   107: checkcast 576	ojf
    //   110: invokestatic 587	mar:a	(Lojf;)Ljava/lang/String;
    //   113: astore 10
    //   115: aload_3
    //   116: invokevirtual 308	android/content/ContentValues:clear	()V
    //   119: aload 10
    //   121: ifnull +57 -> 178
    //   124: aload_3
    //   125: ldc_w 589
    //   128: aload 10
    //   130: invokevirtual 297	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   133: iconst_1
    //   134: anewarray 22	java/lang/String
    //   137: astore 11
    //   139: aload 11
    //   141: iconst_0
    //   142: lload 6
    //   144: invokestatic 594	java/lang/Long:toString	(J)Ljava/lang/String;
    //   147: aastore
    //   148: aload_1
    //   149: ldc_w 566
    //   152: aload_3
    //   153: ldc_w 596
    //   156: aload 11
    //   158: invokevirtual 600	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   161: pop
    //   162: goto -102 -> 60
    //   165: astore 5
    //   167: aload_1
    //   168: invokestatic 603	bqj:bC	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   171: aload_2
    //   172: invokeinterface 280 1 0
    //   177: return
    //   178: ldc_w 327
    //   181: iconst_5
    //   182: invokestatic 333	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   185: ifeq +24 -> 209
    //   188: new 77	java/lang/StringBuilder
    //   191: dup
    //   192: bipush 59
    //   194: invokespecial 80	java/lang/StringBuilder:<init>	(I)V
    //   197: ldc_w 605
    //   200: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: lload 6
    //   205: invokevirtual 608	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload_1
    //   210: invokestatic 603	bqj:bC	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   213: aload_2
    //   214: invokeinterface 280 1 0
    //   219: return
    //   220: astore 4
    //   222: aload_2
    //   223: invokeinterface 280 1 0
    //   228: aload 4
    //   230: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	this	bqj
    //   0	231	1	paramSQLiteDatabase	SQLiteDatabase
    //   51	172	2	localCursor	Cursor
    //   59	94	3	localContentValues	ContentValues
    //   220	9	4	localObject	Object
    //   165	1	5	localqas	qas
    //   76	128	6	l	long
    //   85	12	8	localojf	ojf
    //   94	8	9	arrayOfByte	byte[]
    //   113	16	10	str	String
    //   137	20	11	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   52	60	165	qas
    //   60	119	165	qas
    //   124	162	165	qas
    //   178	209	165	qas
    //   209	213	165	qas
    //   52	60	220	finally
    //   60	119	220	finally
    //   124	162	220	finally
    //   167	171	220	finally
    //   178	209	220	finally
    //   209	213	220	finally
  }
  
  private static void bC(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
  }
  
  private static void bD(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bE(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("ALTER TABLE activity_streams ADD COLUMN featured_update BLOB");
  }
  
  private static void bF(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bG(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bH(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY,activity_id TEXT UNIQUE NOT NULL,data_state INT NOT NULL DEFAULT (0),author_id TEXT NOT NULL,source_id TEXT,source_name TEXT,total_comment_count INT NOT NULL,plus_one_data BLOB,acl_display TEXT,loc BLOB,created INT NOT NULL,modified INT NOT NULL,whats_hot BLOB,social_friends_plus_oned BLOB,content_flags INT NOT NULL DEFAULT(0),activity_flags INT NOT NULL DEFAULT(0),annotation BLOB,title BLOB,original_author_id TEXT,original_author_name TEXT,original_author_avatar_url TEXT,comment BLOB,permalink TEXT,event_id TEXT,square_update BLOB,square_reshare_update BLOB,relateds BLOB,num_reshares INT NOT NULL DEFAULT(0),embed BLOB,embed_deep_link BLOB,embed_appinvite BLOB,promo BLOB,domain TEXT,explanation_activity_id TEXT,birthday BLOB,original_activity_url TEXT,author_annotation BLOB);");
  }
  
  private static void bI(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE all_photos (_id INTEGER PRIMARY KEY AUTOINCREMENT, photo_id INTEGER, image_url TEXT, is_from_autobackup BOOLEAN DEFAULT '0', comment_count INTEGER, plusone_count INTEGER, data BLOB, local_file_path TEXT, local_content_uri TEXT, fingerprint TEXT, timestamp INTEGER NOT NULL DEFAULT '0', media_attr INTEGER NOT NULL DEFAULT '0', user_actions INTEGER NOT NULL DEFAULT '0');");
    paramSQLiteDatabase.execSQL("CREATE INDEX remote_photos_idx ON all_photos(is_from_autobackup, timestamp, fingerprint, local_content_uri, photo_id, image_url, comment_count, plusone_count, media_attr );");
  }
  
  private static void bJ(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bK(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activity_comments");
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_comments  (_id INTEGER PRIMARY KEY,activity_id TEXT NOT NULL,comment_id TEXT UNIQUE NOT NULL,author_id TEXT NOT NULL,content BLOB,created INT NOT NULL,plus_one_data BLOB,comment_flags INT NOT NULL DEFAULT(0), FOREIGN KEY (activity_id) REFERENCES activities(activity_id) ON DELETE CASCADE);");
  }
  
  private static void bL(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN promoted_post_data BLOB");
  }
  
  private static void bM(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE photo_requests (token TEXT, token_type INT NOT NULL);");
  }
  
  private static void bN(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS all_photos");
    paramSQLiteDatabase.execSQL("CREATE TABLE all_photos (_id INTEGER PRIMARY KEY AUTOINCREMENT, photo_id INTEGER, image_url TEXT, is_primary BOOLEAN DEFAULT '0', comment_count INTEGER, plusone_count INTEGER, data BLOB, local_file_path TEXT, local_content_uri TEXT, fingerprint TEXT, timestamp INTEGER NOT NULL DEFAULT '0', media_attr INTEGER NOT NULL DEFAULT '0', user_actions INTEGER NOT NULL DEFAULT '0');");
    paramSQLiteDatabase.execSQL("CREATE INDEX remote_photos_idx ON all_photos(is_primary, timestamp, fingerprint, local_content_uri, photo_id, image_url, comment_count, plusone_count, media_attr );");
  }
  
  private static void bO(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE table_versions (table_name TEXT PRIMARY KEY,version INT NOT NULL DEFAULT(0));");
  }
  
  private static void bP(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bQ(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN people_view_suggestions BLOB");
  }
  
  private static void bR(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS remote_photos_idx");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_photo_id_idx ON all_photos(photo_id);");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_ui_idx ON all_photos(is_primary, local_content_uri, timestamp, _id);");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_is_primary_idx ON all_photos(is_primary, fingerprint, photo_id);");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_local_only_by_fingerprint_idx ON all_photos(fingerprint, photo_id);");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_local_only_by_content_uri_idx ON all_photos(local_content_uri, photo_id);");
  }
  
  private static void bS(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
    paramSQLiteDatabase.execSQL("ALTER TABLE profiles ADD COLUMN local_reviews_data_proto BLOB");
    paramSQLiteDatabase.execSQL("ALTER TABLE profiles ADD COLUMN self_local_reviews_data_proto BLOB");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bT(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bU(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS all_photos");
    paramSQLiteDatabase.execSQL("CREATE TABLE all_photos (_id INTEGER PRIMARY KEY AUTOINCREMENT, photo_id INTEGER, image_url TEXT, is_primary BOOLEAN DEFAULT '0', data BLOB, local_file_path TEXT, local_content_uri TEXT, fingerprint TEXT, timestamp INTEGER NOT NULL DEFAULT '0', media_attr INTEGER NOT NULL DEFAULT '0', user_actions INTEGER NOT NULL DEFAULT '0');");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_photo_id_idx ON all_photos(photo_id);");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_ui_idx ON all_photos(is_primary, local_content_uri, timestamp, _id);");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_is_primary_idx ON all_photos(is_primary, fingerprint, photo_id);");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_local_only_by_fingerprint_idx ON all_photos(fingerprint, photo_id);");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_local_only_by_content_uri_idx ON all_photos(local_content_uri, photo_id);");
  }
  
  private static void bV(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bW(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bX(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE all_photos ADD COLUMN has_edit_list BOOLEAN DEFAULT '0'");
  }
  
  private static void bY(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bZ(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE all_photos ADD COLUMN signature TEXT DEFAULT NULL");
  }
  
  private static void ba(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bb(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles where view_id='best' AND view_order < 50100");
  }
  
  private static void bc(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bd(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DELETE FROM guns");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS all_tiles");
    paramSQLiteDatabase.execSQL("CREATE TABLE all_tiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, view_id TEXT NOT NULL, view_order INTEGER NOT NULL, type INTEGER NOT NULL, cluster_id TEXT, tile_id TEXT NOT NULL, title TEXT, subtitle TEXT, image_url TEXT, image_width INTEGER, image_height INTEGER, cluster_count INTEGER, comment_count INTEGER, plusone_count INTEGER, acl INTEGER, user_actions INTEGER NOT NULL DEFAULT '0', media_attr INTEGER NOT NULL DEFAULT '0', timestamp INTEGER NOT NULL DEFAULT '0', data BLOB, parent_id TEXT, photo_id INTEGER, owner_id TEXT, last_refresh_time INTEGER NOT NULL DEFAULT '0', equivalence_token TEXT);");
  }
  
  private static void be(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE media_cache (filename TEXT PRIMARY KEY,image_url TEXT,size INT NOT NULL DEFAULT(0),http_status INT NOT NULL DEFAULT(0),representation_type INT NOT NULL DEFAULT(0))");
  }
  
  private static void bf(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.query("circles", new String[] { "circle_id", "type" }, null, null, null, null, null);
    while (localCursor.moveToNext())
    {
      String str = localCursor.getString(0);
      int i = localCursor.getInt(1);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("circle_id", str);
      localContentValues.put("show_order", Integer.valueOf(brn.b(i)));
      String[] arrayOfString = new String[1];
      arrayOfString[0] = localContentValues.getAsString("circle_id");
      paramSQLiteDatabase.update("circles", localContentValues, "circle_id=?", arrayOfString);
    }
  }
  
  private static void bg(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN event_type INT DEFAULT(0)");
  }
  
  private static void bh(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activity_comments");
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_comments (_id INTEGER PRIMARY KEY,activity_id TEXT NOT NULL,comment_id TEXT UNIQUE NOT NULL,author_id TEXT NOT NULL,content TEXT,created INT NOT NULL,plus_one_data BLOB,comment_flags INT NOT NULL DEFAULT(0), FOREIGN KEY (activity_id) REFERENCES activities(activity_id) ON DELETE CASCADE);");
  }
  
  private static void bi(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN media_key TEXT");
  }
  
  private static void bj(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET audience_history=NULL");
  }
  
  private static void bk(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN next_read_low_notifications_fetch_param BLOB");
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN next_unread_low_notifications_fetch_param BLOB");
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN read_low_notifications_summary BLOB");
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN unread_low_notifications_summary BLOB");
  }
  
  private static void bl(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE INDEX media_cache_idx ON media_cache ( image_url, http_status, representation_type )");
  }
  
  private static void bm(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN display_index INT NOT NULL DEFAULT(0)");
  }
  
  private static void bn(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE circles SET show_order = 0 WHERE circle_id = 'v.all.circles'");
    paramSQLiteDatabase.execSQL("UPDATE circles SET show_order = 10 WHERE circle_id = 'v.whatshot'");
  }
  
  private static void bo(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN creators BLOB");
  }
  
  private static void bp(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN people_view_notification_count INT DEFAULT(0)");
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN people_view_notification_poll_interval INT DEFAULT(-1)");
  }
  
  private static void bq(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN last_lowpri_read_notifications_sync_time INT DEFAULT(-1)");
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN last_lowpri_unread_notifications_sync_time INT DEFAULT(-1)");
  }
  
  private static void br(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN has_synced_photo_uploads INT DEFAULT(0)");
  }
  
  private static void bs(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN photographer_gaia_id TEXT");
    paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN photographer_avatar_url TEXT");
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
    paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions, media_attr, timestamp, last_refresh_time, parent_id, photographer_gaia_id, photographer_avatar_url);");
  }
  
  private static void bt(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE sync_status SET last_sync = 0 WHERE sync_data_kind = 13");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET people_view_notification_poll_interval = 1");
  }
  
  private static void bu(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bv(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM guns");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET last_notification_sync_version=0, unviewed_notifications_count=0, has_unread_notifications=0, last_viewed_notification_version=0, next_unread_notifications_fetch_param=NULL");
  }
  
  private static void bw(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE profiles SET contact_proto=NULL");
  }
  
  private static void bx(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
  }
  
  private static void by(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void bz(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private final void c()
  {
    PreferenceManager.getDefaultSharedPreferences(this.b).edit().remove("debug.plus.frontend.config").apply();
  }
  
  private final void cA(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, "analytics_legacy", 1, new String[] { "analytics_events" }, null);
  }
  
  private static void cB(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void cC(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE all_tiles SET media_attr = media_attr | 16777216 WHERE parent_id IS NULL AND (acl IS NULL OR acl IN (-1, 2))");
    paramSQLiteDatabase.execSQL("UPDATE all_tiles SET media_attr = media_attr | 16777216 WHERE parent_id IN (SELECT cluster_id FROM all_tiles WHERE parent_id IS NULL AND (acl IS NULL OR acl IN (-1, 2)))");
  }
  
  private static void cD(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_contacts (gaia_id TEXT PRIMARY KEY, avatar_url TEXT, name TEXT)");
  }
  
  private final void cE(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, "stream", 1, new String[] { "activity_streams", "activities", "activity_contacts", "activity_comments", "search", "deep_link_installs" }, new String[] { "activities_stream_view", "activity_view", "comments_view", "deep_link_installs_view" });
  }
  
  private final void cF(SQLiteDatabase paramSQLiteDatabase)
  {
    for (;;)
    {
      try
      {
        Cursor localCursor2 = paramSQLiteDatabase.query("account_status", new String[] { "has_synced_photo_uploads" }, null, null, null, null, null);
        localCursor1 = localCursor2;
      }
      finally
      {
        long l;
        Cursor localCursor1 = null;
        if (localCursor1 != null) {
          localCursor1.close();
        }
        mbb.a(this.b, hcb.class);
        hcb.a(this.b, this.e, false);
      }
      try
      {
        if (!localCursor1.moveToFirst()) {
          break label138;
        }
        l = localCursor1.getLong(0);
        if (l == 0L) {
          continue;
        }
        bool = true;
      }
      finally
      {
        continue;
        bool = false;
      }
      if (localCursor1 != null) {
        localCursor1.close();
      }
      mbb.a(this.b, hcb.class);
      hcb.a(this.b, this.e, bool);
      return;
      bool = false;
    }
  }
  
  private static void cG(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_image_url_index ON all_photos(image_url)");
  }
  
  private static void cH(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE suggestion_events ADD COLUMN action_source INT DEFAULT(0)");
  }
  
  private static void cI(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE profiles ADD COLUMN profile_squares_proto BLOB");
  }
  
  private final void cJ(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, "PhotosDbPartition", 1, new String[] { "all_photos", "all_tiles", "tile_requests", "photo_comments", "shared_collections", "all_photos_local_sync", "photo_requests" }, null);
  }
  
  private static void cK(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET audience_data=NULL");
    paramSQLiteDatabase.execSQL("UPDATE account_status SET audience_history=NULL");
  }
  
  private static void cL(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void cM(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE network_data_transactions ADD COLUMN negotiated_protocol TEXT");
  }
  
  private final void cN(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, "discovery", 1, new String[] { "suggestion_events" }, null);
  }
  
  private static void cO(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE suggested_people");
  }
  
  private static void cP(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN app_payload BLOB");
  }
  
  private static void cQ(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN analytics_data BLOB");
  }
  
  private static void cR(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE network_data_transactions ADD COLUMN server_elapsed_time INT");
  }
  
  private static void cS(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
  }
  
  private static void cT(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE profiles SET local_reviews_data_proto=NULL");
    paramSQLiteDatabase.execSQL("UPDATE profiles SET self_local_reviews_data_proto=NULL");
  }
  
  private static void cU(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS stories_idx");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS stories");
  }
  
  private static void cV(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS emotishare_data");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void cW(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void cX(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void cY(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE followers (_id INTEGER PRIMARY KEY, follower_payload BLOB NOT NULL)");
  }
  
  private static void ca(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void cb(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void cc(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private final void cd(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_photos");
    paramSQLiteDatabase.execSQL("DELETE FROM photo_requests");
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = localSharedPreferences.getAll().keySet().iterator();
    label140:
    while (localIterator1.hasNext())
    {
      String str3 = (String)localIterator1.next();
      String[] arrayOfString = f;
      int k = arrayOfString.length;
      for (int m = 0;; m++)
      {
        if (m >= k) {
          break label140;
        }
        String str4 = arrayOfString[m];
        if ((str3.equals(str4)) || (str3.startsWith(String.valueOf(str4).concat(":"))))
        {
          localArrayList.add(str3);
          break;
        }
      }
    }
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext()) {
      localEditor.remove((String)localIterator2.next());
    }
    for (Uri localUri : g)
    {
      String str1 = this.c.a(this.e).b("gaia_id");
      String str2 = String.valueOf(localUri.toString());
      localEditor.putString(1 + String.valueOf(str2).length() + String.valueOf(str1).length() + str2 + ":" + str1, null);
    }
    localEditor.commit();
  }
  
  private static void ce(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void cf(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activity_streams");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY,activity_id TEXT UNIQUE NOT NULL,data_state INT NOT NULL DEFAULT (0),author_id TEXT NOT NULL,source_id TEXT,source_name TEXT,total_comment_count INT NOT NULL,plus_one_data BLOB,acl_display TEXT,loc BLOB,created INT NOT NULL,modified INT NOT NULL,content_flags INT NOT NULL DEFAULT(0),activity_flags INT NOT NULL DEFAULT(0),annotation BLOB,title BLOB,original_author_id TEXT,original_author_name TEXT,original_author_avatar_url TEXT,comment BLOB,permalink TEXT,event_id TEXT,square_update BLOB,square_reshare_update BLOB,relateds BLOB,num_reshares INT NOT NULL DEFAULT(0),embed BLOB,embed_deep_link BLOB,embed_appinvite BLOB,promo BLOB,domain TEXT,birthday BLOB,author_annotation BLOB,original_activity_url TEXT,promoted_post_data BLOB);");
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_streams (stream_key TEXT NOT NULL,activity_id TEXT NOT NULL,sort_index INT NOT NULL,last_activity INT,token TEXT,context_specific_data BLOB,stream_token TEXT,PRIMARY KEY (stream_key, activity_id));");
  }
  
  private static void cg(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP INDEX all_photos_ui_idx");
    paramSQLiteDatabase.execSQL("CREATE INDEX all_photos_ui_idx on all_photos (is_primary, timestamp, _id, local_content_uri);");
  }
  
  private static void ch(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE all_photos_local_sync (media_store_uri TEXT UNIQUE NOT NULL, media_store_token TEXT);");
  }
  
  private static void ci(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE squares ADD COLUMN related_links BLOB");
  }
  
  private static void cj(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM profiles");
    paramSQLiteDatabase.execSQL("ALTER TABLE profiles ADD COLUMN profile_stats_proto BLOB");
  }
  
  private static void ck(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY,activity_id TEXT UNIQUE NOT NULL,data_state INT NOT NULL DEFAULT (0),author_id TEXT NOT NULL,source_id TEXT,source_name TEXT,total_comment_count INT NOT NULL,plus_one_data BLOB,acl_display TEXT,loc BLOB,created INT NOT NULL,modified INT NOT NULL,content_flags INT NOT NULL DEFAULT(0),activity_flags INT NOT NULL DEFAULT(0),annotation BLOB,title BLOB,original_author_id TEXT,original_author_name TEXT,original_author_avatar_url TEXT,comment BLOB,permalink TEXT,event_id TEXT,square_update BLOB,square_reshare_update BLOB,relateds BLOB,num_reshares INT NOT NULL DEFAULT(0),embed BLOB,embed_deep_link BLOB,embed_appinvite BLOB,payload BLOB,domain TEXT,birthday BLOB,author_annotation BLOB,original_activity_url TEXT,promoted_post_data BLOB);");
  }
  
  private static void cl(SQLiteDatabase paramSQLiteDatabase)
  {
    ContentValues localContentValues = new ContentValues();
    Cursor localCursor1 = paramSQLiteDatabase.query("all_photos", new String[] { "fingerprint", "SUM(is_primary) as total_primaries" }, "is_primary = 1 AND fingerprint IS NOT NULL", null, "fingerprint", "total_primaries > 1", null);
    paramSQLiteDatabase.beginTransaction();
    try
    {
      while (localCursor1.moveToNext())
      {
        String str = localCursor1.getString(localCursor1.getColumnIndexOrThrow("fingerprint"));
        if (!TextUtils.isEmpty(str))
        {
          localContentValues.put("is_primary", Integer.valueOf(0));
          paramSQLiteDatabase.update("all_photos", localContentValues, "fingerprint = ?", new String[] { str });
          localCursor2 = paramSQLiteDatabase.query("all_photos", new String[] { "_id" }, "fingerprint = ?", new String[] { str }, null, null, "timestamp DESC", "1");
        }
      }
    }
    finally
    {
      try
      {
        for (;;)
        {
          if (localCursor2.moveToFirst())
          {
            long l = localCursor2.getLong(localCursor2.getColumnIndexOrThrow("_id"));
            localContentValues.put("is_primary", Integer.valueOf(1));
            String[] arrayOfString = new String[1];
            arrayOfString[0] = Long.toString(l);
            paramSQLiteDatabase.update("all_photos", localContentValues, "_id = ?", arrayOfString);
          }
          localCursor2.close();
        }
      }
      finally
      {
        Cursor localCursor2;
        localCursor2.close();
      }
      localObject1 = finally;
      localCursor1.close();
      paramSQLiteDatabase.endTransaction();
    }
    paramSQLiteDatabase.setTransactionSuccessful();
    localCursor1.close();
    paramSQLiteDatabase.endTransaction();
  }
  
  private static void cm(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private final void cn(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE partition_versions (partition_name TEXT NOT NULL PRIMARY KEY,version INT NOT NULL DEFAULT(0));");
    paramSQLiteDatabase.execSQL("CREATE TABLE partition_tables (partition_name TEXT NOT NULL,table_name TEXT NOT NULL,UNIQUE (partition_name,table_name));");
    paramSQLiteDatabase.execSQL("CREATE TABLE partition_views (partition_name TEXT NOT NULL,view_name TEXT NOT NULL,UNIQUE (partition_name,view_name));");
    a(paramSQLiteDatabase, "__master_partition__", 1, new String[] { "partition_versions", "partition_tables", "partition_views" }, null);
  }
  
  private final void co(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, "squares", 1, new String[] { "squares", "square_contact", "square_member_status" }, null);
  }
  
  private static void cp(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE account_status SET last_squares_sync_time=-1");
  }
  
  /* Error */
  private static void cq(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 566
    //   4: iconst_2
    //   5: anewarray 22	java/lang/String
    //   8: dup
    //   9: iconst_0
    //   10: ldc_w 1035
    //   13: aastore
    //   14: dup
    //   15: iconst_1
    //   16: ldc_w 570
    //   19: aastore
    //   20: ldc_w 1067
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_1
    //   31: new 290	android/content/ContentValues
    //   34: dup
    //   35: invokespecial 574	android/content/ContentValues:<init>	()V
    //   38: astore_2
    //   39: aload_1
    //   40: invokeinterface 492 1 0
    //   45: ifeq +147 -> 192
    //   48: aload_2
    //   49: invokevirtual 308	android/content/ContentValues:clear	()V
    //   52: aload_1
    //   53: iconst_1
    //   54: invokeinterface 500 2 0
    //   59: invokestatic 1072	jqt:a	([B)Ljqt;
    //   62: getfield 1075	jqt:c	Lokn;
    //   65: astore 5
    //   67: aload 5
    //   69: getstatic 1080	okl:a	Lqao;
    //   72: invokevirtual 1085	okn:b	(Lqao;)Ljava/lang/Object;
    //   75: ifnull -36 -> 39
    //   78: aload 5
    //   80: getstatic 1080	okl:a	Lqao;
    //   83: invokevirtual 1085	okn:b	(Lqao;)Ljava/lang/Object;
    //   86: checkcast 1077	okl
    //   89: getfield 1088	okl:b	Loif;
    //   92: astore 6
    //   94: aload 6
    //   96: getfield 1094	oif:l	Lokf;
    //   99: ifnull -60 -> 39
    //   102: aload 6
    //   104: getfield 1094	oif:l	Lokf;
    //   107: getfield 1099	okf:a	Ljava/lang/Long;
    //   110: ifnull -71 -> 39
    //   113: aload_2
    //   114: ldc_w 1101
    //   117: aload 6
    //   119: getfield 1094	oif:l	Lokf;
    //   122: getfield 1099	okf:a	Ljava/lang/Long;
    //   125: invokevirtual 1104	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   128: iconst_1
    //   129: anewarray 22	java/lang/String
    //   132: astore 7
    //   134: aload 7
    //   136: iconst_0
    //   137: aload_1
    //   138: iconst_0
    //   139: invokeinterface 703 2 0
    //   144: invokestatic 1106	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   147: aastore
    //   148: aload_0
    //   149: ldc_w 566
    //   152: aload_2
    //   153: ldc_w 1044
    //   156: aload 7
    //   158: invokevirtual 600	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   161: pop
    //   162: goto -123 -> 39
    //   165: astore 4
    //   167: aload_0
    //   168: ldc 212
    //   170: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   173: aload_0
    //   174: ldc 214
    //   176: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   179: aload_0
    //   180: ldc 216
    //   182: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   185: aload_1
    //   186: invokeinterface 280 1 0
    //   191: return
    //   192: aload_1
    //   193: invokeinterface 280 1 0
    //   198: return
    //   199: astore_3
    //   200: aload_1
    //   201: invokeinterface 280 1 0
    //   206: aload_3
    //   207: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	208	0	paramSQLiteDatabase	SQLiteDatabase
    //   30	171	1	localCursor	Cursor
    //   38	115	2	localContentValues	ContentValues
    //   199	8	3	localObject	Object
    //   165	1	4	localException	Exception
    //   65	14	5	localokn	okn
    //   92	26	6	localoif	oif
    //   132	25	7	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   31	39	165	java/lang/Exception
    //   39	162	165	java/lang/Exception
    //   31	39	199	finally
    //   39	162	199	finally
    //   167	185	199	finally
  }
  
  private static void cr(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN duration_days INTEGER NOT NULL DEFAULT '0'");
  }
  
  private final void cs(SQLiteDatabase paramSQLiteDatabase)
  {
    String str = this.c.a(this.e).b("gaia_id");
    paramSQLiteDatabase.execSQL(61 + String.valueOf(str).length() + "UPDATE all_tiles SET view_id = 'best:" + str + "' WHERE view_id = 'best'");
  }
  
  private static void ct(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.query("all_tiles", new String[] { "_id", "type" }, "view_id = ?", new String[] { "best" }, null, null, "view_order ASC");
    Object localObject1 = null;
    int i;
    label67:
    String str;
    try
    {
      if (localCursor.moveToNext())
      {
        if (localCursor.getInt(1) != 2) {
          break label178;
        }
        i = 1;
        if ((i != 0) && (localObject1 != null)) {
          paramSQLiteDatabase.delete("all_tiles", "_id = ?", new String[] { localObject1 });
        }
        if (i == 0) {
          break label184;
        }
        str = localCursor.getString(0);
      }
      else
      {
        if (localObject1 != null) {
          paramSQLiteDatabase.delete("all_tiles", "_id = ?", new String[] { localObject1 });
        }
        return;
      }
    }
    catch (Exception localException)
    {
      paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
      paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
      return;
    }
    finally
    {
      localCursor.close();
    }
    for (;;)
    {
      localObject1 = str;
      break;
      label178:
      i = 0;
      break label67;
      label184:
      str = null;
    }
  }
  
  private static void cu(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activity_comments");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY,unique_activity_id TEXT UNIQUE NOT NULL,activity_id TEXT NOT NULL,data_state INT NOT NULL DEFAULT (0),author_id TEXT NOT NULL,source_id TEXT,source_name TEXT,total_comment_count INT NOT NULL,plus_one_data BLOB,acl_display TEXT,loc BLOB,created INT NOT NULL,modified INT NOT NULL,content_flags INT NOT NULL DEFAULT(0),activity_flags INT NOT NULL DEFAULT(0),annotation BLOB,title BLOB,original_author_id TEXT,original_author_name TEXT,original_author_avatar_url TEXT,comment BLOB,permalink TEXT,event_id TEXT,square_update BLOB,square_reshare_update BLOB,relateds BLOB,num_reshares INT NOT NULL DEFAULT(0),embed BLOB,embed_deep_link BLOB,embed_appinvite BLOB,payload BLOB,domain TEXT,birthday BLOB,author_annotation BLOB,original_activity_url TEXT,promoted_post_data BLOB);");
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_streams (stream_key TEXT NOT NULL,unique_activity_id TEXT NOT NULL,sort_index INT NOT NULL,last_activity INT,token TEXT,context_specific_data BLOB,stream_token TEXT,PRIMARY KEY (stream_key, unique_activity_id));");
    paramSQLiteDatabase.execSQL("CREATE TABLE activity_comments (_id INTEGER PRIMARY KEY,activity_id TEXT NOT NULL,comment_id TEXT UNIQUE NOT NULL,author_id TEXT NOT NULL,content TEXT,created INT NOT NULL,plus_one_data BLOB,comment_flags INT NOT NULL DEFAULT(0));");
  }
  
  private static void cv(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE manual_autoawesome  (_id INTEGER PRIMARY KEY AUTOINCREMENT,render_type INT NOT NULL DEFAULT(0),icon_url TEXT NOT NULL,short_name TEXT NOT NULL,min_num_photos INT NOT NULL DEFAULT(1),max_num_photos INT NOT NULL DEFAULT(1),disallow_animated_inputs INT NOT NULL DEFAULT(0));");
  }
  
  private static void cw(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN background_color INTEGER NOT NULL DEFAULT '0'");
  }
  
  private static void cx(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
  }
  
  private static void cy(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS manual_autoawesome");
    paramSQLiteDatabase.execSQL("CREATE TABLE manual_autoawesome (_id INTEGER PRIMARY KEY AUTOINCREMENT,render_type INT NOT NULL DEFAULT(0),icon_url TEXT NOT NULL,short_name TEXT NOT NULL,min_num_photos INT NOT NULL DEFAULT(1),max_num_photos INT NOT NULL DEFAULT(1),disallow_animated_inputs INT NOT NULL DEFAULT(0),render_failed_message TEXT NOT NULL);");
  }
  
  private static void cz(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE guns ADD COLUMN payload BLOB");
  }
  
  private static void e(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.query("photo", new String[] { "_id", "url" }, "url NOT NULL", null, null, null, null);
    ContentValues localContentValues = new ContentValues(1);
    try
    {
      while (localCursor.moveToNext())
      {
        localContentValues.put("url", iqw.b(localCursor.getString(1)));
        String[] arrayOfString = new String[1];
        arrayOfString[0] = Integer.toString(localCursor.getInt(0));
        paramSQLiteDatabase.update("photo", localContentValues, "_id = ?", arrayOfString);
      }
      paramSQLiteDatabase.execSQL("DELETE FROM activities");
    }
    finally
    {
      localCursor.close();
    }
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void f(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS activities");
    paramSQLiteDatabase.execSQL("CREATE TABLE activities (_id INTEGER PRIMARY KEY, activity_id TEXT UNIQUE NOT NULL, data_state INT NOT NULL DEFAULT (0 ), author_id TEXT NOT NULL, source_id TEXT, source_name TEXT, total_comment_count INT NOT NULL, plus_one_data BLOB, public INT NOT NULL, spam INT NOT NULL, acl_display TEXT, can_comment INT NOT NULL, can_reshare INT NOT NULL, has_muted INT NOT NULL, has_read INT NOT NULL, loc BLOB, created INT NOT NULL, is_edited INT NOT NULL DEFAULT(0), modified INT NOT NULL, whats_hot BLOB, content_flags INT NOT NULL DEFAULT(0), annotation TEXT, annotation_plaintext TEXT, title TEXT, title_plaintext TEXT, original_author_id TEXT, original_author_name TEXT, original_author_avatar_url TEXT, comment BLOB, permalink TEXT, event_id TEXT, PHOTO_COLLECTION BLOB, square_update BLOB, square_reshare_update BLOB, embed_deep_link BLOB, album_id TEXT, embed_media BLOB, embed_photo_album BLOB, embed_checkin BLOB, embed_place BLOB, embed_place_review BLOB, embed_skyjam BLOB, embed_appinvite BLOB, embed_hangout BLOB, embed_square BLOB, embed_emotishare BLOB, promo BLOB);");
  }
  
  private static void g(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void h(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void i(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void j(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void k(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void l(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("ALTER TABLE event_activities ADD COLUMN tile_id TEXT");
  }
  
  private static void m(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void n(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private final void o(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM event_themes");
    File localFile = new File(this.b.getCacheDir(), "event_themes");
    try
    {
      if (localFile.exists())
      {
        File[] arrayOfFile = localFile.listFiles();
        int i = arrayOfFile.length;
        for (int j = 0; j < i; j++) {
          arrayOfFile[j].delete();
        }
        localFile.delete();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private static void p(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
    paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN num_reshares INT NOT NULL DEFAULT(0)");
  }
  
  /* Error */
  private static void q(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 566
    //   4: iconst_2
    //   5: anewarray 22	java/lang/String
    //   8: dup
    //   9: iconst_0
    //   10: ldc_w 1035
    //   13: aastore
    //   14: dup
    //   15: iconst_1
    //   16: ldc_w 1196
    //   19: aastore
    //   20: ldc_w 1198
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_1
    //   31: new 290	android/content/ContentValues
    //   34: dup
    //   35: iconst_1
    //   36: invokespecial 291	android/content/ContentValues:<init>	(I)V
    //   39: astore_2
    //   40: aload_1
    //   41: invokeinterface 492 1 0
    //   46: ifeq +66 -> 112
    //   49: aload_2
    //   50: ldc_w 1196
    //   53: aload_1
    //   54: iconst_1
    //   55: invokeinterface 496 2 0
    //   60: invokestatic 1156	iqw:b	(Ljava/lang/String;)Ljava/lang/String;
    //   63: invokevirtual 297	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: iconst_1
    //   67: anewarray 22	java/lang/String
    //   70: astore 8
    //   72: aload 8
    //   74: iconst_0
    //   75: aload_1
    //   76: iconst_0
    //   77: invokeinterface 703 2 0
    //   82: invokestatic 1106	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   85: aastore
    //   86: aload_0
    //   87: ldc_w 566
    //   90: aload_2
    //   91: ldc_w 1044
    //   94: aload 8
    //   96: invokevirtual 600	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   99: pop
    //   100: goto -60 -> 40
    //   103: astore_3
    //   104: aload_1
    //   105: invokeinterface 280 1 0
    //   110: aload_3
    //   111: athrow
    //   112: aload_1
    //   113: invokeinterface 280 1 0
    //   118: aload_0
    //   119: ldc_w 1200
    //   122: iconst_2
    //   123: anewarray 22	java/lang/String
    //   126: dup
    //   127: iconst_0
    //   128: ldc_w 1035
    //   131: aastore
    //   132: dup
    //   133: iconst_1
    //   134: ldc_w 1151
    //   137: aastore
    //   138: ldc_w 1153
    //   141: aconst_null
    //   142: aconst_null
    //   143: aconst_null
    //   144: aconst_null
    //   145: invokevirtual 267	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   148: astore 4
    //   150: aload 4
    //   152: invokeinterface 492 1 0
    //   157: ifeq +71 -> 228
    //   160: aload_2
    //   161: ldc_w 1151
    //   164: aload 4
    //   166: iconst_1
    //   167: invokeinterface 496 2 0
    //   172: invokestatic 1156	iqw:b	(Ljava/lang/String;)Ljava/lang/String;
    //   175: invokevirtual 297	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: iconst_1
    //   179: anewarray 22	java/lang/String
    //   182: astore 6
    //   184: aload 6
    //   186: iconst_0
    //   187: aload 4
    //   189: iconst_0
    //   190: invokeinterface 703 2 0
    //   195: invokestatic 1106	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   198: aastore
    //   199: aload_0
    //   200: ldc_w 1200
    //   203: aload_2
    //   204: ldc_w 1044
    //   207: aload 6
    //   209: invokevirtual 600	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   212: pop
    //   213: goto -63 -> 150
    //   216: astore 5
    //   218: aload 4
    //   220: invokeinterface 280 1 0
    //   225: aload 5
    //   227: athrow
    //   228: aload 4
    //   230: invokeinterface 280 1 0
    //   235: aload_0
    //   236: ldc 167
    //   238: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   241: aload_0
    //   242: ldc 155
    //   244: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   247: aload_0
    //   248: ldc 157
    //   250: invokevirtual 137	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   253: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	paramSQLiteDatabase	SQLiteDatabase
    //   30	83	1	localCursor1	Cursor
    //   39	165	2	localContentValues	ContentValues
    //   103	8	3	localObject1	Object
    //   148	81	4	localCursor2	Cursor
    //   216	10	5	localObject2	Object
    //   182	26	6	arrayOfString1	String[]
    //   70	25	8	arrayOfString2	String[]
    // Exception table:
    //   from	to	target	type
    //   40	100	103	finally
    //   150	213	216	finally
  }
  
  private static void r(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
    paramSQLiteDatabase.execSQL("DELETE FROM events");
    paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
    paramSQLiteDatabase.execSQL("DELETE FROM event_people");
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void s(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("UPDATE all_tiles SET media_attr = media_attr & ~65536");
  }
  
  private static void t(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN unviewed_notifications_count INT");
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN has_unread_notifications INT");
  }
  
  private static void u(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN last_viewed_notification_version INT");
  }
  
  private static void v(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM activities");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
    paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
  }
  
  private static void w(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS guns;");
    paramSQLiteDatabase.execSQL("CREATE TABLE guns ( _id INTEGER, key TEXT UNIQUE NOT NULL, creation_time INT NOT NULL, collapsed_description TEXT, collapsed_destination TEXT, collapsed_heading TEXT, collapsed_icon TEXT, entity_reference TEXT, entity_reference_type TEXT, expanded_description TEXT, expanded_destination TEXT, expanded_heading TEXT, expanded_icon TEXT, priority TEXT, read_state INT NOT NULL DEFAULT(0), type INT NOT NULL DEFAULT(0), category INT NOT NULL DEFAULT(0), seen INT NOT NULL DEFAULT(0), actors BLOB, activity_id TEXT, event_id TEXT, album_id TEXT, community_id TEXT, display_index INT NOT NULL DEFAULT(0), updated_version INT NOT NULL DEFAULT(0), push_enabled INT NOT NULL DEFAULT(0) );");
  }
  
  private static void x(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM all_tiles WHERE view_id = 'best'");
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests WHERE view_id = 'best'");
  }
  
  private static void y(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM tile_requests WHERE view_id NOT IN ( SELECT DISTINCT view_id FROM all_tiles WHERE media_attr & 512 == 0 )");
  }
  
  private final void z(SQLiteDatabase paramSQLiteDatabase)
  {
    String str = String.valueOf(this.b.getString(aau.tY));
    paramSQLiteDatabase.execSQL(64 + String.valueOf(str).length() + "UPDATE circles SET circle_name = '" + str + "' WHERE type = 'v.all.circles'");
  }
  
  public final void a()
  {
    super.a();
    a = System.currentTimeMillis();
  }
  
  protected final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    super.a(paramSQLiteDatabase);
    String[] arrayOfString = EsProvider.c();
    for (int i = 0; i < 2; i++) {
      paramSQLiteDatabase.execSQL(arrayOfString[i]);
    }
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    super.b(paramSQLiteDatabase);
    if (this.c.c(paramInt))
    {
      String str1 = this.c.a(paramInt).b("gaia_id");
      String str2 = String.valueOf("UPDATE account_status SET user_id='");
      String str3 = String.valueOf("user_id");
      paramSQLiteDatabase.execSQL(16 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + str2 + str1 + "' WHERE " + str3 + " IS NULL");
    }
  }
  
  protected final void b(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, this.e);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    super.onCreate(paramSQLiteDatabase);
    String[] arrayOfString1 = EsProvider.a();
    for (int j = 0; j < 24; j++) {
      paramSQLiteDatabase.execSQL(arrayOfString1[j]);
    }
    String[] arrayOfString2 = EsProvider.b();
    for (int k = 0; k < 8; k++) {
      paramSQLiteDatabase.execSQL(arrayOfString2[k]);
    }
    String[] arrayOfString3 = EsProvider.c();
    while (i < 2)
    {
      paramSQLiteDatabase.execSQL(arrayOfString3[i]);
      i++;
    }
    EsProvider.a(this.b, paramSQLiteDatabase);
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    super.onOpen(paramSQLiteDatabase);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (Log.isLoggable("EsDatabaseHelper", 4)) {
      new StringBuilder(45).append("Upgrade database: ").append(paramInt1).append(" --> ").append(paramInt2);
    }
    if (paramInt2 < paramInt1) {}
    int i;
    for (;;)
    {
      try
      {
        a(paramSQLiteDatabase, this.e);
        if (this.c.c(this.e))
        {
          Account localAccount5 = new Account(this.c.a(this.e).b("account_name"), "com.google");
          ContentResolver.requestSync(localAccount5, EsProvider.a(this.b), new Bundle());
          ContentResolver.requestSync(localAccount5, hbu.f(this.b), new Bundle());
          ContentResolver.requestSync(localAccount5, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", new Bundle());
        }
        return;
      }
      catch (SQLiteException localSQLiteException2)
      {
        Account localAccount4;
        label309:
        label332:
        label4958:
        label5751:
        localObject1 = localSQLiteException2;
        label5166:
        label5186:
        i = paramInt1;
        label6030:
        Log.e("EsDatabaseHelper", 55 + "Failed to upgrade database: " + i + " --> " + paramInt2, (Throwable)localObject1);
        bool = this.c.c(this.e);
        str = null;
        if (!bool) {
          continue;
        }
        str = this.c.a(this.e).b("account_name");
        new kpx(str, "__master_partition__", paramInt1, paramInt2, i).b(this.b);
        this.d.a((Throwable)localObject1, "Database Upgrade Failures");
        if (!dun.b()) {
          continue;
        }
        hsb.a(55 + "Failed to upgrade database: " + i + " --> " + paramInt2, (Exception)localObject1);
        b(paramSQLiteDatabase);
        return;
      }
      finally
      {
        if (!this.c.c(this.e)) {
          continue;
        }
        localAccount1 = efj.c(this.c.a(this.e).b("account_name"));
        ContentResolver.requestSync(localAccount1, EsProvider.a(this.b), new Bundle());
        ContentResolver.requestSync(localAccount1, hbu.f(this.b), new Bundle());
        ContentResolver.requestSync(localAccount1, GooglePhotoDownsyncProvider.a(), new Bundle());
      }
      if (paramInt1 < 1221)
      {
        a(paramSQLiteDatabase, this.e);
        if (this.c.c(this.e))
        {
          localAccount4 = new Account(this.c.a(this.e).b("account_name"), "com.google");
          ContentResolver.requestSync(localAccount4, EsProvider.a(this.b), new Bundle());
          ContentResolver.requestSync(localAccount4, hbu.f(this.b), new Bundle());
          ContentResolver.requestSync(localAccount4, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", new Bundle());
        }
      }
      else
      {
        if (paramInt1 != 1221) {
          break label6938;
        }
        paramSQLiteDatabase.execSQL("CREATE TABLE people_suggestion_events (action_type TEXT, person_id BLOB, suggestion_id BLOB, suggestion_ui TEXT, timestamp INT)");
        paramSQLiteDatabase.execSQL("DELETE FROM notifications");
        paramSQLiteDatabase.execSQL("ALTER TABLE notifications ADD COLUMN pd_album_name TEXT");
        i = 1300;
        if (i >= 1301) {
          break label6944;
        }
      }
      try
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE square_member_status (square_id TEXT NOT NULL, membership_status INT NOT NULL, member_count INT NOT NULL DEFAULT(0), token TEXT, UNIQUE (square_id, membership_status), FOREIGN KEY (square_id) REFERENCES squares(square_id) ON DELETE CASCADE)");
        i = 1301;
      }
      catch (SQLiteException localSQLiteException1)
      {
        localObject1 = localSQLiteException1;
        continue;
      }
      if (i < 1303)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE photos_in_album RENAME TO tmp_table");
        paramSQLiteDatabase.execSQL("CREATE TABLE photos_in_album (_id INTEGER PRIMARY KEY, photo_id INT NOT NULL, collection_id TEXT NOT NULL, FOREIGN KEY (photo_id)REFERENCES photo (photo_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("INSERT INTO photos_in_album(_id, photo_id, collection_id) SELECT _id, photo_id, album_id FROM tmp_table;");
        paramSQLiteDatabase.execSQL("DROP TABLE tmp_table;");
        paramSQLiteDatabase.execSQL("ALTER TABLE photos_in_event RENAME TO tmp_table");
        paramSQLiteDatabase.execSQL("CREATE TABLE photos_in_event (_id INTEGER PRIMARY KEY, photo_id INT NOT NULL, collection_id TEXT NOT NULL, UNIQUE (photo_id, collection_id) FOREIGN KEY (photo_id) REFERENCES photo(photo_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("INSERT INTO photos_in_event(_id, photo_id, collection_id) SELECT _id, photo_id, event_id FROM tmp_table;");
        paramSQLiteDatabase.execSQL("DROP TABLE tmp_table;");
        paramSQLiteDatabase.execSQL("ALTER TABLE photos_in_stream RENAME TO tmp_table");
        paramSQLiteDatabase.execSQL("CREATE TABLE photos_in_stream (_id INTEGER PRIMARY KEY, photo_id INT NOT NULL, collection_id TEXT NOT NULL, FOREIGN KEY (photo_id) REFERENCES photo(photo_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("INSERT INTO photos_in_stream(_id, photo_id, collection_id) SELECT _id, photo_id, stream_id FROM tmp_table;");
        paramSQLiteDatabase.execSQL("DROP TABLE tmp_table;");
        paramSQLiteDatabase.execSQL("ALTER TABLE photos_of_user RENAME TO tmp_table");
        paramSQLiteDatabase.execSQL("CREATE TABLE photos_of_user (_id INTEGER PRIMARY KEY, photo_id INT NOT NULL, collection_id TEXT NOT NULL, FOREIGN KEY (photo_id) REFERENCES photo(photo_id) ON DELETE CASCADE);");
        paramSQLiteDatabase.execSQL("INSERT INTO photos_of_user(photo_id, collection_id) SELECT photo_id, photo_of_user_id FROM tmp_table;");
        paramSQLiteDatabase.execSQL("DROP TABLE tmp_table;");
        paramSQLiteDatabase.execSQL("CREATE INDEX photos_in_stream_stream_id ON photos_in_stream(collection_id)");
        paramSQLiteDatabase.execSQL("CREATE INDEX photos_in_album_album_id ON photos_in_album(collection_id)");
        paramSQLiteDatabase.execSQL("CREATE INDEX photos_in_event_event_id ON photos_in_event(collection_id)");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS photos_of_user_photo_id");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS photo_comment_photo_id");
        paramSQLiteDatabase.execSQL("CREATE INDEX photo_comment_photo_id ON photo_comment(photo_id)");
        paramSQLiteDatabase.execSQL("CREATE INDEX photo_comment_comment_id ON photo_comment(comment_id)");
        paramSQLiteDatabase.execSQL("CREATE INDEX photos_of_user_user_id ON photos_of_user(collection_id)");
        i = 1303;
      }
      if (i < 1304)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN plus_one_data BLOB");
        i = 1304;
      }
      if (i < 1305)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photos_in_album");
        paramSQLiteDatabase.execSQL("CREATE TABLE photos_in_album (_id INTEGER PRIMARY KEY, photo_id INT NOT NULL, collection_id TEXT NOT NULL, sort_index INT NOT NULL, FOREIGN KEY (photo_id) REFERENCES photo(photo_id) ON DELETE CASCADE);");
        i = 1305;
      }
      if (i < 1306)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN square_update BLOB");
        i = 1306;
      }
      if (i < 1307)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS media");
        i = 1307;
      }
      if (i < 1308)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE contacts ADD COLUMN interaction_sort_key TEXT");
        paramSQLiteDatabase.execSQL("UPDATE account_status SET people_sync_time=-1, people_last_update_token=null");
        paramSQLiteDatabase.execSQL("UPDATE contacts SET last_updated_time=-1");
        i = 1308;
      }
      if (i < 1309)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS album");
        paramSQLiteDatabase.execSQL("CREATE TABLE album ( _id INTEGER PRIMARY KEY AUTOINCREMENT, album_id TEXT UNIQUE NOT NULL, title TEXT, photo_count INT, sort_order INT NOT NULL DEFAULT( 100 ), owner_id TEXT, timestamp INT, entity_version INT, album_type TEXT NOT NULL DEFAULT('ALL_OTHERS'), cover_photo_id INT, stream_id TEXT, is_activity BOOLEAN DEFAULT '0', audience INT NOT NULL DEFAULT( -1 ));");
        i = 1309;
      }
      if (i < 1310)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE event_activities ADD COLUMN photo_id INT");
        i = 1310;
      }
      if (i < 1311)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS album");
        paramSQLiteDatabase.execSQL("CREATE TABLE album ( _id INTEGER PRIMARY KEY AUTOINCREMENT, album_id TEXT UNIQUE NOT NULL, title TEXT, photo_count INT, sort_order INT NOT NULL DEFAULT( 100 ), owner_id TEXT, timestamp INT, entity_version INT, album_type TEXT NOT NULL DEFAULT('ALL_OTHERS'), cover_photo_id INT, stream_id TEXT, is_activity BOOLEAN DEFAULT '0', audience INT NOT NULL DEFAULT( -1 ));");
        i = 1311;
      }
      if (i < 1312)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN instant_share_end_time INT");
        i = 1312;
      }
      if (i < 1313)
      {
        paramSQLiteDatabase.execSQL("CREATE INDEX photo_timestamp ON photo(timestamp)");
        i = 1313;
      }
      if (i < 1314)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1314;
      }
      if (i < 1315)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1315;
      }
      if (i < 1316)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN comment BLOB");
        i = 1316;
      }
      if (i < 1317)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1317;
      }
      if (i < 1318)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN square_reshare_update BLOB");
        i = 1318;
      }
      if (i < 1319)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN promo BLOB");
        i = 1319;
      }
      if (i < 1320)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE all_tiles ( _id INTEGER PRIMARY KEY AUTOINCREMENT, view_id TEXT NOT NULL, collection_id TEXT, tile_id TEXT NOT NULL, type TEXT NOT NULL, title TEXT, subtitle TEXT, image_url TEXT, image_width INTEGER, image_height INTEGER, color INTEGER, comment_count INTEGER, plusone_count INTEGER, parent_key INTEGER, parent_title TEXT, data BLOB, view_order INTEGER NOT NULL, hidden BOOLEAN NOT NULL DEFAULT '0', mine BOOLEAN NOT NULL DEFAULT '0' );");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, collection_id, tile_id, title, subtitle, image_url, image_width, image_height, comment_count, plusone_count );");
        paramSQLiteDatabase.execSQL("CREATE TABLE scroll_sections ( _id INTEGER PRIMARY KEY AUTOINCREMENT, view_id TEXT NOT NULL, row INTEGER NOT NULL, tile_id TEXT NOT NULL, title TEXT, view_order INTEGER NOT NULL, landscape BOOLEAN NOT NULL DEFAULT '0' );");
        paramSQLiteDatabase.execSQL("CREATE INDEX scroll_idx ON scroll_sections ( view_id, landscape , view_order, row, tile_id, title );");
        paramSQLiteDatabase.execSQL("CREATE TABLE tile_requests ( view_id TEXT NOT NULL, resume_token TEXT, last_refresh_time INTEGER NOT NULL DEFAULT '0', last_refresh_token TEXT );");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_request_idx ON tile_requests ( view_id );");
        i = 1320;
      }
      if (i < 1321)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE circles ADD COLUMN notifications_enabled INT NOT NULL DEFAULT(0)");
        paramSQLiteDatabase.execSQL("ALTER TABLE squares ADD COLUMN volume INT");
        paramSQLiteDatabase.execSQL("UPDATE squares SET volume=2");
        paramSQLiteDatabase.execSQL("UPDATE account_status SET circle_sync_time=-1");
        i = 1321;
      }
      if (i < 1322)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1322;
      }
      if (i < 1323)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN original_author_avatar_url TEXT");
        i = 1323;
      }
      if (i < 1323)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN original_author_avatar_url TEXT");
        i = 1323;
      }
      if (i < 1324)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1324;
      }
      if (i < 1325)
      {
        e(paramSQLiteDatabase);
        i = 1325;
      }
      if (i < 1326)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN permalink TEXT");
        i = 1326;
      }
      if (i < 1327)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1327;
      }
      if (i < 1328)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1328;
      }
      if (i < 1329)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1329;
      }
      if (i < 1330)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1330;
      }
      if (i < 1331)
      {
        f(paramSQLiteDatabase);
        i = 1331;
      }
      if (i < 1332)
      {
        f(paramSQLiteDatabase);
        i = 1332;
      }
      if (i < 1333)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN is_plusoneable INT NOT NULL DEFAULT(1)");
        i = 1333;
      }
      if (i < 1334)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1334;
      }
      if (i < 1335)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM photo");
        paramSQLiteDatabase.execSQL("ALTER TABLE photo ADD COLUMN orientation INT NOT NULL DEFAULT(0)");
        i = 1335;
      }
      if (i < 1336)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS all_tiles");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("CREATE TABLE all_tiles ( _id INTEGER PRIMARY KEY AUTOINCREMENT, view_id TEXT NOT NULL, collection_id TEXT, tile_id TEXT NOT NULL, type TEXT NOT NULL, title TEXT, subtitle TEXT, image_url TEXT, image_width INTEGER, image_height INTEGER, color INTEGER, collection_count INTEGER, comment_count INTEGER, plusone_count INTEGER, parent_key INTEGER, parent_title TEXT, data BLOB, view_order INTEGER NOT NULL, hidden BOOLEAN NOT NULL DEFAULT '0', mine BOOLEAN NOT NULL DEFAULT '0' );");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, collection_id, tile_id, title, subtitle, image_url, image_width, image_height, collection_count, comment_count, plusone_count );");
        i = 1336;
      }
      if (i < 1337)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM photo");
        paramSQLiteDatabase.execSQL("ALTER TABLE photo ADD COLUMN rotation INT NOT NULL DEFAULT(0)");
        i = 1337;
      }
      if (i < 1338)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM photo_comment");
        paramSQLiteDatabase.execSQL("DELETE FROM photo_plusone");
        paramSQLiteDatabase.execSQL("DELETE FROM photos_in_album");
        paramSQLiteDatabase.execSQL("DELETE FROM photos_in_event");
        paramSQLiteDatabase.execSQL("DELETE FROM photos_of_user");
        paramSQLiteDatabase.execSQL("DELETE FROM photos_in_stream");
        paramSQLiteDatabase.execSQL("DELETE FROM photo_shape");
        paramSQLiteDatabase.execSQL("DELETE FROM photo");
        i = 1338;
      }
      if (i < 1339)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN acl INTEGER");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, collection_id, tile_id, title, subtitle, image_url, image_width, image_height, collection_count, comment_count, plusone_count, acl );");
        i = 1339;
      }
      if (i < 1340)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS all_tiles");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("CREATE TABLE all_tiles ( _id INTEGER PRIMARY KEY AUTOINCREMENT, view_id TEXT NOT NULL, collection_id TEXT, tile_id TEXT NOT NULL, type TEXT NOT NULL, title TEXT, subtitle TEXT, image_url TEXT, image_width INTEGER, image_height INTEGER, color INTEGER, collection_count INTEGER, comment_count INTEGER, plusone_count INTEGER, parent_id TEXT, parent_title TEXT, data BLOB, view_order INTEGER NOT NULL, hidden BOOLEAN NOT NULL DEFAULT '0', mine BOOLEAN NOT NULL DEFAULT '0', acl INTEGER );");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, collection_id, tile_id, title, subtitle, image_url, image_width, image_height, collection_count, comment_count, plusone_count, acl );");
        i = 1340;
      }
      if (i < 1341)
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE photo_comments (_id INTEGER PRIMARY KEY AUTOINCREMENT, tile_id TEXT NOT NULL, comment_id TEXT UNIQUE NOT NULL, author_id TEXT NOT NULL, content TEXT NOT NULL, view_order INT NOT NULL, update_time INT NOT NULL, plusone_count INT DEFAULT (0), plusone_by_viewer BOOLEAN DEFAULT '0');");
        paramSQLiteDatabase.execSQL("CREATE INDEX photo_comments_idx ON photo_comments( comment_id )");
        paramSQLiteDatabase.execSQL("ALTER TABLE photo_comment RENAME TO photo_comment_old");
        i = 1341;
      }
      if (i < 1342)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
        i = 1342;
      }
      if (i < 1343)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
        i = 1343;
      }
      if (i < 1344)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE activity_streams ADD COLUMN stream_token TEXT");
        i = 1344;
      }
      if (i < 1345)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        i = 1345;
      }
      if (i < 1346)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN photo_id INTEGER");
        paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN owner_id TEXT");
        i = 1346;
      }
      if (i < 1347)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS all_tiles");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        paramSQLiteDatabase.execSQL("CREATE TABLE all_tiles ( _id INTEGER PRIMARY KEY AUTOINCREMENT, view_id TEXT NOT NULL, cluster_id TEXT, tile_id TEXT NOT NULL, type TEXT NOT NULL, title TEXT, subtitle TEXT, image_url TEXT, image_width INTEGER, image_height INTEGER, color INTEGER, cluster_count INTEGER, comment_count INTEGER, plusone_count INTEGER, parent_id TEXT, parent_title TEXT, data BLOB, view_order INTEGER NOT NULL, hidden BOOLEAN NOT NULL DEFAULT '0', mine BOOLEAN NOT NULL DEFAULT '0', acl INTEGER, photo_id INTEGER, owner_id INTEGER, );");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl );");
        i = 1347;
      }
      if (i < 1348)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM events");
        paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
        paramSQLiteDatabase.execSQL("DELETE FROM event_people");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS photos_in_event_event_id");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photos_in_event");
        i = 1348;
      }
      if (i < 1349)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        i = 1349;
      }
      if (i < 1350)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        i = 1350;
      }
      if (i < 1351)
      {
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN user_actions INTEGER NOT NULL DEFAULT '0'");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions );");
        i = 1351;
      }
      if (i < 1352)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN social_friends_plus_oned BLOB");
        i = 1352;
      }
      if (i < 1353)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM events");
        paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
        paramSQLiteDatabase.execSQL("DELETE FROM event_people");
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN deleted INT DEFAULT (0)");
        i = 1353;
      }
      if (i < 1354)
      {
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions, photo_id );");
        i = 1354;
      }
      if (i < 1355)
      {
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions );");
        i = 1355;
      }
      if (i < 1356)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN embed_google_offer_v2 BLOB");
        i = 1356;
      }
      if (i < 1357)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photo_home");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photo_home_cover");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS album");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS album_cover");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photo");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photo_comment_old");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photo_plusone");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photos_of_user");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photos_in_stream");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS photo_shape");
        i = 1357;
      }
      if (i < 1358)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM profiles");
        paramSQLiteDatabase.execSQL("ALTER TABLE profiles ADD COLUMN people_data_proto BLOB");
        i = 1358;
      }
      if (i < 1359)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles WHERE view_id LIKE 'albums%'");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests WHERE view_id LIKE 'albums%'");
        i = 1359;
      }
      if (i < 1360)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN relateds BLOB");
        i = 1360;
      }
      if (i < 1361)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles WHERE view_id LIKE 'album:%'");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests WHERE view_id LIKE 'album:%'");
        i = 1361;
      }
      if (i < 1362)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN media_attr INTEGER NOT NULL DEFAULT '0'");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions, media_attr );");
        i = 1362;
      }
      if (i < 1363)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1363;
      }
      if (i < 1364)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        i = 1364;
      }
      if (i < 1365)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        i = 1365;
      }
      if (i < 1366)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("ALTER TABLE activities ADD COLUMN is_stranger_post INT NOT NULL DEFAULT(0)");
        i = 1366;
      }
      if (i < 1367)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1367;
      }
      if (i < 1368)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        i = 1368;
      }
      if (i < 1369)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM events");
        paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
        paramSQLiteDatabase.execSQL("DELETE FROM event_people");
        i = 1369;
      }
      if (i < 1370)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        paramSQLiteDatabase.execSQL("DELETE FROM events");
        paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
        paramSQLiteDatabase.execSQL("DELETE FROM event_people");
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        i = 1370;
      }
      if (i < 1371)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("DELETE FROM tile_requests");
        paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN timestamp INTEGER NOT NULL DEFAULT '0'");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, hidden, mine, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions, media_attr, timestamp );");
        i = 1371;
      }
      if (i < 1372)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM events");
        paramSQLiteDatabase.execSQL("DELETE FROM event_activities");
        paramSQLiteDatabase.execSQL("DELETE FROM event_people");
        paramSQLiteDatabase.execSQL("DELETE FROM activities");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_comments");
        paramSQLiteDatabase.execSQL("DELETE FROM activity_streams");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS all_tiles");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS scroll_sections");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS scroll_idx");
        paramSQLiteDatabase.execSQL("CREATE TABLE all_tiles ( _id INTEGER PRIMARY KEY AUTOINCREMENT, view_id TEXT NOT NULL, view_order INTEGER NOT NULL, type TEXT NOT NULL, cluster_id TEXT, tile_id TEXT NOT NULL, title TEXT, subtitle TEXT, image_url TEXT, image_width INTEGER, image_height INTEGER, cluster_count INTEGER, comment_count INTEGER, plusone_count INTEGER, acl INTEGER, user_actions INTEGER NOT NULL DEFAULT '0', media_attr INTEGER NOT NULL DEFAULT '0', timestamp INTEGER NOT NULL DEFAULT '0', data BLOB, parent_id TEXT, photo_id INTEGER, owner_id TEXT );");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions, media_attr, timestamp );");
        i = 1372;
      }
      if (i < 1373)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM photo_comments");
        paramSQLiteDatabase.execSQL("ALTER TABLE photo_comments ADD COLUMN plusone_timestamp INT DEFAULT(0)");
        i = 1373;
      }
      if (i < 1374)
      {
        g(paramSQLiteDatabase);
        i = 1374;
      }
      if (i < 1375)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM profiles");
        i = 1375;
      }
      if (i < 1376)
      {
        h(paramSQLiteDatabase);
        i = 1376;
      }
      if (i < 1377)
      {
        i(paramSQLiteDatabase);
        i = 1377;
      }
      if (i < 1378)
      {
        j(paramSQLiteDatabase);
        i = 1378;
      }
      if (i < 1379)
      {
        k(paramSQLiteDatabase);
        i = 1379;
      }
      if (i < 1380)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM all_tiles");
        paramSQLiteDatabase.execSQL("ALTER TABLE all_tiles ADD COLUMN last_refresh_time INTEGER NOT NULL DEFAULT '0'");
        paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS tile_idx");
        paramSQLiteDatabase.execSQL("CREATE INDEX tile_idx ON all_tiles ( view_id, view_order, type, cluster_id, tile_id, title, subtitle, image_url, image_width, image_height, cluster_count, comment_count, plusone_count, acl, user_actions, media_attr, timestamp, last_refresh_time );");
        i = 1380;
      }
      if (i < 1381)
      {
        l(paramSQLiteDatabase);
        i = 1381;
      }
      if (i < 1382)
      {
        m(paramSQLiteDatabase);
        i = 1382;
      }
      if (i < 1383)
      {
        n(paramSQLiteDatabase);
        i = 1383;
      }
      if (i < 1384)
      {
        o(paramSQLiteDatabase);
        i = 1384;
      }
      if (i < 1400)
      {
        p(paramSQLiteDatabase);
        i = 1400;
      }
      if (i < 1403)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN last_notification_sync_version INT");
        i = 1403;
      }
      if (i < 1403)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE account_status ADD COLUMN last_notification_sync_version INT");
        i = 1403;
      }
      if (i < 1404)
      {
        q(paramSQLiteDatabase);
        i = 1404;
      }
      if (i < 1405)
      {
        r(paramSQLiteDatabase);
        i = 1405;
      }
      if (i < 1406)
      {
        s(paramSQLiteDatabase);
        i = 1406;
      }
      if (i < 1408)
      {
        t(paramSQLiteDatabase);
        i = 1408;
      }
      if (i < 1409)
      {
        u(paramSQLiteDatabase);
        i = 1409;
      }
      if (i < 1410)
      {
        v(paramSQLiteDatabase);
        i = 1410;
      }
      if (i < 1411)
      {
        w(paramSQLiteDatabase);
        i = 1411;
      }
      if (i < 1412)
      {
        x(paramSQLiteDatabase);
        i = 1412;
      }
      if (i < 1413)
      {
        y(paramSQLiteDatabase);
        i = 1413;
      }
      if (i < 1414)
      {
        z(paramSQLiteDatabase);
        i = 1414;
      }
      if (i < 1415)
      {
        A(paramSQLiteDatabase);
        i = 1415;
      }
      if (i < 1416)
      {
        B(paramSQLiteDatabase);
        i = 1416;
      }
      if (i < 1417)
      {
        C(paramSQLiteDatabase);
        i = 1417;
      }
      if (i < 1418)
      {
        D(paramSQLiteDatabase);
        i = 1418;
      }
      if (i < 1419)
      {
        E(paramSQLiteDatabase);
        i = 1419;
      }
      if (i < 1420)
      {
        F(paramSQLiteDatabase);
        i = 1420;
      }
      if (i < 1421)
      {
        G(paramSQLiteDatabase);
        i = 1421;
      }
      if (i < 1422)
      {
        H(paramSQLiteDatabase);
        i = 1422;
      }
      if (i < 1500)
      {
        I(paramSQLiteDatabase);
        i = 1500;
      }
      if (i < 1501)
      {
        J(paramSQLiteDatabase);
        i = 1501;
      }
      if (i < 1502)
      {
        K(paramSQLiteDatabase);
        i = 1502;
      }
      if (i < 1503)
      {
        L(paramSQLiteDatabase);
        i = 1503;
      }
      if (i < 1504)
      {
        M(paramSQLiteDatabase);
        i = 1504;
      }
      if (i < 1505)
      {
        N(paramSQLiteDatabase);
        i = 1505;
      }
      if (i < 1506)
      {
        O(paramSQLiteDatabase);
        i = 1506;
      }
      if (i < 1507)
      {
        P(paramSQLiteDatabase);
        i = 1507;
      }
      if (i < 1508)
      {
        Q(paramSQLiteDatabase);
        i = 1508;
      }
      if (i < 1509)
      {
        R(paramSQLiteDatabase);
        i = 1509;
      }
      if (i < 1510)
      {
        S(paramSQLiteDatabase);
        i = 1510;
      }
      if (i < 1511)
      {
        T(paramSQLiteDatabase);
        i = 1511;
      }
      if (i < 1512)
      {
        U(paramSQLiteDatabase);
        i = 1512;
      }
      if (i < 1513)
      {
        V(paramSQLiteDatabase);
        i = 1513;
      }
      if (i < 1514)
      {
        W(paramSQLiteDatabase);
        i = 1514;
      }
      if (i < 1515)
      {
        X(paramSQLiteDatabase);
        i = 1515;
      }
      if (i < 1516)
      {
        Y(paramSQLiteDatabase);
        i = 1516;
      }
      if (i < 1517)
      {
        Z(paramSQLiteDatabase);
        i = 1517;
      }
      if (i < 1518)
      {
        aa(paramSQLiteDatabase);
        i = 1518;
      }
      if (i < 1519)
      {
        ab(paramSQLiteDatabase);
        i = 1519;
      }
      if (i < 1520)
      {
        ac(paramSQLiteDatabase);
        i = 1520;
      }
      if (i < 1521)
      {
        ad(paramSQLiteDatabase);
        i = 1521;
      }
      if (i < 1522)
      {
        ae(paramSQLiteDatabase);
        i = 1522;
      }
      if (i < 1523)
      {
        af(paramSQLiteDatabase);
        i = 1523;
      }
      if (i < 1524)
      {
        ag(paramSQLiteDatabase);
        i = 1524;
      }
      if (i < 1525)
      {
        ah(paramSQLiteDatabase);
        i = 1525;
      }
      if (i < 1526)
      {
        ai(paramSQLiteDatabase);
        i = 1526;
      }
      if (i < 1527)
      {
        aj(paramSQLiteDatabase);
        i = 1527;
      }
      if (i < 1528)
      {
        ak(paramSQLiteDatabase);
        i = 1528;
      }
      if (i < 1529)
      {
        al(paramSQLiteDatabase);
        i = 1529;
      }
      if (i < 1530)
      {
        am(paramSQLiteDatabase);
        i = 1530;
      }
      if (i < 1531)
      {
        an(paramSQLiteDatabase);
        i = 1531;
      }
      if (i < 1532)
      {
        ao(paramSQLiteDatabase);
        i = 1532;
      }
      if (i < 1533)
      {
        ap(paramSQLiteDatabase);
        i = 1533;
      }
      if (i < 1534)
      {
        aq(paramSQLiteDatabase);
        i = 1534;
      }
      if (i < 1535)
      {
        ar(paramSQLiteDatabase);
        i = 1535;
      }
      if (i < 1536)
      {
        as(paramSQLiteDatabase);
        i = 1536;
      }
      if (i < 1537)
      {
        at(paramSQLiteDatabase);
        i = 1537;
      }
      if (i < 1538)
      {
        au(paramSQLiteDatabase);
        i = 1538;
      }
      if (i < 1539)
      {
        av(paramSQLiteDatabase);
        i = 1539;
      }
      if (i < 1540)
      {
        aw(paramSQLiteDatabase);
        i = 1540;
      }
      if (i < 1541)
      {
        ax(paramSQLiteDatabase);
        i = 1541;
      }
      if (i < 1542)
      {
        ay(paramSQLiteDatabase);
        i = 1542;
      }
      if (i < 1543)
      {
        az(paramSQLiteDatabase);
        i = 1543;
      }
      if (i < 1544)
      {
        aA(paramSQLiteDatabase);
        i = 1544;
      }
      if (i < 1545)
      {
        aB(paramSQLiteDatabase);
        i = 1545;
      }
      if (i < 1546)
      {
        aC(paramSQLiteDatabase);
        i = 1546;
      }
      if (i < 1547)
      {
        aD(paramSQLiteDatabase);
        i = 1547;
      }
      if (i < 1548)
      {
        aE(paramSQLiteDatabase);
        i = 1548;
      }
      if (i < 1549)
      {
        aF(paramSQLiteDatabase);
        i = 1549;
      }
      if (i < 1550)
      {
        aG(paramSQLiteDatabase);
        i = 1550;
      }
      if (i < 1551)
      {
        aH(paramSQLiteDatabase);
        i = 1551;
      }
      if (i < 1552)
      {
        aI(paramSQLiteDatabase);
        i = 1552;
      }
      if (i < 1553)
      {
        aJ(paramSQLiteDatabase);
        i = 1553;
      }
      if (i < 1554)
      {
        aK(paramSQLiteDatabase);
        i = 1554;
      }
      if (i < 1555)
      {
        aL(paramSQLiteDatabase);
        i = 1555;
      }
      if (i < 1556)
      {
        aM(paramSQLiteDatabase);
        i = 1556;
      }
      if (i < 1557)
      {
        aN(paramSQLiteDatabase);
        i = 1557;
      }
      if (i < 1558)
      {
        aO(paramSQLiteDatabase);
        i = 1558;
      }
      if (i < 1559)
      {
        aP(paramSQLiteDatabase);
        i = 1559;
      }
      if (i < 1560)
      {
        aQ(paramSQLiteDatabase);
        i = 1560;
      }
      if (i < 1561)
      {
        aR(paramSQLiteDatabase);
        i = 1561;
      }
      if (i < 1562)
      {
        aS(paramSQLiteDatabase);
        i = 1562;
      }
      if (i < 1563)
      {
        aT(paramSQLiteDatabase);
        i = 1563;
      }
      if (i < 1564)
      {
        aU(paramSQLiteDatabase);
        i = 1564;
      }
      if (i < 1565)
      {
        aV(paramSQLiteDatabase);
        i = 1565;
      }
      if (i < 1566)
      {
        aW(paramSQLiteDatabase);
        i = 1566;
      }
      if (i < 1567)
      {
        aX(paramSQLiteDatabase);
        i = 1567;
      }
      if (i < 1600)
      {
        aY(paramSQLiteDatabase);
        i = 1600;
      }
      if (i < 1601)
      {
        aZ(paramSQLiteDatabase);
        i = 1601;
      }
      if (i < 1602)
      {
        ba(paramSQLiteDatabase);
        i = 1602;
      }
      if (i < 1603)
      {
        bb(paramSQLiteDatabase);
        i = 1603;
      }
      if (i < 1604)
      {
        bc(paramSQLiteDatabase);
        i = 1604;
      }
      if (i < 1605)
      {
        bd(paramSQLiteDatabase);
        i = 1605;
      }
      if (i < 1606)
      {
        be(paramSQLiteDatabase);
        i = 1606;
      }
      if (i < 1607)
      {
        bf(paramSQLiteDatabase);
        i = 1607;
      }
      if (i < 1608)
      {
        bg(paramSQLiteDatabase);
        i = 1608;
      }
      if (i < 1609)
      {
        bh(paramSQLiteDatabase);
        i = 1609;
      }
      if (i < 1610)
      {
        bi(paramSQLiteDatabase);
        i = 1610;
      }
      if (i < 1611)
      {
        bj(paramSQLiteDatabase);
        i = 1611;
      }
      if (i < 1612)
      {
        bk(paramSQLiteDatabase);
        i = 1612;
      }
      if (i < 1613)
      {
        bl(paramSQLiteDatabase);
        i = 1613;
      }
      if (i < 1614)
      {
        bm(paramSQLiteDatabase);
        i = 1614;
      }
      if (i < 1615)
      {
        bn(paramSQLiteDatabase);
        i = 1615;
      }
      if (i < 1616)
      {
        bo(paramSQLiteDatabase);
        i = 1616;
      }
      if (i < 1617)
      {
        bp(paramSQLiteDatabase);
        i = 1617;
      }
      if (i >= 1618) {
        break label6960;
      }
      bq(paramSQLiteDatabase);
      i = 1618;
      break label6960;
      if (i < 1620)
      {
        br(paramSQLiteDatabase);
        i = 1620;
      }
      if (i < 1621)
      {
        bs(paramSQLiteDatabase);
        i = 1621;
      }
      if (i < 1622)
      {
        bt(paramSQLiteDatabase);
        i = 1622;
      }
      if (i < 1623)
      {
        bu(paramSQLiteDatabase);
        i = 1623;
      }
      if (i < 1624)
      {
        bv(paramSQLiteDatabase);
        i = 1624;
      }
      if (i < 1625)
      {
        bw(paramSQLiteDatabase);
        i = 1625;
      }
      if (i < 1626)
      {
        bx(paramSQLiteDatabase);
        i = 1626;
      }
      if (i < 1627)
      {
        by(paramSQLiteDatabase);
        i = 1627;
      }
      if (i < 1628)
      {
        bz(paramSQLiteDatabase);
        i = 1628;
      }
      if (i < 1629)
      {
        bA(paramSQLiteDatabase);
        i = 1629;
      }
      if (i < 1630)
      {
        bB(paramSQLiteDatabase);
        i = 1630;
      }
      if (i >= 1631) {
        break label6976;
      }
      bD(paramSQLiteDatabase);
      i = 1631;
      break label6976;
      if (i >= 1633) {
        break label6992;
      }
      bE(paramSQLiteDatabase);
      i = 1633;
      break label6992;
      if (i < 1637)
      {
        bF(paramSQLiteDatabase);
        i = 1637;
      }
      if (i < 1638)
      {
        bG(paramSQLiteDatabase);
        i = 1638;
      }
      if (i < 1639)
      {
        bH(paramSQLiteDatabase);
        i = 1639;
      }
      if (i < 1640)
      {
        bI(paramSQLiteDatabase);
        i = 1640;
      }
      if (i < 1641)
      {
        bJ(paramSQLiteDatabase);
        i = 1641;
      }
      if (i < 1642)
      {
        bK(paramSQLiteDatabase);
        i = 1642;
      }
      if (i < 1643)
      {
        bL(paramSQLiteDatabase);
        i = 1643;
      }
      if (i < 1644)
      {
        bM(paramSQLiteDatabase);
        i = 1644;
      }
      if (i < 1645)
      {
        bN(paramSQLiteDatabase);
        i = 1645;
      }
      if (i < 1646)
      {
        bO(paramSQLiteDatabase);
        i = 1646;
      }
      if (i < 1647)
      {
        bP(paramSQLiteDatabase);
        i = 1647;
      }
      if (i < 1648)
      {
        bQ(paramSQLiteDatabase);
        i = 1648;
      }
      if (i < 1649)
      {
        bR(paramSQLiteDatabase);
        i = 1649;
      }
      if (i < 1650)
      {
        bS(paramSQLiteDatabase);
        i = 1650;
      }
      if (i < 1651)
      {
        bT(paramSQLiteDatabase);
        i = 1651;
      }
      if (i < 1652)
      {
        bU(paramSQLiteDatabase);
        i = 1652;
      }
      if (i < 1653)
      {
        bV(paramSQLiteDatabase);
        i = 1653;
      }
      if (i < 1654)
      {
        bW(paramSQLiteDatabase);
        i = 1654;
      }
      if (i < 1655)
      {
        bX(paramSQLiteDatabase);
        i = 1655;
      }
      if (i < 1656)
      {
        bY(paramSQLiteDatabase);
        i = 1656;
      }
      if (i < 1657)
      {
        bZ(paramSQLiteDatabase);
        i = 1657;
      }
      if (i < 1658)
      {
        ca(paramSQLiteDatabase);
        i = 1658;
      }
      if (i < 1659)
      {
        cb(paramSQLiteDatabase);
        i = 1659;
      }
      if (i < 1661)
      {
        cc(paramSQLiteDatabase);
        i = 1661;
      }
      if (i < 1662)
      {
        cd(paramSQLiteDatabase);
        i = 1662;
      }
      if (i < 1663)
      {
        ce(paramSQLiteDatabase);
        i = 1663;
      }
      if (i < 1664)
      {
        cf(paramSQLiteDatabase);
        i = 1664;
      }
      if (i < 1665)
      {
        cg(paramSQLiteDatabase);
        i = 1665;
      }
      if (i < 1666)
      {
        ch(paramSQLiteDatabase);
        i = 1666;
      }
      if (i < 1667)
      {
        ci(paramSQLiteDatabase);
        i = 1667;
      }
      if (i < 1668)
      {
        cj(paramSQLiteDatabase);
        i = 1668;
      }
      if (i < 1669)
      {
        c();
        i = 1669;
      }
      if (i >= 1670) {
        break label7034;
      }
      ck(paramSQLiteDatabase);
      i = 1670;
      break label7034;
      if (i < 1672)
      {
        cl(paramSQLiteDatabase);
        i = 1672;
      }
      if (i < 1673)
      {
        cm(paramSQLiteDatabase);
        i = 1673;
      }
      if (i < 1674)
      {
        cn(paramSQLiteDatabase);
        i = 1674;
      }
      if (i < 1675)
      {
        co(paramSQLiteDatabase);
        i = 1675;
      }
      if (i < 1677)
      {
        cp(paramSQLiteDatabase);
        i = 1677;
      }
      if (i < 1678)
      {
        cq(paramSQLiteDatabase);
        i = 1678;
      }
      if (i < 1679)
      {
        cr(paramSQLiteDatabase);
        i = 1679;
      }
      if (i < 1680)
      {
        cs(paramSQLiteDatabase);
        i = 1680;
      }
      if (i < 1681)
      {
        ct(paramSQLiteDatabase);
        i = 1681;
      }
      if (i < 1682)
      {
        cu(paramSQLiteDatabase);
        i = 1682;
      }
      if (i < 1683)
      {
        cv(paramSQLiteDatabase);
        i = 1683;
      }
      if (i < 1684)
      {
        cw(paramSQLiteDatabase);
        i = 1684;
      }
      if (i < 1685)
      {
        cx(paramSQLiteDatabase);
        i = 1685;
      }
      if (i < 1686)
      {
        cy(paramSQLiteDatabase);
        i = 1686;
      }
      if (i < 1687)
      {
        cz(paramSQLiteDatabase);
        i = 1687;
      }
      if (i >= 1688) {
        break label7050;
      }
      cA(paramSQLiteDatabase);
      i = 1688;
      break label7050;
      if (i < 1690)
      {
        cB(paramSQLiteDatabase);
        i = 1690;
      }
      if (i < 1691)
      {
        cC(paramSQLiteDatabase);
        i = 1691;
      }
      if (i < 1692)
      {
        cD(paramSQLiteDatabase);
        i = 1692;
      }
      if (i >= 1693) {
        break label7066;
      }
      cE(paramSQLiteDatabase);
      i = 1693;
      break label7066;
    }
    for (;;)
    {
      if (i < 1695)
      {
        cF(paramSQLiteDatabase);
        i = 1695;
      }
      if (i < 1696)
      {
        cG(paramSQLiteDatabase);
        i = 1696;
      }
      if (i < 1697)
      {
        cH(paramSQLiteDatabase);
        i = 1697;
      }
      if (i < 1699)
      {
        cI(paramSQLiteDatabase);
        i = 1699;
      }
      if (i < 1700)
      {
        cJ(paramSQLiteDatabase);
        i = 1700;
      }
      if (i < 1701)
      {
        cK(paramSQLiteDatabase);
        i = 1701;
      }
      if (i < 1702)
      {
        cL(paramSQLiteDatabase);
        i = 1702;
      }
      if (i < 1703)
      {
        cM(paramSQLiteDatabase);
        i = 1703;
      }
      if (i < 1704)
      {
        cN(paramSQLiteDatabase);
        i = 1704;
      }
      if (i < 1705)
      {
        cO(paramSQLiteDatabase);
        i = 1705;
      }
      if (i < 1706)
      {
        cP(paramSQLiteDatabase);
        i = 1706;
      }
      if (i < 1707)
      {
        cQ(paramSQLiteDatabase);
        i = 1707;
      }
      if (i < 1709)
      {
        cR(paramSQLiteDatabase);
        i = 1709;
      }
      if (i < 1710)
      {
        cS(paramSQLiteDatabase);
        i = 1710;
      }
      if (i < 1711)
      {
        cT(paramSQLiteDatabase);
        i = 1711;
      }
      if (i < 1712)
      {
        cU(paramSQLiteDatabase);
        i = 1712;
      }
      if (i < 1713)
      {
        cV(paramSQLiteDatabase);
        i = 1713;
      }
      if (i < 1714)
      {
        cW(paramSQLiteDatabase);
        i = 1714;
      }
      if (i < 1715)
      {
        cX(paramSQLiteDatabase);
        i = 1715;
      }
      if (i < 1716)
      {
        cY(paramSQLiteDatabase);
        i = 1716;
      }
      d(paramSQLiteDatabase);
      c(paramSQLiteDatabase);
      if (!this.c.c(this.e)) {
        break;
      }
      Account localAccount3 = efj.c(this.c.a(this.e).b("account_name"));
      ContentResolver.requestSync(localAccount3, EsProvider.a(this.b), new Bundle());
      ContentResolver.requestSync(localAccount3, hbu.f(this.b), new Bundle());
      ContentResolver.requestSync(localAccount3, GooglePhotoDownsyncProvider.a(), new Bundle());
      return;
      Object localObject1;
      boolean bool;
      String str;
      Account localAccount2;
      Account localAccount1;
      label6938:
      i = paramInt1;
      break label309;
      label6944:
      if (i >= 1302) {
        break label332;
      }
      i = 1302;
      break label332;
      label6960:
      if (i >= 1619) {
        break label4958;
      }
      i = 1619;
      break label4958;
      label6976:
      if (i >= 1632) {
        break label5166;
      }
      i = 1632;
      break label5166;
      label6992:
      if (i < 1634) {
        i = 1634;
      }
      if (i < 1635) {
        i = 1635;
      }
      if (i >= 1636) {
        break label5186;
      }
      i = 1636;
      break label5186;
      label7034:
      if (i >= 1671) {
        break label5751;
      }
      i = 1671;
      break label5751;
      label7050:
      if (i >= 1689) {
        break label6030;
      }
      i = 1689;
      break label6030;
      label7066:
      if (i < 1694) {
        i = 1694;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqj
 * JD-Core Version:    0.7.0.1
 */