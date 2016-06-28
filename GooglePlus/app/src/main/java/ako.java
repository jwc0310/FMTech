import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.List;

final class ako
  implements View.OnTouchListener
{
  ako(akl paramakl) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 2: 
    default: 
      return true;
    case 0: 
      mbf localmbf = this.a.bn;
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(pjw.f);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(this.a.bn)).b(localmbf);
      paramView.setPressed(true);
      akl.a(this.a, true);
      return true;
    }
    paramView.setPressed(false);
    akl.a(this.a, false);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ako
 * JD-Core Version:    0.7.0.1
 */