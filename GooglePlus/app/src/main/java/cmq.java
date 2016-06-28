import android.animation.LayoutTransition;
import android.animation.LayoutTransition.TransitionListener;
import android.view.View;
import android.view.ViewGroup;

final class cmq
  implements LayoutTransition.TransitionListener
{
  cmq(cmo paramcmo) {}
  
  public final void endTransition(LayoutTransition paramLayoutTransition, ViewGroup paramViewGroup, View paramView, int paramInt)
  {
    if ((paramInt == 2) || (paramInt == 3)) {
      this.a.z();
    }
  }
  
  public final void startTransition(LayoutTransition paramLayoutTransition, ViewGroup paramViewGroup, View paramView, int paramInt) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmq
 * JD-Core Version:    0.7.0.1
 */