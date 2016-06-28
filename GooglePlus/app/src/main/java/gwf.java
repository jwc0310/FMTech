import java.util.Arrays;

final class gwf
{
  final gvz a;
  final gvq b;
  boolean c;
  
  public gwf(gvz paramgvz, gvq paramgvq)
  {
    this.b = paramgvq;
    this.a = paramgvz;
    this.c = true;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof gwf;
    boolean bool2 = false;
    if (bool1)
    {
      gwf localgwf = (gwf)paramObject;
      boolean bool3 = efj.c(this.b, localgwf.b);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = efj.c(this.a, localgwf.a);
        bool2 = false;
        if (bool4) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.a;
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwf
 * JD-Core Version:    0.7.0.1
 */