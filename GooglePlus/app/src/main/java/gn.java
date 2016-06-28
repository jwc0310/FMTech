import android.graphics.drawable.Drawable;

class gn
  extends gm
{
  public final void a(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    if (!(paramDrawable instanceof gv)) {
      paramDrawable = new gv(paramDrawable);
    }
    return paramDrawable;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gn
 * JD-Core Version:    0.7.0.1
 */