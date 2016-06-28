import android.content.Intent;
import android.os.Bundle;

public class kft
  implements mdp, mfd
{
  private tt a;
  private kfb b;
  
  private kft(tt paramtt, kfb paramkfb, mek parammek)
  {
    this.a = paramtt;
    this.b = null;
    parammek.a(this);
  }
  
  public kft(tt paramtt, mek parammek)
  {
    this(paramtt, null, parammek);
  }
  
  public Bundle a(Intent paramIntent)
  {
    return null;
  }
  
  public kfb a()
  {
    return this.b;
  }
  
  public final void b_(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      kfb localkfb = a();
      if (localkfb == null) {
        throw new IllegalStateException("A PreferenceFragment must be provided!");
      }
      Bundle localBundle = a(this.a.getIntent());
      if (localBundle != null) {
        localkfb.f(localBundle);
      }
      this.a.b.a.d.a().a(da.U, localkfb).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kft
 * JD-Core Version:    0.7.0.1
 */