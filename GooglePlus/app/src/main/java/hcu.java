import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hcu
{
  private static final String[] a = { "auto_upload_enabled", "auto_upload_account_id", "sync_on_wifi_only", "sync_on_roaming", "sync_on_battery", "video_upload_wifi_only", "upload_full_resolution", "local_folder_auto_backup" };
  
  public static Bundle a(Context paramContext)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Cursor localCursor = localContentResolver.query(hbu.b(paramContext), a, null, null, null);
    Bundle localBundle = new Bundle();
    if (localCursor != null) {}
    for (;;)
    {
      int j;
      boolean bool5;
      try
      {
        if (localCursor.moveToFirst())
        {
          i = localCursor.getInt(1);
          boolean bool1 = localgiz.c(i);
          String str = null;
          if (bool1) {
            str = localgiz.a(i).b("account_name");
          }
          boolean bool2;
          if (localCursor.getInt(0) != 0)
          {
            bool2 = true;
            localBundle.putBoolean("is_enabled", bool2);
            localBundle.putString("account_name", str);
            if (localCursor.getInt(2) != 0)
            {
              bool3 = true;
              localBundle.putBoolean("wifi_only", bool3);
              if (localCursor.getInt(3) == 0) {
                continue;
              }
              bool4 = true;
              localBundle.putBoolean("roaming_upload", bool4);
              if (localCursor.getInt(4) == 0) {
                continue;
              }
              j = 1;
              break label468;
              localBundle.putBoolean("charing_only", bool5);
              if (localCursor.getInt(5) == 0) {
                continue;
              }
              bool6 = true;
              localBundle.putBoolean("wifi_only_video", bool6);
              if (localCursor.getInt(6) == 0) {
                continue;
              }
              bool7 = true;
              localBundle.putBoolean("upload_full_resolution", bool7);
              if (localCursor.getInt(7) == 0) {
                continue;
              }
              bool8 = true;
              localBundle.putBoolean("local_folder_auto_backup", bool8);
              localCursor.close();
              if (i != -1) {
                localBundle.putString("obfuscated_gaia_id", localgiz.a(i).b("gaia_id"));
              }
              localBundle.putStringArrayList("folders_excluded", new ArrayList(((hbn)mbb.a(paramContext, hbn.class)).d()));
              localBundle.putBoolean("photo_storage_managed", false);
              localBundle.putLong("last_media_id_internal_photos", hbo.a(paramContext, "photo", "phoneStorage"));
              localBundle.putLong("last_media_id_internal_videos", hbo.a(paramContext, "video", "phoneStorage"));
              localBundle.putLong("last_media_id_external_photos", hbo.a(paramContext, "photo", "external"));
              localBundle.putLong("last_media_id_external_videos", hbo.a(paramContext, "video", "external"));
              return localBundle;
            }
          }
          else
          {
            bool2 = false;
            continue;
          }
          boolean bool3 = false;
          continue;
          boolean bool4 = false;
          continue;
          j = 0;
          break label468;
          bool5 = false;
          continue;
          boolean bool6 = false;
          continue;
          boolean bool7 = false;
          continue;
          boolean bool8 = false;
          continue;
        }
        i = -1;
      }
      finally
      {
        localCursor.close();
      }
      continue;
      int i = -1;
      continue;
      label468:
      if (j == 0) {
        bool5 = true;
      }
    }
  }
  
  public static void b(Context paramContext)
  {
    hcw.c(paramContext);
    List localList = ((hba)mbb.a(paramContext, hba.class)).e();
    if (!localList.isEmpty())
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        hbj.b(paramContext, ((Integer)localIterator.next()).intValue());
      }
    }
    ContentResolver localContentResolver = paramContext.getContentResolver();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("gms_disabled_auto_backup", Integer.valueOf(1));
    localContentResolver.update(hbu.b(paramContext), localContentValues, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcu
 * JD-Core Version:    0.7.0.1
 */