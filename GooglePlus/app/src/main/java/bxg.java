import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.social.ui.views.imagetextbutton.ImageTextButton;
import java.util.ArrayList;

public abstract class bxg
  extends mca
  implements View.OnClickListener, gzi, hdt, hgn, luu
{
  public int[] Z;
  public int a;
  CheckBox aa;
  CheckBox ab;
  String ac;
  String ad;
  private ImageTextButton ae;
  private View af;
  private TextView ag;
  private View ah;
  private TextView ai;
  private View aj;
  private ImageView ak;
  private TextView al;
  private View am;
  private boolean an;
  private boolean ao;
  private boolean ap;
  private String aq;
  private String ar;
  private String as;
  private gzj at = new gzj(this, this.bp);
  public bxn b;
  public bxn c;
  public String[] d;
  
  public bxg()
  {
    new hdu(this.bp, this);
  }
  
  private void H()
  {
    TextView localTextView = this.ai;
    int i;
    switch (this.c.c)
    {
    default: 
      i = aau.dG;
    }
    for (;;)
    {
      localTextView.setText(i);
      I();
      return;
      i = aau.dE;
      continue;
      i = aau.dI;
      continue;
      i = aau.dF;
      continue;
      i = aau.dD;
    }
  }
  
  private final void I()
  {
    ImageTextButton localImageTextButton = this.ae;
    if (!this.b.equals(this.c)) {}
    for (boolean bool = true;; bool = false)
    {
      localImageTextButton.setEnabled(bool);
      return;
    }
  }
  
  private void J()
  {
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  private void a(int paramInt)
  {
    f().setResult(paramInt, null);
    f().finish();
  }
  
  public static void a(Context paramContext)
  {
    Toast localToast = Toast.makeText(paramContext, aau.dQ, 1);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  protected static void a(View paramView)
  {
    paramView.findViewById(16908292).setVisibility(8);
    paramView.findViewById(aaw.jm).setVisibility(0);
  }
  
  final void A()
  {
    ImageView localImageView = this.ak;
    int i;
    StringBuilder localStringBuilder;
    label58:
    CharSequence[] arrayOfCharSequence3;
    if (this.c.e)
    {
      i = efj.qC;
      localImageView.setImageResource(i);
      mfz localmfz = (mfz)mfx.a.get();
      localmfz.b = (1 + localmfz.b);
      if (localmfz.b != 1) {
        break label159;
      }
      localStringBuilder = localmfz.a;
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.aq;
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.ar;
      efj.a(localStringBuilder, arrayOfCharSequence2);
      arrayOfCharSequence3 = new CharSequence[1];
      if (!this.c.e) {
        break label174;
      }
    }
    label159:
    label174:
    for (String str = this.ac;; str = this.ad)
    {
      arrayOfCharSequence3[0] = str;
      efj.a(localStringBuilder, arrayOfCharSequence3);
      this.aj.setContentDescription(mfx.b(localStringBuilder));
      I();
      return;
      i = efj.qB;
      break;
      localStringBuilder = new StringBuilder(256);
      break label58;
    }
  }
  
  final void B()
  {
    TextView localTextView = this.al;
    int i;
    StringBuilder localStringBuilder;
    label58:
    CharSequence[] arrayOfCharSequence2;
    if (this.c.f)
    {
      i = aau.dO;
      localTextView.setText(i);
      mfz localmfz = (mfz)mfx.a.get();
      localmfz.b = (1 + localmfz.b);
      if (localmfz.b != 1) {
        break label138;
      }
      localStringBuilder = localmfz.a;
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.as;
      efj.a(localStringBuilder, arrayOfCharSequence1);
      arrayOfCharSequence2 = new CharSequence[1];
      if (!this.c.f) {
        break label153;
      }
    }
    label138:
    label153:
    for (String str = this.ad;; str = this.ac)
    {
      arrayOfCharSequence2[0] = str;
      efj.a(localStringBuilder, arrayOfCharSequence2);
      this.am.setContentDescription(mfx.b(localStringBuilder));
      I();
      return;
      i = aau.dP;
      break;
      localStringBuilder = new StringBuilder(256);
      break label58;
    }
  }
  
  protected abstract int C();
  
  protected abstract String D();
  
  protected final void E()
  {
    if ((this.c.c != this.b.c) || (this.c.e != this.b.e))
    {
      int i = this.c.c;
      boi localboi = new boi(f(), this.a, C(), D(), i, this.c.e);
      if (jid.a()) {
        jid.a("BaseStreamSettingsFmt", "Starting setVolumeControlTask.");
      }
      this.at.b(localboi);
      Bundle localBundle = F();
      localBundle.putByteArray("extra_notification_volume_change", qat.a(gxy.a(1, this.b.c, this.b.e, this.c.c, this.c.e)));
      int j = this.a;
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, j);
      localgxw.c = gxz.ae;
      localgxw.d = gya.a;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
    }
    for (int k = 1;; k = 0)
    {
      boolean bool;
      if ((!TextUtils.equals(this.c.b, this.b.b)) || (this.c.f != this.b.f))
      {
        int m = this.a;
        String str1 = this.c.a;
        String str2 = this.c.b;
        if (!this.c.f)
        {
          bool = true;
          if (jid.a()) {
            jid.a("BaseStreamSettingsFmt", "Starting updateCircleTask.");
          }
          if (str1.startsWith("f.")) {
            str1 = str1.substring(2);
          }
          jjx localjjx = new jjx(this.bn, m, str1, str2, bool, null);
          this.at.b(localjjx);
        }
      }
      for (int n = 1;; n = 0)
      {
        if ((k != 0) && (n != 0)) {
          this.an = true;
        }
        int i1 = aau.dL;
        coo.a(null, g().getString(i1), false, false).a(this.x, "req_pending");
        return;
        bool = false;
        break;
      }
    }
  }
  
  protected abstract Bundle F();
  
  protected final void G()
  {
    if (this.ae.isEnabled())
    {
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
    a(0);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = paramLayoutInflater.inflate(efj.sY, null);
    ((ImageTextButton)localView1.findViewById(aaw.aT)).setOnClickListener(this);
    this.ae = ((ImageTextButton)localView1.findViewById(aaw.jk));
    this.ae.setOnClickListener(this);
    this.ae.setEnabled(false);
    this.af = localView1.findViewById(aaw.fy);
    this.ag = ((TextView)localView1.findViewById(aaw.fA));
    this.ah = localView1.findViewById(aaw.ab);
    this.ai = ((TextView)localView1.findViewById(aaw.ac));
    this.aa = ((CheckBox)localView1.findViewById(aaw.kA));
    CheckBox localCheckBox1 = this.aa;
    nj.a.c(localCheckBox1, 2);
    this.ak = ((ImageView)localView1.findViewById(aaw.kB));
    ImageView localImageView = this.ak;
    nj.a.c(localImageView, 2);
    this.aj = localView1.findViewById(aaw.kE);
    View localView2 = localView1.findViewById(aaw.mL);
    nj.a.c(localView2, 2);
    this.ab = ((CheckBox)localView1.findViewById(aaw.mI));
    CheckBox localCheckBox2 = this.ab;
    nj.a.c(localCheckBox2, 2);
    this.al = ((TextView)localView1.findViewById(aaw.mQ));
    this.am = localView1.findViewById(aaw.mM);
    int i = aau.dN;
    this.aq = g().getString(i);
    int j = aau.dK;
    this.ar = g().getString(j);
    int k = aau.dM;
    this.as = g().getString(k);
    int m = aau.dr;
    this.ac = g().getString(m);
    int n = aau.ds;
    this.ad = g().getString(n);
    if (this.c == null)
    {
      View localView3 = localView1.findViewById(16908292);
      localView3.setVisibility(0);
      localView3.findViewById(aaw.eA).setVisibility(8);
      localView3.findViewById(aaw.ez).setVisibility(0);
      localView1.findViewById(aaw.jm).setVisibility(8);
      return localView1;
    }
    b(localView1);
    a(localView1);
    return localView1;
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    if ("velocity".equals(paramString))
    {
      this.c.c = this.Z[paramInt];
      H();
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    if (paramBundle != null)
    {
      this.b = ((bxn)paramBundle.getSerializable("original_settings"));
      this.c = ((bxn)paramBundle.getSerializable("settings"));
      this.an = paramBundle.getBoolean("saved_volume_and_properties");
    }
    this.a = this.m.getInt("account_id", -1);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("quit".equals(paramString)) {
      a(0);
    }
    while (!"disable_share_to_following".equals(paramString)) {
      return;
    }
    E();
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (paramString.equals("UpdateCircleTask"))
    {
      if (jid.a()) {
        jid.a("BaseStreamSettingsFmt", "UpdateCircleTask completed.");
      }
      int k = paramhae.b;
      int m = 0;
      if (k != 200) {
        m = 1;
      }
      if (m != 0)
      {
        if (jid.a()) {
          jid.a("BaseStreamSettingsFmt", "Update circle failed.");
        }
        J();
        this.ap = true;
        Toast.makeText(f(), aau.uV, 1).show();
        this.c.b = this.b.b;
        this.c.f = this.b.f;
        z();
        B();
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          if (jid.a()) {
            jid.a("BaseStreamSettingsFmt", "Starting loadCirclesTask.");
          }
          bnl localbnl = new bnl(this.bn, "LoadCirclesTask", this.a);
          this.at.b(localbnl);
          return;
          if (!paramString.equals("LoadCirclesTask")) {
            break;
          }
          if (jid.a()) {
            jid.a("BaseStreamSettingsFmt", "LoadCirclesTask completed.");
          }
          if (jid.a()) {
            jid.a("BaseStreamSettingsFmt", "Update circle succeeded.");
          }
          J();
          this.ap = true;
        } while ((this.an) && (!this.ao));
        a(-1);
        return;
      } while (!paramString.equals("SetVolumeControlTask"));
      if (jid.a()) {
        jid.a("BaseStreamSettingsFmt", "SetVolumeControlTask completed.");
      }
      J();
      this.ao = true;
      int i = paramhae.b;
      int j = 0;
      if (i != 200) {
        j = 1;
      }
      if (j != 0)
      {
        Toast.makeText(f(), aau.uV, 1).show();
        return;
      }
    } while ((this.an) && (!this.ap));
    a(-1);
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void b(View paramView)
  {
    this.af.setOnClickListener(new bxh(this));
    label120:
    CheckBox localCheckBox;
    if (v())
    {
      z();
      this.ah.setOnClickListener(new bxi(this));
      H();
      if (!y()) {
        break label340;
      }
      if ((!this.c.d) && (!this.c.e)) {
        break label277;
      }
      this.aa.setChecked(this.c.e);
      this.aa.setOnCheckedChangeListener(new bxj(this));
      this.aj.setOnClickListener(new bxk(this));
      A();
      if (!x())
      {
        this.am.setVisibility(8);
        paramView.findViewById(aaw.mN).setVisibility(8);
        paramView.findViewById(aaw.mO).setVisibility(8);
        paramView.findViewById(aaw.mP).setVisibility(8);
        paramView.findViewById(aaw.mK).setVisibility(8);
      }
      localCheckBox = this.ab;
      if (this.c.f) {
        break label388;
      }
    }
    label388:
    for (boolean bool = true;; bool = false)
    {
      localCheckBox.setChecked(bool);
      B();
      this.ab.setOnCheckedChangeListener(new bxl(this));
      this.am.setOnClickListener(new bxm(this));
      return;
      this.af.setVisibility(8);
      paramView.findViewById(aaw.fx).setVisibility(8);
      paramView.findViewById(aaw.fz).setVisibility(8);
      break;
      label277:
      ((TextView)paramView.findViewById(aaw.kz)).setTextColor(g().getColor(efj.ko));
      this.aa.setChecked(false);
      this.aa.setEnabled(false);
      this.ak.setImageResource(efj.qB);
      paramView.findViewById(aaw.kC).setVisibility(0);
      break label120;
      label340:
      paramView.findViewById(aaw.kF).setVisibility(8);
      paramView.findViewById(aaw.kG).setVisibility(8);
      paramView.findViewById(aaw.kD).setVisibility(8);
      this.aj.setVisibility(8);
      break label120;
    }
  }
  
  protected void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gzj.class, this.at);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putSerializable("settings", this.c);
    paramBundle.putSerializable("original_settings", this.b);
    paramBundle.putBoolean("saved_volume_and_properties", this.an);
    super.e(paramBundle);
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aaw.aT) {
      G();
    }
    while (i != aaw.jk) {
      return;
    }
    E();
  }
  
  public final boolean t_()
  {
    G();
    return true;
  }
  
  protected boolean v()
  {
    return true;
  }
  
  protected boolean x()
  {
    return true;
  }
  
  protected boolean y()
  {
    return true;
  }
  
  protected final void z()
  {
    this.ag.setText(this.c.b);
    I();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxg
 * JD-Core Version:    0.7.0.1
 */