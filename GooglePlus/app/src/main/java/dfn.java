import android.content.Context;
import android.location.Location;
import android.os.Handler;

public final class dfn
  implements fvt
{
  final Context a;
  final int b;
  final fvt c;
  final Handler d;
  final boolean e;
  public boolean f = false;
  
  public dfn(Context paramContext, int paramInt, fvt paramfvt)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramfvt;
    this.d = new Handler();
    this.e = dun.b.a().equalsIgnoreCase("TRUE");
  }
  
  public final void a(Location paramLocation)
  {
    if (!this.f) {
      new dfo(this, paramLocation).start();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfn
 * JD-Core Version:    0.7.0.1
 */