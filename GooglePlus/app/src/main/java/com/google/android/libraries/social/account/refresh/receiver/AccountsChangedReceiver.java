package com.google.android.libraries.social.account.refresh.receiver;

import android.content.Context;
import android.content.Intent;
import gk;

public final class AccountsChangedReceiver
  extends gk
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    a(paramContext, new Intent(paramContext, AccountsChangedService.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.account.refresh.receiver.AccountsChangedReceiver
 * JD-Core Version:    0.7.0.1
 */