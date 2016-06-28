import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class eiq
{
  final eir a;
  final Set<ServiceConnection> b;
  int c;
  boolean d;
  IBinder e;
  final eip f;
  ComponentName g;
  
  public eiq(eio parameio, eip parameip)
  {
    this.f = parameip;
    this.a = new eir(this);
    this.b = new HashSet();
    this.c = 2;
  }
  
  public final void a(ServiceConnection paramServiceConnection, String paramString)
  {
    eio.c(this.h).a(eio.b(this.h), paramServiceConnection, paramString, this.f.a(), 3);
    this.b.add(paramServiceConnection);
  }
  
  public final void a(String paramString)
  {
    ejm localejm1 = eio.c(this.h);
    Context localContext1 = eio.b(this.h);
    Intent localIntent = this.f.a();
    eir localeir1 = this.a;
    if (ejm.a(localContext1, localIntent)) {}
    boolean bool1;
    for (boolean bool2 = false;; bool2 = bool1)
    {
      this.d = bool2;
      if (!this.d) {
        break;
      }
      this.c = 3;
      return;
      bool1 = localContext1.bindService(localIntent, localeir1, 129);
      if (bool1) {
        localejm1.a(localContext1, localeir1, paramString, localIntent, 2);
      }
    }
    try
    {
      ejm localejm2 = eio.c(this.h);
      Context localContext2 = eio.b(this.h);
      eir localeir2 = this.a;
      localContext2.unbindService(localeir2);
      localejm2.a(localContext2, localeir2, null, null, 1);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eiq
 * JD-Core Version:    0.7.0.1
 */