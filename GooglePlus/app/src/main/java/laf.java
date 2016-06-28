import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public final class laf
  extends mca
  implements View.OnClickListener, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener, gpq, gzi
{
  static final ViewGroup.LayoutParams a = new AbsListView.LayoutParams(-1, -2);
  private git Z;
  private TextView aa;
  private EditText ab;
  private Switch ac;
  private Switch ad;
  private Integer[] ae;
  private Spinner af;
  private lah ag;
  private boolean ah;
  private View ai;
  private View aj;
  private MenuItem ak;
  Switch b;
  String c;
  int d;
  
  public laf()
  {
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(1);
    this.ae = arrayOfInteger;
    new gpk(this, this.bp, this);
    new gxl(pjo.J).a(this.bo);
    new gxj(this.bp, (byte)0);
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.ai.setVisibility(0);
      this.aj.setVisibility(8);
      return;
    }
    this.ai.setVisibility(8);
    this.aj.setVisibility(0);
  }
  
  private boolean w()
  {
    return this.Z.f().c("is_dasher_account");
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(eyg.bF, paramViewGroup, false);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
    this.d = this.bn.getResources().getDimensionPixelSize(efj.WD);
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    gxn localgxn = new gxn(this);
    this.ab = ((EditText)paramView.findViewById(aw.dV));
    TextView localTextView1 = (TextView)paramView.findViewById(aw.dM);
    this.ab.addTextChangedListener(new lwc(this.ab, localTextView1, 50));
    this.ab.addTextChangedListener(new lag(this));
    if (TextUtils.isEmpty(this.ab.getText())) {
      this.ab.setText("");
    }
    this.af = ((Spinner)paramView.findViewById(aw.dT));
    this.ag = new lah(this, this.bn, eyg.bE, this.ae);
    this.ag.setDropDownViewResource(17367049);
    this.af.setAdapter(this.ag);
    this.af.setOnItemSelectedListener(this);
    this.aa = ((TextView)paramView.findViewById(aw.dI));
    efj.a(this.aa, new gxq(pjo.K));
    this.aa.setOnClickListener(localgxn);
    View localView = paramView.findViewById(aw.dP);
    this.b = ((Switch)paramView.findViewById(aw.dQ));
    TextView localTextView2 = (TextView)paramView.findViewById(aw.dR);
    if (w())
    {
      this.c = this.Z.f().b("domain_name");
      localView.setVisibility(0);
      this.b.setOnCheckedChangeListener(this);
      Switch localSwitch3 = this.b;
      int k = efj.WH;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.c;
      localSwitch3.setText(g().getString(k, arrayOfObject1));
      int m = efj.WJ;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.c;
      localTextView2.setText(g().getString(m, arrayOfObject2));
      efj.a(this.b, new gxq(pjo.O));
      this.b.setOnClickListener(localgxn);
    }
    this.ai = paramView.findViewById(aw.dK);
    this.aj = paramView.findViewById(aw.dN);
    this.ac = ((Switch)paramView.findViewById(aw.dL));
    Switch localSwitch1 = this.ac;
    int i = efj.WT;
    localSwitch1.setText(g().getString(i));
    this.ac.setOnCheckedChangeListener(this);
    efj.a(this.ac, new gxq(pjo.G));
    this.ac.setOnClickListener(localgxn);
    this.ad = ((Switch)paramView.findViewById(aw.dO));
    Switch localSwitch2 = this.ad;
    int j = efj.WQ;
    localSwitch2.setText(g().getString(j));
    this.ad.setOnCheckedChangeListener(this);
    efj.a(this.ad, new gxq(pjo.R));
    this.ad.setOnClickListener(localgxn);
    boolean bool = w();
    if (paramBundle == null) {
      this.b.setChecked(bool);
    }
    for (this.ah = true;; this.ah = paramBundle.getBoolean("public_selected"))
    {
      this.ag.notifyDataSetChanged();
      a(this.ah);
      return;
      paramBundle.getBoolean("is_domain_restricted");
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.b(aw.dU);
    this.ak = paramgpr.c(aw.dU);
    v();
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("CreateSquareTask".equals(paramString)) {
      if (paramhae.b == 200) {
        break label61;
      }
    }
    label61:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        String str = paramhae.a().getString("square_id");
        ((lai)this.bo.a(lai.class)).a(str);
      }
      return;
    }
  }
  
  public final void a(tp paramtp)
  {
    paramtp.c(true);
    paramtp.d(true);
    paramtp.a(this.bn.getString(efj.WI));
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = 1;
    int j = paramMenuItem.getItemId();
    if (j == aw.dU) {
      if (this.af.getSelectedItemPosition() == 0)
      {
        k = i;
        bool1 = this.ac.isChecked();
        bool2 = this.ad.isChecked();
        if (k == 0) {
          break label289;
        }
        if (!bool1) {
          break label283;
        }
        i2 = 2;
        n = i2;
        if ((!w()) || (!this.b.isChecked())) {
          break label310;
        }
        i1 = 2;
        if ((this.ab.getText() == null) || (TextUtils.isEmpty(this.ab.getText().toString()))) {
          break label316;
        }
        str = this.ab.getText().toString();
        if ((this.ab.getText() == null) || (TextUtils.isEmpty(this.ab.getText().toString()))) {
          break label333;
        }
        if (i != 0)
        {
          locallap = new lap(this.bn, this.Z.c(), str, n, i1);
          ((gzj)this.bo.a(gzj.class)).c(locallap);
        }
        new laj(this, str, n, i1);
        localmbf2 = this.bn;
        localgxr2 = new gxr();
        localgxq2 = new gxq(pjo.I);
        localgxr2.b.add(localgxq2);
        new gwz(4, localgxr2.a(this.bn)).b(localmbf2);
      }
    }
    label283:
    label289:
    label310:
    label316:
    label333:
    while (j != 16908332) {
      for (;;)
      {
        boolean bool1;
        boolean bool2;
        int n;
        String str;
        lap locallap;
        mbf localmbf2;
        gxr localgxr2;
        gxq localgxq2;
        return false;
        int k = 0;
        continue;
        int i2 = i;
        continue;
        if (bool2) {}
        for (int m = 3;; m = 4)
        {
          n = m;
          break;
        }
        int i1 = i;
        continue;
        Toast.makeText(this.bn, efj.WK, 0).show();
        continue;
        i = 0;
      }
    }
    mbf localmbf1 = this.bn;
    gxr localgxr1 = new gxr();
    gxq localgxq1 = new gxq(pjo.H);
    localgxr1.b.add(localgxq1);
    new gwz(26, localgxr1.a(this.bn)).b(localmbf1);
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.Z = ((git)this.bo.a(git.class));
    ((gzj)this.bo.a(gzj.class)).a.add(this);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("is_domain_restricted", this.b.isChecked());
    paramBundle.putBoolean("public_selected", this.ah);
  }
  
  public final void m()
  {
    super.m();
    v();
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    int i = paramCompoundButton.getId();
    gxt localgxt3;
    if (i == aw.dQ)
    {
      this.ag.notifyDataSetChanged();
      Switch localSwitch3 = this.b;
      if (paramBoolean)
      {
        localgxt3 = pjo.O;
        efj.a(localSwitch3, new gxq(localgxt3));
      }
    }
    do
    {
      return;
      localgxt3 = pjo.N;
      break;
      if (i == aw.dL)
      {
        Switch localSwitch2 = this.ac;
        if (paramBoolean) {}
        for (gxt localgxt2 = pjo.G;; localgxt2 = pjo.F)
        {
          efj.a(localSwitch2, new gxq(localgxt2));
          return;
        }
      }
    } while (i != aw.dO);
    Switch localSwitch1 = this.ad;
    if (paramBoolean) {}
    for (gxt localgxt1 = pjo.R;; localgxt1 = pjo.Q)
    {
      efj.a(localSwitch1, new gxq(localgxt1));
      return;
    }
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.aa) {
      a(new Intent("android.intent.action.VIEW", efj.a(this.bn, "community_visibility", "https://support.google.com/plus/?hl=%locale%")));
    }
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool;
    mbf localmbf;
    gxr localgxr;
    if (paramInt == 0)
    {
      bool = true;
      this.ah = bool;
      a(this.ah);
      localmbf = this.bn;
      localgxr = new gxr();
      if (!this.ah) {
        break label101;
      }
    }
    label101:
    for (gxt localgxt = pjo.M;; localgxt = pjo.L)
    {
      gxq localgxq = new gxq(localgxt);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(this.bn)).b(localmbf);
      return;
      bool = false;
      break;
    }
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  final void v()
  {
    if ((this.ab == null) || (this.ak == null)) {
      return;
    }
    MenuItem localMenuItem = this.ak;
    if (!TextUtils.isEmpty(this.ab.getText())) {}
    for (boolean bool = true;; bool = false)
    {
      localMenuItem.setEnabled(bool);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     laf
 * JD-Core Version:    0.7.0.1
 */