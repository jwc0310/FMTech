import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class aad
{
  final Bundle a;
  private ArrayList<IntentFilter> b;
  
  public aad(aac paramaac)
  {
    if (paramaac == null) {
      throw new IllegalArgumentException("descriptor must not be null");
    }
    this.a = new Bundle(paramaac.a);
    paramaac.a();
    if (!paramaac.b.isEmpty()) {
      this.b = new ArrayList(paramaac.b);
    }
  }
  
  public aad(String paramString1, String paramString2)
  {
    this.a = new Bundle();
    this.a.putString("id", paramString1);
    this.a.putString("name", paramString2);
  }
  
  public final aac a()
  {
    if (this.b != null) {
      this.a.putParcelableArrayList("controlFilters", this.b);
    }
    return new aac(this.a, this.b);
  }
  
  public final aad a(Collection<IntentFilter> paramCollection)
  {
    if (paramCollection == null) {
      throw new IllegalArgumentException("filters must not be null");
    }
    if (!paramCollection.isEmpty())
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        IntentFilter localIntentFilter = (IntentFilter)localIterator.next();
        if (localIntentFilter == null) {
          throw new IllegalArgumentException("filter must not be null");
        }
        if (this.b == null) {
          this.b = new ArrayList();
        }
        if (!this.b.contains(localIntentFilter)) {
          this.b.add(localIntentFilter);
        }
      }
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aad
 * JD-Core Version:    0.7.0.1
 */