import java.io.InputStream;
import org.apache.http.entity.AbstractHttpEntity;

final class mam
  extends AbstractHttpEntity
{
  private final InputStream a;
  
  public mam(InputStream paramInputStream)
  {
    this.a = paramInputStream;
  }
  
  public final void consumeContent()
  {
    this.a.close();
  }
  
  public final InputStream getContent()
  {
    return this.a;
  }
  
  public final long getContentLength()
  {
    return -1L;
  }
  
  public final boolean isRepeatable()
  {
    return true;
  }
  
  public final boolean isStreaming()
  {
    return false;
  }
  
  /* Error */
  public final void writeTo(java.io.OutputStream paramOutputStream)
  {
    // Byte code:
    //   0: ldc 35
    //   2: newarray byte
    //   4: astore 6
    //   6: aload_0
    //   7: getfield 13	mam:a	Ljava/io/InputStream;
    //   10: aload 6
    //   12: invokevirtual 39	java/io/InputStream:read	([B)I
    //   15: istore 7
    //   17: iload 7
    //   19: iconst_m1
    //   20: if_icmpeq +17 -> 37
    //   23: aload_1
    //   24: aload 6
    //   26: iconst_0
    //   27: iload 7
    //   29: invokevirtual 45	java/io/OutputStream:write	([BII)V
    //   32: goto -26 -> 6
    //   35: astore 11
    //   37: aload_1
    //   38: ifnull +9 -> 47
    //   41: aload_1
    //   42: invokeinterface 48 1 0
    //   47: aload_0
    //   48: getfield 13	mam:a	Ljava/io/InputStream;
    //   51: astore 8
    //   53: aload 8
    //   55: ifnull +10 -> 65
    //   58: aload 8
    //   60: invokeinterface 48 1 0
    //   65: return
    //   66: astore_2
    //   67: aload_1
    //   68: ifnull +9 -> 77
    //   71: aload_1
    //   72: invokeinterface 48 1 0
    //   77: aload_0
    //   78: getfield 13	mam:a	Ljava/io/InputStream;
    //   81: astore_3
    //   82: aload_3
    //   83: ifnull +9 -> 92
    //   86: aload_3
    //   87: invokeinterface 48 1 0
    //   92: aload_2
    //   93: athrow
    //   94: astore 10
    //   96: goto -49 -> 47
    //   99: astore 9
    //   101: return
    //   102: astore 5
    //   104: goto -27 -> 77
    //   107: astore 4
    //   109: goto -17 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	mam
    //   0	112	1	paramOutputStream	java.io.OutputStream
    //   66	27	2	localObject	java.lang.Object
    //   81	6	3	localInputStream1	InputStream
    //   107	1	4	localIOException1	java.io.IOException
    //   102	1	5	localIOException2	java.io.IOException
    //   4	21	6	arrayOfByte	byte[]
    //   15	13	7	i	int
    //   51	8	8	localInputStream2	InputStream
    //   99	1	9	localIOException3	java.io.IOException
    //   94	1	10	localIOException4	java.io.IOException
    //   35	1	11	localSocketException	java.net.SocketException
    // Exception table:
    //   from	to	target	type
    //   23	32	35	java/net/SocketException
    //   0	6	66	finally
    //   6	17	66	finally
    //   23	32	66	finally
    //   41	47	94	java/io/IOException
    //   58	65	99	java/io/IOException
    //   71	77	102	java/io/IOException
    //   86	92	107	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mam
 * JD-Core Version:    0.7.0.1
 */