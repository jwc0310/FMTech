import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.HashSet;
import java.util.Map;

public final class caw
  extends cff
  implements cw<Cursor>, dty
{
  private Integer Z;
  private ColumnGridView a;
  private final hwq aa;
  private final dme ab;
  private cxr b;
  private boolean c;
  private boolean d;
  
  public caw()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.aa = localhwq;
    this.ab = new cax(this);
  }
  
  private final void c(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (v()) {
      if ((this.c) && (!this.d) && (this.Z == null))
      {
        hwq localhwq3 = this.aa;
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
      a(this.aa);
      G();
      return;
      hwq localhwq2 = this.aa;
      hwt localhwt2 = hwt.a;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      continue;
      hwq localhwq1 = this.aa;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle, efj.ua);
    String str = this.m.getString("gaia_id");
    if (TextUtils.isEmpty(str)) {
      str = this.am.f().b("gaia_id");
    }
    int i = new jrh(this.bn).b;
    this.b = new cxr(this.bn, null, str, this.am.c(), i);
    this.b.g = this;
    this.a = ((ColumnGridView)localView.findViewById(aaw.dS));
    this.a.a = false;
    this.a.a(i);
    mbf localmbf = this.bn;
    DisplayMetrics localDisplayMetrics = efj.K(localmbf);
    int j = (int)(localmbf.getResources().getDimension(ehr.ea) * efj.a(localDisplayMetrics));
    this.a.b(j);
    this.a.setPadding(j, j, j, j);
    ColumnGridView localColumnGridView = this.a;
    cay localcay = new cay();
    localColumnGridView.e.c = localcay;
    this.a.a(this.b);
    this.a.d(efj.qM);
    if (v())
    {
      hwq localhwq = this.aa;
      hwt localhwt = hwt.a;
      if (localhwt == null) {
        throw new NullPointerException();
      }
      localhwq.g = ((hwt)localhwt);
      localhwq.a();
    }
    k().a(0, null, this);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    String str = this.m.getString("gaia_id");
    if (TextUtils.isEmpty(str)) {
      str = this.am.f().b("gaia_id");
    }
    return new cxt(this.bn, this.am.c(), jrf.a(2, new String[] { str }));
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    boolean bool = true;
    if ((this.Z == null) || (this.Z.intValue() != paramInt)) {
      return;
    }
    this.Z = null;
    int i;
    if (paramdmx != null) {
      if (paramdmx.c != 200)
      {
        i = bool;
        if (i == 0) {
          break label100;
        }
        label48:
        this.aB = bool;
        if (!this.aB) {
          break label105;
        }
        String str = g().getString(aau.rQ);
        Toast.makeText(f(), str, 0).show();
      }
    }
    for (;;)
    {
      c(this.N);
      return;
      i = 0;
      break;
      label100:
      bool = false;
      break label48;
      label105:
      ColumnGridView localColumnGridView = this.a;
      localColumnGridView.removeAllViews();
      localColumnGridView.d();
      localColumnGridView.a();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("refresh_request")) {
        this.Z = Integer.valueOf(paramBundle.getInt("refresh_request"));
      }
      this.c = paramBundle.getBoolean("first_load_finished", false);
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    if (this.aA.c()) {
      paramtp.c(false);
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return super.a(paramMenuItem);
  }
  
  public final boolean a(View paramView)
  {
    String str = (String)paramView.getTag(aaw.kX);
    bp localbp = f();
    if ((localbp == null) || (TextUtils.isEmpty(str))) {
      return false;
    }
    int i = this.am.c();
    if (this.aA.b == 1)
    {
      Intent localIntent2 = efj.a(localbp, i, str, this.m.getInt("photo_picker_crop_mode", 0), this.m.getBoolean("external", false), this.aC, Integer.valueOf(this.m.getInt("destination")), false, this.m.getInt("photo_min_width"), this.m.getInt("photo_min_height"));
      this.au.a(aaw.iY, localIntent2);
    }
    for (;;)
    {
      return true;
      jqa localjqa = new jqa(localbp, HostStreamSingleAlbumTileActivity.class, i);
      localjqa.a = str;
      localjqa.c = Integer.valueOf(this.aA.b);
      localjqa.f = this.az.b;
      Intent localIntent1 = localjqa.a();
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.do;
      localgxx.a(localgxw);
      b(localIntent1);
    }
  }
  
  public final void a_(boolean paramBoolean)
  {
    this.d = false;
    if ((paramBoolean) && (f() != null)) {
      z_();
    }
    c(this.N);
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    if (this.aA.c())
    {
      paramgpr.d(aau.cd);
      return;
    }
    paramgpr.d(aau.oc);
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
    a(paramgpr, 1);
    paramgpr.c(aaw.jv).setVisible(false);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.Z != null) {
      paramBundle.putInt("refresh_request", this.Z.intValue());
    }
    paramBundle.putBoolean("first_load_finished", this.c);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.ab);
    if (this.a != null) {
      this.a.e();
    }
    if (this.Z != null)
    {
      int i = this.Z.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i))) {
        break label103;
      }
      if (v())
      {
        hwq localhwq = this.aa;
        hwt localhwt = hwt.a;
        if (localhwt == null) {
          throw new NullPointerException();
        }
        localhwq.g = ((hwt)localhwt);
        localhwq.a();
      }
    }
    return;
    label103:
    dmx localdmx = EsService.a(this.Z.intValue());
    a(this.Z.intValue(), localdmx);
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.ab;
    EsService.d.remove(localdme);
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
    return gya.an;
  }
  
  public final boolean t_()
  {
    if (this.m.getBoolean("finish_on_back", false)) {
      return super.s_();
    }
    return super.t_();
  }
  
  protected final boolean v()
  {
    if (this.b == null) {}
    for (Cursor localCursor = null; (localCursor == null) || (localCursor.getCount() == 0); localCursor = this.b.c) {
      return true;
    }
    return false;
  }
  
  public final boolean y_()
  {
    return (this.Z != null) || (super.y_());
  }
  
  public final void z_()
  {
    super.z_();
    if (this.Z != null) {
      return;
    }
    String str = this.m.getString("gaia_id");
    if (TextUtils.isEmpty(str)) {
      str = this.am.f().b("gaia_id");
    }
    this.aB = false;
    this.Z = Integer.valueOf(EsService.b(this.bn, this.am.c(), str, null));
    c(this.N);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dx;
    localgxx.a(localgxw);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     caw
 * JD-Core Version:    0.7.0.1
 */