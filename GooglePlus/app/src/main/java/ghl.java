import java.io.File;
import java.io.FilenameFilter;

final class ghl
  implements FilenameFilter
{
  public final boolean accept(File paramFile, String paramString)
  {
    String str = paramString.toLowerCase();
    return (str.endsWith(".jpg")) || (str.endsWith(".jpeg")) || (str.endsWith(".png"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghl
 * JD-Core Version:    0.7.0.1
 */