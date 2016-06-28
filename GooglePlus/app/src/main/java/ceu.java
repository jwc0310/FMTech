import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.plus.phone.TileCropActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.HashSet;
import java.util.Map;

public final class ceu
  extends cff
  implements View.OnClickListener, cw<Cursor>
{
  private boolean Z;
  int a;
  private Integer aa;
  private final hwq ab;
  private final dme ac;
  boolean b;
  String c;
  private dec d;
  
  public ceu()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.ab = localhwq;
    new gzc(this, new cew(this));
    this.ac = new cev(this);
  }
  
  private final void c(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (v()) {
      if ((this.Z) && (this.aa == null))
      {
        hwq localhwq3 = this.ab;
        hwt localhwt3 = hwt.c;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt3);
        localhwq3.a();
      }
    }
    for (;;)
    {
      a(this.ab);
      G();
      return;
      hwq localhwq2 = this.ab;
      hwt localhwt2 = hwt.a;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      continue;
      hwq localhwq1 = this.ab;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
    }
  }
  
  protected final boolean X_()
  {
    return this.m.getBoolean("external", false);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle, efj.uk);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    this.d = new dec(this.bn, null, this.am.c(), this.c);
    this.d.g = this;
    ColumnGridView localColumnGridView = (ColumnGridView)localView.findViewById(aaw.dS);
    localColumnGridView.b(i);
    localColumnGridView.a(new jrh(this.bn).a);
    localColumnGridView.c = true;
    cex localcex = new cex();
    localColumnGridView.e.c = localcex;
    localColumnGridView.a(this.d);
    localColumnGridView.d(efj.qM);
    ((CanScrollVerticallyDelegateFrameLayout)localView.findViewById(aaw.it)).a = localColumnGridView;
    k().a(0, null, this);
    c(localView);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new dee(this.bn, this.am.c(), this.c, null);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    if (((paramInt1 == i) || (paramInt1 == 2)) && (paramInt2 != 0)) {}
    while ((i != 0) || (this.ao))
    {
      f().setResult(paramInt2, paramIntent);
      f().finish();
      return;
      i = 0;
    }
    super.a(paramInt1, paramInt2, paramIntent);
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    boolean bool = true;
    if ((this.aa == null) || (this.aa.intValue() != paramInt)) {
      return;
    }
    this.aa = null;
    int i;
    if (paramdmx != null) {
      if (paramdmx.c != 200)
      {
        i = bool;
        if (i == 0) {
          break label100;
        }
      }
    }
    for (;;)
    {
      this.aB = bool;
      if (this.aB)
      {
        String str = g().getString(aau.rQ);
        Toast.makeText(f(), str, 0).show();
      }
      c(this.N);
      return;
      i = 0;
      break;
      label100:
      bool = false;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      if (paramBundle.containsKey("refresh_request")) {
        this.aa = Integer.valueOf(paramBundle.getInt("refresh_request"));
      }
    }
    for (;;)
    {
      if (TextUtils.isEmpty(this.c)) {
        this.c = jrf.a(1, new String[0]);
      }
      return;
      if (this.m.containsKey("destination")) {
        switch (this.m.getInt("destination"))
        {
        default: 
          break;
        case 1: 
          b(true);
        }
      }
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    paramtp.c(false);
  }
  
  public final boolean a(View paramView)
  {
    String str = (String)paramView.getTag(aaw.ln);
    if (TextUtils.isEmpty(str)) {
      return false;
    }
    int i = ((Integer)paramView.getTag(aaw.lo)).intValue();
    int j = this.am.c();
    if (i == 0)
    {
      PhotoTileView localPhotoTileView = (PhotoTileView)paramView;
      gxx localgxx2 = (gxx)this.bo.a(gxx.class);
      gxw localgxw2 = new gxw(this.bn);
      localgxw2.c = gxz.dm;
      localgxx2.a(localgxw2);
      if (!a(localPhotoTileView.t))
      {
        dbu localdbu = new dbu(f(), TileCropActivity.class, j);
        localdbu.a = localPhotoTileView.t;
        localdbu.c = this.c;
        localdbu.d = str;
        localdbu.b = this.a;
        localdbu.e = Integer.valueOf(this.m.getInt("photo_min_width", 0));
        localdbu.f = Integer.valueOf(this.m.getInt("photo_min_height", 0));
        a(localdbu.a(), 1);
      }
    }
    for (;;)
    {
      return true;
      if (i != 1) {
        break;
      }
      jqa localjqa = efj.c(this.bn, j, jrf.a());
      localjqa.c = Integer.valueOf(1);
      localjqa.e = Integer.valueOf(this.a);
      localjqa.t = Integer.valueOf(this.aC);
      localjqa.h = Boolean.valueOf(this.aE);
      localjqa.i = Boolean.valueOf(this.aG);
      localjqa.j = this.aH;
      localjqa.g = Boolean.valueOf(this.m.getBoolean("external", false));
      localjqa.m = Integer.valueOf(this.m.getInt("photo_min_width", 0));
      localjqa.n = Integer.valueOf(this.m.getInt("photo_min_height", 0));
      Intent localIntent = localjqa.a();
      gxx localgxx1 = (gxx)this.bo.a(gxx.class);
      gxw localgxw1 = new gxw(this.bn);
      localgxw1.c = gxz.dn;
      localgxx1.a(localgxw1);
      a(localIntent, 2);
    }
    throw new IllegalStateException(37 + "Whoa! We got a tile type: " + i);
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
    paramgpr.d(aau.nF);
    if (this.b) {
      c(paramgpr);
    }
  }
  
  protected final void b_(String paramString)
  {
    super.b_(paramString);
    if ((this.a != 0) && (!TextUtils.isEmpty(paramString)))
    {
      ipf localipf = ipf.a(this.bn, Uri.parse(paramString), ipm.a);
      int i = this.am.c();
      dbu localdbu = new dbu(this.bn, TileCropActivity.class, i);
      localdbu.a = localipf;
      localdbu.b = this.a;
      a(localdbu.a(), 1);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.aa != null) {
      paramBundle.putInt("refresh_request", this.aa.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.ac);
    if (this.aa != null)
    {
      int i = this.aa.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i))) {
        break label89;
      }
      if (v())
      {
        hwq localhwq = this.ab;
        hwt localhwt = hwt.a;
        if (localhwt == null) {
          throw new NullPointerException();
        }
        localhwq.g = ((hwt)localhwt);
        localhwq.a();
      }
    }
    return;
    label89:
    dmx localdmx = EsService.a(this.aa.intValue());
    a(this.aa.intValue(), localdmx);
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.ac;
    EsService.d.remove(localdme);
  }
  
  public final void p_()
  {
    super.p_();
    lwo.c(this.N);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.N);
  }
  
  public final gya r_()
  {
    return gya.ap;
  }
  
  public final boolean t_()
  {
    f().setResult(0);
    return super.t_();
  }
  
  protected final boolean v()
  {
    if (this.d == null) {}
    for (Cursor localCursor = null; (localCursor == null) || (localCursor.getCount() == 0); localCursor = this.d.c) {
      return true;
    }
    return false;
  }
  
  public final boolean y_()
  {
    return (this.aa != null) || (super.y_());
  }
  
  public final boolean z()
  {
    return false;
  }
  
  public final void z_()
  {
    super.z_();
    if (this.aa != null) {
      return;
    }
    this.aB = false;
    bp localbp;
    Intent localIntent;
    if (TextUtils.equals(this.c, jrf.a(1, new String[0])))
    {
      localbp = f();
      int i = this.am.c();
      localIntent = EsService.e.a(localbp, EsService.class);
      localIntent.putExtra("op", 69);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("resumetoken", null);
    }
    for (this.aa = Integer.valueOf(EsService.a(localbp, localIntent));; this.aa = Integer.valueOf(EsService.a(f(), this.am.c(), this.am.f().b("gaia_id"), this.c, null)))
    {
      c(this.N);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.dx;
      localgxx.a(localgxw);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ceu
 * JD-Core Version:    0.7.0.1
 */