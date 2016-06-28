import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class edn
  extends ecu
{
  private static final String j = edd.b("com.google.cast.media");
  public long e;
  public ece f;
  public final List<edq> g = new ArrayList();
  public final edq h = new edq(86400000L);
  public final edq i = new edq(86400000L);
  private final edq k = new edq(86400000L);
  private final edq l = new edq(86400000L);
  private final edq m = new edq(86400000L);
  private final edq n = new edq(86400000L);
  private final edq o = new edq(86400000L);
  private final edq p = new edq(86400000L);
  private final edq q = new edq(86400000L);
  private final edq r = new edq(86400000L);
  private final edq s = new edq(86400000L);
  private final edq t = new edq(86400000L);
  private final edq u = new edq(86400000L);
  private final edq v = new edq(86400000L);
  
  public edn(String paramString)
  {
    super(j, "MediaControlChannel", paramString, 1000L);
    this.g.add(this.h);
    this.g.add(this.k);
    this.g.add(this.l);
    this.g.add(this.m);
    this.g.add(this.n);
    this.g.add(this.o);
    this.g.add(this.p);
    this.g.add(this.i);
    this.g.add(this.q);
    this.g.add(this.r);
    this.g.add(this.s);
    this.g.add(this.t);
    this.g.add(this.u);
    this.g.add(this.v);
    e();
  }
  
  private long d()
  {
    if (this.f == null) {
      throw new IllegalStateException("No current media session");
    }
    return this.f.b;
  }
  
  private final void e()
  {
    this.e = 0L;
    this.f = null;
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      edq localedq = (edq)localIterator.next();
      synchronized (edq.b)
      {
        if (localedq.a != -1L) {
          localedq.a();
        }
      }
    }
  }
  
  public final long a(edp paramedp, long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = this.d.a();
    this.n.a(l1, paramedp);
    a(true);
    for (;;)
    {
      try
      {
        localJSONObject.put("requestId", l1);
        localJSONObject.put("type", "SEEK");
        localJSONObject.put("mediaSessionId", d());
        localJSONObject.put("currentTime", edd.a(paramLong));
        if (paramInt != 1) {
          continue;
        }
        localJSONObject.put("resumeState", "PLAYBACK_START");
        if (paramJSONObject != null) {
          localJSONObject.put("customData", paramJSONObject);
        }
      }
      catch (JSONException localJSONException)
      {
        continue;
      }
      a(localJSONObject.toString(), l1, null);
      return l1;
      if (paramInt == 2) {
        localJSONObject.put("resumeState", "PLAYBACK_PAUSE");
      }
    }
  }
  
  public final long a(edp paramedp, eby parameby, boolean paramBoolean, long paramLong, long[] paramArrayOfLong, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = this.d.a();
    this.h.a(l1, paramedp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "LOAD");
      localJSONObject.put("media", parameby.a());
      localJSONObject.put("autoplay", paramBoolean);
      localJSONObject.put("currentTime", edd.a(paramLong));
      if (paramArrayOfLong != null)
      {
        JSONArray localJSONArray = new JSONArray();
        for (int i1 = 0; i1 < paramArrayOfLong.length; i1++) {
          localJSONArray.put(i1, paramArrayOfLong[i1]);
        }
        localJSONObject.put("activeTrackIds", localJSONArray);
      }
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      label156:
      break label156;
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public final long a(edp paramedp, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = this.d.a();
    this.k.a(l1, paramedp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "PAUSE");
      localJSONObject.put("mediaSessionId", d());
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      label73:
      break label73;
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public void a() {}
  
  public final void a(long paramLong, JSONObject paramJSONObject)
  {
    int i1 = 1;
    boolean bool = this.h.a(paramLong);
    int i2;
    if ((this.n.b()) && (!this.n.a(paramLong)))
    {
      i2 = i1;
      if (((!this.o.b()) || (this.o.a(paramLong))) && ((!this.p.b()) || (this.p.a(paramLong)))) {
        break label217;
      }
      label80:
      if (i2 == 0) {
        break label239;
      }
    }
    label217:
    label239:
    for (int i3 = 2;; i3 = 0)
    {
      if (i1 != 0) {
        i3 |= 0x1;
      }
      if ((bool) || (this.f == null))
      {
        this.f = new ece(paramJSONObject);
        this.e = SystemClock.elapsedRealtime();
      }
      for (int i4 = 31;; i4 = this.f.a(paramJSONObject, i3))
      {
        if ((i4 & 0x1) != 0)
        {
          this.e = SystemClock.elapsedRealtime();
          a();
        }
        if ((i4 & 0x2) != 0)
        {
          this.e = SystemClock.elapsedRealtime();
          a();
        }
        Iterator localIterator = this.g.iterator();
        while (localIterator.hasNext()) {
          ((edq)localIterator.next()).a(paramLong, 0, null);
        }
        i2 = 0;
        break;
        i1 = 0;
        break label80;
      }
      return;
    }
  }
  
  protected final boolean a(long paramLong)
  {
    Iterator localIterator1 = this.g.iterator();
    while (localIterator1.hasNext()) {
      ((edq)localIterator1.next()).a(paramLong, 2102);
    }
    for (;;)
    {
      synchronized (edq.b)
      {
        Iterator localIterator2 = this.g.iterator();
        if (localIterator2.hasNext())
        {
          if (!((edq)localIterator2.next()).b()) {
            continue;
          }
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final long b(edp paramedp, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = this.d.a();
    this.l.a(l1, paramedp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "PLAY");
      localJSONObject.put("mediaSessionId", d());
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
      label73:
      break label73;
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public final void b()
  {
    super.b();
    e();
  }
  
  public final eby c()
  {
    if (this.f == null) {
      return null;
    }
    return this.f.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edn
 * JD-Core Version:    0.7.0.1
 */