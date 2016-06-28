import android.os.Handler;
import java.util.Set;

public class bbw
{
  bbw(bbf parambbf) {}
  
  public void a(boolean paramBoolean)
  {
    this.a.y();
    bfd localbfd;
    bfa localbfa;
    if (paramBoolean)
    {
      this.a.w();
      localbfd = this.a.aj;
      localbfa = bfi.c;
      if (!paramBoolean) {
        break label78;
      }
    }
    label78:
    for (boolean bool = localbfd.f.add(localbfa);; bool = localbfd.f.remove(localbfa))
    {
      if (bool)
      {
        Runnable localRunnable = localbfd.g;
        efj.m().post(localRunnable);
      }
      return;
      this.a.a(0);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbw
 * JD-Core Version:    0.7.0.1
 */