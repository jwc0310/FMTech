import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import com.google.android.libraries.social.ui.views.fab.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public final class dsy
  extends cge
  implements bx, dtl, gqk, kxa, kxo, kxp, kyd, kye, lfm, lfs, lht, luu
{
  private final lfk Z = new lfk(this, this.bp, this);
  String a;
  private Boolean aQ;
  private Boolean aR;
  private String aS;
  private long aT;
  private hqr aU;
  private lfr aV;
  private kxi aW;
  private kwz aX;
  private hum aY;
  private dsr aZ;
  private final lfz aa = new lfz(this, this.bp);
  private final lfi ab = new lfi(this, this.bp);
  private final kza ac = new kza(this, this.bp, this, this);
  private final lin ad = new lin(this, this.bp);
  private final iic ae;
  private kzu af;
  private String ag;
  private String ah;
  private boolean ai;
  private boolean aj;
  private boolean ak;
  private List<lhr> al;
  private int am;
  private boolean an;
  private boolean ao;
  private boolean ap;
  private Boolean aq;
  String b;
  String c;
  dti d;
  
  public dsy()
  {
    iic localiic = new iic(this, this.bp, new dta(this));
    localiic.e = new dsz(this);
    localiic.f = true;
    this.ae = localiic;
    this.am = 0;
    this.ao = true;
    this.ap = true;
    new gzc(this, new dtc(this));
  }
  
  private final void P()
  {
    int i;
    hqr localhqr;
    if (!TextUtils.isEmpty(this.d.b))
    {
      i = 1;
      localhqr = null;
      if (i != 0)
      {
        localhqr = new hqr(new String[] { "_id" }, 3);
        Integer[] arrayOfInteger1 = new Integer[1];
        arrayOfInteger1[0] = Integer.valueOf(0);
        localhqr.a(arrayOfInteger1);
        if (this.al.size() > 1)
        {
          Integer[] arrayOfInteger4 = new Integer[1];
          arrayOfInteger4[0] = Integer.valueOf(1);
          localhqr.a(arrayOfInteger4);
        }
        if (!Z()) {
          break label127;
        }
        Integer[] arrayOfInteger3 = new Integer[1];
        arrayOfInteger3[0] = Integer.valueOf(2);
        localhqr.a(arrayOfInteger3);
      }
    }
    for (;;)
    {
      this.aU = localhqr;
      return;
      i = 0;
      break;
      label127:
      if (this.ak)
      {
        Integer[] arrayOfInteger2 = new Integer[1];
        arrayOfInteger2[0] = Integer.valueOf(3);
        localhqr.a(arrayOfInteger2);
      }
    }
  }
  
  private final void Q()
  {
    Boolean localBoolean;
    if (this.aL != null)
    {
      localBoolean = this.aR;
      if (localBoolean != null) {
        break label30;
      }
    }
    label30:
    for (boolean bool = false; bool; bool = localBoolean.booleanValue())
    {
      this.aL.a();
      return;
    }
    cyh localcyh = this.aL;
    localcyh.f = true;
    localcyh.b();
  }
  
  private final void R()
  {
    int i = this.at.c();
    Intent localIntent = efj.j(this.bn, i);
    localIntent.putExtra("square_embed", h(true));
    localIntent.putExtra("disable_location", true);
    localIntent.putExtra("clear_acl", true);
    localIntent.putExtra("circle_usage_type", 16);
    localIntent.putExtra("category_display_mode", 2);
    localIntent.putExtra("filter_null_gaia_ids", true);
    a(localIntent);
  }
  
  private final void S()
  {
    int i = this.at.c();
    Intent localIntent = efj.j(this.bn, i);
    localIntent.putExtra("square_embed", h(false));
    localIntent.putExtra("disable_location", true);
    a(localIntent);
  }
  
  private final void a(String paramString1, String paramString2)
  {
    if ((this.b == null) && (paramString1 == null)) {
      return;
    }
    this.b = paramString1;
    this.ah = paramString2;
    dti localdti = this.d;
    if (paramString1 != null) {}
    for (boolean bool = true;; bool = false)
    {
      localdti.p = bool;
      this.aI = true;
      this.aB = null;
      this.ak = false;
      P();
      M_();
      this.m.putString("stream_id", this.b);
      k().b(2, null, this);
      this.aK = true;
      Q();
      super.W();
      return;
    }
  }
  
  private final void g(boolean paramBoolean)
  {
    Bundle localBundle = gxy.a("extra_square_id", this.a);
    localBundle.putByteArray("extra_notification_volume_change", qat.a(gxy.a(4, this.d.c().c, this.d.c().e, this.d.c().c, paramBoolean)));
    int i = this.at.c();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.ae;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
  }
  
  private final lmb h(boolean paramBoolean)
  {
    String str1 = this.d.d;
    String str2 = this.d.c;
    if (this.d.r != null) {}
    for (boolean bool = true;; bool = false) {
      return new lmb(this.a, this.c, str1, str2, paramBoolean, bool);
    }
  }
  
  protected final String D()
  {
    return "android_communities_gmh";
  }
  
  protected final gzf F()
  {
    mbf localmbf = this.bn;
    int i = this.at.c();
    String str1 = this.a;
    String str2 = this.b;
    if (this.az != null) {}
    for (String[] arrayOfString = this.az.u();; arrayOfString = null) {
      return bnd.a(localmbf, i, 4, null, str1, str2, arrayOfString, null, this.aC, ab());
    }
  }
  
  protected final boolean G()
  {
    return false;
  }
  
  public final void K_()
  {
    int i = this.at.c();
    Intent localIntent = ((kyh)mbb.a(this.bn, kyh.class)).a(i, this.a, this.d.g, this.d.i, null);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  protected final boolean L_()
  {
    return (this.d.isEmpty()) && (super.L_());
  }
  
  public final void M()
  {
    b(efj.k(this.bn, this.at.c()));
  }
  
  protected final void M_()
  {
    this.aH = efj.a(null, null, false, this.a, this.b, 0, null);
  }
  
  public final String N()
  {
    return this.a;
  }
  
  public final int O()
  {
    return this.d.g;
  }
  
  public final void W()
  {
    super.W();
    am().b(new kzg(this.bn, this.at.c(), this.a, this.an));
    N_();
  }
  
  protected final boolean Z()
  {
    return (this.aQ != null) && (!this.aQ.booleanValue());
  }
  
  public final boolean Z_()
  {
    int m;
    if ((!super.Z_()) && (!this.ao))
    {
      gzj localgzj = am();
      if (localgzj.c == null) {
        break label100;
      }
      gzy localgzy = localgzj.b;
      efj.k();
      int j = localgzj.c.b;
      int k = localgzy.c.size();
      m = 0;
      if (m >= k) {
        break label100;
      }
      if (((gzf)localgzy.c.get(m)).h != j) {
        break label94;
      }
    }
    label94:
    label100:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label105;
      }
      return true;
      m++;
      break;
    }
    label105:
    return false;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    this.d = ((dti)this.az);
    this.d.v = this.aq;
    dti localdti = this.d;
    if (this.b != null) {}
    for (boolean bool = true;; bool = false)
    {
      localdti.p = bool;
      cyh localcyh = this.aL;
      localcyh.f = true;
      localcyh.b();
      return localView;
    }
  }
  
  protected final dfz a(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    return new dti(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, paramcyh, paramlob);
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return super.a(paramInt, paramBundle);
    }
    kzo localkzo = new kzo(this.bn, this.at.c(), this.a, kzq.d);
    localkzo.r = false;
    return localkzo;
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, String paramString1, String paramString2)
  {
    if (this.am == paramInt) {
      return;
    }
    this.am = paramInt;
    this.d.x = this.am;
    ad();
    a(paramString1, paramString2);
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.al = new ArrayList();
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("square_expanded")) {
        this.aq = Boolean.valueOf(paramBundle.getBoolean("square_expanded"));
      }
      if (paramBundle.containsKey("square_name")) {
        this.c = paramBundle.getString("square_name");
      }
      if (paramBundle.containsKey("square_stream_name")) {
        this.ah = paramBundle.getString("square_stream_name");
      }
      this.ai = paramBundle.getBoolean("square_is_restricted");
    }
    for (this.an = false;; this.an = true)
    {
      k().a(100, null, this);
      Intent localIntent = f().getIntent();
      this.aS = localIntent.getStringExtra("com.google.android.libraries.social.notifications.notif_id");
      this.aT = localIntent.getLongExtra("com.google.android.libraries.social.notifications.updated_version", 0L);
      this.aV = new lfr(this.bn, this, this.at.c());
      this.aV.c = this;
      return;
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("report_invite_abuse".equals(paramString))
    {
      gzj localgzj = am();
      bnt localbnt = new bnt(this.bn, this.at.c(), this.aS, this.aT);
      localgzj.d.a(localbnt, false);
      localgzj.b(localbnt);
    }
  }
  
  public final void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    boolean bool6;
    boolean bool7;
    label209:
    boolean bool8;
    label238:
    boolean bool9;
    label267:
    boolean bool10;
    label288:
    boolean bool11;
    label309:
    boolean bool16;
    label446:
    boolean bool12;
    label475:
    boolean bool13;
    label498:
    boolean bool14;
    label532:
    int j;
    label608:
    int k;
    Object localObject1;
    label656:
    int n;
    label711:
    int i6;
    label835:
    Object localObject2;
    int i2;
    int i3;
    label953:
    String str2;
    Object localObject3;
    int i4;
    switch (paramfu.i)
    {
    default: 
      super.a(paramfu, paramCursor);
      return;
    case 100: 
      this.ao = false;
      if ((paramCursor != null) && (paramCursor.moveToFirst()))
      {
        dti localdti1 = this.d;
        localdti1.a = paramCursor.getString(0);
        localdti1.b = paramCursor.getString(1);
        localdti1.c = paramCursor.getString(3);
        localdti1.d = paramCursor.getString(2);
        localdti1.e = paramCursor.getString(4);
        localdti1.f = paramCursor.getInt(6);
        localdti1.g = paramCursor.getInt(7);
        if (paramCursor.getInt(8) != 0)
        {
          bool6 = true;
          localdti1.m = bool6;
          localdti1.h = paramCursor.getInt(10);
          localdti1.i = paramCursor.getInt(5);
          if (paramCursor.getInt(11) == 0) {
            break label1048;
          }
          bool7 = true;
          localdti1.j = bool7;
          if ((!localdti1.m) || (paramCursor.getInt(16) == 0)) {
            break label1054;
          }
          bool8 = true;
          localdti1.k = bool8;
          if ((!localdti1.m) || (paramCursor.getInt(15) == 0)) {
            break label1060;
          }
          bool9 = true;
          localdti1.l = bool9;
          if (paramCursor.getInt(17) == 0) {
            break label1066;
          }
          bool10 = true;
          localdti1.n = bool10;
          if (paramCursor.getInt(26) == 0) {
            break label1072;
          }
          bool11 = true;
          localdti1.o = bool11;
          localdti1.q = paramCursor.getInt(28);
          localdti1.r = paramCursor.getString(30);
          localdti1.s = jht.c(paramCursor.getBlob(31));
          localdti1.u = ((qek)hqv.a(new qek(), paramCursor.getBlob(32)));
          localdti1.t.clear();
          if (!paramCursor.isNull(33)) {
            localdti1.t.addAll(mab.d(paramCursor.getBlob(33)));
          }
          if (localdti1.v == null)
          {
            if (localdti1.m) {
              break label1078;
            }
            bool16 = true;
            localdti1.v = Boolean.valueOf(bool16);
          }
          localdti1.notifyDataSetChanged();
          if (paramCursor.getInt(12) == 0) {
            break label1084;
          }
          bool12 = true;
          this.aQ = Boolean.valueOf(bool12);
          if (paramCursor.getInt(8) == 0) {
            break label1090;
          }
          bool13 = true;
          this.aR = Boolean.valueOf(bool13);
          this.c = paramCursor.getString(1);
          if (paramCursor.getString(30) == null) {
            break label1096;
          }
          bool14 = true;
          this.ai = bool14;
          kwz localkwz = this.aX;
          kxb localkxb = new kxb(this.bn, ehr.ao, ehr.aq, ehr.ap, ehr.an, ehr.am);
          localkwz.a(localkxb.a, null, localkxb);
          kzc[] arrayOfkzc = kzc.a(paramCursor.getBlob(18));
          if (arrayOfkzc == null) {
            break label1102;
          }
          j = arrayOfkzc.length;
          if ((arrayOfkzc == null) && (this.aQ.booleanValue())) {
            break label1235;
          }
          if (j != 1) {
            break label1108;
          }
          this.ag = arrayOfkzc[0].a;
          String str5 = arrayOfkzc[0].b;
          k = 0;
          localObject1 = str5;
          int m = Math.max(0, -1 + this.al.size());
          if ((!this.ap) && (k == m) && ((this.ag == null) || (TextUtils.equals(this.ag, this.b)))) {
            break label1123;
          }
          n = 1;
          if (Log.isLoggable("HostedSquareStreamFrag", 3))
          {
            boolean bool15 = this.ap;
            String str3 = this.ag;
            String str4 = this.b;
            new StringBuilder(92 + String.valueOf(str3).length() + String.valueOf(str4).length()).append("populatePrimarySpinner firstLoad=").append(bool15).append(" numStreams=").append(k).append(" old=").append(m).append(" streamId=").append(str3).append(" old=").append(str4);
          }
          this.ap = false;
          if (n == 0)
          {
            i6 = 0;
            if (i6 < k)
            {
              if (TextUtils.equals(arrayOfkzc[i6].a, ((lhr)this.al.get(i6 + 1)).b)) {
                break label1129;
              }
              n = 1;
            }
          }
          if (n == 0) {
            break label1235;
          }
          int i1 = -1;
          this.al.clear();
          localObject2 = this.ag;
          if (k > 1)
          {
            List localList = this.al;
            int i5 = efj.Bs;
            localList.add(new lhr(g().getString(i5), null));
            i1 = 0;
          }
          i2 = 0;
          i3 = i1;
          if (i2 >= k) {
            break label1135;
          }
          kzc localkzc = arrayOfkzc[i2];
          str2 = localkzc.a;
          localObject3 = localkzc.b;
          this.al.add(new lhr((String)localObject3, str2));
          if (!TextUtils.equals(this.b, str2)) {
            break label1507;
          }
          i4 = i2 + 1;
        }
      }
      break;
    }
    for (Object localObject4 = str2;; localObject4 = localObject2)
    {
      i2++;
      i3 = i4;
      localObject2 = localObject4;
      localObject1 = localObject3;
      break label953;
      bool6 = false;
      break;
      label1048:
      bool7 = false;
      break label209;
      label1054:
      bool8 = false;
      break label238;
      label1060:
      bool9 = false;
      break label267;
      label1066:
      bool10 = false;
      break label288;
      label1072:
      bool11 = false;
      break label309;
      label1078:
      bool16 = false;
      break label446;
      label1084:
      bool12 = false;
      break label475;
      label1090:
      bool13 = false;
      break label498;
      label1096:
      bool14 = false;
      break label532;
      label1102:
      j = 0;
      break label608;
      label1108:
      this.ag = null;
      k = j;
      localObject1 = null;
      break label656;
      label1123:
      n = 0;
      break label711;
      label1129:
      i6++;
      break label835;
      label1135:
      this.am = i3;
      this.d.x = i3;
      if (this.al.size() > 1)
      {
        dti localdti2 = this.d;
        localdti2.w = this.al;
        if (localdti2.y != null) {
          localdti2.y.a(localdti2.w);
        }
        this.d.x = this.am;
        P();
      }
      if (!TextUtils.isEmpty(this.ag)) {
        localObject2 = null;
      }
      a((String)localObject2, (String)localObject1);
      label1235:
      Q();
      this.as.a();
      hwq localhwq = this.aw;
      hwt localhwt = hwt.b;
      if (localhwt == null) {
        throw new NullPointerException();
      }
      localhwq.g = ((hwt)localhwt);
      localhwq.a();
      if (Log.isLoggable("HostedSquareStreamFrag", 4))
      {
        String str1 = String.valueOf(this.c);
        if (str1.length() == 0) {
          break label1341;
        }
        "- setSquareData name=".concat(str1);
      }
      for (;;)
      {
        P();
        k().b(2, null, this);
        N_();
        return;
        label1341:
        new String("- setSquareData name=");
      }
      int i;
      if (!this.ak)
      {
        gzj localgzj = am();
        boolean bool2 = localgzj.a("prefetch_newposts");
        boolean bool3 = localgzj.a("fetch_older");
        boolean bool4 = localgzj.a("fetch_newer");
        boolean bool5 = localgzj.a("GetSquareTask");
        if ((bool3) || (bool4) || (bool5) || (bool2))
        {
          i = 0;
          if (i == 0) {
            break label1502;
          }
        }
      }
      else
      {
        if ((this.d.aN[2].c == null) || (this.d.e_(2) != 0) || (paramCursor.getCount() != 0)) {
          break label1502;
        }
      }
      label1502:
      for (boolean bool1 = true;; bool1 = false)
      {
        this.ak = bool1;
        if (this.ak) {
          P();
        }
        super.a(paramfu, paramCursor);
        return;
        i = 1;
        break;
      }
      label1507:
      localObject3 = localObject1;
      i4 = i3;
    }
  }
  
  public final void a(gpr paramgpr)
  {
    int i = 1;
    gqe localgqe = (gqe)paramgpr.a(eyg.G);
    localgqe.b = Math.max(i, localgqe.b);
    if (Z_()) {
      localgqe.a = i;
    }
    paramgpr.a(this.c);
    int j;
    label111:
    int k;
    label169:
    int i1;
    label286:
    int i3;
    if ((this.aR == null) || (this.d == null))
    {
      j = i;
      if (j == 0)
      {
        if (!this.d.k) {
          break label441;
        }
        paramgpr.b(eyg.p);
        if (this.d.l) {
          paramgpr.b(eyg.L);
        }
        if (this.d.l)
        {
          int i6 = eyg.K;
          gqj localgqj = new gqj(this);
          localgqj.a = efj.Bz;
          paramgpr.a(i6, localgqj);
        }
        if (this.d.g != i) {
          break label464;
        }
        k = i;
        if ((k == 0) && (((git)mbb.a(this.bn, git.class)).f().c("is_google_plus"))) {
          paramgpr.b(eyg.H);
        }
        if (!this.aR.booleanValue()) {
          break label513;
        }
        paramgpr.b(eyg.M);
        paramgpr.b(eyg.E);
        if (!this.d.n) {
          break label470;
        }
        paramgpr.b(eyg.w);
        int n = this.d.g;
        if ((n != 2) && (n != i)) {
          break label662;
        }
        i1 = i;
        if (i1 != 0)
        {
          i3 = eyg.B;
          paramgpr.a(i3, eyg.O, 0, efj.BC);
          if (this.d.g != i) {
            break label668;
          }
        }
      }
    }
    for (;;)
    {
      if (i != 0) {
        paramgpr.a(i3, eyg.N, 0, efj.BB);
      }
      if (this.ae.a(this.at.c()))
      {
        int i2 = eyg.s;
        iic localiic = this.ae;
        gxr localgxr = new gxr();
        gxq localgxq = new gxq(pjo.c);
        localgxr.b.add(localgxq);
        paramgpr.a(i2, new iig(localiic, localgxr.a(this.bn)));
      }
      return;
      j = 0;
      break;
      label441:
      if (!this.d.l) {
        break label111;
      }
      paramgpr.b(eyg.q);
      break label111;
      label464:
      k = 0;
      break label169;
      label470:
      MenuItem localMenuItem = paramgpr.b(eyg.z);
      if (!this.d.o) {}
      int i5;
      for (int i4 = i;; i5 = 0)
      {
        localMenuItem.setEnabled(i4);
        break;
      }
      label513:
      dti localdti = this.d;
      kxg localkxg = efj.e(localdti.g, localdti.i);
      switch (dtb.a[localkxg.ordinal()])
      {
      default: 
        label572:
        if (this.d.g != 5) {
          break;
        }
      }
      for (int m = i; m != 0; m = 0)
      {
        paramgpr.b(eyg.v);
        break;
        paramgpr.b(eyg.D);
        break label572;
        paramgpr.b(eyg.n);
        break label572;
        paramgpr.b(eyg.t);
        break label572;
        paramgpr.b(eyg.I);
        break label572;
      }
      label662:
      i1 = 0;
      break label286;
      label668:
      i = 0;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    boolean bool = true;
    if ((paramhae != null) && (kdd.a(paramhae.c, "notFound"))) {
      this.aj = bool;
    }
    super.a(paramString, paramhae, paramhaa);
    N_();
    if (hae.a(paramhae)) {
      if ("GetSquareTask".equals(paramString))
      {
        if (!this.aj) {
          break label135;
        }
        localhwq3 = this.aw;
        j = efj.Bv;
        localhwq3.d = null;
        localhwq3.c = j;
        localhwq3.e();
        localhwq4 = this.aw;
        localhwt2 = hwt.c;
        if (localhwt2 == null) {
          throw new NullPointerException();
        }
        localhwq4.g = ((hwt)localhwt2);
        localhwq4.a();
        paramhaa.c = false;
      }
    }
    label135:
    label229:
    while (!"NotificationsReportAbuseTask".equals(paramString)) {
      for (;;)
      {
        hwq localhwq3;
        int j;
        hwq localhwq4;
        hwt localhwt2;
        return;
        this.aJ = bool;
        if (!this.aj) {
          super.af();
        }
        if (!TextUtils.isEmpty(this.d.b)) {}
        hwq localhwq2;
        hwt localhwt1;
        while (!bool)
        {
          hwq localhwq1 = this.aw;
          int i = efj.Bl;
          localhwq1.d = null;
          localhwq1.c = i;
          localhwq1.e();
          localhwq2 = this.aw;
          localhwt1 = hwt.c;
          if (localhwt1 != null) {
            break label229;
          }
          throw new NullPointerException();
          bool = false;
        }
        continue;
        localhwq2.g = ((hwt)localhwt1);
        localhwq2.a();
      }
    }
    f().finish();
  }
  
  public final void a(String paramString, kxg paramkxg)
  {
    this.d.notifyDataSetChanged();
  }
  
  public final void a(kxb paramkxb)
  {
    if (this.ax != null)
    {
      lvz locallvz = this.ax;
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = paramkxb.b;
      locallvz.a(arrayOfInt);
    }
    Boolean localBoolean = this.aR;
    boolean bool = false;
    if (localBoolean == null) {}
    for (;;)
    {
      if ((bool) && (this.N != null)) {
        ((FloatingActionButton)this.N.findViewById(eyg.u)).a(paramkxb.b, paramkxb.c);
      }
      return;
      bool = localBoolean.booleanValue();
    }
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    efj.a(paramtp, true);
  }
  
  protected final void a(boolean paramBoolean)
  {
    if (Log.isLoggable("HostedSquareStreamFrag", 4)) {
      new StringBuilder(26).append("fetchContent - newer=").append(paramBoolean);
    }
    if (Z()) {}
    while ((!paramBoolean) && (this.aM)) {
      return;
    }
    if (paramBoolean) {
      this.aB = null;
    }
    while (L_())
    {
      hwq localhwq1 = this.aw;
      int j = efj.Bo;
      localhwq1.f = null;
      localhwq1.e = j;
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
    String[] arrayOfString;
    bnd localbnd;
    if (((paramBoolean) && (!am().a("fetch_newer"))) || ((!paramBoolean) && (!am().a("fetch_older"))))
    {
      mbf localmbf = this.bn;
      int i = this.at.c();
      String str1 = this.a;
      String str2 = this.b;
      String str3 = this.aB;
      if (this.az == null) {
        break label280;
      }
      arrayOfString = this.az.u();
      localbnd = bnd.a(localmbf, i, 4, null, str1, str2, str3, null, arrayOfString, null, false, false, this.aC, null);
      if (!paramBoolean) {
        break label286;
      }
    }
    label280:
    label286:
    for (String str4 = "fetch_newer";; str4 = "fetch_older")
    {
      localbnd.f = str4;
      am().b(localbnd);
      N_();
      return;
      arrayOfString = null;
      break;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == eyg.p)
    {
      R();
      mbf localmbf15 = this.bn;
      gxr localgxr15 = new gxr();
      gxq localgxq15 = new gxq(pjo.ax);
      localgxr15.b.add(localgxq15);
      new gwz(4, localgxr15.a(this.bn)).b(localmbf15);
      return true;
    }
    if (i == eyg.q)
    {
      S();
      mbf localmbf14 = this.bn;
      gxr localgxr14 = new gxr();
      gxq localgxq14 = new gxq(pjo.aN);
      localgxr14.b.add(localgxq14);
      new gwz(4, localgxr14.a(this.bn)).b(localmbf14);
      return true;
    }
    if (i == eyg.C)
    {
      R();
      mbf localmbf13 = this.bn;
      gxr localgxr13 = new gxr();
      gxq localgxq13 = new gxq(pjo.ax);
      localgxr13.b.add(localgxq13);
      new gwz(4, localgxr13.a(this.bn)).b(localmbf13);
    }
    for (;;)
    {
      return super.a(paramMenuItem);
      if (i == eyg.L)
      {
        S();
        mbf localmbf12 = this.bn;
        gxr localgxr12 = new gxr();
        gxq localgxq12 = new gxq(pjo.aN);
        localgxr12.b.add(localgxq12);
        new gwz(4, localgxr12.a(this.bn)).b(localmbf12);
      }
      else if (i == eyg.D)
      {
        kxg localkxg4 = kxg.d;
        this.aV.a(this.a, localkxg4);
        mbf localmbf11 = this.bn;
        gxr localgxr11 = new gxr();
        gxq localgxq11 = new gxq(pjo.az);
        localgxr11.b.add(localgxq11);
        new gwz(4, localgxr11.a(this.bn)).b(localmbf11);
      }
      else if (i == eyg.n)
      {
        kxg localkxg3 = kxg.e;
        this.aV.a(this.a, localkxg3);
        mbf localmbf10 = this.bn;
        gxr localgxr10 = new gxr();
        gxq localgxq10 = new gxq(pjo.b);
        localgxr10.b.add(localgxq10);
        new gwz(4, localgxr10.a(this.bn)).b(localmbf10);
      }
      else if (i == eyg.t)
      {
        kxg localkxg2 = kxg.g;
        this.aV.a(this.a, localkxg2);
        mbf localmbf9 = this.bn;
        gxr localgxr9 = new gxr();
        gxq localgxq9 = new gxq(pjo.j);
        localgxr9.b.add(localgxq9);
        new gwz(4, localgxr9.a(this.bn)).b(localmbf9);
      }
      else if (i == eyg.I)
      {
        kxg localkxg1 = kxg.f;
        this.aV.a(this.a, localkxg1);
        mbf localmbf8 = this.bn;
        gxr localgxr8 = new gxr();
        gxq localgxq8 = new gxq(pjo.g);
        localgxr8.b.add(localgxq8);
        new gwz(4, localgxr8.a(this.bn)).b(localmbf8);
      }
      else if (i == eyg.v)
      {
        this.ab.b(this.a);
        mbf localmbf7 = this.bn;
        gxr localgxr7 = new gxr();
        gxq localgxq7 = new gxq(pjo.T);
        localgxr7.b.add(localgxq7);
        new gwz(4, localgxr7.a(this.bn)).b(localmbf7);
      }
      else if (i == eyg.z)
      {
        this.ad.a(this.a, Boolean.valueOf(true), null);
        g(true);
        mbf localmbf6 = this.bn;
        gxr localgxr6 = new gxr();
        gxq localgxq6 = new gxq(pjo.aO);
        localgxr6.b.add(localgxq6);
        new gwz(4, localgxr6.a(this.bn)).b(localmbf6);
      }
      else if (i == eyg.w)
      {
        this.ad.a(this.a, Boolean.valueOf(false), null);
        g(false);
        mbf localmbf5 = this.bn;
        gxr localgxr5 = new gxr();
        gxq localgxq5 = new gxq(pjo.aR);
        localgxr5.b.add(localgxq5);
        new gwz(4, localgxr5.a(this.bn)).b(localmbf5);
      }
      else if (i == eyg.M)
      {
        a(this.aZ.a(this.at.c(), this.a), 3);
        mbf localmbf4 = this.bn;
        gxr localgxr4 = new gxr();
        gxq localgxq4 = new gxq(pjo.A);
        localgxr4.b.add(localgxq4);
        new gwz(4, localgxr4.a(this.bn)).b(localmbf4);
      }
      else if (i == eyg.E)
      {
        this.aa.a(this.a, this.d.h);
        mbf localmbf3 = this.bn;
        gxr localgxr3 = new gxr();
        gxq localgxq3 = new gxq(pjo.aD);
        localgxr3.b.add(localgxq3);
        new gwz(4, localgxr3.a(this.bn)).b(localmbf3);
      }
      else
      {
        if (i == eyg.H)
        {
          if (this.aS != null)
          {
            Bundle localBundle1 = gxy.a("extra_notification_id", this.aS);
            gxx localgxx2 = (gxx)this.bo.a(gxx.class);
            gxw localgxw2 = new gxw(this.bn);
            localgxw2.c = gxz.Z;
            if (localBundle1 != null) {
              localgxw2.h.putAll(localBundle1);
            }
            localgxx2.a(localgxw2);
            int k = efj.Bp;
            String str1 = g().getString(k);
            int m = efj.Br;
            String str2 = g().getString(m);
            int n = efj.Bq;
            String str3 = g().getString(n);
            int i1 = efj.Bj;
            lut locallut = lut.a(str1, str2, str3, g().getString(i1), 0, 0);
            locallut.n = this;
            locallut.p = 0;
            Bundle localBundle2 = locallut.m;
            localBundle2.putString("com.google.android.libraries.social.notifications.notif_id", this.aS);
            localBundle2.putLong("com.google.android.libraries.social.notifications.updated_version", this.aT);
            locallut.a(this.x, "report_invite_abuse");
          }
          for (;;)
          {
            mbf localmbf2 = this.bn;
            gxr localgxr2 = new gxr();
            gxq localgxq2 = new gxq(pjo.aM);
            localgxr2.b.add(localgxq2);
            new gwz(4, localgxr2.a(this.bn)).b(localmbf2);
            break;
            kza localkza = this.ac;
            new kyy().a(localkza.a.h(), null);
            gxx localgxx1 = (gxx)this.bo.a(gxx.class);
            gxw localgxw1 = new gxw(this.bn);
            localgxw1.c = gxz.Z;
            localgxx1.a(localgxw1);
          }
        }
        if (i == eyg.O)
        {
          a(((kya)this.bo.a(kya.class)).a(this.at.c(), this.a));
          mbf localmbf1 = this.bn;
          gxr localgxr1 = new gxr();
          gxq localgxq1 = new gxq(pjo.aq);
          localgxr1.b.add(localgxq1);
          new gwz(4, localgxr1.a(this.bn)).b(localmbf1);
        }
        else if (i == eyg.N)
        {
          kzu localkzu = this.af;
          kyb localkyb = localkzu.d;
          Context localContext = localkzu.c;
          int j = eu.e;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localkzu.b.d();
          localkyb.a(localContext.getString(j, arrayOfObject), "", localkzu.c.getString(eu.d), localkzu.c.getString(eu.f), localkzu.c.getString(eu.a)).a(localkzu.a.h(), "delete_square_mixin_tag");
        }
      }
    }
  }
  
  public final boolean aa()
  {
    return true;
  }
  
  protected final void af()
  {
    if (this.aj) {
      return;
    }
    super.af();
  }
  
  protected final void b(Intent paramIntent)
  {
    boolean bool = TextUtils.isEmpty(this.c);
    gnb localgnb = null;
    String str1;
    String str2;
    String str3;
    if (!bool)
    {
      if (this.b == null) {
        break label93;
      }
      str1 = this.b;
      str2 = this.a;
      str3 = this.c;
      if (this.b != null) {
        break label102;
      }
    }
    label93:
    label102:
    for (String str4 = "";; str4 = this.ah)
    {
      localgnb = new gnb(new lhp(str2, str3, str1, str4, this.ai));
      paramIntent.putExtra("extra_acl", localgnb);
      super.b(paramIntent);
      return;
      str1 = this.ag;
      break;
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    paramBundle.putString("extra_square_id", this.a);
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(boolean paramBoolean)
  {
    this.aq = Boolean.valueOf(paramBoolean);
    this.d.v = Boolean.valueOf(paramBoolean);
  }
  
  public final void c(int paramInt)
  {
    int i = this.at.c();
    String str1;
    int j;
    hum localhum;
    mbf localmbf;
    String str2;
    if (efj.o(paramInt))
    {
      Bundle localBundle = this.m;
      str1 = localBundle.getString("suggestion_id");
      j = localBundle.getInt("suggestion_ui", -1);
      if ((!TextUtils.isEmpty(str1)) && (j != -1))
      {
        localhum = this.aY;
        localmbf = this.bn;
        str2 = String.valueOf(this.a);
        if (str2.length() == 0) {
          break label114;
        }
      }
    }
    label114:
    for (String str3 = "g:".concat(str2);; str3 = new String("g:"))
    {
      localhum.a(localmbf, i, str3, str1, j, 230);
      return;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aX = new kwz(this.bn);
    this.aX.a(this);
    this.af = new kzu(this, this.bp, this, this);
    mbb localmbb = this.bo;
    localmbb.a(gii.class, this.ac);
    localmbb.a(lfy.class, this.aa);
    localmbb.a(lfh.class, this.ab);
    localmbb.a(lfi.class, this.ab);
    localmbb.a(lfk.class, this.Z);
    localmbb.a(kwz.class, this.aX);
    localmbb.a(lht.class, this);
    localmbb.a(kxp.class, this);
    localmbb.a(kxo.class, this);
    localmbb.a(dtl.class, this);
    localmbb.a(kxx.class, this.af);
    this.aY = ((hum)this.bo.a(hum.class));
    kxq localkxq = (kxq)this.bo.a(kxq.class);
    this.aW = localkxq.a(this.bn).a(f());
    lvi locallvi1 = this.au;
    lvh locallvh1 = localkxq.a();
    locallvi1.a.add(locallvh1);
    lvi locallvi2 = this.au;
    lvh locallvh2 = localkxq.b();
    locallvi2.a.add(locallvh2);
    lvi locallvi3 = this.au;
    kxi localkxi = this.aW;
    locallvi3.a.add(localkxi);
    this.aZ = ((dsr)this.bo.a(dsr.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final String d()
  {
    return this.c;
  }
  
  public final void d(int paramInt)
  {
    if ((paramInt == 3) || (paramInt == 2))
    {
      this.ap = true;
      super.W();
    }
  }
  
  protected final void e(Intent paramIntent)
  {
    paramIntent.putExtra("square_membership", this.d.g);
    paramIntent.putExtra("square_joinability", this.d.i);
    paramIntent.putExtra("refresh", true);
    super.e(paramIntent);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.c != null) {
      paramBundle.putString("square_name", this.c);
    }
    if (this.ah != null) {
      paramBundle.putString("square_stream_name", this.ah);
    }
    if (this.aq != null) {
      paramBundle.putBoolean("square_expanded", this.aq.booleanValue());
    }
    paramBundle.putBoolean("square_is_restricted", this.ai);
  }
  
  public final void f_()
  {
    super.f_();
    this.aW.a(null);
    this.aX.c.remove(this);
  }
  
  public final void m()
  {
    super.m();
    if (this.an)
    {
      super.W();
      am().b(new kzg(this.bn, this.at.c(), this.a, this.an));
      N_();
      this.an = false;
    }
  }
  
  public final gya r_()
  {
    return gya.E;
  }
  
  public final gxq v()
  {
    return new kuw(pjo.C, this.a);
  }
  
  protected final hqr w()
  {
    return this.aU;
  }
  
  public final CharSequence z()
  {
    int i = efj.BA;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return g().getString(i, arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dsy
 * JD-Core Version:    0.7.0.1
 */