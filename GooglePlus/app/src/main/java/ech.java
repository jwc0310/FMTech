import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ech
  implements ebu
{
  final Object a = new Object();
  public final edn b = new eci(this, null);
  final edo c = new edo(this);
  public ecn d;
  
  public ech()
  {
    edn localedn = this.b;
    localedn.d = this.c;
    if (localedn.d == null) {
      localedn.b();
    }
  }
  
  public final long a()
  {
    long l1 = 0L;
    long l5;
    long l6;
    for (;;)
    {
      long l2;
      long l3;
      synchronized (this.a)
      {
        edn localedn = this.b;
        eby localeby = localedn.c();
        if (localeby == null) {
          return l1;
        }
        if (localedn.e == l1) {
          continue;
        }
        double d1 = localedn.f.d;
        l2 = localedn.f.g;
        int i = localedn.f.e;
        if ((d1 == 0.0D) || (i != 2)) {
          break label169;
        }
        l3 = SystemClock.elapsedRealtime() - localedn.e;
        if (l3 >= l1) {
          break label162;
        }
        l4 = l1;
        break label175;
        l5 = localeby.d;
        l6 = l2 + (d1 * l4);
        if ((l5 <= l1) || (l6 <= l5)) {
          break label194;
        }
      }
      label155:
      l5 = l6;
      break;
      label162:
      long l4 = l3;
      break label175;
      label169:
      l1 = l2;
      continue;
      label175:
      if (l4 == l1) {
        l1 = l2;
      }
    }
    for (;;)
    {
      l1 = l5;
      break;
      label194:
      if (l6 >= l1) {
        break label155;
      }
      l5 = l1;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    edn localedn = this.b;
    localedn.b.a("message received: %s", new Object[] { paramString2 });
    JSONObject localJSONObject1;
    String str;
    long l;
    try
    {
      localJSONObject1 = new JSONObject(paramString2);
      str = localJSONObject1.getString("type");
      l = localJSONObject1.optLong("requestId", -1L);
      if (str.equals("MEDIA_STATUS"))
      {
        JSONArray localJSONArray = localJSONObject1.getJSONArray("status");
        if (localJSONArray.length() > 0)
        {
          localedn.a(l, localJSONArray.getJSONObject(0));
          return;
        }
        localedn.f = null;
        localedn.a();
        localedn.i.a(l, 0, null);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      edm localedm = localedn.b;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localJSONException.getMessage();
      arrayOfObject[1] = paramString2;
      localedm.b("Message is malformed (%s); ignoring: %s", arrayOfObject);
      return;
    }
    if (str.equals("INVALID_PLAYER_STATE"))
    {
      localedn.b.b("received unexpected error: Invalid Player State.", new Object[0]);
      JSONObject localJSONObject5 = localJSONObject1.optJSONObject("customData");
      Iterator localIterator2 = localedn.g.iterator();
      while (localIterator2.hasNext()) {
        ((edq)localIterator2.next()).a(l, 2100, localJSONObject5);
      }
    }
    if (str.equals("LOAD_FAILED"))
    {
      JSONObject localJSONObject4 = localJSONObject1.optJSONObject("customData");
      localedn.h.a(l, 2100, localJSONObject4);
      return;
    }
    if (str.equals("LOAD_CANCELLED"))
    {
      JSONObject localJSONObject3 = localJSONObject1.optJSONObject("customData");
      localedn.h.a(l, 2101, localJSONObject3);
      return;
    }
    if (str.equals("INVALID_REQUEST"))
    {
      localedn.b.b("received unexpected error: Invalid Request.", new Object[0]);
      JSONObject localJSONObject2 = localJSONObject1.optJSONObject("customData");
      Iterator localIterator1 = localedn.g.iterator();
      while (localIterator1.hasNext()) {
        ((edq)localIterator1.next()).a(l, 2100, localJSONObject2);
      }
    }
  }
  
  public final long b()
  {
    for (;;)
    {
      synchronized (this.a)
      {
        eby localeby = this.b.c();
        if (localeby != null)
        {
          l = localeby.d;
          return l;
        }
      }
      long l = 0L;
    }
  }
  
  public final ece c()
  {
    synchronized (this.a)
    {
      ece localece = this.b.f;
      return localece;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ech
 * JD-Core Version:    0.7.0.1
 */