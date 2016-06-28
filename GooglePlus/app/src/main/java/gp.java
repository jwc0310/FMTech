import android.graphics.drawable.Drawable;

class gp
  extends go
{
  public final void a(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }
  
  public final boolean b(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    if (!(paramDrawable instanceof gw)) {
      paramDrawable = new gw(paramDrawable);
    }
    return paramDrawable;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gp
 * JD-Core Version:    0.7.0.1
 */