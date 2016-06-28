import android.content.Intent;
import android.os.Bundle;

public final class htr
  extends kdn
  implements kfp
{
  private final kfo aa = new kfo(this, this.c);
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b.a(kfs.class, this.aa);
  }
  
  public final void v()
  {
    kfo localkfo1 = this.aa;
    hts localhts = new hts();
    localhts.c = ((Intent)this.m.getParcelable("args_account_status_intent"));
    localhts.d = ((Intent)this.m.getParcelable("args_browse_experiments_intent"));
    localhts.aa = this.m.getBoolean("args_show_override_pref");
    localhts.Z = ((Intent)this.m.getParcelable("args_show_tracing_pref"));
    localkfo1.a.a(localhts, null);
    kfo localkfo2 = this.aa;
    hty localhty = new hty();
    localhty.a = this.m.getBoolean("args_show_apiary_pref");
    localhty.b = this.m.getBoolean("args_show_datamixer_pref");
    localkfo2.a.a(localhty, null);
    kfo localkfo3 = this.aa;
    htv localhtv = new htv();
    localhtv.d = ((Intent)this.m.getParcelable("args_network_requests_intent"));
    localhtv.Z = ((Intent)this.m.getParcelable("args_network_stats_intent"));
    localhtv.aa = ((Intent)this.m.getParcelable("extra_upload_stats_intent"));
    localhtv.b = this.m.getBoolean("args_show_network_netlogst_pref");
    localhtv.c = this.m.getBoolean("args_show_network_defaults_pref");
    localkfo3.a.a(localhtv, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htr
 * JD-Core Version:    0.7.0.1
 */