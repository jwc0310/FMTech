import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public final class bgz
  implements gqv
{
  private final Context a;
  
  public bgz(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    iev localiev = (iev)mbb.a(this.a, iev.class);
    List localList = paramUri.getPathSegments();
    int i = localList.size();
    if ((localiev.b().equals(paramUri.getHost())) && (i == 1) && (((String)localList.get(0)).matches("\\d+"))) {}
    for (int j = 1; j == 0; j = 0) {
      return null;
    }
    String str = (String)paramUri.getPathSegments().get(0);
    return efj.a(this.a, paramInt, str, null, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bgz
 * JD-Core Version:    0.7.0.1
 */