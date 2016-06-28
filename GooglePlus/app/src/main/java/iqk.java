import android.widget.ProgressBar;
import com.google.android.libraries.social.media.ui.MediaView;

public final class iqk
  implements Runnable
{
  public iqk(MediaView paramMediaView, long paramLong1, long paramLong2) {}
  
  public final void run()
  {
    if (this.a != 0L)
    {
      if (this.c.I.isIndeterminate())
      {
        this.c.I.setIndeterminate(false);
        this.c.I.setMax((int)this.b);
      }
      this.c.I.setProgress((int)this.a);
      this.c.invalidate();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqk
 * JD-Core Version:    0.7.0.1
 */