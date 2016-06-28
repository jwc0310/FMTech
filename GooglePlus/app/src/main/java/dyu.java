import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.Scroller;
import com.google.android.apps.plus.views.PhotoViewPager;
import java.util.ArrayList;

public final class dyu
  implements Runnable
{
  public dyu(PhotoViewPager paramPhotoViewPager) {}
  
  public final void run()
  {
    int i;
    PhotoViewPager localPhotoViewPager;
    float f1;
    try
    {
      this.a.r.computeScrollOffset();
      i = this.a.r.getCurrX();
      if ((this.a.r.isFinished()) || (!this.a.m)) {
        break label395;
      }
      localPhotoViewPager = this.a;
      f1 = -(i - this.a.q);
      if (!localPhotoViewPager.m) {
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      if (Log.isLoggable("PhotoViewPager", 3))
      {
        String str = String.valueOf(localNullPointerException);
        new StringBuilder(23 + String.valueOf(str).length()).append("NPE when fake dragging\n").append(str);
      }
      this.a.e();
      return;
    }
    localPhotoViewPager.h = (f1 + localPhotoViewPager.h);
    float f2 = localPhotoViewPager.getScrollX() - f1;
    int j = localPhotoViewPager.getMeasuredWidth() - localPhotoViewPager.getPaddingLeft() - localPhotoViewPager.getPaddingRight();
    float f3 = j * localPhotoViewPager.e;
    float f4 = j * localPhotoViewPager.f;
    oh localoh1 = (oh)localPhotoViewPager.b.get(0);
    oh localoh2 = (oh)localPhotoViewPager.b.get(-1 + localPhotoViewPager.b.size());
    float f5;
    float f6;
    if (localoh1.b != 0)
    {
      f5 = localoh1.e * j;
      if (localoh2.b != -1 + localPhotoViewPager.c.b())
      {
        f6 = localoh2.e * j;
        break label424;
      }
    }
    for (;;)
    {
      label287:
      localPhotoViewPager.h += f5 - (int)f5;
      localPhotoViewPager.scrollTo((int)f5, localPhotoViewPager.getScrollY());
      localPhotoViewPager.e((int)f5);
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(localPhotoViewPager.n, l, 2, localPhotoViewPager.h, 0.0F, 0);
      localPhotoViewPager.k.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      this.a.q = i;
      this.a.postDelayed(this.a.s, 10L);
      return;
      label395:
      this.a.e();
      return;
      label424:
      do
      {
        f5 = f2;
        break label287;
        f6 = f4;
        break label424;
        f5 = f3;
        break;
        if (f2 < f5) {
          break label287;
        }
      } while (f2 <= f6);
      f5 = f6;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyu
 * JD-Core Version:    0.7.0.1
 */