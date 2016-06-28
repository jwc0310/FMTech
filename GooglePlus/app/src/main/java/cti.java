import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.List;

final class cti
  implements Runnable
{
  cti(cta paramcta) {}
  
  public final void run()
  {
    cta localcta;
    List localList;
    boolean bool;
    mbf localmbf;
    int i;
    int j;
    int k;
    iiy localiiy;
    if (this.a.y())
    {
      cta.a(this.a);
      localcta = this.a;
      if ((!localcta.ag) && (localcta.ab != null) && (localcta.ab.length > 0))
      {
        localList = localcta.ac;
        if (!localList.isEmpty()) {
          break label211;
        }
        bool = true;
        if (bool)
        {
          localmbf = localcta.bn;
          i = aau.hW;
          j = aau.hV;
          k = aau.id;
          localiiy = new iiy();
          if (0 == 0) {
            break label262;
          }
        }
      }
    }
    label262:
    for (Spanned localSpanned = Html.fromHtml(localmbf.getString(j, new Object[] { null }));; localSpanned = Html.fromHtml(localmbf.getString(j)))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("arg_title_text", localmbf.getString(i));
      localBundle.putCharSequence("arg_message_text", localSpanned);
      localBundle.putString("arg_positive_button_text", localmbf.getString(k));
      localBundle.putString("arg_negative_button_text", localmbf.getString(17039360));
      localiiy.f(localBundle);
      localiiy.n = localcta;
      localiiy.p = 0;
      localcta.ag = true;
      localcta.a(localiiy, "hflf_all_filtered");
      return;
      label211:
      if (localList.size() == 1)
      {
        bool = TextUtils.equals(localcta.b.f().b("gaia_id"), ((nve)localList.get(0)).a);
        break;
      }
      bool = false;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cti
 * JD-Core Version:    0.7.0.1
 */