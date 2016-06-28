import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;
import java.util.ArrayList;
import java.util.Collections;

final class cdk
  implements cw<Cursor>
{
  cdk(cda paramcda) {}
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    bp localbp = this.a.f();
    int i = this.a.a.c();
    cda localcda = this.a;
    ArrayList localArrayList1 = new ArrayList();
    if (localcda.ak != null)
    {
      localcda.f().getIntent();
      localArrayList1.addAll(Collections.emptyList());
    }
    ipf localipf;
    if ((localcda.c != null) && (localcda.c.size() > 0))
    {
      localipf = ((jpx)localcda.c.get(0)).e();
      if (localcda.c.size() > 1)
      {
        Intent localIntent3 = new Intent();
        localIntent3.setAction("android.intent.action.SEND_MULTIPLE");
        localIntent3.setType(GooglePhotosImageProvider.a(localipf.e));
        localIntent3.addFlags(1);
        localArrayList1.add(localIntent3);
      }
    }
    label585:
    for (;;)
    {
      ArrayList localArrayList2 = cda.a(this.a, false);
      ArrayList localArrayList3 = cda.a(this.a, true);
      boolean bool1;
      if (this.a.v())
      {
        boolean bool2 = TextUtils.isEmpty(this.a.ad);
        bool1 = false;
        if (bool2) {}
      }
      else
      {
        bool1 = true;
      }
      return new ddb(localbp, i, localArrayList1, localArrayList2, localArrayList3, bool1);
      if (localcda.m.getInt("resource_type", -1) != 4)
      {
        if (localipf.d != null)
        {
          mbf localmbf = localcda.bn;
          String str = localipf.d.toString();
          if (!jrp.a(localmbf, jrr.b).b(str)) {}
        }
      }
      else
      {
        Intent localIntent4 = new Intent();
        if (localcda.m.containsKey("geo_lat")) {
          localIntent4.putExtra("latitude", localcda.m.getDouble("geo_lat"));
        }
        if (localcda.m.containsKey("geo_lon")) {
          localIntent4.putExtra("longitude", localcda.m.getDouble("geo_lon"));
        }
        localIntent4.setType("application/vnd.google.panorama360+jpg");
        localIntent4.setAction("android.intent.action.SEND");
        localIntent4.addFlags(1);
        localArrayList1.add(localIntent4);
      }
      Intent localIntent5 = new Intent();
      localIntent5.setAction("android.intent.action.SEND");
      localIntent5.addFlags(1);
      localIntent5.setType(GooglePhotosImageProvider.a(localipf.e));
      localArrayList1.add(localIntent5);
      continue;
      if (localcda.v())
      {
        Intent localIntent1 = new Intent();
        localIntent1.setAction("android.intent.action.SEND");
        localIntent1.setType("text/plain");
        localIntent1.putExtra("android.intent.extra.TEXT", localcda.ad);
        localArrayList1.add(localIntent1);
      }
      else
      {
        if ((localcda.ak == null) && (localcda.m.containsKey("embed_client_item")) && (localcda.ai != null)) {}
        for (int j = 1;; j = 0)
        {
          if (j == 0) {
            break label585;
          }
          Intent localIntent2 = new Intent();
          localIntent2.setAction("android.intent.action.SEND");
          localIntent2.setType("text/plain");
          localIntent2.putExtra("android.intent.extra.TEXT", localcda.ai);
          localArrayList1.add(localIntent2);
          break;
        }
      }
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdk
 * JD-Core Version:    0.7.0.1
 */