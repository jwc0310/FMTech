import android.widget.LinearLayout;
import android.widget.RadioGroup;

final class cnx
  extends cmy
{
  public cnx(cnv paramcnv, int paramInt)
  {
    super(paramcnv, paramInt);
  }
  
  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (paramInt == aaw.aa)
    {
      this.a.a.setVisibility(8);
      this.a.ax.a = 1;
      this.a.ax.b = 1;
    }
    for (;;)
    {
      super.onCheckedChanged(paramRadioGroup, paramInt);
      return;
      if (paramInt == aaw.jw)
      {
        this.a.a.setVisibility(0);
        this.a.ax.a = 1;
        this.a.ax.b = 2;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnx
 * JD-Core Version:    0.7.0.1
 */