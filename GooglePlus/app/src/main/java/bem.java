import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.apps.photos.viewer.pager.core.PhotoFragmentTouchHandler;
import com.google.android.apps.plus.views.TouchInterceptParent;
import com.google.android.libraries.social.ui.views.DeprecatedExpandingScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bem
  extends mca
  implements gpq, gxv, gzi, hdt, lux
{
  bfi Z;
  public final gpk a = new gpk(this, this.bp, this);
  baa aa;
  PhotoFragmentTouchHandler ab;
  public bdk ac;
  public boolean ad;
  bdi ae;
  final bef af;
  DeprecatedExpandingScrollView ag;
  View ah;
  public boolean ai;
  private final hue aj = new hue(this.bp);
  private final bfd ak = new bfd();
  private axr al;
  private axk am;
  private bev an;
  private final bel ao = new bel(this);
  private final bxf ap = new bxf(this);
  private final ber aq = new ber(this);
  private final axu ar = new axu(this);
  private dfm as;
  private final hwq at = new hwq(this.bp);
  bxe b;
  public final List<bex> c = new ArrayList();
  azh d;
  
  public bem()
  {
    new hwh(this.bp);
    new bez(this, this.bp, axk.a, new ben(this));
    new jeq(this.bp, new beo(this), '\000');
    new jeq(this.bp, new bep(this));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(bbf.class);
    localArrayList.add(ayo.class);
    this.af = new bef(this, this.bp, new bei(this, localArrayList), new beq(this));
    gxl localgxl = new gxl(new kuz(this, pjx.f));
    this.bo.a(gxs.class, localgxl);
  }
  
  static View a(View paramView, int paramInt1, int paramInt2)
  {
    View localView = paramView.findViewById(paramInt1);
    if (localView != null) {
      return localView;
    }
    return ((ViewStub)paramView.findViewById(paramInt2)).inflate();
  }
  
  private final void a(cl paramcl, Bundle paramBundle, int paramInt, Class<? extends bk> paramClass)
  {
    bk localbk;
    try
    {
      localbk = (bk)paramClass.newInstance();
      localbk.f(paramBundle);
      if ((localbk instanceof bfi)) {
        this.Z = ((bfi)localbk);
      }
      for (;;)
      {
        if (paramInt == 0) {
          break label212;
        }
        paramcl.a(paramInt, localbk, a(paramClass));
        return;
        if (!(localbk instanceof azh)) {
          break;
        }
        this.d = ((azh)localbk);
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;)
      {
        String str2 = String.valueOf(paramClass);
        Log.e("PhotoFragment", 31 + String.valueOf(str2).length() + "Couldn't instantiate fragment: " + str2, localInstantiationException);
        throw new RuntimeException(localInstantiationException);
        if ((localbk instanceof baa)) {
          this.aa = ((baa)localbk);
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      String str1 = String.valueOf(paramClass);
      Log.e("PhotoFragment", 31 + String.valueOf(str1).length() + "Couldn't instantiate fragment: " + str1, localIllegalAccessException);
      throw new RuntimeException(localIllegalAccessException);
    }
    label212:
    paramcl.a(localbk, a(paramClass));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.vK, paramViewGroup, false);
    if (localView == null) {
      throw new IllegalArgumentException("Couldn't inflate view.");
    }
    bw localbw1 = h();
    this.al = ((axr)localbw1.a(a(axr.class)));
    this.am = ((axk)localbw1.a(a(axk.class)));
    int i;
    if (this.al == null)
    {
      i = 1;
      if (this.am != null) {
        break label115;
      }
    }
    label115:
    for (int j = 1;; j = 0)
    {
      if ((i ^ j) == 0) {
        break label121;
      }
      throw new IllegalStateException("All or no mandatory child fragments must be found.");
      i = 0;
      break;
    }
    label121:
    int k;
    if (this.al != null) {
      k = 1;
    }
    cl localcl;
    Bundle localBundle2;
    for (;;)
    {
      if (k == 0)
      {
        bw localbw2 = h();
        if ((localbw2.f() != null) && (localbw2.f().size() != 0))
        {
          throw new IllegalStateException("Fragments already added!");
          k = 0;
        }
        else
        {
          localcl = localbw2.a();
          Bundle localBundle1 = this.m;
          this.al = new axr();
          this.al.f(localBundle1);
          this.am = new axk();
          this.am.f(localBundle1);
          localcl.a(this.al, a(axr.class));
          localcl.a(aaw.hq, this.am, a(axk.class));
          if (!this.an.a)
          {
            localBundle2 = this.m;
            a(localcl, localBundle2, aaw.eZ, axe.class);
            if ((!this.an.e) && (!this.an.g) && (!this.an.f) && (!this.an.h)) {
              break label955;
            }
          }
        }
      }
    }
    label955:
    for (int m = 1;; m = 0)
    {
      if (m != 0) {
        a(localcl, localBundle2, aaw.hr, bfi.class);
      }
      if (this.an.e)
      {
        a(localcl, localBundle2, 0, bfn.class);
        a(localcl, localBundle2, 0, avt.class);
        a(localcl, localBundle2, 0, awy.class);
        a(localcl, localBundle2, 0, ayv.class);
        a(localcl, localBundle2, 0, awc.class);
        a(localcl, localBundle2, 0, avj.class);
        a(localcl, localBundle2, 0, ayk.class);
        a(localcl, localBundle2, 0, ayq.class);
        a(localcl, localBundle2, 0, ayg.class);
        a(localcl, localBundle2, 0, ayz.class);
      }
      if (this.an.h) {
        a(localcl, localBundle2, 0, avm.class);
      }
      if (this.an.f) {
        a(localcl, localBundle2, 0, avz.class);
      }
      if (this.an.g) {
        a(localcl, localBundle2, 0, axz.class);
      }
      if (this.an.d) {
        a(localcl, localBundle2, aaw.hu, ayo.class);
      }
      if (this.an.c)
      {
        a(localcl, localBundle2, 0, axw.class);
        a(localcl, localBundle2, aaw.aV, azh.class);
        a(localcl, localBundle2, aaw.aV, baw.class);
        git localgit = (git)mbb.a(this.bn, git.class);
        if (localgit.f().c("is_google_plus")) {
          a(localcl, localBundle2, aaw.ia, azd.class);
        }
        if (!((hyi)mbb.a(aI_(), hyi.class)).b(bwb.a, localgit.c())) {
          a(localcl, localBundle2, aaw.hv, bbf.class);
        }
        a(localcl, localBundle2, 0, bal.class);
        a(localcl, localBundle2, 0, baa.class);
      }
      if (this.an.b)
      {
        azm localazm = new azm();
        localazm.f(localBundle2);
        localcl.a(aaw.bg, localazm, a(azm.class));
      }
      if ((this.an.c) && (this.an.g)) {
        a(localcl, localBundle2, aaw.bx, axb.class);
      }
      localcl.b();
      axr localaxr = this.al;
      localaxr.a = this.ar;
      localaxr.w();
      if (this.an.c)
      {
        this.ab = ((PhotoFragmentTouchHandler)localView.findViewById(aaw.lO));
        if (this.ab != null)
        {
          TouchInterceptParent localTouchInterceptParent = (TouchInterceptParent)localView.findViewById(aaw.lP);
          this.ab.a = localTouchInterceptParent;
          this.ab.d = true;
          this.ab.c = this.af.b;
          this.ag = ((DeprecatedExpandingScrollView)a(localView, aaw.dv, aaw.dw));
          this.ag.f = this.aq;
        }
      }
      return localView;
    }
  }
  
  final String a(Class<? extends bk> paramClass)
  {
    String str1 = String.valueOf(paramClass.getName());
    String str2 = String.valueOf(this.m.getString("pager_identifier"));
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    hak localhak = new hak(this.bn, this.x);
    localhak.a(this, null, true);
    localgzj.a(localhak);
    localgzj.a.add(this);
  }
  
  final void a(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (x())
    {
      int i;
      if (this.am.ad == axo.a) {
        i = 1;
      }
      while ((i == 0) && (!this.al.v()))
      {
        hwq localhwq5 = this.at;
        int j = aau.jH;
        localhwq5.d = null;
        localhwq5.c = j;
        localhwq5.e();
        hwq localhwq6 = this.at;
        hwt localhwt4 = hwt.c;
        if (localhwt4 == null)
        {
          throw new NullPointerException();
          i = 0;
        }
        else
        {
          localhwq6.g = ((hwt)localhwt4);
          localhwq6.a();
        }
      }
    }
    for (;;)
    {
      this.a.a();
      return;
      if ((this.ao.c()) && (!this.an.a))
      {
        hwq localhwq4 = this.at;
        hwt localhwt3 = hwt.a;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq4.g = ((hwt)localhwt3);
        localhwq4.a();
      }
      else
      {
        hwq localhwq2 = this.at;
        localhwq2.d = null;
        localhwq2.c = 0;
        localhwq2.e();
        hwq localhwq3 = this.at;
        hwt localhwt2 = hwt.c;
        if (localhwt2 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt2);
        localhwq3.a();
        continue;
        hwq localhwq1 = this.at;
        hwt localhwt1 = hwt.b;
        if (localhwt1 == null) {
          throw new NullPointerException();
        }
        localhwq1.g = ((hwt)localhwt1);
        localhwq1.a();
      }
    }
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    a(paramView);
  }
  
  public final void a(gpr paramgpr)
  {
    if (this.ac.b.D())
    {
      gqe localgqe = (gqe)paramgpr.a(aaw.iq);
      localgqe.b = Math.max(1, localgqe.b);
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("GetRedirectUrlTask".equals(paramString)) && (this.as != null)) {
      this.as.a(paramhae);
    }
  }
  
  public final void a(tp paramtp)
  {
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(paramtp, bool);
      int i = mbb.a(this.bn, "com.google.android.libraries.social.appid", 300);
      int j = 0;
      if (i == 2) {
        j = 1;
      }
      if (j == 0)
      {
        efj.a(paramtp, true);
        paramtp.c(true);
      }
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.iq)
    {
      this.ak.a(bfd.a);
      return true;
    }
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    boolean bool1 = true;
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.b = ((bxe)this.bo.a(bxe.class));
    mbf localmbf = this.bn;
    Bundle localBundle = this.m;
    bew localbew1 = new bew();
    localbew1.a = localBundle.getBoolean("for_animation", false);
    bew localbew2;
    if (localbew1.a) {
      localbew2 = localbew1;
    }
    int i;
    for (;;)
    {
      this.an = new bev(localbew2);
      this.bo.a(bey.class, new bet(this));
      this.bo.a(beu.class, new bes(this));
      this.bo.a(bfd.class, this.ak);
      this.as = new dfm(this.bn);
      this.bo.a(lli.class, this.as);
      this.ac = new bdk(this.aj);
      this.ae = new bdi();
      mbb localmbb = this.bo;
      localmbb.a(bdk.class, this.ac);
      localmbb.a(bdj.class, new bdj(this.aj));
      localmbb.a(bdi.class, this.ae);
      localmbb.a(bdm.class, new bdm(this.aj));
      if (this.an.c)
      {
        this.bo.a(bdg.class, new bdg(this.aj));
        this.bo.a(bdf.class, new bdf(this.aj));
      }
      return;
      i = localBundle.getInt("account_id", -1);
      if ((!localBundle.getBoolean("disable_chromecast", bool1)) && (localmbf != null) && (!localBundle.getBoolean("for_animation", false))) {}
      for (boolean bool2 = bool1;; bool2 = false)
      {
        localbew1.b = bool2;
        localbew1.d = bool1;
        if (!localBundle.getBoolean("force_return_edit_list", false)) {
          break label404;
        }
        localbew1.g = bool1;
        localbew2 = localbew1;
        break;
      }
      label404:
      if ((!((atu)mbb.a(localmbf, atu.class)).c()) || (localBundle.getBoolean("selected_only", false))) {
        break;
      }
      localbew2 = localbew1;
    }
    boolean bool3;
    label448:
    boolean bool4;
    label476:
    boolean bool5;
    if (i != -1)
    {
      bool3 = bool1;
      localbew1.c = bool3;
      localbew1.e = bool1;
      if (localBundle.getBoolean("prevent_share", false)) {
        break label536;
      }
      bool4 = bool1;
      localbew1.f = bool4;
      if (localBundle.getBoolean("prevent_edit", false)) {
        break label542;
      }
      bool5 = bool1;
      label498:
      localbew1.g = bool5;
      if (localBundle.getBoolean("prevent_delete", false)) {
        break label548;
      }
    }
    for (;;)
    {
      localbew1.h = bool1;
      localbew2 = localbew1;
      break;
      bool3 = false;
      break label448;
      label536:
      bool4 = false;
      break label476;
      label542:
      bool5 = false;
      break label498;
      label548:
      bool1 = false;
    }
  }
  
  public final void h(Bundle paramBundle)
  {
    if (this.as != null) {
      this.as.h(paramBundle);
    }
  }
  
  public final void m()
  {
    super.m();
    this.b.a(this.ao);
    this.b.a(this.ap);
  }
  
  public final void n()
  {
    super.n();
    this.b.b(this.ao);
    this.b.b(this.ap);
  }
  
  public final gya r_()
  {
    return gya.ad;
  }
  
  public final boolean t_()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      if (((bex)localIterator.next()).o_()) {
        return true;
      }
    }
    return false;
  }
  
  public final void v()
  {
    if ((this.ai) && (this.ad)) {
      efj.a(this);
    }
  }
  
  final boolean x()
  {
    if (this.am != null)
    {
      if (this.am.ad != axo.b) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bem
 * JD-Core Version:    0.7.0.1
 */