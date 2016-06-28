import android.content.pm.PackageManager;

public class ext
{
  public boolean a(PackageManager paramPackageManager, String paramString)
  {
    efj.b(paramPackageManager, "Package manager must not be null.");
    efj.a(paramString, "Package name must not be empty.");
    return eer.b(paramPackageManager, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ext
 * JD-Core Version:    0.7.0.1
 */