import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.libraries.social.collexions.impl.CollexionEditScrollView;

public final class hie
  extends GestureDetector.SimpleOnGestureListener
{
  public hie(CollexionEditScrollView paramCollexionEditScrollView) {}
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return Math.abs(paramFloat2) > Math.abs(paramFloat1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hie
 * JD-Core Version:    0.7.0.1
 */