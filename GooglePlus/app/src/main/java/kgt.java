import android.content.res.Resources;
import android.util.Log;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class kgt
  implements oxq, oxr<pfk<lke>>
{
  private boolean a;
  private lke b;
  
  kgt(kgn paramkgn) {}
  
  private final void a(lke paramlke)
  {
    int i = 0;
    if (paramlke == null) {}
    for (;;)
    {
      return;
      List localList = paramlke.b;
      Map localMap = paramlke.c;
      kgw localkgw = this.c.c;
      if (localkgw.a.i())
      {
        ArrayList localArrayList2;
        if ((localList.size() == 1) && (((qzz)localList.get(0)).o() == rac.e))
        {
          qvv localqvv = (qvv)((qzz)localList.get(0)).b(qvv.c);
          localkgw.a.f().setTitle(localkgw.c.a(localqvv.b().b()));
          localArrayList2 = new ArrayList();
          for (int k = 0; k < localqvv.a.size(); k++)
          {
            qzz localqzz3 = (qzz)localqvv.a.get(k);
            if (localqzz3.o() == rac.b) {
              localqzz3 = (qzz)localMap.get(localqzz3.c);
            }
            localArrayList2.add(localqzz3);
          }
        }
        for (ArrayList localArrayList1 = localArrayList2;; localArrayList1 = new ArrayList(localList))
        {
          Iterator localIterator = localArrayList1.iterator();
          while (localIterator.hasNext())
          {
            qzz localqzz2 = (qzz)localIterator.next();
            ket localket = localkgw.d.c(localqzz2.c);
            if (localket != null)
            {
              PreferenceScreen localPreferenceScreen = localkgw.d;
              localPreferenceScreen.c(localket);
              localPreferenceScreen.h();
            }
          }
        }
        int j = localArrayList1.size();
        while (i < j)
        {
          qzz localqzz1 = (qzz)localArrayList1.get(i);
          ((khi)((rgq)localkgw.b.get(localqzz1.o())).a()).a(localqzz1, localMap, localkgw.d, localkgw.e);
          i++;
        }
      }
    }
  }
  
  public final void a()
  {
    kgn localkgn = this.c;
    bk localbk = this.c.b;
    int i = da.ab;
    localkgn.a(localbk.g().getString(i));
  }
  
  public final void a(Throwable paramThrowable)
  {
    if (Log.isLoggable("GstsSettingsProvider", 6)) {
      Log.e("GstsSettingsProvider", "Error while fetching data", paramThrowable);
    }
    kgn.a(this.c);
    kgn localkgn = this.c;
    PreferenceScreen localPreferenceScreen = (PreferenceScreen)localkgn.g.a();
    if (localPreferenceScreen.c("load_error_pref") == null)
    {
      kez localkez = localkgn.i;
      bk localbk = localkgn.b;
      int i = da.ac;
      ket localket = localkez.a(null, localbk.g().getString(i));
      localket.d("load_error_pref");
      localket.p = new ped(localkgn.f, "Preference clicked", new kgs(localkgn));
      localPreferenceScreen.b(localket);
    }
  }
  
  public final void b() {}
  
  public final void c()
  {
    this.a = true;
    kgn localkgn = this.c;
    bk localbk = this.c.b;
    int i = da.ab;
    localkgn.a(localbk.g().getString(i));
  }
  
  public final void d()
  {
    this.a = false;
    kgn.a(this.c);
    kgn.b(this.c);
    a(this.b);
  }
  
  public final void e()
  {
    this.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kgt
 * JD-Core Version:    0.7.0.1
 */