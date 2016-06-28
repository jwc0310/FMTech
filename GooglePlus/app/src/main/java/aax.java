import android.content.ComponentName;
import java.util.ArrayList;

public final class aax
{
  final aaf a;
  final ArrayList<aay> b = new ArrayList();
  final aai c;
  aak d;
  
  aax(aaf paramaaf)
  {
    this.a = paramaaf;
    this.c = paramaaf.b;
  }
  
  final int a(String paramString)
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++) {
      if (((aay)this.b.get(j)).b.equals(paramString)) {
        return j;
      }
    }
    return -1;
  }
  
  public final String toString()
  {
    return "MediaRouter.RouteProviderInfo{ packageName=" + this.c.a.getPackageName() + " }";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aax
 * JD-Core Version:    0.7.0.1
 */