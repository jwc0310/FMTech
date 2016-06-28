import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class gbg
  implements efg, GoogleApiClient.OnConnectionFailedListener
{
  public final efd a;
  public final gbh b;
  
  public gbg(Context paramContext, gbh paramgbh)
  {
    this.b = paramgbh;
    this.a = new efe(paramContext).a(fnu.b).a();
  }
  
  public void a()
  {
    d();
    this.a.b();
  }
  
  public void a(int paramInt)
  {
    if (this.b != null) {
      this.b.b();
    }
  }
  
  public void a(Bundle paramBundle)
  {
    if (this.b != null) {
      this.b.a();
    }
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    if (this.b != null) {
      this.b.b();
    }
  }
  
  public void a(gbi paramgbi)
  {
    fnu.c.a(this.a).a(new gbp(this, paramgbi));
  }
  
  public void b()
  {
    this.a.d();
    if (this.a.b(this)) {
      this.a.c(this);
    }
    if (this.a.b(this)) {
      this.a.c(this);
    }
  }
  
  public boolean c()
  {
    return this.a.e();
  }
  
  public void d()
  {
    if (!this.a.b(this)) {
      this.a.a(this);
    }
    if (!this.a.b(this)) {
      this.a.a(this);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gbg
 * JD-Core Version:    0.7.0.1
 */