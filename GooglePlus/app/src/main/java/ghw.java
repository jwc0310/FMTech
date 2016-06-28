import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ghw
{
  final List<ghy> a;
  final int b;
  
  ghw(int paramInt, List<ghy> paramList)
  {
    if (paramList.isEmpty()) {
      throw new IllegalArgumentException("Cannot create an empty motion.");
    }
    this.b = paramInt;
    this.a = new ArrayList(paramList);
  }
  
  public final long a()
  {
    return ((ghy)this.a.get(0)).i;
  }
  
  final MotionEvent.PointerCoords a(long paramLong)
  {
    ghy localghy;
    if (paramLong <= a()) {
      localghy = (ghy)this.a.get(0);
    }
    for (;;)
    {
      float f2;
      if (paramLong <= localghy.i) {
        f2 = 0.0F;
      }
      for (;;)
      {
        PointF localPointF = localghy.a(efj.a(f2 * localghy.c, 0.0F, localghy.c));
        float f3 = localghy.d + f2 * localghy.f;
        MotionEvent.PointerCoords localPointerCoords = new MotionEvent.PointerCoords();
        localPointerCoords.x = localPointF.x;
        localPointerCoords.y = localPointF.y;
        localPointerCoords.touchMinor = f3;
        localPointerCoords.touchMajor = f3;
        localPointerCoords.pressure = (f3 / localghy.g);
        return localPointerCoords;
        if (paramLong >= b())
        {
          localghy = (ghy)this.a.get(-1 + this.a.size());
          break;
        }
        Iterator localIterator = this.a.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localghy = (ghy)localIterator.next();
        } while ((localghy.i > paramLong) || (paramLong > localghy.j));
        break;
        if (paramLong >= localghy.j)
        {
          f2 = 1.0F;
        }
        else
        {
          float f1 = (float)(paramLong - localghy.i) / (float)localghy.h;
          f2 = localghy.a.getInterpolation(f1);
        }
      }
      localghy = null;
    }
  }
  
  public final long b()
  {
    return ((ghy)this.a.get(-1 + this.a.size())).j;
  }
  
  final MotionEvent.PointerProperties c()
  {
    MotionEvent.PointerProperties localPointerProperties = new MotionEvent.PointerProperties();
    localPointerProperties.toolType = 1;
    localPointerProperties.id = this.b;
    return localPointerProperties;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ghw localghw;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localghw = (ghw)paramObject;
    } while ((this.b == localghw.b) && (this.a.equals(localghw.a)));
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * this.a.hashCode() + this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghw
 * JD-Core Version:    0.7.0.1
 */