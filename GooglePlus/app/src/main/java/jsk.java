import java.util.concurrent.TimeUnit;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;

final class jsk
  implements ClientConnectionRequest
{
  jsk(jsj paramjsj, ClientConnectionRequest paramClientConnectionRequest) {}
  
  public final void abortRequest()
  {
    this.a.abortRequest();
  }
  
  public final ManagedClientConnection getConnection(long paramLong, TimeUnit paramTimeUnit)
  {
    ManagedClientConnection localManagedClientConnection = this.a.getConnection(paramLong, paramTimeUnit);
    HttpConnectionMetrics localHttpConnectionMetrics = localManagedClientConnection.getMetrics();
    if (localHttpConnectionMetrics != null) {
      localHttpConnectionMetrics.reset();
    }
    return localManagedClientConnection;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsk
 * JD-Core Version:    0.7.0.1
 */