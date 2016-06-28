import android.annotation.TargetApi;
import android.mtp.MtpObjectInfo;

@TargetApi(12)
public final class ihk
  implements Comparable<ihk>
{
  public int a;
  long b;
  public int c;
  public int d;
  
  public ihk(MtpObjectInfo paramMtpObjectInfo)
  {
    this.a = paramMtpObjectInfo.getObjectHandle();
    this.b = paramMtpObjectInfo.getDateCreated();
    this.c = paramMtpObjectInfo.getFormat();
    this.d = paramMtpObjectInfo.getCompressedSize();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ihk localihk;
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof ihk)) {
        return false;
      }
      localihk = (ihk)paramObject;
      if (this.d != localihk.d) {
        return false;
      }
      if (this.b != localihk.b) {
        return false;
      }
      if (this.c != localihk.c) {
        return false;
      }
    } while (this.a == localihk.a);
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * (31 * (31 * (31 + this.d) + (int)(this.b ^ this.b >>> 32)) + this.c) + this.a;
  }
  
  public final String toString()
  {
    int i = this.a;
    long l = this.b;
    int j = this.c;
    int k = this.d;
    return 123 + "IngestObjectInfo [mHandle=" + i + ", mDateCreated=" + l + ", mFormat=" + j + ", mCompressedSize=" + k + "]";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihk
 * JD-Core Version:    0.7.0.1
 */