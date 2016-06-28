import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import java.util.ArrayList;

public final class dqo
  implements gzi, mbo, mdz, mfd
{
  Context a;
  ProgressDialog b;
  AlertDialog c;
  DialogInterface.OnClickListener d = new dqr(this);
  private Activity e;
  private git f;
  private gzj g;
  private dqs h;
  private boolean i;
  
  public dqo(mek parammek)
  {
    parammek.a(this);
  }
  
  public dqo(mek parammek, dqs paramdqs)
  {
    this.h = paramdqs;
    parammek.a(this);
  }
  
  public final void a()
  {
    if (!this.f.e()) {
      return;
    }
    this.b = new ProgressDialog(this.a);
    this.b.setMessage(this.a.getString(aau.tC));
    this.b.show();
    new dqp(this, this.f.c()).execute(new Void[0]);
  }
  
  public final void a(Activity paramActivity)
  {
    this.e = paramActivity;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
    this.f = ((git)parammbb.a(git.class));
    this.g = ((gzj)parammbb.a(gzj.class));
    this.g.a.add(this);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((this.i) && ("RemoveAccountTask".equals(paramString)))
    {
      if (this.h != null) {
        this.h.a(this.a);
      }
      this.e.finish();
    }
    this.i = false;
  }
  
  final void b()
  {
    if (!this.f.e()) {
      return;
    }
    gxx localgxx = (gxx)mbb.a(this.a, gxx.class);
    gxw localgxw = new gxw(this.a);
    localgxw.c = gxz.f;
    localgxx.a(localgxw);
    this.i = true;
    this.g.b(new bob(this.a, this.f.c()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqo
 * JD-Core Version:    0.7.0.1
 */