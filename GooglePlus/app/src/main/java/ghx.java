import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class ghx
{
  final float a;
  final List<ghy> b;
  long c;
  float d;
  PointF e;
  private final int f;
  
  public ghx(int paramInt, float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("defaultRadius should be a positive value.");
    }
    this.f = paramInt;
    this.a = paramFloat;
    this.b = new ArrayList();
    this.d = paramFloat;
    this.e = new PointF(0.0F, 0.0F);
  }
  
  public ghx(ghw paramghw)
  {
    this.f = paramghw.b;
    this.b = new ArrayList(paramghw.a);
    ghy localghy = (ghy)this.b.get(-1 + this.b.size());
    this.a = localghy.g;
    this.c = localghy.j;
    this.d = localghy.e;
    this.e = localghy.a(localghy.c);
  }
  
  public final ghw a()
  {
    return new ghw(this.f, this.b);
  }
  
  public final ghx a(float paramFloat)
  {
    if (this.b.size() != 0) {
      throw new IllegalStateException("Cannot set initial position after the finger has already moved.");
    }
    this.d = paramFloat;
    return this;
  }
  
  public final ghx a(float paramFloat1, float paramFloat2)
  {
    if (this.b.size() != 0) {
      throw new IllegalStateException("Cannot set initial position after the finger has already moved.");
    }
    this.e.set(paramFloat1, paramFloat2);
    return this;
  }
  
  public final ghx a(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("Start time must be at the beginning of the gesture or in the future.");
    }
    if (this.b.size() > 0)
    {
      long l = paramLong - ((ghy)this.b.get(0)).i;
      for (int i = -1 + this.b.size(); i >= 0; i--)
      {
        List localList = this.b;
        ghy localghy = (ghy)this.b.get(i);
        localList.set(i, new ghy(localghy.a, localghy.b, l + localghy.i, localghy.h, localghy.d, localghy.e, localghy.g));
      }
      this.c = ((ghy)this.b.get(-1 + this.b.size())).j;
      return this;
    }
    this.c = paramLong;
    return this;
  }
  
  public final ghz a(float paramFloat1, float paramFloat2, long paramLong)
  {
    return b(paramFloat1 + this.e.x, paramFloat2 + this.e.y, paramLong);
  }
  
  public final ghz b(float paramFloat1, float paramFloat2, long paramLong)
  {
    Path localPath = new Path();
    localPath.moveTo(this.e.x, this.e.y);
    localPath.lineTo(paramFloat1, paramFloat2);
    return new ghz(this, localPath, paramLong, this.d);
  }
  
  public final ghz b(long paramLong)
  {
    float f1 = this.e.x;
    float f2 = this.e.y;
    Path localPath = new Path();
    localPath.moveTo(f1, f2);
    localPath.lineTo(f1 + 0.001F, 0.001F + f2);
    localPath.lineTo(f1, f2);
    return new ghz(this, localPath, paramLong, this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghx
 * JD-Core Version:    0.7.0.1
 */