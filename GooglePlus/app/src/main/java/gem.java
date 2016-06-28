import android.content.ContextWrapper;
import android.graphics.Bitmap;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;

public abstract interface gem
{
  public abstract float a(int paramInt1, int paramInt2);
  
  public abstract int a(FilterParameter paramFilterParameter, int paramInt);
  
  public abstract FilterParameter a(int paramInt);
  
  public abstract void a(gfb paramgfb);
  
  public abstract float b(int paramInt1, int paramInt2);
  
  public abstract Object c(int paramInt1, int paramInt2);
  
  public abstract void cleanUp();
  
  public abstract boolean frameShouldShuffle(int paramInt);
  
  public abstract Bitmap rotateImage(Bitmap paramBitmap, int paramInt, boolean paramBoolean);
  
  public abstract void setUpContext(ContextWrapper paramContextWrapper);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gem
 * JD-Core Version:    0.7.0.1
 */