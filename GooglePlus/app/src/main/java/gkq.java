import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class gkq
  implements gjl
{
  private final AccountManager a;
  
  gkq(Context paramContext)
  {
    this.a = AccountManager.get(paramContext);
  }
  
  public final List<gjj> a()
  {
    Account[] arrayOfAccount = this.a.getAccountsByType("com.google");
    ArrayList localArrayList = new ArrayList(arrayOfAccount.length);
    for (int i = 0; i < arrayOfAccount.length; i++) {
      localArrayList.add(new gjj(new gjk(arrayOfAccount[i].name, i)));
    }
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkq
 * JD-Core Version:    0.7.0.1
 */