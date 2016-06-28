import com.google.android.apps.plus.phone.ProfileActionGatewayActivity;
import java.util.ArrayList;

public final class dfc
  implements Runnable
{
  public dfc(ProfileActionGatewayActivity paramProfileActionGatewayActivity, ArrayList paramArrayList1, ArrayList paramArrayList2) {}
  
  public final void run()
  {
    ProfileActionGatewayActivity localProfileActionGatewayActivity = this.c;
    ArrayList localArrayList1 = this.a;
    ArrayList localArrayList2 = this.b;
    ArrayList localArrayList6;
    if (localArrayList2 != null)
    {
      int k = localArrayList2.size();
      int m = 0;
      localArrayList6 = null;
      while (m < k)
      {
        String str2 = (String)localArrayList2.get(m);
        if ((localArrayList1 == null) || (!localArrayList1.contains(str2)))
        {
          if (localArrayList6 == null) {
            localArrayList6 = new ArrayList();
          }
          localArrayList6.add(str2);
        }
        m++;
      }
    }
    for (ArrayList localArrayList3 = localArrayList6;; localArrayList3 = null)
    {
      ArrayList localArrayList5;
      if (localArrayList1 != null)
      {
        int i = localArrayList1.size();
        int j = 0;
        localArrayList5 = null;
        while (j < i)
        {
          String str1 = (String)localArrayList1.get(j);
          if ((localArrayList2 == null) || (!localArrayList2.contains(str1)))
          {
            if (localArrayList5 == null) {
              localArrayList5 = new ArrayList();
            }
            localArrayList5.add(str1);
          }
          j++;
        }
      }
      for (ArrayList localArrayList4 = localArrayList5;; localArrayList4 = null)
      {
        boolean bool1;
        if ((localArrayList1 == null) || (localArrayList1.isEmpty()))
        {
          bool1 = true;
          if ((localArrayList2 != null) && (!localArrayList2.isEmpty())) {
            break label358;
          }
        }
        label358:
        for (boolean bool2 = true;; bool2 = false)
        {
          bnp localbnp = new bnp(localProfileActionGatewayActivity);
          gjp localgjp = localProfileActionGatewayActivity.e;
          efj.k();
          localbnp.a = localgjp.a;
          localbnp.b = localProfileActionGatewayActivity.f;
          localbnp.c = localProfileActionGatewayActivity.g;
          localbnp.d = 66;
          localbnp.e = localArrayList3;
          localbnp.f = localArrayList4;
          localbnp.g = bool1;
          localbnp.h = bool2;
          localbnp.i = false;
          bno localbno = localbnp.a();
          gzj localgzj = localProfileActionGatewayActivity.d;
          localgzj.d.a(localbno, false);
          localgzj.b(localbno);
          localProfileActionGatewayActivity.h = new hvj(localProfileActionGatewayActivity, (gxx)localProfileActionGatewayActivity.j.a(gxx.class), localProfileActionGatewayActivity.f, localArrayList2, null, localProfileActionGatewayActivity);
          return;
          bool1 = false;
          break;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfc
 * JD-Core Version:    0.7.0.1
 */