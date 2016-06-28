import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

final class ish
  implements guf
{
  ish(isg paramisg) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    ipf localipf;
    label94:
    isg localisg;
    long l;
    String str;
    Uri localUri;
    if ((paramInt == -1) && (paramIntent != null))
    {
      Bundle localBundle = paramIntent.getExtras();
      if (paramIntent.hasExtra("shareables"))
      {
        ArrayList localArrayList = localBundle.getParcelableArrayList("shareables");
        localipf = null;
        if (localArrayList != null)
        {
          int i = localArrayList.size();
          localipf = null;
          if (i > 0) {
            localipf = ((ipa)localArrayList.get(0)).e();
          }
        }
      }
      do
      {
        if (localipf != null) {
          this.a.d.a(localipf);
        }
        return;
        localisg = this.a;
        localipf = null;
      } while (localBundle == null);
      l = localBundle.getLong("photo_id", 0L);
      str = localBundle.getString("photo_url");
      if (TextUtils.isEmpty(str)) {
        break label212;
      }
      localUri = Uri.parse(str);
      if (!mfq.b(localUri)) {
        break label212;
      }
    }
    for (;;)
    {
      if ((l == 0L) && (TextUtils.isEmpty(str)))
      {
        localipf = null;
        if (localUri == null) {
          break;
        }
      }
      localipf = ipf.a(localisg.b, null, l, str, localUri, ipm.a, null);
      break;
      if (paramInt != 0) {
        break label94;
      }
      this.a.d.w();
      return;
      label212:
      localUri = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ish
 * JD-Core Version:    0.7.0.1
 */