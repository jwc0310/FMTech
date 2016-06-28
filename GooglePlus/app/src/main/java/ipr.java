import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.ArrayList;

public final class ipr
  extends mca
  implements gzi, keo
{
  CheckBoxPreference Z;
  CheckBoxPreference a;
  kej aa;
  gzj ab;
  ifj ac;
  private String[] ad = { "L20", "L30", "L40", "L50", "L60", "L70", "L80", "L90", "WL20", "WL30", "WL40", "WL50", "WL60", "WL70", "WL80", "WL90" };
  private String[] ae = { "high_speed", "standard_speed", "low_speed_network", "very_low_speed_network" };
  private CheckBoxPreference af;
  private ket ag;
  private ixf ah;
  private ken ai;
  private kez aj;
  kej b;
  kej c;
  kej d;
  
  public ipr()
  {
    gzj localgzj = new gzj(this, this.bp);
    localgzj.a.add(this);
    this.ab = localgzj;
    this.ai = new ken(this, this.bp);
  }
  
  final String a(String paramString)
  {
    if (paramString.equals("L20"))
    {
      int i15 = efj.Pa;
      return g().getString(i15);
    }
    if (paramString.equals("L30"))
    {
      int i14 = efj.Pb;
      return g().getString(i14);
    }
    if (paramString.equals("L40"))
    {
      int i13 = efj.Pc;
      return g().getString(i13);
    }
    if (paramString.equals("L50"))
    {
      int i12 = efj.Pd;
      return g().getString(i12);
    }
    if (paramString.equals("L60"))
    {
      int i11 = efj.Pe;
      return g().getString(i11);
    }
    if (paramString.equals("L70"))
    {
      int i10 = efj.Pf;
      return g().getString(i10);
    }
    if (paramString.equals("L80"))
    {
      int i9 = efj.Pg;
      return g().getString(i9);
    }
    if (paramString.equals("L90"))
    {
      int i8 = efj.Ph;
      return g().getString(i8);
    }
    if (paramString.equals("WL20"))
    {
      int i7 = efj.Pt;
      return g().getString(i7);
    }
    if (paramString.equals("WL30"))
    {
      int i6 = efj.Pu;
      return g().getString(i6);
    }
    if (paramString.equals("WL40"))
    {
      int i5 = efj.Pv;
      return g().getString(i5);
    }
    if (paramString.equals("WL50"))
    {
      int i4 = efj.Pw;
      return g().getString(i4);
    }
    if (paramString.equals("WL60"))
    {
      int i3 = efj.Px;
      return g().getString(i3);
    }
    if (paramString.equals("WL70"))
    {
      int i2 = efj.Py;
      return g().getString(i2);
    }
    if (paramString.equals("WL80"))
    {
      int i1 = efj.Pz;
      return g().getString(i1);
    }
    if (paramString.equals("WL90"))
    {
      int n = efj.PA;
      return g().getString(n);
    }
    if (paramString.equals("high_speed"))
    {
      int m = efj.OZ;
      return g().getString(m);
    }
    if (paramString.equals("standard_speed"))
    {
      int k = efj.Pp;
      return g().getString(k);
    }
    if (paramString.equals("low_speed_network"))
    {
      int j = efj.Pl;
      return g().getString(j);
    }
    if (paramString.equals("very_low_speed_network"))
    {
      int i = efj.Ps;
      return g().getString(i);
    }
    throw new InvalidParameterException("Value is not valid");
  }
  
  final void a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile != null) {
        for (int i = 0; i < arrayOfFile.length; i++) {
          a(arrayOfFile[i]);
        }
      }
    }
    paramFile.delete();
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    mbf localmbf = this.bn;
    int i = efj.OY;
    Toast.makeText(localmbf, g().getString(i), 0).show();
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ac = ((ifj)this.bo.a(ifj.class));
    this.ah = ((ixf)this.bo.a(ixf.class));
  }
  
  public final void v()
  {
    this.aj = new kez(this.bn);
    kez localkez1 = this.aj;
    int i = efj.OW;
    this.a = localkez1.c(g().getString(i), null);
    this.a.d("automatic_quality_key");
    CheckBoxPreference localCheckBoxPreference1 = this.a;
    mbf localmbf1 = this.bn;
    localCheckBoxPreference1.a(localmbf1.getSharedPreferences(String.valueOf(localmbf1.getPackageName()).concat("_preferences"), 0).getBoolean("automatic_quality_key", true));
    this.a.o = new ips(this);
    ken localken1 = this.ai;
    CheckBoxPreference localCheckBoxPreference2 = this.a;
    localken1.a.b(localCheckBoxPreference2);
    kez localkez2 = this.aj;
    int j = efj.Po;
    this.b = localkez2.g(g().getString(j), null);
    this.b.d("standard_quality_key");
    this.b.a = g().getStringArray(efj.OS);
    this.b.b = this.ad;
    mbf localmbf2 = this.bn;
    String str1 = localmbf2.getSharedPreferences(String.valueOf(localmbf2.getPackageName()).concat("_preferences"), 0).getString("standard_quality_key", "WL80");
    this.b.a_(a(str1));
    this.b.a("WL80");
    this.b.o = new ipt(this);
    ken localken2 = this.ai;
    kej localkej1 = this.b;
    localken2.a.b(localkej1);
    kez localkez3 = this.aj;
    int k = efj.Pk;
    this.c = localkez3.g(g().getString(k), null);
    this.c.d("low_quality_key");
    this.c.a = g().getStringArray(efj.OS);
    this.c.b = this.ad;
    mbf localmbf3 = this.bn;
    String str2 = localmbf3.getSharedPreferences(String.valueOf(localmbf3.getPackageName()).concat("_preferences"), 0).getString("low_quality_key", "WL60");
    this.c.a_(a(str2));
    this.c.a("WL60");
    this.c.o = new ipu(this);
    ken localken3 = this.ai;
    kej localkej2 = this.c;
    localken3.a.b(localkej2);
    kez localkez4 = this.aj;
    int m = efj.Pr;
    this.d = localkez4.g(g().getString(m), null);
    this.d.d("very_low_quality_key");
    this.d.a = g().getStringArray(efj.OS);
    this.d.b = this.ad;
    mbf localmbf4 = this.bn;
    String str3 = localmbf4.getSharedPreferences(String.valueOf(localmbf4.getPackageName()).concat("_preferences"), 0).getString("very_low_quality_key", "WL40");
    this.d.a_(a(str3));
    this.d.a("WL40");
    this.d.o = new ipv(this);
    ken localken4 = this.ai;
    kej localkej3 = this.d;
    localken4.a.b(localkej3);
    w();
    kez localkez5 = this.aj;
    int n = efj.Pn;
    this.af = localkez5.c(g().getString(n), null);
    this.af.d("overlay_key");
    CheckBoxPreference localCheckBoxPreference3 = this.af;
    mbf localmbf5 = this.bn;
    localCheckBoxPreference3.a(localmbf5.getSharedPreferences(String.valueOf(localmbf5.getPackageName()).concat("_preferences"), 0).getBoolean("overlay_key", false));
    ken localken5 = this.ai;
    CheckBoxPreference localCheckBoxPreference4 = this.af;
    localken5.a.b(localCheckBoxPreference4);
    kez localkez6 = this.aj;
    int i1 = efj.OX;
    this.ag = localkez6.a(g().getString(i1), null);
    this.ag.p = new ipw(this);
    ken localken6 = this.ai;
    ket localket = this.ag;
    localken6.a.b(localket);
    kez localkez7 = this.aj;
    int i2 = efj.Pm;
    PreferenceCategory localPreferenceCategory = localkez7.b(g().getString(i2));
    kez localkez8 = this.aj;
    int i3 = efj.OV;
    this.Z = localkez8.c(g().getString(i3), null);
    this.Z.d("automatic_network_key");
    CheckBoxPreference localCheckBoxPreference5 = this.Z;
    mbf localmbf6 = this.bn;
    localCheckBoxPreference5.a(localmbf6.getSharedPreferences(String.valueOf(localmbf6.getPackageName()).concat("_preferences"), 0).getBoolean("automatic_network_key", true));
    int i4 = efj.OU;
    String str4 = String.valueOf(g().getString(i4));
    String str5;
    String str7;
    label1028:
    kej localkej4;
    switch (this.ah.l())
    {
    default: 
      int i11 = efj.Pq;
      str5 = g().getString(i11);
      String str6 = String.valueOf(str5);
      if (str6.length() != 0)
      {
        str7 = str4.concat(str6);
        this.Z.a_(str7);
        this.Z.o = new ipy(this);
        localPreferenceCategory.b(this.Z);
        kez localkez9 = this.aj;
        int i6 = efj.Pm;
        this.aa = localkez9.g(g().getString(i6), null);
        this.aa.d("network_classification_key");
        this.aa.a = g().getStringArray(efj.OT);
        this.aa.b = this.ae;
        mbf localmbf7 = this.bn;
        String str8 = localmbf7.getSharedPreferences(String.valueOf(localmbf7.getPackageName()).concat("_preferences"), 0).getString("network_classification_key", "standard_speed");
        this.aa.a_(a(str8));
        this.aa.a("standard_speed");
        this.aa.o = new ipz(this);
        localkej4 = this.aa;
        if (this.Z.b) {
          break label1351;
        }
      }
      break;
    }
    label1351:
    for (boolean bool = true;; bool = false)
    {
      localkej4.b(bool);
      localPreferenceCategory.b(this.aa);
      return;
      int i10 = efj.Pq;
      str5 = g().getString(i10);
      break;
      int i9 = efj.OZ;
      str5 = g().getString(i9);
      break;
      int i8 = efj.Pp;
      str5 = g().getString(i8);
      break;
      int i7 = efj.Pl;
      str5 = g().getString(i7);
      break;
      int i5 = efj.Ps;
      str5 = g().getString(i5);
      break;
      str7 = new String(str4);
      break label1028;
    }
  }
  
  final void w()
  {
    boolean bool1 = true;
    kej localkej1 = this.b;
    boolean bool2;
    boolean bool3;
    label43:
    kej localkej3;
    if (!this.a.b)
    {
      bool2 = bool1;
      localkej1.b(bool2);
      kej localkej2 = this.c;
      if (this.a.b) {
        break label78;
      }
      bool3 = bool1;
      localkej2.b(bool3);
      localkej3 = this.d;
      if (this.a.b) {
        break label84;
      }
    }
    for (;;)
    {
      localkej3.b(bool1);
      return;
      bool2 = false;
      break;
      label78:
      bool3 = false;
      break label43;
      label84:
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ipr
 * JD-Core Version:    0.7.0.1
 */