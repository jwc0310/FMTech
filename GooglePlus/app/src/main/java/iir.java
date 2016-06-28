import android.app.Activity;
import android.content.Intent;

public final class iir
  implements gqh
{
  private final String a;
  
  public iir(String paramString)
  {
    this.a = paramString;
  }
  
  public final boolean a(Activity paramActivity)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", efj.a(paramActivity, this.a, "https://support.google.com/plus/?hl=%locale%"));
    localIntent.addFlags(524288);
    paramActivity.startActivity(localIntent);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iir
 * JD-Core Version:    0.7.0.1
 */