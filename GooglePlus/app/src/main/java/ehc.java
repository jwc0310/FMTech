import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;

final class ehc
  implements efi
{
  public final int a;
  public final efd b;
  public final efi c;
  
  public ehc(ehb paramehb, int paramInt, efd paramefd, efi paramefi)
  {
    this.a = paramInt;
    this.b = paramefd;
    this.c = paramefi;
    paramefd.a(this);
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    ehb.d(this.d).post(new ehd(this.d, this.a, paramConnectionResult));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehc
 * JD-Core Version:    0.7.0.1
 */