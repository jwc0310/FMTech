import android.annotation.TargetApi;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ira
{
  private static final Set<String> a;
  
  static
  {
    fpi localfpi = new fpi();
    a = localfpi;
    localfpi.addAll(Arrays.asList(new String[] { "expire", "signature" }));
  }
  
  @TargetApi(11)
  public static String a(String paramString)
  {
    if (Build.VERSION.SDK_INT < 11) {}
    Uri.Builder localBuilder;
    int i;
    do
    {
      Uri localUri;
      String str1;
      do
      {
        return paramString;
        localUri = Uri.parse(paramString);
        str1 = localUri.getHost();
      } while ((str1 == null) || (!str1.contains("google")));
      localBuilder = localUri.buildUpon();
      localBuilder.clearQuery();
      Iterator localIterator1 = localUri.getQueryParameterNames().iterator();
      i = 0;
      while (localIterator1.hasNext())
      {
        String str2 = (String)localIterator1.next();
        if (a.contains(str2))
        {
          i = 1;
        }
        else
        {
          Iterator localIterator2 = localUri.getQueryParameters(str2).iterator();
          while (localIterator2.hasNext()) {
            localBuilder.appendQueryParameter(str2, (String)localIterator2.next());
          }
        }
      }
    } while (i == 0);
    return localBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ira
 * JD-Core Version:    0.7.0.1
 */