import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class eyv
{
  private static final edm a = new edm("MetadataUtils");
  private static final String[] b = { "Z", "+hh", "+hhmm", "+hh:mm" };
  private static final String c = "yyyyMMdd'T'HHmmss" + b[0];
  
  public static Calendar a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      a.a("Input string is empty or null", new Object[0]);
      return null;
    }
    String str1 = b(paramString);
    if (TextUtils.isEmpty(str1))
    {
      a.a("Invalid date format", new Object[0]);
      return null;
    }
    String str2 = c(paramString);
    String str3 = "yyyyMMdd";
    if (!TextUtils.isEmpty(str2))
    {
      str1 = str1 + "T" + str2;
      if (str2.length() != 6) {
        break label127;
      }
    }
    for (str3 = "yyyyMMdd'T'HHmmss";; str3 = c)
    {
      Calendar localCalendar = GregorianCalendar.getInstance();
      try
      {
        Date localDate = new SimpleDateFormat(str3).parse(str1);
        localCalendar.setTime(localDate);
        return localCalendar;
      }
      catch (ParseException localParseException)
      {
        label127:
        edm localedm = a;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localParseException.getMessage();
        localedm.a("Error parsing string: %s", arrayOfObject);
      }
    }
    return null;
  }
  
  /* Error */
  public static void a(List<WebImage> paramList, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 114 1 0
    //   6: aload_1
    //   7: ldc 116
    //   9: invokevirtual 122	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   12: astore_3
    //   13: aload_3
    //   14: invokevirtual 125	org/json/JSONArray:length	()I
    //   17: istore 4
    //   19: iconst_0
    //   20: istore 5
    //   22: iload 5
    //   24: iload 4
    //   26: if_icmpge +34 -> 60
    //   29: aload_3
    //   30: iload 5
    //   32: invokevirtual 129	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   35: astore 6
    //   37: aload_0
    //   38: new 131	com/google/android/gms/common/images/WebImage
    //   41: dup
    //   42: aload 6
    //   44: invokespecial 134	com/google/android/gms/common/images/WebImage:<init>	(Lorg/json/JSONObject;)V
    //   47: invokeinterface 138 2 0
    //   52: pop
    //   53: iinc 5 1
    //   56: goto -34 -> 22
    //   59: astore_2
    //   60: return
    //   61: astore 7
    //   63: goto -10 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	paramList	List<WebImage>
    //   0	66	1	paramJSONObject	JSONObject
    //   59	1	2	localJSONException	JSONException
    //   12	18	3	localJSONArray	JSONArray
    //   17	10	4	i	int
    //   20	34	5	j	int
    //   35	8	6	localJSONObject	JSONObject
    //   61	1	7	localIllegalArgumentException	java.lang.IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   0	19	59	org/json/JSONException
    //   29	37	59	org/json/JSONException
    //   37	53	59	org/json/JSONException
    //   37	53	61	java/lang/IllegalArgumentException
  }
  
  public static void a(JSONObject paramJSONObject, List<WebImage> paramList)
  {
    JSONArray localJSONArray;
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      localJSONArray = new JSONArray();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((WebImage)localIterator.next()).a());
      }
    }
    try
    {
      paramJSONObject.put("images", localJSONArray);
      return;
    }
    catch (JSONException localJSONException) {}
  }
  
  private static String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      a.a("Input string is empty or null", new Object[0]);
      return null;
    }
    try
    {
      String str = paramString.substring(0, 8);
      return str;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      edm localedm = a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localIndexOutOfBoundsException.getMessage();
      localedm.b("Error extracting the date: %s", arrayOfObject);
    }
    return null;
  }
  
  private static String c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      a.a("string is empty or null", new Object[0]);
    }
    String str;
    do
    {
      int m;
      do
      {
        return null;
        int i = paramString.indexOf('T');
        int j = i + 1;
        if (i != 8)
        {
          a.a("T delimeter is not found", new Object[0]);
          return null;
        }
        try
        {
          str = paramString.substring(j);
          if (str.length() == 6) {
            return str;
          }
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          edm localedm = a;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localIndexOutOfBoundsException.getMessage();
          localedm.a("Error extracting the time substring: %s", arrayOfObject);
          return null;
        }
        switch (str.charAt(6))
        {
        default: 
          return null;
        case '+': 
        case '-': 
          int k = str.length();
          if ((k != 6 + b[1].length()) && (k != 6 + b[2].length()))
          {
            int n = 6 + b[3].length();
            m = 0;
            if (k != n) {}
          }
          else
          {
            m = 1;
          }
          break;
        }
      } while (m == 0);
      return str.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
    } while (str.length() != 6 + b[0].length());
    return str.substring(0, -1 + str.length()) + "+0000";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyv
 * JD-Core Version:    0.7.0.1
 */