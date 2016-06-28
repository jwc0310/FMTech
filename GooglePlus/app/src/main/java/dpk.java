import android.content.Context;

final class dpk
  implements Runnable
{
  dpk(dpj paramdpj, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void run()
  {
    boolean bool;
    String str3;
    String str2;
    String str1;
    if (this.a != -1)
    {
      doq localdoq = this.d.e;
      if (this.b != this.c)
      {
        bool = true;
        localdoq.ag = bool;
        if (!this.d.e.ag) {
          break label250;
        }
        str3 = this.d.d.getString(aau.ok);
        if ((this.a != 0) && (this.a != 1)) {
          break label205;
        }
        Context localContext = this.d.d;
        int i = aau.os;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(this.c);
        arrayOfObject[1] = Integer.valueOf(this.b);
        str2 = localContext.getString(i, arrayOfObject);
        str1 = str3;
        label134:
        if (!this.d.e.ag) {
          break label281;
        }
        this.d.e.v();
      }
    }
    for (;;)
    {
      if (this.d.e.af != null)
      {
        this.d.e.af.b(str1);
        this.d.e.af.a_(str2);
      }
      return;
      bool = false;
      break;
      label205:
      String str4 = doq.a(this.d.e, this.a);
      str2 = this.d.d.getString(aau.ot, new Object[] { str4 });
      str1 = str3;
      break label134;
      label250:
      str1 = this.d.d.getString(aau.on);
      str2 = this.d.d.getString(aau.om);
      break label134;
      label281:
      this.d.e.w();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dpk
 * JD-Core Version:    0.7.0.1
 */