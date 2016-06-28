import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public final class cjq
  extends cjx
{
  cjs a;
  Intent b;
  private final cw<Cursor> c = new cjr(this);
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.c);
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
    this.a = new cjs(this, this.bn, null);
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    paramgpr.d(aau.mw);
    paramgpr.b(aaw.C);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem.getItemId() == aaw.C) && (this.b != null))
    {
      a(this.b);
      return true;
    }
    return super.a(paramMenuItem);
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjq
 * JD-Core Version:    0.7.0.1
 */