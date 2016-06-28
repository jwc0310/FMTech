import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.social.ui.views.slidingtab.SlidingTabLayout;

public final class boy
  extends mca
  implements gpq, jxu, ts
{
  private boolean Z;
  private boz a;
  private jxt b;
  private git c;
  private ViewPager d;
  
  public boy()
  {
    new gpk(this, this.bp, this);
    gxi localgxi = new gxi(this, this.bp);
    this.bo.a(gxp.class, localgxi);
  }
  
  public static boy a(boolean paramBoolean)
  {
    boy localboy = new boy();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("clx_enable_search", paramBoolean);
    localboy.f(localBundle);
    return localboy;
  }
  
  public final bk H_()
  {
    if (this.a == null) {
      return null;
    }
    return this.a.b;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    bp localbp = f();
    View localView = paramLayoutInflater.cloneInContext(new ContextThemeWrapper(localbp, efj.zC)).inflate(aau.wj, paramViewGroup, false);
    this.a = new boz(this.bn, h(), this.c, this.Z, this.b);
    this.d = ((ViewPager)localView.findViewById(efj.zw));
    this.d.a(this.a);
    ((SlidingTabLayout)localView.findViewById(efj.zo)).a(this.d);
    if ((localbp instanceof iww))
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.topMargin = ((int)(localLayoutParams.topMargin + efj.y(localbp)));
      ((iww)localbp).a("clx", 0L);
    }
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = this.m.getBoolean("clx_enable_search");
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(tp paramtp)
  {
    paramtp.b(ehr.s);
  }
  
  public final void a(tr paramtr)
  {
    this.d.b(paramtr.a());
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((git)this.bo.a(git.class));
    this.b = ((jxt)this.bo.a(jxt.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boy
 * JD-Core Version:    0.7.0.1
 */