import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import com.google.android.apps.plus.phone.HostStreamOneUpActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.StreamOneUpViewGroup;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import com.google.android.libraries.social.squares.membership.JoinButton;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class cgr
  extends mca
  implements View.OnClickListener, cw<Cursor>, dgy, gpq, gxs, gxv, gzi, hdt, hgh, kyv, kyw, lfs, luu, lux, lvy
{
  private static final TimeInterpolator bT = new AccelerateInterpolator();
  private static TimeInterpolator bU = null;
  static Drawable bd;
  private static final String[] bq = { "circle_id", "circle_name" };
  private static final String[] br = { "is_member", "membership_status", "joinability" };
  String Z;
  final gpk a = new gpk(this, this.bp, this);
  String aA;
  llw aB;
  boolean aC;
  boolean aD;
  boolean aE;
  boolean aF;
  boolean aG;
  boolean aH;
  boolean aI;
  gnb aJ;
  ArrayList<String> aK;
  MentionMultiAutoCompleteTextView aL;
  View aM;
  boolean aN;
  public int aO = 1;
  boolean aP;
  int aQ;
  boolean aR;
  byte[] aS;
  boolean aT;
  Cursor aU;
  boolean aV;
  int aW;
  chc aX;
  boolean aY = false;
  StreamOneUpViewGroup aZ;
  String aa;
  dgf ab;
  RecyclingViewGroup ac;
  boolean ad;
  hpo ae;
  bot af;
  public dge ag;
  Integer ah;
  int ai = 0;
  boolean aj;
  boolean ak;
  String al;
  boolean am;
  int an;
  int ao;
  boolean ap;
  int aq = 0;
  llr ar;
  lly as;
  String at;
  boolean au;
  boolean av;
  lmg aw;
  Spanned ax;
  boolean ay;
  String az;
  git b;
  private boolean bA;
  private String bB;
  private lmj bC;
  private int bD;
  private boolean bE;
  private boolean bF;
  private View bG;
  private JoinButton bH;
  private lfr bI;
  private View bJ;
  private TextWatcher bK;
  private hfa bL;
  private boolean bM;
  private int bN = eai.a;
  private int[] bO = { -1, -1 };
  private boolean bP = false;
  private chl bQ;
  private ObjectAnimator bR;
  private int bS;
  private final chk bV = new chk(this);
  private int bW = -1;
  private int bX;
  private String bY;
  private String bZ;
  int[] ba = { -1, -1 };
  int bb;
  int bc;
  int be;
  int bf;
  dfm bg;
  jtp bh;
  jtr bi;
  final lin bj = new lin(this, this.bp);
  idy bk;
  final gqk bl = new cgs(this);
  boolean bm;
  private final long bs = SystemClock.elapsedRealtime();
  private final chm bt = new chm(this);
  private final lvi bu = new lvi();
  private boolean bv;
  private hvj bw;
  private hhh bx;
  private final llj by = new chf(this);
  private chi bz;
  ill c;
  private String ca;
  private gzj cb;
  private giz cc;
  private final les cd = new les(this, this.bp);
  private final lvz ce = new lvz(this, this.bp);
  String d;
  
  public cgr()
  {
    new gzc(this, new chd(this));
    new gxj(this.bp, (byte)0);
    new hdu(this.bp, this);
  }
  
  private final void K()
  {
    lvz locallvz = this.ce;
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (locallvz.a != null)
    {
      localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
        break label37;
      }
      localSwipeRefreshLayoutWithUpScroll.a(false);
    }
    for (;;)
    {
      this.a.a();
      return;
      label37:
      if (localSwipeRefreshLayoutWithUpScroll.m != null)
      {
        if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
        if (!localSwipeRefreshLayoutWithUpScroll.m.O_())
        {
          Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
          long l = localSwipeRefreshLayoutWithUpScroll.o;
          efj.m().postDelayed(localRunnable, l);
        }
      }
    }
  }
  
  private final int L()
  {
    if (efj.L(this.bn)) {
      return this.bL.a(2);
    }
    return this.bL.a(this.aQ);
  }
  
  private final void M()
  {
    int i = this.bf;
    int j = J();
    int k;
    if (!efj.L(f())) {
      k = 0;
    }
    for (;;)
    {
      this.bO[j] = k;
      this.ba[j] = i;
      return;
      if (this.bO[j] == -1)
      {
        int m = L();
        int n = efj.K(f()).widthPixels;
        int i1 = n / 2 - m / 2;
        if (i1 + m > n) {
          i1 -= m + i1 - (n - this.bW);
        }
        k = Math.max(0, i1);
      }
      else
      {
        k = 0;
      }
    }
  }
  
  private final int N()
  {
    if (efj.L(this.bn)) {
      return Math.round(0.85F * this.bX);
    }
    return this.bX;
  }
  
  private final gzj O()
  {
    if (this.cb == null) {
      this.cb = ((gzj)this.bo.a(gzj.class));
    }
    return this.cb;
  }
  
  private final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    efj.e(this.aZ, "Expected mStreamOneUpViewGroup to have been initialized");
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.aZ.getLayoutParams();
    localLayoutParams.leftMargin = paramInt1;
    localLayoutParams.topMargin = paramInt2;
    localLayoutParams.width = paramInt3;
    localLayoutParams.height = paramInt4;
  }
  
  private final void a(String paramString)
  {
    int i = aau.fc;
    String str1 = g().getString(i);
    int j = aau.eZ;
    String str2 = g().getString(j);
    int k = aau.vS;
    String str3 = g().getString(k);
    int m = aau.ly;
    lut locallut = lut.a(str1, str2, str3, g().getString(m), 0, 0);
    locallut.b(false);
    locallut.n = this;
    locallut.p = 0;
    locallut.a(this.x, paramString);
    this.x.b();
  }
  
  private final void a(String paramString1, String paramString2)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    localSpannableStringBuilder.append(lxf.a).append(paramString2).append(' ');
    localSpannableStringBuilder.setSpan(new lxf(paramString1), 0, -1 + localSpannableStringBuilder.length(), 0);
    this.aL.a(localSpannableStringBuilder);
    int i = this.aL.getText().length();
    this.aL.setSelection(i, i);
    this.aN = true;
    G();
  }
  
  private final void a(String paramString, boolean paramBoolean, int paramInt)
  {
    Bundle localBundle = gxy.a("extra_comment_id", paramString);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.Z;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    if (paramBoolean) {}
    for (int i = 47;; i = 34)
    {
      a(i);
      mbf localmbf = this.bn;
      int j = this.b.c();
      String str = this.d;
      Intent localIntent = EsService.e.a(localmbf, EsService.class);
      localIntent.putExtra("op", 34);
      localIntent.putExtra("account_id", j);
      localIntent.putExtra("aid", str);
      localIntent.putExtra("comment_id", paramString);
      localIntent.putExtra("report", true);
      localIntent.putExtra("is_undo", paramBoolean);
      if (paramInt != -1) {
        localIntent.putExtra("abuse_type", paramInt);
      }
      this.ah = Integer.valueOf(EsService.a(localmbf, localIntent));
      return;
    }
  }
  
  private final void a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool1;
    if (paramArrayList1 != null)
    {
      bool1 = true;
      efj.c(bool1, "Invalid originalCircleIds");
      if (paramArrayList2 == null) {
        break label107;
      }
    }
    String str1;
    ArrayList localArrayList1;
    label107:
    for (boolean bool2 = true;; bool2 = false)
    {
      efj.c(bool2, "Invalid selectedCircleIds");
      str1 = brn.a(this.bn, this.aU, true);
      localArrayList1 = new ArrayList();
      Iterator localIterator1 = paramArrayList2.iterator();
      while (localIterator1.hasNext())
      {
        String str5 = (String)localIterator1.next();
        if (!paramArrayList1.contains(str5)) {
          localArrayList1.add(str5);
        }
      }
      bool1 = false;
      break;
    }
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator2 = paramArrayList1.iterator();
    int i = 0;
    while (localIterator2.hasNext())
    {
      String str4 = (String)localIterator2.next();
      if (str4.equals(str1)) {
        i = 1;
      }
      if (!paramArrayList2.contains(str4)) {
        localArrayList2.add(str4);
      }
    }
    int j;
    int k;
    label480:
    int m;
    label497:
    String str3;
    if ((this.aT) && (i != 0) && (!paramArrayList2.isEmpty()))
    {
      j = 1;
      boolean bool3 = paramArrayList1.isEmpty();
      boolean bool4 = paramArrayList2.isEmpty();
      bnp localbnp = new bnp(this.bn);
      localbnp.a = this.b.c();
      localbnp.b = paramString1;
      localbnp.c = paramString2;
      localbnp.d = R_();
      localbnp.e = localArrayList1;
      localbnp.f = localArrayList2;
      localbnp.g = bool3;
      localbnp.h = bool4;
      localbnp.i = false;
      String str2 = brn.a(this.bn, true);
      if (paramBoolean)
      {
        int i2 = aau.mh;
        Object[] arrayOfObject = { str2 };
        localbnp.j = g().getString(i2, arrayOfObject);
        int i3 = aau.mi;
        localbnp.k = g().getString(i3);
      }
      if (j != 0) {
        localbnp.k = this.bn.getString(aau.mj, new Object[] { str2 });
      }
      gzj localgzj = O();
      bno localbno = localbnp.a();
      localgzj.d.a(localbno, false);
      localgzj.b(localbno);
      this.bw = new hvj(this.bn, (gxx)this.bo.a(gxx.class), paramString1, localArrayList1, localArrayList2, this);
      if ((!paramArrayList1.isEmpty()) || (paramArrayList2.isEmpty())) {
        break label664;
      }
      k = 1;
      if ((paramArrayList1.isEmpty()) || (!paramArrayList2.isEmpty())) {
        break label670;
      }
      m = 1;
      str3 = jjf.c(paramString1);
      if (k == 0) {
        break label676;
      }
      EsService.a(this.bn, this.b.c(), str3, false);
      label528:
      if (this.ac == null) {}
    }
    for (int n = -1 + this.ac.getChildCount();; n--)
    {
      eab localeab;
      int i1;
      if (n >= 0)
      {
        View localView = this.ac.getChildAt(n);
        if (!(localView instanceof eab)) {
          continue;
        }
        localeab = (eab)localView;
        if ((localeab.y == null) || (localeab.y.e == null)) {
          break label704;
        }
        i1 = 1;
        label599:
        if (k == 0) {
          break label710;
        }
        localeab.p = false;
        if (i1 != 0)
        {
          bnq localbnq2 = new bnq(this.bn, this.b.c(), localeab.U, true);
          this.cb.b(localbnq2);
        }
      }
      for (;;)
      {
        localeab.k();
        return;
        j = 0;
        break;
        label664:
        k = 0;
        break label480;
        label670:
        m = 0;
        break label497;
        label676:
        if (m == 0) {
          break label528;
        }
        EsService.a(this.bn, this.b.c(), str3, true);
        break label528;
        label704:
        i1 = 0;
        break label599;
        label710:
        if (m != 0)
        {
          localeab.p = true;
          if (i1 != 0)
          {
            bnq localbnq1 = new bnq(this.bn, this.b.c(), localeab.U, false);
            this.cb.b(localbnq1);
          }
        }
      }
    }
  }
  
  private final void f(int paramInt)
  {
    kat localkat = (kat)this.bo.b(kat.class);
    if (localkat != null) {
      localkat.a(localkat.a(4, paramInt));
    }
  }
  
  final void A()
  {
    this.bJ.setVisibility(0);
    this.bG.setVisibility(8);
    this.aL.setEnabled(this.aG);
    View localView = this.aM;
    boolean bool;
    String str1;
    if ((this.aG) && (this.aL.c()))
    {
      bool = true;
      localView.setEnabled(bool);
      if (!this.aG) {
        break label151;
      }
      G();
      if ((this.aB == null) || (!this.bE)) {
        break label132;
      }
      int k = aau.el;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.aB.a;
      str1 = g().getString(k, arrayOfObject);
    }
    for (;;)
    {
      this.aL.setHint(str1);
      return;
      bool = false;
      break;
      label132:
      int j = aau.ej;
      str1 = g().getString(j);
      continue;
      label151:
      if ((this.am) && (!this.ap) && (this.al != null))
      {
        if (this.bI == null) {
          this.bI = new lfr(this.bn, this, this.b.c());
        }
        JoinButton localJoinButton = this.bH;
        String str2 = this.al;
        kxg localkxg = efj.e(this.an, this.ao);
        localJoinButton.a = str2;
        localJoinButton.a(localkxg);
        this.bI.a(this.bH);
        this.bJ.setVisibility(8);
        this.bG.setVisibility(0);
        str1 = null;
      }
      else
      {
        int i = aau.ek;
        str1 = g().getString(i);
      }
    }
  }
  
  public final void A_()
  {
    this.ce.b();
    E();
  }
  
  public final Integer B()
  {
    return null;
  }
  
  public final Integer C()
  {
    return null;
  }
  
  final void D()
  {
    kat localkat = (kat)this.bo.b(kat.class);
    if (localkat != null) {
      localkat.a(null);
    }
  }
  
  final void E()
  {
    lvz locallvz = this.ce;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    }
    this.ad = false;
    gzj localgzj = O();
    if (!localgzj.a("GetActivityTask"))
    {
      mbf localmbf = this.bn;
      int i = this.b.c();
      String str1 = this.d;
      String str2 = this.al;
      int j = this.an;
      boolean bool;
      if (j != 2)
      {
        bool = false;
        if (j != 1) {}
      }
      else
      {
        bool = true;
      }
      localgzj.b(new bnf(localmbf, i, str1, str2, bool));
    }
    K();
  }
  
  final void F()
  {
    dgf localdgf = this.ab;
    if ((!TextUtils.isEmpty(localdgf.j)) || (!TextUtils.isEmpty(localdgf.k)) || ((localdgf.l != null) && (localdgf.l.size() > 0))) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.ab.a(true);
      this.a.a();
      return;
    }
    mbf localmbf = this.bn;
    int j = this.b.c();
    String str = this.d;
    Intent localIntent = EsService.e.a(localmbf, EsService.class);
    localIntent.putExtra("op", 38);
    localIntent.putExtra("account_id", j);
    localIntent.putExtra("aid", str);
    this.ah = Integer.valueOf(EsService.a(localmbf, localIntent));
    a(65);
  }
  
  final void G()
  {
    if (!this.aN) {
      return;
    }
    this.aL.postDelayed(new cgt(this), 250L);
  }
  
  final void H()
  {
    this.bA = true;
    Resources localResources = g();
    String str1 = efj.a(f(), "post_restrictions", "https://support.google.com/plus/?hl=%locale%").toString();
    int i = aau.uw;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.b.f().b("domain_name");
    arrayOfObject[1] = str1;
    String str2 = localResources.getString(i, arrayOfObject);
    lut locallut = lut.a(localResources.getString(aau.ux), str2, localResources.getString(aau.mg), null, 0, 0);
    locallut.b(false);
    locallut.n = this;
    locallut.p = 0;
    locallut.a(this.x, "public_dasher_warning");
  }
  
  final boolean I()
  {
    return (this.aG) && (!this.bA) && (this.b.f().c("is_default_restricted")) && (!this.aH) && (!TextUtils.isEmpty(this.b.f().b("domain_name")));
  }
  
  final int J()
  {
    int i = 1;
    if (f().getResources().getConfiguration().orientation == i) {
      i = 0;
    }
    return i;
  }
  
  public final boolean O_()
  {
    return O().a("GetActivityTask");
  }
  
  public final int R_()
  {
    if ((this.ar != null) && (this.ar.e != null)) {
      return 216;
    }
    return 114;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.bn);
    bp localbp = f();
    this.bW = g().getDimensionPixelSize(efj.lT);
    if (this.aZ == null) {
      this.aZ = ((StreamOneUpViewGroup)localLayoutInflater.inflate(efj.uo, paramViewGroup, false));
    }
    int i;
    Bundle localBundle1;
    int m;
    if (this.aP)
    {
      i = loh.b;
      this.bL = new hfa(localbp, i);
      this.ab = new dgf(this.bn, this, this.bL, this.ar);
      this.ce.b = (efj.y(this.bn) + g().getDimensionPixelSize(efj.ny));
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = (SwipeRefreshLayoutWithUpScroll)this.aZ.findViewById(aaw.im);
      StreamOneUpViewGroup localStreamOneUpViewGroup = this.aZ;
      localStreamOneUpViewGroup.d = localSwipeRefreshLayoutWithUpScroll;
      localStreamOneUpViewGroup.e = ((RecyclingViewGroup)localStreamOneUpViewGroup.d.findViewById(16908298));
      this.ac = this.aZ.e;
      this.ac.j = true;
      this.ac.setBackgroundColor(g().getColor(efj.jD));
      RecyclingViewGroup localRecyclingViewGroup1 = this.ac;
      cgu localcgu = new cgu(this);
      localRecyclingViewGroup1.c.a = localcgu;
      this.bG = this.aZ.findViewById(aaw.kh);
      this.bH = ((JoinButton)this.bG.findViewById(aaw.kg));
      this.bJ = this.aZ.findViewById(aaw.dH);
      this.aL = this.aZ.b;
      this.aL.a(this, this.b.c(), this.d, null);
      efj.a(this.aL, new gxq(pkh.l));
      this.aL.setOnClickListener(new gxn(this));
      this.aM = this.aZ.c;
      efj.a(this.aM, new gxq(pkh.q));
      this.aM.setOnClickListener(new gxn(this));
      A();
      this.bK = new chh(this);
      this.aL.addTextChangedListener(this.bK);
      this.aL.setOnEditorActionListener(new cgv(this));
      gpk localgpk = this.a;
      chk localchk = this.bV;
      if ((localgpk.a != null) && (localgpk.b)) {
        localgpk.a.c(localchk);
      }
      localBundle1 = this.m;
      int j = localBundle1.getInt("popup_start_x", -1);
      int k = localBundle1.getInt("popup_start_y", -1);
      if ((j == -1) || (k == -1)) {
        break label559;
      }
      m = 1;
      label518:
      if (m == 0) {
        break label565;
      }
      this.aW = 1;
    }
    for (;;)
    {
      if (efj.L(this.bn)) {
        break label601;
      }
      this.ab.h = true;
      return this.aZ;
      i = loh.c;
      break;
      label559:
      m = 0;
      break label518;
      label565:
      this.aW = 0;
      RecyclingViewGroup localRecyclingViewGroup2 = this.ac;
      localRecyclingViewGroup2.b = new lxh(this.bu);
      localRecyclingViewGroup2.b(0);
    }
    label601:
    this.ab.h = false;
    this.aX = new chc(this, localLayoutInflater.getContext());
    FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
    this.aX.setLayoutParams(localLayoutParams1);
    this.aX.addView(this.aZ);
    this.aX.setOnClickListener(new cgx(this));
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i11;
    int i12;
    boolean bool;
    int i13;
    if (m != 0)
    {
      this.bX = localBundle1.getInt("popup_stream_start_height");
      this.bf = localBundle1.getInt("popup_stream_top");
      if (bU == null) {
        bU = new gyn(0.4F, 0.0F, 0.2F, 1.0F);
      }
      Bundle localBundle2 = this.m;
      i4 = localBundle2.getInt("popup_start_x", -1);
      i5 = localBundle2.getInt("popup_start_y", -1);
      i6 = localBundle2.getInt("popup_start_width");
      i7 = localBundle2.getInt("popup_start_height");
      i8 = L();
      i9 = N();
      int i10 = J();
      i11 = this.bO[i10];
      i12 = this.ba[i10];
      if ((i11 == -1) || (i12 == -1))
      {
        M();
        i11 = this.bO[i10];
        i12 = this.ba[i10];
      }
      this.bQ = new chl(this);
      this.bR = ObjectAnimator.ofFloat(this.bQ, "values", new float[] { 0.0F, 1.0F });
      this.bR.setInterpolator(bU);
      this.bR.setDuration(400L);
      if (this.bL.a > 1)
      {
        bool = true;
        this.aY = bool;
        if (!this.bM) {
          break label986;
        }
        i13 = 0;
        label931:
        a(i11, i12, i8, i9);
        if (this.aY)
        {
          this.aX.setBackgroundResource(efj.pb);
          ((TransitionDrawable)this.aX.getBackground()).startTransition(i13);
        }
      }
    }
    for (;;)
    {
      return this.aX;
      bool = false;
      break;
      label986:
      this.bS = J();
      FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(i6, i7);
      this.aZ.setLayoutParams(localLayoutParams2);
      this.bQ.a(i4, i11, i5, i12, i6, i8, i7, i9);
      if (this.aY) {
        this.aZ.e.setAlpha(0.0F);
      }
      this.bR.addListener(new cgw(this));
      this.ac.j = false;
      this.bR.start();
      i9 = i7;
      i8 = i6;
      i12 = i5;
      i11 = i4;
      i13 = 150;
      break label931;
      int n = efj.K(this.bn).heightPixels;
      int i1 = efj.y(this.bn);
      int i2 = efj.A(this.bn);
      this.bX = (n - i1 - i2);
      this.bf = i1;
      int i3 = J();
      M();
      a(this.bO[i3], this.ba[i3], L(), N());
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return new bxq(f(), this.b.c(), 19, bq);
    case 0: 
      return new bvb(f(), this.b.c(), this.d);
    }
    return new kzo(this.bn, this.b.c(), this.al, br);
  }
  
  final void a(int paramInt)
  {
    this.ai = paramInt;
    String str;
    switch (paramInt)
    {
    default: 
      int i1 = aau.po;
      str = g().getString(i1);
    }
    for (;;)
    {
      coo localcoo = coo.a(null, str, true, false);
      localcoo.Z = new chj(this);
      localcoo.a(this.x, "pending");
      return;
      int n = aau.jn;
      str = g().getString(n);
      continue;
      int m = aau.uX;
      str = g().getString(m);
      continue;
      int k = aau.pk;
      str = g().getString(k);
      continue;
      int j = aau.dZ;
      str = g().getString(j);
      continue;
      int i = aau.sl;
      str = g().getString(i);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (((iiq)mbb.a(this.bn, iiq.class)).a(paramInt1, paramInt2)) {}
    do
    {
      do
      {
        return;
        switch (paramInt1)
        {
        default: 
          return;
        }
      } while (paramInt2 != -1);
      Bundle localBundle = paramIntent.getExtras();
      a(localBundle.getStringArrayList("original_circle_ids"), localBundle.getStringArrayList("selected_circle_ids"), localBundle.getString("person_id"), localBundle.getString("display_name"), false);
      return;
    } while (paramInt2 != -1);
    a(true);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    ArrayList localArrayList1 = paramBundle.getIntegerArrayList("comment_action");
    if (localArrayList1 == null) {}
    while (paramInt >= localArrayList1.size()) {
      return;
    }
    if (!this.c.a())
    {
      this.bn.startActivity(this.c.b());
      return;
    }
    String str1 = paramBundle.getString("comment_author_id");
    String str2 = paramBundle.getString("comment_author_name");
    String str3 = paramBundle.getString("comment_id");
    byte[] arrayOfByte = paramBundle.getByteArray("comment_content");
    if (arrayOfByte == null) {}
    String str4;
    boolean bool1;
    int i;
    int j;
    for (SpannableStringBuilder localSpannableStringBuilder = null;; localSpannableStringBuilder = lwh.a(ByteBuffer.wrap(arrayOfByte)))
    {
      str4 = paramBundle.getString("plus_one_id");
      bool1 = paramBundle.getBoolean("plus_one_by_me");
      i = paramBundle.getInt("plus_one_count");
      j = this.b.c();
      switch (((Integer)localArrayList1.get(paramInt)).intValue())
      {
      default: 
        return;
      case 33: 
        Bundle localBundle4 = gxy.a("extra_comment_id", str3);
        gxx localgxx2 = (gxx)this.bo.a(gxx.class);
        gxw localgxw2 = new gxw(this.bn);
        localgxw2.c = gxz.U;
        if (localBundle4 != null) {
          localgxw2.h.putAll(localBundle4);
        }
        localgxx2.a(localgxw2);
        int i5 = aau.kz;
        String str11 = g().getString(i5);
        int i6 = aau.ea;
        String str12 = g().getString(i6);
        int i7 = aau.mf;
        String str13 = g().getString(i7);
        int i8 = aau.cM;
        lut locallut3 = lut.a(str11, str12, str13, g().getString(i8), 0, 0);
        locallut3.n = this;
        locallut3.p = 0;
        locallut3.m.putString("comment_id", str3);
        locallut3.a(this.x, "delete_comment");
        return;
      }
    }
    if ((str4 == null) || (!bool1))
    {
      EsService.a(this.bn, j, this.d, str3, null, true, null);
      return;
    }
    EsService.a(this.bn, j, this.d, str3, str4, false, null);
    return;
    Bundle localBundle3 = gxy.a("extra_comment_id", str3);
    gxx localgxx1 = (gxx)this.bo.a(gxx.class);
    gxw localgxw1 = new gxw(this.bn);
    localgxw1.c = gxz.S;
    if (localBundle3 != null) {
      localgxw1.h.putAll(localBundle3);
    }
    localgxx1.a(localgxw1);
    int i4 = this.b.c();
    mbf localmbf = this.bn;
    String str10 = this.d;
    boolean bool2 = this.am;
    a(efj.a(localmbf, i4, str10, str3, localSpannableStringBuilder, null, null, null, bool2));
    return;
    a(str3, false, -1);
    return;
    a(str3, true, -1);
    return;
    a(str3, false, -1);
    return;
    int n = aau.kE;
    String str7 = g().getString(n);
    int i1 = aau.cy;
    String str8 = g().getString(i1);
    int i2 = aau.vS;
    String str9 = g().getString(i2);
    int i3 = aau.ly;
    lut locallut2 = lut.a(str7, str8, str9, g().getString(i3), 0, 0);
    locallut2.n = this;
    locallut2.p = 0;
    locallut2.m.putString("ban_user_id", str1);
    locallut2.a(this.x, "ban_comment_author");
    return;
    String str5 = localSpannableStringBuilder.toString();
    int m = aau.kQ;
    efj.a(f(), str5);
    String str6 = g().getString(m);
    Toast.makeText(f(), str6, 0).show();
    return;
    cly localcly = new cly();
    Bundle localBundle2 = new Bundle();
    localBundle2.putInt("account_id", this.b.c());
    localBundle2.putString("plus_one_id", str4);
    localBundle2.putInt("total_plus_ones", i);
    localBundle2.putBoolean("restrict_to_domain", this.av);
    localcly.f(localBundle2);
    localcly.a(this.x, "plus_ones");
    return;
    if (this.aL.c())
    {
      a("comment_discard_onreply_tag");
      this.bY = str1;
      this.bZ = str2;
      return;
    }
    a(str1, str2);
    return;
    Bundle localBundle1 = new Bundle();
    localBundle1.putString("comment_author_id", str1);
    localBundle1.putString("comment_author_name", str2);
    ((dhd)this.bo.a(dhd.class)).c().a(str2).a(localBundle1).a().a(h(), "block_person");
    return;
    ArrayList localArrayList2 = new ArrayList(5);
    ArrayList localArrayList3 = new ArrayList(5);
    localArrayList2.add(g().getString(aau.ut));
    localArrayList3.add(Integer.valueOf(41));
    localArrayList2.add(g().getString(aau.us));
    localArrayList3.add(Integer.valueOf(42));
    localArrayList2.add(g().getString(aau.ur));
    localArrayList3.add(Integer.valueOf(43));
    localArrayList2.add(g().getString(aau.uq));
    localArrayList3.add(Integer.valueOf(44));
    localArrayList2.add(g().getString(aau.up));
    localArrayList3.add(Integer.valueOf(45));
    String[] arrayOfString = new String[localArrayList2.size()];
    localArrayList2.toArray(arrayOfString);
    int k = aau.uu;
    lut locallut1 = lut.a(g().getString(k), arrayOfString);
    locallut1.m.putString("comment_id", str3);
    locallut1.m.putIntegerArrayList("comment_action", localArrayList3);
    locallut1.n = this;
    locallut1.p = 0;
    locallut1.a(this.x, "delete_comment");
    return;
    a(str3, false, 1);
    return;
    a(str3, false, 2);
    return;
    a(str3, false, 16);
    return;
    iis.a(this.bn, j, efj.j("https://support.google.com/legal/troubleshooter/1114905"), this.aA, this.d);
    return;
    a(str3, false, 17);
    return;
    F();
    return;
    this.ab.a(false);
    this.a.a();
    return;
    ((hdf)mbb.a(this.bn, hdf.class)).a(str1);
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.bk = new idy(paramActivity, this.bp, "android_default_gmh");
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    f(1);
    gzj localgzj = O();
    localgzj.d.a(this, null, true);
    localgzj.a.add(this);
    this.ag = new chg(this);
    k().a(0, null, this);
    k().a(1, null, this);
    if (bd == null) {
      bd = f().getResources().getDrawable(efj.oo);
    }
    boolean bool;
    if (paramBundle != null)
    {
      bool = true;
      this.bM = bool;
      if (!this.bM) {
        break label435;
      }
      this.bO = paramBundle.getIntArray("popup_end_x");
      this.ba = paramBundle.getIntArray("popup_end_y");
      this.bS = paramBundle.getInt("popup_start_orientation");
      if (paramBundle.containsKey("pending_request_id")) {
        this.ah = Integer.valueOf(paramBundle.getInt("pending_request_id"));
      }
      if (paramBundle.containsKey("db_context_specific_data")) {
        this.ar = llr.a(paramBundle.getByteArray("db_context_specific_data"));
      }
      this.ai = paramBundle.getInt("operation_type", 0);
      this.ad = paramBundle.getBoolean("get_activity_complete");
      this.bw = hvj.a(this.bn, (gxx)this.bo.a(gxx.class), paramBundle);
      this.bA = paramBundle.getBoolean("seen_public_dasher_warning");
      this.aj = paramBundle.getBoolean("mute_processed", false);
      this.bF = paramBundle.getBoolean("read_processed", false);
      this.aJ = ((gnb)paramBundle.getParcelable("audience_data"));
      this.aK = paramBundle.getStringArrayList("blocked_gaia_ids");
      this.aN = paramBundle.getBoolean("show_keyboard");
      this.aO = paramBundle.getInt("host_mode", 1);
      this.aP = paramBundle.getBoolean("force_full_bleed", false);
      this.aQ = paramBundle.getInt("max_span", 1);
      this.aG = paramBundle.getBoolean("can_comment", false);
      this.aH = paramBundle.getBoolean("is_post_restricted_to_domain", false);
      this.aR = paramBundle.getBoolean("scroll_to_last_comment_pending", false);
      this.bZ = paramBundle.getString("commentreply_authorname");
      this.bY = paramBundle.getString("commentreply_authorid");
      this.bb = paramBundle.getInt("scroll_position", 0);
      this.bc = paramBundle.getInt("scroll_offset", 0);
    }
    label435:
    while (!this.m.getBoolean("refresh", false))
    {
      return;
      bool = false;
      break;
    }
    E();
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    int i = 1;
    int j = this.b.c();
    int k = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (k)
      {
      default: 
        return;
        if (paramString.equals("delete_activity"))
        {
          k = 0;
          continue;
          if (paramString.equals("delete_comment"))
          {
            k = i;
            continue;
            if (paramString.equals("mute_activity"))
            {
              k = 2;
              continue;
              if (paramString.equals("report_activity"))
              {
                k = 3;
                continue;
                if (paramString.equals("cancel_edits"))
                {
                  k = 4;
                  continue;
                  if (paramString.equals("remove_activity"))
                  {
                    k = 5;
                    continue;
                    if (paramString.equals("ban_comment_author"))
                    {
                      k = 6;
                      continue;
                      if (paramString.equals("public_dasher_warning"))
                      {
                        k = 7;
                        continue;
                        if (paramString.equals("comment_confirmation_tag"))
                        {
                          k = 8;
                          continue;
                          if (paramString.equals("comment_discard_onreply_tag"))
                          {
                            k = 9;
                            continue;
                            if (paramString.equals("reject_inferred_post")) {
                              k = 10;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;
      }
    }
    mbf localmbf4 = this.bn;
    String str6 = this.d;
    Intent localIntent2 = EsService.e.a(localmbf4, EsService.class);
    localIntent2.putExtra("op", 20);
    localIntent2.putExtra("account_id", j);
    localIntent2.putExtra("aid", str6);
    this.ah = Integer.valueOf(EsService.a(localmbf4, localIntent2));
    a(16);
    return;
    mbf localmbf3 = this.bn;
    String str4 = this.d;
    String str5 = paramBundle.getString("comment_id");
    Intent localIntent1 = EsService.e.a(localmbf3, EsService.class);
    localIntent1.putExtra("op", 33);
    localIntent1.putExtra("account_id", j);
    localIntent1.putExtra("aid", str4);
    localIntent1.putExtra("comment_id", str5);
    this.ah = Integer.valueOf(EsService.a(localmbf3, localIntent1));
    a(33);
    return;
    mbf localmbf2 = this.bn;
    String str3 = this.d;
    if (!this.aC) {}
    for (;;)
    {
      this.ah = Integer.valueOf(EsService.b(localmbf2, j, str3, i));
      a(17);
      return;
      i = 0;
    }
    int m = this.an;
    int n;
    if (m != 2)
    {
      n = 0;
      if (m != i) {}
    }
    else
    {
      n = i;
    }
    if (n != 0) {}
    for (String str2 = this.aA;; str2 = null)
    {
      this.ah = Integer.valueOf(EsService.a(this.bn, j, this.d, str2));
      a(18);
      return;
    }
    a(i);
    return;
    gzj localgzj2 = O();
    lhy locallhy = new lhy(this.bn, this.b.c(), this.al, this.d, 2);
    localgzj2.d.a(locallhy, false);
    localgzj2.b(locallhy);
    return;
    String str1 = paramBundle.getString("ban_user_id");
    gzj localgzj1 = O();
    lfp locallfp = new lfp(this.bn, this.b.c(), this.al, str1, 7);
    localgzj1.d.a(locallfp, false);
    localgzj1.b(locallfp);
    mbf localmbf1 = this.bn;
    gxr localgxr = new gxr();
    gxq localgxq1 = new gxq(pjo.h);
    localgxr.b.add(localgxq1);
    gxq localgxq2 = new gxq(pkh.i);
    localgxr.b.add(localgxq2);
    new gwz(4, localgxr.a(this.bn)).b(localmbf1);
    return;
    this.aM.setEnabled(this.aL.c());
    return;
    a(i);
    return;
    a(this.bY, this.bZ);
    return;
    O().b(new boa(this.bn, j, this.d, this.Z));
  }
  
  public final void a(Parcelable paramParcelable)
  {
    Bundle localBundle = (Bundle)paramParcelable;
    String str1 = localBundle.getString("comment_author_id");
    String str2 = localBundle.getString("comment_author_name");
    a(49);
    String str3 = String.valueOf(str1);
    if (str3.length() != 0) {}
    for (String str4 = "g:".concat(str3);; str4 = new String("g:"))
    {
      this.ah = EsService.b(this.bn, this.b.c(), str4, str2, true);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.bD;
      localgxx.a(localgxw);
      return;
    }
  }
  
  public final void a(chi paramchi)
  {
    this.bz = paramchi;
    if (this.N != null) {
      k().b(0, null, this);
    }
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    switch (paramfu.i)
    {
    default: 
      return;
    }
    D();
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (paramhae == null) {}
    label99:
    do
    {
      do
      {
        int i;
        do
        {
          do
          {
            return;
            i = this.b.c();
            if (!"EditModerationStateTask".equals(paramString)) {
              break;
            }
          } while (paramhae.a().getInt("moderation_state") != 2);
          a(true);
          return;
          if ("RemoveReportBanTask".equals(paramString))
          {
            if (paramhae.b != 200) {}
            for (int i3 = 1;; i3 = 0)
            {
              if (i3 != 0) {
                break label99;
              }
              if (!paramhae.a().getBoolean("remove_post")) {
                break;
              }
              a(true);
              return;
            }
          }
          if ("GetActivityTask".equals(paramString))
          {
            K();
            this.ad = true;
            if (hae.a(paramhae))
            {
              mbf localmbf = this.bn;
              int i2 = aau.ef;
              Toast.makeText(localmbf, g().getText(i2), 0).show();
            }
            new kpz(7, this.bs).b(this.bn);
            return;
          }
          if (!"ModifyCircleMembershipsTask".equals(paramString)) {
            break;
          }
        } while (this.bw == null);
        if (!hae.a(paramhae)) {
          this.bw.a(i);
        }
        for (;;)
        {
          this.bw = null;
          return;
          Toast.makeText(f(), paramhae.d, 0).show();
        }
        if ("SetSquarePinnedStateTask".equals(paramString))
        {
          if (paramhae.b != 200) {}
          for (int n = 1; n == 0; n = 0)
          {
            int i1 = paramhae.a().getInt("pinned_state");
            lmw.a.a();
            if (this.ar == null) {
              this.ar = new llr();
            }
            this.ar.a(new lmd(i1, lme.a));
            this.ab.f = this.ar;
            E();
            bnd localbnd = bnd.a(this.bn, this.b.c(), 4, null, this.al, null, null, null, null, null, false, true, 0L, null);
            O().b(localbnd);
            return;
          }
        }
        if (paramString.equals(this.bx.a()))
        {
          if (paramhae.b != 200) {}
          for (int k = 1; k == 0; k = 0)
          {
            int m = paramhae.a().getInt("clx_pinned_state");
            if (this.ar == null) {
              this.ar = new llr();
            }
            this.ar.a(new lmd(m, lme.b));
            this.ab.f = this.ar;
            this.a.a();
            lln locallln = (lln)this.bo.a(lln.class);
            gzf localgzf = this.bx.a(i, null, this.at, null, false, true, locallln.e(i), locallln.a(this.bn, i));
            O().b(localgzf);
            return;
          }
        }
        if (("RejectInferredPostTask".equals(paramString)) && (!hae.a(paramhae)))
        {
          a(true);
          bp localbp = f();
          int j = aau.rT;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.aa;
          Toast.makeText(localbp, g().getString(j, arrayOfObject), 0).show();
          return;
        }
        if (!"GetRedirectUrlTask".equals(paramString)) {
          break;
        }
      } while (this.bg == null);
      this.bg.a(paramhae);
      return;
    } while (!"EditSquareMembershipTask".equals(paramString));
    E();
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    gzj localgzj = O();
    bod localbod = new bod(this.bn, this.b.c(), paramString1, paramString2, paramString3, this.aA, paramBoolean1, paramBoolean2);
    localgzj.d.a(localbod, false);
    localgzj.b(localbod);
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
  }
  
  final void a(boolean paramBoolean)
  {
    this.aJ = null;
    if (this.aW == 0)
    {
      localbp = f();
      if (localbp != null)
      {
        if (paramBoolean)
        {
          locallzw = (lzw)this.bo.b(lzw.class);
          if (locallzw != null) {
            locallzw.a();
          }
        }
        localbp.finish();
      }
    }
    while (this.bP)
    {
      bp localbp;
      lzw locallzw;
      return;
    }
    this.bP = true;
    if (J() != this.bS)
    {
      x();
      z();
      return;
    }
    int i = J();
    Bundle localBundle = this.m;
    int j = localBundle.getInt("popup_start_x");
    int k = localBundle.getInt("popup_start_y");
    int m = localBundle.getInt("popup_start_width");
    int n = localBundle.getInt("popup_start_height");
    int i1 = L();
    int i2 = N();
    int i3 = this.bO[i];
    int i4 = this.ba[i];
    int i5;
    if (this.aY)
    {
      this.aZ.e.setAlpha(1.0F);
      this.aZ.e.animate().alpha(0.0F).setDuration(150L);
      this.aZ.a.animate().alpha(0.0F).setDuration(150L);
      i5 = 1;
    }
    for (int i6 = 1;; i6 = 0)
    {
      this.bQ.a(i3, j, i4, k, i1, m, i2, n);
      this.bR.removeAllListeners();
      this.bR.addListener(new cgy(this));
      this.aZ.animate().setStartDelay(320L).setInterpolator(bT).alpha(0.0F).setDuration(150L).setListener(new cgz(this));
      if (i6 != 0) {
        this.aZ.e.animate().start();
      }
      if (i5 != 0) {
        this.aZ.a.animate().start();
      }
      this.aZ.animate().start();
      this.bR.start();
      if (!this.aY) {
        break;
      }
      this.aX.setBackgroundResource(efj.pc);
      TransitionDrawable localTransitionDrawable = (TransitionDrawable)this.aX.getBackground();
      localTransitionDrawable.setCrossFadeEnabled(true);
      localTransitionDrawable.startTransition(400);
      return;
      i5 = 0;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.iq)
    {
      E();
      return true;
    }
    return false;
  }
  
  public final void b(int paramInt)
  {
    if (efj.L(this.bn)) {}
    int i;
    for (this.aQ = 2;; this.aQ = paramInt)
    {
      i = L();
      bp localbp = f();
      if (!(localbp instanceof HostStreamOneUpActivity)) {
        break;
      }
      ((HostStreamOneUpActivity)localbp).a(i);
      return;
    }
    ((StreamOneUpViewGroup)this.N.findViewById(aaw.ey)).a(i);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(tp paramtp) {}
  
  final void b(boolean paramBoolean)
  {
    if (this.x.a("comment_confirmation_tag") != null) {
      return;
    }
    if (!this.aL.c())
    {
      a(paramBoolean);
      return;
    }
    a("comment_confirmation_tag");
  }
  
  public final void c(int paramInt) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.b = ((git)this.bo.a(git.class));
    this.bo.a(dgy.class, this);
    if (!efj.L(this.bn))
    {
      lvj locallvj = (lvj)this.bo.b(lvj.class);
      if (locallvj != null)
      {
        lvi locallvi = this.bu;
        lvh locallvh = locallvj.b;
        locallvi.a.add(locallvh);
      }
    }
    ill localill = new ill(this.bn, this.b.c());
    localill.a.add(ine.class);
    this.c = localill;
    this.bg = new dfm(this.bn);
    this.cc = ((giz)this.bo.a(giz.class));
    this.bh = ((jtp)this.bo.b(jtp.class));
    this.bi = ((jtr)this.bo.b(jtr.class));
    int i = this.b.c();
    this.aT = ((hul)this.bo.a(hul.class)).a(i);
    this.af = ((bot)this.bo.a(bot.class));
    this.ae = ((hpo)this.bo.a(hpo.class));
    this.bx = ((hhh)this.bo.a(hhh.class));
    mbb localmbb1 = this.bo;
    localmbb1.a(hen.class, new czd(this.bn, this));
    localmbb1.a(iiq.class, new duf(this, this.bn, 10, "stream1upfrag"));
    localmbb1.a(lli.class, this.bg);
    localmbb1.a(heg.class, new chn(this));
    localmbb1.a(hep.class, new cho(this));
    localmbb1.a(hdf.class, new che(this, this.bn));
    localmbb1.a(llj.class, this.by);
    localmbb1.a(lex.class, this.cd);
    localmbb1.a(liv.class, this.bj);
    localmbb1.a(kyv.class, this);
    localmbb1.a(lfs.class, this);
    localmbb1.a(gxs.class, this);
    hgv localhgv = this.af.a(this, this.bp);
    mbb localmbb2 = this.bo;
    localmbb2.a(hgv.class, localhgv);
    localmbb2.a(hgw.class, localhgv);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void c(String paramString1, String paramString2)
  {
    gzj localgzj = O();
    lhy locallhy = new lhy(this.bn, this.b.c(), paramString1, paramString2, 2);
    localgzj.d.a(locallhy, false);
    localgzj.b(locallhy);
  }
  
  public final void d(int paramInt)
  {
    k().a(2, null, this);
    E();
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    b(this.aQ);
  }
  
  public final void d(String paramString1, String paramString2)
  {
    gzj localgzj = O();
    lhy locallhy = new lhy(this.bn, this.b.c(), paramString1, paramString2, 1);
    localgzj.d.a(locallhy, false);
    localgzj.b(locallhy);
  }
  
  public final void d_()
  {
    int i = 1;
    this.bJ = null;
    this.aL.removeTextChangedListener(this.bK);
    this.aL.setOnEditorActionListener(null);
    MentionMultiAutoCompleteTextView localMentionMultiAutoCompleteTextView = this.aL;
    if (localMentionMultiAutoCompleteTextView.b != null)
    {
      localMentionMultiAutoCompleteTextView.b.z();
      localMentionMultiAutoCompleteTextView.b = null;
    }
    localMentionMultiAutoCompleteTextView.setAdapter(null);
    this.aL = null;
    this.aM.setOnClickListener(null);
    this.aM = null;
    this.bG = null;
    this.bH.a(kxg.a);
    this.bH = null;
    this.bI = null;
    this.bO[0] = -1;
    this.ba[0] = -1;
    this.bO[i] = -1;
    this.ba[i] = -1;
    this.bP = false;
    this.bM = false;
    this.ab = null;
    this.aZ.setVisibility(0);
    this.ac.j = false;
    this.bL = null;
    this.ac = null;
    this.aM = null;
    this.bK = null;
    this.bQ = null;
    this.ad = false;
    if ((this.aZ != null) && (this.aZ.e != null)) {
      this.aZ.e.a(null, 0, 0);
    }
    if (this.aX != null)
    {
      this.aX.setOnTouchListener(null);
      this.aX.removeAllViews();
    }
    if (this.bR != null)
    {
      this.bR.removeAllListeners();
      this.bR.cancel();
    }
    if (Build.VERSION.SDK_INT >= 14) {}
    for (;;)
    {
      if (i != 0)
      {
        this.aZ.animate().setListener(null).setStartDelay(0L).setDuration(0L).cancel();
        this.aZ.setAlpha(1.0F);
      }
      gpk localgpk = this.a;
      chk localchk = this.bV;
      if ((localgpk.a != null) && (localgpk.b)) {
        localgpk.a.d(localchk);
      }
      super.d_();
      return;
      i = 0;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ah != null) {
      paramBundle.putInt("pending_request_id", this.ah.intValue());
    }
    RecyclingViewGroup localRecyclingViewGroup;
    int i;
    if (this.ac != null)
    {
      paramBundle.putInt("scroll_position", this.ac.e);
      localRecyclingViewGroup = this.ac;
      if (localRecyclingViewGroup.f != 0) {
        break label374;
      }
      i = 0;
    }
    for (;;)
    {
      paramBundle.putInt("scroll_offset", i);
      paramBundle.putInt("operation_type", this.ai);
      paramBundle.putBoolean("get_activity_complete", this.ad);
      paramBundle.putBoolean("seen_public_dasher_warning", this.bA);
      paramBundle.putBoolean("mute_processed", this.aj);
      paramBundle.putBoolean("read_processed", this.bF);
      if (this.aJ != null) {
        paramBundle.putParcelable("audience_data", this.aJ);
      }
      paramBundle.putStringArrayList("blocked_gaia_ids", this.aK);
      paramBundle.putBoolean("show_keyboard", this.aN);
      paramBundle.putInt("host_mode", this.aO);
      paramBundle.putBoolean("force_full_bleed", this.aP);
      paramBundle.putInt("max_span", this.aQ);
      paramBundle.putBoolean("can_comment", this.aG);
      paramBundle.putBoolean("is_post_restricted_to_domain", this.aH);
      paramBundle.putBoolean("scroll_to_last_comment_pending", this.aR);
      if (this.ar != null) {}
      try
      {
        paramBundle.putByteArray("db_context_specific_data", llr.a(this.ar));
        paramBundle.putInt("popup_start_orientation", this.bS);
        int[] arrayOfInt1 = new int[2];
        arrayOfInt1[0] = this.bO[0];
        arrayOfInt1[1] = this.bO[1];
        paramBundle.putIntArray("popup_end_x", arrayOfInt1);
        int[] arrayOfInt2 = new int[2];
        arrayOfInt2[0] = this.ba[0];
        arrayOfInt2[1] = this.ba[1];
        paramBundle.putIntArray("popup_end_y", arrayOfInt2);
        if (this.bw != null) {
          this.bw.a(paramBundle);
        }
        if (!TextUtils.isEmpty(this.bZ))
        {
          paramBundle.putString("commentreply_authorname", this.bZ);
          paramBundle.putString("commentreply_authorid", this.bY);
        }
        return;
        label374:
        View localView = localRecyclingViewGroup.getChildAt(0);
        if (localView == null)
        {
          i = 0;
          continue;
        }
        lxk locallxk = (lxk)localView.getLayoutParams();
        i = localView.getTop() - (localRecyclingViewGroup.g + localRecyclingViewGroup.getPaddingTop() + locallxk.topMargin);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log.e("stream1upfrag", "Failed to serialize mDbContextSpecificData");
        }
      }
    }
  }
  
  public final void h(Bundle paramBundle)
  {
    if (this.bg != null) {
      this.bg.h(paramBundle);
    }
  }
  
  public final void m()
  {
    super.m();
    bp localbp = f();
    if ((localbp instanceof tt)) {}
    for (tp localtp = ((tt)localbp).e().a();; localtp = null)
    {
      if ((localtp != null) && (!localtp.f())) {
        localtp.d();
      }
      EsService.a(this.bn, this.bt);
      dge.b(this.N);
      return;
    }
  }
  
  public final void n()
  {
    super.n();
    chm localchm = this.bt;
    EsService.d.remove(localchm);
    dge.a(this.N);
    if ((this.aL != null) && (!this.aL.c())) {
      efj.k(this.aL);
    }
    if ((this.bR != null) && (this.bR.isStarted()))
    {
      this.bR.cancel();
      this.bR = null;
      this.aZ.animate().cancel();
    }
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aaw.dJ) {
      if (!this.c.a()) {
        this.bn.startActivity(this.c.b());
      }
    }
    while ((i != aaw.dL) || (!I()))
    {
      do
      {
        return;
        if (!this.aL.c()) {
          break;
        }
        new kqf(91).b(this.bn);
        f(2);
      } while (this.ah != null);
      String str = kia.a(this.aL.getText());
      if ((this.aB != null) && (this.bE))
      {
        O().b(new bos(this.bn, this.b.c(), this.aB.i, this.aB.k, str));
        a(46);
        return;
      }
      Bundle localBundle = gxy.a("extra_activity_id", this.d);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.Q;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      this.ah = Integer.valueOf(EsService.a(this.bn, this.b.c(), this.d, str, this.aS));
      a(32);
      return;
      this.aM.setEnabled(false);
      return;
    }
    H();
  }
  
  public final gya r_()
  {
    return gya.l;
  }
  
  public final boolean t_()
  {
    b(false);
    return true;
  }
  
  public final gxq v()
  {
    gxt localgxt = pkh.H;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.d;
    return new kvj(localgxt, arrayOfString);
  }
  
  final void x()
  {
    bk localbk = this.A;
    if ((localbk instanceof cge))
    {
      cge localcge = (cge)localbk;
      localcge.az.aJ = true;
      localcge.az.w();
      if (localcge.aA != -1) {
        localcge.k().b(2, null, localcge);
      }
    }
  }
  
  final void z()
  {
    this.aL.removeTextChangedListener(this.bK);
    this.aL.setOnEditorActionListener(null);
    this.aL.setText(null);
    bz localbz = this.x;
    if (localbz != null) {
      localbz.c();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cgr
 * JD-Core Version:    0.7.0.1
 */