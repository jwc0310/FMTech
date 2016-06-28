import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

final class cdi
  implements gzi
{
  cdi(cda paramcda) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (!"CreateShareByLinkTask".equals(paramString)) {
      return;
    }
    if (paramhae != null) {
      if (paramhae.b == 200) {
        break label41;
      }
    }
    label41:
    for (int i = 1; i != 0; i = 0)
    {
      Log.e("HostedMiniShareFragment", "Error getting sharing link");
      return;
    }
    String str = paramhae.a().getString("link");
    if (this.a.ac.getExtras().containsKey("android.intent.extra.STREAM")) {
      this.a.ac.removeExtra("android.intent.extra.STREAM");
    }
    this.a.ac.addFlags(268435456);
    this.a.ac.putExtra("android.intent.extra.TEXT", str);
    this.a.ac.setType("text/plain");
    this.a.ab.startAnimation(this.a.ae);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdi
 * JD-Core Version:    0.7.0.1
 */