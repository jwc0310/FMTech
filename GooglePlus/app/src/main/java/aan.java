import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class aan
{
  private ArrayList<String> a;
  
  public aan() {}
  
  public aan(aam paramaam)
  {
    if (paramaam == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    paramaam.a();
    if (!paramaam.b.isEmpty()) {
      this.a = new ArrayList(paramaam.b);
    }
  }
  
  private aan a(Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      throw new IllegalArgumentException("categories must not be null");
    }
    if (!paramCollection.isEmpty())
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext()) {
        a((String)localIterator.next());
      }
    }
    return this;
  }
  
  public final aam a()
  {
    if (this.a == null) {
      return aam.c;
    }
    Bundle localBundle = new Bundle();
    localBundle.putStringArrayList("controlCategories", this.a);
    return new aam(localBundle, this.a);
  }
  
  public final aan a(aam paramaam)
  {
    if (paramaam == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    paramaam.a();
    a(paramaam.b);
    return this;
  }
  
  public final aan a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("category must not be null");
    }
    if (this.a == null) {
      this.a = new ArrayList();
    }
    if (!this.a.contains(paramString)) {
      this.a.add(paramString);
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aan
 * JD-Core Version:    0.7.0.1
 */