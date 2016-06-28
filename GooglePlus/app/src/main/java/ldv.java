import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class ldv
  implements CompoundButton.OnCheckedChangeListener
{
  ldv(ldu paramldu) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a.Z.setChecked(true);
    }
    this.a.v();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldv
 * JD-Core Version:    0.7.0.1
 */