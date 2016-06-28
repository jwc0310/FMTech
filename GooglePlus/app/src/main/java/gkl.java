import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class gkl
  implements gjm
{
  private final AccountManager a;
  private final List<gjl> b;
  
  gkl(Context paramContext)
  {
    this.a = AccountManager.get(paramContext);
    this.b = mbb.c(paramContext, gjl.class);
  }
  
  public final gjj a(String paramString)
  {
    for (gjj localgjj : a()) {
      if (localgjj.a.equals(paramString)) {
        return localgjj;
      }
    }
    return null;
  }
  
  public final <T extends bk,  extends gjn> void a(T paramT)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("allowSkip", false);
    this.a.addAccount("com.google", "webupdates", null, localBundle, null, new gkm(this, paramT), null);
  }
  
  public final gjj[] a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll(((gjl)localIterator.next()).a());
    }
    return (gjj[])localArrayList.toArray(new gjj[localArrayList.size()]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkl
 * JD-Core Version:    0.7.0.1
 */