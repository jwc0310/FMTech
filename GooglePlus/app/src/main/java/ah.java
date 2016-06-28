import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class ah<V extends View>
  extends aau
{
  private final to DA = new ai(this);
  private boolean Dy;
  private float Dz = 0.0F;
  tl a;
  agf b;
  int c = 2;
  float d = 0.5F;
  float e = 0.0F;
  float f = 0.5F;
  
  public final boolean a(V paramV, MotionEvent paramMotionEvent)
  {
    if (this.a != null)
    {
      this.a.b(paramV);
      return true;
    }
    return false;
  }
  
  public boolean a(q paramq, V paramV, MotionEvent paramMotionEvent)
  {
    switch (ms.a(paramMotionEvent))
    {
    case 2: 
    default: 
      if (paramq.a(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
        break;
      }
    }
    for (boolean bool = true;; bool = false)
    {
      this.Dy = bool;
      do
      {
        if (!this.Dy) {
          break;
        }
        return false;
      } while (!this.Dy);
      this.Dy = false;
      return false;
    }
    if (this.a == null)
    {
      to localto = this.DA;
      this.a = new tl(paramq.getContext(), paramq, localto);
    }
    return this.a.a(paramMotionEvent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ah
 * JD-Core Version:    0.7.0.1
 */