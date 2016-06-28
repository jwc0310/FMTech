import android.content.res.Resources;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class dro
  extends mca
  implements keo
{
  private ken a = new ken(this, this.bp);
  private kez b;
  
  public final void v()
  {
    this.b = new kez(this.bn);
    kez localkez = this.b;
    int i = aau.pC;
    CheckBoxPreference localCheckBoxPreference = localkez.c(g().getString(i), null);
    localCheckBoxPreference.d("stream_video_preference");
    localCheckBoxPreference.w = true;
    localCheckBoxPreference.a(Boolean.valueOf(true));
    localCheckBoxPreference.o = new drp(this);
    this.a.a.b(localCheckBoxPreference);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dro
 * JD-Core Version:    0.7.0.1
 */