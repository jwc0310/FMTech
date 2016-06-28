import java.util.Arrays;

final class qaw
{
  final int a;
  final byte[] b;
  
  qaw(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    qaw localqaw;
    do
    {
      return true;
      if (!(paramObject instanceof qaw)) {
        return false;
      }
      localqaw = (qaw)paramObject;
    } while ((this.a == localqaw.a) && (Arrays.equals(this.b, localqaw.b)));
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * (527 + this.a) + Arrays.hashCode(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qaw
 * JD-Core Version:    0.7.0.1
 */