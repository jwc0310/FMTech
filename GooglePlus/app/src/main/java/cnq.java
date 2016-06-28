import android.animation.LayoutTransition.TransitionListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.plus.service.EsService;
import java.util.HashMap;

public final class cnq
  extends cmo
{
  LayoutTransition.TransitionListener a;
  private nxx aA;
  private boolean aB;
  private HashMap<Integer, Boolean> aC = new HashMap();
  private CheckBox aD;
  private RadioGroup aE;
  private TextView aF;
  private RadioGroup aG;
  private CheckBox aH;
  ViewGroup ax;
  ViewGroup ay;
  private nxx az;
  
  private final void J()
  {
    if (this.aA.b != null)
    {
      int i = 1000;
      nwu[] arrayOfnwu = this.aA.b;
      int j = arrayOfnwu.length;
      int k = 0;
      boolean bool1 = false;
      if (k < j)
      {
        nwu localnwu = arrayOfnwu[k];
        CheckBox localCheckBox = new CheckBox(f());
        int i1 = i + 1;
        localCheckBox.setId(i);
        localCheckBox.setTag(localnwu.a);
        localCheckBox.setText(localnwu.b);
        Boolean localBoolean2 = localnwu.c;
        if (localBoolean2 == null) {}
        for (boolean bool3 = false;; bool3 = localBoolean2.booleanValue())
        {
          localCheckBox.setChecked(bool3);
          bool1 |= bool3;
          this.ay.addView(localCheckBox);
          k++;
          i = i1;
          break;
        }
      }
      this.aD.setChecked(bool1);
      if (bool1)
      {
        b(true);
        Boolean localBoolean1 = this.aA.c;
        boolean bool2;
        RadioGroup localRadioGroup;
        if (localBoolean1 == null)
        {
          bool2 = false;
          localRadioGroup = this.aE;
          if (!bool2) {
            break label256;
          }
        }
        label256:
        for (int m = aaw.Y;; m = aaw.js)
        {
          localRadioGroup.check(m);
          ViewGroup localViewGroup = this.ay;
          int n = 0;
          if (bool2) {
            n = 8;
          }
          localViewGroup.setVisibility(n);
          this.aG.check(a(this.aA.a));
          return;
          bool2 = localBoolean1.booleanValue();
          break;
        }
      }
      b(false);
      this.aE.check(aaw.Y);
      this.ay.setVisibility(8);
      if (this.aB)
      {
        a(true);
        this.aB = false;
      }
      this.aG.check(aaw.ik);
      return;
    }
    this.aD.setChecked(true);
    this.aE.check(aaw.Y);
    this.ay.setVisibility(8);
    this.aG.check(aaw.ik);
    ((RadioButton)this.aE.findViewById(aaw.js)).setEnabled(false);
  }
  
  private static int a(int paramInt)
  {
    if (paramInt == 3) {
      return aaw.ik;
    }
    if (paramInt == 1) {
      return aaw.mJ;
    }
    return aaw.Y;
  }
  
  private static void a(RadioGroup paramRadioGroup, boolean paramBoolean)
  {
    int i = paramRadioGroup.getChildCount();
    for (int j = 0; j < i; j++) {
      paramRadioGroup.getChildAt(j).setEnabled(paramBoolean);
    }
  }
  
  protected final void A()
  {
    int i = 0;
    super.A();
    nxx localnxx = new nxx();
    int i1;
    int i2;
    if (this.aD.isChecked())
    {
      int n = this.ay.getChildCount();
      localnxx.b = new nwu[n];
      boolean bool2;
      for (boolean bool1 = true; i < n; bool1 = bool2)
      {
        CheckBox localCheckBox2 = (CheckBox)this.ay.getChildAt(i);
        nwu localnwu2 = new nwu();
        localnwu2.a = ((String)localCheckBox2.getTag());
        localnwu2.b = localCheckBox2.getText().toString();
        localnwu2.c = Boolean.valueOf(localCheckBox2.isChecked());
        bool2 = bool1 & localnwu2.c.booleanValue();
        localnxx.b[i] = localnwu2;
        i++;
      }
      localnxx.c = Boolean.valueOf(bool1);
      i1 = this.aG.getCheckedRadioButtonId();
      if (i1 == aaw.ik) {
        i2 = 3;
      }
    }
    for (localnxx.a = i2;; localnxx.a = 1)
    {
      localnxx.d = Boolean.valueOf(this.aH.isChecked());
      bp localbp = f();
      int m = this.aw.c();
      Intent localIntent = EsService.e.a(localbp, EsService.class);
      localIntent.putExtra("op", 719);
      localIntent.putExtra("account_id", m);
      localIntent.putExtra("profile", qat.a(localnxx));
      this.av = Integer.valueOf(EsService.a(localbp, localIntent));
      c(aau.qE);
      return;
      if (i1 == aaw.mJ)
      {
        i2 = 1;
        break;
      }
      i2 = -2147483648;
      break;
      int j = this.ay.getChildCount();
      localnxx.b = new nwu[j];
      for (int k = 0; k < j; k++)
      {
        CheckBox localCheckBox1 = (CheckBox)this.ay.getChildAt(k);
        nwu localnwu1 = new nwu();
        localnwu1.a = ((String)localCheckBox1.getTag());
        localnwu1.c = Boolean.valueOf(false);
        localnwu1.b = localCheckBox1.getText().toString();
        localnxx.b[k] = localnwu1;
      }
      localnxx.c = Boolean.valueOf(false);
    }
  }
  
  protected final dme B()
  {
    return new cnr(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    this.ad = true;
    this.ae = true;
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.aB = paramBundle.getBoolean("people_in_your_circles");
      this.aC = ((HashMap)paramBundle.getSerializable("circles_list"));
      return;
    }
    this.aB = true;
  }
  
  protected final void a(bru parambru)
  {
    if ((parambru == null) || (parambru.j == null) || (parambru.j.a == null) || (parambru.j.a.b == null))
    {
      w();
      x();
      return;
    }
    this.aj = qat.a(parambru.j.a.b);
    if (this.ai == null) {
      this.ai = this.aj;
    }
    w();
    x();
  }
  
  final void a(boolean paramBoolean)
  {
    int i = this.ay.getChildCount();
    for (int j = 0; j < i; j++) {
      ((CheckBox)this.ay.getChildAt(j)).setChecked(paramBoolean);
    }
  }
  
  final void b(boolean paramBoolean)
  {
    a(this.aE, paramBoolean);
    TextView localTextView = this.aF;
    if (paramBoolean) {}
    for (int i = -16777216;; i = ab)
    {
      localTextView.setTextColor(i);
      int j = this.ay.getChildCount();
      for (int k = 0; k < j; k++) {
        this.ay.getChildAt(k).setEnabled(paramBoolean);
      }
    }
    a(this.aG, paramBoolean);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("people_in_your_circles", this.aB);
    paramBundle.putSerializable("circles_list", this.aC);
  }
  
  protected final void w()
  {
    super.w();
    this.aA = null;
    if (this.ai != null) {}
    try
    {
      nxx localnxx = new nxx();
      byte[] arrayOfByte = this.ai;
      this.aA = ((nxx)qat.b(localnxx, arrayOfByte, 0, arrayOfByte.length));
      label44:
      if (this.aA == null) {
        this.aA = new nxx();
      }
      return;
    }
    catch (Exception localException)
    {
      break label44;
    }
  }
  
  protected final void x()
  {
    super.x();
    this.az = null;
    if (this.aj != null) {}
    try
    {
      nxx localnxx = new nxx();
      byte[] arrayOfByte = this.aj;
      this.az = ((nxx)qat.b(localnxx, arrayOfByte, 0, arrayOfByte.length));
      label44:
      if (this.az == null) {
        this.az = new nxx();
      }
      return;
    }
    catch (Exception localException)
    {
      break label44;
    }
  }
  
  protected final void y()
  {
    super.y();
    this.ax = ((ViewGroup)a_(null).inflate(efj.wj, this.as, false));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.setMargins(aa, aa, aa, aa);
    this.as.addView(this.ax, localLayoutParams);
    this.aD = ((CheckBox)this.ax.findViewById(aaw.jV));
    this.aE = ((RadioGroup)this.ax.findViewById(aaw.Z));
    this.ay = ((ViewGroup)this.ax.findViewById(aaw.bu));
    this.aF = ((TextView)this.ax.findViewById(aaw.my));
    this.aG = ((RadioGroup)this.ax.findViewById(aaw.mx));
    J();
    this.aD.setOnCheckedChangeListener(new cns(this));
    this.aE.setOnCheckedChangeListener(new cnt(this));
    this.aH = ((CheckBox)this.ax.findViewById(aaw.dV));
    if (this.aA.d != null)
    {
      this.aH.setChecked(this.aA.d.booleanValue());
      return;
    }
    this.aH.setChecked(true);
  }
  
  public final void z()
  {
    super.z();
    nwu[] arrayOfnwu1 = this.az.b;
    int i = arrayOfnwu1.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      Boolean localBoolean2 = arrayOfnwu1[j].c;
      if (localBoolean2 == null) {}
      for (boolean bool3 = false;; bool3 = localBoolean2.booleanValue())
      {
        int i4 = k | bool3;
        j++;
        k = i4;
        break;
      }
    }
    nwu[] arrayOfnwu2 = this.az.b;
    int m = arrayOfnwu2.length;
    int n = 0;
    int i1 = 0;
    if (n < m)
    {
      nwu localnwu = arrayOfnwu2[n];
      ViewGroup localViewGroup = this.ay;
      int i3 = i1 + 1;
      CheckBox localCheckBox = (CheckBox)localViewGroup.getChildAt(i1);
      Boolean localBoolean1;
      boolean bool2;
      label146:
      cms localcms3;
      if (k != 0)
      {
        localBoolean1 = localnwu.c;
        if (localBoolean1 == null)
        {
          bool2 = false;
          localcms3 = new cms(this, bool2);
          localcms3.onCheckedChanged(localCheckBox, localCheckBox.isChecked());
        }
      }
      for (cms localcms2 = localcms3;; localcms2 = new cms(this, false))
      {
        localCheckBox.setOnCheckedChangeListener(localcms2);
        n++;
        i1 = i3;
        break;
        bool2 = localBoolean1.booleanValue();
        break label146;
      }
    }
    int i2;
    if (k != 0)
    {
      i2 = a(this.az.a);
      cmy localcmy = new cmy(this, i2);
      localcmy.onCheckedChanged(this.aG, this.aG.getCheckedRadioButtonId());
      this.aG.setOnCheckedChangeListener(localcmy);
      if (this.az.d == null) {
        break label337;
      }
    }
    label337:
    for (boolean bool1 = this.az.d.booleanValue();; bool1 = true)
    {
      cms localcms1 = new cms(this, bool1);
      localcms1.onCheckedChanged(this.aH, this.aH.isChecked());
      this.aH.setOnCheckedChangeListener(localcms1);
      return;
      i2 = aaw.ik;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnq
 * JD-Core Version:    0.7.0.1
 */