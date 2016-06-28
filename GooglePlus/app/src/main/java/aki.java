import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.List;

final class aki
  implements View.OnTouchListener
{
  aki(ake paramake) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 2: 
    default: 
      return true;
    case 0: 
      paramView.setPressed(true);
      this.a.g(true);
      mbf localmbf = this.a.bn;
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(pjw.f);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(this.a.bn)).b(localmbf);
      return true;
    }
    paramView.setPressed(false);
    this.a.g(false);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aki
 * JD-Core Version:    0.7.0.1
 */