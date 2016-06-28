import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class aat
  extends Handler
{
  private final ArrayList<aaq> a = new ArrayList();
  
  aat(aas paramaas) {}
  
  public final void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1 = paramMessage.obj;
    switch (i)
    {
    }
    label207:
    int n;
    aao localaao2;
    aap localaap;
    aay localaay;
    try
    {
      int j = this.b.b.size();
      for (;;)
      {
        int k = j - 1;
        if (k < 0) {
          break label207;
        }
        aao localaao1 = (aao)((WeakReference)this.b.b.get(k)).get();
        if (localaao1 == null)
        {
          this.b.b.remove(k);
          j = k;
          continue;
          this.b.f.a((aay)localObject1);
          break;
          this.b.f.b((aay)localObject1);
          break;
          this.b.f.c((aay)localObject1);
          break;
          this.b.f.d((aay)localObject1);
          break;
        }
        this.a.addAll(localaao1.d);
        j = k;
      }
      int m = this.a.size();
      n = 0;
      if (n >= m) {
        break label432;
      }
      aaq localaaq = (aaq)this.a.get(n);
      localaao2 = localaaq.a;
      localaap = localaaq.b;
      switch (0xFF00 & i)
      {
      case 256: 
        localaay = (aay)localObject1;
        if ((0x2 & localaaq.d) != 0) {
          break label446;
        }
        if (!localaay.a(localaaq.c)) {
          break label340;
        }
      }
    }
    finally
    {
      this.a.clear();
    }
    localaap.a(localaao2, localaay);
    break label440;
    label340:
    int i1 = 0;
    break label449;
    localaap.b(localaao2, localaay);
    break label440;
    localaap.a(localaao2);
    break label440;
    localaap.a(localaay);
    break label440;
    localaap.c(localaao2, localaay);
    break label440;
    localaap.d(localaao2, localaay);
    break label440;
    localaap.b(localaao2);
    break label440;
    localaap.c(localaao2);
    break label440;
    localaap.d(localaao2);
    break label440;
    label432:
    this.a.clear();
    return;
    for (;;)
    {
      label440:
      n++;
      break;
      label446:
      i1 = 1;
      label449:
      if (i1 != 0)
      {
        switch (i)
        {
        }
        continue;
        switch (i)
        {
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aat
 * JD-Core Version:    0.7.0.1
 */