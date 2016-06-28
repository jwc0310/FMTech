import android.os.Bundle;
import java.util.regex.Pattern;

public class fmd<T>
{
  private final char a = '\001';
  private final char b = '\002';
  
  static
  {
    new fmd(Bundle.EMPTY, (byte)0);
    new fmd(Bundle.EMPTY);
  }
  
  public fmd(Bundle paramBundle)
  {
    this(paramBundle, '\001', '\002');
  }
  
  public fmd(Bundle paramBundle, byte paramByte)
  {
    this(paramBundle, '\001', '\002');
  }
  
  fmd(Bundle paramBundle, char paramChar1, char paramChar2)
  {
    Pattern.quote(String.valueOf(this.a));
    Pattern.quote(String.valueOf(this.b));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmd
 * JD-Core Version:    0.7.0.1
 */