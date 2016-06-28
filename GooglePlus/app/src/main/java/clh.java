import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class clh
  extends cjx
{
  clj a;
  private final cw<Cursor> b = new cli(this);
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.b);
  }
  
  public final int R_()
  {
    return 69;
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
    this.a = new clj(this, this.bn, null);
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    paramgpr.d(aau.bN);
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     clh
 * JD-Core Version:    0.7.0.1
 */