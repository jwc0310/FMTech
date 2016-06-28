import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class clo
  extends cjx
{
  private ckc a;
  private int b;
  private final cw<ArrayList<hur>> c = new clp(this);
  
  public clo() {}
  
  public clo(boolean paramBoolean)
  {
    this.as = paramBoolean;
  }
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.c);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(103);
  }
  
  public final Integer C()
  {
    return Integer.valueOf(4);
  }
  
  public final int R_()
  {
    if (this.b == 1) {
      return 63;
    }
    if (this.b == 17) {
      return 93;
    }
    return 0;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    a(this.a);
    return localView;
  }
  
  protected final hgh a(int paramInt1, int paramInt2)
  {
    return new hvk(R_(), Integer.valueOf(103), Integer.valueOf(4));
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aj = true;
    this.a = new ckc(this);
    this.b = f().getIntent().getExtras().getInt("people_view_type", -1);
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    paramgpr.d(aau.hE);
  }
  
  public final void a(ArrayList<odg> paramArrayList)
  {
    this.a.a(paramArrayList, 2);
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
    k().a(2, null, this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     clo
 * JD-Core Version:    0.7.0.1
 */