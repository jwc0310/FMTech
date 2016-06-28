package com.google.android.libraries.social.account.refresh.receiver;

import android.app.IntentService;

public final class AccountsChangedService
  extends IntentService
{
  public AccountsChangedService()
  {
    super("AccountsChangedService");
  }
  
  /* Error */
  protected final void onHandleIntent(android.content.Intent paramIntent)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: ldc 17
    //   8: invokestatic 23	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   11: checkcast 17	gkr
    //   14: invokeinterface 25 1 0
    //   19: aload_1
    //   20: invokestatic 30	com/google/android/libraries/social/account/refresh/receiver/AccountsChangedReceiver:a	(Landroid/content/Intent;)Z
    //   23: pop
    //   24: return
    //   25: astore 4
    //   27: aload_1
    //   28: invokestatic 30	com/google/android/libraries/social/account/refresh/receiver/AccountsChangedReceiver:a	(Landroid/content/Intent;)Z
    //   31: pop
    //   32: aload 4
    //   34: athrow
    //   35: astore_2
    //   36: goto -17 -> 19
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	AccountsChangedService
    //   0	39	1	paramIntent	android.content.Intent
    //   35	1	2	localgjo	gjo
    //   25	8	4	localObject	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   5	19	25	finally
    //   5	19	35	gjo
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.account.refresh.receiver.AccountsChangedService
 * JD-Core Version:    0.7.0.1
 */