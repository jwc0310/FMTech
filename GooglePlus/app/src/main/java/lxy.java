import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

public final class lxy
  extends LinkMovementMethod
{
  private static lxy a;
  private lxw b;
  
  public static lxy a()
  {
    if (a == null) {
      a = new lxy();
    }
    return a;
  }
  
  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if ((this.b != null) && ((i == 3) || (i == 1)))
    {
      this.b.a = false;
      this.b = null;
      Selection.removeSelection(paramSpannable);
    }
    if ((i == 1) || (i == 0))
    {
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      int m = j - paramTextView.getTotalPaddingLeft();
      int n = k - paramTextView.getTotalPaddingTop();
      int i1 = m + paramTextView.getScrollX();
      int i2 = n + paramTextView.getScrollY();
      Layout localLayout = paramTextView.getLayout();
      int i3 = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(i2), i1);
      ClickableSpan[] arrayOfClickableSpan = (ClickableSpan[])paramSpannable.getSpans(i3, i3, ClickableSpan.class);
      if (arrayOfClickableSpan.length != 0)
      {
        if (i == 1) {
          arrayOfClickableSpan[0].onClick(paramTextView);
        }
        for (;;)
        {
          return true;
          if (i == 0)
          {
            if ((arrayOfClickableSpan[0] instanceof lxw))
            {
              this.b = ((lxw)arrayOfClickableSpan[0]);
              this.b.a = true;
            }
            Selection.setSelection(paramSpannable, paramSpannable.getSpanStart(arrayOfClickableSpan[0]), paramSpannable.getSpanEnd(arrayOfClickableSpan[0]));
          }
        }
      }
      Selection.removeSelection(paramSpannable);
    }
    return super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxy
 * JD-Core Version:    0.7.0.1
 */