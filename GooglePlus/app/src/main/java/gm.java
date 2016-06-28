import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

public class gm
{
  public void a(Drawable paramDrawable) {}
  
  public void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) {}
  
  public void a(Drawable paramDrawable, int paramInt)
  {
    aau.a(paramDrawable, paramInt);
  }
  
  public void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    aau.a(paramDrawable, paramColorStateList);
  }
  
  public void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    aau.a(paramDrawable, paramMode);
  }
  
  public void a(Drawable paramDrawable, boolean paramBoolean) {}
  
  public boolean b(Drawable paramDrawable)
  {
    return false;
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    if (!(paramDrawable instanceof gu)) {
      paramDrawable = new gu(paramDrawable);
    }
    return paramDrawable;
  }
  
  public int d(Drawable paramDrawable)
  {
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gm
 * JD-Core Version:    0.7.0.1
 */