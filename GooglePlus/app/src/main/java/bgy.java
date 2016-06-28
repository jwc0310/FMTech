import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public final class bgy
  implements gqv
{
  private final Context a;
  
  public bgy(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    iev localiev = (iev)mbb.a(this.a, iev.class);
    List localList1 = paramUri.getPathSegments();
    int i = localList1.size();
    if ((localiev.b().equals(paramUri.getHost())) && (i == 5) && (((String)localList1.get(0)).equals("photos")) && (((String)localList1.get(2)).equals("albums"))) {}
    for (int j = 1; j == 0; j = 0) {
      return null;
    }
    List localList2 = paramUri.getPathSegments();
    String str1 = (String)localList2.get(1);
    String str2 = (String)localList2.get(3);
    String str3 = (String)localList2.get(4);
    bdo localbdo = new bdo(this.a, paramInt);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = jrf.a(null, str1, str2, "ALBUM");
    String str4 = jrf.a(3, arrayOfString);
    localbdo.d = str3;
    localbdo.e = str4;
    localbdo.n = Boolean.valueOf(true);
    localbdo.k = Boolean.valueOf(true);
    localbdo.v = Boolean.valueOf(true);
    Bundle localBundle = gxy.a("extra_gaia_id", str1);
    gxx localgxx = (gxx)mbb.a(this.a, gxx.class);
    gxw localgxw = new gxw(this.a, paramInt);
    localgxw.c = gxz.aa;
    if (localBundle != null) {
      localgxw.h.putAll(localBundle);
    }
    localgxx.a(localgxw);
    return localbdo.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bgy
 * JD-Core Version:    0.7.0.1
 */