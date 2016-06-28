import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.print.PrintAttributes;
import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintManager;

public final class jh
  implements jk
{
  private final jl a;
  
  jh(Context paramContext)
  {
    this.a = new jl(paramContext);
  }
  
  public final void a(String paramString, Bitmap paramBitmap, x paramx)
  {
    jl localjl = this.a;
    if (paramBitmap != null)
    {
      int i = localjl.d;
      PrintManager localPrintManager = (PrintManager)localjl.a.getSystemService("print");
      PrintAttributes.MediaSize localMediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
      if (paramBitmap.getWidth() > paramBitmap.getHeight()) {
        localMediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
      }
      PrintAttributes localPrintAttributes = new PrintAttributes.Builder().setMediaSize(localMediaSize).setColorMode(localjl.e).build();
      localPrintManager.print(paramString, new jm(localjl, paramString, paramBitmap, i, null), localPrintAttributes);
    }
  }
  
  public final void a(String paramString, Uri paramUri, x paramx)
  {
    jl localjl = this.a;
    jn localjn = new jn(localjl, paramString, paramUri, null, localjl.d);
    PrintManager localPrintManager = (PrintManager)localjl.a.getSystemService("print");
    PrintAttributes.Builder localBuilder = new PrintAttributes.Builder();
    localBuilder.setColorMode(localjl.e);
    if (localjl.f == 1) {
      localBuilder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
    }
    for (;;)
    {
      localPrintManager.print(paramString, localjn, localBuilder.build());
      return;
      if (localjl.f == 2) {
        localBuilder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jh
 * JD-Core Version:    0.7.0.1
 */