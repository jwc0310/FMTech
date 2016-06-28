import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.libraries.social.settings.LabelPreference;
import java.io.File;
import org.chromium.net.HttpUrlRequestFactory;

final class htw
  implements key
{
  htw(htv paramhtv) {}
  
  public final boolean a(ket paramket)
  {
    mbf localmbf1 = this.a.bn;
    SharedPreferences localSharedPreferences = localmbf1.getSharedPreferences(String.valueOf(localmbf1.getPackageName()).concat("_preferences"), 0);
    boolean bool;
    label147:
    LabelPreference localLabelPreference;
    if (!localSharedPreferences.getBoolean("net_netlogs_key", false))
    {
      bool = true;
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      if (!bool) {
        break label200;
      }
      mbf localmbf3 = this.a.bn;
      String str3 = String.valueOf(localmbf3.getCacheDir());
      File localFile = new File(12 + String.valueOf(str3).length() + str3 + "/cronetdebug");
      ixd.a = localFile;
      localFile.mkdirs();
      ixd.a(localmbf3).a(String.valueOf(ixd.a.getPath()).concat("/cronet_logfile"), false);
      localEditor.putBoolean("net_netlogs_key", bool);
      localEditor.commit();
      localLabelPreference = this.a.a;
      if (!bool) {
        break label269;
      }
    }
    label269:
    for (String str2 = "ON";; str2 = "OFF")
    {
      localLabelPreference.a(str2);
      return true;
      bool = false;
      break;
      label200:
      mbf localmbf2 = this.a.bn;
      ixd.a(localmbf2).c();
      String str1 = String.valueOf(localmbf2.getCacheDir());
      new File(27 + String.valueOf(str1).length() + str1 + "/cronetdebug/cronet_logfile");
      break label147;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htw
 * JD-Core Version:    0.7.0.1
 */