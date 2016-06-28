import java.lang.ref.WeakReference;

abstract class epx
  extends ejx
{
  private static final WeakReference<byte[]> b = new WeakReference(null);
  private WeakReference<byte[]> a = b;
  
  epx(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  final byte[] a()
  {
    try
    {
      byte[] arrayOfByte = (byte[])this.a.get();
      if (arrayOfByte == null)
      {
        arrayOfByte = b();
        this.a = new WeakReference(arrayOfByte);
      }
      return arrayOfByte;
    }
    finally {}
  }
  
  protected abstract byte[] b();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     epx
 * JD-Core Version:    0.7.0.1
 */