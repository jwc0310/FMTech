import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class cjm
  extends cjx
{
  private ckc a;
  private final cw<ArrayList<hur>> b = new cjn(this);
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.b);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(117);
  }
  
  public final Integer C()
  {
    return Integer.valueOf(4);
  }
  
  protected final boolean H()
  {
    return true;
  }
  
  public final int R_()
  {
    return 66;
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
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    paramgpr.d(aau.hH);
  }
  
  public final void a(ArrayList<odg> paramArrayList)
  {
    this.a.a(paramArrayList, 5);
    this.a.notifyDataSetChanged();
    J();
  }
  
  public final gya r_()
  {
    return gya.q;
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjm
 * JD-Core Version:    0.7.0.1
 */