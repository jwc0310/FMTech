import android.app.Activity;
import android.content.Intent;

public final class pcw
{
  public pdd a;
  public pdd b;
  private final Activity c;
  private boolean d;
  private pdc e;
  private pdc f;
  
  public pcw(Activity paramActivity)
  {
    this.c = paramActivity;
  }
  
  private final String a(String paramString)
  {
    String str = String.valueOf(this.c.getClass().getSimpleName());
    return 1 + String.valueOf(paramString).length() + String.valueOf(str).length() + paramString + " " + str;
  }
  
  public final void a()
  {
    this.a = ((pdd)pea.b.get());
    Intent localIntent = this.c.getIntent();
    pdd localpdd = pdt.a(localIntent);
    if (localpdd != null) {
      pea.b(localpdd);
    }
    for (this.b = localpdd;; this.b = ((pdd)pea.b.get()))
    {
      this.d = false;
      this.e = pea.a(a("Creating"));
      return;
      pde localpde = efj.N(this.c);
      String str = a("Intenting into ");
      localpde.a.a(str);
    }
  }
  
  public final void b()
  {
    if (this.e == null) {
      throw new NullPointerException();
    }
    this.e.close();
    pea.b(a("Creating"));
    this.e = null;
    pea.b(this.a);
    this.a = null;
  }
  
  public final void c()
  {
    this.a = ((pdd)pea.b.get());
    if ((this.b != null) && (!this.d)) {
      pea.b(this.b);
    }
    for (;;)
    {
      this.f = pea.a(a("Starting"));
      return;
      efj.N(this.c).a(this.c.getClass(), "onStart");
      this.b = ((pdd)pea.b.get());
      this.d = false;
    }
  }
  
  public final void d()
  {
    if (this.f == null) {
      throw new NullPointerException();
    }
    this.f.close();
    pea.b(a("Starting"));
    this.f = null;
    pea.b(this.a);
    this.a = null;
  }
  
  public final void e()
  {
    this.a = ((pdd)pea.b.get());
    if ((this.b != null) && (!this.d))
    {
      pea.b(this.b);
      return;
    }
    efj.N(this.c).a(this.c.getClass(), "onResume");
    this.b = ((pdd)pea.b.get());
    this.d = false;
  }
  
  public final void f()
  {
    this.b = null;
    pea.b(this.a);
    this.a = null;
  }
  
  public final void g()
  {
    this.a = ((pdd)pea.b.get());
    efj.N(this.c).a(this.c.getClass(), "onPause");
    this.b = ((pdd)pea.b.get());
    this.d = true;
  }
  
  public final void h()
  {
    aau.b(this.b, "onStop called before onPause");
    this.a = ((pdd)pea.b.get());
    pea.b(this.b);
  }
  
  public final void i()
  {
    aau.b(this.b, "onDestroy called before onPause");
    this.a = ((pdd)pea.b.get());
    pea.b(this.b);
  }
  
  public final void j()
  {
    if (pea.a(ovl.a))
    {
      pea.a("Back pressed").close();
      return;
    }
    efj.N(this.c).a.a("Back pressed");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pcw
 * JD-Core Version:    0.7.0.1
 */