import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.plus.notifications.ui.GunsListView;

final class cwb
  extends AnimatorListenerAdapter
{
  cwb(cvz paramcvz, View paramView) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    cvu localcvu = this.b.a;
    View localView1 = this.a;
    if (cvu.a(localcvu.e, localView1))
    {
      int i = localcvu.e.getPositionForView(localView1);
      if (i != -1)
      {
        localcvu.remove(localcvu.getItem(i));
        localcvu.notifyDataSetChanged();
        localcvu.a.onClick(localView1);
      }
    }
    View localView2 = this.a;
    String str = this.a.getResources().getString(efj.At);
    if (Build.VERSION.SDK_INT >= 16) {
      localView2.announceForAccessibility(str);
    }
    this.b.e = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwb
 * JD-Core Version:    0.7.0.1
 */