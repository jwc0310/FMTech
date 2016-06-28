import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.plus.phone.EditEventActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.EventThemeView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class cbs
  extends mca
  implements byg, cw<Cursor>, dat, dwb, gpq, gxv, gzi, luu, lvy
{
  private static int al;
  int Z;
  git a;
  private Integer aA;
  private Integer aB;
  private boolean aC;
  private Integer aD;
  private boolean aE;
  private boolean aF;
  private boolean aG;
  private int aH = -1;
  private ColumnGridView aI;
  private boolean aJ;
  private long aK;
  private ill aL;
  private final hwq aM = new hwq(this.bp);
  private final jpe aN = new cbt(this);
  private final lvz aO;
  private ContentObserver aP;
  private final dme aQ;
  String aa;
  String ab;
  int ac;
  boolean ad;
  String ae;
  String af;
  Integer ag;
  Integer ah;
  boolean ai;
  Integer aj;
  byte[] ak;
  private final gpk am = new gpk(this, this.bp, this);
  private jov an;
  private jpd ao;
  private lmj ap;
  private int aq;
  private String ar;
  private boolean as;
  private boolean at;
  private bzu au = new bzu();
  private Runnable av;
  private boolean aw;
  private dar ax;
  private int ay = -2147483648;
  private Integer az;
  String b;
  String c;
  hxj d;
  
  public cbs()
  {
    new gzc(this, new cch(this));
    this.aO = new lvz(this, this.bp);
    this.aP = new cbu(this, efj.m());
    this.aQ = new cbv(this);
  }
  
  private final void G()
  {
    jov localjov = this.an;
    jpd localjpd = this.ao;
    int i = aaw.iN;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "android.permission.READ_EXTERNAL_STORAGE";
    arrayOfString[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
    localjov.a(localjpd, i, Arrays.asList(arrayOfString));
  }
  
  private final void H()
  {
    if (this.d == null) {}
    qby localqby;
    do
    {
      return;
      localqby = this.d.f().b;
    } while ((localqby == null) || (localqby.b == null));
    int i = this.a.c();
    bp localbp = f();
    int j = aau.gl;
    String str = g().getString(j);
    Boolean localBoolean = localqby.b.a;
    boolean bool;
    if (localBoolean == null)
    {
      bool = false;
      if (!bool) {
        break label117;
      }
    }
    label117:
    for (int k = 12;; k = 11)
    {
      a(efj.a(localbp, i, str, null, k, false, false, true, false), 2);
      return;
      bool = localBoolean.booleanValue();
      break;
    }
  }
  
  private final void I()
  {
    boolean bool = true;
    lvz locallvz = this.aO;
    if (locallvz.a != null)
    {
      SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if ((!localSwipeRefreshLayoutWithUpScroll.b) && (localSwipeRefreshLayoutWithUpScroll.isEnabled())) {
        localSwipeRefreshLayoutWithUpScroll.a(bool);
      }
    }
    if (!this.aO.a()) {}
    for (;;)
    {
      a(bool);
      return;
      bool = false;
    }
  }
  
  private final void J()
  {
    if (this.av != null)
    {
      Runnable localRunnable = this.av;
      efj.m().removeCallbacks(localRunnable);
      this.av = null;
    }
  }
  
  private final void K()
  {
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  private final void L()
  {
    if (this.d == null) {}
    dwt localdwt;
    do
    {
      View localView;
      do
      {
        return;
        localView = this.N;
      } while (localView == null);
      localdwt = (dwt)localView.findViewById(aaw.dq);
    } while (localdwt == null);
    localdwt.a(this.d, this.au, this);
    localdwt.invalidate();
  }
  
  private final void M()
  {
    boolean bool1 = true;
    if (this.d == null) {
      return;
    }
    this.au.d = this.at;
    String str = this.a.f().b("gaia_id");
    this.au.g = TextUtils.equals(str, this.d.c());
    int i = this.a.c();
    this.au.f = bqo.b(f(), this.d, i);
    bzu localbzu1 = this.au;
    boolean bool2;
    bzu localbzu2;
    if (this.az == null)
    {
      bool2 = bool1;
      localbzu1.c = bool2;
      this.au.b = this.ay;
      this.au.a = this.aq;
      localbzu2 = this.au;
      if (this.ar == null) {
        break label162;
      }
    }
    for (;;)
    {
      localbzu2.h = bool1;
      this.Z = 0;
      return;
      bool2 = false;
      break;
      label162:
      bool1 = false;
    }
  }
  
  private static void a(Context paramContext, qdq paramqdq)
  {
    int i = 1;
    String str1 = paramqdq.f;
    Double localDouble2;
    Double localDouble1;
    String str2;
    int j;
    label60:
    int k;
    label73:
    label81:
    Uri.Builder localBuilder;
    if (paramqdq.e != null)
    {
      qdd localqdd = (qdd)paramqdq.e.b(qdd.a);
      localDouble2 = localqdd.c;
      localDouble1 = localqdd.d;
      str2 = localqdd.b;
      if (TextUtils.isEmpty(str1)) {
        break label202;
      }
      j = i;
      if ((localDouble2 == null) || (localDouble1 == null)) {
        break label208;
      }
      k = i;
      if (TextUtils.isEmpty(str2)) {
        break label214;
      }
      localBuilder = Uri.parse("http://maps.google.com/maps").buildUpon();
      if (k != 0)
      {
        String str3 = String.valueOf(localDouble2);
        String str4 = String.valueOf(localDouble1);
        localBuilder.appendQueryParameter("ll", 1 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + "," + str4);
      }
      if (j == 0) {
        break label219;
      }
      localBuilder.appendQueryParameter("cid", str1);
    }
    for (;;)
    {
      efj.b(paramContext, localBuilder.build());
      return;
      str2 = null;
      localDouble1 = null;
      localDouble2 = null;
      break;
      label202:
      j = 0;
      break label60;
      label208:
      k = 0;
      break label73;
      label214:
      i = 0;
      break label81;
      label219:
      if (k != 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localDouble2).append(',').append(localDouble1);
        if (i != 0) {
          localStringBuilder.append('(').append(str2).append(')');
        }
        localBuilder.appendQueryParameter("q", localStringBuilder.toString());
      }
      else if (i != 0)
      {
        localBuilder.appendQueryParameter("q", str2);
      }
    }
  }
  
  private final void a(View paramView)
  {
    if (paramView == null) {
      return;
    }
    TextView localTextView = (TextView)paramView.findViewById(aaw.jD);
    View localView = paramView.findViewById(aaw.dS);
    if (this.aC)
    {
      localTextView.setVisibility(0);
      localTextView.setText(aau.gi);
      localView.setVisibility(8);
      hwq localhwq4 = this.aM;
      hwt localhwt4 = hwt.b;
      if (localhwt4 == null) {
        throw new NullPointerException();
      }
      localhwq4.g = ((hwt)localhwt4);
      localhwq4.a();
    }
    for (;;)
    {
      v();
      return;
      if (this.d != null)
      {
        localTextView.setVisibility(8);
        localView.setVisibility(0);
        hwq localhwq3 = this.aM;
        hwt localhwt3 = hwt.b;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq3.g = ((hwt)localhwt3);
        localhwq3.a();
      }
      else if ((!this.aF) || (this.ag != null))
      {
        localView.setVisibility(8);
        localTextView.setVisibility(8);
        hwq localhwq1 = this.aM;
        hwt localhwt1 = hwt.a;
        if (localhwt1 == null) {
          throw new NullPointerException();
        }
        localhwq1.g = ((hwt)localhwt1);
        localhwq1.a();
      }
      else if (this.aE)
      {
        localTextView.setVisibility(0);
        localTextView.setText(aau.gg);
        localView.setVisibility(8);
        hwq localhwq2 = this.aM;
        hwt localhwt2 = hwt.b;
        if (localhwt2 == null) {
          throw new NullPointerException();
        }
        localhwq2.g = ((hwt)localhwt2);
        localhwq2.a();
      }
    }
  }
  
  private final void g(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = aau.fJ;; i = aau.fg)
    {
      d(i);
      mbf localmbf = this.bn;
      int j = this.a.c();
      String str = this.ar;
      Intent localIntent = EsService.e.a(localmbf, EsService.class);
      localIntent.putExtra("op", 36);
      localIntent.putExtra("account_id", j);
      localIntent.putExtra("aid", str);
      localIntent.putExtra("enabled", paramBoolean);
      this.aD = Integer.valueOf(EsService.a(localmbf, localIntent));
      return;
    }
  }
  
  private final void h(boolean paramBoolean)
  {
    if (this.av != null) {
      return;
    }
    this.av = new ccg(this, paramBoolean);
    Runnable localRunnable = this.av;
    efj.m().postDelayed(localRunnable, 60000L);
  }
  
  public final void A()
  {
    if (this.d == null) {
      return;
    }
    int i;
    label20:
    int j;
    Intent localIntent;
    if (this.d.a != null)
    {
      i = 0;
      j = this.a.c();
      if ((i != 0) || (this.d.f().g == null)) {
        break label194;
      }
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.av;
      localgxx.a(localgxw);
      localIntent = efj.h(f(), j, this.d.f().g.a);
    }
    label114:
    bp localbp;
    label194:
    hxj localhxj;
    for (;;)
    {
      if (localIntent != null)
      {
        try
        {
          efj.b(f(), localIntent);
          return;
        }
        catch (ActivityNotFoundException localActivityNotFoundException) {}
        if (!Log.isLoggable("HostedEventFragment", 6)) {
          break;
        }
        String str2 = String.valueOf(localIntent);
        Log.e("HostedEventFragment", 24 + String.valueOf(str2).length() + "Cannot launch activity: " + str2, localActivityNotFoundException);
        return;
        i = 1;
        break label20;
        localIntent = null;
        if (i == 1)
        {
          localbp = f();
          localhxj = this.d;
          if (localhxj.a == null) {
            break label272;
          }
        }
      }
    }
    label272:
    for (String str1 = null;; str1 = localhxj.b.p)
    {
      localIntent = efj.a(localbp, "vnd.google.android.hangouts/vnd.google.android.hangout_on_air_whitelist", j, true);
      if (localIntent != null)
      {
        localIntent.putExtra("hangout_external_key", str1);
        localIntent.putExtra("hangout_external_key_type", "hoaevent");
      }
      if (localIntent == null) {
        break label114;
      }
      this.aw = true;
      break label114;
      break;
    }
  }
  
  public final void A_()
  {
    this.aO.b();
    I();
  }
  
  public final void B()
  {
    if (this.d == null) {}
    label414:
    label585:
    for (;;)
    {
      return;
      qdj localqdj = this.d.b;
      boolean bool = dtz.a(this.bn, "com.google.android.youtube");
      gxx localgxx = (gxx)mbb.a(this.bn, gxx.class);
      StringBuilder localStringBuilder;
      gxz localgxz2;
      label238:
      int i;
      Object localObject;
      if ((localqdj != null) && (!TextUtils.isEmpty(localqdj.m)) && (bqo.c(localqdj)))
      {
        mfz localmfz = (mfz)mfx.a.get();
        localmfz.b = (1 + localmfz.b);
        if (localmfz.b == 1)
        {
          localStringBuilder = localmfz.a;
          localStringBuilder.append(efj.j("https://plus.google.com/hangouts/onair/watch?hl=%locale%&d=r&hid=hoaevent/")).append(localqdj.g).append("&ytl=").append(localqdj.m);
          if ((localqdj.l != null) && (localqdj.l.f != null) && (!TextUtils.isEmpty(localqdj.l.f.a)) && (efj.z(localqdj.l.f.a) != null)) {
            localStringBuilder.append("&preroll=").append(efj.z(localqdj.l.f.a));
          }
          String str3 = mfx.b(localStringBuilder);
          localgxz2 = gxz.aW;
          if (bqo.a(localqdj))
          {
            if (!bqo.b(localqdj)) {
              break label414;
            }
            localgxz2 = gxz.aV;
          }
          gxw localgxw3 = new gxw(this.bn);
          localgxw3.c = localgxz2;
          localgxx.a(localgxw3);
          i = 0;
          localObject = str3;
        }
      }
      for (;;)
      {
        if (localObject == null) {
          break label585;
        }
        Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject));
        localIntent.addFlags(524288);
        if (i != 0)
        {
          localIntent.setPackage("com.google.android.youtube");
          if (this.bn.getPackageManager().resolveActivity(localIntent, 0) == null) {
            localIntent.setPackage(null);
          }
        }
        try
        {
          a(localIntent);
          return;
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          String str1 = String.valueOf(localIntent);
          Log.e("HostedEventFragment", 24 + String.valueOf(str1).length() + "Cannot launch activity: " + str1, localActivityNotFoundException);
          return;
        }
        localStringBuilder = new StringBuilder(256);
        break;
        localgxz2 = gxz.aU;
        break label238;
        if (bqo.a(localqdj))
        {
          String str2 = efj.A(localqdj.m);
          if (bqo.b(localqdj)) {}
          for (gxz localgxz1 = gxz.aS;; localgxz1 = gxz.aR)
          {
            gxw localgxw2 = new gxw(this.bn);
            localgxw2.c = localgxz1;
            localgxx.a(localgxw2);
            i = bool;
            localObject = str2;
            break;
          }
        }
        if ((this.d.f().f != null) && (!TextUtils.isEmpty(this.d.f().f.a)))
        {
          localObject = this.d.f().f.a;
          gxw localgxw1 = new gxw(this.bn);
          localgxw1.c = gxz.aT;
          localgxx.a(localgxw1);
          i = bool;
        }
        else
        {
          i = bool;
          localObject = null;
        }
      }
    }
  }
  
  public final void C()
  {
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.ax;
    localgxx.a(localgxw);
    int i = this.a.c();
    bp localbp = f();
    String str1 = this.b;
    String str2 = this.ab;
    if (this.d != null) {}
    for (String str3 = this.d.c();; str3 = null)
    {
      a(efj.a(localbp, i, str1, str2, str3));
      return;
    }
  }
  
  public final void D()
  {
    H();
  }
  
  public final void E()
  {
    G();
  }
  
  public final void F()
  {
    if (!this.aL.a()) {
      this.bn.startActivity(this.aL.b());
    }
    gzj localgzj;
    do
    {
      do
      {
        return;
      } while ((this.ar == null) || (EsService.a(this.ar)));
      localgzj = (gzj)this.bo.a(gzj.class);
      if ((this.ap != null) && (this.ap.c))
      {
        localgzj.b(new bnb(this.bn, this.a.c(), this.ar, false, false));
        return;
      }
    } while (this.d == null);
    qdu localqdu = this.d.f();
    boolean bool1 = false;
    Boolean localBoolean;
    if (localqdu != null)
    {
      qby localqby = localqdu.b;
      bool1 = false;
      if (localqby != null)
      {
        qbx localqbx = localqdu.b.b;
        bool1 = false;
        if (localqbx != null)
        {
          localBoolean = localqdu.b.b.a;
          if (localBoolean != null) {
            break label241;
          }
        }
      }
    }
    label241:
    for (boolean bool3 = false;; bool3 = localBoolean.booleanValue())
    {
      bool1 = false;
      if (bool3) {
        bool1 = true;
      }
      boolean bool2 = efj.a(this.bn, this.x, this.a.c(), bool1, "plus_one_promo");
      localgzj.b(new bnb(this.bn, this.a.c(), this.ar, true, bool2));
      return;
    }
  }
  
  public final boolean O_()
  {
    return (this.aB != null) || ((!this.aC) && ((this.ag != null) || (!this.aF)));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.ue, paramViewGroup, false);
    this.aI = ((ColumnGridView)localView.findViewById(aaw.dS));
    bp localbp = f();
    this.a.c();
    this.ax = new dar(localbp, this.aI, this, this);
    this.aI.a(this.ax);
    k().a(0, null, this);
    k().a(1, null, this);
    k().a(2, null, this);
    if (al == 0) {
      if (!efj.b(efj.K(f()))) {
        break label138;
      }
    }
    label138:
    for (al = 16;; al = 8)
    {
      a(localView);
      return localView;
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    bp localbp = f();
    int i = this.a.c();
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new cbw(this, localbp, hxi.a, localbp, i);
    case 1: 
      return new cbx(this, localbp, hxi.a, localbp, i);
    }
    return new cby(this, localbp, hxi.a, localbp, i);
  }
  
  public final void a(int paramInt)
  {
    if ((this.aJ) || (this.af == null) || (this.aE) || (this.aI == null)) {}
    while (paramInt < this.ax.getCount() - al) {
      return;
    }
    this.aJ = true;
    this.aI.post(new cca(this));
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      switch (paramInt1)
      {
      }
    }
    ArrayList localArrayList;
    bp localbp;
    do
    {
      do
      {
        do
        {
          return;
          gxx localgxx2 = (gxx)this.bo.a(gxx.class);
          gxw localgxw2 = new gxw(this.bn);
          localgxw2.c = gxz.az;
          localgxx2.a(localgxw2);
          return;
          switch (paramInt1)
          {
          default: 
            return;
          case 2: 
            gxx localgxx1 = (gxx)this.bo.a(gxx.class);
            gxw localgxw1 = new gxw(this.bn);
            localgxw1.c = gxz.ay;
            localgxx1.a(localgxw1);
            ccb localccb = new ccb(this, (gnb)paramIntent.getParcelableExtra("extra_acl"));
            efj.m().post(localccb);
            return;
          }
        } while ((paramInt2 != -1) || (paramIntent == null));
        localArrayList = paramIntent.getParcelableArrayListExtra("shareables");
      } while (localArrayList == null);
      localbp = f();
      Toast.makeText(localbp, aau.gF, 1).show();
    } while (localArrayList.size() == 0);
    new cci(localbp, this.a.c(), this.b, localArrayList).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  final void a(int paramInt, dmx paramdmx)
  {
    if ((this.aB == null) || (this.aB.intValue() != paramInt)) {
      return;
    }
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
    this.aB = null;
    v();
    bp localbp = f();
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        Toast.makeText(localbp, aau.uV, 0).show();
        return;
      }
    }
    Toast.makeText(localbp, aau.si, 0).show();
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    this.au.e = true;
    if (paramBundle != null)
    {
      this.b = paramBundle.getString("id");
      this.Z = paramBundle.getInt("typeid");
      this.aa = paramBundle.getString("invitation_token");
      this.ac = paramBundle.getInt("incoming_rsvp_type", -2147483648);
      this.ai = paramBundle.getBoolean("refresh", false);
      this.aH = paramBundle.getInt("scroll_pos", -1);
      this.aK = paramBundle.getLong("first_timestamp");
      if (paramBundle.containsKey("fetch_req_id")) {
        this.ag = Integer.valueOf(paramBundle.getInt("fetch_req_id"));
      }
      if (paramBundle.containsKey("comment_req_id")) {
        this.aA = Integer.valueOf(paramBundle.getInt("comment_req_id"));
      }
      if (paramBundle.containsKey("invite_more_req_id")) {
        this.ah = Integer.valueOf(paramBundle.getInt("invite_more_req_id"));
      }
      if (paramBundle.containsKey("rsvp_req_id")) {
        this.az = Integer.valueOf(paramBundle.getInt("rsvp_req_id"));
      }
      if (paramBundle.containsKey("set_comment_availability_id")) {
        this.aD = Integer.valueOf(paramBundle.getInt("set_comment_availability_id"));
      }
      if (paramBundle.containsKey("temp_rsvp_state")) {
        this.ay = paramBundle.getInt("temp_rsvp_state", -2147483648);
      }
      if (paramBundle.containsKey("delete_req_id")) {
        this.aj = Integer.valueOf(paramBundle.getInt("delete_req_id"));
      }
      if (paramBundle.containsKey("abuse_request_id")) {
        this.aB = Integer.valueOf(paramBundle.getInt("abuse_request_id"));
      }
      if (paramBundle.containsKey("view_logged")) {
        this.aG = paramBundle.getBoolean("view_logged");
      }
      if (!this.aG)
      {
        gxx localgxx = (gxx)this.bo.a(gxx.class);
        gxw localgxw = new gxw(this.bn);
        localgxw.c = gxz.aB;
        localgxx.a(localgxw);
        this.aG = true;
      }
      this.au.e = paramBundle.getBoolean("expanded", true);
      this.ad = paramBundle.getBoolean("fetching_newer", false);
    }
    for (;;)
    {
      if (this.ac != -2147483648)
      {
        c(this.ac);
        this.ac = -2147483648;
      }
      this.an.a(aaw.iN, this.aN);
      return;
      if (this.b != null)
      {
        this.ai = true;
      }
      else
      {
        this.aC = true;
        a(this.N);
      }
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    bp localbp = f();
    if ("report_event".equals(paramString))
    {
      this.aB = Integer.valueOf(EsService.a(localbp, this.a.c(), this.ar, null));
      d(aau.sk);
    }
  }
  
  public final void a(dwx paramdwx)
  {
    bz localbz = this.x;
    if (localbz.a("update_card") != null) {
      return;
    }
    cae localcae = new cae();
    localcae.Z = paramdwx;
    localcae.n = this;
    localcae.p = 0;
    localcae.a(localbz, "update_card");
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    int i = 1;
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(i, localgqe.b);
    gjb localgjb = this.a.f();
    String str = localgjb.b("gaia_id");
    boolean bool = localgjb.c("is_google_plus");
    int j;
    int k;
    label104:
    int m;
    if ((bool) && (this.ar != null) && (bqo.a(this.d, str)))
    {
      j = i;
      if ((!bool) || (!this.as)) {
        break label285;
      }
      k = i;
      if ((!bool) || (this.d == null) || (!TextUtils.equals(this.d.c(), str))) {
        break label291;
      }
      m = i;
      label134:
      if ((!bool) || (m != 0) || (this.ar == null) || (this.aB != null)) {
        break label297;
      }
      label158:
      if (j != 0) {
        paramgpr.b(aaw.x);
      }
      if (k != 0) {
        paramgpr.b(aaw.w);
      }
      if (m != 0)
      {
        paramgpr.b(aaw.cS);
        paramgpr.b(aaw.cn);
        if (k == 0) {
          break label302;
        }
      }
    }
    label285:
    label291:
    label297:
    label302:
    for (int n = aaw.cz;; n = aaw.dd)
    {
      paramgpr.b(n);
      if ((bool) && (this.au != null) && (this.au.f)) {
        paramgpr.b(aaw.eo);
      }
      if (i != 0) {
        paramgpr.b(aaw.iy);
      }
      return;
      j = 0;
      break;
      k = 0;
      break label104;
      m = 0;
      break label134;
      i = 0;
      break label158;
    }
  }
  
  public final void a(String paramString)
  {
    if ((this.ar == null) || (TextUtils.isEmpty(paramString))) {
      return;
    }
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.aH;
    localgxx.a(localgxw);
    d(aau.fW);
    bp localbp = f();
    int i = this.a.c();
    String str1 = this.ar;
    String str2 = this.b;
    String str3 = this.ab;
    byte[] arrayOfByte = this.ak;
    Intent localIntent = EsService.e.a(localbp, EsService.class);
    localIntent.putExtra("op", 31);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("aid", str1);
    localIntent.putExtra("event_id", str2);
    localIntent.putExtra("auth_key", str3);
    localIntent.putExtra("content", paramString);
    localIntent.putExtra("promoted_post_data", arrayOfByte);
    this.aA = Integer.valueOf(EsService.a(localbp, localIntent));
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("EventPlusOneTask".equals(paramString)) && (hae.a(paramhae))) {
      k().b(0, null, this);
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    EsService.a(this.bn, this.a.c(), paramString1, Long.parseLong(paramString2));
  }
  
  public final void a(okn paramokn)
  {
    int i = this.a.c();
    bdo localbdo = new bdo(f(), i);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = jrf.a(null, this.c, this.b, "PLUS_EVENT");
    String str1 = jrf.a(3, arrayOfString);
    okm localokm = (okm)paramokn.b(okm.a);
    if ((localokm != null) && (localokm.b != null)) {}
    for (String str2 = localokm.b.d;; str2 = null)
    {
      localbdo.d = str2;
      localbdo.e = str1;
      localbdo.k = Boolean.valueOf(true);
      localbdo.v = Boolean.valueOf(true);
      a(localbdo.a());
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.dm;
      localgxx.a(localgxw);
      return;
    }
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
  }
  
  final void a(boolean paramBoolean)
  {
    this.aE = false;
    this.ad = true;
    String str1;
    String str2;
    if (paramBoolean)
    {
      str1 = null;
      str2 = null;
      if (!paramBoolean) {
        break label76;
      }
    }
    for (;;)
    {
      this.ag = Integer.valueOf(EsService.a(f(), this.a.c(), this.b, str1, str2, this.aa, this.ab, this.ad));
      v();
      return;
      str1 = this.ae;
      break;
      label76:
      str2 = this.af;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    boolean bool;
    if (i == aaw.iq)
    {
      I();
      bool = true;
    }
    int j;
    do
    {
      return bool;
      if (i == aaw.x)
      {
        gxx localgxx6 = (gxx)this.bo.a(gxx.class);
        gxw localgxw6 = new gxw(this.bn);
        localgxw6.c = gxz.aA;
        localgxx6.a(localgxw6);
        G();
        return true;
      }
      if (i == aaw.w)
      {
        x();
        return true;
      }
      if (i == aaw.cS)
      {
        gxx localgxx5 = (gxx)this.bo.a(gxx.class);
        gxw localgxw5 = new gxw(this.bn);
        localgxw5.c = gxz.aD;
        localgxx5.a(localgxw5);
        int i2 = this.a.c();
        Context localContext = f().getApplicationContext();
        String str4 = this.b;
        String str5 = this.ab;
        Intent localIntent = new Intent(localContext, EditEventActivity.class);
        localIntent.setAction("android.intent.action.VIEW");
        localIntent.putExtra("account_id", i2);
        localIntent.putExtra("event_id", str4);
        localIntent.putExtra("auth_key", str5);
        a(localIntent);
        return true;
      }
      if (i == aaw.cn)
      {
        gxx localgxx4 = (gxx)this.bo.a(gxx.class);
        gxw localgxw4 = new gxw(this.bn);
        localgxw4.c = gxz.aC;
        localgxx4.a(localgxw4);
        ccd localccd = new ccd();
        localccd.a(this.x, "delete_event_conf");
        localccd.n = this;
        localccd.p = 0;
        return true;
      }
      if (i == aaw.eo)
      {
        gxx localgxx3 = (gxx)this.bo.a(gxx.class);
        gxw localgxw3 = new gxw(this.bn);
        localgxw3.c = gxz.aw;
        localgxx3.a(localgxw3);
        H();
        return true;
      }
      if (i == aaw.dd)
      {
        g(true);
        return true;
      }
      if (i == aaw.cz)
      {
        g(false);
        return true;
      }
      j = aaw.iy;
      bool = false;
    } while (i != j);
    gxx localgxx1 = (gxx)this.bo.a(gxx.class);
    gxw localgxw1 = new gxw(this.bn);
    localgxw1.c = gxz.aE;
    localgxx1.a(localgxw1);
    gxx localgxx2 = (gxx)this.bo.a(gxx.class);
    gxw localgxw2 = new gxw(this.bn);
    localgxw2.c = gxz.Z;
    localgxx2.a(localgxw2);
    int k = aau.kL;
    String str1 = g().getString(k);
    int m = aau.gK;
    String str2 = g().getString(m);
    int n = aau.mf;
    String str3 = g().getString(n);
    int i1 = aau.cM;
    lut locallut = lut.a(str1, str2, str3, g().getString(i1), 0, 0);
    locallut.n = this;
    locallut.p = 0;
    locallut.m.putString("activity_id", this.ar);
    locallut.a(this.x, "report_event");
    return true;
  }
  
  final void b(int paramInt)
  {
    if ((this.aD == null) || (this.aD.intValue() != paramInt)) {
      return;
    }
    this.aD = null;
    K();
  }
  
  final void b(int paramInt, dmx paramdmx)
  {
    if ((this.ag == null) || (this.ag.intValue() != paramInt)) {}
    do
    {
      return;
      this.ag = null;
      v();
      K();
    } while (paramdmx == null);
    int i;
    if (paramdmx.c != 200)
    {
      i = 1;
      label48:
      if (i == 0) {
        break label118;
      }
      int j = paramdmx.c;
      if ((j < 400) || (j >= 500)) {
        break label120;
      }
      this.aC = true;
    }
    for (;;)
    {
      k().b(0, null, this);
      k().b(2, null, this);
      this.ax.a("HEF", "HGEUC");
      return;
      i = 0;
      break label48;
      label118:
      break;
      label120:
      this.aE = true;
      if (this.d != null) {
        Toast.makeText(f(), aau.lB, 0).show();
      }
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(String paramString)
  {
    int i = this.a.c();
    a(efj.a(f(), i, paramString, null, false));
  }
  
  public final void b(tp paramtp) {}
  
  public final void b(boolean paramBoolean)
  {
    this.au.e = paramBoolean;
  }
  
  public final void c(int paramInt)
  {
    if ((this.d == null) || (paramInt != bqo.a(this.d)))
    {
      bp localbp = f();
      int i = this.a.c();
      String str1 = this.b;
      String str2 = this.ab;
      byte[] arrayOfByte = this.ak;
      Intent localIntent = EsService.e.a(localbp, EsService.class);
      localIntent.putExtra("op", 902);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("event_id", str1);
      localIntent.putExtra("rsvp_type", paramInt);
      localIntent.putExtra("event_auth_key", str2);
      localIntent.putExtra("promoted_post_data", arrayOfByte);
      this.az = Integer.valueOf(EsService.a(localbp, localIntent));
      this.ay = paramInt;
      if (paramInt != 1) {
        break label262;
      }
      gxx localgxx3 = (gxx)this.bo.a(gxx.class);
      gxw localgxw3 = new gxw(this.bn);
      localgxw3.c = gxz.as;
      localgxx3.a(localgxw3);
    }
    for (;;)
    {
      if (this.d != null)
      {
        M();
        L();
      }
      if (this.ac != -2147483648)
      {
        int j = aau.gS;
        coo.a(null, g().getString(j), false, false).a(this.x, "send_rsvp");
        this.ac = -2147483648;
      }
      this.at = true;
      return;
      label262:
      if (paramInt == 6)
      {
        gxx localgxx2 = (gxx)this.bo.a(gxx.class);
        gxw localgxw2 = new gxw(this.bn);
        localgxw2.c = gxz.au;
        localgxx2.a(localgxw2);
      }
      else if (paramInt == 2)
      {
        gxx localgxx1 = (gxx)this.bo.a(gxx.class);
        gxw localgxw1 = new gxw(this.bn);
        localgxw1.c = gxz.at;
        localgxx1.a(localgxw1);
      }
    }
  }
  
  final void c(int paramInt, dmx paramdmx)
  {
    if ((this.az == null) || (this.az.intValue() != paramInt)) {}
    do
    {
      return;
      this.az = null;
      bj localbj = (bj)this.x.a("send_rsvp");
      if (localbj != null) {
        localbj.a(false);
      }
      if (paramdmx != null)
      {
        if (paramdmx.c != 200) {}
        for (int i = 1; i != 0; i = 0)
        {
          Toast.makeText(f(), aau.uV, 0).show();
          return;
        }
      }
      this.ay = -2147483648;
    } while (this.d == null);
    M();
    L();
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.a = ((git)this.bo.a(git.class));
    int i = ((git)this.bo.a(git.class)).c();
    ill localill = new ill(this.bn, i);
    localill.a.add(ine.class);
    this.aL = localill;
    this.an = ((jov)this.bo.a(jov.class));
    this.ao = ((jpd)this.bo.a(jpd.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void c(String paramString)
  {
    int i = this.a.c();
    if (paramString.startsWith("https://plus.google.com/s/%23"))
    {
      String str1 = String.valueOf(paramString.substring(29));
      if (str1.length() != 0) {}
      for (String str2 = "#".concat(str1);; str2 = new String("#"))
      {
        a(efj.j(this.bn, i, str2));
        return;
      }
    }
    if (aau.a(paramString))
    {
      Bundle localBundle = gxy.a("extra_gaia_id", aau.b(paramString));
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.A;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
    }
    iis.a(this.bn, i, paramString, this.ar);
  }
  
  final void d(int paramInt)
  {
    coo.a(null, g().getString(paramInt), false, false).a(this.x, "req_pending");
  }
  
  final void d(int paramInt, dmx paramdmx)
  {
    if ((this.aA == null) || (this.aA.intValue() != paramInt)) {
      return;
    }
    this.aA = null;
    K();
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        Toast.makeText(f(), aau.uV, 0).show();
        return;
      }
    }
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.aI;
    localgxx.a(localgxw);
    a(false);
  }
  
  final void e(int paramInt, dmx paramdmx)
  {
    if ((this.ah == null) || (paramInt != this.ah.intValue())) {
      return;
    }
    K();
    this.ah = null;
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        Toast.makeText(f(), aau.uV, 0).show();
        return;
      }
    }
    a(false);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("id", this.b);
    paramBundle.putInt("typeid", this.Z);
    paramBundle.putString("invitation_token", this.aa);
    paramBundle.putInt("incoming_rsvp_type", this.ac);
    paramBundle.putBoolean("refresh", this.ai);
    paramBundle.putBoolean("expanded", this.au.e);
    paramBundle.putBoolean("view_logged", this.aG);
    paramBundle.putLong("first_timestamp", this.aK);
    if (this.aI != null) {
      paramBundle.putInt("scroll_pos", this.aI.i);
    }
    if (this.ag != null) {
      paramBundle.putInt("fetch_req_id", this.ag.intValue());
    }
    if (this.az != null) {
      paramBundle.putInt("rsvp_req_id", this.az.intValue());
    }
    paramBundle.putInt("temp_rsvp_state", this.ay);
    if (this.aA != null) {
      paramBundle.putInt("comment_req_id", this.aA.intValue());
    }
    if (this.ah != null) {
      paramBundle.putInt("invite_more_req_id", this.ah.intValue());
    }
    if (this.aj != null) {
      paramBundle.putInt("delete_req_id", this.aj.intValue());
    }
    if (this.aB != null) {
      paramBundle.putInt("abuse_request_id", this.aB.intValue());
    }
    if (this.aD != null) {
      paramBundle.putInt("set_comment_availability_id", this.aD.intValue());
    }
    this.ax.a("HEF", "ON");
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.aQ);
    this.ax.a("HEF", "OR");
    if (this.ag != null)
    {
      int i1 = this.ag.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i1)))
      {
        dmx localdmx5 = EsService.a(this.ag.intValue());
        b(this.ag.intValue(), localdmx5);
        this.ag = null;
      }
    }
    if (this.az != null)
    {
      int n = this.az.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(n)))
      {
        dmx localdmx4 = EsService.a(this.az.intValue());
        c(this.az.intValue(), localdmx4);
        this.az = null;
      }
    }
    if (this.aA != null)
    {
      int m = this.aA.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(m)))
      {
        dmx localdmx3 = EsService.a(this.aA.intValue());
        d(this.aA.intValue(), localdmx3);
        this.aA = null;
      }
    }
    if (this.ah != null)
    {
      int k = this.ah.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(k)))
      {
        dmx localdmx2 = EsService.a(this.ah.intValue());
        e(this.ah.intValue(), localdmx2);
        this.ah = null;
      }
    }
    if (this.aB != null)
    {
      int j = this.aB.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(j)))
      {
        dmx localdmx1 = EsService.a(this.aB.intValue());
        a(this.aB.intValue(), localdmx1);
        this.aB = null;
      }
    }
    if (this.aD != null)
    {
      int i = this.aD.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        b(this.aD.intValue());
        this.aD = null;
      }
    }
    f().getContentResolver().registerContentObserver(hbu.b(this.bn), false, this.aP);
    if (bqo.d(this.d)) {
      h(true);
    }
    if (this.aw)
    {
      this.aw = false;
      h(false);
    }
    dwn localdwn = (dwn)this.N.findViewById(aaw.dn);
    if (localdwn != null)
    {
      if (localdwn.j != null) {
        localdwn.j.a();
      }
      localdwn.i.b();
    }
  }
  
  public final void n()
  {
    f().getContentResolver().unregisterContentObserver(this.aP);
    dme localdme = this.aQ;
    EsService.d.remove(localdme);
    dwn localdwn = (dwn)this.N.findViewById(aaw.dn);
    if ((localdwn != null) && (localdwn.j != null)) {
      localdwn.j.d();
    }
    J();
    super.n();
  }
  
  public final void q_()
  {
    dwn localdwn = (dwn)this.N.findViewById(aaw.dn);
    if ((localdwn != null) && (localdwn.h != null) && (localdwn.j != null))
    {
      localdwn.h.clearAnimation();
      localdwn.h.setAlpha(1.0F);
    }
    super.q_();
  }
  
  public final gya r_()
  {
    return gya.z;
  }
  
  final void v()
  {
    this.am.a();
    lvz locallvz = this.aO;
    SwipeRefreshLayoutWithUpScroll localSwipeRefreshLayoutWithUpScroll;
    if (locallvz.a != null)
    {
      localSwipeRefreshLayoutWithUpScroll = locallvz.a;
      if (localSwipeRefreshLayoutWithUpScroll.isEnabled()) {
        break label37;
      }
      localSwipeRefreshLayoutWithUpScroll.a(false);
    }
    label37:
    do
    {
      do
      {
        return;
      } while (localSwipeRefreshLayoutWithUpScroll.m == null);
      if ((localSwipeRefreshLayoutWithUpScroll.m.O_()) && (!localSwipeRefreshLayoutWithUpScroll.b)) {
        localSwipeRefreshLayoutWithUpScroll.a(true);
      }
    } while (localSwipeRefreshLayoutWithUpScroll.m.O_());
    Runnable localRunnable = localSwipeRefreshLayoutWithUpScroll.n;
    long l = localSwipeRefreshLayoutWithUpScroll.o;
    efj.m().postDelayed(localRunnable, l);
  }
  
  final void x()
  {
    if ((bj)this.x.a("comment") == null)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.c = gxz.aG;
      localgxx.a(localgxw);
      int i = aau.fV;
      String str = this.ar;
      int j = this.a.c();
      Bundle localBundle = new Bundle();
      localBundle.putString("comment_id", "");
      localBundle.putString("comment_text", "");
      localBundle.putInt("title_id", i);
      localBundle.putString("activity_id", str);
      localBundle.putInt("account_id", j);
      bye localbye = new bye();
      localbye.f(localBundle);
      localbye.n = this;
      localbye.p = 1;
      localbye.a(this.x, "comment");
    }
  }
  
  public final void y()
  {
    if ((this.d != null) && (this.d.l() != null)) {
      a(f(), this.d.l());
    }
  }
  
  public final void z()
  {
    bp localbp;
    qdq localqdq;
    if ((this.d != null) && (this.d.l() != null))
    {
      localbp = f();
      localqdq = this.d.l();
      if ((localqdq.e == null) && (localqdq.b == null) && (localqdq.f != null)) {
        a(localbp, localqdq);
      }
    }
    else
    {
      return;
    }
    Double localDouble2;
    Double localDouble1;
    String str;
    if (localqdq.e != null)
    {
      qdd localqdd = (qdd)localqdq.e.b(qdd.a);
      localDouble2 = localqdd.c;
      localDouble1 = localqdd.d;
      str = localqdd.b;
    }
    for (;;)
    {
      efj.a(localbp, localDouble2, localDouble1, str);
      return;
      str = null;
      localDouble1 = null;
      localDouble2 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbs
 * JD-Core Version:    0.7.0.1
 */