import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import java.util.List;

public final class bgu
  implements gqv
{
  private final Context a;
  
  public bgu(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    iev localiev = (iev)mbb.a(this.a, iev.class);
    List localList1 = paramUri.getPathSegments();
    int i = localList1.size();
    if ((localiev.b().equals(paramUri.getHost())) && (i == 4) && (((String)localList1.get(0)).equals("photos")) && (((String)localList1.get(2)).equals("albums"))) {}
    for (int j = 1; j == 0; j = 0) {
      return null;
    }
    List localList2 = paramUri.getPathSegments();
    String str1 = (String)localList2.get(1);
    String str2 = (String)localList2.get(3);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = jrf.a(null, str1, str2, "ALBUM");
    String str3 = jrf.a(3, arrayOfString);
    jqa localjqa = new jqa(this.a, HostStreamSingleAlbumTileActivity.class, paramInt);
    gxx localgxx = (gxx)mbb.a(this.a, gxx.class);
    gxw localgxw = new gxw(this.a);
    localgxw.c = gxz.do;
    localgxx.a(localgxw);
    localjqa.a = str3;
    return localjqa.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bgu
 * JD-Core Version:    0.7.0.1
 */