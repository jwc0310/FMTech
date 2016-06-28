import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.AutoAwesomeMovieTileView;
import com.google.android.apps.plus.views.NewAutoAwesomeMovieTileView;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.UUID;

public final class ccv
  extends cff
  implements View.OnClickListener, cw<Cursor>
{
  private ColumnGridView a;
  private dcd b;
  private boolean c;
  private final hwq d = new hwq(this.bp);
  
  private final void a(View paramView, boolean paramBoolean)
  {
    if (paramView == null) {
      return;
    }
    if (v())
    {
      hwq localhwq2 = this.d;
      hwt localhwt2 = hwt.a;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      this.a.setVisibility(8);
    }
    for (;;)
    {
      Y_();
      G();
      return;
      hwq localhwq1 = this.d;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      this.a.setVisibility(0);
    }
  }
  
  private final boolean b(int paramInt)
  {
    return ((iwb)this.bo.a(iwb.class)).a(paramInt);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.uk);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    mbf localmbf = this.bn;
    this.am.c();
    this.b = new dcd(localmbf);
    this.b.c = this;
    this.a = ((ColumnGridView)localView.findViewById(aaw.dS));
    this.a.b(i);
    this.a.a(new jrh(this.bn).a);
    this.a.c = true;
    ColumnGridView localColumnGridView1 = this.a;
    ccw localccw = new ccw();
    localColumnGridView1.e.c = localccw;
    this.a.a(this.b);
    this.a.d(efj.qM);
    ColumnGridView localColumnGridView2 = this.a;
    localColumnGridView2.s = this;
    localColumnGridView2.c(0);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(aaw.it)).a = this.a;
    this.c = b(this.am.c());
    if ((this.am.e()) && (this.c)) {
      k().a(0, null, this);
    }
    a(localView, false);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new cxz(this.bn, this.am.c(), this.aC);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    dcd localdcd;
    if (paramfu.i == 0)
    {
      localdcd = this.b;
      localdcd.a(2, null);
      if ((localdcd.a) && (0 != 0) && (null.getCount() != 0)) {
        break label53;
      }
      localdcd.b = null;
    }
    for (;;)
    {
      localdcd.a(1, localdcd.b);
      return;
      label53:
      if (localdcd.b == null)
      {
        localdcd.b = new hqr(new String[0]);
        Object[] arrayOfObject = new Object[0];
        localdcd.b.a(arrayOfObject);
      }
    }
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return super.a(paramMenuItem);
  }
  
  public final boolean a(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    if ((paramView instanceof NewAutoAwesomeMovieTileView))
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.dQ;
      localgxx.a(localgxw);
      Intent localIntent = ((iwb)this.bo.a(iwb.class)).a(true);
      localIntent.putExtra("movie_maker_session_id", UUID.randomUUID().toString());
      localIntent.putExtra("account_id", this.am.c());
      b(localIntent);
      return true;
    }
    if (paramView.getTag(aaw.la) == null) {
      return false;
    }
    if ((paramView instanceof AutoAwesomeMovieTileView))
    {
      String str = (String)paramView.getTag(aaw.kX);
      b(((anz)mbb.a(this.bn, anz.class)).a(str, false));
      return true;
    }
    return false;
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    paramgpr.d(aau.ls);
    efj.k(this.N);
  }
  
  public final void m()
  {
    super.m();
    boolean bool = this.c;
    this.c = b(this.am.c());
    if (bool != this.c)
    {
      if (!this.c) {
        break label67;
      }
      k().a(0, null, this);
    }
    for (;;)
    {
      this.N.findViewById(aaw.dC).requestFocus();
      return;
      label67:
      k().a(0);
    }
  }
  
  public final void p_()
  {
    super.p_();
    lwo.c(this.a);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.a);
  }
  
  public final gya r_()
  {
    return gya.aj;
  }
  
  protected final boolean v()
  {
    return (this.b != null) && (this.b.getCount() == 0);
  }
  
  public final boolean z()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccv
 * JD-Core Version:    0.7.0.1
 */