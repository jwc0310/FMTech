import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.libraries.social.settings.PreferenceScreen;

public class kdt<T>
  implements cw<T>, mdz, mfd
{
  private int a = 500;
  private final kds b;
  private final kdp c;
  private kdu d;
  private boolean e = false;
  
  public kdt(kds paramkds, kdp paramkdp, mek parammek)
  {
    this.b = paramkds;
    parammek.a(this);
    this.c = paramkdp;
  }
  
  public fu<T> a(int paramInt, Bundle paramBundle)
  {
    bk localbk = (bk)this.b;
    int i = ei.c;
    luv localluv = luv.a(null, localbk.g().getString(i), null, false, true, null);
    kdu localkdu = this.d;
    int j = this.a;
    localkdu.b = new kdv(localkdu, localluv, "progress_dialog_tag");
    Runnable localRunnable = localkdu.b;
    long l = j;
    efj.m().postDelayed(localRunnable, l);
    return null;
  }
  
  public final void a(Activity paramActivity)
  {
    this.d = new kdu(((bp)paramActivity).b.a.d);
  }
  
  public void a(fu<T> paramfu) {}
  
  public void a(fu<T> paramfu, T paramT)
  {
    kdu localkdu = this.d;
    bj localbj = (bj)localkdu.a.a("progress_dialog_tag");
    if (localbj == null)
    {
      Runnable localRunnable = localkdu.b;
      efj.m().removeCallbacks(localRunnable);
      if (paramT == null) {
        break label141;
      }
      kdp localkdp2 = this.c;
      ket localket2 = localkdp2.d.c("CloudPreferencesManager.on_load_error");
      if (localket2 != null)
      {
        PreferenceScreen localPreferenceScreen = localkdp2.b.a();
        localPreferenceScreen.c(localket2);
        localPreferenceScreen.h();
      }
      if (!this.e)
      {
        this.b.z();
        this.e = true;
      }
    }
    label141:
    kdp localkdp1;
    do
    {
      return;
      kdw localkdw = new kdw(localkdu, localbj);
      efj.m().post(localkdw);
      localkdu.b = null;
      break;
      localkdp1 = this.c;
    } while (localkdp1.d.c("CloudPreferencesManager.on_load_error") != null);
    kez localkez = localkdp1.c;
    bk localbk = (bk)localkdp1.a;
    int i = ei.e;
    ket localket1 = localkez.a(null, localbk.g().getString(i));
    localket1.d("CloudPreferencesManager.on_load_error");
    localket1.p = new kdq(localkdp1);
    localkdp1.d.b(localket1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdt
 * JD-Core Version:    0.7.0.1
 */