import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.ScrollView;

final class kmc
  extends ScrollView
{
  final LinearLayout a;
  
  public kmc(kmb paramkmb, Context paramContext)
  {
    super(paramContext);
    setOverScrollMode(2);
    this.a = new LinearLayout(paramContext);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.a.setLayoutParams(localLayoutParams);
    this.a.setOrientation(1);
    addView(this.a);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
    {
      this.b.b.dismiss();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if ((paramMotionEvent.getAction() == 0) && ((i < 0) || (i >= this.b.b.getWidth()) || (j < 0) || (j >= this.b.b.getHeight())))
    {
      this.b.b.dismiss();
      return true;
    }
    if (paramMotionEvent.getAction() == 4)
    {
      this.b.b.dismiss();
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmc
 * JD-Core Version:    0.7.0.1
 */