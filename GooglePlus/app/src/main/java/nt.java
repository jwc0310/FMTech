import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

public final class nt
  implements View.OnApplyWindowInsetsListener
{
  public nt(nb paramnb) {}
  
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    pk localpk = new pk(paramWindowInsets);
    return ((pk)this.a.a(paramView, localpk)).a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nt
 * JD-Core Version:    0.7.0.1
 */