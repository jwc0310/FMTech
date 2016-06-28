import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bpw
  extends mab
{
  public final String a;
  public final float b;
  public final float c;
  public final float d;
  public final float e;
  public final int f;
  
  bpw(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    this.a = paramString;
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = paramFloat3;
    this.e = paramFloat4;
    this.f = paramInt;
  }
  
  public static List<bpx> a(byte[] paramArrayOfByte)
  {
    Object localObject;
    if (paramArrayOfByte == null) {
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      int i = localByteBuffer.getInt();
      localObject = new ArrayList(i);
      for (int j = 0; j < i; j++)
      {
        bpx localbpx = new bpx();
        localbpx.a = d(localByteBuffer);
        localbpx.b = d(localByteBuffer);
        localbpx.c = d(localByteBuffer);
        localbpx.d = d(localByteBuffer);
        localbpx.e = d(localByteBuffer);
        localbpx.f = d(localByteBuffer);
        ((List)localObject).add(localbpx);
      }
    }
  }
  
  /* Error */
  public static byte[] a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    // Byte code:
    //   0: new 74	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 75	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore 6
    //   9: new 77	java/io/DataOutputStream
    //   12: dup
    //   13: aload 6
    //   15: invokespecial 80	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   18: astore 7
    //   20: aload 7
    //   22: aload_0
    //   23: invokevirtual 84	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   26: aload 7
    //   28: fload_1
    //   29: invokevirtual 88	java/io/DataOutputStream:writeFloat	(F)V
    //   32: aload 7
    //   34: fload_2
    //   35: invokevirtual 88	java/io/DataOutputStream:writeFloat	(F)V
    //   38: aload 7
    //   40: fload_3
    //   41: invokevirtual 88	java/io/DataOutputStream:writeFloat	(F)V
    //   44: aload 7
    //   46: fload 4
    //   48: invokevirtual 88	java/io/DataOutputStream:writeFloat	(F)V
    //   51: aload 7
    //   53: iload 5
    //   55: invokevirtual 91	java/io/DataOutputStream:writeInt	(I)V
    //   58: aload 7
    //   60: invokevirtual 94	java/io/DataOutputStream:close	()V
    //   63: aload 6
    //   65: invokevirtual 98	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   68: areturn
    //   69: astore 10
    //   71: aload 7
    //   73: invokevirtual 94	java/io/DataOutputStream:close	()V
    //   76: goto -13 -> 63
    //   79: astore 11
    //   81: goto -18 -> 63
    //   84: astore 8
    //   86: aload 7
    //   88: invokevirtual 94	java/io/DataOutputStream:close	()V
    //   91: aload 8
    //   93: athrow
    //   94: astore 12
    //   96: goto -33 -> 63
    //   99: astore 9
    //   101: goto -10 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	paramString	String
    //   0	104	1	paramFloat1	float
    //   0	104	2	paramFloat2	float
    //   0	104	3	paramFloat3	float
    //   0	104	4	paramFloat4	float
    //   0	104	5	paramInt	int
    //   7	57	6	localByteArrayOutputStream	ByteArrayOutputStream
    //   18	69	7	localDataOutputStream	DataOutputStream
    //   84	8	8	localObject	Object
    //   99	1	9	localIOException1	java.io.IOException
    //   69	1	10	localIOException2	java.io.IOException
    //   79	1	11	localIOException3	java.io.IOException
    //   94	1	12	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   20	58	69	java/io/IOException
    //   71	76	79	java/io/IOException
    //   20	58	84	finally
    //   58	63	94	java/io/IOException
    //   86	91	99	java/io/IOException
  }
  
  public static byte[] a(List<bpx> paramList)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    if (paramList == null) {
      return null;
    }
    localDataOutputStream.writeInt(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      bpx localbpx = (bpx)localIterator.next();
      a(localDataOutputStream, localbpx.a);
      a(localDataOutputStream, localbpx.b);
      a(localDataOutputStream, localbpx.c);
      a(localDataOutputStream, localbpx.d);
      a(localDataOutputStream, localbpx.e);
      a(localDataOutputStream, localbpx.f);
    }
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
  
  /* Error */
  public static bpw b(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 122	java/io/DataInputStream
    //   3: dup
    //   4: new 124	java/io/ByteArrayInputStream
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 127	java/io/ByteArrayInputStream:<init>	([B)V
    //   12: invokespecial 130	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   15: astore_1
    //   16: new 2	bpw
    //   19: dup
    //   20: aload_1
    //   21: invokevirtual 134	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   24: aload_1
    //   25: invokevirtual 138	java/io/DataInputStream:readFloat	()F
    //   28: aload_1
    //   29: invokevirtual 138	java/io/DataInputStream:readFloat	()F
    //   32: aload_1
    //   33: invokevirtual 138	java/io/DataInputStream:readFloat	()F
    //   36: aload_1
    //   37: invokevirtual 138	java/io/DataInputStream:readFloat	()F
    //   40: aload_1
    //   41: invokevirtual 141	java/io/DataInputStream:readInt	()I
    //   44: invokespecial 143	bpw:<init>	(Ljava/lang/String;FFFFI)V
    //   47: astore_2
    //   48: aload_1
    //   49: invokevirtual 144	java/io/DataInputStream:close	()V
    //   52: aload_2
    //   53: areturn
    //   54: astore 6
    //   56: aload_1
    //   57: invokevirtual 144	java/io/DataInputStream:close	()V
    //   60: aconst_null
    //   61: areturn
    //   62: astore 4
    //   64: aload_1
    //   65: invokevirtual 144	java/io/DataInputStream:close	()V
    //   68: aload 4
    //   70: athrow
    //   71: astore_3
    //   72: aload_2
    //   73: areturn
    //   74: astore 7
    //   76: goto -16 -> 60
    //   79: astore 5
    //   81: goto -13 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	paramArrayOfByte	byte[]
    //   15	50	1	localDataInputStream	java.io.DataInputStream
    //   47	26	2	localbpw	bpw
    //   71	1	3	localIOException1	java.io.IOException
    //   62	7	4	localObject	Object
    //   79	1	5	localIOException2	java.io.IOException
    //   54	1	6	localIOException3	java.io.IOException
    //   74	1	7	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   16	48	54	java/io/IOException
    //   16	48	62	finally
    //   48	52	71	java/io/IOException
    //   56	60	74	java/io/IOException
    //   64	68	79	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpw
 * JD-Core Version:    0.7.0.1
 */