import android.graphics.Rect;
import android.view.MotionEvent;

public final class ghu
{
  public final float a;
  public final float b;
  public final float c;
  public final int d;
  public final long e;
  
  public ghu(MotionEvent paramMotionEvent, int paramInt)
  {
    this.e = paramMotionEvent.getEventTime();
    this.a = paramMotionEvent.getX(paramInt);
    this.b = paramMotionEvent.getY(paramInt);
    this.c = paramMotionEvent.getTouchMinor(paramInt);
    if ((paramMotionEvent.getActionMasked() == 6) && (paramMotionEvent.getActionIndex() == paramInt))
    {
      this.d = 1;
      return;
    }
    this.d = paramMotionEvent.getActionMasked();
  }
  
  public final Rect a(int paramInt1, int paramInt2)
  {
    return new Rect((int)Math.floor(this.a + paramInt1 - this.c), (int)Math.floor(this.b + paramInt2 - this.c), (int)Math.ceil(this.a + paramInt1 + this.c), (int)Math.ceil(this.b + paramInt2 + this.c));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghu
 * JD-Core Version:    0.7.0.1
 */