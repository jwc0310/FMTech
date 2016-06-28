import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class lav
  implements CompoundButton.OnCheckedChangeListener
{
  lav(lau paramlau, um paramum) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.a.a(-1).setEnabled(true);
      return;
    }
    this.a.a(-1).setEnabled(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lav
 * JD-Core Version:    0.7.0.1
 */