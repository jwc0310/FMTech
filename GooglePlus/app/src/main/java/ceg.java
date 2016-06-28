import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.plus.phone.PeopleListActivity;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ceg
  extends mca
  implements cwq, dhf, dvp, gpq, gxv, gzi, hvr, jhs, jjc, luu
{
  static int Z;
  static int aa;
  static int ab;
  static int ac;
  static final hqr ae = new hqr(az);
  private static int ar;
  private static int as;
  private static String[] ax = { "type_1", "data_1", "type_2", "data_2" };
  private static String[] ay = { "index_1", "index_2", "index_3" };
  private static String[] az = { "dummy" };
  static int d;
  final ces a = new ces(this);
  private final dme aA;
  private final DataSetObserver aB;
  private HashMap<String, Integer> aC;
  private int aD;
  private boolean aE;
  private hfa aF;
  private ceq aG;
  private String aH;
  private boolean aI;
  private ArrayList<String> aJ;
  private Integer aK;
  private hvj aL;
  private int aM;
  private hgg aN;
  private hum aO;
  private jia aP;
  private hul aQ;
  private kpn aR;
  private jfa aS;
  private boolean aT;
  git ad;
  Cursor af;
  boolean ag;
  boolean ah;
  boolean ai;
  boolean aj;
  boolean ak;
  boolean al;
  RecyclingViewGroup am;
  cep an;
  jly ao;
  String ap;
  ill aq;
  private final gpk at;
  private lvi au;
  private gzj av;
  private final hwq aw;
  final ceo b = new ceo(this);
  final cen c = new cen(this);
  
  public ceg()
  {
    this(false);
  }
  
  public ceg(boolean paramBoolean)
  {
    gxl localgxl = new gxl(pkf.p);
    this.bo.a(gxs.class, localgxl);
    new gxj(this.bp, (byte)0);
    new hun(this.bp, aaw.hc);
    jie localjie = new jie(this.bp);
    localjie.c = this;
    localjie.d = this;
    this.at = new gpk(this, this.bp, this);
    this.au = new lvi();
    hwq localhwq = new hwq(this.bp);
    int i = aau.jq;
    localhwq.d = null;
    localhwq.c = i;
    localhwq.e();
    int j = aau.jq;
    localhwq.f = null;
    localhwq.e = j;
    localhwq.e();
    this.aw = localhwq;
    this.aA = new ceh(this);
    this.aB = new cei(this);
    this.aD = 100;
    this.an = new cep();
    this.aM = -1;
    this.aI = paramBoolean;
  }
  
  private final void G()
  {
    if (this.aG.isEmpty())
    {
      int i;
      if ((!this.ao.c) || (this.aj) || (this.ak) || (this.al)) {
        i = 1;
      }
      while (i != 0)
      {
        hwq localhwq3 = this.aw;
        hwt localhwt3 = hwt.a;
        if (localhwt3 == null)
        {
          throw new NullPointerException();
          i = 0;
        }
        else
        {
          localhwq3.g = ((hwt)localhwt3);
          localhwq3.a();
        }
      }
    }
    for (;;)
    {
      this.at.a();
      return;
      hwq localhwq2 = this.aw;
      hwt localhwt2 = hwt.c;
      if (localhwt2 == null) {
        throw new NullPointerException();
      }
      localhwq2.g = ((hwt)localhwt2);
      localhwq2.a();
      continue;
      hwq localhwq1 = this.aw;
      hwt localhwt1 = hwt.b;
      if (localhwt1 == null) {
        throw new NullPointerException();
      }
      localhwq1.g = ((hwt)localhwt1);
      localhwq1.a();
    }
  }
  
  private final void H()
  {
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  private final void I()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("extra_promo_group_id", 4);
    localBundle.putInt("extra_promo_type", 104);
    int i = this.ad.c();
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.c = gxz.bJ;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
  }
  
  private final int a(int paramInt1, int paramInt2, hfa paramhfa)
  {
    for (int i = 1;; i++)
    {
      int j = a(i, paramhfa);
      if ((i == paramInt1) || (j <= paramInt2)) {
        return i;
      }
    }
  }
  
  private static int a(int paramInt, hfa paramhfa)
  {
    int i = (paramInt - 1) * paramhfa.d;
    return (paramhfa.b - i) / paramInt;
  }
  
  private final void a(int paramInt)
  {
    if (!i()) {
      return;
    }
    coo.a(null, g().getString(paramInt), false, false).a(this.x, "req_pending");
  }
  
  private final void a(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, int paramInt, boolean paramBoolean2)
  {
    int i = this.ad.c();
    if (this.aP.d(this.bn, i))
    {
      Bundle localBundle3 = c(paramString1, paramString2, paramBoolean1, paramString3, paramInt);
      this.aP.a(this, i, "first_add", localBundle3);
      return;
    }
    if ((jjf.c(paramString1) == null) && (paramString2 == null))
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
      str1 = brn.a(this.bn, this.an.e, paramBoolean1);
    }
    if ((this.aT) && (paramBoolean1) && (str1 != null))
    {
      String str2 = brn.a(this.bn, paramBoolean1);
      if (this.aP.e(this.bn, i))
      {
        Bundle localBundle1 = c(paramString1, paramString2, paramBoolean1, paramString3, paramInt);
        this.aP.a(this, i, "first_add_one_click", paramString2, str2, localBundle1);
        return;
      }
    }
    if (str1 == null)
    {
      b(paramString1, paramString2, paramString3, paramInt);
      return;
    }
    hgh localhgh = hvj.a(paramInt, 4);
    int j = 0;
    if (localhgh != null) {
      j = localhgh.R_();
    }
    int k = this.ad.c();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(str1);
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    bnp localbnp = new bnp(this.bn);
    localbnp.a = k;
    localbnp.b = paramString1;
    localbnp.c = paramString2;
    localbnp.d = j;
    localbnp.e = localArrayList;
    localbnp.f = null;
    localbnp.g = true;
    localbnp.h = false;
    localbnp.i = false;
    bno localbno = localbnp.a();
    localgzj.d.a(localbno, false);
    localgzj.b(localbno);
    new hvj(this.bn, (gxx)this.bo.a(gxx.class), paramString1, localArrayList, null, localhgh).a(k);
    this.aO.a(this.bn, i, paramString1, paramString3, 9, hvj.b(paramInt));
    this.aG.notifyDataSetChanged();
  }
  
  private static void a(ori paramori, nvt paramnvt)
  {
    if (paramnvt != null)
    {
      if (paramnvt.a != null) {
        paramori.c = paramnvt.a.a;
      }
      if (paramnvt.b == null) {
        break label41;
      }
      paramori.d = paramnvt.b.a;
    }
    label41:
    while (!paramnvt.c.booleanValue()) {
      return;
    }
    paramori.d = Integer.valueOf(Calendar.getInstance().get(1));
  }
  
  private static Object[] a(hqr paramhqr, int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3)
  {
    if (paramArrayOfObject == null)
    {
      paramArrayOfObject = new Object[4];
      if (paramInt1 == 2) {
        paramArrayOfObject[2] = Integer.valueOf(0);
      }
    }
    if (paramArrayOfObject[0] == null)
    {
      paramArrayOfObject[0] = Integer.valueOf(paramInt2);
      paramArrayOfObject[1] = Integer.valueOf(paramInt3);
      if (paramInt1 == 1)
      {
        paramhqr.a(paramArrayOfObject);
        paramArrayOfObject = null;
      }
      return paramArrayOfObject;
    }
    paramArrayOfObject[2] = Integer.valueOf(paramInt2);
    paramArrayOfObject[3] = Integer.valueOf(paramInt3);
    paramhqr.a(paramArrayOfObject);
    return null;
  }
  
  private final ArrayList<String> b(int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = this.an.c;
    int i = localArrayList2.size();
    for (int j = 0; j < i; j++)
    {
      hur localhur = (hur)localArrayList2.get(j);
      if (paramInt == localhur.a) {
        localArrayList1.add(localhur.b.a);
      }
    }
    return localArrayList1;
  }
  
  private final void b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.aM = paramInt;
    int i = this.ad.c();
    gxx localgxx = (gxx)mbb.a(this.bn, gxx.class);
    gxw localgxw = new gxw(this.bn, i);
    localgxw.e = gya.r;
    localgxx.a(localgxw);
    a(efj.a(this.bn, i, paramString1, paramString2, paramString3, null, null, true), 0);
  }
  
  private static Bundle c(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("person_id", paramString1);
    localBundle.putString("person_name", paramString2);
    localBundle.putBoolean("for_sharing", paramBoolean);
    localBundle.putString("suggestion_id", paramString3);
    localBundle.putInt("suggestion_type", paramInt);
    return localBundle;
  }
  
  public final void A()
  {
    int i = this.ad.c();
    Intent localIntent = new Intent(this.bn, PeopleListActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("people_view_type", 16);
    a(localIntent, 3);
    I();
  }
  
  public final void B()
  {
    int i = this.ad.c();
    a(efj.l(this.bn, i), 3);
    I();
  }
  
  public final void C()
  {
    int i = this.ad.c();
    Intent localIntent = new Intent(this.bn, PeopleListActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("people_view_type", 1);
    a(localIntent, 3);
    I();
  }
  
  public final void E()
  {
    int i = this.ad.c();
    Intent localIntent = new Intent(this.bn, PeopleListActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("people_view_type", 4);
    a(localIntent, 3);
    I();
  }
  
  public final void F()
  {
    this.aG.a(null);
    this.ah = false;
    this.ai = false;
    if (!this.al)
    {
      k().b(3, null, this.c);
      this.al = true;
    }
    if (!this.ak)
    {
      this.ak = true;
      k().b(2, null, this.a);
    }
    G();
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.ui, paramViewGroup, false);
    this.am = ((RecyclingViewGroup)localView.findViewById(aaw.hc));
    this.am.a(this.aG, 0, 0);
    RecyclingViewGroup localRecyclingViewGroup1 = this.am;
    cej localcej = new cej(this);
    localRecyclingViewGroup1.c.a = localcej;
    G();
    RecyclingViewGroup localRecyclingViewGroup2 = this.am;
    localRecyclingViewGroup2.b = new lxh(this.au);
    localRecyclingViewGroup2.b(0);
    this.aw.h = new cek(this);
    return localView;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      super.a(paramInt1, paramInt2, paramIntent);
      return;
      hgh localhgh = hvj.a(this.aM, 4);
      String str1 = paramIntent.getStringExtra("person_id");
      String str2 = paramIntent.getStringExtra("display_name");
      String str3 = paramIntent.getStringExtra("suggestion_id");
      ArrayList localArrayList1 = paramIntent.getExtras().getStringArrayList("original_circle_ids");
      ArrayList localArrayList2 = paramIntent.getExtras().getStringArrayList("selected_circle_ids");
      String str4 = brn.a(this.bn, this.an.e, true);
      int i1 = 0;
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
          i1 = 1;
        }
        if (!localArrayList2.contains(str6)) {
          localArrayList4.add(str6);
        }
      }
      int i2;
      label275:
      int i3;
      int i4;
      boolean bool1;
      if ((this.aT) && (i1 != 0) && (!localArrayList2.isEmpty()))
      {
        i2 = 1;
        i3 = 0;
        if (localhgh != null) {
          i3 = localhgh.R_();
        }
        i4 = this.ad.c();
        if ((localArrayList1 != null) && (!localArrayList1.isEmpty())) {
          break label573;
        }
        bool1 = true;
        label319:
        if ((localArrayList2 != null) && (!localArrayList2.isEmpty())) {
          break label579;
        }
      }
      label573:
      label579:
      for (boolean bool2 = true;; bool2 = false)
      {
        bnp localbnp = new bnp(this.bn);
        localbnp.a = i4;
        localbnp.b = str1;
        localbnp.c = str2;
        localbnp.d = i3;
        localbnp.e = localArrayList3;
        localbnp.f = localArrayList4;
        localbnp.g = bool1;
        localbnp.h = bool2;
        localbnp.i = false;
        if (i2 != 0)
        {
          String str5 = brn.a(this.bn, true);
          localbnp.k = this.bn.getString(aau.mj, new Object[] { str5 });
        }
        gzj localgzj = (gzj)this.bo.a(gzj.class);
        bno localbno = localbnp.a();
        localgzj.d.a(localbno, false);
        localgzj.b(localbno);
        if ((!localArrayList3.isEmpty()) && (localArrayList1.isEmpty())) {
          this.aO.a(this.bn, i4, str1, str3, 9, i3);
        }
        this.aL = new hvj(this.bn, (gxx)this.bo.a(gxx.class), str1, localArrayList3, localArrayList4, localhgh);
        break;
        i2 = 0;
        break label275;
        bool1 = false;
        break label319;
      }
      int i = paramIntent.getIntExtra("profile_edit_mode", -1);
      byte[] arrayOfByte = paramIntent.getByteArrayExtra("profile_edit_items_proto");
      label628:
      hur localhur;
      switch (i)
      {
      default: 
        localhur = null;
        label631:
        if (localhur != null) {
          switch (i)
          {
          }
        }
        break;
      }
      for (;;)
      {
        bvc.a(this.bn).a();
        cv localcv = k();
        if (!this.aj)
        {
          this.aj = true;
          localcv.b(1, null, this.b);
        }
        if (!this.al)
        {
          this.al = true;
          localcv.b(3, null, this.c);
        }
        if (!this.ak)
        {
          this.ak = true;
          localcv.b(2, null, this.a);
        }
        G();
        break;
        try
        {
          nwa localnwa2 = (nwa)qat.b(new nwa(), arrayOfByte, 0, arrayOfByte.length);
          localnwa1 = localnwa2;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            nvz[] arrayOfnvz;
            int m;
            int n;
            ori localori2;
            nwa localnwa1 = null;
            continue;
            Object localObject4 = localObject3;
            n++;
            Object localObject3 = localObject4;
          }
        }
        localObject3 = null;
        if (localnwa1 != null)
        {
          arrayOfnvz = localnwa1.b;
          localObject3 = null;
          if (arrayOfnvz != null)
          {
            m = localnwa1.b.length;
            n = 0;
            if (n < m)
            {
              localObject4 = localnwa1.b[n];
              if ((TextUtils.isEmpty(((nvz)localObject4).a)) || (this.aJ.contains(((nvz)localObject4).a))) {
                break label924;
              }
              if (localObject3 == null) {
                break label928;
              }
              localObject3 = null;
            }
          }
        }
        if (localObject3 == null) {
          break label628;
        }
        localori2 = new ori();
        localori2.a = localObject3.a;
        a(localori2, localObject3.c);
        localhur = new hur(3, localori2, null, false);
        break label631;
        try
        {
          label924:
          label928:
          nvy localnvy2 = (nvy)qat.b(new nvy(), arrayOfByte, 0, arrayOfByte.length);
          localnvy1 = localnvy2;
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            nvx[] arrayOfnvx;
            int j;
            int k;
            ori localori1;
            nvy localnvy1 = null;
            continue;
            Object localObject2 = localObject1;
            k++;
            Object localObject1 = localObject2;
          }
        }
        localObject1 = null;
        if (localnvy1 != null)
        {
          arrayOfnvx = localnvy1.b;
          localObject1 = null;
          if (arrayOfnvx != null)
          {
            j = localnvy1.b.length;
            k = 0;
            if (k < j)
            {
              localObject2 = localnvy1.b[k];
              if ((TextUtils.isEmpty(((nvx)localObject2).a)) || (this.aJ.contains(((nvx)localObject2).a))) {
                break label1107;
              }
              if (localObject1 == null) {
                break label1111;
              }
              localObject1 = null;
            }
          }
        }
        if (localObject1 == null) {
          break label628;
        }
        localori1 = new ori();
        localori1.a = localObject1.a;
        a(localori1, localObject1.c);
        localhur = new hur(3, localori1, null, false);
        break label631;
        label1107:
        label1111:
        a(localhur);
        continue;
        b(localhur);
      }
      if (paramInt2 == 1) {
        switch (paramInt1)
        {
        default: 
          break;
        case 3: 
          this.ah = false;
          if (!this.ak)
          {
            this.ak = true;
            k().b(2, null, this.a);
          }
          G();
          break;
        case 4: 
          this.ai = false;
          if (!this.al)
          {
            k().b(3, null, this.c);
            this.al = true;
          }
          G();
        }
      }
    }
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    if (ar == 0)
    {
      Resources localResources = g();
      ar = localResources.getDimensionPixelSize(efj.mD);
      d = localResources.getDimensionPixelSize(efj.mF);
      Z = localResources.getDimensionPixelSize(efj.kU);
      as = localResources.getDimensionPixelSize(efj.mE);
      aa = localResources.getDimensionPixelSize(efj.nL);
      ab = localResources.getDimensionPixelSize(efj.mB);
      ac = localResources.getDimensionPixelSize(efj.mA);
    }
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("find_tracker")) {
        this.aJ = paramBundle.getStringArrayList("find_tracker");
      }
      if (paramBundle.containsKey("unblock_request_id")) {
        this.aK = Integer.valueOf(paramBundle.getInt("unblock_request_id"));
      }
      this.aC = ((HashMap)paramBundle.getSerializable("people_loader_ids"));
      this.aD = paramBundle.getInt("people_loader_next_id");
      this.aL = hvj.a(this.bn, (gxx)this.bo.a(gxx.class), paramBundle);
      if ((cll.d.isEmpty()) && (paramBundle.containsKey("people_view_loader_dismissed_people"))) {
        cll.d = (HashSet)paramBundle.getSerializable("people_view_loader_dismissed_people");
      }
    }
    if (this.aI)
    {
      bvc.a(this.bn).a();
      cll.d.clear();
      this.aI = false;
    }
    this.aE = this.ad.f().c("is_plus_page");
    this.ap = this.ad.f().b("domain_name");
    this.aF = new hfa(this.bn, loh.c);
    this.aG = new ceq(this, this.bn);
    cv localcv = k();
    this.ao = new jly(this.bn, localcv, this.ad.c(), 16);
    jly localjly1 = this.ao;
    DataSetObserver localDataSetObserver = this.aB;
    localjly1.b.registerObserver(localDataSetObserver);
    jly localjly2 = this.ao;
    localjly2.a.a(localjly2.d, null, localjly2);
    brn.e(this.bn, this.ad.c());
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("add_email_dialog".equals(paramString))
    {
      str = paramBundle.getString("message");
      a(paramBundle.getString("person_id"), str, paramBundle.getBoolean("for_sharing"), paramBundle.getString("person_suggestion_id"), paramBundle.getInt("person_suggestion_type", -1));
    }
    while ((!"first_add".equals(paramString)) && (!"first_add_one_click".equals(paramString)))
    {
      String str;
      return;
    }
    a(paramBundle.getString("person_id"), paramBundle.getString("person_name"), paramBundle.getBoolean("for_sharing"), paramBundle.getString("suggestion_id"), paramBundle.getInt("suggestion_type", -1));
  }
  
  final void a(dmx paramdmx)
  {
    H();
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
  
  public final void a(gpr paramgpr)
  {
    paramgpr.d(aau.ms);
    paramgpr.b(aaw.J);
    paramgpr.b(aaw.aH);
  }
  
  public final void a(hur paramhur)
  {
    int i = this.ad.c();
    mbf localmbf = this.bn;
    String str = paramhur.b.a;
    Integer localInteger1 = paramhur.b.c;
    Integer localInteger2 = paramhur.b.d;
    Intent localIntent = new Intent(localmbf, PeopleListActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("people_view_type", 3);
    localIntent.putExtra("people_view_name", str);
    if (localInteger1 != null) {
      localIntent.putExtra("people_view_start_year", localInteger1);
    }
    if (localInteger2 != null) {
      localIntent.putExtra("people_view_end_year", localInteger2);
    }
    a(localIntent, 3);
    I();
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    int i = 1;
    if ("ModifyCircleMembershipsTask".equals(paramString)) {
      if (this.aL != null)
      {
        if (hae.a(paramhae)) {
          break label53;
        }
        int k = this.ad.c();
        this.aL.a(k);
        this.aL = null;
      }
    }
    label53:
    do
    {
      return;
      Toast.makeText(this.bn, paramhae.d, 0).show();
      break;
      if (paramString.equals("AddCircleTask"))
      {
        if (jid.a()) {
          jid.a("HostedPeopleFragment", "AddCircleTask completed.");
        }
        if (paramhae.b != 200) {}
        while (i != 0)
        {
          if (jid.a()) {
            jid.a("HostedPeopleFragment", "Add circle failed.");
          }
          H();
          Toast.makeText(this.bn, aau.uV, 0).show();
          return;
          i = 0;
        }
        if (jid.a()) {
          jid.a("HostedPeopleFragment", "Starting loadCirclesTask.");
        }
        bnl localbnl = new bnl(this.bn, "LoadCirclesTask", this.ad.c());
        this.av.b(localbnl);
        return;
      }
    } while (!paramString.equals("LoadCirclesTask"));
    if (jid.a()) {
      jid.a("HostedPeopleFragment", "LoadCirclesTask completed.");
    }
    if (jid.a()) {
      jid.a("HostedPeopleFragment", "Add circle succeeded.");
    }
    H();
    int j = aau.uR;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = this.aH;
    String str = g().getString(j, arrayOfObject);
    Toast.makeText(this.bn, str, 0).show();
  }
  
  public final void a(String paramString1, String paramString2)
  {
    int i = this.ad.c();
    a(efj.a(this.bn, i, paramString1, paramString2));
  }
  
  public final void a(String paramString1, String paramString2, int paramInt, hvo paramhvo)
  {
    int i = this.ad.c();
    int j;
    Intent localIntent1;
    switch (paramInt)
    {
    default: 
      j = 0;
      if ((j != 0) && (this.aR.a()))
      {
        kpm localkpm = new kpm(this.bn);
        localkpm.a = paramString1;
        localkpm.c = Integer.valueOf(f().getResources().getColor(efj.jh));
        localkpm.d = paramhvo.a;
        localkpm.e = paramhvo.b;
        localkpm.b = true;
        localIntent1 = localkpm.a();
      }
      break;
    }
    for (int k = 1;; k = 0)
    {
      if (localIntent1 == null) {}
      for (Intent localIntent2 = this.aS.a(this.bn).a(paramString1).a();; localIntent2 = localIntent1)
      {
        if ((Build.VERSION.SDK_INT < 16) || (k != 0)) {
          a(localIntent2, 0);
        }
        for (;;)
        {
          this.aO.b(this.bn, i, paramString1, paramString2, 9, hvj.b(paramInt));
          return;
          j = 1;
          break;
          Bundle localBundle = ((gvj)this.bo.a(gvj.class)).a();
          f().startActivityForResult(localIntent2, 0, localBundle);
        }
      }
      localIntent1 = null;
    }
  }
  
  public final void a(String paramString1, String paramString2, int paramInt, Object paramObject)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(paramInt);
    hur localhur;
    int i;
    switch (paramInt)
    {
    case 6: 
    case 7: 
    default: 
      localhur = null;
      i = -2147483648;
    }
    for (;;)
    {
      String str1 = localStringBuilder.toString();
      if (this.aC == null) {
        this.aC = new HashMap();
      }
      String str2 = jjf.c(paramString1);
      cll.d.add(str2);
      cv localcv = k();
      if ((!this.aC.containsKey(str1)) && (paramInt != 7))
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("list_type", i);
        if ((localhur != null) && (localhur.b != null))
        {
          localBundle.putString("name", localhur.b.a);
          if (localhur.b.c != null) {
            localBundle.putInt("start_year", localhur.b.c.intValue());
          }
          if (localhur.b.d != null) {
            localBundle.putInt("end_year", localhur.b.d.intValue());
          }
        }
        int j = this.aD;
        this.aD = (j + 1);
        this.aC.put(str1, Integer.valueOf(j));
        localcv.a(j, localBundle, new cet(this));
      }
      this.aQ.a(this.ad.c(), paramString1);
      this.aG.b();
      this.aO.a(paramString1, paramString2, hvj.b(paramInt));
      return;
      i = 7;
      localhur = null;
      continue;
      i = 0;
      localhur = null;
      continue;
      i = 1;
      localhur = null;
      continue;
      localhur = (hur)paramObject;
      i = 3;
      localStringBuilder.append(localhur.b.a);
      localStringBuilder.append(localhur.b.c);
      localStringBuilder.append(localhur.b.d);
      continue;
      localhur = (hur)paramObject;
      i = 2;
      localStringBuilder.append(localhur.b.a);
      localStringBuilder.append(localhur.b.c);
      localStringBuilder.append(localhur.b.d);
      continue;
      i = 4;
      localhur = null;
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if (!i()) {
      return;
    }
    b(paramString1, paramString2, paramString3, paramInt);
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 1;
    if (TextUtils.isEmpty(paramString2)) {
      return;
    }
    String str1 = paramString2.trim();
    if (this.an.e != null)
    {
      if (this.an.e.moveToFirst())
      {
        String str2 = this.an.e.getString(0);
        if ((!str1.equalsIgnoreCase(this.an.e.getString(i))) || (TextUtils.equals(paramString1, str2))) {}
      }
      int n;
      for (int m = i;; n = 0)
      {
        if (m == 0) {
          break label133;
        }
        Toast.makeText(this.bn, aau.uP, 0).show();
        return;
        if (this.an.e.moveToNext()) {
          break;
        }
      }
    }
    label133:
    this.aH = str1;
    a(aau.lt);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.bF;
    localgxx.a(localgxw);
    int k = this.ad.c();
    if (!paramBoolean) {}
    for (;;)
    {
      if (jid.a()) {
        jid.a("HostedPeopleFragment", "Starting addCircleTask.");
      }
      jjt localjjt = new jjt(this.bn, k, str1, null, i);
      this.av.b(localjjt);
      return;
      int j = 0;
    }
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if ((this.aT) || (!paramBoolean)) {}
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
  
  public final void a(tp paramtp)
  {
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = this.ad.c();
    int j = paramMenuItem.getItemId();
    if (j == aaw.J)
    {
      a(efj.e(this.bn, i, null));
      return true;
    }
    if (j == aaw.aH)
    {
      mbf localmbf = this.bn;
      int k = aau.jl;
      Intent localIntent = efj.a(localmbf, i, "15", g().getString(k));
      gxx localgxx = (gxx)mbb.a(this.bn, gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.e = gya.s;
      localgxx.a(localgxw);
      a(localIntent);
      return true;
    }
    return false;
  }
  
  public final void ab_()
  {
    jly localjly = this.ao;
    localjly.a.b(localjly.d, null, localjly);
  }
  
  public final void ae_()
  {
    k().b(1, null, this.b);
    k().b(2, null, this.a);
    k().b(3, null, this.c);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(hur paramhur)
  {
    int i = this.ad.c();
    mbf localmbf = this.bn;
    String str = paramhur.b.a;
    Integer localInteger1 = paramhur.b.c;
    Integer localInteger2 = paramhur.b.d;
    Intent localIntent = new Intent(localmbf, PeopleListActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("people_view_type", 2);
    localIntent.putExtra("people_view_name", str);
    if (localInteger1 != null) {
      localIntent.putExtra("people_view_start_year", localInteger1);
    }
    if (localInteger2 != null) {
      localIntent.putExtra("people_view_end_year", localInteger2);
    }
    a(localIntent, 3);
    I();
  }
  
  public final void b(tp paramtp) {}
  
  public final boolean b(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if (!this.aT) {
      return false;
    }
    a(paramString1, paramString2, paramBoolean, paramString3, paramInt, false);
    return true;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.ad = ((git)this.bo.a(git.class));
    lvj locallvj = (lvj)this.bo.b(lvj.class);
    if (locallvj != null)
    {
      lvi locallvi = this.au;
      lvh locallvh = locallvj.b;
      locallvi.a.add(locallvh);
    }
    this.av = ((gzj)this.bo.a(gzj.class));
    this.aN = ((hgg)this.bo.a(hgg.class));
    this.aO = ((hum)this.bo.a(hum.class));
    this.aQ = ((hul)this.bo.a(hul.class));
    this.aT = this.aQ.a(this.ad.c());
    this.aP = ((jia)this.bo.a(jia.class));
    this.aR = ((kpn)this.bo.a(kpn.class));
    this.aS = ((jfa)this.bo.a(jfa.class));
    ill localill = new ill(this.bn, this.ad.c());
    localill.a.add(ine.class);
    this.aq = localill;
    this.bo.a(dhf.class, this);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.aK != null) {
      paramBundle.putInt("unblock_request_id", this.aK.intValue());
    }
    if (this.aJ != null) {
      paramBundle.putStringArrayList("find_tracker", this.aJ);
    }
    if (this.aC != null) {
      paramBundle.putSerializable("people_loader_ids", this.aC);
    }
    paramBundle.putInt("people_loader_next_id", this.aD);
    if (this.aL != null) {
      this.aL.a(paramBundle);
    }
    if (!cll.d.isEmpty()) {
      paramBundle.putSerializable("people_view_loader_dismissed_people", cll.d);
    }
  }
  
  public final void k(String paramString)
  {
    this.aK = EsService.b(this.bn, this.ad.c(), paramString, null, false);
    gxx localgxx = (gxx)this.bo.a(gxx.class);
    gxw localgxw = new gxw(this.bn);
    localgxw.c = gxz.bE;
    localgxx.a(localgxw);
    a(aau.vb);
  }
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.aA);
    this.aN.a(true);
    if (this.aK != null)
    {
      int i = this.aK.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.aK.intValue());
        this.aK.intValue();
        a(localdmx);
        this.aK = null;
      }
    }
    cv localcv = k();
    if (!this.aj)
    {
      localcv.b(1, null, this.b);
      this.aj = true;
    }
    G();
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.aA;
    EsService.d.remove(localdme);
    this.aN.a(false);
    this.aO.a(this.bn, this.ad.c(), 9);
  }
  
  public final gya r_()
  {
    return gya.q;
  }
  
  final void w()
  {
    if ((this.ah) && (this.ag) && (this.ai)) {}
    for (int i = 1; i == 0; i = 0)
    {
      G();
      return;
    }
    int j = a(2, ar, this.aF);
    Object localObject1 = null;
    hqr localhqr1 = new hqr(ax);
    Object localObject2;
    if ((this.an.c == null) || (this.an.c.isEmpty()))
    {
      localObject2 = a(localhqr1, j, null, 15, -1);
      if (localObject2 != null)
      {
        localhqr1.a((Object[])localObject2);
        localObject2 = null;
      }
    }
    label782:
    label786:
    for (;;)
    {
      this.an.a = localhqr1;
      int k = a(3, as, this.aF);
      this.an.f = a(k, this.aF);
      hqr localhqr2 = new hqr(ay);
      label184:
      Integer localInteger;
      label238:
      Object localObject3;
      if ((this.af != null) && (this.af.moveToFirst()))
      {
        localInteger = Integer.valueOf(this.af.getPosition());
        if (localObject2 == null) {
          localObject2 = new Object[3];
        }
        if (localObject2[0] == null)
        {
          localObject2[0] = localInteger;
          if (k == 1)
          {
            localhqr2.a((Object[])localObject2);
            localObject2 = null;
          }
          if (this.af.moveToNext()) {
            break label730;
          }
        }
      }
      else
      {
        localObject3 = localObject2;
        if (localObject3 == null) {
          break label739;
        }
        int m = 1;
        while (m < k)
        {
          if (localObject3[m] == null) {
            localObject3[m] = Integer.valueOf(-1);
          }
          m++;
          continue;
          ArrayList localArrayList = this.an.c;
          int n = 0;
          int i1 = 0;
          int i2 = localArrayList.size();
          int i3 = 0;
          if (i3 < i2)
          {
            hur localhur = (hur)localArrayList.get(i3);
            if ((localhur.c != null) && (!localhur.c.isEmpty())) {}
            int i4;
            int i5;
            Object localObject4;
            switch (localhur.a)
            {
            case 5: 
            case 6: 
            default: 
              i4 = i1;
              i5 = n;
              localObject4 = localObject1;
            }
            for (;;)
            {
              i3++;
              localObject1 = localObject4;
              n = i5;
              i1 = i4;
              break;
              Object[] arrayOfObject5 = a(localhqr1, j, (Object[])localObject1, 8, 0);
              int i12 = i1;
              i5 = n;
              localObject4 = arrayOfObject5;
              i4 = i12;
              continue;
              Object[] arrayOfObject4 = a(localhqr1, j, (Object[])localObject1, 1, 0);
              int i11 = i1;
              i5 = n;
              localObject4 = arrayOfObject4;
              i4 = i11;
              continue;
              Object[] arrayOfObject3 = a(localhqr1, j, (Object[])localObject1, 2, 0);
              int i10 = i1;
              i5 = n;
              localObject4 = arrayOfObject3;
              i4 = i10;
              continue;
              int i8 = n + 1;
              localObject4 = a(localhqr1, j, (Object[])localObject1, 4, n);
              int i9 = i1;
              i5 = i8;
              i4 = i9;
              continue;
              i4 = i1 + 1;
              Object[] arrayOfObject2 = a(localhqr1, j, (Object[])localObject1, 3, i1);
              int i7 = n;
              localObject4 = arrayOfObject2;
              i5 = i7;
              continue;
              Object[] arrayOfObject1 = a(localhqr1, j, (Object[])localObject1, 5, 0);
              int i6 = i1;
              i5 = n;
              localObject4 = arrayOfObject1;
              i4 = i6;
            }
          }
          if (this.an.d != null) {
            localObject1 = a(localhqr1, j, (Object[])localObject1, 7, 0);
          }
          if (this.aE) {
            break label782;
          }
        }
      }
      for (localObject2 = a(localhqr1, j, (Object[])localObject1, 6, 0);; localObject2 = localObject1)
      {
        if (localObject2 == null) {
          break label786;
        }
        localhqr1.a((Object[])localObject2);
        localObject2 = null;
        break;
        if (localObject2[1] == null)
        {
          localObject2[1] = localInteger;
          if (k != 2) {
            break label238;
          }
          localhqr2.a((Object[])localObject2);
          localObject2 = null;
          break label238;
        }
        localObject2[2] = localInteger;
        localhqr2.a((Object[])localObject2);
        localObject2 = null;
        break label238;
        label730:
        break label184;
        localhqr2.a(localObject3);
        label739:
        this.an.b = localhqr2;
        this.an.e = this.af;
        this.aG.a(this.an);
        this.aG.notifyDataSetChanged();
        G();
        return;
      }
    }
  }
  
  public final void x()
  {
    this.aJ = b(2);
    int i = this.ad.c();
    Intent localIntent = efj.a(this.bn, i, 3, null, null);
    int j = aau.hG;
    localIntent.putExtra("help_title", g().getString(j));
    int k = aau.hF;
    localIntent.putExtra("help_desc", g().getString(k));
    localIntent.putExtra("profile_edit_return_json", true);
    a(localIntent, 1);
  }
  
  public final void y()
  {
    this.aJ = b(3);
    int i = this.ad.c();
    Intent localIntent = efj.a(this.bn, i, 4, null, null);
    int j = aau.hJ;
    localIntent.putExtra("help_title", g().getString(j));
    int k = aau.hI;
    localIntent.putExtra("help_desc", g().getString(k));
    localIntent.putExtra("profile_edit_return_json", true);
    a(localIntent, 2);
  }
  
  public final void z()
  {
    int i = this.ad.c();
    Intent localIntent = new Intent(this.bn, PeopleListActivity.class);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("people_view_type", 5);
    a(localIntent, 4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ceg
 * JD-Core Version:    0.7.0.1
 */