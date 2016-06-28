import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public final class hir
  implements gqv
{
  private final Context a;
  
  public hir(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    hpo localhpo = (hpo)mbb.b(this.a, hpo.class);
    if (localhpo != null)
    {
      if (paramUri == null) {
        break label96;
      }
      List localList = paramUri.getPathSegments();
      if ((!((iev)mbb.a(this.a, iev.class)).b().equals(paramUri.getHost())) || (localList.size() != 2) || (!((String)localList.get(0)).equals("collection"))) {
        break label96;
      }
    }
    label96:
    for (int i = 1; i == 0; i = 0) {
      return null;
    }
    return localhpo.a(paramInt, (String)paramUri.getPathSegments().get(1), null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hir
 * JD-Core Version:    0.7.0.1
 */