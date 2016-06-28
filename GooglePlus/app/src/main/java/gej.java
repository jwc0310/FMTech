import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class gej
  implements geh
{
  private static final Charset a = Charset.forName("UTF-8");
  
  private static long a(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    efj.a(paramString, "name can not be empty.");
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes(a));
      long l = ByteBuffer.wrap(localMessageDigest.digest()).getLong();
      return l;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
  }
  
  public final void a(rhf paramrhf)
  {
    if ((paramrhf.c != null) && (!paramrhf.c.trim().isEmpty()))
    {
      paramrhf.b = Long.valueOf(a(paramrhf.c));
      paramrhf.c = null;
    }
    b(paramrhf);
  }
  
  protected abstract void b(rhf paramrhf);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gej
 * JD-Core Version:    0.7.0.1
 */