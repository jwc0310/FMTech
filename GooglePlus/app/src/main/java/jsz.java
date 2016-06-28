import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class jsz
  implements jta<Object>
{
  private long a;
  private InputStream b;
  
  public jsz(jss paramjss, long paramLong, InputStream paramInputStream)
  {
    this.a = paramLong;
    this.b = paramInputStream;
  }
  
  public final void a(ParcelFileDescriptor paramParcelFileDescriptor, Object paramObject)
  {
    String str1 = String.valueOf(iaw.b(Long.valueOf(this.a)));
    String str2;
    if (str1.length() != 0) {
      str2 = "PicasaStore.download ".concat(str1);
    }
    for (;;)
    {
      int i = jsm.a(str2);
      InputStream localInputStream = this.b;
      ParcelFileDescriptor.AutoCloseOutputStream localAutoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(paramParcelFileDescriptor);
      try
      {
        byte[] arrayOfByte = new byte[2048];
        int j = localInputStream.read(arrayOfByte);
        for (;;)
        {
          if (j > 0)
          {
            localAutoCloseOutputStream.write(arrayOfByte, 0, j);
            int k = localInputStream.read(arrayOfByte);
            j = k;
            continue;
            str2 = new String("PicasaStore.download ");
            break;
          }
        }
        return;
      }
      catch (IOException localIOException)
      {
        String str3 = String.valueOf(localIOException);
        new StringBuilder(29 + String.valueOf(str3).length()).append("pipe closed early by caller? ").append(str3);
        return;
      }
      catch (Throwable localThrowable) {}finally
      {
        iaw.a(localAutoCloseOutputStream);
        iaw.a(localInputStream);
        jsm.a(i);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsz
 * JD-Core Version:    0.7.0.1
 */