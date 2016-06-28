import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class kfy
  implements CompoundButton.OnCheckedChangeListener
{
  kfy(kfx paramkfx) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (!this.a.b(Boolean.valueOf(paramBoolean)))
    {
      if (!paramBoolean) {}
      for (boolean bool = true;; bool = false)
      {
        paramCompoundButton.setChecked(bool);
        return;
      }
    }
    this.a.a(paramBoolean);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfy
 * JD-Core Version:    0.7.0.1
 */