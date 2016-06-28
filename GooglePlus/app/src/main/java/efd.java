import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public abstract interface efd
{
  public abstract Looper a();
  
  public abstract ConnectionResult a(long paramLong, TimeUnit paramTimeUnit);
  
  public abstract <C extends efb> C a(efc<C> paramefc);
  
  public abstract <A extends efb, R extends efn, T extends efs<R, A>> T a(T paramT);
  
  public abstract <L> egw<L> a(L paramL);
  
  public abstract void a(efg paramefg);
  
  public abstract void a(efi paramefi);
  
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract <A extends efb, T extends efs<? extends efn, A>> T b(T paramT);
  
  public abstract void b();
  
  public abstract boolean b(efg paramefg);
  
  public abstract boolean b(efi paramefi);
  
  public abstract ConnectionResult c();
  
  public abstract void c(efg paramefg);
  
  public abstract void c(efi paramefi);
  
  public abstract void d();
  
  public abstract boolean e();
  
  public abstract boolean f();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efd
 * JD-Core Version:    0.7.0.1
 */