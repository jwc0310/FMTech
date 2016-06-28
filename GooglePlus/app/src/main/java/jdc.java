import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

public final class jdc
  extends SQLiteOpenHelper
{
  private static final String a = jdr.a(jdc.class);
  
  protected jdc(Context paramContext, int paramInt)
  {
    this(paramContext, 11 + String.valueOf(str).length() + str + paramInt);
  }
  
  private jdc(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 15);
  }
  
  private static mkf a(Cursor paramCursor)
  {
    String str = paramCursor.getString(paramCursor.getColumnIndexOrThrow("default_destination"));
    mkf localmkf = null;
    if (str != null)
    {
      boolean bool = TextUtils.isEmpty(str);
      localmkf = null;
      if (!bool)
      {
        localmkf = new mkf();
        mkh localmkh = new mkh();
        localmkh.a = str;
        localmkf.c = localmkh;
      }
    }
    byte[] arrayOfByte = paramCursor.getBlob(paramCursor.getColumnIndexOrThrow("simple_collapsed_layout"));
    mkt localmkt;
    if (arrayOfByte != null) {
      localmkt = new mkt();
    }
    try
    {
      qat.b(localmkt, arrayOfByte, 0, arrayOfByte.length);
      if (localmkf == null) {
        localmkf = new mkf();
      }
      localmkf.a = localmkt;
    }
    catch (qas localqas)
    {
      for (;;)
      {
        long l;
        jdr.b(a, "Malformed SimpleCollapsedLayout.", localqas);
      }
    }
    l = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("creation_time"));
    if (l != 0L)
    {
      if (localmkf == null) {
        localmkf = new mkf();
      }
      localmkf.b = Long.valueOf(l);
    }
    return localmkf;
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE notifications(_id INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL, priority INT NOT NULL DEFAULT(0), read_state INT NOT NULL DEFAULT(0), sort_version INT NOT NULL DEFAULT(0), last_modified_version INT NOT NULL DEFAULT(0), system_tray_version INT NOT NULL DEFAULT(0), push_enabled INT NOT NULL DEFAULT(0), sync_behavior INT NOT NULL DEFAULT(0), analytics_data BLOB, payload BLOB, collapsed_info BLOB, expanded_info BLOB, android_render_info BLOB );");
    paramSQLiteDatabase.execSQL("CREATE TABLE user_data (_id INTEGER PRIMARY KEY, user_id TEXT, unread_count INT DEFAULT(0), unread_count_string STRING NOT NULL DEFAULT('0'), has_unread BOOLEAN DEFAULT(0), sync_version INT DEFAULT(0), viewed_sync_version INT DEFAULT(0), important_fetch_paging_token BLOB, low_fetch_paging_token BLOB, important_sync_token BLOB, low_sync_token BLOB, view_id TEXT );");
    paramSQLiteDatabase.execSQL("CREATE TABLE statistics (_id INTEGER PRIMARY KEY, time INTEGER NOT NULL, log INTEGER NOT NULL, comment TEXT );");
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    jcy.a(paramSQLiteDatabase);
    jcy.b(paramSQLiteDatabase);
    onCreate(paramSQLiteDatabase);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 7)
    {
      jcy.a(paramSQLiteDatabase);
      jcy.b(paramSQLiteDatabase);
      onCreate(paramSQLiteDatabase);
      return;
    }
    if (paramInt1 < 8) {
      paramSQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] { "notifications", "category", "TEXT" }));
    }
    for (int i = 8;; i = paramInt1)
    {
      if (i < 9)
      {
        paramSQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] { "user_data", "viewed_sync_version", "INT DEFAULT(0)" }));
        i = 9;
      }
      if (i < 10)
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS statistics");
        paramSQLiteDatabase.execSQL("CREATE TABLE statistics (_id INTEGER PRIMARY KEY, time INTEGER NOT NULL, log INTEGER NOT NULL, comment TEXT );");
        i = 10;
      }
      Cursor localCursor;
      if (i < 11)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE notifications ADD COLUMN collapsed_info BLOB");
        paramSQLiteDatabase.execSQL("ALTER TABLE notifications ADD COLUMN android_render_info BLOB");
        localCursor = paramSQLiteDatabase.query("notifications", new String[] { "_id", "default_destination", "category", "simple_collapsed_layout", "creation_time" }, null, null, null, null, null);
      }
      for (;;)
      {
        try
        {
          if (localCursor.moveToNext())
          {
            mkf localmkf = a(localCursor);
            String str9 = localCursor.getString(localCursor.getColumnIndexOrThrow("category"));
            if ((str9 == null) || (TextUtils.isEmpty(str9))) {
              break label857;
            }
            localmkc = new mkc();
            localmkc.a = str9;
            ContentValues localContentValues = new ContentValues();
            if (localmkf != null) {
              localContentValues.put("collapsed_info", qat.a(localmkf));
            }
            if (localmkc != null) {
              localContentValues.put("android_render_info", qat.a(localmkc));
            }
            if (localContentValues.size() == 0) {
              continue;
            }
            int k = localCursor.getColumnIndex("_id");
            if (k < 0) {
              continue;
            }
            String[] arrayOfString2 = new String[1];
            arrayOfString2[0] = String.valueOf(localCursor.getInt(k));
            paramSQLiteDatabase.update("notifications", localContentValues, "_id = ?", arrayOfString2);
            continue;
          }
        }
        finally
        {
          localCursor.close();
        }
        String str1 = String.valueOf("ALTER TABLE notifications RENAME TO ");
        String str2 = String.valueOf("tmp_notifications");
        if (str2.length() != 0) {}
        StringBuilder localStringBuilder;
        for (String str3 = str1.concat(str2);; str3 = new String(str1))
        {
          paramSQLiteDatabase.execSQL(str3);
          paramSQLiteDatabase.execSQL("CREATE TABLE notifications(_id  INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL, priority INT NOT NULL DEFAULT(0), read_state INT NOT NULL DEFAULT(0), sort_version INT NOT NULL DEFAULT(0), last_modified_version INT NOT NULL DEFAULT(0), push_enabled INT NOT NULL DEFAULT(0), payload BLOB, collapsed_info BLOB, expanded_info BLOB, android_render_info BLOB );");
          String[] arrayOfString1 = { "_id", "key", "priority", "read_state", "sort_version", "last_modified_version", "push_enabled", "payload", "collapsed_info", "expanded_info", "android_render_info" };
          localStringBuilder = new StringBuilder();
          for (int j = 0; j < 11; j++)
          {
            localStringBuilder.append(arrayOfString1[j]);
            if (j != 10) {
              localStringBuilder.append(",");
            }
          }
        }
        String str4 = String.valueOf("INSERT INTO notifications(");
        String str5 = String.valueOf(localStringBuilder.toString());
        String str6 = String.valueOf(localStringBuilder.toString());
        paramSQLiteDatabase.execSQL(15 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf("tmp_notifications").length() + str4 + str5 + ") SELECT " + str6 + " FROM " + "tmp_notifications");
        String str7 = String.valueOf("tmp_notifications");
        if (str7.length() != 0) {}
        for (String str8 = "DROP TABLE IF EXISTS ".concat(str7);; str8 = new String("DROP TABLE IF EXISTS "))
        {
          paramSQLiteDatabase.execSQL(str8);
          i = 11;
          if (i < 12)
          {
            paramSQLiteDatabase.delete("notifications", "key = ?", new String[] { "" });
            i = 12;
          }
          if (i < 13)
          {
            paramSQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] { "notifications", "sync_behavior", "INT NOT NULL DEFAULT(0)" }));
            i = 13;
          }
          if (i < 14)
          {
            paramSQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] { "notifications", "analytics_data", "BLOB" }));
            i = 14;
          }
          if (i >= 15) {
            break;
          }
          paramSQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] { "notifications", "system_tray_version", "INT NOT NULL DEFAULT(0)" }));
          return;
        }
        label857:
        mkc localmkc = null;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdc
 * JD-Core Version:    0.7.0.1
 */