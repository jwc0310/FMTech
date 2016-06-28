import android.content.Intent;
import android.os.Bundle;

public final class ion
  extends kdn
  implements kfp
{
  private final kfo aa = new kfo(this, this.c);
  
  public static Bundle b(Intent paramIntent)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("LoginSettingsFragment.account_view_intent", paramIntent.getParcelableExtra("LoginSettingsFragment.account_view_intent"));
    return localBundle;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b.a(kfs.class, this.aa);
  }
  
  public final void v()
  {
    Bundle localBundle = this.m;
    if (localBundle != null) {}
    for (Intent localIntent = (Intent)localBundle.getParcelable("LoginSettingsFragment.account_view_intent");; localIntent = null)
    {
      kfo localkfo = this.aa;
      ior localior = new ior();
      localior.a = localIntent;
      bk localbk = localior.a();
      localkfo.a.a(localbk, null);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ion
 * JD-Core Version:    0.7.0.1
 */