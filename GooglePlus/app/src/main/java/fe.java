import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class fe
  implements Iterable<Intent>
{
  private static final fg c = new fh();
  public final ArrayList<Intent> a = new ArrayList();
  public final Context b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      c = new fi();
      return;
    }
  }
  
  public fe(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public final PendingIntent a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    if (this.a.isEmpty()) {
      throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }
    Intent[] arrayOfIntent = (Intent[])this.a.toArray(new Intent[this.a.size()]);
    arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
    return c.a(this.b, arrayOfIntent, paramInt1, paramInt2);
  }
  
  public final fe a(ComponentName paramComponentName)
  {
    int i = this.a.size();
    try
    {
      Intent localIntent;
      for (Object localObject = cz.a(this.b, paramComponentName); localObject != null; localObject = localIntent)
      {
        this.a.add(i, localObject);
        localIntent = cz.a(this.b, ((Intent)localObject).getComponent());
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      throw new IllegalArgumentException(localNameNotFoundException);
    }
  }
  
  public final fe a(Intent paramIntent)
  {
    ComponentName localComponentName = paramIntent.getComponent();
    if (localComponentName == null) {
      localComponentName = paramIntent.resolveActivity(this.b.getPackageManager());
    }
    if (localComponentName != null) {
      a(localComponentName);
    }
    this.a.add(paramIntent);
    return this;
  }
  
  public final fe a(Class<?> paramClass)
  {
    return a(new ComponentName(this.b, paramClass));
  }
  
  public final void a()
  {
    if (this.a.isEmpty()) {
      throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
    Intent[] arrayOfIntent = (Intent[])this.a.toArray(new Intent[this.a.size()]);
    arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
    if (!fo.a(this.b, arrayOfIntent, null))
    {
      Intent localIntent = new Intent(arrayOfIntent[(-1 + arrayOfIntent.length)]);
      localIntent.addFlags(268435456);
      this.b.startActivity(localIntent);
    }
  }
  
  public final Iterator<Intent> iterator()
  {
    return this.a.iterator();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fe
 * JD-Core Version:    0.7.0.1
 */