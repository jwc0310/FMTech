import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public final class cwj
  extends mca
  implements View.OnClickListener
{
  private boolean Z;
  private git a;
  private hhh aa;
  private jev b;
  private TextView c;
  private boolean d;
  
  public cwj()
  {
    new gxj(this.bp, (byte)0);
  }
  
  private final boolean v()
  {
    return (this.Z) || (this.d);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.uR, null);
    bw localbw = h();
    bk localbk = localbw.a("onboarding_sul_content");
    if (v()) {
      ((TextView)localView.findViewById(aaw.kH)).setText(this.bn.getString(aau.hC));
    }
    Bundle localBundle;
    Object localObject;
    if (localbk == null)
    {
      localBundle = new Bundle();
      localBundle.putBoolean("ActionBarFragmentMixin.Enabled", false);
      if (!v()) {
        break label207;
      }
      localObject = ((bot)this.bo.a(bot.class)).g();
      localBundle.putBoolean("featured_clx_enable_open_detail_view", this.Z);
      localBundle.putBoolean("clx_enable_search", false);
    }
    for (;;)
    {
      ((bk)localObject).f(localBundle);
      cl localcl = localbw.a();
      localcl.b(aaw.kI, (bk)localObject, "onboarding_sul_content");
      localcl.b();
      this.c = ((TextView)localView.findViewById(aaw.gI));
      this.c.setOnClickListener(new gxn(this));
      efj.a(this.c, new gxq(pju.v));
      return localView;
      label207:
      localObject = new ciy();
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
    this.b = ((jev)this.bo.a(jev.class));
    int i = this.a.c();
    this.aa = ((hhh)mbb.a(this.bn, hhh.class));
    gxt localgxt = pju.w;
    this.Z = this.aa.f(i);
    this.d = this.aa.g(i);
    if (v()) {
      localgxt = pju.u;
    }
    gxl localgxl = new gxl(localgxt);
    this.bo.a(gxs.class, localgxl);
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.c)
    {
      cwk.a(this.bn, this.a.c());
      this.b.f();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwj
 * JD-Core Version:    0.7.0.1
 */