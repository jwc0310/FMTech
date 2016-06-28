import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.apps.plus.phone.PeopleListActivity;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import com.google.android.libraries.social.discovery.views.PeopleListSwipeableRowView;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class chu
  extends cfw
  implements djw, hgz, hvn, jhs, jjc, led, lfm
{
  private static final long ae = TimeUnit.SECONDS.toMillis(3L);
  dgm Z;
  private la<Integer, Boolean> aQ = new la();
  private long aR;
  private jiq aS;
  private int aT = -1;
  private final lfk aU = new lfk(this, this.bp, this);
  private final cw<nzp[]> aV = new chv(this);
  private final cw<Cursor> aW = new chw(this);
  private final cw<ArrayList<hur>> aX = new chx(this);
  private final cw<lhi> aY = new chy(this);
  private final cw<Cursor> aZ = new chz(this);
  boolean aa;
  boolean ab = true;
  ArrayList<String> ac;
  String ad = null;
  private hpo af;
  private hgv ag;
  private hho ah;
  private lta ai;
  private jfa aj;
  private hum ak;
  private dsr al;
  private jia am;
  private gzj an;
  private hvj ao;
  private boolean ap;
  private boolean aq;
  private final cw<Cursor> ba = new cia(this);
  private final cw<hhf> bb = new cib(this);
  private final cw<Cursor> bc = new cic(this);
  hhh d;
  
  public chu()
  {
    new gxj(this.bp, (byte)0);
    this.aS = new jiq();
    jiq localjiq = this.aS;
    localjiq.n = true;
    localjiq.m = false;
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
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    int i = this.at.c();
    a(efj.a(this.bn, i, paramString1, paramString2, paramString3, null, null, true), 0);
  }
  
  private final void a(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, int paramInt, boolean paramBoolean2)
  {
    if (!this.av.a()) {
      this.bn.startActivity(this.av.b());
    }
    int i;
    for (;;)
    {
      return;
      i = R_();
      Bundle localBundle1 = a(paramString1, paramString2, paramBoolean1, paramString3, paramInt, i);
      if (this.am.d(this.bn, this.at.c())) {
        this.am.a(this, this.at.c(), "first_circle_add", localBundle1);
      }
      for (int j = 1; j == 0; j = 0)
      {
        if (paramString2 != null) {
          break label227;
        }
        bzk localbzk = bzk.a(this.bn.getString(aau.bH), null, this.bn.getString(aau.bG), this.bn.getString(17039370), this.bn.getString(17039360), false);
        Bundle localBundle3 = localbzk.m;
        localBundle3.putString("person_id", paramString1);
        localBundle3.putBoolean("for_sharing", paramBoolean1);
        localBundle3.putString("person_suggestion_id", paramString3);
        localBundle3.putInt("person_suggestion_type", paramInt);
        localbzk.n = this;
        localbzk.p = 0;
        localbzk.a(this.x, "add_email_dialog");
        return;
      }
    }
    label227:
    String str1 = null;
    if (paramBoolean2) {
      str1 = brn.a(this.bn, this.aO, paramBoolean1);
    }
    if ((this.aq) && (paramBoolean1) && (str1 != null))
    {
      String str2 = brn.a(this.bn, paramBoolean1);
      if (this.am.e(this.bn, this.at.c()))
      {
        Bundle localBundle2 = a(paramString1, paramString2, paramBoolean1, paramString3, paramInt, i);
        this.am.a(this, this.at.c(), "first_circle_add_one_click", paramString2, str2, localBundle2);
        return;
      }
    }
    if (str1 == null)
    {
      a(paramString1, paramString2, paramString3);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    int k = this.at.c();
    localArrayList.add(str1);
    bnp localbnp = new bnp(this.bn);
    localbnp.a = k;
    localbnp.b = paramString1;
    localbnp.c = paramString2;
    localbnp.d = i;
    localbnp.e = localArrayList;
    localbnp.f = null;
    localbnp.g = true;
    localbnp.h = false;
    localbnp.i = true;
    this.an.b(localbnp.a());
    this.ak.a(this.bn, k, paramString1, paramString3, 9, i);
    an();
    hgh localhgh = b(paramInt, 4);
    new hvj(this.bn, (gxx)this.bo.a(gxx.class), paramString1, localArrayList, null, localhgh).a(k);
  }
  
  private final void an()
  {
    cv localcv = k();
    if ((TextUtils.isEmpty(this.c)) && (this.aa))
    {
      cw localcw4 = this.aX;
      a(13, false);
      localcv.b(13, null, localcw4);
      return;
    }
    cw localcw1 = this.aW;
    a(7, false);
    localcv.b(7, null, localcw1);
    cw localcw2 = this.aW;
    a(6, false);
    localcv.b(6, null, localcw2);
    cw localcw3 = this.aW;
    a(8, false);
    localcv.b(8, null, localcw3);
  }
  
  private final void ao()
  {
    String str1;
    String str2;
    String str3;
    if ((TextUtils.isEmpty(this.c)) && (this.aa))
    {
      str1 = this.bn.getString(aau.hy);
      str2 = this.bn.getString(aau.hB);
      str3 = this.bn.getString(aau.hz);
    }
    for (String str4 = this.bn.getString(aau.hA);; str4 = this.bn.getString(aau.sM))
    {
      this.Z.k = str1;
      this.Z.l = str2;
      this.Z.m = str3;
      this.Z.n = str4;
      return;
      str1 = this.bn.getString(aau.sF);
      str2 = this.bn.getString(aau.sN);
      str3 = this.bn.getString(aau.sK);
    }
  }
  
  static Object[] b(Cursor paramCursor)
  {
    Object[] arrayOfObject = new Object[paramCursor.getColumnNames().length];
    String[] arrayOfString1 = dgm.d;
    String[] arrayOfString2 = dgm.e;
    String[] arrayOfString3 = dgm.f;
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      int i2 = paramCursor.getColumnIndex(arrayOfString1[i]);
      if (i2 >= 0) {
        arrayOfObject[i2] = paramCursor.getString(i2);
      }
    }
    int m;
    for (int j = 0;; j++)
    {
      int k = arrayOfString2.length;
      m = 0;
      if (j >= k) {
        break;
      }
      int i1 = paramCursor.getColumnIndex(arrayOfString2[j]);
      if (i1 >= 0) {
        arrayOfObject[i1] = Integer.valueOf(paramCursor.getInt(i1));
      }
    }
    while (m < arrayOfString3.length)
    {
      int n = paramCursor.getColumnIndex(arrayOfString3[m]);
      if (n >= 0) {
        arrayOfObject[n] = paramCursor.getBlob(n);
      }
      m++;
    }
    return arrayOfObject;
  }
  
  private final boolean c(int paramInt)
  {
    return (!this.aQ.containsKey(Integer.valueOf(paramInt))) || (((Boolean)this.aQ.get(Integer.valueOf(paramInt))).booleanValue());
  }
  
  public final void A_()
  {
    super.A_();
    this.ab = true;
    z();
  }
  
  protected final boolean K()
  {
    return false;
  }
  
  public final void M()
  {
    int i = this.at.c();
    Intent localIntent;
    if ((TextUtils.isEmpty(this.c)) && (this.aa))
    {
      localIntent = new Intent(f(), PeopleListActivity.class);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("people_view_type", 14);
      localIntent.putExtra("white_action_bar", true);
      localIntent.putExtra("people_notification_list_title", true);
    }
    for (;;)
    {
      a(localIntent);
      return;
      localIntent = efj.e(f(), i, this.c);
      localIntent.putExtra("white_action_bar", true);
    }
  }
  
  public final void N()
  {
    if ((TextUtils.isEmpty(this.c)) && (this.aa)) {}
    for (Intent localIntent = this.af.f(this.at.c());; localIntent = this.af.a(f(), this.at.c(), this.c))
    {
      a(localIntent);
      return;
    }
  }
  
  public final void O()
  {
    int i = this.at.c();
    if ((TextUtils.isEmpty(this.c)) && (this.aa)) {}
    for (Intent localIntent = this.al.b(i);; localIntent = ((kyj)mbb.a(this.bn, kyj.class)).a(this.bn, i, this.c))
    {
      a(localIntent);
      return;
    }
  }
  
  public final void P()
  {
    b(0);
    this.Z.o = this.a;
  }
  
  public final void Q()
  {
    b(1);
    this.Z.o = this.a;
  }
  
  public final void R() {}
  
  final boolean S()
  {
    return (c(5)) && (c(10)) && (c(9)) && (c(6)) && (c(7)) && (c(8));
  }
  
  final boolean T()
  {
    return (c(12)) && (c(13)) && (c(11));
  }
  
  final void U()
  {
    long l = System.currentTimeMillis() - this.aR;
    if ((TextUtils.isEmpty(this.c)) && (this.aa)) {}
    for (boolean bool = T();; bool = S())
    {
      if ((bool) || (l > ae))
      {
        ad();
        this.az.a(true, -1);
        ae();
      }
      return;
    }
  }
  
  protected final dfz a(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, cyh paramcyh, lob paramlob)
  {
    this.Z = new dgm(paramContext, paramStreamGridView, paramhfa, this.at.c(), paramdat, paramdge, paramlob);
    this.Z.j = this;
    this.Z.o = this.a;
    ao();
    return this.Z;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str1;
    String str2;
    String str3;
    ArrayList localArrayList1;
    ArrayList localArrayList3;
    ArrayList localArrayList4;
    int j;
    int k;
    boolean bool1;
    if ((paramInt1 == 0) && (paramInt2 == -1))
    {
      this.ai.a(this.at.c(), "AddToCircle", 9L, 1L);
      str1 = paramIntent.getStringExtra("person_id");
      str2 = paramIntent.getStringExtra("display_name");
      str3 = paramIntent.getStringExtra("suggestion_id");
      localArrayList1 = paramIntent.getExtras().getStringArrayList("original_circle_ids");
      ArrayList localArrayList2 = paramIntent.getExtras().getStringArrayList("selected_circle_ids");
      String str4 = brn.a(this.bn, this.aO, true);
      int i = 0;
      localArrayList3 = new ArrayList();
      Iterator localIterator1 = localArrayList2.iterator();
      while (localIterator1.hasNext())
      {
        String str7 = (String)localIterator1.next();
        if (!localArrayList1.contains(str7)) {
          localArrayList3.add(str7);
        }
      }
      localArrayList4 = new ArrayList();
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
      j = this.at.c();
      if ((!this.aq) || (i == 0) || (localArrayList2.isEmpty())) {
        break label551;
      }
      k = 1;
      if ((localArrayList1 != null) && (!localArrayList1.isEmpty())) {
        break label557;
      }
      bool1 = true;
      label281:
      if ((localArrayList2 != null) && (!localArrayList2.isEmpty())) {
        break label563;
      }
    }
    label551:
    label557:
    label563:
    for (boolean bool2 = true;; bool2 = false)
    {
      int m = R_();
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
        this.ak.a(this.bn, j, str1, str3, 9, m);
      }
      hgh localhgh = b(this.aT, 4);
      this.ao = new hvj(this.bn, (gxx)this.bo.a(gxx.class), str1, localArrayList3, localArrayList4, localhgh);
      super.a(paramInt1, paramInt2, paramIntent);
      return;
      k = 0;
      break;
      bool1 = false;
      break label281;
    }
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    this.aQ.put(Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean));
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.ab = paramBundle.getBoolean("filterFollowedCollexions");
      this.ac = paramBundle.getStringArrayList("featuredCollexionsIds");
      this.ao = hvj.a(this.bn, (gxx)this.bo.a(gxx.class), paramBundle);
    }
    if (this.m.getBoolean("clear_people_suggestions"))
    {
      bvc.a(this.bn).a();
      cll.d.clear();
      this.m.putBoolean("clear_people_suggestions", false);
    }
    cv localcv = k();
    if ((TextUtils.isEmpty(this.c)) && (this.aa))
    {
      cw localcw7 = this.aX;
      a(13, false);
      localcv.a(13, null, localcw7);
      cw localcw8 = this.ba;
      a(11, false);
      localcv.a(11, null, localcw8);
      cw localcw9 = this.bc;
      a(12, false);
      localcv.a(12, null, localcw9);
    }
    for (;;)
    {
      this.aR = System.currentTimeMillis();
      cid localcid = new cid(this);
      long l = ae;
      efj.m().postDelayed(localcid, l);
      return;
      cw localcw1 = this.aV;
      a(5, false);
      localcv.a(5, null, localcw1);
      cw localcw2 = this.aY;
      a(9, false);
      localcv.a(9, null, localcw2);
      cw localcw3 = this.bb;
      a(10, false);
      localcv.a(10, null, localcw3);
      cw localcw4 = this.aW;
      a(6, false);
      localcv.a(6, null, localcw4);
      cw localcw5 = this.aW;
      a(8, false);
      localcv.a(8, null, localcw5);
      cw localcw6 = this.aW;
      a(7, false);
      localcv.a(7, null, localcw6);
    }
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("add_email_dialog".equals(paramString))
    {
      String str = paramBundle.getString("message");
      a(paramBundle.getString("person_id"), str, paramBundle.getBoolean("for_sharing"), paramBundle.getString("person_suggestion_id"), paramBundle.getInt("person_suggestion_type", 0));
    }
    for (;;)
    {
      super.a(paramBundle, paramString);
      return;
      if (("first_circle_add".equals(paramString)) || ("first_circle_add_one_click".equals(paramString))) {
        a(paramBundle.getString("person_id"), paramBundle.getString("person_name"), paramBundle.getBoolean("for_sharing"), paramBundle.getString("suggestion_id"), paramBundle.getInt("suggestion_type", -1));
      }
    }
  }
  
  public final void a(PeopleListRowView paramPeopleListRowView, String paramString)
  {
    paramPeopleListRowView.a(paramPeopleListRowView.l, paramPeopleListRowView.l.getWidth(), 300L, true);
  }
  
  public final void a(String paramString, int paramInt)
  {
    hgv localhgv = this.ag;
    if (TextUtils.isEmpty(this.c)) {}
    for (Uri localUri = this.ah.b();; localUri = this.ah.c())
    {
      localhgv.a(paramString, paramInt, localUri);
      return;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("ModifyCircleMembershipsTask".equals(paramString)) {
      if (this.ao != null)
      {
        if (!hae.a(paramhae))
        {
          int i = this.at.c();
          this.ao.a(i);
          this.ao = null;
        }
      }
      else {
        this.ai.a(this.at.c(), new String[] { "AddToCircle" });
      }
    }
    for (;;)
    {
      super.a(paramString, paramhae, paramhaa);
      return;
      Toast.makeText(this.bn, paramhae.d, 0).show();
      break;
      if ("fetch_newer_squares".equals(paramString))
      {
        paramhaa.c = false;
        cv localcv = k();
        cw localcw = this.ba;
        a(11, false);
        localcv.b(11, null, localcw);
      }
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Intent localIntent = ((kyp)this.bo.a(kyp.class)).a(this.at.c(), paramString1, null);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, int paramInt, hvo paramhvo)
  {
    a(this.aj.a(this.bn).a(paramString1).a());
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    a(paramString1, paramString2, paramString3);
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if ((this.aq) || (!paramBoolean)) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramString1, paramString2, paramBoolean, paramString3, paramInt, bool);
      return;
    }
  }
  
  public final void a(String paramString, kxg paramkxg)
  {
    this.ad = paramString;
    cv localcv = k();
    cw localcw = this.aZ;
    a(14, false);
    localcv.b(14, null, localcw);
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    ((dhd)this.bo.a(dhd.class)).d().a(paramBoolean).a(paramString).a().a(h(), "unblock_person");
  }
  
  public final void a(kxg paramkxg, String paramString, int paramInt)
  {
    this.aU.a(paramkxg, paramString, paramInt);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.iq)
    {
      this.ab = true;
      z();
      W();
      return true;
    }
    return super.a(paramMenuItem);
  }
  
  public final void ab_() {}
  
  public final void ae_()
  {
    an();
  }
  
  public final void b(String paramString1, String paramString2)
  {
    Intent localIntent = ((hpo)this.bo.a(hpo.class)).a(this.at.c(), paramString1, paramString2);
    ay.a(f(), localIntent, ((gvj)this.bo.a(gvj.class)).a());
  }
  
  public final boolean b(String paramString)
  {
    jiq localjiq = this.aS;
    if (!TextUtils.equals(localjiq.a, paramString))
    {
      localjiq.a = paramString;
      localjiq.g.clear();
      localjiq.i.clear();
      localjiq.j.clear();
      localjiq.k.clear();
      localjiq.l.clear();
      localjiq.h = false;
      localjiq.m = false;
      localjiq.b = null;
    }
    String str = null;
    if (paramString == null) {}
    for (;;)
    {
      this.c = str;
      return true;
      str = paramString.trim();
    }
  }
  
  public final boolean b(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if (!this.aq) {
      return false;
    }
    a(paramString1, paramString2, paramBoolean, paramString3, paramInt, false);
    return true;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(hgz.class, this);
    this.bo.a(led.class, this);
    this.bo.a(lfy.class, this.aU);
    this.bo.a(hvn.class, this);
    this.af = ((hpo)this.bo.a(hpo.class));
    this.d = ((hhh)this.bo.a(hhh.class));
    this.ag = ((hgv)this.bo.a(hgv.class));
    this.ah = ((hho)this.bo.a(hho.class));
    this.al = ((dsr)this.bo.a(dsr.class));
    this.aj = ((jfa)this.bo.a(jfa.class));
    this.ak = ((hum)this.bo.a(hum.class));
    this.am = ((jia)this.bo.a(jia.class));
    this.an = ((gzj)this.bo.a(gzj.class));
    this.ai = ((lta)this.bo.a(lta.class));
    int i = this.at.c();
    djp localdjp = (djp)mbb.a(this.bn, djp.class);
    this.ap = localdjp.a(i);
    this.aa = localdjp.b(i);
    this.aq = ((hul)this.bo.a(hul.class)).a(this.at.c());
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("filterFollowedCollexions", this.ab);
    paramBundle.putStringArrayList("featuredCollexionsIds", this.ac);
  }
  
  public final void m()
  {
    super.m();
  }
  
  public final void n()
  {
    super.n();
  }
  
  public final gxq v()
  {
    if ((TextUtils.isEmpty(this.c)) && (this.aa)) {
      return new gxq(pkb.h);
    }
    if (this.ap) {
      return new gxq(pkb.l);
    }
    return super.v();
  }
  
  protected final void z()
  {
    super.z();
    ao();
    cv localcv = k();
    if ((TextUtils.isEmpty(this.c)) && (this.aa))
    {
      cw localcw4 = this.bc;
      a(12, false);
      localcv.b(12, null, localcw4);
      if (f() != null)
      {
        kzj localkzj = new kzj(this.bn, this.at.c(), true);
        localkzj.f = "fetch_newer_squares";
        this.an.b(localkzj);
      }
    }
    for (;;)
    {
      an();
      dgm localdgm1 = this.Z;
      if (localdgm1.g != null) {
        localdgm1.g = null;
      }
      this.Z.c(null);
      this.Z.a(null);
      dgm localdgm2 = this.Z;
      if (localdgm2.i != null) {
        localdgm2.i = null;
      }
      dgm localdgm3 = this.Z;
      if (localdgm3.h != null) {
        localdgm3.h = null;
      }
      this.az.a(true, -1);
      this.aR = System.currentTimeMillis();
      this.ad = null;
      efj.b(this);
      efj.a(this);
      cid localcid = new cid(this);
      long l = ae;
      efj.m().postDelayed(localcid, l);
      return;
      cw localcw1 = this.aV;
      a(5, false);
      localcv.b(5, null, localcw1);
      cw localcw2 = this.aY;
      a(9, false);
      localcv.b(9, null, localcw2);
      cw localcw3 = this.bb;
      a(10, false);
      localcv.b(10, null, localcw3);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chu
 * JD-Core Version:    0.7.0.1
 */