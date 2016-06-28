import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.plus.phone.HostStreamOneUpActivity;
import java.util.List;

public final class bgx
  implements gqv
{
  private final Context a;
  
  public bgx(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    iev localiev = (iev)mbb.a(this.a, iev.class);
    List localList = paramUri.getPathSegments();
    int i = localList.size();
    if ((localiev.b().equals(paramUri.getHost())) && (i == 2) && (((String)localList.get(0)).equals("post"))) {}
    for (int j = 1; j == 0; j = 0) {
      return null;
    }
    String str = (String)paramUri.getPathSegments().get(1);
    Intent localIntent = new Intent(this.a, HostStreamOneUpActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("activity_id", str);
    localIntent.putExtra("refresh", false);
    return localIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bgx
 * JD-Core Version:    0.7.0.1
 */