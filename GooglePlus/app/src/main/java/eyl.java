import java.util.Arrays;

final class eyl
{
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof eyl)) {
        return false;
      }
    } while (Arrays.equals(null, null));
    return false;
  }
  
  public final int hashCode()
  {
    return 16337 + Arrays.hashCode(null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyl
 * JD-Core Version:    0.7.0.1
 */