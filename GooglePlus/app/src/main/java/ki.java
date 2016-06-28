import android.os.Build.VERSION;
import java.util.Locale;

public final class ki
{
  public static final kj a;
  public static final Locale b;
  static String c;
  static String d;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (a = new kk();; a = new kj((byte)0))
    {
      b = new Locale("", "");
      c = "Arab";
      d = "Hebr";
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ki
 * JD-Core Version:    0.7.0.1
 */