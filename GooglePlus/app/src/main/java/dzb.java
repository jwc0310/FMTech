import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.AbsListView;
import com.google.android.apps.plus.views.ReadNotificationListView;

public final class dzb
  extends AnimatorListenerAdapter
{
  public dzb(ReadNotificationListView paramReadNotificationListView, boolean paramBoolean) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (this.a)
    {
      if (this.b.a != null)
      {
        this.b.a.clearAnimation();
        lwo.h(this.b.a);
        this.b.a.setAlpha(1.0F);
        if ((this.b.a instanceof AbsListView))
        {
          AbsListView localAbsListView = (AbsListView)this.b.a;
          localAbsListView.setSelection(-1 + localAbsListView.getCount());
        }
      }
      this.b.setVisibility(8);
      if (this.b.b != null) {
        this.b.b.A();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzb
 * JD-Core Version:    0.7.0.1
 */