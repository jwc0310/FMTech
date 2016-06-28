import android.os.Build.VERSION;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class bxl
  implements CompoundButton.OnCheckedChangeListener
{
  bxl(bxg parambxg) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    bxn localbxn = this.a.c;
    boolean bool;
    if (!paramBoolean)
    {
      bool = true;
      localbxn.f = bool;
      if (!this.a.c.f) {
        break label71;
      }
    }
    label71:
    for (String str = this.a.ad;; str = this.a.ac)
    {
      if (Build.VERSION.SDK_INT >= 16) {
        paramCompoundButton.announceForAccessibility(str);
      }
      this.a.B();
      return;
      bool = false;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxl
 * JD-Core Version:    0.7.0.1
 */