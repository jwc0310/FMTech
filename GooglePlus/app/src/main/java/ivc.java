import android.content.Context;
import java.io.IOException;
import java.util.List;

final class ivc
  implements ilq
{
  private final Context a;
  private kcx b;
  
  ivc(ivb paramivb, Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final int a(gje paramgje)
  {
    int i = this.b.a(ivb.a);
    qtm localqtm = (qtm)this.b.a(i, qtm.a);
    if (localqtm.b == null) {
      throw new IOException("Could not update account status");
    }
    paramgje.c("gaia_id", localqtm.b);
    return ilr.a;
  }
  
  public final void a(gjb paramgjb, kcg paramkcg, List<kbw> paramList)
  {
    this.b = new kcx(this.a, paramkcg);
    kcx localkcx = this.b;
    qao localqao = qtm.a;
    int i = ivb.a;
    localkcx.a(kcx.a(localqao), null, i);
    paramList.add(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivc
 * JD-Core Version:    0.7.0.1
 */