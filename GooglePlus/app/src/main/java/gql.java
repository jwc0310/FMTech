import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;

public final class gql
  implements gqh
{
  private final String a;
  private final String b;
  private final String c;
  
  public gql(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    if (paramString2 == null) {
      throw new NullPointerException();
    }
    this.b = ((String)paramString2);
    this.c = paramString3;
  }
  
  public final boolean a(Activity paramActivity)
  {
    if (TextUtils.isEmpty(this.b)) {
      return false;
    }
    ez localez = new ez(paramActivity);
    localez.a.setType("text/plain");
    localez.b = this.a;
    String str1 = this.b;
    localez.a.putExtra("android.intent.extra.TEXT", str1);
    if (!TextUtils.isEmpty(this.c))
    {
      String str2 = this.c;
      localez.a.putExtra("android.intent.extra.SUBJECT", str2);
    }
    paramActivity.startActivity(localez.a());
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gql
 * JD-Core Version:    0.7.0.1
 */