public enum gts
  implements pys
{
  private int d = 0;
  
  static
  {
    gts[] arrayOfgts = new gts[3];
    arrayOfgts[0] = a;
    arrayOfgts[1] = b;
    arrayOfgts[2] = c;
    e = arrayOfgts;
  }
  
  private gts(int paramInt)
  {
    this.d = paramInt;
  }
  
  public static gts a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Value is undefined for this oneof enum.");
    case 20: 
      return a;
    case 21: 
      return b;
    }
    return c;
  }
  
  public final int a()
  {
    return this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gts
 * JD-Core Version:    0.7.0.1
 */