import android.content.res.Resources;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class huc
  extends hts
{
  public final void v()
  {
    this.b = new kez(this.bn);
    kez localkez1 = this.b;
    int i = efj.KO;
    String str1 = g().getString(i);
    int j = efj.KP;
    CheckBoxPreference localCheckBoxPreference = localkez1.c(str1, g().getString(j));
    localCheckBoxPreference.a(Boolean.valueOf(false));
    localCheckBoxPreference.d("debug.plus.frontend.tracing");
    kea localkea1;
    if (0 == 0)
    {
      this.a.a.b(localCheckBoxPreference);
      kez localkez2 = this.b;
      int k = efj.KR;
      String str2 = g().getString(k);
      int m = efj.KQ;
      localkea1 = localkez2.f(str2, g().getString(m));
      localkea1.d("tracing_token_key");
      if (0 != 0) {
        break label243;
      }
      this.a.a.b(localkea1);
    }
    kea localkea2;
    for (;;)
    {
      kez localkez3 = this.b;
      int n = efj.KN;
      String str3 = g().getString(n);
      int i1 = efj.KM;
      localkea2 = localkez3.f(str3, g().getString(i1));
      localkea2.d("tracing_pattern_key");
      localkea2.a("");
      if (0 != 0) {
        break label253;
      }
      this.a.a.b(localkea2);
      return;
      null.b(localCheckBoxPreference);
      break;
      label243:
      null.b(localkea1);
    }
    label253:
    null.b(localkea2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     huc
 * JD-Core Version:    0.7.0.1
 */