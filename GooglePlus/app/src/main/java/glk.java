import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public final class glk
  implements mbo, mfd
{
  public int a = gln.a;
  private giz b;
  private git c;
  
  public glk(mek parammek)
  {
    parammek.a(this);
  }
  
  private final int b()
  {
    int i = this.c.c();
    if (i == -1) {
      return -1;
    }
    Iterator localIterator = this.b.a(new String[] { "logged_in" }).iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if ((localInteger.intValue() != i) && (localInteger.intValue() != a(glm.a)) && (localInteger.intValue() != a(glm.b))) {
        return localInteger.intValue();
      }
    }
    return -1;
  }
  
  public final int a(int paramInt)
  {
    switch (gll.a[(paramInt - 1)])
    {
    default: 
      return -1;
    case 1: 
      return this.b.c("com.google.android.libraries.social.accountswitcher.recent_account_one");
    }
    return this.b.c("com.google.android.libraries.social.accountswitcher.recent_account_two");
  }
  
  public final void a()
  {
    if (!this.b.d(a(glm.a))) {
      a(glm.a, -1);
    }
    if (!this.b.d(a(glm.b))) {
      a(glm.b, -1);
    }
    if ((a(glm.a) != -1) && (a(glm.a) == this.c.c())) {
      a(glm.a, -1);
    }
    if ((a(glm.b) != -1) && ((a(glm.b) == a(glm.a)) || (a(glm.b) == this.c.c()))) {
      a(glm.b, -1);
    }
    if (a(glm.a) == -1)
    {
      if (a(glm.b) != -1) {
        break label203;
      }
      a(glm.a, b());
    }
    for (;;)
    {
      if (a(glm.b) == -1) {
        a(glm.b, b());
      }
      return;
      label203:
      a(glm.a, a(glm.b));
      a(glm.b, -1);
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    switch (gll.a[(paramInt1 - 1)])
    {
    default: 
      return;
    case 1: 
      this.b.a("com.google.android.libraries.social.accountswitcher.recent_account_one", paramInt2);
      return;
    }
    this.b.a("com.google.android.libraries.social.accountswitcher.recent_account_two", paramInt2);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((giz)parammbb.a(giz.class));
    this.c = ((git)parammbb.a(git.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     glk
 * JD-Core Version:    0.7.0.1
 */