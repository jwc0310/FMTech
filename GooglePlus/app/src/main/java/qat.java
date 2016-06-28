import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class qat
{
  public volatile int ak = -1;
  
  public static final void a(qat paramqat, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      qal localqal = new qal(paramArrayOfByte, 0, paramInt2);
      paramqat.a(localqal);
      if (localqal.a.remaining() != 0) {
        throw new IllegalStateException("Did not write as much data as expected.");
      }
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", localIOException);
    }
  }
  
  public static final byte[] a(qat paramqat)
  {
    int i = paramqat.a();
    paramqat.ak = i;
    byte[] arrayOfByte = new byte[i];
    a(paramqat, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public static final <T extends qat> T b(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      qak localqak = new qak(paramArrayOfByte, 0, paramInt2);
      paramT.a(localqak);
      localqak.a(0);
      return paramT;
    }
    catch (qas localqas)
    {
      throw localqas;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public int a()
  {
    return 0;
  }
  
  public abstract qat a(qak paramqak);
  
  public void a(qal paramqal) {}
  
  public qat c()
  {
    return (qat)super.clone();
  }
  
  public final int d()
  {
    if (this.ak < 0) {
      this.ak = a();
    }
    return this.ak;
  }
  
  public final int e()
  {
    int i = a();
    this.ak = i;
    return i;
  }
  
  public String toString()
  {
    return efj.a(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qat
 * JD-Core Version:    0.7.0.1
 */