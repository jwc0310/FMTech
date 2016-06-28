import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.RecyclerListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import com.google.android.libraries.social.discovery.views.PeopleListSwipeableRowView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class cjx
  extends mca
  implements View.OnClickListener, AbsListView.RecyclerListener, cw<Cursor>, dhf, gpq, gxv, gzi, hgh, hvn, jhs, jjc, luu, lvw
{
  private static int a;
  private hfa Z;
  private boolean aa;
  private boolean ab;
  public final gpk ac = new gpk(this, this.bp, this);
  public boolean ad;
  public ListAdapter ae;
  public Cursor af;
  public jly ag;
  public Integer ah;
  public String ai;
  public boolean aj;
  public hvl ak;
  public ListView al;
  public git am;
  public hvj an;
  int ao;
  public gzj ap;
  public ill aq;
  public final hwq ar;
  public boolean as;
  private lta at;
  private hul au;
  private jfa av;
  private kpn aw;
  private final DataSetObserver ax;
  private final dme ay;
  private hgg b;
  private hum c;
  private jia d;
  
  public cjx()
  {
    new Handler();
    this.ao = -1;
    this.ab = false;
    this.ar = new hwq(this.bp);
    this.ax = new cjy(this);
    this.ay = new cjz(this);
    new hun(this.bp, aaw.ew);
    jie localjie = new jie(this.bp);
    localjie.c = this;
    localjie.d = this;
  }
  
  private static Bundle a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("person_id", paramString1);
    localBundle.putString("person_name", paramString2);
    localBundle.putBoolean("for_sharing", paramBoolean);
    localBundle.putString("suggestion_id", paramString3);
    localBundle.putInt("suggestion_type", paramInt1);
    localBundle.putInt("action_source", paramInt2);
    return localBundle;
  }
  
  protected static String a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof ors)) {
      return efj.b(((ors)paramObject).a);
    }
    if ((paramObject instanceof odg))
    {
      odg localodg = (odg)paramObject;
      if (localodg.a == null) {
        return null;
      }
      return efj.b(localodg.a.a);
    }
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    return null;
  }
  
  @TargetApi(11)
  private final HashMap<Object, Float> a(int paramInt1, int paramInt2, int paramInt3)
  {
    HashMap localHashMap = new HashMap();
    while (paramInt2 <= paramInt3)
    {
      localHashMap.put(a(this.al.getItemAtPosition(paramInt2)), Float.valueOf(this.al.getChildAt(paramInt2 - paramInt1).getTop()));
      paramInt2++;
    }
    return localHashMap;
  }
  
  private final void a(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, int paramInt, boolean paramBoolean2)
  {
    if (!this.aq.a()) {
      this.bn.startActivity(this.aq.b());
    }
    int i;
    do
    {
      return;
      i = a(paramInt);
    } while (h(a(paramString1, paramString2, paramBoolean1, paramString3, paramInt, i)));
    if (paramString2 == null)
    {
      bzk localbzk = bzk.a(this.bn.getString(aau.bH), null, this.bn.getString(aau.bG), this.bn.getString(17039370), this.bn.getString(17039360), false);
      Bundle localBundle2 = localbzk.m;
      localBundle2.putString("person_id", paramString1);
      localBundle2.putBoolean("for_sharing", paramBoolean1);
      localBundle2.putString("person_suggestion_id", paramString3);
      localBundle2.putInt("person_suggestion_type", paramInt);
      localbzk.n = this;
      localbzk.p = 0;
      localbzk.a(this.x, "add_email_dialog");
      return;
    }
    String str1 = null;
    if (paramBoolean2) {
      str1 = brn.a(this.bn, this.af, paramBoolean1);
    }
    if ((this.aa) && (paramBoolean1) && (str1 != null))
    {
      String str2 = brn.a(this.bn, paramBoolean1);
      if (this.d.e(this.bn, this.am.c()))
      {
        Bundle localBundle1 = a(paramString1, paramString2, paramBoolean1, paramString3, paramInt, i);
        this.d.a(this, this.am.c(), "first_circle_add_one_click", paramString2, str2, localBundle1);
        return;
      }
    }
    if (str1 == null)
    {
      b(paramString1, paramString2, paramString3, paramInt);
      return;
    }
    F();
    ArrayList localArrayList = new ArrayList();
    int j = this.am.c();
    localArrayList.add(str1);
    bnp localbnp = new bnp(this.bn);
    localbnp.a = j;
    localbnp.b = paramString1;
    localbnp.c = paramString2;
    localbnp.d = i;
    localbnp.e = localArrayList;
    localbnp.f = null;
    localbnp.g = true;
    localbnp.h = false;
    localbnp.i = true;
    this.ap.b(localbnp.a());
    this.c.a(this.bn, j, paramString1, paramString3, E(), i);
    G();
    A();
    hgh localhgh = a(paramInt, 4);
    new hvj(this.bn, (gxx)this.bo.a(gxx.class), paramString1, localArrayList, null, localhgh).a(j);
  }
  
  protected abstract void A();
  
  public Integer B()
  {
    return null;
  }
  
  public Integer C()
  {
    return null;
  }
  
  protected int E()
  {
    return 9;
  }
  
  protected void F() {}
  
  protected void G() {}
  
  protected boolean H()
  {
    return false;
  }
  
  protected final void J()
  {
    if (K())
    {
      if (this.ad)
      {
        hwq localhwq4 = this.ar;
        hwt localhwt3 = hwt.a;
        if (localhwt3 == null) {
          throw new NullPointerException();
        }
        localhwq4.g = ((hwt)localhwt3);
        localhwq4.a();
        return;
      }
      hwq localhwq2 = this.ar;
      localhwq2.d = x();
      localhwq2.c = 0;
      localhwq2.e();
      hwq localhwq3 = this.ar;
      hwt localhwt2 = hwt.c;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq3.g = ((hwt)localhwt2);
      localhwq3.a();
      return;
    }
    hwq localhwq1 = this.ar;
    hwt localhwt1 = hwt.b;
    if (localhwt1 == null) {
      throw new NullPointerException();
    }
    localhwq1.g = ((hwt)localhwt1);
    localhwq1.a();
  }
  
  public boolean K()
  {
    return (this.ae == null) || (this.ae.isEmpty());
  }
  
  protected final void L()
  {
    bj localbj = (bj)this.x.a("pending");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  public void R() {}
  
  public int R_()
  {
    return 0;
  }
  
  protected int a(int paramInt)
  {
    return R_();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(w(), paramViewGroup, false);
    this.al = ((ListView)localView.findViewById(aaw.ew));
    this.al.setCacheColorHint(a);
    this.al.setRecyclerListener(this);
    cv localcv = k();
    localcv.a(0, null, this);
    z();
    this.ag = new jly(this.bn, localcv, this.am.c(), 16);
    jly localjly1 = this.ag;
    DataSetObserver localDataSetObserver = this.ax;
    localjly1.b.registerObserver(localDataSetObserver);
    jly localjly2 = this.ag;
    localjly2.a.a(localjly2.d, null, localjly2);
    this.ak = new hvl(this.bn, this.al, this);
    TextView localTextView = (TextView)localView.findViewById(aaw.eA);
    if (localTextView != null) {
      localTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    J();
    return localView;
  }
  
  public fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    int i = this.am.c();
    return new jma(this.bn, i, 1);
  }
  
  protected hgh a(int paramInt1, int paramInt2)
  {
    return hvj.a(paramInt1, 4);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 0) {
      a(paramInt2, paramIntent);
    }
    super.a(paramInt1, paramInt2, paramIntent);
  }
  
  protected void a(int paramInt, Intent paramIntent)
  {
    if (paramInt != -1) {
      return;
    }
    this.at.a(this.am.c(), "AddToCircle", 9L, 1L);
    String str1 = paramIntent.getStringExtra("person_id");
    String str2 = paramIntent.getStringExtra("display_name");
    String str3 = paramIntent.getStringExtra("suggestion_id");
    ArrayList localArrayList1 = paramIntent.getExtras().getStringArrayList("original_circle_ids");
    ArrayList localArrayList2 = paramIntent.getExtras().getStringArrayList("selected_circle_ids");
    String str4 = brn.a(this.bn, this.af, true);
    int i = 0;
    ArrayList localArrayList3 = new ArrayList();
    Iterator localIterator1 = localArrayList2.iterator();
    while (localIterator1.hasNext())
    {
      String str7 = (String)localIterator1.next();
      if (!localArrayList1.contains(str7)) {
        localArrayList3.add(str7);
      }
    }
    ArrayList localArrayList4 = new ArrayList();
    Iterator localIterator2 = localArrayList1.iterator();
    while (localIterator2.hasNext())
    {
      String str6 = (String)localIterator2.next();
      if (str6.equals(str4)) {
        i = 1;
      }
      if (!localArrayList2.contains(str6)) {
        localArrayList4.add(str6);
      }
    }
    int j = this.am.c();
    int k;
    boolean bool1;
    if ((this.aa) && (i != 0) && (!localArrayList2.isEmpty()))
    {
      k = 1;
      if ((localArrayList1 != null) && (!localArrayList1.isEmpty())) {
        break label549;
      }
      bool1 = true;
      label277:
      if ((localArrayList2 != null) && (!localArrayList2.isEmpty())) {
        break label555;
      }
    }
    label549:
    label555:
    for (boolean bool2 = true;; bool2 = false)
    {
      int m = a(this.ao);
      gzj localgzj = (gzj)this.bo.a(gzj.class);
      bnp localbnp = new bnp(this.bn);
      localbnp.a = j;
      localbnp.b = str1;
      localbnp.c = str2;
      localbnp.d = m;
      localbnp.e = localArrayList3;
      localbnp.f = localArrayList4;
      localbnp.g = bool1;
      localbnp.h = bool2;
      localbnp.i = false;
      if (k != 0)
      {
        String str5 = brn.a(this.bn, true);
        localbnp.k = this.bn.getString(aau.mj, new Object[] { str5 });
      }
      bno localbno = localbnp.a();
      localgzj.d.a(localbno, false);
      localgzj.b(localbno);
      if ((!localArrayList3.isEmpty()) && (localArrayList1.isEmpty())) {
        this.c.a(this.bn, j, str1, str3, E(), m);
      }
      hgh localhgh = a(this.ao, 4);
      this.an = new hvj(this.bn, (gxx)this.bo.a(gxx.class), str1, localArrayList3, localArrayList4, localhgh);
      return;
      k = 0;
      break;
      bool1 = false;
      break label277;
    }
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (a == 0) {
      a = paramActivity.getResources().getColor(efj.jU);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.ao = paramBundle.getInt("suggestion_type", -1);
      this.an = hvj.a(this.bn, (gxx)this.bo.a(gxx.class), paramBundle);
      if (paramBundle.containsKey("unblock_request_id")) {
        this.ah = Integer.valueOf(paramBundle.getInt("unblock_request_id"));
      }
    }
    this.ai = this.am.f().b("domain_name");
    if (this.as)
    {
      bvc.a(this.bn).a();
      cll.d.clear();
      this.as = false;
    }
    this.Z = new hfa(this.bn, loh.a);
  }
  
  public void a(Bundle paramBundle, String paramString)
  {
    if ("add_email_dialog".equals(paramString))
    {
      str = paramBundle.getString("message");
      a(paramBundle.getString("person_id"), str, paramBundle.getBoolean("for_sharing"), paramBundle.getString("person_suggestion_id"), paramBundle.getInt("person_suggestion_type", 0));
    }
    while ((!"first_circle_add".equals(paramString)) && (!"first_circle_add_one_click".equals(paramString)))
    {
      String str;
      return;
    }
    a(paramBundle.getString("person_id"), paramBundle.getString("person_name"), paramBundle.getBoolean("for_sharing"), paramBundle.getString("suggestion_id"), paramBundle.getInt("suggestion_type", -1));
  }
  
  protected final void a(ListAdapter paramListAdapter)
  {
    this.ae = paramListAdapter;
    this.al.setAdapter(this.ae);
  }
  
  public void a(PeopleListRowView paramPeopleListRowView, String paramString)
  {
    paramPeopleListRowView.a(paramPeopleListRowView.l, paramPeopleListRowView.l.getWidth(), 300L, true);
  }
  
  protected final void a(dmx paramdmx)
  {
    L();
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label39;
      }
    }
    label39:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        Toast.makeText(this.bn, aau.uV, 0).show();
      }
      return;
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    switch (paramfu.i)
    {
    default: 
      return;
    }
    this.af = paramCursor;
  }
  
  public void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  protected void a(hae paramhae)
  {
    if (this.an != null)
    {
      if (hae.a(paramhae)) {
        break label70;
      }
      int i = this.am.c();
      this.an.a(i);
      G();
    }
    for (;;)
    {
      this.an = null;
      this.at.a(this.am.c(), new String[] { "AddToCircle" });
      return;
      label70:
      Toast.makeText(this.bn, paramhae.d, 0).show();
    }
  }
  
  public void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("ModifyCircleMembershipsTask".equals(paramString)) {
      a(paramhae);
    }
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, int paramInt, hvo paramhvo)
  {
    int i = this.am.c();
    if (paramBundle != null)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = gxz.ed;
      if (paramBundle != null) {
        localgxw.h.putAll(paramBundle);
      }
      localgxx.a(localgxw);
    }
    Intent localIntent1;
    if ((H()) && (this.aw.a()))
    {
      kpm localkpm = new kpm(this.bn);
      localkpm.a = paramString1;
      localkpm.c = Integer.valueOf(f().getResources().getColor(efj.jh));
      localkpm.d = paramhvo.a;
      localkpm.e = paramhvo.b;
      localkpm.b = true;
      localIntent1 = localkpm.a();
    }
    for (int j = 1;; j = 0)
    {
      if (localIntent1 == null) {}
      for (Intent localIntent2 = this.av.a(this.bn).a(paramString1).a();; localIntent2 = localIntent1)
      {
        if ((Build.VERSION.SDK_INT < 16) || (j != 0)) {
          a(localIntent2, 1);
        }
        for (;;)
        {
          this.c.b(this.bn, i, paramString1, paramString2, E(), a(paramInt));
          return;
          Bundle localBundle = ((gvj)this.bo.a(gvj.class)).a();
          f().startActivityForResult(localIntent2, 0, localBundle);
        }
      }
      localIntent1 = null;
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    b(paramString1, paramString2, paramString3, paramInt);
  }
  
  public void a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if ((this.aa) || (!paramBoolean)) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramString1, paramString2, paramBoolean, paramString3, paramInt, bool);
      return;
    }
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    ((dhd)this.bo.a(dhd.class)).d().a(paramBoolean).a(paramString).a().a(h(), "unblock_person");
  }
  
  public void a(tp paramtp)
  {
    paramtp.d(true);
    Bundle localBundle = this.m;
    if ((localBundle != null) && (!localBundle.getBoolean("disable_up_button", false)))
    {
      paramtp.c(true);
      efj.a(paramtp, true);
    }
  }
  
  public final void a(boolean paramBoolean) {}
  
  public boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void ab_()
  {
    jly localjly = this.ag;
    localjly.a.b(localjly.d, null, localjly);
  }
  
  public void ae_()
  {
    A();
  }
  
  protected int af_()
  {
    return efj.vw;
  }
  
  protected final View b(View paramView)
  {
    this.al = ((ListView)paramView.findViewById(aaw.ew));
    View localView = new View(this.bn);
    nj.a.c(localView, 2);
    localView.setLayoutParams(new AbsListView.LayoutParams(this.Z.d, this.Z.d));
    this.al.addHeaderView(localView);
    this.al.addFooterView(localView);
    this.ab = true;
    if (efj.L(this.bn)) {}
    for (int i = this.Z.d;; i = this.Z.f)
    {
      this.al.setPadding(i, 0, i, 0);
      this.al.setScrollBarStyle(33554432);
      return paramView;
    }
  }
  
  protected final void b(int paramInt)
  {
    coo.a(null, g().getString(paramInt), false, false).a(this.x, "pending");
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    F();
    this.ao = paramInt;
    int i = this.am.c();
    Intent localIntent = efj.a(this.bn, i, paramString1, paramString2, paramString3, null, null, true);
    gxr localgxr = new gxr().a(this.bn);
    localIntent.putExtra(gxr.a, localgxr);
    a(localIntent, 0);
  }
  
  public void b(tp paramtp) {}
  
  public boolean b(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if (!this.aa) {
      return false;
    }
    a(paramString1, paramString2, paramBoolean, paramString3, paramInt, false);
    return true;
  }
  
  public void b_(View paramView)
  {
    int i = 1;
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)paramView.getParent();
    String str1 = localPeopleListRowView.c;
    String str2 = localPeopleListRowView.f;
    this.au.a(this.am.c(), str1);
    int j;
    int k;
    int m;
    int n;
    if (Build.VERSION.SDK_INT >= 14)
    {
      j = i;
      if (j == 0) {
        break label224;
      }
      k = this.al.getFirstVisiblePosition();
      m = this.al.getLastVisiblePosition();
      if (!this.ab) {
        break label191;
      }
      if (k != 0) {
        break label184;
      }
      n = i;
      label91:
      if (m + 1 == this.al.getCount()) {
        m--;
      }
      label108:
      if (Build.VERSION.SDK_INT < 14) {
        break label198;
      }
    }
    HashMap localHashMap1;
    for (;;)
    {
      if (i == 0) {
        break label282;
      }
      localHashMap1 = new HashMap();
      while (n <= m)
      {
        localHashMap1.put(a(this.al.getItemAtPosition(n)), Float.valueOf(this.al.getChildAt(n - k).getY()));
        n++;
      }
      j = 0;
      break;
      label184:
      n = k;
      break label91;
      label191:
      n = k;
      break label108;
      label198:
      i = 0;
    }
    label282:
    for (HashMap localHashMap2 = localHashMap1;; localHashMap2 = a(k, n, m))
    {
      this.ak.a(this.al, localHashMap2, this.ab);
      label224:
      String str3 = jjf.c(str1);
      cll.d.add(str3);
      if ((this.ae instanceof ckb)) {
        ((ckb)this.ae).a();
      }
      this.c.a(str1, str2, a(localPeopleListRowView.g));
      return;
    }
  }
  
  protected void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.am = ((git)this.bo.a(git.class));
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    this.bo.a(jiw.class);
    this.ap = ((gzj)this.bo.a(gzj.class));
    this.at = ((lta)this.bo.a(lta.class));
    this.b = ((hgg)this.bo.a(hgg.class));
    this.c = ((hum)this.bo.a(hum.class));
    this.d = ((jia)this.bo.a(jia.class));
    this.au = ((hul)this.bo.a(hul.class));
    this.aa = this.au.a(this.am.c());
    ill localill = new ill(this.bn, this.am.c());
    localill.a.add(ine.class);
    this.aq = localill;
    this.av = ((jfa)this.bo.a(jfa.class));
    this.aw = ((kpn)this.bo.a(kpn.class));
    this.bo.a(dhf.class, this);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("force_cache", true);
    paramBundle.putInt("suggestion_type", this.ao);
    if (this.an != null) {
      this.an.a(paramBundle);
    }
    if (this.ah != null) {
      paramBundle.putInt("unblock_request_id", this.ah.intValue());
    }
  }
  
  protected final boolean h(Bundle paramBundle)
  {
    if (this.d.d(this.bn, this.am.c()))
    {
      this.d.a(this, this.am.c(), "first_circle_add", paramBundle);
      return true;
    }
    return false;
  }
  
  public final void k(String paramString)
  {
    this.ah = EsService.b(this.bn, this.am.c(), paramString, null, false);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.bE;
    localgxx.a(localgxw);
    b(aau.vb);
  }
  
  public void m()
  {
    super.m();
    EsService.a(this.bn, this.ay);
    this.b.a(true);
    if (this.ah != null)
    {
      int i = this.ah.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.ah.intValue());
        this.ah.intValue();
        a(localdmx);
        this.ah = null;
      }
    }
    J();
  }
  
  public void n()
  {
    super.n();
    dme localdme = this.ay;
    EsService.d.remove(localdme);
    this.b.a(false);
    this.c.a(this.bn, this.am.c(), E());
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == aaw.mm) {
      switch (((Integer)paramView.getTag(aaw.hl)).intValue())
      {
      }
    }
    while (!(paramView instanceof PeopleListRowView))
    {
      return;
      int i = ((Integer)paramView.getTag(aaw.hj)).intValue();
      int j = this.am.c();
      a(efj.a(this.bn, j, i, null));
      return;
    }
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)paramView;
    a(localPeopleListRowView.c, localPeopleListRowView.f, localPeopleListRowView.n, a(localPeopleListRowView.g), new hvo(localPeopleListRowView.d, localPeopleListRowView.e));
  }
  
  public void onMovedToScrapHeap(View paramView)
  {
    if ((paramView instanceof AbsListView.RecyclerListener)) {
      ((AbsListView.RecyclerListener)paramView).onMovedToScrapHeap(paramView);
    }
  }
  
  public gya r_()
  {
    return gya.q;
  }
  
  protected int w()
  {
    return efj.vt;
  }
  
  protected CharSequence x()
  {
    int i = aau.lE;
    return g().getString(i);
  }
  
  protected abstract void z();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjx
 * JD-Core Version:    0.7.0.1
 */