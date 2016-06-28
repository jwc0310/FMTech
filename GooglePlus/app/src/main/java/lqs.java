import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

final class lqs
  extends agj
{
  lqs(lqp paramlqp, pde parampde) {}
  
  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    ahp localahp;
    int[] arrayOfInt1;
    for (;;)
    {
      try
      {
        this.a.a.a("scrolling");
        super.a(paramRecyclerView, paramInt1, paramInt2);
        ahz localahz2;
        if (paramInt2 > 0)
        {
          this.b.v = true;
          localahp = (ahp)paramRecyclerView.h;
          arrayOfInt1 = new int[localahp.a];
          int i = 0;
          if (i >= localahp.a) {
            break;
          }
          localahz2 = localahp.b[i];
          if (localahz2.f.e)
          {
            n = localahz2.a(0, localahz2.a.size(), false);
            arrayOfInt1[i] = n;
            i++;
            continue;
          }
        }
        else
        {
          if (paramInt2 >= 0) {
            continue;
          }
          this.b.v = false;
          continue;
        }
        int n = localahz2.a(-1 + localahz2.a.size(), -1, false);
      }
      finally
      {
        pea.b("scrolling");
      }
    }
    int[] arrayOfInt2 = new int[localahp.a];
    int j = 0;
    if (j < localahp.a)
    {
      ahz localahz1 = localahp.b[j];
      if (localahz1.f.e) {}
      for (int m = localahz1.a(-1 + localahz1.a.size(), -1, false);; m = localahz1.a(0, localahz1.a.size(), false))
      {
        arrayOfInt2[j] = m;
        j++;
        break;
      }
    }
    int k = (arrayOfInt1[0] + arrayOfInt2[0]) / 2;
    if (Math.abs(k - this.b.q) > 1)
    {
      this.b.q = k;
      this.b.g.a(k, true);
    }
    pea.b("scrolling");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqs
 * JD-Core Version:    0.7.0.1
 */