import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.plus.views.WarmWelcomeIllustrationView;

public final class dgq
  extends mca
  implements View.OnClickListener, gxs
{
  public boolean a;
  public TextView b;
  public TextView c;
  private jev d;
  
  public dgq()
  {
    new gxj(this.bp, (byte)0);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.bn).inflate(efj.wJ, null);
    if (localView == null) {
      return null;
    }
    if (this.bn.getResources().getConfiguration().orientation == 2) {}
    for (boolean bool = true;; bool = false)
    {
      this.a = bool;
      ((WarmWelcomeIllustrationView)localView.findViewById(aaw.mu)).a = new eal(this);
      this.b = ((TextView)localView.findViewById(aaw.mw));
      this.c = ((TextView)localView.findViewById(aaw.mv));
      TextView localTextView = (TextView)localView.findViewById(aaw.mt);
      localTextView.setOnClickListener(new gxn(this));
      efj.a(localTextView, new gxq(pju.E));
      return localView;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxs.class, this);
    this.d = ((jev)this.bo.a(jev.class));
  }
  
  public final void n()
  {
    super.n();
    bgp.d(f());
  }
  
  public final void onClick(View paramView)
  {
    bgp.d(f());
    this.d.f();
  }
  
  public final gxq v()
  {
    return new gxq(pju.F);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgq
 * JD-Core Version:    0.7.0.1
 */