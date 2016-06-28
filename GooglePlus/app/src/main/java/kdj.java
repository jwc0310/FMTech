import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class kdj
  implements kdh
{
  private kdk a = new kdk(this);
  
  private static void a(Context paramContext, String paramString, List<kdi> paramList)
  {
    ixf localixf = (ixf)mbb.a(paramContext, ixf.class);
    rne[] arrayOfrne = new rne[10];
    for (int i = 0; i < 10; i++)
    {
      rne localrne = new rne();
      kdi localkdi = (kdi)paramList.get(i);
      localrne.a = 5;
      localrne.e = Integer.valueOf(localkdi.a);
      localrne.c = Integer.valueOf(0);
      localrne.b = localkdi.b;
      arrayOfrne[i] = localrne;
    }
    kqs localkqs = new kqs(paramString, efj.v(paramContext), localixf.j(), arrayOfrne);
    ((gww)mbb.a(paramContext, gww.class)).a(paramContext, localkqs);
  }
  
  public final boolean a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    for (;;)
    {
      try
      {
        Matcher localMatcher = Pattern.compile("(^(http|https)://[^?]+)(\\?.*|)").matcher(paramString2);
        String str1;
        if (localMatcher.find())
        {
          String str2 = localMatcher.group(1);
          str1 = str2;
          if (str1 == null)
          {
            localkdi = null;
            if (localkdi != null) {
              continue;
            }
            bool = false;
            return bool;
          }
        }
        else
        {
          str1 = null;
          continue;
        }
        kdi localkdi = new kdi(str1, paramInt, paramString3);
        continue;
        kdk localkdk1 = this.a;
        int i;
        kdk localkdk2;
        if (localkdk1.a.containsKey(localkdi))
        {
          List localList2 = (List)localkdk1.a.get(localkdi);
          localList2.add(localkdi);
          i = localList2.size();
          if (i != 10) {
            break label300;
          }
          localkdk2 = this.a;
          if (!localkdk2.a.containsKey(localkdi)) {
            break label294;
          }
          localObject2 = (List)localkdk2.a.get(localkdi);
          if (((List)localObject2).size() > 10)
          {
            List localList1 = ((List)localObject2).subList(0, 9);
            ((List)localObject2).removeAll(localList1);
            localObject2 = localList1;
            a(paramContext, paramString1, (List)localObject2);
            bool = true;
          }
        }
        else
        {
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(localkdi);
          localkdk1.a.put(localkdi, localArrayList);
          i = 1;
          continue;
        }
        localkdk2.a.remove(localkdi);
        continue;
        Object localObject2 = null;
      }
      finally {}
      label294:
      continue;
      label300:
      boolean bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdj
 * JD-Core Version:    0.7.0.1
 */