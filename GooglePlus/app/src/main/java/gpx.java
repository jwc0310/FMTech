import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gpx
  implements mdh, mdj, mdk, mfd
{
  List<gqa> a = new ArrayList();
  private boolean b;
  
  public gpx(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a()
  {
    this.b = true;
  }
  
  public final boolean a(KeyEvent paramKeyEvent)
  {
    if ((this.b) && (paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1))
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        if (((gqa)localIterator.next()).H()) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final void b()
  {
    this.b = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpx
 * JD-Core Version:    0.7.0.1
 */