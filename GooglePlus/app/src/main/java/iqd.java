import android.content.Context;
import java.security.InvalidParameterException;

public final class iqd
  implements ipj
{
  private ipj a = new ipi();
  private ioz b;
  private ixf c;
  
  public iqd(Context paramContext)
  {
    this.b = ((ioz)mbb.a(paramContext, ioz.class));
    this.c = ((ixf)mbb.a(paramContext, ixf.class));
  }
  
  private static int a(String paramString)
  {
    if (paramString.equals("L20")) {}
    do
    {
      return 20;
      if (paramString.equals("L30")) {
        return 30;
      }
      if (paramString.equals("L40")) {
        return 40;
      }
      if (paramString.equals("L50")) {
        return 50;
      }
      if (paramString.equals("L60")) {
        return 60;
      }
      if (paramString.equals("L70")) {
        return 70;
      }
      if (paramString.equals("L80")) {
        return 80;
      }
      if (paramString.equals("L90")) {
        return 90;
      }
    } while (paramString.equals("WL20"));
    if (paramString.equals("WL30")) {
      return 30;
    }
    if (paramString.equals("WL40")) {
      return 40;
    }
    if (paramString.equals("WL50")) {
      return 50;
    }
    if (paramString.equals("WL60")) {
      return 60;
    }
    if (paramString.equals("WL70")) {
      return 70;
    }
    if (paramString.equals("WL80")) {
      return 80;
    }
    if (paramString.equals("WL90")) {
      return 90;
    }
    throw new InvalidParameterException("Value is not valid");
  }
  
  private final boolean a()
  {
    return !this.b.c();
  }
  
  private final int c(int paramInt)
  {
    boolean bool1;
    boolean bool2;
    label59:
    int i;
    if (!this.b.g())
    {
      bool1 = this.b.h().equals("low_speed_network");
      if (bool1) {
        break label152;
      }
      if (this.b.g()) {
        break label126;
      }
      bool2 = this.b.h().equals("very_low_speed_network");
      if (!bool2) {
        break label212;
      }
      if (!this.c.e()) {
        break label152;
      }
      i = 2;
    }
    for (;;)
    {
      label78:
      if (this.b.b()) {
        i++;
      }
      int j;
      if (i == 0) {
        j = paramInt;
      }
      label126:
      do
      {
        return j;
        if (this.c.l() == -1)
        {
          bool1 = true;
          break;
        }
        bool1 = false;
        break;
        if (this.c.l() == -2)
        {
          bool2 = true;
          break label59;
        }
        bool2 = false;
        break label59;
        i = 1;
        break label78;
        j = 0;
        switch (paramInt)
        {
        case 0: 
        case 1: 
        default: 
          throw new IllegalArgumentException();
        case 3: 
          return 3;
        }
        j = 0;
      } while (i != 1);
      label152:
      return 1;
      label212:
      i = 0;
    }
  }
  
  public final int a(int paramInt)
  {
    int i = c(paramInt);
    if (a()) {
      return 1;
    }
    return this.a.a(i);
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    int i = c(paramInt1);
    if (a())
    {
      switch (i)
      {
      default: 
        throw new IllegalArgumentException();
      case 3: 
        return paramInt2 & 0xFFFFFFDF;
      case 2: 
        if (this.b.a(this.b.d())) {
          return paramInt2 | 0x20;
        }
        return paramInt2 & 0xFFFFFFDF;
      case 1: 
        if (this.b.a(this.b.e())) {
          return paramInt2 | 0x20;
        }
        return paramInt2 & 0xFFFFFFDF;
      }
      if (this.b.a(this.b.f())) {
        return paramInt2 | 0x20;
      }
      return paramInt2 & 0xFFFFFFDF;
    }
    return this.a.a(i, paramInt2);
  }
  
  public final int b(int paramInt)
  {
    int i = c(paramInt);
    if (a())
    {
      switch (i)
      {
      default: 
        throw new IllegalArgumentException();
      case 3: 
        return 90;
      case 2: 
        return a(this.b.d());
      case 1: 
        return a(this.b.e());
      }
      return a(this.b.f());
    }
    return this.a.b(i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqd
 * JD-Core Version:    0.7.0.1
 */