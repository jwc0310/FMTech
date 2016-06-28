import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class jsl
{
  private static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
  private static int b;
  
  private static int a()
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
  
  private static Uri a(int paramInt1, int paramInt2, Uri paramUri, String paramString)
  {
    Uri.Builder localBuilder1 = Uri.EMPTY.buildUpon();
    localBuilder1.authority(paramUri.getAuthority());
    localBuilder1.scheme(paramUri.getScheme());
    localBuilder1.path(paramUri.getPath());
    localBuilder1.appendQueryParameter("resize_w", Integer.toString(paramInt1));
    localBuilder1.appendQueryParameter("resize_h", Integer.toString(paramInt2));
    localBuilder1.appendQueryParameter("no_expand", "1");
    Uri localUri1 = localBuilder1.build();
    if (paramUri.isOpaque()) {
      throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }
    String str1 = paramUri.getEncodedQuery();
    Set localSet;
    Uri localUri2;
    label125:
    String str2;
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
      localBuilder6 = localUri2.buildUpon();
      if (!"url".equals(str2)) {
        break label308;
      }
      localBuilder6.appendQueryParameter("url", paramUri.getQueryParameter("url"));
    }
    for (;;)
    {
      localUri2 = localBuilder6.build();
      break label125;
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
      label308:
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
  
  public static String a(int paramInt, String paramString)
  {
    if (paramString == null) {
      return paramString;
    }
    boolean bool;
    String str2;
    if (paramString == null)
    {
      bool = false;
      if (bool) {
        break label93;
      }
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("https://images").append(a()).append('-').append("esmobile-opensocial.googleusercontent.com").append("/gadgets/proxy");
      String str1 = localStringBuffer.toString();
      str2 = paramString;
      paramString = str1;
    }
    for (;;)
    {
      return a(paramInt, paramInt, Uri.parse(paramString), str2).toString();
      bool = a.matcher(paramString).find();
      break;
      label93:
      str2 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsl
 * JD-Core Version:    0.7.0.1
 */