import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class dmm
{
  private final List<Intent> a = new ArrayList(8);
  
  public dmm(int paramInt) {}
  
  public final Intent a(Context paramContext, Class<?> paramClass)
  {
    try
    {
      if (this.a.size() > 0)
      {
        localIntent = (Intent)this.a.remove(0);
        localIntent.setData(null);
        Iterator localIterator = localIntent.getExtras().keySet().iterator();
        while (localIterator.hasNext()) {
          localIntent.removeExtra((String)localIterator.next());
        }
      }
      if (!Log.isLoggable("IntentPool", 3)) {
        break label124;
      }
    }
    finally {}
    int i = this.a.size();
    new StringBuilder(26).append("Pool enlarged: ").append(i);
    label124:
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramContext, paramClass));
    localIntent.putExtra("from_pool", true);
    return localIntent;
  }
  
  public final void a(Intent paramIntent)
  {
    try
    {
      this.a.add(paramIntent);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmm
 * JD-Core Version:    0.7.0.1
 */