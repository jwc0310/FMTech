public enum hch
{
  static
  {
    hch[] arrayOfhch = new hch[6];
    arrayOfhch[0] = a;
    arrayOfhch[1] = b;
    arrayOfhch[2] = c;
    arrayOfhch[3] = d;
    arrayOfhch[4] = e;
    arrayOfhch[5] = f;
    g = arrayOfhch;
  }
  
  private hch() {}
  
  public static hch a(int paramInt1, int paramInt2, long paramLong)
  {
    switch (paramInt1)
    {
    default: 
      return a;
    case 100: 
      if (paramInt2 == 1) {
        return c;
      }
      return b;
    case 200: 
      return b;
    case 300: 
      return f;
    }
    if (paramLong > 2000L) {
      return e;
    }
    return d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hch
 * JD-Core Version:    0.7.0.1
 */