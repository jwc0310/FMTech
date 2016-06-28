import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.RecyclerListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import java.util.HashSet;
import java.util.Map;

public final class dbm
  extends mca
  implements AbsListView.RecyclerListener, AdapterView.OnItemClickListener, bzw, cw<Cursor>, gpq, gxv
{
  String Z;
  git a;
  private final gpk aa = new gpk(this, this.bp, this);
  private Integer ab;
  private Integer ac;
  private Integer ad;
  private hxj ae;
  private boolean af;
  private bzv ag;
  private final dme ah;
  Integer b;
  String c;
  String d;
  
  public dbm()
  {
    new gzc(this, new dbq(this));
    this.ah = new dbn(this);
  }
  
  private final void b(int paramInt)
  {
    if (((paramInt == 1) || (paramInt == 0)) && (this.ab == null)) {
      this.ab = Integer.valueOf(EsService.b(this.bn, this.a.c(), this.d));
    }
    if (((paramInt == 2) || (paramInt == 0)) && (this.ac == null))
    {
      mbf localmbf = this.bn;
      int i = this.a.c();
      String str1 = this.d;
      String str2 = this.Z;
      Intent localIntent = EsService.e.a(localmbf, EsService.class);
      localIntent.putExtra("op", 910);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("event_id", str1);
      localIntent.putExtra("auth_key", str2);
      localIntent.putExtra("include_blacklist", true);
      this.ac = Integer.valueOf(EsService.a(localmbf, localIntent));
    }
    v();
  }
  
  private final void v()
  {
    this.aa.a();
    if ((this.ab == null) && (this.ac == null)) {
      this.af = false;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    String str = this.a.f().b("domain_name");
    View localView = paramLayoutInflater.inflate(efj.vv, paramViewGroup, false);
    ListView localListView = (ListView)localView.findViewById(16908298);
    localListView.setAdapter(this.ag);
    localListView.setOnItemClickListener(this);
    localListView.setRecyclerListener(this);
    this.ag.i = str;
    cv localcv = k();
    localcv.b(0, null, this);
    localcv.b(1, null, this);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    bp localbp = f();
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new dbo(this, localbp, hxi.a, localbp);
    }
    return new bzx(f(), this.a.c(), this.d, this.c);
  }
  
  final void a(int paramInt)
  {
    coo.a(null, g().getString(paramInt), false, false).a(this.x, "req_pending");
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1)
    {
      switch (paramInt1)
      {
      default: 
        return;
      }
      gxx localgxx2 = (gxx)this.bo.a(gxx.class);
      gxw localgxw2 = new gxw(this.bn);
      localgxw2.c = gxz.az;
      localgxx2.a(localgxw2);
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    }
    gxx localgxx1 = (gxx)this.bo.a(gxx.class);
    gxw localgxw1 = new gxw(this.bn);
    localgxw1.c = gxz.ay;
    localgxx1.a(localgxw1);
    dbp localdbp = new dbp(this, (gnb)paramIntent.getParcelableExtra("extra_acl"));
    efj.m().post(localdbp);
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    if ((this.ad == null) || (paramInt != this.ad.intValue())) {}
    for (;;)
    {
      return;
      bj localbj = (bj)this.x.a("req_pending");
      if (localbj != null) {
        localbj.a(false);
      }
      this.ad = null;
      if (paramdmx != null)
      {
        if (paramdmx.c != 200) {}
        for (int i = 1; i != 0; i = 0)
        {
          Toast.makeText(f(), aau.uV, 0).show();
          return;
        }
      }
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ag = new bzv(paramActivity);
    this.ag.h = this;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.af = true;
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("id")) {
        this.d = paramBundle.getString("id");
      }
      if (paramBundle.containsKey("ownerid")) {
        this.c = paramBundle.getString("ownerid");
      }
      if (paramBundle.containsKey("invitemoreid")) {
        this.b = Integer.valueOf(paramBundle.getInt("invitemoreid"));
      }
      if (paramBundle.containsKey("inviteesreq")) {
        this.ac = Integer.valueOf(paramBundle.getInt("inviteesreq"));
      }
      if (paramBundle.containsKey("eventreq")) {
        this.ab = Integer.valueOf(paramBundle.getInt("eventreq"));
      }
      if (paramBundle.containsKey("eventaddremovereq")) {
        this.ad = Integer.valueOf(paramBundle.getInt("eventaddremovereq"));
      }
      if (paramBundle.containsKey("inviteesrefreshneeded")) {
        this.af = paramBundle.getBoolean("inviteesrefreshneeded");
      }
    }
    this.ag.g = this.a.f().b("gaia_id");
    this.ag.f = this.c;
    if (this.af) {
      b(0);
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    if ((bqo.b(f(), this.ae, this.a.c())) && (this.a.f().c("is_google_plus"))) {
      paramgpr.b(aaw.D);
    }
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
    if ((this.ab != null) || (this.ac != null)) {
      localgqe.a = true;
    }
    if (this.ae != null) {
      paramgpr.a(this.ae.b());
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a(aau.gJ);
    this.ad = Integer.valueOf(EsService.a(this.bn, this.a.c(), this.d, this.Z, true, paramString1, paramString2));
  }
  
  public final void a(tp paramtp)
  {
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(paramtp, bool);
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == aaw.iq)
    {
      b(0);
      return true;
    }
    if (i == aaw.D)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.aw;
      localgxx.a(localgxw);
      int j = this.a.c();
      bp localbp = f();
      int k = aau.gl;
      String str = g().getString(k);
      Boolean localBoolean = this.ae.f().b.b.a;
      boolean bool;
      if (localBoolean == null)
      {
        bool = false;
        if (!bool) {
          break label171;
        }
      }
      label171:
      for (int m = 12;; m = 11)
      {
        a(efj.a(localbp, j, str, null, m, false, false, true, false), 0);
        return true;
        bool = localBoolean.booleanValue();
        break;
      }
    }
    return false;
  }
  
  final void b(int paramInt, dmx paramdmx)
  {
    if ((this.ac == null) || (this.ac.intValue() != paramInt)) {
      return;
    }
    if (this.ab == null) {
      this.af = false;
    }
    if (paramdmx != null)
    {
      int i = paramdmx.c;
      int j = 0;
      if (i != 200) {
        j = 1;
      }
      if (j == 0) {
        k().b(1, null, this);
      }
    }
    this.ac = null;
    v();
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(String paramString1, String paramString2)
  {
    a(aau.gH);
    this.ad = Integer.valueOf(EsService.a(this.bn, this.a.c(), this.d, this.Z, false, paramString1, paramString2));
  }
  
  public final void b(tp paramtp) {}
  
  final void c(int paramInt, dmx paramdmx)
  {
    if (this.ab != null) {
      this.ab.intValue();
    }
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label56;
      }
    }
    label56:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        k().b(0, null, this);
      }
      this.ab = null;
      v();
      return;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.a = ((git)this.bo.a(git.class));
  }
  
  final void d(int paramInt, dmx paramdmx)
  {
    if ((this.b == null) || (paramInt != this.b.intValue())) {
      return;
    }
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
    this.b = null;
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        Toast.makeText(f(), aau.uV, 0).show();
        return;
      }
    }
    b(2);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("id", this.d);
    paramBundle.putString("ownerid", this.c);
    if (this.b != null) {
      paramBundle.putInt("invitemoreid", this.b.intValue());
    }
    if (this.ac != null) {
      paramBundle.putInt("inviteesreq", this.ac.intValue());
    }
    if (this.ab != null) {
      paramBundle.putInt("eventreq", this.ab.intValue());
    }
    if (this.ad != null) {
      paramBundle.putInt("eventaddremovereq", this.ad.intValue());
    }
    paramBundle.putBoolean("inviteesrefreshneeded", this.af);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.ah);
    if (this.b != null)
    {
      int m = this.b.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(m)))
      {
        dmx localdmx4 = EsService.a(this.b.intValue());
        d(this.b.intValue(), localdmx4);
        this.b = null;
      }
    }
    if (this.ac != null)
    {
      int k = this.ac.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(k)))
      {
        dmx localdmx3 = EsService.a(this.ac.intValue());
        b(this.ac.intValue(), localdmx3);
        this.ac = null;
      }
    }
    if (this.ab != null)
    {
      int j = this.ab.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(j)))
      {
        dmx localdmx2 = EsService.a(this.ab.intValue());
        c(this.ab.intValue(), localdmx2);
        this.ab = null;
      }
    }
    if (this.ad != null)
    {
      int i = this.ad.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx1 = EsService.a(this.ad.intValue());
        a(this.ad.intValue(), localdmx1);
        this.ad = null;
      }
    }
    if (this.af) {
      b(0);
    }
  }
  
  public final void n()
  {
    dme localdme = this.ah;
    EsService.d.remove(localdme);
    super.n();
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((paramView instanceof jop))
    {
      String str = ((jop)paramView).c;
      if (str != null)
      {
        boolean bool1 = TextUtils.equals(str, this.a.f().b("gaia_id"));
        boolean bool2 = this.a.f().c("is_google_plus");
        if ((!bool1) || (bool2)) {
          a(efj.a(f(), this.a.c(), str, null, false));
        }
      }
    }
  }
  
  public final void onMovedToScrapHeap(View paramView)
  {
    if ((paramView instanceof lxj)) {
      ((lxj)paramView).D_();
    }
  }
  
  public final gya r_()
  {
    return gya.B;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbm
 * JD-Core Version:    0.7.0.1
 */