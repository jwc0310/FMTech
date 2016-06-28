import java.util.ArrayList;
import java.util.HashSet;
import java.util.TimeZone;

public final class hxl
{
  ArrayList<hxm> a = new ArrayList();
  ArrayList<hxm> b = new ArrayList();
  HashSet<String> c = new HashSet();
  
  static String a(TimeZone paramTimeZone, long paramLong)
  {
    String str = String.valueOf(paramTimeZone.getDisplayName());
    return 21 + String.valueOf(str).length() + str + "@" + paramLong;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxl
 * JD-Core Version:    0.7.0.1
 */