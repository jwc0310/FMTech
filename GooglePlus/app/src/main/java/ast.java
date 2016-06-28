import java.util.ArrayList;
import java.util.List;

public final class ast
{
  public ArrayList<asu> a = new ArrayList();
  public boolean b;
  public int c = 0;
  
  public final long a()
  {
    if (this.a.isEmpty()) {
      return 0L;
    }
    asu localasu = (asu)this.a.get(-1 + this.a.size());
    if (localasu.b.isEmpty()) {
      return 0L;
    }
    return ((Long)localasu.b.get(-1 + localasu.b.size())).longValue();
  }
  
  public final void a(asu paramasu)
  {
    this.c += paramasu.a.size();
    this.a.add(paramasu);
  }
  
  public final long b()
  {
    if (this.a.isEmpty()) {
      return 0L;
    }
    asu localasu = (asu)this.a.get(0);
    if (localasu.b.isEmpty()) {
      return 0L;
    }
    return ((Long)localasu.b.get(0)).longValue();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ast
 * JD-Core Version:    0.7.0.1
 */