import android.os.Bundle;
import android.widget.Toast;

final class cfz
  implements gzi
{
  cfz(cfy paramcfy) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("ReadCollectionAudienceTask".equals(paramString)) {
      if (paramhae.b == 200) {
        break label45;
      }
    }
    label45:
    for (int i = 1; i != 0; i = 0)
    {
      Toast.makeText(this.a.f(), aau.mm, 1).show();
      return;
    }
    Bundle localBundle = paramhae.a();
    this.a.b = ((gnb)localBundle.getParcelable("audience"));
    this.a.c = ((gnb)localBundle.getParcelable("people_list"));
    this.a.P();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfz
 * JD-Core Version:    0.7.0.1
 */