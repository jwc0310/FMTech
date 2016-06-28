package com.google.android.apps.plus.notifications.actions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.plus.service.EsService;
import efj;
import eq;
import es;
import fe;
import java.util.ArrayList;

public class CommentActionReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("account_id", -1);
    String str1 = paramIntent.getStringExtra("activity_id");
    String str2 = paramIntent.getStringExtra("com.google.android.libraries.social.notifications.notif_id");
    if ((i == -1) || (TextUtils.isEmpty(str1))) {
      return;
    }
    Bundle localBundle = eq.a.a(paramIntent);
    CharSequence localCharSequence;
    if (localBundle != null)
    {
      localCharSequence = localBundle.getCharSequence("extra_voice_comment");
      if (TextUtils.isEmpty(localCharSequence)) {}
    }
    for (String str3 = localCharSequence.toString(); str3 != null; str3 = null)
    {
      EsService.a(paramContext, i, str1, str3, null);
      return;
    }
    Intent localIntent1 = efj.b(paramContext, i, str1);
    localIntent1.putExtra("com.google.android.libraries.social.notification_mark_as_read", true);
    localIntent1.putExtra("com.google.android.libraries.social.notifications.notif_id", str2);
    fe localfe = new fe(paramContext);
    Intent localIntent2 = efj.b(paramContext, i);
    localfe.a.add(localIntent2);
    localfe.a.add(localIntent1);
    localfe.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.notifications.actions.CommentActionReceiver
 * JD-Core Version:    0.7.0.1
 */