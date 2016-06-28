import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.login.LoginActivity;

public final class ikx
{
  public ilf a;
  public Intent b;
  private final Context c;
  
  public ikx(Context paramContext)
  {
    this.c = paramContext;
  }
  
  public final Intent a()
  {
    Intent localIntent = new Intent(this.c, LoginActivity.class);
    localIntent.putExtra("login_request", this.a);
    localIntent.putExtra("redirect_intent", this.b);
    localIntent.putExtra("redirect_intent_options", null);
    return localIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ikx
 * JD-Core Version:    0.7.0.1
 */