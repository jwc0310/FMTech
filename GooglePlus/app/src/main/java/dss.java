import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public final class dss
  implements gqv
{
  private final iev a;
  private final Context b;
  
  public dss(Context paramContext)
  {
    this.a = ((iev)mbb.a(paramContext, iev.class));
    this.b = paramContext;
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    List localList = paramUri.getPathSegments();
    int i = localList.size();
    boolean bool1 = this.a.b().equals(paramUri.getHost());
    int j = 0;
    if (bool1)
    {
      j = 0;
      if (i == 2)
      {
        boolean bool2 = "communities".equals(localList.get(0));
        j = 0;
        if (bool2) {
          j = 1;
        }
      }
    }
    if (j == 0) {
      return null;
    }
    String str = (String)paramUri.getPathSegments().get(1);
    return ((kyp)mbb.a(this.b, kyp.class)).a(paramInt, str, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dss
 * JD-Core Version:    0.7.0.1
 */