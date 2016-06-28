import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.widget.Button;
import android.widget.CheckBox;

final class law
  implements DialogInterface.OnShowListener
{
  law(lau paramlau, CheckBox paramCheckBox) {}
  
  public final void onShow(DialogInterface paramDialogInterface)
  {
    ((um)paramDialogInterface).a(-1).setEnabled(this.a.isChecked());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     law
 * JD-Core Version:    0.7.0.1
 */