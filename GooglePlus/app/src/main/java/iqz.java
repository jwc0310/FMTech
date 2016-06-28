import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
public final class iqz
{
  private static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
  private static int b;
  
  private static Uri a(int paramInt1, int paramInt2, Uri paramUri, String paramString)
  {
    Uri.Builder localBuilder1 = Uri.EMPTY.buildUpon();
    localBuilder1.authority(paramUri.getAuthority());
    localBuilder1.scheme(paramUri.getScheme());
    localBuilder1.path(paramUri.getPath());
    if ((paramInt1 != -1) && (paramInt2 != -1))
    {
      localBuilder1.appendQueryParameter("resize_w", Integer.toString(paramInt1));
      localBuilder1.appendQueryParameter("resize_h", Integer.toString(paramInt2));
      localBuilder1.appendQueryParameter("no_expand", "1");
    }
    Uri localUri1 = localBuilder1.build();
    if (paramUri.isOpaque()) {
      throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }
    String str1 = paramUri.getEncodedQuery();
    Set localSet;
    Uri localUri2;
    label135:
    String str2;
    int m;
    label200:
    int n;
    label213:
    Uri.Builder localBuilder6;
    if (str1 == null)
    {
      localSet = Collections.emptySet();
      Iterator localIterator1 = localSet.iterator();
      localUri2 = localUri1;
      do
      {
        if (!localIterator1.hasNext()) {
          break;
        }
        str2 = (String)localIterator1.next();
      } while (localUri2.getQueryParameter(str2) != null);
      if ((!"resize_w".equals(str2)) && (!"resize_h".equals(str2)) && (!"no_expand".equals(str2))) {
        break label364;
      }
      m = 1;
      if ((paramInt1 != -1) && (paramInt2 != -1)) {
        break label370;
      }
      n = 1;
      localBuilder6 = localUri2.buildUpon();
      if (!"url".equals(str2)) {
        break label376;
      }
      localBuilder6.appendQueryParameter("url", paramUri.getQueryParameter("url"));
    }
    for (;;)
    {
      localUri2 = localBuilder6.build();
      break label135;
      LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      int i = 0;
      do
      {
        int j = str1.indexOf('&', i);
        if (j == -1) {
          j = str1.length();
        }
        int k = str1.indexOf('=', i);
        if ((k > j) || (k == -1)) {
          k = j;
        }
        localLinkedHashSet.add(Uri.decode(str1.substring(i, k)));
        i = j + 1;
      } while (i < str1.length());
      localSet = Collections.unmodifiableSet(localLinkedHashSet);
      break;
      label364:
      m = 0;
      break label200;
      label370:
      n = 0;
      break label213;
      label376:
      if ((n != 0) && (m != 0)) {
        break label135;
      }
      Iterator localIterator2 = paramUri.getQueryParameters(str2).iterator();
      while (localIterator2.hasNext()) {
        localBuilder6.appendQueryParameter(str2, (String)localIterator2.next());
      }
    }
    if ((paramString != null) && (localUri2.getQueryParameter("url") == null))
    {
      Uri.Builder localBuilder5 = localUri2.buildUpon();
      localBuilder5.appendQueryParameter("url", paramString);
      localUri2 = localBuilder5.build();
    }
    if (localUri2.getQueryParameter("container") == null)
    {
      Uri.Builder localBuilder4 = localUri2.buildUpon();
      localBuilder4.appendQueryParameter("container", "esmobile");
      localUri2 = localBuilder4.build();
    }
    if (localUri2.getQueryParameter("gadget") == null)
    {
      Uri.Builder localBuilder3 = localUri2.buildUpon();
      localBuilder3.appendQueryParameter("gadget", "a");
      localUri2 = localBuilder3.build();
    }
    if (localUri2.getQueryParameter("rewriteMime") == null)
    {
      Uri.Builder localBuilder2 = localUri2.buildUpon();
      localBuilder2.appendQueryParameter("rewriteMime", "image/*");
      localUri2 = localBuilder2.build();
    }
    return localUri2;
  }
  
  private static String a()
  {
    String str1 = String.valueOf("https://images");
    int i = b();
    String str2 = String.valueOf("-esmobile-opensocial.googleusercontent.com/gadgets/proxy");
    return 11 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + i + str2;
  }
  
  static String a(int paramInt1, int paramInt2, String paramString)
  {
    if (paramString == null) {
      return paramString;
    }
    String str1;
    if (!a(paramString))
    {
      String str2 = a();
      str1 = paramString;
      paramString = str2;
    }
    for (;;)
    {
      return a(paramInt1, paramInt2, Uri.parse(paramString), str1).toString();
      str1 = null;
    }
  }
  
  static String a(int paramInt, String paramString)
  {
    if (paramString == null) {
      return paramString;
    }
    String str1;
    if (!a(paramString))
    {
      String str2 = a();
      str1 = paramString;
      paramString = str2;
    }
    for (;;)
    {
      return a(paramInt, paramInt, Uri.parse(paramString), str1).toString();
      str1 = null;
    }
  }
  
  public static boolean a(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return a.matcher(paramString).find();
  }
  
  private static int b()
  {
    try
    {
      int i = 1 + b;
      b = i;
      b %= 3;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqz
 * JD-Core Version:    0.7.0.1
 */