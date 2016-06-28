import android.view.MotionEvent;

public final class lyo
{
  public MotionEvent a;
  private final lze b;
  
  public lyo(lze paramlze)
  {
    this.b = paramlze;
  }
  
  private final void a(MotionEvent paramMotionEvent, int paramInt)
  {
    MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
    localMotionEvent.setAction(paramInt);
    this.b.a(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  public final void a()
  {
    if (this.a != null)
    {
      this.a.setAction(3);
      this.b.a(this.a);
      this.a.recycle();
      this.a = null;
    }
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i != 3)
    {
      int m = paramMotionEvent.getPointerCount();
      if ((i == 5) || (i == 0)) {
        m--;
      }
      int i1;
      if (this.a == null) {
        i1 = 0;
      }
      while (i1 < m)
      {
        if (i1 == 0)
        {
          a(paramMotionEvent, 0);
          i1++;
        }
        while (i1 < m)
        {
          a(paramMotionEvent, 0x5 | i1 << 8);
          i1++;
        }
        int n = this.a.getActionMasked();
        if (n == 3)
        {
          i1 = 0;
        }
        else
        {
          i1 = this.a.getPointerCount();
          if ((n == 6) || (n == 1)) {
            i1--;
          }
        }
      }
      if (i1 > m)
      {
        MotionEvent localMotionEvent = this.a;
        int i2 = Math.max(m, 1);
        while (i1 > i2)
        {
          i1--;
          a(localMotionEvent, 0x6 | i1 << 8);
        }
        if (m == 0) {
          a(localMotionEvent, 1);
        }
      }
    }
    int j = paramMotionEvent.getActionMasked();
    int k;
    if ((j == 1) || (j == 3))
    {
      k = 1;
      if (k == 0) {
        break label237;
      }
      b();
    }
    for (;;)
    {
      return this.b.a(paramMotionEvent);
      k = 0;
      break;
      label237:
      this.a = MotionEvent.obtain(paramMotionEvent);
    }
  }
  
  public final void b()
  {
    if (this.a != null)
    {
      this.a.recycle();
      this.a = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyo
 * JD-Core Version:    0.7.0.1
 */