import java.io.IOException;
import java.util.List;

final class inz
  implements ilq
{
  private inm a;
  
  inz(inw paraminw) {}
  
  public final int a(gje paramgje)
  {
    if (this.a.o != 200) {
      throw new IOException("Could not update account status");
    }
    if ((!this.a.b) && (this.a.a)) {}
    for (boolean bool = true;; bool = false)
    {
      paramgje.c("PlusiAccountUpdateExtension.wants_full_update", bool);
      if (!bool) {
        break;
      }
      return ilr.b;
    }
    return ilr.a;
  }
  
  public final void a(gjb paramgjb, kcg paramkcg, List<kbw> paramList)
  {
    this.a = new inm(this.b.a, paramkcg);
    paramList.add(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     inz
 * JD-Core Version:    0.7.0.1
 */