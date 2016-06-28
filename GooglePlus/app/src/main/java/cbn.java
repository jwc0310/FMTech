import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import java.util.ArrayList;

final class cbn
  implements afw
{
  private final String a;
  private final ArrayList<? extends jpx> b;
  private final int c;
  private final int d;
  private final Activity e;
  private final Context f;
  
  public cbn(Context paramContext, Activity paramActivity, int paramInt1, String paramString, int paramInt2, ArrayList<? extends jpx> paramArrayList)
  {
    this.f = paramContext;
    this.e = paramActivity;
    this.a = paramString;
    this.b = paramArrayList;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aaw.ju)
    {
      localIntent2 = efj.b(this.f, this.c, this.b);
      this.e.startActivity(localIntent2);
      this.e.overridePendingTransition(efj.iK, 0);
    }
    while (paramMenuItem.getItemId() != aaw.jt)
    {
      Intent localIntent2;
      return true;
    }
    jqa localjqa = new jqa(this.e, HostStreamSingleAlbumTileActivity.class, this.c);
    localjqa.a = this.a;
    localjqa.c = Integer.valueOf(4);
    localjqa.d = Integer.valueOf(this.d);
    localjqa.l = Boolean.valueOf(true);
    Intent localIntent1 = localjqa.a();
    this.e.startActivity(localIntent1);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbn
 * JD-Core Version:    0.7.0.1
 */