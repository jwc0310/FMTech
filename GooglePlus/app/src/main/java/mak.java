import android.util.Log;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class mak
  implements Callable<Void>
{
  private ExecutorService a;
  
  public mak(maj parammaj)
  {
    if (parammaj.e == null) {
      this.a = Executors.newFixedThreadPool(4);
    }
  }
  
  private Void a()
  {
    if (this.b.e == null) {
      Thread.currentThread().setName("VideoServer");
    }
    try
    {
      for (;;)
      {
        if (Thread.interrupted()) {
          break label192;
        }
        Socket localSocket = this.b.a.accept();
        localFutureTask = new FutureTask(new mal(this.b, localSocket));
        if (this.b.e != null) {
          break;
        }
        this.a.execute(localFutureTask);
      }
    }
    catch (SocketException localSocketException)
    {
      for (;;)
      {
        FutureTask localFutureTask;
        if (!localSocketException.getMessage().equals("Socket closed")) {
          Log.e("VideoServer", "SocketException when accepting a new connection", localSocketException);
        }
        return null;
        if (this.b.g != null) {
          this.b.g.cancel(true);
        }
        this.b.g = localFutureTask;
        this.b.e.execute(localFutureTask);
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log.e("VideoServer", "IOException when accepting a new connection", localIOException);
        this.a.shutdownNow();
        continue;
        label192:
        this.a.shutdownNow();
      }
    }
    finally
    {
      this.a.shutdownNow();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mak
 * JD-Core Version:    0.7.0.1
 */