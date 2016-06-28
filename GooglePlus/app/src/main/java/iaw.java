import android.database.Cursor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;

public final class iaw
{
  private static long[] a = new long[256];
  private static final boolean b;
  
  static
  {
    new mcq("gallery3d_debug_build");
    boolean bool;
    if ((Build.TYPE.equals("eng")) || (Build.TYPE.equals("userdebug")))
    {
      bool = true;
      b = bool;
    }
    for (int i = 0;; i++)
    {
      if (i >= 256) {
        return;
      }
      long l1 = i;
      int j = 0;
      long l2 = l1;
      label64:
      if (j < 8)
      {
        if ((0x1 & (int)l2) != 0) {}
        for (long l3 = -7661587058870466123L;; l3 = 0L)
        {
          long l4 = l3 ^ l2 >> 1;
          j++;
          l2 = l4;
          break label64;
          bool = false;
          break;
        }
      }
      a[i] = l2;
    }
  }
  
  public static int a(float paramFloat)
  {
    for (int i = 0; (i < 31) && (1 << i < paramFloat); i++) {}
    return i;
  }
  
  public static int a(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > 1073741824)) {
      throw new IllegalArgumentException();
    }
    int i = paramInt - 1;
    int j = i | i >> 16;
    int k = j | j >> 8;
    int m = k | k >> 4;
    int n = m | m >> 2;
    return 1 + (n | n >> 1);
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < 0) {
      return 0;
    }
    return paramInt1;
  }
  
  public static int a(String paramString, int paramInt)
  {
    if (paramString == null) {
      return -1;
    }
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return -1;
  }
  
  public static final long a(String paramString)
  {
    int i = 0;
    if ((paramString == null) || (paramString.length() == 0)) {
      return 0L;
    }
    byte[] arrayOfByte = new byte[paramString.length() << 1];
    char[] arrayOfChar = paramString.toCharArray();
    int j = arrayOfChar.length;
    int k = 0;
    while (i < j)
    {
      int m = arrayOfChar[i];
      int n = k + 1;
      arrayOfByte[k] = ((byte)m);
      k = n + 1;
      arrayOfByte[n] = ((byte)(m >> 8));
      i++;
    }
    return a(arrayOfByte);
  }
  
  public static final long a(byte[] paramArrayOfByte)
  {
    long l = -1L;
    int i = 0;
    int j = paramArrayOfByte.length;
    while (i < j)
    {
      l = a[(0xFF & ((int)l ^ paramArrayOfByte[i]))] ^ l >> 8;
      i++;
    }
    return l;
  }
  
  public static void a(Cursor paramCursor)
  {
    if (paramCursor != null) {}
    try
    {
      paramCursor.close();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static void a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor != null) {}
    try
    {
      paramParcelFileDescriptor.close();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable == null) {
      return;
    }
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static void a(Object paramObject)
  {
    try
    {
      paramObject.wait();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      String str = String.valueOf(paramObject);
      new StringBuilder(22 + String.valueOf(str).length()).append("unexpected interrupt: ").append(str);
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new AssertionError();
    }
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static int b(float paramFloat)
  {
    for (int i = 0; (i < 31) && (1 << i <= paramFloat); i++) {}
    return i - 1;
  }
  
  public static int b(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException();
    }
    return Integer.highestOneBit(paramInt);
  }
  
  public static String b(Object paramObject)
  {
    String str;
    if (paramObject == null) {
      str = null;
    }
    int i;
    do
    {
      return str;
      str = paramObject.toString();
      i = Math.min(str.length(), 32);
    } while (b);
    return "********************************".substring(0, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iaw
 * JD-Core Version:    0.7.0.1
 */