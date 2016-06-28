import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class cie
  extends cjx
{
  int Z;
  ckc a;
  boolean aa;
  private final cw<otf> ab;
  int b;
  String c;
  String d;
  
  public cie()
  {
    new gzc(this, new cig(this));
    this.ab = new cif(this);
  }
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.ab);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(104);
  }
  
  public final Integer C()
  {
    return Integer.valueOf(4);
  }
  
  public final int R_()
  {
    switch (this.b)
    {
    default: 
      return 0;
    case 9: 
      return 127;
    case 10: 
      return 14;
    }
    return 13;
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
    this.a = new ckc(this);
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    paramgpr.a(this.c);
  }
  
  public final gya r_()
  {
    return gya.q;
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.ab);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cie
 * JD-Core Version:    0.7.0.1
 */