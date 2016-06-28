import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

final class jsj
  extends ThreadSafeClientConnManager
{
  public jsj(HttpParams paramHttpParams, SchemeRegistry paramSchemeRegistry)
  {
    super(paramHttpParams, paramSchemeRegistry);
  }
  
  public final void releaseConnection(ManagedClientConnection paramManagedClientConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    HttpConnectionMetrics localHttpConnectionMetrics = paramManagedClientConnection.getMetrics();
    if (localHttpConnectionMetrics != null)
    {
      long l1 = localHttpConnectionMetrics.getReceivedBytesCount();
      ArrayList localArrayList1 = (ArrayList)jsm.b.get();
      int i = localArrayList1.size();
      if (i > 0)
      {
        jso localjso2 = (jso)localArrayList1.get(i - 1);
        localjso2.d = (l1 + localjso2.d);
      }
      long l2 = localHttpConnectionMetrics.getSentBytesCount();
      ArrayList localArrayList2 = (ArrayList)jsm.b.get();
      int j = localArrayList2.size();
      if (j > 0)
      {
        jso localjso1 = (jso)localArrayList2.get(j - 1);
        localjso1.e = (l2 + localjso1.e);
      }
    }
    super.releaseConnection(paramManagedClientConnection, paramLong, paramTimeUnit);
  }
  
  public final ClientConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    return new jsk(this, super.requestConnection(paramHttpRoute, paramObject));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsj
 * JD-Core Version:    0.7.0.1
 */