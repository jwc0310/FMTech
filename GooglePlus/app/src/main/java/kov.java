import com.google.android.libraries.social.sharekit.reshare.ReshareChooserActivity;

final class kov
  implements pei
{
  private final kou a;
  
  kov(kou paramkou)
  {
    this.a = paramkou;
  }
  
  public final pej a(aip paramaip)
  {
    if ((paramaip instanceof peg))
    {
      kou localkou = this.a;
      peg localpeg = (peg)paramaip;
      localkou.b.a(false);
      if (localkou.b.f() != null) {
        return ((kon)((ReshareChooserActivity)localkou.b.f()).av_()).a(localpeg);
      }
      return pej.a;
    }
    return pej.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kov
 * JD-Core Version:    0.7.0.1
 */