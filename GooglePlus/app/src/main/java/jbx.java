import android.content.Context;

public final class jbx
{
  private static final String a = jdr.a(jbx.class);
  private final Context b;
  
  public jbx(Context paramContext)
  {
    this.b = paramContext;
  }
  
  private final jal a(Context paramContext, int paramInt, izx paramizx, jan paramjan)
  {
    jdp localjdp = jdp.a(paramContext);
    qqs localqqs = new qqs();
    localqqs.a = localjdp.b();
    localqqs.b = new jdo(paramContext).a();
    localqqs.c = Integer.valueOf(50);
    localqqs.d = jdp.a(paramizx);
    jao localjao = (jao)mbb.b(paramContext, jao.class);
    if (localjao != null) {
      localqqs.f = localjao.a();
    }
    jbf localjbf1 = new jbf(paramContext, paramInt, localqqs);
    mbb.a(paramContext, jdm.class);
    jbf localjbf2 = (jbf)jdm.a(localjbf1, paramContext);
    if (localjbf2.n())
    {
      String str3 = a;
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      arrayOfObject3[1] = paramizx;
      arrayOfObject3[2] = paramjan;
      jdr.c(str3, String.format("Failed to do initial fetch notifications for accountId [%d], fetchCategory [%s], trigger [%s]", arrayOfObject3));
      if (kbw.b(localjbf2.q)) {}
      for (jam localjam = jam.b;; localjam = jam.c) {
        return new jal(localjam, localjbf2.q);
      }
    }
    qqt localqqt = localjbf2.h();
    if (localqqt == null)
    {
      String str2 = a;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      arrayOfObject2[1] = paramizx;
      arrayOfObject2[2] = paramjan;
      jdr.c(str2, String.format("Got empty response for initial fetch - accountId [%d], fetchCategory [%s], trigger [%s]", arrayOfObject2));
      return new jal(jam.b);
    }
    jdr.a(a, localqqt.toString());
    String str1 = a;
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = paramizx;
    arrayOfObject1[2] = paramjan;
    arrayOfObject1[3] = Integer.valueOf(localqqt.b.length);
    jdr.a(str1, String.format("Completed initial fetch notifications for accountId [%d], fetchCategory [%s], trigger [%s] and received [%d] notifications.", arrayOfObject1));
    jdj.a(paramContext, paramInt, paramizx);
    jdj.a(paramContext, paramInt, paramizx, paramjan, localqqt);
    return new jal(jam.a);
  }
  
  public final jal a(int paramInt, izx paramizx, jan paramjan)
  {
    
    if (paramInt == -1) {
      throw new IllegalArgumentException("Invalid account ID");
    }
    byte[] arrayOfByte = jdj.c(this.b, paramInt, paramizx);
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      String str1 = a;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      arrayOfObject1[1] = paramizx;
      arrayOfObject1[2] = paramjan;
      jdr.a(str1, String.format("Performing initial fetch since no valid syncToken is found, accountId [%d], fetchCategory [%s], trigger [%s]", arrayOfObject1));
      return a(this.b, paramInt, paramizx, paramjan);
    }
    Context localContext = this.b;
    jdp localjdp = jdp.a(localContext);
    qqy localqqy = new qqy();
    localqqy.a = localjdp.b();
    localqqy.b = new jdo(localContext).a();
    localqqy.c = Integer.valueOf(50);
    localqqy.d = jdp.a(paramizx);
    localqqy.e = arrayOfByte;
    jao localjao = (jao)mbb.b(localContext, jao.class);
    if (localjao != null) {
      localqqy.f = localjao.a();
    }
    jby localjby1 = new jby(localContext, paramInt, localqqy);
    mbb.a(localContext, jdm.class);
    jby localjby2 = (jby)jdm.a(localjby1, localContext);
    if (localjby2.n())
    {
      String str5 = a;
      Object[] arrayOfObject5 = new Object[3];
      arrayOfObject5[0] = Integer.valueOf(paramInt);
      arrayOfObject5[1] = paramizx;
      arrayOfObject5[2] = paramjan;
      jdr.c(str5, String.format("Failed to sync notifications for accountId [%d], fetchCategory [%s], trigger [%s]", arrayOfObject5));
      if (kbw.b(localjby2.q)) {}
      for (jam localjam = jam.b;; localjam = jam.c) {
        return new jal(localjam, localjby2.q);
      }
    }
    qat localqat;
    mvy localmvy;
    if (localjby2.x)
    {
      localqat = localjby2.w;
      localmvy = (mvy)localqat;
      if (localmvy == null) {
        break label416;
      }
    }
    label416:
    for (qqz localqqz = localmvy.a;; localqqz = null)
    {
      if (localqqz != null) {
        break label422;
      }
      String str4 = a;
      Object[] arrayOfObject4 = new Object[3];
      arrayOfObject4[0] = Integer.valueOf(paramInt);
      arrayOfObject4[1] = paramizx;
      arrayOfObject4[2] = paramjan;
      jdr.c(str4, String.format("Got empty response for sync fetch  - accountId [%d], fetchCategory [%s], trigger [%s]", arrayOfObject4));
      return new jal(jam.b);
      localqat = null;
      break;
    }
    label422:
    jdr.a(a, localqqz.toString());
    if ((localqqz.d == null) || (localqqz.d.length == 0))
    {
      String str2 = a;
      Object[] arrayOfObject2 = new Object[4];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      arrayOfObject2[1] = paramizx;
      arrayOfObject2[2] = paramjan;
      arrayOfObject2[3] = Integer.valueOf(localqqz.b.length);
      jdr.a(str2, String.format("Completed sync notifications fetch for accountId [%d], fetchCategory [%s], trigger [%s] and received [%d] notifications.", arrayOfObject2));
      jdj.a(localContext, paramInt, paramizx, paramjan, localqqz);
      return new jal(jam.a);
    }
    String str3 = a;
    Object[] arrayOfObject3 = new Object[4];
    arrayOfObject3[0] = Integer.valueOf(paramInt);
    arrayOfObject3[1] = paramizx;
    arrayOfObject3[2] = paramjan;
    arrayOfObject3[3] = Integer.valueOf(localqqz.b.length);
    jdr.a(str3, String.format("Sync notifications fetch has paging token, starting a initial fetch. AccountId [%d], fetchCategory [%s], trigger [%s].", arrayOfObject3));
    return a(localContext, paramInt, paramizx, paramjan);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbx
 * JD-Core Version:    0.7.0.1
 */