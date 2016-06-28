import android.os.Bundle;
import com.google.android.gms.herrevad.NetworkQualityReport;

public class fuw
{
  public final NetworkQualityReport a;
  
  public fuw(NetworkQualityReport paramNetworkQualityReport)
  {
    this.a = paramNetworkQualityReport;
  }
  
  public NetworkQualityReport a()
  {
    return this.a;
  }
  
  public fuw a(int paramInt)
  {
    this.a.b = paramInt;
    return this;
  }
  
  public fuw a(long paramLong)
  {
    this.a.c = paramLong;
    return this;
  }
  
  public fuw a(String paramString1, String paramString2)
  {
    this.a.g.putString(paramString1, paramString2);
    return this;
  }
  
  public fuw b(long paramLong)
  {
    this.a.d = paramLong;
    return this;
  }
  
  public fuw c(long paramLong)
  {
    this.a.e = paramLong;
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fuw
 * JD-Core Version:    0.7.0.1
 */