import android.view.View;
import android.view.animation.Animation;
import java.util.Iterator;
import java.util.List;

final class beh
  extends dua
{
  beh(bef parambef) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    Iterator localIterator = this.a.a.iterator();
    while (localIterator.hasNext()) {
      ((View)localIterator.next()).setVisibility(8);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     beh
 * JD-Core Version:    0.7.0.1
 */