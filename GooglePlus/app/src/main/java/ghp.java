import android.graphics.Canvas;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;

public class ghp
  extends ghi
{
  public final ParameterOverlayView n;
  public boolean o = true;
  
  public ghp(ParameterOverlayView paramParameterOverlayView)
  {
    if (paramParameterOverlayView == null) {
      throw new IllegalArgumentException("Target overlay view cannot be null");
    }
    this.n = paramParameterOverlayView;
  }
  
  public void a(Canvas paramCanvas) {}
  
  public final void b(boolean paramBoolean)
  {
    if (this.o == paramBoolean) {
      return;
    }
    this.o = paramBoolean;
    this.n.invalidate();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghp
 * JD-Core Version:    0.7.0.1
 */