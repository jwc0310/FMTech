import android.os.Build.VERSION;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class bxj
  implements CompoundButton.OnCheckedChangeListener
{
  bxj(bxg parambxg) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    this.a.c.e = paramBoolean;
    if (this.a.c.e) {}
    for (String str = this.a.ac;; str = this.a.ad)
    {
      if (Build.VERSION.SDK_INT >= 16) {
        paramCompoundButton.announceForAccessibility(str);
      }
      this.a.A();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxj
 * JD-Core Version:    0.7.0.1
 */