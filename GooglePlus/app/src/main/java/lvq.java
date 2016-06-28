import android.annotation.SuppressLint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;

final class lvq
  implements View.OnTouchListener
{
  private float a;
  private float b;
  
  lvq(lvp paramlvp) {}
  
  @SuppressLint({"ClickableViewAccessibility"})
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    if (!this.c.b(paramView)) {
      bool1 = false;
    }
    label351:
    do
    {
      do
      {
        return bool1;
        switch (paramMotionEvent.getAction())
        {
        default: 
          return false;
        case 0: 
          if (Log.isLoggable("SwipeToDismissHelper", 2))
          {
            String str8 = String.valueOf(this.c);
            new StringBuilder(25 + String.valueOf(str8).length()).append(str8).append("; MotionEvent.ACTION_DOWN");
          }
          lvp locallvp = this.c;
          if ((locallvp.c != null) && (locallvp.c.getTag(efj.ZV) == null))
          {
            if (Log.isLoggable("SwipeToDismissHelper", 2))
            {
              String str7 = String.valueOf(paramView);
              new StringBuilder(32 + String.valueOf(str7).length()).append(str7).append("; obtainListViewLock(): obtained");
            }
            locallvp.c.setTag(efj.ZV, paramView);
          }
          for (boolean bool4 = bool1;; bool4 = false)
          {
            if ((bool4) && (!this.c.e)) {
              break label351;
            }
            if (!Log.isLoggable("SwipeToDismissHelper", 2)) {
              break;
            }
            String str4 = String.valueOf(paramView);
            new StringBuilder(48 + String.valueOf(str4).length()).append(str4).append("; MotionEvent.ACTION_DOWN; couldn't obtain lock!");
            return bool1;
            if (Log.isLoggable("SwipeToDismissHelper", 2))
            {
              if ((locallvp.c != null) && (locallvp.e(paramView)))
              {
                String str6 = String.valueOf(paramView);
                new StringBuilder(40 + String.valueOf(str6).length()).append(str6).append("; obtainListViewLock(): already have it!");
              }
              String str5 = String.valueOf(paramView);
              new StringBuilder(31 + String.valueOf(str5).length()).append(str5).append("; obtainListViewLock(): denied!");
            }
          }
          this.a = paramMotionEvent.getX();
          this.c.d = false;
        case 3: 
          for (;;)
          {
            return false;
            if (Log.isLoggable("SwipeToDismissHelper", 2))
            {
              String str3 = String.valueOf(this.c);
              new StringBuilder(27 + String.valueOf(str3).length()).append(str3).append("; MotionEvent.ACTION_CANCEL");
            }
            if ((!this.c.e(paramView)) || (this.c.e)) {
              break;
            }
            lvp.a(this.c, paramView, 0.0F);
            lvp.a(this.c, paramView);
          }
        case 2: 
          if ((this.c.e(paramView)) && (!this.c.e)) {
            break label524;
          }
        }
      } while (!Log.isLoggable("SwipeToDismissHelper", 2));
      String str2 = String.valueOf(paramView);
      new StringBuilder(23 + String.valueOf(str2).length()).append(str2).append("; ACTION_MOVE(): denied");
      return bool1;
      float f6 = paramMotionEvent.getX() + lvp.b(this.c, paramView) - this.a;
      float f7 = Math.abs(f6);
      if ((!this.c.d) && (this.c.a(f6)))
      {
        if (f7 <= lvp.b) {
          break label661;
        }
        this.c.a(paramView, false);
        this.c.c.requestDisallowInterceptTouchEvent(bool1);
        paramView.setPressed(false);
        this.b = Math.signum(f6);
        this.c.d = bool1;
        this.c.f.a(bool1);
      }
      while (this.c.d)
      {
        lvp.a(this.c, paramView, f6);
        break;
        this.c.a(this.c.c);
      }
      if (Log.isLoggable("SwipeToDismissHelper", 2))
      {
        String str1 = String.valueOf(this.c);
        new StringBuilder(23 + String.valueOf(str1).length()).append(str1).append("; MotionEvent.ACTION_UP");
      }
    } while ((!this.c.e(paramView)) || (this.c.e));
    label524:
    label661:
    float f1;
    float f3;
    boolean bool2;
    if (this.c.d)
    {
      f1 = paramMotionEvent.getX() + lvp.b(this.c, paramView) - this.a;
      float f2 = Math.abs(f1);
      f3 = f2 / paramView.getWidth();
      if (f3 > 1.0F) {
        f3 = 1.0F;
      }
      if (f2 <= paramView.getWidth() / 4) {
        break label960;
      }
      if ((this.b == this.b) && (f3 > 0.25F)) {
        bool2 = bool1;
      }
    }
    for (;;)
    {
      label839:
      float f5;
      label865:
      boolean bool3;
      float f4;
      if (bool2)
      {
        gwz.a(paramView, 21);
        if (f1 < 0.0F)
        {
          f5 = -paramView.getWidth();
          bool3 = bool1;
          f4 = f5;
        }
      }
      for (;;)
      {
        long l = (int)(200.0F * (1.0F - f3));
        this.c.a(paramView, f4, l, bool3);
        paramMotionEvent.setAction(3);
        this.c.f.a(false);
        break;
        bool2 = false;
        break label839;
        f5 = paramView.getWidth();
        break label865;
        f3 = 1.0F - f3;
        f4 = 0.0F;
        bool3 = false;
      }
      lvp.a(this.c, paramView);
      break;
      label960:
      bool2 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvq
 * JD-Core Version:    0.7.0.1
 */