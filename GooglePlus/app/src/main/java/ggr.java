public class ggr
{
  float a;
  float b;
  float c;
  float d;
  
  public float a(boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = (paramFloat3 - paramFloat2) * this.d * this.c;
    if (paramBoolean) {
      f = -f;
    }
    return efj.a(f + paramFloat1, this.a, this.b);
  }
  
  public void a(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = (paramFloat2 - paramFloat1);
    this.d = (paramFloat3 / paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggr
 * JD-Core Version:    0.7.0.1
 */