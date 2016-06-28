import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;

public final class ite
  implements itd
{
  private static final String b = efj.m("datetaken");
  private static final String c = efj.m("date_added");
  private static final String d = efj.m("date_modified");
  private static final String[] e;
  private static final String[] f;
  private static final String[] g = { "_data" };
  private Uri h;
  private itc i = new itc(this);
  private isx j = new isx(this);
  
  static
  {
    String[] arrayOfString1 = new String[7];
    arrayOfString1[0] = "_id";
    arrayOfString1[1] = "bucket_id";
    arrayOfString1[2] = "bucket_display_name";
    String str1 = b;
    arrayOfString1[3] = (5 + String.valueOf(str1).length() + "MAX(" + str1 + ")");
    arrayOfString1[4] = "COUNT(*)";
    String str2 = c;
    arrayOfString1[5] = (5 + String.valueOf(str2).length() + "MAX(" + str2 + ")");
    String str3 = d;
    arrayOfString1[6] = (5 + String.valueOf(str3).length() + "MAX(" + str3 + ")");
    e = arrayOfString1;
    String[] arrayOfString2 = new String[5];
    arrayOfString2[0] = "_id";
    String str4 = b;
    String str5 = String.valueOf("corrected_date_taken");
    arrayOfString2[1] = (4 + String.valueOf(str4).length() + String.valueOf(str5).length() + str4 + " as " + str5);
    String str6 = String.valueOf(efj.a(c, d));
    String str7 = String.valueOf("corrected_added_modified");
    arrayOfString2[2] = (4 + String.valueOf(str6).length() + String.valueOf(str7).length() + str6 + " as " + str7);
    arrayOfString2[3] = "mime_type";
    arrayOfString2[4] = "0 as aliased_orientation";
    f = arrayOfString2;
  }
  
  public ite(Uri paramUri)
  {
    this.h = paramUri;
  }
  
  public final Cursor a(Context paramContext, int paramInt)
  {
    return this.j.a(paramContext, paramInt);
  }
  
  public final String a()
  {
    return "_id = ?";
  }
  
  public final String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      return null;
    case 1: 
      return "bucket_id NOT NULL AND bucket_display_name NOT NULL AND _data LIKE '%/DCIM/%') GROUP BY (2";
    }
    return "bucket_id NOT NULL AND bucket_display_name NOT NULL AND _data NOT LIKE '%/DCIM/%') GROUP BY (2";
  }
  
  public final ArrayList<ita> a(Context paramContext, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    return this.i.a(paramContext, paramInt1, paramBoolean, paramInt2, paramInt3);
  }
  
  public final Uri b()
  {
    return this.h;
  }
  
  public final String[] c()
  {
    return e;
  }
  
  public final String d()
  {
    return "bucket_id = ?";
  }
  
  public final String[] e()
  {
    return f;
  }
  
  public final String f()
  {
    return "bucket_id = ?";
  }
  
  public final String[] g()
  {
    return g;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ite
 * JD-Core Version:    0.7.0.1
 */