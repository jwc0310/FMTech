import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.libraries.social.acl.TextOnlyAudienceView;
import java.util.ArrayList;

public final class cmj
  extends cmo
{
  RadioGroup a;
  private ViewGroup aA;
  private TextView aB;
  private ViewGroup aC;
  private String[] aD;
  private String[] aE;
  private ViewGroup aF;
  private ViewGroup aG;
  private EditText aH;
  private TextView aI;
  private TextView aJ;
  private Spinner aK;
  private nwb ax;
  private nwb ay;
  private jgn az;
  
  private final nwb J()
  {
    nwb localnwb = new nwb();
    if (this.a.getCheckedRadioButtonId() == 1003)
    {
      localnwb.b = this.aK.getSelectedItemPosition();
      localnwb.c = this.aH.getText().toString();
    }
    for (;;)
    {
      if (localnwb.b == -2147483648) {
        localnwb.b = 0;
      }
      this.ay.a = E();
      localnwb.a = this.ay.a;
      return localnwb;
      localnwb.b = this.a.getCheckedRadioButtonId();
    }
  }
  
  private final void a(RadioGroup paramRadioGroup, int paramInt, String paramString)
  {
    RadioButton localRadioButton = new RadioButton(this.bn);
    localRadioButton.setId(paramInt);
    localRadioButton.setText(paramString);
    paramRadioGroup.addView(localRadioButton);
  }
  
  protected final void A()
  {
    super.A();
    nxl localnxl = new nxl();
    localnxl.e = new nxv();
    localnxl.e.e = J();
    a(localnxl);
  }
  
  final void a(int paramInt)
  {
    String str = this.aE[paramInt];
    this.aJ.setText(str);
    TextView localTextView = this.aJ;
    if (TextUtils.isEmpty(str)) {}
    for (int i = 8;; i = 0)
    {
      localTextView.setVisibility(i);
      return;
    }
  }
  
  public final void a(Cursor paramCursor)
  {
    nwm localnwm1 = this.ax.a;
    nwm localnwm2 = this.ay.a;
    this.ah = gnb.a(a(localnwm1));
    gnb localgnb1 = gnb.a(this.at.c);
    if ((localgnb1 == null) || (localgnb1.b())) {
      localgnb1 = gnb.a(a(localnwm2));
    }
    gnb localgnb2 = gnb.a(localgnb1);
    TextOnlyAudienceView localTextOnlyAudienceView = this.at;
    localTextOnlyAudienceView.g = true;
    ArrayList localArrayList = new ArrayList(localTextOnlyAudienceView.c);
    gnb localgnb3 = gnb.a(localTextOnlyAudienceView.c);
    jgs[] arrayOfjgs1 = localgnb3.c;
    jjd[] arrayOfjjd1 = localgnb3.b;
    lhp[] arrayOflhp1 = localgnb3.d;
    hps[] arrayOfhps1 = localgnb3.e;
    localTextOnlyAudienceView.c.clear();
    if (localgnb2 != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        gnb localgnb5 = (gnb)localArrayList.get(j);
        if (localgnb2.b(localgnb5)) {
          localTextOnlyAudienceView.c.add(localgnb5);
        }
      }
      jgs[] arrayOfjgs2 = localgnb2.c;
      int k = arrayOfjgs2.length;
      int m = 0;
      if (m < k)
      {
        jgs localjgs = arrayOfjgs2[m];
        gnb localgnb4;
        if (!localjgs.a(arrayOfjgs1))
        {
          localgnb4 = new gnb(localjgs);
          if (localjgs.c != 9) {
            break label280;
          }
          localTextOnlyAudienceView.c.add(0, localgnb4);
        }
        for (;;)
        {
          m++;
          break;
          label280:
          localTextOnlyAudienceView.c.add(localgnb4);
        }
      }
      for (jjd localjjd : localgnb2.b) {
        if (!localjjd.a(arrayOfjjd1)) {
          localTextOnlyAudienceView.c.add(new gnb(localjjd));
        }
      }
      for (lhp locallhp : localgnb2.d) {
        if (!locallhp.a(arrayOflhp1)) {
          localTextOnlyAudienceView.c.add(new gnb(locallhp));
        }
      }
      for (hps localhps : localgnb2.e) {
        if (!localhps.a(arrayOfhps1)) {
          localTextOnlyAudienceView.c.add(new gnb(localhps));
        }
      }
    }
    localTextOnlyAudienceView.b();
    this.at.setEnabled(true);
  }
  
  public final void a(Bundle paramBundle)
  {
    this.az = null;
    jgm localjgm = (jgm)this.bo.b(jgm.class);
    if (localjgm != null) {
      this.az = localjgm.a(this.bn);
    }
    super.a(paramBundle);
  }
  
  final void b(int paramInt)
  {
    if ((paramInt != 1003) && (this.aG.getVisibility() == 0))
    {
      this.aH.setText("");
      this.aK.setSelection(0);
      this.aG.setVisibility(8);
      this.aH.setVisibility(8);
    }
    while (paramInt != 1003) {
      return;
    }
    this.aG.setVisibility(0);
    this.aH.setVisibility(0);
  }
  
  protected final byte[] v()
  {
    return qat.a(J());
  }
  
  protected final void w()
  {
    if (this.ai != null) {
      this.ay = null;
    }
    try
    {
      nwb localnwb = new nwb();
      byte[] arrayOfByte = this.ai;
      this.ay = ((nwb)qat.b(localnwb, arrayOfByte, 0, arrayOfByte.length));
      label40:
      if (this.ay == null) {
        this.ay = new nwb();
      }
      return;
    }
    catch (Exception localException)
    {
      break label40;
    }
  }
  
  protected final void x()
  {
    super.x();
    if (this.aj != null) {
      this.ax = null;
    }
    for (;;)
    {
      try
      {
        nwb localnwb = new nwb();
        byte[] arrayOfByte = this.aj;
        this.ax = ((nwb)qat.b(localnwb, arrayOfByte, 0, arrayOfByte.length));
        localnwm = this.ax.a;
        if (this.ax == null) {
          this.ax = new nwb();
        }
        if ((localnwm != null) && (localnwm.a != null)) {
          this.ag = localnwm.a.b;
        }
        return;
      }
      catch (Exception localException)
      {
        localnwm = null;
        continue;
      }
      nwm localnwm = null;
    }
  }
  
  protected final void y()
  {
    super.y();
    if (this.az == null) {
      return;
    }
    Resources localResources = g();
    this.aA = ((ViewGroup)a_(null).inflate(efj.wc, this.as, false));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.setMargins(aa, aa, aa, aa);
    this.as.addView(this.aA, localLayoutParams);
    this.aF = ((ViewGroup)this.aA.findViewById(aaw.dP));
    this.aB = ((TextView)this.aF.findViewById(aaw.dQ));
    this.aC = ((ViewGroup)this.aF.findViewById(aaw.dO));
    this.aF.setBackgroundDrawable(localResources.getDrawable(efj.oQ));
    this.aC.removeAllViews();
    this.aB.setText(aau.pF);
    this.aB.setVisibility(0);
    this.a = new RadioGroup(this.bn);
    this.a.setOrientation(1);
    this.aC.addView(this.a);
    RadioGroup localRadioGroup1 = this.a;
    int i = aau.pH;
    a(localRadioGroup1, 1, g().getString(i));
    RadioGroup localRadioGroup2 = this.a;
    int j = aau.pG;
    a(localRadioGroup2, 2, g().getString(j));
    a(this.a, 3, this.az.h());
    a(this.a, 1003, this.az.a());
    this.aH = new EditText(this.bn);
    this.aH.setHint(this.az.b());
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new InputFilter.LengthFilter(50);
    this.aH.setFilters(arrayOfInputFilter);
    this.a.addView(this.aH);
    String[] arrayOfString1 = new String[4];
    arrayOfString1[0] = this.az.c();
    int k = aau.pH;
    arrayOfString1[1] = g().getString(k);
    int m = aau.pG;
    arrayOfString1[2] = g().getString(m);
    int n = aau.pI;
    arrayOfString1[3] = g().getString(n);
    this.aD = arrayOfString1;
    String[] arrayOfString2 = new String[4];
    arrayOfString2[0] = this.az.d();
    arrayOfString2[1] = this.az.d();
    arrayOfString2[2] = this.az.e();
    arrayOfString2[3] = this.az.f();
    this.aE = arrayOfString2;
    this.aG = ((ViewGroup)this.aA.findViewById(aaw.ih));
    this.aI = ((TextView)this.aG.findViewById(aaw.ij));
    this.aK = ((Spinner)this.aG.findViewById(aaw.ig));
    this.aJ = ((TextView)this.aG.findViewById(aaw.ii));
    localResources.getDimensionPixelSize(efj.nr);
    this.aG.setBackgroundDrawable(localResources.getDrawable(efj.oT));
    this.aI.setText(this.az.g());
    ArrayAdapter localArrayAdapter = new ArrayAdapter(this.bn, efj.wt, this.aD);
    localArrayAdapter.setDropDownViewResource(17367049);
    this.aK.setAdapter(localArrayAdapter);
    int i1;
    int i2;
    String str;
    if (this.ay.b != -2147483648)
    {
      i1 = this.ay.b;
      if (TextUtils.isEmpty(this.ay.c)) {
        break label745;
      }
      i2 = 1003;
      str = this.ay.c;
    }
    for (int i3 = i1;; i3 = 0)
    {
      RadioButton localRadioButton = (RadioButton)this.a.findViewById(i2);
      if (localRadioButton != null) {
        localRadioButton.setChecked(true);
      }
      this.aK.setSelection(i3);
      this.aH.setText(str);
      b(i2);
      a(i3);
      return;
      i1 = 0;
      break;
      label745:
      str = "";
      i2 = i1;
    }
  }
  
  public final void z()
  {
    super.z();
    if (this.az == null) {
      return;
    }
    String str = "";
    int i;
    int j;
    if (this.ay.b != -2147483648)
    {
      i = this.ay.b;
      if (TextUtils.isEmpty(this.ay.c)) {
        break label172;
      }
      j = 1003;
      str = this.ay.c;
    }
    for (int k = i;; k = 0)
    {
      cmm localcmm = new cmm(this, j, new cml(this, j, k, str, this.a, this.aK, this.aH), this.a);
      this.a.setOnCheckedChangeListener(localcmm);
      cmn localcmn = new cmn(this, k, (cmm)localcmm);
      this.aK.setOnItemSelectedListener(localcmn);
      cmk localcmk = new cmk(this, this.aH, (cmm)localcmm);
      this.aH.addTextChangedListener(localcmk);
      return;
      i = 0;
      break;
      label172:
      j = i;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmj
 * JD-Core Version:    0.7.0.1
 */