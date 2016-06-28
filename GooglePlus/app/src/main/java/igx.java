import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.view.ActionMode;
import com.google.android.libraries.social.ingest.IngestActivity;
import java.lang.ref.WeakReference;

public final class igx
  extends Handler
{
  private WeakReference<IngestActivity> a;
  
  public igx(IngestActivity paramIngestActivity)
  {
    this.a = new WeakReference(paramIngestActivity);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    IngestActivity localIngestActivity = (IngestActivity)this.a.get();
    if ((localIngestActivity == null) || (!localIngestActivity.e)) {
      return;
    }
    ProgressDialog localProgressDialog;
    boolean bool;
    label79:
    int i;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      localProgressDialog = localIngestActivity.j();
      if (localIngestActivity.o.d == 0)
      {
        bool = true;
        localProgressDialog.setIndeterminate(bool);
        i = 0;
        if (!bool) {
          break label191;
        }
      }
    case 1: 
      for (;;)
      {
        localProgressDialog.setProgressStyle(i);
        if (localIngestActivity.o.b != null) {
          localProgressDialog.setTitle(localIngestActivity.o.b);
        }
        if (localIngestActivity.o.a != null) {
          localProgressDialog.setMessage(localIngestActivity.o.a);
        }
        if (!bool)
        {
          localProgressDialog.setProgress(localIngestActivity.o.c);
          localProgressDialog.setMax(localIngestActivity.o.d);
        }
        if (localProgressDialog.isShowing()) {
          break;
        }
        localProgressDialog.show();
        return;
        localIngestActivity.k();
        return;
        bool = false;
        break label79;
        i = 1;
      }
    case 2: 
      localIngestActivity.g.notifyDataSetChanged();
      if (localIngestActivity.i != null)
      {
        localIngestActivity.i.finish();
        localIngestActivity.i = null;
      }
      localIngestActivity.f();
      return;
    case 3: 
      label191:
      localIngestActivity.n.b();
      return;
    }
    localIngestActivity.j().setIndeterminate(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     igx
 * JD-Core Version:    0.7.0.1
 */