import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.libraries.social.acl.TextOnlyAudienceView;
import java.util.ArrayList;

public final class cni
  extends cmo
{
  private int a;
  private nxc aA;
  private nxd aB;
  private nxd aC;
  private ViewGroup aD;
  private TextView aE;
  private ViewGroup aF;
  private RadioGroup aG;
  private CheckBox[] aH;
  private nwb ax;
  private nwb ay;
  private nxc az;
  
  private static int a(int paramInt)
  {
    int i = 2;
    switch (paramInt)
    {
    default: 
      i = 0;
    case 1001: 
    case 2001: 
    case 3000: 
      return i;
    case 1000: 
      return 1;
    case 1002: 
      return 3;
    case 2000: 
      return 0;
    case 2002: 
      return 3;
    case 2003: 
      return 4;
    case 2004: 
      return 5;
    case 2005: 
      return 6;
    case 2006: 
      return 7;
    case 2007: 
      return 8;
    case 2008: 
      return 9;
    case 2009: 
      return 10;
    case 3001: 
      return 3;
    case 3002: 
      return 4;
    }
    return 5;
  }
  
  private final CheckBox a(int paramInt1, int paramInt2)
  {
    CheckBox localCheckBox = new CheckBox(f());
    localCheckBox.setId(paramInt1);
    localCheckBox.setText(g().getString(paramInt2));
    this.aF.addView(localCheckBox);
    return localCheckBox;
  }
  
  private final void a(RadioGroup paramRadioGroup, int paramInt1, int paramInt2)
  {
    RadioButton localRadioButton = new RadioButton(f());
    localRadioButton.setId(paramInt1);
    localRadioButton.setText(g().getString(paramInt2));
    paramRadioGroup.addView(localRadioButton);
  }
  
  private static int b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 1: 
      return 1000;
    case 2: 
      return 1001;
    }
    return 1002;
  }
  
  protected final void A()
  {
    int i = 0;
    super.A();
    nxl localnxl = new nxl();
    localnxl.e = new nxv();
    switch (this.a)
    {
    }
    for (;;)
    {
      a(localnxl);
      return;
      localnxl.e.e = new nwb();
      localnxl.e.e.b = a(this.aG.getCheckedRadioButtonId());
      if (localnxl.e.e.b == -2147483648) {
        localnxl.e.e.b = 0;
      }
      this.ay.a = E();
      localnxl.e.e.a = this.ay.a;
      continue;
      localnxl.e.m = new nxc();
      ArrayList localArrayList = new ArrayList();
      while (i < this.aH.length)
      {
        if (this.aH[i].isChecked())
        {
          nxb localnxb = new nxb();
          localnxb.a = a(this.aH[i].getId());
          localArrayList.add(localnxb);
        }
        i++;
      }
      localnxl.e.m.b = ((nxb[])localArrayList.toArray(new nxb[localArrayList.size()]));
      this.aA.a = E();
      localnxl.e.m.a = this.aA.a;
      continue;
      localnxl.e.l = new nxd();
      localnxl.e.l.b = a(this.aG.getCheckedRadioButtonId());
      if (localnxl.e.l.b == -2147483648) {
        localnxl.e.l.b = 0;
      }
      this.aC.a = E();
      localnxl.e.l.a = this.aC.a;
    }
  }
  
  public final void a(Cursor paramCursor)
  {
    nwm localnwm1 = null;
    nwm localnwm2;
    gnb localgnb1;
    switch (this.a)
    {
    default: 
      localnwm2 = null;
      this.ah = gnb.a(a(localnwm2));
      localgnb1 = gnb.a(this.at.c);
      if ((localgnb1 != null) && (!localgnb1.b())) {
        break;
      }
    }
    for (gnb localgnb2 = gnb.a(a(localnwm1));; localgnb2 = localgnb1)
    {
      gnb localgnb3 = gnb.a(localgnb2);
      TextOnlyAudienceView localTextOnlyAudienceView = this.at;
      localTextOnlyAudienceView.g = true;
      ArrayList localArrayList = new ArrayList(localTextOnlyAudienceView.c);
      gnb localgnb4 = gnb.a(localTextOnlyAudienceView.c);
      jgs[] arrayOfjgs1 = localgnb4.c;
      jjd[] arrayOfjjd1 = localgnb4.b;
      lhp[] arrayOflhp1 = localgnb4.d;
      hps[] arrayOfhps1 = localgnb4.e;
      localTextOnlyAudienceView.c.clear();
      if (localgnb3 != null)
      {
        int i = localArrayList.size();
        int j = 0;
        for (;;)
        {
          if (j < i)
          {
            gnb localgnb6 = (gnb)localArrayList.get(j);
            if (localgnb3.b(localgnb6)) {
              localTextOnlyAudienceView.c.add(localgnb6);
            }
            j++;
            continue;
            localnwm2 = this.ax.a;
            localnwm1 = this.ay.a;
            break;
            localnwm2 = this.az.a;
            localnwm1 = this.aA.a;
            break;
            localnwm2 = this.aB.a;
            localnwm1 = this.aC.a;
            break;
          }
        }
        jgs[] arrayOfjgs2 = localgnb3.c;
        int k = arrayOfjgs2.length;
        int m = 0;
        if (m < k)
        {
          jgs localjgs = arrayOfjgs2[m];
          gnb localgnb5;
          if (!localjgs.a(arrayOfjgs1))
          {
            localgnb5 = new gnb(localjgs);
            if (localjgs.c != 9) {
              break label363;
            }
            localTextOnlyAudienceView.c.add(0, localgnb5);
          }
          for (;;)
          {
            m++;
            break;
            label363:
            localTextOnlyAudienceView.c.add(localgnb5);
          }
        }
        for (jjd localjjd : localgnb3.b) {
          if (!localjjd.a(arrayOfjjd1)) {
            localTextOnlyAudienceView.c.add(new gnb(localjjd));
          }
        }
        for (lhp locallhp : localgnb3.d) {
          if (!locallhp.a(arrayOflhp1)) {
            localTextOnlyAudienceView.c.add(new gnb(locallhp));
          }
        }
        for (hps localhps : localgnb3.e) {
          if (!localhps.a(arrayOfhps1)) {
            localTextOnlyAudienceView.c.add(new gnb(localhps));
          }
        }
      }
      localTextOnlyAudienceView.b();
      this.at.setEnabled(true);
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    this.a = this.m.getInt("profile_edit_view_type", -1);
    super.a(paramBundle);
  }
  
  protected final void w()
  {
    if (this.ai != null) {
      switch (this.a)
      {
      }
    }
    for (;;)
    {
      return;
      this.ay = null;
      try
      {
        nwb localnwb = new nwb();
        byte[] arrayOfByte3 = this.ai;
        this.ay = ((nwb)qat.b(localnwb, arrayOfByte3, 0, arrayOfByte3.length));
        label83:
        if (this.ay != null) {
          continue;
        }
        this.ay = new nwb();
        return;
        this.aA = null;
        try
        {
          nxc localnxc = new nxc();
          byte[] arrayOfByte2 = this.ai;
          this.aA = ((nxc)qat.b(localnxc, arrayOfByte2, 0, arrayOfByte2.length));
          label140:
          if (this.aA != null) {
            continue;
          }
          this.aA = new nxc();
          return;
          this.aC = null;
          try
          {
            nxd localnxd = new nxd();
            byte[] arrayOfByte1 = this.ai;
            this.aC = ((nxd)qat.b(localnxd, arrayOfByte1, 0, arrayOfByte1.length));
            label192:
            if (this.aC != null) {
              continue;
            }
            this.aC = new nxd();
            return;
          }
          catch (Exception localException1)
          {
            break label192;
          }
        }
        catch (Exception localException2)
        {
          break label140;
        }
      }
      catch (Exception localException3)
      {
        break label83;
      }
    }
  }
  
  protected final void x()
  {
    super.x();
    byte[] arrayOfByte1 = this.aj;
    Object localObject = null;
    if (arrayOfByte1 != null)
    {
      int i = this.a;
      localObject = null;
      switch (i)
      {
      }
    }
    for (;;)
    {
      if ((localObject != null) && (((nwm)localObject).a != null)) {
        this.ag = ((nwm)localObject).a.b;
      }
      return;
      this.ax = null;
      nwm localnwm;
      try
      {
        nwb localnwb = new nwb();
        byte[] arrayOfByte4 = this.aj;
        this.ax = ((nwb)qat.b(localnwb, arrayOfByte4, 0, arrayOfByte4.length));
        localnwm = this.ax.a;
        if (this.ax != null) {
          break label306;
        }
        this.ax = new nwb();
        localObject = localnwm;
      }
      catch (Exception localException3)
      {
        for (;;)
        {
          localnwm = null;
        }
      }
      this.az = null;
      try
      {
        nxc localnxc = new nxc();
        byte[] arrayOfByte3 = this.aj;
        this.az = ((nxc)qat.b(localnxc, arrayOfByte3, 0, arrayOfByte3.length));
        localObject = this.az.a;
        if (this.az != null) {
          continue;
        }
        this.az = new nxc();
        continue;
        this.aB = null;
        try
        {
          nxd localnxd = new nxd();
          byte[] arrayOfByte2 = this.aj;
          this.aB = ((nxd)qat.b(localnxd, arrayOfByte2, 0, arrayOfByte2.length));
          localObject = this.aB.a;
          if (this.aB != null) {
            continue;
          }
          this.aB = new nxd();
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            localObject = null;
          }
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localObject = null;
        }
      }
      label306:
      localObject = localnwm;
    }
  }
  
  protected final void y()
  {
    super.y();
    this.aD = ((ViewGroup)a_(null).inflate(efj.wg, this.as, false));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.setMargins(aa, aa, aa, aa);
    this.as.addView(this.aD, localLayoutParams);
    this.aE = ((TextView)this.aD.findViewById(aaw.lK));
    this.aF = ((ViewGroup)this.aD.findViewById(aaw.bf));
    Resources localResources = g();
    this.aD.setBackgroundDrawable(localResources.getDrawable(efj.oQ));
    this.aF.removeAllViews();
    int k;
    switch (this.a)
    {
    default: 
      k = 0;
    }
    for (;;)
    {
      int m;
      if (k != 0)
      {
        this.aE.setText(k);
        this.aE.setVisibility(0);
        return;
        m = aau.pF;
        this.aG = new RadioGroup(f());
        this.aG.setOrientation(1);
        this.aF.addView(this.aG);
        a(this.aG, 1000, aau.pH);
        a(this.aG, 1001, aau.pG);
        a(this.aG, 1002, aau.pI);
        if (this.ay.b != -2147483648) {}
        for (int i3 = b(this.ay.b);; i3 = 0)
        {
          RadioButton localRadioButton2 = (RadioButton)this.aG.findViewById(i3);
          if (localRadioButton2 == null) {
            break label938;
          }
          localRadioButton2.setChecked(true);
          k = m;
          break;
        }
        m = aau.pJ;
        CheckBox[] arrayOfCheckBox = new CheckBox[4];
        arrayOfCheckBox[0] = a(3000, aau.pL);
        arrayOfCheckBox[1] = a(3001, aau.pK);
        arrayOfCheckBox[2] = a(3002, aau.pN);
        arrayOfCheckBox[3] = a(3003, aau.pM);
        this.aH = arrayOfCheckBox;
        if (this.aA.b != null)
        {
          nxb[] arrayOfnxb = this.aA.b;
          int n = arrayOfnxb.length;
          int i1 = 0;
          if (i1 < n)
          {
            int i2;
            switch (arrayOfnxb[i1].a)
            {
            default: 
              i2 = 0;
            }
            for (;;)
            {
              CheckBox localCheckBox = (CheckBox)this.aF.findViewById(i2);
              if (localCheckBox != null) {
                localCheckBox.setChecked(true);
              }
              i1++;
              break;
              i2 = 3000;
              continue;
              i2 = 3001;
              continue;
              i2 = 3002;
              continue;
              i2 = 3003;
            }
          }
          k = m;
          continue;
          int i = aau.pO;
          this.aG = new RadioGroup(f());
          this.aG.setOrientation(1);
          this.aF.addView(this.aG);
          a(this.aG, 2000, aau.pW);
          a(this.aG, 2001, aau.pX);
          a(this.aG, 2002, aau.pT);
          a(this.aG, 2003, aau.pS);
          a(this.aG, 2004, aau.pU);
          a(this.aG, 2005, aau.pQ);
          a(this.aG, 2006, aau.pV);
          a(this.aG, 2007, aau.pY);
          a(this.aG, 2008, aau.pR);
          a(this.aG, 2009, aau.pP);
          int j;
          if (this.aC.b != -2147483648) {
            switch (this.aC.b)
            {
            case 1: 
            default: 
              j = 0;
            }
          }
          for (;;)
          {
            RadioButton localRadioButton1 = (RadioButton)this.aG.findViewById(j);
            if (localRadioButton1 != null) {
              localRadioButton1.setChecked(true);
            }
            k = i;
            break;
            j = 2000;
            continue;
            j = 2001;
            continue;
            j = 2002;
            continue;
            j = 2003;
            continue;
            j = 2004;
            continue;
            j = 2005;
            continue;
            j = 2006;
            continue;
            j = 2007;
            continue;
            j = 2008;
            continue;
            j = 2009;
            continue;
            j = 0;
          }
        }
      }
      else
      {
        this.aE.setVisibility(8);
        return;
      }
      label938:
      k = m;
    }
  }
  
  public final void z()
  {
    super.z();
    switch (this.a)
    {
    default: 
    case 10: 
    case 19: 
      int i;
      do
      {
        return;
        cmy localcmy2 = new cmy(this, b(this.ax.b));
        this.aG.setOnCheckedChangeListener(localcmy2);
        return;
        i = 0;
      } while (i >= this.aH.length);
      int j = a(this.aH[i].getId());
      nxb[] arrayOfnxb = this.az.b;
      int m;
      if (arrayOfnxb != null)
      {
        int k = arrayOfnxb.length;
        m = 0;
        label121:
        if (m < k) {
          if (arrayOfnxb[m].a != j) {}
        }
      }
      for (boolean bool = true;; bool = false)
      {
        cms localcms = new cms(this, bool);
        this.aH[i].setOnCheckedChangeListener(localcms);
        i++;
        break;
        m++;
        break label121;
      }
    }
    cmy localcmy1 = new cmy(this, b(this.aB.b));
    this.aG.setOnCheckedChangeListener(localcmy1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cni
 * JD-Core Version:    0.7.0.1
 */