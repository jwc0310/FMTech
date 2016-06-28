import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.social.gateway.GatewayActivity;
import java.util.List;

public final class hpi
  extends mcc
  implements giv, hoz
{
  private final ikt d;
  private hou e;
  private String f;
  private String g;
  private boolean h;
  
  public hpi()
  {
    ikt localikt = new ikt(this, this.k);
    localikt.g.add(this);
    this.d = ((ikt)localikt).a(this.j);
    new jyj(this, this.k);
    new gxj(this.k);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    new gxl(new gxq(pjn.k)).a(this.j);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      bz localbz = this.b.a.d;
      this.e = ((hou)localbz.a(efj.JS));
      if (this.e == null)
      {
        hox localhox = new hox().a(true);
        Bundle localBundle = new hhg().a().a;
        localhox.a.putBundle("collexion_visibility_type", localBundle);
        this.e = localhox.a();
        localbz.a().a(efj.JS, this.e).b();
      }
      this.e.aa = this;
      return;
    }
    setResult(0);
    finish();
  }
  
  public final void aA_()
  {
    if (this.e != null)
    {
      this.f = this.e.c;
      this.g = this.e.d;
      this.h = this.e.Z;
    }
    if (TextUtils.isEmpty(this.f)) {
      return;
    }
    Intent localIntent1 = new Intent(getIntent());
    localIntent1.setClass(this, GatewayActivity.class);
    Intent localIntent2 = localIntent1.putExtra("extra_acl", new gnb(new hps(this.f, this.g, this.h)));
    ikt localikt = this.d;
    efj.k();
    localIntent2.putExtra("account_id", localikt.e).putExtra("clear_acl", true).putExtra("restrict_to_domain", this.h);
    startActivity(localIntent1);
    finish();
  }
  
  public final void aB_() {}
  
  public final void b() {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aau.zC);
    setTitle(ehr.bP);
    ikt localikt = this.d;
    ilf localilf = new ilf();
    localilf.u.add(ine.class);
    localilf.h = true;
    iln localiln = new iln();
    localiln.a = getString(ehr.bu);
    Bundle localBundle = localiln.a();
    localilf.s = ilm.class;
    localilf.t = localBundle;
    localikt.a(localilf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpi
 * JD-Core Version:    0.7.0.1
 */