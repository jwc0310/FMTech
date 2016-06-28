import android.content.res.Resources.Theme;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class gx
  extends gw
{
  public gx(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public final void applyTheme(Resources.Theme paramTheme)
  {
    this.a.applyTheme(paramTheme);
  }
  
  public final boolean canApplyTheme()
  {
    return this.a.canApplyTheme();
  }
  
  public final Rect getDirtyBounds()
  {
    return this.a.getDirtyBounds();
  }
  
  public final void getOutline(Outline paramOutline)
  {
    this.a.getOutline(paramOutline);
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    this.a.setHotspot(paramFloat1, paramFloat2);
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gx
 * JD-Core Version:    0.7.0.1
 */