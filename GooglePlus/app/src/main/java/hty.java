import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class hty
  extends mca
  implements keo
{
  public boolean a;
  public boolean b;
  private ken c = new ken(this, this.bp);
  private kez d;
  
  private final void a(ArrayList<Map.Entry<String, String>> paramArrayList, kej paramkej, String paramString)
  {
    int i = 0;
    int j = paramArrayList.size();
    String[] arrayOfString1 = new String[j];
    String[] arrayOfString2 = new String[j];
    mbf localmbf = this.bn;
    String str = localmbf.getSharedPreferences(String.valueOf(localmbf.getPackageName()).concat("_preferences"), 0).getString(paramString, null);
    int k = 0;
    if (i < j)
    {
      Map.Entry localEntry = (Map.Entry)paramArrayList.get(i);
      arrayOfString1[i] = ((CharSequence)localEntry.getKey());
      arrayOfString2[i] = ((CharSequence)localEntry.getValue());
      if (!TextUtils.equals(str, arrayOfString2[i])) {
        break label177;
      }
    }
    label177:
    for (int m = i;; m = k)
    {
      i++;
      k = m;
      break;
      paramkej.a = arrayOfString1;
      paramkej.b = arrayOfString2;
      paramkej.a(k);
      paramkej.a_(arrayOfString1[k]);
      paramkej.o = new htz(this, paramString, paramkej);
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.a = paramBundle.getBoolean("state_show_apiary_pref");
      this.b = paramBundle.getBoolean("state_show_datamixer_pref");
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("state_show_apiary_pref", this.a);
    paramBundle.putBoolean("state_show_datamixer_pref", this.b);
  }
  
  public final void v()
  {
    this.d = new kez(this.bn);
    kez localkez1 = this.d;
    int i = efj.KJ;
    PreferenceCategory localPreferenceCategory = localkez1.a(g().getString(i));
    this.c.a.b(localPreferenceCategory);
    kej localkej2;
    String str4;
    String str6;
    label260:
    kej localkej1;
    ArrayList localArrayList1;
    if (this.a)
    {
      kez localkez3 = this.d;
      int m = efj.Ks;
      String str2 = g().getString(m);
      int n = efj.Kr;
      localkej2 = localkez3.g(str2, g().getString(n));
      localkej2.d("debug.plus.frontend.config");
      localkej2.a("");
      if (htx.a == null) {
        htx.a = new TreeMap();
      }
      ArrayList localArrayList2 = new ArrayList(htx.a.entrySet());
      kcf localkcf = (kcf)mbb.a(this.bn, kcf.class);
      if ((localkcf instanceof hto)) {
        localkcf = ((hto)localkcf).b;
      }
      String str3 = localkcf.a("plusi");
      str4 = String.valueOf("ADB Default - ");
      String str5 = String.valueOf(str3);
      if (str5.length() != 0)
      {
        str6 = str4.concat(str5);
        localArrayList2.add(0, new AbstractMap.SimpleEntry(str6, ""));
        a(localArrayList2, localkej2, "debug.plus.frontend.config");
        if (localPreferenceCategory == null) {
          break label395;
        }
        localPreferenceCategory.b(localkej2);
      }
    }
    else if (this.b)
    {
      kez localkez2 = this.d;
      int j = efj.Kq;
      String str1 = g().getString(j);
      int k = efj.Kp;
      localkej1 = localkez2.g(str1, g().getString(k));
      localkej1.d("debug.plus.datamixer.config");
      localkej1.a("www.googleapis.com/plusdatamixer/v1/");
      if (htn.a == null) {
        htn.a = new TreeMap();
      }
      localArrayList1 = new ArrayList(htn.a.entrySet());
      if (localPreferenceCategory == null) {
        break label411;
      }
      localPreferenceCategory.b(localkej1);
    }
    for (;;)
    {
      a(localArrayList1, localkej1, "debug.plus.datamixer.config");
      return;
      str6 = new String(str4);
      break;
      label395:
      this.c.a.b(localkej2);
      break label260;
      label411:
      this.c.a.b(localkej1);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hty
 * JD-Core Version:    0.7.0.1
 */