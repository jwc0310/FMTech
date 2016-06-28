import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.libraries.social.acl.TextOnlyAudienceView;
import java.util.HashSet;

public final class cnj
  extends cmo
{
  EditText a;
  int aA;
  boolean aB;
  View aC;
  RadioButton aD;
  RadioButton aE;
  RadioButton aF;
  private Runnable aG;
  private ViewGroup aH;
  private EditText aI;
  private EditText aJ;
  private TextView aK;
  private String aL;
  private String aM;
  private String aN;
  private String aO;
  private String aP;
  private String aQ;
  private boolean aR = true;
  private boolean aS;
  private boolean aT;
  private Button aU;
  private RadioGroup aV;
  private boolean aW;
  private boolean aX = true;
  private boolean aY;
  private final CompoundButton.OnCheckedChangeListener aZ = new cnk(this);
  TextView ax;
  View ay;
  String az;
  private final View.OnClickListener ba = new cnl(this);
  private final TextWatcher bb = new cnm(this);
  private final TextWatcher bc = new cnn(this);
  
  private final String L()
  {
    Resources localResources = g();
    int i = aau.qv;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = M();
    arrayOfObject[1] = N();
    return localResources.getString(i, arrayOfObject);
  }
  
  private final String M()
  {
    if (this.aR) {
      return this.aI.getText().toString();
    }
    return this.aJ.getText().toString();
  }
  
  private final String N()
  {
    if (this.aR) {
      return this.aJ.getText().toString();
    }
    return this.aI.getText().toString();
  }
  
  private final void b(String paramString)
  {
    if (this.aG == null) {
      this.aG = new cnp(this);
    }
    this.az = paramString;
    Runnable localRunnable1 = this.aG;
    efj.m().removeCallbacks(localRunnable1);
    Runnable localRunnable2 = this.aG;
    efj.m().postDelayed(localRunnable2, 50L);
  }
  
  protected final void A()
  {
    super.A();
    if ((!this.aW) && ((TextUtils.isEmpty(M())) || (TextUtils.isEmpty(N()))))
    {
      b(g().getString(aau.qy));
      return;
    }
    nxl localnxl = new nxl();
    localnxl.e = new nxv();
    if (this.aX)
    {
      localnxl.e.a = new nwn();
      localnxl.e.a.a = M();
      localnxl.e.a.b = N();
    }
    localnxl.d = new nvn();
    localnxl.d.b = new nwp();
    localnxl.d.b.a = this.a.getText().toString();
    localnxl.e.c = new nwo();
    nwo localnwo = localnxl.e.c;
    int i = this.aV.getCheckedRadioButtonId();
    int j;
    if (i == aaw.gN) {
      j = 1;
    }
    for (;;)
    {
      localnwo.a = brn.d(j);
      a(localnxl);
      return;
      if (i == aaw.gP) {
        j = 2;
      } else if (i == aaw.gO) {
        j = 3;
      } else {
        j = 0;
      }
    }
  }
  
  protected final void C()
  {
    ilb localilb = (ilb)this.bo.a(ilb.class);
    String str = this.aw.f().b("account_name");
    ((gzj)mbb.a(f(), gzj.class)).b(new cno(this, f(), "refreshAccount", localilb, str));
  }
  
  final void J()
  {
    this.aD.setText(L());
    RadioButton localRadioButton1 = this.aE;
    String str1 = this.a.getText().toString();
    String str2;
    RadioButton localRadioButton2;
    String str3;
    if (TextUtils.isEmpty(str1))
    {
      str2 = L();
      localRadioButton1.setText(str2);
      localRadioButton2 = this.aF;
      str3 = this.a.getText().toString();
      if (!TextUtils.isEmpty(str3)) {
        break label136;
      }
    }
    label136:
    Resources localResources2;
    int j;
    Object[] arrayOfObject2;
    for (String str4 = L();; str4 = localResources2.getString(j, arrayOfObject2))
    {
      localRadioButton2.setText(str4);
      return;
      Resources localResources1 = g();
      int i = aau.qx;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = M();
      arrayOfObject1[1] = N();
      arrayOfObject1[2] = str1;
      str2 = localResources1.getString(i, arrayOfObject1);
      break;
      localResources2 = g();
      j = aau.qw;
      arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = M();
      arrayOfObject2[1] = N();
      arrayOfObject2[2] = str3;
    }
  }
  
  final int K()
  {
    int i = this.aV.getCheckedRadioButtonId();
    if (i == aaw.gN) {
      return 1;
    }
    if (i == aaw.gP) {
      return 2;
    }
    if (i == aaw.gO) {
      return 3;
    }
    return 0;
  }
  
  public final void a(Cursor paramCursor)
  {
    String str1 = null;
    String str3;
    label48:
    String str2;
    int i;
    if (paramCursor.moveToFirst())
    {
      str3 = null;
      int j = paramCursor.getInt(4);
      switch (j)
      {
      default: 
        if (!paramCursor.moveToNext())
        {
          str2 = str3;
          i = j;
        }
        break;
      }
    }
    for (;;)
    {
      if (str2 != null)
      {
        this.ah = new gnb(new jgs(str2, i, str1, 1));
        a(str2, i, str1);
        this.at.setEnabled(false);
        TextOnlyAudienceView localTextOnlyAudienceView = this.at;
        if (localTextOnlyAudienceView.a != null) {
          localTextOnlyAudienceView.a.setVisibility(8);
        }
      }
      return;
      str1 = paramCursor.getString(2);
      str3 = paramCursor.getString(1);
      break label48;
      if (str3 != null) {
        break label48;
      }
      str1 = paramCursor.getString(2);
      str3 = paramCursor.getString(1);
      break label48;
      break;
      str1 = null;
      i = 0;
      str2 = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    this.ae = true;
    this.ad = true;
    super.a(paramBundle);
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("given_name_first")) {
        this.aR = paramBundle.getBoolean("given_name_first");
      }
      if (paramBundle.containsKey("more_options_visible")) {
        this.aS = paramBundle.getBoolean("more_options_visible");
      }
      if (paramBundle.containsKey("changed_more_options_visible")) {
        this.aB = paramBundle.getBoolean("changed_more_options_visible");
      }
      if (paramBundle.containsKey("name_violation")) {
        this.aY = paramBundle.getBoolean("name_violation");
      }
      return;
    }
    this.aY = this.m.getBoolean("name_violation", false);
  }
  
  protected final void a(String paramString)
  {
    b(paramString);
  }
  
  final void a(boolean paramBoolean)
  {
    View localView = this.aC;
    int i;
    Button localButton;
    if (paramBoolean)
    {
      i = 0;
      localView.setVisibility(i);
      this.aS = paramBoolean;
      localButton = this.aU;
      if (!paramBoolean) {
        break label50;
      }
    }
    label50:
    for (int j = aau.qB;; j = aau.qC)
    {
      localButton.setText(j);
      return;
      i = 8;
      break;
    }
  }
  
  final void b(boolean paramBoolean)
  {
    RadioGroup localRadioGroup = this.aV;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localRadioGroup.setVisibility(i);
      return;
    }
  }
  
  protected final void c(View paramView)
  {
    super.c(paramView);
    if (this.ac.size() == 0)
    {
      Runnable localRunnable = this.aG;
      efj.m().removeCallbacks(localRunnable);
      this.ax.setVisibility(8);
      this.ay.setVisibility(8);
    }
  }
  
  protected final void d(int paramInt)
  {
    if ((this.aY) && (paramInt == -1)) {
      f().setResult(-1);
    }
    super.d(paramInt);
  }
  
  protected final void d(View paramView)
  {
    super.d(paramView);
    if ((!this.aW) && (this.ac.size() > 0)) {
      b(g().getString(aau.qy));
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putBoolean("more_options_visible", this.aS);
    paramBundle.putBoolean("given_name_first", this.aR);
    paramBundle.putBoolean("changed_more_options_visible", this.aB);
    paramBundle.putBoolean("name_violation", this.aY);
    super.e(paramBundle);
  }
  
  public final void f_()
  {
    super.f_();
    this.aI.removeTextChangedListener(this.bb);
    this.aJ.removeTextChangedListener(this.bb);
    this.a.removeTextChangedListener(this.bc);
  }
  
  public final void m()
  {
    super.m();
    boolean bool = efj.B(this.bn);
    if (this.aT != bool)
    {
      this.aT = bool;
      if ((!this.aW) && (this.aX))
      {
        if (!this.aT) {
          break label61;
        }
        a(true);
        this.aU.setVisibility(8);
      }
    }
    label61:
    while (!TextUtils.isEmpty(this.a.getText().toString())) {
      return;
    }
    a(false);
    this.aU.setVisibility(0);
  }
  
  protected final byte[] v()
  {
    nwn localnwn = new nwn();
    localnwn.a = this.aI.getText().toString();
    localnwn.b = this.aJ.getText().toString();
    nwo localnwo = new nwo();
    int i = this.aV.getCheckedRadioButtonId();
    int j;
    if (i == aaw.gN) {
      j = 1;
    }
    for (;;)
    {
      localnwo.a = brn.d(j);
      nwp localnwp = new nwp();
      localnwp.a = this.a.getText().toString();
      cmw localcmw = new cmw(localnwn, localnwo, localnwp, this.aW, this.aX);
      Parcel localParcel = Parcel.obtain();
      localcmw.writeToParcel(localParcel, 0);
      byte[] arrayOfByte = localParcel.marshall();
      localParcel.recycle();
      return arrayOfByte;
      if (i == aaw.gP) {
        j = 2;
      } else if (i == aaw.gO) {
        j = 3;
      } else {
        j = 0;
      }
    }
  }
  
  protected final void w()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(this.ai, 0, this.ai.length);
    localParcel.setDataPosition(0);
    cmw localcmw = new cmw(localParcel);
    localParcel.recycle();
    this.aW = localcmw.d;
    this.aX = localcmw.e;
    if (localcmw.a != null)
    {
      if (!this.aW) {
        break label117;
      }
      this.aM = localcmw.a.c;
    }
    for (;;)
    {
      if (localcmw.b != null) {
        this.aA = brn.c(localcmw.b.a);
      }
      if (localcmw.c != null) {
        this.aQ = localcmw.c.a;
      }
      return;
      label117:
      this.aM = localcmw.a.a;
      this.aO = localcmw.a.b;
      if ((localcmw.a.c != null) && (this.aM != null)) {
        this.aR = localcmw.a.c.startsWith(this.aM);
      }
    }
  }
  
  protected final void x()
  {
    super.x();
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(this.aj, 0, this.aj.length);
    localParcel.setDataPosition(0);
    cmw localcmw = new cmw(localParcel);
    localParcel.recycle();
    if (localcmw.a != null)
    {
      if (!localcmw.d) {
        break label84;
      }
      this.aL = localcmw.a.c;
    }
    for (;;)
    {
      if (localcmw.c != null) {
        this.aP = localcmw.c.a;
      }
      return;
      label84:
      this.aL = localcmw.a.a;
      this.aN = localcmw.a.b;
      if ((localcmw.a.c != null) && (this.aL != null)) {
        this.aR = localcmw.a.c.startsWith(this.aL);
      }
    }
  }
  
  protected final void y()
  {
    super.y();
    this.aH = ((ViewGroup)a_(null).inflate(efj.wh, this.as, false));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.setMargins(aa, aa, aa, aa);
    this.as.addView(this.aH, localLayoutParams);
    this.aI = ((EditText)this.aH.findViewById(aaw.dR));
    this.aJ = ((EditText)this.aH.findViewById(aaw.dz));
    this.a = ((EditText)this.aH.findViewById(aaw.fQ));
    this.ax = ((TextView)this.aH.findViewById(aaw.dy));
    this.ay = this.aH.findViewById(aaw.dx);
    this.aV = ((RadioGroup)this.aH.findViewById(aaw.fw));
    this.aD = ((RadioButton)this.aH.findViewById(aaw.gN));
    this.aE = ((RadioButton)this.aH.findViewById(aaw.gP));
    this.aF = ((RadioButton)this.aH.findViewById(aaw.gO));
    this.aK = ((TextView)this.aH.findViewById(aaw.O));
    this.aC = this.aH.findViewById(aaw.fp);
    this.aU = ((Button)this.aH.findViewById(aaw.fR));
    if (this.aW)
    {
      this.aJ.setVisibility(8);
      this.aU.setVisibility(8);
      this.aI.setHint(aau.qA);
      this.aI.setText(this.aM);
      this.aJ.setText(this.aO);
      this.a.setText(this.aQ);
      J();
      if (!this.aR) {
        break label456;
      }
      this.aH.removeView(this.aI);
      this.aH.addView(this.aI, 0);
      label366:
      if (!this.aB) {
        break label482;
      }
      a(this.aS);
    }
    for (;;)
    {
      if (!this.aX)
      {
        this.aI.setEnabled(false);
        this.aJ.setEnabled(false);
        this.aK.setVisibility(0);
        a(true);
        this.aU.setVisibility(8);
      }
      return;
      this.aJ.setVisibility(0);
      this.aU.setVisibility(0);
      this.aI.setHint(aau.qz);
      break;
      label456:
      this.aH.removeView(this.aJ);
      this.aH.addView(this.aJ, 0);
      break label366;
      label482:
      if (!TextUtils.isEmpty(this.a.getText().toString()))
      {
        switch (this.aA)
        {
        }
        for (;;)
        {
          a(true);
          b(true);
          break;
          this.aD.setChecked(true);
          continue;
          this.aE.setChecked(true);
          continue;
          this.aF.setChecked(true);
        }
      }
      this.aD.setChecked(true);
    }
  }
  
  public final void z()
  {
    super.z();
    cmu localcmu1 = new cmu(this, this.aI);
    cmt localcmt1 = new cmt(this, this.aI, this.aL);
    localcmt1.onTextChanged(this.aI.getText(), 0, 0, 0);
    this.aI.addTextChangedListener(localcmu1);
    this.aI.addTextChangedListener(localcmt1);
    this.aI.addTextChangedListener(this.bb);
    if (this.aW) {
      return;
    }
    cmu localcmu2 = new cmu(this, this.aJ);
    cmt localcmt2 = new cmt(this, this.aJ, this.aN);
    localcmt2.onTextChanged(this.aJ.getText(), 0, 0, 0);
    this.aJ.addTextChangedListener(localcmu2);
    this.aJ.addTextChangedListener(localcmt2);
    this.aJ.addTextChangedListener(this.bb);
    cmt localcmt3 = new cmt(this, this.a, this.aP);
    localcmt3.onTextChanged(this.a.getText(), 0, 0, 0);
    this.a.addTextChangedListener(localcmt3);
    this.a.addTextChangedListener(this.bc);
    this.aU.setOnClickListener(this.ba);
    this.aD.setOnCheckedChangeListener(this.aZ);
    this.aE.setOnCheckedChangeListener(this.aZ);
    this.aF.setOnCheckedChangeListener(this.aZ);
    int i = this.aV.getCheckedRadioButtonId();
    cmy localcmy = new cmy(this, i);
    localcmy.onCheckedChanged(this.aV, i);
    this.aV.setOnCheckedChangeListener(localcmy);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnj
 * JD-Core Version:    0.7.0.1
 */