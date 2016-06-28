import java.util.Arrays;

public final class kut
  extends gxq
{
  public final String[] b;
  
  public kut(gxt paramgxt, String... paramVarArgs)
  {
    super(paramgxt);
    this.b = new String[paramVarArgs.length];
    for (int i = 0; i < this.b.length; i++)
    {
      String[] arrayOfString = this.b;
      String str = paramVarArgs[i];
      if (str.startsWith("f.")) {
        str = str.substring(2);
      }
      arrayOfString[i] = str;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (super.equals(paramObject))
    {
      kut localkut = (kut)paramObject;
      return Arrays.equals(this.b, localkut.b);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return efj.a(this.b, super.hashCode());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kut
 * JD-Core Version:    0.7.0.1
 */