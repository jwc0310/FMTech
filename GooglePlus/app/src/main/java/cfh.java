import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Environment;
import java.io.File;

final class cfh
  implements guf
{
  cfh(cff paramcff) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if (paramInt == -1)
    {
      localanf = this.a.av;
      localcff = this.a;
      i = aau.rA;
      localanf.a(localcff.g().getString(i));
      localFile = new File(Environment.getExternalStorageDirectory(), "camera-p.jpg");
      new hcz(this.a.f(), this.a, localFile, this.a.an, aaw.ja).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
    while (!this.a.ao)
    {
      anf localanf;
      cff localcff;
      int i;
      File localFile;
      return;
    }
    this.a.f().finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfh
 * JD-Core Version:    0.7.0.1
 */