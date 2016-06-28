import java.util.concurrent.TimeUnit;

public class fta
  implements fsc
{
  public fsz a;
  public efd b;
  
  public fta(efd paramefd, fsz paramfsz)
  {
    this.b = paramefd;
    this.a = paramfsz;
  }
  
  public fta(efd paramefd, fsz paramfsz, byte paramByte)
  {
    this(paramefd, paramfsz);
  }
  
  public frs a()
  {
    return this.a.a(this.b.c());
  }
  
  public frs a(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.a.a(this.b.a(10L, paramTimeUnit));
  }
  
  public void a(fry paramfry)
  {
    this.b.a(this.a.a(paramfry));
  }
  
  public void a(fsf paramfsf)
  {
    this.b.a(this.a.a(paramfsf));
  }
  
  public void b()
  {
    this.b.b();
  }
  
  public void c()
  {
    this.b.d();
  }
  
  public boolean d()
  {
    return this.b.e();
  }
  
  public efd e()
  {
    return this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fta
 * JD-Core Version:    0.7.0.1
 */