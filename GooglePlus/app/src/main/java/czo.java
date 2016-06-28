import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.SystemClock;
import com.google.android.libraries.social.jni.crashreporter.NativeCrashHandler;
import java.util.concurrent.atomic.AtomicReference;

public final class czo
  implements oyu
{
  private static final long b = ;
  final Context a;
  
  czo(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a()
  {
    gyx localgyx = (gyx)mbb.b(this.a, gyx.class);
    if (localgyx != null) {
      localgyx.a(b);
    }
    if (mcu.a(this.a)) {
      return;
    }
    boolean bool = dun.b();
    int i = 0;
    if (bool) {}
    try
    {
      i = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
      if (i != 999999999)
      {
        czp localczp = new czp(this);
        kpc localkpc = (kpc)mbb.a(this.a, kpc.class);
        Context localContext = this.a;
        efj.e(localczp, "SilentFeedbackOptions should not be null.");
        Thread.setDefaultUncaughtExceptionHandler(new kpe(localContext, Thread.getDefaultUncaughtExceptionHandler(), localkpc.a, localczp));
        kpf localkpf = new kpf(localContext, Thread.currentThread().getUncaughtExceptionHandler(), localkpc.a, localczp);
        Thread.currentThread().setUncaughtExceptionHandler(localkpf);
      }
      gwy localgwy = (gwy)mbb.a(this.a, gwy.class);
      AtomicReference localAtomicReference = new AtomicReference();
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler1 = localgwy.a(new czt(Thread.getDefaultUncaughtExceptionHandler(), localAtomicReference));
      Thread.setDefaultUncaughtExceptionHandler(new mcu(this.a, localUncaughtExceptionHandler1));
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler2 = localgwy.a(new czs(Thread.currentThread().getUncaughtExceptionHandler(), localAtomicReference));
      Thread.currentThread().setUncaughtExceptionHandler(new mcu(this.a, localUncaughtExceptionHandler2));
      iqw.a(this.a);
      NativeCrashHandler.a(this.a);
      new czq(this);
      new Thread(new czr(this), "app_on_create").start();
      if (localgyx != null) {
        localgyx.a();
      }
      mbb.a(this.a, gdp.class);
      gdp.a();
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("Could not find our own package, this should be impossible.");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czo
 * JD-Core Version:    0.7.0.1
 */