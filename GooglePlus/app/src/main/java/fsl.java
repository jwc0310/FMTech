import android.content.Context;
import java.util.ArrayList;

public class fsl
  implements fsd
{
  efe a;
  fsz b;
  
  public fsl(Context paramContext)
  {
    this.a = new efe(paramContext);
    this.b = new fsz();
  }
  
  public fsl(Context paramContext, byte paramByte)
  {
    this(paramContext);
  }
  
  public fsc a()
  {
    return new fta(this.a.a(), this.b, (byte)0);
  }
  
  public final fsd a(fry paramfry)
  {
    efe localefe = this.a;
    efi localefi = this.b.a(paramfry);
    localefe.b.add(localefi);
    return this;
  }
  
  public final fsd a(fsb<? extends Object> paramfsb)
  {
    this.a.a(this.b.a(paramfsb));
    return this;
  }
  
  public final fsd a(fsf paramfsf)
  {
    efe localefe = this.a;
    efg localefg = this.b.a(paramfsf);
    localefe.a.add(localefg);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fsl
 * JD-Core Version:    0.7.0.1
 */