import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class aak
{
  List<aac> a;
  private final Bundle b;
  
  aak(Bundle paramBundle, List<aac> paramList)
  {
    this.b = paramBundle;
    this.a = paramList;
  }
  
  public static aak a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      return new aak(paramBundle, null);
    }
    return null;
  }
  
  public final List<aac> a()
  {
    b();
    return this.a;
  }
  
  final void b()
  {
    ArrayList localArrayList;
    if (this.a == null)
    {
      localArrayList = this.b.getParcelableArrayList("routes");
      if ((localArrayList == null) || (localArrayList.isEmpty())) {
        this.a = Collections.emptyList();
      }
    }
    else
    {
      return;
    }
    int i = localArrayList.size();
    this.a = new ArrayList(i);
    int j = 0;
    label55:
    List localList;
    Bundle localBundle;
    if (j < i)
    {
      localList = this.a;
      localBundle = (Bundle)localArrayList.get(j);
      if (localBundle == null) {
        break label109;
      }
    }
    label109:
    for (aac localaac = new aac(localBundle, null);; localaac = null)
    {
      localList.add(localaac);
      j++;
      break label55;
      break;
    }
  }
  
  public final boolean c()
  {
    b();
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      aac localaac = (aac)this.a.get(j);
      if ((localaac == null) || (!localaac.b())) {
        return false;
      }
    }
    return true;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MediaRouteProviderDescriptor{ ");
    localStringBuilder.append("routes=").append(Arrays.toString(a().toArray()));
    localStringBuilder.append(", isValid=").append(c());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aak
 * JD-Core Version:    0.7.0.1
 */