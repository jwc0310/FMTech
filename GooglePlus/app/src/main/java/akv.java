import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;

final class akv
  implements View.OnClickListener
{
  akv(akt paramakt, FilterParameter paramFilterParameter, int paramInt) {}
  
  public final void onClick(View paramView)
  {
    boolean bool = true;
    int i = Math.abs(this.a.getParameterInteger(9) - this.b);
    this.c.a(9, Integer.valueOf(i), bool);
    ToolButton localToolButton = this.c.c;
    if (i == this.b) {}
    for (;;)
    {
      localToolButton.setSelected(bool);
      return;
      bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akv
 * JD-Core Version:    0.7.0.1
 */