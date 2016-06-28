import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import org.json.JSONObject;

public class fqr
  implements fqo
{
  private static final ftb<aip, aip> c = new fqs();
  private efd a;
  private ech b;
  
  public fqr(fqg paramfqg)
  {
    this.a = ((fqv)paramfqg).a;
    this.b = new ech();
    try
    {
      ebm.b.a(this.a, this.b.b.c, this.b);
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("BaseGcoreRemoteMediaPlayerImpl", "Error registering with message received callback", localIOException);
    }
  }
  
  public fqr(fqg paramfqg, byte paramByte)
  {
    this(paramfqg);
  }
  
  public final fsg<aip> a()
  {
    ech localech = this.b;
    efd localefd = this.a;
    return new fsg(localefd.b(new ecl(localech, localefd, localefd, null)), c);
  }
  
  public final fsg<aip> a(long paramLong)
  {
    ech localech = this.b;
    efd localefd = this.a;
    return new fsg(localefd.b(new ecm(localech, localefd, localefd, paramLong, 1, null)), c);
  }
  
  public final void a(fqp paramfqp)
  {
    this.b.d = new ecn(this, paramfqp);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    ebz localebz = new ebz("none");
    eby localeby1 = localebz.a;
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("content type cannot be null or empty");
    }
    localeby1.c = paramString;
    localebz.a.b = 1;
    eby localeby2 = localebz.a;
    if (TextUtils.isEmpty(localeby2.a)) {
      throw new IllegalArgumentException("content ID cannot be null or empty");
    }
    if (TextUtils.isEmpty(localeby2.c)) {
      throw new IllegalArgumentException("content type cannot be null or empty");
    }
    if (localeby2.b == -1) {
      throw new IllegalArgumentException("a valid stream type must be specified");
    }
    eby localeby3 = localebz.a;
    ech localech = this.b;
    efd localefd = this.a;
    localefd.b(new ecj(localech, localefd, localefd, localeby3, true, 0L, null, paramJSONObject));
  }
  
  public final fsg<aip> b()
  {
    ech localech = this.b;
    efd localefd = this.a;
    return new fsg(localefd.b(new eck(localech, localefd, localefd, null)), c);
  }
  
  public final boolean c()
  {
    ece localece = this.b.c();
    return (localece.e == 1) && (localece.f == 1);
  }
  
  public final long d()
  {
    return this.b.a();
  }
  
  public final long e()
  {
    return this.b.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fqr
 * JD-Core Version:    0.7.0.1
 */