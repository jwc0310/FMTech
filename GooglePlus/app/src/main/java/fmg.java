import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

public final class fmg
  extends ehn
  implements fnn
{
  private final Bundle a;
  
  public fmg(DataHolder paramDataHolder, int paramInt, Bundle paramBundle)
  {
    super(paramDataHolder, paramInt);
    this.a = paramBundle;
  }
  
  public final long c()
  {
    return a("_id");
  }
  
  public final String d()
  {
    return d("circle_id");
  }
  
  public final String e()
  {
    int i = g();
    if (i != -1)
    {
      Bundle localBundle = this.a.getBundle("localized_group_names");
      if (localBundle != null)
      {
        String str = localBundle.getString(String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
          return str;
        }
      }
    }
    return d("name");
  }
  
  public final String f()
  {
    return d("sort_key");
  }
  
  public final int g()
  {
    int i = b("type");
    switch (i)
    {
    case 0: 
    default: 
      i = -2;
    }
    return i;
  }
  
  public final int h()
  {
    return b("people_count");
  }
  
  public final long i()
  {
    return a("last_modified");
  }
  
  public final boolean j()
  {
    return c("for_sharing");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmg
 * JD-Core Version:    0.7.0.1
 */