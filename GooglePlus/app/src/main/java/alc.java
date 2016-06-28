import android.view.View;
import android.widget.FrameLayout;

final class alc
  implements Runnable
{
  alc(akx paramakx) {}
  
  public final void run()
  {
    View localView;
    int i;
    int j;
    if (this.a.ai != null)
    {
      localView = this.a.ai;
      akx localakx = this.a;
      if ((localakx.am <= 0) || (localakx.an <= 0)) {
        break label73;
      }
      i = 1;
      j = 0;
      if (i == 0) {
        break label78;
      }
    }
    for (;;)
    {
      localView.setVisibility(j);
      if (this.a.ah != null) {
        this.a.ah.requestLayout();
      }
      return;
      label73:
      i = 0;
      break;
      label78:
      j = 4;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alc
 * JD-Core Version:    0.7.0.1
 */