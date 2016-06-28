import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class irc
  implements irb
{
  private static final int c;
  public final byte[] a;
  public final long b;
  
  static
  {
    try
    {
      c = MessageDigest.getInstance("SHA-1").getDigestLength();
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new IllegalStateException(localNoSuchAlgorithmException);
    }
  }
  
  private irc(byte[] paramArrayOfByte, long paramLong)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length != c)) {
      throw new IllegalArgumentException("Incorrect fingerprint size");
    }
    this.a = paramArrayOfByte;
    this.b = paramLong;
  }
  
  public static String a(InputStream paramInputStream)
  {
    if (paramInputStream == null) {
      return null;
    }
    return b(paramInputStream).a();
  }
  
  public static String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String str = String.valueOf(paramString.substring(0, 32));
    if (str.length() != 0) {
      return "cs_01_".concat(str);
    }
    return new String("cs_01_");
  }
  
  /* Error */
  public static irc b(InputStream paramInputStream)
  {
    // Byte code:
    //   0: sipush 8192
    //   3: newarray byte
    //   5: astore_1
    //   6: ldc 18
    //   8: invokestatic 24	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   11: astore 6
    //   13: new 79	java/security/DigestInputStream
    //   16: dup
    //   17: new 81	java/io/BufferedInputStream
    //   20: dup
    //   21: aload_0
    //   22: sipush 8192
    //   25: invokespecial 84	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   28: aload 6
    //   30: invokespecial 87	java/security/DigestInputStream:<init>	(Ljava/io/InputStream;Ljava/security/MessageDigest;)V
    //   33: astore 5
    //   35: lconst_0
    //   36: lstore 7
    //   38: aload 5
    //   40: aload_1
    //   41: invokevirtual 91	java/security/DigestInputStream:read	([B)I
    //   44: istore 9
    //   46: iload 9
    //   48: iflt +14 -> 62
    //   51: lload 7
    //   53: iload 9
    //   55: i2l
    //   56: ladd
    //   57: lstore 7
    //   59: goto -21 -> 38
    //   62: aload 5
    //   64: invokevirtual 94	java/security/DigestInputStream:close	()V
    //   67: new 2	irc
    //   70: dup
    //   71: aload 5
    //   73: invokevirtual 98	java/security/DigestInputStream:getMessageDigest	()Ljava/security/MessageDigest;
    //   76: invokevirtual 102	java/security/MessageDigest:digest	()[B
    //   79: lload 7
    //   81: invokespecial 104	irc:<init>	([BJ)V
    //   84: areturn
    //   85: astore 4
    //   87: aconst_null
    //   88: astore 5
    //   90: new 32	java/lang/IllegalStateException
    //   93: dup
    //   94: aload 4
    //   96: invokespecial 36	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   99: athrow
    //   100: astore_2
    //   101: aload 5
    //   103: astore_3
    //   104: aload_3
    //   105: ifnull +7 -> 112
    //   108: aload_3
    //   109: invokevirtual 94	java/security/DigestInputStream:close	()V
    //   112: aload_2
    //   113: athrow
    //   114: astore_2
    //   115: aconst_null
    //   116: astore_3
    //   117: goto -13 -> 104
    //   120: astore 4
    //   122: goto -32 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	paramInputStream	InputStream
    //   5	36	1	arrayOfByte	byte[]
    //   100	13	2	localObject1	Object
    //   114	1	2	localObject2	Object
    //   103	14	3	localDigestInputStream1	java.security.DigestInputStream
    //   85	10	4	localNoSuchAlgorithmException1	NoSuchAlgorithmException
    //   120	1	4	localNoSuchAlgorithmException2	NoSuchAlgorithmException
    //   33	69	5	localDigestInputStream2	java.security.DigestInputStream
    //   11	18	6	localMessageDigest	MessageDigest
    //   36	44	7	l	long
    //   44	10	9	i	int
    // Exception table:
    //   from	to	target	type
    //   6	35	85	java/security/NoSuchAlgorithmException
    //   38	46	100	finally
    //   90	100	100	finally
    //   6	35	114	finally
    //   38	46	120	java/security/NoSuchAlgorithmException
  }
  
  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < c; i++)
    {
      int j = this.a[i];
      localStringBuilder.append(Integer.toHexString(0xF & j >> 4));
      localStringBuilder.append(Integer.toHexString(j & 0xF));
    }
    return localStringBuilder.toString();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof irc)) {
      return false;
    }
    irc localirc = (irc)paramObject;
    return Arrays.equals(this.a, localirc.a);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irc
 * JD-Core Version:    0.7.0.1
 */