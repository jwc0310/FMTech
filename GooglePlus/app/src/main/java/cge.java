import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.Layout.Alignment;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.apps.plus.phone.PeopleListActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import com.google.android.libraries.social.stream.legacy.views.StreamTooltipView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class cge
  extends mca
  implements View.OnClickListener, by, cw<Cursor>, dat, gpq, gxs, gxv, gzi, hgh, iwt, kyw, lob, luu, lux, lvh, lvy
{
  private static final String[] a = { "circle_id", "circle_name" };
  private static final mcr ae = new mcr("enable_popout_oneup");
  private static int b;
  private lln Z;
  public int aA;
  public String aB;
  public long aC;
  public String aD;
  String aE;
  cyf aF;
  public iww aG;
  public String aH;
  public boolean aI;
  public boolean aJ;
  public boolean aK;
  public cyh aL;
  public boolean aM;
  public boolean aN;
  public Cursor aO;
  boolean aP;
  private StreamTooltipView aQ;
  private lvn aR;
  private boolean aS;
  private long aT;
  private int aU;
  private int aV;
  private int aW;
  private boolean aX;
  private int aY;
  private int aZ;
  private dsr aa;
  private int ab;
  private bwk ac;
  private cgr ad;
  private byte[] af;
  private boolean ag;
  private boolean ah;
  private boolean ai;
  private long aj;
  private long ak;
  private boolean al;
  private boolean am;
  private boolean an;
  private int ao;
  private StreamTooltipView ap;
  private lvn aq;
  final hue ar = new hue(this.bp);
  public final gpk as = new gpk(this, this.bp, this);
  public git at;
  public final lvi au = new lvi();
  public ill av;
  public final hwq aw;
  public final lvz ax;
  public StreamGridView ay;
  public dfz az;
  private hvj ba;
  private hum bb;
  private dge bc;
  private jia bd;
  private kpn be;
  private final dme bf;
  private cgi bg;
  private boolean bh;
  private dfm bi;
  private gzj bj;
  private lta bk;
  private int bl;
  private boolean bm;
  private cpl c;
  private idy d;
  
  public cge()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lJ;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.aw = localhwq;
    this.ax = new lvz(this, this.bp);
    this.ab = -1;
    new gzc(this, new cgk(this));
    this.aA = -1;
    this.aI = true;
    this.ag = false;
    this.ao = 2;
    this.bf = new cgo(this);
    this.bh = false;
  }
  
  private final void M()
  {
    this.aN = true;
    this.ay.post(new cgg(this));
  }
  
  private final boolean N()
  {
    return h().a("HOSTEDSTREAMONEUP_FRAGMENT") != null;
  }
  
  private final boolean O()
  {
    bw localbw = h();
    int i = localbw.e();
    if (i > 0) {
      return TextUtils.equals(localbw.b(i - 1).d(), "HOSTEDSTREAMONEUP_FRAGMENT");
    }
    return false;
  }
  
  private final cgr P()
  {
    bk localbk = h().a("HOSTEDSTREAMONEUP_FRAGMENT");
    if ((localbk instanceof cgr)) {
      return (cgr)localbk;
    }
    return null;
  }
  
  private final int Q()
  {
    dfz localdfz = this.az;
    int i = 0;
    if (localdfz != null)
    {
      int j = this.ay.a.c;
      int k = this.ay.g;
      if (k > this.ay.getChildCount()) {
        k = 0;
      }
      View localView = this.ay.getChildAt(k);
      i = 0;
      if (localView != null) {
        i = localView.getTop() - j - ((lpt)localView.getLayoutParams()).topMargin;
      }
    }
    return i;
  }
  
  private final void R()
  {
    if (this.ap == null) {
      return;
    }
    if (this.al)
    {
      this.aq.a();
      this.ap.setOnClickListener(new gxn(this));
      StreamTooltipView localStreamTooltipView = this.ap;
      String str = this.ap.getContentDescription().toString();
      if (Build.VERSION.SDK_INT >= 16) {
        localStreamTooltipView.announceForAccessibility(str);
      }
      efj.f(this.ap);
      return;
    }
    lvn locallvn = this.aq;
    locallvn.f = true;
    locallvn.b();
    this.aq.b();
    this.ap.setOnClickListener(null);
    efj.g(this.ap);
  }
  
  private static gya a(String paramString)
  {
    if ("v.all.circles".equals(paramString)) {
      return gya.b;
    }
    if ("v.whatshot".equals(paramString)) {
      return gya.d;
    }
    if (paramString.startsWith("f.")) {
      return gya.c;
    }
    if (paramString.startsWith("g.")) {
      return gya.i;
    }
    return gya.a;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    lmw.a.a(false);
    bnd localbnd = new bnd(paramContext, paramInt, 1, null, null, null, null, null, null, null, false, false, true, 0L, null, true);
    localbnd.f = "prefetch_newposts";
    gzj.a(paramContext, localbnd);
  }
  
  private final void a(cgr paramcgr)
  {
    Bundle localBundle = paramcgr.m;
    int i = this.ac.b();
    localBundle.putInt("popup_stream_top", this.ac.a());
    localBundle.putInt("popup_stream_start_height", i);
  }
  
  private final void a(hae paramhae)
  {
    int i = 1;
    if (paramhae == null) {}
    for (;;)
    {
      return;
      Bundle localBundle = paramhae.a();
      String str = localBundle.getString("activity_id");
      int j = localBundle.getInt("moderation_state");
      if (j == i)
      {
        int k;
        if (paramhae.b != 200)
        {
          k = i;
          if (k == 0)
          {
            this.az.aB.add(str);
            if (this.ay == null) {
              continue;
            }
          }
        }
        else
        {
          for (int m = -1 + this.ay.getChildCount();; m--)
          {
            if (m < 0) {
              break label155;
            }
            View localView = this.ay.getChildAt(m);
            if ((localView instanceof eab))
            {
              eab localeab = (eab)localView;
              if (TextUtils.equals(localeab.N, str))
              {
                localeab.j();
                return;
                k = 0;
                break;
              }
              if (str == null) {
                localeab.j();
              }
            }
          }
          label155:
          continue;
        }
      }
      if (j == 2)
      {
        if (paramhae.b != 200) {}
        while (i != 0)
        {
          this.aU = 0;
          this.aV = 0;
          return;
          i = 0;
        }
      }
    }
  }
  
  private final void a(hae paramhae, boolean paramBoolean)
  {
    kat localkat = (kat)this.bo.b(kat.class);
    if (localkat != null) {
      localkat.a(null);
    }
    this.aJ = hae.a(paramhae);
    boolean bool1;
    if (paramhae == null)
    {
      bool1 = false;
      this.ag = bool1;
      if (Log.isLoggable("HostedStreamFrag", 3))
      {
        boolean bool2 = this.aJ;
        new StringBuilder(30).append("onGetActivities - mError=").append(bool2);
        if ((this.aJ) && (paramhae != null)) {
          paramhae.toString();
        }
      }
      if (!paramBoolean) {
        break label217;
      }
      if (!this.aJ)
      {
        this.aj = System.currentTimeMillis();
        this.al = false;
        this.an = false;
      }
    }
    for (;;)
    {
      this.am = false;
      if (!this.aJ)
      {
        if (paramhae != null)
        {
          Bundle localBundle = paramhae.a();
          this.aB = localBundle.getString("new_continuation_token");
          this.af = localBundle.getByteArray("new_stream_token");
          this.aC = localBundle.getLong("new_server_timestamp");
        }
        k().b(2, null, this);
      }
      N_();
      af();
      return;
      bool1 = kbw.b(paramhae.c);
      break;
      label217:
      this.aS = true;
      if (this.aJ) {
        this.aN = false;
      }
    }
  }
  
  private final void a(String paramString1, String paramString2)
  {
    b(paramString2);
    this.bg = new cgi(this, paramString1, paramString2);
    cgi localcgi = this.bg;
    efj.m().postDelayed(localcgi, 3000L);
  }
  
  private final void a(String paramString1, String paramString2, int paramInt, gxz paramgxz)
  {
    if (paramInt == 2) {
      ad();
    }
    int i = this.at.c();
    gzj localgzj = am();
    lhy locallhy = new lhy(this.bn, i, paramString1, paramString2, paramInt);
    localgzj.d.a(locallhy, false);
    localgzj.b(locallhy);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = paramgxz;
    localgxw.h.putString("extra_activity_id", paramString2);
    localgxw.h.putString("extra_square_id", paramString1);
    localgxx.a(localgxw);
  }
  
  private final void a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    b(paramString1);
    if (!this.av.a())
    {
      this.bn.startActivity(this.av.b());
      return;
    }
    int i = this.at.c();
    if (this.bd.d(this.bn, i))
    {
      Bundle localBundle2 = b(paramString1, paramString2, paramBoolean, paramString3, paramString4, paramString5, paramString6, paramInt);
      this.bd.a(this, i, "first_circle_add", localBundle2);
      return;
    }
    boolean bool1 = this.aP;
    boolean bool2 = false;
    if (bool1)
    {
      bool2 = false;
      if (paramBoolean)
      {
        bool2 = false;
        if (paramString3 != null)
        {
          bool2 = true;
          if (this.bd.e(this.bn, i))
          {
            Bundle localBundle1 = b(paramString1, paramString2, paramBoolean, paramString3, paramString4, paramString5, paramString6, paramInt);
            this.bd.a(this, i, "first_circle_add_one_click", paramString2, paramString4, localBundle1);
            return;
          }
        }
      }
    }
    if (paramString3 != null)
    {
      if ((paramInt == -2) || (paramInt == -3))
      {
        ArrayList localArrayList1 = new ArrayList(0);
        ArrayList localArrayList2 = new ArrayList(1);
        localArrayList2.add(paramString3);
        a(localArrayList1, localArrayList2, paramString1, paramString2, paramString6, paramString5, paramInt, bool2, false);
        return;
      }
      ArrayList localArrayList3 = new ArrayList();
      localArrayList3.add(paramString3);
      bnw localbnw = new bnw(this.bn);
      localbnw.a = i;
      localbnw.b = paramString1;
      localbnw.c = paramString2;
      localbnw.f = R_();
      localbnw.d = paramString6;
      localbnw.e = paramString5;
      localbnw.g = localArrayList3;
      localbnw.h = null;
      localbnw.j = localArrayList3;
      localbnw.k = false;
      if (bool2)
      {
        String str = brn.a(this.bn, true);
        int j = aau.mh;
        Object[] arrayOfObject = { str };
        localbnw.l = g().getString(j, arrayOfObject);
        int k = aau.mi;
        localbnw.m = g().getString(k);
      }
      gzj localgzj = am();
      bnv localbnv = localbnw.a();
      localgzj.d.a(localbnv, false);
      localgzj.b(localbnv);
      this.bb.a(this.bn, i, paramString1, paramString5, 18, R_());
      ArrayList localArrayList4 = new ArrayList(1);
      localArrayList4.add(paramString3);
      hgh localhgh = b(paramInt, 1);
      new hvj(this.bn, (gxx)this.bo.a(gxx.class), paramString1, localArrayList4, null, localhgh).a(i);
      return;
    }
    a(efj.a(this.bn, i, paramString1, paramString2, paramString5, paramString6, Integer.valueOf(paramInt), true), 2);
  }
  
  private static Bundle b(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("extra_promo_group_id", 1);
    localBundle.putInt("extra_promo_type", paramInt);
    return localBundle;
  }
  
  private static Bundle b(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("person_id", paramString1);
    localBundle.putString("person_name", paramString2);
    localBundle.putBoolean("for_sharing", paramBoolean);
    localBundle.putString("circle_id", paramString3);
    localBundle.putString("circle_name", paramString4);
    localBundle.putString("suggestion_id", paramString5);
    localBundle.putString("activity_id", paramString6);
    localBundle.putInt("promo_type", paramInt);
    return localBundle;
  }
  
  private final void b(Cursor paramCursor)
  {
    if ((this.aF == null) || (aa()) || (I()) || (this.aF.e) || (paramCursor == null)) {}
    do
    {
      return;
      while (TextUtils.equals(this.aF.c, paramCursor.getString(0))) {
        if (!paramCursor.moveToFirst()) {
          break;
        }
      }
    } while (paramCursor.moveToNext());
    a(new cyf(this.bn, this.bn.getString(aau.tY), "v.all.circles", 0, 0L));
  }
  
  private final void b(hae paramhae)
  {
    if (paramhae != null)
    {
      int i;
      if (paramhae.b != 200) {
        i = 1;
      }
      while ((i == 0) && (paramhae.c == null))
      {
        Bundle localBundle = paramhae.a();
        String str1 = localBundle.getString("extra_activity_id");
        String str2 = localBundle.getString("extra_person_id");
        int j = lod.b(str1);
        ArrayList localArrayList1 = localBundle.getParcelableArrayList("extra_selected_circles");
        if ((this.aP) && ((j == 6) || (j == 2)))
        {
          if ((this.az != null) && (this.ay != null))
          {
            int i1 = -1 + this.ay.getChildCount();
            if (i1 >= 0)
            {
              View localView = this.ay.getChildAt(i1);
              dxu localdxu;
              ArrayList localArrayList6;
              if ((localView instanceof dxu))
              {
                localdxu = (dxu)localView;
                if (TextUtils.equals(str1, localdxu.N))
                {
                  localArrayList6 = new ArrayList();
                  if (localArrayList1 != null)
                  {
                    Iterator localIterator = localArrayList1.iterator();
                    for (;;)
                    {
                      if (localIterator.hasNext())
                      {
                        localArrayList6.add(((jgs)localIterator.next()).b);
                        continue;
                        i = 0;
                        break;
                      }
                    }
                  }
                  this.az.a(str2, localArrayList6);
                }
              }
              for (int i2 = -1 + localdxu.getChildCount();; i2--) {
                if (i2 >= 0)
                {
                  if ((localdxu.getChildAt(i2) instanceof dzr))
                  {
                    dzr localdzr = (dzr)localdxu.getChildAt(i2);
                    if (localdzr.d().equals(str2)) {
                      localdzr.a(localArrayList6);
                    }
                  }
                }
                else
                {
                  i1--;
                  break;
                }
              }
            }
          }
          a(str1, str2);
        }
        ArrayList localArrayList2;
        for (;;)
        {
          localArrayList2 = new ArrayList();
          ArrayList localArrayList3 = localBundle.getParcelableArrayList("extra_added_circles");
          if (localArrayList3 == null) {
            break;
          }
          for (int n = -1 + localArrayList3.size(); n >= 0; n--) {
            localArrayList2.add(((jgs)localArrayList3.get(n)).a);
          }
          a(str1, str2, true);
        }
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = localBundle.getParcelableArrayList("extra_removed_circles");
        if (localArrayList5 != null) {
          for (int m = -1 + localArrayList5.size(); m >= 0; m--) {
            localArrayList4.add(((jgs)localArrayList5.get(m)).a);
          }
        }
        hgh localhgh = b(j, 1);
        int k = this.at.c();
        new hvj(this.bn, (gxx)this.bo.a(gxx.class), str2, localArrayList2, localArrayList4, localhgh).a(k);
      }
    }
  }
  
  private final void b(String paramString)
  {
    if (this.bg != null)
    {
      cgi localcgi = this.bg;
      efj.m().removeCallbacks(localcgi);
      if (!this.bg.a.equals(paramString)) {
        this.bg.run();
      }
      this.bg = null;
    }
  }
  
  private final void b(String paramString1, String paramString2, int paramInt)
  {
    int i = this.at.c();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.A;
    Bundle localBundle = b(lod.a(paramInt));
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    this.bb.b(this.bn, i, paramString1, paramString2, 18, R_());
  }
  
  private final void c(String paramString)
  {
    this.bk.a(this.at.c(), 2L, 3L, paramString);
  }
  
  private final void z()
  {
    iww localiww;
    if ((this.aG != null) && (this.aF != null) && (!aa()) && (!I()))
    {
      localiww = this.aG;
      if (!this.aF.e) {
        break label75;
      }
    }
    label75:
    for (String str = this.aF.f;; str = "circles")
    {
      localiww.a(str, this.aF.a());
      efj.b(this);
      efj.a(this);
      return;
    }
  }
  
  public void A_()
  {
    this.ax.b();
    this.c.a();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.ak;
    localgxx.a(localgxw);
    this.bk.a(this.at.c(), "pull_refresh", 3L, 3L);
    W();
  }
  
  public Integer B()
  {
    return null;
  }
  
  public Integer C()
  {
    return null;
  }
  
  public String D()
  {
    return "android_default_gmh";
  }
  
  public void E()
  {
    if ((am().a("prefetch_newposts")) || (am().a("fetch_newer"))) {
      return;
    }
    if ((this.az == null) || ((this.az.az.size() == 0) && (!this.ai)))
    {
      this.ah = true;
      return;
    }
    gzf localgzf = F();
    localgzf.f = "prefetch_newposts";
    am().b(localgzf);
  }
  
  public gzf F()
  {
    String[] arrayOfString1 = this.m.getStringArray("pinned_activity_ids");
    mbf localmbf = this.bn;
    int i = this.at.c();
    int j = this.aF.d;
    String str1 = this.aF.c;
    String str2 = this.aD;
    if (this.az != null) {}
    for (String[] arrayOfString2 = this.az.u();; arrayOfString2 = null) {
      return bnd.a(localmbf, i, j, str1, str2, null, arrayOfString2, arrayOfString1, this.aC, ab());
    }
  }
  
  public boolean G()
  {
    return true;
  }
  
  public boolean H()
  {
    return (!aa()) && (this.aF != null) && ("v.all.circles".equals(this.aF.a));
  }
  
  public boolean I()
  {
    return false;
  }
  
  public void J()
  {
    if ((Z()) && (L_()))
    {
      hwq localhwq1 = this.aw;
      int i = aau.lJ;
      localhwq1.d = null;
      localhwq1.c = i;
      localhwq1.e();
      hwq localhwq2 = this.aw;
      hwt localhwt = hwt.c;
      if (localhwt == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt);
      localhwq2.a();
    }
  }
  
  public boolean K()
  {
    return true;
  }
  
  public boolean L_()
  {
    return (X()) || (this.aI);
  }
  
  public void M_()
  {
    String str1 = this.aD;
    String str2;
    if (this.aF == null)
    {
      str2 = null;
      if (this.aF != null) {
        break label49;
      }
    }
    label49:
    for (int i = 0;; i = this.aF.d)
    {
      this.aH = efj.a(str1, str2, false, null, null, i, null);
      return;
      str2 = this.aF.c;
      break;
    }
  }
  
  public void N_()
  {
    StreamGridView localStreamGridView;
    if (this.ay != null)
    {
      localStreamGridView = this.ay;
      boolean bool = am().a("fetch_older");
      if (localStreamGridView.q != bool)
      {
        localStreamGridView.q = bool;
        Runnable localRunnable2 = localStreamGridView.r;
        efj.m().removeCallbacks(localRunnable2);
        if (!localStreamGridView.q) {
          break label168;
        }
        localStreamGridView.p.setVisibility(4);
      }
    }
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll2;
    if (this.ax.a())
    {
      lvz locallvz2 = this.ax;
      if (locallvz2.a != null)
      {
        localSwipeRefreshLayoutWithUpScroll2 = locallvz2.a;
        if (localSwipeRefreshLayoutWithUpScroll2.isEnabled()) {
          break label210;
        }
        localSwipeRefreshLayoutWithUpScroll2.a(false);
      }
    }
    hwq localhwq;
    hwt localhwt3;
    for (;;)
    {
      hwt localhwt1 = this.aw.g;
      hwt localhwt2 = hwt.a;
      int i = 0;
      if (localhwt1 == localhwt2) {
        i = 1;
      }
      if (i == 0) {
        break label345;
      }
      localhwq = this.aw;
      localhwt3 = hwt.b;
      if (localhwt3 != null) {
        break label287;
      }
      throw new NullPointerException();
      label168:
      if (localStreamGridView.p.getVisibility() == 0) {
        new kqf(146).b(localStreamGridView.getContext());
      }
      localStreamGridView.p.setVisibility(8);
      break;
      label210:
      if (localSwipeRefreshLayoutWithUpScroll2.m != null)
      {
        if ((localSwipeRefreshLayoutWithUpScroll2.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll2.b)) {
          localSwipeRefreshLayoutWithUpScroll2.a(true);
        }
        if (!localSwipeRefreshLayoutWithUpScroll2.m.O_())
        {
          Runnable localRunnable1 = localSwipeRefreshLayoutWithUpScroll2.n;
          long l = localSwipeRefreshLayoutWithUpScroll2.o;
          efj.m().postDelayed(localRunnable1, l);
        }
      }
    }
    label287:
    localhwq.g = ((hwt)localhwt3);
    localhwq.a();
    lvz locallvz1 = this.ax;
    if (locallvz1.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll1 = locallvz1.a;
      if ((!localSwipeRefreshLayoutWithUpScroll1.b) && (localSwipeRefreshLayoutWithUpScroll1.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll1.a(true);
      }
    }
    label345:
    this.as.a();
  }
  
  public final boolean O_()
  {
    return Z_();
  }
  
  public final void P_()
  {
    if (O())
    {
      this.az.aJ = false;
      return;
    }
    this.N.findViewById(aaw.ky).setVisibility(8);
    this.ad = null;
  }
  
  public int R_()
  {
    return 93;
  }
  
  protected int V()
  {
    if (((tt)f()).e().a().f()) {
      return efj.y(this.bn);
    }
    return 0;
  }
  
  public void W()
  {
    c("refresh_func_start");
    this.al = false;
    R();
    lvz locallvz = this.ax;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    }
    a(true);
    c("refresh_func_end");
  }
  
  protected boolean X()
  {
    return (this.az == null) || (this.az.isEmpty());
  }
  
  protected void Y()
  {
    int i = efj.y(this.bn);
    if ((f() instanceof HomeActivity)) {
      i = efj.y(this.bn) + loj.a(this.bn).l;
    }
    this.ax.b = i;
  }
  
  public boolean Z()
  {
    return this.m.getBoolean("show_empty_stream", false);
  }
  
  public boolean Z_()
  {
    return (this.bj.a("fetch_newer")) || (this.bj.a("fetch_older"));
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = LayoutInflater.from(this.bn).inflate(efj.wv, paramViewGroup, false);
    Context localContext = localView1.getContext();
    bp localbp = f();
    ((ViewStub)localView1.findViewById(aaw.dc)).inflate();
    label246:
    hqr localhqr;
    label512:
    dfz localdfz3;
    if (b == 0)
    {
      if (efj.b(efj.K(localbp))) {
        b = 8;
      }
    }
    else
    {
      hfa localhfa = new hfa(localContext, loh.a);
      this.ay = ((StreamGridView)localView1.findViewById(aaw.dS));
      this.ay.setPadding(localhfa.f, 0, localhfa.f, 0);
      StreamGridView localStreamGridView = this.ay;
      localStreamGridView.a = new lpr(a(localhfa));
      localStreamGridView.b();
      localStreamGridView.c();
      this.ay.setLayoutParams(new ViewGroup.MarginLayoutParams(this.ay.getLayoutParams()));
      Y();
      if (!K()) {
        break label944;
      }
      View localView2 = localView1.findViewById(aaw.bH);
      this.aL = new cyh(localView2);
      efj.a(localView2, new gxq(pkd.h));
      cyh localcyh = this.aL;
      gxn localgxn = new gxn(this);
      localcyh.h.setOnClickListener(localgxn);
      int i = loj.a(localContext).ar;
      this.ap = ((StreamTooltipView)localView1.findViewById(aaw.fL));
      StreamTooltipView localStreamTooltipView1 = this.ap;
      localStreamTooltipView1.b = aau.lv;
      localStreamTooltipView1.requestLayout();
      localStreamTooltipView1.invalidate();
      StreamTooltipView localStreamTooltipView2 = this.ap;
      int j = aau.lu;
      localStreamTooltipView2.setContentDescription(g().getString(j));
      this.ap.a(0, 0, 0, i);
      this.aq = new lvn(this.ap, false);
      this.aQ = ((StreamTooltipView)localView1.findViewById(aaw.lU));
      StreamTooltipView localStreamTooltipView3 = this.aQ;
      localStreamTooltipView3.b = aau.eE;
      localStreamTooltipView3.requestLayout();
      localStreamTooltipView3.invalidate();
      StreamTooltipView localStreamTooltipView4 = this.aQ;
      int k = aau.eE;
      localStreamTooltipView4.setContentDescription(g().getString(k));
      this.aQ.a(i, 0, i, 0);
      this.aQ.a = Layout.Alignment.ALIGN_CENTER;
      this.aR = new lvn(this.aQ, true, 450L);
      this.az = a(this.bn, this.ay, localhfa, this.at.c(), this, this.bc, this.aL, this);
      dfz localdfz1 = this.az;
      if (!(f() instanceof HomeActivity)) {
        break label952;
      }
      localhqr = dfz.x();
      localdfz1.a(0, localhqr);
      this.az.aw = this;
      if ((paramBundle != null) && (paramBundle.containsKey("stream_hash_activity_ids")))
      {
        ArrayList localArrayList = paramBundle.getStringArrayList("stream_hash_activity_ids");
        int m = paramBundle.getInt("stream_restore_position", -1);
        this.az.az = localArrayList;
        dfz localdfz4 = this.az;
        if (Log.isLoggable("StreamAdapter", 4)) {
          new StringBuilder(36).append("setStreamRestorePosition ").append(m);
        }
        localdfz4.aA = m;
      }
      if (!this.bm) {
        this.az.aL = false;
      }
      this.ay.a(this.az);
      lvi locallvi = this.au;
      dfz localdfz2 = this.az;
      locallvi.a.add(localdfz2);
      this.au.a.add(this);
      this.aw.h = new cgf(this);
      J();
      af();
      lwr locallwr = (lwr)this.bo.b(lwr.class);
      if ((locallwr != null) && (locallwr.a()))
      {
        lwp locallwp = (lwp)this.bo.b(lwp.class);
        if (locallwp != null)
        {
          hn localhn = locallwp.a();
          this.az.aI = localhn;
        }
      }
      if (paramBundle != null)
      {
        String str = paramBundle.getString("popup_invisible_activity_id");
        if (!TextUtils.isEmpty(str)) {
          this.az.a(str, null);
        }
      }
      localdfz3 = this.az;
      if ((O()) || (this.bl != g().getConfiguration().orientation)) {
        break label958;
      }
    }
    label944:
    label952:
    label958:
    for (boolean bool = true;; bool = false)
    {
      localdfz3.aJ = bool;
      h().a(this);
      if ((localbp instanceof iww))
      {
        this.aG = ((iww)localbp);
        z();
      }
      cgr localcgr = P();
      if (localcgr != null) {
        a(localcgr);
      }
      if (O()) {
        localView1.findViewById(aaw.ky).setVisibility(0);
      }
      this.ab = this.at.c();
      this.Z.a(this.ab, true);
      return localView1;
      b = 6;
      break;
      this.aL = null;
      break label246;
      localhqr = null;
      break label512;
    }
  }
  
  public dfz a(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    return new dfz(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, paramcyh, paramlob);
  }
  
  public fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (Log.isLoggable("HostedStreamFrag", 4)) {
      new StringBuilder(56).append("HostedStreamFrag onCreateLoader for loaderId=").append(paramInt);
    }
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return new bxq(this.bn, this.at.c(), 0, a);
    }
    String str1;
    boolean bool1;
    if (paramInt == 2)
    {
      str1 = "1";
      bool1 = false;
      if (paramInt != 2)
      {
        String str2 = this.aD;
        bool1 = false;
        if (str2 == null)
        {
          boolean bool2 = aa();
          bool1 = false;
          if (!bool2)
          {
            boolean bool3 = I();
            bool1 = false;
            if (!bool3) {
              bool1 = true;
            }
          }
        }
      }
      if (paramInt != 2) {
        break label204;
      }
    }
    label204:
    for (String[] arrayOfString = cgh.a;; arrayOfString = lnc.a)
    {
      return new lmz(this.bn, this.at.c(), arrayOfString, this.aH, bool1, str1);
      if (Z())
      {
        str1 = "0";
        break;
      }
      str1 = null;
      break;
    }
  }
  
  protected gzf a(String paramString, byte[] paramArrayOfByte)
  {
    String[] arrayOfString1 = this.m.getStringArray("pinned_activity_ids");
    mbf localmbf = this.bn;
    int i = this.at.c();
    int j = this.aF.d;
    String str1 = this.aF.c;
    String str2 = this.aD;
    if (this.az != null) {}
    for (String[] arrayOfString2 = this.az.u();; arrayOfString2 = null) {
      return bnd.a(localmbf, i, j, str1, str2, null, paramString, paramArrayOfByte, arrayOfString2, arrayOfString1, false, false, this.aC, null);
    }
  }
  
  protected lpr a(hfa paramhfa)
  {
    lpr locallpr = new lpr();
    locallpr.a = paramhfa.a;
    locallpr.c = paramhfa.d;
    locallpr.d = (paramhfa.c / 10);
    return locallpr;
  }
  
  public final void a(int paramInt)
  {
    if ((this.aN) || (this.aM) || (this.aJ) || (this.ay == null)) {}
    while (paramInt < this.az.getCount() - b) {
      return;
    }
    M();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      if (paramInt1 != 0)
      {
        if (this.bh) {
          return;
        }
        this.bh = true;
        gyx localgyx = (gyx)this.bo.b(gyx.class);
        if ((localgyx != null) && (localgyx.e()))
        {
          new kqf(116).b(this.bn);
          localgyx.d();
        }
        if (H())
        {
          kat localkat = (kat)this.bo.b(kat.class);
          if (localkat != null) {
            localkat.a(localkat.a(1, 2));
          }
        }
      }
      W();
    }
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (((iiq)mbb.a(this.bn, iiq.class)).a(paramInt1, paramInt2)) {}
    Bundle localBundle1;
    String str1;
    String str2;
    do
    {
      do
      {
        do
        {
          cgr localcgr;
          do
          {
            return;
            switch (paramInt1)
            {
            default: 
              localcgr = P();
            }
          } while (localcgr == null);
          localcgr.a(paramInt1, paramInt2, paramIntent);
          return;
        } while (paramInt2 != 1);
        bxg.a(this.bn);
        return;
        if (paramInt2 == -1)
        {
          Bundle localBundle2 = paramIntent.getExtras();
          ArrayList localArrayList1 = localBundle2.getStringArrayList("original_circle_ids");
          ArrayList localArrayList2 = localBundle2.getStringArrayList("selected_circle_ids");
          String str3 = localBundle2.getString("activity_id");
          String str4 = localBundle2.getString("person_id");
          int i = localBundle2.getInt("promo_type", -1);
          a(localArrayList1, localArrayList2, str4, localBundle2.getString("display_name"), str3, localBundle2.getString("suggestion_id"), i, false, false);
          return;
        }
      } while (paramIntent == null);
      localBundle1 = paramIntent.getExtras();
      str1 = localBundle1.getString("activity_id");
      str2 = localBundle1.getString("person_id");
    } while (localBundle1.getStringArrayList("original_circle_ids").isEmpty());
    a(str1, str2);
  }
  
  public void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  final void a(Context paramContext)
  {
    Bundle localBundle = gxy.a("extra_gaia_id", this.aE);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(paramContext, this.at.c());
    localgxw.c = gxz.A;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
  }
  
  public void a(Bundle paramBundle)
  {
    boolean bool;
    if (!efj.B(this.bn))
    {
      bool = true;
      this.bm = bool;
      super.a(paramBundle);
      this.c = new cpl(this.bn);
      gyx localgyx = (gyx)this.bo.b(gyx.class);
      if ((localgyx != null) && (localgyx.e())) {
        new kqf(121).b(this.bn);
      }
      gzj localgzj = am();
      hak localhak = new hak(this.bn, this.x);
      localhak.a(this, null, true);
      localgzj.a(localhak);
      localgzj.a.add(this);
      this.bc = new cgn(this);
      if (paramBundle == null) {
        break label456;
      }
      this.am = paramBundle.getBoolean("is_fetching_stream");
      this.an = paramBundle.getBoolean("fetching_newer_stream");
      this.aU = paramBundle.getInt("scroll_pos");
      this.aV = paramBundle.getInt("scroll_off");
      this.aW = paramBundle.getInt("current_position");
      this.aT = paramBundle.getLong("last_deactivation");
      this.aJ = paramBundle.getBoolean("error");
      this.ag = paramBundle.getBoolean("error_recoverable");
      this.aK = paramBundle.getBoolean("reset_animation", false);
      this.aj = paramBundle.getLong("stream_change");
      this.ak = paramBundle.getLong("notifications_change");
      this.al = paramBundle.getBoolean("stream_change_flag");
      if (paramBundle.containsKey("orientation")) {
        this.bl = paramBundle.getInt("orientation");
      }
      this.aX = paramBundle.getBoolean("subscribe_visible", false);
      this.aY = paramBundle.getInt("subscribe_text");
      this.aZ = paramBundle.getInt("subscribe_icon");
      this.ao = paramBundle.getInt("stream_next_sequenced_loader_id", 2);
      this.ba = hvj.a(this.bn, (gxx)this.bo.a(gxx.class), paramBundle);
      if (paramBundle.containsKey("circle_info")) {
        this.aF = ((cyf)paramBundle.getParcelable("circle_info"));
      }
      this.aI = paramBundle.getBoolean("first_load", true);
    }
    for (;;)
    {
      M_();
      if (G()) {
        k().a(1, null, this);
      }
      this.d = new idy(f(), this.bp, D());
      return;
      bool = false;
      break;
      label456:
      this.am = false;
      this.aU = 0;
      this.aV = 0;
      this.bo.b(lwr.class);
      this.bl = g().getConfiguration().orientation;
    }
  }
  
  public void a(Bundle paramBundle, String paramString)
  {
    if (("first_circle_add".equals(paramString)) || ("first_circle_add_one_click".equals(paramString))) {
      a(paramBundle.getString("person_id"), paramBundle.getString("person_name"), paramBundle.getBoolean("for_sharing"), paramBundle.getString("circle_id"), paramBundle.getString("circle_name"), paramBundle.getString("suggestion_id"), paramBundle.getString("activity_id"), paramBundle.getInt("promo_type", -1));
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    this.aq.a(paramView, paramInt);
    this.aR.a(paramView, paramInt);
    dfz localdfz;
    if (paramInt != 0)
    {
      localdfz = this.az;
      if (O()) {
        break label44;
      }
    }
    label44:
    for (boolean bool = true;; bool = false)
    {
      localdfz.aJ = bool;
      return;
    }
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.bm)
    {
      this.aq.a(paramView, paramInt1, paramInt2, paramInt3);
      this.aR.a(paramView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  protected final void a(cyf paramcyf)
  {
    if (!G()) {
      return;
    }
    Object localObject;
    String str1;
    label43:
    gya localgya1;
    if (this.aF == null)
    {
      localObject = null;
      boolean bool = "v.all.circles".equals(paramcyf.c);
      idy localidy = this.d;
      if (!bool) {
        break label295;
      }
      str1 = "android_default_gmh";
      localidy.a = str1;
      if (this.at.e())
      {
        if (("v.all.circles".equals(localObject)) || (localObject == null)) {
          break label303;
        }
        localgya1 = a((String)localObject);
        label82:
        gya localgya2 = a(paramcyf.a);
        gxx localgxx = (gxx)this.bo.a(gxx.class);
        gxw localgxw = new gxw(this.bn);
        localgxw.d = localgya1;
        localgxw.e = localgya2;
        localgxx.a(localgxw);
      }
      this.aF = paramcyf;
      ag();
      String str2 = this.aF.a;
      this.aB = null;
      this.af = null;
      this.aC = 0L;
      M_();
      if (TextUtils.equals((CharSequence)localObject, str2)) {
        break label311;
      }
      this.aI = true;
      this.am = false;
      this.aK = true;
      this.al = false;
      this.aU = 0;
      this.aV = 0;
      W();
      z();
    }
    for (;;)
    {
      R();
      if (this.aL != null) {
        this.aL.c();
      }
      this.ao = 2;
      k().b(2, null, this);
      ((tt)f()).e().a().a(this.aF.b);
      return;
      localObject = this.aF.a;
      break;
      label295:
      str1 = "android_circles_gmh";
      break label43;
      label303:
      localgya1 = gya.a;
      break label82;
      label311:
      if (this.aI) {
        W();
      }
    }
  }
  
  public void a(fu<Cursor> paramfu) {}
  
  public void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    int i = paramfu.i;
    if (Log.isLoggable("HostedStreamFrag", 4)) {
      new StringBuilder(56).append("HostedStreamFrag onLoadFinished for loaderId=").append(i);
    }
    switch (i)
    {
    }
    do
    {
      do
      {
        return;
        c("onloadfinished_circles");
        b(paramCursor);
        this.aO = paramCursor;
        return;
        c("onloadfinished_ct");
      } while (this.ao < i);
      if ((paramCursor != null) && (!paramCursor.isClosed()) && (paramCursor.moveToFirst()))
      {
        this.aB = paramCursor.getString(0);
        this.af = paramCursor.getBlob(1);
      }
      for (this.aC = paramCursor.getLong(2);; this.aC = 0L)
      {
        this.ao = 3;
        k().b(3, null, this);
        return;
        this.aB = null;
        this.af = null;
      }
      c("onloadfinished_posts");
    } while (this.ao < i);
    gyx localgyx1 = (gyx)this.bo.b(gyx.class);
    if ((localgyx1 != null) && (localgyx1.e())) {
      new kqf(122).b(this.bn);
    }
    int j = this.az.getCount();
    if ((this.al) && (this.ai) && (paramCursor.moveToFirst()))
    {
      String str2 = paramCursor.getString(39);
      if ((this.az.az.isEmpty()) || (!((String)this.az.az.get(0)).equals(str2)))
      {
        this.al = false;
        R();
      }
    }
    this.az.b(w());
    this.az.b(paramCursor, this.aA);
    if ((this.s) && (!N())) {
      this.aA = -1;
    }
    this.ai = true;
    ac();
    ae();
    StreamGridView localStreamGridView = this.ay;
    localStreamGridView.c = this.au;
    localStreamGridView.a(0);
    int k = paramCursor.getCount();
    this.aM = false;
    int n;
    if ((this.aJ) && (k == 0))
    {
      if (!L_()) {
        break label1038;
      }
      hwq localhwq4 = this.aw;
      int i2 = aau.eD;
      localhwq4.d = null;
      localhwq4.c = i2;
      localhwq4.e();
      hwq localhwq5 = this.aw;
      hwt localhwt3 = hwt.c;
      if (localhwt3 == null) {
        throw new NullPointerException();
      }
      localhwq5.g = ((hwt)localhwt3);
      localhwq5.a();
      n = 0;
    }
    for (;;)
    {
      this.aN = false;
      this.aI = false;
      if (Log.isLoggable("HostedStreamFrag", 4))
      {
        boolean bool2 = this.aM;
        new StringBuilder(35).append("onLoadFinished - mEndOfStream=").append(bool2);
      }
      a(j, k);
      boolean bool1;
      label622:
      hwq localhwq2;
      hwt localhwt1;
      if (!this.am)
      {
        if (this.ah) {
          E();
        }
        cpl localcpl2 = this.c;
        String str1 = this.at.f().b("account_name");
        if (!this.bh)
        {
          bool1 = true;
          localcpl2.f = bool1;
          gyx localgyx2 = (gyx)mbb.b(localcpl2.a, gyx.class);
          if (localgyx2 != null) {
            localgyx2.a(str1, bool1);
          }
          if (n == 0) {
            break label918;
          }
          hwq localhwq1 = this.aw;
          int i1 = aau.lJ;
          localhwq1.d = null;
          localhwq1.c = i1;
          localhwq1.e();
          localhwq2 = this.aw;
          localhwt1 = hwt.c;
          if (localhwt1 != null) {
            break label903;
          }
          throw new NullPointerException();
          View localView = this.N;
          if (a(paramCursor))
          {
            if (localView != null)
            {
              hwq localhwq3 = this.aw;
              hwt localhwt2 = hwt.b;
              if (localhwt2 == null) {
                throw new NullPointerException();
              }
              localhwq3.g = ((hwt)localhwt2);
              localhwq3.a();
            }
            paramCursor.moveToLast();
            if (paramCursor.getInt(21) == 1) {}
            for (boolean bool3 = true;; bool3 = false)
            {
              this.aM = bool3;
              if (!this.aN) {
                N_();
              }
              if ((!this.aI) || (!this.m.containsKey("pinned_activity_ids"))) {
                break label1038;
              }
              a(true);
              n = 0;
              break;
            }
          }
          if (this.aI)
          {
            a(true);
            n = 0;
            continue;
          }
          if ((localView == null) || (!L_())) {
            break label1032;
          }
        }
      }
      label903:
      label1032:
      for (int m = 1;; m = 0)
      {
        N_();
        n = m;
        break;
        bool1 = false;
        break label622;
        localhwq2.g = ((hwt)localhwt1);
        localhwq2.a();
        label918:
        this.ah = false;
        cpl localcpl1 = this.c;
        if (localcpl1.c)
        {
          new kqf(74).b(localcpl1.a);
          localcpl1.c = false;
        }
        if (localcpl1.d)
        {
          new kqf(78).b(localcpl1.a);
          localcpl1.d = false;
        }
        this.bk.a(this.at.c(), new String[] { "pull_refresh", "TooltipStreamRefresh", "MenuStreamRefresh" });
        return;
      }
      label1038:
      n = 0;
    }
  }
  
  public void a(gpr paramgpr)
  {
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
  }
  
  public void a(String paramString, hae paramhae, haa paramhaa)
  {
    boolean bool1 = true;
    int i = this.at.c();
    if ("fetch_newer".equals(paramString)) {
      a(paramhae, bool1);
    }
    for (;;)
    {
      return;
      if ("fetch_older".equals(paramString))
      {
        a(paramhae, false);
        return;
      }
      if ("prefetch_newposts".equals(paramString))
      {
        if ((!lmw.a.b) && (paramhae != null))
        {
          if (paramhae.b != 200) {}
          for (boolean bool2 = bool1;; bool2 = false)
          {
            this.aJ = bool2;
            if (Log.isLoggable("HostedStreamFrag", 3))
            {
              boolean bool3 = this.aJ;
              new StringBuilder(35).append("handleCheckIfChanged - mError=").append(bool3);
              if (this.aJ) {
                paramhae.toString();
              }
            }
            if (this.aJ) {
              break;
            }
            Bundle localBundle = paramhae.a();
            this.aj = System.currentTimeMillis();
            this.al = localBundle.getBoolean("is_changed", false);
            if (this.al)
            {
              cpl localcpl = this.c;
              int j = this.at.c();
              lta locallta = this.bk;
              if (localcpl.e != 0L)
              {
                new kpz(6, localcpl.e).b(localcpl.a);
                localcpl.e = 0L;
                String[] arrayOfString = new String[bool1];
                arrayOfString[0] = "NewContentTooltipAfterResume";
                locallta.a(j, arrayOfString);
              }
              if ((localcpl.f) && (!localcpl.b))
              {
                gyx localgyx = (gyx)mbb.b(localcpl.a, gyx.class);
                if (localgyx != null)
                {
                  long l2 = localgyx.f();
                  if (l2 > 0L)
                  {
                    kpz localkpz = new kpz(27, l2);
                    localkpz.a();
                    localkpz.b(localcpl.a);
                  }
                  localcpl.b = bool1;
                }
              }
            }
            R();
            return;
          }
        }
      }
      else
      {
        if ("EditModerationStateTask".equals(paramString))
        {
          a(paramhae);
          return;
        }
        if ("PromoModifyCircleMembershipsTask".equals(paramString))
        {
          b(paramhae);
          if (this.ba != null)
          {
            if (!hae.a(paramhae)) {
              this.ba.a(i);
            }
            this.ba = null;
          }
        }
        else
        {
          if ("ModifyCircleMembershipsTask".equals(paramString))
          {
            if (this.ba != null)
            {
              if (!hae.a(paramhae)) {
                this.ba.a(i);
              }
              this.ba = null;
            }
            N_();
            return;
          }
          if ("GetRedirectUrlTask".equals(paramString))
          {
            if (this.bi != null) {
              this.bi.a(paramhae);
            }
          }
          else if ((dmr.a(paramString)) && (paramhae != null))
          {
            if (paramhae.b != 200) {}
            while (!bool1)
            {
              long l1 = System.currentTimeMillis();
              dmr.a.put(i, Long.valueOf(l1));
              return;
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public final void a(String paramString1, String paramString2, int paramInt)
  {
    String str = jjf.a(paramString1);
    kpn localkpn = this.be;
    this.at.c();
    if ((localkpn.a()) && (!l(paramString1)) && (paramInt == 2))
    {
      kpm localkpm = new kpm(this.bn);
      localkpm.a = str;
      localkpm.c = Integer.valueOf(f().getResources().getColor(efj.jh));
      localkpm.b = true;
      Intent localIntent = localkpm.a();
      if (localIntent != null)
      {
        a(this.bn);
        a(localIntent, 0);
        b(str, paramString2, paramInt);
        return;
      }
    }
    ((hdf)this.bo.a(hdf.class)).a(paramString1);
    b(str, paramString2, paramInt);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    int i = 1;
    int j = this.at.c();
    int k;
    int m;
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 7: 
    default: 
      return;
    case 2: 
      k = 93;
      m = i;
      i = 0;
      if (m != 0)
      {
        mbf localmbf2 = this.bn;
        Intent localIntent2 = EsService.e.a(localmbf2, EsService.class);
        localIntent2.putExtra("op", 720);
        localIntent2.putExtra("account_id", j);
        localIntent2.putExtra("person_id", paramString1);
        localIntent2.putExtra("suggestion_id", paramString2);
        localIntent2.putExtra("aid", paramString3);
        Integer.valueOf(EsService.a(localmbf2, localIntent2));
        if (this.az != null) {
          this.az.a(paramString1, paramString2, k);
        }
      }
      break;
    }
    for (;;)
    {
      a(paramString3, paramString1, false);
      return;
      k = 50;
      m = i;
      i = 0;
      break;
      k = 232;
      m = i;
      i = 0;
      break;
      k = 90;
      m = i;
      i = 0;
      break;
      i = 0;
      m = 0;
      k = 0;
      break;
      k = 110;
      m = 0;
      break;
      if (i != 0)
      {
        mbf localmbf1 = this.bn;
        Intent localIntent1 = EsService.e.a(localmbf1, EsService.class);
        localIntent1.putExtra("op", 721);
        localIntent1.putExtra("account_id", j);
        localIntent1.putExtra("square_id", paramString1);
        localIntent1.putExtra("suggestion_id", paramString2);
        localIntent1.putExtra("aid", paramString3);
        Integer.valueOf(EsService.a(localmbf1, localIntent1));
        if (this.az != null) {
          this.az.a(jjf.a(paramString1), paramString2, k);
        }
      }
    }
  }
  
  final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    ArrayList localArrayList;
    if (this.az != null)
    {
      dfz localdfz = this.az;
      if (!localdfz.aD.containsKey(paramString1)) {
        break label154;
      }
      localArrayList = (ArrayList)localdfz.aD.get(paramString1);
      localArrayList.add(paramString2);
      localdfz.aD.put(paramString1, localArrayList);
      if ((localArrayList == null) || (this.ay == null)) {}
    }
    for (int i = -1 + this.ay.getChildCount();; i--)
    {
      lol locallol;
      if (i >= 0)
      {
        View localView = this.ay.getChildAt(i);
        if ((!(localView instanceof lor)) || (!TextUtils.equals(paramString1, ((loa)localView).N))) {
          continue;
        }
        locallol = ((lor)localView).j();
        if (paramBoolean)
        {
          this.az.a(paramString2, null);
          locallol.a(paramString2, localArrayList);
        }
      }
      else
      {
        return;
        label154:
        localArrayList = new ArrayList();
        break;
      }
      locallol.a(localArrayList);
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, String paramString4, int paramInt, boolean paramBoolean2)
  {
    if (((this.aP) && (paramBoolean2)) || (!paramBoolean1)) {}
    for (int i = 1;; i = 0)
    {
      String str1 = null;
      String str2 = null;
      if (i != 0)
      {
        str1 = brn.a(this.bn, this.aO, paramBoolean1);
        str2 = brn.a(this.bn, paramBoolean1);
      }
      a(paramString1, paramString2, paramBoolean1, str1, str2, paramString3, paramString4, paramInt);
      return;
    }
  }
  
  public final void a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1 = brn.a(this.bn, this.aO, true);
    int i = 0;
    int j = this.at.c();
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator1 = paramArrayList2.iterator();
    while (localIterator1.hasNext())
    {
      String str6 = (String)localIterator1.next();
      if (!paramArrayList1.contains(str6)) {
        localArrayList1.add(str6);
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator2 = paramArrayList1.iterator();
    while (localIterator2.hasNext())
    {
      String str5 = (String)localIterator2.next();
      if (str5.equals(str1)) {
        i = 1;
      }
      if (!paramArrayList2.contains(str5)) {
        localArrayList2.add(str5);
      }
    }
    hgh localhgh = b(paramInt, 1);
    int k;
    gzj localgzj;
    int m;
    label223:
    boolean bool1;
    label237:
    boolean bool2;
    label251:
    bnp localbnp;
    String str2;
    label364:
    int n;
    label422:
    int i1;
    label516:
    int i2;
    label533:
    String str3;
    label570:
    int i3;
    label588:
    eab localeab;
    int i4;
    if ((this.aP) && (i != 0) && (!paramArrayList2.isEmpty()))
    {
      k = 1;
      localgzj = am();
      if ((paramString3 != null) && (paramInt != -2) && (paramInt != -3)) {
        break label804;
      }
      if (paramInt != -3) {
        break label729;
      }
      m = 216;
      if ((paramArrayList1 != null) && (!paramArrayList1.isEmpty())) {
        break label738;
      }
      bool1 = true;
      if ((paramArrayList2 != null) && (!paramArrayList2.isEmpty())) {
        break label744;
      }
      bool2 = true;
      localbnp = new bnp(this.bn);
      localbnp.a = j;
      localbnp.b = paramString1;
      localbnp.c = paramString2;
      localbnp.d = m;
      localbnp.e = localArrayList1;
      localbnp.f = localArrayList2;
      localbnp.g = bool1;
      localbnp.h = bool2;
      localbnp.i = false;
      str2 = brn.a(this.bn, true);
      if (paramBoolean1)
      {
        if (!paramBoolean2) {
          break label750;
        }
        int i7 = aau.mk;
        localbnp.j = g().getString(i7);
      }
      if (k != 0) {
        localbnp.k = this.bn.getString(aau.mj, new Object[] { str2 });
      }
      bno localbno = localbnp.a();
      localgzj.d.a(localbno, false);
      localgzj.b(localbno);
      n = m;
      this.ba = new hvj(this.bn, (gxx)this.bo.a(gxx.class), paramString1, localArrayList1, localArrayList2, localhgh);
      if ((!localArrayList1.isEmpty()) && (paramArrayList1.isEmpty())) {
        this.bb.a(this.bn, j, paramString1, paramString4, 18, n);
      }
      if (paramString3 == null) {
        break label1128;
      }
      if ((!paramArrayList1.isEmpty()) || (paramArrayList2.isEmpty())) {
        break label1033;
      }
      i1 = 1;
      if ((paramArrayList1.isEmpty()) || (!paramArrayList2.isEmpty())) {
        break label1039;
      }
      i2 = 1;
      str3 = jjf.c(paramString1);
      if (i1 == 0) {
        break label1045;
      }
      this.az.aC.add(str3);
      EsService.a(this.bn, j, str3, false);
      if (this.ay == null) {
        break label1128;
      }
      i3 = -1 + this.ay.getChildCount();
      if (i3 < 0) {
        break label1128;
      }
      Object localObject = this.ay.getChildAt(i3);
      if ((localObject instanceof lpk)) {
        localObject = ((lpk)localObject).f;
      }
      if ((localObject instanceof eab))
      {
        localeab = (eab)localObject;
        if (TextUtils.equals(localeab.f, str3))
        {
          if ((localeab.y == null) || (localeab.y.e == null)) {
            break label1079;
          }
          i4 = 1;
          label672:
          if (i1 == 0) {
            break label1085;
          }
          localeab.p = false;
          if (i4 != 0) {
            localgzj.b(new bnq(this.bn, j, localeab.U, true));
          }
        }
      }
    }
    for (;;)
    {
      localeab.k();
      i3--;
      break label588;
      k = 0;
      break;
      label729:
      m = R_();
      break label223;
      label738:
      bool1 = false;
      break label237;
      label744:
      bool2 = false;
      break label251;
      label750:
      int i5 = aau.mh;
      Object[] arrayOfObject1 = { str2 };
      localbnp.j = g().getString(i5, arrayOfObject1);
      int i6 = aau.mi;
      localbnp.k = g().getString(i6);
      break label364;
      label804:
      int i8 = R_();
      bnw localbnw = new bnw(this.bn);
      localbnw.a = j;
      localbnw.b = paramString1;
      localbnw.c = paramString2;
      localbnw.f = i8;
      localbnw.d = paramString3;
      localbnw.e = paramString4;
      localbnw.g = localArrayList1;
      localbnw.h = localArrayList2;
      localbnw.i = paramArrayList1;
      localbnw.j = paramArrayList2;
      localbnw.k = false;
      String str4 = brn.a(this.bn, true);
      if (paramBoolean1)
      {
        str4 = brn.a(this.bn, true);
        int i9 = aau.mh;
        Object[] arrayOfObject2 = { str4 };
        localbnw.l = g().getString(i9, arrayOfObject2);
        int i10 = aau.mi;
        localbnw.m = g().getString(i10);
      }
      if (k != 0) {
        localbnw.m = this.bn.getString(aau.mj, new Object[] { str4 });
      }
      bnv localbnv = localbnw.a();
      localgzj.d.a(localbnv, false);
      localgzj.b(localbnv);
      n = i8;
      break label422;
      label1033:
      i1 = 0;
      break label516;
      label1039:
      i2 = 0;
      break label533;
      label1045:
      if (i2 == 0) {
        break label570;
      }
      this.az.aC.remove(str3);
      EsService.a(this.bn, j, str3, true);
      break label570;
      label1079:
      i4 = 0;
      break label672;
      label1085:
      if (i2 != 0)
      {
        localeab.p = true;
        if (i4 != 0) {
          localgzj.b(new bnq(this.bn, j, localeab.U, false));
        }
      }
    }
    label1128:
    ad();
  }
  
  public final void a(lnw paramlnw, String paramString)
  {
    int i = this.at.c();
    paramlnw.f = true;
    bnx localbnx = new bnx(this.bn, i, paramString, paramlnw);
    gzj localgzj = am();
    localgzj.b(localbnx);
    localgzj.b(new bnu(this.bn, i, paramlnw.a, 1));
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.an;
    int j = paramlnw.a;
    localgxw.h.putInt("user_survey_id", j);
    localgxw.h.putInt("user_survey_action_id", 1);
    localgxx.a(localgxw);
  }
  
  public final void a(lnw paramlnw, String paramString, int paramInt, boolean paramBoolean)
  {
    int i = this.at.c();
    bnx localbnx = new bnx(this.bn, i, paramString, paramlnw);
    gzj localgzj = am();
    localgzj.b(localbnx);
    if (paramBoolean)
    {
      localgzj.b(new bnu(this.bn, i, paramlnw.a, paramInt));
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = gxz.ao;
      int j = paramlnw.a;
      localgxw.h.putInt("user_survey_id", j);
      localgxw.h.putInt("user_survey_action_id", paramInt);
      localgxx.a(localgxw);
    }
  }
  
  public void a(tp paramtp)
  {
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(paramtp, bool);
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.aF.a == null)
    {
      if (Log.isLoggable("HostedStreamFrag", 4))
      {
        bool = L_();
        new StringBuilder(44).append("fetchContent: No circles... reloading: ").append(bool);
      }
      if (L_())
      {
        localhwq = this.aw;
        i = aau.jn;
        localhwq.f = null;
        localhwq.e = i;
        localhwq.e();
      }
      N_();
    }
    while ((Z()) || ((!paramBoolean) && (this.aM)))
    {
      boolean bool;
      hwq localhwq;
      int i;
      return;
    }
    i(paramBoolean);
  }
  
  protected boolean a(Cursor paramCursor)
  {
    return (paramCursor != null) && (paramCursor.getCount() > 0);
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.iq)
    {
      this.c.a();
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.ak;
      localgxx.a(localgxw);
      this.bk.a(this.at.c(), "MenuStreamRefresh", 3L, 1L);
      W();
      return true;
    }
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, int paramInt)
  {
    if (this.aP)
    {
      a(paramString1, paramString2, paramBoolean, null, null, paramString3, paramString4, paramInt);
      return true;
    }
    return false;
  }
  
  public boolean aa()
  {
    return false;
  }
  
  public final String[] ab()
  {
    if (this.az != null)
    {
      dfz localdfz = this.az;
      if (localdfz.az.size() <= 0) {}
      ArrayList localArrayList;
      for (Object localObject = null; (localObject == null) || (localObject.size() <= 0); localObject = localArrayList)
      {
        return null;
        localArrayList = new ArrayList();
        for (int i = 0; (i < localdfz.az.size()) && (localArrayList.size() < 100); i++) {
          if (!efj.w((String)localdfz.az.get(i))) {
            localArrayList.add(localdfz.az.get(i));
          }
        }
      }
      return (String[])localObject.toArray(new String[localObject.size()]);
    }
    return null;
  }
  
  protected final void ac()
  {
    if (this.aK)
    {
      this.az.I_();
      this.aK = false;
    }
  }
  
  protected void ac_()
  {
    if ((!this.al) && (System.currentTimeMillis() - this.aj > 30000L) && (!am().a("fetch_newer")) && (!am().a("prefetch_newposts")) && (this.aD == null)) {
      E();
    }
    long l;
    do
    {
      do
      {
        return;
      } while (!this.al);
      l = lmw.a.b();
    } while ((l == 0L) || (System.currentTimeMillis() - l <= 7200000L));
    E();
  }
  
  public final void ad()
  {
    if (this.ay == null) {
      return;
    }
    this.aU = this.ay.g;
    this.aV = Q();
    StreamGridView localStreamGridView = this.ay;
    Object localObject1 = null;
    int i = 0;
    int j = 2147483647;
    Object localObject2;
    if (i < localStreamGridView.getChildCount())
    {
      localObject2 = localStreamGridView.getChildAt(i);
      if ((localObject2 == null) || (Math.abs(((View)localObject2).getTop() - localStreamGridView.m) >= j)) {
        break label142;
      }
      j = Math.abs(((View)localObject2).getTop());
    }
    for (;;)
    {
      i++;
      localObject1 = localObject2;
      break;
      lpt locallpt;
      if (localObject1 != null)
      {
        locallpt = (lpt)localObject1.getLayoutParams();
        if (locallpt == null) {}
      }
      for (localStreamGridView.h = locallpt.b;; localStreamGridView.h = -1)
      {
        this.aW = localStreamGridView.h;
        return;
      }
      label142:
      localObject2 = localObject1;
    }
  }
  
  protected final void ae()
  {
    if ((this.ay == null) || (this.az == null)) {
      return;
    }
    StreamGridView localStreamGridView;
    int j;
    int n;
    if ((this.aU >= this.az.getCount()) || (this.aV == Q()))
    {
      this.aU = 0;
      this.aV = 0;
      int i = g().getConfiguration().orientation;
      if (this.bl != i)
      {
        this.bl = i;
        this.ay.h = this.aW;
        this.ay.m = V();
        localStreamGridView = this.ay;
        localStreamGridView.a();
        if (localStreamGridView.h == -1)
        {
          if (localStreamGridView.b.getCount() <= 2) {
            localStreamGridView.h = 0;
          }
        }
        else if (localStreamGridView.getChildCount() != 0)
        {
          j = -localStreamGridView.l + localStreamGridView.m;
          int k = localStreamGridView.h;
          int m = localStreamGridView.a.a;
          n = 0;
          if (k > m) {
            break label233;
          }
        }
      }
    }
    for (;;)
    {
      localStreamGridView.a(localStreamGridView.h, n);
      return;
      if ((this.aV == 0) && (this.aU == 0)) {
        break;
      }
      this.ay.a(this.aU, this.aV);
      this.aU = 0;
      this.aV = 0;
      break;
      label233:
      n = j;
    }
  }
  
  public void af()
  {
    if (this.aQ == null) {
      return;
    }
    if (this.aJ)
    {
      if (this.ag)
      {
        StreamTooltipView localStreamTooltipView4 = this.aQ;
        localStreamTooltipView4.b = aau.eG;
        localStreamTooltipView4.requestLayout();
        localStreamTooltipView4.invalidate();
        StreamTooltipView localStreamTooltipView5 = this.aQ;
        int j = aau.eH;
        localStreamTooltipView5.setContentDescription(g().getString(j));
      }
      for (;;)
      {
        this.aR.a();
        StreamTooltipView localStreamTooltipView3 = this.aQ;
        String str = this.aQ.getContentDescription().toString();
        if (Build.VERSION.SDK_INT >= 16) {
          localStreamTooltipView3.announceForAccessibility(str);
        }
        this.aQ.setOnClickListener(this);
        return;
        StreamTooltipView localStreamTooltipView1 = this.aQ;
        localStreamTooltipView1.b = aau.eE;
        localStreamTooltipView1.requestLayout();
        localStreamTooltipView1.invalidate();
        StreamTooltipView localStreamTooltipView2 = this.aQ;
        int i = aau.eF;
        localStreamTooltipView2.setContentDescription(g().getString(i));
      }
    }
    lvn locallvn = this.aR;
    locallvn.f = true;
    locallvn.b();
    this.aR.b();
    this.aQ.setOnClickListener(null);
  }
  
  final void ag()
  {
    if (this.N != null)
    {
      hwq localhwq = this.aw;
      int i = aau.jn;
      localhwq.d = null;
      localhwq.c = i;
      localhwq.e();
    }
  }
  
  protected final void ah()
  {
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  public final void ai()
  {
    if (!this.av.a())
    {
      this.bn.startActivity(this.av.b());
      return;
    }
    Intent localIntent = ((hpo)this.bo.a(hpo.class)).b(this.at.c());
    this.bn.startActivity(localIntent);
  }
  
  public final void aj()
  {
    Intent localIntent = ((hpo)this.bo.a(hpo.class)).c(this.at.c());
    this.bn.startActivity(localIntent);
  }
  
  public final void ak()
  {
    if (!this.av.a())
    {
      this.bn.startActivity(this.av.b());
      return;
    }
    int i = this.at.c();
    a(this.aa.a(i));
  }
  
  public final void al()
  {
    int i = this.at.c();
    Intent localIntent = efj.f(this.bn, i);
    Bundle localBundle = b(113);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.aQ;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    a(localIntent);
  }
  
  public final gzj am()
  {
    if (this.bj == null) {
      this.bj = ((gzj)this.bo.a(gzj.class));
    }
    return this.bj;
  }
  
  protected hgh b(int paramInt1, int paramInt2)
  {
    return hvj.a(paramInt1, R_(), Integer.valueOf(paramInt2));
  }
  
  public void b(Intent paramIntent)
  {
    if (!this.av.a())
    {
      this.bn.startActivity(this.av.b());
      return;
    }
    this.aj = 0L;
    this.al = false;
    View localView1 = this.N;
    View localView2;
    if (localView1 != null) {
      localView2 = localView1.findViewById(aaw.bH);
    }
    while (Build.VERSION.SDK_INT >= 16) {
      if (localView2 != null)
      {
        Bundle localBundle = az.a(localView2, 0, 0, localView2.getWidth(), localView2.getHeight()).a();
        this.bn.startActivity(paramIntent, localBundle);
        return;
        localView2 = null;
      }
      else
      {
        this.bn.startActivity(paramIntent);
        return;
      }
    }
    this.bn.startActivity(paramIntent);
  }
  
  public void b(Bundle paramBundle)
  {
    if (this.aF.c != null) {
      paramBundle.putString("extra_circle_id", this.aF.c);
    }
  }
  
  public void b(Bundle paramBundle, String paramString) {}
  
  final void b(View paramView)
  {
    this.aA = -1;
    if (this.ay != null) {}
    for (int i = -1 + this.ay.getChildCount();; i--) {
      if (i >= 0)
      {
        View localView = this.ay.getChildAt(i);
        if (((localView instanceof lpk)) && (((lpk)localView).f == paramView)) {
          this.aA = (i + this.ay.g);
        }
      }
      else
      {
        return;
      }
    }
  }
  
  public void b(tp paramtp) {}
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.at = ((git)this.bo.a(git.class));
    lvj locallvj = (lvj)this.bo.b(lvj.class);
    if ((locallvj != null) && (this.bm))
    {
      lvi locallvi = this.au;
      lvh locallvh = locallvj.b;
      locallvi.a.add(locallvh);
    }
    ill localill = new ill(this.bn, this.at.c());
    localill.a.add(ine.class);
    this.av = localill;
    this.bi = new dfm(this.bn);
    hfv localhfv = new hfv();
    this.au.a.add(localhfv);
    int i = this.at.c();
    lfr locallfr = new lfr(this.bn, this, i);
    locallfr.b = true;
    mbb localmbb1 = this.bo;
    localmbb1.a(hep.class, new cgq(this));
    localmbb1.a(hen.class, new cgj(this, this.bn, this));
    localmbb1.a(hee.class, new cgp(this));
    localmbb1.a(iiq.class, new duf(this, this.bn, 10, "HostedStreamFrag"));
    localmbb1.a(lli.class, this.bi);
    localmbb1.a(gxs.class, this);
    localmbb1.a(hdf.class, new cgm(this, this.bn));
    localmbb1.a(hgf.class, localhfv);
    localmbb1.a(lfr.class, locallfr);
    this.bk = ((lta)this.bo.a(lta.class));
    this.bb = ((hum)this.bo.a(hum.class));
    this.aP = ((hul)this.bo.a(hul.class)).a(i);
    this.bd = ((jia)this.bo.a(jia.class));
    this.be = ((kpn)this.bo.a(kpn.class));
    this.ac = ((bwk)this.bo.a(bwk.class));
    hgv localhgv = ((bot)this.bo.a(bot.class)).a(this, this.bp);
    mbb localmbb2 = this.bo;
    localmbb2.a(hgv.class, localhgv);
    localmbb2.a(hgw.class, localhgv);
    this.Z = ((lln)this.bo.a(lln.class));
    this.aa = ((dsr)this.bo.a(dsr.class));
  }
  
  public void c(Bundle paramBundle, String paramString) {}
  
  public final void c(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, 2, gxz.ac);
  }
  
  public final void d(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, 1, gxz.ad);
  }
  
  public final boolean d(Intent paramIntent)
  {
    boolean bool1 = paramIntent.hasExtra("circle_info");
    boolean bool2 = false;
    if (bool1)
    {
      cyf localcyf = (cyf)paramIntent.getParcelableExtra("circle_info");
      if ((this.aF == null) || (!TextUtils.equals(this.aF.a, localcyf.a))) {
        a(localcyf);
      }
      bool2 = true;
    }
    return bool2;
  }
  
  public final void d_()
  {
    super.d_();
    if (this.ay != null)
    {
      StreamGridView localStreamGridView = this.ay;
      localStreamGridView.c = null;
      localStreamGridView.a(0);
    }
    h().b(this);
    this.Z.a(this.ab, false);
  }
  
  protected final void e(int paramInt)
  {
    if ((bj)this.x.a("req_pending") == null) {
      coo.a(null, g().getString(paramInt), false, false).a(this.x, "req_pending");
    }
  }
  
  public void e(Intent paramIntent)
  {
    paramIntent.putExtra("refresh", true);
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("is_fetching_stream", this.am);
    paramBundle.putBoolean("fetching_newer_stream", this.an);
    if (this.ay != null)
    {
      ad();
      paramBundle.putInt("scroll_pos", this.aU);
      paramBundle.putInt("scroll_off", this.aV);
      this.aU = 0;
      this.aV = 0;
    }
    paramBundle.putLong("last_deactivation", this.aT);
    paramBundle.putBoolean("error", this.aJ);
    paramBundle.putBoolean("error_recoverable", this.ag);
    paramBundle.putBoolean("reset_animation", this.aK);
    paramBundle.putLong("stream_change", this.aj);
    paramBundle.putLong("notifications_change", this.ak);
    paramBundle.putBoolean("stream_change_flag", this.al);
    paramBundle.putBoolean("subscribe_visible", this.aX);
    paramBundle.putInt("subscribe_text", this.aY);
    paramBundle.putInt("subscribe_icon", this.aZ);
    paramBundle.putInt("orientation", this.bl);
    paramBundle.putInt("current_position", this.aW);
    if (this.az != null) {
      if (this.ay != null)
      {
        paramBundle.putStringArrayList("stream_hash_activity_ids", this.az.az);
        if (this.aA != -1) {
          break label333;
        }
      }
    }
    label333:
    for (int i = this.ay.g;; i = this.aA)
    {
      paramBundle.putInt("stream_restore_position", i);
      String str = this.az.aK;
      if (!TextUtils.isEmpty(str)) {
        paramBundle.putString("popup_invisible_activity_id", str);
      }
      paramBundle.putInt("stream_next_sequenced_loader_id", this.ao);
      if (this.ba != null) {
        this.ba.a(paramBundle);
      }
      if (this.aF != null) {
        paramBundle.putParcelable("circle_info", this.aF);
      }
      paramBundle.putBoolean("first_load", this.aI);
      return;
    }
  }
  
  public final void e(String paramString1, String paramString2)
  {
    int i = this.at.c();
    Intent localIntent = ((kyp)this.bo.a(kyp.class)).a(i, paramString1, null);
    localIntent.putExtra("suggestion_id", paramString2);
    localIntent.putExtra("suggestion_ui", 18);
    this.bb.b(this.bn, i, jjf.a(paramString1), paramString2, 18, R_());
    a(localIntent);
  }
  
  public final void f(int paramInt)
  {
    int i = this.at.c();
    Intent localIntent;
    switch (paramInt)
    {
    case 4: 
    case 5: 
    default: 
      localIntent = efj.g(this.bn, i);
    }
    for (;;)
    {
      a(localIntent);
      switch (paramInt)
      {
      case 4: 
      case 5: 
      case 7: 
      case 8: 
      default: 
        return;
        localIntent = efj.l(this.bn, i);
        continue;
        localIntent = efj.m(this.bn, i);
        continue;
        localIntent = new Intent(this.bn, PeopleListActivity.class);
        localIntent.putExtra("account_id", i);
        localIntent.putExtra("people_view_type", 5);
      }
    }
    gxz localgxz = gxz.bJ;
    for (;;)
    {
      int j = this.at.c();
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, j);
      localgxw.c = localgxz;
      Bundle localBundle = b(paramInt);
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      return;
      localgxz = gxz.bI;
      continue;
      localgxz = gxz.bK;
      continue;
      localgxz = gxz.bL;
      continue;
      localgxz = gxz.af;
      continue;
      localgxz = gxz.aQ;
    }
  }
  
  public final void f(String paramString1, String paramString2)
  {
    int i = this.at.c();
    Intent localIntent = efj.a(this.bn, i, paramString1, null, 0, null, -2147483648, paramString2, false, 1);
    Bundle localBundle = b(113);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.aP;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    a(localIntent);
  }
  
  public void f_()
  {
    super.f_();
    if (this.ay != null)
    {
      for (int i = -1 + this.ay.getChildCount(); i >= 0; i--)
      {
        View localView = this.ay.getChildAt(i);
        if ((localView instanceof lxj)) {
          ((lxj)localView).D_();
        }
      }
      this.ay = null;
    }
  }
  
  public void h(Bundle paramBundle)
  {
    if (this.bi != null) {
      this.bi.h(paramBundle);
    }
  }
  
  protected final boolean i(boolean paramBoolean)
  {
    if (this.am) {
      return false;
    }
    this.an = paramBoolean;
    byte[] arrayOfByte;
    String str1;
    gzf localgzf;
    if (paramBoolean)
    {
      arrayOfByte = null;
      str1 = null;
      localgzf = a(str1, arrayOfByte);
      this.am = true;
      if (!paramBoolean) {
        break label103;
      }
    }
    label103:
    for (String str2 = "fetch_newer";; str2 = "fetch_older")
    {
      localgzf.f = str2;
      am().b(localgzf);
      N_();
      if (G()) {
        k().b(1, null, this);
      }
      return true;
      str1 = this.aB;
      arrayOfByte = this.af;
      if (this.aB != null) {
        break;
      }
      return false;
    }
  }
  
  protected boolean l(String paramString)
  {
    return false;
  }
  
  public void m()
  {
    this.c.e = SystemClock.elapsedRealtime();
    this.aS = false;
    this.bk.a(this.at.c(), "NewContentTooltipAfterResume", 3L, 1L);
    super.m();
    gzj localgzj = am();
    if ((this.aN) && (!this.aS) && (!localgzj.a("fetch_older"))) {
      M();
    }
    EsService.a(this.bn, this.bf);
    if (Log.isLoggable("HostedStreamFrag", 3))
    {
      boolean bool = localgzj.a("fetch_newer");
      String str = this.aD;
      long l = System.currentTimeMillis() - this.aj;
      new StringBuilder(80 + String.valueOf(str).length()).append("onResume refresh pending: ").append(bool).append(", gaia id: ").append(str).append(", time diff (ms): ").append(l);
    }
    if (this.aA != -1) {
      k().b(2, null, this);
    }
    if (this.az != null) {
      this.az.aH = true;
    }
    if (!this.aI) {
      ac_();
    }
    R();
    dge.b(this.N);
    View localView = this.N.findViewById(aaw.bH);
    if (localView != null) {
      localView.setClickable(true);
    }
  }
  
  public final void m(String paramString)
  {
    int i = this.at.c();
    Intent localIntent = efj.j(this.bn, i, paramString);
    Bundle localBundle = b(102);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.bS;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    a(localIntent);
  }
  
  public void n()
  {
    super.n();
    if (this.az != null)
    {
      this.az.t();
      this.az.v();
    }
    dme localdme = this.bf;
    EsService.d.remove(localdme);
    dge.a(this.N);
    if (this.bg != null)
    {
      cgi localcgi = this.bg;
      efj.m().removeCallbacks(localcgi);
      this.bg.run();
      this.bg = null;
    }
    cpl localcpl = this.c;
    localcpl.c = false;
    localcpl.d = false;
  }
  
  public final void n(String paramString)
  {
    int i = this.at.c();
    Intent localIntent = efj.j(this.bn, i, paramString);
    Bundle localBundle = b(139);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.bU;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    a(localIntent);
  }
  
  public void onClick(View paramView)
  {
    int i = this.at.c();
    if (paramView == this.aQ)
    {
      this.aJ = false;
      af();
      if ((this.an) || (X()))
      {
        this.c.a();
        gxx localgxx2 = (gxx)this.bo.a(gxx.class);
        gxw localgxw2 = new gxw(this.bn);
        localgxw2.c = gxz.ak;
        localgxx2.a(localgxw2);
        W();
      }
    }
    do
    {
      return;
      M();
      return;
      if (paramView == this.ap)
      {
        cpl localcpl = this.c;
        new kqf(77).b(localcpl.a);
        localcpl.d = true;
        gxx localgxx1 = (gxx)this.bo.a(gxx.class);
        gxw localgxw1 = new gxw(this.bn);
        localgxw1.c = gxz.ak;
        localgxx1.a(localgxw1);
        this.bk.a(this.at.c(), "TooltipStreamRefresh", 3L, 1L);
        W();
        this.al = false;
        R();
        return;
      }
    } while (paramView.getId() != aaw.bH);
    paramView.setClickable(false);
    b(efj.k(this.bn, i));
  }
  
  public gya r_()
  {
    return gya.a;
  }
  
  public gxq v()
  {
    if ((this.N != null) && (this.aF != null))
    {
      if (this.aF.c == null) {}
      for (String str = this.aF.a; "v.all.circles".equals(str); str = this.aF.c) {
        return new gxq(pkh.v);
      }
      if (this.aF.g) {
        return new gxq(pkh.W);
      }
      if (str != null)
      {
        if (str.startsWith("f.")) {
          return new kut(pkh.g, new String[] { str });
        }
        if (str.startsWith("g.")) {
          return new kvk(pka.y, this.aD);
        }
      }
    }
    return new gxq(pkh.v);
  }
  
  public hqr w()
  {
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cge
 * JD-Core Version:    0.7.0.1
 */