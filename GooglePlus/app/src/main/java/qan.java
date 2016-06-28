import java.util.List;

public abstract class qan<M extends qan<M>>
  extends qat
{
  public qap aj;
  
  public int a()
  {
    int i = 0;
    if (this.aj != null)
    {
      j = 0;
      for (;;)
      {
        qap localqap = this.aj;
        if (localqap.b) {
          localqap.a();
        }
        if (i >= localqap.d) {
          break;
        }
        j += this.aj.b(i).a();
        i++;
      }
    }
    int j = 0;
    return j;
  }
  
  public final <T> M a(qao<M, T> paramqao, T paramT)
  {
    boolean bool = true;
    int i = paramqao.b >>> 3;
    if (paramT == null)
    {
      if (this.aj != null)
      {
        qap localqap1 = this.aj;
        int j = localqap1.c(i);
        if ((j >= 0) && (localqap1.c[j] != qap.a))
        {
          localqap1.c[j] = qap.a;
          localqap1.b = bool;
        }
        qap localqap2 = this.aj;
        if (localqap2.b) {
          localqap2.a();
        }
        if (localqap2.d != 0) {
          break label110;
        }
      }
      for (;;)
      {
        if (bool) {
          this.aj = null;
        }
        return this;
        label110:
        bool = false;
      }
    }
    if (this.aj == null) {
      this.aj = new qap();
    }
    for (qaq localqaq = null; localqaq == null; localqaq = this.aj.a(i))
    {
      this.aj.a(i, new qaq(paramqao, paramT));
      return this;
    }
    localqaq.a = paramqao;
    localqaq.b = paramT;
    localqaq.c = null;
    return this;
  }
  
  public void a(qal paramqal)
  {
    if (this.aj == null) {
      return;
    }
    for (int i = 0;; i++)
    {
      qap localqap = this.aj;
      if (localqap.b) {
        localqap.a();
      }
      if (i >= localqap.d) {
        break;
      }
      this.aj.b(i).a(paramqal);
    }
  }
  
  public final boolean a(qak paramqak, int paramInt)
  {
    int i = paramqak.c - paramqak.b;
    if (!paramqak.b(paramInt)) {
      return false;
    }
    int j = paramInt >>> 3;
    int k = paramqak.c - paramqak.b - i;
    byte[] arrayOfByte;
    qaw localqaw;
    qaq localqaq;
    if (k == 0)
    {
      arrayOfByte = qay.h;
      localqaw = new qaw(paramInt, arrayOfByte);
      localqaq = null;
      if (this.aj != null) {
        break label152;
      }
      this.aj = new qap();
    }
    for (;;)
    {
      if (localqaq == null)
      {
        localqaq = new qaq();
        this.aj.a(j, localqaq);
      }
      localqaq.c.add(localqaw);
      return true;
      arrayOfByte = new byte[k];
      int m = i + paramqak.b;
      System.arraycopy(paramqak.a, m, arrayOfByte, 0, k);
      break;
      label152:
      localqaq = this.aj.a(j);
    }
  }
  
  public final boolean a(qao<M, ?> paramqao)
  {
    if (this.aj == null) {}
    while (this.aj.a(paramqao.b >>> 3) == null) {
      return false;
    }
    return true;
  }
  
  public final <T> T b(qao<M, T> paramqao)
  {
    if (this.aj == null) {}
    qaq localqaq;
    do
    {
      return null;
      localqaq = this.aj.a(paramqao.b >>> 3);
    } while (localqaq == null);
    List localList;
    Object localObject;
    if (localqaq.b != null)
    {
      if (localqaq.a != paramqao) {
        throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
      }
    }
    else
    {
      localqaq.a = paramqao;
      localList = localqaq.c;
      if (localList != null) {
        break label85;
      }
      localObject = null;
    }
    for (;;)
    {
      localqaq.b = localObject;
      localqaq.c = null;
      return localqaq.b;
      label85:
      if (paramqao.c)
      {
        localObject = paramqao.a(localList);
      }
      else if (localList.isEmpty())
      {
        localObject = null;
      }
      else
      {
        qaw localqaw = (qaw)localList.get(-1 + localList.size());
        localObject = paramqao.a.cast(paramqao.a(qak.a(localqaw.b)));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qan
 * JD-Core Version:    0.7.0.1
 */