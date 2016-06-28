import android.content.Context;
import java.util.ArrayList;

public final class bnz
  extends gzf
{
  private final kbu a;
  private final kcg b;
  private final int[] c;
  
  public bnz(Context paramContext, int paramInt, int... paramVarArgs)
  {
    super(paramContext, "ReadPhotosFeaturesTask");
    this.a = ((kbu)mbb.a(paramContext, kbu.class));
    this.b = new kcg(paramContext, paramInt);
    this.c = paramVarArgs;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    ble localble = new ble(this.e, this.b, this.c);
    this.a.a(localble);
    hae localhae = new hae(localble.o, localble.q, null);
    boolean bool1 = localble.n();
    Object localObject = null;
    int[] arrayOfInt;
    int i;
    if (!bool1)
    {
      arrayOfInt = this.c;
      i = arrayOfInt.length;
    }
    for (int j = 0;; j++)
    {
      localObject = null;
      mzm localmzm;
      ArrayList localArrayList;
      if (j < i)
      {
        if (arrayOfInt[j] != 2) {
          continue;
        }
        boolean bool2 = localble.x;
        qat localqat = null;
        if (bool2) {
          localqat = localble.w;
        }
        localmzm = (mzm)localqat;
        localArrayList = new ArrayList();
        if ((localmzm != null) && (localmzm.a != null) && (localmzm.a.b != null) && (localmzm.a.b.a != null)) {
          break label203;
        }
      }
      for (localObject = localArrayList;; localObject = localArrayList)
      {
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        bsz.a(localObject, this.e);
        return localhae;
        label203:
        for (pse localpse : localmzm.a.b.a) {
          if (localpse.a != null) {
            localArrayList.add(new bta(localpse.c, localpse.d, localpse.b, localpse.a.intValue(), localpse.e.a.intValue(), localpse.e.b.intValue(), localpse.e.c.booleanValue()));
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnz
 * JD-Core Version:    0.7.0.1
 */