import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class mci
  implements meb, mfb, mfc, mfd
{
  public List<mck> a = new ArrayList();
  private boolean b;
  private boolean c;
  private boolean d = true;
  
  mci(mek parammek)
  {
    parammek.a(this);
  }
  
  mci(mek parammek, byte paramByte)
  {
    parammek.a(this);
  }
  
  private final void c()
  {
    boolean bool;
    if ((this.b) && (this.d))
    {
      bool = true;
      if (bool != this.c) {
        break label30;
      }
    }
    for (;;)
    {
      return;
      bool = false;
      break;
      label30:
      this.c = bool;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext()) {
        ((mck)localIterator.next()).a(bool);
      }
    }
  }
  
  public final void a()
  {
    this.b = true;
    c();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
    c();
  }
  
  public final void aK_()
  {
    this.b = false;
    c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mci
 * JD-Core Version:    0.7.0.1
 */