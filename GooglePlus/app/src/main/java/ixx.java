import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.UserAgent;
import org.json.JSONObject;

public final class ixx
  implements hyg, ixs
{
  private final Context a;
  private final ixy b;
  private CronetEngine c;
  
  public ixx(Context paramContext, iyb paramiyb)
  {
    this.a = paramContext;
    this.b = new ixy(paramiyb.a);
    ((hyi)mbb.a(this.a, hyi.class)).a(this);
  }
  
  private void a()
  {
    int i = 2;
    for (;;)
    {
      int k;
      int m;
      synchronized (this.b)
      {
        Context localContext1 = this.a;
        String str1 = this.b.d;
        rne[] arrayOfrne = this.b.a();
        Long[] arrayOfLong = this.b.c;
        ixf localixf = (ixf)mbb.a(localContext1, ixf.class);
        int j = efj.v(localContext1);
        float f = 8.0E-006F * localixf.j();
        k = localixf.l();
        if (k == i)
        {
          i = 1;
          kql localkql = new kql(j, f, i, 8.0E-006F * localixf.k(), arrayOfrne, arrayOfLong);
          localkql.e = str1;
          localkql.b(localContext1);
          if (this.c == null)
          {
            mbj localmbj = new mbj(this.a, ixq.class);
            if (!new ArrayList(localmbj.a.keySet()).contains("enable_cronet_histogram_logging")) {
              break label511;
            }
            ixq localixq = (ixq)localmbj.a.get("enable_cronet_histogram_logging");
            if (!fpf.a(localixq.a, localixq.b, localixq.c)) {
              break label511;
            }
            m = 1;
            if (m != 0)
            {
              CronetEngine.Builder localBuilder = new CronetEngine.Builder(this.a);
              if (localBuilder.a.optString("USER_AGENT").isEmpty()) {
                localBuilder.a("USER_AGENT", UserAgent.a(localBuilder.b));
              }
              boolean bool = localBuilder.a.optBoolean("ENABLE_LEGACY_MODE");
              CronetEngine localCronetEngine = null;
              if (!bool) {
                localCronetEngine = CronetEngine.a(localBuilder);
              }
              if (localCronetEngine == null) {
                localCronetEngine = CronetEngine.a(localBuilder);
              }
              new StringBuilder("Using network stack: ").append(localCronetEngine.b());
              this.c = localCronetEngine;
            }
          }
          if (this.c != null)
          {
            Context localContext2 = this.a;
            String str2 = this.b.d;
            byte[] arrayOfByte = this.c.c();
            if (arrayOfByte.length > 0)
            {
              kpw localkpw = new kpw(str2, arrayOfByte);
              ((gww)mbb.a(localContext2, gww.class)).a(localContext2, localkpw);
            }
          }
          if (Log.isLoggable("LogSink", 3))
          {
            int n = this.b.a().length;
            new StringBuilder(29).append("Flushed ").append(n).append(" requests.");
          }
          ixy localixy2 = this.b;
          localixy2.d = null;
          localixy2.a.clear();
          return;
        }
      }
      if (k != 1) {
        if (k == -1)
        {
          i = 3;
        }
        else if (k == -2)
        {
          i = 4;
        }
        else
        {
          i = 0;
          continue;
          label511:
          m = 0;
        }
      }
    }
  }
  
  public final void a(ixt paramixt)
  {
    int i = 3;
    kl localkl;
    label76:
    int k;
    try
    {
      localkl = (kl)paramixt.l;
      int j = paramixt.i;
      if (j != 200) {
        return;
      }
      mbb.a(this.a, jyc.class);
      ixy localixy1 = this.b;
      String str1 = paramixt.c;
      if (localixy1.d == null) {
        break label608;
      }
      if (!localixy1.d.equals(str1)) {
        break label371;
      }
    }
    finally {}
    if (k == 0) {
      a();
    }
    label453:
    label474:
    label608:
    label614:
    for (;;)
    {
      rne localrne;
      String str2;
      ArrayList localArrayList;
      synchronized (this.b)
      {
        localrne = new rne();
        localrne.e = Integer.valueOf(paramixt.i);
        localrne.b = paramixt.b;
        localrne.g = Integer.valueOf((int)paramixt.g);
        localrne.f = Integer.valueOf((int)paramixt.h);
        localrne.c = Integer.valueOf((int)(paramixt.f - paramixt.d));
        localrne.d = Integer.valueOf((int)(paramixt.e - paramixt.d));
        str2 = paramixt.j;
        if ((str2 == null) || (str2.isEmpty())) {
          break label614;
        }
        if (!str2.equals("http/1.1")) {
          break label377;
        }
        i = 1;
        localrne.h = i;
        localrne.a = paramixt.a;
        if (paramixt.k > 0L) {
          localrne.i = Long.valueOf(paramixt.k);
        }
        if ((localkl == null) || (localkl.keySet().size() <= 1)) {
          break label474;
        }
        localArrayList = new ArrayList();
        Iterator localIterator = localkl.keySet().iterator();
        if (!localIterator.hasNext()) {
          break label453;
        }
        String str4 = (String)localIterator.next();
        rnt localrnt = new rnt();
        localrnt.a = str4;
        localrnt.b = ((Long)localkl.get(str4));
        localArrayList.add(localrnt);
      }
      label371:
      k = 0;
      break label76;
      label377:
      if (str2.equals("spdy/2")) {
        i = 2;
      } else if (!str2.equals("spdy/3")) {
        if (str2.equals("spdy/3.1"))
        {
          i = 4;
        }
        else if (str2.startsWith("h2"))
        {
          i = 5;
        }
        else
        {
          if (str2.equals("quic/1+spdy/3"))
          {
            i = 6;
            continue;
            localrne.j = ((rnt[])localArrayList.toArray(new rnt[localArrayList.size()]));
            ixy localixy3 = this.b;
            localixy3.d = paramixt.c;
            localixy3.a.add(localrne);
            this.b.a(this.a);
            if (Log.isLoggable("LogSink", 3))
            {
              String str3 = String.valueOf(localrne);
              new StringBuilder(14 + String.valueOf(str3).length()).append("Added request:").append(str3);
            }
            ixy localixy4 = this.b;
            if (localixy4.a.size() >= localixy4.b) {}
            for (int m = 1;; m = 0)
            {
              if (m != 0) {
                a();
              }
              break;
            }
            k = 1;
            break label76;
          }
          i = 0;
        }
      }
    }
  }
  
  public final void g()
  {
    this.b.c = null;
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixx
 * JD-Core Version:    0.7.0.1
 */