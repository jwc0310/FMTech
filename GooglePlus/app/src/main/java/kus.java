import java.util.Arrays;

public final class kus
  extends gxq
{
  public final int b;
  public final int c;
  
  public kus(gxt paramgxt, int paramInt1, int paramInt2)
  {
    super(paramgxt);
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = super.equals(paramObject);
    boolean bool2 = false;
    if (bool1)
    {
      kus localkus = (kus)paramObject;
      int i = this.b;
      int j = localkus.b;
      bool2 = false;
      if (i == j)
      {
        int k = this.c;
        int m = localkus.c;
        bool2 = false;
        if (k == m) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.c);
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(super.hashCode());
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kus
 * JD-Core Version:    0.7.0.1
 */