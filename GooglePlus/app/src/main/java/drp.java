final class drp
  implements kex
{
  drp(dro paramdro) {}
  
  public final boolean a(ket paramket, Object paramObject)
  {
    gxx localgxx;
    gxw localgxw;
    if ((paramObject instanceof Boolean))
    {
      boolean bool = ((Boolean)paramObject).booleanValue();
      localgxx = (gxx)mbb.a(this.a.bn, gxx.class);
      localgxw = new gxw(this.a.bn);
      if (!bool) {
        break label75;
      }
    }
    label75:
    for (gxz localgxz = gxz.u;; localgxz = gxz.v)
    {
      localgxw.c = localgxz;
      localgxx.a(localgxw);
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     drp
 * JD-Core Version:    0.7.0.1
 */