import java.util.Arrays;

public final class kvl
  extends gxq
{
  public final int b;
  public final String c;
  
  public kvl(gxt paramgxt, int paramInt, String paramString)
  {
    super(paramgxt);
    this.b = paramInt;
    this.c = null;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = super.equals(paramObject);
    boolean bool2 = false;
    if (bool1)
    {
      kvl localkvl = (kvl)paramObject;
      boolean bool3 = efj.c(this.c, localkvl.c);
      bool2 = false;
      if (bool3)
      {
        int i = this.b;
        int j = localkvl.b;
        bool2 = false;
        if (i == j) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.c;
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(super.hashCode());
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvl
 * JD-Core Version:    0.7.0.1
 */