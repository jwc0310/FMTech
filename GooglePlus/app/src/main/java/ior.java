import android.content.Intent;
import android.os.Bundle;

public final class ior
{
  public Intent a;
  public boolean b;
  
  public final bk a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("allow_no_accounts", this.b);
    localBundle.putParcelable("account_filter", null);
    localBundle.putParcelable("account_intent", this.a);
    ioo localioo = new ioo();
    localioo.f(localBundle);
    return localioo;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ior
 * JD-Core Version:    0.7.0.1
 */