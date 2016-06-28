import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.widget.ProgressBar;
import com.google.android.libraries.social.media.ui.MediaView;

public final class iql
  implements kbb
{
  public boolean a;
  private iph b;
  
  public iql(MediaView paramMediaView) {}
  
  public final void a(kaz paramkaz)
  {
    switch (paramkaz.q)
    {
    }
    for (;;)
    {
      this.c.invalidate();
      return;
      if ((this.c.I != null) && (this.c.q()))
      {
        ((ife)paramkaz).e = this.c;
        this.c.I.setIndeterminate(true);
        continue;
        this.c.k();
        Object localObject = paramkaz.p;
        if ((localObject instanceof icm))
        {
          this.c.D = new ick((icm)localObject, MediaView.i.a.j());
          ((ick)this.c.D).a(true);
          ((ick)this.c.D).l = this.c.S;
          if (this.c.R >= 0) {
            ((ick)this.c.D).L = this.c.R;
          }
          this.c.D.setCallback(this.c);
          this.c.B = true;
        }
        for (;;)
        {
          this.c.O = true;
          this.c.P = false;
          ((ife)paramkaz).e = null;
          this.c.h();
          if (this.c.F == null) {
            break;
          }
          this.c.F.a(this.c);
          break;
          if ((localObject instanceof ifb))
          {
            FrameSequence localFrameSequence = ((ifb)localObject).a;
            if (localFrameSequence == null)
            {
              this.c.l.q = 5;
            }
            else
            {
              this.c.D = new aq(localFrameSequence, this.c);
              if (this.c.R != 1) {
                ((aq)this.c.D).i = 2;
              }
              this.c.D.setCallback(this.c);
              this.c.B = true;
              ((aq)this.c.D).start();
            }
          }
        }
        this.c.l.q = 5;
      }
    }
  }
  
  public final void ap_()
  {
    if (this.b != null)
    {
      this.b.b(this);
      this.b = null;
    }
    if (this.c.O)
    {
      this.c.O = false;
      this.c.invalidate();
    }
    this.c.P = false;
    this.c.k();
  }
  
  public final void b()
  {
    int i = this.c.u;
    if (this.a) {
      i |= 0x40000;
    }
    for (;;)
    {
      this.b = this.c.a(i, this.c.E, this);
      return;
      this.c.P = true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iql
 * JD-Core Version:    0.7.0.1
 */