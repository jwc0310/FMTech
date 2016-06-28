public class fzk
{
  public fnn a;
  
  public fzk()
  {
    this.a = null;
  }
  
  public fzk(fnn paramfnn)
  {
    this.a = paramfnn;
  }
  
  public long a()
  {
    if (this.a != null) {
      return this.a.c();
    }
    return 0L;
  }
  
  public String b()
  {
    if (this.a != null) {
      return this.a.d();
    }
    return null;
  }
  
  public String c()
  {
    if (this.a != null) {
      return this.a.e();
    }
    return null;
  }
  
  public String d()
  {
    if (this.a != null) {
      return this.a.f();
    }
    return null;
  }
  
  public int e()
  {
    if (this.a != null) {
      return this.a.g();
    }
    return 0;
  }
  
  public int f()
  {
    fnn localfnn = this.a;
    int i = 0;
    if (localfnn != null)
    {
      int j = this.a.h();
      i = 0;
      if (j > 0) {
        i = this.a.h();
      }
    }
    return i;
  }
  
  public long g()
  {
    if (this.a != null) {
      return this.a.i();
    }
    return 0L;
  }
  
  public boolean h()
  {
    return (this.a != null) && (this.a.j());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fzk
 * JD-Core Version:    0.7.0.1
 */