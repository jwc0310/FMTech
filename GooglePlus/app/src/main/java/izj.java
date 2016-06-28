import android.util.SparseArray;
import com.google.android.libraries.social.networkqueue.impl.NetworkQueueService;

public class izj
{
  public izj(NetworkQueueService paramNetworkQueueService) {}
  
  public void a(izi paramizi, iyk paramiyk)
  {
    for (;;)
    {
      int j;
      synchronized (this.a.a)
      {
        if (!paramizi.a()) {
          this.a.b.remove(paramiyk.b());
        }
        if (((ixf)mbb.a(this.a, ixf.class)).a())
        {
          int i = this.a.b.size();
          j = 0;
          if (j < i)
          {
            int k = this.a.b.keyAt(j);
            if (!((izi)this.a.b.get(k)).a()) {
              break label174;
            }
            return;
          }
        }
        NetworkQueueService localNetworkQueueService = this.a;
        iyj localiyj = (iyj)mbb.a(localNetworkQueueService, iyj.class);
        if (localiyj.a(localNetworkQueueService)) {
          localiyj.b(localNetworkQueueService);
        }
        this.a.c.a();
        return;
      }
      label174:
      j++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izj
 * JD-Core Version:    0.7.0.1
 */