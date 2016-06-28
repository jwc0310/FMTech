import java.util.ArrayList;

public final class gqu
{
  public String a;
  public String b;
  int c = 0;
  int d = 0;
  
  public final gqs a()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (this.c != 0)
    {
      bool2 = bool1;
      efj.c(bool2, "Must specify a known uri type.");
      if (this.d == 0) {
        break label59;
      }
      bool3 = bool1;
      label26:
      efj.c(bool3, "Must specify a known activation type.");
      if (this.b == null) {
        break label64;
      }
    }
    for (;;)
    {
      efj.c(bool1, "Must specify a uri or uri path.");
      return new gqs(this);
      bool2 = false;
      break;
      label59:
      bool3 = false;
      break label26;
      label64:
      bool1 = false;
    }
  }
  
  public final gqu a(int paramInt)
  {
    if (!gqs.a.contains(Integer.valueOf(paramInt))) {
      throw new IllegalArgumentException("Must specify a known uri type.");
    }
    this.c = paramInt;
    return this;
  }
  
  public final gqu b(int paramInt)
  {
    this.d = 1;
    if (!gqo.a.contains(Integer.valueOf(1))) {
      throw new IllegalArgumentException("Must specify a valid activation type.");
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqu
 * JD-Core Version:    0.7.0.1
 */