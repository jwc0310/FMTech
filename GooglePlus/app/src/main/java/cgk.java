import android.os.Bundle;

final class cgk
  implements gzb
{
  cgk(cge paramcge) {}
  
  public final void a(Bundle paramBundle)
  {
    this.a.aD = paramBundle.getString("gaia_id");
    if (this.a.aD == null)
    {
      this.a.aE = this.a.at.f().b("gaia_id");
      if (this.a.aF == null) {
        if (!paramBundle.containsKey("circle_info")) {
          break label147;
        }
      }
    }
    label147:
    for (this.a.aF = ((cyf)paramBundle.getParcelable("circle_info"));; this.a.aF = new cyf(this.a.bn, paramBundle))
    {
      this.a.aI = this.a.m.containsKey("pinned_activity_ids");
      this.a.ag();
      this.a.ar.a(new cgl(this));
      return;
      this.a.aE = this.a.aD;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cgk
 * JD-Core Version:    0.7.0.1
 */