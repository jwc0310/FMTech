import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.libraries.social.settings.CheckBoxPreference;

public final class keq
  implements CompoundButton.OnCheckedChangeListener
{
  public keq(kep paramkep, CheckBoxPreference paramCheckBoxPreference) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    kex localkex = this.a.o;
    if ((localkex == null) || (localkex.a(this.a, Boolean.valueOf(paramBoolean)))) {
      this.a.a(paramBoolean);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     keq
 * JD-Core Version:    0.7.0.1
 */