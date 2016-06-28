import java.util.Arrays;

public final class kvf
{
  public final int a;
  public final String b;
  public final String c;
  
  public kvf(int paramInt, String paramString1, String paramString2)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = null;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof kve;
    boolean bool2 = false;
    if (bool1)
    {
      kvf localkvf = (kvf)paramObject;
      int i = this.a;
      int j = localkvf.a;
      bool2 = false;
      if (i == j)
      {
        boolean bool3 = efj.c(this.b, localkvf.b);
        bool2 = false;
        if (bool3)
        {
          boolean bool4 = efj.c(this.c, localkvf.c);
          bool2 = false;
          if (bool4) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = Integer.valueOf(this.a);
    arrayOfObject[3] = Integer.valueOf(super.hashCode());
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvf
 * JD-Core Version:    0.7.0.1
 */