public class gym
{
  public float a;
  public float b;
  public float c;
  public float d;
  public float e;
  public float f;
  public float g;
  public float h;
  
  public gym() {}
  
  private gym(gym paramgym)
  {
    this.a = paramgym.a;
    this.b = paramgym.b;
    this.c = paramgym.c;
    this.d = paramgym.d;
    this.e = paramgym.e;
    this.f = paramgym.f;
    this.g = paramgym.g;
    this.h = paramgym.h;
  }
  
  public final float a(float paramFloat)
  {
    if (paramFloat == 0.0F) {
      return this.a;
    }
    if (paramFloat == 1.0F) {
      return this.g;
    }
    float f1 = this.a;
    float f2 = f1 + paramFloat * (this.c - f1);
    float f3 = this.c;
    float f4 = f3 + paramFloat * (this.e - f3);
    float f5 = this.e;
    float f6 = f5 + paramFloat * (this.g - f5);
    float f7 = f2 + paramFloat * (f4 - f2);
    return f7 + paramFloat * (f4 + paramFloat * (f6 - f4) - f7);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gym
 * JD-Core Version:    0.7.0.1
 */