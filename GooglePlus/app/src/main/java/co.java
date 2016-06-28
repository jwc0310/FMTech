import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

public final class co
  extends Transition.EpicenterCallback
{
  private Rect a;
  
  public co(cq paramcq) {}
  
  public final Rect onGetEpicenter(Transition paramTransition)
  {
    if ((this.a == null) && (this.b.a != null)) {
      this.a = efj.a(this.b.a);
    }
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     co
 * JD-Core Version:    0.7.0.1
 */