import android.content.Context;
import android.text.TextUtils;

public final class jvr
  implements jtp
{
  public final void a(Context paramContext, lly paramlly)
  {
    if (!a(paramlly)) {}
    llx localllx;
    do
    {
      return;
      localllx = paramlly.b();
    } while ((localllx == null) || (TextUtils.isEmpty(localllx.e)));
    ipf localipf = ipf.a(paramContext, localllx.f, localllx.h, localllx.e, null, localllx.m);
    ((heh)mbb.a(paramContext, heh.class)).a(localipf, localllx.g, localllx.f, false, paramlly.d);
  }
  
  public final boolean a(lly paramlly)
  {
    return (paramlly != null) && (paramlly.b() != null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvr
 * JD-Core Version:    0.7.0.1
 */