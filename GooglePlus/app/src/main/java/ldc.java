import android.content.Intent;
import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ldc
  implements ibz
{
  private static final Pattern a = Pattern.compile("^(?:/u/\\d+)?/communities/(\\d+)/members(?:/(\\w+))?/?$");
  
  public final ica a(Intent paramIntent)
  {
    Uri localUri = paramIntent.getData();
    if (!efj.a(localUri)) {}
    Matcher localMatcher;
    do
    {
      return null;
      localMatcher = a.matcher(localUri.getPath());
    } while (!localMatcher.find());
    return new ldd(localMatcher.group(1), localMatcher.group(2));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldc
 * JD-Core Version:    0.7.0.1
 */