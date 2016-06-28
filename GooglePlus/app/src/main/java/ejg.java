import java.util.ArrayList;
import java.util.List;

public final class ejg
{
  private final List<String> a;
  private final Object b;
  
  public ejg(Object paramObject)
  {
    this.b = efj.a(paramObject);
    this.a = new ArrayList();
  }
  
  public final ejg a(String paramString, Object paramObject)
  {
    this.a.add((String)efj.a(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.a.get(j));
      if (j < i - 1) {
        localStringBuilder.append(", ");
      }
    }
    return '}';
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ejg
 * JD-Core Version:    0.7.0.1
 */