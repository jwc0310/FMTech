import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.social.ui.views.slidingtab.SlidingTabLayout;

public final class lcy
  extends mca
  implements gpq, jxu
{
  private git a;
  private ViewPager b;
  private jxt c;
  private lcz d;
  
  public lcy()
  {
    new gpk(this, this.bp, this);
    new gxi(this, this.bp).a(this.bo);
  }
  
  public static lcy a(int paramInt)
  {
    lcy locallcy = new lcy();
    Bundle localBundle = new Bundle();
    localBundle.putInt("squares_tab_index", paramInt);
    locallcy.f(localBundle);
    return locallcy;
  }
  
  public final bk H_()
  {
    if (this.d == null) {
      return null;
    }
    return this.d.b;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    bp localbp = f();
    View localView = paramLayoutInflater.cloneInContext(new ContextThemeWrapper(localbp, efj.Xp)).inflate(efj.Xn, paramViewGroup, false);
    this.b = ((ViewPager)localView.findViewById(az.J));
    this.b.a(this.d);
    ((SlidingTabLayout)localView.findViewById(az.N)).a(this.b);
    Bundle localBundle = this.m;
    if (localBundle != null) {
      this.b.b(localBundle.getInt("squares_tab_index", 0));
    }
    if ((localbp instanceof iww))
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.topMargin = ((int)(localLayoutParams.topMargin + efj.y(localbp)));
      ((iww)localbp).a("squares", 0L);
    }
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = new lcz(this.bn, h(), this.a, this.c);
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(tp paramtp)
  {
    paramtp.b(do.z);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
    this.c = ((jxt)this.bo.b(jxt.class));
    if (this.c == null) {
      this.c = new jxz(f(), this.bp, this).a(this.bo);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcy
 * JD-Core Version:    0.7.0.1
 */