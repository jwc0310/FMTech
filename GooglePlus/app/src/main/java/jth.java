import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

final class jth
  extends InputStream
{
  private jte a;
  private long b = 0L;
  
  public jth(jtc paramjtc, jte paramjte)
  {
    this.a = paramjte;
    jte localjte = this.a;
    synchronized (localjte.g)
    {
      localjte.f = (1 + localjte.f);
      return;
    }
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	jth:a	Ljte;
    //   6: ifnonnull +6 -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: getfield 21	jth:a	Ljte;
    //   16: astore_2
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 21	jth:a	Ljte;
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: getfield 26	jte:g	Ljtc;
    //   28: astore_3
    //   29: aload_3
    //   30: monitorenter
    //   31: aload_2
    //   32: iconst_m1
    //   33: aload_2
    //   34: getfield 30	jte:f	I
    //   37: iadd
    //   38: putfield 30	jte:f	I
    //   41: aload_2
    //   42: getfield 30	jte:f	I
    //   45: ifne +46 -> 91
    //   48: aload_2
    //   49: ldc2_w 32
    //   52: invokestatic 39	android/os/SystemClock:elapsedRealtime	()J
    //   55: ladd
    //   56: putfield 42	jte:e	J
    //   59: bipush 28
    //   61: aload_2
    //   62: getfield 45	jte:d	I
    //   65: iand
    //   66: ifeq +25 -> 91
    //   69: aload_2
    //   70: getfield 48	jte:b	Ljava/io/RandomAccessFile;
    //   73: invokestatic 53	iaw:a	(Ljava/io/Closeable;)V
    //   76: aload_2
    //   77: getfield 45	jte:d	I
    //   80: iconst_4
    //   81: if_icmpeq +10 -> 91
    //   84: aload_2
    //   85: getfield 56	jte:a	Ljava/io/File;
    //   88: invokestatic 61	jtc:a	(Ljava/io/File;)V
    //   91: aload_3
    //   92: monitorexit
    //   93: return
    //   94: astore 4
    //   96: aload_3
    //   97: monitorexit
    //   98: aload 4
    //   100: athrow
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	jth
    //   101	4	1	localObject1	Object
    //   16	69	2	localjte	jte
    //   94	5	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   31	91	94	finally
    //   91	93	94	finally
    //   96	98	94	finally
    //   2	11	101	finally
    //   12	24	101	finally
    //   102	104	101	finally
  }
  
  protected final void finalize()
  {
    try
    {
      super.finalize();
      return;
    }
    finally
    {
      iaw.a(this);
    }
  }
  
  public final int read()
  {
    byte[] arrayOfByte = new byte[1];
    if (read(arrayOfByte, 0, 1) > 0) {
      return 0xFF & arrayOfByte[1];
    }
    return -1;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    jte localjte = this.a;
    for (;;)
    {
      long l;
      synchronized (this.c)
      {
        l = localjte.c;
        if (l <= this.b)
        {
          if ((0x3 & localjte.d) == 0) {
            break label181;
          }
          k = 1;
          if (k != 0)
          {
            iaw.a(this.c);
            l = localjte.c;
            continue;
          }
        }
        if (localjte.d == 8) {
          throw new IOException("download fail!");
        }
      }
      int i = (int)Math.min(paramInt2, l - this.b);
      if (i == 0) {
        return -1;
      }
      try
      {
        localjte.b.seek(this.b);
        int j = localjte.b.read(paramArrayOfByte, paramInt1, i);
        this.b += j;
        return j;
      }
      finally {}
      label181:
      int k = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jth
 * JD-Core Version:    0.7.0.1
 */