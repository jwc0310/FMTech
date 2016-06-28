import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class adv
  implements adx
{
  final RectF a = new RectF();
  
  private void c(adu paramadu)
  {
    Rect localRect = new Rect();
    ((agx)paramadu.getBackground()).getPadding(localRect);
    View localView1 = (View)paramadu;
    agx localagx1 = (agx)paramadu.getBackground();
    localView1.setMinimumHeight((int)Math.ceil(2.0F * Math.max(localagx1.e, localagx1.d + localagx1.a + 1.5F * localagx1.e / 2.0F) + 2.0F * (1.5F * localagx1.e + localagx1.a)));
    View localView2 = (View)paramadu;
    agx localagx2 = (agx)paramadu.getBackground();
    localView2.setMinimumWidth((int)Math.ceil(2.0F * Math.max(localagx2.e, localagx2.d + localagx2.a + localagx2.e / 2.0F) + 2.0F * (localagx2.e + localagx2.a)));
    paramadu.a(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  public final float a(adu paramadu)
  {
    agx localagx = (agx)paramadu.getBackground();
    return 2.0F * Math.max(localagx.e, localagx.d + localagx.a + localagx.e / 2.0F) + 2.0F * (localagx.e + localagx.a);
  }
  
  public void a()
  {
    agx.b = new adw(this);
  }
  
  public final void a(adu paramadu, float paramFloat)
  {
    agx localagx = (agx)paramadu.getBackground();
    float f = (int)(0.5F + paramFloat);
    if (localagx.d != f)
    {
      localagx.d = f;
      localagx.f = true;
      localagx.invalidateSelf();
    }
    c(paramadu);
  }
  
  public final void a(adu paramadu, int paramInt)
  {
    agx localagx = (agx)paramadu.getBackground();
    localagx.c.setColor(paramInt);
    localagx.invalidateSelf();
  }
  
  public final void a(adu paramadu, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    agx localagx = new agx(paramContext.getResources(), paramInt, paramFloat1, paramFloat2, paramFloat3);
    localagx.g = paramadu.b();
    localagx.invalidateSelf();
    paramadu.setBackgroundDrawable(localagx);
    c(paramadu);
  }
  
  public final float b(adu paramadu)
  {
    agx localagx = (agx)paramadu.getBackground();
    return 2.0F * Math.max(localagx.e, localagx.d + localagx.a + 1.5F * localagx.e / 2.0F) + 2.0F * (1.5F * localagx.e + localagx.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adv
 * JD-Core Version:    0.7.0.1
 */