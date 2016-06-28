import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.Toast;

final class cau
  implements gzi
{
  cau(cat paramcat) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (this.a.f() == null) || (this.a.f().isFinishing())) {}
    do
    {
      return;
      if ("UpdateCollectionTask".equals(paramString))
      {
        cat localcat2 = this.a;
        if (paramhae.b != 200) {}
        for (int j = 1; j == 0; j = 0)
        {
          bp localbp = localcat2.f();
          localbp.setResult(-1);
          localbp.finish();
          Toast.makeText(localcat2.f(), aau.ce, 0).show();
          return;
        }
        Toast.makeText(localcat2.f(), aau.sD, 1).show();
        return;
      }
    } while (!"UpdateCollectionShareLinkTask".equals(paramString));
    cat localcat1 = this.a;
    int i;
    if (paramhae.b != 200) {
      i = 1;
    }
    while (i == 0)
    {
      Bundle localBundle = paramhae.a();
      boolean bool = localBundle.getBoolean("allow_share_via_link");
      localcat1.b = localBundle.getString("album_link_url");
      if (bool)
      {
        localcat1.ab.setChecked(false);
        localcat1.w();
        return;
        i = 0;
      }
      else
      {
        Toast.makeText(localcat1.f(), aau.ce, 1).show();
        return;
      }
    }
    Toast.makeText(localcat1.f(), aau.sD, 1).show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cau
 * JD-Core Version:    0.7.0.1
 */