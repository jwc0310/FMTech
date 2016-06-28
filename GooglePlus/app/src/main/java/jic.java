import android.content.Context;
import android.os.ConditionVariable;

public class jic
{
  public jic(jix paramjix, ConditionVariable paramConditionVariable, long paramLong, Context paramContext, int paramInt) {}
  
  public void a(fzl paramfzl)
  {
    if (jid.a())
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.a;
      jid.a("EsPeopleData#loadPeople", String.format("Disconnecting client %s.", arrayOfObject3));
    }
    this.a.e();
    if (paramfzl == null)
    {
      this.b.open();
      return;
    }
    long l = brn.a(paramfzl);
    if (l == this.c)
    {
      if (jid.a())
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(this.c);
        jid.a("EsPeopleData#loadPeople", String.format("Fingerprint unchanged: %s.", arrayOfObject2));
      }
      paramfzl.a();
      this.b.open();
      return;
    }
    if (jid.a())
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Long.valueOf(this.c);
      arrayOfObject1[1] = Long.valueOf(l);
      jid.a("EsPeopleData#loadPeople", String.format("currentFingerprint: %s. newFingerprint: %s", arrayOfObject1));
    }
    new brq(this, l).execute(new fzl[] { paramfzl });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jic
 * JD-Core Version:    0.7.0.1
 */