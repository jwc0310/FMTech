import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.plus.service.EsService;
import java.util.ArrayList;

final class bdy
  implements avi
{
  bdy(bdp parambdp) {}
  
  public final void a(ipf paramipf, String paramString)
  {
    boolean bool;
    int i;
    label30:
    String str1;
    Resources localResources2;
    if (paramipf.e == ipm.b)
    {
      bool = true;
      Resources localResources1 = this.a.g();
      if (!bool) {
        break label197;
      }
      i = efj.xP;
      str1 = localResources1.getQuantityString(i, 1);
      localResources2 = this.a.g();
      if (!bool) {
        break label205;
      }
    }
    label197:
    label205:
    for (int j = efj.xN;; j = efj.xK)
    {
      String str2 = localResources2.getQuantityString(j, 1);
      bdp localbdp1 = this.a;
      int k = aau.vS;
      String str3 = localbdp1.g().getString(k);
      bdp localbdp2 = this.a;
      int m = aau.ly;
      lut locallut = lut.b(str1, str2, str3, localbdp2.g().getString(m));
      locallut.m.putString("tile_id", paramString);
      locallut.m.putString("owner_id", paramipf.b.b);
      locallut.n = this.a;
      locallut.p = 0;
      locallut.m.putBoolean("is_video", bool);
      locallut.a(this.a.x, "perm_delete_photo");
      return;
      bool = false;
      break;
      i = efj.xM;
      break label30;
    }
  }
  
  public final void a(isp paramisp)
  {
    isq localisq = new isq();
    localisq.a(paramisp);
    this.a.aw.a(localisq, true);
  }
  
  public final void b(ipf paramipf, String paramString)
  {
    int i;
    bdp localbdp2;
    Resources localResources;
    if (paramipf.e == ipm.b)
    {
      i = 1;
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(paramString);
      bdp localbdp1 = this.a;
      mbf localmbf = this.a.bn;
      int j = this.a.am.c();
      String str1 = paramipf.b.b;
      Intent localIntent = EsService.e.a(localmbf, EsService.class);
      localIntent.putExtra("op", 80);
      localIntent.putExtra("account_id", j);
      localIntent.putExtra("gaia_id", str1);
      localIntent.putExtra("tile_ids", localArrayList);
      localIntent.putExtra("delete_duplicates", false);
      localIntent.putExtra("delete_type", 3);
      localbdp1.a = Integer.valueOf(EsService.a(localmbf, localIntent));
      localbdp2 = this.a;
      localResources = this.a.g();
      if (i == 0) {
        break label209;
      }
    }
    label209:
    for (int k = efj.yb;; k = efj.ya)
    {
      String str2 = localResources.getQuantityString(k, 1);
      localbdp2.b = 32;
      localbdp2.av.a(str2);
      return;
      i = 0;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdy
 * JD-Core Version:    0.7.0.1
 */