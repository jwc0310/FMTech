import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.libraries.social.media.ui.MediaView;

public final class iqu
  extends MediaView
{
  private float a = 0.0F;
  
  public iqu(Context paramContext)
  {
    super(paramContext);
    this.T = false;
  }
  
  public final void D_()
  {
    super.D_();
    this.a = 0.0F;
  }
  
  public final void a(float paramFloat)
  {
    if (paramFloat >= 0.0F) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "Radius must be greater than or equal to 0");
      this.a = paramFloat;
      return;
    }
  }
  
  protected final void b(kaz paramkaz)
  {
    if (this.a == 0.0F) {}
    Object localObject;
    do
    {
      return;
      localObject = paramkaz.p;
    } while (!(localObject instanceof Bitmap));
    Bitmap localBitmap = lwe.a((Bitmap)localObject, this.a);
    this.D = new BitmapDrawable(getResources(), localBitmap);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqu
 * JD-Core Version:    0.7.0.1
 */