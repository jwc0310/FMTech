import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class ktr
  implements giv, mbo, mdo, mes, mfa, mfb, mfd
{
  static final mcr a = new mcr("debug.launch_instr.dogfood");
  private List<ktu> b = new ArrayList();
  private final Activity c;
  private gww d;
  private boolean e;
  private giu f = giu.a;
  private int g = -1;
  
  public ktr(Activity paramActivity, mek parammek)
  {
    this.c = paramActivity;
    parammek.a(this);
    this.b.add(new ktv(this));
    this.b.add(new ktw(this));
    this.b.add(new kty(this));
    this.b.add(new ktx(this));
    this.b.add(new kts());
  }
  
  private final void b()
  {
    Intent localIntent1 = this.c.getIntent();
    int i;
    Intent localIntent2;
    gxr localgxr;
    int j;
    label74:
    ktu localktu;
    if ((!this.e) && (this.f != giu.a) && ((this.c.isTaskRoot()) || (b(localIntent1))))
    {
      i = 1;
      if (i != 0)
      {
        this.e = true;
        localIntent2 = this.c.getIntent();
        localgxr = new gxr();
        j = 0;
        if (j >= this.b.size()) {
          break label218;
        }
        localktu = (ktu)this.b.get(j);
        if (!localktu.a(localIntent2)) {
          break label197;
        }
      }
    }
    label197:
    label218:
    for (gxq localgxq = localktu.b(localIntent2);; localgxq = null)
    {
      if (localgxq != null) {}
      for (;;)
      {
        localgxr.b.add(localgxq);
        if (!localgxq.a.b) {
          localgxr.a(this.c);
        }
        gwz localgwz = new gwz(4, localgxr);
        this.d.a(this.c, localgwz);
        return;
        i = 0;
        break;
        j++;
        break label74;
        localgxq = new gxq(pjp.e);
      }
    }
  }
  
  private boolean b(Intent paramIntent)
  {
    for (int i = 0;; i++)
    {
      int j = this.b.size();
      boolean bool = false;
      if (i < j)
      {
        if (((ktu)this.b.get(i)).a(paramIntent)) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public final void a()
  {
    b();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = ((gww)parammbb.a(gww.class));
    ((git)parammbb.a(git.class)).a(this);
  }
  
  public final void a(Intent paramIntent)
  {
    if (b(paramIntent)) {
      this.e = false;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.e = paramBundle.getBoolean("state_event_logged");
      int i = paramBundle.getInt("state_account_handler_state");
      this.f = giu.values()[i];
      this.g = paramBundle.getInt("state_account_id");
    }
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    this.f = paramgiu2;
    this.g = paramInt2;
    b();
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("state_event_logged", this.e);
    paramBundle.putInt("state_account_id", this.g);
    paramBundle.putInt("state_account_handler_state", this.f.ordinal());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ktr
 * JD-Core Version:    0.7.0.1
 */