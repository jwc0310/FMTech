import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Toast;
import com.google.android.apps.plus.phone.StreamMiniShareActivity;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import com.google.android.libraries.social.ui.views.fab.FloatingActionButton;
import java.util.List;

public final class bpk
  extends cge
  implements bpg, bph, gii, gqk, hhm, kxa, kxj, kxp
{
  hmu Z;
  String a;
  private hho aQ;
  private final hhp aR;
  private final iic aS;
  private hhn aT;
  private boolean aU;
  private hgv aV;
  private kxi aa;
  private String ab;
  private String ac;
  private String ad;
  private boolean ae;
  private boolean af = false;
  private int ag;
  private int ah;
  private String ai;
  private int aj = 0;
  private int ak = 0;
  private String al;
  private boolean am;
  private boolean an = true;
  private bpd ao;
  private hqr ap;
  private gzj aq;
  String b;
  String c;
  String d;
  
  public bpk()
  {
    hph localhph = new hph(this.bp);
    this.bo.a(hhp.class, localhph);
    this.aR = ((hph)localhph);
    iic localiic = new iic(this, this.bp, new bpm(this));
    localiic.e = new bpl(this);
    localiic.f = true;
    this.aS = localiic;
    new gzc(this, new bpo(this));
  }
  
  private final void M()
  {
    boolean bool1 = this.aq.a("fetch_older");
    boolean bool2 = this.aq.a("fetch_newer");
    boolean bool3 = this.aq.a("GetCollexionByIdTask");
    if ((bool1) || (bool2) || (bool3) || (!this.aU)) {
      return;
    }
    this.ao.o = true;
  }
  
  private final void N()
  {
    bz localbz = this.x;
    if (localbz.e() > 0)
    {
      localbz.c();
      return;
    }
    f().finish();
  }
  
  private final boolean O()
  {
    return (this.aj == 4) || (this.aj == 5);
  }
  
  public static cge a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("clx_id", paramString1);
    localBundle.putString("clx_name", paramString2);
    bpk localbpk = new bpk();
    localbpk.f(localBundle);
    return localbpk;
  }
  
  private final void d(int paramInt)
  {
    hlw localhlw = new hlw(this.at.c(), this.a, paramInt);
    gzj localgzj = this.aq;
    localgzj.d.a(localhlw, false);
    localgzj.b(localhlw);
  }
  
  protected final String D()
  {
    return "android_collections_gmh";
  }
  
  protected final void E() {}
  
  protected final gzf F()
  {
    return null;
  }
  
  protected final boolean G()
  {
    return false;
  }
  
  public final boolean H()
  {
    return false;
  }
  
  public final boolean I()
  {
    return true;
  }
  
  protected final void J() {}
  
  @TargetApi(16)
  public final void K_()
  {
    Intent localIntent = efj.a(this.bn, this.at.c(), this.b, null, false);
    if (Build.VERSION.SDK_INT < 16)
    {
      this.bn.startActivity(localIntent);
      return;
    }
    Bundle localBundle = ((gvj)this.bo.a(gvj.class)).a();
    this.bn.startActivity(localIntent, localBundle);
  }
  
  protected final boolean L_()
  {
    return (this.ao.isEmpty()) && (super.L_());
  }
  
  protected final void M_()
  {
    this.aH = efj.a(this.aD, null, false, null, null, 5, this.a);
  }
  
  protected final boolean Z_()
  {
    hhn localhhn;
    mbf localmbf;
    String str;
    if ((!super.Z_()) && (!this.an) && (!this.aq.a("fetch_older")) && (!this.aq.a("fetch_newer")))
    {
      localhhn = this.aT;
      localmbf = this.bn;
      str = this.a;
    }
    return localhhn.a(((hho)mbb.a(localmbf, hho.class)).a(str)) == 1;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    this.ao = ((bpd)this.az);
    if ((this.aG != null) && (this.a != null)) {
      this.aG.a("clx", this.a.hashCode());
    }
    this.ay.setClipChildren(false);
    cyh localcyh = this.aL;
    localcyh.f = true;
    localcyh.b();
    return localView;
  }
  
  protected final dfz a(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    return new bpd(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, paramcyh, paramlob);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    }
    do
    {
      return super.a(paramInt, paramBundle);
    } while (this.a == null);
    return new hlx(this.bn, this.at.c(), this.a);
  }
  
  protected final void a(int paramInt1, int paramInt2) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle == null) {}
    for (boolean bool = true;; bool = false)
    {
      this.am = bool;
      if (!this.am) {
        this.aU = true;
      }
      this.al = this.m.getString("clx_activity_id");
      return;
    }
  }
  
  public final void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    switch (paramfu.i)
    {
    }
    for (;;)
    {
      super.a(paramfu, paramCursor);
      return;
      this.an = false;
      if ((paramCursor != null) && (paramCursor.moveToFirst()))
      {
        if (this.a == null)
        {
          this.a = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_id"));
          if (this.aG != null) {
            this.aG.a("clx", this.a.hashCode());
          }
          M_();
        }
        this.c = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_name"));
        this.ad = paramCursor.getString(paramCursor.getColumnIndexOrThrow("tagline"));
        this.b = paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_gaia_id"));
        this.ab = paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_display_name"));
        this.ac = paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_photo_url"));
        boolean bool1;
        label329:
        bpd localbpd;
        label454:
        int i1;
        int i4;
        label696:
        label706:
        boolean bool3;
        label751:
        int i3;
        if (paramCursor.getInt(paramCursor.getColumnIndexOrThrow("auto_follow_state")) == 1)
        {
          bool1 = true;
          this.ae = bool1;
          this.ah = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("visibility_type"));
          this.ai = paramCursor.getString(paramCursor.getColumnIndexOrThrow("domain_name"));
          this.d = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cover_photo_url"));
          int k = paramCursor.getColumnIndexOrThrow("color");
          if (paramCursor.isNull(k)) {
            break label927;
          }
          this.ag = paramCursor.getInt(k);
          int m = paramCursor.getColumnIndexOrThrow("follow_state");
          if (!paramCursor.isNull(m)) {
            this.aj = paramCursor.getInt(m);
          }
          int n = paramCursor.getColumnIndexOrThrow("subscribe_state");
          if (!paramCursor.isNull(n)) {
            this.ak = paramCursor.getInt(n);
          }
          this.Z = hmu.a(paramCursor.getBlob(paramCursor.getColumnIndexOrThrow("abuse_info")));
          if (TextUtils.isEmpty(paramCursor.getString(paramCursor.getColumnIndexOrThrow("cover_photo_url")))) {
            break label947;
          }
          ((ViewGroup.MarginLayoutParams)this.ay.getLayoutParams()).topMargin = 0;
          this.af = this.at.f().b("gaia_id").equals(paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_gaia_id")));
          localbpd = this.ao;
          boolean bool2 = this.af;
          localbpd.p = bool2;
          if (paramCursor != null)
          {
            localbpd.c = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_id"));
            localbpd.f = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cover_photo_url"));
            localbpd.d = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_name"));
            localbpd.e = paramCursor.getString(paramCursor.getColumnIndexOrThrow("tagline"));
            localbpd.g = paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_display_name"));
            localbpd.h = paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_photo_url"));
            localbpd.k = Integer.valueOf(paramCursor.getInt(paramCursor.getColumnIndexOrThrow("visibility_type")));
            i1 = paramCursor.getColumnIndexOrThrow("follow_state");
            if (localbpd.k.intValue() == 3) {
              break label990;
            }
            if (!paramCursor.isNull(i1)) {
              break label970;
            }
            i4 = -1;
            localbpd.i = Integer.valueOf(i4);
            localbpd.j = Integer.valueOf(paramCursor.getInt(paramCursor.getColumnIndexOrThrow("post_count")));
            if (paramCursor.getInt(paramCursor.getColumnIndexOrThrow("sharing_target_group_type")) != 2) {
              break label1002;
            }
            bool3 = true;
            localbpd.m = bool3;
            if ((!bool2) && (!paramCursor.isNull(i1))) {
              break label1008;
            }
            localbpd.l = null;
            label780:
            int i2 = paramCursor.getColumnIndexOrThrow("color");
            if (paramCursor.isNull(i2)) {
              break label1027;
            }
            i3 = paramCursor.getInt(i2);
            label812:
            kwz localkwz = localbpd.a;
            localkwz.a(i3, null, new kxb(localkwz.a, i3));
            localbpd.n = hmu.a(paramCursor.getBlob(paramCursor.getColumnIndexOrThrow("abuse_info")));
            localbpd.notifyDataSetChanged();
          }
          if (this.aL != null)
          {
            if (!this.af) {
              break label1046;
            }
            this.aL.a();
          }
        }
        hwq localhwq3;
        hwt localhwt2;
        for (;;)
        {
          this.as.a();
          localhwq3 = this.aw;
          localhwt2 = hwt.b;
          if (localhwt2 != null) {
            break label1066;
          }
          throw new NullPointerException();
          bool1 = false;
          break;
          label927:
          this.ag = this.bn.getResources().getColor(aau.vW);
          break label329;
          label947:
          ((ViewGroup.MarginLayoutParams)this.ay.getLayoutParams()).topMargin = efj.y(this.bn);
          break label454;
          label970:
          i4 = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("follow_count"));
          break label696;
          label990:
          localbpd.i = Integer.valueOf(-1);
          break label706;
          label1002:
          bool3 = false;
          break label751;
          label1008:
          localbpd.l = Integer.valueOf(paramCursor.getInt(i1));
          break label780;
          label1027:
          i3 = localbpd.aM.getResources().getColor(aau.vX);
          break label812;
          label1046:
          cyh localcyh = this.aL;
          localcyh.f = true;
          localcyh.b();
        }
        label1066:
        localhwq3.g = ((hwt)localhwt2);
        localhwq3.a();
        M();
      }
      while (L_())
      {
        hwq localhwq1 = this.aw;
        int j = ehr.C;
        localhwq1.f = null;
        localhwq1.e = j;
        localhwq1.e();
        hwq localhwq2 = this.aw;
        hwt localhwt1 = hwt.a;
        if (localhwt1 == null)
        {
          throw new NullPointerException();
          hhn localhhn = this.aT;
          mbf localmbf = this.bn;
          String str = this.a;
          if (localhhn.a(((hho)mbb.a(localmbf, hho.class)).a(str)) != 1) {
            N();
          }
        }
        else
        {
          localhwq2.g = ((hwt)localhwt1);
          localhwq2.a();
        }
      }
      hqr localhqr = new hqr(new String[] { "_id" }, 1);
      if (!TextUtils.isEmpty(this.ao.d)) {}
      for (int i = 1;; i = 0)
      {
        if (i != 0)
        {
          Integer[] arrayOfInteger = new Integer[1];
          arrayOfInteger[0] = Integer.valueOf(0);
          localhqr.a(arrayOfInteger);
        }
        this.ap = localhqr;
        k().b(2, null, this);
        N_();
        tt localtt = (tt)f();
        if (localtt == null) {
          break;
        }
        localtt.e().a().a(this.c);
        return;
      }
      M();
    }
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    int i;
    if (!TextUtils.isEmpty(this.ao.d))
    {
      i = 1;
      if (i != 0) {
        break label30;
      }
    }
    label30:
    do
    {
      return;
      i = 0;
      break;
      if (!this.af) {
        break label314;
      }
      if (this.aa.a())
      {
        MenuItem localMenuItem2 = paramgpr.a(efj.zv, efj.zl, 0, ehr.d);
        localMenuItem2.setIcon(aau.wd);
        localMenuItem2.setShowAsAction(2);
      }
      paramgpr.a(efj.zv, efj.zn, 0, ehr.f);
      paramgpr.a(efj.zv, efj.zk, 0, ehr.y);
      paramgpr.a(efj.zv, efj.zf, 1, ehr.e);
      if ((this.ah == 1) || (this.ah == 4))
      {
        MenuItem localMenuItem1 = paramgpr.a(efj.zv, efj.zm, 0, ehr.t);
        localMenuItem1.setShowAsAction(2);
        localMenuItem1.setIcon(aau.we);
        int j = efj.zA;
        gqj localgqj = new gqj(this);
        localgqj.a = ehr.k;
        paramgpr.a(j, localgqj);
      }
    } while (!this.aS.a(this.at.c()));
    int k = efj.ze;
    iic localiic = this.aS;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjn.a);
    localgxr.b.add(localgxq);
    paramgpr.a(k, new iig(localiic, localgxr.a(this.bn)));
    return;
    label314:
    if ((this.ak != 0) && (O())) {
      if (this.ak != 1) {
        break label368;
      }
    }
    label368:
    for (int m = efj.zr;; m = efj.zs)
    {
      paramgpr.b(m).setShowAsAction(1);
      paramgpr.b(efj.zy);
      break;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        super.a(paramString, paramhae, paramhaa);
      }
      break;
    }
    do
    {
      return;
      if (!paramString.equals("UpdateFollowStateBackgroundTask")) {
        break;
      }
      i = 0;
      break;
      if (!paramString.equals("UpdateCollexionTask")) {
        break;
      }
      i = 1;
      break;
      if (!paramString.equals("UpdateSubscribeStateTask")) {
        break;
      }
      i = 2;
      break;
      if (!paramString.equals("ReportCollexionAbuseTask")) {
        break;
      }
      i = 3;
      break;
      this.az.notifyDataSetChanged();
      return;
    } while (hae.a(paramhae));
    k().b(5, null, this);
    return;
    int k;
    if (hae.a(paramhae)) {
      k = ehr.v;
    }
    for (;;)
    {
      bp localbp2 = f();
      efj.a(localbp2, localbp2.getResources().getText(k), 1).show();
      return;
      if (paramhae.a().getInt("SubscribeAction") == 1) {
        k = ehr.o;
      } else {
        k = ehr.n;
      }
    }
    bp localbp1 = f();
    if (hae.a(paramhae)) {}
    for (int j = ehr.c;; j = ehr.b)
    {
      efj.a(localbp1, localbp1.getResources().getText(j), 1).show();
      return;
    }
  }
  
  public final void a(kxb paramkxb)
  {
    if (this.ax != null)
    {
      lvz locallvz = this.ax;
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = paramkxb.a;
      locallvz.a(arrayOfInt);
    }
    if ((this.af) && (this.N != null)) {
      ((FloatingActionButton)this.N.findViewById(efj.zq)).a(paramkxb.a, paramkxb.c);
    }
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    efj.a(paramtp, true);
  }
  
  protected final void a(boolean paramBoolean)
  {
    String str;
    if (paramBoolean)
    {
      str = "fetch_newer";
      if (!this.aq.a(str)) {
        break label25;
      }
    }
    label25:
    while ((Z()) || (this.a == null) || ((!paramBoolean) && (this.aM)))
    {
      return;
      str = "fetch_older";
      break;
    }
    if (paramBoolean) {
      this.aB = null;
    }
    while (L_())
    {
      hwq localhwq1 = this.aw;
      int k = ehr.C;
      localhwq1.f = null;
      localhwq1.e = k;
      localhwq1.e();
      hwq localhwq2 = this.aw;
      hwt localhwt = hwt.a;
      if (localhwt == null)
      {
        throw new NullPointerException();
        if (this.aB != null) {
          break;
        }
      }
      else
      {
        localhwq2.g = ((hwt)localhwt);
        localhwq2.a();
      }
    }
    lln locallln = (lln)this.bo.a(lln.class);
    int i = this.at.c();
    if (this.aB == null) {}
    for (int j = locallln.e(i);; j = locallln.f(i))
    {
      int[] arrayOfInt = locallln.a(f(), i);
      hlb localhlb = new hlb(i, this.aD, this.a, this.aB, false, false, j, arrayOfInt);
      localhlb.f = str;
      this.aq.b(localhlb);
      if ((paramBoolean) && (this.aU) && (this.a != null)) {
        hlf.a(this.bn, this.aq, i, this.a);
      }
      if (paramBoolean) {
        this.aU = true;
      }
      N_();
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = 2;
    int j = paramMenuItem.getItemId();
    if (j == efj.zf)
    {
      this.aV.a(this.aD, this.a);
      mbf localmbf8 = this.bn;
      gxr localgxr8 = new gxr();
      gxq localgxq8 = new gxq(pjn.y);
      localgxr8.b.add(localgxq8);
      new gwz(4, localgxr8.a(this.bn)).b(localmbf8);
      return true;
    }
    if (j == efj.zn)
    {
      this.aR.a(this.a, this.c, this.ad, this.ae, this.ah);
      mbf localmbf7 = this.bn;
      gxr localgxr7 = new gxr();
      gxq localgxq7 = new gxq(pjn.ag);
      localgxr7.b.add(localgxq7);
      new gwz(4, localgxr7.a(this.bn)).b(localmbf7);
      return true;
    }
    if (j == efj.zk)
    {
      a(((hpo)this.bo.a(hpo.class)).a(this.at.c(), this.a));
      mbf localmbf6 = this.bn;
      gxr localgxr6 = new gxr();
      gxq localgxq6 = new gxq(pjn.h);
      localgxr6.b.add(localgxq6);
      new gwz(4, localgxr6.a(this.bn)).b(localmbf6);
      return true;
    }
    if (j == efj.zm)
    {
      hqw localhqw;
      if (!this.aV.b())
      {
        qda localqda = new qda();
        localqda.e = this.a;
        localqda.h = this.a;
        localqda.c = this.c;
        qdl localqdl1 = new qdl();
        localqdl1.b = this.d;
        qbe localqbe1 = new qbe();
        localqbe1.a = new int[] { 339 };
        localqbe1.a(qdl.a, localqdl1);
        localqda.f = localqbe1;
        int k = ehr.u;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.a;
        localqda.b = g().getString(k, arrayOfObject);
        localqda.j = new qbl();
        localqda.j.a = new qbm();
        localqda.j.a.a = Integer.valueOf(Color.red(this.ag));
        localqda.j.a.b = Integer.valueOf(Color.green(this.ag));
        localqda.j.a.c = Integer.valueOf(Color.blue(this.ag));
        qdo localqdo = new qdo();
        localqdo.d = this.b;
        localqdo.c = this.ab;
        if (!TextUtils.isEmpty(this.ac))
        {
          qdl localqdl2 = new qdl();
          localqdl2.b = this.ac;
          qbe localqbe2 = new qbe();
          localqbe2.a = new int[] { 339 };
          localqbe2.a(qdl.a, localqdl2);
          localqdo.e = localqbe2;
        }
        localqda.d = new qbe[1];
        localqda.d[0] = new qbe();
        localqda.d[0].a = new int[] { 350 };
        localqda.d[0].a(qdo.a, localqdo);
        qcm localqcm = new qcm();
        qbp localqbp = new qbp();
        localqbp.a = this.ai;
        localqcm.a = localqbp;
        localqda.g = localqcm;
        qbe localqbe3 = new qbe();
        localqbe3.a = new int[] { 413 };
        localqbe3.a(qda.a, localqda);
        localhqw = new hqw(localqbe3);
        if (!TextUtils.isEmpty(this.ai)) {
          break label901;
        }
      }
      label901:
      for (Intent localIntent = new Intent(this.bn, StreamMiniShareActivity.class).putExtra("account_id", this.at.c()).putExtra("embed_client_item", localhqw);; localIntent = efj.k(this.bn, this.at.c()).putExtra("embed_client_item", localhqw).putExtra("disable_location", true).putExtra("restrict_to_domain", true))
      {
        a(localIntent);
        mbf localmbf5 = this.bn;
        gxr localgxr5 = new gxr();
        gxq localgxq5 = new gxq(pjn.r);
        localgxr5.b.add(localgxq5);
        new gwz(4, localgxr5.a(this.bn)).b(localmbf5);
        return true;
      }
    }
    if (j == efj.zj)
    {
      gxt localgxt;
      if (O()) {
        localgxt = pjn.ad;
      }
      for (;;)
      {
        b(i);
        mbf localmbf4 = this.bn;
        gxr localgxr4 = new gxr();
        gxq localgxq4 = new gxq(localgxt);
        localgxr4.b.add(localgxq4);
        new gwz(4, localgxr4.a(this.bn)).b(localmbf4);
        return true;
        localgxt = pjn.F;
        i = 1;
      }
    }
    if (j == efj.zs)
    {
      d(1);
      mbf localmbf3 = this.bn;
      gxr localgxr3 = new gxr();
      gxq localgxq3 = new gxq(pjn.ab);
      localgxr3.b.add(localgxq3);
      new gwz(4, localgxr3.a(this.bn)).b(localmbf3);
      return true;
    }
    if (j == efj.zr)
    {
      d(i);
      mbf localmbf2 = this.bn;
      gxr localgxr2 = new gxr();
      gxq localgxq2 = new gxq(pjn.af);
      localgxr2.b.add(localgxq2);
      new gwz(4, localgxr2.a(this.bn)).b(localmbf2);
      return true;
    }
    if (j == efj.zy)
    {
      hjj localhjj = new hjj();
      localhjj.n = this;
      localhjj.p = 0;
      localhjj.a(h(), null);
      mbf localmbf1 = this.bn;
      gxr localgxr1 = new gxr();
      gxq localgxq1 = new gxq(pjn.U);
      localgxr1.b.add(localgxq1);
      new gwz(4, localgxr1.a(this.bn)).b(localmbf1);
      return true;
    }
    if (j == efj.zl)
    {
      a(((hpo)this.bo.a(hpo.class)).b(this.at.c(), this.a));
      return true;
    }
    if (j == efj.zx)
    {
      W();
      return super.a(paramMenuItem);
    }
    return super.a(paramMenuItem);
  }
  
  public final void b(int paramInt)
  {
    ad();
    if (TextUtils.isEmpty(this.al))
    {
      this.aV.a(this.a, efj.h(paramInt), this.aQ.a());
      return;
    }
    this.aV.a(this.al, this.a, efj.h(paramInt));
  }
  
  protected final void b(Intent paramIntent)
  {
    if (!TextUtils.isEmpty(this.ao.d)) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        paramIntent.putExtra("extra_acl", new gnb(new hps(this.a, this.ao.d, this.ao.m)));
        paramIntent.putExtra("clear_acl", true);
      }
      super.b(paramIntent);
      return;
    }
  }
  
  public final void c()
  {
    b(efj.k(this.bn, this.at.c()));
  }
  
  public final void c(int paramInt)
  {
    if (paramInt == 2)
    {
      Toast.makeText(this.bn, ehr.h, 0).show();
      if (L_()) {
        N();
      }
    }
    N_();
  }
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    mbb localmbb = this.bo;
    localmbb.a(bpg.class, this);
    localmbb.a(bph.class, this);
    localmbb.a(kxp.class, this);
    localmbb.a(gii.class, this);
    localmbb.a(hje.class, new bpn(this));
    localmbb.a(kwz.class, new kwz(this.bn));
    this.aV = ((hgv)this.bo.a(hgv.class));
    this.aq = ((gzj)this.bo.a(gzj.class));
    this.aT = ((hhn)this.bo.a(hhn.class));
    kxq localkxq = (kxq)this.bo.a(kxq.class);
    this.aa = localkxq.a(this.bn).a(f()).a(this);
    lvi locallvi1 = this.au;
    kxi localkxi = this.aa;
    locallvi1.a.add(localkxi);
    lvi locallvi2 = this.au;
    lvh locallvh1 = localkxq.a();
    locallvi2.a.add(locallvh1);
    lvi locallvi3 = this.au;
    lvh locallvh2 = localkxq.b();
    locallvi3.a.add(locallvh2);
    this.aQ = ((hho)this.bo.a(hho.class));
  }
  
  public final void c_(int paramInt)
  {
    hlp localhlp = new hlp(this.at.c(), this.a, paramInt);
    gzj localgzj = this.aq;
    localgzj.d.a(localhlp, false);
    localgzj.b(localhlp);
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    k().a(5, null, this);
  }
  
  public final void f_()
  {
    super.f_();
    if (this.aa != null) {
      this.aa.a(null);
    }
  }
  
  public final void m()
  {
    super.m();
    ((kwz)this.bo.a(kwz.class)).a(this);
    hhn localhhn = this.aT;
    mbf localmbf = this.bn;
    String str = this.a;
    localhhn.a(((hho)mbb.a(localmbf, hho.class)).a(str), this);
  }
  
  public final void n()
  {
    super.n();
    hhn localhhn = this.aT;
    mbf localmbf = this.bn;
    String str = this.a;
    localhhn.b(((hho)mbb.a(localmbf, hho.class)).a(str), this);
    ((kwz)this.bo.a(kwz.class)).c.remove(this);
  }
  
  public final void p_()
  {
    super.p_();
    if (this.am)
    {
      this.am = false;
      W();
    }
  }
  
  public final gxq v()
  {
    return new kuu(pjn.s, this.a);
  }
  
  protected final hqr w()
  {
    return this.ap;
  }
  
  public final void x()
  {
    this.as.a();
  }
  
  public final CharSequence z()
  {
    int i = ehr.u;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return g().getString(i, arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpk
 * JD-Core Version:    0.7.0.1
 */