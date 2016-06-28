import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class cns
  implements CompoundButton.OnCheckedChangeListener
{
  cns(cnq paramcnq) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      cnq.a(this.a);
      cnq.b(this.a);
      this.a.b(true);
      return;
    }
    cnq.c(this.a);
    int i = this.a.ay.getChildCount();
    for (int j = 0; j < i; j++) {
      ((CheckBox)this.a.ay.getChildAt(j)).setChecked(false);
    }
    this.a.b(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cns
 * JD-Core Version:    0.7.0.1
 */