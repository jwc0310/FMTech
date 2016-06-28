import android.database.Observable;
import java.util.ArrayList;

public final class agb
  extends Observable<agc>
{
  public final void a(int paramInt1, int paramInt2)
  {
    for (int i = -1 + this.mObservers.size(); i >= 0; i--) {
      ((agc)this.mObservers.get(i)).a(paramInt1, paramInt2);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject)
  {
    for (int i = -1 + this.mObservers.size(); i >= 0; i--) {
      ((agc)this.mObservers.get(i)).a(paramInt1, paramInt2, null);
    }
  }
  
  public final boolean a()
  {
    return !this.mObservers.isEmpty();
  }
  
  public final void b()
  {
    for (int i = -1 + this.mObservers.size(); i >= 0; i--) {
      ((agc)this.mObservers.get(i)).a();
    }
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    for (int i = -1 + this.mObservers.size(); i >= 0; i--) {
      ((agc)this.mObservers.get(i)).b(paramInt1, paramInt2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agb
 * JD-Core Version:    0.7.0.1
 */