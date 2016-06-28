import android.os.Handler;
import android.view.View;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.spaces.SpaceHeaderView;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;

final class kxr
  implements lvh
{
  private boolean a = true;
  private int b = 0;
  
  public final void a(View paramView, int paramInt) {}
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.b > 0) {
      this.b = paramInt1;
    }
    if ((paramInt1 == 0) && (this.a))
    {
      View localView = paramView.findViewById(efj.Ww);
      if ((localView instanceof SpaceHeaderView))
      {
        if (1.5F * ((SpaceHeaderView)localView).a.getMeasuredHeight() >= paramView.getMeasuredHeight())
        {
          StreamGridView localStreamGridView = (StreamGridView)paramView;
          int i = -1 + efj.y(localStreamGridView.getContext());
          localStreamGridView.n = 1;
          localStreamGridView.o = i;
          if ((this.b == 0) && (paramInt3 == 0))
          {
            kxs localkxs = new kxs(this, localStreamGridView, i);
            efj.m().post(localkxs);
          }
        }
        this.a = false;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kxr
 * JD-Core Version:    0.7.0.1
 */