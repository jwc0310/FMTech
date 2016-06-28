final class bkf
{
  private final byte[] a;
  private int b;
  
  public bkf(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    System.arraycopy(paramArrayOfByte, 0, this.a, this.b, paramArrayOfByte.length);
    this.b += paramArrayOfByte.length;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bkf
 * JD-Core Version:    0.7.0.1
 */