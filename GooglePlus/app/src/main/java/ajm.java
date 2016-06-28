import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;

final class ajm
  implements View.OnClickListener
{
  ajm(ajj paramajj, FilterParameter paramFilterParameter) {}
  
  public final void onClick(View paramView)
  {
    boolean bool1 = this.b.a.isSelected();
    float f;
    ToolButton localToolButton;
    if (bool1)
    {
      f = this.a.b(12);
      this.b.a(12, Float.valueOf(f), true);
      localToolButton = this.b.a;
      if (bool1) {
        break label81;
      }
    }
    label81:
    for (boolean bool2 = true;; bool2 = false)
    {
      localToolButton.setSelected(bool2);
      return;
      f = this.a.c(12);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajm
 * JD-Core Version:    0.7.0.1
 */