import android.content.Context;
import android.os.Bundle;

public final class jbg
  implements izy
{
  private static final String a = jdr.a(jbg.class);
  private Context b;
  private jcb c;
  
  public jbg(Context paramContext)
  {
    this.b = paramContext;
    this.c = new jcb();
  }
  
  private static jal a()
  {
    return new jal(jam.c, new IllegalArgumentException("Account not found."));
  }
  
  public final jal a(int paramInt)
  {
    if (paramInt == -1) {
      return a();
    }
    return ((jcd)mbb.a(this.b, jcd.class)).a(paramInt);
  }
  
  public final jal a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1) {
      return a();
    }
    jbd localjbd = (jbd)mbb.a(this.b, jbd.class);
    if (paramInt1 == -1) {
      return new jal(jam.c, new IllegalArgumentException("Invalid account ID."));
    }
    jal localjal = new jal(jam.a);
    ((izz)mbb.a(localjbd.a, izz.class)).a(paramInt1);
    if (jdj.e(localjbd.a, paramInt1) > 200)
    {
      if (jdj.a(localjbd.a, paramInt1)) {
        return ((izy)mbb.a(localjbd.a, izy.class)).a(paramInt1, izx.a, jan.a);
      }
      return new jal(jam.c);
    }
    return localjal;
  }
  
  public final jal a(int paramInt, izx paramizx, jan paramjan)
  {
    if (paramInt == -1) {
      return a();
    }
    return ((jbx)mbb.a(this.b, jbx.class)).a(paramInt, paramizx, paramjan);
  }
  
  public final jal a(int paramInt, String paramString, mmw parammmw)
  {
    if (paramInt == -1) {
      return a();
    }
    jbs localjbs = (jbs)mbb.a(this.b, jbs.class);
    qrc[] arrayOfqrc = jdj.a(localjbs.b, paramInt, new String[] { paramString });
    if (arrayOfqrc.length != 1)
    {
      jdr.c(jbs.a, "Report abuse called with multiple notifications, giving up instead.");
      return new jal(jam.c);
    }
    jbt localjbt = new jbt(localjbs.b, paramInt, arrayOfqrc[0], parammmw);
    mbb.a(localjbs.b, jdm.class);
    jdm.a(localjbt, localjbs.b);
    if (localjbt.n())
    {
      if (kbw.b(localjbt.q)) {}
      for (jam localjam = jam.b;; localjam = jam.c) {
        return new jal(localjam, localjbt.q);
      }
    }
    return new jal(jam.a);
  }
  
  public final jal a(int paramInt1, String[] paramArrayOfString, int paramInt2)
  {
    if (paramInt1 == -1) {
      return a();
    }
    jbu localjbu = (jbu)mbb.a(this.b, jbu.class);
    efj.l();
    if (paramInt1 == -1) {
      throw new IllegalArgumentException("Invalid account ID");
    }
    return jbv.a(localjbu.a, paramInt1, paramArrayOfString, 2);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    this.c.a(this.b, paramInt, paramBoolean);
  }
  
  public final boolean a(int paramInt, izx paramizx)
  {
    if (paramInt == -1) {
      jdr.b(a, "Account not found.", new IllegalArgumentException());
    }
    while (jdj.b(this.b, paramInt, paramizx) == null) {
      return false;
    }
    return true;
  }
  
  public final jal b(int paramInt)
  {
    if (paramInt == -1) {
      return a();
    }
    jbc localjbc = (jbc)mbb.a(this.b, jbc.class);
    if (paramInt == -1) {
      return new jal(jam.c, new IllegalArgumentException("Invalid account ID."));
    }
    jal localjal = jbv.a(localjbc.a, paramInt);
    jbv.a(localjbc.a, paramInt, null, jae.d);
    return localjal;
  }
  
  public final jal b(int paramInt, izx paramizx, jan paramjan)
  {
    if (paramInt == -1) {
      return a();
    }
    jbq localjbq = (jbq)mbb.a(this.b, jbq.class);
    efj.l();
    byte[] arrayOfByte = jdj.b(localjbq.b, paramInt, paramizx);
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      String str1 = jbq.a;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      arrayOfObject1[1] = paramizx;
      arrayOfObject1[2] = paramjan;
      jdr.b(str1, String.format("Initiated paging fetch without paging token, doing a sync  fetch instead. AccountId [%d], fetchCategory [%s], trigger [%s]", arrayOfObject1));
      return ((jbx)mbb.a(localjbq.b, jbx.class)).a(paramInt, paramizx, paramjan);
    }
    qqs localqqs = jbq.a(localjbq.b, paramizx, arrayOfByte);
    jbf localjbf1 = new jbf(localjbq.b, paramInt, localqqs);
    new Bundle().putInt("fetch_category", paramizx.ordinal());
    mbb.a(localjbq.b, jdm.class);
    jbf localjbf2 = (jbf)jdm.a(localjbf1, localjbq.b);
    if (!localjbf2.n())
    {
      qqt localqqt = localjbf2.h();
      String str3 = jbq.a;
      Object[] arrayOfObject3 = new Object[4];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      arrayOfObject3[1] = paramizx;
      arrayOfObject3[2] = paramjan;
      arrayOfObject3[3] = Integer.valueOf(localqqt.b.length);
      jdr.a(str3, String.format("Completed paging fetch notifications for accountId [%d], fetchCategory [%s], trigger [%s] and received [%d] notifications.", arrayOfObject3));
      jdj.b(localjbq.b, paramInt, paramizx, paramjan, localqqt);
      return new jal(jam.a);
    }
    String str2 = jbq.a;
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = Integer.valueOf(paramInt);
    arrayOfObject2[1] = paramizx;
    arrayOfObject2[2] = paramjan;
    jdr.c(str2, String.format("Failed to do paging fetch notifications for accountId [%d], fetchCategory [%s], trigger [%s]", arrayOfObject2));
    if (kbw.b(localjbf2.q)) {}
    for (jam localjam = jam.b;; localjam = jam.c) {
      return new jal(localjam, localjbf2.q);
    }
  }
  
  public final jal c(int paramInt)
  {
    if (paramInt == -1) {
      return a();
    }
    jbe localjbe = (jbe)mbb.a(this.b, jbe.class);
    if (paramInt == -1) {
      return new jal(jam.c, new IllegalArgumentException("Invalid account ID."));
    }
    ((izz)mbb.a(localjbe.a, izz.class)).a(paramInt);
    if (jdj.a(localjbe.a, paramInt)) {}
    for (jam localjam = jam.a;; localjam = jam.c) {
      return new jal(localjam);
    }
  }
  
  public final fu<Integer> d(int paramInt)
  {
    if (paramInt == -1)
    {
      jdr.b(a, "Account not found.", new IllegalArgumentException());
      return null;
    }
    return new jbh(this.b, paramInt);
  }
  
  public final void e(int paramInt)
  {
    this.c.a(this.b, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbg
 * JD-Core Version:    0.7.0.1
 */