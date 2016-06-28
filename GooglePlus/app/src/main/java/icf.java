import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.gcoreclient.upgrade.UpgradeGooglePlayServicesActivity;

public final class icf
  implements meq, mes, mfd
{
  private final Activity a;
  
  public icf(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 23997) && (((frz)mbb.a(this.a, frz.class)).a(this.a) != 0)) {
      this.a.finish();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if ((this.a instanceof UpgradeGooglePlayServicesActivity)) {}
    frz localfrz;
    int i;
    do
    {
      return;
      localfrz = (frz)mbb.a(this.a, frz.class);
      i = localfrz.a(this.a);
    } while ((i == 0) || (paramBundle != null) || (!localfrz.a(i)));
    this.a.startActivityForResult(new Intent(this.a, UpgradeGooglePlayServicesActivity.class), 23997);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     icf
 * JD-Core Version:    0.7.0.1
 */