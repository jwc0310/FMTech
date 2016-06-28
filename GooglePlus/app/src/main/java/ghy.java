import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;

final class ghy
{
  final TimeInterpolator a;
  final Path b;
  final float c;
  final float d;
  final float e;
  final float f;
  final float g;
  final long h;
  final long i;
  final long j;
  private PathMeasure k;
  
  ghy(TimeInterpolator paramTimeInterpolator, Path paramPath, long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramLong2 <= 0L) {
      throw new IllegalArgumentException("Duration must be a positive value.");
    }
    this.a = paramTimeInterpolator;
    this.b = new Path(paramPath);
    this.k = new PathMeasure(this.b, false);
    this.c = this.k.getLength();
    this.g = paramFloat3;
    this.d = paramFloat1;
    this.e = paramFloat2;
    this.f = (paramFloat2 - paramFloat1);
    this.i = paramLong1;
    this.h = paramLong2;
    this.j = (paramLong1 + paramLong2);
  }
  
  final PointF a(float paramFloat)
  {
    float[] arrayOfFloat = new float[2];
    this.k.getPosTan(paramFloat, arrayOfFloat, null);
    return new PointF(arrayOfFloat[0], arrayOfFloat[1]);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ghy localghy;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localghy = (ghy)paramObject;
    } while ((this.g == localghy.g) && (this.e == localghy.e) && (this.d == localghy.d) && (this.c == localghy.c) && (this.i == localghy.i) && (this.j == localghy.j));
    return false;
  }
  
  public final int hashCode()
  {
    int m;
    int i1;
    label39:
    int i2;
    if (this.c != 0.0F)
    {
      m = Float.floatToIntBits(this.c);
      int n = m * 31;
      if (this.d == 0.0F) {
        break label145;
      }
      i1 = Float.floatToIntBits(this.d);
      i2 = 31 * (i1 + n);
      if (this.e == 0.0F) {
        break label150;
      }
    }
    label145:
    label150:
    for (int i3 = Float.floatToIntBits(this.e);; i3 = 0)
    {
      int i4 = 31 * (i3 + i2);
      boolean bool = this.g < 0.0F;
      int i5 = 0;
      if (bool) {
        i5 = Float.floatToIntBits(this.g);
      }
      return 31 * (31 * (i4 + i5) + (int)(this.i ^ this.i >>> 32)) + (int)(this.j ^ this.j >>> 32);
      m = 0;
      break;
      i1 = 0;
      break label39;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghy
 * JD-Core Version:    0.7.0.1
 */