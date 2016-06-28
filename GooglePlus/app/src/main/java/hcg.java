import java.util.Map;

public final class hcg
{
  public Map<String, hch> a;
  public Map<String, Float> b;
  public Map<String, Long> c;
  public int d = -1;
  public boolean e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public boolean l;
  public String m;
  
  public final String toString()
  {
    String str = String.valueOf("UploadStatus Result:\n  account=");
    int n = this.d;
    boolean bool1 = this.e;
    int i1 = this.f;
    int i2 = this.g;
    int i3 = this.h;
    int i4 = this.i;
    int i5 = this.j;
    int i6 = this.k;
    boolean bool2 = this.l;
    return 242 + String.valueOf(str).length() + str + n + "\n  backupOn=" + bool1 + "\n  folderBackupOn=false" + "\n  numPending=" + i1 + "\n  numUploading=" + i2 + "\n  numFailed=" + i3 + "\n  numDone=" + i4 + "\n  numPendingVideos=" + i5 + "\n  numPendingPhotos=" + i6 + "\n  uploadFinishedRecently=" + bool2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcg
 * JD-Core Version:    0.7.0.1
 */