public class jty
  implements Runnable
{
  public int a;
  public int b;
  public boolean c = true;
  
  public jty(jwe paramjwe) {}
  
  public void a(int paramInt1, int paramInt2)
  {
    synchronized (this.d.k)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = false;
      return;
    }
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  public void run()
  {
    for (;;)
    {
      synchronized (this.d.k)
      {
        if (this.c) {
          return;
        }
        this.c = true;
        if (this.a != -1)
        {
          this.d.c(this.a);
          this.d.k().a(this.d.d, this.d.c, this.d.f.c());
          return;
        }
      }
      this.d.c(this.b);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jty
 * JD-Core Version:    0.7.0.1
 */