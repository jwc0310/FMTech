package com.google.android.apps.plus.content;

import aau;
import android.accounts.Account;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bqj;
import djl;
import efj;
import giz;
import gjb;
import gjq;
import hsb;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jim;
import mbb;

public class EsProvider
  extends ContentProvider
{
  private static UriMatcher a = null;
  private static final HashMap<String, String> b;
  private static final HashMap<String, String> c;
  private static final HashMap<String, String> d;
  private static final HashMap<String, String> e;
  private static final HashMap<String, String> f;
  private static final HashMap<String, String> g;
  
  static
  {
    HashMap localHashMap1 = new HashMap();
    b = localHashMap1;
    localHashMap1.put("_id", "_id");
    b.put("collapsed_description", "collapsed_description");
    b.put("collapsed_destination", "collapsed_destination");
    b.put("collapsed_heading", "collapsed_heading");
    b.put("collapsed_annotation", "collapsed_annotation");
    b.put("collapsed_icon", "collapsed_icon");
    b.put("creation_time", "creation_time");
    b.put("entity_reference", "entity_reference");
    b.put("entity_reference_type", "entity_reference_type");
    b.put("key", "key");
    b.put("priority", "priority");
    b.put("read_state", "read_state");
    b.put("type", "type");
    b.put("category", "category");
    b.put("seen", "seen");
    b.put("actors", "actors");
    b.put("activity_id", "activity_id");
    b.put("event_id", "event_id");
    b.put("album_id", "album_id");
    b.put("community_id", "community_id");
    b.put("updated_version", "updated_version");
    b.put("push_enabled", "push_enabled");
    b.put("expanded_info", "expanded_info");
    b.put("PHOTOS", "PHOTOS");
    b.put("pending_read", "pending_read");
    b.put("pending_delete", "pending_delete");
    b.put("display_index", "display_index");
    b.put("creators", "creators");
    b.put("payload", "payload");
    b.put("app_payload", "app_payload");
    b.put("analytics_data", "analytics_data");
    HashMap localHashMap2 = new HashMap();
    c = localHashMap2;
    localHashMap2.put("_id", "_id");
    c.put("name", "name");
    c.put("time", "time");
    c.put("network_duration", "network_duration");
    c.put("process_duration", "process_duration");
    c.put("sent", "sent");
    c.put("recv", "recv");
    c.put("req_count", "req_count");
    c.put("exception", "exception");
    c.put("log_file", "log_file");
    c.put("negotiated_protocol", "negotiated_protocol");
    c.put("server_elapsed_time", "server_elapsed_time");
    HashMap localHashMap3 = new HashMap();
    d = localHashMap3;
    localHashMap3.put("_id", "_id");
    d.put("name", "name");
    d.put("first", "first");
    d.put("last", "last");
    d.put("network_duration", "network_duration");
    d.put("process_duration", "process_duration");
    d.put("sent", "sent");
    d.put("recv", "recv");
    d.put("req_count", "req_count");
    HashMap localHashMap4 = new HashMap();
    e = localHashMap4;
    localHashMap4.put("package_name", "package_name");
    e.put("audience_data", "audience_data");
    HashMap localHashMap5 = new HashMap();
    f = localHashMap5;
    localHashMap5.put("gaia_id", "gaia_id");
    f.put("name", "name");
    HashMap localHashMap6 = new HashMap();
    g = localHashMap6;
    localHashMap6.put("_id", "_id");
    g.put("name", "name");
    g.put("location", "location");
  }
  
  public static Uri.Builder a(Uri.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.appendQueryParameter("account", String.valueOf(paramInt));
  }
  
  public static Uri a(Context paramContext, int paramInt, String paramString)
  {
    String str1 = String.valueOf(b(paramContext));
    String str2 = String.valueOf("location_queries_view");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      Uri.Builder localBuilder = Uri.parse(str3).buildUpon();
      localBuilder.appendPath("query").appendPath(paramString);
      localBuilder.appendQueryParameter("account", String.valueOf(paramInt));
      return localBuilder.build();
    }
  }
  
  public static Uri a(Context paramContext, int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, String paramString3, int paramInt2)
  {
    String str1 = String.valueOf(f(paramContext));
    Uri.Builder localBuilder = Uri.parse(6 + String.valueOf(str1).length() + str1 + "/query").buildUpon();
    if (paramString2 == null) {
      paramString2 = "";
    }
    localBuilder.appendPath(paramString2);
    localBuilder.appendQueryParameter("limit", String.valueOf(paramInt2));
    localBuilder.appendQueryParameter("self_gaia_id", paramString1);
    String str2;
    if (paramBoolean1)
    {
      str2 = "true";
      localBuilder.appendQueryParameter("plus_pages", str2);
      if (!paramBoolean2) {
        break label162;
      }
    }
    label162:
    for (String str3 = "true";; str3 = "false")
    {
      localBuilder.appendQueryParameter("in_circles", str3);
      if (paramString3 != null) {
        localBuilder.appendQueryParameter("activity_id", paramString3);
      }
      localBuilder.appendQueryParameter("account", String.valueOf(paramInt1));
      return localBuilder.build();
      str2 = "false";
      break;
    }
  }
  
  public static Uri a(Context paramContext, File paramFile)
  {
    return Uri.parse(String.valueOf(b(paramContext)).concat("panorama_image")).buildUpon().appendQueryParameter("file", paramFile.getPath()).build();
  }
  
  public static Uri a(Uri paramUri, int paramInt)
  {
    return paramUri.buildUpon().appendQueryParameter("account", String.valueOf(paramInt)).build();
  }
  
  public static String a(Context paramContext)
  {
    return ((djl)mbb.a(paramContext, djl.class)).a();
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    long l = SystemClock.currentThreadTimeMillis();
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.execSQL("ANALYZE");
    localSQLiteDatabase.execSQL("ANALYZE sqlite_master");
    a("analyzeDatabase", l);
  }
  
  public static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, "v.all.circles", paramContext.getString(aau.tY), -1, 0);
    a(paramSQLiteDatabase, "v.whatshot", paramContext.getString(aau.uF), -1, 10);
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    long l = SystemClock.currentThreadTimeMillis();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("circle_id", paramString1);
    localContentValues.put("circle_name", paramString2);
    localContentValues.put("type", Integer.valueOf(-1));
    localContentValues.put("contact_count", Integer.valueOf(0));
    localContentValues.put("semantic_hints", Integer.valueOf(11));
    localContentValues.put("show_order", Integer.valueOf(paramInt2));
    paramSQLiteDatabase.insertWithOnConflict("circles", "circle_id", localContentValues, 4);
    a("insertVirtualCircle", l);
  }
  
  private static void a(SQLiteQueryBuilder paramSQLiteQueryBuilder, String paramString1, boolean paramBoolean1, String paramString2, String paramString3, boolean paramBoolean2, String paramString4)
  {
    long l = SystemClock.currentThreadTimeMillis();
    String[] arrayOfString = paramString1.toLowerCase().split("[\\u0009\\u000A\\u000B\\u000C\\u000D\\u0020\\u0085\\u00A0\\u1680\\u180E\\u2000\\u2001\\u2002\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u200A\\u2028\\u2029\\u202F\\u205F\\u3000]");
    String str1 = "";
    for (int i = 0; i < arrayOfString.length; i++)
    {
      String str21 = String.valueOf("contacts");
      String str22 = String.valueOf("person_id");
      String str23 = String.valueOf("search_key_type");
      String str24 = String.valueOf("search_key");
      String str25 = String.valueOf("email");
      String str26 = String.valueOf("contacts");
      String str27 = String.valueOf("contact_search");
      String str28 = String.valueOf("contacts");
      String str29 = String.valueOf("person_id");
      String str30 = String.valueOf("search_person_id");
      String str31 = String.valueOf("search_key");
      String str32 = String.valueOf(arrayOfString[i]);
      String str33 = String.valueOf(DatabaseUtils.sqlEscapeString(1 + String.valueOf(str32).length() + str32 + "*"));
      String str34 = String.valueOf("in_my_circles");
      String str35 = String.valueOf("search_key_type");
      String str36 = String.valueOf(" INTERSECT ");
      str1 = 156 + String.valueOf(str1).length() + String.valueOf(str21).length() + String.valueOf(str22).length() + String.valueOf(str23).length() + String.valueOf(str24).length() + String.valueOf(str25).length() + String.valueOf(str26).length() + String.valueOf(str27).length() + String.valueOf(str28).length() + String.valueOf(str29).length() + String.valueOf(str30).length() + String.valueOf(str31).length() + String.valueOf(str33).length() + String.valueOf(str34).length() + String.valueOf(str35).length() + String.valueOf(str36).length() + str1 + "SELECT " + str21 + "." + str22 + " AS filtered_person_id, MIN((CASE WHEN " + str23 + "=1" + " THEN " + str24 + " ELSE NULL END)) AS " + str25 + " FROM " + str26 + " JOIN " + str27 + " ON (" + str28 + "." + str29 + "=" + str30 + ") WHERE " + str31 + " GLOB " + str33 + " AND " + str34 + "!=0 GROUP BY filtered_person_id, " + str35 + str36;
    }
    String str2 = str1.substring(0, -11 + str1.length());
    if (!TextUtils.isEmpty(paramString4))
    {
      String str12 = String.valueOf("contacts");
      String str13 = String.valueOf("person_id");
      String str14 = String.valueOf("email");
      String str15 = String.valueOf("contacts");
      String str16 = String.valueOf("gaia_id");
      String str17 = String.valueOf("name");
      String str18 = String.valueOf(DatabaseUtils.sqlEscapeString(1 + String.valueOf(paramString1).length() + paramString1 + "%"));
      String str19 = String.valueOf("name");
      String str20 = String.valueOf(DatabaseUtils.sqlEscapeString(3 + String.valueOf(paramString1).length() + "% " + paramString1 + "%"));
      str2 = 90 + String.valueOf(str2).length() + String.valueOf(str12).length() + String.valueOf(str13).length() + String.valueOf(str14).length() + String.valueOf(str15).length() + String.valueOf(str16).length() + String.valueOf(paramString4).length() + String.valueOf(str17).length() + String.valueOf(str18).length() + String.valueOf(str19).length() + String.valueOf(str20).length() + str2 + " UNION SELECT " + str12 + "." + str13 + " AS filtered_person_id,  NULL AS " + str14 + " FROM " + str15 + " WHERE " + str16 + " IN (" + paramString4 + ") AND (" + str17 + " LIKE " + str18 + " OR " + str19 + " LIKE " + str20 + ")";
    }
    String str3 = 7 + String.valueOf(str2).length() + String.valueOf(paramString2).length() + str2 + " LIMIT " + paramString2;
    String str4 = String.valueOf("contacts JOIN (");
    String str5 = String.valueOf("contacts");
    String str6 = String.valueOf("person_id");
    String str7 = String.valueOf("circle_contact");
    String str8 = String.valueOf("contacts");
    String str9 = String.valueOf("person_id");
    String str10 = String.valueOf("circle_contact");
    String str11 = String.valueOf("link_person_id");
    paramSQLiteQueryBuilder.setTables(53 + String.valueOf(str4).length() + String.valueOf(str3).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length() + String.valueOf(str10).length() + String.valueOf(str11).length() + str4 + str3 + ") ON (" + str5 + "." + str6 + "=filtered_person_id) LEFT OUTER JOIN " + str7 + " ON (" + str8 + "." + str9 + "=" + str10 + "." + str11 + ")");
    paramSQLiteQueryBuilder.appendWhere("(");
    paramSQLiteQueryBuilder.appendWhere("gaia_id");
    paramSQLiteQueryBuilder.appendWhere(" != '");
    paramSQLiteQueryBuilder.appendWhere(paramString3);
    paramSQLiteQueryBuilder.appendWhere("' OR ");
    paramSQLiteQueryBuilder.appendWhere("gaia_id");
    paramSQLiteQueryBuilder.appendWhere(" IS NULL");
    paramSQLiteQueryBuilder.appendWhere(")");
    if (!paramBoolean1)
    {
      paramSQLiteQueryBuilder.appendWhere(" AND ");
      paramSQLiteQueryBuilder.appendWhere("profile_type");
      paramSQLiteQueryBuilder.appendWhere(" != ");
      paramSQLiteQueryBuilder.appendWhere(Integer.toString(2));
    }
    if (TextUtils.isEmpty(paramString1))
    {
      paramSQLiteQueryBuilder.appendWhere(" AND ");
      paramSQLiteQueryBuilder.appendWhere("0");
    }
    if (!paramBoolean2)
    {
      paramSQLiteQueryBuilder.appendWhere(" AND ");
      paramSQLiteQueryBuilder.appendWhere("in_my_circles");
      paramSQLiteQueryBuilder.appendWhere(" = 0");
    }
    a("preparePeopleSearchQuery", l);
  }
  
  private static void a(String paramString, long paramLong)
  {
    if (Log.isLoggable("EsProvider", 4))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = Long.valueOf(SystemClock.currentThreadTimeMillis() - paramLong);
      String.format(">>>>> %s took %d milliseconds to complete.", arrayOfObject);
    }
  }
  
  public static String[] a()
  {
    return new String[] { "CREATE TABLE account_status (user_id TEXT,notification_poll_interval INT DEFAULT(-1),last_stats_sync_time INT DEFAULT(-1),last_contacted_time INT DEFAULT(-1),wipeout_stats INT DEFAULT(0),circle_sync_time INT DEFAULT(-1),circle_fingerprint INT DEFAULT(-1),circle_settings_sync_time INT DEFAULT(-1),people_sync_time INT DEFAULT(-1),people_fingerprint INT DEFAULT(-1),people_last_update_token TEXT,suggested_people_sync_time INT DEFAULT(-1),blocked_people_sync_time INT DEFAULT(-1),event_list_sync_time INT DEFAULT(-1),event_themes_sync_time INT DEFAULT(-1),cover_photo_spec BLOB,audience_data BLOB,audience_history BLOB,contacts_sync_version INT DEFAULT(0),push_notifications INT DEFAULT(0),last_analytics_sync_time INT DEFAULT(-1),last_settings_sync_time INT DEFAULT(-1),last_squares_sync_time INT DEFAULT(-1),last_emotishare_sync_time INT DEFAULT(-1),last_notification_sync_version INT DEFAULT(0), unviewed_notifications_count INT DEFAULT(0), has_unread_notifications INT DEFAULT(0), last_viewed_notification_version INT DEFAULT(0), next_read_notifications_fetch_param BLOB, next_unread_notifications_fetch_param BLOB, last_read_notifications_sync_time INT DEFAULT(-1), next_read_low_notifications_fetch_param BLOB, next_unread_low_notifications_fetch_param BLOB, read_low_notifications_summary BLOB, unread_low_notifications_summary BLOB, people_view_notification_count INT DEFAULT(0), people_view_notification_poll_interval INT DEFAULT(1), people_view_suggestions BLOB, last_lowpri_read_notifications_sync_time INT DEFAULT(-1), last_lowpri_unread_notifications_sync_time INT DEFAULT(-1), has_synced_photo_uploads INT DEFAULT(0), last_notification_heavy_tickle_version INT DEFAULT(0), gcm_push_notifications INT DEFAULT(0));", "INSERT INTO account_status DEFAULT VALUES;", "CREATE TABLE locations (_id INTEGER PRIMARY KEY,qrid INT NOT NULL,name TEXT,location BLOB,FOREIGN KEY (qrid) REFERENCES location_queries(_id) ON DELETE CASCADE);", "CREATE TABLE location_queries (_id INTEGER PRIMARY KEY,key TEXT UNIQUE NOT NULL);", "CREATE TABLE guns (_id INTEGER, key TEXT UNIQUE NOT NULL, creation_time INT NOT NULL, collapsed_description TEXT, collapsed_destination TEXT, collapsed_heading TEXT, collapsed_annotation TEXT, collapsed_icon TEXT, entity_reference TEXT, entity_reference_type TEXT, priority TEXT, read_state INT NOT NULL DEFAULT(0), type INT NOT NULL DEFAULT(0), category INT NOT NULL DEFAULT(0), seen INT NOT NULL DEFAULT(0), actors BLOB, activity_id TEXT, event_id TEXT, album_id TEXT, community_id TEXT, updated_version INT NOT NULL DEFAULT(0), push_enabled INT NOT NULL DEFAULT(0), expanded_info BLOB, PHOTOS BLOB, pending_read INT NOT NULL DEFAULT(0), pending_delete INT NOT NULL DEFAULT(0), display_index INT NOT NULL DEFAULT(0), creators BLOB, payload BLOB, app_payload BLOB, analytics_data BLOB );", "CREATE TABLE contacts (person_id TEXT PRIMARY KEY,gaia_id TEXT,avatar TEXT,name TEXT,sort_key TEXT,interaction_sort_key TEXT,last_updated_time INT,profile_type INT DEFAULT(0),profile_state INT DEFAULT(0),in_my_circles INT DEFAULT(0),blocked INT DEFAULT(0),in_same_visibility_group INT DEFAULT(0),verified INT DEFAULT(0) );", "CREATE TABLE circles (circle_id TEXT PRIMARY KEY,circle_name TEXT,sort_key TEXT,type INT, contact_count INT,semantic_hints INT NOT NULL DEFAULT(0),for_sharing INT NOT NULL DEFAULT(0),show_order INT,volume INT,notifications_enabled INT NOT NULL DEFAULT(0),last_volume_sync INT NOT NULL DEFAULT(-1));", "CREATE TABLE circle_contact (link_circle_id TEXT NOT NULL,link_person_id TEXT NOT NULL,UNIQUE (link_circle_id, link_person_id), FOREIGN KEY (link_circle_id) REFERENCES circles(circle_id) ON DELETE CASCADE, FOREIGN KEY (link_person_id) REFERENCES contacts(person_id) ON DELETE CASCADE);", "CREATE TABLE circled_me_users (gaia_id TEXT NOT NULL,notification_key TEXT NOT NULL,UNIQUE (gaia_id, notification_key), FOREIGN KEY (notification_key) REFERENCES guns(key) ON DELETE CASCADE);", "CREATE TABLE profiles (profile_person_id TEXT PRIMARY KEY,contact_update_time INT,contact_proto BLOB,profile_update_time INT,profile_proto BLOB,people_data_proto BLOB,videos_data_proto BLOB,reviews_data_proto BLOB,local_reviews_data_proto BLOB,self_local_reviews_data_proto BLOB,profile_stats_proto BLOB,profile_squares_proto BLOB,FOREIGN KEY (profile_person_id) REFERENCES contacts(person_id) ON DELETE CASCADE);", "CREATE TABLE contact_search(search_person_id TEXT NOT NULL,search_key_type TEXT NOT NULL DEFAULT(0),search_key TEXT,FOREIGN KEY (search_person_id) REFERENCES contacts(person_id) ON DELETE CASCADE);", "CREATE TABLE network_data_transactions(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL,time INT,sent INT,recv INT,network_duration INT,process_duration INT,req_count INT,exception TEXT,log_file TEXT,negotiated_protocol TEXT,server_elapsed_time INT);", "CREATE TABLE network_data_stats(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL,first INT,last INT,sent INT,recv INT,network_duration INT,process_duration INT,req_count INT);", "CREATE TABLE platform_audience(package_name TEXT PRIMARY KEY, audience_data BLOB);", "CREATE TABLE events(_id INTEGER PRIMARY KEY AUTOINCREMENT, event_id TEXT UNIQUE NOT NULL, activity_id TEXT UNIQUE, name TEXT, source INT, creator_gaia_id TEXT, update_timestamp INT, refresh_timestamp INT, activity_refresh_timestamp INT, invitee_roster_timestamp INT, fingerprint INT NOT NULL DEFAULT(0), start_time INT NOT NULL, end_time INT NOT NULL, instant_share_end_time INT, can_invite_people INT DEFAULT (0), can_post_photos INT DEFAULT (0), can_comment INT DEFAULT(0) NOT NULL, mine INT DEFAULT (0) NOT NULL, polling_token TEXT,resume_token TEXT,display_time INT DEFAULT (0),event_data BLOB, plus_one_data BLOB, invitee_roster_proto BLOB, deleted INT DEFAULT (0), event_type INT DEFAULT (0) );", "CREATE TABLE event_people(_id INTEGER PRIMARY KEY AUTOINCREMENT, event_id TEXT NOT NULL, gaia_id TEXT NOT NULL, CONSTRAINT uc_eventID UNIQUE (event_id, gaia_id) FOREIGN KEY (event_id) REFERENCES events(event_id) ON DELETE CASCADE);", "CREATE TABLE plus_pages(gaia_id TEXT PRIMARY KEY, name TEXT);", "CREATE TABLE event_activities(_id INTEGER PRIMARY KEY AUTOINCREMENT, event_id TEXT NOT NULL, type INT, owner_gaia_id TEXT, owner_name TEXT, timestamp INT, fingerprint INT NOT NULL DEFAULT(0), url TEXT,comment TEXT,data BLOB, photo_id INT,tile_id TEXT,FOREIGN KEY (event_id) REFERENCES events(event_id) ON DELETE CASCADE);", "CREATE TABLE event_themes(_id INTEGER PRIMARY KEY AUTOINCREMENT, theme_id INTEGER UNIQUE NOT NULL, is_default INT DEFAULT(0), is_featured INT DEFAULT(0), image_url TEXT NOT NULL, placeholder_path TEXT, sort_order INT DEFAULT(0));", "CREATE TABLE sync_status (sync_data_kind INTEGER PRIMARY KEY,last_sync INT NOT NULL);", "CREATE TABLE media_cache (filename TEXT PRIMARY KEY,image_url TEXT,size INT NOT NULL DEFAULT(0),http_status INT NOT NULL DEFAULT(0),representation_type INT NOT NULL DEFAULT(0));", "CREATE TABLE table_versions (table_name TEXT PRIMARY KEY,version INT NOT NULL DEFAULT(0));", "CREATE TABLE manual_autoawesome (_id INTEGER PRIMARY KEY AUTOINCREMENT,render_type INT NOT NULL DEFAULT(0),icon_url TEXT NOT NULL,short_name TEXT NOT NULL,min_num_photos INT NOT NULL DEFAULT(1),max_num_photos INT NOT NULL DEFAULT(1),disallow_animated_inputs INT NOT NULL DEFAULT(0),render_failed_message TEXT NOT NULL);", "CREATE TABLE followers (_id INTEGER PRIMARY KEY,follower_payload BLOB NOT NULL)" };
  }
  
  public static String b(Context paramContext)
  {
    String str = String.valueOf(a(paramContext));
    return 11 + String.valueOf(str).length() + "content://" + str + "/";
  }
  
  public static String[] b()
  {
    return new String[] { "CREATE INDEX contacts_in_my_circles ON contacts(in_my_circles,person_id)", "CREATE INDEX contacts_name ON contacts(name)", "CREATE INDEX contacts_sort_key ON contacts(sort_key)", "CREATE INDEX contacts_gaia_id ON contacts(gaia_id)", "CREATE UNIQUE INDEX circle_contact_forward ON circle_contact(link_circle_id,link_person_id)", "CREATE UNIQUE INDEX circle_contact_backward ON circle_contact(link_person_id,link_circle_id)", "CREATE INDEX contact_search_key ON contact_search(search_key)", "CREATE INDEX media_cache_idx ON media_cache( image_url, http_status, representation_type )" };
  }
  
  public static Uri c(Context paramContext)
  {
    String str1 = String.valueOf(b(paramContext));
    String str2 = String.valueOf("account_status");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public static String[] c()
  {
    return new String[] { "CREATE VIEW location_queries_view AS SELECT location_queries.key AS key,locations._id AS _id,locations.name AS name,locations.location AS location FROM location_queries LEFT JOIN locations ON location_queries._id=locations.qrid", "CREATE VIEW event_people_view AS SELECT event_people._id as _id,event_people.event_id as event_id,event_people.gaia_id as gaia_id,contacts.person_id as person_id,contacts.name as name,contacts.sort_key as sort_key,contacts.avatar as avatar,contacts.last_updated_time as last_updated_time,contacts.profile_type as profile_type,contacts.profile_state as profile_state,contacts.in_my_circles as in_my_circles,contacts.blocked as blocked FROM event_people INNER JOIN contacts ON event_people.gaia_id=contacts.gaia_id;" };
  }
  
  public static Uri d(Context paramContext)
  {
    String str1 = String.valueOf(b(paramContext));
    String str2 = String.valueOf("guns");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public static Uri e(Context paramContext)
  {
    String str1 = String.valueOf(b(paramContext));
    String str2 = String.valueOf("circles");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public static Uri f(Context paramContext)
  {
    String str1 = String.valueOf(b(paramContext));
    String str2 = String.valueOf("contacts");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public static Uri g(Context paramContext)
  {
    String str1 = String.valueOf(b(paramContext));
    String str2 = String.valueOf("contacts");
    return Uri.parse(3 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + str2 + "/id");
  }
  
  public static Uri h(Context paramContext)
  {
    String str1 = String.valueOf(b(paramContext));
    String str2 = String.valueOf("network_data_transactions");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public static Uri i(Context paramContext)
  {
    String str1 = String.valueOf(b(paramContext));
    String str2 = String.valueOf("network_data_stats");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public static void j(Context paramContext)
  {
    long l = SystemClock.currentThreadTimeMillis();
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Iterator localIterator = localgiz.a(new String[] { "logged_in" }).iterator();
    for (;;)
    {
      int i;
      bqj localbqj;
      SQLiteDatabase localSQLiteDatabase;
      if (localIterator.hasNext())
      {
        i = ((Integer)localIterator.next()).intValue();
        localbqj = bqj.a(paramContext, i);
        localSQLiteDatabase = localbqj.getWritableDatabase();
        localSQLiteDatabase.setLocale(Locale.getDefault());
        localSQLiteDatabase.beginTransaction();
      }
      try
      {
        localbqj.a(localSQLiteDatabase, i);
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        ContentResolver.requestSync(new Account(localgiz.a(i).b("account_name"), "com.google"), a(paramContext), new Bundle());
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    a("localeChanged", l);
  }
  
  private static UriMatcher k(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        UriMatcher localUriMatcher1 = new UriMatcher(-1);
        a = localUriMatcher1;
        localUriMatcher1.addURI(a(paramContext), "account_status", 1);
        a.addURI(a(paramContext), "location_queries_view/query/*", 40);
        a.addURI(a(paramContext), "guns", 51);
        a.addURI(a(paramContext), "circles", 60);
        a.addURI(a(paramContext), "contacts", 70);
        a.addURI(a(paramContext), "contacts/circle/*", 71);
        a.addURI(a(paramContext), "contacts/query/*", 74);
        a.addURI(a(paramContext), "contacts/query", 74);
        a.addURI(a(paramContext), "contacts/id/*", 72);
        a.addURI(a(paramContext), "circle_contact", 62);
        a.addURI(a(paramContext), "network_data_transactions", 180);
        a.addURI(a(paramContext), "network_data_stats", 181);
        a.addURI(a(paramContext), "platform_audience/*", 182);
        a.addURI(a(paramContext), "plus_pages", 190);
        a.addURI(a(paramContext), "panorama_image", 200);
        a.addURI(a(paramContext), "image", 213);
      }
      UriMatcher localUriMatcher2 = a;
      return localUriMatcher2;
    }
    finally {}
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    String str = String.valueOf(paramUri);
    throw new IllegalArgumentException(22 + String.valueOf(str).length() + "Delete not supported: " + str);
  }
  
  public String getType(Uri paramUri)
  {
    switch (k(getContext()).match(paramUri))
    {
    default: 
      String str = String.valueOf(paramUri);
      throw new IllegalArgumentException(13 + String.valueOf(str).length() + "Unknown URI: " + str);
    case 1: 
      return "vnd.android.cursor.dir/vnd.google.android.apps.plus.accounts";
    case 40: 
      return "vnd.android.cursor.dir/vnd.google.android.apps.plus.locations";
    }
    return "vnd.android.cursor.dir/vnd.google.android.apps.plus.contacts";
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    String str = String.valueOf(paramUri);
    throw new IllegalStateException(21 + String.valueOf(str).length() + "Insert not supported " + str);
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  /* Error */
  public android.os.ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 686	com/google/android/apps/plus/content/EsProvider:getContext	()Landroid/content/Context;
    //   6: invokestatic 688	com/google/android/apps/plus/content/EsProvider:k	(Landroid/content/Context;)Landroid/content/UriMatcher;
    //   9: aload_1
    //   10: invokevirtual 692	android/content/UriMatcher:match	(Landroid/net/Uri;)I
    //   13: istore 4
    //   15: ldc_w 464
    //   18: iconst_3
    //   19: invokestatic 470	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   22: ifeq +50 -> 72
    //   25: aload_1
    //   26: invokestatic 158	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: astore 16
    //   31: new 197	java/lang/StringBuilder
    //   34: dup
    //   35: bipush 36
    //   37: aload 16
    //   39: invokestatic 158	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   42: invokevirtual 164	java/lang/String:length	()I
    //   45: iadd
    //   46: invokespecial 200	java/lang/StringBuilder:<init>	(I)V
    //   49: ldc_w 712
    //   52: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: aload 16
    //   57: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: ldc_w 714
    //   63: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: iload 4
    //   68: invokevirtual 717	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: iload 4
    //   74: sipush 200
    //   77: if_icmpeq +62 -> 139
    //   80: iload 4
    //   82: sipush 213
    //   85: if_icmpeq +54 -> 139
    //   88: aload_1
    //   89: invokestatic 158	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   92: astore 15
    //   94: new 677	java/lang/IllegalArgumentException
    //   97: dup
    //   98: new 197	java/lang/StringBuilder
    //   101: dup
    //   102: bipush 17
    //   104: aload 15
    //   106: invokestatic 158	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   109: invokevirtual 164	java/lang/String:length	()I
    //   112: iadd
    //   113: invokespecial 200	java/lang/StringBuilder:<init>	(I)V
    //   116: ldc_w 719
    //   119: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload 15
    //   124: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokespecial 680	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   133: athrow
    //   134: astore_3
    //   135: aload_0
    //   136: monitorexit
    //   137: aload_3
    //   138: athrow
    //   139: invokestatic 251	android/os/SystemClock:currentThreadTimeMillis	()J
    //   142: lstore 5
    //   144: invokestatic 724	android/os/Binder:clearCallingIdentity	()J
    //   147: lstore 7
    //   149: aload_1
    //   150: ldc 229
    //   152: invokevirtual 727	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   155: astore 10
    //   157: ldc_w 464
    //   160: iconst_3
    //   161: invokestatic 470	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   164: ifeq +27 -> 191
    //   167: aload 10
    //   169: invokestatic 158	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   172: astore 12
    //   174: aload 12
    //   176: invokevirtual 164	java/lang/String:length	()I
    //   179: ifeq +47 -> 226
    //   182: ldc_w 729
    //   185: aload 12
    //   187: invokevirtual 168	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   190: pop
    //   191: new 231	java/io/File
    //   194: dup
    //   195: aload 10
    //   197: invokespecial 730	java/io/File:<init>	(Ljava/lang/String;)V
    //   200: ldc_w 731
    //   203: invokestatic 737	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   206: astore 11
    //   208: lload 7
    //   210: invokestatic 741	android/os/Binder:restoreCallingIdentity	(J)V
    //   213: ldc_w 742
    //   216: lload 5
    //   218: invokestatic 274	com/google/android/apps/plus/content/EsProvider:a	(Ljava/lang/String;J)V
    //   221: aload_0
    //   222: monitorexit
    //   223: aload 11
    //   225: areturn
    //   226: new 141	java/lang/String
    //   229: dup
    //   230: ldc_w 729
    //   233: invokespecial 191	java/lang/String:<init>	(Ljava/lang/String;)V
    //   236: pop
    //   237: goto -46 -> 191
    //   240: astore 9
    //   242: lload 7
    //   244: invokestatic 741	android/os/Binder:restoreCallingIdentity	(J)V
    //   247: ldc_w 742
    //   250: lload 5
    //   252: invokestatic 274	com/google/android/apps/plus/content/EsProvider:a	(Ljava/lang/String;J)V
    //   255: aload 9
    //   257: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	this	EsProvider
    //   0	258	1	paramUri	Uri
    //   0	258	2	paramString	String
    //   134	4	3	localObject1	Object
    //   13	73	4	i	int
    //   142	109	5	l1	long
    //   147	96	7	l2	long
    //   240	16	9	localObject2	Object
    //   155	41	10	str1	String
    //   206	18	11	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   172	14	12	str2	String
    //   92	31	15	str3	String
    //   29	27	16	str4	String
    // Exception table:
    //   from	to	target	type
    //   2	72	134	finally
    //   88	134	134	finally
    //   139	149	134	finally
    //   208	221	134	finally
    //   242	258	134	finally
    //   149	191	240	finally
    //   191	208	240	finally
    //   226	237	240	finally
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    long l = SystemClock.currentThreadTimeMillis();
    String str1 = paramUri.getQueryParameter("account");
    if (str1 == null)
    {
      String str35 = String.valueOf("Every URI must have the 'account' parameter specified.\nURI: ");
      String str36 = String.valueOf(paramUri);
      throw new IllegalArgumentException(0 + String.valueOf(str35).length() + String.valueOf(str36).length() + str35 + str36);
    }
    int i = Integer.parseInt(str1);
    String str2 = paramUri.getQueryParameter("limit");
    int j = k(getContext()).match(paramUri);
    if (Log.isLoggable("EsProvider", 3))
    {
      String str34 = String.valueOf(paramUri);
      new StringBuilder(26 + String.valueOf(str34).length()).append("QUERY URI: ").append(str34).append(" -> ").append(j);
    }
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    String str5;
    Object localObject1;
    Object localObject3;
    Object localObject2;
    Object localObject4;
    label368:
    String str7;
    label416:
    String[] arrayOfString4;
    switch (j)
    {
    default: 
      String str33 = String.valueOf(paramUri);
      throw new IllegalArgumentException(12 + String.valueOf(str33).length() + "Unknown URI " + str33);
    case 1: 
      localSQLiteQueryBuilder.setTables("account_status");
      localSQLiteQueryBuilder.setProjectionMap(gjq.a);
      str5 = str2;
      localObject1 = null;
      localObject3 = paramArrayOfString2;
      localObject2 = null;
    case 40: 
    case 51: 
    case 60: 
    case 72: 
      for (;;)
      {
        if (!TextUtils.isEmpty(paramString2))
        {
          localObject4 = paramString2;
          if (Log.isLoggable("EsProvider", 3))
          {
            String str8 = String.valueOf(localSQLiteQueryBuilder.buildQuery(paramArrayOfString1, paramString1, (String[])localObject3, (String)localObject1, null, paramString2, str5));
            if (str8.length() != 0) {
              "QUERY: ".concat(str8);
            }
          }
          else
          {
            Cursor localCursor = localSQLiteQueryBuilder.query(bqj.a(getContext(), i).getReadableDatabase(), paramArrayOfString1, paramString1, (String[])localObject3, (String)localObject1, null, (String)localObject4, str5);
            if (Log.isLoggable("EsProvider", 3))
            {
              int k = localCursor.getCount();
              new StringBuilder(26).append("QUERY results: ").append(k);
            }
            localCursor.setNotificationUri(getContext().getContentResolver(), paramUri);
            String str6 = String.valueOf(localSQLiteQueryBuilder.getTables());
            if (str6.length() == 0) {
              break label1940;
            }
            str7 = "query-".concat(str6);
            label529:
            a(str7, l);
            return localCursor;
            localSQLiteQueryBuilder.setTables("location_queries_view");
            localSQLiteQueryBuilder.appendWhere("key");
            localSQLiteQueryBuilder.appendWhere("=?");
            String[] arrayOfString5 = new String[1];
            arrayOfString5[0] = ((String)paramUri.getPathSegments().get(2));
            String[] arrayOfString6 = (String[])efj.a(arrayOfString5, paramArrayOfString2);
            localSQLiteQueryBuilder.setProjectionMap(g);
            str5 = str2;
            localObject3 = arrayOfString6;
            localObject2 = null;
            localObject1 = null;
            continue;
            localSQLiteQueryBuilder.setTables("guns");
            localSQLiteQueryBuilder.setProjectionMap(b);
            if (str2 != null) {
              if (Long.parseLong(str2) <= 200L) {}
            }
            for (str2 = Long.toString(200L);; str2 = Long.toString(200L))
            {
              str5 = str2;
              localObject3 = paramArrayOfString2;
              localObject2 = null;
              localObject1 = null;
              break;
            }
            if (hsb.a(paramArrayOfString1, new String[] { "member_ids" }))
            {
              String str27 = String.valueOf("circles LEFT OUTER JOIN (");
              String str28 = String.valueOf("circle_contact");
              String str29 = String.valueOf("circle_contact");
              String str30 = String.valueOf("link_circle_id");
              String str31 = String.valueOf("circles");
              String str32 = String.valueOf("circle_id");
              localSQLiteQueryBuilder.setTables(17 + String.valueOf(str27).length() + String.valueOf("SELECT link_circle_id,link_person_id FROM circle_contact JOIN contacts AS c  ON (c.person_id=link_person_id) ORDER BY c.sort_key, UPPER(c.name)").length() + String.valueOf(str28).length() + String.valueOf(str29).length() + String.valueOf(str30).length() + String.valueOf(str31).length() + String.valueOf(str32).length() + str27 + "SELECT link_circle_id,link_person_id FROM circle_contact JOIN contacts AS c  ON (c.person_id=link_person_id) ORDER BY c.sort_key, UPPER(c.name)" + ") AS " + str28 + " ON ( " + str29 + "." + str30 + " = " + str31 + "." + str32 + ")");
            }
            for (String str26 = "circle_id";; str26 = null)
            {
              localSQLiteQueryBuilder.setProjectionMap(jim.c);
              str5 = str2;
              localObject1 = str26;
              localObject3 = paramArrayOfString2;
              localObject2 = null;
              break;
              localSQLiteQueryBuilder.setTables("circles");
            }
            localSQLiteQueryBuilder.appendWhere("person_id");
            localSQLiteQueryBuilder.appendWhere("=?");
            arrayOfString4 = new String[1];
            arrayOfString4[0] = ((String)paramUri.getPathSegments().get(2));
          }
        }
      }
    }
    label1050:
    label1342:
    label1732:
    for (String[] arrayOfString1 = (String[])efj.a(arrayOfString4, paramArrayOfString2);; arrayOfString1 = paramArrayOfString2)
    {
      String str3;
      String str9;
      String str4;
      if (hsb.a(paramArrayOfString1, new String[] { "contact_update_time", "contact_proto", "profile_update_time", "profile_proto", "people_data_proto" }))
      {
        str3 = "contacts LEFT OUTER JOIN profiles ON (contacts.person_id=profiles.profile_person_id)";
        if (!hsb.a(paramArrayOfString1, new String[] { "packed_circle_ids" })) {
          break label1981;
        }
        str9 = String.valueOf(str3);
        String str10 = String.valueOf(" LEFT OUTER JOIN circle_contact ON ( circle_contact.link_person_id = contacts.person_id)");
        if (str10.length() == 0) {
          break label1143;
        }
        str4 = str9.concat(str10);
      }
      label1099:
      for (localObject1 = "person_id";; localObject1 = null)
      {
        localSQLiteQueryBuilder.setTables(str4);
        localSQLiteQueryBuilder.setProjectionMap(jim.a);
        localObject2 = "sort_key, UPPER(name)";
        str5 = str2;
        localObject3 = arrayOfString1;
        break;
        str3 = "contacts";
        break label1050;
        label1143:
        str4 = new String(str9);
        break label1099;
        localSQLiteQueryBuilder.setTables("contacts JOIN circle_contact ON (contacts.person_id=circle_contact.link_person_id) JOIN circles ON (circle_contact.link_circle_id = circles.circle_id)");
        localSQLiteQueryBuilder.appendWhere("person_id");
        localSQLiteQueryBuilder.appendWhere(" IN (");
        localSQLiteQueryBuilder.appendWhere("SELECT ");
        localSQLiteQueryBuilder.appendWhere("link_person_id");
        localSQLiteQueryBuilder.appendWhere(" FROM ");
        localSQLiteQueryBuilder.appendWhere("circle_contact");
        localSQLiteQueryBuilder.appendWhere(" WHERE ");
        localSQLiteQueryBuilder.appendWhere("link_circle_id");
        localSQLiteQueryBuilder.appendWhere("=?");
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = ((String)paramUri.getPathSegments().get(2));
        String[] arrayOfString3 = (String[])efj.a(arrayOfString2, paramArrayOfString2);
        localSQLiteQueryBuilder.appendWhere(")");
        localSQLiteQueryBuilder.setProjectionMap(jim.a);
        if (paramString2 == null) {}
        for (localObject2 = "UPPER(name)";; localObject2 = paramString2)
        {
          localObject1 = "person_id";
          str5 = str2;
          localObject3 = arrayOfString3;
          break;
        }
        List localList = paramUri.getPathSegments();
        String str11;
        String str14;
        String str18;
        String str20;
        String str22;
        String str24;
        String str15;
        if (localList.size() == 2)
        {
          str11 = "";
          String str12 = paramUri.getQueryParameter("self_gaia_id");
          boolean bool1 = "true".equals(paramUri.getQueryParameter("plus_pages"));
          boolean bool2 = "true".equals(paramUri.getQueryParameter("in_circles"));
          String str13 = paramUri.getQueryParameter("activity_id");
          str14 = null;
          if (str13 != null)
          {
            str18 = String.valueOf("SELECT author_id FROM activities WHERE activity_id =  ");
            String str19 = String.valueOf(DatabaseUtils.sqlEscapeString(str13));
            if (str19.length() == 0) {
              break label1704;
            }
            str20 = str18.concat(str19);
            String str21 = String.valueOf(str20);
            str22 = String.valueOf("SELECT author_id FROM activity_comments WHERE activity_id = ");
            String str23 = String.valueOf(DatabaseUtils.sqlEscapeString(str13));
            if (str23.length() == 0) {
              break label1718;
            }
            str24 = str22.concat(str23);
            String str25 = String.valueOf(str24);
            str14 = 7 + String.valueOf(str21).length() + String.valueOf(str25).length() + str21 + " UNION " + str25;
          }
          if ((str11.startsWith("+")) || (str11.startsWith("@"))) {
            str11 = str11.substring(1);
          }
          a(localSQLiteQueryBuilder, str11, bool1, str2, str12, bool2, str14);
          localSQLiteQueryBuilder.setProjectionMap(jim.b);
          if (paramString2 == null) {
            break label1732;
          }
          str15 = paramString2;
        }
        for (;;)
        {
          if (!TextUtils.isEmpty(str14))
          {
            String str16 = String.valueOf("gaia_id IN (");
            String str17 = 7 + String.valueOf(str16).length() + String.valueOf(str14).length() + String.valueOf(str15).length() + str16 + str14 + ") DESC," + str15;
            localObject1 = "person_id";
            localObject3 = paramArrayOfString2;
            localObject2 = str17;
            str5 = null;
            break;
            str11 = ((String)localList.get(2)).trim();
            break label1342;
            str20 = new String(str18);
            break label1427;
            str24 = new String(str22);
            break label1469;
            if (hsb.a(paramArrayOfString1, new String[] { "interaction_sort_key" }))
            {
              str15 = "interaction_sort_key DESC";
            }
            else
            {
              str15 = "UPPER(name)";
              continue;
              localSQLiteQueryBuilder.setTables("network_data_transactions");
              localSQLiteQueryBuilder.setProjectionMap(c);
              str5 = str2;
              localObject3 = paramArrayOfString2;
              localObject2 = null;
              localObject1 = null;
              break;
              localSQLiteQueryBuilder.setTables("network_data_stats");
              localSQLiteQueryBuilder.setProjectionMap(d);
              str5 = str2;
              localObject3 = paramArrayOfString2;
              localObject2 = null;
              localObject1 = null;
              break;
              localSQLiteQueryBuilder.setTables("platform_audience");
              localSQLiteQueryBuilder.appendWhere("package_name");
              localSQLiteQueryBuilder.appendWhere("=");
              localSQLiteQueryBuilder.appendWhereEscapeString(paramUri.getLastPathSegment());
              localSQLiteQueryBuilder.setProjectionMap(e);
              localSQLiteQueryBuilder.setDistinct(true);
              str5 = str2;
              localObject3 = paramArrayOfString2;
              localObject2 = null;
              localObject1 = null;
              break;
              localSQLiteQueryBuilder.setTables("plus_pages");
              localSQLiteQueryBuilder.setProjectionMap(f);
              str5 = str2;
              localObject3 = paramArrayOfString2;
              localObject2 = null;
              localObject1 = null;
              break;
              new String("QUERY: ");
              break label416;
              str7 = new String("query-");
              break label529;
              localObject4 = localObject2;
              break label368;
            }
          }
        }
        localObject1 = "person_id";
        localObject3 = paramArrayOfString2;
        localObject2 = str15;
        str5 = null;
        break;
        str4 = str3;
      }
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    String str = String.valueOf(paramUri);
    throw new IllegalArgumentException(22 + String.valueOf(str).length() + "Update not supported: " + str);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.content.EsProvider
 * JD-Core Version:    0.7.0.1
 */