import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ejt
{
  static
  {
    Pattern.compile("\\\\.");
    Pattern.compile("[\\\\\"/\b\f\n\r\t]");
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    boolean bool1;
    if ((paramObject1 == null) && (paramObject2 == null)) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      JSONObject localJSONObject1;
      JSONObject localJSONObject2;
      Iterator localIterator;
      if (paramObject1 != null)
      {
        bool1 = false;
        if (paramObject2 != null) {
          if (((paramObject1 instanceof JSONObject)) && ((paramObject2 instanceof JSONObject)))
          {
            localJSONObject1 = (JSONObject)paramObject1;
            localJSONObject2 = (JSONObject)paramObject2;
            int m = localJSONObject1.length();
            int n = localJSONObject2.length();
            bool1 = false;
            if (m != n) {
              continue;
            }
            localIterator = localJSONObject1.keys();
          }
        }
      }
      for (;;)
      {
        String str;
        if (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          boolean bool3 = localJSONObject2.has(str);
          bool1 = false;
          if (!bool3) {
            break;
          }
        }
        JSONArray localJSONArray1;
        JSONArray localJSONArray2;
        int i;
        int j;
        int k;
        boolean bool2;
        try
        {
          boolean bool4 = a(localJSONObject1.get(str), localJSONObject2.get(str));
          if (!bool4) {
            return false;
          }
        }
        catch (JSONException localJSONException2) {}
      }
      return true;
      if ((!(paramObject1 instanceof JSONArray)) || (!(paramObject2 instanceof JSONArray))) {
        break label238;
      }
      localJSONArray1 = (JSONArray)paramObject1;
      localJSONArray2 = (JSONArray)paramObject2;
      i = localJSONArray1.length();
      j = localJSONArray2.length();
      bool1 = false;
      if (i == j)
      {
        k = 0;
        if (k >= localJSONArray1.length()) {}
      }
      try
      {
        bool2 = a(localJSONArray1.get(k), localJSONArray2.get(k));
        bool1 = false;
        if (bool2) {
          k++;
        }
      }
      catch (JSONException localJSONException1)
      {
        label238:
        return false;
      }
    }
    return true;
    return paramObject1.equals(paramObject2);
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ejt
 * JD-Core Version:    0.7.0.1
 */