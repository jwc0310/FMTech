import android.app.Notification;
import android.os.Parcelable;
import java.util.ArrayList;

class dp
  extends dv
{
  public Notification a(dk paramdk, dl paramdl)
  {
    dy localdy = new dy(paramdk.a, paramdk.x, paramdk.b, paramdk.c, paramdk.f, null, paramdk.g, paramdk.d, null, paramdk.e, paramdk.l, paramdk.m, paramdk.n, paramdk.i, false, paramdk.h, paramdk.k, paramdk.r, paramdk.y, paramdk.t, paramdk.o, paramdk.p, null);
    df.a(localdy, paramdk.q);
    df.a(localdy, paramdk.j);
    return localdy.b();
  }
  
  public final ArrayList<Parcelable> a(dg[] paramArrayOfdg)
  {
    Object localObject;
    if (paramArrayOfdg == null) {
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      localObject = new ArrayList(paramArrayOfdg.length);
      int i = paramArrayOfdg.length;
      for (int j = 0; j < i; j++) {
        ((ArrayList)localObject).add(efj.a(paramArrayOfdg[j]));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dp
 * JD-Core Version:    0.7.0.1
 */