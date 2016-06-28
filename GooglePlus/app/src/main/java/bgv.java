import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.net.URLDecoder;
import java.util.List;

public final class bgv
  implements gqv
{
  private final iev a;
  private final Context b;
  
  public bgv(Context paramContext)
  {
    this.a = ((iev)mbb.a(paramContext, iev.class));
    this.b = paramContext;
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    List localList = paramUri.getPathSegments();
    int i = localList.size();
    if ((this.a.b().equals(paramUri.getHost())) && (i == 2) && ("s".equals(localList.get(0))) && (URLDecoder.decode((String)localList.get(1)).startsWith("#"))) {}
    for (int j = 1; j == 0; j = 0) {
      return null;
    }
    String str = URLDecoder.decode((String)paramUri.getPathSegments().get(1));
    return efj.j(this.b, paramInt, str);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bgv
 * JD-Core Version:    0.7.0.1
 */