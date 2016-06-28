import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import java.util.ArrayList;

public final class buu
  extends hqe<ArrayList<cop>>
{
  private final cop[] d;
  private final int e;
  private final int f;
  private final ContentObserver h = new fv(this);
  
  public buu(Context paramContext, cop[] paramArrayOfcop, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.d = paramArrayOfcop;
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  private ArrayList<cop> r()
  {
    int i = 1;
    ArrayList localArrayList = new ArrayList();
    if ((this.f == i) || (this.f == 2)) {}
    while ((this.d != null) && (i == 0))
    {
      ojj localojj;
      int k;
      label71:
      cop localcop;
      if (this.e != -1)
      {
        localojj = bsp.a(this.l, this.e);
        cop[] arrayOfcop = this.d;
        int j = arrayOfcop.length;
        k = 0;
        if (k < j) {
          localcop = arrayOfcop[k];
        }
      }
      else
      {
        try
        {
          if (localcop.a(localojj)) {
            localArrayList.add(localcop);
          }
          k++;
          break label71;
          i = 0;
          continue;
          localojj = null;
        }
        catch (Exception localException)
        {
          do
          {
            String str = String.valueOf(localcop);
            Log.e("PromoLoader", 39 + String.valueOf(str).length() + "Uncaught exception when loading promo: " + str, localException);
          } while (!dun.b());
          throw new RuntimeException(localException);
        }
      }
    }
    return localArrayList;
  }
  
  protected final boolean o()
  {
    this.l.getContentResolver().registerContentObserver(cop.e, false, this.h);
    return true;
  }
  
  protected final boolean p()
  {
    this.l.getContentResolver().unregisterContentObserver(this.h);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     buu
 * JD-Core Version:    0.7.0.1
 */