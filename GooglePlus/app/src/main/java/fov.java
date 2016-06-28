import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class fov
  extends eib<for>
  implements fpe
{
  private final boolean a;
  private final ehq b;
  private final foh c;
  private Integer d;
  private final ExecutorService e;
  
  public fov(Context paramContext, Looper paramLooper, boolean paramBoolean, ehq paramehq, efg paramefg, efi paramefi, ExecutorService paramExecutorService)
  {
    super(paramContext, paramLooper, 44, paramehq, paramefg, paramefi);
    this.a = paramBoolean;
    this.b = paramehq;
    this.c = paramehq.g;
    this.d = paramehq.h;
    this.e = paramExecutorService;
  }
  
  public final void a(ehs paramehs, Set<Scope> paramSet, foo paramfoo)
  {
    efj.b(paramfoo, "Expecting a valid ISignInCallbacks");
    try
    {
      ((for)l()).a(new AuthAccountRequest(paramehs, paramSet), paramfoo);
      return;
    }
    catch (RemoteException localRemoteException1)
    {
      try
      {
        paramfoo.a(new ConnectionResult(8, null), new AuthAccountResult());
        return;
      }
      catch (RemoteException localRemoteException2)
      {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
      }
    }
  }
  
  public final void a(ehs paramehs, boolean paramBoolean)
  {
    try
    {
      ((for)l()).a(paramehs, this.d.intValue(), paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public final void a(ejc paramejc)
  {
    efj.b(paramejc, "Expecting a valid IResolveAccountCallbacks");
    try
    {
      ehq localehq = this.b;
      if (localehq.a != null) {}
      Account localAccount;
      for (Object localObject = localehq.a;; localObject = localAccount)
      {
        ((for)l()).a(new ResolveAccountRequest((Account)localObject, this.d.intValue()), paramejc);
        return;
        localAccount = new Account("<<default account>>", "com.google");
      }
      return;
    }
    catch (RemoteException localRemoteException1)
    {
      try
      {
        paramejc.a(new ResolveAccountResponse(8));
        return;
      }
      catch (RemoteException localRemoteException2)
      {
        Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
      }
    }
  }
  
  protected final String c()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  protected final Bundle e()
  {
    foh localfoh = this.c;
    Integer localInteger = this.b.h;
    ExecutorService localExecutorService = this.e;
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", localfoh.b);
    localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", localfoh.c);
    localBundle.putString("com.google.android.gms.signin.internal.serverClientId", localfoh.d);
    if (localfoh.e != null) {
      localBundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper(new fow(localfoh, localExecutorService).asBinder()));
    }
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    String str = this.b.e;
    if (!this.i.getPackageName().equals(str)) {
      localBundle.putString("com.google.android.gms.signin.internal.realClientPackageName", this.b.e);
    }
    return localBundle;
  }
  
  public final void f()
  {
    try
    {
      ((for)l()).a(this.d.intValue());
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public final boolean h()
  {
    return this.a;
  }
  
  public final void n()
  {
    a(new eih(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fov
 * JD-Core Version:    0.7.0.1
 */