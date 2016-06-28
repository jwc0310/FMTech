import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

final class afk
  implements Runnable
{
  afk(afi paramafi) {}
  
  public final void run()
  {
    afi localafi = this.a;
    localafi.d();
    View localView = localafi.a;
    if ((!localView.isEnabled()) || (localView.isLongClickable())) {}
    while (!localafi.b()) {
      return;
    }
    localView.getParent().requestDisallowInterceptTouchEvent(true);
    long l = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    localView.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
    localafi.b = true;
    localafi.c = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afk
 * JD-Core Version:    0.7.0.1
 */