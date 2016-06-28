import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public final class hjg
  extends mca
{
  private hmu Z;
  int a;
  String b;
  gzj c;
  private String d;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if ((this.Z == null) || (this.Z.a == 0)) {
      throw new IllegalArgumentException("onCreateView of CollexionAbuseAppealFragment called with abuseInfo == null || abuseInfo.getAbuseState() == AbuseState.GOOD.");
    }
    View localView = LayoutInflater.from(this.bn).inflate(efj.HC, paramViewGroup, false);
    TextView localTextView1 = (TextView)localView.findViewById(efj.Hz);
    TextView localTextView2 = (TextView)localView.findViewById(efj.Hy);
    localTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    Button localButton = (Button)localView.findViewById(efj.HA);
    int i = this.Z.b;
    Object localObject1 = null;
    int j = 0;
    label136:
    int k;
    Object localObject2;
    switch (i)
    {
    default: 
      localButton.setVisibility(8);
      k = j;
      localObject2 = null;
    }
    for (;;)
    {
      if (k > 0) {
        localTextView1.setText(k);
      }
      localTextView2.setText((CharSequence)localObject1);
      if (localObject2 != null) {
        localButton.setOnClickListener((View.OnClickListener)localObject2);
      }
      return localView;
      int i1 = efj.HK;
      hji localhji = new hji(this);
      int i2;
      int i3;
      switch (this.Z.c)
      {
      default: 
        localObject1 = null;
        localObject2 = localhji;
        k = i1;
        break;
      case 0: 
        i2 = efj.HQ;
        i3 = efj.HW;
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        for (;;)
        {
          mbf localmbf2 = this.bn;
          int i4 = efj.HZ;
          Object[] arrayOfObject2 = new Object[6];
          arrayOfObject2[0] = this.d;
          arrayOfObject2[1] = this.bn.getString(i2);
          arrayOfObject2[2] = "https://www.google.com/intl/en/+/policy/content.html";
          arrayOfObject2[3] = this.bn.getString(i3);
          arrayOfObject2[4] = "http://support.google.com/plus";
          arrayOfObject2[5] = "http://support.google.com/plus?hl=en&p=manage_collections";
          localObject1 = (Spannable)efj.y(localmbf2.getString(i4, arrayOfObject2));
          break;
          i2 = efj.HP;
          i3 = efj.HV;
          continue;
          i2 = efj.HN;
          i3 = efj.HT;
          continue;
          i2 = efj.HM;
          i3 = efj.HS;
          continue;
          i2 = efj.HR;
          i3 = efj.HX;
          continue;
          i2 = efj.HO;
          i3 = efj.HU;
        }
        j = efj.HI;
        localObject1 = (Spannable)efj.y(this.bn.getString(efj.HH, new Object[] { "https://www.google.com/intl/en/+/policy/content.html" }));
        break label136;
        k = efj.HJ;
        localObject2 = new hji(this);
        switch (this.Z.c)
        {
        default: 
          localObject1 = null;
        }
        break;
      }
    }
    int m = efj.HW;
    for (;;)
    {
      mbf localmbf1 = this.bn;
      int n = efj.HE;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = this.d;
      arrayOfObject1[1] = "https://www.google.com/intl/en/+/policy/content.html";
      arrayOfObject1[2] = this.bn.getString(m);
      localObject1 = (Spannable)efj.y(localmbf1.getString(n, arrayOfObject1));
      break;
      m = efj.HV;
      continue;
      m = efj.HT;
      continue;
      m = efj.HS;
      continue;
      m = efj.HX;
      continue;
      m = efj.HU;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    if (localBundle == null) {
      throw new IllegalArgumentException("CollexionAbuseAppealFragment called without passing arguments.");
    }
    this.a = localBundle.getInt("account_id");
    this.Z = ((hmu)localBundle.getParcelable("collexion_abuse_info"));
    this.b = localBundle.getString("clx_id");
    this.d = localBundle.getString("clx_name");
    this.c = ((gzj)this.bo.a(gzj.class));
    gzj localgzj = this.c;
    hjh localhjh = new hjh(this);
    localgzj.a.add(localhjh);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjg
 * JD-Core Version:    0.7.0.1
 */