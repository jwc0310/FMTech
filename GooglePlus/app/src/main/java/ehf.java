import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class ehf
  extends fu<ConnectionResult>
  implements efg, efi
{
  public final efd a;
  boolean b;
  private ConnectionResult c;
  
  public ehf(Context paramContext, efd paramefd)
  {
    super(paramContext);
    this.a = paramefd;
  }
  
  private final void b(ConnectionResult paramConnectionResult)
  {
    this.c = paramConnectionResult;
    if ((this.m) && (!this.n)) {
      b(paramConnectionResult);
    }
  }
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle)
  {
    this.b = false;
    b(ConnectionResult.a);
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    this.b = true;
    b(paramConnectionResult);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    this.a.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  protected final void g()
  {
    super.g();
    this.a.a(this);
    this.a.a(this);
    if (this.c != null) {
      b(this.c);
    }
    if ((!this.a.e()) && (!this.a.f()) && (!this.b)) {
      this.a.b();
    }
  }
  
  protected final void h()
  {
    this.a.d();
  }
  
  protected final void i()
  {
    this.c = null;
    this.b = false;
    this.a.c(this);
    this.a.c(this);
    this.a.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehf
 * JD-Core Version:    0.7.0.1
 */