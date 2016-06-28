import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;

public final class jwk
  implements jtw, mbo, mec, mfa, mfd
{
  private static final String a = jwk.class.getSimpleName();
  private static final String b = jwk.class.getName();
  private Bundle c;
  private jtv d;
  private jwm e;
  
  jwk(mek parammek)
  {
    parammek.a(this);
  }
  
  jwk(mek parammek, byte paramByte)
  {
    parammek.a(this);
  }
  
  private jwm a()
  {
    if (this.e == null) {
      this.e = new jwm();
    }
    return this.e;
  }
  
  public final jtv a(Context paramContext)
  {
    this.d = new jwe(paramContext);
    if (!this.d.g())
    {
      jwe localjwe = (jwe)this.d;
      jwm localjwm = a();
      if (localjwe.g == null) {
        localjwe.g = new jto(localjwe);
      }
      localjwm.a = localjwe.g;
      if (localjwe.h == null) {
        localjwe.h = new jtq(localjwe);
      }
      localjwm.b = localjwe.h;
    }
    return this.d;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    gzj localgzj = (gzj)parammbb.a(gzj.class);
    jwm localjwm = a();
    localgzj.a.add(localjwm);
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    this.c = paramBundle.getBundle(b);
  }
  
  public final byte[] a(String paramString)
  {
    if (this.c == null) {}
    Bundle localBundle;
    do
    {
      return null;
      localBundle = this.c.getBundle(paramString);
    } while (localBundle == null);
    return localBundle.getByteArray("db_embed_poll");
  }
  
  public final void b(Bundle paramBundle)
  {
    if ((this.d == null) || (this.d.e() == null) || (this.d.g()))
    {
      paramBundle.putBundle(b, null);
      return;
    }
    try
    {
      this.c = new Bundle();
      Bundle localBundle = new Bundle();
      localBundle.putByteArray("db_embed_poll", lly.a(this.d.e()));
      localBundle.putBoolean("show_poll_results", this.d.h());
      this.c.putBundle(this.d.f(), localBundle);
      paramBundle.putBundle(b, this.c);
      return;
    }
    catch (IOException localIOException)
    {
      paramBundle.putBundle(b, null);
    }
  }
  
  public final void b(String paramString)
  {
    if ((this.c == null) || (this.d.g())) {}
    Bundle localBundle;
    do
    {
      return;
      localBundle = this.c.getBundle(paramString);
    } while ((localBundle == null) || (localBundle.getByteArray("db_embed_poll") == null));
    localBundle.putByteArray("db_embed_poll", null);
  }
  
  public final boolean c(String paramString)
  {
    if (this.c == null) {}
    Bundle localBundle;
    do
    {
      return false;
      localBundle = this.c.getBundle(paramString);
    } while ((localBundle == null) || (!localBundle.getBoolean("show_poll_results")));
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwk
 * JD-Core Version:    0.7.0.1
 */