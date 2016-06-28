import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

final class abp
  extends Handler
{
  final WeakReference<abk> a;
  
  public abp(abk paramabk)
  {
    this.a = new WeakReference(paramabk);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    abk localabk = (abk)this.a.get();
    int j;
    int k;
    Object localObject;
    Bundle localBundle1;
    boolean bool;
    if (localabk != null)
    {
      int i = paramMessage.what;
      j = paramMessage.arg1;
      k = paramMessage.arg2;
      localObject = paramMessage.obj;
      localBundle1 = paramMessage.peekData();
      switch (i)
      {
      default: 
        bool = false;
      }
    }
    for (;;)
    {
      if ((!bool) && (abj.i)) {
        new StringBuilder("Unhandled message from server: ").append(paramMessage);
      }
      return;
      if (j == localabk.f)
      {
        localabk.f = 0;
        abj localabj = localabk.h;
        if (localabj.n == localabk)
        {
          if (abj.i) {
            new StringBuilder().append(localabj).append(": Service connection error - ").append("Registation failed");
          }
          localabj.e();
        }
      }
      if ((aar)localabk.g.get(j) != null) {
        localabk.g.remove(j);
      }
      bool = true;
      continue;
      bool = true;
      continue;
      if ((localObject != null) && (!(localObject instanceof Bundle))) {
        break;
      }
      bool = localabk.a(j, k, (Bundle)localObject);
      continue;
      if ((localObject != null) && (!(localObject instanceof Bundle))) {
        break;
      }
      Bundle localBundle2 = (Bundle)localObject;
      if (localabk.e != 0)
      {
        abj.a(localabk.h, localabk, aak.a(localBundle2));
        bool = true;
      }
      else
      {
        bool = false;
        continue;
        if ((localObject != null) && (!(localObject instanceof Bundle))) {
          break;
        }
        ((Bundle)localObject);
        if ((aar)localabk.g.get(j) != null)
        {
          localabk.g.remove(j);
          bool = true;
        }
        else
        {
          bool = false;
          continue;
          if ((localObject != null) && (!(localObject instanceof Bundle))) {
            break;
          }
          if (localBundle1 == null) {}
          for (;;)
          {
            ((Bundle)localObject);
            if ((aar)localabk.g.get(j) == null) {
              break label415;
            }
            localabk.g.remove(j);
            bool = true;
            break;
            localBundle1.getString("error");
          }
          label415:
          bool = false;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abp
 * JD-Core Version:    0.7.0.1
 */