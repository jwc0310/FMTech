import com.google.android.apps.common.proguard.SimpleEnum;

@SimpleEnum
public final class eai
  extends Enum<eai>
{
  static
  {
    int[] arrayOfInt = new int[5];
    arrayOfInt[0] = a;
    arrayOfInt[1] = b;
    arrayOfInt[2] = c;
    arrayOfInt[3] = d;
    arrayOfInt[4] = e;
    f = arrayOfInt;
  }
  
  public static int[] a()
  {
    return (int[])f.clone();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eai
 * JD-Core Version:    0.7.0.1
 */