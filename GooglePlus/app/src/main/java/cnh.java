import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;

final class cnh
  implements CompoundButton.OnCheckedChangeListener
{
  private final boolean a;
  
  public cnh(cna paramcna, boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      View localView1 = (View)paramCompoundButton.getTag();
      cna localcna = this.b;
      int i = localcna.as.getChildCount() - localcna.ap;
      for (int j = 0; j < i; j++)
      {
        View localView2 = this.b.as.getChildAt(j);
        if (localView2 != localView1) {
          ((CheckBox)localView2.findViewById(((cng)localView2.getTag()).e)).setChecked(false);
        }
      }
    }
    if (this.a == paramBoolean)
    {
      this.b.a(paramCompoundButton);
      return;
    }
    this.b.b(paramCompoundButton);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnh
 * JD-Core Version:    0.7.0.1
 */