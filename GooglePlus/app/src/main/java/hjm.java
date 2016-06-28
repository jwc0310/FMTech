import android.app.AlertDialog;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class hjm
  implements CompoundButton.OnCheckedChangeListener
{
  hjm(hjl paramhjl, AlertDialog paramAlertDialog) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    this.a.getButton(-1).setEnabled(paramBoolean);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjm
 * JD-Core Version:    0.7.0.1
 */