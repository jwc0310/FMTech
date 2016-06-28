import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

final class ls
  implements lp
{
  private final GestureDetector a;
  
  public ls(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    this.a = new GestureDetector(paramContext, paramOnGestureListener, paramHandler);
  }
  
  public final void a(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.a.setOnDoubleTapListener(paramOnDoubleTapListener);
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    return this.a.onTouchEvent(paramMotionEvent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ls
 * JD-Core Version:    0.7.0.1
 */