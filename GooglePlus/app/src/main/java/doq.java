import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.Switch;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class doq
  extends mca
  implements dnu, gxv, jer<hba>, kds
{
  static final String[] a = { "auto_upload_enabled", "auto_upload_account_id", "sync_on_wifi_only", "sync_on_roaming", "sync_on_battery", "video_upload_wifi_only", "upload_full_resolution" };
  private static IntentFilter aq;
  static final String[] b = { "quota_limit", "quota_used", "quota_unlimited" };
  static final Uri c = Uri.parse("https://www.google.com/settings/storage/");
  static boolean d;
  PreferenceCategory Z;
  private kdp aA = new kdp(this, this.bp);
  private kez aB;
  private cw<Map<String, Object>> aC = new dot(this, this, this.aA, this.bp);
  dob aa;
  kej ab;
  dob ac;
  CheckBoxPreference ad;
  CheckBoxPreference ae;
  ket af;
  boolean ag;
  boolean ah;
  boolean ai;
  Handler aj;
  boolean ak;
  hba al;
  giz am;
  Map<String, Object> an;
  SparseArray<dpi> ao;
  final hue ap = new hue(this.bp);
  private CheckBoxPreference ar;
  private PreferenceCategory as;
  private keh at;
  private ket au;
  private ket av;
  private boolean aw;
  private kep ax;
  private hyi ay;
  private final BroadcastReceiver az = new dor(this);
  
  private final void a(List<Integer> paramList, gxz paramgxz)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      a((Integer)localIterator.next(), paramgxz);
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ax = new kep((tt)paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aj = new Handler(this.bn.getMainLooper());
    if (paramBundle != null)
    {
      this.ai = paramBundle.getBoolean("dialog_shown");
      this.ah = paramBundle.getBoolean("loaded_quota_settings");
    }
    if (aq == null)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      aq = localIntentFilter;
      localIntentFilter.addAction("com.google.android.libraries.social.autobackup.upload_all_progress");
    }
  }
  
  final void a(Integer paramInteger, gxz paramgxz)
  {
    if (paramInteger.intValue() != -1)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, paramInteger.intValue());
      localgxw.c = paramgxz;
      localgxx.a(localgxw);
    }
  }
  
  final void a(kex paramkex)
  {
    List localList = this.al.a();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      localArrayList.add(this.am.a(localInteger.intValue()));
    }
    dnt localdnt = new dnt(this.bn, localList, this.ao);
    localdnt.o = paramkex;
    localdnt.a = this;
    this.Z.b(localdnt);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!i()) {}
    while ((paramBoolean) || (this.al.c())) {
      return;
    }
    k().b(2).a();
  }
  
  final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = true;
    boolean bool2 = TextUtils.equals(this.ab.c, "WIFI_ONLY");
    kej localkej = this.ab;
    boolean bool3;
    boolean bool4;
    label67:
    label89:
    CheckBoxPreference localCheckBoxPreference;
    if ((paramBoolean2) && (!d))
    {
      bool3 = bool1;
      localkej.b(bool3);
      dob localdob = this.ac;
      if ((!paramBoolean2) || (d) || (bool2)) {
        break label191;
      }
      bool4 = bool1;
      localdob.b(bool4);
      if (!this.ak) {
        break label197;
      }
      this.at.b(paramBoolean2);
      this.av.b(bool1);
      localCheckBoxPreference = this.ad;
      if ((!paramBoolean2) || (d)) {
        break label216;
      }
    }
    for (;;)
    {
      localCheckBoxPreference.b(bool1);
      this.ae.b(paramBoolean2);
      this.af.b(paramBoolean2);
      Switch localSwitch = this.ax.b;
      if (localSwitch != null)
      {
        localSwitch.setChecked(paramBoolean2);
        localSwitch.setEnabled(paramBoolean1);
      }
      ((dnt)this.Z.a.get(0)).b(paramBoolean2);
      return;
      bool3 = false;
      break;
      label191:
      bool4 = false;
      break label67;
      label197:
      this.aa.b(paramBoolean2);
      this.au.b(paramBoolean2);
      break label89;
      label216:
      bool1 = false;
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  final void b(kex paramkex)
  {
    int i = this.al.d();
    this.ak = this.ay.b(bwb.J, i);
    this.as.d();
    if (this.ak)
    {
      PreferenceCategory localPreferenceCategory2 = this.as;
      int i6 = aau.vn;
      localPreferenceCategory2.b(g().getString(i6));
      if (duj.b(this.bn)) {}
      for (Intent localIntent = duj.f(this.bn);; localIntent = duj.a(this.bn, "utm_source=googleplus_photos&utm_medium=android&utm_campaign=plus_backup_settings"))
      {
        kez localkez2 = this.aB;
        int i7 = aau.oI;
        String str2 = g().getString(i7);
        int i8 = aau.oG;
        String str3 = g().getString(i8);
        int i9 = aau.mW;
        String str4 = g().getString(i9);
        keh localkeh = new keh(localkez2.a);
        localkeh.b(str2);
        localkeh.a_(str3);
        localkeh.a = localIntent;
        localkeh.b = str4;
        this.at = localkeh;
        this.as.b(this.at);
        return;
      }
    }
    PreferenceCategory localPreferenceCategory1 = this.as;
    int j = aau.cx;
    localPreferenceCategory1.b(g().getString(j));
    this.aa = new dob(this.bn);
    dob localdob1 = this.aa;
    int k = aau.oH;
    localdob1.b(g().getString(k));
    dob localdob2 = this.aa;
    int m = aau.oH;
    localdob2.h = g().getString(m);
    dob localdob3 = this.aa;
    int n = aau.oF;
    localdob3.a_(g().getString(n));
    dob localdob4 = this.aa;
    int i1 = aau.oD;
    localdob4.a(g().getString(i1));
    this.aa.b = g().getStringArray(efj.iT);
    this.aa.c = g().getStringArray(efj.iV);
    dob localdob5 = this.aa;
    int i2 = aau.oE;
    localdob5.d(g().getString(i2));
    this.aa.w = false;
    this.aa.d = g().getStringArray(efj.iU);
    this.aa.o = paramkex;
    this.as.b(this.aa);
    kez localkez1 = this.aB;
    int i3 = aau.mM;
    String str1 = g().getString(i3);
    int i4 = aau.mL;
    this.au = localkez1.a(str1, g().getString(i4));
    ket localket = this.au;
    int i5 = aau.mK;
    localket.d(g().getString(i5));
    this.au.w = false;
    this.au.p = new dow(this);
    this.as.b(this.au);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.al = ((hba)this.bo.a(hba.class));
    this.ay = ((hyi)this.bo.a(hyi.class));
    this.am = ((giz)this.bo.a(giz.class));
    if (!((ixf)this.bo.a(ixf.class)).d()) {}
    for (boolean bool = true;; bool = false)
    {
      d = bool;
      return;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("dialog_shown", this.ai);
    paramBundle.putBoolean("loaded_quota_settings", this.ah);
  }
  
  public final void m()
  {
    super.m();
    this.al.a.a(this, false);
  }
  
  public final void n()
  {
    super.n();
    this.al.a.a(this);
    w();
  }
  
  public final gya r_()
  {
    return gya.n;
  }
  
  final void v()
  {
    if (!this.aw)
    {
      this.aw = true;
      this.bn.registerReceiver(this.az, aq);
    }
  }
  
  final void w()
  {
    if (this.aw)
    {
      this.aw = false;
      this.bn.unregisterReceiver(this.az);
    }
  }
  
  public final void x()
  {
    k().a(2, null, this.aC);
  }
  
  public final void y()
  {
    k().b(2, null, this.aC);
  }
  
  public final void z()
  {
    this.aB = new kez(this.bn);
    doz localdoz = new doz(this);
    kez localkez1 = this.aB;
    int i = aau.nv;
    String str1 = g().getString(i);
    int j = aau.nu;
    this.ar = localkez1.c(str1, g().getString(j));
    this.ar.a(Boolean.valueOf(false));
    CheckBoxPreference localCheckBoxPreference1 = this.ar;
    int k = aau.or;
    localCheckBoxPreference1.d(g().getString(k));
    this.ar.w = false;
    this.ar.o = localdoz;
    kep localkep = this.ax;
    CheckBoxPreference localCheckBoxPreference2 = this.ar;
    if (localCheckBoxPreference2 != null)
    {
      localkep.b = new Switch(localkep.a);
      tp localtp = localkep.a.e().a();
      int i23 = localkep.a.getResources().getDimensionPixelSize(efj.kt);
      localkep.b.setPadding(0, 0, i23, 0);
      localtp.a(16, 16);
      localtp.a(localkep.b, new tq(-2, -2, 8388629));
      localkep.b.setOnCheckedChangeListener(new keq(localkep, localCheckBoxPreference2));
      localkep.b.setChecked(localCheckBoxPreference2.b);
    }
    kez localkez2 = this.aB;
    int m = aau.vm;
    this.Z = localkez2.b(g().getString(m));
    a(localdoz);
    this.as = this.aB.b(null);
    b(localdoz);
    kez localkez3 = this.aB;
    int n = aau.cw;
    PreferenceCategory localPreferenceCategory1 = localkez3.b(g().getString(n));
    kez localkez4 = this.aB;
    int i1 = aau.mR;
    String str2 = g().getString(i1);
    int i2 = aau.mQ;
    this.ab = localkez4.g(str2, g().getString(i2));
    kej localkej1 = this.ab;
    int i3 = aau.mN;
    localkej1.a(g().getString(i3));
    this.ab.a = g().getStringArray(efj.iR);
    this.ab.b = g().getStringArray(efj.iS);
    kej localkej2 = this.ab;
    int i4 = aau.mO;
    localkej2.d(g().getString(i4));
    this.ab.w = false;
    this.ab.o = localdoz;
    localPreferenceCategory1.b(this.ab);
    this.ac = new dob(this.bn);
    dob localdob1 = this.ac;
    int i5 = aau.vt;
    localdob1.b(g().getString(i5));
    dob localdob2 = this.ac;
    int i6 = aau.vt;
    localdob2.h = g().getString(i6);
    dob localdob3 = this.ac;
    int i7 = aau.vs;
    localdob3.a_(g().getString(i7));
    dob localdob4 = this.ac;
    int i8 = aau.vp;
    localdob4.a(g().getString(i8));
    this.ac.b = g().getStringArray(efj.iX);
    this.ac.c = g().getStringArray(efj.iZ);
    dob localdob5 = this.ac;
    int i9 = aau.vq;
    localdob5.d(g().getString(i9));
    this.ac.w = false;
    this.ac.d = g().getStringArray(efj.iY);
    this.ac.o = localdoz;
    localPreferenceCategory1.b(this.ac);
    kez localkez5 = this.aB;
    int i10 = aau.nQ;
    String str3 = g().getString(i10);
    int i11 = aau.nP;
    this.ad = localkez5.c(str3, g().getString(i11));
    this.ad.a(Boolean.valueOf(g().getBoolean(efj.jg)));
    CheckBoxPreference localCheckBoxPreference3 = this.ad;
    int i12 = aau.nO;
    localCheckBoxPreference3.d(g().getString(i12));
    this.ad.w = false;
    this.ad.o = localdoz;
    localPreferenceCategory1.b(this.ad);
    kez localkez6 = this.aB;
    int i13 = aau.nC;
    String str4 = g().getString(i13);
    int i14 = aau.nB;
    this.ae = localkez6.c(str4, g().getString(i14));
    this.ae.a(Boolean.valueOf(g().getBoolean(efj.jd)));
    CheckBoxPreference localCheckBoxPreference4 = this.ae;
    int i15 = aau.nA;
    localCheckBoxPreference4.d(g().getString(i15));
    this.ae.w = false;
    this.ae.o = localdoz;
    localPreferenceCategory1.b(this.ae);
    kez localkez7 = this.aB;
    int i16 = aau.on;
    String str5 = g().getString(i16);
    int i17 = aau.om;
    this.af = localkez7.a(str5, g().getString(i17));
    ket localket1 = this.af;
    int i18 = aau.ol;
    localket1.d(g().getString(i18));
    this.af.w = false;
    this.af.p = new dou(this);
    localPreferenceCategory1.b(this.af);
    kez localkez8 = this.aB;
    int i19 = aau.aF;
    PreferenceCategory localPreferenceCategory2 = localkez8.b(g().getString(i19));
    kez localkez9 = this.aB;
    int i20 = aau.ny;
    String str6 = g().getString(i20);
    int i21 = aau.nx;
    this.av = localkez9.a(str6, g().getString(i21));
    ket localket2 = this.av;
    int i22 = aau.nw;
    localket2.d(g().getString(i22));
    this.av.w = false;
    this.av.p = new dov(this);
    localPreferenceCategory2.b(this.av);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     doq
 * JD-Core Version:    0.7.0.1
 */