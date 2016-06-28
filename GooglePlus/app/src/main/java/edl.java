import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class edl
{
  public static final efc<ecx> a = new efc();
  
  static
  {
    edd.b("com.google.cast.receiver");
    edd.b("com.google.cast.tp.connection");
    try
    {
      Charset.forName("UTF-8");
      return;
    }
    catch (UnsupportedCharsetException localUnsupportedCharsetException) {}catch (IllegalCharsetNameException localIllegalCharsetNameException) {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edl
 * JD-Core Version:    0.7.0.1
 */