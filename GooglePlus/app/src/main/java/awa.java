import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

final class awa
  implements bfg
{
  awa(avz paramavz) {}
  
  public final void a()
  {
    avz localavz = this.a;
    bcp localbcp = localavz.b.b;
    if (localbcp.t())
    {
      bdk localbdk = localavz.b;
      localbdk.e = false;
      localbdk.a.a();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localbcp.d());
      int i = localavz.m.getInt("account_id", -1);
      Intent localIntent = efj.b(localavz.f(), i, localArrayList);
      localIntent.putExtra("resource_type", localavz.b.f);
      ojf localojf = localavz.b.b.g();
      if ((localojf != null) && (localojf.u != null))
      {
        localIntent.putExtra("geo_lat", localojf.u.a);
        localIntent.putExtra("geo_lon", localojf.u.b);
      }
      localavz.a(localIntent);
      localavz.f().overridePendingTransition(efj.iK, 0);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     awa
 * JD-Core Version:    0.7.0.1
 */