import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.google.android.apps.plus.service.DreamSettingsActivity;
import com.google.android.apps.plus.service.EsDreamService;
import java.util.Set;

final class dkw
  implements View.OnClickListener
{
  dkw(dku paramdku, String paramString) {}
  
  public final void onClick(View paramView)
  {
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(aaw.df);
    boolean bool;
    if (!localCheckBox.isChecked())
    {
      bool = true;
      localCheckBox.setChecked(bool);
      if (!localCheckBox.isChecked()) {
        break label111;
      }
      this.b.b.add(this.a);
    }
    for (;;)
    {
      DreamSettingsActivity localDreamSettingsActivity = this.b.e;
      int i = EsDreamService.a(this.b.e);
      Set localSet = this.b.b;
      EsDreamService.c(localDreamSettingsActivity, i).edit().putStringSet("selected_clusters", localSet).apply();
      return;
      bool = false;
      break;
      label111:
      this.b.b.remove(this.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkw
 * JD-Core Version:    0.7.0.1
 */