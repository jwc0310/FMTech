import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;
import java.util.List;

public final class lde
  extends mca
  implements cw<Cursor>, gpq, gpw, gxs, gzi, kyc, kyd, kye, lfb, lvy
{
  private static final String[] a = { "membership_status", "joinability" };
  private final hwq Z;
  private final lvz aa;
  private git ab;
  private String ac;
  private int ad;
  private int ae;
  private ListView af;
  private lfa ag;
  private leu ah;
  private int ai;
  private int aj;
  private boolean ak;
  private int al;
  private ActionBarSpinner am;
  private final gpk b = new gpk(this, this.bp, this);
  private final les c = new les(this, this.bp);
  private final let d = new let(this, this.bp, this.c);
  
  public lde()
  {
    hwq localhwq = new hwq(this.bp);
    int i = eyg.bJ;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.Z = localhwq;
    this.aa = new lvz(this, this.bp, aau.Cc);
    new gxj(this.bp, (byte)0);
  }
  
  private final void a(View paramView)
  {
    View localView1 = paramView.findViewById(16908298);
    View localView2 = paramView.findViewById(aau.Ce);
    if (this.ak)
    {
      localView1.setVisibility(8);
      localView2.setVisibility(0);
      this.Z.a(hwt.b);
    }
    for (;;)
    {
      this.b.a();
      return;
      if (y())
      {
        localView1.setVisibility(8);
        localView2.setVisibility(8);
        this.Z.a(hwt.a);
      }
      else
      {
        if ((y()) || (this.ag.isEmpty())) {}
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label139;
          }
          localView1.setVisibility(8);
          localView2.setVisibility(8);
          this.Z.a(hwt.c);
          break;
        }
        label139:
        localView1.setVisibility(0);
        localView2.setVisibility(8);
        this.Z.a(hwt.b);
      }
    }
  }
  
  private final void x()
  {
    this.al = 0;
    k().b(0, null, this);
    this.af.setSelection(0);
  }
  
  private final boolean y()
  {
    if (this.ag != null) {
      if (this.ag.aN[0].c != null) {
        break label34;
      }
    }
    label34:
    for (int i = 1;; i = 0)
    {
      boolean bool = false;
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
  }
  
  private final void z()
  {
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    if ((!localgzj.a("fetch_newer")) && (f() != null))
    {
      lez locallez = new lez(f(), this.ab.c(), this.ac, 0, null, 100);
      locallez.f = "fetch_newer";
      localgzj.b(locallez);
    }
    lvz locallvz = this.aa;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    }
    this.b.a();
  }
  
  public final void A_()
  {
    this.aa.b();
    z();
  }
  
  public final String N()
  {
    return this.ac;
  }
  
  public final int O()
  {
    return this.ad;
  }
  
  public final boolean O_()
  {
    return ((gzj)this.bo.a(gzj.class)).a("fetch_newer");
  }
  
  public final int a()
  {
    return this.ae;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(aau.Ch, paramViewGroup, false);
    this.af = ((ListView)localView.findViewById(16908298));
    this.af.setAdapter(this.ag);
    k().a(0, null, this);
    k().a(1, null, this);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new lfd(f(), this.ab.c(), this.ac, this.aj, lfa.a);
    }
    return new kzo(this.bn, this.ab.c(), this.ac, a);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ac = this.m.getString("square_id");
    mbf localmbf;
    if (paramBundle != null)
    {
      this.ad = paramBundle.getInt("membership_status", -1);
      this.ae = paramBundle.getInt("joinability", -1);
      this.aj = paramBundle.getInt("current_member_list", 1);
      this.ah = new leu(this.bn, aau.Cg);
      localmbf = this.bn;
      int i = this.ad;
      if ((i != 2) && (i != 1)) {
        break label197;
      }
    }
    label197:
    for (boolean bool = true;; bool = false)
    {
      this.ag = new lfa(localmbf, bool, (lfc)this.bo.a(lfc.class), this);
      return;
      Intent localIntent = f().getIntent();
      this.ad = localIntent.getIntExtra("square_membership", -1);
      this.ae = localIntent.getIntExtra("square_joinability", -1);
      if (this.m.containsKey("square_member_list_type")) {
        this.aj = this.m.getInt("square_member_list_type", 1);
      }
      z();
      break;
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(aau.Cd);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public final void a(String paramString)
  {
    int i = ((lev)this.ah.getItem(this.ai)).a;
    int j = 500 - this.ag.e_(0);
    lez locallez = new lez(f(), this.ab.c(), this.ac, i, paramString, j);
    locallez.f = "fetch_older";
    ((gzj)this.bo.a(gzj.class)).b(locallez);
    if (Log.isLoggable("HostedSquareMemberList", 3)) {
      new StringBuilder(40).append("onLoadMoreMembers maxToFetch=").append(j);
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("fetch_newer".equals(paramString)) || ("fetch_older".equals(paramString)))
    {
      if (Log.isLoggable("HostedSquareMemberList", 3))
      {
        String str = String.valueOf(paramhae);
        new StringBuilder(29 + String.valueOf(str).length()).append("onReadSquareMembersComplete: ").append(str);
      }
      if (!hae.a(paramhae)) {
        break label121;
      }
      if (!this.ak)
      {
        bp localbp = f();
        int i = eyg.bI;
        Toast.makeText(localbp, g().getString(i), 0).show();
      }
    }
    for (;;)
    {
      this.b.a();
      paramhaa.c = false;
      return;
      label121:
      if (this.ak) {
        k().b(0, null, this);
      }
    }
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    View localView = View.inflate(this.bn, aau.Cf, null);
    ActionBarSpinner localActionBarSpinner = (ActionBarSpinner)localView.findViewById(aau.Cb);
    localActionBarSpinner.setAdapter(this.ah);
    this.ah.a();
    this.ai = this.ah.a(this.aj);
    localActionBarSpinner.setSelection(this.ai);
    localActionBarSpinner.a(this);
    this.am = localActionBarSpinner;
    paramtp.a(localView);
    paramtp.e(true);
    efj.a(paramtp, true);
    paramtp.d(false);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aau.Cd)
    {
      z();
      return true;
    }
    return false;
  }
  
  public final boolean a_(int paramInt)
  {
    if (this.ai == paramInt) {
      return false;
    }
    mbf localmbf = this.bn;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjo.aE);
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(this.bn)).b(localmbf);
    this.ai = paramInt;
    this.aj = ((lev)this.ah.getItem(this.ai)).a;
    x();
    return true;
  }
  
  public final void b(tp paramtp)
  {
    paramtp.a(null);
    paramtp.e(false);
    paramtp.d(true);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ab = ((git)this.bo.a(git.class));
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    this.bo.a(gxs.class, this);
    this.bo.a(lex.class, this.c);
    this.bo.a(lfc.class, this.d);
    this.bo.a(kye.class, this);
    this.bo.a(kyd.class, this);
    this.bo.a(kyc.class, this);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("membership_status", this.ad);
    paramBundle.putInt("joinability", this.ae);
    paramBundle.putInt("current_member_list", this.aj);
  }
  
  public final void m()
  {
    super.m();
    a(this.N);
  }
  
  public final gxq v()
  {
    return new kuw(pjo.x, this.ac);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lde
 * JD-Core Version:    0.7.0.1
 */