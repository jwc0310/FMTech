import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import com.google.android.apps.plus.fragments.CirclesMultipleSelectFragment;

public final class bxr
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public bxr(CirclesMultipleSelectFragment paramCirclesMultipleSelectFragment, ViewTreeObserver paramViewTreeObserver) {}
  
  public final void onGlobalLayout()
  {
    if ((this.b.c.canScrollVertically(1)) || (this.b.c.canScrollVertically(-1)))
    {
      this.b.ae.setVisibility(0);
      this.b.af.setVisibility(0);
    }
    for (;;)
    {
      this.a.removeGlobalOnLayoutListener(this);
      return;
      this.b.ae.setVisibility(8);
      this.b.af.setVisibility(8);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxr
 * JD-Core Version:    0.7.0.1
 */