import android.widget.CompoundButton;
import java.util.Map;

final class cny
  extends cms
{
  public cny(cnv paramcnv, boolean paramBoolean)
  {
    super(paramcnv, paramBoolean);
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    String str = (String)paramCompoundButton.getTag();
    this.a.ay.put(str, Boolean.valueOf(paramBoolean));
    if ((this.a.ax.a == 1) && (this.a.ax.b == 2)) {
      super.onCheckedChanged(paramCompoundButton, paramBoolean);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cny
 * JD-Core Version:    0.7.0.1
 */