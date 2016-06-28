import android.content.Context;
import java.util.List;

final class iux
  implements ilq
{
  private final Context a;
  private final List<iuu> b;
  private kcx c;
  
  iux(Context paramContext, List<iuu> paramList)
  {
    this.a = paramList;
    Object localObject;
    this.b = localObject;
  }
  
  public final int a(gje paramgje)
  {
    int i = this.b.size();
    if (i == 0) {
      return ilr.a;
    }
    for (int j = 0; j < i; j++) {
      ((iuu)this.b.get(j)).a(paramgje, this.c);
    }
    return ilr.a;
  }
  
  public final void a(gjb paramgjb, kcg paramkcg, List<kbw> paramList)
  {
    int i = this.b.size();
    if (i == 0) {
      return;
    }
    String str1 = paramgjb.b("account_name");
    String str2 = paramgjb.b("effective_gaia_id");
    kch localkch = new kch();
    localkch.a = str1;
    localkch.b = str2;
    localkch.e = true;
    kcg localkcg = localkch.a();
    this.c = new kcx(this.a, localkcg);
    for (int j = 0; j < i; j++) {
      ((iuu)this.b.get(j)).a(paramgjb, this.c);
    }
    paramList.add(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iux
 * JD-Core Version:    0.7.0.1
 */