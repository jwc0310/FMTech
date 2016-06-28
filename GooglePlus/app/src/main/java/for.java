import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public abstract interface for
  extends IInterface
{
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt, Account paramAccount, foo paramfoo);
  
  public abstract void a(AuthAccountRequest paramAuthAccountRequest, foo paramfoo);
  
  public abstract void a(ResolveAccountRequest paramResolveAccountRequest, ejc paramejc);
  
  public abstract void a(CheckServerAuthResult paramCheckServerAuthResult);
  
  public abstract void a(RecordConsentRequest paramRecordConsentRequest, foo paramfoo);
  
  public abstract void a(ehs paramehs, int paramInt, boolean paramBoolean);
  
  public abstract void a(foo paramfoo);
  
  public abstract void a(boolean paramBoolean);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     for
 * JD-Core Version:    0.7.0.1
 */