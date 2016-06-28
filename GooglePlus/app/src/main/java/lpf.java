import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.libraries.social.stream.legacy.views.StreamAlbumViewGroup;

public final class lpf
  implements Animator.AnimatorListener
{
  public lpf(StreamAlbumViewGroup paramStreamAlbumViewGroup) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    switch (this.a.m)
    {
    case 2: 
    default: 
      return;
    case 1: 
      this.a.a(0);
      return;
    }
    this.a.a(2);
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpf
 * JD-Core Version:    0.7.0.1
 */