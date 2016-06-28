import android.content.Context;
import android.net.Uri;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;

public final class bfp
  implements cil
{
  private final cpb a = new cpb();
  
  public final Uri[] a(Context paramContext)
  {
    Uri[] arrayOfUri1 = this.a.a(paramContext);
    if (arrayOfUri1 != null) {
      return arrayOfUri1;
    }
    bdk localbdk = ((bdl)mbb.a(paramContext, bdl.class)).a;
    if ((localbdk == null) || (localbdk.b == null) || (localbdk.b.a() == null)) {
      return null;
    }
    ipf localipf = localbdk.b.a();
    Uri[] arrayOfUri2 = new Uri[1];
    if (localipf.d != null) {}
    for (int i = 1; i != 0; i = 0)
    {
      arrayOfUri2[0] = localipf.d;
      return arrayOfUri2;
    }
    arrayOfUri2[0] = GooglePhotosImageProvider.a(paramContext, localipf.c, localipf.e);
    paramContext.grantUriPermission("com.android.bluetooth", arrayOfUri2[0], 1);
    return arrayOfUri2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bfp
 * JD-Core Version:    0.7.0.1
 */