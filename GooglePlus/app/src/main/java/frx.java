import android.content.Context;
import android.location.Location;
import com.google.android.libraries.gcoreclient.location.GcoreLocationListener;

public class frx
  implements fry, GcoreLocationListener
{
  public final Context a;
  public fvt b;
  public Location c;
  public fvr d;
  public final long e;
  
  public frx(Context paramContext, long paramLong, Location paramLocation, fvt paramfvt)
  {
    this.a = paramContext;
    this.e = paramLong;
    this.b = paramfvt;
    this.c = null;
    this.d = ((fvs)mbb.a(paramContext, fvs.class)).a(paramContext, this, this);
  }
  
  public void a()
  {
    if (this.b == null) {}
    do
    {
      return;
      a(this.d.a());
    } while (!this.d.d());
    fvu localfvu = ((fvv)mbb.a(this.a, fvv.class)).a().a(this.e).a(100);
    this.d.a(localfvu, this);
  }
  
  public void a(Location paramLocation)
  {
    if (!efj.s(this.a)) {}
    for (;;)
    {
      return;
      if ((paramLocation != null) && (System.currentTimeMillis() - paramLocation.getTime() <= 300000L))
      {
        if (this.c != null)
        {
          Location localLocation = this.c;
          if ((localLocation.getLatitude() != paramLocation.getLatitude()) || (localLocation.getLongitude() != paramLocation.getLongitude()) || ((int)localLocation.getAccuracy() - paramLocation.getAccuracy() != 0.0F)) {
            break label111;
          }
        }
        label111:
        for (int i = 1; i == 0; i = 0)
        {
          if (this.b != null) {
            this.b.a(paramLocation);
          }
          this.c = paramLocation;
          return;
        }
      }
    }
  }
  
  public void a(frs paramfrs)
  {
    paramfrs.b();
  }
  
  public void b()
  {
    this.c = null;
    this.d.b();
  }
  
  public void c()
  {
    d();
    this.d.c();
    this.b = null;
  }
  
  public void d()
  {
    this.b = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     frx
 * JD-Core Version:    0.7.0.1
 */