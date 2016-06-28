import android.content.Intent;
import android.net.Uri;

final class aya
  implements guf
{
  aya(axz paramaxz) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if ((paramInt == -1) && (paramIntent != null))
    {
      oih localoih = axz.b(paramIntent);
      if (localoih == null) {
        break label125;
      }
      this.a.aa = true;
      localbdk = this.a.Z;
      localmbf = this.a.bn;
      localbcp = localbdk.b.b(localoih);
      localbcp.a(localmbf);
      localbdk.b = localbcp;
      localbdk.a.a();
      localjpx = this.a.Z.b.a(localoih);
      this.a.a.c(localjpx);
    }
    label125:
    while (paramIntent.getData() == null)
    {
      bdk localbdk;
      mbf localmbf;
      bcp localbcp;
      jpx localjpx;
      return;
    }
    axz localaxz = this.a;
    Uri localUri = paramIntent.getData();
    if (paramIntent.hasExtra("bucket_id")) {}
    for (String str = jrf.k(String.valueOf(paramIntent.getIntExtra("bucket_id", 0)));; str = null)
    {
      ipf localipf = ipf.a(localaxz.f().getApplicationContext(), localUri, ipm.a);
      localaxz.b.a(localipf, str);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aya
 * JD-Core Version:    0.7.0.1
 */