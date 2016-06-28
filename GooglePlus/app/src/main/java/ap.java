import java.io.File;
import java.io.FileFilter;

final class ap
  implements FileFilter
{
  ap(String paramString) {}
  
  public final boolean accept(File paramFile)
  {
    return !paramFile.getName().startsWith(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ap
 * JD-Core Version:    0.7.0.1
 */