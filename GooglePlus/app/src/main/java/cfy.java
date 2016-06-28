import android.animation.Animator.AnimatorListener;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.plus.phone.AlbumShareActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.apps.plus.views.SingleAlbumSocialFooterView;
import com.google.android.apps.plus.views.SingleAlbumTouchHandler;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import com.google.android.libraries.social.ui.views.DeprecatedExpandingScrollView;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class cfy
  extends cff
  implements View.OnClickListener, View.OnLongClickListener, chi, cw<Cursor>, dty, dut, dzi, dzj, lwz, lxr
{
  private static boolean aa;
  private static int ab;
  private static int ac;
  private static int ad;
  private static int ae;
  private static Interpolator af = new DecelerateInterpolator();
  Boolean Z;
  View a;
  private boolean aJ;
  private boolean aK;
  private boolean aL;
  private Integer aM;
  private Integer aN;
  private String aO;
  private String aP;
  private String aQ;
  private int aR;
  private boolean aS;
  private int aT = 0;
  private String aU;
  private String aV;
  private String aW;
  private String aX;
  private String aY;
  private String aZ;
  private ColumnGridView ag;
  private DeprecatedExpandingScrollView ah;
  private View ai;
  private View aj;
  private dfr ak;
  gnb b;
  private long ba;
  private long bb;
  private String bc;
  private boolean bd;
  private boolean be;
  private Animator.AnimatorListener bf;
  private final hwq bg;
  private hyi bh;
  private final gzi bi;
  private final dme bj;
  gnb c;
  boolean d;
  
  public cfy()
  {
    hwq localhwq = new hwq(this.bp);
    int i = aau.lF;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    this.bg = localhwq;
    this.bi = new cfz(this);
    this.bj = new cga(this);
  }
  
  private final boolean Q()
  {
    return (0x800 & this.bb) != 0L;
  }
  
  private final boolean R()
  {
    return (0x2 & this.bb) != 0L;
  }
  
  private final boolean S()
  {
    return TextUtils.equals(this.aV, this.am.f().b("gaia_id"));
  }
  
  private final boolean T()
  {
    if ((this.ah != null) && (this.ah.a()))
    {
      this.ah.c();
      View localView = this.aj;
      int i = Build.VERSION.SDK_INT;
      int j = 0;
      if (i >= 11) {
        j = 1;
      }
      if (j != 0) {
        localView.setAlpha(0.0F);
      }
      return true;
    }
    return false;
  }
  
  private final void U()
  {
    cgr localcgr1 = (cgr)h().a("activity_1_up_fragment");
    if (localcgr1 == null)
    {
      cgr localcgr2 = new cgr();
      Bundle localBundle = new Bundle();
      localBundle.putInt("account_id", this.am.c());
      localBundle.putString("activity_id", this.bc);
      localBundle.putInt("host_mode", 2);
      localBundle.putBoolean("force_full_bleed", true);
      localBundle.putBoolean("ActionBarFragmentMixin.Enabled", false);
      localcgr2.f(localBundle);
      localcgr2.a(this);
      cl localcl = h().a();
      localcl.a(aaw.kx, localcgr2, "activity_1_up_fragment");
      localcl.b();
      return;
    }
    localcgr1.a(this);
  }
  
  private final void b(View paramView, Rect paramRect)
  {
    String str1 = this.am.f().b("domain_name");
    duu localduu = new duu(this.bn);
    int i = this.aR;
    localduu.d = duu.b;
    String str2;
    switch (i)
    {
    case 1: 
    default: 
      str2 = localduu.c.getString(aau.bS);
    }
    for (;;)
    {
      if (efj.aaz == null) {
        efj.aaz = new lwi();
      }
      localduu.e = Html.fromHtml(str2, null, efj.aaz);
      int j = paramRect.left;
      int k = paramRect.bottom - paramView.getHeight();
      View localView = LayoutInflater.from(paramView.getContext()).inflate(efj.sF, null);
      TextView localTextView = (TextView)localView.findViewById(aaw.X);
      if (!TextUtils.isEmpty(localduu.e))
      {
        localTextView.setText(localduu.e);
        localTextView.setTextColor(localduu.d);
      }
      PopupWindow localPopupWindow = new PopupWindow(localView, -2, -2, true);
      localPopupWindow.setBackgroundDrawable(new BitmapDrawable());
      localPopupWindow.setOutsideTouchable(true);
      localPopupWindow.setContentView(localView);
      localView.setOnClickListener(new duv(localduu, localPopupWindow));
      localPopupWindow.showAsDropDown(paramView, j, k);
      return;
      str2 = localduu.c.getString(aau.bQ, new Object[] { str1 });
      continue;
      str2 = localduu.c.getString(aau.bP);
      continue;
      str2 = localduu.c.getString(aau.bT);
      localduu.d = duu.a;
      continue;
      str2 = localduu.c.getString(aau.bR);
      localduu.d = duu.a;
    }
  }
  
  private final void c(int paramInt, dmx paramdmx)
  {
    if ((this.aM == null) || (this.aM.intValue() != paramInt)) {
      return;
    }
    this.aM = null;
    int i;
    Resources localResources;
    if (paramdmx != null) {
      if (paramdmx.c != 200)
      {
        i = 1;
        if (i == 0) {
          break label113;
        }
        localResources = g();
        if (paramdmx.c != 404) {
          break label82;
        }
        this.aL = true;
      }
    }
    for (;;)
    {
      c(this.N);
      return;
      i = 0;
      break;
      label82:
      this.aB = true;
      String str = localResources.getString(aau.rQ);
      Toast.makeText(f(), str, 0).show();
      continue;
      label113:
      ColumnGridView localColumnGridView = this.ag;
      localColumnGridView.removeAllViews();
      localColumnGridView.d();
      localColumnGridView.a();
    }
  }
  
  private final void c(View paramView)
  {
    if (paramView == null) {
      return;
    }
    if (v()) {
      if ((this.aJ) && (!this.aK) && (this.aM == null))
      {
        hwq localhwq3 = this.bg;
        hwt localhwt3 = hwt.c;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt3);
        localhwq3.a();
      }
    }
    for (;;)
    {
      b(paramView);
      a(this.bg);
      G();
      return;
      lvz locallvz = this.at;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
      hwq localhwq2 = this.bg;
      hwt localhwt2 = hwt.b;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      continue;
      hwq localhwq1 = this.bg;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
    }
  }
  
  public final void C()
  {
    cgr localcgr = (cgr)h().a("activity_1_up_fragment");
    if ((localcgr != null) && (this.ah != null))
    {
      this.ah.b();
      localcgr.aN = true;
      localcgr.G();
    }
  }
  
  public final void D()
  {
    String str = this.m.getString("cluster_id");
    int i = this.am.c();
    a(efj.a(f(), i, jrf.e(str), this.aW, this.aV, str), 1);
  }
  
  protected final void I()
  {
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dW;
    localgxx.a(localgxw);
    Intent localIntent = bsz.a(f(), this.d, this.am.c());
    localIntent.putExtra("cluster_id", this.m.getString("cluster_id"));
    this.au.a(aaw.iF, localIntent);
  }
  
  protected final Intent J()
  {
    return ((anz)mbb.a(this.bn, anz.class)).a(this.m.getString("cluster_id"), true);
  }
  
  final void P()
  {
    if (this.c == null)
    {
      gzj localgzj = (gzj)this.bo.a(gzj.class);
      if (!localgzj.a("ReadCollectionAudienceTask"))
      {
        bny localbny = new bny(f(), this.am.c(), this.aX, this.aO, S());
        localgzj.d.a(localbny, false);
        localgzj.b(localbny);
      }
      return;
    }
    if ((S()) && ("TRUE".equalsIgnoreCase(dun.i.a())))
    {
      bp localbp = f();
      int j = this.am.c();
      String str2 = this.aX;
      String str3 = this.aO;
      gnb localgnb = this.b;
      Intent localIntent = new Intent(localbp, AlbumShareActivity.class);
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.putExtra("account_id", j);
      localIntent.putExtra("auth_key", str3);
      localIntent.putExtra("cluster_id", str2);
      localIntent.putExtra("extra_acl", localgnb);
      a(localIntent, 2);
      return;
    }
    int i;
    if ("PLUS_EVENT".equals(this.aU)) {
      i = aau.bV;
    }
    for (String str1 = g().getString(i);; str1 = this.ak.i)
    {
      cjt localcjt = efj.a(this.am.c(), "SingleAlbum", str1, this.c);
      localcjt.m.putBoolean("restrict_to_domain", this.aS);
      localcjt.a(this.x, "tag_audience");
      return;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater.cloneInContext(this.bn), paramViewGroup, paramBundle, efj.um);
    int i = this.bn.getResources().getDimensionPixelOffset(efj.kM);
    int j = new jrh(this.bn).a;
    boolean bool;
    ColumnGridView localColumnGridView2;
    if (this.m.getBoolean("hide_header", false))
    {
      bool = false;
      this.ak = new dfr(this.bn, null, this.am.c(), this.m.getString("cluster_id"), j, this.aO, this);
      this.ak.w = this;
      this.ak.x = this;
      this.ag = ((ColumnGridView)localView.findViewById(aaw.dS));
      this.ag.p = bool;
      this.ag.b(i);
      this.ag.a(j);
      this.ag.c = true;
      ColumnGridView localColumnGridView1 = this.ag;
      cgd localcgd = new cgd();
      localColumnGridView1.e.c = localcgd;
      localColumnGridView2 = this.ag;
      if (!bool) {
        break label591;
      }
    }
    hwq localhwq;
    hwt localhwt;
    label591:
    for (Object localObject = this.ak;; localObject = new cyp(this.ak))
    {
      localColumnGridView2.a((ListAdapter)localObject);
      this.ag.d(efj.qM);
      this.ai = localView.findViewById(aaw.eD);
      this.aj = localView.findViewById(aaw.lX);
      this.ah = ((DeprecatedExpandingScrollView)localView.findViewById(aaw.eB));
      this.ah.a(ae);
      this.ah.f = this;
      this.ah.c = this;
      this.a = localView.findViewById(aaw.ke);
      ((SingleAlbumSocialFooterView)localView.findViewById(aaw.dK)).b = this;
      SingleAlbumTouchHandler localSingleAlbumTouchHandler = (SingleAlbumTouchHandler)localView.findViewById(aaw.lO);
      localSingleAlbumTouchHandler.g = this.as;
      localSingleAlbumTouchHandler.a = this.ai;
      localSingleAlbumTouchHandler.d = localSingleAlbumTouchHandler.a.findViewById(aaw.dK);
      localSingleAlbumTouchHandler.b = localSingleAlbumTouchHandler.a.findViewById(16908298);
      localSingleAlbumTouchHandler.c = localSingleAlbumTouchHandler.a.findViewById(aaw.dG);
      localSingleAlbumTouchHandler.f = localView.findViewById(aaw.dG);
      localSingleAlbumTouchHandler.e = localView.findViewById(aaw.dl);
      localSingleAlbumTouchHandler.h = this;
      if (Build.VERSION.SDK_INT < 11) {
        this.aj.setVisibility(8);
      }
      if (!TextUtils.isEmpty(this.bc)) {
        U();
      }
      if (!v()) {
        break label622;
      }
      lvz locallvz = this.at;
      if (locallvz.a != null)
      {
        SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
        if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
          localSwipeRefreshLayoutWithUpScroll.a(true);
        }
      }
      localhwq = this.bg;
      localhwt = hwt.b;
      if (localhwt != null) {
        break label607;
      }
      throw new NullPointerException();
      String str = jrf.d(this.m.getString("cluster_id"));
      if ((TextUtils.equals(str, "profile")) || (TextUtils.equals(str, "posts")))
      {
        bool = false;
        break;
      }
      bool = true;
      break;
    }
    label607:
    localhwq.g = ((hwt)localhwt);
    localhwq.a();
    label622:
    k().a(1, null, this);
    this.d = false;
    iwb localiwb = (iwb)this.bo.a(iwb.class);
    if ((this.am.e()) && (localiwb.a(this.am.c()))) {
      k().a(2, null, new cgc(this));
    }
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    if ((0x1 & this.aC) != 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      mbf localmbf = this.bn;
      int j = this.am.c();
      String str = this.m.getString("cluster_id");
      int k = this.aC;
      return new dft(localmbf, j, str, "NOT media_attr & 32", dft.r, k);
    }
    return new dft(this.bn, this.am.c(), this.m.getString("cluster_id"));
  }
  
  public final void a(int paramInt)
  {
    float f = 1.0F;
    boolean bool1 = true;
    boolean bool4;
    label60:
    View localView;
    if (((this.Z == null) || (!this.Z.booleanValue())) && (paramInt > ac))
    {
      this.Z = Boolean.valueOf(bool1);
      if (Build.VERSION.SDK_INT >= 14)
      {
        bool4 = bool1;
        if (bool4) {
          break label98;
        }
        this.a.setVisibility(4);
        localView = this.aj;
        if (paramInt <= ab) {
          break label302;
        }
        label73:
        if (Build.VERSION.SDK_INT < 11) {
          break label313;
        }
      }
    }
    for (;;)
    {
      if (bool1) {
        localView.setAlpha(f);
      }
      return;
      bool4 = false;
      break;
      label98:
      if (this.bf == null) {
        this.bf = new cgb(this);
      }
      ViewPropertyAnimator localViewPropertyAnimator2 = this.a.animate().alpha(0.0F).setDuration(500L).setInterpolator(af).setListener(this.bf);
      if (Build.VERSION.SDK_INT >= 16) {}
      for (boolean bool5 = bool1;; bool5 = false)
      {
        if (!bool5) {
          break label178;
        }
        localViewPropertyAnimator2.withLayer();
        break;
      }
      label178:
      break label60;
      if (((this.Z != null) && (!this.Z.booleanValue())) || (paramInt >= ad)) {
        break label60;
      }
      this.Z = Boolean.valueOf(false);
      this.a.setVisibility(0);
      boolean bool2;
      label231:
      ViewPropertyAnimator localViewPropertyAnimator1;
      if (Build.VERSION.SDK_INT >= 14)
      {
        bool2 = bool1;
        if (!bool2) {
          break label294;
        }
        localViewPropertyAnimator1 = this.a.animate().alpha(f).setDuration(500L).setInterpolator(af).setListener(null);
        if (Build.VERSION.SDK_INT < 16) {
          break label296;
        }
      }
      label294:
      label296:
      for (boolean bool3 = bool1;; bool3 = false)
      {
        if (!bool3) {
          break label300;
        }
        localViewPropertyAnimator1.withLayer();
        break;
        bool2 = false;
        break label231;
        break;
      }
      label300:
      break label60;
      label302:
      f = paramInt / ab;
      break label73;
      label313:
      bool1 = false;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default: 
      super.a(paramInt1, paramInt2, paramIntent);
    }
    do
    {
      do
      {
        do
        {
          return;
        } while (paramInt2 != -1);
        String str1 = paramIntent.getStringExtra("tile_id");
        this.aT = 2;
        mbf localmbf = this.bn;
        int i = this.am.c();
        String str2 = this.aY;
        String str3 = this.m.getString("cluster_id");
        Intent localIntent = EsService.e.a(localmbf, EsService.class);
        localIntent.putExtra("op", 85);
        localIntent.putExtra("account_id", i);
        localIntent.putExtra("album_tile_id", str2);
        localIntent.putExtra("collection_id", str3);
        localIntent.putExtra("tile_id", str1);
        this.aN = Integer.valueOf(EsService.a(localmbf, localIntent));
        anf localanf = this.av;
        int j = aau.te;
        localanf.a(g().getString(j));
        return;
      } while (paramInt2 != -1);
      z_();
      return;
    } while (paramInt2 != -1);
    z_();
  }
  
  public final void a(Cursor paramCursor)
  {
    SingleAlbumSocialFooterView localSingleAlbumSocialFooterView = (SingleAlbumSocialFooterView)this.N.findViewById(aaw.dK);
    localSingleAlbumSocialFooterView.l = false;
    localSingleAlbumSocialFooterView.c();
    long l = paramCursor.getLong(12);
    localSingleAlbumSocialFooterView.d = paramCursor.getString(2);
    localSingleAlbumSocialFooterView.h = paramCursor.getInt(8);
    boolean bool1;
    if (((1L & l) != 0L) || ((0x400 & l) != 0L))
    {
      bool1 = true;
      localSingleAlbumSocialFooterView.e = bool1;
      if ((0x10 & l) == 0L) {
        break label270;
      }
    }
    label270:
    for (boolean bool2 = true;; bool2 = false)
    {
      localSingleAlbumSocialFooterView.f = bool2;
      boolean bool3 = (l & 0x4) < 0L;
      boolean bool4 = false;
      if (bool3) {
        bool4 = true;
      }
      localSingleAlbumSocialFooterView.g = bool4;
      localSingleAlbumSocialFooterView.j = paramCursor.getString(3);
      localSingleAlbumSocialFooterView.k = paramCursor.getString(4);
      String str = hdo.b(paramCursor.getString(5));
      localSingleAlbumSocialFooterView.a.remove(localSingleAlbumSocialFooterView.c);
      localSingleAlbumSocialFooterView.c = new dvq(localSingleAlbumSocialFooterView, localSingleAlbumSocialFooterView.j, str, str, localSingleAlbumSocialFooterView.b, 2);
      localSingleAlbumSocialFooterView.a.add(localSingleAlbumSocialFooterView.c);
      byte[] arrayOfByte = paramCursor.getBlob(7);
      if (arrayOfByte != null) {
        localSingleAlbumSocialFooterView.i = lmj.a(arrayOfByte);
      }
      localSingleAlbumSocialFooterView.b();
      localSingleAlbumSocialFooterView.requestLayout();
      localSingleAlbumSocialFooterView.invalidate();
      this.bd = true;
      b(this.N);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    bp localbp = f();
    if (!aa)
    {
      Resources localResources = localbp.getResources();
      ab = localResources.getDimensionPixelSize(efj.oi);
      ac = localResources.getDimensionPixelOffset(efj.kD);
      ad = localResources.getDimensionPixelOffset(efj.kC);
      ae = localResources.getDimensionPixelOffset(efj.kE);
      aa = true;
    }
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("refresh_request")) {
        this.aM = Integer.valueOf(paramBundle.getInt("refresh_request"));
      }
      if (paramBundle.containsKey("pending_request")) {
        this.aN = Integer.valueOf(paramBundle.getInt("pending_request"));
      }
      if (paramBundle.containsKey("audience")) {
        this.b = ((gnb)paramBundle.getParcelable("audience"));
      }
      if (paramBundle.containsKey("people_list")) {
        this.c = ((gnb)paramBundle.getParcelable("people_list"));
      }
      if (paramBundle.containsKey("drive_url")) {
        this.aP = paramBundle.getString("drive_url");
      }
      this.aT = paramBundle.getInt("operation_type", 0);
      this.aY = paramBundle.getString("album_tile_id");
      this.aL = paramBundle.getBoolean("album_not_found", false);
    }
    this.bc = this.m.getString("activity_id");
    String str1 = this.m.getString("cluster_id");
    this.aV = jrf.c(str1);
    this.aW = jrf.d(str1);
    this.aU = jrf.g(str1);
    if (this.m.containsKey("auth_key")) {
      this.aO = this.m.getString("auth_key");
    }
    this.be = this.bh.b(bwb.B, this.am.c());
    if (Log.isLoggable("SingleAlbum", 4))
    {
      String str2 = String.valueOf(str1);
      if (str2.length() != 0) {
        "onCreate clusterId=".concat(str2);
      }
    }
    else
    {
      return;
    }
    new String("onCreate clusterId=");
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("delete_album".equals(paramString))
    {
      this.aT = 1;
      mbf localmbf = this.bn;
      int i = this.am.c();
      String str1 = this.m.getString("cluster_id");
      String str2 = this.aO;
      Intent localIntent = EsService.e.a(localmbf, EsService.class);
      localIntent.putExtra("op", 74);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("collection_id", str1);
      localIntent.putExtra("auth_key", str2);
      this.aN = Integer.valueOf(EsService.a(localmbf, localIntent));
      anf localanf = this.av;
      if ((R()) && (!this.be)) {}
      for (int j = aau.rY;; j = aau.eN)
      {
        localanf.a(g().getString(j));
        gxx localgxx = (gxx)this.bo.a(gxx.class);
        gxw localgxw = new gxw(this.bn);
        localgxw.c = gxz.dq;
        localgxx.a(localgxw);
        return;
      }
    }
    super.a(paramBundle, paramString);
  }
  
  public final void a(View paramView, Rect paramRect)
  {
    int i = 1;
    if ("PLUS_EVENT".equals(this.aU))
    {
      if (S())
      {
        a(efj.a(this.bn, this.am.c(), this.aW, this.aO, this.aV));
        return;
      }
      b(paramView, paramRect);
      return;
    }
    if (this.aR == i) {}
    while ((i != 0) || ((S()) && ("TRUE".equalsIgnoreCase(dun.i.a()))))
    {
      P();
      return;
      i = 0;
    }
    b(paramView, paramRect);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString)
  {
    String str1;
    if (!TextUtils.isEmpty(paramString))
    {
      str1 = String.valueOf(paramString);
      if (str1.length() == 0) {
        break label56;
      }
    }
    label56:
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      int i = this.am.c();
      a(efj.a(this.bn, i, str2, null, 0, false));
      return;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    super.a(paramString, paramhae, paramhaa);
    Y_();
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, lmj paramlmj)
  {
    hej localhej = (hej)mbb.a(f(), hej.class);
    if ((paramlmj != null) && (paramlmj.c)) {}
    for (boolean bool = true;; bool = false)
    {
      localhej.a(paramString1, paramString2, paramString3, paramBoolean, bool, null, null);
      return;
    }
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    efj.a(paramtp, true);
  }
  
  public final void a(boolean paramBoolean)
  {
    if ((!paramBoolean) && (f().getCurrentFocus() != null)) {
      efj.k(f().getCurrentFocus());
    }
  }
  
  final boolean a(int paramInt, dmx paramdmx)
  {
    int i = 1;
    if ((this.aN == null) || (this.aN.intValue() != paramInt)) {
      i = 0;
    }
    do
    {
      return i;
      this.aN = null;
      this.av.a();
      if (paramdmx != null)
      {
        int m;
        if (paramdmx.c != 200)
        {
          int j = i;
          if (j == 0) {
            continue;
          }
          switch (this.aT)
          {
          default: 
            m = aau.mm;
          }
        }
        for (;;)
        {
          Toast.makeText(f(), m, 0).show();
          return false;
          int k = 0;
          break;
          if ((R()) && (!this.be))
          {
            m = aau.rX;
          }
          else
          {
            m = aau.eM;
            continue;
            m = aau.sX;
            continue;
            m = aau.tB;
            continue;
            m = aau.iK;
          }
        }
      }
    } while (this.aT != i);
    f().finish();
    return i;
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = this.am.c();
    int j = paramMenuItem.getItemId();
    if (j == aaw.G)
    {
      Intent localIntent2 = efj.b(f(), i, null);
      localIntent2.putExtra("album_id", this.aW);
      localIntent2.putExtra("album_owner_id", this.aV);
      localIntent2.putExtra("cluster_id", this.m.getString("cluster_id"));
      localIntent2.putExtra("link_url", this.aQ);
      a(localIntent2, 1);
      f().overridePendingTransition(efj.iK, 0);
      return true;
    }
    if ((j == aaw.cl) || (j == aaw.iw))
    {
      Resources localResources = g();
      if ((R()) && (!this.be)) {}
      for (lut locallut = lut.a(localResources.getString(aau.rW), localResources.getString(aau.rV), localResources.getString(aau.rU), localResources.getString(aau.cM), 0, 0);; locallut = lut.a(localResources.getString(aau.eL), localResources.getString(aau.eK), localResources.getString(aau.eJ), localResources.getString(aau.cM), 0, 0))
      {
        locallut.n = this;
        locallut.p = 0;
        locallut.a(this.x, "delete_album");
        return true;
      }
    }
    if (j == aaw.eg)
    {
      boolean bool = Q();
      if (bool) {}
      for (int k = 3;; k = 4)
      {
        this.aT = k;
        mbf localmbf = this.bn;
        int m = this.am.c();
        String str1 = this.m.getString("cluster_id");
        String str2 = this.aO;
        Intent localIntent1 = EsService.e.a(localmbf, EsService.class);
        localIntent1.putExtra("op", 94);
        localIntent1.putExtra("account_id", m);
        localIntent1.putExtra("collection_id", str1);
        localIntent1.putExtra("auth_key", str2);
        localIntent1.putExtra("undo", bool);
        this.aN = Integer.valueOf(EsService.a(localmbf, localIntent1));
        anf localanf = this.av;
        int n = aau.sE;
        localanf.a(g().getString(n));
        return true;
      }
    }
    if (j == aaw.mp)
    {
      a(efj.a(f(), i, this.aW, this.aV, 0, null, -2147483648, null, false, 1));
      return true;
    }
    if (j == aaw.mq) {
      try
      {
        a(new Intent("android.intent.action.VIEW", Uri.parse(this.aP)));
        return true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        Toast.makeText(this.bn, aau.lA, 0).show();
        return true;
      }
    }
    if ((j == aaw.E) || (j == aaw.F))
    {
      I();
      return true;
    }
    return super.a(paramMenuItem);
  }
  
  public final boolean a(View paramView)
  {
    int i = paramView.getId();
    ipf localipf = (ipf)paramView.getTag(aaw.lc);
    if (i == aaw.dK)
    {
      if ((this.ah != null) && (!TextUtils.isEmpty(this.bc))) {
        this.ah.b();
      }
      return true;
    }
    String str = (String)paramView.getTag(aaw.ln);
    if (TextUtils.isEmpty(str)) {
      return false;
    }
    if (a(localipf)) {
      return true;
    }
    int j = this.am.c();
    bdo localbdo = new bdo(f(), j);
    localbdo.b = str;
    localbdo.e = this.m.getString("cluster_id");
    localbdo.g = this.az.b;
    localbdo.w = this.aA.c();
    localbdo.o = this.aO;
    localbdo.p = Integer.valueOf(this.aA.b);
    localbdo.r = Boolean.valueOf(this.aI);
    Intent localIntent = localbdo.a();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dm;
    localgxx.a(localgxw);
    b(localIntent);
    return true;
  }
  
  public final void a_(boolean paramBoolean)
  {
    this.aK = false;
    if ((paramBoolean) && (f() != null)) {
      z_();
    }
    c(this.N);
  }
  
  protected final void b(View paramView)
  {
    int i = 8;
    if (paramView == null) {
      return;
    }
    super.b(paramView);
    View localView1 = paramView.findViewById(aaw.dK);
    View localView2 = paramView.findViewById(aaw.dI);
    boolean bool1 = this.m.getBoolean("hide_footer", false);
    boolean bool2;
    int j;
    int k;
    if ((!this.aA.c()) && (!bool1)) {
      if (this.bd)
      {
        bool2 = true;
        j = 0;
        k = i;
        i = 0;
      }
    }
    for (;;)
    {
      this.ai.setVisibility(j);
      localView1.setVisibility(i);
      localView2.setVisibility(k);
      dfr localdfr = this.ak;
      if (dfr.g == bool2) {
        break;
      }
      dfr.g = bool2;
      localdfr.notifyDataSetChanged();
      return;
      if (R())
      {
        j = i;
        bool2 = false;
        k = 0;
      }
      else
      {
        j = i;
        k = i;
        bool2 = false;
      }
    }
  }
  
  protected final void b(gpr paramgpr)
  {
    int i = 1;
    super.b(paramgpr);
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2)
    {
      int k = i;
      if (k != 0) {
        paramgpr.c(aaw.G).setIcon(efj.rX);
      }
      String str = jrf.g(this.m.getString("cluster_id"));
      if ((!"PHOTO_COLLECTION".equals(str)) && (!"PLUS_EVENT".equals(str))) {
        break label508;
      }
    }
    label119:
    label506:
    label508:
    int i1;
    for (int n = i;; i1 = 0)
    {
      if (((0x200 & this.ba) != 0L) && (n == 0) && (!this.aA.c))
      {
        int i2 = i;
        if (i2 != 0) {
          paramgpr.b(aaw.G);
        }
        int i4 = 3;
        if (this.aI) {
          i4 = 7;
        }
        a(paramgpr, i4);
        if (this.m.getBoolean("show_title", i)) {
          paramgpr.a(this.aZ);
        }
        gqe localgqe = (gqe)paramgpr.a(aaw.iq);
        localgqe.b = Math.max(i, localgqe.b);
        if (!this.aE) {
          break label226;
        }
      }
      for (;;)
      {
        return;
        int m = 0;
        break;
        int i3 = 0;
        break label119;
        label226:
        if ("PLUS_EVENT".equals(this.aU)) {
          paramgpr.b(aaw.mp);
        }
        label284:
        label323:
        int i9;
        if (((0x1000000 & this.ba) != 0L) && (!TextUtils.isEmpty(jrf.e(this.m.getString("cluster_id")))))
        {
          int i5 = i;
          if (i5 != 0)
          {
            MenuItem localMenuItem = paramgpr.b(aaw.eg);
            localMenuItem.setChecked(Q());
            if (Build.VERSION.SDK_INT < 11) {
              break label476;
            }
            int i7 = i;
            if (i7 == 0)
            {
              if (!Q()) {
                break label482;
              }
              i9 = aau.kR;
              label340:
              localMenuItem.setTitle(i9);
            }
          }
          if ((0x4 & this.ba) == 0L) {
            break label490;
          }
          label363:
          if ((i != 0) && (!"PLUS_EVENT".equals(this.aU)))
          {
            if ((!R()) || (this.be)) {
              break label495;
            }
            paramgpr.b(aaw.iw);
          }
        }
        for (;;)
        {
          if (TextUtils.isEmpty(this.aP)) {
            break label506;
          }
          bp localbp = f();
          Intent localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setData(Uri.parse(this.aP));
          if (localbp.getPackageManager().resolveActivity(localIntent, 0) == null) {
            break;
          }
          paramgpr.b(aaw.mq);
          return;
          int i6 = 0;
          break label284;
          label476:
          int i8 = 0;
          break label323;
          label482:
          i9 = aau.kC;
          break label340;
          label490:
          int j = 0;
          break label363;
          label495:
          paramgpr.b(aaw.cl);
        }
      }
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    gzi localgzi = this.bi;
    localgzj.a.add(localgzi);
    this.bh = ((hyi)mbb.a(this.bn, hyi.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.aM != null) {
      paramBundle.putInt("refresh_request", this.aM.intValue());
    }
    if (this.aN != null) {
      paramBundle.putInt("pending_request", this.aN.intValue());
    }
    if (this.b != null) {
      paramBundle.putParcelable("audience", this.b);
    }
    if (this.c != null) {
      paramBundle.putParcelable("people_list", this.c);
    }
    if (this.aP != null) {
      paramBundle.putString("drive_url", this.aP);
    }
    paramBundle.putInt("operation_type", this.aT);
    paramBundle.putString("album_tile_id", this.aY);
    paramBundle.putBoolean("album_not_found", this.aL);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.bj);
    if (this.ag != null) {
      this.ag.e();
    }
    if (this.aM != null)
    {
      int j = this.aM.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(j))) {
        break label209;
      }
      if (v())
      {
        lvz locallvz = this.at;
        if (locallvz.a != null)
        {
          SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
          if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
            localSwipeRefreshLayoutWithUpScroll.a(true);
          }
        }
        hwq localhwq = this.bg;
        hwt localhwt = hwt.b;
        if (localhwt == null) {
          throw new NullPointerException();
        }
        localhwq.g = ((hwt)localhwt);
        localhwq.a();
      }
    }
    for (;;)
    {
      if (this.aN != null)
      {
        int i = this.aN.intValue();
        if (!EsService.b.containsKey(Integer.valueOf(i)))
        {
          dmx localdmx1 = EsService.a(this.aN.intValue());
          a(this.aN.intValue(), localdmx1);
        }
      }
      Y_();
      return;
      label209:
      dmx localdmx2 = EsService.a(this.aM.intValue());
      c(this.aM.intValue(), localdmx2);
    }
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.bj;
    EsService.d.remove(localdme);
  }
  
  public final boolean onLongClick(View paramView)
  {
    int i = this.aA.b;
    boolean bool1 = false;
    if (i != 5)
    {
      boolean bool2 = paramView instanceof PhotoTileView;
      bool1 = false;
      if (bool2)
      {
        b((PhotoTileView)paramView);
        c(0);
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final void p_()
  {
    super.p_();
    lwo.c(this.ag);
  }
  
  public final void q_()
  {
    super.q_();
    lwo.d(this.ag);
  }
  
  public final gya r_()
  {
    return gya.ac;
  }
  
  public final boolean t_()
  {
    if (T()) {
      return true;
    }
    if (this.aE) {
      return super.s_();
    }
    return super.t_();
  }
  
  protected final boolean v()
  {
    if (this.ak == null) {}
    for (Cursor localCursor = null; (localCursor == null) || (localCursor.getCount() == 0); localCursor = this.ak.c) {
      return true;
    }
    return false;
  }
  
  public final void x_()
  {
    super.x_();
    if (this.aA.c()) {
      T();
    }
  }
  
  public final boolean y_()
  {
    return (this.aM != null) || (super.y_());
  }
  
  public final void z_()
  {
    super.z_();
    this.aL = false;
    this.aB = false;
    this.b = null;
    this.c = null;
    if (this.aM == null)
    {
      String str = this.m.getString("cluster_id");
      this.aM = Integer.valueOf(EsService.a(this.bn, this.am.c(), this.aV, str, this.aO));
    }
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    if ((!TextUtils.isEmpty(this.bc)) && (!localgzj.a("GetActivityTask"))) {
      localgzj.b(new bnf(this.bn, this.am.c(), this.bc, null, false));
    }
    c(this.N);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dx;
    localgxx.a(localgxw);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfy
 * JD-Core Version:    0.7.0.1
 */