import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.apps.photos.viewer.components.shapes.PhotoShapesLayout;
import java.util.List;

final class bbs
  implements View.OnTouchListener
{
  bbs(bbf parambbf) {}
  
  private final boolean a(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return false;
      this.a.d = null;
      continue;
      if ((this.a.d != null) && (this.a.d.a(i, j, 3)))
      {
        this.a.aq.invalidate();
        this.a.d = null;
        return true;
      }
      this.a.d = null;
    }
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i;
    if (3 == this.a.ad)
    {
      i = 1;
      if (i == 0) {
        break label24;
      }
    }
    label24:
    int k;
    int m;
    int n;
    label117:
    int i2;
    label136:
    int i1;
    do
    {
      return true;
      i = 0;
      break;
      if (this.a.ad == 0) {}
      for (int j = 1; j != 0; j = 0) {
        return a(paramMotionEvent);
      }
      k = (int)paramMotionEvent.getX();
      m = (int)paramMotionEvent.getY();
      switch (paramMotionEvent.getAction())
      {
      case 2: 
      default: 
        if (this.a.ad != 0) {
          break label553;
        }
        n = 1;
        if (n != 0) {
          break label683;
        }
        if (3 != this.a.ad) {
          break label559;
        }
        i2 = 1;
        if (i2 == 0) {
          break label565;
        }
        this.a.x();
        i1 = 1;
      }
    } while (i1 != 0);
    return a(paramMotionEvent);
    int i8 = -1 + this.a.c.size();
    int i9 = 0;
    label181:
    if ((i8 >= 0) && (i9 == 0))
    {
      lwu locallwu2 = (lwu)this.a.c.get(i8);
      if (!locallwu2.a(k, m, 0)) {
        break label703;
      }
      this.a.d = locallwu2;
      this.a.aq.invalidate();
    }
    label273:
    label553:
    label559:
    label565:
    label696:
    label703:
    for (int i12 = 1;; i12 = i9)
    {
      i8--;
      i9 = i12;
      break label181;
      int i10 = -1 + this.a.b.size();
      if ((i10 >= 0) && (i9 == 0))
      {
        lwu locallwu1 = (lwu)this.a.b.get(i10);
        if (!locallwu1.a(k, m, 0)) {
          break label696;
        }
        this.a.d = locallwu1;
        this.a.aq.invalidate();
      }
      for (int i11 = 1;; i11 = i9)
      {
        i10--;
        i9 = i11;
        break label273;
        if (i9 == 0) {
          break;
        }
        return true;
        this.a.d = null;
        for (int i6 = -1 + this.a.c.size(); i6 >= 0; i6--) {
          if (((lwu)this.a.c.get(i6)).a(k, m, 1))
          {
            this.a.aq.invalidate();
            return true;
          }
        }
        for (int i7 = -1 + this.a.b.size(); i7 >= 0; i7--) {
          if (((lwu)this.a.b.get(i7)).a(k, m, 1))
          {
            this.a.aq.invalidate();
            return true;
          }
        }
        if ((this.a.d != null) && (this.a.d.a(k, m, 3))) {
          this.a.aq.invalidate();
        }
        this.a.d = null;
        break;
        n = 0;
        break label117;
        i2 = 0;
        break label136;
        int i3;
        label579:
        int i4;
        if (2 == this.a.ad)
        {
          i3 = 1;
          if ((i3 == 0) || (this.a.af)) {
            break label683;
          }
          i4 = -1 + this.a.a.size();
          i1 = 0;
          label613:
          if (i4 < 0) {
            break label670;
          }
          bbc localbbc = (bbc)this.a.a.get(i4);
          if (!localbbc.G) {
            break label689;
          }
          localbbc.G = false;
        }
        for (int i5 = 1;; i5 = i1)
        {
          i4--;
          i1 = i5;
          break label613;
          i3 = 0;
          break label579;
          this.a.aq.invalidate();
          break;
          i1 = 0;
          break;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbs
 * JD-Core Version:    0.7.0.1
 */