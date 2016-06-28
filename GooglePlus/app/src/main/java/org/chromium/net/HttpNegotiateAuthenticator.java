package org.chromium.net;

import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import rit;

@JNINamespace
public class HttpNegotiateAuthenticator
{
  public Bundle a = null;
  private final String b;
  
  private HttpNegotiateAuthenticator(String paramString)
  {
    this.b = paramString;
  }
  
  @CalledByNative
  static HttpNegotiateAuthenticator create(String paramString)
  {
    return new HttpNegotiateAuthenticator(paramString);
  }
  
  @CalledByNative
  void getNextAuthToken(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
  {
    String str = "SPNEGO:HOSTBASED:" + paramString1;
    Activity localActivity = ApplicationStatus.a();
    if (localActivity == null)
    {
      nativeSetResult(paramLong, -9, null);
      return;
    }
    AccountManager localAccountManager = AccountManager.get(localActivity);
    String[] arrayOfString = { "SPNEGO" };
    Bundle localBundle = new Bundle();
    if (paramString2 != null) {
      localBundle.putString("incomingAuthToken", paramString2);
    }
    if (this.a != null) {
      localBundle.putBundle("spnegoContext", this.a);
    }
    localBundle.putBoolean("canDelegate", paramBoolean);
    localAccountManager.getAuthTokenByFeatures(this.b, str, arrayOfString, localActivity, null, localBundle, new rit(this, paramLong), new Handler(ThreadUtils.a().getLooper()));
  }
  
  public native void nativeSetResult(long paramLong, int paramInt, String paramString);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.HttpNegotiateAuthenticator
 * JD-Core Version:    0.7.0.1
 */