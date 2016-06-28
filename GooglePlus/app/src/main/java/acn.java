import android.view.View;

final class acn
  implements Runnable
{
  private acq a;
  
  public acn(acl paramacl, acq paramacq)
  {
    this.a = paramacq;
  }
  
  public final void run()
  {
    xl localxl = this.b.c;
    if (localxl.b != null) {
      localxl.b.a(localxl);
    }
    View localView = (View)this.b.e;
    if ((localView != null) && (localView.getWindowToken() != null) && (this.a.e())) {
      this.b.l = this.a;
    }
    this.b.n = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acn
 * JD-Core Version:    0.7.0.1
 */