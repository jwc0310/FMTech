import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class jpg
{
  private final List<jpf> a = new ArrayList();
  
  public jpg(String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0;
    if (i < paramArrayOfString.length)
    {
      if (paramArrayOfInt[i] == 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.a.add(new jpf(paramArrayOfString[i], bool));
        i++;
        break;
      }
    }
  }
  
  public final boolean a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      if (!((jpf)localIterator.next()).b) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean a(String paramString)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      jpf localjpf = (jpf)localIterator.next();
      if (localjpf.a.equals(paramString)) {
        return localjpf.b;
      }
    }
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "Permission not requested: ".concat(str1);; str2 = new String("Permission not requested: ")) {
      throw new IllegalArgumentException(str2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jpg
 * JD-Core Version:    0.7.0.1
 */