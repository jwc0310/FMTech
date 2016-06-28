import android.view.View;
import android.view.View.OnLongClickListener;

public final class gxo
  implements View.OnLongClickListener
{
  private final View.OnLongClickListener a;
  
  public gxo(View.OnLongClickListener paramOnLongClickListener)
  {
    this.a = paramOnLongClickListener;
  }
  
  public final boolean onLongClick(View paramView)
  {
    gwz.a(paramView, 31);
    return this.a.onLongClick(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxo
 * JD-Core Version:    0.7.0.1
 */