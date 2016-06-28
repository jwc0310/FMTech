import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

final class htk
  implements View.OnClickListener
{
  htk(htj paramhtj) {}
  
  public final void onClick(View paramView)
  {
    htg localhtg = this.a.c;
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(aau.zI);
    localCheckBox.toggle();
    String str = (String)paramView.getTag();
    if (localCheckBox.isChecked())
    {
      localhtg.b.putBoolean(str, localCheckBox.isChecked());
      return;
    }
    localhtg.b.remove(str);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htk
 * JD-Core Version:    0.7.0.1
 */