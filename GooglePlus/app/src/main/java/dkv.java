import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import com.google.android.apps.plus.service.DreamSettingsActivity;
import com.google.android.apps.plus.service.EsDreamService;

final class dkv
  implements View.OnClickListener
{
  dkv(dku paramdku, RadioButton paramRadioButton, int paramInt) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.isChecked()) {
      return;
    }
    dku localdku = this.c;
    int i = this.b;
    EsDreamService.a(localdku.a, i);
    localdku.b = EsDreamService.b(localdku.a, i);
    localdku.d = null;
    localdku.a(localdku.c, null);
    localdku.e.c().b(1, null, localdku.e.g);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkv
 * JD-Core Version:    0.7.0.1
 */