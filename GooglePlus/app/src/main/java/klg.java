import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.BaseAdapter;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.social.acl.PlusAclPickerActivity;
import com.google.android.libraries.social.acl.TextOnlyAudienceView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.help.TooltipView;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;
import com.google.android.libraries.social.sharekit.comments.CommentBox;
import com.google.android.libraries.social.sharekit.impl.CommentBoxFragment;
import com.google.android.libraries.social.sharekit.impl.ComposedContentFragment;
import com.google.android.libraries.social.sharekit.impl.drafts.ImageButtonWithCount;
import com.google.android.libraries.social.ui.views.ObservableGridView;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class klg
  implements gxs, gzi, irq, kic, kik, kjh, kmi, kym, luu, lvc, lyt, mbo, mdi, mdl, mdp, meq, mes, mez, mfa, mfc, mfd, mfk
{
  static final String[] ah = { "audience_data", "audience_history" };
  TextView A;
  View B;
  TooltipView C;
  TooltipView D;
  public final irp E;
  public final kkb F;
  public final kji G;
  public final kjr H;
  byte[] I;
  public int J;
  public int K;
  ComposedContentFragment L;
  TextOnlyAudienceView M;
  int N;
  int O = -1;
  public final kim P = new klt(this);
  idx Q;
  hzv R;
  kmb S;
  boolean T;
  ArrayList<gnb> U;
  kyl V;
  jjd[] W;
  bj X;
  kmw<kog> Y;
  boolean Z;
  final kl<String, jgs> a = new kl();
  private boolean aA;
  private int aB;
  private float aC;
  private int aD;
  private kmf aE;
  private int aF;
  private kkx aG;
  private mcs aH = new mcs("sharekit.enabled.drafts.flag", (byte)0);
  private boolean aI;
  private boolean aJ;
  private boolean aK = false;
  private final guf aL = new klh(this);
  private hyi aM;
  private giz aN;
  private iyl aO;
  private final View.OnClickListener aP = new klk(this);
  long aa = -1L;
  boolean ab;
  long ac = -1L;
  long ad;
  public ra ae;
  giy af;
  hhh ag;
  private final kly ai = new kly(this);
  private final klu aj = new klu(this);
  private final klr ak = new klr(this);
  private final klq al = new klq(this);
  private final klx am = new klx(this);
  private final klw an = new klw(this);
  private ImageButton ao;
  private ImageButton ap;
  private LinearLayout aq;
  private View ar;
  private TextView as;
  private View at;
  private Boolean au;
  private boolean av = true;
  private gnb aw;
  private boolean ax;
  private String ay;
  private int az = -1;
  final kl<String, hps> b = new kl();
  final kl<String, lhp> c = new kl();
  git d;
  public final kmo e;
  final bp f;
  final kls g = new kls(this);
  final klv h = new klv(this);
  final kma i = new kma(this);
  ImageButton j;
  ImageButtonWithCount k;
  ScrollView l;
  ExpandingScrollView m;
  ViewGroup n;
  ObservableGridView o;
  kkq p;
  gzj q;
  gnb r;
  boolean s;
  boolean t;
  boolean u;
  boolean v;
  boolean w;
  boolean x = false;
  View y;
  AvatarView z;
  
  public klg(bp parambp, mek parammek)
  {
    this.f = parambp;
    this.e = new kmo(parambp, parammek);
    this.E = new irp(parambp, parammek);
    this.F = new kkb(parambp, parammek);
    this.G = new kji(parambp, parammek);
    this.H = new kjr(parambp, parammek);
    parammek.a(this);
  }
  
  private final float A()
  {
    if (this.aC == 0.0F) {
      this.aC = this.f.getResources().getInteger(efj.UL);
    }
    return this.aC;
  }
  
  private final boolean B()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label38:
    boolean bool4;
    if (this.au == null)
    {
      if (this.f.getResources().getConfiguration().orientation != 2) {
        break label100;
      }
      bool2 = bool1;
      if (Build.VERSION.SDK_INT < 16) {
        break label105;
      }
      bool3 = bool1;
      if (!bool3) {
        break label116;
      }
      if (bool2)
      {
        int i1 = 0xF & this.f.getResources().getConfiguration().screenLayout;
        if ((i1 != 3) && (i1 != 4)) {
          break label110;
        }
        bool4 = bool1;
        label79:
        if (!bool4) {
          break label116;
        }
      }
    }
    for (;;)
    {
      this.au = Boolean.valueOf(bool1);
      return this.au.booleanValue();
      label100:
      bool2 = false;
      break;
      label105:
      bool3 = false;
      break label38;
      label110:
      bool4 = false;
      break label79;
      label116:
      bool1 = false;
    }
  }
  
  private final jgs C()
  {
    gjb localgjb = this.d.f();
    if (localgjb.c("is_plus_page")) {
      return (jgs)this.a.get("0");
    }
    if ((localgjb.c("is_dasher_account")) && (localgjb.c("is_default_restricted")))
    {
      Iterator localIterator = this.a.values().iterator();
      while (localIterator.hasNext())
      {
        jgs localjgs = (jgs)localIterator.next();
        if (localjgs.c == 8) {
          return localjgs;
        }
      }
    }
    if (!localgjb.c("is_child")) {
      return (jgs)this.a.get("0");
    }
    return null;
  }
  
  private final View a(int paramInt, gxt paramgxt)
  {
    View localView = this.f.findViewById(paramInt);
    efj.a(localView, new gxq(paramgxt));
    localView.setOnClickListener(new gxn(this.aP));
    return localView;
  }
  
  private final TooltipView a(ied paramied, int paramInt1, int paramInt2)
  {
    TooltipView localTooltipView = new TooltipView(this.f);
    localTooltipView.a(paramied);
    Resources localResources = this.f.getResources();
    int i1 = localResources.getDimensionPixelSize(paramInt1);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    mi.a.a(localLayoutParams, i1);
    localTooltipView.setLayoutParams(localLayoutParams);
    localTooltipView.c(localResources.getDimensionPixelSize(paramInt2));
    localTooltipView.a(0);
    ((ViewGroup)this.f.findViewById(aau.Bl)).addView(localTooltipView);
    return localTooltipView;
  }
  
  private final gnb a(Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    if (!this.d.e()) {
      return null;
    }
    String str2 = this.d.f().b("gaia_id");
    if ((("com.google.android.apps.plus.GOOGLE_PLUS_SHARE".equals(str1)) || ("android.intent.action.SEND".equals(str1))) && (!TextUtils.isEmpty(str2)) && (TextUtils.equals(str2, paramIntent.getStringExtra("com.google.android.apps.plus.SENDER_ID"))))
    {
      ArrayList localArrayList1 = paramIntent.getStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_IDS");
      ArrayList localArrayList2 = paramIntent.getStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES");
      int i1;
      if (localArrayList1 != null) {
        i1 = localArrayList1.size();
      }
      while ((localArrayList2 != null) && (i1 != 0) && (i1 == localArrayList2.size()))
      {
        ArrayList localArrayList3 = new ArrayList(localArrayList1.size());
        Long localLong = this.aM.c(kmj.a, this.O);
        int i2 = 0;
        for (;;)
        {
          if ((i2 < i1) && ((localLong == null) || (i2 < localLong.longValue())))
          {
            localArrayList3.add(new jjd((String)localArrayList1.get(i2), (String)localArrayList2.get(i2), null));
            i2++;
            continue;
            i1 = 0;
            break;
          }
        }
        if ((i1 != localArrayList3.size()) && (Log.isLoggable("ShareboxMixin", 5)))
        {
          String str3 = String.valueOf(localLong);
          new StringBuilder(78 + String.valueOf(str3).length()).append("Only ").append(str3).append(" recipients can be prepopulated in a post.  Some recipients were removed.");
        }
        return new gnb(localArrayList3, null);
      }
    }
    return null;
  }
  
  private final void a(long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("extra_draft_id", paramLong);
    this.f.c().b(7, localBundle, this.am);
  }
  
  private final void a(gxz paramgxz)
  {
    gxw localgxw = new gxw(this.f, this.O);
    localgxw.c = paramgxz;
    if (this.O != -1) {
      ((gxx)mbb.a(this.f, gxx.class)).a(localgxw);
    }
  }
  
  private final void a(lyu paramlyu)
  {
    if (b(paramlyu))
    {
      y();
      return;
    }
    z();
  }
  
  static boolean a(gnb paramgnb)
  {
    if (paramgnb.d.length == 0) {}
    while (paramgnb.d[0].c != null) {
      return false;
    }
    return true;
  }
  
  private final boolean b(lyu paramlyu)
  {
    return (paramlyu == lyu.d) && (this.m.a(lyu.d) > this.m.a(lyu.c));
  }
  
  private final View c(int paramInt)
  {
    View localView = this.f.findViewById(paramInt);
    localView.setOnClickListener(this.aP);
    return localView;
  }
  
  private final khx c(gnb paramgnb)
  {
    String str1 = this.E.d;
    gxw localgxw = new gxw(this.f, this.O);
    localgxw.d = gya.U;
    localgxw.e = gya.x;
    localgxw.f = Long.valueOf(System.currentTimeMillis());
    ArrayList localArrayList1 = this.E.a;
    kkt localkkt = this.G.b();
    qbe localqbe;
    String str3;
    khx localkhx;
    String str4;
    label180:
    gnb localgnb;
    label213:
    ArrayList localArrayList2;
    label267:
    String str5;
    if (localkkt != null)
    {
      localqbe = localkkt.a(this.H.c);
      if ((localqbe == null) && (this.G.k != null)) {
        localqbe = this.G.l;
      }
      String str2 = this.E.f;
      str3 = this.E.e;
      localkhx = new khx();
      localkhx.a = this.O;
      localkhx.b = localgxw;
      localkhx.c = this.H.a;
      if (localkkt == null) {
        break label413;
      }
      str4 = localkkt.a;
      localkhx.d = str4;
      localkhx.e = localqbe;
      localkhx.f = paramgnb;
      if (!this.s) {
        break label419;
      }
      localgnb = this.r;
      localkhx.g = localgnb;
      localkhx.h = this.ay;
      localkhx.j = this.L.A();
      localkhx.k = this.L.B();
      if ((str2 != null) || (str3 != null)) {
        break label425;
      }
      localArrayList2 = localArrayList1;
      localkhx.l = localArrayList2;
      localkhx.m = this.G.c;
      localkhx.n = true;
      localkhx.o = this.G.d;
      localkhx.p = this.G.g();
      boolean bool = TextUtils.isEmpty(str1);
      str5 = null;
      if (!bool) {
        break label431;
      }
    }
    for (;;)
    {
      localkhx.q = str5;
      localkhx.r = str3;
      localkhx.s = this.E.g;
      localkhx.t = this.F.b;
      localkhx.u = this.F.a;
      localkhx.v = this.F.c;
      localkhx.w = this.e.b;
      return localkhx;
      localqbe = null;
      break;
      label413:
      str4 = null;
      break label180;
      label419:
      localgnb = null;
      break label213;
      label425:
      localArrayList2 = null;
      break label267;
      label431:
      str5 = str1.trim();
    }
  }
  
  private final void q()
  {
    boolean bool;
    if (this.J == 1)
    {
      bool = true;
      this.ao.setSelected(bool);
      if (!bool) {
        break label92;
      }
    }
    bk localbk;
    label92:
    for (lyu locallyu = lyu.c;; locallyu = lyu.b)
    {
      if (this.m.e != locallyu) {
        this.m.a(locallyu, true);
      }
      localbk = this.f.b.a.d.a(aau.AV);
      if (!bool) {
        break label99;
      }
      localbk.N.setVisibility(0);
      b(this.K);
      return;
      bool = false;
      break;
    }
    label99:
    localbk.N.setVisibility(8);
    this.m.post(new klm(this));
  }
  
  private final boolean r()
  {
    int i1 = this.G.g();
    return (i1 == khz.e) || (i1 == khz.g) || (i1 == khz.b);
  }
  
  private final void s()
  {
    TextView localTextView1 = this.as;
    String str1;
    TextView localTextView2;
    if (TextUtils.isEmpty(this.E.d))
    {
      str1 = this.f.getString(et.i);
      localTextView1.setText(str1);
      localTextView2 = this.as;
      if (!TextUtils.isEmpty(this.E.d)) {
        break label82;
      }
    }
    label82:
    bp localbp;
    int i1;
    Object[] arrayOfObject;
    for (String str2 = this.f.getString(et.i);; str2 = localbp.getString(i1, arrayOfObject))
    {
      localTextView2.setContentDescription(str2);
      return;
      str1 = this.E.d;
      break;
      localbp = this.f;
      i1 = et.h;
      arrayOfObject = new Object[1];
      arrayOfObject[0] = this.E.d;
    }
  }
  
  private final void t()
  {
    gjb localgjb = this.d.f();
    ((TextView)this.f.findViewById(aau.Bf)).setText(localgjb.b("display_name"));
    AvatarView localAvatarView = (AvatarView)this.f.findViewById(aau.Bj);
    localAvatarView.a(localgjb.b("gaia_id"), localgjb.b("profile_photo_url"));
    Context localContext = localAvatarView.getContext();
    int i1 = et.x;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localgjb.b("display_name");
    localAvatarView.setContentDescription(localContext.getString(i1, arrayOfObject));
    u();
  }
  
  private final void u()
  {
    int i1;
    if (this.M != null)
    {
      this.M.j = false;
      TextOnlyAudienceView localTextOnlyAudienceView = this.M;
      localTextOnlyAudienceView.h = this.s;
      localTextOnlyAudienceView.b();
      this.f.findViewById(aau.AO).setVisibility(8);
      gnb localgnb = gnb.a(this.M.c);
      if ((localgnb.c.length != 1) || (localgnb.c[0].c != 9)) {
        break label214;
      }
      i1 = 1;
      if (!this.s) {
        break label219;
      }
      String str3 = this.d.f().b("domain_name");
      String str4 = this.f.getString(et.p);
      String str5 = this.f.getString(et.L, new Object[] { str3 });
      ied localied2 = new ied(this.O, pkd.f, str5, str4, 1);
      iee localiee2 = (iee)mbb.a(this.f, iee.class);
      if (localiee2.a(localied2))
      {
        this.C = a(localied2, efj.UB, efj.UC);
        localiee2.c(this.C);
      }
    }
    label214:
    label219:
    ied localied1;
    iee localiee1;
    do
    {
      do
      {
        return;
        i1 = 0;
        break;
      } while (i1 == 0);
      String str1 = this.f.getString(et.p);
      String str2 = this.f.getString(et.K);
      localied1 = new ied(this.O, pkd.i, str2, str1, 1);
      localiee1 = (iee)mbb.a(this.f, iee.class);
    } while (!localiee1.a(localied1));
    this.D = a(localied1, efj.UI, efj.UJ);
    localiee1.c(this.D);
  }
  
  private final boolean w()
  {
    if ((this.v) || (this.q.a("CreatePostTask")) || (this.q.a("ReshareTask"))) {
      return false;
    }
    gnb localgnb = gnb.a(this.M.c);
    if ((localgnb == null) || (localgnb.b()))
    {
      k();
      return false;
    }
    if (a(localgnb))
    {
      this.aK = true;
      lhp locallhp = localgnb.d[0];
      Intent localIntent = ((kyl)mbb.a(this.f, kyl.class)).a(this.O, locallhp);
      this.f.startActivityForResult(localIntent, 1);
      return false;
    }
    if (this.e.b != null) {
      for (int i1 = 0;; i1++)
      {
        if (i1 >= this.e.a.size()) {
          break label173;
        }
        if (!((kii)this.e.a.get(i1)).d()) {
          break;
        }
      }
    }
    label173:
    return true;
  }
  
  private final void x()
  {
    this.f.finish();
    if (Build.VERSION.SDK_INT >= 16) {
      this.f.overridePendingTransition(0, efj.Uw);
    }
  }
  
  private final void y()
  {
    if ((this.p == null) || (this.p.f)) {
      return;
    }
    gjb localgjb = this.aN.a(this.O);
    String str = this.L.B();
    ArrayList localArrayList = this.E.a;
    kkq localkkq1 = this.p;
    localkkq1.d.a(localgjb.b("gaia_id"), localgjb.b("profile_photo_url"));
    if (TextUtils.isEmpty(str)) {
      str = localkkq1.a.getString(et.A);
    }
    localkkq1.e.setText(str);
    localkkq1.a(localArrayList);
    kkq localkkq2 = this.p;
    int i1;
    if (!localkkq2.f)
    {
      localkkq2.f = true;
      if (Build.VERSION.SDK_INT < 14) {
        break label173;
      }
      i1 = 1;
      if (i1 == 0) {
        break label179;
      }
      localkkq2.b.animate().y(0.0F);
    }
    for (;;)
    {
      this.n.setVisibility(8);
      return;
      label173:
      i1 = 0;
      break;
      label179:
      localkkq2.b.setVisibility(0);
    }
  }
  
  private final void z()
  {
    kkq localkkq;
    int i1;
    if (this.p != null)
    {
      localkkq = this.p;
      if (localkkq.f)
      {
        localkkq.f = false;
        if (Build.VERSION.SDK_INT < 14) {
          break label64;
        }
        i1 = 1;
        if (i1 == 0) {
          break label69;
        }
        localkkq.b.animate().y(-localkkq.c);
      }
    }
    for (;;)
    {
      this.n.setVisibility(0);
      return;
      label64:
      i1 = 0;
      break;
      label69:
      localkkq.b.setVisibility(8);
    }
  }
  
  final void a(int paramInt)
  {
    this.J = paramInt;
    if (paramInt != 0) {
      this.L.v();
    }
    q();
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    for (;;)
    {
      t();
      if ((paramInt2 == -1) && (this.aK)) {
        n();
      }
      this.aK = false;
      return;
      if (paramInt2 == -1)
      {
        gnb localgnb = (gnb)paramIntent.getParcelableExtra("extra_acl");
        if ((localgnb != null) && (a(localgnb)))
        {
          lhp locallhp = localgnb.d[0];
          Intent localIntent2 = ((kyl)mbb.a(this.f, kyl.class)).a(this.O, locallhp);
          this.f.startActivityForResult(localIntent2, 1);
          this.f.overridePendingTransition(efj.Ux, 0);
        }
      }
      if ((paramInt2 == -1) && (paramIntent != null) && (paramIntent.getExtras() != null))
      {
        Bundle localBundle = paramIntent.getExtras();
        if (localBundle.containsKey("restrict_to_domain"))
        {
          a((gnb)localBundle.getParcelable("extra_acl"), false, localBundle.getBoolean("restrict_to_domain"));
        }
        else
        {
          a((gnb)localBundle.getParcelable("extra_acl"), false, this.s);
          continue;
          if ((paramInt2 == -1) && (paramIntent != null))
          {
            long l1 = paramIntent.getLongExtra("extra_draft_id", -1L);
            String str = paramIntent.getStringExtra("activity_id");
            if (str == null)
            {
              a(l1);
            }
            else
            {
              Intent localIntent1 = ((kih)mbb.a(this.f, kih.class)).a(this.f, this.O);
              localIntent1.putExtra("account_id", this.O);
              localIntent1.putExtra("extra_is_from_draft", true);
              localIntent1.putExtra("extra_draft_id", l1);
              localIntent1.putExtra("activity_id", str);
              localIntent1.putExtra("disable_location", true);
              this.f.startActivity(localIntent1);
              x();
            }
          }
          else if (paramIntent == null)
          {
            Log.e("ShareboxMixin", "Data passed in from Drafts Activity is null.");
          }
        }
      }
    }
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = ((git)parammbb.a(git.class));
    this.aE = ((kmf)parammbb.a(kmf.class));
    this.Q = ((idx)parammbb.a(idx.class));
    this.af = ((giy)parammbb.a(giy.class));
    this.ag = ((hhh)parammbb.a(hhh.class));
    this.aM = ((hyi)parammbb.a(hyi.class));
    this.aN = ((giz)parammbb.a(giz.class));
    this.aO = ((iyl)parammbb.a(iyl.class));
    gzj localgzj = (gzj)parammbb.a(gzj.class);
    localgzj.a.add(this);
    this.q = localgzj;
    this.Y = ((kmw)parammbb.a(kmw.class));
    this.V = ((kyl)parammbb.a(kyl.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    this.O = this.d.c();
    this.R = new hzv();
    Intent localIntent = this.f.getIntent();
    this.w = localIntent.getBooleanExtra("clear_acl", false);
    this.az = localIntent.getIntExtra("category_display_mode", -1);
    this.I = localIntent.getByteArrayExtra("promoted_post_data");
    this.aD = localIntent.getIntExtra("circle_usage_type", 5);
    this.t = localIntent.getBooleanExtra("is_limited_sharing", false);
    if (i()) {
      this.aD = 9;
    }
    boolean bool;
    label274:
    int i1;
    label304:
    int i2;
    if ((localIntent.getBooleanExtra("is_limited", false)) || (this.aD == 9) || (this.aD == 10) || (this.aD == 16))
    {
      bool = true;
      this.u = bool;
      if (paramBundle != null) {
        break label381;
      }
      if (localIntent.hasExtra("external_id")) {
        this.ay = localIntent.getStringExtra("external_id");
      }
      if (this.ay == null)
      {
        long l1 = System.currentTimeMillis();
        String str = String.valueOf(mfx.a(32));
        this.ay = (21 + String.valueOf(str).length() + l1 + "." + str);
      }
      this.aw = ((gnb)localIntent.getParcelableExtra("extra_acl"));
      gnb localgnb = a(localIntent);
      if (localgnb == null) {
        break label347;
      }
      a(localgnb, false, this.s);
      if ((this.E.a()) && (!this.E.b()) && (B())) {
        break label369;
      }
      i1 = 1;
      i2 = 0;
      if (i1 == 0) {
        break label375;
      }
      label312:
      this.J = i2;
    }
    for (;;)
    {
      this.E.b.add(this);
      if (paramBundle == null) {
        a(gxz.cK);
      }
      return;
      bool = false;
      break;
      label347:
      a((gnb)localIntent.getParcelableExtra("extra_acl"), false, this.s);
      break label274;
      label369:
      i1 = 0;
      break label304;
      label375:
      i2 = 1;
      break label312;
      label381:
      this.aw = ((gnb)paramBundle.getParcelable("AUDIENCE"));
      this.av = paramBundle.getBoolean("DEFAULT_AUDIENCE");
      this.J = paramBundle.getInt("PICKER_TYPE");
      this.ay = paramBundle.getString("ACTIVITY_ID");
      this.N = paramBundle.getInt("ACTIVE_DIALOG_NAME");
      this.x = paramBundle.getBoolean("AUDIENCE_LOADED");
      this.r = ((gnb)paramBundle.getParcelable("restrict_audience"));
      this.s = paramBundle.getBoolean("restrict_to_domain");
      this.ax = paramBundle.getBoolean("is_restricted_reshare");
      this.aA = paramBundle.getBoolean("using_custom_buttonbar");
      this.Z = paramBundle.getBoolean("does_draft_exist");
      this.aa = paramBundle.getLong("draft_id");
      this.ab = paramBundle.getBoolean("does_sharelet_draft_exist");
      this.ac = paramBundle.getLong("sharelet_draft_id");
      this.T = paramBundle.getBoolean("state_fetched_updated_sharecuts");
      this.U = paramBundle.getParcelableArrayList("state_updated_sharecuts");
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("quit".equals(paramString))
    {
      if (this.e.b != null)
      {
        this.e.a(null);
        this.j.setEnabled(m());
      }
    }
    else {
      return;
    }
    x();
  }
  
  public final void a(bk parambk)
  {
    if ((parambk instanceof MediaPickerFragment)) {
      ((MediaPickerFragment)parambk).aa = true;
    }
  }
  
  final void a(gnb paramgnb, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.av = paramBoolean1;
    this.s = paramBoolean2;
    if (this.M != null)
    {
      this.M.a(paramgnb);
      if (paramgnb != null)
      {
        if (paramgnb.d.length > 0) {
          this.s = paramgnb.d[0].e;
        }
        if (paramgnb.e.length > 0) {
          this.s = paramgnb.e[0].c;
        }
      }
    }
    for (;;)
    {
      u();
      return;
      this.aw = paramgnb;
    }
  }
  
  final void a(CharSequence paramCharSequence, String paramString)
  {
    this.N = 2;
    String str1 = efj.a(paramCharSequence);
    String str5;
    String str2;
    if (str1 == null) {
      if (paramString != null)
      {
        str5 = paramCharSequence.toString();
        str2 = str5;
      }
    }
    for (int i1 = 1;; i1 = 0)
    {
      lvb locallvb = new lvb();
      locallvb.a.putString("text_value", str2);
      locallvb.a.putString("error_msg", paramString);
      String str3 = this.f.getString(et.l);
      locallvb.a.putString("dialog_title", str3);
      String str4 = this.f.getString(et.k);
      locallvb.a.putString("hint_text", str4);
      int i2 = et.g;
      locallvb.a.putInt("cancel_resource_id", i2);
      if (i1 != 0) {
        locallvb.a.putBoolean("cursor_at_end", true);
      }
      luy localluy = locallvb.a();
      localluy.n = this.L;
      localluy.p = 0;
      localluy.a(this.f.b.a.d, "SharekitLinkDialog");
      return;
      str5 = "http://";
      break;
      str2 = str1;
    }
  }
  
  public final void a(String paramString, int paramInt)
  {
    if (this.N == 1)
    {
      localirp = this.E;
      if (paramInt == -1)
      {
        localirp.a(paramString, this);
        s();
      }
    }
    while ((this.N != 2) || (paramInt != -1)) {
      for (;;)
      {
        irp localirp;
        return;
        paramString = null;
      }
    }
    String str = efj.a(paramString);
    if (str == null)
    {
      a(paramString, this.f.getString(et.B));
      return;
    }
    this.L.a(str);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    boolean bool1 = true;
    int i3;
    int i4;
    label50:
    label89:
    int i7;
    if (paramhae != null) {
      if (("CreatePostTask".equals(paramString)) || ("ReshareTask".equals(paramString)))
      {
        i3 = bool1;
        if (i3 == 0) {
          break label325;
        }
        if (paramhae.b == 200) {
          break label119;
        }
        i4 = bool1;
        Exception localException = paramhae.c;
        if (i4 == 0) {
          break label139;
        }
        if (kdd.a(localException, "INVALID_ACL_EXPANSION"))
        {
          if (gnb.a(this.M.c).d.length <= 0) {
            break label125;
          }
          int i6 = et.F;
          if (!bool1) {
            break label131;
          }
          i7 = et.G;
          label104:
          paramhaa.a(i6, i7);
        }
      }
    }
    label119:
    label125:
    int i2;
    label131:
    label139:
    label325:
    label480:
    do
    {
      do
      {
        long l1;
        do
        {
          return;
          i3 = 0;
          break;
          i4 = 0;
          break label50;
          bool1 = false;
          break label89;
          i7 = et.I;
          break label104;
          gjb localgjb = this.d.f();
          if ((localgjb.c("is_dasher_account")) && (!localgjb.c("is_default_restricted")))
          {
            kmf localkmf = this.aE;
            int i5 = this.O;
            boolean bool2 = this.s;
            localkmf.a.b(i5).b("restrict_posts_by_default", bool2).d();
          }
          this.f.setResult(-1);
          if (this.e.b != null) {
            this.e.a(null);
          }
          if (this.Z) {
            this.q.b(new kms("DeleteDraftsTask", this.aa, this.O));
          }
          new kqf(86).b(this.f);
          kat localkat = (kat)mbb.b(this.f, kat.class);
          if (localkat != null) {
            localkat.a(null);
          }
          x();
          return;
          if (!paramString.equals("CreateDraftTask")) {
            break label480;
          }
          this.aJ = false;
          l1 = paramhae.a().getLong("draft_id_extra");
        } while (l1 == -1L);
        byte[] arrayOfByte = paramhae.a().getByteArray("draft_data_extra");
        try
        {
          kog localkog2 = this.Y.a(arrayOfByte);
          localkog1 = localkog2;
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            Log.e("ShareboxMixin", "Failed to restore draft proto");
            kog localkog1 = null;
            continue;
            this.aa = l1;
            this.Z = bool1;
          }
        }
        if ((localkog1 != null) && (localkog1.n != null) && (localkog1.n.b != null))
        {
          this.ac = l1;
          this.ab = bool1;
          this.f.c().a(8, null, this.an).a();
          return;
        }
        if (paramString.equals("UpdateDraftTask"))
        {
          this.aJ = false;
          return;
        }
        if (paramString.equals("SelectShareboxTask"))
        {
          kii localkii = this.e.a(paramhae.a().getString("sharelet_name_extra"));
          this.e.a(localkii);
          return;
        }
      } while (!paramString.equals("AudienceHistoryTask"));
      int i1 = paramhae.b;
      i2 = 0;
      if (i1 != 200) {
        i2 = bool1;
      }
    } while (i2 != 0);
    ArrayList localArrayList1 = paramhae.a().getParcelableArrayList("audience_list");
    ArrayList localArrayList2 = new ArrayList();
    if (localArrayList1 != null)
    {
      Iterator localIterator = localArrayList1.iterator();
      while (localIterator.hasNext())
      {
        Parcelable localParcelable = (Parcelable)localIterator.next();
        if ((localParcelable instanceof gnb)) {
          localArrayList2.add((gnb)localParcelable);
        }
      }
    }
    this.U = localArrayList2;
    this.T = bool1;
  }
  
  public final void a(ArrayList<ipa> paramArrayList, Object paramObject)
  {
    h();
    if (this.E.c != 2) {
      a(0);
    }
    this.aG.a(paramArrayList);
  }
  
  final void a(knq paramknq)
  {
    if (paramknq == null)
    {
      this.G.a(null);
      return;
    }
    String str = paramknq.a();
    Object localObject;
    if ((paramknq.a != null) && (paramknq.a.c != null)) {
      localObject = paramknq.a.c[0];
    }
    for (;;)
    {
      kkt localkkt = new kkt(str, (qbe)localObject);
      this.G.a(localkkt);
      return;
      Bundle localBundle = paramknq.b;
      localObject = null;
      if (localBundle != null)
      {
        qbe localqbe = new qbe();
        qcj localqcj = new qcj();
        localqcj.d = paramknq.b.getString("title");
        localqcj.e = paramknq.b.getString("description");
        localqcj.c = paramknq.b.getString("thumbnailUrl");
        localqbe.a(qcj.a, localqcj);
        localqbe.a = knq.d;
        if (paramknq.c != null)
        {
          localObject = new qbe();
          qcy localqcy = new qcy();
          localqcy.b = localqbe;
          localqcy.c = new qbn();
          localqcy.c.c = -2147483648;
          localqcy.c.a = new qbo();
          localqcy.c.a.b = paramknq.c.c;
          localqcy.c.a.d = paramknq.c.b;
          ((qbe)localObject).a = knq.e;
          ((qbe)localObject).a(qcy.a, localqcy);
        }
        else
        {
          localObject = localqbe;
        }
      }
    }
  }
  
  public final void a(lhp paramlhp)
  {
    a(new gnb(paramlhp), false, this.s);
    if (this.W != null) {
      for (jjd localjjd : this.W) {
        this.M.a(localjjd);
      }
    }
    this.W = null;
    this.X.a(false);
  }
  
  public final void a(lmg paramlmg)
  {
    this.G.a(paramlmg);
  }
  
  public final void a(lyu paramlyu, float paramFloat)
  {
    int i1 = 1;
    if (b(paramlyu))
    {
      efj.a(this.at, 1.0F);
      y();
      return;
    }
    int i2;
    float f1;
    label48:
    label74:
    int i3;
    int i4;
    label111:
    label118:
    ViewGroup localViewGroup;
    int i5;
    int i6;
    int i7;
    int i8;
    if ((paramlyu.a()) || (!B()))
    {
      i2 = i1;
      if (i2 == 0) {
        break label239;
      }
      f1 = paramFloat;
      efj.a(this.at, f1);
      if ((i2 == 0) || (paramFloat <= 0.9F)) {
        break label245;
      }
      y();
      i3 = this.m.a(lyu.b);
      i4 = this.m.a(lyu.c);
      if (this.m.e != lyu.a) {
        break label265;
      }
      if (i1 == 0) {
        break label270;
      }
      i4 = 0;
      if (Log.isLoggable("ShareboxMixin", 2)) {
        new StringBuilder(36).append("setShareboxBottomMargin: ").append(i4);
      }
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.n.getLayoutParams();
      if (localMarginLayoutParams.bottomMargin != i4)
      {
        localMarginLayoutParams.bottomMargin = i4;
        this.n.setLayoutParams(localMarginLayoutParams);
      }
      localViewGroup = this.n;
      i5 = this.aF;
      i6 = this.aF;
      i7 = this.aF;
      i8 = 0;
      if (i4 != 0) {
        break label310;
      }
    }
    for (;;)
    {
      localViewGroup.setPadding(i5, i6, i7, i8);
      return;
      i2 = 0;
      break;
      label239:
      f1 = 0.0F;
      break label48;
      label245:
      if ((i2 != 0) && (paramFloat >= 0.8F)) {
        break label74;
      }
      z();
      break label74;
      label265:
      i1 = 0;
      break label111;
      label270:
      if (!B())
      {
        i4 = i3;
        break label118;
      }
      if (paramlyu.a()) {
        break label118;
      }
      i4 = i3 + Math.round(paramFloat * (i4 - i3));
      break label118;
      label310:
      i8 = this.aF;
    }
  }
  
  public final void a(lyu paramlyu1, lyu paramlyu2)
  {
    int i1 = 1;
    if (Log.isLoggable("ShareboxMixin", 3))
    {
      String str1 = String.valueOf(paramlyu1);
      String str2 = String.valueOf(paramlyu2);
      new StringBuilder(30 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("onExpandingStateChanged: ").append(str1).append(" --> ").append(str2);
    }
    if (!paramlyu2.a()) {
      a(0);
    }
    a(paramlyu2);
    if ((paramlyu2.a()) && (this.J == i1)) {
      if (this.E.a.isEmpty()) {
        break label132;
      }
    }
    for (;;)
    {
      if (i1 != 0) {
        this.E.c = 2;
      }
      return;
      label132:
      i1 = 0;
    }
  }
  
  public final boolean a()
  {
    if (b(this.m.e))
    {
      a(0);
      return true;
    }
    if (l())
    {
      String str;
      if (this.e.b != null)
      {
        str = this.e.b.i();
        if (str == null) {
          break label121;
        }
      }
      for (;;)
      {
        lut locallut = lut.b(null, str, this.f.getString(et.M), this.f.getString(et.D));
        locallut.n = this.L;
        locallut.p = 0;
        locallut.a(this.f.b.a.d, "quit");
        return true;
        str = null;
        break;
        label121:
        str = this.f.getString(et.H);
      }
    }
    if (this.e.b != null)
    {
      this.e.a(null);
      return true;
    }
    x();
    return true;
  }
  
  public final void aJ_()
  {
    s();
  }
  
  public final void aK_()
  {
    j();
  }
  
  public final void aM_()
  {
    if (this.W != null) {
      for (jjd localjjd : this.W) {
        this.M.a(localjjd);
      }
    }
    this.W = null;
  }
  
  final Boolean b(gnb paramgnb)
  {
    boolean bool1 = true;
    jgs[] arrayOfjgs = paramgnb.c;
    int i1 = 0;
    jgs localjgs;
    int i2;
    if (i1 < arrayOfjgs.length)
    {
      localjgs = (jgs)this.a.get(arrayOfjgs[i1].a);
      if ((localjgs == null) || ((arrayOfjgs[i1].c == 9) && (this.s))) {
        bool1 = false;
      }
    }
    else
    {
      if (!bool1) {
        break label199;
      }
      hps[] arrayOfhps = paramgnb.e;
      i2 = 0;
      label75:
      if (i2 >= arrayOfhps.length) {
        break label199;
      }
      String str = arrayOfhps[i2].a;
      boolean bool3 = this.b.containsKey(str);
      bool2 = false;
      if (bool3)
      {
        hps localhps = (hps)this.b.get(str);
        if (localhps.b.equals(arrayOfhps[i2].b)) {
          break label193;
        }
        new gnb(localhps);
      }
    }
    label193:
    label199:
    for (boolean bool2 = bool1;; bool2 = bool1)
    {
      return Boolean.valueOf(bool2);
      if ((localjgs != null) && (!localjgs.equals(arrayOfjgs[i1]))) {
        arrayOfjgs[i1] = localjgs;
      }
      i1++;
      break;
      i2++;
      break label75;
    }
  }
  
  public final void b()
  {
    this.j.setEnabled(m());
    if (this.x) {
      this.B.setVisibility(0);
    }
    a(this.m.e);
  }
  
  public final void b(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt == this.aB) || (!B())) {
      return;
    }
    this.aB = paramInt;
    float f1 = A();
    if (paramInt < Math.round(f1 * this.m.c / 100.0F))
    {
      this.m.a(lyu.d, f1);
      return;
    }
    this.m.a(lyu.d, 100.0F);
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelable("AUDIENCE", gnb.a(this.M.c));
    paramBundle.putBoolean("DEFAULT_AUDIENCE", this.av);
    paramBundle.putInt("PICKER_TYPE", this.J);
    paramBundle.putString("ACTIVITY_ID", this.ay);
    paramBundle.putInt("ACTIVE_DIALOG_NAME", this.N);
    if ((this.p != null) && (this.p.f)) {}
    for (boolean bool = true;; bool = false)
    {
      paramBundle.putBoolean("PICKER_HEADER_SHOWING", bool);
      paramBundle.putBoolean("AUDIENCE_LOADED", this.x);
      paramBundle.putParcelable("restrict_audience", this.r);
      paramBundle.putBoolean("restrict_to_domain", this.s);
      paramBundle.putBoolean("is_restricted_reshare", this.ax);
      paramBundle.putBoolean("using_custom_buttonbar", this.aA);
      paramBundle.putBoolean("does_draft_exist", this.Z);
      paramBundle.putLong("draft_id", this.aa);
      paramBundle.putBoolean("does_sharelet_draft_exist", this.ab);
      paramBundle.putLong("sharelet_draft_id", this.ac);
      paramBundle.putBoolean("state_fetched_updated_sharecuts", this.T);
      paramBundle.putParcelableArrayList("state_updated_sharecuts", this.U);
      return;
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b_(Bundle paramBundle)
  {
    int i1 = 1;
    Intent localIntent = this.f.getIntent();
    boolean bool = localIntent.getBooleanExtra("auto_post", false);
    this.aI = this.aM.b(kmj.c, this.O);
    View localView1 = this.f.findViewById(aau.BB);
    View localView2;
    label233:
    int i4;
    if (localView1 != null)
    {
      localView1.setOnClickListener(this.aP);
      if ((paramBundle != null) && (paramBundle.getBoolean("PICKER_HEADER_SHOWING")))
      {
        int i9 = i1;
        this.p = new kkq(this.f, localView1, i9);
      }
    }
    else
    {
      this.n = ((ViewGroup)this.f.findViewById(aau.Bw));
      this.l = ((ScrollView)this.n.findViewById(aau.Bo));
      this.j = ((ImageButton)a(aau.Be, pkd.e));
      this.ao = ((ImageButton)a(aau.Bd, pkd.c));
      this.ap = ((ImageButton)a(aau.Bc, pkd.a));
      this.aq = ((LinearLayout)this.f.findViewById(aau.Bb));
      localView2 = c(aau.Bx);
      if (this.G.g() != khz.g) {
        break label1016;
      }
      localView2.setVisibility(8);
      int i2 = aau.Bm;
      int i3 = aau.Bn;
      View localView3 = this.f.findViewById(i2);
      if (localView3 == null) {
        localView3 = this.f.findViewById(i3);
      }
      localView3.setOnClickListener(this.aP);
      this.M = ((TextOnlyAudienceView)this.f.findViewById(aau.AN));
      this.M.e = this.O;
      this.M.a(this.aw);
      this.ar = c(aau.AZ);
      this.as = ((TextView)c(aau.Ba));
      s();
      c(aau.Bi);
      this.y = this.f.findViewById(aau.BJ);
      this.z = ((AvatarView)this.f.findViewById(aau.BH));
      this.A = ((TextView)this.f.findViewById(aau.BI));
      this.at = this.f.findViewById(aau.AW);
      if (Build.VERSION.SDK_INT < 11) {
        break label1025;
      }
      i4 = i1;
      label428:
      if (i4 == 0) {
        break label1031;
      }
      this.at.setAlpha(0.0F);
      this.at.setVisibility(0);
      label449:
      this.m = ((ExpandingScrollView)this.f.findViewById(aau.AS));
      this.m.i = this.f.getResources().getDrawable(eyg.bh);
      this.m.d = false;
      ExpandingScrollView localExpandingScrollView = this.m;
      localExpandingScrollView.f.add(this);
      lyt[] arrayOflyt = new lyt[i1];
      arrayOflyt[0] = this;
      localExpandingScrollView.a(Arrays.asList(arrayOflyt));
      this.m.a(lyu.d, 100.0F);
      this.m.a(lyu.c, A());
      this.m.a(lyu.b, 0.0F);
      if (!B()) {
        break label1043;
      }
      this.m.a(ExpandingScrollView.a, ExpandingScrollView.a);
    }
    for (;;)
    {
      this.o = ((MediaPickerFragment)this.f.b.a.d.a(aau.AV)).c;
      ObservableGridView localObservableGridView = this.o;
      lxg locallxg = new lxg(this);
      localObservableGridView.a.add(locallxg);
      this.L = ((ComposedContentFragment)this.f.b.a.d.a(aau.Bn));
      ComposedContentFragment localComposedContentFragment = this.L;
      kjl localkjl = new kjl(this);
      localComposedContentFragment.d.add(localkjl);
      kji localkji1 = this.G;
      klo localklo = new klo(this);
      localkji1.o.add(localklo);
      kji localkji2 = this.G;
      klp localklp = new klp(this);
      localkji2.n.add(localklp);
      this.L.Z = this;
      if (gnb.a(this.M.c) == null) {
        a(this.aw, false, this.s);
      }
      CommentBoxFragment localCommentBoxFragment = this.L.a;
      int i5 = this.O;
      kim localkim = this.P;
      localCommentBoxFragment.b.a(localCommentBoxFragment, i5, null, localkim);
      this.B = this.f.findViewById(aau.AM);
      this.e.c.add(this);
      this.aF = this.f.getResources().getDimensionPixelSize(efj.UA);
      for (int i6 = 0; i6 < this.e.a.size(); i6++)
      {
        kii localkii = (kii)this.e.a.get(i6);
        ImageButton localImageButton = (ImageButton)LayoutInflater.from(this.f).inflate(efj.US, null);
        localImageButton.setContentDescription(localkii.h());
        localImageButton.setImageDrawable(localkii.g());
        localImageButton.setTag(aau.BM, localkii);
        kli localkli = new kli(this, localkii);
        localkii.a(localImageButton);
        localImageButton.setOnClickListener(new gxn(localkli));
        this.aq.addView(localImageButton);
      }
      int i10 = 0;
      break;
      label1016:
      localView2.setVisibility(0);
      break label233;
      label1025:
      i4 = 0;
      break label428;
      label1031:
      this.at.setVisibility(8);
      break label449;
      label1043:
      this.m.a(ExpandingScrollView.b, ExpandingScrollView.b);
    }
    h();
    t();
    this.aG = new kkx(this.q, this.O);
    if (bool) {
      n();
    }
    ((irl)mbb.a(this.f, irl.class)).a(aau.AY, this.aL);
    gnb localgnb1 = a(localIntent);
    if (localgnb1 != null) {
      a(localgnb1, false, this.s);
    }
    label1296:
    label1579:
    label1612:
    do
    {
      break label1579;
      if (this.G.e != null)
      {
        qbe localqbe1 = new qbe();
        qbe localqbe2 = (qbe)this.G.e.a(localqbe1);
        Iterator localIterator = mbb.c(this.f, khy.class).iterator();
        while (localIterator.hasNext())
        {
          khy localkhy = (khy)localIterator.next();
          if (localkhy.a(localqbe2))
          {
            kji localkji3 = this.G;
            localkji3.k = localkhy;
            localkji3.l = localqbe2;
            a(0);
            h();
          }
        }
      }
      gnb localgnb2;
      if (paramBundle == null)
      {
        lmb locallmb = this.G.d;
        localgnb2 = gnb.a(this.M.c);
        if (locallmb == null) {
          break label1612;
        }
        this.s = locallmb.e;
        if (localIntent.getBooleanExtra("extra_is_from_draft", false)) {
          a(localIntent.getLongExtra("extra_draft_id", -1L));
        }
      }
      this.q.a(new hak(this.f, this.f.b.a.d));
      cv localcv = this.f.c();
      localcv.a(i1, Bundle.EMPTY, this.aj);
      if (efj.z(this.f.getBaseContext(), this.O)) {
        this.q.b(new kiz(this.O, this.f.getBaseContext()));
      }
      if (!TextUtils.isEmpty(this.G.a))
      {
        localcv.a(5, Bundle.EMPTY, this.al);
        this.m.a(lyu.a, false);
      }
      if (this.E.h != null) {
        localcv.a(4, Bundle.EMPTY, this.ak);
      }
      kjr localkjr = this.H;
      if ((!TextUtils.isEmpty(localkjr.c)) && (localkjr.d != null) && (!TextUtils.isEmpty(localkjr.d.getString("title"))) && (!TextUtils.isEmpty(localkjr.d.getString("description")))) {}
      for (;;)
      {
        if (i1 != 0) {
          a(efj.a(this.H.d, this.H.b));
        }
        t();
        if (!r()) {
          break label1846;
        }
        a(0);
        return;
        if (localIntent.getParcelableExtra("extra_acl") == null) {
          break;
        }
        a((gnb)localIntent.getParcelableExtra("extra_acl"), false, this.s);
        break;
        if ((localgnb2 != null) && (localgnb2.d.length > 0))
        {
          this.s = localgnb2.d[0].e;
          break label1296;
        }
        if ((localgnb2 != null) && (localgnb2.e.length > 0))
        {
          this.s = localgnb2.e[0].c;
          break label1296;
        }
        if ((!this.d.e()) || (!this.d.f().c("is_dasher_account"))) {
          break label1296;
        }
        if (this.d.f().c("is_default_restricted")) {}
        kmf localkmf;
        int i7;
        for (this.s = i1;; this.s = localkmf.a.a(i7).c("restrict_posts_by_default"))
        {
          int i8 = this.G.g();
          if ((this.f.getIntent().getBooleanExtra("restrict_to_domain", false)) && ((i8 == khz.g) || (i8 == khz.i))) {
            this.ax = i1;
          }
          this.s = this.f.getIntent().getBooleanExtra("restrict_to_domain", this.s);
          break;
          localkmf = this.aE;
          i7 = this.O;
        }
        i1 = 0;
      }
      q();
    } while ((paramBundle != null) || (B()));
    label1846:
    a(0);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void d()
  {
    for (int i1 = 0; i1 < this.e.a.size(); i1++) {
      ((kii)this.e.a.get(i1));
    }
  }
  
  public final void e()
  {
    this.j.setEnabled(m());
  }
  
  public final void f()
  {
    bk localbk1;
    bz localbz;
    if (this.e.b == null)
    {
      localbk1 = null;
      localbz = this.f.b.a.d;
      bk localbk2 = localbz.a("SHARELET_BUTTON_BAR");
      if ((localbk1 != null) || (localbk2 == null)) {
        break label94;
      }
      localbz.a().a(localbk2).b();
      label54:
      if (localbk1 == null) {
        break label119;
      }
    }
    label94:
    label119:
    for (boolean bool = true;; bool = false)
    {
      this.aA = bool;
      h();
      a(0);
      return;
      localbk1 = this.e.b.a(2);
      break;
      if (localbk1 == null) {
        break label54;
      }
      localbz.a().b(aau.BK, localbk1, "SHARELET_BUTTON_BAR").b();
      break label54;
    }
  }
  
  public final void g()
  {
    this.f.c().b(3, Bundle.EMPTY, this.ai);
  }
  
  final void h()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label20:
    boolean bool4;
    label34:
    int i1;
    if (!this.E.a())
    {
      bool2 = bool1;
      if (bool2) {
        break label310;
      }
      bool3 = bool1;
      if ((!this.aI) || (!bool3)) {
        break label315;
      }
      bool4 = bool1;
      LinearLayout localLinearLayout = this.aq;
      if (!this.aA) {
        break label321;
      }
      i1 = 8;
      label51:
      localLinearLayout.setVisibility(i1);
      if (!this.E.b()) {
        break label391;
      }
      bool1 = false;
    }
    label131:
    label390:
    label391:
    for (int i2 = 0;; i2 = bool2)
    {
      if (r())
      {
        bool4 = false;
        i2 = 0;
        bool3 = false;
        bool2 = false;
      }
      if (this.ad == 0L) {
        bool4 = false;
      }
      int i3;
      label144:
      int i4;
      label164:
      int i5;
      label185:
      int i6;
      label205:
      int i9;
      label233:
      int i7;
      label251:
      View localView2;
      if (this.G.g() == khz.g)
      {
        this.z.setVisibility(0);
        this.A.setVisibility(0);
        ImageButton localImageButton1 = this.ap;
        if (!bool3) {
          break label348;
        }
        i3 = 0;
        localImageButton1.setVisibility(i3);
        ImageButton localImageButton2 = this.ao;
        if (!bool3) {
          break label355;
        }
        i4 = 0;
        localImageButton2.setVisibility(i4);
        View localView1 = this.ar;
        if (i2 == 0) {
          break label362;
        }
        i5 = 0;
        localView1.setVisibility(i5);
        TextView localTextView = this.as;
        if (!bool2) {
          break label369;
        }
        i6 = 0;
        localTextView.setVisibility(i6);
        if (this.aI)
        {
          ImageButtonWithCount localImageButtonWithCount = this.k;
          if (!bool4) {
            break label376;
          }
          i9 = 0;
          localImageButtonWithCount.setVisibility(i9);
        }
        this.as.setEnabled(bool1);
        i7 = 0;
        if (i7 >= this.aq.getChildCount()) {
          break label390;
        }
        localView2 = this.aq.getChildAt(i7);
        if (localView2.getTag(aau.BM) != null) {
          if (!bool3) {
            break label383;
          }
        }
      }
      label310:
      label315:
      label321:
      label348:
      label355:
      label362:
      label369:
      label376:
      label383:
      for (int i8 = 0;; i8 = 8)
      {
        localView2.setVisibility(i8);
        i7++;
        break label251;
        bool2 = false;
        break;
        bool3 = false;
        break label20;
        bool4 = false;
        break label34;
        i1 = 0;
        break label51;
        this.z.setVisibility(8);
        this.A.setVisibility(8);
        break label131;
        i3 = 8;
        break label144;
        i4 = 8;
        break label164;
        i5 = 8;
        break label185;
        i6 = 8;
        break label205;
        i9 = 8;
        break label233;
      }
      return;
    }
  }
  
  final boolean i()
  {
    return (this.G.g() == khz.g) && (this.t);
  }
  
  final void j()
  {
    if (!this.aI) {}
    while ((this.aJ) || (!l())) {
      return;
    }
    gnb localgnb = gnb.a(this.M.c);
    khx localkhx1;
    kog localkog1;
    qbe localqbe2;
    String str4;
    if (this.G.g() == khz.g)
    {
      String str5 = this.G.a;
      khx localkhx2 = new khx();
      localkhx2.i = str5;
      localkhx2.j = this.L.A();
      localkhx2.f = localgnb;
      localkhx2.g = this.r;
      localkhx2.x = this.I;
      localkhx1 = localkhx2;
      bp localbp = this.f;
      localkog1 = new kog();
      localkog1.c = kmv.a(localkhx1.f, localbp);
      localkog1.a = localkhx1.k;
      localkog1.i = Boolean.valueOf(localkhx1.u);
      localkog1.j = Boolean.valueOf(localkhx1.t);
      localkog1.k = Boolean.valueOf(localkhx1.v);
      localkog1.l = localkhx1.i;
      localkog1.d = kmv.a(localkhx1.g, localbp);
      localkog1.m = localkhx1.x;
      kii localkii1 = localkhx1.w;
      if (localkii1 == null) {
        break label507;
      }
      localkog1.n = new kom();
      localkog1.n.b = localkii1.a(localbp, localkhx1.a);
      localkog1.n.a = localkii1.j();
      String str3 = localbp.getResources().getString(efj.Vd);
      localqbe2 = localkog1.n.b;
      if ((localqbe2 != null) && (localqbe2.a != null) && (localqbe2.a.length == 1) && (localqbe2.a[0] == 408)) {
        break label488;
      }
      str4 = null;
      label332:
      if ((str4 == null) || (str4.trim().isEmpty())) {
        str4 = str3;
      }
      localkog1.a = str4;
      if (kmv.a(localkog1.a))
      {
        if (kmv.a(localkog1.b)) {
          break label949;
        }
        localkog1.a = localkog1.b;
      }
    }
    kog localkog2;
    long l1;
    for (;;)
    {
      localkog2 = new kmv(localkog1).a;
      boolean bool = this.Z;
      l1 = this.aa;
      kii localkii2 = this.e.b;
      int i2 = 0;
      if (localkii2 != null) {
        i2 = 1;
      }
      if (i2 != 0)
      {
        bool = this.ab;
        l1 = this.ac;
      }
      if (!bool) {
        break label1046;
      }
      if (l1 != -1L) {
        break label1011;
      }
      Log.e("ShareboxMixin", "Failed to update existing draft; draftId was invalid.");
      return;
      localkhx1 = c(localgnb);
      break;
      label488:
      str4 = ((qdz)localqbe2.b(qdz.a)).b;
      break label332;
      label507:
      localkog1.b = localkhx1.j;
      lmg locallmg = localkhx1.m;
      koh localkoh;
      label530:
      ArrayList localArrayList1;
      koi[] arrayOfkoi;
      label551:
      qbe localqbe1;
      String str1;
      if (locallmg == null)
      {
        localkoh = null;
        localkog1.e = localkoh;
        localArrayList1 = localkhx1.l;
        if (localArrayList1 != null) {
          break label685;
        }
        arrayOfkoi = null;
        localkog1.f = arrayOfkoi;
        localkog1.g = localkhx1.q;
        localqbe1 = localkhx1.e;
        str1 = null;
        if (localqbe1 != null) {
          break label939;
        }
      }
      for (;;)
      {
        localkog1.h = str1;
        break;
        localkoh = new koh();
        localkoh.b = locallmg.b;
        localkoh.f = locallmg.g;
        localkoh.d = Integer.valueOf(locallmg.d);
        localkoh.e = Integer.valueOf(locallmg.e);
        localkoh.c = locallmg.c;
        localkoh.g = Double.valueOf(locallmg.h);
        localkoh.a = Integer.valueOf(locallmg.a);
        break label530;
        label685:
        ArrayList localArrayList2 = new ArrayList();
        int i1 = 0;
        if (i1 < localArrayList1.size())
        {
          ipf localipf = ((ipa)localArrayList1.get(i1)).e();
          Uri localUri = localipf.d;
          Object localObject;
          if ((localUri != null) && ((!localUri.getScheme().equals("content")) || (TextUtils.equals(localUri.getAuthority(), "media")))) {
            if (localipf == null)
            {
              if (Log.isLoggable("DraftDataProcessor", 6)) {
                Log.e("DraftDataProcessor", "The input to createMediaRefProto was null.");
              }
              localObject = null;
              label793:
              localArrayList2.add(localObject);
            }
          }
          for (;;)
          {
            i1++;
            break;
            localObject = new koi();
            ((koi)localObject).a = Integer.valueOf(localipf.e.e);
            ((koi)localObject).b = localipf.d.toString();
            ((koi)localObject).c = localipf.c;
            ((koi)localObject).d = localipf.a;
            break label793;
            if (Log.isLoggable("DraftDataProcessor", 3))
            {
              String str2 = String.valueOf(localUri);
              new StringBuilder(29 + String.valueOf(str2).length()).append("Can't attach media with uri: ").append(str2);
            }
          }
        }
        arrayOfkoi = (koi[])localArrayList2.toArray(new koi[localArrayList2.size()]);
        break label551;
        label939:
        str1 = localqbe1.b;
      }
      label949:
      if (!kmv.a(localkog1.h)) {
        localkog1.a = localkog1.h;
      } else if ((localkog1.e != null) && (!kmv.a(localkog1.e.b))) {
        localkog1.a = localkog1.e.b;
      }
    }
    label1011:
    knp localknp = new knp("UpdateDraftTask", l1, localkog2, this.O);
    this.q.b(localknp);
    for (;;)
    {
      this.aJ = true;
      return;
      label1046:
      kmq localkmq = new kmq("CreateDraftTask", localkog2, this.O);
      this.q.b(localkmq);
    }
  }
  
  final void k()
  {
    boolean bool1 = this.ax;
    if (this.G.d != null) {
      bool1 = true;
    }
    gnv localgnv = new gnv(this.f);
    gnb localgnb = gnb.a(this.M.c);
    if (localgnb != null)
    {
      if ((localgnb.d.length <= 0) && (localgnb.e.length <= 0)) {
        break label203;
      }
      localgnv.a(null, PlusAclPickerActivity.a(localgnb));
    }
    for (;;)
    {
      boolean bool2 = this.s;
      localgnv.a.putExtra("acl.PlusAclPickerActivity.RESTRICT_TO_DOMAIN", bool2);
      int i1 = this.O;
      localgnv.a.putExtra("account_id", i1);
      localgnv.a.putExtra("acl.PlusAclPickerActivity.DISABLE_DOMAIN_RESTRICTION_TOGGLE", bool1);
      int i2 = this.aD;
      localgnv.a.putExtra("circle_usage_type", i2);
      boolean bool3 = i();
      localgnv.a.putExtra("is_limited", bool3);
      if (this.az != -1) {
        localgnv.a(this.az);
      }
      Intent localIntent = localgnv.a;
      this.f.startActivityForResult(localIntent, 1);
      this.f.overridePendingTransition(efj.Ux, 0);
      return;
      label203:
      localgnv.a(localgnb.d(), PlusAclPickerActivity.a(localgnb));
    }
  }
  
  final boolean l()
  {
    int i1;
    int i2;
    label37:
    int i3;
    label50:
    int i4;
    label60:
    int i5;
    label70:
    int i6;
    label80:
    int i7;
    if (TextUtils.isEmpty(this.L.B()))
    {
      kji localkji = this.G;
      if (localkji.c == null) {
        break label160;
      }
      i1 = 1;
      if (localkji.d == null) {
        break label165;
      }
      i2 = 1;
      if (localkji.i.a()) {
        break label171;
      }
      i3 = 1;
      if (localkji.g == null) {
        break label177;
      }
      i4 = 1;
      if (localkji.e == null) {
        break label183;
      }
      i5 = 1;
      if (localkji.a == null) {
        break label189;
      }
      i6 = 1;
      if ((localkji.j.a() == null) || (!localkji.j.a().f())) {
        break label195;
      }
      i7 = 1;
      label112:
      if ((i1 == 0) && (i2 == 0) && (i5 == 0) && (i3 == 0) && (i4 == 0) && (i6 == 0) && (i7 == 0)) {
        break label201;
      }
    }
    label160:
    label165:
    label171:
    label177:
    label183:
    label189:
    label195:
    label201:
    for (int i8 = 1;; i8 = 0)
    {
      boolean bool = false;
      if (i8 != 0) {
        bool = true;
      }
      return bool;
      i1 = 0;
      break;
      i2 = 0;
      break label37;
      i3 = 0;
      break label50;
      i4 = 0;
      break label60;
      i5 = 0;
      break label70;
      i6 = 0;
      break label80;
      i7 = 0;
      break label112;
    }
  }
  
  final boolean m()
  {
    int i1;
    if (gnb.a(this.M.c) != null)
    {
      i1 = 1;
      if (i1 != 0) {
        break label26;
      }
    }
    label26:
    while (!l())
    {
      return false;
      i1 = 0;
      break;
    }
    if (this.e.b != null) {
      for (int i2 = 0;; i2++)
      {
        if (i2 >= this.e.a.size()) {
          break label87;
        }
        if (!((kii)this.e.a.get(i2)).c()) {
          break;
        }
      }
    }
    label87:
    return true;
  }
  
  public final void n()
  {
    int i1 = 1;
    this.L.v();
    if (!w()) {}
    label344:
    do
    {
      do
      {
        return;
        new kqf(85).b(this.f);
        kat localkat = (kat)mbb.b(this.f, kat.class);
        if (localkat != null) {
          localkat.a(localkat.a(2, 2));
        }
        if (this.G.g() != khz.g) {
          break;
        }
      } while ((this.G.g() != khz.g) || (!w()));
      gnb localgnb2 = gnb.a(this.M.c);
      if (!this.s) {
        if ((localgnb2.d.length <= 0) || (!localgnb2.d[0].e)) {
          break label344;
        }
      }
      for (;;)
      {
        gnb localgnb3 = null;
        if (i1 != 0) {
          localgnb3 = this.r;
        }
        String str2 = this.G.a;
        khx localkhx = new khx();
        localkhx.i = str2;
        localkhx.j = this.L.A();
        localkhx.f = localgnb2;
        localkhx.g = localgnb3;
        localkhx.x = this.I;
        gzf localgzf = ((kid)mbb.a(this.f, kid.class)).a(this.f, this.O, localkhx);
        this.q.c(localgzf);
        Bundle localBundle = new Bundle();
        localBundle.putString("extra_activity_id", str2);
        gxz localgxz = gxz.X;
        gxx localgxx3 = (gxx)mbb.a(this.f, gxx.class);
        gxw localgxw9 = new gxw(this.f, this.O);
        localgxw9.c = localgxz;
        if (localBundle != null) {
          localgxw9.h.putAll(localBundle);
        }
        localgxx3.a(localgxw9);
        this.aK = false;
        return;
        i1 = 0;
      }
    } while (!w());
    a(gxz.cQ);
    gnb localgnb1 = gnb.a(this.M.c);
    if (!m())
    {
      Toast.makeText(this.f, this.f.getString(et.w), 0).show();
      return;
    }
    boolean bool = this.aN.a(this.O).c("is_managed_account");
    iyk localiyk = this.aO.a(this.O);
    int i2;
    if ((localiyk != null) && (localiyk.a() > 0))
    {
      i2 = i1;
      if ((!bool) || (i2 == 0)) {
        break label505;
      }
    }
    label505:
    for (int i3 = i1;; i3 = 0)
    {
      if (i3 == 0) {
        break label511;
      }
      Toast.makeText(this.f, this.f.getString(et.O), 0).show();
      return;
      i2 = 0;
      break;
    }
    label511:
    String str1 = this.L.A();
    if (str1.length() > 0) {}
    for (;;)
    {
      bp localbp = this.f;
      gxx localgxx1 = (gxx)mbb.a(this.f, gxx.class);
      if (!this.E.a())
      {
        gxw localgxw1 = new gxw(localbp, this.O);
        localgxw1.c = gxz.cM;
        localgxx1.a(localgxw1);
      }
      if (i1 != 0)
      {
        gxw localgxw2 = new gxw(localbp, this.O);
        localgxw2.c = gxz.cU;
        localgxx1.a(localgxw2);
      }
      if (this.G.c != null)
      {
        gxw localgxw3 = new gxw(localbp, this.O);
        localgxw3.c = gxz.cO;
        localgxx1.a(localgxw3);
      }
      if (this.G.b() != null)
      {
        gxw localgxw4 = new gxw(localbp, this.O);
        localgxw4.c = gxz.cL;
        localgxx1.a(localgxw4);
      }
      if (this.H.c != null)
      {
        gxw localgxw5 = new gxw(localbp, this.O);
        localgxw5.c = gxz.db;
        localgxx1.a(localgxw5);
      }
      gxx localgxx2 = (gxx)mbb.a(this.f, gxx.class);
      if (!TextUtils.isEmpty(str1))
      {
        gxw localgxw6 = new gxw(this.f, this.O);
        localgxw6.c = gxz.cZ;
        localgxx2.a(localgxw6);
      }
      if (localgnb1.c.length > 0)
      {
        gxw localgxw7 = new gxw(this.f, this.O);
        localgxw7.c = gxz.cS;
        localgxx2.a(localgxw7);
      }
      if (localgnb1.b.length > 0)
      {
        gxw localgxw8 = new gxw(this.f, this.O);
        localgxw8.c = gxz.cR;
        localgxx2.a(localgxw8);
      }
      if (this.E.e != null) {
        a(gxz.dp);
      }
      kjn localkjn = new kjn(c(localgnb1), new kjm());
      this.q.c(localkjn);
      this.aK = false;
      return;
      i1 = 0;
    }
  }
  
  public final BaseAdapter o()
  {
    return this.ae;
  }
  
  public final gxq v()
  {
    return new gxq(pkd.m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     klg
 * JD-Core Version:    0.7.0.1
 */