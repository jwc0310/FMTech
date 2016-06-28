import com.google.android.libraries.social.autobackup.MediaRecordEntry;

public abstract interface hcf
{
  public static final String[] a = { "_id AS outer_id", "media_id", "media_url AS outer_media_url", "upload_state", "upload_status", "upload_account_id", "upload_finish_time", "CAST(bytes_uploaded AS REAL) / bytes_total", "is_image" };
  public static final String b;
  public static final String c;
  public static final String d;
  
  static
  {
    String str1 = String.valueOf("upload_state = 300 AND NOT EXISTS (SELECT media_url AS inner_media_url FROM ");
    String str2 = String.valueOf(MediaRecordEntry.a.a);
    String str3 = String.valueOf("_id");
    String str4 = String.valueOf("upload_state");
    b = 77 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + str1 + str2 + " WHERE inner_media_url = outer_media_url AND outer_id < " + str3 + " AND " + str4 + " != 300" + ")";
    String str5 = String.valueOf("(upload_state IN (100, 200, 400) OR (");
    String str6 = b;
    String str7 = String.valueOf("album_id IS NULL OR album_id == \"instant\"");
    c = 9 + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + str5 + str6 + ")) AND (" + str7 + ")";
    String str8 = String.valueOf("upload_account_id = ? AND (");
    String str9 = c;
    d = 1 + String.valueOf(str8).length() + String.valueOf(str9).length() + str8 + str9 + ")";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcf
 * JD-Core Version:    0.7.0.1
 */