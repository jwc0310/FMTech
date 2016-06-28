import android.animation.LayoutTransition;
import android.animation.LayoutTransition.TransitionListener;
import android.view.View;
import android.view.ViewGroup;

final class cnu
  implements LayoutTransition.TransitionListener
{
  cnu(cnt paramcnt) {}
  
  public final void endTransition(LayoutTransition paramLayoutTransition, ViewGroup paramViewGroup, View paramView, int paramInt)
  {
    this.a.a.a(true);
    paramLayoutTransition.removeTransitionListener(this);
  }
  
  public final void startTransition(LayoutTransition paramLayoutTransition, ViewGroup paramViewGroup, View paramView, int paramInt) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnu
 * JD-Core Version:    0.7.0.1
 */