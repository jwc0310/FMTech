import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.social.ui.views.imagetextbutton.ImageTextButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class cnv
  extends cmo
  implements gzi
{
  LinearLayout a;
  private ofg aA;
  private oea aB;
  private boolean aC;
  private boolean aD;
  oea ax;
  Map<String, Boolean> ay;
  private RadioGroup az;
  
  private final void J()
  {
    int i = 0;
    if (this.aA != null)
    {
      Map localMap = a(this.aA.a, this.aB.c);
      this.a.removeAllViews();
      odk[] arrayOfodk = this.aA.a;
      int j = arrayOfodk.length;
      int k = 0;
      while (k < j)
      {
        odk localodk = arrayOfodk[k];
        CheckBox localCheckBox = new CheckBox(f());
        int m = i + 1;
        localCheckBox.setId(i);
        localCheckBox.setTag(String.valueOf(localodk.a.b.a));
        localCheckBox.setText(localodk.a.b.b.a);
        localCheckBox.setOnCheckedChangeListener(new cny(this, ((Boolean)localMap.get(localodk.a.b.a)).booleanValue()));
        localCheckBox.setChecked(((Boolean)this.ay.get(localodk.a.b.a)).booleanValue());
        if (Build.VERSION.SDK_INT >= 17) {
          localCheckBox.setTextAlignment(5);
        }
        this.a.addView(localCheckBox);
        k++;
        i = m;
      }
    }
  }
  
  private static int a(oea paramoea)
  {
    if ((paramoea.a == 1) && (paramoea.b == 2)) {
      return aaw.jw;
    }
    return aaw.aa;
  }
  
  private static Map<String, Boolean> a(odk[] paramArrayOfodk, String[] paramArrayOfString)
  {
    int i = 0;
    HashMap localHashMap;
    if (paramArrayOfodk == null) {
      localHashMap = new HashMap(0);
    }
    for (;;)
    {
      return localHashMap;
      localHashMap = new HashMap(paramArrayOfodk.length);
      int j = paramArrayOfodk.length;
      for (int k = 0; k < j; k++) {
        localHashMap.put(paramArrayOfodk[k].a.b.a, Boolean.valueOf(false));
      }
      if (paramArrayOfString != null)
      {
        int m = paramArrayOfString.length;
        while (i < m)
        {
          localHashMap.put(paramArrayOfString[i], Boolean.valueOf(true));
          i++;
        }
      }
    }
  }
  
  private static String[] a(Map<String, Boolean> paramMap)
  {
    if (paramMap == null) {
      return new String[0];
    }
    ArrayList localArrayList = new ArrayList(paramMap.entrySet().size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Boolean)localEntry.getValue()).booleanValue()) {
        localArrayList.add(localEntry.getKey());
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  protected final void A()
  {
    super.A();
    this.ax.c = a(this.ay);
    lgr locallgr = new lgr(this.bn, this.aw.c(), "save_settings", this.ax);
    gzj localgzj = (gzj)this.bo.a(gzj.class);
    localgzj.d.a(locallgr, false);
    localgzj.b(locallgr);
  }
  
  protected final byte[] D()
  {
    return this.aj;
  }
  
  public final void a(Bundle paramBundle)
  {
    this.ad = true;
    this.ae = true;
    super.a(paramBundle);
  }
  
  protected final void a(bru parambru)
  {
    if ((parambru == null) || (parambru.o == null) || (parambru.n == null))
    {
      this.aC = true;
      return;
    }
    if (this.ax == null)
    {
      if (this.aj == null) {
        break label67;
      }
      this.ai = this.aj;
      w();
    }
    for (;;)
    {
      this.aA = parambru.n;
      w();
      x();
      return;
      label67:
      this.ax = parambru.o;
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("save_settings".equals(paramString)) && (!hae.a(paramhae))) {
      d(-1);
    }
  }
  
  final void a(boolean paramBoolean)
  {
    int i = 0;
    int j = this.az.getChildCount();
    for (int k = 0; k < j; k++) {
      this.az.getChildAt(k).setEnabled(paramBoolean);
    }
    int m = this.a.getChildCount();
    while (i < m)
    {
      this.a.getChildAt(i).setEnabled(paramBoolean);
      i++;
    }
    if ((paramBoolean) && (this.ax.b == -2147483648)) {
      ((RadioButton)this.az.findViewById(aaw.aa)).setChecked(true);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    ((gzj)this.bo.a(gzj.class)).a.add(this);
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putParcelable("squares_data_proto", new hqw(this.aA));
    paramBundle.putBoolean("is_initialized_key", this.aD);
    super.e(paramBundle);
  }
  
  protected final void e(View paramView)
  {
    if (this.aC)
    {
      this.au.setEnabled(false);
      String str = this.bn.getString(aau.dQ);
      this.ar.setVisibility(8);
      View localView = paramView.findViewById(16908292);
      localView.setVisibility(0);
      TextView localTextView = (TextView)localView.findViewById(aaw.eA);
      localTextView.setText(str);
      localTextView.setVisibility(0);
      localView.findViewById(aaw.ez).setVisibility(8);
      return;
    }
    super.e(paramView);
  }
  
  public final boolean h(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.aA = ((ofg)((hqw)paramBundle.getParcelable("squares_data_proto")).a(new ofg()));
      this.aD = paramBundle.getBoolean("is_initialized_key");
    }
    while ((super.h(paramBundle)) && (this.aA != null))
    {
      return true;
      this.aA = ((ofg)hqv.a(new ofg(), this.m.getByteArray("squares_data_proto")));
    }
    return false;
  }
  
  protected final byte[] v()
  {
    this.ax.c = a(this.ay);
    return qat.a(this.ax);
  }
  
  protected final void w()
  {
    super.w();
    this.ax = ((oea)hqv.a(new oea(), this.ai));
    this.aB = ((oea)hqv.a(new oea(), this.aj));
  }
  
  protected final void y()
  {
    int i = 1;
    super.y();
    ViewGroup localViewGroup = (ViewGroup)a_(null).inflate(efj.wk, this.as, false);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.setMargins(aa, aa, aa, aa);
    this.as.addView(localViewGroup, localLayoutParams);
    CheckBox localCheckBox = (CheckBox)localViewGroup.findViewById(aaw.ka);
    this.az = ((RadioGroup)localViewGroup.findViewById(aaw.Z));
    this.a = ((LinearLayout)localViewGroup.findViewById(aaw.ki));
    TextView localTextView = (TextView)localViewGroup.findViewById(aaw.gd);
    String str1 = efj.a(this.bn, "plus_profile_tab", "https://support.google.com/plus/?hl=%locale%").toString();
    mbf localmbf = this.bn;
    int k = aau.rr;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = str1;
    String str2 = localmbf.getString(k, arrayOfObject);
    if (efj.aaz == null) {
      efj.aaz = new lwi();
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str2, null, efj.aaz));
    lxw.a(localSpannableStringBuilder, null, false);
    localTextView.setText(localSpannableStringBuilder);
    localTextView.setMovementMethod(lxy.a());
    oea localoea = this.ax;
    int m;
    if (localoea != null) {
      if (localoea.a == 2) {
        m = i;
      }
    }
    while (m == 0)
    {
      this.aC = i;
      return;
      if (localoea.a == i)
      {
        if (localoea.b == i)
        {
          m = i;
          continue;
        }
        if (localoea.b == 2)
        {
          if (localoea.c != null)
          {
            m = i;
            continue;
          }
          n = 0;
          continue;
        }
      }
      int n = 0;
    }
    this.ay = a(this.aA.a, this.ax.c);
    if ((!this.aD) && ((this.ax.a == 2) || (this.ax.b == i)))
    {
      Iterator localIterator = this.ay.entrySet().iterator();
      while (localIterator.hasNext()) {
        ((Map.Entry)localIterator.next()).setValue(Boolean.valueOf(i));
      }
      this.aD = i;
    }
    J();
    a(false);
    if (this.aB.a != 2)
    {
      int i1 = i;
      localCheckBox.setOnCheckedChangeListener(new cnw(this, i1));
      if (this.ax.a == 2) {
        break label517;
      }
    }
    for (;;)
    {
      localCheckBox.setChecked(i);
      this.az.setOnCheckedChangeListener(new cnx(this, a(this.aB)));
      this.az.check(a(this.ax));
      return;
      int i2 = 0;
      break;
      label517:
      int j = 0;
    }
  }
  
  protected final void z() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnv
 * JD-Core Version:    0.7.0.1
 */