import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.acl.TextOnlyAudienceView;
import java.util.ArrayList;

public final class cnz
  extends cmo
{
  private int a;
  private TextView aA;
  private EditText aB;
  private nxn ax;
  private nxn ay;
  private ViewGroup az;
  
  protected final void A()
  {
    super.A();
    this.ay.a = E();
    nxl localnxl = new nxl();
    switch (this.a)
    {
    }
    for (;;)
    {
      a(localnxl);
      return;
      localnxl.e = new nxv();
      localnxl.e.f = new nxn();
      localnxl.e.f.b = this.aB.getText().toString();
      localnxl.e.f.a = this.ay.a;
      continue;
      localnxl.e = new nxv();
      localnxl.e.o = new nxn();
      localnxl.e.o.b = this.aB.getText().toString();
      localnxl.e.o.a = this.ay.a;
      continue;
      localnxl.d = new nvn();
      localnxl.d.d = new nxn();
      localnxl.d.d.b = this.aB.getText().toString();
      localnxl.d.d.a = this.ay.a;
      continue;
      localnxl.e = new nxv();
      localnxl.e.k = new nxn();
      localnxl.e.k.b = this.aB.getText().toString();
      localnxl.e.k.a = this.ay.a;
    }
  }
  
  public final void a(Cursor paramCursor)
  {
    this.ah = gnb.a(a(this.ax.a));
    gnb localgnb1 = gnb.a(this.at.c);
    if ((localgnb1 == null) || (localgnb1.b())) {
      localgnb1 = gnb.a(a(this.ay.a));
    }
    gnb localgnb2 = gnb.a(localgnb1);
    TextOnlyAudienceView localTextOnlyAudienceView1 = this.at;
    localTextOnlyAudienceView1.g = true;
    ArrayList localArrayList = new ArrayList(localTextOnlyAudienceView1.c);
    gnb localgnb3 = gnb.a(localTextOnlyAudienceView1.c);
    jgs[] arrayOfjgs1 = localgnb3.c;
    jjd[] arrayOfjjd1 = localgnb3.b;
    lhp[] arrayOflhp1 = localgnb3.d;
    hps[] arrayOfhps1 = localgnb3.e;
    localTextOnlyAudienceView1.c.clear();
    if (localgnb2 != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        gnb localgnb5 = (gnb)localArrayList.get(j);
        if (localgnb2.b(localgnb5)) {
          localTextOnlyAudienceView1.c.add(localgnb5);
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
            break label267;
          }
          localTextOnlyAudienceView1.c.add(0, localgnb4);
        }
        for (;;)
        {
          m++;
          break;
          label267:
          localTextOnlyAudienceView1.c.add(localgnb4);
        }
      }
      for (jjd localjjd : localgnb2.b) {
        if (!localjjd.a(arrayOfjjd1)) {
          localTextOnlyAudienceView1.c.add(new gnb(localjjd));
        }
      }
      for (lhp locallhp : localgnb2.d) {
        if (!locallhp.a(arrayOflhp1)) {
          localTextOnlyAudienceView1.c.add(new gnb(locallhp));
        }
      }
      for (hps localhps : localgnb2.e) {
        if (!localhps.a(arrayOfhps1)) {
          localTextOnlyAudienceView1.c.add(new gnb(localhps));
        }
      }
    }
    localTextOnlyAudienceView1.b();
    switch (this.a)
    {
    default: 
      this.at.setEnabled(true);
      TextOnlyAudienceView localTextOnlyAudienceView3 = this.at;
      if (localTextOnlyAudienceView3.a != null) {
        localTextOnlyAudienceView3.a.setVisibility(0);
      }
      break;
    }
    TextOnlyAudienceView localTextOnlyAudienceView2;
    do
    {
      return;
      this.at.setEnabled(false);
      localTextOnlyAudienceView2 = this.at;
    } while (localTextOnlyAudienceView2.a == null);
    localTextOnlyAudienceView2.a.setVisibility(8);
  }
  
  public final void a(Bundle paramBundle)
  {
    this.a = this.m.getInt("profile_edit_view_type", -1);
    super.a(paramBundle);
  }
  
  protected final void w()
  {
    this.ay = null;
    if (this.ai != null) {}
    try
    {
      nxn localnxn = new nxn();
      byte[] arrayOfByte = this.ai;
      this.ay = ((nxn)qat.b(localnxn, arrayOfByte, 0, arrayOfByte.length));
      label40:
      if (this.ay == null) {
        this.ay = new nxn();
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
    this.ax = null;
    if (this.aj != null) {}
    for (;;)
    {
      try
      {
        nxn localnxn = new nxn();
        byte[] arrayOfByte = this.aj;
        this.ax = ((nxn)qat.b(localnxn, arrayOfByte, 0, arrayOfByte.length));
        localnwm = this.ax.a;
        if (this.ax == null) {
          this.ax = new nxn();
        }
        if ((localnwm != null) && (localnwm.a != null)) {
          this.ag = localnwm.a.b;
        }
        return;
      }
      catch (Exception localException) {}
      nwm localnwm = null;
    }
  }
  
  protected final void y()
  {
    super.y();
    this.az = ((ViewGroup)a_(null).inflate(efj.wl, this.as, false));
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.setMargins(aa, aa, aa, aa);
    this.as.addView(this.az, localLayoutParams);
    this.aA = ((TextView)this.az.findViewById(aaw.lK));
    this.aB = ((EditText)this.az.findViewById(aaw.cP));
    this.aB.setInputType(16433);
    this.aB.setSingleLine(false);
    this.aB.setGravity(48);
    Resources localResources = g();
    int j;
    int i;
    switch (this.a)
    {
    default: 
      j = 0;
      i = 0;
      if (i != 0)
      {
        this.aA.setText(i);
        this.aA.setVisibility(0);
      }
      break;
    }
    for (;;)
    {
      if (j != 0) {
        this.aB.setHint(j);
      }
      if (this.ay.b != null) {
        this.aB.setText(this.ay.b);
      }
      return;
      this.az.setBackgroundDrawable(localResources.getDrawable(efj.oS));
      i = aau.qe;
      j = aau.qf;
      break;
      this.az.setBackgroundDrawable(localResources.getDrawable(efj.oS));
      i = aau.qg;
      j = aau.qh;
      break;
      this.az.setBackgroundDrawable(localResources.getDrawable(efj.oR));
      i = aau.qb;
      j = aau.qc;
      break;
      this.az.setBackgroundDrawable(localResources.getDrawable(efj.oR));
      i = aau.pZ;
      j = aau.qa;
      break;
      this.aA.setVisibility(8);
    }
  }
  
  public final void z()
  {
    super.z();
    if (this.ax.b != null) {}
    for (String str = this.ax.b;; str = "")
    {
      cmt localcmt = new cmt(this, this.aB, str);
      localcmt.onTextChanged(this.aB.getText(), 0, 0, 0);
      this.aB.addTextChangedListener(localcmt);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnz
 * JD-Core Version:    0.7.0.1
 */