import android.graphics.Matrix;
import android.view.View;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.spaces.SpaceHeaderView;

public final class kxt
  implements lvh
{
  private Matrix a = new Matrix();
  private int b = -1;
  
  public final void a(View paramView, int paramInt) {}
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    MediaView localMediaView;
    int i;
    if (paramInt1 == 0)
    {
      View localView = paramView.findViewById(efj.Ww);
      if ((localView instanceof SpaceHeaderView))
      {
        localMediaView = (MediaView)localView.findViewById(efj.Wv);
        if (-paramInt3 <= localMediaView.getMeasuredHeight())
        {
          i = -paramInt3 / 2;
          if (i != this.b)
          {
            this.a.setTranslate(0.0F, i);
            localMediaView.z = this.a;
            if (localMediaView.A != null) {
              break label127;
            }
            localMediaView.A = new Matrix();
          }
        }
      }
    }
    for (;;)
    {
      localMediaView.z.invert(localMediaView.A);
      localMediaView.invalidate();
      this.b = i;
      return;
      label127:
      localMediaView.A.reset();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kxt
 * JD-Core Version:    0.7.0.1
 */