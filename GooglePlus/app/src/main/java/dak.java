import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.plus.service.CastService;
import com.google.android.apps.plus.service.EsSyncAdapterService;
import com.google.android.apps.plus.views.PromoItemCardFactoryExtension;
import com.google.android.apps.plus.views.UpdateItemCardFactoryExtension;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.HttpUrlRequestFactoryConfig;
import org.chromium.net.UrlRequestContextConfig;

public final class dak
{
  public static final String A;
  public static final String B;
  public static final String C;
  public static final String D;
  public static final String E;
  public static final String F;
  public static final String G;
  public static final String H;
  public static final String I;
  public static final String J;
  public static final String K;
  public static final String L;
  public static final String M;
  public static final String N;
  public static final String O;
  public static final String P;
  public static final String Q;
  public static final String R;
  public static final String S;
  public static final String T;
  public static final String U;
  public static final String V;
  public static final String W;
  public static final String X;
  public static final String Y;
  public static final String Z;
  public static final String a = cxg.class.getName();
  public static final String aA = kbv.class.getName();
  public static final String aB = jtk.class.getName();
  public static final String aC = hrz.class.getName();
  private static dae aD;
  public static final String aa;
  public static final String ab;
  public static final String ac;
  public static final String ad;
  public static final String ae;
  public static final String af;
  public static final String ag;
  public static final String ah;
  public static final String ai;
  public static final String aj;
  public static final String ak;
  public static final String al;
  public static final String am;
  public static final String an;
  public static final String ao;
  public static final String ap;
  public static final String aq;
  public static final String ar;
  public static final String as;
  public static final String at;
  public static final String au;
  public static final String av;
  public static final String aw;
  public static final String ax;
  public static final String ay;
  public static final String az;
  public static final String b = log.class.getName();
  public static final String c = ila.class.getName();
  public static final String d = anh.class.getName();
  public static final String e = bwa.class.getName();
  public static final String f = gdx.class.getName();
  public static final String g = jtj.class.getName();
  public static final String h = lll.class.getName();
  public static final String i = CronetEngine.Builder.class.getName();
  public static final String j = ibz.class.getName();
  public static final String k = hgg.class.getName();
  public static final String l = mbx.class.getName();
  public static final String m = hat.class.getName();
  public static final String n = kbp.class.getName();
  public static final String o = jqg.class.getName();
  public static final String p = hzx.class.getName();
  public static final String q = asn.class.getName();
  public static final String r = hem.class.getName();
  public static final String s = jav.class.getName();
  public static final String t = han.class.getName();
  public static final String u = iut.class.getName();
  public static final String v = mce.class.getName();
  public static final String w = hcv.class.getName();
  public static final String x = hal.class.getName();
  public static final String y = cxf.class.getName();
  public static final String z = jay.class.getName();
  
  static
  {
    A = mco.class.getName();
    B = iox.class.getName();
    C = jyc.class.getName();
    D = hyf.class.getName();
    E = dka.class.getName();
    F = mbr.class.getName();
    G = ilt.class.getName();
    H = hbd.class.getName();
    I = hbh.class.getName();
    J = lro.class.getName();
    K = ang.class.getName();
    L = idw.class.getName();
    M = gdw.class.getName();
    N = hbz.class.getName();
    O = bra.class.getName();
    P = iqo.class.getName();
    Q = hdh.class.getName();
    R = ire.class.getName();
    S = ird.class.getName();
    T = gjg.class.getName();
    U = llk.class.getName();
    V = duh.class.getName();
    W = giy.class.getName();
    X = lng.class.getName();
    Y = iev.class.getName();
    Z = lwj.class.getName();
    aa = jaq.class.getName();
    ab = jfa.class.getName();
    ac = kih.class.getName();
    ad = lrj.class.getName();
    ae = iby.class.getName();
    af = icc.class.getName();
    ag = dui.class.getName();
    ah = ifd.class.getName();
    ai = ixq.class.getName();
    aj = iwb.class.getName();
    ak = jye.class.getName();
    al = kcf.class.getName();
    am = ilo.class.getName();
    an = ieb.class.getName();
    ao = lri.class.getName();
    ap = gqv.class.getName();
    aq = kbn.class.getName();
    ar = mcn.class.getName();
    as = hsu.class.getName();
    at = hso.class.getName();
    au = jip.class.getName();
    av = UrlRequestContextConfig.class.getName();
    aw = gpj.class.getName();
    ax = jes.class.getName();
    ay = hta.class.getName();
    az = inj.class.getName();
  }
  
  public static void A(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(lrj.class, EsSyncAdapterService.a(paramContext));
  }
  
  public static void A(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(lng.class, new brw());
  }
  
  public static void B(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(dui.class, new dui(paramContext));
  }
  
  public static void B(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(iev.class, new iew());
  }
  
  public static void C(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    ixq[] arrayOfixq = new ixq[6];
    arrayOfixq[0] = new ixq(paramContext, "enable_quic_transport_layer_android_k", false);
    arrayOfixq[1] = new ixq(paramContext, "enable_quic_no_storage", false);
    arrayOfixq[2] = new ixq(paramContext, "enable_silent_feedback_android_m", false);
    arrayOfixq[3] = new ixq(paramContext, "enable_cronet_histogram_logging", true);
    arrayOfixq[4] = new ixq(paramContext, "enable_memory_metric", false);
    arrayOfixq[5] = new ixq(paramContext, "enable_primes_timer_metric", false);
    parammbb.a(ixq.class, arrayOfixq);
  }
  
  public static void C(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(jfa.class, new ddn());
  }
  
  public static void D(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(iwb.class, new bpy(paramContext));
  }
  
  public static void D(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(iby.class, new bhq());
  }
  
  public static void E(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(kcf.class, new cur());
  }
  
  public static void E(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    icc[] arrayOficc = new icc[1];
    arrayOficc[0] = new csz();
    parammbb.a(icc.class, arrayOficc);
  }
  
  public static void F(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(ilo.class, new dba(paramContext));
  }
  
  public static void F(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(ifd.class, new cup());
  }
  
  public static void G(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(ieb.class, new ier(paramContext, "https://support.google.com/plus/?hl=%locale%"));
  }
  
  public static void G(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(jye.class, new dfi());
  }
  
  public static void H(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(lri.class, new dmv(paramContext));
  }
  
  public static void H(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(kbn.class, new dau());
  }
  
  public static void I(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    gqv[] arrayOfgqv = new gqv[8];
    arrayOfgqv[0] = new bha(paramContext);
    arrayOfgqv[1] = new bgx(paramContext);
    arrayOfgqv[2] = new bgu(paramContext);
    arrayOfgqv[3] = new bgy(paramContext);
    arrayOfgqv[4] = new bgz(paramContext);
    arrayOfgqv[5] = new bhb(paramContext);
    arrayOfgqv[6] = new bgv(paramContext);
    arrayOfgqv[7] = new bhc(paramContext);
    parammbb.a(gqv.class, arrayOfgqv);
  }
  
  public static void I(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(mcn.class, new mcn[0]);
  }
  
  public static void J(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    mbj localmbj = new mbj(paramContext, ixq.class);
    ixq localixq1 = (ixq)localmbj.a.get("enable_quic_transport_layer_android_k");
    boolean bool = fpf.a(localixq1.a, localixq1.b, localixq1.c);
    HttpUrlRequestFactoryConfig localHttpUrlRequestFactoryConfig = new HttpUrlRequestFactoryConfig();
    localHttpUrlRequestFactoryConfig.a("ENABLE_QUIC", bool).a("www.google.com", 443, 443).a("www.gstatic.com", 443, 443).a("www.googleapis.com", 443, 443).a("lh1.googleusercontent.com", 443, 443).a("lh2.googleusercontent.com", 443, 443).a("lh3.googleusercontent.com", 443, 443).a("lh4.googleusercontent.com", 443, 443).a("lh5.googleusercontent.com", 443, 443).a("lh6.googleusercontent.com", 443, 443).a("sp1.googleusercontent.com", 443, 443).a("sp2.googleusercontent.com", 443, 443).a("sp3.googleusercontent.com", 443, 443).a("sp4.googleusercontent.com", 443, 443).a("sp5.googleusercontent.com", 443, 443).a("sp6.googleusercontent.com", 443, 443).a("staging-www.sandbox.googleapis.com", 443, 443).a("test-www.sandbox.googleapis.com", 443, 443).a("staging-daily-www.sandbox.googleapis.com", 443, 443);
    if (bool)
    {
      ixq localixq2 = (ixq)localmbj.a.get("enable_quic_no_storage");
      if (fpf.a(localixq2.a, localixq2.b, localixq2.c)) {}
    }
    else
    {
      File localFile = new File(paramContext.getCacheDir(), "cronet_cache");
      localFile.mkdir();
      String str = localFile.getPath();
      if (!new File(str).isDirectory()) {
        throw new IllegalArgumentException("Storage path must be set to existing directory");
      }
      localHttpUrlRequestFactoryConfig.a("STORAGE_PATH", str).a(2, 1048576L);
    }
    parammbb.a(UrlRequestContextConfig.class, localHttpUrlRequestFactoryConfig);
  }
  
  public static void J(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    hsu[] arrayOfhsu = new hsu[3];
    arrayOfhsu[0] = new bur();
    arrayOfhsu[1] = new bsq();
    arrayOfhsu[2] = new lmy();
    parammbb.a(hsu.class, arrayOfhsu);
  }
  
  public static void K(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hta.class, new hta[0]);
  }
  
  public static void K(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    hso[] arrayOfhso = new hso[1];
    arrayOfhso[0] = new bqi();
    parammbb.a(hso.class, arrayOfhso);
  }
  
  public static void L(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    jtk[] arrayOfjtk = new jtk[6];
    arrayOfjtk[0] = new cve(paramContext);
    arrayOfjtk[1] = new jtl(paramContext);
    arrayOfjtk[2] = new cvf(paramContext);
    arrayOfjtk[3] = new cvg(paramContext);
    arrayOfjtk[4] = new cvd(paramContext);
    arrayOfjtk[5] = new cvc(paramContext);
    parammbb.a(jtk.class, arrayOfjtk);
  }
  
  public static void L(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(jip.class, new daf(aD));
  }
  
  public static void M(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    gpj[] arrayOfgpj = new gpj[4];
    arrayOfgpj[0] = new gqf(aaw.iq);
    arrayOfgpj[1] = new bgt(aaw.aW);
    arrayOfgpj[2] = new gqd(aaw.gj);
    arrayOfgpj[3] = new gqd(aaw.gZ);
    parammbb.a(gpj.class, arrayOfgpj);
  }
  
  public static void N(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    jes[] arrayOfjes = new jes[3];
    arrayOfjes[0] = new cwl();
    arrayOfjes[1] = new cwk();
    arrayOfjes[2] = new cwi();
    parammbb.a(jes.class, arrayOfjes);
  }
  
  public static void O(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(inj.class, new inj[] { (bra)parammbb.a(bra.class) });
  }
  
  public static void P(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    kbv[] arrayOfkbv = new kbv[1];
    arrayOfkbv[0] = new cum();
    parammbb.a(kbv.class, arrayOfkbv);
  }
  
  public static void Q(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hrz.class, new bql());
  }
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(log.class, new log(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(cxg.class, new dfa());
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(anh.class, new anh(paramContext));
  }
  
  public static void b(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(ila.class, new dcs());
  }
  
  public static void c(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(bwa.class, new bqf(paramContext));
  }
  
  public static void c(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    lll[] arrayOflll = new lll[2];
    arrayOflll[0] = new UpdateItemCardFactoryExtension();
    arrayOflll[1] = new PromoItemCardFactoryExtension();
    parammbb.a(lll.class, arrayOflll);
  }
  
  public static void d(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    dae localdae = aD;
    ixq localixq = (ixq)new mbj(paramContext, ixq.class).a.get("enable_primes_timer_metric");
    parammbb.a(gdx.class, new dai(localdae, fpf.a(localixq.a, localixq.b, localixq.c)));
  }
  
  public static void d(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hgg.class, new dlb());
  }
  
  public static void e(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    jtj[] arrayOfjtj = new jtj[3];
    arrayOfjtj[0] = new cva(paramContext);
    arrayOfjtj[1] = new cvb(paramContext);
    arrayOfjtj[2] = new cuz(paramContext);
    parammbb.a(jtj.class, arrayOfjtj);
  }
  
  public static void e(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    mbx[] arrayOfmbx = new mbx[5];
    arrayOfmbx[0] = new csc();
    arrayOfmbx[1] = new cse();
    arrayOfmbx[2] = new bqn();
    arrayOfmbx[3] = new cuw();
    arrayOfmbx[4] = new djn();
    parammbb.a(mbx.class, arrayOfmbx);
  }
  
  public static void f(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(CronetEngine.Builder.class, (CronetEngine.Builder)mbb.a(paramContext, UrlRequestContextConfig.class));
  }
  
  public static void f(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(jqg.class, new CastService());
  }
  
  public static void g(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    ibz[] arrayOfibz = new ibz[9];
    arrayOfibz[0] = new czw();
    arrayOfibz[1] = new ibs();
    arrayOfibz[2] = new dcp(paramContext);
    arrayOfibz[3] = new deh(paramContext);
    arrayOfibz[4] = new csm();
    arrayOfibz[5] = new dgt();
    arrayOfibz[6] = new dca();
    arrayOfibz[7] = new dfd(paramContext);
    arrayOfibz[8] = new ddy();
    parammbb.a(ibz.class, arrayOfibz);
  }
  
  public static void g(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(asn.class, new asn());
  }
  
  public static void h(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    hat[] arrayOfhat = new hat[2];
    arrayOfhat[0] = new crt(paramContext);
    arrayOfhat[1] = new aqq(paramContext);
    parammbb.a(hat.class, arrayOfhat);
  }
  
  public static void h(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hem.class, new czc());
  }
  
  public static void i(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(kbp.class, new bpv(paramContext));
  }
  
  public static void i(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(han.class, new cry());
  }
  
  public static void j(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    iaa localiaa = new iaa(paramContext.getResources().getColor(efj.kg), 0);
    hzy localhzy = new hzy();
    localhzy.a = Uri.parse("https://support.google.com/plus/topic/4409845");
    localhzy.b = localiaa;
    localhzy.c = localiaa;
    parammbb.a(hzx.class, localhzy.a());
  }
  
  public static void j(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    mce[] arrayOfmce = new mce[2];
    arrayOfmce[0] = new cyz();
    arrayOfmce[1] = new czb();
    parammbb.a(mce.class, arrayOfmce);
  }
  
  public static void k(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    jav[] arrayOfjav = new jav[1];
    arrayOfjav[0] = new cus(paramContext);
    parammbb.a(jav.class, arrayOfjav);
  }
  
  public static void k(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hcv.class, new dew());
  }
  
  public static void l(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(iut.class, new dpt(paramContext));
  }
  
  public static void l(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(cxf.class, new dey());
  }
  
  public static void m(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hal.class, new crv(paramContext));
  }
  
  public static void m(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(mco.class, new mco[0]);
  }
  
  public static void n(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(jay.class, new cut(paramContext));
  }
  
  public static void n(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(iox.class, new aru());
  }
  
  public static void o(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(dka.class, new dka(paramContext));
  }
  
  public static void o(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(jyc.class, new dgw());
  }
  
  public static void p(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    bra localbra = (bra)parammbb.a(bra.class);
    ilt[] arrayOfilt = new ilt[2];
    arrayOfilt[0] = localbra;
    arrayOfilt[1] = new cqk(paramContext);
    parammbb.a(ilt.class, arrayOfilt);
  }
  
  public static void p(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    List localList1 = bwb.a();
    hyf[] arrayOfhyf = new hyf[5];
    arrayOfhyf[0] = cwk.a;
    arrayOfhyf[1] = ciy.a;
    arrayOfhyf[2] = dmv.a;
    arrayOfhyf[3] = dpt.a;
    arrayOfhyf[4] = dpt.b;
    List localList2 = Arrays.asList(arrayOfhyf);
    ArrayList localArrayList = new ArrayList(localList1.size() + localList2.size());
    localArrayList.addAll(localList1);
    localArrayList.addAll(localList2);
    parammbb.a(hyf.class, (hyf[])localArrayList.toArray(new hyf[localArrayList.size()]));
  }
  
  public static void q(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hbh.class, new hbh(paramContext));
  }
  
  public static void q(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    mbr[] arrayOfmbr = new mbr[19];
    arrayOfmbr[0] = new aue();
    arrayOfmbr[1] = new atw();
    arrayOfmbr[2] = new ask();
    arrayOfmbr[3] = new cxq();
    arrayOfmbr[4] = new dea();
    arrayOfmbr[5] = new dgp();
    arrayOfmbr[6] = new aoa();
    arrayOfmbr[7] = new anl();
    arrayOfmbr[8] = new ano();
    arrayOfmbr[9] = new anq();
    arrayOfmbr[10] = new ant();
    arrayOfmbr[11] = new anv();
    arrayOfmbr[12] = new aoe();
    arrayOfmbr[13] = new anr();
    arrayOfmbr[14] = new aoi();
    arrayOfmbr[15] = new cyz();
    arrayOfmbr[16] = new czb();
    arrayOfmbr[17] = new daw();
    arrayOfmbr[18] = new cyw();
    parammbb.a(mbr.class, arrayOfmbr);
  }
  
  public static void r(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(idw.class, new daj(aD, paramContext));
  }
  
  public static void r(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hbd.class, new crz());
  }
  
  public static void s(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    dae localdae = aD;
    ixq localixq = (ixq)new mbj(paramContext, ixq.class).a.get("enable_memory_metric");
    parammbb.a(gdw.class, new dah(localdae, fpf.a(localixq.a, localixq.b, localixq.c)));
  }
  
  public static void s(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(lro.class, new dag(aD, (hyi)parammbb.a(hyi.class)));
  }
  
  public static void t(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(bra.class, new bra(paramContext));
  }
  
  public static void t(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    ang[] arrayOfang = new ang[3];
    arrayOfang[0] = new auh();
    arrayOfang[1] = new auj();
    arrayOfang[2] = new aul();
    parammbb.a(ang.class, arrayOfang);
  }
  
  public static void u(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(ire.class, new dkf(paramContext));
  }
  
  public static void u(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hbz.class, new aqo((hyi)parammbb.a(hyi.class)));
  }
  
  public static void v(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    hba localhba = (hba)parammbb.a(hba.class);
    ird[] arrayOfird = new ird[1];
    arrayOfird[0] = new bus(paramContext, localhba);
    parammbb.a(ird.class, arrayOfird);
  }
  
  public static void v(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(iqo.class, new iqi());
  }
  
  public static void w(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(duh.class, new duh(paramContext.getContentResolver()));
  }
  
  public static void w(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(hdh.class, new hdh(2));
  }
  
  public static void x(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(lwj.class, new lwj(paramContext));
  }
  
  public static void x(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    dka localdka = (dka)parammbb.a(dka.class);
    gjg[] arrayOfgjg = new gjg[3];
    arrayOfgjg[0] = new cux();
    arrayOfgjg[1] = new bgp();
    arrayOfgjg[2] = localdka;
    parammbb.a(gjg.class, arrayOfgjg);
  }
  
  public static void y(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(jaq.class, new cuu(paramContext));
  }
  
  public static void y(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(llk.class, new bva());
  }
  
  public static void z(Context paramContext, mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(kih.class, new dgr());
  }
  
  public static void z(mbb parammbb)
  {
    if (aD == null) {
      aD = new dae();
    }
    parammbb.a(giy.class, new bpq());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dak
 * JD-Core Version:    0.7.0.1
 */