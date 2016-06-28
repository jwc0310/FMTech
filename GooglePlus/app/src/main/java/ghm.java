import android.graphics.RectF;
import android.view.MotionEvent;

public final class ghm
  implements ghn
{
  public Integer a;
  public final RectF b = new RectF();
  private final ghn d;
  private final boolean e;
  
  public ghm(ghn paramghn, boolean paramBoolean)
  {
    this.d = paramghn;
    this.e = true;
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    if (this.b.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
      return this.d.a(paramMotionEvent);
    }
    if ((this.a != null) && (paramMotionEvent.getDeviceId() == this.a.intValue())) {
      return this.d.a(paramMotionEvent);
    }
    return this.e;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghm
 * JD-Core Version:    0.7.0.1
 */