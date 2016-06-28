import android.content.Context;
import android.os.ConditionVariable;

public class jib
{
  public jib(jix paramjix, ConditionVariable paramConditionVariable, long paramLong, Context paramContext, int paramInt) {}
  
  public void a(fzl paramfzl)
  {
    if (jid.a())
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.a;
      jid.a("EsPeopleData#loadCircles", String.format("Disconnecting client %s.", arrayOfObject3));
    }
    this.a.e();
    if (paramfzl == null)
    {
      this.b.open();
      return;
    }
    int i = paramfzl.b();
    int j = 0;
    long l1 = 17L;
    if (j < i)
    {
      fzk localfzk = (fzk)paramfzl.a(j);
      long l2 = 31L * (31L * (l1 * 31L + localfzk.b().hashCode()) + localfzk.c().hashCode());
      if (localfzk.h()) {}
      for (int k = 1;; k = 0)
      {
        l1 = 31L * (l2 + k) + localfzk.g();
        j++;
        break;
      }
    }
    if (l1 == this.c)
    {
      if (jid.a())
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(this.c);
        jid.a("EsPeopleData#loadCircles", String.format("Fingerprint unchanged %s.", arrayOfObject2));
      }
      paramfzl.a();
      this.b.open();
      return;
    }
    if (jid.a())
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Long.valueOf(this.c);
      arrayOfObject1[1] = Long.valueOf(l1);
      jid.a("EsPeopleData#loadCircles", String.format("currentFingerprint: %s. newFingerprint: %s", arrayOfObject1));
    }
    new brp(this, l1).execute(new fzl[] { paramfzl });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jib
 * JD-Core Version:    0.7.0.1
 */