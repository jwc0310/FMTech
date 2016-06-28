import android.os.Bundle;
import android.text.TextUtils;

final class cfu
  implements gzb
{
  cfu(cfs paramcfs) {}
  
  public final void a(Bundle paramBundle)
  {
    this.a.a = paramBundle.getString("gaia_id");
    if (TextUtils.isEmpty(this.a.a)) {
      this.a.a = this.a.am.f().b("gaia_id");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfu
 * JD-Core Version:    0.7.0.1
 */