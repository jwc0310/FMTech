public abstract interface dci
{
  public static final String[] a;
  public static final String[] b;
  public static final String[] c = { "bucket_display_name" };
  public static final String[] d = { "bucket_display_name" };
  
  static
  {
    String[] arrayOfString1 = new String[7];
    arrayOfString1[0] = "_id";
    String str1 = String.valueOf(efj.m("datetaken"));
    String str2 = String.valueOf("corrected_date_taken");
    arrayOfString1[1] = (4 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " as " + str2);
    String str3 = String.valueOf(efj.a(efj.m("date_added"), efj.m("date_modified")));
    String str4 = String.valueOf("corrected_added_modified");
    arrayOfString1[2] = (4 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + " as " + str4);
    arrayOfString1[3] = itd.a;
    arrayOfString1[4] = "_data";
    arrayOfString1[5] = "mime_type";
    arrayOfString1[6] = "orientation as aliased_orientation";
    a = arrayOfString1;
    String[] arrayOfString2 = new String[7];
    arrayOfString2[0] = "_id";
    String str5 = String.valueOf(efj.m("datetaken"));
    String str6 = String.valueOf("corrected_date_taken");
    arrayOfString2[1] = (4 + String.valueOf(str5).length() + String.valueOf(str6).length() + str5 + " as " + str6);
    String str7 = String.valueOf(efj.a(efj.m("date_added"), efj.m("date_modified")));
    String str8 = String.valueOf("corrected_added_modified");
    arrayOfString2[2] = (4 + String.valueOf(str7).length() + String.valueOf(str8).length() + str7 + " as " + str8);
    arrayOfString2[3] = itd.a;
    arrayOfString2[4] = "_data";
    arrayOfString2[5] = "mime_type";
    arrayOfString2[6] = "0 as aliased_orientation";
    b = arrayOfString2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dci
 * JD-Core Version:    0.7.0.1
 */