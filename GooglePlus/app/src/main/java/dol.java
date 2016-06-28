import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.plus.phone.AccountStatusActivity;
import com.google.android.apps.plus.phone.NetworkStatisticsActivity;
import com.google.android.apps.plus.phone.NetworkTransactionsActivity;
import com.google.android.apps.plus.phone.UploadStatisticsActivity;
import com.google.android.apps.plus.settings.GplusTracingSettingsActivity;
import com.google.android.libraries.social.experiments.debug.ExperimentsBrowserActivity;
import java.util.List;

public final class dol
  extends kdn
  implements kfp
{
  private final kfo aa = new kfo(this, this.c);
  private int ab;
  
  private final void x()
  {
    List localList = mbb.c(this.a, htp.class);
    int i = localList.size();
    for (int j = 0; j < i; j++)
    {
      kfo localkfo = this.aa;
      mca localmca = (mca)((htp)localList.get(j)).a();
      localkfo.a.a(localmca, null);
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ab = paramActivity.getIntent().getIntExtra("account_id", -1);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b.a(kfs.class, this.aa);
  }
  
  public final void v()
  {
    kfo localkfo1 = this.aa;
    hts localhts = new hts();
    mbf localmbf1 = this.a;
    int i = this.ab;
    Intent localIntent1 = new Intent(localmbf1, AccountStatusActivity.class);
    localIntent1.putExtra("account_id", i);
    localhts.c = localIntent1;
    mbf localmbf2 = this.a;
    int j = this.ab;
    Intent localIntent2 = new Intent(localmbf2, ExperimentsBrowserActivity.class);
    localIntent2.putExtra("account_id", j);
    localhts.d = localIntent2;
    localhts.aa = true;
    Intent localIntent3 = new Intent(this.a, GplusTracingSettingsActivity.class);
    localIntent3.putExtra("account_id", this.ab);
    localhts.Z = localIntent3;
    localkfo1.a.a(localhts, null);
    kfo localkfo2 = this.aa;
    htv localhtv = new htv();
    mbf localmbf3 = this.a;
    int k = this.ab;
    Intent localIntent4 = new Intent(localmbf3, NetworkTransactionsActivity.class);
    localIntent4.putExtra("account_id", k);
    localhtv.d = localIntent4;
    mbf localmbf4 = this.a;
    int m = this.ab;
    Intent localIntent5 = new Intent(localmbf4, NetworkStatisticsActivity.class);
    localIntent5.putExtra("account_id", m);
    localhtv.Z = localIntent5;
    mbf localmbf5 = this.a;
    int n = this.ab;
    Intent localIntent6 = new Intent(localmbf5, UploadStatisticsActivity.class);
    localIntent6.putExtra("account_id", n);
    localhtv.aa = localIntent6;
    localhtv.c = true;
    localhtv.b = true;
    localkfo2.a.a(localhtv, null);
    kfo localkfo3 = this.aa;
    hty localhty = new hty();
    localhty.a = true;
    localhty.b = true;
    localkfo3.a.a(localhty, null);
    kfo localkfo4 = this.aa;
    ltx localltx = new ltx();
    localkfo4.a.a(localltx, null);
    kfo localkfo5 = this.aa;
    jau localjau = new jau();
    localkfo5.a.a(localjau, null);
    kfo localkfo6 = this.aa;
    htl localhtl = new htl();
    Bundle localBundle = new Bundle();
    localBundle.putInt("account_id", this.ab);
    localhtl.f(localBundle);
    localkfo6.a.a(localhtl, null);
    x();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dol
 * JD-Core Version:    0.7.0.1
 */