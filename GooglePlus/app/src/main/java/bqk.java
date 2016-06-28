import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.photos.service.GooglePhotoDownsyncService;
import com.google.android.apps.plus.service.EsSyncAdapterService;
import com.google.android.libraries.social.autobackup.AutoBackupSyncService;
import java.util.Iterator;
import java.util.List;

final class bqk
  implements Runnable
{
  bqk(bqj parambqj, Context paramContext, int paramInt) {}
  
  public final void run()
  {
    Context localContext = this.a;
    int i = this.b;
    for (;;)
    {
      try
      {
        EsSyncAdapterService.c(localContext);
        EsSyncAdapterService.b(localContext);
        EsSyncAdapterService.b(localContext, i);
        if (duj.a(localContext))
        {
          giz localgiz2 = (giz)mbb.a(localContext, giz.class);
          if (!localgiz2.c(i)) {
            break label204;
          }
          str = localgiz2.a(i).b("account_name");
          AutoBackupSyncService.a(localContext, str);
          GooglePhotoDownsyncService.b(localContext, str);
          return;
        }
        giz localgiz1 = (giz)mbb.a(localContext, giz.class);
        Iterator localIterator = localgiz1.a(new String[] { "logged_in" }).iterator();
        if (localIterator.hasNext())
        {
          gjb localgjb = localgiz1.a(((Integer)localIterator.next()).intValue());
          if (localgjb.c("is_managed_account")) {
            continue;
          }
          AutoBackupSyncService.a(localContext, new Account(localgjb.b("account_name"), "com.google"));
          continue;
        }
        GooglePhotoDownsyncService.a(localContext);
      }
      finally {}
      continue;
      label204:
      String str = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqk
 * JD-Core Version:    0.7.0.1
 */