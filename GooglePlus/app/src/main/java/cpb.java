import android.content.Context;
import android.net.Uri;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;
import java.util.ArrayList;

public final class cpb
  implements cil
{
  public final Uri[] a(Context paramContext)
  {
    isq localisq = ((aud)mbb.a(paramContext, aud.class)).b;
    if ((paramContext == null) || (localisq == null) || (localisq.b == 0)) {
      return null;
    }
    ArrayList localArrayList = localisq.a(jpx.class);
    int i = localArrayList.size();
    Uri[] arrayOfUri = new Uri[i];
    int j = i - 1;
    if (j >= 0)
    {
      ipf localipf = ((jpx)localArrayList.get(j)).e();
      int k;
      if (localipf.d != null)
      {
        k = 1;
        label88:
        if (k == 0) {
          break label115;
        }
        arrayOfUri[j] = localipf.d;
      }
      label170:
      for (;;)
      {
        j--;
        break;
        k = 0;
        break label88;
        label115:
        if (localipf.c != null) {}
        for (int m = 1;; m = 0)
        {
          if (m == 0) {
            break label170;
          }
          Uri localUri = GooglePhotosImageProvider.a(paramContext, localipf.c, localipf.e);
          paramContext.grantUriPermission("com.android.bluetooth", localUri, 1);
          arrayOfUri[j] = localUri;
          break;
        }
      }
    }
    return arrayOfUri;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpb
 * JD-Core Version:    0.7.0.1
 */