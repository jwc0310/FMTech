import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.google.android.apps.photos.phone.GetLocalAutoAwesomeMovieActivity;
import com.google.android.apps.plus.phone.TileCropActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public abstract class cff
  extends mca
  implements View.OnClickListener, AbsListView.OnScrollListener, att, auc, cpa, gpq, gpw, gqa, gxv, gzi, hcy, hdt, jqc, luu, lvy, lye, lzv
{
  private coz Z;
  private Integer a;
  public atu aA;
  public boolean aB;
  public int aC;
  public boolean aD;
  public boolean aE;
  public boolean aF;
  public boolean aG;
  public String aH;
  public boolean aI;
  private jov aJ;
  private jpd aK;
  private guf aa = new cfg(this);
  private guf ab = new cfh(this);
  private guf ac = new cfi(this);
  private guf ad = new cfj(this);
  private guf ae = new cfk(this);
  private boolean af;
  private boolean ag;
  private final dme ah;
  private gzj ai;
  private ArrayAdapter<cfo> aj;
  private int ak;
  public final gpk al = new gpk(this, this.bp, this);
  public git am;
  ArrayList<hdd> an;
  public boolean ao;
  public boolean ap;
  public final aty aq = new aty(this, this.bp, this);
  public final ats ar = new ats(this, this.bp, this);
  public SwipeRefreshLayoutWithUpScroll as;
  public final lvz at = new lvz(this, this.bp);
  public final gug au;
  public final anf av;
  public asl aw;
  public asr ax;
  public giz ay;
  public aud az;
  private int b = 0;
  private View c;
  private View d;
  
  public cff()
  {
    gug localgug = new gug(this.bp, (byte)0);
    this.bo.a(gug.class, localgug);
    this.au = localgug.a(aaw.iX, this.aa).a(aaw.ja, this.ab).a(aaw.jb, this.ac).a(aaw.iY, this.ad).a(aaw.iF, this.ae);
    this.av = new anf(this, this.bp);
    new hdu(this.bp, this);
    new gpy(this.bp, this);
    new lzx(this.bp, this);
    this.ah = new cfl(this);
    gzj localgzj = new gzj(this, this.bp);
    this.bo.a(gzj.class, localgzj);
    this.ai = localgzj;
  }
  
  public static Intent a(int paramInt, ipf paramipf)
  {
    int i = 1;
    Intent localIntent = new Intent();
    localIntent.putExtra("account_id", paramInt);
    int j;
    String str1;
    if (paramipf.d != null)
    {
      j = i;
      if (j == 0) {
        break label161;
      }
      str1 = paramipf.d.toString();
      label42:
      if (str1 != null) {
        localIntent.putExtra("photo_url", str1);
      }
      long l = paramipf.b.a;
      if (l != 0L) {
        localIntent.putExtra("photo_id", l);
      }
      String str2 = paramipf.a;
      if (str2 != null) {
        localIntent.putExtra("tile_id", str2);
      }
      ipm localipm = paramipf.e;
      switch (cfm.a[localipm.ordinal()])
      {
      }
    }
    for (;;)
    {
      localIntent.putExtra("media_type", i);
      return localIntent;
      j = 0;
      break;
      label161:
      str1 = paramipf.c;
      break label42;
      i = 3;
      continue;
      i = 2;
      continue;
      i = 4;
    }
  }
  
  public final void A_()
  {
    this.at.b();
    z_();
  }
  
  protected boolean E()
  {
    return this.m.getBoolean("local_folders_only");
  }
  
  protected final String F()
  {
    String str = this.m.getString("get_content_action");
    if (str != null) {
      return str;
    }
    return "android.intent.action.GET_CONTENT";
  }
  
  protected final void G()
  {
    if (this.c == null) {
      return;
    }
    View localView = this.c;
    if (this.aB) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public final boolean H()
  {
    if (this.aA.c)
    {
      f().onBackPressed();
      return true;
    }
    return false;
  }
  
  protected void I()
  {
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.dW;
    localgxx.a(localgxw);
    bp localbp = f();
    iwb localiwb = (iwb)this.bo.a(iwb.class);
    if ((this.am.e()) && (localiwb.a(this.am.c()))) {}
    for (boolean bool = true;; bool = false)
    {
      Intent localIntent = bsz.a(localbp, bool, this.am.c());
      this.au.a(aaw.iF, localIntent);
      return;
    }
  }
  
  protected Intent J()
  {
    Intent localIntent = new Intent(this.bn, GetLocalAutoAwesomeMovieActivity.class);
    localIntent.putExtra("movie_maker_session_id", UUID.randomUUID().toString());
    return localIntent;
  }
  
  final void K()
  {
    Intent localIntent = new Intent();
    if (this.aA.c)
    {
      localIntent.putExtra("photo_picker_mode", this.aA.b);
      localIntent.putExtra("photo_picker_selected", this.az.b);
      if (f() != null) {
        f().setResult(-1, localIntent);
      }
      return;
    }
    int i = this.aA.b;
    if (i == 1) {}
    for (;;)
    {
      localIntent.putExtra("photo_picker_mode", i);
      localIntent.putExtra("photo_picker_selected", null);
      break;
      i = 0;
    }
  }
  
  public final void L()
  {
    this.al.a();
  }
  
  protected final boolean M()
  {
    return this.m.getInt("mode", 0) == 1;
  }
  
  protected final coz N()
  {
    if (this.Z != null) {
      return this.Z;
    }
    this.Z = new coz(this);
    return this.Z;
  }
  
  protected final boolean O()
  {
    if (this.at == null) {
      return false;
    }
    return this.at.a();
  }
  
  public final boolean O_()
  {
    return y_();
  }
  
  protected boolean X_()
  {
    return false;
  }
  
  protected void Y_()
  {
    lvz locallvz = this.at;
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
      this.al.a();
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
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle, int paramInt)
  {
    View localView = paramLayoutInflater.inflate(paramInt, paramViewGroup, false);
    this.as = ((SwipeRefreshLayoutWithUpScroll)localView.findViewById(aaw.im));
    this.c = localView.findViewById(aaw.lU);
    this.d = localView.findViewById(aaw.dl);
    if (paramBundle != null) {}
    for (boolean bool = paramBundle.getBoolean("share_only");; bool = this.m.getBoolean("share_only"))
    {
      this.ag = bool;
      if (this.d != null) {
        this.d.setOnClickListener(this);
      }
      return localView;
    }
  }
  
  public void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Uri paramUri, int paramInt)
  {
    if (f() == null) {}
    while (paramInt != aaw.ja) {
      return;
    }
    if (paramUri == null)
    {
      this.b = 1;
      this.a = EsService.a(f(), this.am.c(), "camera-p.jpg");
      this.al.a();
      return;
    }
    b_(paramUri.toString());
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    localgzj.a.add(this);
    localgzj.a(null);
    int i;
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2)
    {
      i = 1;
      if (i == 0) {
        break label331;
      }
      this.aj = new ArrayAdapter(f(), efj.wt);
      label75:
      this.aj.setDropDownViewResource(17367049);
      Bundle localBundle = this.m;
      this.aD = localBundle.getBoolean("external");
      this.aE = localBundle.getBoolean("is_for_get_content");
      this.aG = localBundle.getBoolean("is_for_movie_maker_launch");
      this.aF = localBundle.getBoolean("force_return_edit_list");
      this.aH = localBundle.getString("movie_maker_session_id");
      this.aC = localBundle.getInt("filter", 0);
      this.ap = localBundle.getBoolean("disable_account_spinner", false);
      if (paramBundle != null)
      {
        this.b = paramBundle.getInt("operation_type", 0);
        this.an = paramBundle.getParcelableArrayList("media_snapshot");
        this.ao = paramBundle.getBoolean("mCloseActivityIfCancelled");
        if (paramBundle.containsKey("pending_request")) {
          this.a = Integer.valueOf(paramBundle.getInt("pending_request"));
        }
      }
      if ((!localBundle.getBoolean("disable_chromecast")) && (!this.aA.c()) && (this.am.e())) {
        break label352;
      }
    }
    label331:
    label352:
    for (boolean bool = true;; bool = false)
    {
      this.aI = bool;
      this.aJ.a(aaw.iQ, new cfn(this, aaw.ja)).a(aaw.iW, new cfn(this, aaw.jb));
      return;
      i = 0;
      break;
      this.aj = new ArrayAdapter(f(), efj.sw);
      break label75;
    }
  }
  
  public void a(Bundle paramBundle, String paramString) {}
  
  public final void a(ColumnGridView paramColumnGridView, int paramInt) {}
  
  public final void a(ColumnGridView paramColumnGridView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void a(gpr paramgpr)
  {
    switch (this.aA.b)
    {
    }
    for (;;)
    {
      switch (this.aA.b)
      {
      case 3: 
      default: 
        b(paramgpr);
        return;
        paramgpr.a(aaw.dN, false);
      }
    }
    int j;
    gpr localgpr;
    if ((0x2 & this.aC) != 0)
    {
      b(paramgpr);
      j = aau.vD;
      localgpr = paramgpr;
    }
    for (;;)
    {
      localgpr.d(j);
      if (this.aE) {
        break;
      }
      gqe localgqe = (gqe)paramgpr.a(aaw.iq);
      localgqe.b = Math.max(1, localgqe.b);
      return;
      if (this.aG)
      {
        j = aau.lc;
        localgpr = paramgpr;
      }
      else
      {
        j = aau.nF;
        localgpr = paramgpr;
      }
    }
    if ((0x2 & this.aC) != 0) {
      b(paramgpr);
    }
    if (this.aG) {}
    for (int i = aau.lb;; i = aau.ld)
    {
      paramgpr.d(i);
      if ((this.aE) || ((0x4 & this.aC) != 0)) {
        break;
      }
      c(paramgpr);
      return;
    }
    paramgpr.d(aau.ld);
  }
  
  protected final void a(gpr paramgpr, int paramInt)
  {
    if ((!this.am.e()) || (this.aE)) {}
    label89:
    label95:
    label106:
    for (;;)
    {
      return;
      if ((paramInt & 0x4) == 0) {
        d(paramgpr);
      }
      int i;
      if ((paramInt & 0x1) == 0)
      {
        if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) != 2) {
          break label89;
        }
        i = 1;
        if (i == 0) {
          break label95;
        }
        paramgpr.b(aaw.E);
      }
      for (;;)
      {
        if ((paramInt & 0x2) != 0) {
          break label106;
        }
        paramgpr.b(aaw.I);
        return;
        i = 0;
        break;
        paramgpr.b(aaw.F);
      }
    }
  }
  
  protected final void a(hwq paramhwq)
  {
    if (!this.at.a()) {
      if (paramhwq.g != hwt.a) {
        break label39;
      }
    }
    label39:
    for (int j = 1;; j = 0)
    {
      int i = 0;
      if (j == 0) {
        i = 1;
      }
      if (i != 0) {
        Y_();
      }
      return;
    }
  }
  
  public void a(isp paramisp)
  {
    if (!(paramisp instanceof jpu)) {
      return;
    }
    jpu localjpu = (jpu)paramisp;
    ipf localipf = localjpu.b;
    int i = this.am.c();
    bdo localbdo = new bdo(f(), i);
    localbdo.b = localipf.a;
    localbdo.c = localipf;
    if ((0x40000 & localjpu.e) != 0L) {}
    for (String str = localjpu.c;; str = localjpu.d)
    {
      localbdo.e = str;
      localbdo.p = Integer.valueOf(this.aA.b);
      localbdo.g = this.az.b;
      localbdo.w = this.aA.c();
      localbdo.r = Boolean.valueOf(false);
      localbdo.h = Boolean.valueOf(this.aE);
      localbdo.i = Boolean.valueOf(this.aG);
      localbdo.j = this.aH;
      localbdo.m = Boolean.valueOf(this.aF);
      localbdo.q = Integer.valueOf(this.aC);
      b(localbdo.a());
      return;
    }
  }
  
  public void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (paramString == null) || (f() == null) || (f().isFinishing())) {}
    for (;;)
    {
      return;
      if (paramhae.b != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        this.aB = true;
        return;
      }
    }
  }
  
  public final void a(ArrayList<hdd> paramArrayList, int paramInt)
  {
    if (f() == null) {}
    do
    {
      return;
      this.an = paramArrayList;
    } while (paramInt != aaw.ja);
    this.aJ.a(this.aK, aaw.iQ, Collections.singletonList("android.permission.CAMERA"));
  }
  
  public void a(tp paramtp)
  {
    efj.a(paramtp, true);
    if (this.aD) {
      paramtp.c(false);
    }
    if (X_())
    {
      List localList = this.ay.a(new String[] { "logged_in" });
      Collections.sort(localList, new gis(this.ay));
      int i = localList.size();
      int j;
      if ((this.am.e()) && (i >= 2) && (!E())) {
        j = 1;
      }
      while (j != 0)
      {
        this.aj.clear();
        int k = 0;
        for (;;)
        {
          if (k < i)
          {
            int m = ((Integer)localList.get(k)).intValue();
            if (this.am.c() == m) {
              this.ak = k;
            }
            this.aj.add(new cfo(this, m));
            k++;
            continue;
            j = 0;
            break;
          }
        }
        View localView = View.inflate(f(), efj.sv, null);
        ActionBarSpinner localActionBarSpinner = (ActionBarSpinner)localView.findViewById(aaw.hS);
        localActionBarSpinner.setAdapter(this.aj);
        localActionBarSpinner.setSelection(this.ak);
        localActionBarSpinner.a(this);
        paramtp.a(localView);
        paramtp.e(true);
        paramtp.d(false);
      }
    }
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    boolean bool;
    if (i == aaw.iq)
    {
      z_();
      bool = true;
    }
    int j;
    do
    {
      return bool;
      if ((i == aaw.y) || (i == aaw.z))
      {
        b(false);
        return true;
      }
      if ((i == aaw.A) || (i == aaw.B))
      {
        this.aJ.a(this.aK, aaw.iW, Collections.singletonList("android.permission.CAMERA"));
        return true;
      }
      if (i == aaw.I)
      {
        gxx localgxx = (gxx)this.bo.a(gxx.class);
        gxw localgxw = new gxw(this.bn);
        localgxw.c = gxz.df;
        localgxx.a(localgxw);
        int k = this.am.c();
        a(efj.k(f(), k, null));
        return true;
      }
      if ((i == aaw.E) || (i == aaw.F))
      {
        I();
        return true;
      }
      j = aaw.jv;
      bool = false;
    } while (i != j);
    b(null);
    return true;
  }
  
  public abstract boolean a(View paramView);
  
  protected final boolean a(ipf paramipf)
  {
    int i = this.m.getInt("photo_picker_crop_mode", 0);
    if ((this.aA.b == 1) && ((this.aD) || (i != 0))) {}
    for (int j = 1; j == 0; j = 0) {
      return false;
    }
    if (i != 0)
    {
      int k = this.am.c();
      dbu localdbu = new dbu(f(), TileCropActivity.class, k);
      localdbu.a = paramipf;
      localdbu.b = i;
      localdbu.e = Integer.valueOf(this.m.getInt("photo_min_width", 0));
      localdbu.f = Integer.valueOf(this.m.getInt("photo_min_height", 0));
      Intent localIntent2 = localdbu.a();
      this.au.a(aaw.iY, localIntent2);
      return true;
    }
    if (this.aE) {}
    for (Intent localIntent1 = dbs.a(F(), this.aC, paramipf, f());; localIntent1 = a(this.am.c(), paramipf))
    {
      f().setResult(-1, localIntent1);
      f().finish();
      break;
    }
  }
  
  public final void a_(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    Toast localToast = Toast.makeText(f(), aau.cQ, 0);
    localToast.setGravity(51, arrayOfInt[0], arrayOfInt[1]);
    localToast.show();
  }
  
  public boolean a_(int paramInt)
  {
    if (this.ak == paramInt) {
      return false;
    }
    this.ak = paramInt;
    int i = ((cfo)this.aj.getItem(paramInt)).a;
    ikt localikt = (ikt)this.bo.a(ikt.class);
    ilf localilf = new ilf();
    localilf.g = true;
    localilf.c = i;
    localikt.a(localilf);
    return true;
  }
  
  final void b(int paramInt, dmx paramdmx)
  {
    int i = 1;
    if ((this.a == null) || (this.a.intValue() != paramInt)) {}
    label80:
    label85:
    do
    {
      return;
      this.a = null;
      int j;
      if (paramdmx != null) {
        if (paramdmx.c != 200)
        {
          j = i;
          if (j == 0) {
            break label80;
          }
        }
      }
      for (;;)
      {
        this.av.a();
        if (i == 0) {
          break label85;
        }
        Toast.makeText(f(), aau.mm, 0).show();
        return;
        j = 0;
        break;
        i = 0;
      }
      switch (this.b)
      {
      default: 
        return;
      }
    } while (!(paramdmx instanceof dmp));
    b_(((dmp)paramdmx).a);
  }
  
  public final void b(Intent paramIntent)
  {
    if (this.af) {
      return;
    }
    this.af = true;
    paramIntent.putExtra("delete_duplicate_photos", this.m.getBoolean("delete_duplicate_photos", false));
    if (this.aA.c())
    {
      this.au.a(aaw.iX, paramIntent);
      return;
    }
    gug localgug = this.au;
    gvh localgvh = localgug.b;
    int i = localgvh.a;
    localgvh.a = (i + 1);
    localgug.a.a.startActivityForResult(paramIntent, i);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(Bundle paramBundle, String paramString)
  {
    if (paramBundle.getBoolean("deselect_on_dismiss", false)) {
      this.ar.a(0);
    }
  }
  
  protected void b(View paramView) {}
  
  protected final void b(PhotoTileView paramPhotoTileView)
  {
    if (this.aA.c()) {}
    do
    {
      return;
      this.ar.a(4);
    } while ((paramPhotoTileView == null) || (!paramPhotoTileView.H));
    aty localaty = this.aq;
    localaty.c(new aua(localaty, 1, paramPhotoTileView.a));
  }
  
  public void b(gpr paramgpr)
  {
    int i = 1;
    int j;
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2)
    {
      j = i;
      if (j != 0) {
        paramgpr.c(aaw.I).setIcon(efj.rV);
      }
      if (!v()) {
        if (this.aA.b != 0) {
          break label80;
        }
      }
    }
    for (;;)
    {
      if (i != 0) {
        paramgpr.b(aaw.jv);
      }
      return;
      j = 0;
      break;
      label80:
      i = 0;
    }
  }
  
  public void b(tp paramtp)
  {
    if (X_())
    {
      paramtp.a(null);
      paramtp.e(false);
      paramtp.d(true);
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    this.ao = paramBoolean;
    new hda(f(), this, aaw.ja).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
  }
  
  protected void b_(String paramString)
  {
    this.av.a();
    bp localbp = f();
    Bundle localBundle;
    int i;
    isq localisq;
    jpu localjpu;
    Intent localIntent;
    if (localbp != null)
    {
      localBundle = this.m;
      i = 0;
      if (localBundle != null) {
        break label133;
      }
      if (i == 0)
      {
        localisq = this.az.b;
        String str = jrf.a();
        localjpu = new jpu(str, str, ipf.a(localbp, Uri.parse(paramString), ipm.a), 4096L, 0L);
        localIntent = new Intent();
        if (localisq != null) {
          break label146;
        }
      }
    }
    label133:
    label146:
    for (ArrayList localArrayList = new ArrayList(1);; localArrayList = localisq.a(jpx.class))
    {
      localArrayList.add(localjpu);
      localIntent.putExtra("shareables", localArrayList);
      f().setResult(-1, localIntent);
      localbp.finish();
      return;
      i = localBundle.getInt("photo_picker_crop_mode", 0);
      break;
    }
  }
  
  protected final void c(int paramInt)
  {
    f().getWindow().getDecorView().performHapticFeedback(0, 1);
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.am = ((git)this.bo.a(git.class));
    this.bo.a(dxl.class, this.aq);
    this.bo.a(cpa.class, this);
    this.ay = ((giz)this.bo.a(giz.class));
    this.az = ((aud)this.bo.a(aud.class));
    this.aA = ((atu)this.bo.a(atu.class));
    this.aw = ((asl)this.bo.a(asl.class));
    this.ax = ((asr)this.bo.a(asr.class));
    this.aJ = ((jov)this.bo.a(jov.class));
    this.aK = ((jpd)this.bo.a(jpd.class));
    this.Z = ((coz)this.bo.b.b(coz.class));
    if (this.Z == null)
    {
      this.Z = new coz(this);
      this.bo.a(coz.class, this.Z);
    }
  }
  
  public final void c(Bundle paramBundle, String paramString)
  {
    if (paramBundle.getBoolean("deselect_on_dismiss", false)) {
      this.ar.a(0);
    }
  }
  
  protected final void c(gpr paramgpr)
  {
    int i = 1;
    int j;
    label50:
    int k;
    if ((this.a == null) || (this.b != i))
    {
      if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2)
      {
        j = i;
        if (j == 0) {
          break label104;
        }
        paramgpr.b(aaw.y);
      }
    }
    else
    {
      if ((0x1 & this.aC) == 0) {
        break label117;
      }
      k = i;
      label62:
      if (k == 0) {
        if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) != 2) {
          break label123;
        }
      }
    }
    for (;;)
    {
      if (i == 0) {
        break label128;
      }
      paramgpr.b(aaw.A);
      return;
      j = 0;
      break;
      label104:
      paramgpr.b(aaw.z);
      break label50;
      label117:
      k = 0;
      break label62;
      label123:
      i = 0;
    }
    label128:
    paramgpr.b(aaw.B);
  }
  
  public void d()
  {
    b(this.N);
    K();
    if (!this.aA.c())
    {
      aty localaty = this.aq;
      aud localaud = localaty.a;
      isq localisq = localaud.b;
      localisq.a.clear();
      localisq.b = 0;
      localisq.c = 0;
      localisq.d = 0;
      localisq.g = 0;
      localisq.h = 0;
      localisq.e = 0;
      localisq.i = 0;
      localisq.j = 0;
      localisq.k = 0;
      localaud.c();
      localaty.a();
    }
  }
  
  public final void d(gpr paramgpr)
  {
    if (!this.aI) {
      ((bgs)paramgpr.a(aaw.aW)).a = this.am.c();
    }
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("share_only", this.ag);
    paramBundle.putInt("operation_type", this.b);
    if (this.a != null) {
      paramBundle.putInt("pending_request", this.a.intValue());
    }
    paramBundle.putBoolean("mCloseActivityIfCancelled", this.ao);
    paramBundle.putParcelableArrayList("media_snapshot", this.an);
  }
  
  public void m()
  {
    super.m();
    this.af = false;
    ((jqb)this.bo.a(jqb.class)).a(this);
    this.al.a();
    EsService.a(this.bn, this.ah);
    if (this.a != null)
    {
      int i = this.a.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.a.intValue());
        b(this.a.intValue(), localdmx);
      }
    }
  }
  
  public void n()
  {
    super.n();
    dme localdme = this.ah;
    EsService.d.remove(localdme);
    ((jqb)this.bo.a(jqb.class)).b(this);
  }
  
  public final void onClick(View paramView)
  {
    if ((this.aA.c()) && ((paramView instanceof PhotoTileView)) && (!((PhotoTileView)paramView).H))
    {
      int[] arrayOfInt = new int[2];
      paramView.getLocationOnScreen(arrayOfInt);
      Toast localToast = Toast.makeText(this.bn, aau.cQ, 0);
      localToast.setGravity(51, arrayOfInt[0], arrayOfInt[1]);
      localToast.show();
    }
    for (boolean bool = true;; bool = a(paramView))
    {
      if ((!bool) && (paramView == this.d)) {
        z_();
      }
      return;
    }
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
  
  public boolean s_()
  {
    efj.k(this.N);
    if (this.m.getBoolean("finish_on_back", false))
    {
      bp localbp = f();
      f().setResult(0, null);
      localbp.finish();
      return true;
    }
    if ((this.aA.c) || (this.aE))
    {
      K();
      f().finish();
      return true;
    }
    return false;
  }
  
  public boolean t_()
  {
    this.ax.a();
    return false;
  }
  
  public abstract boolean v();
  
  public final void v_()
  {
    b(this.N);
  }
  
  public final void w_()
  {
    K();
  }
  
  public void x_()
  {
    if (!this.aA.c()) {
      this.ag = false;
    }
  }
  
  public boolean y_()
  {
    return (this.ai.a("fetch_newer")) || (this.ai.a("fetch_older"));
  }
  
  public boolean z()
  {
    isq localisq = this.az.b;
    int i = this.aA.b;
    if (((localisq == null) || (localisq.b == 0)) && ((i == 0) || (i == 5))) {}
    for (int j = 1; (this.am.e()) && (j != 0); j = 0) {
      return true;
    }
    return false;
  }
  
  protected void z_()
  {
    lvz locallvz = this.at;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cff
 * JD-Core Version:    0.7.0.1
 */