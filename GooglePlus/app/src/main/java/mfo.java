import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;

public final class mfo
{
  private static final Paint a = new Paint(2);
  private static final Paint b = new Paint(2);
  private static volatile Thread c;
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    return a(paramBitmap, paramInt, 0);
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if (paramBitmap == null) {}
    Bitmap localBitmap;
    do
    {
      return null;
      if (Log.isLoggable("BitmapUtils", 3))
      {
        int i = paramBitmap.getWidth();
        int j = paramBitmap.getHeight();
        new StringBuilder(84).append("resizeToSquareBitmap: Input: ").append(i).append("x").append(j).append(", output:").append(paramInt1).append("x").append(paramInt1);
      }
      localBitmap = Bitmap.createBitmap(paramInt1, paramInt1, Bitmap.Config.ARGB_8888);
    } while (localBitmap == null);
    Canvas localCanvas = new Canvas(localBitmap);
    if ((paramBitmap.getWidth() != paramInt1) || (paramBitmap.getHeight() != paramInt1)) {
      a(localCanvas, paramBitmap, new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight()), new Rect(0, 0, paramInt1, paramInt1));
    }
    for (;;)
    {
      return localBitmap;
      localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, null);
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap1, int paramInt1, int paramInt2, Bitmap paramBitmap2)
  {
    if ((paramBitmap1 == null) || (paramInt1 == 0) || (paramInt2 == 0)) {
      paramBitmap1 = null;
    }
    do
    {
      return paramBitmap1;
      if (Log.isLoggable("BitmapUtils", 3))
      {
        int n = paramBitmap1.getWidth();
        int i1 = paramBitmap1.getHeight();
        new StringBuilder(83).append("resizeAndCropBitmap: Input: ").append(n).append("x").append(i1).append(", output:").append(paramInt1).append("x").append(paramInt2);
      }
    } while ((paramBitmap1.getWidth() == paramInt1) && (paramBitmap1.getHeight() == paramInt2));
    if (paramBitmap2 == null) {}
    for (Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888); localBitmap == null; localBitmap = paramBitmap2) {
      return null;
    }
    Canvas localCanvas = new Canvas(localBitmap);
    int i = paramBitmap1.getWidth();
    int j = paramBitmap1.getHeight();
    if (paramInt2 * paramBitmap1.getWidth() > paramInt1 * paramBitmap1.getHeight()) {
      i = paramInt1 * paramBitmap1.getHeight() / paramInt2;
    }
    for (;;)
    {
      int k = (paramBitmap1.getWidth() - i) / 2;
      int m = (paramBitmap1.getHeight() - j) / 2;
      a(localCanvas, paramBitmap1, new Rect(k, m, i + k, j + m), new Rect(0, 0, paramInt1, paramInt2));
      return localBitmap;
      j = paramInt2 * paramBitmap1.getWidth() / paramInt1;
    }
  }
  
  private static void a(Canvas paramCanvas, Bitmap paramBitmap, Rect paramRect1, Rect paramRect2)
  {
    if (c == null) {
      c = Looper.getMainLooper().getThread();
    }
    if (Thread.currentThread() == c)
    {
      paramCanvas.drawBitmap(paramBitmap, paramRect1, paramRect2, a);
      return;
    }
    synchronized (b)
    {
      paramCanvas.drawBitmap(paramBitmap, paramRect1, paramRect2, b);
      return;
    }
  }
  
  public static byte[] a(Bitmap paramBitmap, int paramInt, boolean paramBoolean)
  {
    return a(paramBitmap, Bitmap.CompressFormat.JPEG, 90, false);
  }
  
  /* Error */
  public static byte[] a(Bitmap paramBitmap, Bitmap.CompressFormat paramCompressFormat, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 122	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 124	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore 4
    //   9: aload_0
    //   10: aload_1
    //   11: iload_2
    //   12: aload 4
    //   14: invokevirtual 128	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   17: pop
    //   18: aload 4
    //   20: invokevirtual 131	java/io/ByteArrayOutputStream:flush	()V
    //   23: aload 4
    //   25: invokevirtual 134	java/io/ByteArrayOutputStream:close	()V
    //   28: iload_3
    //   29: ifeq +7 -> 36
    //   32: aload_0
    //   33: invokevirtual 137	android/graphics/Bitmap:recycle	()V
    //   36: aload 4
    //   38: invokevirtual 141	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   41: astore 10
    //   43: ldc 27
    //   45: iconst_3
    //   46: invokestatic 33	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   49: ifeq +28 -> 77
    //   52: aload 10
    //   54: arraylength
    //   55: istore 11
    //   57: new 44	java/lang/StringBuilder
    //   60: dup
    //   61: bipush 39
    //   63: invokespecial 45	java/lang/StringBuilder:<init>	(I)V
    //   66: ldc 143
    //   68: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: iload 11
    //   73: invokevirtual 54	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: aload 10
    //   79: areturn
    //   80: astore 7
    //   82: new 145	java/lang/AssertionError
    //   85: dup
    //   86: ldc 147
    //   88: invokespecial 150	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   91: athrow
    //   92: astore 5
    //   94: aload 4
    //   96: invokevirtual 134	java/io/ByteArrayOutputStream:close	()V
    //   99: aload 5
    //   101: athrow
    //   102: astore 9
    //   104: goto -76 -> 28
    //   107: astore 6
    //   109: goto -10 -> 99
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	paramBitmap	Bitmap
    //   0	112	1	paramCompressFormat	Bitmap.CompressFormat
    //   0	112	2	paramInt	int
    //   0	112	3	paramBoolean	boolean
    //   7	88	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   92	8	5	localObject	Object
    //   107	1	6	localIOException1	java.io.IOException
    //   80	1	7	localIOException2	java.io.IOException
    //   102	1	9	localIOException3	java.io.IOException
    //   41	37	10	arrayOfByte	byte[]
    //   55	17	11	i	int
    // Exception table:
    //   from	to	target	type
    //   9	23	80	java/io/IOException
    //   9	23	92	finally
    //   82	92	92	finally
    //   23	28	102	java/io/IOException
    //   94	99	107	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mfo
 * JD-Core Version:    0.7.0.1
 */