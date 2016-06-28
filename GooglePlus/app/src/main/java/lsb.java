import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class lsb
  extends BroadcastReceiver
{
  static final IntentFilter a = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
  final Context b;
  boolean c;
  Set<Integer> d;
  private final lrn e;
  
  lsb(Context paramContext)
  {
    this.b = paramContext;
    this.e = ((lrn)mbb.b(paramContext, lrn.class));
  }
  
  public final void a(int paramInt)
  {
    try
    {
      if (this.d == null) {
        this.d = new HashSet();
      }
      this.d.add(Integer.valueOf(paramInt));
      if (!this.c)
      {
        this.b.getApplicationContext().registerReceiver(this, a);
        this.c = true;
      }
      return;
    }
    finally {}
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      if ((!lsc.a(paramIntent)) || (!this.c)) {
        break label102;
      }
      lrp locallrp = (lrp)mbb.a(paramContext, lrp.class);
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext()) {
        locallrp.a(((Integer)localIterator.next()).intValue());
      }
      this.d.clear();
    }
    finally {}
    paramContext.getApplicationContext().unregisterReceiver(this);
    this.c = false;
    label102:
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsb
 * JD-Core Version:    0.7.0.1
 */