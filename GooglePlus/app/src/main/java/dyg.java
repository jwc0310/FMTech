import android.view.View;
import android.view.View.OnClickListener;

public final class dyg
  implements View.OnClickListener, jer<atu>
{
  public View.OnClickListener a;
  private final View.OnClickListener b;
  private boolean c = false;
  
  public dyg(View.OnClickListener paramOnClickListener)
  {
    this.b = paramOnClickListener;
  }
  
  public final void onClick(View paramView)
  {
    if (this.c) {
      this.b.onClick(paramView);
    }
    while (this.a == null) {
      return;
    }
    this.a.onClick(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyg
 * JD-Core Version:    0.7.0.1
 */