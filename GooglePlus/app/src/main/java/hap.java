import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;

final class hap
  implements iud
{
  hap(hao paramhao) {}
  
  public final void a(Uri paramUri, long paramLong1, long paramLong2)
  {
    if (Log.isLoggable("iu.UploadsManager", 2)) {
      new StringBuilder(86).append("upload progress, bytesUploaded: ").append(paramLong1).append(", totalBytes: ").append(paramLong2);
    }
    if (this.a.e.mMediaUrl.equals(paramUri.toString()))
    {
      this.a.e.mBytesUploaded = paramLong1;
      this.a.e.mBytesTotal = paramLong2;
      this.a.d.a(this.a.e);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hap
 * JD-Core Version:    0.7.0.1
 */