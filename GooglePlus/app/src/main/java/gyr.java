import android.animation.Keyframe;

final class gyr
  extends gyn
  implements gys
{
  private float i;
  private float j;
  
  public gyr(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public final void a(Keyframe paramKeyframe1, Keyframe paramKeyframe2)
  {
    this.i = paramKeyframe1.getFraction();
    this.j = (paramKeyframe2.getFraction() - this.i);
  }
  
  public final float getInterpolation(float paramFloat)
  {
    return this.i + this.j * super.getInterpolation((paramFloat - this.i) / this.j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyr
 * JD-Core Version:    0.7.0.1
 */