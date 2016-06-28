import android.transition.Transition;
import android.transition.Transition.TransitionListener;

final class cod
  implements Transition.TransitionListener
{
  cod(cob paramcob) {}
  
  public final void onTransitionCancel(Transition paramTransition) {}
  
  public final void onTransitionEnd(Transition paramTransition)
  {
    this.a.g = true;
    cob.a(this.a);
  }
  
  public final void onTransitionPause(Transition paramTransition) {}
  
  public final void onTransitionResume(Transition paramTransition) {}
  
  public final void onTransitionStart(Transition paramTransition) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cod
 * JD-Core Version:    0.7.0.1
 */