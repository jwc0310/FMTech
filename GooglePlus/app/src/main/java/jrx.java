import android.net.Uri;
import android.net.Uri.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class jrx
{
  private static final jsa a = new jsa(jsa.a("=").b, true);
  private static final jsa b = new jsa(jsa.a("/").b, true);
  private static final jrz c = new jrz("/");
  private static final Pattern d = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6]\\.((ggpht)|(googleusercontent)|(google)))|(bp[0-3]\\.blogger))\\.com)|(www\\.google\\.com\\/visualsearch\\/lh))\\/");
  
  public static Uri a(String paramString1, String paramString2)
  {
    int i = 1;
    Uri localUri = Uri.parse(paramString2);
    ArrayList localArrayList1 = a(new jsc(b, localUri.getPath()));
    int j = localArrayList1.size();
    if ((localArrayList1.size() > i) && (((String)localArrayList1.get(0)).equals("image"))) {}
    for (int k = j - 1;; k = j)
    {
      String str3;
      ArrayList localArrayList2;
      if ((k >= 4) && (k <= 6))
      {
        str3 = localUri.getPath();
        localArrayList2 = a(new jsc(b, str3));
        if ((localArrayList2.isEmpty()) || (!((String)localArrayList2.get(0)).equals("image"))) {
          break label438;
        }
        localArrayList2.remove(0);
      }
      label438:
      for (int m = i;; m = 0)
      {
        int n = localArrayList2.size();
        boolean bool = str3.endsWith("/");
        int i1;
        label186:
        label220:
        Uri.Builder localBuilder;
        String str4;
        if ((!bool) && (n == 5))
        {
          i1 = i;
          if (n != 4) {
            break label313;
          }
          if (i1 != 0) {
            localArrayList2.add(localArrayList2.get(4));
          }
          if (i == 0) {
            break label318;
          }
          localArrayList2.add(paramString1);
          if (m != 0) {
            localArrayList2.add(0, "image");
          }
          if (bool) {
            localArrayList2.add("");
          }
          localBuilder = localUri.buildUpon();
          str4 = String.valueOf(c.a(new StringBuilder(), localArrayList2).toString());
          if (str4.length() == 0) {
            break label331;
          }
        }
        label313:
        label318:
        label331:
        for (String str5 = "/".concat(str4);; str5 = new String("/"))
        {
          return localBuilder.path(str5).build();
          i1 = 0;
          break;
          i = 0;
          break label186;
          localArrayList2.set(4, paramString1);
          break label220;
        }
        if (k == i)
        {
          String str1 = (String)a(new jsc(a, localUri.getPath())).get(0);
          String str2 = 1 + String.valueOf(str1).length() + String.valueOf(paramString1).length() + str1 + "=" + paramString1;
          return localUri.buildUpon().path(str2).build();
        }
        return localUri;
      }
    }
  }
  
  public static String a(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    ArrayList localArrayList1 = a(new jsc(b, localUri.getPath()));
    int i = localArrayList1.size();
    if ((localArrayList1.size() > 1) && (((String)localArrayList1.get(0)).equals("image"))) {}
    for (int j = i - 1;; j = i)
    {
      if ((j >= 4) && (j <= 6))
      {
        String str = localUri.getPath();
        ArrayList localArrayList3 = a(new jsc(b, str));
        if ((!localArrayList3.isEmpty()) && (((String)localArrayList3.get(0)).equals("image"))) {
          localArrayList3.remove(0);
        }
        int k = localArrayList3.size();
        int m;
        if ((!str.endsWith("/")) && (k == 5))
        {
          m = 1;
          if (k != 4) {
            break label202;
          }
        }
        label202:
        for (int n = 1;; n = 0)
        {
          if ((m != 0) || (n != 0)) {
            break label208;
          }
          return (String)localArrayList3.get(4);
          m = 0;
          break;
        }
        label208:
        return "";
      }
      if (j == 1)
      {
        ArrayList localArrayList2 = a(new jsc(a, localUri.getPath()));
        if (localArrayList2.size() > 1) {
          return (String)localArrayList2.get(1);
        }
        return "";
      }
      return "";
    }
  }
  
  private static <E> ArrayList<E> a(Iterable<? extends E> paramIterable)
  {
    ArrayList localArrayList;
    if ((paramIterable instanceof Collection)) {
      localArrayList = new ArrayList((Collection)paramIterable);
    }
    for (;;)
    {
      return localArrayList;
      Iterator localIterator = paramIterable.iterator();
      localArrayList = new ArrayList();
      while (localIterator.hasNext()) {
        localArrayList.add(localIterator.next());
      }
    }
  }
  
  public static boolean b(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return d.matcher(paramString).find();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jrx
 * JD-Core Version:    0.7.0.1
 */