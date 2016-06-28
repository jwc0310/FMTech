import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;

public final class coh
  extends mca
  implements gpq, gxv, lea, lvy
{
  private ColumnGridView Z;
  git a;
  private final cw<oed[]> aa;
  String b;
  com c;
  private final lvz d;
  
  public coh()
  {
    new gpk(this, this.bp, this);
    this.d = new lvz(this, this.bp);
    new gzc(this, new col(this));
    this.aa = new coi(this);
  }
  
  private final void v()
  {
    lvz locallvz = this.d;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    }
  }
  
  public final void A_()
  {
    this.d.b();
    lvz locallvz = this.d;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    }
  }
  
  public final boolean O_()
  {
    return false;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(efj.un, paramViewGroup, false);
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.Z = ((ColumnGridView)paramView.findViewById(aaw.dS));
    this.Z.d(efj.qM);
    this.Z.a = false;
    this.Z.a(efj.x(this.bn));
    int i = (int)this.bn.getResources().getDimension(ehr.ef);
    this.Z.b(i);
    this.Z.setPadding(i, 0, i, 0);
    ColumnGridView localColumnGridView = this.Z;
    cok localcok = new cok(this);
    localColumnGridView.e.c = localcok;
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(String paramString1, String paramString2)
  {
    Intent localIntent = ((kyp)this.bo.a(kyp.class)).a(this.a.c(), paramString1, null);
    localIntent.putExtra("suggestion_id", paramString2);
    localIntent.putExtra("suggestion_ui", 3);
    a(localIntent);
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.iq)
    {
      v();
      return true;
    }
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.a = ((git)this.bo.a(git.class));
    this.bo.a(lfr.class, new lfr(this.bn, this, this.a.c()));
    this.bo.a(lea.class, this);
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.c = new com(this, this.bn);
    this.Z.a(this.c);
    k().a(0, null, this.aa);
  }
  
  public final gya r_()
  {
    return gya.f;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     coh
 * JD-Core Version:    0.7.0.1
 */