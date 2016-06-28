import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class cmy
  implements RadioGroup.OnCheckedChangeListener
{
  private final int a;
  
  public cmy(cmo paramcmo, int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (this.a == paramInt)
    {
      this.b.a(paramRadioGroup);
      return;
    }
    this.b.b(paramRadioGroup);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmy
 * JD-Core Version:    0.7.0.1
 */