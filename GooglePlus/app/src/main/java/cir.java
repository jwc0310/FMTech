import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class cir
  extends cjx
{
  private ckc Z;
  int a = -2147483648;
  private final cw<ArrayList<hur>> aa;
  String b;
  Integer c;
  Integer d;
  
  public cir()
  {
    new gzc(this, new cit(this));
    this.aa = new cis(this);
  }
  
  public cir(int paramInt)
  {
    new gzc(this, new cit(this));
    this.aa = new cis(this);
    this.a = paramInt;
  }
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.aa);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(103);
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
    if (this.a == 0) {
      return 64;
    }
    return 65;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    a(this.Z);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.a = paramBundle.getInt("type", -2147483648);
    }
    this.aj = true;
    this.Z = new ckc(this);
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    paramgpr.a(this.b);
  }
  
  public final void a(ArrayList<odg> paramArrayList)
  {
    ckc localckc = this.Z;
    if (this.a == 0) {}
    for (int i = 3;; i = 4)
    {
      localckc.a(paramArrayList, i);
      this.Z.notifyDataSetChanged();
      J();
      return;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("type", this.a);
  }
  
  public final gya r_()
  {
    return gya.q;
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.aa);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cir
 * JD-Core Version:    0.7.0.1
 */