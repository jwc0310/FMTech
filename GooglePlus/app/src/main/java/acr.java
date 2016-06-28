import android.view.MenuItem;

final class acr
  implements ya
{
  acr(acl paramacl) {}
  
  public final void a(xl paramxl, boolean paramBoolean)
  {
    if ((paramxl instanceof ye)) {
      ((ye)paramxl).o.a(false);
    }
    ya localya = this.a.d;
    if (localya != null) {
      localya.a(paramxl, paramBoolean);
    }
  }
  
  public final boolean a_(xl paramxl)
  {
    if (paramxl == null) {
      return false;
    }
    this.a.p = ((ye)paramxl).getItem().getItemId();
    ya localya = this.a.d;
    if (localya != null) {
      return localya.a_(paramxl);
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acr
 * JD-Core Version:    0.7.0.1
 */