import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import java.util.List;

final class lqy
  implements oxq, oxr<pfk<lke>>
{
  boolean a = false;
  boolean b;
  private lke d;
  
  lqy(lqp paramlqp) {}
  
  private final void a(lke paramlke)
  {
    lqp.a(this.c);
    int i = paramlke.a.c;
    if (!this.a) {
      return;
    }
    this.c.p = i;
    this.c.q = 0;
    bz localbz = this.c.e.b.a.d;
    if (this.c.u != null)
    {
      lqv locallqv = this.c.u;
      this.c.u = new lqv();
      localbz.a().a(locallqv).a(this.c.u, "STREAM_CACHE_TAG").c();
    }
    for (;;)
    {
      this.c.g = new lqu(this.c, this.c.u);
      lqu locallqu1 = this.c.g;
      locallqu1.a = paramlke.b.size();
      locallqu1.a();
      this.c.g.a(paramlke);
      llb localllb = this.c.w;
      int j = this.c.p;
      localllb.c = this.c.g.a;
      localllb.b = 0;
      localllb.a = j;
      if (!paramlke.e) {
        this.c.g.c = true;
      }
      this.c.j.a(this.c.g);
      this.c.s.a = false;
      this.c.r.a = false;
      this.c.a(0, 20);
      this.c.b(0, 10);
      lqu locallqu2 = this.c.g;
      locallqu2.b(locallqu2.d.q);
      this.a = false;
      this.b = false;
      this.c.v = true;
      this.c.i.setVisibility(0);
      return;
      this.c.u = new lqv();
      localbz.a().a(this.c.u, "STREAM_CACHE_TAG").c();
    }
  }
  
  public final void a()
  {
    lqp locallqp = this.c;
    if (locallqp.h != null) {
      locallqp.h.a(true);
    }
  }
  
  public final void a(Throwable paramThrowable)
  {
    if (Log.isLoggable("StreamViewManager", 3))
    {
      String str = String.valueOf(paramThrowable);
      new StringBuilder(7 + String.valueOf(str).length()).append("Error: ").append(str);
    }
    this.a = false;
    this.b = false;
    lqp.a(this.c);
  }
  
  public final void b()
  {
    lqp.a(this.c);
    this.a = false;
    this.b = false;
  }
  
  public final void c()
  {
    this.b = true;
  }
  
  public final void d()
  {
    if (this.d != null) {
      a(this.d);
    }
    this.a = false;
    this.b = false;
  }
  
  public final void e()
  {
    if (this.d != null) {
      a(this.d);
    }
    this.a = false;
    this.b = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqy
 * JD-Core Version:    0.7.0.1
 */