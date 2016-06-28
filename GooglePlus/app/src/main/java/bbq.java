import android.widget.Toast;

final class bbq
  extends dme
{
  bbq(bbf parambbf) {}
  
  private final boolean ad(int paramInt, dmx paramdmx)
  {
    if ((this.a.ao == null) || (this.a.ao.intValue() != paramInt)) {
      return false;
    }
    this.a.ao = null;
    efj.a(this.a.x);
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        Toast.makeText(this.a.f(), aau.mm, 0).show();
        return false;
      }
    }
    return true;
  }
  
  public final void a(int paramInt, dmx paramdmx, Long paramLong)
  {
    int i = 1;
    if ((this.a.ao == null) || (this.a.ao.intValue() != paramInt)) {
      return;
    }
    boolean bool = ad(paramInt, paramdmx);
    this.a.x();
    bbc localbbc = this.a.a(paramLong);
    if ((bool) && (localbbc != null)) {
      if (localbbc.J != i) {
        break label94;
      }
    }
    for (;;)
    {
      if (i == 0) {
        this.a.ap = paramLong;
      }
      bbf.a(this.a);
      return;
      label94:
      i = 0;
    }
  }
  
  public final void b_(int paramInt, dmx paramdmx)
  {
    if (ad(paramInt, paramdmx)) {
      this.a.x();
    }
  }
  
  public final void e(int paramInt, dmx paramdmx)
  {
    ad(paramInt, paramdmx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbq
 * JD-Core Version:    0.7.0.1
 */