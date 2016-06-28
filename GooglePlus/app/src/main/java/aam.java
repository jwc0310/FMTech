import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class aam
{
  public static final aam c = new aam(new Bundle(), null);
  public final Bundle a;
  public List<String> b;
  
  aam(Bundle paramBundle, List<String> paramList)
  {
    this.a = paramBundle;
    this.b = paramList;
  }
  
  public static aam a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      return new aam(paramBundle, null);
    }
    return null;
  }
  
  public final void a()
  {
    if (this.b == null)
    {
      this.b = this.a.getStringArrayList("controlCategories");
      if ((this.b == null) || (this.b.isEmpty())) {
        this.b = Collections.emptyList();
      }
    }
  }
  
  public final boolean a(List<IntentFilter> paramList)
  {
    if (paramList != null)
    {
      a();
      int i = this.b.size();
      if (i != 0)
      {
        int j = paramList.size();
        for (int k = 0; k < j; k++)
        {
          IntentFilter localIntentFilter = (IntentFilter)paramList.get(k);
          if (localIntentFilter != null) {
            for (int m = 0; m < i; m++) {
              if (localIntentFilter.hasCategory((String)this.b.get(m))) {
                return true;
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof aam))
    {
      aam localaam = (aam)paramObject;
      a();
      localaam.a();
      return this.b.equals(localaam.b);
    }
    return false;
  }
  
  public final int hashCode()
  {
    a();
    return this.b.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("MediaRouteSelector{ ");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("controlCategories=");
    a();
    localStringBuilder2.append(Arrays.toString(this.b.toArray()));
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aam
 * JD-Core Version:    0.7.0.1
 */