import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public final class aug
  implements ank
{
  private final aud a;
  private final boolean b;
  private final Activity c;
  
  public aug(Activity paramActivity, aud paramaud, boolean paramBoolean)
  {
    this.c = paramActivity;
    this.a = paramaud;
    this.b = paramBoolean;
  }
  
  public final void a()
  {
    this.a.a();
  }
  
  public final void a(aci paramaci) {}
  
  public final boolean a(aci paramaci, Menu paramMenu)
  {
    MenuItem localMenuItem1 = paramMenu.add(0, aaw.jM, 0, aau.pr);
    MenuItem localMenuItem2 = paramMenu.add(0, aaw.ca, 0, aau.ez);
    MenuItem localMenuItem3 = paramMenu.add(0, aaw.lY, 0, aau.kA);
    MenuItem localMenuItem4 = paramMenu.add(0, aaw.jd, 0, aau.kM);
    MenuItem localMenuItem5 = paramMenu.add(0, aaw.cp, 0, aau.kJ);
    localMenuItem3.setIcon(efj.rB);
    localMenuItem5.setIcon(efj.rB);
    localMenuItem4.setIcon(efj.sa);
    localMenuItem1.setIcon(efj.rY);
    localMenuItem2.setIcon(efj.rN);
    return true;
  }
  
  public final boolean a(aci paramaci, MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == aaw.jM)
    {
      ((aog)mbb.a(this.c, aog.class)).a();
      return true;
    }
    if (i == aaw.ca)
    {
      anm localanm = (anm)mbb.a(this.c, anm.class);
      gxx localgxx2 = localanm.e;
      gxw localgxw2 = new gxw(localanm.b);
      localgxw2.c = gxz.de;
      localgxx2.a(localgxw2);
      btj localbtj = new btj(localanm.c.b, false);
      int j = localanm.d.c();
      String str = localanm.d.f().b("gaia_id");
      Intent localIntent = efj.a(localanm.a, j, localbtj, str);
      localanm.f.a(aaw.iz, localIntent);
      return true;
    }
    if (i == aaw.lY)
    {
      ans localans = (ans)mbb.a(this.c, ans.class);
      gxx localgxx1 = (gxx)mbb.a(localans.a, gxx.class);
      gxw localgxw1 = new gxw(localans.b);
      localgxw1.c = gxz.dd;
      localgxx1.a(localgxw1);
      isq localisq = localans.d.b;
      localans.c.a(localisq, true);
      return true;
    }
    if (i == aaw.jd)
    {
      ((aod)mbb.a(this.c, aod.class)).a.a();
      return true;
    }
    if (i == aaw.cp)
    {
      anp localanp = (anp)mbb.a(this.c, anp.class);
      aob localaob = aob.a(localanp.b.b);
      cl localcl = localanp.a.b.a.d.a();
      localcl.a(localaob, "confirm_permanent_delete");
      localcl.c();
      return true;
    }
    return false;
  }
  
  public final boolean b(aci paramaci, Menu paramMenu)
  {
    isq localisq = this.a.b;
    int i;
    String str;
    label30:
    int i1;
    label62:
    boolean bool1;
    label70:
    int n;
    label106:
    boolean bool2;
    label121:
    int m;
    label157:
    boolean bool3;
    label165:
    int k;
    label208:
    boolean bool4;
    label216:
    MenuItem localMenuItem5;
    boolean bool6;
    if (localisq != null)
    {
      i = localisq.b;
      if (i <= 0) {
        break label298;
      }
      str = String.valueOf(i);
      paramaci.b(str);
      MenuItem localMenuItem1 = paramMenu.findItem(aaw.jM);
      if (i <= 0) {
        break label312;
      }
      if (localisq.i != 0) {
        break label306;
      }
      i1 = 1;
      if (i1 == 0) {
        break label312;
      }
      bool1 = true;
      localMenuItem1.setVisible(bool1);
      MenuItem localMenuItem2 = paramMenu.findItem(aaw.ca);
      if (i <= 0) {
        break label324;
      }
      if (localisq.e != 0) {
        break label318;
      }
      n = 1;
      if ((n == 0) || (localisq.g != 0)) {
        break label324;
      }
      bool2 = true;
      localMenuItem2.setVisible(bool2);
      MenuItem localMenuItem3 = paramMenu.findItem(aaw.lY);
      if (i <= 0) {
        break label336;
      }
      if (localisq.d != 0) {
        break label330;
      }
      m = 1;
      if (m == 0) {
        break label336;
      }
      bool3 = true;
      localMenuItem3.setVisible(bool3);
      MenuItem localMenuItem4 = paramMenu.findItem(aaw.jd);
      if ((!this.b) || (i <= 0)) {
        break label348;
      }
      if (localisq.k <= 0) {
        break label342;
      }
      k = 1;
      if (k == 0) {
        break label348;
      }
      bool4 = true;
      localMenuItem4.setVisible(bool4);
      localMenuItem5 = paramMenu.findItem(aaw.cp);
      boolean bool5 = this.b;
      bool6 = false;
      if (bool5)
      {
        bool6 = false;
        if (i > 0) {
          if (localisq.k <= 0) {
            break label354;
          }
        }
      }
    }
    label298:
    label306:
    label312:
    label318:
    label324:
    label330:
    label336:
    label342:
    label348:
    label354:
    for (int j = 1;; j = 0)
    {
      bool6 = false;
      if (j != 0) {
        bool6 = true;
      }
      localMenuItem5.setVisible(bool6);
      return true;
      i = 0;
      break;
      str = "";
      break label30;
      i1 = 0;
      break label62;
      bool1 = false;
      break label70;
      n = 0;
      break label106;
      bool2 = false;
      break label121;
      m = 0;
      break label157;
      bool3 = false;
      break label165;
      k = 0;
      break label208;
      bool4 = false;
      break label216;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aug
 * JD-Core Version:    0.7.0.1
 */