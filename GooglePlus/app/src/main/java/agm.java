import android.support.v7.widget.RecyclerView;

public final class agm
  extends agc
{
  public agm(RecyclerView paramRecyclerView) {}
  
  private void b()
  {
    if ((this.a.p) && (this.a.k) && (this.a.j))
    {
      RecyclerView localRecyclerView = this.a;
      Runnable localRunnable = this.a.f;
      nj.a.a(localRecyclerView, localRunnable);
      return;
    }
    this.a.o = true;
    this.a.requestLayout();
  }
  
  public final void a()
  {
    this.a.a(null);
    if (this.a.g.b)
    {
      this.a.y.i = true;
      RecyclerView.b(this.a);
    }
    for (;;)
    {
      if (!this.a.c.d()) {
        this.a.requestLayout();
      }
      return;
      this.a.y.i = true;
      RecyclerView.b(this.a);
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.c.c(paramInt1, paramInt2)) {
      b();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject)
  {
    this.a.a(null);
    if (this.a.c.a(paramInt1, paramInt2, paramObject)) {
      b();
    }
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.c.d(paramInt1, paramInt2)) {
      b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agm
 * JD-Core Version:    0.7.0.1
 */