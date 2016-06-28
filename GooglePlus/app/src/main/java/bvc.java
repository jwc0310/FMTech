import android.content.Context;
import java.io.File;

public final class bvc
  extends bsr
{
  private static bvc b;
  
  private bvc(File paramFile)
  {
    super(paramFile);
  }
  
  public static bvc a(Context paramContext)
  {
    try
    {
      if (b == null) {
        b = new bvc(bsr.a(paramContext, "suggestions"));
      }
      bvc localbvc = b;
      return localbvc;
    }
    finally {}
  }
  
  public static String a(int paramInt)
  {
    if (paramInt == -2147483648) {
      return "celebrities_preview.json";
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    return String.format("celebrities_%s.json", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvc
 * JD-Core Version:    0.7.0.1
 */