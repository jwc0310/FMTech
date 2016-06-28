import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;

public final class hwh
  implements mdz, mes, mfd
{
  private Context a;
  
  public hwh(Context paramContext, mek parammek)
  {
    this.a = paramContext;
    parammek.a(this);
  }
  
  public hwh(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public final void a(Bundle paramBundle)
  {
    if ((hwg.a()) && (efj.J(this.a)))
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)this.a.getSystemService("connectivity");
      if ((!iv.a.a(localConnectivityManager)) && (!hvu.b(this.a))) {
        hvu.a(this.a.getApplicationContext());
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwh
 * JD-Core Version:    0.7.0.1
 */