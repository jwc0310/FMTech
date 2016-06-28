import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

public final class gif
  extends SecureRandomSpi
{
  private static final File a = new File("/dev/urandom");
  private static final Object b = new Object();
  private static DataInputStream c;
  private static OutputStream d;
  private boolean e;
  
  private static DataInputStream a()
  {
    synchronized (b)
    {
      DataInputStream localDataInputStream1 = c;
      if (localDataInputStream1 == null) {}
      try
      {
        c = new DataInputStream(new FileInputStream(a));
        DataInputStream localDataInputStream2 = c;
        return localDataInputStream2;
      }
      catch (IOException localIOException)
      {
        String str = String.valueOf(a);
        throw new SecurityException(27 + String.valueOf(str).length() + "Failed to open " + str + " for reading", localIOException);
      }
    }
  }
  
  private static OutputStream b()
  {
    synchronized (b)
    {
      OutputStream localOutputStream1 = d;
      if (localOutputStream1 == null) {}
      try
      {
        d = new FileOutputStream(a);
        OutputStream localOutputStream2 = d;
        return localOutputStream2;
      }
      catch (IOException localIOException)
      {
        String str = String.valueOf(a);
        throw new SecurityException(27 + String.valueOf(str).length() + "Failed to open " + str + " for writing", localIOException);
      }
    }
  }
  
  protected final byte[] engineGenerateSeed(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    engineNextBytes(arrayOfByte);
    return arrayOfByte;
  }
  
  /* Error */
  protected final void engineNextBytes(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 96	gif:e	Z
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: invokestatic 101	gie:a	()[B
    //   11: invokevirtual 104	gif:engineSetSeed	([B)V
    //   14: getstatic 32	gif:b	Ljava/lang/Object;
    //   17: astore 4
    //   19: aload 4
    //   21: monitorenter
    //   22: invokestatic 106	gif:a	()Ljava/io/DataInputStream;
    //   25: astore 6
    //   27: aload 4
    //   29: monitorexit
    //   30: aload 6
    //   32: monitorenter
    //   33: aload 6
    //   35: aload_1
    //   36: invokevirtual 109	java/io/DataInputStream:readFully	([B)V
    //   39: aload 6
    //   41: monitorexit
    //   42: return
    //   43: astore 5
    //   45: aload 4
    //   47: monitorexit
    //   48: aload 5
    //   50: athrow
    //   51: astore_2
    //   52: getstatic 26	gif:a	Ljava/io/File;
    //   55: invokestatic 54	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   58: astore_3
    //   59: new 56	java/lang/SecurityException
    //   62: dup
    //   63: new 58	java/lang/StringBuilder
    //   66: dup
    //   67: bipush 20
    //   69: aload_3
    //   70: invokestatic 54	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   73: invokevirtual 62	java/lang/String:length	()I
    //   76: iadd
    //   77: invokespecial 65	java/lang/StringBuilder:<init>	(I)V
    //   80: ldc 111
    //   82: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload_3
    //   86: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: aload_2
    //   93: invokespecial 80	java/lang/SecurityException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   96: athrow
    //   97: astore 7
    //   99: aload 6
    //   101: monitorexit
    //   102: aload 7
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	gif
    //   0	105	1	paramArrayOfByte	byte[]
    //   51	42	2	localIOException	IOException
    //   58	28	3	str	String
    //   43	6	5	localObject2	Object
    //   25	75	6	localDataInputStream	DataInputStream
    //   97	6	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   22	30	43	finally
    //   45	48	43	finally
    //   14	22	51	java/io/IOException
    //   30	33	51	java/io/IOException
    //   48	51	51	java/io/IOException
    //   102	105	51	java/io/IOException
    //   33	42	97	finally
    //   99	102	97	finally
  }
  
  /* Error */
  protected final void engineSetSeed(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: getstatic 32	gif:b	Ljava/lang/Object;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: invokestatic 115	gif:b	()Ljava/io/OutputStream;
    //   11: astore 6
    //   13: aload 4
    //   15: monitorexit
    //   16: aload 6
    //   18: aload_1
    //   19: invokevirtual 120	java/io/OutputStream:write	([B)V
    //   22: aload 6
    //   24: invokevirtual 123	java/io/OutputStream:flush	()V
    //   27: aload_0
    //   28: iconst_1
    //   29: putfield 96	gif:e	Z
    //   32: return
    //   33: astore 5
    //   35: aload 4
    //   37: monitorexit
    //   38: aload 5
    //   40: athrow
    //   41: astore_2
    //   42: getstatic 26	gif:a	Ljava/io/File;
    //   45: invokestatic 54	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   48: astore_3
    //   49: new 56	java/lang/SecurityException
    //   52: dup
    //   53: new 58	java/lang/StringBuilder
    //   56: dup
    //   57: bipush 24
    //   59: aload_3
    //   60: invokestatic 54	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   63: invokevirtual 62	java/lang/String:length	()I
    //   66: iadd
    //   67: invokespecial 65	java/lang/StringBuilder:<init>	(I)V
    //   70: ldc 125
    //   72: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: aload_3
    //   76: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: aload_2
    //   83: invokespecial 80	java/lang/SecurityException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	gif
    //   0	87	1	paramArrayOfByte	byte[]
    //   41	42	2	localException	java.lang.Exception
    //   48	28	3	str	String
    //   33	6	5	localObject2	Object
    //   11	12	6	localOutputStream	OutputStream
    // Exception table:
    //   from	to	target	type
    //   8	16	33	finally
    //   35	38	33	finally
    //   0	8	41	java/lang/Exception
    //   16	32	41	java/lang/Exception
    //   38	41	41	java/lang/Exception
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gif
 * JD-Core Version:    0.7.0.1
 */