import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class gkg
{
  final mcp a = new mcp();
  
  gkg(gjt paramgjt) {}
  
  final void a(String paramString1, Map<String, ?> paramMap, String paramString2, String paramString3)
  {
    mcp localmcp = this.a;
    String str1 = String.valueOf(paramString2);
    String str2 = String.valueOf(paramString3);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      String str4 = String.valueOf(paramMap.get(str3));
      localmcp.println(3 + String.valueOf(paramString1).length() + String.valueOf(paramString3).length() + String.valueOf(str4).length() + paramString1 + paramString3 + " = " + str4);
      return;
    }
  }
  
  final void a(Map<String, ?> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramMap.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str5 = (String)localIterator1.next();
      if (str5.startsWith("key.")) {
        localArrayList.add(str5.substring(4));
      }
    }
    Collections.sort(localArrayList);
    Iterator localIterator2 = localArrayList.iterator();
    if (localIterator2.hasNext())
    {
      String str1 = (String)localIterator2.next();
      int i = this.b.c(str1);
      Object localObject;
      if (i == -1) {
        localObject = "<INVALID_ID>";
      }
      for (;;)
      {
        this.a.println(29 + String.valueOf(str1).length() + String.valueOf(localObject).length() + "Account key '" + str1 + "' = " + i + " " + (String)localObject);
        break;
        try
        {
          gjb localgjb = this.b.a(i);
          String str2 = String.valueOf(localgjb.b("account_name"));
          String str3 = String.valueOf(localgjb.b("effective_gaia_id"));
          String str4 = 4 + String.valueOf(str2).length() + String.valueOf(str3).length() + "(" + str2 + ", " + str3 + ")";
          localObject = str4;
        }
        catch (gjd localgjd)
        {
          localObject = "<ACCOUNT NOT FOUND>";
        }
      }
    }
  }
  
  final void a(Map<String, ?> paramMap, ArrayList<String> paramArrayList, String paramString, String... paramVarArgs)
  {
    int i = 0;
    if (i < 9)
    {
      String str1 = paramVarArgs[i];
      a("  ", paramMap, paramString, str1);
      String str2 = String.valueOf(paramString);
      String str3 = String.valueOf(str1);
      if (str3.length() != 0) {}
      for (String str4 = str2.concat(str3);; str4 = new String(str2))
      {
        paramArrayList.remove(str4);
        i++;
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkg
 * JD-Core Version:    0.7.0.1
 */