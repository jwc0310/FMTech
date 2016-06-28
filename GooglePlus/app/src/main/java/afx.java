import android.os.Build.VERSION;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;

public final class afx
  implements Runnable
{
  public afx(RecyclerView paramRecyclerView) {}
  
  public final void run()
  {
    if (!this.a.l) {}
    label166:
    label184:
    label199:
    label205:
    label211:
    label224:
    do
    {
      do
      {
        do
        {
          return;
          if (!this.a.q) {
            break;
          }
          if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection("RV FullInvalidate");
          }
          this.a.i();
        } while (Build.VERSION.SDK_INT < 18);
        Trace.endSection();
        return;
      } while (!this.a.c.d());
      if (Build.VERSION.SDK_INT >= 18) {
        Trace.beginSection("RV PartialInvalidate");
      }
      this.a.a();
      this.a.c.b();
      if (!this.a.m)
      {
        RecyclerView localRecyclerView = this.a;
        int i = localRecyclerView.d.a();
        int j = 0;
        if (j < i)
        {
          agt localagt = RecyclerView.b(localRecyclerView.d.b(j));
          int k;
          int m;
          if ((localagt != null) && (!localagt.a()))
          {
            if ((0x8 & localagt.i) == 0) {
              break label199;
            }
            k = 1;
            if (k == 0)
            {
              if ((0x4 & localagt.i) == 0) {
                break label205;
              }
              m = 1;
              if (m == 0) {
                break label211;
              }
            }
            localRecyclerView.requestLayout();
          }
          for (;;)
          {
            j++;
            break;
            k = 0;
            break label166;
            m = 0;
            break label184;
            int n;
            if ((0x2 & localagt.i) != 0)
            {
              n = 1;
              if (n == 0) {
                break label300;
              }
              int i1 = localRecyclerView.g.a(localagt.b);
              if (localagt.e != i1) {
                break label315;
              }
              if ((0x40 & localagt.i) == 0) {
                break label302;
              }
            }
            for (int i2 = 1;; i2 = 0)
            {
              if ((i2 != 0) && (localRecyclerView.h())) {
                break label308;
              }
              localRecyclerView.g.b(localagt, localagt.b);
              break;
              n = 0;
              break label224;
              break;
            }
            localRecyclerView.requestLayout();
          }
          localRecyclerView.requestLayout();
        }
      }
      this.a.a(true);
    } while (Build.VERSION.SDK_INT < 18);
    label300:
    label302:
    label308:
    label315:
    Trace.endSection();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afx
 * JD-Core Version:    0.7.0.1
 */