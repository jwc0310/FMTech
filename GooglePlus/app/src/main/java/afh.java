import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;

final class afh
  extends zh
{
  boolean b;
  private boolean c;
  private boolean d;
  private sb e;
  
  public afh(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, aau.S);
    this.c = paramBoolean;
    setCacheColorHint(0);
  }
  
  protected final boolean a()
  {
    return (this.d) || (super.a());
  }
  
  public final boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = ms.a(paramMotionEvent);
    int k;
    boolean bool2;
    switch (i)
    {
    default: 
      k = 0;
    case 3: 
      for (bool2 = true;; bool2 = false)
      {
        label38:
        if ((!bool2) || (k != 0))
        {
          this.d = false;
          setPressed(false);
          drawableStateChanged();
        }
        if (!bool2) {
          break;
        }
        if (this.e == null) {
          this.e = new sb(this);
        }
        this.e.a(true);
        this.e.onTouch(this, paramMotionEvent);
        label105:
        return bool2;
        k = 0;
      }
    }
    for (boolean bool1 = false;; bool1 = true)
    {
      int j = paramMotionEvent.findPointerIndex(paramInt);
      if (j < 0)
      {
        k = 0;
        bool2 = false;
        break label38;
      }
      int m = (int)paramMotionEvent.getX(j);
      int n = (int)paramMotionEvent.getY(j);
      int i1 = pointToPosition(m, n);
      if (i1 == -1)
      {
        bool2 = bool1;
        k = 1;
        break label38;
      }
      View localView = getChildAt(i1 - getFirstVisiblePosition());
      float f1 = m;
      float f2 = n;
      this.d = true;
      setPressed(true);
      layoutChildren();
      setSelection(i1);
      Drawable localDrawable1 = getSelector();
      int i2;
      label248:
      float f3;
      float f4;
      if ((localDrawable1 != null) && (i1 != -1))
      {
        i2 = 1;
        if (i2 != 0) {
          localDrawable1.setVisible(false, false);
        }
        a(i1, localView);
        if (i2 != 0)
        {
          Rect localRect = this.a;
          f3 = localRect.exactCenterX();
          f4 = localRect.exactCenterY();
          if (getVisibility() != 0) {
            break label392;
          }
        }
      }
      label392:
      for (boolean bool3 = true;; bool3 = false)
      {
        localDrawable1.setVisible(bool3, false);
        gl.a.a(localDrawable1, f3, f4);
        Drawable localDrawable2 = getSelector();
        if ((localDrawable2 != null) && (i1 != -1)) {
          gl.a.a(localDrawable2, f1, f2);
        }
        a(false);
        refreshDrawableState();
        if (i != 1) {
          break;
        }
        performItemClick(localView, i1, getItemIdAtPosition(i1));
        break;
        i2 = 0;
        break label248;
      }
      if (this.e == null) {
        break label105;
      }
      this.e.a(false);
      return bool2;
    }
  }
  
  public final boolean hasFocus()
  {
    return (this.c) || (super.hasFocus());
  }
  
  public final boolean hasWindowFocus()
  {
    return (this.c) || (super.hasWindowFocus());
  }
  
  public final boolean isFocused()
  {
    return (this.c) || (super.isFocused());
  }
  
  public final boolean isInTouchMode()
  {
    return ((this.c) && (this.b)) || (super.isInTouchMode());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afh
 * JD-Core Version:    0.7.0.1
 */