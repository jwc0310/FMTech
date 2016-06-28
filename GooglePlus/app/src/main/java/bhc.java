import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public final class bhc
  implements gqv
{
  private final Context a;
  private final iev b;
  
  public bhc(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((iev)mbb.a(paramContext, iev.class));
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    if (this.b.b().equals(paramUri.getHost()))
    {
      List localList = paramUri.getPathSegments();
      if (localList.size() == 1)
      {
        String str = (String)localList.get(0);
        if ((!str.equals("hot")) && (!str.equals("explore"))) {}
      }
    }
    for (int i = 1; i == 0; i = 0) {
      return null;
    }
    return efj.i(this.a, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bhc
 * JD-Core Version:    0.7.0.1
 */