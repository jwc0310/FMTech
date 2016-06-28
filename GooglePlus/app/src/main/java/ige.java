import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

final class ige
{
  final Map<ify, igf> a = new HashMap();
  final igf b = new igf(null);
  
  private static void a(igf paramigf)
  {
    paramigf.a.b = paramigf.b;
    paramigf.b.a = paramigf.a;
  }
  
  public final Bitmap a()
  {
    for (igf localigf = this.b.b; localigf != this.b; localigf = localigf.b)
    {
      if (localigf.a() > 0) {
        return localigf.b();
      }
      this.a.remove(localigf.c);
      a(localigf);
    }
    return null;
  }
  
  public final Bitmap a(ify paramify)
  {
    igf localigf = (igf)this.a.get(paramify);
    if (localigf == null)
    {
      localigf = new igf(paramify);
      this.a.put(paramify, localigf);
    }
    for (;;)
    {
      localigf.b = this.b;
      localigf.a = this.b.a;
      localigf.a.b = localigf;
      this.b.a = localigf;
      return localigf.b();
      a(localigf);
    }
  }
  
  public final String toString()
  {
    igf localigf = this.b.a;
    String str1 = "GroupedLinkedMap(";
    if (!this.a.isEmpty())
    {
      while (localigf != this.b)
      {
        String str2 = String.valueOf(str1);
        String str3 = String.valueOf(localigf.c);
        int i = localigf.a();
        str1 = 16 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + "{" + str3 + ", " + i + "} ";
        localigf = localigf.a;
      }
      str1 = str1.substring(0, -1 + str1.length());
    }
    return String.valueOf(str1).concat(")");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ige
 * JD-Core Version:    0.7.0.1
 */