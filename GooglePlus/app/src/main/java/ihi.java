import android.annotation.TargetApi;
import android.content.Context;
import android.mtp.MtpDevice;
import android.mtp.MtpObjectInfo;
import android.os.Environment;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.StatFs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@TargetApi(12)
public final class ihi
  implements Runnable
{
  public ihj a;
  private String b;
  private Collection<ihk> c;
  private MtpDevice d;
  private PowerManager.WakeLock e;
  
  public ihi(MtpDevice paramMtpDevice, Collection<ihk> paramCollection, String paramString, Context paramContext)
  {
    this.b = paramString;
    this.c = paramCollection;
    this.d = paramMtpDevice;
    this.e = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(6, "Google Photos MTP Import Task");
  }
  
  private static boolean a(long paramLong)
  {
    if (!"mounted".equals(Environment.getExternalStorageState())) {}
    for (;;)
    {
      return false;
      String str = Environment.getExternalStorageDirectory().getPath();
      try
      {
        StatFs localStatFs = new StatFs(str);
        long l = localStatFs.getAvailableBlocks();
        int i = localStatFs.getBlockSize();
        if (l * i > paramLong) {
          return true;
        }
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  public final void run()
  {
    this.e.acquire();
    for (;;)
    {
      int k;
      try
      {
        localLinkedList = new LinkedList();
        i = this.c.size();
        this.a.a(0, i, null);
        localFile = new File(Environment.getExternalStorageDirectory(), this.b);
        localFile.mkdirs();
        Iterator localIterator = this.c.iterator();
        j = 0;
        if (!localIterator.hasNext()) {
          continue;
        }
        localihk = (ihk)localIterator.next();
        k = j + 1;
        if (!a(localihk.d)) {
          break label316;
        }
        MtpDevice localMtpDevice = this.d;
        if (localMtpDevice == null) {
          continue;
        }
        MtpObjectInfo localMtpObjectInfo = localMtpDevice.getObjectInfo(localihk.a);
        if (localMtpObjectInfo == null) {
          continue;
        }
        str2 = localMtpObjectInfo.getName();
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        LinkedList localLinkedList;
        int i;
        File localFile;
        ihk localihk;
        this.a.i();
        return;
        String str2 = null;
        continue;
        str1 = new File(localFile, str2).getAbsolutePath();
        if (this.d.importFile(localihk.a, str1)) {
          continue;
        }
        str1 = null;
        if (str1 != null) {
          continue;
        }
        localLinkedList.add(localihk);
        if (this.a == null) {
          break label322;
        }
        this.a.a(k, i, str1);
        break label322;
        if (this.a == null) {
          continue;
        }
        this.a.a(localLinkedList, j);
        return;
      }
      finally
      {
        this.a = null;
        this.e.release();
      }
      if (str2 == null) {
        throw new FileNotFoundException("Failure in determining destination file");
      }
      label316:
      String str1 = null;
      continue;
      label322:
      int j = k;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihi
 * JD-Core Version:    0.7.0.1
 */