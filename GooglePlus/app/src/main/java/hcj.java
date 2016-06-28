import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hcj
{
  private static final mcq d = new mcq("botched_gallery3_refactoring");
  final Context a;
  final han b;
  private final giz c;
  
  public hcj(Context paramContext)
  {
    this.a = paramContext;
    this.c = ((giz)mbb.a(paramContext, giz.class));
    this.b = ((han)mbb.a(paramContext, han.class));
  }
  
  static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.beginTransaction();
    try
    {
      paramSQLiteDatabase.execSQL("ALTER TABLE media_tracker RENAME TO tmp_table");
      paramSQLiteDatabase.execSQL("CREATE TABLE media_tracker (_id INTEGER PRIMARY KEY, volume_name TEXT NOT NULL, media_type TEXT NOT NULL,bucket_id TEXT, last_media_id INTEGER NOT NULL DEFAULT(0))");
      paramSQLiteDatabase.execSQL("INSERT INTO media_tracker(_id, volume_name, media_type, bucket_id) SELECT _id, volume_name, media_type, bucket_id FROM tmp_table;");
      paramSQLiteDatabase.execSQL("DROP TABLE tmp_table;");
      paramSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramSQLiteDatabase.endTransaction();
    }
  }
  
  static void b(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE fingerprints (_id INTEGER PRIMARY KEY AUTOINCREMENT,content_uri TEXT,fingerprint TEXT,image_url TEXT,owner_id TEXT,photo_id INTEGER NOT NULL DEFAULT 0)");
    paramSQLiteDatabase.execSQL("CREATE INDEX fingerprints_index_content_uri ON fingerprints (content_uri)");
  }
  
  static void c(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.beginTransaction();
    try
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS upload_tasks");
      paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS media_record_index_media_id");
      paramSQLiteDatabase.execSQL("ALTER TABLE media_record RENAME TO tmp_table");
      paramSQLiteDatabase.execSQL("CREATE TABLE media_record (_id INTEGER PRIMARY KEY AUTOINCREMENT,album_id TEXT,bucket_id TEXT,upload_url TEXT,upload_error TEXT,event_id TEXT,fingerprint TEXT,upload_account TEXT,component_name TEXT,plus_page_id TEXT,mime_type TEXT,media_url TEXT NOT NULL,media_time INTEGER NOT NULL,media_id INTEGER NOT NULL,media_hash INTEGER NOT NULL,bytes_total INTEGER NOT NULL DEFAULT -1,retry_end_time INTEGER NOT NULL DEFAULT 0,upload_time INTEGER,bytes_uploaded INTEGER,upload_finish_time INTEGER NOT NULL DEFAULT 0,upload_id INTEGER,upload_reason INTEGER NOT NULL DEFAULT 0,upload_state INTEGER NOT NULL DEFAULT 500,upload_task_state INTEGER,from_camera INTEGER NOT NULL DEFAULT 0,is_image INTEGER NOT NULL DEFAULT 1)");
      paramSQLiteDatabase.execSQL("CREATE INDEX media_record_index_media_id ON media_record (media_id)");
      paramSQLiteDatabase.execSQL("INSERT INTO media_record(_id,album_id,upload_error,event_id,upload_account,plus_page_id,media_url,media_time,media_id,media_hash,bytes_total,retry_end_time,upload_time,bytes_uploaded,upload_finish_time,upload_id,upload_reason,upload_state,from_camera,is_image) SELECT _id,album_id,upload_error,event_id,upload_account,plus_page_id,media_url,media_time,media_id,media_hash,bytes_total,retry_end_time,upload_time,bytes_uploaded,upload_finish_time,upload_id,upload_reason,upload_state,from_camera,is_image FROM tmp_table");
      paramSQLiteDatabase.execSQL("DROP TABLE tmp_table");
      paramSQLiteDatabase.execSQL("UPDATE media_record SET album_id = 'instant' WHERE album_id = 'camera-sync'");
      paramSQLiteDatabase.execSQL("UPDATE media_record SET album_id = NULL WHERE album_id = 'events'");
      paramSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramSQLiteDatabase.endTransaction();
    }
  }
  
  static void d(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE media_tracker RENAME TO media_tracker_legacy");
    paramSQLiteDatabase.execSQL("CREATE TABLE exclude_bucket (_id INTEGER PRIMARY KEY, bucket_id TEXT UNIQUE NOT NULL)");
    paramSQLiteDatabase.execSQL("CREATE TABLE media_tracker (_id INTEGER PRIMARY KEY, volume_name TEXT NOT NULL, media_type TEXT NOT NULL,last_media_id INTEGER NOT NULL DEFAULT(0))");
  }
  
  static void e(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS fingerprints");
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS fingerprints_index_content_uri");
    paramSQLiteDatabase.execSQL("CREATE TABLE local_fingerprints (content_uri TEXT PRIMARY KEY NOT NULL, fingerprint TEXT NOT NULL)");
    paramSQLiteDatabase.execSQL("CREATE TABLE server_fingerprints (_id INTEGER PRIMARY KEY, fingerprint TEXT NOT NULL, image_url TEXT, photo_id INT NOT NULL DEFAULT(0), owner_id TEXT NOT NULL, UNIQUE (owner_id, image_url), UNIQUE (owner_id, photo_id))");
    paramSQLiteDatabase.execSQL("CREATE INDEX local_fingerprints_content_uri ON local_fingerprints(content_uri)");
    paramSQLiteDatabase.execSQL("CREATE INDEX local_fingerprints_fingerprint ON local_fingerprints(fingerprint)");
    paramSQLiteDatabase.execSQL("CREATE INDEX server_fingerprints_image_url ON server_fingerprints(image_url)");
  }
  
  static void f(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE media_record ADD COLUMN upload_status INT NOT NULL DEFAULT(0)");
    paramSQLiteDatabase.execSQL("UPDATE media_record SET upload_status = upload_state % 100");
    paramSQLiteDatabase.execSQL("UPDATE media_record SET upload_state = (upload_state / 100) * 100");
  }
  
  static void g(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE media_record ADD COLUMN allow_full_res INT NOT NULL DEFAULT(1)");
  }
  
  static void h(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE local_folders (bucket_id TEXT UNIQUE NOT NULL)");
  }
  
  static void j(SQLiteDatabase paramSQLiteDatabase) {}
  
  static void k(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM local_fingerprints");
  }
  
  static void l(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("ALTER TABLE media_record ADD COLUMN resume_token TEXT");
  }
  
  static void m(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE media_tracker_legacy");
  }
  
  final void i(SQLiteDatabase paramSQLiteDatabase)
  {
    isv[] arrayOfisv = efj.c(this.a, 1, 2);
    ContentValues localContentValues = new ContentValues(1);
    int i = arrayOfisv.length;
    for (int j = 0; j < i; j++)
    {
      isv localisv = arrayOfisv[j];
      if (localisv.a != null)
      {
        localContentValues.put("bucket_id", localisv.a);
        paramSQLiteDatabase.insert("local_folders", null, localContentValues);
      }
    }
  }
  
  final void n(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = null;
    paramSQLiteDatabase.execSQL("ALTER TABLE media_record ADD COLUMN upload_account_id INTEGER NOT NULL DEFAULT -1");
    ArrayList localArrayList = new ArrayList();
    try
    {
      localCursor = paramSQLiteDatabase.rawQuery("SELECT DISTINCT upload_account, plus_page_id FROM media_record", null);
      while (localCursor.moveToNext()) {
        if (!localCursor.isNull(0)) {
          localArrayList.add(new hck(this, localCursor.getString(0), localCursor.getString(1)));
        }
      }
      if (localCursor == null) {
        break label100;
      }
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
    localCursor.close();
    label100:
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      hck localhck = (hck)localIterator.next();
      String str1 = localhck.b;
      String str2 = localhck.a;
      int i = this.c.b(str2, str1);
      if (i == -1)
      {
        if (Log.isLoggable("UploadsDatabaseUpgrader", 4)) {
          new StringBuilder(64).append("Could not locate account id when upgrading accountId=").append(i);
        }
        if (str1 == null) {
          paramSQLiteDatabase.execSQL("DELETE FROM media_record WHERE upload_account = ? AND plus_page_id IS NULL", new Object[] { str2 });
        } else {
          paramSQLiteDatabase.execSQL("DELETE FROM media_record WHERE upload_account = ? AND plus_page_id = ?", new Object[] { str2, str1 });
        }
      }
      else if (str1 == null)
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(i);
        arrayOfObject2[1] = str2;
        paramSQLiteDatabase.execSQL("UPDATE media_record SET upload_account_id = ? WHERE upload_account = ?", arrayOfObject2);
      }
      else
      {
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = Integer.valueOf(i);
        arrayOfObject1[1] = str2;
        arrayOfObject1[2] = str1;
        paramSQLiteDatabase.execSQL("UPDATE media_record SET upload_account_id = ? WHERE upload_account = ? AND plus_page_id = ?", arrayOfObject1);
      }
    }
  }
  
  final void o(SQLiteDatabase paramSQLiteDatabase)
  {
    Uri localUri = hbu.b(this.a);
    boolean bool = efj.a(this.a.getContentResolver(), localUri, "local_folder_auto_backup", 0L) < 0L;
    int i = 0;
    if (!bool) {
      i = 1;
    }
    if (i != 0)
    {
      Cursor localCursor = paramSQLiteDatabase.rawQuery("SELECT local_folders.bucket_id, exclude_bucket.bucket_id FROM local_folders LEFT JOIN exclude_bucket ON local_folders.bucket_id = exclude_bucket.bucket_id", null);
      if (localCursor != null)
      {
        ArrayList localArrayList;
        try
        {
          localArrayList = new ArrayList(localCursor.getCount());
          while (localCursor.moveToNext()) {
            if (localCursor.getString(1) == null) {
              localArrayList.add(localCursor.getString(0));
            }
          }
        }
        finally
        {
          localCursor.close();
        }
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          ContentValues localContentValues = new ContentValues(1);
          localContentValues.put("bucket_id", str1);
          paramSQLiteDatabase.insertOrThrow("exclude_bucket", null, localContentValues);
          if (Log.isLoggable("UploadsDatabaseUpgrader", 3))
          {
            String str2 = String.valueOf(str1);
            if (str2.length() != 0) {
              "inserted new excluded bucket ".concat(str2);
            } else {
              new String("inserted new excluded bucket ");
            }
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcj
 * JD-Core Version:    0.7.0.1
 */