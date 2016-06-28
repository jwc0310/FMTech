import android.content.Context;
import android.net.Uri;
import com.google.android.apps.plus.content.EsProvider;

public final class diz
  implements jyx
{
  private final String a;
  
  public diz(Context paramContext)
  {
    this.a = EsProvider.b(paramContext);
  }
  
  public final Uri a()
  {
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf("profile_header");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public final Uri b()
  {
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf("muted_profile");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
  
  public final Uri c()
  {
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf("restricted_profile");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return Uri.parse(str3);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     diz
 * JD-Core Version:    0.7.0.1
 */