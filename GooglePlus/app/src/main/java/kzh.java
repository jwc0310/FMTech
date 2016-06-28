import android.content.Context;

public final class kzh
{
  static final int a = qyo.a.b >>> 3;
  static final int b = qyq.a.b >>> 3;
  static final int c = qym.a.b >>> 3;
  static final int d = qzh.a.b >>> 3;
  final kcx e;
  final boolean f;
  
  public kzh(Context paramContext, kcg paramkcg, boolean paramBoolean)
  {
    this.e = new kcx(paramContext, paramkcg);
    qyn localqyn = new qyn();
    qyp localqyp = new qyp();
    qyl localqyl = new qyl();
    qzh localqzh = new qzh();
    this.e.a(qyn.a, localqyn, a);
    this.e.a(qyp.a, localqyp, b);
    this.e.a(qzh.a, localqzh, d);
    this.f = paramBoolean;
    if (paramBoolean) {
      this.e.a(qyl.a, localqyl, c);
    }
  }
  
  static kyf[] a(qxw[] paramArrayOfqxw)
  {
    kyf[] arrayOfkyf = new kyf[paramArrayOfqxw.length];
    for (int i = 0; i < arrayOfkyf.length; i++) {
      arrayOfkyf[i] = new kyf(paramArrayOfqxw[i]);
    }
    return arrayOfkyf;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzh
 * JD-Core Version:    0.7.0.1
 */