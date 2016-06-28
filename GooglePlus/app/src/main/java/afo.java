import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

final class afo
  implements View.OnTouchListener
{
  afo(afe paramafe) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (this.a.e != null) && (this.a.e.isShowing()) && (j >= 0) && (j < this.a.e.getWidth()) && (k >= 0) && (k < this.a.e.getHeight())) {
      this.a.q.postDelayed(this.a.p, 250L);
    }
    for (;;)
    {
      return false;
      if (i == 1) {
        this.a.q.removeCallbacks(this.a.p);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afo
 * JD-Core Version:    0.7.0.1
 */