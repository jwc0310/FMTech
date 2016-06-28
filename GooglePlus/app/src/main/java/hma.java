import com.google.android.apps.common.proguard.SimpleEnum;

@SimpleEnum
public final class hma
  extends Enum<hma>
{
  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = a;
    arrayOfInt[1] = b;
    c = arrayOfInt;
  }
  
  public static int[] a()
  {
    return (int[])c.clone();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hma
 * JD-Core Version:    0.7.0.1
 */