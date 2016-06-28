import android.os.Bundle;

final class cec
  implements gzb
{
  cec(cdo paramcdo) {}
  
  public final void a(Bundle paramBundle)
  {
    String str = jjf.a(this.a.at.f().b("gaia_id"));
    this.a.af = paramBundle.getString("person_id");
    this.a.ah = this.a.af.equals(str);
    cdo localcdo = this.a;
    if (jjf.c(this.a.af) != null) {}
    for (boolean bool = true;; bool = false)
    {
      localcdo.ag = bool;
      this.a.aD = jjf.c(this.a.af);
      if (this.a.aD == null) {
        paramBundle.putBoolean("show_empty_stream", true);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cec
 * JD-Core Version:    0.7.0.1
 */