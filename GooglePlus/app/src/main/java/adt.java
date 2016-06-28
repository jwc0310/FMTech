import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public final class adt
  implements adx
{
  public final float a(adu paramadu)
  {
    return 2.0F * ((agw)paramadu.getBackground()).a;
  }
  
  public final void a() {}
  
  public final void a(adu paramadu, float paramFloat)
  {
    agw localagw = (agw)paramadu.getBackground();
    if (paramFloat != localagw.a)
    {
      localagw.a = paramFloat;
      localagw.a(null);
      localagw.invalidateSelf();
    }
  }
  
  public final void a(adu paramadu, int paramInt)
  {
    agw localagw = (agw)paramadu.getBackground();
    localagw.b.setColor(paramInt);
    localagw.invalidateSelf();
  }
  
  public final void a(adu paramadu, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramadu.setBackgroundDrawable(new agw(paramInt, paramFloat1));
    View localView = (View)paramadu;
    localView.setClipToOutline(true);
    localView.setElevation(paramFloat2);
    agw localagw = (agw)paramadu.getBackground();
    boolean bool1 = paramadu.a();
    boolean bool2 = paramadu.b();
    if ((paramFloat3 != localagw.c) || (localagw.d != bool1) || (localagw.e != bool2))
    {
      localagw.c = paramFloat3;
      localagw.d = bool1;
      localagw.e = bool2;
      localagw.a(null);
      localagw.invalidateSelf();
    }
    if (!paramadu.a())
    {
      paramadu.a(0, 0, 0, 0);
      return;
    }
    float f1 = ((agw)paramadu.getBackground()).c;
    float f2 = ((agw)paramadu.getBackground()).a;
    int i = (int)Math.ceil(agx.b(f1, f2, paramadu.b()));
    int j = (int)Math.ceil(agx.a(f1, f2, paramadu.b()));
    paramadu.a(i, j, i, j);
  }
  
  public final float b(adu paramadu)
  {
    return 2.0F * ((agw)paramadu.getBackground()).a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adt
 * JD-Core Version:    0.7.0.1
 */