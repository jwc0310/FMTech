import android.os.Bundle;

public final class iln
{
  public String a;
  public boolean b = true;
  public ikl c;
  private boolean d = false;
  private boolean e = true;
  
  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("dialog_title", this.a);
    localBundle.putBoolean("add_account", this.b);
    localBundle.putBoolean("add_account_button_shown", false);
    localBundle.putBoolean("auto_select_single_logged_out_account", this.e);
    localBundle.putParcelable("account_filter", this.c);
    return localBundle;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iln
 * JD-Core Version:    0.7.0.1
 */