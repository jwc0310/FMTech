import android.widget.Toast;
import com.google.android.apps.plus.phone.HostStreamPhotosHomeTileActivity;

final class cbt
  implements jpe
{
  cbt(cbs paramcbs) {}
  
  public final void a(jpg paramjpg)
  {
    if (paramjpg.a())
    {
      cbs localcbs = this.a;
      gxx localgxx = (gxx)localcbs.bo.a(gxx.class);
      gxw localgxw = new gxw(localcbs.bn);
      localgxw.c = gxz.cP;
      localgxx.a(localgxw);
      int i = localcbs.a.c();
      dbt localdbt = new dbt(localcbs.f(), HostStreamPhotosHomeTileActivity.class, i);
      localdbt.a = Integer.valueOf(2);
      localdbt.e = Integer.valueOf(30);
      localcbs.a(localdbt.a(), 3);
      return;
    }
    Toast.makeText(this.a.bn, aau.tX, 1).show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbt
 * JD-Core Version:    0.7.0.1
 */