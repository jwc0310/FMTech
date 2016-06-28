import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import java.util.ArrayList;
import java.util.List;

public final class dhj
  extends cge
  implements dgy, dhc, dhf, djg, gii, gqk, hgy, hgz, led, lfm
{
  static final String[] a = { "gaia_id", "blocked" };
  boolean Z;
  private hgv aQ;
  private cw<jyz> aR;
  private jia aS;
  private lta aT;
  private dhd aU;
  private Button aV;
  private hho aW;
  private final lfk aX = new lfk(this, this.bp, this);
  private gxn aY;
  private gxo aZ;
  boolean aa;
  boolean ab;
  boolean ac;
  ArrayList<String> ad = new ArrayList();
  jiw ae;
  Bundle af;
  gzj ag;
  dia ah;
  boolean ai;
  private hqr aj;
  private final cw<Cursor> ak = new dht(this);
  private final cw<Cursor> al = new dhy(this);
  private final cw<Cursor> am = new dhw(this);
  private final cw<Cursor> an = new dhp(this);
  private String ao;
  private boolean ap;
  private boolean aq;
  dje b;
  int c;
  boolean d;
  
  public dhj()
  {
    new gxj(this.bp, (byte)0);
    dhk localdhk = new dhk(this);
    dhl localdhl = new dhl(this);
    jja localjja = new jja(this.bp);
    localjja.c = localdhl;
    localjja.d = localdhk;
  }
  
  private final void b(boolean paramBoolean)
  {
    if (!this.ag.a("blockProfileTask"))
    {
      gzj localgzj = this.ag;
      jzu localjzu = new jzu(this.c, this.aD, this.b.b(), paramBoolean);
      localgzj.d.a(localjzu, false);
      localgzj.b(localjzu);
    }
  }
  
  protected final boolean K()
  {
    return this.Z;
  }
  
  final void M()
  {
    if (this.aV == null) {
      return;
    }
    int i = aaw.na;
    int j = efj.AN;
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    int i3;
    Object localObject;
    int i4;
    int i5;
    boolean bool;
    if (localmfz.b == 1)
    {
      localStringBuilder = localmfz.a;
      if (!this.Z) {
        break label332;
      }
      if ((this.ai) && (!this.b.e())) {
        break label271;
      }
      if (!this.d) {
        break label253;
      }
      String str5 = this.bn.getString(aw.f);
      int i16 = aaw.na;
      int i17 = efj.AN;
      efj.a(this.aV, new gxq(pka.i));
      i3 = i16;
      localObject = str5;
      i4 = i17;
      i5 = 1;
      bool = true;
    }
    for (;;)
    {
      if ((localStringBuilder.length() == 0) && (!TextUtils.isEmpty((CharSequence)localObject))) {
        efj.a(localStringBuilder, new CharSequence[] { localObject });
      }
      if (i5 == 0) {
        break label802;
      }
      this.aV.setText((CharSequence)localObject);
      this.aV.setTextColor(this.bn.getResources().getColor(i3));
      this.aV.setBackgroundResource(i4);
      this.aV.setVisibility(0);
      this.aV.setEnabled(bool);
      this.aV.setContentDescription(localStringBuilder);
      return;
      localStringBuilder = new StringBuilder(256);
      break;
      label253:
      bool = true;
      i3 = i;
      i4 = j;
      i5 = 0;
      localObject = null;
      continue;
      label271:
      String str6 = this.bn.getString(aw.I);
      int i18 = aaw.na;
      int i19 = efj.AN;
      efj.a(this.aV, new gxq(pka.m));
      i3 = i18;
      localObject = str6;
      i4 = i19;
      i5 = 1;
      bool = true;
      continue;
      label332:
      efj.a(this.aV, new gxq(pkf.e));
      if (this.ab)
      {
        String str4 = this.bn.getString(aw.C);
        int i14 = aaw.mZ;
        int i15 = efj.AO;
        i3 = i14;
        localObject = str4;
        i4 = i15;
        i5 = 1;
        bool = false;
      }
      else if (this.ac)
      {
        String str3 = this.bn.getString(aw.H);
        int i12 = aaw.mZ;
        int i13 = efj.AO;
        i3 = i12;
        localObject = str3;
        i4 = i13;
        i5 = 1;
        bool = false;
      }
      else if (!N())
      {
        String str2 = this.bn.getString(aw.E);
        int i10 = aaw.na;
        int i11 = efj.AN;
        i3 = i10;
        localObject = str2;
        i4 = i11;
        i5 = 1;
        bool = true;
      }
      else if (this.ad.size() == 1)
      {
        CharSequence localCharSequence = (CharSequence)this.ad.get(0);
        int i6 = aaw.mY;
        int i7 = efj.AM;
        CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
        int i8 = aw.G;
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = this.b.b();
        arrayOfObject3[1] = localCharSequence;
        arrayOfCharSequence3[0] = g().getString(i8, arrayOfObject3);
        efj.a(localStringBuilder, arrayOfCharSequence3);
        CharSequence[] arrayOfCharSequence4 = new CharSequence[1];
        int i9 = aw.p;
        arrayOfCharSequence4[0] = g().getString(i9);
        efj.a(localStringBuilder, arrayOfCharSequence4);
        i3 = i6;
        localObject = localCharSequence;
        i4 = i7;
        bool = true;
        i5 = 1;
      }
      else
      {
        mbf localmbf = this.bn;
        int k = aw.D;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(this.ad.size());
        String str1 = localmbf.getString(k, arrayOfObject1);
        int m = aaw.mY;
        int n = efj.AM;
        CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
        int i1 = aw.F;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = this.b.b();
        arrayOfObject2[1] = str1;
        arrayOfCharSequence1[0] = g().getString(i1, arrayOfObject2);
        efj.a(localStringBuilder, arrayOfCharSequence1);
        CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
        int i2 = aw.p;
        arrayOfCharSequence2[0] = g().getString(i2);
        efj.a(localStringBuilder, arrayOfCharSequence2);
        i3 = m;
        localObject = str1;
        i4 = n;
        i5 = 1;
        bool = true;
      }
    }
    label802:
    this.aV.setVisibility(8);
  }
  
  final boolean N()
  {
    return (this.ad != null) && (!this.ad.isEmpty());
  }
  
  public final void W()
  {
    super.W();
    if (TextUtils.isEmpty(this.aD)) {
      return;
    }
    if (this.ap) {
      jzj.a(this.bn, null, this.c, this.aD, this.Z, 4);
    }
    jzy.a(this.bn, this.c, this.aD);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    if (TextUtils.isEmpty(this.aD)) {
      return paramLayoutInflater.inflate(efj.AY, paramViewGroup, false);
    }
    this.b = ((dje)this.az);
    this.ay.setClipChildren(false);
    hwq localhwq = this.aw;
    localhwq.a = false;
    localhwq.b = false;
    localhwq.h = new dhm(this);
    return localView;
  }
  
  protected final dfz a(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    return new dje(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, paramcyh, paramlob, this);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {}
    do
    {
      return;
      switch (paramInt1)
      {
      default: 
        super.a(paramInt1, paramInt2, paramIntent);
        return;
      }
    } while (!paramIntent.getBooleanExtra("should_refresh_data", false));
    jzh.a(this.bn, null, this.c, this.aD, true);
    W();
    return;
    new kqf(105).b(this.bn);
    kat localkat = (kat)this.bo.b(kat.class);
    if (localkat != null) {
      localkat.a(localkat.a(3, 3));
    }
    this.aT.a(this.at.c(), "AddToCircleFromProfile", 9L, 1L);
    Bundle localBundle = paramIntent.getExtras();
    a(localBundle.getStringArrayList("original_circle_ids"), localBundle.getStringArrayList("selected_circle_ids"), this.ao, this.b.b(), null, null, -1, false, true);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.ao = localBundle.getString("person_id");
    this.aD = jjf.c(this.ao);
    this.Z = TextUtils.equals(this.aD, this.at.f().b("gaia_id"));
    this.ah = new dia(f());
    if (this.aD == null) {
      localBundle.putBoolean("show_empty_stream", true);
    }
    if (paramBundle != null)
    {
      this.ad = paramBundle.getStringArrayList("profile_circle_names");
      this.ac = paramBundle.getBoolean("is_restricted");
      this.aa = paramBundle.getBoolean("is_muted");
      this.ab = paramBundle.getBoolean("is_blocked");
    }
    for (this.aq = paramBundle.getBoolean("refresh_stream_on_start");; this.aq = true)
    {
      this.ag.a("headerDataTask", new dhs(this)).a("muteProfileTask", new dhv(this)).a("reportProfileAbuseTask", new dhx(this)).a("blockProfileTask", new dho(this));
      return;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    b(true);
  }
  
  public final void a(Button paramButton)
  {
    this.aV = paramButton;
    M();
    if (this.aY == null) {
      this.aY = new gxn(new dhq(this));
    }
    paramButton.setOnClickListener(this.aY);
    if ((!this.Z) && (!N()))
    {
      if (this.aZ == null) {
        this.aZ = new gxo(new dhr(this));
      }
      paramButton.setOnLongClickListener(this.aZ);
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(null);
    if (TextUtils.isEmpty(this.aD)) {
      return;
    }
    super.a(paramgpr);
    MenuItem localMenuItem = paramgpr.a(ehr.E, ehr.ak, 0, aw.O);
    localMenuItem.setShowAsAction(1);
    localMenuItem.setIcon(efj.AQ);
    int j;
    if (!this.Z)
    {
      if (!this.aa) {
        break label151;
      }
      j = ehr.aj;
      paramgpr.b(j);
      if (!this.ab) {
        break label159;
      }
    }
    label151:
    label159:
    for (int k = ehr.ai;; k = ehr.D)
    {
      paramgpr.b(k);
      paramgpr.b(ehr.ae);
      int i = ehr.ag;
      gqj localgqj = new gqj(this);
      localgqj.a = aw.r;
      paramgpr.a(i, localgqj);
      return;
      j = ehr.G;
      break;
    }
  }
  
  public final void a(String paramString, int paramInt)
  {
    this.aQ.a(paramString, paramInt, this.aW.a());
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Intent localIntent = ((kyp)this.bo.a(kyp.class)).a(this.c, paramString1, null);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void a(String paramString, kxg paramkxg)
  {
    if (this.ap) {
      k().b(5, null, this.aR);
    }
  }
  
  public final void a(kxg paramkxg, String paramString, int paramInt)
  {
    this.aX.a(paramkxg, paramString, paramInt);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == ehr.ak)
    {
      bp localbp = f();
      Boolean localBoolean2;
      boolean bool2;
      int j;
      label116:
      Boolean localBoolean1;
      boolean bool1;
      label153:
      int k;
      if ((this.Z) && ((!this.ai) || (this.b.e())))
      {
        gjb localgjb = this.at.f();
        Uri.Builder localBuilder = new Uri.Builder().scheme("https").authority("aboutme.google.com");
        dje localdje2 = this.b;
        if (localdje2.d != null)
        {
          localBoolean2 = localdje2.d.b;
          if (localBoolean2 == null)
          {
            bool2 = false;
            if (!bool2) {
              break label323;
            }
            j = 1;
            if (j == 0)
            {
              dje localdje3 = this.b;
              if (localdje3.e == null) {
                break label339;
              }
              localBoolean1 = localdje3.e.b;
              if (localBoolean1 != null) {
                break label329;
              }
              bool1 = false;
              if (!bool1) {
                break label339;
              }
              k = 1;
              label161:
              if (k == 0) {}
            }
            else
            {
              localBuilder.appendQueryParameter("referer", "gplus_android");
              localBuilder.appendQueryParameter("pageId", this.aD);
            }
            dhg localdhg = new dhg();
            localdhg.a = localBuilder.build();
            localdhg.b = localgjb.b("account_name");
            ay.a(localbp, new Intent("android.intent.action.VIEW", localdhg.a()), this.af);
          }
        }
      }
      for (;;)
      {
        mbf localmbf6 = this.bn;
        gxr localgxr6 = new gxr();
        gxq localgxq6 = new gxq(pka.s);
        localgxr6.b.add(localgxq6);
        new gwz(4, localgxr6.a(this.bn)).b(localmbf6);
        return true;
        bool2 = localBoolean2.booleanValue();
        break;
        label323:
        j = 0;
        break label116;
        label329:
        bool1 = localBoolean1.booleanValue();
        break label153;
        label339:
        k = 0;
        break label161;
        kpm localkpm = new kpm(this.bn);
        localkpm.a = this.ao;
        localkpm.c = Integer.valueOf(localbp.getResources().getColor(aaw.mW));
        localkpm.d = this.b.b();
        dje localdje1 = this.b;
        if ((localdje1.b == null) || (localdje1.b.b == null)) {}
        Intent localIntent;
        for (String str = "";; str = localdje1.b.b)
        {
          localkpm.e = str;
          localkpm.b = true;
          localIntent = localkpm.a();
          Bundle localBundle = this.af;
          if (Build.VERSION.SDK_INT < 16) {
            break label488;
          }
          localbp.startActivityForResult(localIntent, 0, localBundle);
          break;
        }
        label488:
        localbp.startActivityForResult(localIntent, 0);
      }
    }
    if (i == ehr.G)
    {
      ((dhd)this.bo.a(dhd.class)).b().a(this.b.b()).a(this.b.c()).a(true).a().a(h(), "mute_profile");
      mbf localmbf5 = this.bn;
      gxr localgxr5 = new gxr();
      gxq localgxq5 = new gxq(pka.n);
      localgxr5.b.add(localgxq5);
      new gwz(4, localgxr5.a(this.bn)).b(localmbf5);
      return true;
    }
    if (i == ehr.aj)
    {
      ((dhd)this.bo.a(dhd.class)).b().a(this.b.b()).a(this.b.c()).a(false).a().a(h(), "unmute_profile");
      mbf localmbf4 = this.bn;
      gxr localgxr4 = new gxr();
      gxq localgxq4 = new gxq(pka.H);
      localgxr4.b.add(localgxq4);
      new gwz(4, localgxr4.a(this.bn)).b(localmbf4);
      return true;
    }
    if (i == ehr.D)
    {
      ((dhd)this.bo.a(dhd.class)).c().a().a(h(), "block_person");
      mbf localmbf3 = this.bn;
      gxr localgxr3 = new gxr();
      gxq localgxq3 = new gxq(pkf.c);
      localgxr3.b.add(localgxq3);
      new gwz(4, localgxr3.a(this.bn)).b(localmbf3);
      return true;
    }
    if (i == ehr.ai)
    {
      ((dhd)this.bo.a(dhd.class)).d().a(jjf.b(this.aD)).a().a(h(), "unblock_person");
      mbf localmbf2 = this.bn;
      gxr localgxr2 = new gxr();
      gxq localgxq2 = new gxq(pkf.C);
      localgxr2.b.add(localgxq2);
      new gwz(4, localgxr2.a(this.bn)).b(localmbf2);
      return true;
    }
    if (i == ehr.ae)
    {
      this.aU.f().a(h(), "report_abuse");
      mbf localmbf1 = this.bn;
      gxr localgxr1 = new gxr();
      gxq localgxq1 = new gxq(pka.A);
      localgxr1.b.add(localgxq1);
      new gwz(4, localgxr1.a(this.bn)).b(localmbf1);
      return true;
    }
    return super.a(paramMenuItem);
  }
  
  public final void b(int paramInt)
  {
    if (this.ap) {
      k().b(5, null, this.aR);
    }
  }
  
  public final void b(String paramString1, String paramString2)
  {
    ay.a(f(), ((hpo)this.bo.a(hpo.class)).a(this.at.c(), paramString1, paramString2), ((gvj)this.bo.a(gvj.class)).a());
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = this.at.c();
    this.af = ((gvj)this.bo.a(gvj.class)).a();
    this.aU = ((dhd)this.bo.a(dhd.class));
    this.ag = ((gzj)this.bo.a(gzj.class));
    this.ap = this.aU.b(this.c);
    this.d = this.aU.c(this.c);
    this.ai = ((jzd)this.bo.a(jzd.class)).a(this.c);
    this.aQ = ((hgv)this.bo.a(hgv.class));
    this.aQ.a(this);
    kxq localkxq = (kxq)this.bo.a(kxq.class);
    lvi locallvi = this.au;
    lvh locallvh = localkxq.b();
    locallvi.a.add(locallvh);
    this.aS = ((jia)this.bo.a(jia.class));
    this.af = ((gvj)this.bo.a(gvj.class)).a();
    this.aT = ((lta)this.bo.a(lta.class));
    this.ae = ((jiw)this.bo.a(jiw.class));
    this.aW = ((hho)this.bo.a(hho.class));
    mbb localmbb = this.bo;
    localmbb.a(lfy.class, this.aX);
    localmbb.a(hgz.class, this);
    localmbb.a(led.class, this);
    localmbb.a(gii.class, this);
    localmbb.a(dhc.class, this);
    localmbb.a(dgy.class, this);
    localmbb.a(dhf.class, this);
  }
  
  public final void c_(int paramInt)
  {
    if (paramInt == 5)
    {
      int i = aw.Q;
      String str = g().getString(i);
      int j = aw.Z;
      lut.a(str, g().getString(j), g().getString(17039370), null, 0, 0).a(this.x, "dialog_warning");
      return;
    }
    gzj localgzj = this.ag;
    djj localdjj = new djj(this.c, this.aD, paramInt);
    localgzj.d.a(localdjj, false);
    localgzj.b(localdjj);
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (TextUtils.isEmpty(this.aD)) {}
    cv localcv;
    do
    {
      return;
      localcv = k();
      localcv.a(6, null, this.ak);
      localcv.a(7, null, this.am);
      localcv.a(8, null, this.an);
      localcv.a(9, null, this.al);
    } while (!this.ap);
    this.aR = new dhu(this);
    localcv.a(5, null, this.aR);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putStringArrayList("profile_circle_names", this.ad);
    paramBundle.putBoolean("is_restricted", this.ac);
    paramBundle.putBoolean("is_muted", this.aa);
    paramBundle.putBoolean("is_blocked", this.ab);
    paramBundle.putBoolean("refresh_stream_on_start", this.aq);
  }
  
  public final void h(boolean paramBoolean)
  {
    if (!this.ag.a("muteProfileTask"))
    {
      gzj localgzj = this.ag;
      kag localkag = new kag(this.c, this.aD, paramBoolean);
      localgzj.d.a(localkag, false);
      localgzj.b(localkag);
    }
  }
  
  public final void k(String paramString)
  {
    b(false);
  }
  
  public final void p_()
  {
    super.p_();
    if (this.aq)
    {
      this.aq = false;
      W();
    }
  }
  
  public final gxq v()
  {
    return new kvk(pka.y, this.aD);
  }
  
  protected final hqr w()
  {
    return this.aj;
  }
  
  public final CharSequence z()
  {
    mbf localmbf = this.bn;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pka.g);
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(this.bn)).b(localmbf);
    dje localdje = this.b;
    if ((localdje.c == null) || (localdje.c.b == null)) {}
    for (String str = "";; str = localdje.c.b)
    {
      if (TextUtils.isEmpty(str)) {
        str = this.aD;
      }
      return Uri.parse("https://plus.google.com/").buildUpon().appendEncodedPath(str).build().toString();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dhj
 * JD-Core Version:    0.7.0.1
 */