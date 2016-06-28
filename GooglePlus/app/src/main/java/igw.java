import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.libraries.social.ingest.IngestActivity;
import com.google.android.libraries.social.ingest.IngestService;

public final class igw
  implements ServiceConnection
{
  public igw(IngestActivity paramIngestActivity) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a.d = ((iha)paramIBinder).a;
    this.a.d.a(this.a);
    ihp localihp = this.a.d.c;
    ihe localihe = this.a.g;
    localihe.a = localihp;
    localihe.notifyDataSetChanged();
    if (this.a.k != null)
    {
      ihf localihf = this.a.k;
      localihf.b = localihp;
      localihf.d();
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.a.d = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igw
 * JD-Core Version:    0.7.0.1
 */