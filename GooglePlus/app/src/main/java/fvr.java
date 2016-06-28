import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationRequest;

public class fvr
  implements efg, GoogleApiClient.OnConnectionFailedListener
{
  public final efd a;
  public final frx b;
  public final fry c;
  public final fsz d;
  
  public fvr(Context paramContext, frx paramfrx, fry paramfry)
  {
    this.b = paramfrx;
    this.c = paramfry;
    this.a = new efe(paramContext, this, this).a(fce.b).a();
    this.d = new fsz();
  }
  
  public Location a()
  {
    return fce.c.a(this.a);
  }
  
  public void a(int paramInt) {}
  
  public void a(Bundle paramBundle)
  {
    this.b.a();
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    this.c.a(this.d.a(paramConnectionResult));
  }
  
  public void a(fvu paramfvu, fvt paramfvt)
  {
    LocationRequest localLocationRequest1 = new LocationRequest().a(paramfvu.a());
    long l = paramfvu.b();
    LocationRequest.b(l);
    localLocationRequest1.e = true;
    localLocationRequest1.d = l;
    localLocationRequest1.f = paramfvu.c();
    if (localLocationRequest1.f < 0L) {
      localLocationRequest1.f = 0L;
    }
    LocationRequest localLocationRequest2 = localLocationRequest1.a(paramfvu.d());
    fce.c.a(this.a, localLocationRequest2, new fcc(this, paramfvt));
  }
  
  public void b()
  {
    this.a.b();
  }
  
  public void c()
  {
    this.a.d();
  }
  
  public boolean d()
  {
    return this.a.e();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fvr
 * JD-Core Version:    0.7.0.1
 */