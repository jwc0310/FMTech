import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import java.util.ArrayList;

public final class cjo
  extends cjx
{
  private ckc a;
  private boolean b;
  private final cw<ArrayList<hur>> c = new cjp(this);
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.c);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(124);
  }
  
  public final Integer C()
  {
    return Integer.valueOf(4);
  }
  
  public final int R_()
  {
    return 62;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    a(this.a);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aj = true;
    this.a = new ckc(this);
  }
  
  public final void a(PeopleListRowView paramPeopleListRowView, String paramString)
  {
    this.b = true;
    super.a(paramPeopleListRowView, paramString);
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    paramgpr.d(aau.hK);
  }
  
  public final void a(ArrayList<odg> paramArrayList)
  {
    this.a.a(paramArrayList, 1);
    this.a.notifyDataSetChanged();
    J();
  }
  
  protected final int af_()
  {
    return efj.vw;
  }
  
  public final void b_(View paramView)
  {
    gxz localgxz2;
    if (this.b)
    {
      localgxz2 = gxz.bR;
      this.b = false;
    }
    for (gxz localgxz1 = localgxz2;; localgxz1 = gxz.bQ)
    {
      int i = this.am.c();
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = localgxz1;
      localgxx.a(localgxw);
      super.b_(paramView);
      return;
    }
  }
  
  public final gya r_()
  {
    return gya.q;
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjo
 * JD-Core Version:    0.7.0.1
 */