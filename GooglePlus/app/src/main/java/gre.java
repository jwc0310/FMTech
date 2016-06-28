import java.util.List;
import java.util.concurrent.Callable;

final class gre
  implements Callable<oxm<qsd>>
{
  gre(grd paramgrd, pic parampic) {}
  
  private oxm<qsd> a()
  {
    this.b.a = true;
    try
    {
      qsp localqsp = (qsp)this.a.get();
      if ((localqsp == null) || (localqsp.a == null) || (localqsp.a.isEmpty())) {
        return oxm.a(new IllegalStateException("Empty data doesn't bode well"));
      }
      oxm localoxm = oxm.a((qsd)localqsp.a.get(0), oxn.a);
      return localoxm;
    }
    catch (Exception localException)
    {
      return oxm.a(localException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gre
 * JD-Core Version:    0.7.0.1
 */