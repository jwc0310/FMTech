final class gwh
{
  static final String a;
  static final String b;
  static final String[] c = { "_id", "batch_id", "local_uri", "status", "update_time", "attempt_count", "photo_id", "media_key" };
  
  static
  {
    String str1 = String.valueOf("CREATE TABLE album_upload_media (_id INTEGER PRIMARY KEY AUTOINCREMENT, batch_id INTEGER NOT NULL, local_uri TEXT NOT NULL, status TEXT NOT NULL DEFAULT '");
    String str2 = String.valueOf(gvy.a.h);
    String str3 = String.valueOf("update_time");
    String str4 = String.valueOf("attempt_count");
    String str5 = String.valueOf("photo_id");
    String str6 = String.valueOf("media_key");
    a = 105 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + str1 + str2 + "', " + str3 + " INTEGER NOT NULL, " + str4 + " INTEGER NOT NULL DEFAULT 0, " + str5 + " TEXT NOT NULL DEFAULT '', " + str6 + " TEXT NOT NULL DEFAULT '' )";
    String str7 = String.valueOf("status IN ('");
    String str8 = String.valueOf(gvy.a.h);
    String str9 = String.valueOf(gvy.d.h);
    b = 6 + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length() + str7 + str8 + "', '" + str9 + "')";
  }
  
  static String[] a(long paramLong)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Long.toString(paramLong);
    return arrayOfString;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwh
 * JD-Core Version:    0.7.0.1
 */