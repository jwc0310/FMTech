import java.util.ArrayList;
import java.util.List;

final class hzd
  implements ilq
{
  private hzp a;
  
  hzd(hzc paramhzc) {}
  
  public final int a(gje paramgje)
  {
    this.a.d("ExpAccountUpdateExt");
    hzp localhzp = this.a;
    if (localhzp.x) {}
    for (qat localqat = localhzp.w;; localqat = null)
    {
      mts localmts = (mts)localqat;
      efj.a(this.b.a, paramgje.b("account_name"), localmts.a);
      return ilr.a;
    }
  }
  
  public final void a(gjb paramgjb, kcg paramkcg, List<kbw> paramList)
  {
    List localList = this.b.b.a();
    int i = localList.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(((hyf)localList.get(j)).d);
    }
    this.a = new hzp(this.b.a, paramkcg, localArrayList);
    paramList.add(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzd
 * JD-Core Version:    0.7.0.1
 */