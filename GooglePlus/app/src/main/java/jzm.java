import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.ui.views.slidingtab.SlidingTabLayout;

public final class jzm
  extends mca
  implements gpq, ts
{
  private boolean Z;
  private ViewPager a;
  private String b;
  private String c;
  private boolean d;
  
  public jzm()
  {
    new gpk(this, this.bp, this);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.bn).inflate(efj.TX, paramViewGroup, false);
    jzp localjzp = new jzp(this.bn, h(), this.c, this.b, this.d, this.Z);
    this.a = ((ViewPager)localView.findViewById(aw.dw));
    this.a.a(localjzp);
    ((SlidingTabLayout)localView.findViewById(aw.dB)).a(this.a);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.c = localBundle.getString("profile_gaia_id");
    this.b = localBundle.getString("profile_name");
    this.d = localBundle.getBoolean("has_collexions");
    this.Z = localBundle.getBoolean("has_squares");
  }
  
  public final void a(gpr paramgpr) {}
  
  @TargetApi(21)
  public final void a(tp paramtp)
  {
    mbf localmbf = this.bn;
    int i = efj.Ub;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.b;
    paramtp.a(localmbf.getString(i, arrayOfObject));
    efj.a(paramtp, true);
    if (Build.VERSION.SDK_INT >= 21) {
      paramtp.a(0.0F);
    }
  }
  
  public final void a(tr paramtr)
  {
    this.a.b(paramtr.a());
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzm
 * JD-Core Version:    0.7.0.1
 */