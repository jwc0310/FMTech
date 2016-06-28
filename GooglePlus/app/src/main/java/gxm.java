import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public final class gxm
  implements CompoundButton.OnCheckedChangeListener
{
  private final CompoundButton.OnCheckedChangeListener a;
  private final gxq b;
  private final gxq c;
  
  public gxm(gxq paramgxq1, gxq paramgxq2, CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    this.a = paramOnCheckedChangeListener;
    this.b = paramgxq1;
    this.c = paramgxq2;
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramCompoundButton.isChecked()) {
      efj.a(paramCompoundButton, this.b);
    }
    for (;;)
    {
      gwz.a(paramCompoundButton, 4);
      this.a.onCheckedChanged(paramCompoundButton, paramBoolean);
      return;
      efj.a(paramCompoundButton, this.c);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxm
 * JD-Core Version:    0.7.0.1
 */