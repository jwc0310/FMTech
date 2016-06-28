import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class mas
{
  final Handler a;
  final File b;
  final igb c;
  
  public mas(Context paramContext, igb paramigb)
  {
    this(paramContext, paramigb, localHandlerThread.getLooper());
  }
  
  private mas(Context paramContext, igb paramigb, Looper paramLooper)
  {
    this.b = new File(paramContext.getCacheDir(), "jpeg_encoder_queue_temp");
    this.c = paramigb;
    this.a = new Handler(paramLooper, new mat(this));
  }
  
  protected static ByteBuffer a(File paramFile)
  {
    String str1;
    try
    {
      ByteBuffer localByteBuffer = efj.a(paramFile, false);
      return localByteBuffer;
    }
    catch (IOException localIOException)
    {
      str1 = String.valueOf(paramFile.getAbsolutePath());
      if (str1.length() == 0) {}
    }
    for (String str2 = "Unable to obtain byte buffer for file path: ".concat(str1);; str2 = new String("Unable to obtain byte buffer for file path: "))
    {
      Log.e("JpegEncodeQueue", str2, localIOException);
      return null;
    }
  }
  
  /* Error */
  protected final boolean a(android.graphics.Bitmap paramBitmap)
  {
    // Byte code:
    //   0: new 105	java/io/BufferedOutputStream
    //   3: dup
    //   4: new 107	java/io/FileOutputStream
    //   7: dup
    //   8: aload_0
    //   9: getfield 47	mas:b	Ljava/io/File;
    //   12: invokespecial 110	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   15: invokespecial 113	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   18: astore_2
    //   19: aload_1
    //   20: getstatic 119	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   23: bipush 100
    //   25: aload_2
    //   26: invokevirtual 125	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   29: pop
    //   30: aload_2
    //   31: invokevirtual 130	java/io/OutputStream:close	()V
    //   34: iconst_1
    //   35: ireturn
    //   36: astore_3
    //   37: aconst_null
    //   38: astore_2
    //   39: ldc 91
    //   41: ldc 132
    //   43: aload_3
    //   44: invokestatic 97	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   47: pop
    //   48: aload_2
    //   49: ifnull +7 -> 56
    //   52: aload_2
    //   53: invokevirtual 130	java/io/OutputStream:close	()V
    //   56: iconst_0
    //   57: ireturn
    //   58: astore 4
    //   60: aconst_null
    //   61: astore_2
    //   62: aload_2
    //   63: ifnull +7 -> 70
    //   66: aload_2
    //   67: invokevirtual 130	java/io/OutputStream:close	()V
    //   70: aload 4
    //   72: athrow
    //   73: astore 9
    //   75: goto -41 -> 34
    //   78: astore 7
    //   80: goto -24 -> 56
    //   83: astore 5
    //   85: goto -15 -> 70
    //   88: astore 4
    //   90: goto -28 -> 62
    //   93: astore_3
    //   94: goto -55 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	mas
    //   0	97	1	paramBitmap	android.graphics.Bitmap
    //   18	49	2	localBufferedOutputStream	java.io.BufferedOutputStream
    //   36	8	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   93	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    //   58	13	4	localObject1	Object
    //   88	1	4	localObject2	Object
    //   83	1	5	localIOException1	IOException
    //   78	1	7	localIOException2	IOException
    //   73	1	9	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   0	19	36	java/io/FileNotFoundException
    //   0	19	58	finally
    //   30	34	73	java/io/IOException
    //   52	56	78	java/io/IOException
    //   66	70	83	java/io/IOException
    //   19	30	88	finally
    //   39	48	88	finally
    //   19	30	93	java/io/FileNotFoundException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mas
 * JD-Core Version:    0.7.0.1
 */