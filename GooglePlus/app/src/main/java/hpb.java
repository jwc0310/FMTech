import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.social.collexions.impl.share.OnItemSelectedSpinner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class hpb
  extends mca
  implements View.OnClickListener, AdapterView.OnItemSelectedListener, gpq, gxs, gzi, hhm, luu
{
  TextView Z;
  gnb a;
  private hpg aA;
  private int aB;
  private MenuItem aC;
  private final guf aD;
  private final gug aE;
  TextView aa;
  TextView ab;
  private git ac;
  private gzj ad;
  private hpo ae;
  private hhn af;
  private String ag;
  private ArrayList<hpd> ah;
  private Set<Integer> ai;
  private boolean aj;
  private Bundle ak;
  private int al;
  private boolean am;
  private boolean an;
  private int ao = -1;
  private hrs ap;
  private TextView aq;
  private Switch ar;
  private EditText as;
  private EditText at;
  private View au;
  private View av;
  private TextView aw;
  private final hwq ax = new hwq(this.bp);
  private final jmu ay = new jmu(this, this.bp);
  private hpf az;
  boolean b = false;
  OnItemSelectedSpinner c;
  TextView d;
  
  public hpb()
  {
    new gpk(this, this.bp, this);
    new gxj(this.bp, (byte)0);
    this.aD = new hpc(this);
    this.aE = new gug(this.bp, (byte)0).a(this.bo).a(efj.JZ, this.aD);
  }
  
  private final void A()
  {
    Toast.makeText(this.bn, this.bn.getString(ehr.cc), 1).show();
    f().finish();
  }
  
  private final void B()
  {
    int i = 1;
    String str1 = x();
    String str2 = y();
    int j;
    int k;
    String str3;
    if (this.ag != null)
    {
      j = i;
      if (j == 0) {
        break label93;
      }
      k = this.aB;
      str3 = this.ag;
      if (!this.ar.isChecked()) {
        break label88;
      }
    }
    label49:
    label88:
    label93:
    for (Object localObject = new hlt(k, str3, str1, str2, i);; localObject = new hky(this.aB, str1, str2, C(), this.ar.isChecked(), this.am, this.a))
    {
      this.ad.c((gzf)localObject);
      efj.k(this.as);
      return;
      j = 0;
      break;
      i = 2;
      break label49;
    }
  }
  
  private final int C()
  {
    if (this.ag != null) {}
    for (int i = 1; i != 0; i = 0) {
      return 3;
    }
    return ((hpd)this.ah.get(this.c.getSelectedItemPosition())).c;
  }
  
  public static hpb a(String paramString1, String paramString2, String paramString3, Bundle paramBundle, boolean paramBoolean, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("clx_id", paramString1);
    localBundle.putString("clx_name", paramString2);
    localBundle.putString("clx_tagline", paramString3);
    localBundle.putBundle("allowedCollexionVisibility", paramBundle);
    localBundle.putBoolean("clx_autofollow_state", paramBoolean);
    localBundle.putInt("clx_visibility_type", paramInt);
    hpb localhpb = new hpb();
    localhpb.f(localBundle);
    return localhpb;
  }
  
  private final void a(int paramInt)
  {
    if (paramInt != 0) {}
    for (int i = 0;; i++) {
      if (i < this.ah.size())
      {
        if (((hpd)this.ah.get(i)).c == paramInt)
        {
          this.ao = i;
          this.c.setSelection(i, true);
          this.c.a(null);
        }
      }
      else {
        return;
      }
    }
  }
  
  private final void z()
  {
    int i = 8;
    if (this.ag != null) {}
    for (int j = 1; j == 0; j = 0) {
      throw new IllegalStateException();
    }
    int n;
    int k;
    if (this.al != 3)
    {
      if (this.a == null) {
        break label180;
      }
      boolean bool = this.a.b();
      View localView = this.av;
      if (bool)
      {
        n = i;
        localView.setVisibility(n);
        if (bool) {
          break label170;
        }
        TextView localTextView2 = this.aw;
        if (this.aj) {
          i = 0;
        }
        localTextView2.setVisibility(i);
        gnb.a(this.a);
        this.ap.a(this.a.d());
        k = 0;
      }
    }
    for (;;)
    {
      if (k != 0)
      {
        this.aq.setVisibility(0);
        TextView localTextView1 = this.aq;
        int m = ehr.bt;
        localTextView1.setText(g().getString(m));
      }
      return;
      n = 0;
      break;
      label170:
      k = 1;
      continue;
      k = 1;
      continue;
      label180:
      k = 0;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    View localView1 = LayoutInflater.from(this.bn).inflate(aau.zy, paramViewGroup, false);
    this.as = ((EditText)localView1.findViewById(efj.JM));
    this.d = ((TextView)localView1.findViewById(efj.JO));
    this.aa = ((TextView)localView1.findViewById(efj.JN));
    this.at = ((EditText)localView1.findViewById(efj.JU));
    this.Z = ((TextView)localView1.findViewById(efj.JW));
    this.ab = ((TextView)localView1.findViewById(efj.JV));
    this.c = ((OnItemSelectedSpinner)localView1.findViewById(efj.JH));
    this.aq = ((TextView)localView1.findViewById(efj.JC));
    this.av = localView1.findViewById(efj.JD);
    View localView2 = localView1.findViewById(efj.JQ);
    this.aw = ((TextView)localView1.findViewById(efj.JE));
    TextView localTextView1 = this.aw;
    int i = ehr.bE;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = this.ac.f().b("domain_name");
    localTextView1.setText(g().getString(i, arrayOfObject1));
    this.ar = ((Switch)localView1.findViewById(efj.JJ));
    Bundle localBundle = this.m;
    this.ag = localBundle.getString("clx_id");
    this.al = localBundle.getInt("clx_visibility_type");
    Switch localSwitch;
    boolean bool;
    int k;
    label389:
    int m;
    label415:
    int i2;
    if (paramBundle != null)
    {
      this.as.setText(paramBundle.getCharSequence("clx_name"));
      this.at.setText(paramBundle.getCharSequence("clx_tagline"));
      this.ao = paramBundle.getInt("clx_acl");
      this.a = ((gnb)paramBundle.getParcelable("audience"));
      this.aj = paramBundle.getBoolean("is_domain_restricted");
      localSwitch = this.ar;
      bool = paramBundle.getBoolean("clx_autofollow_state");
      localSwitch.setChecked(bool);
      TextView localTextView2 = this.d;
      if (TextUtils.isEmpty(x())) {
        break label672;
      }
      k = 0;
      localTextView2.setVisibility(k);
      TextView localTextView3 = this.Z;
      if (TextUtils.isEmpty(y())) {
        break label679;
      }
      m = 0;
      localTextView3.setVisibility(m);
      TextView localTextView4 = this.aa;
      int n = ehr.bF;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(this.as.length());
      arrayOfObject2[1] = Integer.valueOf(50);
      localTextView4.setText(g().getString(n, arrayOfObject2));
      TextView localTextView5 = this.ab;
      int i1 = ehr.bF;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(this.at.length());
      arrayOfObject3[1] = Integer.valueOf(80);
      localTextView5.setText(g().getString(i1, arrayOfObject3));
      if (this.ag == null) {
        break label686;
      }
      i2 = 1;
      label544:
      if (i2 == 0) {
        break label883;
      }
      this.c.setVisibility(8);
      localView2.setVisibility(0);
      if (this.ag == null) {
        break label692;
      }
    }
    label666:
    label672:
    label679:
    label686:
    label692:
    for (int i13 = 1;; i13 = 0)
    {
      if (i13 != 0) {
        break label698;
      }
      throw new IllegalStateException();
      this.ao = -1;
      this.as.setText(localBundle.getString("clx_name"));
      this.at.setText(localBundle.getString("clx_tagline"));
      localSwitch = this.ar;
      if (this.ag != null) {}
      for (int j = 1;; j = 0)
      {
        if ((j != 0) && (!localBundle.getBoolean("clx_autofollow_state"))) {
          break label666;
        }
        bool = true;
        break;
      }
      bool = false;
      break;
      k = 8;
      break label389;
      m = 8;
      break label415;
      i2 = 0;
      break label544;
    }
    label698:
    if (this.al != 3) {
      this.ad.b(new hlc(this.aB, this.ag));
    }
    z();
    localView1.findViewById(efj.JK).setVisibility(0);
    hwq localhwq3 = this.ax;
    hwt localhwt3 = hwt.b;
    if (localhwt3 == null) {
      throw new NullPointerException();
    }
    localhwq3.g = ((hwt)localhwt3);
    localhwq3.a();
    this.as.setSelection(this.as.getText().length());
    bp localbp = f();
    int i3;
    label818:
    int i4;
    label828:
    View localView3;
    if (this.ag != null)
    {
      i3 = 1;
      if (i3 == 0) {
        break label1598;
      }
      i4 = ehr.bC;
      localbp.setTitle(i4);
      this.au = localView1.findViewById(efj.JI);
      localView3 = this.au;
      if (this.al != 3) {
        break label1606;
      }
    }
    label1598:
    label1606:
    for (int i5 = 8;; i5 = 0)
    {
      localView3.setVisibility(i5);
      this.au.setOnClickListener(this);
      return localView1;
      label883:
      this.c.setVisibility(0);
      this.aq.setVisibility(8);
      ArrayList localArrayList = new ArrayList();
      this.ai = new HashSet();
      if ((this.am) && (this.ak.getBoolean("allowDomain", false)))
      {
        String str4 = this.ac.f().b("domain_name");
        int i12 = ehr.bV;
        localArrayList.add(new hpd(4, str4, String.format(g().getString(i12), new Object[] { str4 }), ehr.bo));
        this.ai.add(Integer.valueOf(4));
      }
      if (this.ak.getBoolean("allowPublic", false))
      {
        int i10 = ehr.bY;
        String str3 = g().getString(i10);
        int i11 = ehr.bZ;
        localArrayList.add(new hpd(1, str3, g().getString(i11), ehr.br));
        this.ai.add(Integer.valueOf(1));
      }
      if (this.ak.getBoolean("allowPrivate", false))
      {
        int i6 = ehr.bW;
        String str1 = g().getString(i6);
        int i7 = ehr.bX;
        localArrayList.add(new hpd(3, str1, g().getString(i7), ehr.bq));
        this.ai.add(Integer.valueOf(3));
        int i8 = ehr.bT;
        String str2 = g().getString(i8);
        int i9 = ehr.bU;
        localArrayList.add(new hpd(2, str2, g().getString(i9), ehr.bs, true));
        this.ai.add(Integer.valueOf(2));
      }
      this.ah = localArrayList;
      hpe localhpe = new hpe(this, this.bn, aau.zw, this.ah, this.an);
      this.c.a = this;
      this.c.setAdapter(localhpe);
      if (this.ao != -1)
      {
        this.c.setSelection(this.ao, true);
        this.c.a(null);
        this.al = C();
        localView1.findViewById(efj.JK).setVisibility(0);
        hwq localhwq2 = this.ax;
        hwt localhwt2 = hwt.b;
        if (localhwt2 == null) {
          throw new NullPointerException();
        }
        localhwq2.g = ((hwt)localhwt2);
        localhwq2.a();
      }
      for (;;)
      {
        this.b = true;
        break;
        if (!this.ak.getBoolean("allowPublic", false))
        {
          if ((this.ak.getBoolean("allowPublic", false)) && (this.ai.contains(Integer.valueOf(1)))) {
            a(1);
          }
          hwq localhwq1;
          hwt localhwt1;
          for (;;)
          {
            localView1.findViewById(efj.JK).setVisibility(0);
            localhwq1 = this.ax;
            localhwt1 = hwt.b;
            if (localhwt1 != null) {
              break;
            }
            throw new NullPointerException();
            if (this.ak.getBoolean("allowPrivate", false))
            {
              if (this.ai.contains(Integer.valueOf(3)))
              {
                a(3);
                continue;
              }
              if (this.ai.contains(Integer.valueOf(2)))
              {
                a(2);
                continue;
              }
            }
            if ((this.ak.getBoolean("allowDomain", false)) && (this.ai.contains(Integer.valueOf(4)))) {
              a(4);
            }
          }
          localhwq1.g = ((hwt)localhwt1);
          localhwq1.a();
        }
        else
        {
          a(localView1);
        }
      }
      i3 = 0;
      break label818;
      i4 = ehr.bA;
      break label828;
    }
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
    this.ak = this.m.getBundle("allowedCollexionVisibility");
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    B();
  }
  
  final void a(View paramView)
  {
    Bundle localBundle = this.ak;
    boolean bool1 = localBundle.getBoolean("allowPublic", false);
    boolean bool2 = localBundle.getBoolean("allowDomain", false);
    boolean bool3 = localBundle.getBoolean("allowPrivate", false);
    int i = bool3 ^ bool1 ^ bool2;
    int j;
    int k;
    if ((bool1) && (bool2) && (bool3))
    {
      j = 1;
      if (((j ^ i) == 0) || (this.ah.isEmpty())) {
        break label150;
      }
      k = ((hpd)this.ah.get(0)).c;
    }
    for (;;)
    {
      a(k);
      if (this.ao != -1) {
        break label338;
      }
      if (this.af.a(((hho)mbb.a(this.bn, hho.class)).g()) == 1) {
        break label286;
      }
      A();
      return;
      j = 0;
      break;
      label150:
      gnb localgnb = (gnb)((hhh)this.bo.a(hhh.class)).b(this.aB);
      if (localgnb != null) {
        if (localgnb.c.length == 0)
        {
          k = 3;
          continue;
        }
      }
      switch (localgnb.c[0].c)
      {
      default: 
        k = 0;
        break;
      case 9: 
        k = 1;
        break;
      case 8: 
        k = 4;
        break;
      case 101: 
        k = 3;
        break;
      case 5: 
      case 7: 
        k = 2;
      }
    }
    label286:
    paramView.findViewById(efj.JK).setVisibility(8);
    hwq localhwq2 = this.ax;
    hwt localhwt2 = hwt.a;
    if (localhwt2 == null) {
      throw new NullPointerException();
    }
    localhwq2.g = ((hwt)localhwt2);
    localhwq2.a();
    return;
    label338:
    paramView.findViewById(efj.JK).setVisibility(0);
    hwq localhwq1 = this.ax;
    hwt localhwt1 = hwt.b;
    if (localhwt1 == null) {
      throw new NullPointerException();
    }
    localhwq1.g = ((hwt)localhwt1);
    localhwq1.a();
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.b(efj.JG);
    this.aC = paramgpr.c(efj.JG);
    MenuItem localMenuItem = this.aC;
    int i;
    if (this.ag != null)
    {
      i = 1;
      if (i == 0) {
        break label68;
      }
    }
    label68:
    for (int j = ehr.bB;; j = ehr.bz)
    {
      localMenuItem.setTitle(j);
      w();
      return;
      i = 0;
      break;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    Bundle localBundle;
    label36:
    bp localbp;
    String str1;
    String str2;
    if (!hae.a(paramhae))
    {
      localBundle = paramhae.a();
      switch (paramString.hashCode())
      {
      }
      for (int k = -1;; k = 0) {
        switch (k)
        {
        default: 
          localbp = f();
          if (localBundle != null)
          {
            str1 = localBundle.getString("clx_id");
            str2 = localBundle.getString("clx_name");
            if ((!"CreateCollexionTask".equals(paramString)) || (localbp.getCallingActivity() != null)) {
              break label300;
            }
            Intent localIntent1 = this.ae.a(this.aB, str1, str2);
            Intent localIntent2 = this.ae.b(this.aB, str1);
            fo.a(this.bn, new Intent[] { localIntent1, localIntent2 }, null);
          }
          localbp.finish();
          return;
          if (!paramString.equals("GetCollexionAudience")) {
            break label36;
          }
        }
      }
      this.a = ((gnb)localBundle.getParcelable("audience"));
      this.aj = localBundle.getBoolean("is_domain_restricted");
      z();
    }
    label252:
    int i;
    switch (paramString.hashCode())
    {
    default: 
      i = -1;
      switch (i)
      {
      default: 
        label255:
        return;
      }
      break;
    }
    for (int j = ehr.cb;; j = ehr.cg)
    {
      Toast.makeText(this.bn, j, 1).show();
      return;
      label300:
      localbp.setResult(-1, new Intent().putExtra("clx_id", str1).putExtra("clx_name", str2).putExtra("clx_acl", localBundle.getInt("clx_acl")));
      break;
      if (!paramString.equals("CreateCollexionTask")) {
        break label252;
      }
      i = 0;
      break label255;
      if (!paramString.equals("UpdateCollexionTask")) {
        break label252;
      }
      i = 1;
      break label255;
    }
  }
  
  public final void a(tp paramtp)
  {
    boolean bool = true;
    paramtp.c(bool);
    if (this.ag != null) {
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (int i = ehr.bC;; i = ehr.bA)
    {
      paramtp.b(i);
      return;
      bool = false;
      break;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == efj.JG)
    {
      mbf localmbf2 = this.bn;
      gxr localgxr2 = new gxr();
      gxq localgxq2 = new gxq(pjn.v);
      localgxr2.b.add(localgxq2);
      new gwz(4, localgxr2.a(this.bn)).b(localmbf2);
      String str = this.ag;
      int j = 0;
      if (str != null) {
        j = 1;
      }
      if ((j == 0) && (this.an) && (C() == 1) && (!this.ac.f().c("minor_public_extended_dialog")))
      {
        jmu localjmu = this.ay;
        int k = ehr.bx;
        localjmu.a(g().getString(k), null);
        return true;
      }
      B();
      return true;
    }
    if (i == 16908332)
    {
      mbf localmbf1 = this.bn;
      gxr localgxr1 = new gxr();
      gxq localgxq1 = new gxq(pjn.u);
      localgxr1.b.add(localgxq1);
      new gwz(4, localgxr1.a(this.bn)).b(localmbf1);
      f().finish();
      return true;
    }
    return false;
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(tp paramtp) {}
  
  public final void c(int paramInt)
  {
    if (this.ao != -1) {
      return;
    }
    if (paramInt == 2)
    {
      A();
      return;
    }
    a(this.N);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ac = ((git)this.bo.a(git.class));
    this.ae = ((hpo)this.bo.a(hpo.class));
    this.ad = ((gzj)this.bo.a(gzj.class));
    this.ad.a.add(this);
    this.aB = this.ac.c();
    this.af = ((hhn)this.bo.a(hhn.class));
    this.am = this.ac.f().c("is_dasher_account");
    this.an = this.ac.f().c("is_child");
    this.ap = new hrq(this.bp);
    this.bo.a(hrs.class, this.ap);
    this.bo.a(gxs.class, this);
    this.az = new hpf(this);
    this.aA = new hpg(this);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void d_()
  {
    super.d_();
    this.c = null;
    this.as = null;
    this.a = null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putCharSequence("clx_name", this.as.getText());
    paramBundle.putCharSequence("clx_tagline", this.at.getText());
    paramBundle.putInt("clx_acl", this.ao);
    paramBundle.putParcelable("audience", this.a);
    paramBundle.putBoolean("is_domain_restricted", this.aj);
    paramBundle.putBoolean("clx_autofollow_state", this.ar.isChecked());
  }
  
  public final void m()
  {
    super.m();
    this.as.addTextChangedListener(this.az);
    this.at.addTextChangedListener(this.aA);
    w();
    if (this.ag != null) {}
    for (int i = 1;; i = 0)
    {
      if ((i == 0) && (this.ao == -1)) {
        this.af.a(((hho)mbb.a(this.bn, hho.class)).g(), this);
      }
      return;
    }
  }
  
  public final void n()
  {
    super.n();
    this.as.removeTextChangedListener(this.az);
    this.at.removeTextChangedListener(this.aA);
    this.af.b(((hho)mbb.a(this.bn, hho.class)).g(), this);
  }
  
  public final void onClick(View paramView)
  {
    Switch localSwitch;
    if (paramView.getId() == efj.JI)
    {
      localSwitch = this.ar;
      if (this.ar.isChecked()) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false)
    {
      localSwitch.setChecked(bool);
      return;
    }
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.ao = paramInt;
    hpd localhpd = (hpd)paramAdapterView.getAdapter().getItem(paramInt);
    View localView = this.au;
    int i;
    if (localhpd.c == 3)
    {
      i = 8;
      localView.setVisibility(i);
      if (!localhpd.e) {
        break label147;
      }
      if (this.b)
      {
        this.b = false;
        localhpo = this.ae;
        j = this.aB;
        bool1 = this.am;
        if (this.ak.getBoolean("allowPublic", false)) {
          break label141;
        }
        bool2 = true;
        localIntent = localhpo.a(true, j, bool1, true, bool2, this.a);
        this.aE.a(efj.JZ, localIntent);
      }
    }
    label141:
    label147:
    while (this.a == null) {
      for (;;)
      {
        hpo localhpo;
        int j;
        boolean bool1;
        Intent localIntent;
        return;
        i = 0;
        break;
        boolean bool2 = false;
      }
    }
    this.a = null;
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public final gxq v()
  {
    return new gxq(pjn.w);
  }
  
  final void w()
  {
    boolean bool1 = true;
    if ((this.aC == null) || (this.as == null) || (this.c == null)) {
      return;
    }
    boolean bool2;
    if (!TextUtils.isEmpty(x())) {
      if (this.ag != null)
      {
        bool2 = bool1;
        if ((!bool2) && (this.c.getSelectedItemPosition() < 0)) {
          break label74;
        }
      }
    }
    for (;;)
    {
      this.aC.setEnabled(bool1);
      return;
      bool2 = false;
      break;
      label74:
      bool1 = false;
    }
  }
  
  final String x()
  {
    if (this.as != null) {
      return this.as.getText().toString().trim();
    }
    return null;
  }
  
  final String y()
  {
    if (this.at != null) {
      return this.at.getText().toString().trim();
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpb
 * JD-Core Version:    0.7.0.1
 */