import android.content.Context;
import android.content.Intent;

public final class exs
{
  public final ext a;
  
  public exs(ext paramext)
  {
    efj.b(paramext, "Callbacks must not be null.");
    this.a = paramext;
  }
  
  public static boolean a(Context paramContext, Intent paramIntent)
  {
    efj.b(paramContext, "Context must not be null.");
    efj.b(paramIntent, "Intent must not be null.");
    return paramIntent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exs
 * JD-Core Version:    0.7.0.1
 */