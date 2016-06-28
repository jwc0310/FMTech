import java.util.Set;

public final class lkw
  implements oxo<Boolean, String>
{
  volatile boolean a = false;
  
  public lkw(lkg paramlkg, Set paramSet) {}
  
  public final ouq<oxm<Boolean>> a()
  {
    boolean bool1 = true;
    boolean bool2;
    if (!this.b.isEmpty())
    {
      bool2 = bool1;
      efj.d(bool2, "Empty card id set");
      if (this.b.contains("")) {
        break label71;
      }
    }
    for (;;)
    {
      efj.d(bool1, "Card id set contains empty card id");
      if (!this.a) {
        break label76;
      }
      return ouq.a(phu.b(oxm.a(Boolean.valueOf(false), oxn.a)));
      bool2 = false;
      break;
      label71:
      bool1 = false;
    }
    label76:
    ouq localouq = this.c.c.a(this.b).b(new lkx(this), this.c.b);
    oxb localoxb = this.c.e;
    pic localpic = localouq.a();
    String str = String.valueOf(this.c.a);
    localoxb.a(localpic, (String)(13 + String.valueOf(str).length() + "update_stream" + str));
    return localouq;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lkw
 * JD-Core Version:    0.7.0.1
 */