import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

public final class dav
  implements irl, mbo, mfd
{
  private final Context a;
  private gug b;
  
  dav(Activity paramActivity, mek parammek)
  {
    parammek.a(this);
    this.a = paramActivity;
  }
  
  public final ipf a(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("photo_url");
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    switch (paramIntent.getIntExtra("media_type", 1))
    {
    }
    long l;
    for (ipm localipm = ipm.a;; localipm = ipm.b)
    {
      l = paramIntent.getLongExtra("photo_id", 0L);
      if (l != 0L) {
        break;
      }
      return ipf.a(this.a, Uri.parse(str), localipm);
    }
    return ipf.a(this.a, null, l, str, null, localipm, null);
  }
  
  public final void a(int paramInt, guf paramguf)
  {
    this.b.a(paramInt, paramguf);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((gug)parammbb.a(gug.class));
  }
  
  public final boolean a()
  {
    return duj.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dav
 * JD-Core Version:    0.7.0.1
 */