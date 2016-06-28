import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.List;

public final class hos
  implements gpq, mbo, mck, mfd
{
  private final int a;
  private final bk b;
  private git c;
  private gpl d;
  private hpo e;
  private Context f;
  
  public hos(int paramInt, bk parambk, mek parammek)
  {
    this.a = paramInt;
    this.b = parambk;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.f = paramContext;
    this.c = ((git)parammbb.a(git.class));
    this.d = ((gpl)parammbb.b(gpl.class));
    this.e = ((hpo)parammbb.a(hpo.class));
    ((mci)parammbb.a(mci.class)).a.add(this);
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.b(this.a);
  }
  
  public final void a(tp paramtp) {}
  
  public final void a(boolean paramBoolean)
  {
    if (this.d != null)
    {
      if (paramBoolean) {
        this.d.a(this);
      }
    }
    else {
      return;
    }
    this.d.b(this);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == this.a)
    {
      Intent localIntent = this.e.a(this.f, this.c.c(), null);
      ay.a(this.b.f(), localIntent, ((gvj)mbb.a(this.f, gvj.class)).a());
      Context localContext = this.f;
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(pjn.q);
      localgxr.b.add(localgxq);
      new gwz(4, localgxr.a(this.f)).b(localContext);
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hos
 * JD-Core Version:    0.7.0.1
 */