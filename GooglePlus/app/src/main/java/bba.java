import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class bba
  implements View.OnTouchListener
{
  bba(baw parambaw) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if (((i == 1) || (i == 3)) && (this.a.c))
    {
      this.a.c = false;
      this.a.a(false, true);
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bba
 * JD-Core Version:    0.7.0.1
 */