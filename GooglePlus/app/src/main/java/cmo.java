import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.acl.TextOnlyAudienceView;
import com.google.android.libraries.social.ui.views.imagetextbutton.ImageTextButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class cmo
  extends mca
  implements View.OnClickListener, cpk, cw<Cursor>, luu
{
  public static Drawable Z;
  public static int aa;
  public static int ab;
  public static int b;
  public static float c;
  public static int d;
  private HashSet<String> a = new HashSet();
  private byte[] aA;
  private boolean aB;
  private String aC;
  private String aD;
  private View aE;
  public HashSet<View> ac = new HashSet();
  public boolean ad;
  public boolean ae;
  public nxk af;
  public omn ag;
  public gnb ah;
  public byte[] ai;
  public byte[] aj;
  public boolean ak;
  public String al;
  public String am;
  public boolean an;
  public int ao;
  public int ap;
  public View aq;
  public ScrollView ar;
  LinearLayout as;
  public TextOnlyAudienceView at;
  public ImageTextButton au;
  public Integer av;
  public git aw;
  private HashSet<View> ax = new HashSet();
  private gnb ay;
  private dme az = B();
  
  private void J()
  {
    gnb localgnb = gnb.a(this.at.c);
    if (localgnb.c()) {
      localgnb = null;
    }
    int i = this.aw.c();
    bp localbp = f();
    int j = aau.qq;
    Intent localIntent = efj.a(localbp, i, g().getString(j), localgnb, 5, false, true, true, true);
    efj.k(this.N);
    a(localIntent, 1);
  }
  
  private void K()
  {
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  private String a(int paramInt, String paramString)
  {
    if ((this.af == null) && (this.aA != null)) {}
    try
    {
      nxk localnxk = new nxk();
      byte[] arrayOfByte = this.aA;
      this.af = ((nxk)qat.b(localnxk, arrayOfByte, 0, arrayOfByte.length));
      label47:
      if ((this.af != null) && (this.af.a != null))
      {
        int i = this.af.a.length;
        int j = 0;
        if (j < i)
        {
          omm localomm = this.af.a[j];
          if (localomm.a != null) {
            switch (paramInt)
            {
            }
          }
          do
          {
            do
            {
              do
              {
                j++;
                break;
              } while (!TextUtils.equals(localomm.a.b, paramString));
              return localomm.b;
            } while ((localomm.a.a == null) || (!TextUtils.equals(localomm.a.a.c, paramString)));
            return localomm.b;
          } while (localomm.a.c != 2);
          return localomm.b;
        }
      }
      return null;
    }
    catch (Exception localException)
    {
      break label47;
    }
  }
  
  private final void a(gnb paramgnb)
  {
    Arrays.sort(paramgnb.b);
    Arrays.sort(paramgnb.c);
    TextOnlyAudienceView localTextOnlyAudienceView = this.at;
    localTextOnlyAudienceView.g = true;
    ArrayList localArrayList = new ArrayList(localTextOnlyAudienceView.c);
    gnb localgnb1 = gnb.a(localTextOnlyAudienceView.c);
    jgs[] arrayOfjgs1 = localgnb1.c;
    jjd[] arrayOfjjd1 = localgnb1.b;
    lhp[] arrayOflhp1 = localgnb1.d;
    hps[] arrayOfhps1 = localgnb1.e;
    localTextOnlyAudienceView.c.clear();
    if (paramgnb != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        gnb localgnb3 = (gnb)localArrayList.get(j);
        if (paramgnb.b(localgnb3)) {
          localTextOnlyAudienceView.c.add(localgnb3);
        }
      }
      jgs[] arrayOfjgs2 = paramgnb.c;
      int k = arrayOfjgs2.length;
      int m = 0;
      if (m < k)
      {
        jgs localjgs = arrayOfjgs2[m];
        gnb localgnb2;
        if (!localjgs.a(arrayOfjgs1))
        {
          localgnb2 = new gnb(localjgs);
          if (localjgs.c != 9) {
            break label211;
          }
          localTextOnlyAudienceView.c.add(0, localgnb2);
        }
        for (;;)
        {
          m++;
          break;
          label211:
          localTextOnlyAudienceView.c.add(localgnb2);
        }
      }
      for (jjd localjjd : paramgnb.b) {
        if (!localjjd.a(arrayOfjjd1)) {
          localTextOnlyAudienceView.c.add(new gnb(localjjd));
        }
      }
      for (lhp locallhp : paramgnb.d) {
        if (!locallhp.a(arrayOflhp1)) {
          localTextOnlyAudienceView.c.add(new gnb(locallhp));
        }
      }
      for (hps localhps : paramgnb.e) {
        if (!localhps.a(arrayOfhps1)) {
          localTextOnlyAudienceView.c.add(new gnb(localhps));
        }
      }
    }
    localTextOnlyAudienceView.b();
    if (this.ah.equals(paramgnb))
    {
      a(this.at);
      return;
    }
    b(this.at);
  }
  
  private boolean a(dmx paramdmx)
  {
    int m;
    boolean bool;
    if (paramdmx != null)
    {
      if (paramdmx.c == 200) {
        break label100;
      }
      m = 1;
      if (m == 0)
      {
        Exception localException = paramdmx.d;
        bool = false;
        if (localException == null) {
          break label97;
        }
      }
    }
    String str1;
    if ((paramdmx != null) && (paramdmx.d != null))
    {
      String str2 = paramdmx.d.getMessage();
      if (str2 != null)
      {
        int k = aau.qD;
        Object[] arrayOfObject = { str2 };
        str1 = g().getString(k, arrayOfObject);
      }
    }
    for (;;)
    {
      a(str1);
      bool = true;
      label97:
      return bool;
      label100:
      m = 0;
      break;
      int j = aau.uV;
      str1 = g().getString(j);
      continue;
      int i = aau.uV;
      str1 = g().getString(i);
    }
  }
  
  protected void A()
  {
    G();
  }
  
  protected dme B()
  {
    return new cmp(this);
  }
  
  protected void C() {}
  
  protected byte[] D()
  {
    return null;
  }
  
  protected final nwm E()
  {
    gnb localgnb = gnb.a(this.at.c);
    nwm localnwm = new nwm();
    int i = localgnb.c.length;
    int j = localgnb.b.length;
    if ((i == 1) && (j == 0))
    {
      int n = localgnb.c[0].c;
      if (n != 1)
      {
        if (n == 9) {
          localnwm.b = 1;
        }
        for (;;)
        {
          return localnwm;
          if (n == 8) {
            localnwm.b = 2;
          } else if (n == 7) {
            localnwm.b = 3;
          } else if (n == 5) {
            localnwm.b = 4;
          } else if (n == 101) {
            localnwm.b = 6;
          }
        }
      }
    }
    localnwm.b = 5;
    localnwm.a = new omk();
    localnwm.a.b = this.ag;
    ArrayList localArrayList = new ArrayList();
    int k = 0;
    int m = 0;
    if (k < i)
    {
      jgs localjgs = localgnb.c[k];
      omn localomn2 = new omn();
      switch (localjgs.c)
      {
      }
      for (;;)
      {
        localArrayList.add(localomn2);
        k++;
        break;
        localomn2.c = 1;
        continue;
        localomn2.c = 2;
        continue;
        localomn2.c = 4;
        continue;
        localomn2.c = 3;
        continue;
        localomn2.b = efj.s(localjgs.a);
      }
    }
    while (m < j)
    {
      String str = localgnb.b[m].a;
      if (!TextUtils.isEmpty(str))
      {
        omn localomn1 = new omn();
        localomn1.a = new orm();
        localomn1.a.c = str;
        localArrayList.add(localomn1);
      }
      m++;
    }
    localnwm.a.a = ((omn[])localArrayList.toArray(new omn[localArrayList.size()]));
    return localnwm;
  }
  
  protected Intent F()
  {
    Bundle localBundle = this.m;
    Intent localIntent1;
    if (localBundle.getBoolean("profile_edit_return_json"))
    {
      localIntent1 = new Intent();
      localIntent1.putExtra("profile_edit_items_proto", v());
    }
    boolean bool;
    do
    {
      return localIntent1;
      bool = localBundle.containsKey("profile_data_id");
      localIntent1 = null;
    } while (!bool);
    Intent localIntent2 = new Intent();
    localIntent2.putExtra("profile_data_id", localBundle.getInt("profile_data_id", 0));
    return localIntent2;
  }
  
  protected final void G()
  {
    if (this.aE != null) {
      this.aE.requestFocus();
    }
    efj.k(this.N);
  }
  
  public final void H()
  {
    if (this.au.isEnabled())
    {
      efj.k(this.aE);
      int i = aau.cf;
      String str1 = g().getString(i);
      int j = aau.qu;
      String str2 = g().getString(j);
      int k = aau.vS;
      String str3 = g().getString(k);
      int m = aau.ly;
      lut locallut = lut.a(str1, str2, str3, g().getString(m), 0, 0);
      locallut.n = this;
      locallut.p = 0;
      locallut.a(this.x, "quit");
      return;
    }
    d(0);
  }
  
  public final void I()
  {
    J();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.wm, null);
    this.aE = localView.findViewById(aaw.dC);
    this.aq = new View(f());
    ((ImageTextButton)localView.findViewById(aaw.aT)).setOnClickListener(this);
    this.au = ((ImageTextButton)localView.findViewById(aaw.jk));
    this.au.setOnClickListener(this);
    this.ar = ((ScrollView)localView.findViewById(aaw.jm));
    this.as = ((LinearLayout)localView.findViewById(aaw.bT));
    if (Build.VERSION.SDK_INT >= 11) {
      this.as.getLayoutTransition().addTransitionListener(new cmq(this));
    }
    int k;
    if (!this.ad)
    {
      this.at = ((TextOnlyAudienceView)localView.findViewById(aaw.af));
      this.at.e = this.aw.c();
      this.at.setOnClickListener(this);
      TextOnlyAudienceView localTextOnlyAudienceView1 = this.at;
      int i = aau.jn;
      ((TextView)localTextOnlyAudienceView1.b.findViewById(16908308)).setText(i);
      TextOnlyAudienceView localTextOnlyAudienceView2 = this.at;
      int j = gny.a;
      switch (gnx.a[(j - 1)])
      {
      default: 
        k = efj.Dt;
        if (localTextOnlyAudienceView2.a != null) {
          localTextOnlyAudienceView2.a.setImageResource(k);
        }
        this.at.setEnabled(this.aB);
        this.at.i.setVisibility(8);
      }
    }
    for (;;)
    {
      if (paramBundle == null) {
        this.aE.requestFocus();
      }
      if (this.ak)
      {
        y();
        z();
      }
      if (this.aC != null)
      {
        ((TextView)localView.findViewById(aaw.ee)).setText(this.aC);
        ((TextView)localView.findViewById(aaw.ed)).setText(this.aD);
        localView.findViewById(aaw.ec).setVisibility(0);
      }
      e(localView);
      return localView;
      k = efj.Dv;
      break;
      k = efj.Dx;
      break;
      k = efj.Dy;
      break;
      ((ViewGroup)localView.findViewById(aaw.ag)).setVisibility(8);
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    int i = this.aw.c();
    return new jma(this.bn, i, 0);
  }
  
  protected final gnb a(nwm paramnwm)
  {
    label227:
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    for (;;)
    {
      if (paramnwm == null)
      {
        jgs localjgs;
        if (this.an)
        {
          int i8 = aau.bu;
          localjgs = new jgs("0", 9, g().getString(i8), 0);
        }
        for (;;)
        {
          return new gnb(localjgs);
          if (this.al != null)
          {
            localjgs = new jgs("v.domain", 8, this.al, 0);
          }
          else
          {
            int i7 = aau.bz;
            localjgs = new jgs("1c", 5, g().getString(i7), 0);
          }
        }
      }
      if ((paramnwm.a != null) && (paramnwm.a.a != null) && (paramnwm.a.a.length != 0))
      {
        ArrayList localArrayList3 = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        if (i5 < paramnwm.a.a.length)
        {
          String str3 = paramnwm.a.a[i5].b;
          if (str3 != null)
          {
            String str4 = efj.s(str3);
            if (!this.a.contains(str4)) {
              break label227;
            }
            localArrayList3.add(paramnwm.a.a[i5]);
          }
          for (;;)
          {
            i5++;
            break;
            i6 = 1;
          }
        }
        if (i6 != 0) {
          paramnwm.a.a = ((omn[])localArrayList3.toArray(new omn[localArrayList3.size()]));
        }
      }
      if ((paramnwm.a == null) || (paramnwm.a.a == null) || (paramnwm.a.a.length == 0))
      {
        int i = paramnwm.b;
        if (i == 1)
        {
          int n = aau.bu;
          return new gnb(new jgs("0", 9, g().getString(n), 0));
        }
        if (i == 2) {
          return new gnb(new jgs(this.am, 8, this.al, 0));
        }
        if (i == 3)
        {
          int m = aau.br;
          return new gnb(new jgs("1f", 7, g().getString(m), 0));
        }
        if (i == 4)
        {
          int k = aau.bz;
          return new gnb(new jgs("1c", 5, g().getString(k), 0));
        }
        if ((i == 6) || (i == 5))
        {
          int j = aau.bs;
          return new gnb(new jgs("v.private", 101, g().getString(j), 0));
        }
        paramnwm = null;
      }
      else
      {
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        omn[] arrayOfomn = paramnwm.a.a;
        int i1 = 0;
        if (i1 < arrayOfomn.length)
        {
          omn localomn = arrayOfomn[i1];
          if (localomn.c != -2147483648) {
            if (localomn.c == 1)
            {
              int i4 = aau.bu;
              localArrayList2.add(new jgs("0", 9, g().getString(i4), 0));
            }
          }
          for (;;)
          {
            i1++;
            break;
            if (localomn.c == 2)
            {
              localArrayList2.add(new jgs(this.am, 8, this.al, 0));
            }
            else if (localomn.c == 4)
            {
              int i3 = aau.br;
              localArrayList2.add(new jgs("1f", 7, g().getString(i3), 0));
            }
            else if (localomn.c == 3)
            {
              int i2 = aau.bz;
              localArrayList2.add(new jgs("1c", 5, g().getString(i2), 0));
              continue;
              if (localomn.b != null)
              {
                String str2 = a(1, localomn.b);
                localArrayList2.add(new jgs(efj.q(localomn.b), 1, str2, 1));
              }
              else if ((localomn.a != null) && (localomn.a.c != null))
              {
                String str1 = a(2, localomn.a.c);
                localArrayList1.add(new jjd(localomn.a.c, str1, null));
              }
            }
          }
        }
        if ((!localArrayList1.isEmpty()) || (!localArrayList2.isEmpty())) {
          break;
        }
        paramnwm = null;
      }
    }
    return new gnb(localArrayList1, localArrayList2);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {}
    do
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      }
    } while (paramIntent == null);
    gnb localgnb = (gnb)paramIntent.getParcelableExtra("extra_acl");
    if (this.aB)
    {
      a(localgnb);
      return;
    }
    this.ay = localgnb;
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  protected final void a(int paramInt, dmx paramdmx)
  {
    if ((this.av == null) || (this.av.intValue() != paramInt)) {}
    boolean bool;
    do
    {
      return;
      K();
      bool = a(paramdmx);
      this.av = null;
    } while (bool);
    C();
    d(-1);
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (b == 0)
    {
      Resources localResources = paramActivity.getResources();
      b = localResources.getDimensionPixelSize(efj.nq);
      c = localResources.getDimension(efj.nL);
      d = localResources.getColor(17170443);
      Z = localResources.getDrawable(efj.oE);
      aa = localResources.getDimensionPixelSize(efj.nj);
      ab = localResources.getColor(efj.ko);
    }
  }
  
  public void a(Cursor paramCursor) {}
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.aC = localBundle.getString("help_title");
    this.aD = localBundle.getString("help_desc");
    this.aA = localBundle.getByteArray("profile_edit_roster_proto");
    this.aB = false;
    if (h(paramBundle))
    {
      if (this.ai == null) {
        this.ai = this.aj;
      }
      w();
      x();
      this.ak = true;
      if (!this.ae) {
        k().a(0, null, this);
      }
      return;
    }
    this.ak = false;
    cmv localcmv = new cmv(this);
    k().a(1, null, localcmv);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("quit".equals(paramString)) {
      d(0);
    }
  }
  
  protected final void a(View paramView)
  {
    int i = 1;
    this.ax.remove(paramView);
    int j;
    int k;
    if ((this.ao == 0) && (this.as.getChildCount() - this.ap == 0))
    {
      j = i;
      if ((this.ax.size() != i) || (!this.ax.contains(this.at))) {
        break label103;
      }
      k = i;
      label64:
      if (this.ax.isEmpty()) {
        break label109;
      }
    }
    for (;;)
    {
      if ((i == 0) || ((k != 0) && (j != 0))) {
        this.au.setEnabled(false);
      }
      return;
      j = 0;
      break;
      label103:
      k = 0;
      break label64;
      label109:
      i = 0;
    }
  }
  
  protected void a(bru parambru) {}
  
  public final void a(fu<Cursor> paramfu) {}
  
  protected void a(String paramString)
  {
    efj.a(f(), paramString, 1).show();
  }
  
  public final void a(String paramString1, int paramInt, String paramString2)
  {
    if (paramInt > 0)
    {
      gnb localgnb1 = new gnb(new jgs(paramString1, paramInt, paramString2, 1));
      TextOnlyAudienceView localTextOnlyAudienceView = this.at;
      localTextOnlyAudienceView.g = true;
      ArrayList localArrayList = new ArrayList(localTextOnlyAudienceView.c);
      gnb localgnb2 = gnb.a(localTextOnlyAudienceView.c);
      jgs[] arrayOfjgs1 = localgnb2.c;
      jjd[] arrayOfjjd1 = localgnb2.b;
      lhp[] arrayOflhp1 = localgnb2.d;
      hps[] arrayOfhps1 = localgnb2.e;
      localTextOnlyAudienceView.c.clear();
      if (localgnb1 != null)
      {
        int i = localArrayList.size();
        for (int j = 0; j < i; j++)
        {
          gnb localgnb4 = (gnb)localArrayList.get(j);
          if (localgnb1.b(localgnb4)) {
            localTextOnlyAudienceView.c.add(localgnb4);
          }
        }
        jgs[] arrayOfjgs2 = localgnb1.c;
        int k = arrayOfjgs2.length;
        int m = 0;
        if (m < k)
        {
          jgs localjgs = arrayOfjgs2[m];
          gnb localgnb3;
          if (!localjgs.a(arrayOfjgs1))
          {
            localgnb3 = new gnb(localjgs);
            if (localjgs.c != 9) {
              break label234;
            }
            localTextOnlyAudienceView.c.add(0, localgnb3);
          }
          for (;;)
          {
            m++;
            break;
            label234:
            localTextOnlyAudienceView.c.add(localgnb3);
          }
        }
        for (jjd localjjd : localgnb1.b) {
          if (!localjjd.a(arrayOfjjd1)) {
            localTextOnlyAudienceView.c.add(new gnb(localjjd));
          }
        }
        for (lhp locallhp : localgnb1.d) {
          if (!locallhp.a(arrayOflhp1)) {
            localTextOnlyAudienceView.c.add(new gnb(locallhp));
          }
        }
        for (hps localhps : localgnb1.e) {
          if (!localhps.a(arrayOfhps1)) {
            localTextOnlyAudienceView.c.add(new gnb(localhps));
          }
        }
      }
      localTextOnlyAudienceView.b();
      if (this.ah.equals(localgnb1))
      {
        a(this.at);
        return;
      }
      b(this.at);
      return;
    }
    J();
  }
  
  protected final void a(nxl paramnxl)
  {
    mbf localmbf = this.bn;
    int i = this.aw.c();
    Intent localIntent = EsService.e.a(localmbf, EsService.class);
    localIntent.putExtra("op", 704);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("profile", qat.a(paramnxl));
    this.av = Integer.valueOf(EsService.a(localmbf, localIntent));
    c(aau.qE);
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void b(View paramView)
  {
    this.ax.add(paramView);
    int i;
    int j;
    if ((this.ao == 0) && (this.as.getChildCount() - this.ap == 0))
    {
      i = 1;
      if ((this.ax.size() != 1) || (paramView != this.at)) {
        break label70;
      }
      j = 1;
      label55:
      if ((j == 0) || (i == 0)) {
        break label76;
      }
    }
    label70:
    label76:
    int k;
    do
    {
      return;
      i = 0;
      break;
      j = 0;
      break label55;
      boolean bool = this.ac.isEmpty();
      k = 0;
      if (!bool) {
        k = 1;
      }
    } while (k != 0);
    this.au.setEnabled(true);
  }
  
  public final void b(String paramString1, int paramInt, String paramString2)
  {
    a(paramString1, paramInt, paramString2);
  }
  
  protected final void c(int paramInt)
  {
    coo.a(null, g().getString(paramInt), false, false).a(this.x, "req_pending");
  }
  
  protected void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aw = ((git)this.bo.a(git.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  protected void c(View paramView)
  {
    this.ac.remove(paramView);
    int i;
    int j;
    if ((this.ao == 0) && (this.as.getChildCount() - this.ap == 0))
    {
      i = 1;
      if ((this.ac.size() != 1) || (!this.ac.contains(this.at))) {
        break label127;
      }
      j = 1;
      label61:
      if (this.ac.isEmpty()) {
        break label133;
      }
    }
    label133:
    for (int k = 1;; k = 0)
    {
      if (k == 0)
      {
        boolean bool = this.ax.isEmpty();
        int m = 0;
        if (!bool) {
          m = 1;
        }
        if (m != 0) {}
      }
      else
      {
        if ((j == 0) || (i == 0)) {
          break label121;
        }
      }
      this.au.setEnabled(true);
      label121:
      return;
      i = 0;
      break;
      label127:
      j = 0;
      break label61;
    }
  }
  
  protected void d(int paramInt)
  {
    Intent localIntent = F();
    f().setResult(paramInt, localIntent);
    f().finish();
  }
  
  protected void d(View paramView)
  {
    int i = 1;
    this.ac.add(paramView);
    int j;
    if ((this.ao == 0) && (this.as.getChildCount() - this.ap == 0))
    {
      j = i;
      if ((this.ac.size() != i) || (paramView != this.at)) {
        break label71;
      }
    }
    for (;;)
    {
      if ((i == 0) || (j == 0)) {
        break label76;
      }
      return;
      j = 0;
      break;
      label71:
      i = 0;
    }
    label76:
    this.au.setEnabled(false);
  }
  
  public void e(Bundle paramBundle)
  {
    if (this.av != null) {
      paramBundle.putInt("profile_request_id", this.av.intValue());
    }
    if (!this.m.containsKey("profile_edit_items_proto")) {
      paramBundle.putByteArray("original_items_proto", D());
    }
    paramBundle.putByteArray("items_proto", v());
    super.e(paramBundle);
  }
  
  protected void e(View paramView)
  {
    if (!this.ak) {}
    for (int i = 1; i != 0; i = 0)
    {
      View localView = paramView.findViewById(16908292);
      localView.setVisibility(0);
      localView.findViewById(aaw.eA).setVisibility(8);
      localView.findViewById(aaw.ez).setVisibility(0);
      return;
    }
    this.ar.setVisibility(0);
    paramView.findViewById(16908292).setVisibility(8);
  }
  
  public boolean h(Bundle paramBundle)
  {
    this.aj = this.m.getByteArray("profile_edit_items_proto");
    if (paramBundle != null)
    {
      this.ai = paramBundle.getByteArray("items_proto");
      if (paramBundle.containsKey("profile_request_id")) {
        this.av = Integer.valueOf(paramBundle.getInt("profile_request_id"));
      }
      if (this.aj == null) {
        this.aj = paramBundle.getByteArray("original_items_proto");
      }
    }
    return this.aj != null;
  }
  
  public void m()
  {
    super.m();
    EsService.a(this.bn, this.az);
    if (this.av != null)
    {
      int i = this.av.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.av.intValue());
        this.av = null;
        K();
        if (!a(localdmx)) {
          d(-1);
        }
      }
    }
  }
  
  public final void n()
  {
    dme localdme = this.az;
    EsService.d.remove(localdme);
    super.n();
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aaw.aT) {
      H();
    }
    do
    {
      return;
      if (i == aaw.jk)
      {
        A();
        return;
      }
    } while (i != aaw.af);
    G();
    cph localcph = cph.a(aau.qt, this.al, this.am, this.an);
    localcph.n = this;
    localcph.p = 0;
    localcph.a(this.x, "simple_audience");
  }
  
  protected byte[] v()
  {
    return null;
  }
  
  protected void w() {}
  
  protected void x()
  {
    this.ao = 0;
  }
  
  protected void y() {}
  
  protected void z()
  {
    this.ax.clear();
    this.ac.clear();
    this.au.setEnabled(false);
    if (!this.ad) {
      this.at.f = new cmr(this);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmo
 * JD-Core Version:    0.7.0.1
 */