import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ehq
{
  public final Account a;
  public final Set<Scope> b;
  final Set<Scope> c;
  public final Map<eew<?>, ehr> d;
  public final String e;
  final String f;
  public final foh g;
  public Integer h;
  
  public ehq(Account paramAccount, Set<Scope> paramSet, Map<eew<?>, ehr> paramMap, int paramInt, View paramView, String paramString1, String paramString2, foh paramfoh)
  {
    this.a = paramAccount;
    if (paramSet == null) {}
    HashSet localHashSet;
    for (Set localSet = Collections.EMPTY_SET;; localSet = Collections.unmodifiableSet(paramSet))
    {
      this.b = localSet;
      if (paramMap == null) {
        paramMap = Collections.EMPTY_MAP;
      }
      this.d = paramMap;
      this.e = paramString1;
      this.f = paramString2;
      this.g = paramfoh;
      localHashSet = new HashSet(this.b);
      Iterator localIterator = this.d.values().iterator();
      while (localIterator.hasNext())
      {
        localIterator.next();
        localHashSet.addAll(null);
      }
    }
    this.c = Collections.unmodifiableSet(localHashSet);
  }
  
  @Deprecated
  public final String a()
  {
    if (this.a != null) {
      return this.a.name;
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehq
 * JD-Core Version:    0.7.0.1
 */