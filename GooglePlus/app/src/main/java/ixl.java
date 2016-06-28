import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class ixl
  extends BroadcastReceiver
{
  private CopyOnWriteArraySet<x> a = new CopyOnWriteArraySet();
  private final ixf b;
  
  public ixl(ixf paramixf)
  {
    this.b = paramixf;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.b.a())
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        localIterator.next();
        paramContext.getApplicationContext();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixl
 * JD-Core Version:    0.7.0.1
 */