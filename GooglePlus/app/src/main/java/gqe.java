import android.view.Menu;
import android.view.MenuItem;

public final class gqe
  implements gpi
{
  public boolean a;
  public int b = 1;
  private final int c;
  private final int d;
  
  public gqe(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final void a()
  {
    this.a = false;
    this.b = 0;
  }
  
  public final void a(Menu paramMenu)
  {
    int i = 2;
    if ((this.a) && (this.d != -1))
    {
      MenuItem localMenuItem2 = paramMenu.findItem(this.d);
      if (localMenuItem2 != null) {
        localMenuItem2.setVisible(true);
      }
    }
    if (this.b != 0) {
      switch (this.b)
      {
      }
    }
    MenuItem localMenuItem1;
    for (;;)
    {
      localMenuItem1 = paramMenu.findItem(this.c);
      mm.a(localMenuItem1, i);
      if (!this.a) {
        break;
      }
      if (this.b == 1)
      {
        localMenuItem1.setVisible(true);
        localMenuItem1.setEnabled(false);
      }
      return;
      i = 0;
      continue;
      i = 1;
    }
    localMenuItem1.setVisible(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqe
 * JD-Core Version:    0.7.0.1
 */