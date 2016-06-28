import android.view.View;
import android.view.View.OnClickListener;

public final class gxn
  implements View.OnClickListener
{
  private final View.OnClickListener a;
  
  public gxn(View.OnClickListener paramOnClickListener)
  {
    this.a = paramOnClickListener;
  }
  
  public final void onClick(View paramView)
  {
    gwz.a(paramView, 4);
    this.a.onClick(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxn
 * JD-Core Version:    0.7.0.1
 */