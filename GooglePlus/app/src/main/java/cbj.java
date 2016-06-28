import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.FastScrollContainer;
import com.google.android.apps.plus.views.FastScrollListView;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cbj
  extends cff
  implements View.OnLongClickListener, aqu, ard, arq, ass, cmh<ipf, iph>, cow, cqa, cw<Cursor>, dxg, luu
{
  private cpv Z;
  boolean a;
  private buv aJ;
  private cop[] aK;
  private View aL;
  private Float aM;
  private hbh aN;
  private final hwq aO;
  private final dme aP;
  private FastScrollContainer aa;
  private boolean ab;
  private boolean ac;
  private boolean ad;
  private Integer ae;
  private boolean af;
  private boolean ag;
  private ipb ah;
  private Animation ai;
  private Uri aj;
  private cmg<ipf, iph> ak;
  FastScrollListView b;
  aqr c;
  private final Runnable d = new cbk(this);
  
  public cbj()
  {
    cpv localcpv = new cpv(this, this.bp, this, 1);
    localcpv.c = true;
    this.Z = localcpv;
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.aO = localhwq;
    this.aP = new cbl(this);
    new ash(this, this.bp, 0);
  }
  
  private final String P()
  {
    String str = this.m.getString("owner_id");
    if ((str == null) && (this.am.c() != -1)) {
      str = this.am.f().b("gaia_id");
    }
    return str;
  }
  
  private final boolean Q()
  {
    int i = this.m.getInt("mode", 0);
    boolean bool = false;
    if (i == 2) {
      bool = true;
    }
    return bool;
  }
  
  private static boolean a(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    int i;
    do
    {
      return false;
      i = paramCursor.getPosition();
    } while (!paramCursor.moveToFirst());
    String str = efj.a(coq.d);
    int j = 0;
    for (;;)
    {
      int k = j + 1;
      if (j <= 2) {}
      try
      {
        if (!paramCursor.isAfterLast())
        {
          boolean bool = str.equals(paramCursor.getString(1));
          if (bool) {
            return true;
          }
          paramCursor.moveToNext();
          j = k;
          continue;
        }
        return false;
      }
      finally
      {
        paramCursor.moveToPosition(i);
      }
    }
  }
  
  private final void c(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (v()) {
      if ((!this.ac) || (!this.ab) || (this.ae != null))
      {
        hwq localhwq2 = this.aO;
        hwt localhwt2 = hwt.a;
        if (localhwt2 == null) {
          throw new NullPointerException();
        }
        localhwq2.g = ((hwt)localhwt2);
        localhwq2.a();
        if ((v()) || (!this.ab) || (this.aM == null) || (this.aM.floatValue() <= 0.0D)) {
          break label223;
        }
        this.b.setSelection(this.c.a(this.aM.floatValue()));
        this.aM = null;
      }
    }
    for (;;)
    {
      a(this.aO);
      G();
      return;
      hwq localhwq3 = this.aO;
      hwt localhwt3 = hwt.c;
      if (localhwt3 == null) {
        throw new NullPointerException();
      }
      localhwq3.g = ((hwt)localhwt3);
      localhwq3.a();
      break;
      hwq localhwq1 = this.aO;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
      break;
      label223:
      if (this.aj != null)
      {
        this.b.setSelection(this.c.a(this.aj));
        this.aj = null;
      }
    }
  }
  
  private final void c(String paramString, Long paramLong)
  {
    int i;
    int j;
    label57:
    jqa localjqa2;
    if ((paramLong != null) && ((0x40000 & paramLong.longValue()) != 0L))
    {
      i = 1;
      j = this.m.getInt("photo_picker_crop_mode", 0);
      if (i == 0) {
        break label250;
      }
      mbf localmbf = this.bn;
      int k = this.am.c();
      if (paramString == null) {
        break label243;
      }
      localjqa2 = efj.c(localmbf, k, paramString);
      localjqa2.c = Integer.valueOf(this.aA.b);
      localjqa2.d = Integer.valueOf(this.aC);
      localjqa2.f = this.az.b;
      localjqa2.g = Boolean.valueOf(this.aD);
      localjqa2.h = Boolean.valueOf(this.aE);
      localjqa2.i = Boolean.valueOf(this.aG);
      localjqa2.j = this.aH;
      localjqa2.e = Integer.valueOf(j);
      localjqa2.p = Boolean.valueOf(this.m.getBoolean("show_autobackup_status"));
    }
    label243:
    label250:
    jqa localjqa1;
    for (Intent localIntent = localjqa2.a();; localIntent = localjqa1.a())
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.do;
      localgxx.a(localgxw);
      b(localIntent);
      return;
      i = 0;
      break;
      paramString = jrf.a();
      break label57;
      localjqa1 = new jqa(f(), HostStreamSingleAlbumTileActivity.class, this.am.c());
      localjqa1.a = paramString;
      localjqa1.c = Integer.valueOf(this.aA.b);
      localjqa1.d = Integer.valueOf(this.aC);
      localjqa1.f = this.az.b;
      localjqa1.g = Boolean.valueOf(this.aD);
      localjqa1.h = Boolean.valueOf(this.aE);
      localjqa1.i = Boolean.valueOf(this.aG);
      localjqa1.j = this.aH;
      localjqa1.e = Integer.valueOf(j);
      localjqa1.t = Integer.valueOf(this.aC);
      localjqa1.q = this.m.getString("button_title_res_id", null);
      if (this.m.containsKey("max_selection_count")) {
        localjqa1.s = Integer.valueOf(this.m.getInt("max_selection_count"));
      }
      if (this.m.containsKey("min_selection_count")) {
        localjqa1.r = Integer.valueOf(this.m.getInt("min_selection_count"));
      }
    }
  }
  
  public final boolean A()
  {
    return (!this.af) && (this.m.getBoolean("show_autobackup_status"));
  }
  
  public final void C()
  {
    this.c.a(null);
  }
  
  public final cop[] D()
  {
    return this.aK;
  }
  
  protected final boolean E()
  {
    return (super.E()) || (M());
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.ud);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    Bundle localBundle1 = this.m;
    lvz locallvz = this.at;
    boolean bool1 = this.am.d();
    if (locallvz.a != null) {
      locallvz.a.setEnabled(bool1);
    }
    boolean bool2 = this.m.getBoolean("local_folders_only");
    this.aa = ((FastScrollContainer)localView.findViewById(aaw.lI));
    this.aa.a(this);
    int j;
    boolean bool3;
    label128:
    boolean bool4;
    label138:
    int m;
    label190:
    String str;
    label217:
    int n;
    label316:
    cpv localcpv;
    if (bool2)
    {
      j = 2;
      if (M()) {
        break label617;
      }
      bool3 = true;
      if (M()) {
        break label623;
      }
      bool4 = true;
      aqv localaqv = new aqv(j, bool3, i, bool4);
      int k = this.m.getInt("account_id", -1);
      if ((M()) || (Q()) || (bool2)) {
        break label629;
      }
      m = 1;
      if (m == 0) {
        break label635;
      }
      String[] arrayOfString = new String[1];
      arrayOfString[0] = P();
      str = jrf.a(0, arrayOfString);
      aqr localaqr = new aqr(this.bn, k, str, localaqv, this, r_());
      localaqr.a = this;
      localaqr.m = this.Z;
      FastScrollContainer localFastScrollContainer = this.aa;
      localaqr.n.a = localFastScrollContainer;
      this.c = localaqr;
      Bundle localBundle2 = this.m;
      boolean bool5 = false;
      if (localBundle2 != null) {
        bool5 = localBundle2.getBoolean("local_folders_only", false);
      }
      if (!bool5) {
        break label641;
      }
      this.aK = new cop[0];
      this.aJ = new buv(this.bn, this, k(), 2, this.am.c(), this.aA.b);
      this.b = ((FastScrollListView)localView.findViewById(aaw.lH));
      this.b.setRecyclerListener(new cbp());
      this.b.setAdapter(this.c);
      if (!M()) {
        break label744;
      }
      n = 2;
      label403:
      this.ak = new cmg(n, this.c, this);
      N().a(this.b, this, this.aa);
      if (paramBundle == null) {
        k().a(0);
      }
      k().a(0, null, this);
      this.aj = ((Uri)localBundle1.getParcelable("scroll_to_uri"));
      if (paramBundle != null)
      {
        this.ad = paramBundle.getBoolean("first_refresh_finished");
        this.ag = paramBundle.getBoolean("accessibility_enabled");
        if (paramBundle.containsKey("scroll_pos"))
        {
          this.aM = Float.valueOf(paramBundle.getFloat("scroll_pos"));
          this.aj = null;
        }
      }
      if (this.Z != null)
      {
        localcpv = this.Z;
        if ((!M()) || (!this.m.getBoolean("show_autobackup_status")) || (!this.am.e())) {
          break label750;
        }
      }
    }
    label617:
    label750:
    for (boolean bool6 = true;; bool6 = false)
    {
      localcpv.a(bool6);
      c(localView);
      if (M()) {
        this.aa.a.a();
      }
      return localView;
      j = 0;
      break;
      bool3 = false;
      break label128;
      label623:
      bool4 = false;
      break label138;
      label629:
      m = 0;
      break label190;
      label635:
      str = null;
      break label217;
      if (this.am.e())
      {
        this.aK = buv.a(f(), this.am.c(), this, this);
        break label316;
      }
      cop[] arrayOfcop = new cop[1];
      mbf localmbf = this.bn;
      int i1 = this.am.c();
      if (!M()) {}
      for (boolean bool7 = true;; bool7 = false)
      {
        arrayOfcop[0] = new cpf(localmbf, i1, this, bool7);
        this.aK = arrayOfcop;
        break;
      }
      n = 5;
      break label403;
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (M()) {
      return new dcm(this.bn, null, this.aC);
    }
    if (Q()) {
      return new dfq(this.bn);
    }
    int i;
    if ((this.am.e()) && (!E()))
    {
      i = 1;
      if (i == 0) {
        break label278;
      }
      if ((0x1 & this.aC) == 0) {
        break label217;
      }
    }
    label217:
    for (int i2 = 1;; i2 = 0)
    {
      if (i2 == 0) {
        break label223;
      }
      mbf localmbf2 = this.bn;
      int i4 = this.am.c();
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = P();
      String str1 = jrf.a(0, arrayOfString2);
      int i5 = this.aC;
      String str2 = String.valueOf(cyd.a("NOT media_attr & 32", null));
      String str3 = String.valueOf("media_attr & 2048 == 0");
      return new cyd(localmbf2, i4, str1, 5 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + " AND " + str3, true, i5);
      i = 0;
      break;
    }
    label223:
    mbf localmbf1 = this.bn;
    int i3 = this.am.c();
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = P();
    return new cyd(localmbf1, i3, jrf.a(0, arrayOfString1), null, true, this.aC);
    label278:
    boolean bool = this.m.getBoolean("local_folders_only");
    int j = new jrh(this.bn).c;
    int k;
    int m;
    int n;
    int i1;
    if (bool)
    {
      k = 2;
      m = j * k;
      n = this.aC;
      if ((n & 0x2) == 0) {
        break label360;
      }
      i1 = 4;
    }
    for (;;)
    {
      return new dcl(this.bn, m, i1, true);
      k = 1;
      break;
      label360:
      if ((n & 0x1) != 0) {
        i1 = 5;
      } else {
        i1 = 0;
      }
    }
  }
  
  public final List<iph> a(List<ipf> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      ipf localipf = (ipf)localIterator.next();
      localArrayList.add(this.ah.b(localipf, 2, 65600));
    }
    return localArrayList;
  }
  
  public final void a(int paramInt) {}
  
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    String str1 = paramBundle.getString("collection_id");
    ArrayList localArrayList1 = paramBundle.getIntegerArrayList("action");
    ArrayList localArrayList2 = paramBundle.getParcelableArrayList("selected_media");
    int i = this.am.c();
    switch (((Integer)localArrayList1.get(paramInt)).intValue())
    {
    default: 
      super.a(paramInt, paramBundle, paramString);
      return;
    case 0: 
      String str2 = jrf.d(str1);
      String str3 = jrf.c(str1);
      String str4 = jrf.e(str1);
      a(efj.a(f(), i, str4, str2, str3, str1));
      return;
    case 1: 
      Toast.makeText(this.bn, aau.dW, 0).show();
      return;
    case 2: 
      Toast.makeText(this.bn, aau.dW, 0).show();
      return;
    case 3: 
      a(efj.b(this.bn, i, localArrayList2));
      f().overridePendingTransition(efj.iK, 0);
      return;
    }
    b(null);
  }
  
  final void a(int paramInt, dmx paramdmx)
  {
    if ((this.ae == null) || (this.ae.intValue() != paramInt)) {
      return;
    }
    this.ae = null;
    this.ad = true;
    int i;
    if (paramdmx != null) {
      if (paramdmx.c != 200)
      {
        i = 1;
        if (i == 0) {
          break label131;
        }
      }
    }
    label131:
    for (boolean bool = true;; bool = false)
    {
      this.aB = bool;
      if (this.aB)
      {
        String str = g().getString(aau.rR);
        Toast.makeText(f(), str, 0).show();
      }
      c(this.N);
      this.b.setSelection(0);
      aqr localaqr = this.c;
      localaqr.k = true;
      localaqr.h = null;
      return;
      i = 0;
      break;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("refresh_request"))) {
      this.ae = Integer.valueOf(paramBundle.getInt("refresh_request"));
    }
  }
  
  public final void a(View paramView, atq paramatq, String paramString)
  {
    afv localafv = new afv(this.bn, paramView);
    localafv.a(efj.wQ);
    xl localxl = localafv.a;
    localxl.size();
    ArrayList localArrayList = aqr.a(paramatq);
    for (int i = -1 + localxl.size(); i >= 0; i--)
    {
      MenuItem localMenuItem = localxl.getItem(i);
      if (localMenuItem.getItemId() == aaw.ju)
      {
        Resources localResources = this.bn.getResources();
        int j = aau.sS;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(localArrayList.size());
        localMenuItem.setTitle(localResources.getString(j, arrayOfObject));
      }
    }
    localafv.c = new cbn(this.bn, f(), this.am.c(), paramString, this.aC, localArrayList);
    localafv.b.d();
  }
  
  public final void a(View paramView, String paramString1, String paramString2)
  {
    int i = 1;
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dR;
    localgxx.a(localgxw);
    if (jrf.l(paramString2))
    {
      Toast.makeText(this.bn, aau.uO, i).show();
      return;
    }
    TextView localTextView = (TextView)((View)paramView.getParent()).findViewById(aaw.ak);
    hbh localhbh2;
    if (this.aN.a(paramString1))
    {
      localhbh2 = this.aN;
      if (localhbh2.b == null) {
        break label305;
      }
      localhbh2.b.b(paramString1);
    }
    for (;;)
    {
      localhbh2.a.a();
      if (i != 0)
      {
        ((ImageView)paramView).setImageResource(efj.or);
        localTextView.setText(aau.cs);
        this.ai = AnimationUtils.loadAnimation(f(), efj.iD);
      }
      localTextView.setVisibility(0);
      this.ai.setAnimationListener(new cbm(this, localTextView));
      localTextView.startAnimation(this.ai);
      return;
      hbh localhbh1 = this.aN;
      if (localhbh1.b != null) {
        localhbh1.b.a(paramString1);
      }
      for (;;)
      {
        localhbh1.a.a();
        if (i == 0) {
          break;
        }
        localTextView.setText(aau.ct);
        this.ai = AnimationUtils.loadAnimation(f(), efj.iE);
        AnimationDrawable localAnimationDrawable = (AnimationDrawable)paramView.getResources().getDrawable(efj.ot);
        ((ImageView)paramView).setImageDrawable(localAnimationDrawable);
        localAnimationDrawable.start();
        break;
        i = 0;
      }
      label305:
      i = 0;
    }
  }
  
  public final void a(atq paramatq)
  {
    ArrayList localArrayList = aqr.a(paramatq);
    isq localisq = this.az.b;
    Iterator localIterator = localArrayList.iterator();
    int i = 0;
    if (localIterator.hasNext()) {
      if (!localisq.b((jpx)localIterator.next())) {
        break label135;
      }
    }
    label135:
    for (int j = i + 1;; j = i)
    {
      i = j;
      break;
      if (i == localArrayList.size())
      {
        this.aq.a(localArrayList);
        return;
      }
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.du;
      localgxx.a(localgxw);
      this.aq.c(localArrayList);
      return;
    }
  }
  
  public final void a(cop paramcop)
  {
    this.ab = true;
    View localView;
    if (paramcop != null)
    {
      localView = paramcop.h();
      if ((!this.ac) || ((this.c.getCount() <= 0) && (!Q()))) {
        break label72;
      }
      this.c.a(localView);
    }
    for (;;)
    {
      c(this.N);
      if (paramcop != null) {
        paramcop.g();
      }
      return;
      localView = null;
      break;
      label72:
      this.aL = localView;
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString)
  {
    cbo localcbo = new cbo(this, this.bn, this.am.c(), paramString, this.c);
    localcbo.f = "fetch_newer";
    ((gzj)this.bo.a(gzj.class)).b(localcbo);
  }
  
  public final void a(String paramString, Long paramLong)
  {
    c(paramString, paramLong);
  }
  
  public final void a(String paramString1, Long paramLong, String paramString2, ipf paramipf)
  {
    if (a(paramipf)) {
      return;
    }
    int i;
    bdo localbdo;
    if ((paramLong != null) && ((0x40000 & paramLong.longValue()) != 0L))
    {
      i = 1;
      localbdo = new bdo(f(), this.am.c());
      localbdo.b = paramString2;
      localbdo.c = paramipf;
      if (i == 0) {
        break label224;
      }
    }
    for (;;)
    {
      localbdo.e = paramString1;
      localbdo.p = Integer.valueOf(this.aA.b);
      localbdo.g = this.az.b;
      localbdo.w = this.aA.c();
      localbdo.r = Boolean.valueOf(false);
      localbdo.q = Integer.valueOf(this.aC);
      Intent localIntent = localbdo.a();
      ((ipb)mbb.a(this.bn, ipb.class)).b(paramipf, 5, 4160);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.dm;
      localgxx.a(localgxw);
      b(localIntent);
      return;
      i = 0;
      break;
      label224:
      String[] arrayOfString = new String[1];
      arrayOfString[0] = P();
      paramString1 = jrf.a(0, arrayOfString);
    }
  }
  
  public final void a(List<Uri> paramList, bti parambti)
  {
    this.b.setSelection(0);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return super.a(paramMenuItem);
  }
  
  protected final boolean a(View paramView)
  {
    return false;
  }
  
  public final void aa_()
  {
    if ((this.c != null) && (!this.a))
    {
      this.a = true;
      Runnable localRunnable = this.d;
      efj.m().postDelayed(localRunnable, 1000L);
    }
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    boolean bool = E();
    if ((this.am.e()) && (!bool))
    {
      a(paramgpr, 0);
      gqe localgqe = (gqe)paramgpr.a(aaw.iq);
      localgqe.b = Math.max(1, localgqe.b);
    }
    Bundle localBundle = this.m;
    if ((localBundle != null) && (localBundle.getBoolean("local_folders_only", false))) {
      paramgpr.d(aau.cD);
    }
  }
  
  public final void b(String paramString)
  {
    int i = this.am.c();
    a(efj.a(f(), i, paramString, null, false));
  }
  
  public final void b(String paramString, Long paramLong)
  {
    c(paramString, paramLong);
  }
  
  public final void b(List<iph> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      iph localiph = (iph)localIterator.next();
      this.ah.a.d(localiph);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(arq.class, this);
    this.bo.a(ard.class, this);
    this.ah = ((ipb)this.bo.a(ipb.class));
    this.ax = ((asr)this.bo.a(asr.class));
    this.aN = ((hbh)this.bo.a(hbh.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ae != null) {
      paramBundle.putInt("refresh_request", this.ae.intValue());
    }
    if ((this.c != null) && (!this.c.isEmpty()))
    {
      aqr localaqr = this.c;
      int i = this.b.getFirstVisiblePosition();
      aqx localaqx = new aqx();
      ((atq)localaqr.o.get(i)).a(localaqx);
      paramBundle.putFloat("scroll_pos", localaqx.a);
    }
    paramBundle.putBoolean("first_refresh_finished", this.ad);
  }
  
  public final void m()
  {
    super.m();
    this.ax.a(this);
    EsService.a(this.bn, this.aP);
    if (this.ae != null)
    {
      int i = this.ae.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i))) {
        break label181;
      }
      if (v())
      {
        hwq localhwq = this.aO;
        hwt localhwt = hwt.a;
        if (localhwt == null) {
          throw new NullPointerException();
        }
        localhwq.g = ((hwt)localhwt);
        localhwq.a();
      }
    }
    for (;;)
    {
      boolean bool = efj.B(this.bn);
      this.c.c = bool;
      if (bool != this.ag)
      {
        this.ag = bool;
        this.c.notifyDataSetChanged();
      }
      cpv localcpv = this.Z;
      if (localcpv.d != null) {
        localcpv.d.a();
      }
      if (M()) {
        this.aa.a.a();
      }
      this.aJ.a();
      return;
      label181:
      dmx localdmx = EsService.a(this.ae.intValue());
      a(this.ae.intValue(), localdmx);
    }
  }
  
  public final void n()
  {
    super.n();
    this.ax.b(this);
    if (this.ak != null) {
      this.ak.a();
    }
    if (M()) {
      this.aa.a.b();
    }
    dme localdme = this.aP;
    EsService.d.remove(localdme);
  }
  
  public final boolean onLongClick(View paramView)
  {
    if ((paramView instanceof PhotoTileView))
    {
      b((PhotoTileView)paramView);
      return true;
    }
    return false;
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    this.ak.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }
  
  public final void p_()
  {
    super.p_();
    lwo.c(this.b);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.b);
  }
  
  public final gya r_()
  {
    if (M()) {
      return gya.af;
    }
    return gya.Z;
  }
  
  public final boolean t_()
  {
    if (this.aE) {
      return super.s_();
    }
    return super.t_();
  }
  
  protected final boolean v()
  {
    return (this.c == null) || (this.c.isEmpty());
  }
  
  public final boolean y_()
  {
    return (this.ae != null) || (super.y_());
  }
  
  public final boolean z()
  {
    return (super.z()) && (this.am.e()) && (!E());
  }
  
  public final void z_()
  {
    boolean bool1 = true;
    super.z_();
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (this.at != null)
    {
      lvz locallvz = this.at;
      if (locallvz.a != null)
      {
        localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
          break label63;
        }
        localSwipeRefreshLayoutWithUpScroll.a(false);
      }
    }
    label63:
    do
    {
      while ((this.ae != null) || (E()))
      {
        return;
        if (localSwipeRefreshLayoutWithUpScroll.m != null)
        {
          if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
            localSwipeRefreshLayoutWithUpScroll.a(bool1);
          }
          if (!localSwipeRefreshLayoutWithUpScroll.m.O_())
          {
            Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
            long l = localSwipeRefreshLayoutWithUpScroll.o;
            efj.m().postDelayed(localRunnable, l);
          }
        }
      }
    } while (!this.am.d());
    this.aB = false;
    this.c.k = false;
    boolean bool2 = O();
    bp localbp = f();
    int i = this.am.c();
    String str = this.am.f().b("gaia_id");
    if (!bool2) {}
    for (;;)
    {
      this.ae = Integer.valueOf(EsService.a(localbp, i, str, null, bool1));
      c(this.N);
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.dx;
      localgxx.a(localgxw);
      return;
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbj
 * JD-Core Version:    0.7.0.1
 */