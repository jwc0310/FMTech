import java.util.HashSet;
import java.util.Set;

class gsh
  implements oxp<qsd>
{
  qrw a;
  
  gsh(gsf paramgsf) {}
  
  public gsh a(qrw paramqrw)
  {
    this.a = paramqrw;
    return this;
  }
  
  public void a() {}
  
  public void a(Throwable paramThrowable)
  {
    gsf.a(this.b);
    gsf.a(this.b, false, this.a);
  }
  
  public void a(qsd paramqsd)
  {
    if (paramqsd == null) {
      return;
    }
    gsf.a(this.b);
    gsf localgsf = this.b;
    String str = paramqsd.a;
    lqp locallqp = localgsf.a;
    HashSet localHashSet = new HashSet(1);
    localHashSet.add(str);
    locallqp.b.a(new lkw(locallqp.a, localHashSet), locallqp.t);
    gsf.a(this.b, true, this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gsh
 * JD-Core Version:    0.7.0.1
 */