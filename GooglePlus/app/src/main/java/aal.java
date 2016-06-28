import android.os.Bundle;
import java.util.ArrayList;

public final class aal
{
  private final Bundle a = new Bundle();
  private ArrayList<aac> b;
  
  public final aak a()
  {
    if (this.b != null)
    {
      int i = this.b.size();
      ArrayList localArrayList = new ArrayList(i);
      for (int j = 0; j < i; j++) {
        localArrayList.add(((aac)this.b.get(j)).a);
      }
      this.a.putParcelableArrayList("routes", localArrayList);
    }
    return new aak(this.a, this.b);
  }
  
  public final aal a(aac paramaac)
  {
    if (paramaac == null) {
      throw new IllegalArgumentException("route must not be null");
    }
    if (this.b == null) {
      this.b = new ArrayList();
    }
    while (!this.b.contains(paramaac))
    {
      this.b.add(paramaac);
      return this;
    }
    throw new IllegalArgumentException("route descriptor already added");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aal
 * JD-Core Version:    0.7.0.1
 */