import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class lcm
  extends gzf
  implements iud
{
  static IntentFilter a;
  private final Uri b;
  private final String c;
  private final kcg d;
  private final int l;
  private final kyn m;
  private final kbu n;
  
  public lcm(Context paramContext, int paramInt, String paramString, Uri paramUri)
  {
    super(paramContext, "UploadSquarePhotoTask");
    this.c = paramString;
    this.l = paramInt;
    this.d = new kcg(paramContext, this.l);
    this.m = ((kyn)mbb.a(paramContext, kyn.class));
    this.n = ((kbu)mbb.a(paramContext, kbu.class));
    this.b = paramUri;
  }
  
  private final hae f(Context paramContext)
  {
    kzf localkzf = new kzf(paramContext, this.d, this.c);
    localkzf.a();
    kyf localkyf = localkzf.b();
    if (!localkzf.a.n()) {}
    try
    {
      this.m.a(this.l, localkyf);
      return new hae(localkzf.a.o, localkzf.a.q, null);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log.e("UploadSquarePhotoTask", localIOException.toString());
      }
    }
  }
  
  private final hae g(Context paramContext)
  {
    kzk localkzk = new kzk(paramContext, this.d, this.c);
    this.n.a(localkzk);
    if (!localkzk.n()) {}
    for (;;)
    {
      try
      {
        kyn localkyn = this.m;
        int i = this.l;
        if (!localkzk.x) {
          continue;
        }
        localqat = localkzk.w;
        localkyn.a(i, new kyf(((mvm)localqat).a.a));
      }
      catch (IOException localIOException)
      {
        qat localqat;
        continue;
      }
      return new hae(localkzk.o, localkzk.q, null);
      localqat = null;
    }
  }
  
  protected final hae a(Context paramContext)
  {
    iub localiub = new iub(paramContext).a(this.l);
    localiub.c = this.c;
    efj.e(this, "progressListener must be non-null");
    localiub.e = this;
    itz localitz = localiub.a();
    for (;;)
    {
      try
      {
        iup localiup = new iup();
        localiup.a = this.b;
        localiup.d = "square.profile";
        localiup.f = true;
        ity locality = localitz.a(localiup.a());
        if (kyo.a(paramContext, this.l))
        {
          localhae = f(paramContext);
          localhae.a().putString("photo_url", locality.b);
          if ((this.b != null) && (!new File(this.b.getPath()).delete()) && (Log.isLoggable("UploadSquarePhotoTask", 6))) {
            Log.e("UploadSquarePhotoTask", "Couldn't delete the cropped file from cache.");
          }
          return localhae;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return new hae(0, localException, localException.getMessage());
      }
      hae localhae = g(paramContext);
    }
  }
  
  public final void a(Uri paramUri, long paramLong1, long paramLong2)
  {
    Intent localIntent = new Intent("com.google.android.libraries.social.squares.edit.UPLOAD_PROGRESS");
    localIntent.setDataAndType(paramUri, "image/*");
    localIntent.putExtra("bytes_uploaded", paramLong1);
    localIntent.putExtra("bytes_total", paramLong2);
    fy.a(g()).a(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcm
 * JD-Core Version:    0.7.0.1
 */