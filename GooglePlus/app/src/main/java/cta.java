import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.plus.locations.FriendLocationsCircleFilterActivity;
import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.libraries.social.location.FriendLocationsTouchHandler;
import com.google.android.libraries.social.ui.views.DeprecatedExpandingScrollView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class cta
  extends mca
  implements View.OnClickListener, csx, cw<Cursor>, gpq, gxv, gzi, hdt, iiu, lwz
{
  static int a;
  private static boolean am;
  private static int an;
  private static int ao;
  private static int ap;
  private static int aq;
  private static int ar;
  private static int as;
  private static int at;
  public String Z;
  private String aA;
  private int aB;
  private ijd aC;
  private View aD;
  private View aE;
  private nvd aF;
  private Map<String, Set<String>> aG;
  private HashSet<String> aH;
  private nve[] aI;
  private cso aJ;
  private int aK;
  private boolean aL;
  private boolean aM;
  private boolean aN;
  private fxv aO;
  private int aP;
  private int aQ;
  private boolean aR;
  private int aS;
  private boolean aT;
  private boolean aU;
  private boolean aV;
  private int aW;
  private boolean aX;
  private duq aY;
  private duq aZ;
  DeprecatedExpandingScrollView aa;
  nve[] ab;
  List<nve> ac;
  public ijy ad;
  String ae;
  String af;
  boolean ag;
  public float ah;
  public boolean ai;
  boolean aj;
  int ak;
  public duq al;
  private final hue au = new hue(this.bp);
  private final gpk av = new gpk(this, this.bp, this);
  private dtz aw;
  private fxh ax;
  private fxc ay;
  private StrictMode.ThreadPolicy az;
  git b;
  private Runnable ba;
  private Runnable bb;
  private gzj bc;
  private final ijk bd;
  private jov be;
  private jpd bf;
  private jpe bg;
  frx c;
  fxw d;
  
  public cta()
  {
    new hdu(this.bp, this);
    gxl localgxl = new gxl(new gxq(pjr.a));
    this.bo.a(gxs.class, localgxl);
    this.ac = new ArrayList();
    this.aG = new HashMap();
    this.aH = new HashSet();
    this.bd = new ijk(this);
    this.bg = new ctf(this);
  }
  
  private final duq A()
  {
    if (this.aY == null) {
      this.aY = new cth(this, 120000L);
    }
    return this.aY;
  }
  
  private final void B()
  {
    int i = 1;
    int j;
    Object localObject1;
    if (this.ae != null)
    {
      j = i;
      if (j == 0) {
        break label271;
      }
      int k = i(this.ae);
      Object localObject2 = null;
      if (k >= 0)
      {
        int m = this.ac.size();
        localObject2 = null;
        if (k < m)
        {
          nve localnve = (nve)this.ac.get(k);
          nve[] arrayOfnve = new nve[i];
          arrayOfnve[0] = localnve;
          localObject2 = arrayOfnve;
        }
      }
      localObject1 = localObject2;
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        csk localcsk = (csk)h().a(aaw.eC);
        if (localcsk != null)
        {
          localcsk.m.putParcelable("user_device_locations", new hqy((qat[])localObject1));
          if (localcsk.b != null)
          {
            iiv localiiv2 = localcsk.b;
            localiiv2.a = ((nve[])localObject1);
            localiiv2.notifyDataSetChanged();
          }
        }
      }
      if (h("hflf_friend_list"))
      {
        iiw localiiw = (iiw)this.x.a("hflf_friend_list");
        List localList1 = this.ac;
        localiiw.m.putParcelable("user_device_locations", new hqy(localList1));
        localiiw.Z = new nve[localList1.size()];
        localList1.toArray(localiiw.Z);
        if (localiiw.aa != null)
        {
          iiv localiiv1 = localiiw.aa;
          localiiv1.a = localiiw.Z;
          localiiv1.notifyDataSetChanged();
        }
      }
      return;
      j = 0;
      break;
      label271:
      if (this.af != null) {}
      for (;;)
      {
        if (i == 0) {
          break label333;
        }
        ijx localijx = f(this.af);
        if (localijx == null) {
          break label333;
        }
        List localList2 = localijx.c;
        localObject1 = (nve[])localList2.toArray(new nve[localList2.size()]);
        break;
        i = 0;
      }
      label333:
      localObject1 = null;
    }
  }
  
  private final boolean C()
  {
    if ((!h("hflf_no_shares")) && (!h("hflf_all_filtered")) && (!h("hflf_enable_sharing")) && (!h("hflf_friend_list")))
    {
      ijd localijd = this.aC;
      if ((!localijd.a("enable_location_reporting_auto")) && (!localijd.a("enable_location_reporting_error")) && (!localijd.a("enable_location_reporting_manual "))) {
        break label87;
      }
    }
    label87:
    for (int i = 1;; i = 0)
    {
      boolean bool = false;
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
  }
  
  private final float D()
  {
    if (this.ay == null) {
      return 0.0F;
    }
    return this.ay.c().a();
  }
  
  private final void E()
  {
    ijy localijy = this.ad;
    long l1 = System.currentTimeMillis();
    Iterator localIterator = localijy.c.iterator();
    while (localIterator.hasNext()) {
      ((ijx)localIterator.next()).a(ikc.a);
    }
    if (Log.isLoggable("MarkerClusterManager", 3))
    {
      int i = localijy.c.size();
      long l2 = ijy.a(l1);
      new StringBuilder(64).append("deselectCluster: count=").append(i).append(" duration=").append(l2);
    }
    this.af = null;
    a(this.N);
  }
  
  private final Runnable F()
  {
    if (this.bb == null) {
      this.bb = new ctj(this);
    }
    return this.bb;
  }
  
  private final void G()
  {
    if (this.aF == null) {
      return;
    }
    a(gxz.ci);
    mbf localmbf = this.bn;
    int i = this.b.c();
    HashSet localHashSet = this.aH;
    HashMap localHashMap = new HashMap(this.aG.size());
    Iterator localIterator = this.aG.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put((String)localEntry.getKey(), Integer.valueOf(((Set)localEntry.getValue()).size()));
    }
    if (Log.isLoggable("FriendLocations", 3))
    {
      String str = String.valueOf(localHashMap);
      new StringBuilder(22 + String.valueOf(str).length()).append("circleToUserCountMap: ").append(str);
    }
    Intent localIntent = new Intent(localmbf, FriendLocationsCircleFilterActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("circle_ids", localHashSet);
    localIntent.putExtra("sharing_user_count", localHashMap);
    a(localIntent, 2);
  }
  
  private final Runnable H()
  {
    if (this.ba == null) {
      this.ba = new ctb(this);
    }
    return this.ba;
  }
  
  private final boolean I()
  {
    if (this.ac.isEmpty()) {}
    View localView;
    do
    {
      return false;
      localView = this.N;
    } while ((localView == null) || (localView.getHeight() - this.aQ <= at));
    return true;
  }
  
  private final void J()
  {
    if (this.aO != null) {
      this.aO.a();
    }
  }
  
  private final boolean K()
  {
    return (this.ay != null) && (this.ay.d() == 4);
  }
  
  private final gzj L()
  {
    if (this.bc == null) {
      this.bc = ((gzj)this.bo.a(gzj.class));
    }
    return this.bc;
  }
  
  private static fxw a(nvv paramnvv)
  {
    if ((paramnvv == null) || (paramnvv.b == null) || (paramnvv.c == null)) {
      return null;
    }
    return new fxw(paramnvv.b.doubleValue(), paramnvv.c.doubleValue());
  }
  
  private final void a(View paramView)
  {
    if (paramView == null) {
      return;
    }
    View localView1 = paramView.findViewById(16908292);
    if ((this.ay == null) || ((this.d == null) && (this.ab == null)))
    {
      localView1.setVisibility(0);
      localView1.findViewById(aaw.eA).setVisibility(8);
      localView1.findViewById(aaw.ez).setVisibility(0);
      this.aE.setVisibility(4);
      this.aD.setVisibility(4);
      return;
    }
    localView1.setVisibility(8);
    int i3;
    label146:
    int i;
    label162:
    int n;
    label176:
    int j;
    label184:
    boolean bool1;
    label203:
    ijx localijx;
    label236:
    Integer localInteger;
    int m;
    label293:
    label344:
    View localView2;
    int k;
    if (this.aE.getVisibility() != 0)
    {
      if (this.d != null)
      {
        this.ay.a(this.d, 14);
        this.aE.setVisibility(0);
        View localView3 = this.aD;
        if (!this.ac.isEmpty()) {
          break label448;
        }
        i3 = 4;
        localView3.setVisibility(i3);
      }
    }
    else
    {
      if (this.ae == null) {
        break label454;
      }
      i = 1;
      if (i == 0)
      {
        if (this.af == null) {
          break label459;
        }
        n = 1;
        if (n == 0) {
          break label465;
        }
      }
      j = 1;
      fxj localfxj = this.ay.b();
      if (j != 0) {
        break label471;
      }
      bool1 = true;
      localfxj.a(bool1);
      if (j == 0) {
        break label514;
      }
      J();
      if (this.af == null) {
        break label477;
      }
      localijx = f(this.af);
      if (localijx != null)
      {
        List localList = localijx.c;
        if (localList.size() == 1)
        {
          nvv localnvv = efj.a(((nve)localList.get(0)).b);
          localInteger = localnvv.e;
          if (localInteger != null) {
            break label504;
          }
          m = 0;
          if (m != 0) {
            this.aO = this.ay.a(a(localnvv), localnvv.e.intValue(), an, ao, ap);
          }
        }
      }
      this.ay.a(false);
      localView2 = this.aD;
      boolean bool2 = I();
      k = 0;
      if (!bool2) {
        break label531;
      }
    }
    for (;;)
    {
      localView2.setVisibility(k);
      return;
      if ((0x80 & this.aW) == 128) {}
      for (int i1 = 1;; i1 = 0)
      {
        if ((i1 != 0) || (this.ac == null) || (this.Z != null)) {
          break label446;
        }
        for (int i2 = 0; (i2 < this.ac.size()) && (!a(i2, 14)); i2++) {}
        break;
      }
      label446:
      break;
      label448:
      i3 = 0;
      break label146;
      label454:
      i = 0;
      break label162;
      label459:
      n = 0;
      break label176;
      label465:
      j = 0;
      break label184;
      label471:
      bool1 = false;
      break label203;
      label477:
      String str = this.ae;
      localijx = null;
      if (str == null) {
        break label236;
      }
      localijx = e(this.ae);
      break label236;
      label504:
      m = localInteger.intValue();
      break label293;
      label514:
      J();
      this.ay.a(true);
      break label344;
      label531:
      k = 4;
    }
  }
  
  private final void a(ijx paramijx)
  {
    if (this.ay == null) {}
    do
    {
      return;
      if (paramijx == null)
      {
        x();
        return;
      }
    } while (paramijx == f(this.af));
    this.ae = null;
    this.af = paramijx.a();
    this.ad.a(paramijx);
    List localList = paramijx.c;
    a((nve[])localList.toArray(new nve[localList.size()]));
    a(this.N);
    a(paramijx, -1);
  }
  
  private final void a(nve[] paramArrayOfnve)
  {
    Runnable localRunnable1 = F();
    efj.m().removeCallbacks(localRunnable1);
    boolean bool = this.aV;
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("show_actions", bool);
    localBundle.putParcelable("user_device_locations", new hqy(paramArrayOfnve));
    csk localcsk = new csk();
    localcsk.f(localBundle);
    localcsk.a = this;
    bw localbw = h();
    localbw.a().b(aaw.eC, localcsk).b();
    localbw.b();
    int i = paramArrayOfnve.length;
    int j = i * ar + (i - 1) * as;
    if (i > 1) {
      j += aq;
    }
    int k = a;
    int n;
    int m;
    if (this.aP == 0)
    {
      View localView = this.N;
      if (localView != null)
      {
        n = localView.getHeight();
        m = 0;
        if (n != 0) {
          break label221;
        }
      }
    }
    for (;;)
    {
      this.aQ = (k + Math.min(j, m));
      this.aa.b(this.aQ);
      Runnable localRunnable2 = H();
      efj.m().post(localRunnable2);
      return;
      n = 0;
      break;
      label221:
      int i1 = aq + ar / 2;
      int i2 = ar + as;
      this.aP = (i1 + i2 * Math.max(1, Math.min((n - Math.max(n / 3, at) - i1) / i2, 5)));
      m = this.aP;
    }
  }
  
  private final boolean a(int paramInt1, int paramInt2)
  {
    if ((this.ay == null) || (paramInt1 < 0) || (paramInt1 >= this.ac.size())) {
      return false;
    }
    if (this.af != null) {
      E();
    }
    this.aK = paramInt1;
    nve localnve = (nve)this.ac.get(paramInt1);
    if (Log.isLoggable("FriendLocations", 3))
    {
      String str = String.valueOf(localnve.c);
      if (str.length() != 0) {
        "selectUser: ".concat(str);
      }
    }
    else
    {
      if (!localnve.a.equals(this.ae))
      {
        a(new nve[] { localnve });
        this.ae = localnve.a;
        a(this.N);
      }
      if (D() < paramInt2) {
        break label232;
      }
      if ((this.ay != null) && (paramInt1 >= 0) && (paramInt1 < this.ac.size())) {
        break label203;
      }
      label168:
      ijx localijx = e(this.ae);
      this.ad.a(localijx);
    }
    for (;;)
    {
      return true;
      new String("selectUser: ");
      break;
      label203:
      a(e(((nve)this.ac.get(paramInt1)).a), paramInt2);
      break label168;
      label232:
      this.Z = localnve.a;
      this.aB = paramInt2;
      a(a(efj.a(localnve.b)), this.aB, false);
    }
  }
  
  private final boolean a(fxw paramfxw, int paramInt, boolean paramBoolean)
  {
    if ((this.ay == null) || (paramfxw == null)) {
      return false;
    }
    Point localPoint;
    int i;
    int j;
    if (paramBoolean)
    {
      fxg localfxg = this.ay.a();
      localPoint = localfxg.a(paramfxw);
      ikb.a(f());
      i = ikb.a.getHeight();
      j = this.aQ;
      if (!I()) {
        j -= a;
      }
      if (this.aT)
      {
        int k = this.N.getHeight();
        int m = Math.round(g().getDimension(efj.mb));
        localPoint.y += (k / 2 - m - i) / 2;
        paramfxw = localfxg.a(localPoint);
      }
    }
    else
    {
      if ((paramInt == -1) || (this.ay.c().a() >= paramInt)) {
        break label191;
      }
      this.ay.b(paramfxw, paramInt);
    }
    for (;;)
    {
      return true;
      localPoint.y += (j - i) / 2;
      break;
      label191:
      this.ay.a(paramfxw);
    }
  }
  
  private final boolean a(ijx paramijx, int paramInt)
  {
    if ((this.ay == null) || (paramijx == null)) {
      return false;
    }
    return a(paramijx.d, paramInt, true);
  }
  
  private final ijx e(String paramString)
  {
    return (ijx)this.ad.e.get(paramString);
  }
  
  private final ijx f(String paramString)
  {
    ijy localijy = this.ad;
    if (paramString != null) {
      for (int i = -1 + localijy.c.size(); i >= 0; i--)
      {
        ijx localijx = (ijx)localijy.c.get(i);
        if (localijx.a().equals(paramString)) {
          return localijx;
        }
      }
    }
    return null;
  }
  
  private final void g(String paramString)
  {
    bj localbj = (bj)this.x.a(paramString);
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  private final void g(boolean paramBoolean)
  {
    Intent localIntent = efj.e(f(), this.b.c());
    localIntent.putExtra("start_wizard", paramBoolean);
    a(localIntent, 1);
  }
  
  private final boolean h(Bundle paramBundle)
  {
    HashSet localHashSet = (HashSet)paramBundle.getSerializable("circle_ids");
    if (this.aH.equals(localHashSet)) {
      return false;
    }
    if (Log.isLoggable("FriendLocations", 4))
    {
      String str = String.valueOf(localHashSet);
      new StringBuilder(25 + String.valueOf(str).length()).append("Update selected circles: ").append(str);
    }
    this.aH.clear();
    if (localHashSet != null) {
      this.aH.addAll(localHashSet);
    }
    return true;
  }
  
  private final boolean h(String paramString)
  {
    return this.x.a(paramString) != null;
  }
  
  private final int i(String paramString)
  {
    for (int i = 0; i < this.ac.size(); i++) {
      if (((nve)this.ac.get(i)).a.equals(paramString)) {
        return i;
      }
    }
    return -1;
  }
  
  private final void j(String paramString)
  {
    a(gxz.cJ);
    View localView = this.N.findViewById(aaw.aB);
    ((TextView)localView.findViewById(aaw.fh)).setText(paramString);
    localView.setOnClickListener(new cte(this, localView));
    efj.d(localView);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = paramLayoutInflater.inflate(efj.tO, paramViewGroup, false);
    bp localbp = f();
    if ((localbp instanceof HomeActivity))
    {
      ViewGroup.LayoutParams localLayoutParams = localView1.getLayoutParams();
      if ((localLayoutParams instanceof FrameLayout.LayoutParams))
      {
        FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)localLayoutParams;
        localLayoutParams1.topMargin = ((int)(localLayoutParams1.topMargin + efj.y(localbp)));
      }
    }
    bw localbw = h();
    fxi localfxi = (fxi)this.bo.a(fxi.class);
    this.ax = localfxi.a(localbw.a(aaw.eV));
    if (this.ax.a() == null)
    {
      this.ax = localfxi.a(false);
      localbw.a().b(aaw.eV, this.ax.a()).c();
    }
    this.aD = localView1.findViewById(aaw.aM);
    this.aD.findViewById(aaw.hR).setOnClickListener(this);
    this.aD.findViewById(aaw.ex).setOnClickListener(this);
    this.aD.findViewById(aaw.fO).setOnClickListener(this);
    View localView2 = this.aD;
    int i;
    if (Build.VERSION.SDK_INT >= 11) {
      i = 1;
    }
    for (;;)
    {
      if (i != 0) {
        localView2.setAlpha(0.8F);
      }
      this.aa = ((DeprecatedExpandingScrollView)localView1.findViewById(aaw.eB));
      this.aa.c = this;
      this.aE = localView1.findViewById(aaw.eV);
      View localView3 = localView1.findViewById(aaw.eD);
      FriendLocationsTouchHandler localFriendLocationsTouchHandler = (FriendLocationsTouchHandler)localView1.findViewById(aaw.lO);
      localFriendLocationsTouchHandler.c = this.aE;
      localFriendLocationsTouchHandler.d = this.aD;
      localFriendLocationsTouchHandler.a = this.aa;
      localFriendLocationsTouchHandler.b = localView3;
      this.aJ = new cso(f(), localView1.findViewById(aaw.hQ), this.b.c(), this);
      if ((this.aS == 1) && (!this.aU))
      {
        byte[] arrayOfByte = this.m.getByteArray("notification_payload");
        try
        {
          localmlf = (mlf)qat.b(new mlf(), arrayOfByte, 0, arrayOfByte.length);
          localcso = this.aJ;
          localcso.a.ah_();
          localcso.a(gxz.cv, gya.R);
          if (localmlf != null)
          {
            mlh[] arrayOfmlh = localmlf.a;
            int j = arrayOfmlh.length;
            int k = 0;
            for (;;)
            {
              if (k < j)
              {
                localmlh = arrayOfmlh[k];
                str = localmlh.a;
                if ("locationSharingType".equals(str)) {
                  if (localmlh.b.c.a[0].b.b.intValue() == 1)
                  {
                    bool3 = true;
                    localcso.d = bool3;
                    k++;
                    continue;
                    i = 0;
                  }
                }
              }
            }
          }
        }
        catch (qas localqas)
        {
          cso localcso;
          mlh localmlh;
          String str;
          do
          {
            for (;;)
            {
              localqas.printStackTrace();
              mlf localmlf = null;
              continue;
              boolean bool3 = false;
            }
            if ("emptyAcl".equals(str))
            {
              if (!localmlh.b.a.booleanValue()) {}
              for (boolean bool2 = true;; bool2 = false)
              {
                localcso.j = bool2;
                break;
              }
            }
          } while (!"recipientToSenderSharingType".equals(str));
          localcso.i = localmlh.b.b.intValue();
          if (localcso.i != 0) {}
          for (boolean bool1 = true;; bool1 = false)
          {
            localcso.l = bool1;
            break;
          }
          localcso.a();
        }
      }
    }
    for (;;)
    {
      a(localView1);
      if ((localbp instanceof iww)) {
        ((iww)localbp).a("locations", 0L);
      }
      return localView1;
      if (this.aS > 0)
      {
        a(gxz.cw);
        this.aU = true;
      }
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new csl(f(), this.b.c(), this.ab);
  }
  
  final void a(int paramInt)
  {
    gzj localgzj = L();
    if (localgzj.a("GetFriendLocationsTask")) {
      return;
    }
    this.aC.i();
    String str = this.m.getString("gaia_id");
    if (TextUtils.equals(this.b.f().b("gaia_id"), str)) {
      str = null;
    }
    if (this.bn != null)
    {
      localgzj.b(new bng(this.bn, this.b.c(), str, paramInt, true, this.ab));
      if (!this.aT) {
        this.av.a();
      }
    }
    A().b = System.currentTimeMillis();
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    int i = this.b.c();
    if (paramInt2 != -1) {}
    do
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      case 1: 
        v();
        return;
      }
    } while (!h(paramIntent.getExtras()));
    a(gxz.cj);
    bp localbp = f();
    HashSet localHashSet = this.aH;
    if ((localHashSet != null) && (!localHashSet.isEmpty())) {}
    for (String str = TextUtils.join(",", localHashSet);; str = "")
    {
      ((giz)mbb.a(localbp, giz.class)).b(i).b("friend_location_circles", str).d();
      k().b(0, null, this);
      return;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      this.aL = true;
      this.aM = true;
      if (this.aC.f()) {
        this.aC.h();
      }
    }
    if (paramBoolean1) {
      if (paramInt == 1) {
        a(gxz.cG);
      }
    }
    while (!paramBoolean2)
    {
      return;
      a(gxz.cH);
      return;
    }
    this.aF.b.booleanValue();
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    int i = this.b.c();
    if (!this.aw.a(this.bn, i))
    {
      f().finish();
      return;
    }
    this.aV = ((hyi)this.bo.a(hyi.class)).b(bwb.c, i);
    mbf localmbf1 = this.bn;
    if (!am)
    {
      Resources localResources = localmbf1.getResources();
      an = localResources.getDimensionPixelSize(efj.mi);
      ao = localResources.getColor(efj.jF);
      ap = localResources.getColor(efj.jE);
      a = localResources.getDimensionPixelSize(efj.lV);
      aq = (localResources.getDimensionPixelSize(efj.lW) << 1) + localResources.getDimensionPixelSize(efj.lX);
      as = localResources.getDimensionPixelSize(efj.lY);
      ar = localResources.getDimensionPixelSize(efj.lZ);
      int j = localResources.getDimensionPixelSize(efj.ma);
      ikb.a(localmbf1);
      at = ikb.a.getHeight() + j * 2;
      am = true;
    }
    this.az = StrictMode.allowThreadDiskReads();
    StrictMode.allowThreadDiskWrites();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    f().getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    this.ad = new ijy(this.bn, i, localDisplayMetrics);
    this.aC = new ijd(this.bn, this.b.f().b("account_name"), this.x, this.bd);
    this.be.a(aaw.iO, this.bg);
    SharedPreferences localSharedPreferences;
    String str2;
    String str4;
    label471:
    String str5;
    String str6;
    if (paramBundle == null)
    {
      this.aA = this.m.getString("gaia_id");
      if (this.aA != null)
      {
        this.Z = this.aA;
        this.aB = 14;
      }
      this.be.a(this.bf, aaw.iO, Arrays.asList(new String[] { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" }));
      this.aN = true;
      String str1 = this.b.f().b("account_name");
      mbf localmbf2 = this.bn;
      localSharedPreferences = localmbf2.getSharedPreferences(String.valueOf(localmbf2.getPackageName()).concat("_preferences"), 0);
      str2 = String.valueOf("shown_sharing_dialog:");
      String str3 = String.valueOf(str1);
      if (str3.length() == 0) {
        break label753;
      }
      str4 = str2.concat(str3);
      this.aL = localSharedPreferences.getBoolean(str4, false);
      str5 = String.valueOf("shown_reporting_dialog:");
      str6 = String.valueOf(str1);
      if (str6.length() == 0) {
        break label767;
      }
    }
    label753:
    label767:
    for (String str7 = str5.concat(str6);; str7 = new String(str5))
    {
      this.aM = localSharedPreferences.getBoolean(str7, false);
      this.aS = this.m.getInt("num_coalesced_notifs", 0);
      return;
      if (paramBundle.containsKey("user_device_locations")) {
        this.ab = ((nve[])((hqy)paramBundle.getParcelable("user_device_locations")).a(new nve[0]));
      }
      if (paramBundle.containsKey("test_locations")) {
        this.aI = ((nve[])((hqy)paramBundle.getParcelable("test_locations")).a(new nve[0]));
      }
      if (paramBundle.containsKey("owner_device_location_info")) {
        this.aF = ((nvd)((hqw)paramBundle.getParcelable("owner_device_location_info")).a(new nvd()));
      }
      this.aK = paramBundle.getInt("centered_marker_index", 0);
      this.af = paramBundle.getString("selected_marker_key");
      this.ae = paramBundle.getString("selected_user");
      this.aW = paramBundle.getInt("view_config", 0);
      this.ag = paramBundle.getBoolean("shown_no_friends_dialog", false);
      this.aX = paramBundle.getBoolean("was_satellite_view", false);
      long l = paramBundle.getLong("last_refresh_timestamp");
      A().b = l;
      this.aU = paramBundle.getBoolean("finished_pre_work", false);
      break;
      str4 = new String(str2);
      break label471;
    }
  }
  
  final void a(bj parambj, String paramString)
  {
    if ((C()) || (this.aT)) {
      return;
    }
    parambj.n = this;
    parambj.p = 0;
    parambj.a(this.x, paramString);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    paramgpr.d(aau.iS);
    gqe localgqe = (gqe)paramgpr.a(aaw.iq);
    localgqe.b = Math.max(1, localgqe.b);
    if ((L().a("GetFriendLocationsTask")) || (this.ak > 0)) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        localgqe.a = true;
      }
      paramgpr.b(aaw.eL);
      paramgpr.b(aaw.dB);
      if (!K()) {
        break;
      }
      paramgpr.b(aaw.jF);
      return;
    }
    paramgpr.b(aaw.jG);
  }
  
  final void a(gxz paramgxz)
  {
    int i = this.b.c();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = paramgxz;
    localgxw.d = gya.N;
    localgxx.a(localgxw);
  }
  
  public final void a(String paramString)
  {
    if (y())
    {
      if ((!"hflf_no_shares".equals(paramString)) && (!"hflf_friend_list".equals(paramString))) {
        break label81;
      }
      int i = this.b.c();
      int j = aau.ix;
      String str = g().getString(j);
      a(efj.d(f(), i, str));
    }
    for (;;)
    {
      if (!"hflf_friend_list".equals(paramString)) {
        g(paramString);
      }
      return;
      label81:
      if ("hflf_all_filtered".equals(paramString)) {
        G();
      } else if ("hflf_enable_sharing".equals(paramString)) {
        g(true);
      }
    }
  }
  
  public final void a(String paramString, int paramInt, boolean paramBoolean)
  {
    this.aT = false;
    this.aU = true;
    f().setRequestedOrientation(-1);
    ((tt)f()).e().a().d();
    Resources localResources;
    String str;
    if (paramString != null)
    {
      localResources = g();
      switch (paramInt)
      {
      default: 
        str = localResources.getString(aau.hX, new Object[] { paramString });
      }
    }
    for (;;)
    {
      j(str);
      k().b(0, null, this);
      if (paramBoolean) {
        g(false);
      }
      return;
      str = localResources.getString(aau.hZ, new Object[] { paramString });
      continue;
      str = localResources.getString(aau.hY, new Object[] { paramString });
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (!"GetFriendLocationsTask".equals(paramString))
    {
      View localView = this.N.findViewById(aaw.aB);
      if ((localView.getVisibility() == 0) && (paramhae != null)) {
        if (paramhae.b == 200) {
          break label60;
        }
      }
      label60:
      for (int i19 = 1;; i19 = 0)
      {
        if (i19 != 0) {
          localView.setVisibility(8);
        }
        return;
      }
    }
    if (paramhae == null)
    {
      v();
      return;
    }
    nve[] arrayOfnve1 = bng.a(paramhae);
    nvd localnvd1;
    int i;
    label109:
    nxl localnxl;
    label129:
    label154:
    cso localcso;
    nvd localnvd2;
    boolean bool1;
    int i16;
    label272:
    int i17;
    if ((paramhae == null) || (paramhae.a() == null))
    {
      localnvd1 = null;
      if ((paramhae != null) && (paramhae.a() != null)) {
        break label588;
      }
      i = 0;
      if (arrayOfnve1 != null) {
        break label604;
      }
      if (this.ab == null) {
        this.ab = new nve[0];
      }
      if (localnvd1 != null) {
        this.aF = localnvd1;
      }
      if ((paramhae != null) && (paramhae.a() != null)) {
        break label613;
      }
      localnxl = null;
      localcso = this.aJ;
      localnvd2 = this.aF;
      bool1 = this.aC.d();
      if (localcso.m != csy.f)
      {
        if (localnvd2 != null)
        {
          if ((localnxl != null) && (localnxl.e != null) && (localnxl.e.n != null) && (localnxl.e.n.a != null) && (localnxl.e.n.a.length != 0) && (localnxl.e.a != null) && (localnxl.e.a.a != null)) {
            break label659;
          }
          i16 = 1;
          if (i16 != 0) {
            break label665;
          }
          i17 = 1;
          label280:
          if (i17 != 0) {
            break label671;
          }
        }
        localcso.m = csy.f;
        localcso.b.setVisibility(8);
        localcso.a.a(null, 0, false);
      }
      label316:
      if (this.aS > 1)
      {
        if ((localnxl != null) && (localnxl.g != null))
        {
          if (this.aS != 2) {
            break label731;
          }
          int i15 = efj.Om;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localnxl.g;
          j(g().getString(i15, arrayOfObject2));
        }
        label380:
        this.aS = 0;
      }
      Bundle localBundle1 = gxy.a("extra_num_users_on_map", this.ab.length);
      int j = this.b.c();
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, j);
      localgxw.c = gxz.bW;
      if (localBundle1 != null) {
        localgxw.h.putAll(localBundle1);
      }
      localgxx.a(localgxw);
      if (i <= 0) {
        break label782;
      }
      this.au.a(new ctg(this), i);
    }
    for (;;)
    {
      k().b(0, null, this);
      if (!this.aT) {
        this.av.a();
      }
      if ((this.s) && (!this.aT) && (this.aF != null) && (this.aC.c())) {
        break label823;
      }
      this.aR = true;
      return;
      localnvd1 = (nvd)((hqw)paramhae.a().getParcelable("owner_device_location")).a(new nvd());
      break;
      label588:
      i = paramhae.a().getInt("delay_interval", 0);
      break label109;
      label604:
      this.ab = arrayOfnve1;
      break label129;
      label613:
      hqw localhqw = (hqw)paramhae.a().getParcelable("target_profile");
      if (localhqw == null)
      {
        localnxl = null;
        break label154;
      }
      localnxl = (nxl)localhqw.a(new nxl());
      break label154;
      label659:
      i16 = 0;
      break label272;
      label665:
      i17 = 0;
      break label280;
      label671:
      localcso.f = localnvd2;
      localcso.g = localnxl;
      localcso.h = bool1;
      localcso.e = true;
      if (localcso.m == csy.d) {}
      for (int i18 = 1;; i18 = 0)
      {
        if (i18 == 0) {
          break label729;
        }
        localcso.a();
        break;
      }
      label729:
      break label316;
      label731:
      int i14 = efj.Ol;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = localnxl.g;
      arrayOfObject1[1] = Integer.valueOf(-1 + this.aS);
      j(g().getString(i14, arrayOfObject1));
      break label380;
      label782:
      this.ak = 0;
      nve[] arrayOfnve2 = this.ab;
      int k = arrayOfnve2.length;
      for (int m = 0; m < k; m++) {
        arrayOfnve2[m].e = null;
      }
    }
    label823:
    Boolean localBoolean2;
    boolean bool6;
    label847:
    mbf localmbf2;
    int i12;
    Spanned localSpanned2;
    label930:
    String str12;
    String str14;
    label1075:
    int n;
    if (!this.aL)
    {
      localBoolean2 = this.aF.b;
      if (localBoolean2 == null)
      {
        bool6 = false;
        if (bool6) {
          break label1323;
        }
        Uri localUri = efj.a(this.bn, "plus_location", "https://support.google.com/plus/?hl=%locale%");
        localmbf2 = this.bn;
        int i11 = aau.ic;
        i12 = aau.jv;
        String str11 = localUri.toString();
        int i13 = aau.ib;
        iiy localiiy2 = new iiy();
        if (str11 == null) {
          break label1294;
        }
        localSpanned2 = Html.fromHtml(localmbf2.getString(i12, new Object[] { str11 }));
        Bundle localBundle4 = new Bundle();
        localBundle4.putString("arg_title_text", localmbf2.getString(i11));
        localBundle4.putCharSequence("arg_message_text", localSpanned2);
        localBundle4.putString("arg_positive_button_text", localmbf2.getString(i13));
        localBundle4.putString("arg_negative_button_text", localmbf2.getString(17039360));
        localiiy2.f(localBundle4);
        localiiy2.n = this;
        localiiy2.p = 0;
        a(localiiy2, "hflf_enable_sharing");
        this.aL = true;
        str12 = String.valueOf("shown_sharing_dialog:");
        String str13 = String.valueOf(this.b.f().b("account_name"));
        if (str13.length() == 0) {
          break label1309;
        }
        str14 = str12.concat(str13);
        L().b(new ike(f(), str14, this.aL));
        n = 1;
      }
    }
    label1102:
    mbf localmbf1;
    int i4;
    Spanned localSpanned1;
    label1183:
    label1323:
    Boolean localBoolean1;
    label1294:
    label1309:
    boolean bool4;
    label1371:
    ijd localijd;
    String str1;
    int i1;
    label1446:
    String str2;
    String str4;
    for (;;)
    {
      if ((n == 0) && (!this.ag) && ((this.ab == null) || (this.ab.length == 0)))
      {
        localmbf1 = this.bn;
        int i3 = aau.ij;
        i4 = aau.ih;
        int i5 = aau.ii;
        iiy localiiy1 = new iiy();
        if (0 == 0) {
          break label1941;
        }
        localSpanned1 = Html.fromHtml(localmbf1.getString(i4, new Object[] { null }));
        Bundle localBundle2 = new Bundle();
        localBundle2.putString("arg_title_text", localmbf1.getString(i3));
        localBundle2.putCharSequence("arg_message_text", localSpanned1);
        localBundle2.putString("arg_positive_button_text", localmbf1.getString(i5));
        localBundle2.putString("arg_negative_button_text", localmbf1.getString(17039360));
        localiiy1.f(localBundle2);
        localiiy1.n = this;
        localiiy1.p = 0;
        this.ag = true;
        a(localiiy1, "hflf_no_shares");
        break;
        bool6 = localBoolean2.booleanValue();
        break label847;
        localSpanned2 = Html.fromHtml(localmbf2.getString(i12));
        break label930;
        str14 = new String(str12);
        break label1075;
        boolean bool2 = this.ai;
        n = 0;
        if (bool2)
        {
          boolean bool3 = this.aM;
          n = 0;
          if (!bool3)
          {
            localBoolean1 = Boolean.valueOf(this.aC.d());
            if (localBoolean1 != null) {
              break label1542;
            }
            bool4 = false;
            n = 0;
            if (!bool4)
            {
              boolean bool5 = C();
              n = 0;
              if (!bool5)
              {
                localijd = this.aC;
                str1 = this.bn.getString(aau.it);
                if ((localijd.c()) && (localijd.g != null) && ((!localijd.d()) || (!localijd.e()))) {
                  break label1552;
                }
                i1 = 0;
                if (i1 == 0) {
                  break label1956;
                }
                this.aM = true;
                str2 = String.valueOf("shown_reporting_dialog:");
                String str3 = String.valueOf(this.b.f().b("account_name"));
                if (str3.length() == 0) {
                  break label1927;
                }
                str4 = str2.concat(str3);
                label1503:
                L().b(new ike(f(), str4, this.aM));
              }
            }
          }
        }
      }
    }
    label1542:
    label1552:
    label1941:
    label1956:
    for (int i2 = 1;; i2 = 0)
    {
      this.ai = false;
      n = i2;
      break label1102;
      break;
      bool4 = localBoolean1.booleanValue();
      break label1371;
      Resources localResources = localijd.b.getResources();
      String str5 = efj.a(localijd.b, "ulr_googlelocation", "https://support.google.com/mobile/?hl=%locale%").toString();
      String str6 = localijd.d.name;
      Object localObject;
      String str8;
      int i7;
      if (!localijd.e())
      {
        String str10 = localResources.getString(efj.Oi, new Object[] { str6, str5 });
        int i10 = efj.Os;
        localObject = str10;
        str8 = "enable_location_reporting_manual ";
        i7 = i10;
      }
      for (;;)
      {
        if (str1 != null) {
          localObject = 10 + String.valueOf(str1).length() + String.valueOf(localObject).length() + str1 + "<br/><br/>" + (String)localObject;
        }
        Context localContext = localijd.b;
        int i8 = efj.Oh;
        iju localiju = new iju();
        Bundle localBundle3 = new Bundle();
        localBundle3.putString("arg_title_text", localContext.getString(i8));
        localBundle3.putCharSequence("arg_message_text", Html.fromHtml((String)localObject));
        localBundle3.putString("arg_positive_button_text", localContext.getString(i7));
        localBundle3.putString("arg_negative_button_text", localContext.getString(17039360));
        localiju.f(localBundle3);
        localiju.Z = localijd;
        localiju.a(localijd.e, str8);
        i1 = 1;
        break;
        if (localijd.f())
        {
          String str9 = localResources.getString(efj.Oi, new Object[] { str6, str5 });
          int i9 = efj.Ot;
          localObject = str9;
          str8 = "enable_location_reporting_auto";
          i7 = i9;
        }
        else
        {
          if (!localijd.g()) {
            break label1921;
          }
          String str7 = localResources.getString(efj.Oi, new Object[] { str6, str5 });
          int i6 = efj.Os;
          localObject = str7;
          str8 = "enable_location_reporting_manual ";
          i7 = i6;
        }
      }
      i1 = 0;
      break label1446;
      str4 = new String(str2);
      break label1503;
      localSpanned1 = Html.fromHtml(localmbf1.getString(i4));
      break label1183;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if (y())
    {
      if ("hflf_friend_list".equals(paramString2))
      {
        g(paramString2);
        a(i(paramString1), 14);
        gxz localgxz = gxz.cb;
        int i = this.b.c();
        gxx localgxx = (gxx)this.bo.a(gxx.class);
        gxw localgxw = new gxw(this.bn, i);
        localgxw.c = localgxz;
        localgxw.d = gya.P;
        localgxx.a(localgxw);
      }
    }
    else {
      return;
    }
    a(i(paramString1), 18);
    a(gxz.cb);
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      x();
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == aaw.iq)
    {
      a(gxz.bY);
      v();
    }
    do
    {
      return true;
      if (i == aaw.eL)
      {
        a(gxz.ch);
        g(false);
        return true;
      }
      if (i == aaw.dB)
      {
        G();
        return true;
      }
      if ((i != aaw.jF) && (i != aaw.jG)) {
        break;
      }
    } while (this.ay == null);
    gxz localgxz;
    fxc localfxc;
    if (K())
    {
      localgxz = gxz.cg;
      a(localgxz);
      localfxc = this.ay;
      if (!K()) {
        break label139;
      }
    }
    label139:
    for (int j = 1;; j = 4)
    {
      localfxc.a(j);
      this.av.a();
      return true;
      localgxz = gxz.cf;
      break;
    }
    return false;
  }
  
  public final void ah_()
  {
    this.aT = true;
    f().setRequestedOrientation(1);
    ((tt)f()).e().a().e();
  }
  
  public final void b()
  {
    a(i(this.b.f().b("gaia_id")), 14);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(String paramString)
  {
    a(gxz.ca);
    a(efj.a(f(), this.b.c(), paramString, null, false));
  }
  
  public final void b(tp paramtp) {}
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.aL = true;
      this.aM = true;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.b = ((git)this.bo.a(git.class));
    this.be = ((jov)this.bo.a(jov.class));
    this.bf = ((jpd)this.bo.a(jpd.class));
    this.aw = ((dtz)this.bo.a(dtz.class));
  }
  
  public final void c(String paramString)
  {
    int i = i(paramString);
    if (i == -1) {
      return;
    }
    nve localnve = (nve)this.ac.get(i);
    nvv localnvv = efj.a(localnve.b);
    String str1 = localnvv.b.toString();
    String str2 = localnvv.c.toString();
    String str5;
    label93:
    gxz localgxz2;
    String str3;
    if (efj.b(localnve.b))
    {
      String str4 = String.valueOf(localnvv.f);
      if (str4.length() != 0)
      {
        str5 = "http://maps.google.com/maps?saddr=&daddr=".concat(str4);
        localgxz2 = gxz.cu;
        str3 = str5;
      }
    }
    for (gxz localgxz1 = localgxz2;; localgxz1 = gxz.ct)
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
      if (this.bn.getPackageManager().resolveActivity(localIntent, 65536) == null) {
        break;
      }
      a(localgxz1);
      a(localIntent);
      return;
      str5 = new String("http://maps.google.com/maps?saddr=&daddr=");
      break label93;
      str3 = 42 + String.valueOf(str1).length() + String.valueOf(str2).length() + "http://maps.google.com/maps?saddr=&daddr=" + str1 + "," + str2;
    }
  }
  
  public final void d(String paramString)
  {
    if (paramString.equals(this.b.f().b("gaia_id"))) {}
    for (Intent localIntent = efj.i(this.bn, this.b.c(), null);; localIntent = efj.i(this.bn, this.b.c(), paramString))
    {
      if (this.bn.getPackageManager().resolveActivity(localIntent, 65536) != null)
      {
        a(gxz.cs);
        a(localIntent);
      }
      return;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if ((this.ab != null) && (this.ab.length != 0)) {
      paramBundle.putParcelable("user_device_locations", new hqy(this.ab));
    }
    if ((this.aI != null) && (this.aI.length != 0)) {
      paramBundle.putParcelable("test_locations", new hqy(this.aI));
    }
    if (this.aF != null) {
      paramBundle.putParcelable("owner_device_location_info", new hqw(this.aF));
    }
    paramBundle.putInt("centered_marker_index", this.aK);
    paramBundle.putString("selected_marker_key", this.af);
    paramBundle.putString("selected_user", this.ae);
    paramBundle.putBoolean("shown_no_friends_dialog", this.ag);
    paramBundle.putInt("view_config", f().getChangingConfigurations());
    paramBundle.putBoolean("was_satellite_view", K());
    paramBundle.putLong("last_refresh_timestamp", A().b);
    paramBundle.putBoolean("finished_pre_work", this.aU);
  }
  
  public final void m()
  {
    super.m();
    this.ak = 0;
    if (this.ay == null)
    {
      this.ay = this.ax.b();
      if (this.ay == null)
      {
        f().finish();
        return;
      }
      this.ad.f = this.ay;
      this.ay.a(true);
      this.ay.a(new fxf(this));
      this.ay.a(new fxe(this));
      this.ay.a(new fxd(this));
    }
    if (this.aX)
    {
      this.ay.a(4);
      this.aX = false;
    }
    gzj localgzj = L();
    localgzj.a.add(this);
    if ((this.ab == null) && (!localgzj.a("GetFriendLocationsTask"))) {
      v();
    }
    if (!this.aT) {
      this.av.a();
    }
    if ((this.aN) && (this.ab != null)) {
      k().a(0, null, this);
    }
    if (this.aj)
    {
      z().run();
      this.aj = false;
    }
    A().run();
  }
  
  public final void n()
  {
    super.n();
    if (this.c != null)
    {
      this.c.c();
      this.c = null;
    }
    duq localduq = A();
    localduq.a.removeCallbacks(localduq.c);
  }
  
  public final void o()
  {
    if (this.aC != null)
    {
      ijd localijd = this.aC;
      if (localijd.i)
      {
        localijd.b.unregisterReceiver(localijd.a);
        localijd.i = false;
      }
      localijd.f.c();
    }
    if (this.ad != null)
    {
      ijy localijy = this.ad;
      if (localijy.f != null)
      {
        Iterator localIterator = localijy.c.iterator();
        while (localIterator.hasNext()) {
          ((ijx)localIterator.next()).b();
        }
        localijy.d.clear();
      }
    }
    if (this.az != null) {
      StrictMode.setThreadPolicy(this.az);
    }
    super.o();
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    int j = this.ac.size();
    if (i == aaw.ex) {
      if ((j > 0) && (this.ay != null))
      {
        a(gxz.bX);
        localmbf = this.bn;
        localList = this.ac;
        bool = this.aV;
        localiiw = new iiw();
        localBundle = new Bundle();
        localBundle.putString("arg_title_text", localmbf.getString(efj.Ok));
        localBundle.putString("arg_positive_button_text", localmbf.getString(efj.Oj));
        if (localList.size() > 0) {
          localBundle.putParcelable("user_device_locations", new hqy(localList));
        }
        localBundle.putBoolean("show_actions", bool);
        localiiw.f(localBundle);
        localiiw.n = this;
        localiiw.p = 0;
        a(localiiw, "hflf_friend_list");
      }
    }
    while (((i != aaw.hR) && (i != aaw.fO)) || (j <= 0) || (this.ay == null))
    {
      mbf localmbf;
      List localList;
      boolean bool;
      iiw localiiw;
      Bundle localBundle;
      return;
    }
    if (i == aaw.hR)
    {
      a(gxz.cd);
      int m = -1 + this.aK;
      this.aK = m;
      if (m < 0) {
        this.aK = (j - 1);
      }
    }
    for (;;)
    {
      a(this.aK, 14);
      return;
      a(gxz.cc);
      int k = 1 + this.aK;
      this.aK = k;
      if (k >= j) {
        this.aK = 0;
      }
    }
  }
  
  public final gya r_()
  {
    return gya.N;
  }
  
  public final boolean t_()
  {
    if (!this.aT)
    {
      int i;
      if (this.ae != null)
      {
        i = 1;
        if (i == 0) {
          if (this.af == null) {
            break label44;
          }
        }
      }
      label44:
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label49;
        }
        x();
        return true;
        i = 0;
        break;
      }
    }
    label49:
    if (this.aT)
    {
      this.aJ.c();
      return true;
    }
    return false;
  }
  
  final void v()
  {
    if (this.ak == 0)
    {
      int i = 1 + this.ak;
      this.ak = i;
      a(i);
    }
  }
  
  public final void x()
  {
    Runnable localRunnable1 = H();
    efj.m().removeCallbacks(localRunnable1);
    if (this.aa.a())
    {
      this.aa.c();
      Runnable localRunnable2 = F();
      efj.m().postDelayed(localRunnable2, 1000L);
    }
    this.aQ = a;
    this.ae = null;
    E();
  }
  
  final boolean y()
  {
    return (!this.F) && (i());
  }
  
  public final duq z()
  {
    if (this.aZ == null) {
      this.aZ = new ctc(this, 200L);
    }
    return this.aZ;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cta
 * JD-Core Version:    0.7.0.1
 */