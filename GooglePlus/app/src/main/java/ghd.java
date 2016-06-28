import java.util.Locale;

public final class ghd
{
  public final float a;
  public final float b;
  public final float c;
  
  private ghd(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((paramFloat1 == 0.0F) && (paramFloat2 == 0.0F)) {
      throw new IllegalArgumentException("The values of a and b must not both be 0.");
    }
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
  }
  
  public ghd(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this(paramFloat4 - paramFloat2, paramFloat1 - paramFloat3, paramFloat1 * (paramFloat2 - paramFloat4) + paramFloat2 * (paramFloat3 - paramFloat1));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ghd)) {}
    ghd localghd;
    do
    {
      return false;
      localghd = (ghd)paramObject;
    } while ((this.a != localghd.a) || (this.b != localghd.b) || (this.c != localghd.c));
    return true;
  }
  
  public final int hashCode()
  {
    return 54 * Float.floatToIntBits(this.a) + 31 * Float.floatToIntBits(this.b) + Float.floatToIntBits(this.c);
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Float.valueOf(this.a);
    arrayOfObject[1] = Float.valueOf(this.b);
    arrayOfObject[2] = Float.valueOf(this.c);
    return String.format(localLocale, "{ a:%.1f, b:%.1f, c:%.1f }", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghd
 * JD-Core Version:    0.7.0.1
 */