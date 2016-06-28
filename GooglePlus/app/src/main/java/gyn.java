import android.animation.TimeInterpolator;

public class gyn
  extends gym
  implements TimeInterpolator
{
  public gyn(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.b = 0.0F;
    this.a = 0.0F;
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramFloat3;
    this.f = paramFloat4;
    this.h = 1.0F;
    this.g = 1.0F;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f1 = (paramFloat - this.a) / (this.g - this.a);
    float f5;
    if (f1 <= 0.0F) {
      f5 = 0.0F;
    }
    for (;;)
    {
      if (f5 == 0.0F)
      {
        return this.b;
        if (f1 >= 1.0F)
        {
          f5 = 1.0F;
          continue;
        }
        int i = 0;
        float f2 = 0.0F;
        float f3 = 1.0F;
        float f4 = 0.0F;
        if (i < 8)
        {
          f2 = a(f1);
          float f18 = (a(f1 + 1.0E-006F) - f2) / 1.0E-006F;
          if (Math.abs(f2 - paramFloat) < 1.0E-006F) {
            break label355;
          }
          if (Math.abs(f18) >= 1.0E-006F)
          {
            if (f2 < paramFloat) {
              f4 = f1;
            }
            for (;;)
            {
              float f19 = f1 - (f2 - paramFloat) / f18;
              i++;
              f1 = f19;
              break;
              f3 = f1;
            }
          }
        }
        f5 = f1;
        float f6 = f3;
        int j = 0;
        label160:
        if ((Math.abs(f2 - paramFloat) > 1.0E-006F) && (j < 8))
        {
          if (f2 >= paramFloat) {
            break label222;
          }
          float f9 = (f5 + f6) / 2.0F;
          float f10 = f5;
          f5 = f9;
          f4 = f10;
        }
        for (;;)
        {
          f2 = a(f5);
          j++;
          break label160;
          break;
          label222:
          float f7 = (f5 + f4) / 2.0F;
          float f8 = f5;
          f5 = f7;
          f6 = f8;
        }
      }
      else
      {
        if (f5 == 1.0F) {
          return this.h;
        }
        float f11 = this.b;
        float f12 = f11 + f5 * (this.d - f11);
        float f13 = this.d;
        float f14 = f13 + f5 * (this.f - f13);
        float f15 = this.f;
        float f16 = f15 + f5 * (this.h - f15);
        float f17 = f12 + f5 * (f14 - f12);
        return f17 + f5 * (f14 + f5 * (f16 - f14) - f17);
      }
      label355:
      f5 = f1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyn
 * JD-Core Version:    0.7.0.1
 */