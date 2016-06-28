import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import java.io.FileNotFoundException;

final class jo
  extends AsyncTask<Uri, Boolean, Bitmap>
{
  jo(jn paramjn, CancellationSignal paramCancellationSignal, PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback) {}
  
  private Bitmap a()
  {
    try
    {
      Bitmap localBitmap = this.a.e.a(this.a.d, 3500);
      return localBitmap;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    return null;
  }
  
  protected final void onPreExecute()
  {
    this.b.setOnCancelListener(new jp(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jo
 * JD-Core Version:    0.7.0.1
 */