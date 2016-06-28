import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.List;

public final class gxj
  implements mbo, mck, mfd
{
  public boolean a;
  public gxk b;
  private gxe c;
  
  public gxj(mek parammek)
  {
    parammek.a(this);
  }
  
  public gxj(mek parammek, byte paramByte)
  {
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((gxe)parammbb.a(gxe.class));
    ((mci)parammbb.a(mci.class)).a.add(this);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      if (this.b != null)
      {
        localView2 = this.b.a();
        this.c.a(localView2);
      }
    }
    while (!this.a)
    {
      View localView2;
      return;
      this.c.a();
      return;
    }
    if (this.b != null)
    {
      View localView1 = this.b.a();
      this.c.b(localView1);
      return;
    }
    this.c.a = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxj
 * JD-Core Version:    0.7.0.1
 */