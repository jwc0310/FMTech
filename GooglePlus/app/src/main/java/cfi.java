import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

final class cfi
  implements guf
{
  cfi(cff paramcff) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    cff localcff;
    isq localisq;
    bp localbp;
    Bundle localBundle;
    int i;
    jpu localjpu;
    Intent localIntent;
    if (paramInt == -1)
    {
      Toast.makeText(this.a.f(), aau.uT, 0).show();
      this.a.al.a();
      localcff = this.a;
      Uri localUri = paramIntent.getData();
      localisq = localcff.az.b;
      localbp = localcff.f();
      if ((localbp != null) && (localUri != null))
      {
        localBundle = localcff.m;
        i = 0;
        if (localBundle != null) {
          break label177;
        }
        if (i == 0)
        {
          String str = jrf.a();
          localjpu = new jpu(str, str, ipf.a(localbp, localUri, ipm.b), 4096L, 0L);
          localIntent = new Intent();
          if (localisq != null) {
            break label190;
          }
        }
      }
    }
    label177:
    label190:
    for (ArrayList localArrayList = new ArrayList(1);; localArrayList = localisq.a(jpx.class))
    {
      localArrayList.add(localjpu);
      localIntent.putExtra("shareables", localArrayList);
      localcff.f().setResult(-1, localIntent);
      localbp.finish();
      return;
      i = localBundle.getInt("photo_picker_crop_mode", 0);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfi
 * JD-Core Version:    0.7.0.1
 */